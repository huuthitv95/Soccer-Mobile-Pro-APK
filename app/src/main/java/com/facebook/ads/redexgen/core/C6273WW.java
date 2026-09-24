package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.WW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6273WW implements InterfaceC6192VA {
    public static InterfaceC6192VA A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C6898ge A00;
    public final InterfaceC6147UR A01;
    public final InterfaceC6191V9 A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{50, 119, 100, 119, 124, 102, 60, 54, 3, 3, Ascii.DC2, Ascii.SUB, 7, 3, Ascii.f22498RS, Ascii.f22491EM, Ascii.DLE, 87, 3, Ascii.CAN, 87, Ascii.ESC, Ascii.CAN, Ascii.DLE, 87, Ascii.SYN, Ascii.f22491EM, 87, Ascii.f22498RS, Ascii.f22491EM, 1, Ascii.SYN, Ascii.ESC, Ascii.f22498RS, 19, 87, 66, 100, 119, 117, 115, 87, 85, 94, 85, 66, 89, 83, Ascii.f22494GS, Ascii.DLE, Ascii.f22491EM, Ascii.f22492FF};
    }

    static {
        A03();
        A05 = C6273WW.class.getSimpleName();
        A06 = false;
    }

    public C6273WW(C6898ge c6898ge) {
        InterfaceC6190V8 dispatchCallback;
        this.A00 = c6898ge;
        if (AbstractC6173Ur.A0T(c6898ge)) {
            this.A01 = AbstractC6145UP.A00(c6898ge);
            dispatchCallback = AbstractC6197VF.A00(c6898ge, this.A01);
        } else {
            C472471 c472471A01 = AbstractC6145UP.A01(c6898ge);
            dispatchCallback = AbstractC6197VF.A01(c6898ge, c472471A01);
            this.A01 = c472471A01;
        }
        this.A02 = new C6289Wm(c6898ge, dispatchCallback);
        ExecutorC6379YG.A08.execute(new C6275WY(this));
        A04(c6898ge);
    }

    public static synchronized InterfaceC6192VA A01(C6898ge c6898ge) {
        if (A03 == null) {
            A03 = new C6273WW(c6898ge);
        }
        return A03;
    }

    public static synchronized void A04(C6898ge c6898ge) {
        if (A06) {
            return;
        }
        c6898ge.A04().ACn();
        A06 = true;
    }

    private void A05(C6189V7 c6189v7) {
        if (!c6189v7.A0A()) {
            Log.e(A05, A02(7, 29, 55) + c6189v7.A06() + A02(0, 7, 82));
        } else {
            A06(c6189v7);
            this.A01.AL6(c6189v7, new C6274WX(this, c6189v7));
        }
    }

    private void A06(C6189V7 c6189v7) {
        switch (C6193VB.A00[c6189v7.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C6099Te c6099Te = new C6099Te(new Exception(A02(36, 5, 86)));
                c6099Te.A05(1);
                try {
                    c6099Te.A07(new JSONObject().put(A02(48, 4, 41), c6189v7.A06().toString()));
                    break;
                } catch (JSONException unused) {
                }
                this.A00.A08().ABD(A02(41, 7, 112), AbstractC6098Td.A1H, c6099Te);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void AB3(String str, Map<String, String> data) {
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A04).A02(EnumC6195VD.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void AB5(String str, Map<String, String> data) {
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A04).A02(EnumC6195VD.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void AB6(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A04).A02(EnumC6195VD.A07).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void AB7(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A04).A02(EnumC6195VD.A08).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABB(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A04).A02(EnumC6195VD.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABF(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A04).A02(EnumC6195VD.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABJ(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0D).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABK(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABL(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0F).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABM(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0K).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABn(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0H).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABp(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A04).A02(EnumC6195VD.A0J).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABq(String str, Map<String, String> data, String str2, EnumC6194VC enumC6194VC) {
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(enumC6194VC).A02(EnumC6195VD.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABr(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C6189V7 adEvent = new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A04).A02(EnumC6195VD.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABx(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0N).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ABy(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0O).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void AC0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A01(EnumC6194VC.A04).A02(EnumC6195VD.A0P).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0k)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void AC3(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A04).A02(EnumC6195VD.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void AC8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0Q).A06(AbstractC6202VK.A0A(str, EnumC6199VH.A0o)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void AC9(String str, Map<String, String> data) {
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void ACB(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C6188V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC6194VC.A05).A02(EnumC6195VD.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6192VA
    public final void AGz(String str) {
        new AsyncTaskC6873gF(this.A00).execute(str);
    }
}
