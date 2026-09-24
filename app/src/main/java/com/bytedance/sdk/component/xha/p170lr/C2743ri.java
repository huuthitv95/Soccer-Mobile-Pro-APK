package com.bytedance.sdk.component.xha.p170lr;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.C2647di;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.bytedance.sdk.component.xha.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2743ri extends AbstractC2740ik {

    /* JADX INFO: renamed from: lr */
    public File f7842lr;

    /* JADX INFO: renamed from: qt */
    private volatile boolean f7843qt;

    /* JADX INFO: renamed from: ri */
    public File f7844ri;

    public C2743ri(AbstractC2671sf abstractC2671sf) {
        super(abstractC2671sf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public static long m10394di(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey(HttpHeaders.CONTENT_LENGTH) ? map.get(HttpHeaders.CONTENT_LENGTH) : null;
        }
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public void m10395di() {
        try {
            this.f7844ri.delete();
        } catch (Throwable unused) {
        }
        try {
            this.f7842lr.delete();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public static boolean m10396fi(Map<String, String> map) {
        if (TextUtils.equals(map.get(HttpHeaders.ACCEPT_RANGES), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get(HttpHeaders.CONTENT_RANGE);
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean xha(Map<String, String> map) {
        return TextUtils.equals(map.get(HttpHeaders.CONTENT_ENCODING), "gzip");
    }

    @Override // com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik
    /* JADX INFO: renamed from: lr */
    public void mo10369lr() {
        this.f7843qt = true;
        super.mo10369lr();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0139 A[PHI: r10
  0x0139: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:42:0x00ff, B:45:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ri */
    public C2739lr m10402ri() {
        C2739lr c2739lr;
        RandomAccessFile randomAccessFile;
        long j;
        InputStream inputStream;
        InputStream inputStreamMo9982ik;
        byte[] bArr;
        int i;
        long j2;
        C2743ri c2743ri = this;
        File file = c2743ri.f7844ri;
        if (file == null || c2743ri.f7842lr == null) {
            return null;
        }
        if (file.exists() && c2743ri.f7844ri.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2739lr c2739lr2 = new C2739lr(true, 200, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            c2739lr2.m10361ri(c2743ri.f7844ri);
            return c2739lr2;
        }
        long length = c2743ri.f7842lr.length();
        if (length < 0) {
            length = 0;
        }
        AbstractC2646co.ri riVar = new AbstractC2646co.ri();
        riVar.m9905ri((Object) c2743ri.m10366ka());
        c2743ri.m10375ri(riVar);
        c2743ri.m10372lr("Range", "bytes=" + length + "-");
        if (TextUtils.isEmpty(c2743ri.f7829mj)) {
            Log.e("DownloadExecutor", "execute: Url is Empty");
            return null;
        }
        try {
            riVar.m9896lr(c2743ri.f7829mj);
            c2743ri.m10370lr(riVar);
            try {
                InterfaceC2651lr interfaceC2651lrMo9987ri = c2743ri.f7826ik.mo9987ri(riVar.m9899ri().m9898lr());
                if (interfaceC2651lrMo9987ri == null) {
                    return null;
                }
                bgr bgrVarMo9923lr = interfaceC2651lrMo9987ri.mo9923lr();
                if (bgrVarMo9923lr != null) {
                    c2743ri.m10376ri(bgrVarMo9923lr.jbs());
                }
                if (bgrVarMo9923lr == null || !bgrVarMo9923lr.mo9879ka()) {
                    return null;
                }
                HashMap map = new HashMap();
                C2647di c2647diXha = bgrVarMo9923lr.xha();
                if (c2647diXha != null) {
                    for (int i2 = 0; i2 < c2647diXha.m9910ri(); i2++) {
                        map.put(c2647diXha.m9911ri(i2), c2647diXha.m9909lr(i2));
                    }
                }
                C2739lr c2739lr3 = new C2739lr(bgrVarMo9923lr.mo9879ka(), bgrVarMo9923lr.mo9878ik(), bgrVarMo9923lr.mo9877fi(), map, null, bgrVarMo9923lr.mo9880lr(), bgrVarMo9923lr.mo9882ri());
                long jMo9985ri = bgrVarMo9923lr.mo9876di().mo9985ri();
                if (jMo9985ri <= 0) {
                    jMo9985ri = m10394di(map);
                }
                long length2 = c2743ri.f7842lr.length();
                boolean zM10396fi = m10396fi(map);
                c2739lr = null;
                if (zM10396fi) {
                    jMo9985ri += length2;
                    try {
                        String str = (String) map.get(HttpHeaders.CONTENT_RANGE);
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.indexOf(str, "bytes " + length2 + "-" + (jMo9985ri - 1)) == -1) {
                                Objects.toString(c2743ri.f7842lr);
                                c2743ri.m10395di();
                                return null;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
                if (jMo9985ri > r3 && c2743ri.f7842lr.exists() && c2743ri.f7842lr.length() == jMo9985ri) {
                    if (!c2743ri.f7842lr.renameTo(c2743ri.f7844ri)) {
                        return null;
                    }
                    c2739lr3.m10361ri(c2743ri.f7844ri);
                    return c2739lr3;
                }
                try {
                    randomAccessFile = new RandomAccessFile(c2743ri.f7842lr, "rw");
                    try {
                        try {
                            try {
                                if (zM10396fi) {
                                    randomAccessFile.seek(length);
                                    j = length;
                                } else {
                                    randomAccessFile.setLength(0L);
                                    j = 0;
                                }
                                while (true) {
                                    int i3 = inputStreamMo9982ik.read(bArr, i, 16384 - i);
                                    inputStream = inputStreamMo9982ik;
                                    if (i3 == -1) {
                                        if (i3 != 0) {
                                            randomAccessFile.seek(j);
                                            randomAccessFile.write(bArr, 0, i);
                                        }
                                        if (!zM10396fi || length == 0) {
                                            jMo9985ri = c2743ri.f7842lr.length();
                                        }
                                        if (jMo9985ri <= 0 || !c2743ri.f7842lr.exists() || c2743ri.f7842lr.length() != jMo9985ri) {
                                            c2743ri.f7842lr.length();
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            try {
                                                randomAccessFile.close();
                                            } catch (Throwable unused3) {
                                            }
                                            return null;
                                        }
                                        if (!c2743ri.f7842lr.renameTo(c2743ri.f7844ri)) {
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                            try {
                                                randomAccessFile.close();
                                            } catch (Throwable unused5) {
                                            }
                                            return null;
                                        }
                                        c2739lr3.m10361ri(c2743ri.f7844ri);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable unused6) {
                                            }
                                        }
                                        try {
                                            randomAccessFile.close();
                                        } catch (Throwable unused7) {
                                        }
                                        return c2739lr3;
                                    }
                                    i += i3;
                                    j2 += (long) i3;
                                    try {
                                        if (j2 % 16384 == 0 || j2 == jMo9985ri - length) {
                                            randomAccessFile.seek(j);
                                            randomAccessFile.write(bArr, 0, i);
                                            j += (long) i;
                                            i = 0;
                                        }
                                        c2743ri = this;
                                        try {
                                            if (c2743ri.f7843qt) {
                                                throw new IOException("net is cancel");
                                            }
                                            inputStreamMo9982ik = inputStream;
                                        } catch (Throwable unused8) {
                                            if (!zM10396fi) {
                                                try {
                                                    c2743ri.m10395di();
                                                } finally {
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Throwable unused9) {
                                                        }
                                                    }
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Throwable unused10) {
                                                    }
                                                }
                                            }
                                            return null;
                                        }
                                    } catch (Throwable unused11) {
                                        c2743ri = this;
                                    }
                                }
                            } catch (Throwable unused12) {
                            }
                            if (xha(map) && !(inputStreamMo9982ik instanceof GZIPInputStream)) {
                                inputStreamMo9982ik = new GZIPInputStream(inputStreamMo9982ik);
                            }
                            bArr = new byte[16384];
                            i = 0;
                            j2 = 0;
                        } catch (Throwable unused13) {
                            inputStream = inputStreamMo9982ik;
                        }
                        inputStreamMo9982ik = bgrVarMo9923lr.mo9876di().mo9982ik();
                    } catch (Throwable unused14) {
                        inputStream = null;
                    }
                } catch (Throwable unused15) {
                    randomAccessFile = null;
                }
            } catch (IOException unused16) {
                c2739lr = null;
            }
            c2743ri.m10395di();
            return c2739lr;
        } catch (IllegalArgumentException unused17) {
            Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10403ri(final AbstractC2746ri abstractC2746ri) {
        File file = this.f7844ri;
        if (file == null || this.f7842lr == null) {
            if (abstractC2746ri != null) {
                abstractC2746ri.mo10423ri(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.f7844ri.length() != 0 && abstractC2746ri != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2739lr c2739lr = new C2739lr(true, 200, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            c2739lr.m10361ri(this.f7844ri);
            abstractC2746ri.mo10425ri(this, c2739lr);
            return;
        }
        long length = this.f7842lr.length();
        final long j = length >= 0 ? length : 0L;
        AbstractC2646co.ri riVar = new AbstractC2646co.ri();
        riVar.m9905ri((Object) m10366ka());
        m10375ri(riVar);
        m10372lr("Range", "bytes=" + j + "-");
        if (TextUtils.isEmpty(this.f7829mj)) {
            abstractC2746ri.mo10423ri(this, new IOException("Url is Empty"));
            return;
        }
        try {
            riVar.m9896lr(this.f7829mj);
            if (!TextUtils.isEmpty(this.f7825fi)) {
                riVar.m9906ri(this.f7825fi);
            }
            if (this.f7824di > 0) {
                riVar.m9900ri(this.f7824di);
            }
            m10370lr(riVar);
            InterfaceC2651lr interfaceC2651lrMo9987ri = this.f7826ik.mo9987ri(riVar.m9899ri().m9898lr());
            if (interfaceC2651lrMo9987ri == null) {
                abstractC2746ri.mo10423ri(this, new IOException("new call error"));
            } else {
                interfaceC2651lrMo9987ri.mo9925ri(new InterfaceC2649ik() { // from class: com.bytedance.sdk.component.xha.lr.ri.1
                    /* JADX WARN: Code duplicated, block: B:107:0x0211 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r9
  0x0211: PHI (r9v2 java.io.InputStream) = (r9v1 java.io.InputStream), (r9v4 java.io.InputStream) binds: [B:89:0x0230, B:81:0x020f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
                    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
                    /* JADX INFO: renamed from: ri */
                    public void mo6243ri(InterfaceC2651lr interfaceC2651lr, bgr bgrVar) throws IOException {
                        RandomAccessFile randomAccessFile;
                        long j2;
                        byte[] bArr;
                        long j3;
                        int i;
                        if (abstractC2746ri == null) {
                            return;
                        }
                        HashMap map = new HashMap();
                        if (bgrVar == null) {
                            return;
                        }
                        C2743ri.this.m10376ri(bgrVar.jbs());
                        C2647di c2647diXha = bgrVar.xha();
                        if (c2647diXha != null) {
                            for (int i2 = 0; i2 < c2647diXha.m9910ri(); i2++) {
                                map.put(c2647diXha.m9911ri(i2), c2647diXha.m9909lr(i2));
                            }
                        }
                        C2739lr c2739lr2 = new C2739lr(bgrVar.mo9879ka(), bgrVar.mo9878ik(), bgrVar.mo9877fi(), map, null, bgrVar.mo9880lr(), bgrVar.mo9882ri());
                        if (!bgrVar.mo9879ka()) {
                            abstractC2746ri.mo10425ri(C2743ri.this, c2739lr2);
                            return;
                        }
                        long jMo9985ri = bgrVar.mo9876di().mo9985ri();
                        long j4 = 0;
                        if (jMo9985ri <= 0) {
                            jMo9985ri = C2743ri.m10394di(map);
                        }
                        boolean zM10396fi = C2743ri.m10396fi(map);
                        if (zM10396fi) {
                            jMo9985ri += j;
                            String str = (String) map.get(HttpHeaders.CONTENT_RANGE);
                            if (!TextUtils.isEmpty(str)) {
                                String str2 = "bytes " + j + "-" + (jMo9985ri - 1);
                                if (TextUtils.indexOf(str, str2) == -1) {
                                    C2743ri.this.m10395di();
                                    abstractC2746ri.mo10423ri(C2743ri.this, new IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + C2743ri.this.f7842lr + "]."));
                                    return;
                                }
                            }
                        }
                        if (jMo9985ri > 0 && C2743ri.this.f7842lr.exists() && C2743ri.this.f7842lr.length() == jMo9985ri) {
                            if (!C2743ri.this.f7842lr.renameTo(C2743ri.this.f7844ri)) {
                                abstractC2746ri.mo10423ri(C2743ri.this, new IOException("Rename fail"));
                                return;
                            } else {
                                c2739lr2.m10361ri(C2743ri.this.f7844ri);
                                abstractC2746ri.mo10425ri(C2743ri.this, c2739lr2);
                                return;
                            }
                        }
                        InputStream inputStreamMo9982ik = null;
                        try {
                            randomAccessFile = new RandomAccessFile(C2743ri.this.f7842lr, "rw");
                            try {
                                try {
                                    if (zM10396fi) {
                                        randomAccessFile.seek(j);
                                        j2 = j;
                                    } else {
                                        randomAccessFile.setLength(0L);
                                        j2 = 0;
                                    }
                                    while (true) {
                                        long j5 = j4;
                                        int i3 = inputStreamMo9982ik.read(bArr, i, 16384 - i);
                                        if (i3 == -1) {
                                            if (i != 0) {
                                                randomAccessFile.seek(j2);
                                                randomAccessFile.write(bArr, 0, i);
                                            }
                                            if (!zM10396fi) {
                                                jMo9985ri = C2743ri.this.f7842lr.length();
                                            }
                                            if (jMo9985ri <= j5 || !C2743ri.this.f7842lr.exists() || C2743ri.this.f7842lr.length() != jMo9985ri) {
                                                AbstractC2746ri abstractC2746ri2 = abstractC2746ri;
                                                C2743ri c2743ri = C2743ri.this;
                                                StringBuilder sb = new StringBuilder(" tempFile.length() == fileSize is");
                                                sb.append(C2743ri.this.f7842lr.length() == jMo9985ri);
                                                abstractC2746ri2.mo10423ri(c2743ri, new IOException(sb.toString()));
                                            } else if (C2743ri.this.f7842lr.renameTo(C2743ri.this.f7844ri)) {
                                                c2739lr2.m10361ri(C2743ri.this.f7844ri);
                                                abstractC2746ri.mo10425ri(C2743ri.this, c2739lr2);
                                            } else {
                                                abstractC2746ri.mo10423ri(C2743ri.this, new IOException("Rename fail"));
                                            }
                                            if (inputStreamMo9982ik != null) {
                                            }
                                            try {
                                                return;
                                            } catch (Throwable unused) {
                                                return;
                                            }
                                        }
                                        i += i3;
                                        j3 += (long) i3;
                                        if (j3 % 16384 == j5 || j3 == jMo9985ri - j) {
                                            randomAccessFile.seek(j2);
                                            randomAccessFile.write(bArr, 0, i);
                                            j2 += (long) i;
                                            i = 0;
                                        }
                                        if (C2743ri.this.f7843qt) {
                                            throw new IOException("net is cancel");
                                        }
                                        j4 = j5;
                                    }
                                } catch (Throwable unused2) {
                                }
                                inputStreamMo9982ik = bgrVar.mo9876di().mo9982ik();
                                if (C2743ri.xha(map) && !(inputStreamMo9982ik instanceof GZIPInputStream)) {
                                    inputStreamMo9982ik = new GZIPInputStream(inputStreamMo9982ik);
                                }
                                bArr = new byte[16384];
                                j3 = 0;
                                i = 0;
                            } catch (Throwable th) {
                                try {
                                    abstractC2746ri.mo10423ri(C2743ri.this, new IOException(th.getMessage()));
                                    if (!zM10396fi) {
                                        C2743ri.this.m10395di();
                                    }
                                } finally {
                                    if (0 != 0) {
                                        try {
                                            inputStreamMo9982ik.close();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused4) {
                                    }
                                }
                            }
                        } catch (Throwable unused5) {
                            randomAccessFile = null;
                        }
                    }

                    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
                    /* JADX INFO: renamed from: ri */
                    public void mo6244ri(InterfaceC2651lr interfaceC2651lr, IOException iOException) {
                        AbstractC2746ri abstractC2746ri2 = abstractC2746ri;
                        if (abstractC2746ri2 != null) {
                            abstractC2746ri2.mo10423ri(C2743ri.this, iOException);
                        }
                        C2743ri.this.m10395di();
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            abstractC2746ri.mo10423ri(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10404ri(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f7844ri = new File(str, str2);
        this.f7842lr = new File(str, str2 + ".temp");
    }
}
