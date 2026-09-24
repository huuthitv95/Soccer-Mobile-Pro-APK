package com.bykv.p028vk.openvk.preload.geckox.utils;

import android.os.Process;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.utils.b */
/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1965b {
    /* JADX INFO: renamed from: a */
    public static String m6073a(InputStream inputStream) {
        BufferedReader bufferedReader;
        try {
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                } catch (Throwable unused) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    return null;
                }
            }
            String string = sb.toString();
            try {
                bufferedReader.close();
            } catch (Throwable unused4) {
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused5) {
                }
            }
            return string;
        } catch (Throwable unused6) {
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6074a(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                bufferedOutputStream.flush();
                return;
            }
            bufferedOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6075a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        GeckoLogger.m6040d("gecko-debug-tag", "delete file，pid:", Integer.valueOf(Process.myPid()), ", thread:", Thread.currentThread().toString(), ", file:" + file.getAbsolutePath());
        return m6078d(file);
    }

    /* JADX INFO: renamed from: b */
    public static List<File> m6076b(File file) {
        File[] fileArrListFiles;
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return null;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        final HashMap map = new HashMap();
        for (File file2 : listAsList) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listAsList, new Comparator<File>() { // from class: com.bykv.vk.openvk.preload.geckox.utils.b.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file3, File file4) {
                File file5 = file3;
                File file6 = file4;
                if (file5 == null && file6 == null) {
                    return 0;
                }
                if (file5 == null) {
                    return 1;
                }
                if (file6 == null) {
                    return -1;
                }
                return Long.compare(((Long) map.get(file5)).longValue(), ((Long) map.get(file6)).longValue());
            }
        });
        return listAsList;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6077c(File file) {
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!m6077c(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: d */
    private static boolean m6078d(File file) {
        boolean z;
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return true;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            z = true;
        } else {
            z = true;
            for (File file2 : fileArrListFiles) {
                z = z && m6078d(file2);
            }
        }
        return z && file.delete();
    }
}
