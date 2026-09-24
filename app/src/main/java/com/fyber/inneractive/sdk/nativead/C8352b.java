package com.fyber.inneractive.sdk.nativead;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.cache.C8445g;
import com.fyber.inneractive.sdk.player.cache.InterfaceC8444f;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.nativead.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8352b implements InterfaceC8444f {

    /* JADX INFO: renamed from: f */
    public static final C8352b f18613f = new C8352b();

    /* JADX INFO: renamed from: a */
    public Context f18614a;

    /* JADX INFO: renamed from: b */
    public C8445g f18615b;

    /* JADX INFO: renamed from: c */
    public boolean f18616c = false;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f18617d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public final RunnableC8351a f18618e = new RunnableC8351a(this);

    /* JADX INFO: renamed from: a */
    public static File m20724a(C8352b c8352b) {
        String externalStorageState;
        File externalCacheDir;
        String externalStorageState2 = "";
        Context context = c8352b.f18614a;
        if (context != null && !TextUtils.isEmpty("assets")) {
            if (AbstractC9174o.f21470a != null && AbstractC9174o.m21996a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                try {
                    externalStorageState = Environment.getExternalStorageState();
                } catch (Throwable unused) {
                    externalStorageState = "";
                }
                if ("mounted".equals(externalStorageState)) {
                    try {
                        externalStorageState2 = Environment.getExternalStorageState();
                    } catch (Throwable unused2) {
                    }
                    if (("mounted".equals(externalStorageState2) || "mounted_ro".equals(externalStorageState2)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 41943040) {
                        return new File(context.getExternalCacheDir(), "assets");
                    }
                }
            }
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() > 41943040) {
                return new File(context.getCacheDir(), "assets");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m20725a() {
        boolean z;
        C8445g c8445g = this.f18615b;
        if (c8445g != null) {
            synchronized (c8445g) {
                z = c8445g.f18795i == null;
            }
            if (!z) {
                try {
                    this.f18615b.close();
                    this.f18616c = false;
                    return;
                } catch (Throwable th) {
                    IAlog.m21950f("%s: destroy: Error closing cache: %s", "NativeCache", th);
                    return;
                }
            }
        }
        IAlog.m21947c("%s: destroy: cache already closed or not exists", "NativeCache");
    }

    @Override // com.fyber.inneractive.sdk.player.cache.InterfaceC8444f
    /* JADX INFO: renamed from: a */
    public final boolean mo20726a(String str) {
        Iterator it = this.f18617d.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
