package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.PlaybackException;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;
import kotlin.p300io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5710NI {
    public static byte[] A00;
    public static String[] A01 = {"rumqJp0zjtXTj7VCZC", "TMr6rmpz3eFeqFi1AyEescympmX4mKYs", "yKc30ML1ifcOIqfiQ1Y0n8yeP8tTgKvd", "ifxbXcWS1dksd5gxUX3XXpeR8fGAW9", "ARavVsGpFp1prhlT9X", "AJCuKBIGe5nliswM6BoL4M7qaWNzDabC", "wiV5dRZ8vBgNvrirj4IbquLjXKvqAP", "mqXFYOGhIorfWow0I7OGPDKbQEIe0IwJ"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C7082ji A01(@Nullable C6902gi c6902gi, JSONObject jSONObject, String str, boolean z, int i, int i2) {
        boolean zOptBoolean;
        int iOptInt;
        boolean zOptBoolean2;
        int iOptInt2;
        boolean zOptBoolean3;
        int iOptInt3;
        ArrayList arrayList;
        if (jSONObject == null) {
            return new C7082ji();
        }
        AbstractC6319XI.A04(c6902gi, A02(0, 23, 112));
        String strOptString = jSONObject.optString(A02(479, 10, 1));
        int iOptInt4 = jSONObject.optInt(A02(116, 12, 106), 0);
        String strOptString2 = jSONObject.optString(A02(253, 13, 18));
        String strA02 = AbstractC6340Xd.A02(jSONObject, A02(266, 12, 52));
        Uri uriA00 = TextUtils.isEmpty(strA02) ? null : AbstractC6312XB.A00(strA02);
        String strA03 = AbstractC6340Xd.A02(jSONObject, A02(128, 4, 54));
        String strA01 = AbstractC6358Xv.A01(strA03);
        String strA04 = AbstractC6340Xd.A02(jSONObject, A02(101, 15, 34));
        String strA05 = AbstractC6340Xd.A02(jSONObject, A02(593, 5, 82));
        String strA06 = AbstractC6340Xd.A02(jSONObject, A02(585, 8, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        String strA07 = AbstractC6340Xd.A02(jSONObject, A02(386, 8, 111));
        String strA08 = AbstractC6340Xd.A02(jSONObject, A02(539, 14, 32));
        String strA09 = AbstractC6340Xd.A02(jSONObject, A02(403, 16, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
        String strA010 = AbstractC6340Xd.A02(jSONObject, A02(553, 21, 41));
        String strA011 = AbstractC6340Xd.A02(jSONObject, A02(87, 14, 99));
        String strA012 = AbstractC6340Xd.A02(jSONObject, A02(459, 20, 94));
        String strA013 = AbstractC6340Xd.A02(jSONObject, A02(443, 16, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        String strA014 = AbstractC6340Xd.A02(jSONObject, A02(426, 17, 38));
        String strA015 = AbstractC6340Xd.A02(jSONObject, A02(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 14, 16));
        C47717m c47717mA00 = C47717m.A00(jSONObject, c6902gi);
        C6219Vb c6219VbA00 = C6219Vb.A00(jSONObject.optJSONObject(A02(394, 4, 38)));
        C6219Vb c6219VbA01 = C6219Vb.A00(jSONObject.optJSONObject(A02(398, 5, 114)));
        C6220Vc c6220VcA00 = C6220Vc.A00(jSONObject.optJSONObject(A02(574, 11, 124)));
        String strA016 = AbstractC6340Xd.A02(jSONObject, A02(598, 15, 10));
        boolean zOptBoolean4 = jSONObject.optBoolean(A02(238, 15, 64));
        boolean zOptBoolean5 = jSONObject.optBoolean(A02(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 19, 54));
        int iOptInt5 = jSONObject.optInt(A02(514, 25, 43), 4);
        int iOptInt6 = jSONObject.optInt(A02(489, 25, 29), 0);
        int iOptInt7 = jSONObject.optInt(A02(695, 31, 75), 0);
        int iOptInt8 = jSONObject.optInt(A02(726, 26, 18), 1000);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(53, 15, 30));
        C6219Vb c6219VbA02 = jSONObjectOptJSONObject != null ? C6219Vb.A00(jSONObjectOptJSONObject) : null;
        String strA017 = AbstractC6340Xd.A02(jSONObject, A02(68, 19, 95));
        EnumC5688Mv enumC5688MvA00 = AbstractC5690Mx.A00(jSONObject);
        Collection<String> collectionA03 = AbstractC5690Mx.A03(c6902gi, jSONObject);
        String strA018 = AbstractC6340Xd.A02(jSONObject, A02(686, 9, 20));
        int iOptInt9 = jSONObject.optInt(A02(635, 18, 76), 0);
        String strA019 = A02(662, 24, 63);
        if (A01[2].charAt(6) == 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "3DgIwYJYxCZHaga7jdAdEfDBKsaQLEaY";
        strArr[0] = "PJjdxes2PDM40JhdCx";
        long jOptLong = jSONObject.optLong(strA019, -1L);
        String strA020 = AbstractC6340Xd.A02(jSONObject, A02(653, 9, 120));
        String strA021 = A02(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE, 22, 83);
        EnumC6223Vf enumC6223Vf = jSONObject.has(strA021) ? jSONObject.optBoolean(strA021) ? EnumC6223Vf.A05 : EnumC6223Vf.A04 : EnumC6223Vf.A03;
        String strA022 = A02(FacebookRequestErrorClassification.EC_INVALID_TOKEN, 29, 111);
        if (A01[2].charAt(6) != 'o') {
            A01[5] = "EiaN2GrSxKmld9dBg6rLOOlJPXBJhn44";
            zOptBoolean = jSONObject.optBoolean(strA022);
            iOptInt = jSONObject.optInt(A02(154, 36, 107), 100);
            zOptBoolean2 = jSONObject.optBoolean(A02(278, 18, 99), false);
            iOptInt2 = jSONObject.optInt(A02(296, 26, 38), 10);
            zOptBoolean3 = jSONObject.optBoolean(A02(353, 33, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), false);
            iOptInt3 = jSONObject.optInt(A02(322, 31, 12), 1);
            arrayList = null;
        } else {
            zOptBoolean = jSONObject.optBoolean(strA022);
            iOptInt = jSONObject.optInt(A02(154, 36, 107), 100);
            zOptBoolean2 = jSONObject.optBoolean(A02(278, 18, 99), false);
            iOptInt2 = jSONObject.optInt(A02(296, 26, 38), 10);
            zOptBoolean3 = jSONObject.optBoolean(A02(353, 33, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), false);
            iOptInt3 = jSONObject.optInt(A02(322, 31, 12), 1);
            arrayList = null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A02(146, 8, 26));
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                ArrayList arrayList2 = new ArrayList(length);
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        arrayList2.add(A01(c6902gi, jSONArrayOptJSONArray.getJSONObject(i3), str, true, i3, length));
                    } catch (JSONException e) {
                        e = e;
                        arrayList = arrayList2;
                        c6902gi.A08().ABC(A02(419, 7, 72), AbstractC6098Td.A2A, new C6099Te(e));
                        Log.e(C7094ju.A0E, A02(23, 30, 97), e);
                        return new C7082ji(strA017, strA01, strA03, strA04, strA05, strA06, strA07, strA08, strA09, strA010, strA011, strA012, strA013, strA014, strA015, c6219VbA02, c47717mA00, c6219VbA00, c6219VbA01, c6220VcA00, strA018, strA020, jOptLong, enumC6223Vf, z, i, i2, arrayList, str, strOptString, iOptInt4, strOptString2, uriA00, strA016, zOptBoolean4, zOptBoolean5, iOptInt6, iOptInt5, iOptInt7, iOptInt8, enumC5688MvA00, collectionA03, iOptInt, zOptBoolean, iOptInt9, zOptBoolean2, iOptInt2, zOptBoolean3, iOptInt3);
                    }
                }
                arrayList = arrayList2;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        return new C7082ji(strA017, strA01, strA03, strA04, strA05, strA06, strA07, strA08, strA09, strA010, strA011, strA012, strA013, strA014, strA015, c6219VbA02, c47717mA00, c6219VbA00, c6219VbA01, c6220VcA00, strA018, strA020, jOptLong, enumC6223Vf, z, i, i2, arrayList, str, strOptString, iOptInt4, strOptString2, uriA00, strA016, zOptBoolean4, zOptBoolean5, iOptInt6, iOptInt5, iOptInt7, iOptInt8, enumC5688MvA00, collectionA03, iOptInt, zOptBoolean, iOptInt9, zOptBoolean2, iOptInt2, zOptBoolean3, iOptInt3);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{Ascii.SUB, 78, Base64.padSymbol, 66, 62, 71, 60, 62, -7, 39, 62, 77, 80, 72, 75, 68, -7, 37, 72, 58, Base64.padSymbol, 62, Base64.padSymbol, Ascii.f22502US, 56, 43, 44, 54, 47, -22, 62, 57, -22, 58, 43, 60, Base64.padSymbol, 47, -22, 45, 43, 60, 57, 63, Base64.padSymbol, 47, 54, -22, 46, 43, 62, 43, -8, -24, -21, -26, -22, -17, -10, -16, -22, -20, -6, -26, -16, -22, -10, -11, 41, 44, 39, 43, 48, 55, 49, 43, 45, 59, 39, 52, 49, 54, 51, 39, Base64.padSymbol, 58, 52, 45, 48, 43, SignedBytes.MAX_POWER_OF_TWO, 62, 45, 58, 63, 56, 45, SignedBytes.MAX_POWER_OF_TWO, 53, 59, 58, -20, -17, 1, -16, -3, -1, -12, -2, -16, -3, -22, -7, -20, -8, -16, 52, 65, 50, 63, 66, 58, 66, 50, 71, 76, 67, 56, 1, Ascii.f22500SO, 3, Ascii.CAN, -36, -38, -27, -27, -40, -19, -24, -40, -38, -36, -19, -30, -24, -25, -26, -28, -11, -14, -8, -10, -24, -17, 55, 67, 66, 72, 53, Base64.padSymbol, 66, 57, 70, 51, 74, Base64.padSymbol, 57, 75, 53, 54, Base64.padSymbol, SignedBytes.MAX_POWER_OF_TWO, Base64.padSymbol, 72, 77, 51, 55, 60, 57, 55, 63, 51, Base64.padSymbol, 66, 72, 57, 70, 74, 53, SignedBytes.MAX_POWER_OF_TWO, 59, 71, 70, 76, 57, 65, 70, Base64.padSymbol, 74, 55, 78, 65, Base64.padSymbol, 79, 57, 58, 65, 68, 65, 76, 81, 55, Base64.padSymbol, 70, 57, 58, 68, Base64.padSymbol, 60, 4, Ascii.f22490CR, 0, 1, Ascii.f22503VT, 4, -2, Ascii.DC2, Ascii.f22490CR, 0, Ascii.f22499SI, Ascii.DC2, 7, Ascii.f22500SO, 19, -2, Ascii.f22503VT, Ascii.f22500SO, 6, Ascii.f22500SO, Ascii.ETB, 10, Ascii.f22503VT, Ascii.NAK, Ascii.f22500SO, 8, Ascii.f22502US, Ascii.DC2, Ascii.f22500SO, 32, 8, Ascii.NAK, Ascii.CAN, Ascii.DLE, -32, -23, -34, -19, -12, -21, -17, -32, -33, -38, -34, -21, -24, 3, -1, -2, 1, -4, 0, Ascii.f22492FF, 10, 10, -2, Ascii.f22503VT, 1, 52, 49, 43, 47, 59, 65, 58, SignedBytes.MAX_POWER_OF_TWO, 49, 62, 43, 49, 58, 45, 46, 56, 49, 48, -9, -12, -18, -14, -2, 4, -3, 3, -12, 1, -18, 3, -8, -4, -12, -18, -8, -3, -18, 2, -12, -14, -2, -3, -13, 2, -35, -38, -44, -30, -22, -31, -23, -34, -44, -40, -31, -34, -40, -32, -44, -40, -31, -28, -24, -38, -44, -34, -40, -28, -29, -44, -40, -28, -22, -29, -23, 75, 72, 66, 80, 88, 79, 87, 76, 66, 70, 79, 76, 70, 78, 66, 70, 79, 82, 86, 72, 66, 76, 70, 82, 81, 66, 72, 81, 68, 69, 79, 72, 71, SignedBytes.MAX_POWER_OF_TWO, Base64.padSymbol, 57, 60, 68, 65, 70, Base64.padSymbol, -8, -14, -2, -3, 68, 72, 60, 66, SignedBytes.MAX_POWER_OF_TWO, 82, 79, 84, 81, 69, 74, 75, 89, 73, 88, 79, 86, 90, 79, 85, 84, 33, Ascii.DC2, 35, 36, Ascii.SUB, Ascii.f22502US, Ascii.CAN, -1, -16, 4, 2, -12, -18, 3, 1, -16, -3, 2, -5, -16, 3, -8, -2, -3, 84, 80, 69, 93, 67, 88, 86, 69, 82, 87, 80, 69, 88, 77, 83, 82, 55, 57, 54, 52, 54, 59, 44, 43, 38, 59, 57, 40, 53, 58, 51, 40, 59, 48, 54, 53, -36, -49, -37, -33, -49, -35, -34, -55, -45, -50, -7, -12, -25, -10, -7, -18, -11, -6, -27, -23, -11, -13, -10, -8, -21, -7, -7, -27, -9, -5, -25, -14, -17, -6, -1, 7, 2, -11, 4, 7, -4, 3, 8, -13, 0, 3, -5, -13, -8, -7, 0, -11, Ascii.f22490CR, -13, 7, -7, -9, 3, 2, -8, -4, -8, -20, -14, -22, -11, -24, -20, -8, -9, -3, -18, 1, -3, 5, 2, 1, 0, 5, 1, 4, -9, -10, -15, 6, 4, -13, 0, 5, -2, -13, 6, -5, 1, 0, 88, 89, 70, 87, 68, 87, 70, 89, 78, 83, 76, 87, 89, 70, 88, 77, 88, 80, 73, 47, 36, 47, 39, 32, -24, -26, -40, -41, -46, -27, -40, -29, -30, -27, -25, -46, -24, -27, -33, 50, 37, 32, 33, 43, Ascii.ESC, Ascii.f22494GS, 49, 48, 43, 44, 40, Ascii.f22494GS, 53, Ascii.ESC, 33, 42, Ascii.f22494GS, Ascii.f22498RS, 40, 33, 32, 43, Ascii.f22498RS, Ascii.f22491EM, Ascii.SUB, 36, Ascii.DC4, Ascii.f22491EM, 42, 39, Ascii.SYN, 41, Ascii.f22498RS, 36, 35, Ascii.DC4, 40, Ascii.SUB, Ascii.CAN, 87, 74, 69, 70, 80, SignedBytes.MAX_POWER_OF_TWO, 78, 81, 69, Ascii.f22498RS, 17, Ascii.f22492FF, Ascii.f22490CR, Ascii.ETB, 7, Ascii.CAN, Ascii.SUB, Ascii.f22490CR, Ascii.DC4, Ascii.ETB, 9, Ascii.f22492FF, 7, Ascii.ESC, 17, 34, Ascii.f22490CR, 7, 10, 33, Ascii.f22493FS, Ascii.f22490CR, Ascii.ESC, -13, -26, -31, -30, -20, -36, -14, -17, -23, 42, Ascii.f22494GS, Ascii.f22491EM, 43, Ascii.NAK, Ascii.SYN, Ascii.f22494GS, 32, Ascii.f22494GS, 40, 45, 19, Ascii.ETB, Ascii.f22493FS, Ascii.f22491EM, Ascii.ETB, Ascii.f22502US, 19, Ascii.f22494GS, 34, Ascii.f22494GS, 40, Ascii.f22494GS, Ascii.NAK, 32, 19, Ascii.CAN, Ascii.f22491EM, 32, Ascii.NAK, 45, -15, -28, -32, -14, -36, -35, -28, -25, -28, -17, -12, -38, -34, -29, -32, -34, -26, -38, -28, -23, -17, -32, -19, -15, -36, -25};
    }

    static {
        A03();
    }

    public static C7082ji A00(C6902gi c6902gi, JSONObject jSONObject, String str) {
        return A01(c6902gi, jSONObject, str, false, -1, 0);
    }
}
