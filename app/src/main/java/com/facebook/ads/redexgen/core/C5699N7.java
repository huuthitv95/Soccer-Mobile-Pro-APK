package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.N7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5699N7 {
    public static byte[] A03;
    public static String[] A04 = {"yonrCQ0uoeCYCSmT5ejKLJLtf9VOp321", "NDuBqnzzJqzb1WeHMragxAHoyIt26Von", "hWL4zdMk8yywijkAtqHNVn2pZmfj34f9", "9i7qyia1evnFwuCuocWilq3mxIKRQ8Gt", "sdkV7vC", "3a", "fP", "wcot"};
    public final LinkedHashSet<String> A01 = new LinkedHashSet<>();
    public JSONObject A00 = new JSONObject();
    public final AtomicReference<String> A02 = new AtomicReference<>(A01(0, 2, 32));

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-67, -65, -63, -65, -50, -3, 6, -5, 10, 17, 8, Ascii.f22492FF, -3, -4, -9, -7, -4, -9, 1, -4, -9, 7, 10, 1, -1, 1, 6, -7, 4, -19, -10, -21, -6, 1, -8, -4, -19, -20, -25, -15, -20, Ascii.f22491EM, Ascii.f22490CR, 36, Ascii.f22503VT, Ascii.f22499SI, Ascii.f22490CR, Ascii.f22493FS, Ascii.f22493FS, 17, Ascii.DLE, Ascii.f22503VT, Ascii.f22490CR, Ascii.f22498RS, Ascii.f22498RS, Ascii.f22490CR, 37, Ascii.f22503VT, Ascii.CAN, 17, Ascii.SUB, 19, 32, Ascii.DC4, 47, 35, 35, 53, 50, 50, 37, 46, 35, 37, 51, -1, -12, 1, -8, -2, -13, 37, Ascii.f22493FS, 34, 33, Ascii.f22492FF, Ascii.f22493FS, Ascii.DLE, Ascii.DLE, 34, Ascii.f22502US, Ascii.f22502US, Ascii.DC2, Ascii.ESC, Ascii.DLE, Ascii.DC2, Ascii.f22492FF, 32, Ascii.DC2, Ascii.DLE, 32, Ascii.f22498RS, Ascii.NAK, Ascii.ESC, Ascii.SUB, 5, Ascii.SYN, Ascii.f22503VT, Ascii.CAN, Ascii.f22499SI, Ascii.NAK, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0A(@Nullable String str) throws JSONException, C6099Te {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new JSONObject(str);
                HashMap map = new HashMap();
                Iterator<String> itKeys = this.A00.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (this.A00.get(next) instanceof String) {
                        map.put(next, A00(next, new JSONObject((String) this.A00.get(next))));
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    this.A00.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    static {
        A02();
    }

    private final synchronized C5733Nf A00(String str, JSONObject jSONObject) throws JSONException, C6099Te {
        C5733Nf frequencyCappingData;
        if (str.equals(jSONObject.optString(A01(29, 12, 70), null))) {
            frequencyCappingData = new C5733Nf(str);
            A03(frequencyCappingData, jSONObject);
        } else {
            C6099Te c6099Te = new C6099Te(new IllegalArgumentException());
            jSONObject.put(A01(5, 24, 86), str);
            c6099Te.A07(jSONObject);
            c6099Te.A05(1);
            throw c6099Te;
        }
        return frequencyCappingData;
    }

    private void A03(C5733Nf c5733Nf, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt(A01(75, 6, 77));
        int iOptInt2 = jSONObject.optInt(A01(101, 11, 100));
        int maxCappedArrayLength = jSONObject.optInt(A01(41, 23, 106), 50);
        long jOptLong = jSONObject.optLong(A01(2, 3, 28));
        String strA01 = A01(64, 11, 126);
        if (jSONObject.has(strA01)) {
            c5733Nf.A06((JSONArray) jSONObject.get(strA01));
        }
        String strA02 = A01(81, 20, 107);
        if (jSONObject.has(strA02)) {
            int cappingTimeSecs = jSONObject.optInt(strA02);
            c5733Nf.A04(cappingTimeSecs);
        }
        c5733Nf.A05(iOptInt, iOptInt2, jOptLong, maxCappedArrayLength);
    }

    public final String A04() {
        String list = this.A02.get();
        if (list != null) {
            return list;
        }
        if (A04[0].charAt(21) != 'J') {
            throw new RuntimeException();
        }
        A04[7] = "Yd8WV87KlA8AS9IbyfadEkj";
        return A01(0, 2, 32);
    }

    public final synchronized JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.A01.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.A02.set(jSONArray.toString());
    }

    public final synchronized void A07(String str) {
        if (this.A01.size() >= C5733Nf.A00()) {
            Iterator<String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        C6047So.A03();
    }

    public final synchronized void A08(@Nullable String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length() && i < C5733Nf.A00(); i++) {
                    this.A01.add(jSONArray.getString(i));
                }
            }
        }
    }

    public final synchronized void A09(String str) {
        this.A01.remove(str);
        C6047So.A03();
    }

    public final synchronized void A0B(JSONObject jSONObject) throws JSONException {
        C5733Nf frequencyCappingData;
        String strOptString = jSONObject.optString(A01(29, 12, 70), null);
        if (strOptString == null) {
            return;
        }
        if (this.A00.has(strOptString) && (this.A00.get(strOptString) instanceof C5733Nf)) {
            frequencyCappingData = (C5733Nf) this.A00.get(strOptString);
        } else {
            frequencyCappingData = new C5733Nf(strOptString);
        }
        A03(frequencyCappingData, jSONObject);
        this.A00.put(strOptString, frequencyCappingData);
    }
}
