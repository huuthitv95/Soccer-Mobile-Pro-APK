package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5702NA extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC7108k8 A00;
    public InterfaceC5701N9 A01;
    public C6902gi A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, Ascii.f22499SI, 71, SignedBytes.MAX_POWER_OF_TWO, 66, 68, 67, 78, 78, 74, Ascii.f22499SI, SignedBytes.MAX_POWER_OF_TWO, 69, 82, Ascii.f22499SI, 67, SignedBytes.MAX_POWER_OF_TWO, 79, 79, 68, 83, Ascii.f22499SI, 66, 77, 72, 66, 74, 68, 69};
    }

    public C5702NA(C6902gi c6902gi, String str, InterfaceC7108k8 interfaceC7108k8, InterfaceC5701N9 interfaceC5701N9) {
        this.A02 = c6902gi;
        this.A03 = str;
        this.A01 = interfaceC5701N9;
        this.A00 = interfaceC7108k8;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        C5818P2.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        C5818P2.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ADC(this.A00);
        }
    }
}
