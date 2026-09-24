package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7013iZ implements InterfaceC5770OG {
    public static byte[] A09;
    public static final String A0A;
    public long A01;
    public RewardedVideoAd A02;
    public AbstractC5718NQ A03;
    public C47597a A04;
    public final C6902gi A06;
    public final S2SRewardedVideoAdExtendedListener A07;
    public final C6997iI A08;
    public boolean A05 = false;
    public long A00 = -1;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A09 = new byte[]{116, -95, 83, -108, -105, 83, -97, -94, -108, -105, 83, -100, -90, 83, -108, -97, -91, -104, -108, -105, -84, 83, -100, -95, 83, -93, -91, -94, -102, -91, -104, -90, -90, 97, 83, -116, -94, -88, 83, -90, -101, -94, -88, -97, -105, 83, -86, -108, -100, -89, 83, -103, -94, -91, 83, -108, -105, 127, -94, -108, -105, -104, -105, 91, 92, 83, -89, -94, 83, -107, -104, 83, -106, -108, -97, -97, -104, -105, -60, -15, -15, -18, -15, -97, -21, -18, -32, -29, -24, -19, -26, -97, -15, -28, -10, -32, -15, -29, -28, -29, -97, -11, -24, -29, -28, -18, -97, -32, -29, -19, -4, -11};
    }

    static {
        A0A();
        A0A = C7013iZ.class.getSimpleName();
    }

    public C7013iZ(C6997iI c6997iI, InterfaceC5786OW interfaceC5786OW, String str) {
        this.A08 = c6997iI;
        this.A06 = c6997iI.A0B;
        this.A07 = new C6994iF(str, interfaceC5786OW, this, c6997iI);
    }

    private void A0C(String str, AdExperienceType adExperienceType, boolean z) {
        String extraHints;
        if (!this.A05 && this.A04 != null) {
            Log.w(A0A, A09(0, 78, 37));
        }
        A0D(false);
        this.A05 = false;
        C5761O7 c5761o7 = new C5761O7(this.A08.A0D, EnumC6232Vq.A07, AdPlacementType.REWARDED_VIDEO, EnumC6231Vp.A08, 1, this.A08.A0C);
        c5761o7.A08(z);
        if (C6171Up.A2g(this.A06) && (extraHints = C6313XC.A02(this.A06, this.A08.A06)) != null) {
            this.A08.A06 = extraHints;
        }
        c5761o7.A06(this.A08.A06);
        c5761o7.A07(this.A08.A07);
        this.A04 = new C47597a(this.A08.A0B, c5761o7);
        this.A04.A0S(new C7015ib(this));
        this.A04.A0X(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (this.A04 != null) {
            this.A04.A0S(new C7014ia(this));
            this.A04.A0Y(z);
            this.A04.A0K();
            this.A04 = null;
        }
    }

    public final long A0F() {
        if (this.A04 != null) {
            return this.A04.A0G();
        }
        return -1L;
    }

    public final C6997iI A0G() {
        return this.A08;
    }

    public final C6902gi A0H() {
        return this.A06;
    }

    public final void A0I(RewardData rewardData) {
        this.A08.A03 = rewardData;
        if (this.A05 && this.A04 != null) {
            this.A04.A0a(rewardData);
        }
    }

    public final void A0J(String str, AdExperienceType adExperienceType, boolean z) {
        this.A00 = System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z);
        } catch (Exception e) {
            Log.e(A0A, A09(78, 31, 113), e);
            this.A08.A0B.A08().ABC(A09(109, 3, 126), AbstractC6098Td.A0b, new C6099Te(e));
            AdError adErrorInternalError = AdError.internalError(2004);
            this.A08.A0B.A0F().A3N(C6364Y1.A01(this.A00), adErrorInternalError.getErrorCode(), adErrorInternalError.getErrorMessage());
            this.A07.onError(this.A08.A6k(), adErrorInternalError);
        }
    }

    public final boolean A0K() {
        return this.A04 == null || this.A04.A0Z();
    }

    public final boolean A0L() {
        return this.A05;
    }

    public final boolean A0M(int i, long j) {
        if (!this.A05) {
            this.A07.onError(this.A08.A6k(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A04 != null) {
            this.A01 = System.currentTimeMillis();
            this.A04.A08.A02(i);
            this.A04.A08.A03(j);
            this.A04.A0M();
            this.A05 = false;
            return true;
        }
        this.A05 = false;
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5770OG
    public final void destroy() {
        A0D(true);
    }
}
