package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7077jd extends AbstractC5718NQ implements Serializable {
    public static JSONObject A0R = null;
    public static byte[] A0S = null;
    public static String[] A0T = {"MTFiGS2hyLPfirnVlCyKu8FL5ydCU71a", "6CtUdYtPnHS0iwt", "3FBcQYGRSJhXKbj7ODsddhFyR1abGnGF", "UQ7LtGE24TX4QkAlsGDlXXS4Vcev", "JcPJu", "s3C", "M3uL5ar3Pz1QrNsTamNzt8iOeyqnSnZC", "bpoJK"};
    public static final LinkedHashMap<String, String> A0U;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C5715NN A06;
    public C5734Ng A07;
    public C5737Nj A08;
    public C5740Nm A09;
    public C5746Ns A0A;
    public String A0B;
    public String A0C;
    public boolean A0E;
    public final List<C5719NR> A0P;
    public boolean A0D = false;
    public boolean A0F = false;
    public boolean A0L = false;
    public boolean A0K = false;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0G = false;
    public boolean A0J = false;
    public final Map<String, String> A0Q = new HashMap();
    public int A05 = 5000;
    public boolean A0O = false;
    public boolean A0N = false;
    public boolean A0M = false;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0S, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0S = new byte[]{81, 84, 111, 83, 88, 95, 89, 83, 85, 67, 111, 92, 89, 94, 91, 111, 69, 66, 92, 122, 117, 68, 119, 116, 124, 116, 68, 111, 98, 107, 126, Ascii.f22494GS, Ascii.DC2, Ascii.NAK, 17, Ascii.f22494GS, 8, Ascii.f22491EM, 35, Ascii.f22502US, Ascii.f22500SO, Ascii.f22491EM, Ascii.CAN, Ascii.NAK, 8, 35, Ascii.DLE, Ascii.NAK, Ascii.DC2, Ascii.f22491EM, 53, 58, Base64.padSymbol, 57, 53, 32, 49, Ascii.f22503VT, 55, 38, 49, 48, Base64.padSymbol, 32, Ascii.f22503VT, 56, Base64.padSymbol, 58, 49, Ascii.f22503VT, 53, 33, 32, 59, Ascii.f22503VT, 55, 56, 59, 39, 49, Ascii.f22503VT, 57, Base64.padSymbol, 56, 56, Base64.padSymbol, 76, 88, 89, 66, 78, 65, 68, 78, 70, 114, 78, 66, 88, 67, 89, 73, 66, 90, 67, 114, 89, 68, SignedBytes.MAX_POWER_OF_TWO, 72, 87, 67, 66, 89, 85, 90, 95, 85, 93, 105, 85, 66, 87, 105, 66, 95, 91, 83, 47, 59, 58, 33, 45, 34, 39, 45, 37, 17, 40, 34, 47, 56, 33, 60, 59, 57, 59, 48, Base64.padSymbol, 7, 57, 43, 43, Base64.padSymbol, 44, 43, Ascii.f22499SI, Ascii.f22490CR, Ascii.f22498RS, 3, Ascii.f22491EM, Ascii.f22502US, 9, 0, 6, Ascii.f22490CR, 4, Ascii.f22492FF, Ascii.f22503VT, 58, 4, 1, Ascii.SYN, 58, 3, Ascii.ETB, 0, Ascii.DC4, Ascii.DLE, 0, Ascii.f22503VT, 6, Ascii.f22493FS, 92, 80, 82, 17, 89, 94, 92, 90, 93, 80, 80, 84, 17, 94, 91, 76, 17, 86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83, 17, 89, 86, 81, 86, 76, 87, 96, 94, 92, 75, 86, 73, 86, 75, 70, 33, 48, 39, 38, 43, 54, Ascii.f22494GS, 46, 43, 44, 39, Ascii.f22494GS, 43, 44, 36, 45, Ascii.f22494GS, 54, 39, 58, 54, 111, 120, 89, 78, 81, 98, 92, 77, 77, 98, 95, 82, 72, 83, 89, 98, 72, 79, 81, 78, 119, 115, 37, 112, 78, 118, 97, 78, 126, 103, 116, 99, 125, 112, 104, 78, 98, 116, 114, 100, 99, 116, 78, 101, 126, 122, 116, 127, 70, 76, SignedBytes.MAX_POWER_OF_TWO, 65, 83, 84, 73, 78, 91, 86, 86, 101, 72, 95, 92, 95, 72, 72, 95, 72, 75, 76, 86, 71, 80, 81, 86, 75, 86, 75, 67, 78, 6, 8, 8, Ascii.f22494GS, 50, 3, 8, Ascii.NAK, Ascii.f22491EM, 50, Ascii.f22491EM, 2, 50, 9, 8, Ascii.f22498RS, Ascii.f22491EM, 4, 3, Ascii.f22492FF, Ascii.f22491EM, 4, 2, 3, 50, 2, 3, Ascii.f22500SO, 1, 4, Ascii.f22500SO, 6, 91, 86, 89, 83, 68, 84, 86, 71, 82, 102, 107, 115, 101, 127, 126, 8, Ascii.ETB, 10, Ascii.f22492FF, 10, Ascii.f22491EM, 17, Ascii.f22492FF, 43, 60, 46, 56, 43, Base64.padSymbol, 60, Base64.padSymbol, 6, 47, 48, Base64.padSymbol, 60, 54, 58, 33, 38, 60, 37, 45, Ascii.SYN, 37, 38, 46, Ascii.SYN, 40, 39, 48, Ascii.SYN, 32, 40, 43, Ascii.SYN, 42, 37, 32, 42, 34, Ascii.SYN, 38, 39, 42, 44, 45, 54, 49, 41, 1, 63, 58, 1, Base64.padSymbol, 54, 49, 55, Base64.padSymbol, 59, 1, 40, 108, 44, 55, 48, 40, 0, 60, 45, 58, 59, 54, 43, 0, 51, 54, 49, 58, 56, 35, 36, 60, Ascii.DC4, 40, 57, 46, 47, 34, 63, Ascii.DC4, 39, 34, 37, 46, Ascii.DC4, 36, 37, Ascii.DC4, 57, 40, Ascii.DC4, 56, 62, 40, 40, 46, 56, 56, Ascii.DC4, 56, 40, 57, 46, 46, 37, 122, 97, 102, 126, 86, 106, 123, 108, 109, 96, 125, 86, 101, 96, 103, 108, 86, 127, 59, 86, 104, 103, 96, 100, 104, 125, 96, 102, 103, 44, 55, 48, 40, 0, 60, 45, 58, 59, 54, 43, 0, 51, 54, 49, 58, 0, 41, 109, 0, 44, 43, 62, 43, 54, 60, 100, 127, 120, 96, 72, 123, 120, 118, 115, 114, 101, 72, 121, 99, 115, SignedBytes.MAX_POWER_OF_TWO, 91, 92, 68, 108, 93, 86, 75, 71, 108, 80, 71, 82, 108, 92, 93, 108, 86, 93, 87, 80, 82, 65, 87, 73, 84, 73, 81, 88, Ascii.f22494GS, 6, 6, 5, Ascii.f22503VT, 8, Ascii.ESC, 54, 8, 10, Ascii.f22494GS, 54, 8, Ascii.SUB, 54, 10, Ascii.f22494GS, 8, 104, 111, 113};
    }

    static {
        A09();
        A0U = new LinkedHashMap<>(10, 0.75f, false);
    }

    public AbstractC7077jd(List<C5719NR> list) {
        this.A0P = list;
    }

    public static String A06(String str) {
        return A0U.get(str);
    }

    private HashMap<String, String> A07(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A05(251, 18, 77));
        HashMap<String, String> map = new HashMap<>();
        if (jSONObjectOptJSONObject == null) {
            return map;
        }
        Iterator<String> nameItr = jSONObjectOptJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                String next = nameItr.next();
                map.put(next, jSONObjectOptJSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    public static List<C5719NR> A08(JSONObject jSONObject, C6902gi c6902gi, InterfaceC5732Ne interfaceC5732Ne) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A05(156, 8, 28));
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            return AbstractC5727NZ.A01(jSONArrayOptJSONArray, jSONObject, c6902gi, interfaceC5732Ne);
        }
        List<AdInfo> adInfoList = new ArrayList<>();
        C5719NR c5719nrA00 = C5719NR.A00(jSONObject);
        interfaceC5732Ne.A3y(c5719nrA00, jSONObject);
        adInfoList.add(c5719nrA00);
        return adInfoList;
    }

    private void A0A(int i) {
        this.A00 = i;
    }

    private final void A0B(int i) {
        this.A04 = i;
    }

    private void A0C(C5715NN c5715nn) {
        this.A06 = c5715nn;
    }

    private final void A0D(C5734Ng c5734Ng) {
        this.A07 = c5734Ng;
    }

    private void A0E(C5737Nj c5737Nj) {
        this.A08 = c5737Nj;
    }

    private final void A0F(C5740Nm c5740Nm) {
        this.A09 = c5740Nm;
    }

    private void A0G(C5746Ns c5746Ns) {
        this.A0A = c5746Ns;
    }

    private void A0H(String str) {
        this.A0B = str;
    }

    public final int A22() {
        return this.A00;
    }

    public final int A23() {
        return this.A01;
    }

    public final int A24() {
        return this.A02;
    }

    public final int A25() {
        return this.A03;
    }

    public final int A26() {
        return this.A04;
    }

    public final int A27() {
        return this.A05;
    }

    public final C5715NN A28() {
        return this.A06;
    }

    public final C5719NR A29() {
        return this.A0P.get(0);
    }

    public final C5734Ng A2A() {
        return this.A07;
    }

    public final C5737Nj A2B() {
        return this.A08;
    }

    public final C5740Nm A2C() {
        return this.A09;
    }

    public final C5746Ns A2D() {
        return this.A0A;
    }

    public final String A2E() {
        return this.A0B;
    }

    public final String A2F(String str) {
        return this.A0Q.get(str);
    }

    public final List<C5719NR> A2G() {
        return Collections.unmodifiableList(this.A0P);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public final void A2H(InterfaceC6406Yh interfaceC6406Yh) {
        byte b;
        String strA10 = A10();
        switch (strA10.hashCode()) {
            case -1364000502:
                if (!strA10.equals(A05(384, 14, 41))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 604727084:
                if (!strA10.equals(A05(317, 12, 82))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                interfaceC6406Yh.A4j(A05(183, 45, 79));
                break;
            case 1:
                break;
            default:
                return;
        }
        interfaceC6406Yh.A4j(EnumC6795ez.A08.A03());
    }

    public final void A2I(JSONObject jSONObject) {
        String strA05;
        A0D(C5734Ng.A00(jSONObject.optJSONObject(A05(301, 16, 74))));
        A0R = jSONObject.optJSONObject(A05(144, 12, 40));
        C5739Nl c5739NlA06 = new C5739Nl().A06(jSONObject.optString(A05(591, 5, 77)));
        String strA06 = A05(297, 4, 95);
        if (jSONObject.optJSONObject(strA06) != null) {
            strA05 = jSONObject.optJSONObject(strA06).optString(A05(IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, 3, 109));
        } else {
            strA05 = A05(0, 0, 15);
        }
        A0F(c5739NlA06.A05(strA05).A04(jSONObject.optString(A05(0, 19, 64))).A07(AbstractC5741Nn.A03(jSONObject)).A08());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A05(370, 6, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        JSONObject layoutObject = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(A05(376, 8, 8)) : null;
        C5728Na c5728NaA01 = C5728Na.A01(layoutObject);
        String[] strArr = A0T;
        if (strArr[1].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0T;
        strArr2[2] = "MaJS3iOjDVpkOvzQIu4XnTvkYtI43ENf";
        strArr2[6] = "dcadpZfpRdAwhtf1LK3imqQWfZ9Fu8JJ";
        A0C(new C5715NN(c5728NaA01, C5728Na.A01(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(A05(361, 9, 71)) : null)));
        A0G(AbstractC5741Nn.A01(jSONObject));
        A0E(AbstractC5741Nn.A00(jSONObject));
        A0A(jSONObject.optInt(A05(19, 12, 107), 0));
        A0B(jSONObject.optInt(A05(164, 19, 21), -1));
        this.A0Q.putAll(A07(jSONObject));
        this.A03 = jSONObject.optInt(A05(110, 18, 70), 0);
        this.A01 = jSONObject.optInt(A05(128, 16, 62), 1);
        this.A0L = jSONObject.optBoolean(A05(596, 18, 25), false);
        this.A0K = jSONObject.optBoolean(A05(552, 15, 103), false);
        this.A0H = jSONObject.optBoolean(A05(567, 24, 67), false);
        this.A0I = jSONObject.optBoolean(A05(444, 16, 47), false);
        this.A0G = jSONObject.optBoolean(A05(31, 19, 12), false);
        this.A05 = jSONObject.optInt(A05(50, 36, 36), 5000);
        this.A0C = jSONObject.optString(A05(228, 21, 50));
        this.A0J = jSONObject.optBoolean(A05(460, 37, 59), false);
        this.A0F = jSONObject.optBoolean(A05(398, 29, 57), false);
        this.A0E = jSONObject.optBoolean(A05(329, 32, 29), false);
        this.A02 = jSONObject.optInt(A05(86, 24, 93), this.A03);
        String strOptString = jSONObject.optString(A05(249, 2, 124));
        A0H(strOptString);
        A0U.put(strOptString, jSONObject.optString(A05(269, 28, 97)));
        this.A0O = jSONObject.optBoolean(A05(IronSourceError.ERROR_CAPPED_PER_SESSION, 26, 47), false);
        this.A0N = jSONObject.optBoolean(A05(497, 29, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), false);
        this.A0M = jSONObject.optBoolean(A05(427, 17, 46), false);
        A1P(jSONObject);
    }

    public final void A2J(boolean z) {
        this.A0D = z;
    }

    public final void A2K(boolean z) {
        this.A0H = z;
    }

    public final boolean A2L() {
        return this.A0D;
    }

    public final boolean A2M() {
        return A2Q() || A2U();
    }

    public final boolean A2N() {
        return this.A0E;
    }

    public final boolean A2O() {
        return this.A0F;
    }

    public final boolean A2P() {
        return this.A0H;
    }

    public final boolean A2Q() {
        return this.A0I;
    }

    public final boolean A2R() {
        return this.A0J;
    }

    public final boolean A2S() {
        return this.A0K;
    }

    public final boolean A2T() {
        return this.A0L;
    }

    public final boolean A2U() {
        return this.A0M;
    }

    public final boolean A2V() {
        return this.A0N;
    }

    public final boolean A2W() {
        return this.A0O;
    }
}
