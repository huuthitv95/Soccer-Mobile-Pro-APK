package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.xha$1 */
    static class C27331 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.xha$ri */
    private static final class C2734ri implements Comparator<File> {
        private C2734ri() {
        }

        /* synthetic */ C2734ri(C27331 c27331) {
            this();
        }

        /* JADX INFO: renamed from: ri */
        private int m10335ri(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return m10335ri(file.lastModified(), file2.lastModified());
        }
    }

    /* JADX INFO: renamed from: di */
    private static void m10324di(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    /* JADX INFO: renamed from: fi */
    private static void m10325fi(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            m10324di(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            long j = length - 1;
            try {
                randomAccessFile.seek(j);
                byte b = randomAccessFile.readByte();
                randomAccessFile.seek(j);
                randomAccessFile.write(b);
                randomAccessFile.close();
            } catch (Throwable unused) {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
        } catch (Throwable unused2) {
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: ik */
    public static void m10326ik(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        m10326ik(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            file.delete();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ka */
    public static byte[] m10327ka(File file) {
        FileInputStream fileInputStream;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    long j = fileInputStream.read(bArr);
                    lValueOf.getClass();
                    if (j == length) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return bArr;
                    }
                } catch (Throwable unused2) {
                    if (fileInputStream != null) {
                    }
                    return null;
                }
            } catch (Throwable unused3) {
                fileInputStream = null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public static File m10328lr(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (absolutePath != null && !absolutePath.endsWith(File.separator)) {
            absolutePath = absolutePath + File.separator;
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: lr */
    public static void m10329lr(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            m10325fi(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static File m10330ri(Context context, File file, String str) {
        if (file != null) {
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable unused) {
                return new File(file, str);
            }
        }
        if (ihz.m10229ri(context)) {
            return new File(file, str);
        }
        return new File(file, str + "_" + ihz.m10225ik(context));
    }

    /* JADX INFO: renamed from: ri */
    public static File m10331ri(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (!ihz.m10229ri(context)) {
            str = str + "_" + ihz.m10225ik(context);
        }
        if (absolutePath != null && !absolutePath.endsWith(File.separator)) {
            absolutePath = absolutePath + File.separator;
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: ri */
    public static File m10332ri(Context context, String str, String str2) {
        String strM10333ri = m10333ri(context);
        if (!ihz.m10229ri(context)) {
            str = str + "_" + ihz.m10225ik(context);
        }
        if (strM10333ri != null && !strM10333ri.endsWith(File.separator)) {
            strM10333ri = strM10333ri + File.separator;
        }
        String str3 = strM10333ri + str;
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str3, str2);
    }

    /* JADX INFO: renamed from: ri */
    private static String m10333ri(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    /* JADX INFO: renamed from: ri */
    public static List<File> m10334ri(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new C2734ri(null));
        return listAsList;
    }
}
