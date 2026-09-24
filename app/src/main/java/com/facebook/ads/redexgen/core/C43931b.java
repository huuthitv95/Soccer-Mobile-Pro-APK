package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1b */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C43931b extends AbstractC4905AE implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"58lW15hp88fFpLaSxErp", "56QScXrV6I", "DwEmmtKo2ODeTiA17rxauXwet98Z4", "A4aLtxZMLOPLaVE6SeDzXnpOLTGefetw", "FhOKuZuvLBWd8lghoK1mwxVLtzQRZ", "h1d8vpIJ83Cnf8DVjx4Ui7av1xQxYsFL", "y1YT0hSXczs7bGZDGpuR", "alxZNjekiwxoo3ZSsAAxphzspQJfVEZr"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C7472qI A05;
    public InterfaceC7211lq A06;
    public C48138S A07;
    public AbstractC48108P A08;
    public AbstractC48108P A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C47226z A0E;
    public final InterfaceC5162EP A0F;
    public final InterfaceC5165ES A0G;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "1YRuRVntTKbD5w1SSS8awuyRss3tM";
            strArr2[4] = "HmFGzdsys3t1iPkkAdwtO8Q44Z9aJ";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            i4++;
        }
    }

    public static void A09() {
        A0H = new byte[]{89, 127, 104, 126, 99, 126, 102, 111, 42, 110, 111, 105, 101, 110, 99, 100, 109, 42, 108, 107, 99, 102, 111, 110, 36, 42, 121, 126, 120, 111, 107, 103, 76, 101, 120, 103, 107, 126, 55, 57, 8, Ascii.NAK, Ascii.f22491EM, 63, 8, 3, 9, 8, Ascii.f22502US, 8, Ascii.f22502US};
    }

    static {
        A09();
    }

    public C43931b(InterfaceC5165ES interfaceC5165ES, Looper looper, InterfaceC5162EP interfaceC5162EP) {
        super(3);
        this.A0G = (InterfaceC5165ES) AbstractC45353y.A01(interfaceC5165ES);
        this.A0D = looper == null ? null : AbstractC46115C.A0c(looper, this);
        this.A0F = interfaceC5162EP;
        this.A0E = new C47226z();
        this.A02 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC45353y.A01(this.A09);
        if (this.A01 >= this.A09.A84()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A83(this.A01);
    }

    @RequiresNonNull({MessengerShareContentUtility.SUBTITLE})
    @SideEffectFree
    private long A01(long j) {
        int iA8a = this.A09.A8a(j);
        if (iA8a != 0) {
            int nextEventTimeIndex = this.A09.A84();
            if (nextEventTimeIndex != 0) {
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[0];
                int length = str.length();
                int nextEventTimeIndex2 = str2.length();
                if (length != nextEventTimeIndex2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "dWbBH4lKinuUlTA8CpNFonpmnzuPl";
                strArr2[4] = "MDue3s6tkJ65MZJ0TxYFZvpfeIb1w";
                if (iA8a == -1) {
                    AbstractC48108P abstractC48108P = this.A09;
                    if (A0I[1].length() != 10) {
                        int nextEventTimeIndex3 = this.A09.A84();
                        return abstractC48108P.A83(nextEventTimeIndex3 - 1);
                    }
                    A0I[3] = "us0wUp64B7rq5nQeuQUWAOSOIfPFOl8I";
                    int nextEventTimeIndex4 = this.A09.A84();
                    return abstractC48108P.A83(nextEventTimeIndex4 - 1);
                }
                int nextEventTimeIndex5 = iA8a - 1;
                return this.A09.A83(nextEventTimeIndex5);
            }
        }
        return ((AbstractC7392oz) this.A09).A01;
    }

    @SideEffectFree
    private long A02(long j) {
        boolean z = true;
        AbstractC45353y.A08(j != -9223372036854775807L);
        if (this.A04 == -9223372036854775807L) {
            z = false;
        }
        AbstractC45353y.A08(z);
        return j - this.A04;
    }

    private void A04() {
        A0B(new C7420pR(MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5K((C7472qI) AbstractC45353y.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((InterfaceC7211lq) AbstractC45353y.A01(this.A06)).AHb();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(C7420pR c7420pR) {
        this.A0G.ADa(c7420pR.A01);
        this.A0G.ADZ(c7420pR);
    }

    private void A0B(C7420pR c7420pR) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c7420pR).sendToTarget();
        } else {
            A0A(c7420pR);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0C(C5164ER c5164er) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, c5164er).sendToTarget();
        }
    }

    private void A0D(C7204lj c7204lj) {
        AbstractC45794g.A08(A03(39, 12, 23), A03(0, 39, 112) + this.A05, c7204lj);
        A0C(new C5164ER(this.A05, c7204lj));
        A04();
        A08();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC4905AE
    public final void A1Z() {
        this.A05 = null;
        this.A02 = -9223372036854775807L;
        A04();
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC4905AE
    public final void A1a(long j, boolean z) {
        this.A03 = j;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((InterfaceC7211lq) AbstractC45353y.A01(this.A06)).flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC4905AE
    public final void A1c(C7472qI[] c7472qIArr, long j, long j2) {
        this.A04 = j2;
        this.A05 = c7472qIArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final boolean AAP() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final boolean AAe() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void AIX(long j, long j2) throws C466261 {
        this.A03 = j;
        if (AAN() && this.A02 != -9223372036854775807L && j >= this.A02) {
            A06();
            this.A0B = true;
        }
        if (this.A0B) {
            return;
        }
        if (this.A08 == null) {
            ((InterfaceC7211lq) AbstractC45353y.A01(this.A06)).AJh(j);
            try {
                this.A08 = ((InterfaceC7211lq) AbstractC45353y.A01(this.A06)).A5t();
            } catch (C7204lj e) {
                A0D(e);
                return;
            }
        }
        if (A9A() != 2) {
            return;
        }
        boolean z = false;
        if (this.A09 != null) {
            long jA00 = A00();
            while (jA00 <= j) {
                this.A01++;
                jA00 = A00();
                z = true;
            }
        }
        if (this.A08 != null) {
            AbstractC48108P abstractC48108P = this.A08;
            boolean textRendererNeedsUpdate = abstractC48108P.A05();
            if (textRendererNeedsUpdate) {
                if (!z && A00() == Long.MAX_VALUE) {
                    if (this.A00 == 2) {
                        A08();
                    } else {
                        A06();
                        this.A0B = true;
                    }
                }
            } else if (((AbstractC7392oz) abstractC48108P).A01 <= j) {
                AbstractC48108P abstractC48108P2 = this.A09;
                if (A0I[1].length() != 10) {
                    String[] strArr = A0I;
                    strArr[6] = "SM2l9fwyY7vSK8U9dCan";
                    strArr[0] = "PLBzRsO91bLUZoRphjDr";
                    if (abstractC48108P2 != null) {
                        this.A09.A0B();
                    }
                } else {
                    A0I[1] = "uDUYlaOON0";
                    if (abstractC48108P2 != null) {
                        this.A09.A0B();
                    }
                }
                this.A01 = abstractC48108P.A8a(j);
                this.A09 = abstractC48108P;
                this.A08 = null;
                z = true;
            }
        }
        if (z) {
            AbstractC45353y.A01(this.A09);
            A0B(new C7420pR(this.A09.A7X(j), A02(A01(j))));
        }
        int i = this.A00;
        if (A0I[3].charAt(23) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[6] = "ML0YoWWFYnm1pIYkMDlj";
        strArr2[0] = "WzY2c9YM67lXJGPj7nnt";
        if (i == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A0A;
                if (!textRendererNeedsUpdate2) {
                    C48138S c48138sA5r = this.A07;
                    if (c48138sA5r == null) {
                        c48138sA5r = ((InterfaceC7211lq) AbstractC45353y.A01(this.A06)).A5r();
                        if (c48138sA5r != null) {
                            this.A07 = c48138sA5r;
                        } else {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        c48138sA5r.A02(4);
                        ((InterfaceC7211lq) AbstractC45353y.A01(this.A06)).AHJ(c48138sA5r);
                        this.A07 = null;
                        this.A00 = 2;
                        return;
                    }
                    int iA1R = A1R(this.A0E, c48138sA5r, 0);
                    if (iA1R == -4) {
                        boolean textRendererNeedsUpdate3 = c48138sA5r.A05();
                        if (textRendererNeedsUpdate3) {
                            this.A0A = true;
                            this.A0C = false;
                        } else {
                            C7472qI c7472qI = this.A0E.A00;
                            if (c7472qI != null) {
                                c48138sA5r.A00 = c7472qI.A0M;
                                c48138sA5r.A0B();
                                boolean z2 = this.A0C;
                                boolean textRendererNeedsUpdate4 = c48138sA5r.A07();
                                this.A0C = (textRendererNeedsUpdate4 ? false : true) & z2;
                            } else {
                                return;
                            }
                        }
                        boolean textRendererNeedsUpdate5 = this.A0C;
                        if (!textRendererNeedsUpdate5) {
                            ((InterfaceC7211lq) AbstractC45353y.A01(this.A06)).AHJ(c48138sA5r);
                            this.A07 = null;
                        }
                    } else if (iA1R == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (C7204lj e2) {
                A0D(e2);
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC47747p
    public final int AKM(C7472qI c7472qI) {
        if (this.A0F.AKN(c7472qI)) {
            return AbstractC47677i.A00(4);
        }
        if (AbstractC44953J.A0E(c7472qI.A0W)) {
            return AbstractC47677i.A00(1);
        }
        return AbstractC47677i.A00(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo, com.facebook.ads.redexgen.core.InterfaceC47747p
    public final String getName() {
        return A03(39, 12, 23);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0A((C7420pR) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
