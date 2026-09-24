package com.facebook.ads.redexgen.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.M0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC5631M0<T> {
    public static final C48038I A00;
    public static final C48028H A01;
    public static final C48028H A02;
    public static final C48028H A03;
    public static final C48028H A04;
    public static final C48028H A05;
    public static final C48028H A06;
    public static final C48028H A07;
    public static final C48028H A08;
    public static final C48028H A09;
    public static final C48028H A0A;
    public static final C48028H A0B;
    public static final C48028H A0C;
    public static final C48028H A0D;
    public static final C48028H A0E;
    public static final C48028H A0F;
    public static final C48028H A0G;
    public static final C48028H A0H;
    public static final C48028H A0I;
    public static final C48028H A0J;
    public static final C48028H A0K;
    public static final C48028H A0L;
    public static final C48018G A0M;
    public static final C48008F A0N;
    public static final C48008F A0O;
    public static final C48008F A0P;
    public static final C48008F A0Q;
    public static final C48008F A0R;
    public static final C48008F A0S;
    public static final C48008F A0T;
    public static final C48008F A0U;
    public static final C48008F A0V;
    public static final C48008F A0W;
    public static final C47998E A0X;
    public static final C47998E A0Y;
    public static final C47988D A0Z;
    public static final C47988D A0a;
    public static final C47988D A0b;
    public static final C47988D A0c;
    public static final C47988D A0d;
    public static final C47988D A0e;
    public static final C47988D A0f;
    public static final C47988D A0g;
    public static final C47988D A0h;
    public static final C47988D A0i;
    public static final C47988D A0j;
    public static final C47988D A0k;
    public static final C47988D A0l;
    public static final C47988D A0m;
    public static final C47988D A0n;
    public static final C47988D A0o;

    String getName();

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v101, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.facebook.ads.redexgen.X.8E] */
    /* JADX WARN: Type inference failed for: r0v41, types: [com.facebook.ads.redexgen.X.8E] */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v45, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v53, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v55, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v57, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v61, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v69, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v71, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v73, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v75, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v77, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v79, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v81, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v83, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v85, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v87, types: [com.facebook.ads.redexgen.X.8F] */
    /* JADX WARN: Type inference failed for: r0v89, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v91, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v93, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v95, types: [com.facebook.ads.redexgen.X.8D] */
    /* JADX WARN: Type inference failed for: r0v97, types: [com.facebook.ads.redexgen.X.8H] */
    /* JADX WARN: Type inference failed for: r0v99, types: [com.facebook.ads.redexgen.X.8D] */
    static {
        final String strA00 = AbstractC435711.A00(436, 12, 127);
        A0j = new AbstractC7133kY<String>(strA00) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA01 = AbstractC435711.A00(124, 10, 52);
        A0O = new AbstractC7133kY<Integer>(strA01) { // from class: com.facebook.ads.redexgen.X.8F
        };
        final String strA02 = AbstractC435711.A00(Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 2, 48);
        A0g = new AbstractC7133kY<String>(strA02) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA03 = AbstractC435711.A00(36, 15, 90);
        A01 = new AbstractC7133kY<Boolean>(strA03) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA04 = AbstractC435711.A00(380, 21, 109);
        A0I = new AbstractC7133kY<Boolean>(strA04) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA05 = AbstractC435711.A00(156, 7, 19);
        A03 = new AbstractC7133kY<Boolean>(strA05) { // from class: com.facebook.ads.redexgen.X.8H
        };
        A00 = new C48038I(AbstractC435711.A00(543, 1, 66));
        final String strA06 = AbstractC435711.A00(574, 10, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        A0W = new AbstractC7133kY<Integer>(strA06) { // from class: com.facebook.ads.redexgen.X.8F
        };
        final String strA07 = AbstractC435711.A00(492, 11, 50);
        A0K = new AbstractC7133kY<Boolean>(strA07) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA08 = AbstractC435711.A00(134, 13, 79);
        A0e = new AbstractC7133kY<String>(strA08) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA09 = AbstractC435711.A00(163, 14, 61);
        A04 = new AbstractC7133kY<Boolean>(strA09) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA010 = AbstractC435711.A00(346, 15, 42);
        A0G = new AbstractC7133kY<Boolean>(strA010) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA011 = AbstractC435711.A00(70, 12, 99);
        A02 = new AbstractC7133kY<Boolean>(strA011) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA012 = AbstractC435711.A00(177, 12, 126);
        A05 = new AbstractC7133kY<Boolean>(strA012) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA013 = AbstractC435711.A00(189, 11, 64);
        A06 = new AbstractC7133kY<Boolean>(strA013) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA014 = AbstractC435711.A00(476, 10, 126);
        A0l = new AbstractC7133kY<String>(strA014) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA015 = AbstractC435711.A00(448, 14, 48);
        A0k = new AbstractC7133kY<String>(strA015) { // from class: com.facebook.ads.redexgen.X.8D
        };
        A0M = new C48018G(AbstractC435711.A00(551, 9, 42));
        final String strA016 = AbstractC435711.A00(503, 11, 102);
        A0U = new AbstractC7133kY<Integer>(strA016) { // from class: com.facebook.ads.redexgen.X.8F
        };
        final String strA017 = AbstractC435711.A00(334, 12, 0);
        A0Y = new AbstractC7133kY<Long>(strA017) { // from class: com.facebook.ads.redexgen.X.8E
        };
        final String strA018 = AbstractC435711.A00(307, 27, 127);
        A0X = new AbstractC7133kY<Long>(strA018) { // from class: com.facebook.ads.redexgen.X.8E
        };
        final String strA019 = AbstractC435711.A00(0, 18, 82);
        A0Z = new AbstractC7133kY<String>(strA019) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA020 = AbstractC435711.A00(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 9, 1);
        A0B = new AbstractC7133kY<Boolean>(strA020) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA021 = AbstractC435711.A00(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 14, 78);
        A09 = new AbstractC7133kY<Boolean>(strA021) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA022 = AbstractC435711.A00(470, 6, 3);
        A0S = new AbstractC7133kY<Integer>(strA022) { // from class: com.facebook.ads.redexgen.X.8F
        };
        final String strA023 = AbstractC435711.A00(401, 7, 26);
        A0h = new AbstractC7133kY<String>(strA023) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA024 = AbstractC435711.A00(147, 9, 95);
        A0f = new AbstractC7133kY<String>(strA024) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA025 = AbstractC435711.A00(200, 18, 0);
        A07 = new AbstractC7133kY<Boolean>(strA025) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA026 = AbstractC435711.A00(89, 16, 55);
        A0N = new AbstractC7133kY<Integer>(strA026) { // from class: com.facebook.ads.redexgen.X.8F
        };
        final String strA027 = AbstractC435711.A00(408, 4, 54);
        A0Q = new AbstractC7133kY<Integer>(strA027) { // from class: com.facebook.ads.redexgen.X.8F
        };
        final String strA028 = AbstractC435711.A00(234, 16, 43);
        A0P = new AbstractC7133kY<Integer>(strA028) { // from class: com.facebook.ads.redexgen.X.8F
        };
        final String strA029 = AbstractC435711.A00(285, 19, 13);
        A0D = new AbstractC7133kY<Boolean>(strA029) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA030 = AbstractC435711.A00(259, 26, 26);
        A0C = new AbstractC7133kY<Boolean>(strA030) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA031 = AbstractC435711.A00(584, 16, 113);
        A0o = new AbstractC7133kY<String>(strA031) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA032 = AbstractC435711.A00(105, 19, 88);
        A0d = new AbstractC7133kY<String>(strA032) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA033 = AbstractC435711.A00(462, 8, 35);
        A0i = new AbstractC7133kY<String>(strA033) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA034 = AbstractC435711.A00(18, 18, 106);
        A0a = new AbstractC7133kY<String>(strA034) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA035 = AbstractC435711.A00(539, 4, 96);
        A0V = new AbstractC7133kY<Integer>(strA035) { // from class: com.facebook.ads.redexgen.X.8F
        };
        final String strA036 = AbstractC435711.A00(412, 13, 35);
        A0J = new AbstractC7133kY<Boolean>(strA036) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA037 = AbstractC435711.A00(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 19, 35);
        A0L = new AbstractC7133kY<Boolean>(strA037) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA038 = AbstractC435711.A00(361, 19, 14);
        A0H = new AbstractC7133kY<Boolean>(strA038) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA039 = AbstractC435711.A00(560, 14, 108);
        A0n = new AbstractC7133kY<String>(strA039) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA040 = AbstractC435711.A00(58, 12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        A0c = new AbstractC7133kY<String>(strA040) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA041 = AbstractC435711.A00(TypedValues.CycleType.TYPE_WAVE_PHASE, 11, 47);
        A0R = new AbstractC7133kY<Integer>(strA041) { // from class: com.facebook.ads.redexgen.X.8F
        };
        final String strA042 = AbstractC435711.A00(304, 3, 26);
        A0A = new AbstractC7133kY<Boolean>(strA042) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA043 = AbstractC435711.A00(544, 2, 108);
        A0E = new AbstractC7133kY<Boolean>(strA043) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA044 = AbstractC435711.A00(82, 7, 5);
        A08 = new AbstractC7133kY<Boolean>(strA044) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA045 = AbstractC435711.A00(51, 7, 99);
        A0b = new AbstractC7133kY<String>(strA045) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA046 = AbstractC435711.A00(546, 5, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        A0F = new AbstractC7133kY<Boolean>(strA046) { // from class: com.facebook.ads.redexgen.X.8H
        };
        final String strA047 = AbstractC435711.A00(514, 6, 89);
        A0m = new AbstractC7133kY<String>(strA047) { // from class: com.facebook.ads.redexgen.X.8D
        };
        final String strA048 = AbstractC435711.A00(486, 6, 90);
        A0T = new AbstractC7133kY<Integer>(strA048) { // from class: com.facebook.ads.redexgen.X.8F
        };
    }
}
