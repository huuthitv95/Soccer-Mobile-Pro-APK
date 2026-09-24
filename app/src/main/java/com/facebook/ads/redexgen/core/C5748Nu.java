package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5748Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C6056Sx A00;
    public EnumC6562bD A01 = EnumC6562bD.A05;
    public ArrayList<C6685dC> A02 = new ArrayList<>();
    public final AbstractC5718NQ A03;
    public final InterfaceC5747Nt A04;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, Ascii.ETB, 35, Ascii.f22493FS, Ascii.ESC, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, Ascii.NAK, Ascii.CAN, 19, Ascii.CAN, Ascii.NAK, 40, Ascii.NAK, 19, Ascii.SYN, 41, 34, Ascii.CAN, 32, Ascii.f22491EM, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, Ascii.DC2, Ascii.ETB, Ascii.DLE, Ascii.CAN, Ascii.f22494GS, Ascii.DC4, 19, -16, 19, -13, Ascii.DLE, 35, Ascii.DLE, -15, 36, Ascii.f22494GS, 19, Ascii.ESC, Ascii.DC4, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C5748Nu(C6902gi c6902gi, C5762O8 c5762o8, InterfaceC5747Nt interfaceC5747Nt, String str) {
        JSONObject dataObject = c5762o8.A03();
        this.A03 = A01(c6902gi, c5762o8, str, dataObject);
        this.A04 = interfaceC5747Nt;
    }

    private AdError A00(C6902gi c6902gi, AbstractC7077jd abstractC7077jd) {
        if (abstractC7077jd == null || abstractC7077jd.A2G().isEmpty()) {
            c6902gi.A08().ABC(A04(62, 3, 33), AbstractC6098Td.A0Z, new C6099Te(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static AbstractC5718NQ A01(C6902gi c6902gi, C5762O8 c5762o8, String str, JSONObject jSONObject) {
        AbstractC5718NQ abstractC5718NQA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                abstractC5718NQA00 = C7069jT.A01(jSONObject, c6902gi, true);
                abstractC5718NQA00.A1Q(true);
                abstractC5718NQA00.A1N(A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
            } catch (JSONException unused) {
            }
        }
        if (abstractC5718NQA00 == null) {
            abstractC5718NQA00 = C47727n.A00(jSONObject, c6902gi);
        }
        abstractC5718NQA00.A1M(str);
        C6118Tx c6118TxA01 = c5762o8.A01();
        if (c6118TxA01 != null) {
            abstractC5718NQA00.A1I(c6118TxA01.A06());
        }
        return abstractC5718NQA00;
    }

    private C6056Sx A03(C6902gi c6902gi) {
        return this.A00 != null ? this.A00 : new C6056Sx(c6902gi);
    }

    private void A08(C6902gi c6902gi, C47727n c47727n) {
        C5742No playableData = c47727n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC6562bD.A05);
        C7052jC c7052jC = new C7052jC(this);
        C6056Sx c6056Sx = new C6056Sx(c6902gi);
        boolean z = C6171Up.A2H(c6902gi) && C6021SN.A0A(c47727n.A1H());
        if (z) {
            C6021SN unifiedAssetsLoader = new C6021SN(c6056Sx, c47727n.A1H(), c47727n.A10(), c47727n.A1D(), z, new C7051jB(this));
            c6056Sx.A0e(new C6200VI(c47727n.A2E(), c6902gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC5759O5.A02(c6902gi, c47727n, true, c7052jC);
    }

    private void A09(C6902gi c6902gi, EnumSet<CacheFlag> enumSet, AbstractC7077jd abstractC7077jd, int i, InterfaceC5747Nt interfaceC5747Nt) {
        boolean isDSL = abstractC7077jd.A1g();
        C6056Sx c6056SxA03 = A03(c6902gi);
        c6056SxA03.A0e(new C6200VI(abstractC7077jd.A2E(), c6902gi.A0A()));
        boolean z = C6171Up.A2H(c6902gi) && C6021SN.A0A(abstractC7077jd.A1H());
        if (z) {
            new C6021SN(c6056SxA03, abstractC7077jd.A1H(), abstractC7077jd.A10(), abstractC7077jd.A1D(), z, new C7055jF(this, c6902gi, isDSL, abstractC7077jd, interfaceC5747Nt)).A0B();
            return;
        }
        String strA04 = A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        if (isDSL) {
            C6052St c6052St = new C6052St(abstractC7077jd.A0x(), abstractC7077jd.A1D(), strA04);
            c6052St.A04 = true;
            c6052St.A03 = A04(0, 5, 78);
            c6056SxA03.A0Y(c6052St);
        }
        c6056SxA03.A0d(new C6054Sv(abstractC7077jd.A2C().A01(), C6739e4.A04, C6739e4.A04, abstractC7077jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean zA30 = C6171Up.A30(c6902gi, C6829fX.A03());
        for (C5719NR c5719nr : abstractC7077jd.A2G()) {
            C6054Sv c6054Sv = new C6054Sv(c5719nr.A0H().A08(), AbstractC5755O1.A00(c5719nr.A0H()), AbstractC5755O1.A01(c5719nr.A0H()), abstractC7077jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
            if (i2 == 0) {
                c6056SxA03.A0c(c6054Sv);
            } else {
                c6056SxA03.A0d(c6054Sv);
            }
            Iterator<String> it = c5719nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c6056SxA03.A0d(new C6054Sv(it.next(), -1, -1, abstractC7077jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(c5719nr.A0H().A09())) {
                C6052St c6052St2 = new C6052St(c5719nr.A0H().A09(), abstractC7077jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), c5719nr.A0H().A06());
                c6052St2.A04 = false;
                if (i2 == 0) {
                    if (isDSL && !zA30) {
                        c6056SxA03.A0Y(c6052St2);
                    } else {
                        c6056SxA03.A0b(c6052St2);
                    }
                } else if (isDSL && !zA30) {
                    c6056SxA03.A0Z(c6052St2);
                } else {
                    c6056SxA03.A0a(c6052St2);
                }
            }
            i2++;
        }
        if (abstractC7077jd.A1W() && !TextUtils.isEmpty(abstractC7077jd.A11())) {
            c6056SxA03.A0d(new C6054Sv(abstractC7077jd.A11(), C5854Pe.A0A, C5854Pe.A0A, abstractC7077jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
        }
        AbstractC5754O0.A00(abstractC7077jd, c6056SxA03, strA04);
        c6056SxA03.A0X(new C7053jD(this, c6902gi, isDSL, abstractC7077jd, interfaceC5747Nt), new C6049Sq(abstractC7077jd.A1D(), strA04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C6902gi c6902gi, EnumSet<CacheFlag> enumSet, C7069jT c7069jT, AbstractC7077jd abstractC7077jd, int i, InterfaceC5747Nt interfaceC5747Nt) {
        A09(c6902gi, enumSet, abstractC7077jd, i, new C7057jH(this, c6902gi, abstractC7077jd, c7069jT, i, interfaceC5747Nt, enumSet));
    }

    private void A0B(EnumC6562bD enumC6562bD) {
        this.A01 = enumC6562bD;
    }

    private boolean A0C(C6902gi c6902gi, AbstractC7077jd abstractC7077jd) {
        AdError adErrorA00 = A00(c6902gi, abstractC7077jd);
        if (adErrorA00 != null) {
            this.A04.ACo(adErrorA00);
            return true;
        }
        return false;
    }

    public final AbstractC5718NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        return com.facebook.ads.redexgen.core.EnumC6262WK.A0C;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.EnumC6262WK A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.NQ r0 = r5.A03
            boolean r0 = r0.A1b()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.EnumC6262WK.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.NQ r4 = r5.A03
            com.facebook.ads.redexgen.X.jd r4 = (com.facebook.ads.redexgen.core.AbstractC7077jd) r4
            boolean r0 = r4.A1g()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.EnumC6262WK.A06
            return r0
        L18:
            java.util.List r0 = r4.A2G()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.EnumC6262WK.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.NR r0 = r4.A29()
            com.facebook.ads.redexgen.X.NU r0 = r0.A0H()
            com.facebook.ads.redexgen.X.No r3 = r0.A07()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C5748Nu.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L9f
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C5748Nu.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L7a
            boolean r0 = r4.A1n()
            if (r0 != 0) goto L71
            boolean r3 = r4.A1u()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C5748Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C5748Nu.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L77
        L71:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.EnumC6262WK.A0E
            return r0
        L74:
            if (r3 == 0) goto L77
            goto L71
        L77:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.EnumC6262WK.A0C
            return r0
        L7a:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C5748Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C5748Nu.A06
            java.lang.String r1 = "iDu"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L96
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.EnumC6262WK.A0D
            return r0
        L96:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.EnumC6262WK.A0B
            return r0
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C5748Nu.A0E():com.facebook.ads.redexgen.X.WK");
    }

    public final EnumC6562bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C7069jT) this.A03).A2A();
        }
        return ((AbstractC7077jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C6902gi c6902gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC6262WK.A04) {
            C7069jT c7069jT = (C7069jT) this.A03;
            AbstractC7077jd abstractC7077jdA26 = c7069jT.A26();
            if (A0C(c6902gi, abstractC7077jdA26) || abstractC7077jdA26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c6902gi, enumSet, c7069jT, abstractC7077jdA26, 0, this.A04);
            return;
        }
        AbstractC7077jd abstractC7077jd = (AbstractC7077jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c6902gi, abstractC7077jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == EnumC6262WK.A0C) {
            C47727n c47727n = (C47727n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c6902gi, c47727n);
                return;
            } else {
                A08(c6902gi, c47727n);
                return;
            }
        }
        A09(c6902gi, enumSet, (C47727n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC7077jd abstractC7077jd) {
        return !TextUtils.isEmpty(abstractC7077jd.A29().A0H().A09());
    }
}
