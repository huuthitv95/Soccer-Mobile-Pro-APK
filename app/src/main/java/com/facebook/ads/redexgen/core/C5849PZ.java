package com.facebook.ads.redexgen.core;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5849PZ extends RelativeLayout implements InterfaceC6407Yi {
    public static byte[] A0G;
    public static final String A0H;
    public static final int A0I;
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public String A04;
    public boolean A05;
    public final InterfaceC5982Rk A06;
    public final LinearLayout A07;
    public final C5976Re A08;
    public final C6902gi A09;
    public final InterfaceC6192VA A0A;
    public final InterfaceC6406Yh A0B;
    public final C6530ah A0C;
    public final InterfaceC6539aq A0D;
    public final C5634M3 A0E;
    public final InterfaceC6544av A0F;

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0G = new byte[]{90, 112, 112, 125, 112, Ascii.DC4, 63, Base64.padSymbol, 112, 19, 63, 62, 36, 53, 62, 36, 112, Ascii.f22493FS, 63, 49, 52, 53, 52, 112, 4, 57, Base64.padSymbol, 53, 106, 112, 48, Ascii.SUB, Ascii.SUB, Ascii.ETB, Ascii.SUB, 118, 85, 91, 94, Ascii.SUB, 124, 83, 84, 83, 73, 82, Ascii.SUB, 110, 83, 87, 95, 0, Ascii.SUB, 95, 117, 117, 120, 117, Ascii.f22491EM, 58, 52, 49, 117, 6, 33, 52, 39, 33, 117, 1, 60, 56, 48, 111, 117, 117, 95, 95, 82, 95, 45, Ascii.SUB, Ascii.f22492FF, Ascii.f22499SI, Ascii.DLE, 17, Ascii.f22492FF, Ascii.SUB, 95, 58, 17, Ascii.ESC, 95, 43, Ascii.SYN, Ascii.DC2, Ascii.SUB, 69, 95, 109, 71, 71, 74, 71, 52, 4, Ascii.NAK, 8, Ascii.f22503VT, Ascii.f22503VT, 71, 53, 2, 6, 3, Ascii.f22498RS, 71, 51, Ascii.f22500SO, 10, 2, 93, 71, 87, 125, 125, 112, 125, Ascii.f22500SO, 56, 46, 46, 52, 50, 51, 125, Ascii.ESC, 52, 51, 52, 46, 53, 125, 9, 52, 48, 56, 103, 125, 42, Ascii.SUB, 48, 48, Base64.padSymbol, 48, 88, 113, 126, 116, 124, 117, 98, 48, 68, 121, 125, 117, 42, 48, 97, 81, 76, 84, 80, 70, 81, 3, 80, 70, 80, 80, 74, 76, 77, 3, 71, 66, 87, 66, 3, 79, 76, 68, 68, 70, 71, 3, 99, 3, 126, 125, 112, 106, 107, 37, 125, 115, 126, 113, 116, 67, 83, 78, 86, 82, 68, 83, 116, 115, 109, 85, 90, 95, 83, 88, 66, 98, 89, 93, 83, 88, 37, 44, 35, 41, 33, 40, 63, Ascii.f22491EM, 36, 32, 40};
    }

    static {
        A0E();
        A0H = C5849PZ.class.getSimpleName();
        A0I = AbstractC6332XV.A0A;
    }

    public C5849PZ(C5976Re c5976Re, C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, boolean z) {
        C5634M3 c5634m3;
        super(c6902gi);
        this.A06 = new C5852Pc(this);
        this.A05 = true;
        this.A01 = -1L;
        this.A03 = true;
        this.A08 = c5976Re;
        this.A0A = interfaceC6192VA;
        this.A0B = interfaceC6406Yh;
        this.A09 = c6902gi;
        if (c6902gi.A0E() == null) {
            c6902gi.A0F().A9v();
        }
        this.A0D = A0F();
        if (AbstractC6172Uq.A02(c6902gi) || c6902gi.A0E() == null) {
            c5634m3 = new C5634M3(c6902gi, this.A0D);
        } else {
            c5634m3 = new C5634M3(c6902gi, c6902gi.A0E(), this.A0D);
        }
        this.A0E = c5634m3;
        this.A0F = A0C(z);
        this.A07 = (LinearLayout) this.A0F;
        this.A07.setId(View.generateViewId());
        this.A0F.setListener(new C5851Pb(this));
        this.A0E.setBrowserNavigationListener(this.A0F.getBrowserNavigationListener());
        this.A0C = new C6530ah(c6902gi, null, R.attr.progressBarStyleHorizontal);
        A0G();
        c5976Re.A0A(this.A06);
    }

    private InterfaceC6544av A0C(boolean z) {
        if (z) {
            return new C5639M8(this.A09, this.A0E, false);
        }
        return new C5637M6(this.A09, this.A0E);
    }

    public InterfaceC6539aq A0F() {
        return new C5850Pa(this);
    }

    public void A0G() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A07.setPadding(AbstractC6332XV.A0b, AbstractC6332XV.A0b, AbstractC6332XV.A0b, AbstractC6332XV.A0b);
        this.A0B.A45(this.A07, layoutParams);
        RelativeLayout.LayoutParams webViewParams = new RelativeLayout.LayoutParams(-1, -2);
        webViewParams.addRule(3, this.A07.getId());
        webViewParams.addRule(12);
        this.A0B.A45(this.A0E, webViewParams);
        RelativeLayout.LayoutParams webViewParams2 = new RelativeLayout.LayoutParams(-1, A0I);
        webViewParams2.addRule(3, this.A07.getId());
        this.A0C.setProgress(0);
        this.A0B.A45(this.A0C, webViewParams2);
    }

    public void A0H() {
        this.A08.finish(1);
    }

    public void A0I(String str) {
    }

    public void AAu(Intent intent, Bundle bundle, C5976Re c5976Re) {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String strA0D = A0D(231, 11, 97);
        String strA0D2 = A0D(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 11, 26);
        String url = A0D(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 10, 13);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(url);
            this.A04 = intent.getStringExtra(strA0D2);
            this.A00 = intent.getLongExtra(strA0D, -1L);
        } else {
            this.A02 = bundle.getString(url);
            this.A04 = bundle.getString(strA0D2);
            this.A00 = bundle.getLong(strA0D, -1L);
        }
        String strA0D3 = this.A02 != null ? this.A02 : A0D(199, 11, 51);
        this.A0F.setUrl(strA0D3);
        this.A0E.loadUrl(strA0D3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFA(boolean z) {
        this.A0E.onPause();
        if (this.A03) {
            this.A03 = false;
            C6533ak c6533akA07 = new C6532aj(this.A0E.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0E.getResponseEndMs()).A00(this.A0E.getDomContentLoadedMs()).A05(this.A0E.getScrollReadyMs()).A02(this.A0E.getLoadFinishMs()).A06(System.currentTimeMillis()).A07();
            this.A0A.AB5(this.A04, c6533akA07.A02());
            if (BuildConfigApi.isDebug()) {
                String str = A0D(169, 30, 15) + System.currentTimeMillis() + A0D(149, 20, 60) + c6533akA07.A01 + A0D(53, 22, Sdk.SDKError.Reason.TPAT_ERROR_VALUE) + c6533akA07.A03 + A0D(75, 24, 83) + c6533akA07.A04 + A0D(0, 30, 124) + c6533akA07.A00 + A0D(99, 24, 75) + c6533akA07.A05 + A0D(30, 23, 22) + c6533akA07.A02 + A0D(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 26, 113) + c6533akA07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFi(boolean z) {
        this.A0E.onResume();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AIv(Bundle bundle) {
        bundle.putString(A0D(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 10, 13), this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public String getCurrentClientToken() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A0B(this.A06);
        AbstractC6553b4.A03(this.A0E);
        this.A0E.destroy();
    }

    public void setListener(InterfaceC6406Yh interfaceC6406Yh) {
    }
}
