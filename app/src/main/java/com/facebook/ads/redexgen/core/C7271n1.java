package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7271n1 implements InterfaceC5265G5, DisplayManager.DisplayListener {
    public static byte[] A02;
    public InterfaceC5264G4 A00;
    public final DisplayManager A01;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{Ascii.f22499SI, Ascii.DC4, Ascii.f22498RS, Ascii.ESC, Ascii.ETB, Ascii.f22492FF, 36};
    }

    public C7271n1(DisplayManager displayManager) {
        this.A01 = displayManager;
    }

    private Display A00() {
        return this.A01.getDisplay(0);
    }

    public static C7271n1 A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 65));
        if (displayManager != null) {
            return new C7271n1(displayManager);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5265G5
    public final void AHX(InterfaceC5264G4 interfaceC5264G4) {
        this.A00 = interfaceC5264G4;
        this.A01.registerDisplayListener(this, AbstractC46115C.A0Y());
        interfaceC5264G4.ADd(A00());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5265G5
    public final void AKW() {
        this.A01.unregisterDisplayListener(this);
        this.A00 = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (this.A00 != null && i == 0) {
            this.A00.ADd(A00());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
