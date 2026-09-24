package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Messenger;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Un */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6169Un {
    public static byte[] A06;
    public static String[] A07 = {"6qWdP8UnAqk2", "MP5OshbzeeKQXWypFydZHFaUVi2SMaBY", "YZOrpgpjnThYhZrbQ", "9FBJpZQghCKG6mC2kMssKZrg31bKkWn0", "1igNFrY6lER43", "wq7phLHZ3BH2hfkM7", "H4ZPtJlAPqOhXadVzSXMAib", "ZeuNk8rzE4mqHJK5cCc2mdI2UMeFjq1Z"};

    @Nullable
    public Messenger A00;
    public boolean A01 = false;
    public final ServiceConnection A02 = new ServiceConnectionC6168Um(this);
    public final C6902gi A03;
    public final String A04;
    public final String A05;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        byte[] bArr = {-32, -47, -30, -47, -35, -17, -47, -34, -17, -27, -27, -39, -44, -4, -19, -2, -19, -7, Ascii.f22503VT, -4, -2, -5, 0, -5, -17, -5, -8, Ascii.f22503VT, 2, -15, -2, -1, -11, -5, -6, -63, -78, -61, -78, -66, -48, -61, -74, -62, -58, -74, -60, -59, -48, -70, -75, Ascii.f22500SO, Ascii.f22502US, 33, 41, Ascii.f22502US, 37, 35, -19, 33, 45, 43, 46, 45, 44, 35, 44, 50, -34, 44, 45, 50, -34, 36, 45, 51, 44, 34, -34, 45, 48, -34, 43, 39, 49, 49, 39, 44, 37, -34, 46, 35, 48, 43, 39, 49, 49, 39, 45, 44, 49, -69, -35, -38, -50, -48, -34, -34, -44, -39, -46, -117, -35, -48, -36, -32, -48, -34, -33, 1, Ascii.f22490CR, Ascii.f22503VT, -52, 4, -1, 1, 3, 0, Ascii.f22490CR, Ascii.f22490CR, 9, -52, -1, 19, 2, 7, 3, Ascii.f22492FF, 1, 3, Ascii.f22492FF, 3, Ascii.DC2, Ascii.NAK, Ascii.f22490CR, Ascii.DLE, 9, -52, -33, 19, 2, 7, 3, Ascii.f22492FF, 1, 3, -20, 3, Ascii.DC2, Ascii.NAK, Ascii.f22490CR, Ascii.DLE, 9, -15, 3, Ascii.DLE, Ascii.DC4, 7, 1, 3, 2, Ascii.f22500SO, Ascii.f22492FF, -51, 5, 0, 2, 4, 1, Ascii.f22500SO, Ascii.f22500SO, 10, -51, 10, 0, 19, 0, Ascii.f22490CR, 0, 43, 50, 37, 33, 56, 35, 46, 43, 38, 35, 54, 43, 49, 48};
        String[] strArr = A07;
        if (strArr[0].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[0] = "tkHV67jO43cW";
        strArr2[4] = "7eV9Uq8jXNAYU";
        A06 = bArr;
    }

    static {
        A06();
    }

    public C6169Un(C6902gi c6902gi, String str, String str2) {
        this.A03 = c6902gi;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt(A05(13, 22, 88), 1);
        bundle.putString(A05(0, 13, 60), this.A04);
        bundle.putString(A05(35, 16, 29), this.A05);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, C6099Te c6099Te) {
        this.A03.A08().ABC(A05(189, 14, 110), i, c6099Te);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(int i, C6099Te c6099Te) {
        c6099Te.A05(1);
        this.A03.A08().ABD(A05(189, 14, 110), i, c6099Te);
    }

    public final void A0C() {
        A08(AbstractC6098Td.A1t, new C6099Te(A05(101, 18, 23), this.A05));
        Intent intent = new Intent();
        intent.setClassName(A05(170, 19, 75), A05(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 51, 74));
        try {
            if (!this.A03.bindService(intent, this.A02, 1)) {
                A08(AbstractC6098Td.A1p, new C6099Te(A05(51, 50, 106)));
                this.A03.unbindService(this.A02);
            }
        } catch (Exception e) {
            A07(AbstractC6098Td.A1o, new C6099Te(e));
        }
    }
}
