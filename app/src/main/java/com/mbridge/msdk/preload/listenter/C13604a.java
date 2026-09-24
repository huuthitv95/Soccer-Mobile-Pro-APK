package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.mbridge.msdk.preload.listenter.a */
/* JADX INFO: compiled from: PreloadListenerEx.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13604a implements PreloadListener {

    /* JADX INFO: renamed from: a */
    WeakReference<PreloadListener> f37423a;

    /* JADX INFO: renamed from: b */
    private int f37424b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f37425c = false;

    public C13604a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f37423a = new WeakReference<>(preloadListener);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38977a(boolean z) {
        this.f37425c = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m38978a() {
        return this.f37425c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f37423a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f37423a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f37423a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f37423a.get().onPreloadSucceed();
    }
}
