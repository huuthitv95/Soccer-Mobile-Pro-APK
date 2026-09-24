package com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.ri.di.ka */
/* JADX INFO: loaded from: classes3.dex */
public class TextureViewSurfaceTextureListenerC1990ka extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC1991lr {

    /* JADX INFO: renamed from: lr */
    private InterfaceC1991lr.ri f4603lr;

    /* JADX INFO: renamed from: ri */
    private InterfaceC1992ri f4604ri;

    public TextureViewSurfaceTextureListenerC1990ka(Context context) {
        this(context, null);
    }

    public TextureViewSurfaceTextureListenerC1990ka(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1991lr
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1991lr
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        InterfaceC1992ri interfaceC1992ri = this.f4604ri;
        if (interfaceC1992ri != null) {
            interfaceC1992ri.mo6284ri(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        InterfaceC1992ri interfaceC1992ri = this.f4604ri;
        if (interfaceC1992ri != null) {
            return interfaceC1992ri.mo6287ri(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        InterfaceC1992ri interfaceC1992ri = this.f4604ri;
        if (interfaceC1992ri != null) {
            interfaceC1992ri.mo6282lr(surfaceTexture);
        }
    }

    @Override // android.view.View
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
        this.f4604ri = interfaceC1992ri;
        setSurfaceTextureListener(this);
    }

    public void setWindowVisibilityChangedListener(InterfaceC1991lr.ri riVar) {
        this.f4603lr = riVar;
    }
}
