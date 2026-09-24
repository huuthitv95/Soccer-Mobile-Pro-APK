package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5f */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
public final class C46405f {
    public static byte[] A0A;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public C5652ML A06;
    public String A07;
    public Map<String, String> A08;
    public byte[] A09;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-35, -15, -18, -87, -2, -5, -14, -87, -10, -2, -4, -3, -87, -21, -18, -87, -4, -18, -3, -73};
    }

    public C46405f() {
        this.A01 = 1;
        this.A08 = Collections.emptyMap();
        this.A02 = -1L;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public C46405f(C46435i c46435i) {
        this.A05 = c46435i.A06;
        this.A04 = c46435i.A05;
        this.A01 = c46435i.A01;
        this.A09 = c46435i.A0A;
        this.A08 = c46435i.A09;
        this.A03 = c46435i.A04;
        this.A02 = c46435i.A03;
        this.A07 = c46435i.A08;
        this.A00 = c46435i.A00;
        this.A06 = c46435i.A07;
    }

    public final C46405f A02(int i) {
        this.A00 = i;
        return this;
    }

    public final C46405f A03(long j) {
        this.A02 = j;
        return this;
    }

    public final C46405f A04(long j) {
        this.A03 = j;
        return this;
    }

    public final C46405f A05(long j) {
        this.A04 = j;
        return this;
    }

    public final C46405f A06(Uri uri) {
        this.A05 = uri;
        return this;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C46405f A07(C5652ML c5652ml) {
        this.A06 = c5652ml;
        return this;
    }

    public final C46405f A08(String str) {
        this.A07 = str;
        return this;
    }

    @MetaExoPlayerCustomization("D50990955; Ensure that fbDataSpecExtension is not null")
    public final C46435i A09() {
        C5652ML c5652ml;
        AbstractC45353y.A03(this.A05, A00(0, 20, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        Uri uri = this.A05;
        long j = this.A04;
        int i = this.A01;
        byte[] bArr = this.A09;
        Map<String, String> map = this.A08;
        long j2 = this.A03;
        long j3 = this.A02;
        String str = this.A07;
        int i2 = this.A00;
        if (this.A06 != null) {
            c5652ml = this.A06;
        } else {
            c5652ml = new C5652ML();
        }
        return new C46435i(uri, j, i, bArr, map, j2, j3, str, i2, c5652ml);
    }
}
