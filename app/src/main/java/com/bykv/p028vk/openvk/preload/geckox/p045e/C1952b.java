package com.bykv.p028vk.openvk.preload.geckox.p045e;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.e.b */
/* JADX INFO: compiled from: VersionedResLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1952b {

    /* JADX INFO: renamed from: a */
    private final Map<String, C1948a> f4413a = new HashMap();

    /* JADX INFO: renamed from: b */
    private AtomicBoolean f4414b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private String f4415c;

    public C1952b(Context context, String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        if (file != null) {
            this.f4415c = new File(file, str).getAbsolutePath();
            return;
        }
        this.f4415c = new File(context.getFilesDir(), "gecko_offline_res_x" + File.separator + str).getAbsolutePath();
    }

    /* JADX INFO: renamed from: d */
    private C1948a m6017d(String str) {
        C1948a c1948a;
        int iIndexOf = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(String.valueOf(str)));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.f4413a) {
            c1948a = this.f4413a.get(strSubstring);
            if (c1948a == null) {
                c1948a = new C1948a(this.f4415c, strSubstring);
                this.f4413a.put(strSubstring, c1948a);
            }
        }
        return c1948a;
    }

    /* JADX INFO: renamed from: a */
    public final InputStream m6018a(String str) throws Exception {
        if (this.f4414b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return m6017d(str.trim()).m6007a(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m6019a() {
        return this.f4415c;
    }

    /* JADX INFO: renamed from: b */
    public final int m6020b(String str) throws Exception {
        if (this.f4414b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return m6017d(str.trim()).m6011c(str);
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, Long> m6021b() {
        HashMap map = new HashMap();
        synchronized (this.f4413a) {
            Collection<C1948a> collectionValues = this.f4413a.values();
            if (collectionValues == null) {
                return map;
            }
            for (C1948a c1948a : collectionValues) {
                map.put(c1948a.m6009b(), c1948a.m6008a());
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6022c() throws Exception {
        if (this.f4414b.getAndSet(true)) {
            return;
        }
        GeckoLogger.m6040d("Loader", "release version res loader");
        synchronized (this.f4413a) {
            Iterator<C1948a> it = this.f4413a.values().iterator();
            while (it.hasNext()) {
                it.next().m6012c();
            }
            this.f4413a.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6023c(String str) throws Exception {
        if (this.f4414b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return m6017d(str.trim()).m6010b(str);
    }
}
