package com.mbridge.msdk.foundation.tools;

import com.google.common.primitives.SignedBytes;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.UShort;

/* JADX INFO: loaded from: classes6.dex */
public class FastKV {
    static final int ASYNC_BLOCKING = 1;
    private static final String A_SUFFIX = ".kva";
    private static final int BASE_GC_BYTES_THRESHOLD = 4096;
    private static final int BASE_GC_KEYS_THRESHOLD = 80;
    private static final String BOTH_FILES_ERROR = "both files error";
    private static final String B_SUFFIX = ".kvb";
    private static final String C_SUFFIX = ".kvc";
    private static final int DATA_SIZE_LIMIT = 536870912;
    private static final int DATA_START = 12;
    private static final int DOUBLE_LIMIT;
    private static final byte[] EMPTY_ARRAY = new byte[0];
    static final String GC_FINISH = "gc finish";
    private static final int INTERNAL_LIMIT = 2048;
    private static final String MAP_FAILED = "map failed";
    static final int NON_BLOCKING = 0;
    private static final String OPEN_FILE_FAILED = "open file failed";
    private static final int PAGE_SIZE;
    private static final String PARSE_DATA_FAILED = "parse dara failed";
    static final int SYNC_BLOCKING = 2;
    private static final String TEMP_SUFFIX = ".tmp";
    static final String TRUNCATE_FINISH = "truncate finish";
    private static final int TRUNCATE_THRESHOLD;
    private static final int[] TYPE_SIZE;
    private MappedByteBuffer aBuffer;
    private FileChannel aChannel;
    private MappedByteBuffer bBuffer;
    private FileChannel bChannel;
    private long checksum;
    private int dataEnd;
    private final Map<String, InterfaceC13170b> encoderMap;
    private C13184b0 fastBuffer;
    private int invalidBytes;
    private final String name;
    private final String path;
    private int removeStart;
    private boolean sizeChanged;
    private String tempExternalName;
    private int updateSize;
    private int updateStart;
    private int writingMode;
    private final Map<String, AbstractC13204j> data = new HashMap();
    private final Executor executor = new ExecutorC13193e0();
    private final ArrayList<C13172d> invalids = new ArrayList<>();
    private final InterfaceC13171c logger = C13187c0.f36259b;
    private boolean autoCommit = true;

    public static class Builder {
        private static final Map<String, FastKV> INSTANCE_MAP = new ConcurrentHashMap();
        private InterfaceC13170b[] encoders;
        private final String name;
        private final String path;
        private int writingMode = 0;

