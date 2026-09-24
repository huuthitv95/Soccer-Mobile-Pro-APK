package com.savegame;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class SavesRestoring {
    private static String path = "";
    private static String tr3 = "youtubeapi.html";

    /* JADX INFO: renamed from: y2 */
    private static String f41369y2 = "";
    private static String yt1 = "";

    public static void DoSmth(Context context) {
        for (int i = 0; i < 3; i++) {
            if (m43159r(i, context)) {
                if (i != 2) {
                    bDR(i, context);
                } else if (!kytt(context)) {
                    bDR(i, context);
                }
            }
        }
    }

    private static void bDR(int i, Context context) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(m43157is(i, context)));
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                File file = new File(m43156d(i, context), nextEntry.getName());
                if (!file.exists()) {
                    File parentFile = nextEntry.isDirectory() ? file : file.getParentFile();
                    if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                        throw new FileNotFoundException("Failed to ensure directory: " + parentFile.getAbsolutePath());
                    }
                    if (!nextEntry.isDirectory()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        while (true) {
                            int i2 = zipInputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, i2);
                            }
                        }
                        fileOutputStream.close();
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ch */
    private static boolean m43155ch(Context context) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(m43157is(2, context)));
            int i = 0;
            int i2 = 0;
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                File file = new File(m43156d(2, context), nextEntry.getName());
                i++;
                if (file.exists() && nextEntry.getSize() == file.length()) {
                    i2++;
                }
            }
            zipInputStream.close();
            return i == i2;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m43156d(int i, Context context) {
        File externalCacheDir;
        if (i == 0) {
            externalCacheDir = context.getFilesDir();
        } else {
            if (i != 1) {
                return context.getObbDir().getPath();
            }
            externalCacheDir = context.getExternalCacheDir();
        }
        return m43158o(externalCacheDir.getPath());
    }

    /* JADX INFO: renamed from: is */
    private static InputStream m43157is(int i, Context context) throws Throwable {
        String str;
        AssetManager assets = context.getAssets();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        if (i == 0) {
            str = tr3;
        } else {
            str = i == 1 ? yt1 : f41369y2;
        }
        sb.append(str);
        return assets.open(sb.toString());
    }

    private static boolean kytt(Context context) {
        if (m43155ch(context)) {
            return true;
        }
        File file = new File(m43156d(2, context));
        if (file.exists() && file.list().length != 0) {
            for (File file2 : new File(m43156d(2, context)).listFiles()) {
                if (file2.isFile()) {
                    file2.delete();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    private static String m43158o(String str) {
        return str.substring(0, str.length() - 6);
    }

    /* JADX INFO: renamed from: r */
    private static boolean m43159r(int i, Context context) {
        try {
            return m43157is(i, context).available() > 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
