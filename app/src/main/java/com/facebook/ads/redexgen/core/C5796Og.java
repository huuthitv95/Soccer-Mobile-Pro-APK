package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Og */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5796Og {
    public static byte[] A01;
    public static String[] A02 = {"pVDJwwImNDAzAU7MVHYB7KJyYkXB8ng6", "xCCCN", "WmAvu667o4AOfXv58a4lhsk2v5Ms6Skb", "l5AJTkPNjTtBLXifXwK6kFeEJ0fMsOcr", "3rlSEGUZnv4yJ13AM8B6pi", "FEUqx4", "USh9ikhtS0UWG5H8nhVral6z3PYi0bQO", "dZN"};
    public static final String[] A03;
    public final InterfaceC5802Om A00;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{106, 7, 43, 56, 33, 106, 43, 46, 106, 43, 57, 106, 37, 44, 44, 47, 36, 57, 35, 60, 47, 106, 37, 56, 106, 35, 36, 43, 58, 58, 56, 37, 58, 56, 35, 43, 62, 47, 104, 77, 9, 65, SignedBytes.MAX_POWER_OF_TWO, 77, 77, 76, 71, 7, 106, 79, Ascii.f22503VT, 89, 78, 91, 68, 89, 95, 78, 79, 5, Ascii.DC2, 63, 54, 42, 122, 47, 41, 122, 47, 52, 62, 63, 40, 41, 46, 59, 52, 62, 122, 45, 50, 59, 46, 122, 51, 41, 122, 50, 59, 42, 42, 63, 52, 51, 52, Base64.padSymbol, 116, 122, Ascii.f22490CR, 50, 35, 122, 62, 53, 52, 125, 46, 122, 35, 53, 47, 122, 45, 59, 52, 46, 122, 46, 53, 122, 41, 63, 63, 122, 46, 50, 51, 41, 101, 39, 10, 3, Ascii.f22502US, 79, Ascii.SUB, Ascii.f22493FS, 79, Ascii.SUB, 1, Ascii.f22503VT, 10, Ascii.f22494GS, Ascii.f22493FS, Ascii.ESC, Ascii.f22500SO, 1, Ascii.f22503VT, 79, Ascii.CAN, 7, Ascii.f22500SO, Ascii.ESC, 79, 6, Ascii.f22493FS, 79, 7, Ascii.f22500SO, Ascii.f22502US, Ascii.f22502US, 10, 1, 6, 1, 8, 65, 79, 56, 7, Ascii.SYN, 79, 6, Ascii.f22493FS, 79, Ascii.ESC, 7, 6, Ascii.f22493FS, 79, 6, 1, Ascii.f22500SO, Ascii.f22502US, Ascii.f22502US, Ascii.f22494GS, 0, Ascii.f22502US, Ascii.f22494GS, 6, Ascii.f22500SO, Ascii.ESC, 10, 80, 77, 108, 97, 96, 37, 68, 97, 118, 90, 85, 90, 92, 94, Ascii.ESC, 90, 95, Ascii.ESC, 75, 73, 94, 93, 94, 73, 94, 85, 88, 94, 72, 89, 120, 55, 127, 126, 115, 114, 55, 118, 115, 55, 120, 103, 99, 126, 120, 121, 100, Ascii.f22502US, 62, 113, 35, 52, 33, 62, 35, 37, 113, 48, 53, 113, 62, 33, 37, 56, 62, 63, 34, 77, 122, 111, 112, 109, 107, 63, 94, 123, 73, 127, 127, 58, 124, 127, 109, 127, 104, 58, 123, 126, 105, 58, 118, 115, 113, 127, 58, 110, 114, 115, 105, 110, 81, SignedBytes.MAX_POWER_OF_TWO, Ascii.f22491EM, 88, 84, Ascii.f22491EM, 112, Ascii.f22491EM, 74, 92, 92, 80, 87, 94, Ascii.f22491EM, 77, 81, 80, 74, Ascii.f22491EM, 88, 93, 6, 60, 10, Ascii.DLE, Ascii.ETB, 69, Ascii.SYN, Ascii.DLE, 7, 8, Ascii.f22492FF, Ascii.SYN, Ascii.SYN, Ascii.f22492FF, 10, Ascii.f22503VT, 69, Ascii.f22492FF, Ascii.SYN, 69, Ascii.f22503VT, 10, Ascii.DC2, 69, 7, 0, Ascii.f22492FF, Ascii.f22503VT, 2, 69, Ascii.ETB, 0, 19, Ascii.f22492FF, 0, Ascii.DC2, 0, 1, 75, 76, 74, 125, 120, 67, 127, 116, 115, 117, 127, 121, 111, 67, 105, 110, 117, 102, 109, 108, 105, 97, 119, 96, 107, 90, 109, 96, 100, 97, 108, 107, 98, 38, 45, 44, 41, 33, 55, 32, 43, Ascii.SUB, 42, 53, 49, 44, 42, 43, 54, 117, 122, 125, 122, 96, 123, 118, 119, 76, 119, 118, 96, 112, 97, 122, 99, 103, 122, 124, 125, 74, 69, 66, 69, 95, 68, 73, 72, 115, 68, 69, 72, 73, 115, 77, 72, 90, 85, 82, 85, 79, 84, 89, 88, 99, 78, 89, 76, 83, 78, 72, 99, 93, 88, 59, 58, 55, 54, Ascii.f22492FF, 50, 55, 49, 48, Base64.padSymbol, 60, 6, 56, Base64.padSymbol, 6, Base64.padSymbol, 60, 42, 58, 43, 48, 41, 45, 48, 54, 55, Base64.padSymbol, 60, 49, 48, 10, 52, 49, 10, 51, 58, 57, 57, 58, 34, 10, 32, 37, 10, Base64.padSymbol, 48, 52, 49, 60, 59, 50, 90, 91, 86, 87, 109, 83, 86, 109, 93, 66, 70, 91, 93, 92, 65, 89, 84, 70, 65, 106, SignedBytes.MAX_POWER_OF_TWO, 69, 81, 84, 65, 80, 81, 106, 65, 92, 88, 80, 70, 65, 84, 88, 69, 40, 36, 43, 36, 34, 32, Ascii.SUB, 36, 33, Ascii.SUB, 53, 55, 32, 35, 32, 55, 32, 43, 38, 32, 54, 85, 89, 86, 89, 95, 93, 103, 89, 92, 103, 72, 74, 93, 94, 93, 74, 93, 86, 91, 93, 75, 103, 77, 74, 81, 117, 110, 119, 119, 98, 125, 121, 100, 98, 99, 82, 121, 104, 117, 121, 33, 62, 58, 39, 33, 32, 17, 56, 47, 34, 59, 43, 8, Ascii.f22502US, 10, Ascii.NAK, 8, Ascii.f22500SO, 37, Ascii.ESC, Ascii.f22498RS, 39, 48, 37, 58, 39, 33, 10, 52, 49, 10, 49, 48, 38, 54, 39, 60, 37, 33, 60, 58, 59, Ascii.f22490CR, Ascii.SUB, Ascii.f22499SI, Ascii.DLE, Ascii.f22490CR, Ascii.f22503VT, 32, Ascii.f22498RS, Ascii.ESC, 32, Ascii.f22491EM, Ascii.DLE, 19, 19, Ascii.DLE, 8, 32, 10, Ascii.f22499SI, 32, Ascii.ETB, Ascii.SUB, Ascii.f22498RS, Ascii.ESC, Ascii.SYN, 17, Ascii.CAN, 66, 85, SignedBytes.MAX_POWER_OF_TWO, 95, 66, 68, 111, 81, 84, 111, 95, SignedBytes.MAX_POWER_OF_TWO, 68, 89, 95, 94, 67, 91, 76, 89, 70, 91, 93, SignedBytes.MAX_POWER_OF_TWO, 71, 78, Ascii.DLE, Ascii.f22499SI, Ascii.f22498RS, 56, 6, 10, 56, Ascii.f22500SO, 56, Ascii.DC4, 2, 2, Ascii.f22500SO, 9, 0, 56, 19, Ascii.f22499SI, Ascii.f22500SO, Ascii.DC4};
    }

    static {
        A06();
        A03 = new String[]{A02(455, 7, 105), A02(462, 19, 99), A02(481, 25, 111), A02(506, 15, 8), A02(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 9, 64), A02(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 21, 111), A02(646, 27, 69), A02(673, 17, 10), A02(543, 21, 127), A02(421, 16, 22), A02(437, 18, 6), A02(401, 20, 41), A02(699, 20, 93), A02(355, 14, 38), A02(564, 25, 2)};
    }

    public C5796Og(InterfaceC5802Om interfaceC5802Om) {
        this.A00 = interfaceC5802Om;
    }

    private String A00() {
        return A03(A02(481, 25, 111), A02(60, 69, 96));
    }

    private String A01() {
        return A03(A02(646, 27, 69), A02(129, 64, 85));
    }

    private String A03(String str, String str2) {
        String strA9E = this.A00.A9E(str, str2);
        if (strA9E == null) {
            return str2;
        }
        String value = A02(589, 4, 33);
        return strA9E.equals(value) ? str2 : strA9E;
    }

    public static List<C5800Ok> A04(String str) throws JSONException {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(A02(589, 4, 33))) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            C5800Ok c5800Ok = new C5800Ok(jSONObject.getInt(A02(604, 12, 116)), jSONObject.getString(A02(593, 11, 55)), jSONObject.optString(A02(369, 16, 63)));
            Iterator<C5800Ok> it = A04(jSONObject.optString(A02(385, 16, 127))).iterator();
            while (it.hasNext()) {
                c5800Ok.A06(it.next());
            }
            arrayList.add(c5800Ok);
        }
        return arrayList;
    }

    public static Map<String, String> A05(String str) {
        if (str != null && !str.isEmpty()) {
            if (A02[0].charAt(31) == '2') {
                throw new RuntimeException();
            }
            A02[0] = "A8tiJT5v19tpxSVqHJBkbDhH2RRDdRkC";
            if (!str.equals(A02(353, 2, 45))) {
                HashMap map = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    for (String str2 : A03) {
                        if (!jSONObject.has(str2)) {
                            return null;
                        }
                        map.put(str2, jSONObject.getString(str2));
                    }
                    if (A04(jSONObject.getString(A02(673, 17, 10))).size() == 0) {
                        A08(AbstractC6098Td.A28, new C6099Te(A02(239, 20, 107)));
                        return null;
                    }
                    if (A04(jSONObject.getString(A02(506, 15, 8))).size() == 0) {
                        A08(AbstractC6098Td.A25, new C6099Te(A02(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 18, 45)));
                        return null;
                    }
                    return map;
                } catch (JSONException e) {
                    A08(AbstractC6098Td.A27, new C6099Te(e));
                    return null;
                }
            }
        }
        return null;
    }

    private final void A07() {
        C6991iC c6991iCA6I = this.A00.A6I();
        c6991iCA6I.A00(A02(521, 22, 15), 0L);
        c6991iCA6I.A02();
    }

    public static void A08(int i, C6099Te c6099Te) {
        C6898ge sdkContext = AbstractC6066T7.A00();
        if (sdkContext != null) {
            sdkContext.A08().ABC(A02(690, 9, 19), i, c6099Te);
        }
    }

    public final long A09() {
        return this.A00.A8Q(A02(521, 22, 15), 0L);
    }

    public final C5800Ok A0A() {
        C5800Ok c5800Ok = new C5800Ok(A00());
        try {
            for (C5800Ok hideAdParent : A04(A03(A02(506, 15, 8), A02(0, 0, 48)))) {
                c5800Ok.A06(hideAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(AbstractC6098Td.A26, new C6099Te(e));
        }
        return c5800Ok;
    }

    public final C5800Ok A0B() {
        C5800Ok c5800Ok = new C5800Ok(A01());
        try {
            for (C5800Ok reportAdParent : A04(A03(A02(673, 17, 10), A02(0, 0, 48)))) {
                c5800Ok.A06(reportAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(AbstractC6098Td.A29, new C6099Te(e));
        }
        return c5800Ok;
    }

    public final String A0C() {
        return A03(A02(355, 14, 38), A02(0, 0, 48));
    }

    public final String A0D() {
        return A03(A02(401, 20, 41), A02(315, 38, 95));
    }

    public final String A0E() {
        return A03(A02(421, 16, 22), A02(38, 10, 19));
    }

    public final String A0F() {
        return A03(A02(437, 18, 6), A02(48, 12, 17));
    }

    public final String A0G() {
        return A03(A02(462, 19, 99), A02(268, 23, 32));
    }

    public final String A0H() {
        return A03(A02(455, 7, 105), A02(193, 7, 63));
    }

    public final String A0I() {
        return A03(A02(564, 25, 2), A02(0, 0, 48));
    }

    public final String A0J() {
        return A03(A02(543, 21, 127), A02(200, 21, 1));
    }

    public final String A0K() {
        return A03(A02(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 21, 111), A02(0, 38, 112));
    }

    public final String A0L() {
        return A03(A02(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 9, 64), A02(259, 9, 37));
    }

    public final String A0M() {
        return A03(A02(699, 20, 93), A02(291, 24, 3));
    }

    public final void A0N(String str) {
        Map<String, String> mapA05 = A05(str);
        if (mapA05 == null || mapA05.size() != A03.length) {
            return;
        }
        C6991iC c6991iCA6I = this.A00.A6I();
        for (String str2 : A03) {
            c6991iCA6I.A01(str2, mapA05.get(str2));
        }
        if (A02[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "MCE7RaiUtGHbfQd9DpKX6Z";
        strArr[5] = "LB7njF";
        c6991iCA6I.A00(A02(521, 22, 15), System.currentTimeMillis());
        c6991iCA6I.A02();
    }

    public final boolean A0O(Context context, boolean z) {
        return (z || C6171Up.A2h(context)) && ((A09() > 0L ? 1 : (A09() == 0L ? 0 : -1)) > 0);
    }
}
