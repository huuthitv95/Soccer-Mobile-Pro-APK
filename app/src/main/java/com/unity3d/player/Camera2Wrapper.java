package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;

/* JADX INFO: loaded from: classes7.dex */
public class Camera2Wrapper implements InterfaceC14684e {

    /* JADX INFO: renamed from: a */
    private Context f41513a;

    /* JADX INFO: renamed from: b */
    private C14682c f41514b = null;

    /* JADX INFO: renamed from: c */
    private final int f41515c = 100;

    public Camera2Wrapper(Context context) {
        this.f41513a = context;
        initCamera2Jni();
    }

    /* JADX INFO: renamed from: a */
    private static int m43203a(float f) {
        return (int) Math.min(Math.max((f * 2000.0f) - 1000.0f, -900.0f), 900.0f);
    }

    private final native void deinitCamera2Jni();

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    /* JADX INFO: renamed from: a */
    public final void m43204a() {
        deinitCamera2Jni();
        closeCamera2();
    }

    @Override // com.unity3d.player.InterfaceC14684e
    /* JADX INFO: renamed from: a */
    public final void mo43205a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    @Override // com.unity3d.player.InterfaceC14684e
    /* JADX INFO: renamed from: a */
    public final void mo43206a(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        nativeFrameReady(obj, obj2, obj3, i, i2, i3);
    }

    protected void closeCamera2() {
        C14682c c14682c = this.f41514b;
        if (c14682c != null) {
            c14682c.m43306b();
        }
        this.f41514b = null;
    }

    protected int getCamera2Count() {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C14682c.m43268a(this.f41513a);
        }
        return 0;
    }

    protected int getCamera2FocalLengthEquivalent(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C14682c.m43289d(this.f41513a, i);
        }
        return 0;
    }

    protected int[] getCamera2Resolutions(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C14682c.m43292e(this.f41513a, i);
        }
        return null;
    }

    protected int getCamera2SensorOrientation(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C14682c.m43269a(this.f41513a, i);
        }
        return 0;
    }

    protected Object getCameraFocusArea(float f, float f2) {
        int iM43203a = m43203a(f);
        int iM43203a2 = m43203a(1.0f - f2);
        return new Camera.Area(new Rect(iM43203a - 100, iM43203a2 - 100, iM43203a + 100, iM43203a2 + 100), 1000);
    }

    protected Rect getFrameSizeCamera2() {
        C14682c c14682c = this.f41514b;
        return c14682c != null ? c14682c.m43303a() : new Rect();
    }

    protected boolean initializeCamera2(int i, int i2, int i3, int i4, int i5) {
        if (!PlatformSupport.LOLLIPOP_SUPPORT || this.f41514b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        C14682c c14682c = new C14682c(this);
        this.f41514b = c14682c;
        return c14682c.m43305a(this.f41513a, i, i2, i3, i4, i5);
    }

    protected boolean isCamera2AutoFocusPointSupported(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C14682c.m43287c(this.f41513a, i);
        }
        return false;
    }

    protected boolean isCamera2FrontFacing(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C14682c.m43285b(this.f41513a, i);
        }
        return false;
    }

    protected void pauseCamera2() {
        C14682c c14682c = this.f41514b;
        if (c14682c != null) {
            c14682c.m43308d();
        }
    }

    protected boolean setAutoFocusPoint(float f, float f2) {
        C14682c c14682c;
        if (!PlatformSupport.LOLLIPOP_SUPPORT || (c14682c = this.f41514b) == null) {
            return false;
        }
        return c14682c.m43304a(f, f2);
    }

    protected void startCamera2() {
        C14682c c14682c = this.f41514b;
        if (c14682c != null) {
            c14682c.m43307c();
        }
    }

    protected void stopCamera2() {
        C14682c c14682c = this.f41514b;
        if (c14682c != null) {
            c14682c.m43309e();
        }
    }
}
