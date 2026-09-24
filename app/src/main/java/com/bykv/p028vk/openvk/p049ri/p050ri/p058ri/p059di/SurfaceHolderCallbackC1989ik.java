package com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.ri.di.ik */
/* JADX INFO: loaded from: classes3.dex */
public class SurfaceHolderCallbackC1989ik extends C1988fi implements SurfaceHolder.Callback, InterfaceC1991lr {

    /* JADX INFO: renamed from: ik */
    private static final ArrayList<SurfaceHolderCallbackC1987di> f4599ik = new ArrayList<>();

    /* JADX INFO: renamed from: ka */
    private InterfaceC1991lr.ri f4600ka;

    /* JADX INFO: renamed from: lr */
    private SurfaceHolderCallbackC1987di f4601lr;

    /* JADX INFO: renamed from: ri */
    private WeakReference<InterfaceC1992ri> f4602ri;

    public SurfaceHolderCallbackC1989ik(Context context) {
        super(context);
        m6279ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m6279ri() {
        SurfaceHolderCallbackC1987di surfaceHolderCallbackC1987di = new SurfaceHolderCallbackC1987di(this);
        this.f4601lr = surfaceHolderCallbackC1987di;
        f4599ik.add(surfaceHolderCallbackC1987di);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1991lr
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1991lr
    /* JADX INFO: renamed from: ri */
    public void mo6280ri(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1991lr
    /* JADX INFO: renamed from: ri */
    public void mo6281ri(InterfaceC1992ri interfaceC1992ri) {
        this.f4602ri = new WeakReference<>(interfaceC1992ri);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<SurfaceHolderCallbackC1987di> it = f4599ik.iterator();
        while (it.hasNext()) {
            SurfaceHolderCallbackC1987di next = it.next();
            if (next != null && next.m6278ri() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f4601lr);
    }

    public void setWindowVisibilityChangedListener(InterfaceC1991lr.ri riVar) {
        this.f4600ka = riVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference<InterfaceC1992ri> weakReference = this.f4602ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f4602ri.get().mo6286ri(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<InterfaceC1992ri> weakReference = this.f4602ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f4602ri.get().mo6285ri(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<InterfaceC1992ri> weakReference = this.f4602ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f4602ri.get().mo6283lr(surfaceHolder);
    }
}
