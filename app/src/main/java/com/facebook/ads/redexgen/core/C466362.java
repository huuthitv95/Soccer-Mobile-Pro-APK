package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.62 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C466362 extends FrameLayout implements InterfaceC5437Is {
    public static byte[] A0A;
    public static String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public C6847fp A00;
    public final int A01;
    public final AbstractC7077jd A02;
    public final C6902gi A03;
    public final InterfaceC6192VA A04;
    public final C6365Y2 A05;
    public final InterfaceC6674d1 A06;
    public final C6685dC A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{100, 70, 73, 0, 83, 7, 84, 83, 70, 85, 83, 7, 102, 82, 67, 78, 66, 73, 68, 66, 105, 66, 83, 80, 72, 85, 76, 102, 68, 83, 78, 81, 78, 83, 94, 9, 7, 106, 70, 76, 66, 7, 84, 82, 85, 66, 7, 83, 79, 70, 83, 7, 78, 83, 0, 84, 7, 78, 73, 7, 94, 72, 82, 85, 7, 102, 73, 67, 85, 72, 78, 67, 106, 70, 73, 78, 65, 66, 84, 83, 9, 95, 74, 75, 7, 65, 78, 75, 66, 9, Ascii.CAN, Ascii.f22493FS, Ascii.f22502US, 43, 58, 55, 59, 48, Base64.padSymbol, 59, Ascii.DLE, 59, 42, 41, 49, 44, 53, 69, 74, 123, 69, 71, 80, 77, 82, 77, 80, 93, 4, Ascii.f22503VT, Ascii.f22500SO, 4, Ascii.f22492FF, 56, Ascii.DC4, 8, Ascii.DC2, Ascii.NAK, 4, 2, 90, 85, SignedBytes.MAX_POWER_OF_TWO, 93, 66, 81, 117, 80, 112, 85, SignedBytes.MAX_POWER_OF_TWO, 85, 118, 65, 90, 80, 88, 81, Ascii.ESC, Ascii.f22494GS, Ascii.f22503VT, Ascii.f22493FS, Ascii.f22490CR, 2, 7, Ascii.f22490CR, 5, Ascii.SYN, 9, 5, Ascii.ETB, 52, Ascii.f22491EM, Ascii.DLE, 5};
    }

    static {
        A02();
    }

    public C466362(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, InterfaceC6674d1 interfaceC6674d1, AbstractC7077jd abstractC7077jd, String str, int i, C6365Y2 c6365y2) {
        super(c6902gi);
        this.A03 = c6902gi;
        this.A04 = interfaceC6192VA;
        this.A02 = abstractC7077jd;
        this.A08 = str;
        this.A06 = interfaceC6674d1;
        this.A01 = i;
        C6685dC preloadedDynamicWebViewController = AbstractC6686dD.A02(abstractC7077jd.A1D());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new C6685dC(this.A03, abstractC7077jd, interfaceC6192VA, i);
            AbstractC6686dD.A03(abstractC7077jd, this.A07);
            this.A09 = false;
        }
        if (c6365y2 != null) {
            this.A05 = c6365y2;
            this.A07.A0Z(c6365y2);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C5464JJ(this));
        this.A07.A0a(interfaceC6674d1);
        EnumC6339Xc.A04(this, EnumC6339Xc.A0B);
        if (C6171Up.A1z(c6902gi)) {
            c6902gi.A0B().AKp(this.A07.A0O(), abstractC7077jd.A2E(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0F().A66();
            this.A07.A0X();
        } else {
            this.A03.A0F().A67();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.ADm(this);
                    }
                    if (C6171Up.A1z(this.A03)) {
                        InterfaceC6204VM interfaceC6204VMA0B = this.A03.A0B();
                        if (A0B[1].length() != 25) {
                            throw new RuntimeException();
                        }
                        A0B[5] = "";
                        interfaceC6204VMA0B.ADb();
                    }
                } else {
                    AKD();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C6685dC.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC7077jd abstractC7077jd) {
        intent.putExtra(A01(157, 8, 110), EnumC6262WK.A07);
        intent.putExtra(A01(130, 18, 58), abstractC7077jd);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC7077jd abstractC7077jd) {
        AdActivityIntent adActivityIntentA05 = C6297Wu.A05(this.A03);
        A05(adActivityIntentA05, abstractC7077jd);
        try {
            C6297Wu.A0B(this.A03, adActivityIntentA05);
        } catch (Exception e) {
            this.A03.A08().ABC(A01(107, 11, 42), AbstractC6098Td.A0D, new C6099Te(e));
            Log.e(A01(90, 17, 80), A01(0, 90, 41), e);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C6580bV c6580bV = new C6580bV(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A2A());
        HashMap map = new HashMap();
        map.put(A01(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 12, 105), A01(148, 9, 96));
        c6580bV.A05(this.A02.A2E(), str, map);
    }

    public final void A08() {
        AbstractC6374YB.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void A9f() {
        A07(this.A02.A29().A0J().A05());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void A9g(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void A9k() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void AAm() {
        new Handler(Looper.getMainLooper()).post(new C5460JF(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void AE0() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void AE4() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void AEu(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void AFz() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void AGX(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void AGZ(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void AGo(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void AKD() {
        if (this.A06 != null) {
            this.A06.ADm(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5437Is
    public final void close() {
    }

    public InterfaceC6192VA getAdEventManager() {
        return this.A04;
    }

    public C6685dC getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C6847fp c6847fp) {
        this.A00 = c6847fp;
        this.A07.A0e(c6847fp);
    }
}
