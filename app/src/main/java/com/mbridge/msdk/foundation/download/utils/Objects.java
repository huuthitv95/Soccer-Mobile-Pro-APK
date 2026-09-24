package com.mbridge.msdk.foundation.download.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class Objects {
    public static void closeInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (Exception e) {
            C13219q0.m37813a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void closeOutputStream(DownloadFileOutputStream downloadFileOutputStream) {
        if (downloadFileOutputStream == null) {
            return;
        }
        try {
            downloadFileOutputStream.close();
        } catch (Exception e) {
            C13219q0.m37813a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void closeResponse(C13709a0 c13709a0) {
        if (c13709a0 == null) {
            return;
        }
        try {
            if (c13709a0.m40167d() != null) {
                c13709a0.m40167d().close();
            }
            c13709a0.close();
        } catch (Exception e) {
            C13219q0.m37813a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void closeResponseBody(AbstractC13711b0 abstractC13711b0) {
        if (abstractC13711b0 == null) {
            return;
        }
        try {
            abstractC13711b0.close();
        } catch (Exception e) {
            C13219q0.m37813a("closeStream", e.getLocalizedMessage());
        }
    }

    private static boolean doubleCheckExists(File file, final String str, final String str2) {
        File[] fileArrListFiles;
        try {
            fileArrListFiles = file.getParentFile().listFiles(new FileFilter() { // from class: com.mbridge.msdk.foundation.download.utils.Objects.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return TextUtils.equals(file2.getAbsolutePath(), str + str2);
                }
            });
        } catch (Exception e) {
            C13219q0.m37813a("doubleCheckExists", e.getLocalizedMessage());
            fileArrListFiles = null;
        }
        return fileArrListFiles != null && file.length() > 0;
    }

    public static boolean exists(File file, String str, String str2) {
        if (file == null || TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zExists = file.exists();
        return !zExists ? doubleCheckExists(file, str, str2) : zExists;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean isNotNull(Object obj) {
        return !isNull(obj);
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }
}
