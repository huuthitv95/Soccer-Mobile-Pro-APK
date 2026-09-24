package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7040j0 implements InterfaceC6254WC {
    public static byte[] A0D;
    public static String[] A0E = {"mx9sJqsz4sgJcdPgoYbgRIW9VnwzqRx6", "rFbyGWP2Ub8PQhtH", "vlmOFoI5eqS6Nw0ENJhYNh6o4BRmenqE", "", "JTMxf3amnDxIP84vbXSIdB2jgXN5bQ", "LkG9NIMCA2H26FKF", "xLNm9V1ZNmyFYJ5qhdZubuzSePd6Iimu", "7SoM7bEoo8CKfR8pxc6QG8O9JCd0xBEh"};
    public static final C5698N6 A0F = null;
    public static final C6255WD A0G = null;
    public static final Handler A0H;
    public static final String A0I;
    public InterfaceC5693N1 A00;
    public InterfaceC5693N1 A01;
    public C6117Tw A04;
    public C6252WA A05;
    public C6255WD A06;
    public AbstractC5694N2 A07;
    public final C5761O7 A08;
    public final InterfaceC6192VA A09;
    public final C5698N6 A0A;
    public final C6902gi A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{-58, -23, -26, -11, -7, -22, -9, -91, -23, -12, -22, -8, -91, -13, -12, -7, -91, -22, -3, -18, -8, -7, -14, Ascii.NAK, Ascii.DC2, 33, 37, Ascii.SYN, 35, -47, Ascii.SUB, 36, -47, Ascii.f22502US, 38, Ascii.f22494GS, Ascii.f22494GS, -47, -39, Ascii.DC4, Ascii.f22491EM, Ascii.DC2, Ascii.SUB, Ascii.f22502US, -47, Ascii.f22502US, 32, 37, -47, Ascii.f22494GS, 32, Ascii.DC2, Ascii.NAK, Ascii.SYN, Ascii.NAK, -38, -56, -21, -24, -9, -5, -20, -7, -89, -16, -6, -89, -11, -4, -13, -13, -89, -81, -22, -17, -24, -16, -11, -20, -21, -80, -91, -56, -59, -44, -40, -55, -42, -124, -51, -41, -124, -46, -39, -48, -48, -124, -116, -46, -45, -124, -57, -52, -59, -51, -46, -115, 6, 41, 38, 53, 57, 42, 55, -27, 46, 56, -27, 51, 58, 49, 49, -27, 52, 51, -27, 56, 57, 38, 55, 57, 6, 41, -21, Ascii.f22492FF, -67, 10, Ascii.f22492FF, Ascii.f22499SI, 2, -67, -2, 1, -67, 0, -2, Ascii.f22503VT, 1, 6, 1, -2, 17, 2, Ascii.DLE, -53, -50, -23, -26, -27, -34, -105, -40, -37, -40, -25, -21, -36, -23, -105, -21, -16, -25, -36, -91, 63, 66, -2, 63, 74, 80, 67, 63, 66, 87, -2, 81, 82, 63, 80, 82, 67, 66, 47, 50, 65, -51, -36, -43, 62, 67, 60, 68, 73, 58, 75, 60, 77, 60, 72, 78, -50, -33, -29, -32, -13, -32, -50, -31, -23, -28, -30, -13, -97, -24, -14, -97, -19, -12, -21, -21, 19, Ascii.f22493FS, 17, 32, 39, Ascii.f22498RS, 34, 19, Ascii.DC2, Ascii.f22490CR, Ascii.ETB, Ascii.DC2, 60, 69, 77, SignedBytes.MAX_POWER_OF_TWO, 73, 70, 69, 68, 60, 69, 75, -9, SignedBytes.MAX_POWER_OF_TWO, 74, -9, 60, 68, 71, 75, 80, 51, 57, 46, SignedBytes.MAX_POWER_OF_TWO, 53, 44, 48, 60, 59, 51, 54, 52, Ascii.NAK, 33, Ascii.DC4, 32, 36, Ascii.DC4, Ascii.f22494GS, Ascii.DC2, 40, Ascii.f22500SO, Ascii.DC2, Ascii.DLE, Ascii.f22502US, Ascii.f22502US, Ascii.CAN, Ascii.f22494GS, Ascii.SYN, -3, 2, 10, -11, 0, -3, -8, -76, 4, 0, -11, -9, -7, 1, -7, 2, 8, -76, -3, 2, -76, 6, -7, 7, 4, 3, 2, 7, -7, 36, 39, Ascii.f22491EM, Ascii.f22493FS, Ascii.ETB, 44, 33, 37, Ascii.f22494GS, Ascii.ETB, 37, 43, 17, 4, Ascii.DLE, Ascii.DC4, 4, Ascii.DC2, 19, -2, 8, 3, 10, 5, -7, -10, 9, -6, -12, 9, -2, 2, -6, 8, 9, -10, 2, 5};
    }

    public abstract void A0P();

    public abstract void A0R(InterfaceC5693N1 interfaceC5693N1, C6117Tw c6117Tw, C6115Tu c6115Tu, C5762O8 c5762o8);

    static {
        A08();
        AbstractC6376YD.A02();
        A0I = AbstractC7040j0.class.getSimpleName();
        A0H = new Handler(Looper.getMainLooper());
    }

    public AbstractC7040j0(C6902gi c6902gi, C5761O7 c5761o7) {
        this.A0B = c6902gi;
        this.A08 = c5761o7;
        if (A0G != null) {
            this.A06 = A0G;
        } else {
            this.A06 = new C6255WD(this.A0B);
        }
        this.A06.A0R(this);
        if (A0F != null) {
            this.A0A = A0F;
        } else {
            this.A0A = new C5698N6();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A09 = c6902gi.A0A();
        this.A0B.A0F().A5e();
    }

    private void A09(C6117Tw c6117Tw) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(this.A0B);
        if (c6117Tw.A0C() != null) {
            sharedPreferences.edit().putString(A07(262, 12, 110), c6117Tw.A0C()).putLong(A07(342, 16, 54), System.currentTimeMillis()).apply();
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    private void A0A(C6117Tw c6117Tw) {
        this.A0B.A0F().AJS(c6117Tw.A0H());
    }

    private void A0B(C5952RG c5952rg) {
        C6117Tw placement = c5952rg.A00();
        if (placement == null || placement.A05() == null) {
            String strA07 = A07(291, 29, 53);
            C6229Vm error = new C6229Vm(AdErrorType.NO_AD_PLACEMENT, strA07);
            this.A0B.A0F().A5g(error.A03().getErrorCode(), strA07);
            if (this.A07 != null) {
                this.A07.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C6117Tw c6117Tw = this.A04;
        JSONObject jSONObjectA0E = c6117Tw.A0E();
        String strA08 = A07(195, 3, 13);
        if (jSONObjectA0E == null) {
            C6115Tu c6115TuA04 = c6117Tw.A04();
            if (!A0F(c6117Tw, c6115TuA04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A08().ABC(strA08, AbstractC6098Td.A0a, new C6099Te(A07(81, 26, 5), c6115TuA04.A02()));
                ADp(C6229Vm.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            A0R(this.A00, c6117Tw, c6115TuA04, new C5762O8(c6115TuA04.A04(), c6117Tw.A05(), this.A08.A0A, c6117Tw.A05().A0C()));
        } else {
            ArrayList arrayList = new ArrayList();
            C6115Tu c6115TuA05 = c6117Tw.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0F(c6117Tw, c6115TuA05)) {
                        arrayList.add(c6115TuA05);
                    } else {
                        return;
                    }
                } else if (A0E(c6115TuA05)) {
                    arrayList.add(c6115TuA05);
                }
                c6115TuA05 = c6117Tw.A04();
            } while (c6115TuA05 != null);
            InterfaceC5693N1 interfaceC5693N1 = this.A00;
            String[] strArr = A0E;
            if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
                throw new RuntimeException();
            }
            A0E[2] = "ioxWOihgwDfBac41kTr6w1CF9LpRHapv";
            if (interfaceC5693N1 == null) {
                this.A0B.A08().ABC(strA08, AbstractC6098Td.A0a, new C6099Te(A07(56, 25, 40), ((C6115Tu) arrayList.get(0)).A02()));
                ADp(C6229Vm.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z = false;
            try {
                if (arrayList.size() > 1 && this.A00 != null && this.A00.AKL()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((C6115Tu) it.next()).A04());
                    }
                    jSONObject.put(A07(192, 3, 111), jSONArray);
                    jSONObject.put(A07(198, 12, 124), c6117Tw.A0E());
                    A0R(this.A00, c6117Tw, c6115TuA05, new C5762O8(jSONObject, c6117Tw.A05(), this.A08.A0A, c6117Tw.A05().A0C()));
                    z = true;
                }
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                if (arrayList.isEmpty()) {
                    C6229Vm c6229VmA01 = C6229Vm.A01(AdErrorType.NO_FILL, A07(0, 0, 103));
                    this.A0B.A0F().A5g(c6229VmA01.A03().getErrorCode(), A07(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 22, 62));
                    if (this.A07 != null) {
                        this.A07.A0G(c6229VmA01);
                        return;
                    }
                    return;
                }
                if (this.A00 == null) {
                    this.A0B.A08().ABC(strA08, AbstractC6098Td.A0a, new C6099Te(A07(22, 34, 82), ((C6115Tu) arrayList.get(0)).A02()));
                    ADp(C6229Vm.A00(AdErrorType.INTERNAL_ERROR));
                    return;
                }
                C6115Tu c6115Tu = (C6115Tu) arrayList.get(0);
                A0R(this.A00, c6117Tw, c6115Tu, new C5762O8(c6115Tu.A04(), c6117Tw.A05(), this.A08.A0A, c6117Tw.A05().A0C()));
            }
        }
        A09(placement);
        A0A(placement);
    }

    private final void A0C(String str, AdExperienceType adExperienceType) {
        this.A0B.A0F().A5h(str != null);
        this.A03 = System.currentTimeMillis();
        try {
            C6236Vu bidPayload = new C6236Vu(this.A0B, str, this.A08.A0A, this.A08.A09);
            this.A05 = this.A08.A00(this.A0B, bidPayload, adExperienceType);
            if (this.A06 != null) {
                this.A06.A0Q(this.A05);
            }
        } catch (C6230Vn e) {
            ADp(C6229Vm.A02(e));
        }
    }

    private void A0D(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 79));
            C5700N8.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0E(C6115Tu c6115Tu) {
        return (c6115Tu == null || c6115Tu.A04() == null) ? false : true;
    }

    private boolean A0F(C6117Tw c6117Tw, C6115Tu c6115Tu) {
        String strA07 = A07(0, 0, 103);
        if (c6115Tu == null) {
            C6229Vm c6229VmA01 = C6229Vm.A01(AdErrorType.NO_FILL, strA07);
            this.A0B.A0F().A5g(c6229VmA01.A03().getErrorCode(), A07(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 22, 62));
            if (this.A07 != null) {
                this.A07.A0G(c6229VmA01);
            }
            return false;
        }
        String strA02 = c6115Tu.A02();
        InterfaceC5693N1 interfaceC5693N1A00 = this.A0A.A00(this.A0B, c6117Tw.A05().A0D());
        if (interfaceC5693N1A00 == null) {
            this.A0B.A08().ABC(A07(195, 3, 13), AbstractC6098Td.A0a, new C6099Te(A07(0, 22, 38), strA02));
            ADp(C6229Vm.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (!this.A08.A01().contains(interfaceC5693N1A00.A8k())) {
            C6229Vm c6229VmA02 = C6229Vm.A01(AdErrorType.INTERNAL_ERROR, strA07);
            this.A0B.A0F().A5g(c6229VmA02.A03().getErrorCode(), A07(155, 19, 24));
            if (this.A07 != null) {
                AbstractC5694N2 abstractC5694N2 = this.A07;
                if (A0E[0].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[7] = "XDVsCbJ3K5v8dlUMGtS0uKtjThdAM1fs";
                strArr[6] = "AXbWkB0jI9efrJtSTWvCCcVR8Wd1ee9G";
                abstractC5694N2.A0G(c6229VmA02);
            }
            return false;
        }
        this.A00 = interfaceC5693N1A00;
        JSONObject jSONObjectA04 = c6115Tu.A04();
        if (jSONObjectA04 != null) {
            String strOptString = jSONObjectA04.optString(A07(332, 10, 64));
            this.A0B.A0F().AJk(strOptString);
            this.A0B.A0D(strOptString);
            C6898ge c6898geA00 = AbstractC6066T7.A00();
            if (c6898geA00 != null) {
                c6898geA00.A0D(strOptString);
            }
            JSONObject dataObject = jSONObjectA04.optJSONObject(A07(274, 17, 80));
            A0D(dataObject);
            if (this.A05 == null) {
                String strA08 = A07(242, 20, 120);
                C6229Vm c6229VmA03 = C6229Vm.A01(AdErrorType.UNKNOWN_ERROR, strA08);
                this.A0B.A0F().A5g(c6229VmA03.A03().getErrorCode(), strA08);
                if (this.A07 != null) {
                    this.A07.A0G(c6229VmA03);
                }
                return false;
            }
            return true;
        }
        String strA09 = A07(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 18, 32);
        C6229Vm c6229VmA04 = C6229Vm.A01(AdErrorType.UNKNOWN_ERROR, strA09);
        this.A0B.A0F().A5g(c6229VmA04.A03().getErrorCode(), strA09);
        if (this.A07 != null) {
            this.A07.A0G(c6229VmA04);
        }
        return false;
    }

    public final long A0G() {
        if (this.A04 != null) {
            return this.A04.A03();
        }
        String[] strArr = A0E;
        if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A0E[2] = "cOTrI9DB0oxjTyLR1voyMrEgWVbVphTL";
        return -1L;
    }

    public final Handler A0H() {
        return A0H;
    }

    public AbstractC5718NQ A0I() {
        if (this.A01 != null) {
            InterfaceC5693N1 interfaceC5693N1 = this.A01;
            if (A0E[2].charAt(15) == 'D') {
                return ((AbstractC7081jh) interfaceC5693N1).A0I();
            }
            A0E[0] = "oRXWb94touLPnP0lmqQIoCQNN81QkmVq";
            return ((AbstractC7081jh) interfaceC5693N1).A0I();
        }
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "c4mFc8cvcfHQyghvzrB7bYP2aMdrhGND";
        strArr2[6] = "OOjdStzIF6ducmayoMT1WxOsFGdjLtMG";
        return null;
    }

    public final C6118Tx A0J() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A05();
    }

    public final void A0K() {
        if (!C6171Up.A1v(this.A0B)) {
            return;
        }
        InterfaceC5693N1 interfaceC5693N1 = this.A01;
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "";
        strArr2[4] = "YS2d1pFjROLoYd3yH38ADYRoaACmCS";
        if (interfaceC5693N1 != null) {
            C6288Wl.A00(this.A0B).A0D(this.A01.A8k().toString(), this.A01.A7O());
        }
        if (this.A06 != null) {
            this.A06.A0R(null);
            this.A06 = null;
        }
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0L() {
        String strA7O;
        this.A0B.A0F().A3R(C6364Y1.A01(this.A03));
        if (this.A01 == null || (strA7O = this.A01.A7O()) == null) {
            return;
        }
        HashMap map = new HashMap();
        String strA05 = C6364Y1.A05(this.A03);
        String clientToken = A07(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 12, 89);
        map.put(clientToken, strA05);
        new C6200VI(strA7O, this.A09).A04(EnumC6199VH.A08, map);
    }

    public final void A0M() {
        InterfaceC5693N1 interfaceC5693N1 = this.A01;
        String strA07 = A07(195, 3, 13);
        if (interfaceC5693N1 == null) {
            String strA08 = A07(107, 26, 102);
            this.A0B.A08().ABC(strA07, AbstractC6098Td.A0Q, new C6099Te(strA08));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0F().A5g(adErrorType.getErrorCode(), strA08);
            if (this.A07 != null) {
                AbstractC5694N2 abstractC5694N2 = this.A07;
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC5694N2.A0G(C6229Vm.A01(adErrorType, errorMessage));
            }
            this.A0B.A0F().A5j();
            return;
        }
        if (this.A0C) {
            String strA09 = A07(174, 18, 127);
            this.A0B.A08().ABC(strA07, AbstractC6098Td.A0M, new C6099Te(strA09));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0F().A5g(adErrorType2.getErrorCode(), strA09);
            if (this.A07 != null) {
                AbstractC5694N2 abstractC5694N3 = this.A07;
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC5694N3.A0G(C6229Vm.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0F().A5i();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A7O())) {
            this.A09.AC0(this.A01.A7O());
        }
        this.A0B.A0F().A5k();
        this.A0C = true;
        A0P();
    }

    public final void A0N() {
        A0Y(false);
    }

    public final void A0O() {
        if (this.A02 != null) {
            C5700N8.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0Q(InterfaceC5693N1 interfaceC5693N1) {
        if (interfaceC5693N1 != null) {
            interfaceC5693N1.onDestroy();
        }
    }

    public final void A0S(AbstractC5694N2 abstractC5694N2) {
        this.A07 = abstractC5694N2;
    }

    public final void A0T(C5762O8 c5762o8) {
        A0V(c5762o8.A03().optString(A07(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 2, 12)));
    }

    public void A0U(String str) {
        A0C(str, null);
    }

    public final void A0V(String str) {
        this.A0B.A0F().A5d();
        if (!TextUtils.isEmpty(str)) {
            new C6200VI(str, this.A09).A04(EnumC6199VH.A04, null);
        }
    }

    public final void A0W(String str) {
        A0U(str);
    }

    public final void A0X(String str, AdExperienceType adExperienceType) {
        A0C(str, adExperienceType);
    }

    public void A0Y(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0F().A5l();
        A0Q(this.A01);
        this.A0C = false;
    }

    public final boolean A0Z() {
        return this.A04 == null || this.A04.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6254WC
    public final synchronized void ADp(C6229Vm c6229Vm) {
        A0H().post(new C7041j1(this, c6229Vm));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6254WC
    public final synchronized void AG7(C5952RG c5952rg) {
        try {
            A0B(c5952rg);
        } catch (Exception e) {
            this.A0B.A08().ABC(A07(195, 3, 13), AbstractC6098Td.A0T, new C6099Te(e));
        }
    }
}
