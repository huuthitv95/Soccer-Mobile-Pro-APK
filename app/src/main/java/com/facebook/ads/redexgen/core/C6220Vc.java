package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.NativeAdRatingApi;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6220Vc implements NativeAdRatingApi {
    public static byte[] A02;
    public static String[] A03 = {"hUjcMotf6J7QgolLzfJFqEdJCj8", "g61DfN6A", "xfoiRdjW7FqaK", "7BIjRnWTmZFI6", "QawwIwJGbW4wV95frp", "JAocLFgZR1eZV5wbskPWRgC49zmLSQ48", "dTzZFi0gHRoFN0fz4IZK", "PRpOn4dc8EeXJ60LxB5o"};
    public final double A00;
    public final double A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {Ascii.DC4, 4, 2, Ascii.f22490CR, 6, -68, -89, -78, -69, -85};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        A03[2] = "JTw9XW";
        A02 = bArr;
    }

    static {
        A02();
    }

    public C6220Vc(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }

    public static C6220Vc A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble(A01(5, 5, 17), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        double dOptDouble2 = jSONObject.optDouble(A01(0, 5, 108), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        if (dOptDouble == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dOptDouble2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return null;
        }
        return new C6220Vc(dOptDouble, dOptDouble2);
    }

    @Override // com.facebook.ads.internal.api.NativeAdRatingApi
    public final double getScale() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.NativeAdRatingApi
    public final double getValue() {
        return this.A01;
    }
}
