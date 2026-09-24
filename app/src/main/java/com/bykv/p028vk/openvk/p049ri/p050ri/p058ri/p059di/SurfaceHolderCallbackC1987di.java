package com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.ri.di.di */
/* JADX INFO: loaded from: classes3.dex */
public class SurfaceHolderCallbackC1987di implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: ri */
    private final WeakReference<SurfaceHolder.Callback> f4598ri;

    public SurfaceHolderCallbackC1987di(SurfaceHolder.Callback callback) {
        this.f4598ri = new WeakReference<>(callback);
    }

    /* JADX INFO: renamed from: ri */
    public SurfaceHolder.Callback m6278ri() {
        return this.f4598ri.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.f4598ri.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f4598ri.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f4598ri.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
