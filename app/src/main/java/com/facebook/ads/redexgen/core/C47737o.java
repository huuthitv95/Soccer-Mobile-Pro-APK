package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7o */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47737o extends AbstractC7077jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{63, 60, 51, 51, 56, 47};
    }

    public C47737o(List<C5719NR> list) {
        super(list);
    }

    public static C47737o A00(JSONObject jSONObject, C6902gi c6902gi) {
        C47737o c47737o = new C47737o(AbstractC7077jd.A08(jSONObject, c6902gi, new C7075jb()));
        c47737o.A2I(jSONObject);
        c47737o.A1N(A01(0, 6, 6));
        return c47737o;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5718NQ
    public final int A0o() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5718NQ
    public final int A0p() {
        return 0;
    }
}
