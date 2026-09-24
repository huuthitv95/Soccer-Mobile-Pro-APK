package com.facebook.ads.redexgen.core;

import android.hardware.display.DisplayManager;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.G8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5268G8 implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C5270GA A01;

    public C5268G8(C5270GA c5270ga, DisplayManager displayManager) {
        this.A01 = c5270ga;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
