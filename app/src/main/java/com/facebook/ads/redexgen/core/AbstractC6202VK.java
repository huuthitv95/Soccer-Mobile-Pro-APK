package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.VK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6202VK {
    public static byte[] A00;
    public static String[] A01 = {"U6KVOTsvyFGORVsRScrnzIfC22jYBwjX", "ILJfzAM", "mSXQ0Ybvz22qP9FTERotykvccOsLfkLX", "hexg7lZyOyIoqc3cfx0LJrY0JzPheGn9", "QO0W7SjBIJExYoWj8d5V4ATeE22xBdxq", "XgtJCrs", "K8cPCeEyVHoG5OOYDkeX6MTEK7uusLdi", "HRkIYlhxQwIghQfQLwcjnPshoo50TCUq"};
    public static final Map<String, String> A02;
    public static final Map<String, List<String>> A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].charAt(20) != 'n') {
                throw new RuntimeException();
            }
            A01[7] = "VCgIGVaZR6LUurcUp8PRnu67FREgo2FS";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i5 = (bArrCopyOfRange[i4] - i3) - 84;
            String[] strArr = A01;
            if (strArr[6].charAt(18) != strArr[4].charAt(18)) {
                String[] strArr2 = A01;
                strArr2[6] = "QUKDQrMYYXqh8JHMTaWZV6Ed8Qh6Q2ZU";
                strArr2[4] = "Ahd0Yp7BAsSR93JTUpDMLzcJNLS2OMnc";
                bArrCopyOfRange[i4] = (byte) i5;
                i4++;
            } else {
                bArrCopyOfRange[i4] = (byte) i5;
                i4++;
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{33, 50, -25, -28, -9, -28, Ascii.DC4, 35, Ascii.f22493FS, Ascii.f22493FS, 19, Ascii.SUB, 7, 10, -4, -1, -6, Ascii.f22499SI, 4, 8, 0, -6, 8, Ascii.f22500SO, 9, -4, 8, Ascii.f22492FF, -4, 10, Ascii.f22503VT, -10, Ascii.f22503VT, 0, 4, -4, -10, 4, 10, Ascii.NAK, Ascii.CAN, -1, 6, Ascii.NAK, Ascii.f22500SO, Ascii.f22500SO, 5, Ascii.f22492FF, -1, Ascii.f22492FF, Ascii.f22499SI, 7, 7, 9, Ascii.f22500SO, 7};
    }

    static {
        A03();
        A03 = new HashMap();
        A02 = new HashMap();
    }

    public static String A01(String str) {
        return A02.get(str);
    }

    public static List<String> A02(C6902gi c6902gi, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int eventIndex = 0; eventIndex < jSONArray.length(); eventIndex++) {
            try {
                arrayList.add(jSONArray.getString(eventIndex));
            } catch (JSONException e) {
                c6902gi.A08().ABC(A00(39, 17, 76), AbstractC6098Td.A1C, new C6099Te(e));
            }
        }
        return arrayList;
    }

    public static void A04(View view, C6200VI c6200vi, EnumC6199VH enumC6199VH) {
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC6201VJ(c6200vi, enumC6199VH));
    }

    public static void A05(C6902gi c6902gi, String str, long j) {
        InterfaceC6192VA adEventManager = c6902gi.A0A();
        C6200VI c6200vi = new C6200VI(str, adEventManager);
        HashMap map = new HashMap();
        map.put(A00(24, 15, 67), C6364Y1.A07(j));
        map.put(A00(12, 12, 71), C6364Y1.A05(j));
        c6200vi.A04(EnumC6199VH.A0D, map);
    }

    public static void A06(C6902gi c6902gi, JSONObject jSONObject, long j, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A00(2, 4, 47));
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(6, 6, 90));
        if (TextUtils.isEmpty(str) && jSONArrayOptJSONArray != null) {
            A07(c6902gi, jSONObjectOptJSONObject, A02(c6902gi, jSONArrayOptJSONArray), j, null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, List<String>> map = A03;
        if (A01[7].charAt(20) != 'n') {
            throw new RuntimeException();
        }
        A01[2] = "eRhlxr4ZIl29VB3yVqBFuzgoGteA2pMR";
        if (!map.containsKey(str)) {
            return;
        }
        A07(c6902gi, jSONObjectOptJSONObject, A03.get(str), j, str);
    }

    public static void A07(C6902gi c6902gi, JSONObject jSONObject, List<String> list, long j, String str) {
        String strA00 = A00(0, 2, 106);
        if (jSONObject.has(strA00)) {
            String clientToken = jSONObject.optString(strA00);
            A08(clientToken, str);
            A09(clientToken, list);
            A05(c6902gi, clientToken, j);
        }
    }

    public static void A08(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A02.put(str, str2);
    }

    public static void A09(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        if (A01[7].charAt(20) != 'n') {
            throw new RuntimeException();
        }
        A01[2] = "Iv9PzV9ggO2VP5nzFrt9V6UHZMtP3qc2";
        if (zIsEmpty) {
            return;
        }
        A03.put(str, list);
    }

    public static boolean A0A(String str, EnumC6199VH enumC6199VH) {
        return A0B(str, enumC6199VH.A03());
    }

    public static boolean A0B(String str, String str2) {
        return A03.containsKey(str) && A03.get(str).contains(str2);
    }
}
