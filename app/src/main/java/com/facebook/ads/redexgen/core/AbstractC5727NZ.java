package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5727NZ {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.CAN, Ascii.SUB, 9, Ascii.DC4, Ascii.f22500SO, 8, Ascii.f22498RS, Ascii.ETB, 100, 117, 102, 103, 125, 122, 115, 85, 74, 71, 70, 76, 124, 86, 81, 79};
    }

    public static List<C5719NR> A01(JSONArray jSONArray, JSONObject jSONObject, C6902gi c6902gi, InterfaceC5732Ne interfaceC5732Ne) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (i == 0) {
                    A03(jSONObject2, jSONObject);
                }
                C5719NR c5719nrA00 = C5719NR.A00(jSONObject2);
                interfaceC5732Ne.A3y(c5719nrA00, jSONObject2);
                arrayList.add(c5719nrA00);
            } catch (JSONException e) {
                c6902gi.A08().ABC(A00(8, 7, 90), AbstractC6098Td.A2B, new C6099Te(e));
            }
        }
        return arrayList;
    }

    public static void A03(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!next.equals(A00(15, 9, 109)) && !next.equals(A00(0, 8, 53)) && !jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }
}