        public Builder(String str, String str2) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("path is empty");
            }
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str + '/';
            }
            this.path = str;
            this.name = str2;
        }

        public Builder asyncBlocking() {
            this.writingMode = 1;
            return this;
        }

        public Builder blocking() {
            this.writingMode = 2;
            return this;
        }

        public FastKV build() {
            FastKV fastKV;
            String str = this.path + this.name;
            Map<String, FastKV> map = INSTANCE_MAP;
            FastKV fastKV2 = map.get(str);
            if (fastKV2 != null) {
                return fastKV2;
            }
            synchronized (Builder.class) {
                fastKV = map.get(str);
                if (fastKV == null) {
                    fastKV = new FastKV(this.path, this.name, this.encoders, this.writingMode);
                    map.put(str, fastKV);
                }
            }
            return fastKV;
        }

        public Builder encoder(InterfaceC13170b[] interfaceC13170bArr) {
            this.encoders = interfaceC13170bArr;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.FastKV$a */
    class RunnableC13169a implements Runnable {
        RunnableC13169a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FastKV.this.writeToCFile();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.FastKV$b */
    public interface InterfaceC13170b<T> {
        /* JADX INFO: renamed from: a */
        T mo37550a(byte[] bArr, int i, int i2);

        /* JADX INFO: renamed from: a */
        String mo37551a();

        /* JADX INFO: renamed from: a */
        byte[] mo37552a(T t);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.FastKV$c */
    public interface InterfaceC13171c {
        /* JADX INFO: renamed from: a */
        void mo37553a(String str, Exception exc);

        /* JADX INFO: renamed from: a */
        void mo37554a(String str, String str2);

        /* JADX INFO: renamed from: b */
        void mo37555b(String str, Exception exc);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.FastKV$d */
    private static class C13172d implements Comparable<C13172d> {

        /* JADX INFO: renamed from: a */
        int f36212a;

        /* JADX INFO: renamed from: b */
        int f36213b;

        C13172d(int i, int i2) {
            this.f36213b = i;
            this.f36212a = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C13172d c13172d) {
            return this.f36213b - c13172d.f36213b;
        }
    }

    static {
        int iM37654a = C13191d1.m37654a();
        PAGE_SIZE = iM37654a;
        int iMax = Math.max(iM37654a << 1, 16384);
        DOUBLE_LIMIT = iMax;
        TRUNCATE_THRESHOLD = iMax << 1;
        TYPE_SIZE = new int[]{0, 1, 4, 4, 8, 8};
    }

    FastKV(String str, String str2, InterfaceC13170b[] interfaceC13170bArr, int i) {
        this.path = str;
        this.name = str2;
        this.writingMode = i;
        HashMap map = new HashMap();
        C13237z0 c13237z0 = C13237z0.f36412a;
        map.put(c13237z0.mo37551a(), c13237z0);
        if (interfaceC13170bArr != null && interfaceC13170bArr.length > 0) {
            for (InterfaceC13170b interfaceC13170b : interfaceC13170bArr) {
                String strMo37551a = interfaceC13170b.mo37551a();
                if (map.containsKey(strMo37551a)) {
                    error("duplicate encoder tag:" + strMo37551a);
                } else {
                    map.put(strMo37551a, interfaceC13170b);
                }
            }
        }
        this.encoderMap = map;
        loadData();
    }

    private void addObject(String str, Object obj, byte[] bArr, byte b) {
        Object obj2;
        int length;
        AbstractC13204j c13202i;
        int iSaveArray = saveArray(str, bArr, b);
        if (iSaveArray != 0) {
            String str2 = this.tempExternalName;
            boolean z = str2 != null;
            if (z) {
                this.tempExternalName = null;
                length = 32;
                obj2 = str2;
            } else {
                obj2 = obj;
                length = bArr.length;
            }
            if (b == 6) {
                c13202i = new C13218q(this.updateStart, iSaveArray, (String) obj2, length, z);
            } else {
                c13202i = b == 7 ? new C13202i(this.updateStart, iSaveArray, obj2, length, z) : new C13216p(this.updateStart, iSaveArray, obj2, length, z);
            }
            this.data.put(str, c13202i);
            updateChange();
        }
    }

    private void addOrUpdate(String str, Object obj, byte[] bArr, AbstractC13220r abstractC13220r, byte b) {
        if (abstractC13220r == null) {
            addObject(str, obj, bArr, b);
        } else if (abstractC13220r.f36363b || abstractC13220r.f36366e != bArr.length) {
            updateObject(str, obj, bArr, abstractC13220r);
        } else {
            updateBytes(abstractC13220r.f36310a, bArr);
            abstractC13220r.f36365d = obj;
        }
        checkIfCommit();
    }

    private int bytesThreshold() {
        int i = this.dataEnd;
        if (i <= 16384) {
            return 4096;
        }
        return i <= 65536 ? 8192 : 16384;
    }

    private void checkGC() {
        if (this.invalidBytes < (bytesThreshold() << 1)) {
            if (this.invalids.size() < (this.dataEnd < 16384 ? 80 : 160)) {
                return;
            }
        }
        m37549gc(0);
    }

    private void checkIfCommit() {
        if (this.writingMode == 0 || !this.autoCommit) {
            return;
        }
        commitToCFile();
    }

    private void checkKey(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private void checkKeySize(int i) {
        if (i > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private void checkValueSize(int i, boolean z) {
        if (z) {
            if (i != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i < 0 || i >= 2048) {
            throw new IllegalStateException("value size out of bound");
        }
    }

    private void clearData() {
        this.dataEnd = 12;
        this.checksum = 0L;
        clearInvalid();
        this.data.clear();
        C13184b0 c13184b0 = this.fastBuffer;
        if (c13184b0 == null || c13184b0.f36243a.length != PAGE_SIZE) {
            this.fastBuffer = new C13184b0(PAGE_SIZE);
        } else {
            c13184b0.m37614b(0, 0);
            this.fastBuffer.m37609a(4, 0L);
        }
    }

    private void clearInvalid() {
        this.invalidBytes = 0;
        this.invalids.clear();
    }

    private boolean commitToCFile() {
        int i = this.writingMode;
        if (i == 1) {
            this.executor.execute(new RunnableC13169a());
        } else if (i == 2) {
            return writeToCFile();
        }
        return true;
    }

    private void copyBuffer(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.bBuffer ? this.bChannel : this.aChannel).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.bBuffer) {
                    this.bBuffer = map;
                } else {
                    this.aBuffer = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e) {
                error(e);
                toBlockingMode();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void countInvalid(int i, int i2) {
        this.invalidBytes += i2 - i;
        this.invalids.add(new C13172d(i, i2));
    }

    private void deleteCFiles() {
        try {
            C13191d1.m37657a(new File(this.path, this.name + C_SUFFIX));
            C13191d1.m37657a(new File(this.path, this.name + TEMP_SUFFIX));
        } catch (Exception e) {
            error(e);
        }
    }

    private void ensureSize(int i) {
        int length = this.fastBuffer.f36243a.length;
        int i2 = this.dataEnd + i;
        if (i2 >= length) {
            int i3 = this.invalidBytes;
            if (i3 > i && i3 > bytesThreshold()) {
                m37549gc(i);
                return;
            }
            int newCapacity = getNewCapacity(length, i2);
            byte[] bArr = new byte[newCapacity];
            System.arraycopy(this.fastBuffer.f36243a, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.f36243a = bArr;
            if (this.writingMode == 0) {
                try {
                    long j = newCapacity;
                    MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                } catch (IOException e) {
                    error(new Exception(MAP_FAILED, e));
                    this.fastBuffer.m37614b(0, this.dataEnd - 12);
                    this.fastBuffer.m37609a(4, this.checksum);
                    toBlockingMode();
                }
            }
        }
    }

    private void error(Exception exc) {
        InterfaceC13171c interfaceC13171c = this.logger;
        if (interfaceC13171c != null) {
            interfaceC13171c.mo37555b(this.name, exc);
        }
    }

    private void fastPutString(String str, String str2, C13218q c13218q) {
        int iM37603b = C13184b0.m37603b(str2);
        if (c13218q == null) {
            int iM37603b2 = C13184b0.m37603b(str);
            checkKeySize(iM37603b2);
            int i = iM37603b2 + 4;
            this.updateSize = i + iM37603b;
            preparePutBytes();
            this.fastBuffer.m37608a((byte) 6);
            putKey(str, iM37603b2);
            putStringValue(str2, iM37603b);
            Map<String, AbstractC13204j> map = this.data;
            int i2 = this.updateStart;
            map.put(str, new C13218q(i2, i + i2, str2, iM37603b, false));
            updateChange();
        } else {
            int i3 = c13218q.f36310a;
            int i4 = i3 - c13218q.f36364c;
            int i5 = c13218q.f36366e;
            boolean z = false;
            String str3 = null;
            if (i5 == iM37603b) {
                this.checksum = this.fastBuffer.m37607a(i3, i5) ^ this.checksum;
                if (iM37603b == str2.length()) {
                    str2.getBytes(0, iM37603b, this.fastBuffer.f36243a, c13218q.f36310a);
                } else {
                    C13184b0 c13184b0 = this.fastBuffer;
                    c13184b0.f36244b = c13218q.f36310a;
                    c13184b0.m37618c(str2);
                }
                this.updateStart = c13218q.f36310a;
                this.updateSize = iM37603b;
            } else {
                this.updateSize = i4 + iM37603b;
                preparePutBytes();
                this.fastBuffer.m37608a((byte) 6);
                int i6 = i4 - 3;
                C13184b0 c13184b1 = this.fastBuffer;
                byte[] bArr = c13184b1.f36243a;
                System.arraycopy(bArr, c13218q.f36364c + 1, bArr, c13184b1.f36244b, i6);
                this.fastBuffer.f36244b += i6;
                putStringValue(str2, iM37603b);
                remove((byte) 6, c13218q.f36364c, c13218q.f36310a + c13218q.f36366e);
                str3 = c13218q.f36363b ? (String) c13218q.f36365d : null;
                c13218q.f36363b = false;
                int i7 = this.updateStart;
                c13218q.f36364c = i7;
                c13218q.f36310a = i7 + i4;
                c13218q.f36366e = iM37603b;
                z = true;
            }
            c13218q.f36365d = str2;
            updateChange();
            if (z) {
                checkGC();
            }
            if (str3 != null) {
                C13191d1.m37657a(new File(this.path + this.name, str3));
            }
        }
        checkIfCommit();
    }

    private byte[] getArrayFromFile(C13202i c13202i) {
        try {
            byte[] bArrM37662c = C13191d1.m37662c(new File(this.path + this.name, (String) c13202i.f36365d));
            return bArrM37662c != null ? bArrM37662c : EMPTY_ARRAY;
        } catch (Exception e) {
            error(e);
            return EMPTY_ARRAY;
        }
    }

    private int getNewCapacity(int i, int i2) {
        if (i2 > 536870912) {
            throw new IllegalStateException("data size out of limit");
        }
        int i3 = PAGE_SIZE;
        if (i2 <= i3) {
            return i3;
        }
        while (i < i2) {
            int i4 = DOUBLE_LIMIT;
            i = i <= i4 ? i << 1 : i + i4;
        }
        return i;
    }

    private Object getObjectFromFile(C13216p c13216p) {
        try {
            byte[] bArrM37662c = C13191d1.m37662c(new File(this.path + this.name, (String) c13216p.f36365d));
            if (bArrM37662c == null) {
                warning(new Exception("Read object data failed"));
                return null;
            }
            int i = bArrM37662c[0] & 255;
            String str = new String(bArrM37662c, 1, i, StandardCharsets.UTF_8);
            InterfaceC13170b interfaceC13170b = this.encoderMap.get(str);
            if (interfaceC13170b != null) {
                int i2 = i + 1;
                return interfaceC13170b.mo37550a(bArrM37662c, i2, bArrM37662c.length - i2);
            }
            warning(new Exception("No encoder for tag:".concat(str)));
            return null;
        } catch (Exception e) {
            error(e);
            return null;
        }
    }

    private String getStringFromFile(C13218q c13218q) {
        try {
            byte[] bArrM37662c = C13191d1.m37662c(new File(this.path + this.name, (String) c13218q.f36365d));
            return (bArrM37662c == null || bArrM37662c.length == 0) ? "" : new String(bArrM37662c, StandardCharsets.UTF_8);
        } catch (Exception e) {
            error(e);
        }
        return "";
    }

    private void info(String str) {
        InterfaceC13171c interfaceC13171c = this.logger;
        if (interfaceC13171c != null) {
            interfaceC13171c.mo37554a(this.name, str);
        }
    }

    private boolean isABFileEqual() {
        C13184b0 c13184b0 = new C13184b0(this.dataEnd);
        this.bBuffer.rewind();
        this.bBuffer.get(c13184b0.f36243a, 0, this.dataEnd);
        byte[] bArr = this.fastBuffer.f36243a;
        byte[] bArr2 = c13184b0.f36243a;
        for (int i = 0; i < this.dataEnd; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private synchronized void loadData() {
        long jNanoTime = System.nanoTime();
        if (!loadFromCFile() && this.writingMode == 0) {
            loadFromABFile();
        }
        if (this.fastBuffer == null) {
            this.fastBuffer = new C13184b0(PAGE_SIZE);
        }
        if (this.logger != null) {
            info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - jNanoTime) / 1000000) + " ms");
        }
    }

    private void loadFromABFile() {
        long j;
        File file = new File(this.path, this.name + A_SUFFIX);
        File file2 = new File(this.path, this.name + B_SUFFIX);
        try {
            if (C13191d1.m37663d(file) && C13191d1.m37663d(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                this.aChannel = randomAccessFile.getChannel();
                this.bChannel = randomAccessFile2.getChannel();
                try {
                    MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, length > 0 ? length : PAGE_SIZE);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, length2 > 0 ? length2 : PAGE_SIZE);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                    this.fastBuffer = new C13184b0(this.aBuffer.capacity());
                    if (length == 0 && length2 == 0) {
                        this.dataEnd = 12;
                        return;
                    }
                    int i = this.aBuffer.getInt();
                    long j2 = this.aBuffer.getLong();
                    int i2 = this.bBuffer.getInt();
                    long j3 = this.bBuffer.getLong();
                    if (i < 0) {
                        j = 12;
                    } else if (i <= length - 12) {
                        this.dataEnd = i + 12;
                        this.aBuffer.rewind();
                        j = 12;
                        this.aBuffer.get(this.fastBuffer.f36243a, 0, this.dataEnd);
                        if (j2 == this.fastBuffer.m37607a(12, i) && parseData() == 0) {
                            this.checksum = j2;
                            if (length == length2 && isABFileEqual()) {
                                return;
                            }
                            warning(new Exception("B file error"));
                            copyBuffer(this.aBuffer, this.bBuffer, this.dataEnd);
                            return;
                        }
                    } else {
                        j = 12;
                    }
                    if (i2 >= 0 && i2 <= length2 - j) {
                        this.data.clear();
                        clearInvalid();
                        this.dataEnd = i2 + 12;
                        if (this.fastBuffer.f36243a.length != this.bBuffer.capacity()) {
                            this.fastBuffer = new C13184b0(this.bBuffer.capacity());
                        }
                        this.bBuffer.rewind();
                        this.bBuffer.get(this.fastBuffer.f36243a, 0, this.dataEnd);
                        if (j3 == this.fastBuffer.m37607a(12, i2) && parseData() == 0) {
                            warning(new Exception("A file error"));
                            copyBuffer(this.bBuffer, this.aBuffer, this.dataEnd);
                            this.checksum = j3;
                            return;
                        }
                    }
                    error(BOTH_FILES_ERROR);
                    resetData();
                    return;
                } catch (IOException e) {
                    error(e);
                    toBlockingMode();
                    tryBlockingIO(file, file2);
                    return;
                }
            }
            error(new Exception(OPEN_FILE_FAILED));
            toBlockingMode();
        } catch (Exception e2) {
            error(e2);
            clearData();
            toBlockingMode();
        }
    }

    private boolean loadFromCFile() {
        File file = new File(this.path, this.name + C_SUFFIX);
        File file2 = new File(this.path, this.name + TEMP_SUFFIX);
        boolean z = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!loadWithBlockingIO(file)) {
                    clearData();
                    deleteCFiles();
                    return false;
                }
                if (this.writingMode == 0) {
                    if (!writeToABFile(this.fastBuffer)) {
                        this.writingMode = 1;
                        return false;
                    }
                    info("recover from c file");
                    try {
                        deleteCFiles();
                        return true;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        error(e);
                        return z;
                    }
                }
            } else if (this.writingMode != 0) {
                File file3 = new File(this.path, this.name + A_SUFFIX);
                File file4 = new File(this.path, this.name + B_SUFFIX);
                if (file3.exists() && file4.exists()) {
                    tryBlockingIO(file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private boolean loadWithBlockingIO(File file) throws IOException {
        long length = file.length();
        if (length != 0 && length <= 536870912) {
            int i = (int) length;
            int newCapacity = getNewCapacity(PAGE_SIZE, i);
            C13184b0 c13184b0 = this.fastBuffer;
            if (c13184b0 == null || c13184b0.f36243a.length != newCapacity) {
                c13184b0 = new C13184b0(new byte[newCapacity]);
                this.fastBuffer = c13184b0;
            } else {
                c13184b0.f36244b = 0;
            }
            C13191d1.m37658a(file, c13184b0.f36243a, i);
            int iM37619d = c13184b0.m37619d();
            long jM37621e = c13184b0.m37621e();
            this.dataEnd = iM37619d + 12;
            if (iM37619d >= 0 && iM37619d <= i - 12 && jM37621e == c13184b0.m37607a(12, iM37619d) && parseData() == 0) {
                this.checksum = jM37621e;
                return true;
            }
        }
        return false;
    }

    private void mergeInvalids() {
        int size = this.invalids.size() - 1;
        C13172d c13172d = this.invalids.get(size);
        while (size > 0) {
            int i = size - 1;
            C13172d c13172d2 = this.invalids.get(i);
            if (c13172d.f36213b == c13172d2.f36212a) {
                c13172d2.f36212a = c13172d.f36212a;
                this.invalids.remove(size);
            }
            c13172d = c13172d2;
            size = i;
        }
    }

    private int parseData() {
        C13184b0 c13184b0 = this.fastBuffer;
        c13184b0.f36244b = 12;
        while (true) {
            try {
                int i = c13184b0.f36244b;
                int i2 = this.dataEnd;
                if (i >= i2) {
                    if (i == i2) {
                        return 0;
                    }
                    warning(new Exception(PARSE_DATA_FAILED));
                    return -1;
                }
                byte bM37606a = c13184b0.m37606a();
                byte b = (byte) (bM37606a & 63);
                if (b < 1 || b > 8) {
                    throw new Exception(PARSE_DATA_FAILED);
                }
                int iM37606a = c13184b0.m37606a() & 255;
                if (bM37606a < 0) {
                    c13184b0.f36244b += iM37606a;
                    int iM37623f = b <= 5 ? TYPE_SIZE[b] : c13184b0.m37623f() & UShort.MAX_VALUE;
                    C13184b0 c13184b1 = this.fastBuffer;
                    int i3 = c13184b1.f36244b + iM37623f;
                    c13184b1.f36244b = i3;
                    countInvalid(i, i3);
                } else {
                    String strM37622e = c13184b0.m37622e(iM37606a);
                    int i4 = c13184b0.f36244b;
                    if (b > 5) {
                        int iM37623f2 = 65535 & c13184b0.m37623f();
                        boolean z = (bM37606a & SignedBytes.MAX_POWER_OF_TWO) != 0;
                        checkValueSize(iM37623f2, z);
                        if (b == 6) {
                            this.data.put(strM37622e, new C13218q(i, i4 + 2, c13184b0.m37622e(iM37623f2), iM37623f2, z));
                        } else if (b == 7) {
                            this.data.put(strM37622e, new C13202i(i, i4 + 2, z ? c13184b0.m37622e(iM37623f2) : c13184b0.m37615b(iM37623f2), iM37623f2, z));
                        } else if (z) {
                            this.data.put(strM37622e, new C13216p(i, i4 + 2, c13184b0.m37622e(iM37623f2), iM37623f2, true));
                        } else {
                            int iM37606a2 = c13184b0.m37606a() & 255;
                            String strM37622e2 = c13184b0.m37622e(iM37606a2);
                            InterfaceC13170b interfaceC13170b = this.encoderMap.get(strM37622e2);
                            int i5 = iM37623f2 - (iM37606a2 + 1);
                            if (i5 < 0) {
                                throw new Exception(PARSE_DATA_FAILED);
                            }
                            if (interfaceC13170b != null) {
                                try {
                                    Object objMo37550a = interfaceC13170b.mo37550a(c13184b0.f36243a, c13184b0.f36244b, i5);
                                    if (objMo37550a != null) {
                                        this.data.put(strM37622e, new C13216p(i, i4 + 2, objMo37550a, iM37623f2, false));
                                    }
                                } catch (Exception e) {
                                    error(e);
                                }
                            } else {
                                error("object with tag: " + strM37622e2 + " without encoder");
                            }
                            c13184b0.f36244b += i5;
                        }
                    } else if (b == 1) {
                        this.data.put(strM37622e, new C13206k(i4, c13184b0.m37606a() == 1));
                    } else if (b == 2) {
                        this.data.put(strM37622e, new C13212n(i4, c13184b0.m37619d()));
                    } else if (b == 3) {
                        this.data.put(strM37622e, new C13210m(i4, c13184b0.m37616c()));
                    } else if (b != 4) {
                        this.data.put(strM37622e, new C13208l(i4, c13184b0.m37613b()));
                    } else {
                        this.data.put(strM37622e, new C13214o(i4, c13184b0.m37621e()));
                    }
                }
            } catch (Exception e2) {
                warning(e2);
                return -1;
            }
        }
    }

    private void preparePutBytes() {
        ensureSize(this.updateSize);
        int i = this.dataEnd;
        this.updateStart = i;
        this.dataEnd = this.updateSize + i;
        this.fastBuffer.f36244b = i;
        this.sizeChanged = true;
    }

    private void putKey(String str, int i) {
        this.fastBuffer.m37608a((byte) i);
        if (i != str.length()) {
            this.fastBuffer.m37618c(str);
            return;
        }
        C13184b0 c13184b0 = this.fastBuffer;
        str.getBytes(0, i, c13184b0.f36243a, c13184b0.f36244b);
        this.fastBuffer.f36244b += i;
    }

    private void putStringValue(String str, int i) {
        this.fastBuffer.m37611a((short) i);
        if (i != str.length()) {
            this.fastBuffer.m37618c(str);
        } else {
            C13184b0 c13184b0 = this.fastBuffer;
            str.getBytes(0, i, c13184b0.f36243a, c13184b0.f36244b);
        }
    }

    private void resetBuffer(MappedByteBuffer mappedByteBuffer) throws IOException {
        int iCapacity = mappedByteBuffer.capacity();
        int i = PAGE_SIZE;
        if (iCapacity != i) {
            FileChannel fileChannel = mappedByteBuffer == this.aBuffer ? this.aChannel : this.bChannel;
            long j = i;
            fileChannel.truncate(j);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aBuffer) {
                this.aBuffer = map;
            } else {
                this.bBuffer = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    private void resetData() {
        if (this.writingMode == 0) {
            try {
                resetBuffer(this.aBuffer);
                resetBuffer(this.bBuffer);
            } catch (IOException unused) {
                toBlockingMode();
            }
        }
        clearData();
        C13191d1.m37657a(new File(this.path + this.name));
    }

    private int saveArray(String str, byte[] bArr, byte b) {
        this.tempExternalName = null;
        if (bArr.length < 2048) {
            return wrapArray(str, bArr, b);
        }
        info("large value, key: " + str + ", size: " + bArr.length);
        String strM37660b = C13191d1.m37660b();
        if (!C13191d1.m37659a(new File(this.path + this.name, strM37660b), bArr)) {
            error("save large value failed");
            return 0;
        }
        this.tempExternalName = strM37660b;
        byte[] bArr2 = new byte[32];
        strM37660b.getBytes(0, 32, bArr2, 0);
        return wrapArray(str, bArr2, (byte) (b | SignedBytes.MAX_POWER_OF_TWO));
    }

    private long shiftCheckSum(long j, int i) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    private void syncABBuffer(MappedByteBuffer mappedByteBuffer) {
        if (this.sizeChanged && mappedByteBuffer != this.aBuffer) {
            mappedByteBuffer.putInt(0, this.dataEnd - 12);
        }
        mappedByteBuffer.putLong(4, this.checksum);
        int i = this.removeStart;
        if (i != 0) {
            mappedByteBuffer.put(i, this.fastBuffer.f36243a[i]);
        }
        if (this.updateSize != 0) {
            mappedByteBuffer.position(this.updateStart);
            mappedByteBuffer.put(this.fastBuffer.f36243a, this.updateStart, this.updateSize);
        }
    }

    private void toBlockingMode() {
        this.writingMode = 1;
        C13191d1.m37656a(this.aChannel);
        C13191d1.m37656a(this.bChannel);
        this.aChannel = null;
        this.bChannel = null;
        this.aBuffer = null;
        this.bBuffer = null;
    }

    private void truncate(int i) {
        int i2 = PAGE_SIZE;
        int newCapacity = getNewCapacity(i2, i + i2);
        byte[] bArr = this.fastBuffer.f36243a;
        if (newCapacity >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[newCapacity];
        System.arraycopy(bArr, 0, bArr2, 0, this.dataEnd);
        this.fastBuffer.f36243a = bArr2;
        if (this.writingMode == 0) {
            try {
                long j = newCapacity;
                this.aChannel.truncate(j);
                MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.bChannel.truncate(j);
                MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.bBuffer = map2;
                map2.order(byteOrder);
            } catch (IOException e) {
                error(new Exception(MAP_FAILED, e));
                toBlockingMode();
            }
        }
        info(TRUNCATE_FINISH);
    }

    private void tryBlockingIO(File file, File file2) {
        try {
            if (loadWithBlockingIO(file)) {
                return;
            }
        } catch (IOException e) {
            warning(e);
        }
        clearData();
        try {
            if (loadWithBlockingIO(file2)) {
                return;
            }
        } catch (IOException e2) {
            warning(e2);
        }
        clearData();
    }

    private void updateBoolean(byte b, int i) {
        long jShiftCheckSum = this.checksum ^ shiftCheckSum(1L, i);
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.put(i, b);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.put(i, b);
        } else {
            this.fastBuffer.m37609a(4, jShiftCheckSum);
        }
        this.fastBuffer.f36243a[i] = b;
    }

    private void updateBytes(int i, byte[] bArr) {
        int length = bArr.length;
        this.checksum ^= this.fastBuffer.m37607a(i, length);
        C13184b0 c13184b0 = this.fastBuffer;
        c13184b0.f36244b = i;
        c13184b0.m37612a(bArr);
        long jM37607a = this.checksum ^ this.fastBuffer.m37607a(i, length);
        this.checksum = jM37607a;
        if (this.writingMode != 0) {
            this.fastBuffer.m37609a(4, jM37607a);
            return;
        }
        this.aBuffer.putInt(0, -1);
        this.aBuffer.putLong(4, this.checksum);
        this.aBuffer.position(i);
        this.aBuffer.put(bArr);
        this.aBuffer.putInt(0, this.dataEnd - 12);
        this.bBuffer.putLong(4, this.checksum);
        this.bBuffer.position(i);
        this.bBuffer.put(bArr);
    }

    private void updateChange() {
        this.checksum ^= this.fastBuffer.m37607a(this.updateStart, this.updateSize);
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            syncABBuffer(this.aBuffer);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            syncABBuffer(this.bBuffer);
        } else {
            if (this.sizeChanged) {
                this.fastBuffer.m37614b(0, this.dataEnd - 12);
            }
            this.fastBuffer.m37609a(4, this.checksum);
        }
        this.sizeChanged = false;
        this.removeStart = 0;
        this.updateSize = 0;
    }

    private void updateInt32(int i, long j, int i2) {
        long jShiftCheckSum = shiftCheckSum(j, i2) ^ this.checksum;
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.putInt(i2, i);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putInt(i2, i);
        } else {
            this.fastBuffer.m37609a(4, jShiftCheckSum);
        }
        this.fastBuffer.m37614b(i2, i);
    }

    private void updateInt64(long j, long j2, int i) {
        long jShiftCheckSum = shiftCheckSum(j2, i) ^ this.checksum;
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.putLong(i, j);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putLong(i, j);
        } else {
            this.fastBuffer.m37609a(4, jShiftCheckSum);
        }
        this.fastBuffer.m37609a(i, j);
    }

    private void updateObject(String str, Object obj, byte[] bArr, AbstractC13220r abstractC13220r) {
        int iSaveArray = saveArray(str, bArr, abstractC13220r.mo37706a());
        if (iSaveArray != 0) {
            String str2 = abstractC13220r.f36363b ? (String) abstractC13220r.f36365d : null;
            remove(abstractC13220r.mo37706a(), abstractC13220r.f36364c, abstractC13220r.f36310a + abstractC13220r.f36366e);
            String str3 = this.tempExternalName;
            boolean z = str3 != null;
            abstractC13220r.f36364c = this.updateStart;
            abstractC13220r.f36310a = iSaveArray;
            abstractC13220r.f36363b = z;
            if (z) {
                abstractC13220r.f36365d = str3;
                abstractC13220r.f36366e = 32;
                this.tempExternalName = null;
            } else {
                abstractC13220r.f36365d = obj;
                abstractC13220r.f36366e = bArr.length;
            }
            updateChange();
            checkGC();
            if (str2 != null) {
                C13191d1.m37657a(new File(this.path + this.name, str2));
            }
        }
    }

    private void updateOffset(int i, int[] iArr) {
        for (AbstractC13204j abstractC13204j : this.data.values()) {
            int i2 = abstractC13204j.f36310a;
            if (i2 > i) {
                int i3 = iArr[(C13191d1.m37655a(iArr, i2) << 1) + 1];
                abstractC13204j.f36310a -= i3;
                if (abstractC13204j.mo37706a() >= 6) {
                    ((AbstractC13220r) abstractC13204j).f36364c -= i3;
                }
            }
        }
    }

    private void warning(Exception exc) {
        InterfaceC13171c interfaceC13171c = this.logger;
        if (interfaceC13171c != null) {
            interfaceC13171c.mo37553a(this.name, exc);
        }
    }

    private int wrapArray(String str, byte[] bArr, byte b) {
        wrapHeader(str, b, bArr.length + 2);
        this.fastBuffer.m37611a((short) bArr.length);
        C13184b0 c13184b0 = this.fastBuffer;
        int i = c13184b0.f36244b;
        c13184b0.m37612a(bArr);
        return i;
    }

    private void wrapHeader(String str, byte b) {
        wrapHeader(str, b, TYPE_SIZE[b]);
    }

    private boolean writeToABFile(C13184b0 c13184b0) {
        int length = c13184b0.f36243a.length;
        File file = new File(this.path, this.name + A_SUFFIX);
        File file2 = new File(this.path, this.name + B_SUFFIX);
        try {
            if (!C13191d1.m37663d(file) || !C13191d1.m37663d(file2)) {
                throw new Exception(OPEN_FILE_FAILED);
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
            long j = length;
            randomAccessFile.setLength(j);
            randomAccessFile2.setLength(j);
            this.aChannel = randomAccessFile.getChannel();
            this.bChannel = randomAccessFile2.getChannel();
            MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.aBuffer = map;
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            map.order(byteOrder);
            MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.bBuffer = map2;
            map2.order(byteOrder);
            this.aBuffer.put(c13184b0.f36243a, 0, this.dataEnd);
            this.bBuffer.put(c13184b0.f36243a, 0, this.dataEnd);
            return true;
        } catch (Exception e) {
            error(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean writeToCFile() {
        try {
            File file = new File(this.path, this.name + TEMP_SUFFIX);
            if (C13191d1.m37663d(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(this.dataEnd);
                randomAccessFile.write(this.fastBuffer.f36243a, 0, this.dataEnd);
                randomAccessFile.close();
                File file2 = new File(this.path, this.name + C_SUFFIX);
                if (!file2.exists() || file2.delete()) {
                    if (file.renameTo(file2)) {
                        return true;
                    }
                    warning(new Exception("rename failed"));
                }
            }
        } catch (Exception e) {
            error(e);
        }
        return false;
    }

    public synchronized void clear() {
        resetData();
        if (this.writingMode != 0) {
            deleteCFiles();
        }
    }

    public synchronized boolean commit() {
        this.autoCommit = true;
        return commitToCFile();
    }

    public synchronized boolean contains(String str) {
        return this.data.containsKey(str);
    }

    public synchronized void disableAutoCommit() {
        this.autoCommit = false;
    }

    public synchronized void force() {
        if (this.writingMode == 0) {
            this.aBuffer.force();
            this.bBuffer.force();
        }
    }

    /* JADX INFO: renamed from: gc */
    void m37549gc(int i) {
        Collections.sort(this.invalids);
        mergeInvalids();
        C13172d c13172d = this.invalids.get(0);
        int i2 = c13172d.f36213b;
        int i3 = this.dataEnd;
        int i4 = i3 - this.invalidBytes;
        int i5 = i4 - 12;
        int i6 = i4 - i2;
        int i7 = i3 - i2;
        boolean z = true;
        boolean z2 = i5 < i7 + i6;
        if (!z2) {
            this.checksum ^= this.fastBuffer.m37607a(i2, i7);
        }
        int size = this.invalids.size();
        int i8 = size - 1;
        int i9 = this.dataEnd - this.invalids.get(i8).f36212a;
        int[] iArr = new int[(i9 > 0 ? size : i8) << 1];
        int i10 = c13172d.f36213b;
        int i11 = c13172d.f36212a;
        int i12 = 1;
        while (i12 < size) {
            C13172d c13172d2 = this.invalids.get(i12);
            boolean z3 = z;
            int i13 = c13172d2.f36213b - i11;
            byte[] bArr = this.fastBuffer.f36243a;
            System.arraycopy(bArr, i11, bArr, i10, i13);
            int i14 = (i12 - 1) << 1;
            iArr[i14] = i11;
            iArr[i14 + 1] = i11 - i10;
            i10 += i13;
            i11 = c13172d2.f36212a;
            i12++;
            z = z3;
        }
        if (i9 > 0) {
            byte[] bArr2 = this.fastBuffer.f36243a;
            System.arraycopy(bArr2, i11, bArr2, i10, i9);
            int i15 = i8 << 1;
            iArr[i15] = i11;
            iArr[i15 + 1] = i11 - i10;
        }
        clearInvalid();
        if (z2) {
            this.checksum = this.fastBuffer.m37607a(12, i5);
        } else {
            this.checksum ^= this.fastBuffer.m37607a(i2, i6);
        }
        this.dataEnd = i4;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i2);
            this.aBuffer.put(this.fastBuffer.f36243a, i2, i6);
            this.aBuffer.putInt(0, i5);
            this.bBuffer.putInt(0, i5);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i2);
            this.bBuffer.put(this.fastBuffer.f36243a, i2, i6);
        } else {
            this.fastBuffer.m37614b(0, i5);
            this.fastBuffer.m37609a(4, this.checksum);
        }
        updateOffset(i2, iArr);
        int i16 = i4 + i;
        if (this.fastBuffer.f36243a.length - i16 > TRUNCATE_THRESHOLD) {
            truncate(i16);
        }
        info(GC_FINISH);
    }

    public synchronized Map<String, Object> getAll() {
        Object objValueOf;
        int size = this.data.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, AbstractC13204j> entry : this.data.entrySet()) {
            String key = entry.getKey();
            AbstractC13204j value = entry.getValue();
            switch (value.mo37706a()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C13206k) value).f36313b);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C13212n) value).f36350b);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C13210m) value).f36319b);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C13214o) value).f36354b);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C13208l) value).f36318b);
                    break;
                case 6:
                    C13218q c13218q = (C13218q) value;
                    objValueOf = c13218q.f36363b ? getStringFromFile(c13218q) : c13218q.f36365d;
                    break;
                case 7:
                    C13202i c13202i = (C13202i) value;
                    objValueOf = c13202i.f36363b ? getArrayFromFile(c13202i) : c13202i.f36365d;
                    break;
                case 8:
                    C13216p c13216p = (C13216p) value;
                    objValueOf = c13216p.f36363b ? getObjectFromFile(c13216p) : c13216p.f36365d;
                    break;
                default:
                    objValueOf = null;
                    break;
            }
            map.put(key, objValueOf);
        }
        return map;
    }

    public byte[] getArray(String str) {
        return getArray(str, EMPTY_ARRAY);
    }

    public synchronized boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public double getDouble(String str) {
        return getDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public synchronized long getLong(String str) {
        C13214o c13214o;
        c13214o = (C13214o) this.data.get(str);
        return c13214o == null ? 0L : c13214o.f36354b;
    }

    public synchronized <T> T getObject(String str) {
        C13216p c13216p = (C13216p) this.data.get(str);
        if (c13216p != null) {
            return c13216p.f36363b ? (T) getObjectFromFile(c13216p) : (T) c13216p.f36365d;
        }
        return null;
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public synchronized Set<String> getStringSet(String str) {
        return (Set) getObject(str);
    }

    public void putAll(Map<String, Object> map) {
        putAll(map, null);
    }

    public synchronized void putArray(String str, byte[] bArr) throws Throwable {
        Throwable th;
        try {
            try {
                checkKey(str);
                if (bArr == null) {
                    try {
                        remove(str);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    addOrUpdate(str, bArr, bArr, (C13202i) this.data.get(str), (byte) 7);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public synchronized void putBoolean(String str, boolean z) {
        checkKey(str);
        C13206k c13206k = (C13206k) this.data.get(str);
        if (c13206k == null) {
            wrapHeader(str, (byte) 1);
            C13184b0 c13184b0 = this.fastBuffer;
            int i = c13184b0.f36244b;
            c13184b0.m37608a(z ? (byte) 1 : (byte) 0);
            updateChange();
            this.data.put(str, new C13206k(i, z));
            checkIfCommit();
        } else if (c13206k.f36313b != z) {
            c13206k.f36313b = z;
            updateBoolean(z ? (byte) 1 : (byte) 0, c13206k.f36310a);
            checkIfCommit();
        }
    }

    public synchronized void putDouble(String str, double d) throws Throwable {
        Throwable th;
        try {
            try {
                checkKey(str);
                C13208l c13208l = (C13208l) this.data.get(str);
                if (c13208l != null) {
                    if (c13208l.f36318b != d) {
                        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
                        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(c13208l.f36318b) ^ jDoubleToRawLongBits;
                        c13208l.f36318b = d;
                        updateInt64(jDoubleToRawLongBits, jDoubleToRawLongBits2, c13208l.f36310a);
                        checkIfCommit();
                    }
                }
                try {
                    wrapHeader(str, (byte) 5);
                    C13184b0 c13184b0 = this.fastBuffer;
                    int i = c13184b0.f36244b;
                    c13184b0.m37610a(Double.doubleToRawLongBits(d));
                    updateChange();
                    this.data.put(str, new C13208l(i, d));
                    checkIfCommit();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public synchronized void putFloat(String str, float f) {
        checkKey(str);
        C13210m c13210m = (C13210m) this.data.get(str);
        if (c13210m == null) {
            wrapHeader(str, (byte) 3);
            C13184b0 c13184b0 = this.fastBuffer;
            int i = c13184b0.f36244b;
            c13184b0.m37625g(Float.floatToRawIntBits(f));
            updateChange();
            this.data.put(str, new C13210m(i, f));
            checkIfCommit();
        } else if (c13210m.f36319b != f) {
            int iFloatToRawIntBits = Float.floatToRawIntBits(f);
            long jFloatToRawIntBits = ((long) (Float.floatToRawIntBits(c13210m.f36319b) ^ iFloatToRawIntBits)) & 4294967295L;
            c13210m.f36319b = f;
            updateInt32(iFloatToRawIntBits, jFloatToRawIntBits, c13210m.f36310a);
            checkIfCommit();
        }
    }

    public synchronized void putInt(String str, int i) {
        checkKey(str);
        C13212n c13212n = (C13212n) this.data.get(str);
        if (c13212n == null) {
            wrapHeader(str, (byte) 2);
            C13184b0 c13184b0 = this.fastBuffer;
            int i2 = c13184b0.f36244b;
            c13184b0.m37625g(i);
            updateChange();
            this.data.put(str, new C13212n(i2, i));
            checkIfCommit();
        } else {
            int i3 = c13212n.f36350b;
            if (i3 != i) {
                c13212n.f36350b = i;
                updateInt32(i, ((long) (i3 ^ i)) & 4294967295L, c13212n.f36310a);
                checkIfCommit();
            }
        }
    }

    public synchronized void putLong(String str, long j) throws Throwable {
        Throwable th;
        try {
            try {
                checkKey(str);
                C13214o c13214o = (C13214o) this.data.get(str);
                if (c13214o != null) {
                    long j2 = c13214o.f36354b;
                    if (j2 != j) {
                        long j3 = j ^ j2;
                        c13214o.f36354b = j;
                        updateInt64(j, j3, c13214o.f36310a);
                        checkIfCommit();
                    }
                }
                try {
                    wrapHeader(str, (byte) 4);
                    C13184b0 c13184b0 = this.fastBuffer;
                    int i = c13184b0.f36244b;
                    c13184b0.m37610a(j);
                    updateChange();
                    this.data.put(str, new C13214o(i, j));
                    checkIfCommit();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public synchronized <T> void putObject(String str, T t, InterfaceC13170b<T> interfaceC13170b) throws Throwable {
        Throwable th;
        byte[] bArrMo37552a;
        try {
            try {
                checkKey(str);
                if (interfaceC13170b == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                String strMo37551a = interfaceC13170b.mo37551a();
                if (strMo37551a == null || strMo37551a.isEmpty() || strMo37551a.length() > 50) {
                    throw new IllegalArgumentException("Invalid encoder tag:" + strMo37551a);
                }
                if (!this.encoderMap.containsKey(strMo37551a)) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (t == null) {
                        remove(str);
                        return;
                    }
                    try {
                        bArrMo37552a = interfaceC13170b.mo37552a(t);
                    } catch (Exception e) {
                        error(e);
                        bArrMo37552a = null;
                    }
                    if (bArrMo37552a == null) {
                        remove(str);
                        return;
                    }
                    int iM37603b = C13184b0.m37603b(strMo37551a);
                    C13184b0 c13184b0 = new C13184b0(iM37603b + 1 + bArrMo37552a.length);
                    c13184b0.m37608a((byte) iM37603b);
                    c13184b0.m37618c(strMo37551a);
                    c13184b0.m37612a(bArrMo37552a);
                    addOrUpdate(str, t, c13184b0.f36243a, (C13216p) this.data.get(str), (byte) 8);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    public synchronized void putString(String str, String str2) {
        Throwable th;
        try {
            try {
                checkKey(str);
                try {
                    if (str2 != null) {
                        C13218q c13218q = (C13218q) this.data.get(str);
                        if (str2.length() * 3 < 2048) {
                            fastPutString(str, str2, c13218q);
                        } else {
                            addOrUpdate(str, str2, str2.isEmpty() ? EMPTY_ARRAY : str2.getBytes(StandardCharsets.UTF_8), c13218q, (byte) 6);
                        }
                    }
                    remove(str);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public synchronized void putStringSet(String str, Set<String> set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                putObject(str, set, C13237z0.f36412a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(String str) {
        AbstractC13204j abstractC13204j = this.data.get(str);
        if (abstractC13204j != null) {
            this.data.remove(str);
            byte bMo37706a = abstractC13204j.mo37706a();
            String str2 = null;
            if (bMo37706a <= 5) {
                int iM37603b = C13184b0.m37603b(str);
                int i = abstractC13204j.f36310a;
                remove(bMo37706a, i - (iM37603b + 2), i + TYPE_SIZE[bMo37706a]);
            } else {
                AbstractC13220r abstractC13220r = (AbstractC13220r) abstractC13204j;
                remove(bMo37706a, abstractC13220r.f36364c, abstractC13220r.f36310a + abstractC13220r.f36366e);
                if (abstractC13220r.f36363b) {
                    str2 = (String) abstractC13220r.f36365d;
                }
            }
            byte b = (byte) (bMo37706a | (-128));
            if (this.writingMode == 0) {
                this.aBuffer.putLong(4, this.checksum);
                this.aBuffer.put(this.removeStart, b);
                this.bBuffer.putLong(4, this.checksum);
                this.bBuffer.put(this.removeStart, b);
            } else {
                this.fastBuffer.m37609a(4, this.checksum);
            }
            this.removeStart = 0;
            if (str2 != null) {
                C13191d1.m37657a(new File(this.path + this.name, str2));
            }
            checkGC();
            checkIfCommit();
        }
    }

    public synchronized String toString() {
        return "FastKV: path:" + this.path + " name:" + this.name;
    }

    private void wrapHeader(String str, byte b, int i) {
        int iM37603b = C13184b0.m37603b(str);
        checkKeySize(iM37603b);
        this.updateSize = iM37603b + 2 + i;
        preparePutBytes();
        this.fastBuffer.m37608a(b);
        putKey(str, iM37603b);
    }

    public synchronized byte[] getArray(String str, byte[] bArr) {
        C13202i c13202i = (C13202i) this.data.get(str);
        if (c13202i != null) {
            return c13202i.f36363b ? getArrayFromFile(c13202i) : (byte[]) c13202i.f36365d;
        }
        return bArr;
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        C13206k c13206k = (C13206k) this.data.get(str);
        if (c13206k != null) {
            z = c13206k.f36313b;
        }
        return z;
    }

    public synchronized double getDouble(String str, double d) {
        C13208l c13208l = (C13208l) this.data.get(str);
        if (c13208l != null) {
            d = c13208l.f36318b;
        }
        return d;
    }

    public synchronized float getFloat(String str, float f) {
        C13210m c13210m = (C13210m) this.data.get(str);
        if (c13210m != null) {
            f = c13210m.f36319b;
        }
        return f;
    }

    public synchronized int getInt(String str, int i) {
        C13212n c13212n = (C13212n) this.data.get(str);
        if (c13212n != null) {
            i = c13212n.f36350b;
        }
        return i;
    }

    public synchronized String getString(String str, String str2) {
        C13218q c13218q = (C13218q) this.data.get(str);
        if (c13218q != null) {
            return c13218q.f36363b ? getStringFromFile(c13218q) : (String) c13218q.f36365d;
        }
        return str2;
    }

    public synchronized void putAll(Map<String, Object> map, Map<Class, InterfaceC13170b> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && !key.isEmpty()) {
                if (value instanceof String) {
                    putString(key, (String) value);
                } else if (value instanceof Boolean) {
                    putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Set) {
                    Set<String> set = (Set) value;
                    if (!set.isEmpty() && (set.iterator().next() instanceof String)) {
                        putStringSet(key, set);
                    }
                } else if (value instanceof byte[]) {
                    putArray(key, (byte[]) value);
                } else if (map2 != null) {
                    InterfaceC13170b interfaceC13170b = map2.get(value.getClass());
                    if (interfaceC13170b != null) {
                        putObject(key, value, interfaceC13170b);
                    } else {
                        warning(new Exception("missing encoder for type:" + value.getClass()));
                    }
                } else {
                    warning(new Exception("missing encoders"));
                }
            }
        }
    }

    private void error(String str) {
        InterfaceC13171c interfaceC13171c = this.logger;
        if (interfaceC13171c != null) {
            interfaceC13171c.mo37555b(this.name, new Exception(str));
        }
    }

    public synchronized long getLong(String str, long j) {
        C13214o c13214o = (C13214o) this.data.get(str);
        if (c13214o != null) {
            j = c13214o.f36354b;
        }
        return j;
    }

    private void remove(byte b, int i, int i2) {
        countInvalid(i, i2);
        byte b2 = (byte) (b | (-128));
        byte[] bArr = this.fastBuffer.f36243a;
        this.checksum = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.checksum;
        bArr[i] = b2;
        this.removeStart = i;
    }
}
