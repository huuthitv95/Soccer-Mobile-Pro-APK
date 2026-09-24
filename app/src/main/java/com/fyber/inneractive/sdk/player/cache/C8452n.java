package com.fyber.inneractive.sdk.player.cache;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C8452n implements InterfaceC8444f {

    /* JADX INFO: renamed from: f */
    public static final C8452n f18811f = new C8452n();

    /* JADX INFO: renamed from: a */
    public Context f18812a;

    /* JADX INFO: renamed from: b */
    public C8445g f18813b;

    /* JADX INFO: renamed from: c */
    public boolean f18814c = false;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f18815d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public final RunnableC8451m f18816e = new RunnableC8451m(this);

    /* JADX INFO: renamed from: a */
    public static File m20834a(Context context, String str) {
        String externalStorageState;
        File externalCacheDir;
        String externalStorageState2 = "";
        if (context != null && !TextUtils.isEmpty(str)) {
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
                    if (("mounted".equals(externalStorageState2) || "mounted_ro".equals(externalStorageState2)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 52428800) {
                        return new File(context.getExternalCacheDir(), str);
                    }
                }
            }
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() > 52428800) {
                return new File(context.getCacheDir(), str);
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.cache.InterfaceC8444f
    /* JADX INFO: renamed from: a */
    public final boolean mo20726a(String str) {
        Iterator it = this.f18815d.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
