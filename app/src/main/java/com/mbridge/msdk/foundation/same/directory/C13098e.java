package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13225t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.directory.e */
/* JADX INFO: compiled from: MBridgeDirManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13098e {

    /* JADX INFO: renamed from: c */
    private static volatile C13098e f35924c;

    /* JADX INFO: renamed from: a */
    private final AbstractC13095b f35925a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<a> f35926b = new ArrayList<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.directory.e$a */
    /* JADX INFO: compiled from: MBridgeDirManager.java */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public File f35927a;

        /* JADX INFO: renamed from: b */
        public EnumC13096c f35928b;

        public a(EnumC13096c enumC13096c, File file) {
            this.f35928b = enumC13096c;
            this.f35927a = file;
        }
    }

    private C13098e(AbstractC13095b abstractC13095b) {
        this.f35925a = abstractC13095b;
    }

    /* JADX INFO: renamed from: a */
    public static File m37145a(EnumC13096c enumC13096c) {
        try {
            if (m37148b() == null || m37148b().f35926b == null || m37148b().f35926b.isEmpty()) {
                return null;
            }
            for (a aVar : m37148b().f35926b) {
                if (aVar.f35928b.equals(enumC13096c)) {
                    return aVar.f35927a;
                }
            }
            return null;
        } catch (Throwable th) {
            C13219q0.m37817b("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m37149b(EnumC13096c enumC13096c) {
        File fileM37145a = m37145a(enumC13096c);
        if (fileM37145a != null) {
            return fileM37145a.getAbsolutePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C13098e m37148b() {
        if (f35924c == null && C13008c.m36588n().m36542d() != null) {
            C13225t0.m37849a(C13008c.m36588n().m36542d());
        }
        return f35924c;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m37146a(AbstractC13095b abstractC13095b) {
        if (f35924c == null) {
            f35924c = new C13098e(abstractC13095b);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m37150a() {
        return m37147a(this.f35925a.m37141a());
    }

    /* JADX INFO: renamed from: a */
    private boolean m37147a(C13094a c13094a) {
        String strM37137b;
        C13094a c13094aM37139c = c13094a.m37139c();
        if (c13094aM37139c == null) {
            strM37137b = c13094a.m37137b();
        } else {
            File fileM37145a = m37145a(c13094aM37139c.m37140d());
            if (fileM37145a == null) {
                return false;
            }
            strM37137b = fileM37145a.getAbsolutePath() + File.separator + c13094a.m37137b();
        }
        File file = new File(strM37137b);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f35926b.add(new a(c13094a.m37140d(), file));
        List<C13094a> listM37131a = c13094a.m37131a();
        if (listM37131a != null) {
            Iterator<C13094a> it = listM37131a.iterator();
            while (it.hasNext()) {
                if (!m37147a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
