package com.unity3d.player;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes7.dex */
public class OrientationLockListener implements C14690k.a {

    /* JADX INFO: renamed from: a */
    private C14690k f41534a;

    /* JADX INFO: renamed from: b */
    private Context f41535b;

    OrientationLockListener(Context context) {
        this.f41535b = context;
        this.f41534a = new C14690k(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(this.f41535b.getContentResolver(), "accelerometer_rotation", 0));
        this.f41534a.m43412a(this, "accelerometer_rotation");
    }

    /* JADX INFO: renamed from: a */
    public final void m43217a() {
        this.f41534a.m43411a();
        this.f41534a = null;
    }

    @Override // com.unity3d.player.C14690k.a
    /* JADX INFO: renamed from: b */
    public final void mo43218b() {
        nativeUpdateOrientationLockState(Settings.System.getInt(this.f41535b.getContentResolver(), "accelerometer_rotation", 0));
    }

    public final native void nativeUpdateOrientationLockState(int i);
}
