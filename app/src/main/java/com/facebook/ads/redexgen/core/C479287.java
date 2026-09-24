package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.p300io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.87 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C479287 extends AbstractC7116kH {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public C6329XS A00;
    public final Uri A01;
    public final C5734Ng A02;
    public final Map<String, String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final List<Intent> A06() {
        List<C5691My> listA05 = A05();
        ArrayList arrayList = new ArrayList();
        if (listA05 != null) {
            Iterator<C5691My> it = listA05.iterator();
            while (it.hasNext()) {
                Intent intentA00 = A00(it.next());
                if (intentA00 != null) {
                    arrayList.add(intentA00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, Base64.padSymbol, 109, 124, 111, 110, 116, 115, 122, Base64.padSymbol, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, Ascii.DC4, Ascii.f22493FS, Ascii.f22491EM, Ascii.DLE, 17, 85, 1, Ascii.SUB, 85, Ascii.SUB, 5, Ascii.DLE, Ascii.ESC, 85, Ascii.CAN, Ascii.DC4, 7, Ascii.f22498RS, Ascii.DLE, 1, 85, 0, 7, Ascii.f22491EM, 79, 85, 51, 53, 8, 7, Ascii.f22490CR, Ascii.ESC, 6, 0, Ascii.f22490CR, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, 63, Base64.padSymbol, 42, 55, 49, 48, 112, Ascii.SUB, Ascii.ETB, Ascii.f22502US, Ascii.DC2, 5, 10, 0, Ascii.SYN, Ascii.f22503VT, Ascii.f22490CR, 0, 74, Ascii.f22490CR, 10, Ascii.DLE, 1, 10, Ascii.DLE, 74, 5, 7, Ascii.DLE, Ascii.f22490CR, Ascii.f22503VT, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, Ascii.f22493FS, 39, 34, 55, 34, 65, 77, 94, 71, 73, 88, Ascii.SYN, 3, 3, 72, 73, 88, 77, 69, SignedBytes.MAX_POWER_OF_TWO, 95, 19, 69, 72, 17, 9, 95, Ascii.ESC, 4, 17, Ascii.SUB, 17, Ascii.DLE, 43, Ascii.DLE, 17, 17, 4, Ascii.CAN, Ascii.f22494GS, Ascii.SUB, Ascii.f22502US, 125, 98, 119, 124, 119, 118, 77, 97, 102, 125, 96, 119, 77, 116, 115, 126, 126, 112, 115, 113, 121, 77, 103, 96, 126, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 100, 117, 102, 103, 125, 122, 115, 81, 86, 77, 80, 71, 125, 75, 70, 56, 63, 36, 57, 46, Ascii.DC4, 62, 57, 39, 81, 86, 77, 80, 71, 125, 87, 80, 78, 125, 85, 71, SignedBytes.MAX_POWER_OF_TWO, 125, 68, 67, 78, 78, SignedBytes.MAX_POWER_OF_TWO, 67, 65, 73, 59, 42, 35, 117, Ascii.ETB, 6, Ascii.f22499SI, 19, 17, Ascii.f22492FF, Ascii.f22500SO, 19, Ascii.ETB, 89};
    }

    static {
        A07();
        A06 = C479287.class.getSimpleName();
    }

    public C479287(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str, Uri uri, Map<String, String> extraData, C5692N0 c5692n0, boolean z, C5734Ng c5734Ng) {
        super(c6902gi, interfaceC6192VA, str, c5692n0, z);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c5734Ng;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.Intent A00(com.facebook.ads.redexgen.core.C5691My r12) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C479287.A00(com.facebook.ads.redexgen.X.My):android.content.Intent");
    }

    private Intent A01(C5691My c5691My) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c5691My.A05()) && !TextUtils.isEmpty(c5691My.A04())) {
            intent.setComponent(new ComponentName(c5691My.A05(), c5691My.A04()));
        }
        if (!TextUtils.isEmpty(c5691My.A03())) {
            intent.setData(AbstractC6312XB.A00(c5691My.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 9, 98));
        if (!TextUtils.isEmpty(queryParameter)) {
            return AbstractC6312XB.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(211, 8, 11);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(126, 22, 5);
        return AbstractC6312XB.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC5683Mq A03() throws C6295Ws {
        C6307X6 c6307x6 = new C6307X6();
        try {
            return C6307X6.A06(c6307x6, ((AbstractC5686Mt) this).A01, A02(), ((AbstractC5686Mt) this).A03, this.A03);
        } catch (C6295Ws unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(228, 22, 11));
            if (queryParameter != null && queryParameter.length() > 0) {
                C6307X6.A0E(c6307x6, ((AbstractC5686Mt) this).A01, AbstractC6312XB.A00(queryParameter), ((AbstractC5686Mt) this).A03);
            }
            return EnumC5683Mq.A09;
        }
    }

    private List<C5691My> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 64);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    C5691My c5691MyA00 = C5691My.A00(jSONArrayOptJSONArray.optJSONObject(i));
                    if (c5691MyA00 != null) {
                        arrayList.add(c5691MyA00);
                    }
                }
            }
        } catch (JSONException e) {
            InterfaceC6097Tc interfaceC6097TcA08 = ((AbstractC5686Mt) this).A01.A08();
            int i2 = AbstractC6098Td.A24;
            C6099Te c6099Te = new C6099Te(e);
            String appsiteDataString3 = A04(204, 7, 61);
            interfaceC6097TcA08.ABC(appsiteDataString3, i2, c6099Te);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 52);
            Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        Iterator<Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            try {
                if (C6297Wu.A0D(((AbstractC5686Mt) this).A01, it.next())) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean A09(C6902gi c6902gi, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && C6171Up.A29(c6902gi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7116kH
    public final EnumC5683Mq A0H() {
        EnumC5683Mq enumC5683MqA0M = EnumC5683Mq.A09;
        if (((AbstractC7116kH) this).A03) {
            enumC5683MqA0M = A0M();
        } else {
            this.A03.put(A04(188, 16, 61), String.valueOf(true));
        }
        Map<String, String> map = this.A03;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        A0J(map, enumC5683MqA0M);
        C5734Ng.A06(this.A02, ((AbstractC5686Mt) this).A01);
        return enumC5683MqA0M;
    }

    public final EnumC5683Mq A0M() {
        EnumC5683Mq enumC5683MqA03 = EnumC5683Mq.A09;
        String strA04 = A04(148, 15, 93);
        boolean zA0K = A0K(this.A01);
        if (!zA0K) {
            zA0K = A08();
        }
        if (!zA0K) {
            try {
                enumC5683MqA03 = A03();
                if (enumC5683MqA03 != EnumC5683Mq.A09) {
                    strA04 = A04(188, 16, 61);
                } else {
                    strA04 = A04(163, 25, 59);
                }
            } catch (Exception unused) {
                enumC5683MqA03 = EnumC5683Mq.A04;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(strA04, redirectionAction);
        return enumC5683MqA03;
    }

    public final void A0N(C6329XS c6329xs) {
        this.A00 = c6329xs;
    }
}
