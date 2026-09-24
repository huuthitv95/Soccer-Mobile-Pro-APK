package com.mbridge.msdk.config.component.load.downloader.utils;

import com.mbridge.msdk.config.component.load.downloader.resource.stream.InterfaceC12816a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.utils.a */
/* JADX INFO: compiled from: Objects.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12818a {

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.utils.a$a */
    /* JADX INFO: compiled from: Objects.java */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.exists();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m35505a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (Exception e) {
            C13219q0.m37813a("closeStream", e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m35508b(File file) {
        if (file == null) {
            return false;
        }
        boolean zExists = file.exists();
        return !zExists ? m35506a(file) : zExists;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m35509b(Object obj) {
        return obj == null;
    }

    /* JADX INFO: renamed from: a */
    public static void m35502a(InterfaceC12816a interfaceC12816a) {
        if (interfaceC12816a == null) {
            return;
        }
        try {
            interfaceC12816a.close();
        } catch (Exception e) {
            C13219q0.m37813a("closeStream", e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m35503a(C13709a0 c13709a0) {
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

    /* JADX INFO: renamed from: a */
    public static void m35504a(AbstractC13711b0 abstractC13711b0) {
        if (abstractC13711b0 == null) {
            return;
        }
        try {
            abstractC13711b0.close();
        } catch (Exception e) {
            C13219q0.m37813a("closeStream", e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m35506a(File file) {
        File[] fileArrListFiles;
        try {
            fileArrListFiles = file.getParentFile().listFiles(new a());
        } catch (Exception e) {
            C13219q0.m37813a("doubleCheckExists", e.getLocalizedMessage());
            fileArrListFiles = null;
        }
        return fileArrListFiles != null && file.length() > 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m35507a(Object obj) {
        return !m35509b(obj);
    }
}
