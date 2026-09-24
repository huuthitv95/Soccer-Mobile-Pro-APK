package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.p300io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dg */
/* JADX INFO: loaded from: classes6.dex */
public class C11896dg extends C11886cx implements InterfaceC11870ch {

    /* JADX INFO: renamed from: סּ */
    private static int f28514 = 1;

    /* JADX INFO: renamed from: ﭖ */
    private static int f28515 = 0;

    /* JADX INFO: renamed from: ﭴ */
    private static byte[] f28516 = {-6, Ascii.f22498RS, 17, 52, -3, 33, Ascii.CAN, Ascii.DC2, 42, -7, 38, Ascii.NAK, -5, 37, Ascii.CAN, 59, Ascii.f22500SO, 32, Ascii.f22499SI, Ascii.ESC, 36, 58, Ascii.f22490CR, Ascii.f22498RS, 33, -4, 82, 69, 104, 60, Base64.padSymbol, 92, 105, 42, 65, 116, 44, 75, 78, -6, 44, Ascii.f22502US, 66, Ascii.f22503VT, 47, 38, 32, 56, Ascii.ETB, 37, 40, -3, Ascii.f22503VT, Ascii.f22490CR, 59, 5, 5, 35, Ascii.f22503VT, 41, Ascii.DC2, 9, 69, -27, 37, 8, -2, 76, 59, 71, 80, 102, 49, 68, 103, 49, 73, 86, 100, Ascii.f22502US, 89, 60, -2, Ascii.ESC, 10, Ascii.SYN, Ascii.f22502US, 53, 0, 19, 54, 0, Ascii.CAN, 37, 51, -18, 40, Ascii.ETB, 3, -24, -27, Ascii.DC2, -50, -21, -38, -26, -17, 5, -41, -40, -10, -34, -4, -27, -36, Ascii.CAN, -72, -8, -25, 3, -65, -68, -23, -91, -62, -79, -67, -58, -36, -82, -81, -51, -75, -45, -68, -77, -17, -113, -49, -78, -12, -123, -73, 88, -105, 122, -3, -94, -111, -66, 125, -120, -90, -114, -84, -107, -116, -56, 105, -85, -110};

    /* JADX INFO: renamed from: ﭸ */
    private static int f28517 = 18;

    /* JADX INFO: renamed from: ﮉ */
    private static short[] f28518 = null;

    /* JADX INFO: renamed from: ﮌ */
    private static int f28519 = -440365106;

    /* JADX INFO: renamed from: ﮐ */
    private static int f28520 = 162387421;

    /* JADX INFO: renamed from: ﱟ */
    private static int f28521 = 89;

    /* JADX INFO: renamed from: ﱡ */
    private EnumC12013hp f28522;

    /* JADX INFO: renamed from: ﻏ */
    private EnumC12013hp f28524;

    /* JADX INFO: renamed from: ﾇ */
    private final List<String> f28528 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ */
    private final List<String> f28529 = new ArrayList();

    /* JADX INFO: renamed from: ｋ */
    private final List<String> f28527 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ */
    private final List<String> f28525 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ */
    private final List<String> f28526 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ */
    private JSONObject f28523 = new JSONObject();

    /* JADX INFO: renamed from: ｋ */
    private List<String> m29922() {
        int i = 2 % 2;
        int i2 = f28514;
        int i3 = i2 + 77;
        f28515 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f28528;
        int i4 = i2 + 93;
        f28515 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ */
    private List<String> m29927() {
        int i = 2 % 2;
        int i2 = f28514;
        int i3 = i2 + 89;
        f28515 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.f28529;
        int i5 = i2 + 37;
        f28515 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ */
    private List<String> m29918() {
        int i = 2 % 2;
        int i2 = f28514;
        int i3 = i2 + 113;
        f28515 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.f28527;
        int i5 = i2 + 5;
        f28515 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private List<String> m29914() {
        int i = 2 % 2;
        int i2 = f28515 + 13;
        f28514 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f28525;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private List<String> m29931() {
        int i = 2 % 2;
        int i2 = f28515 + 37;
        int i3 = i2 % 128;
        f28514 = i3;
        int i4 = i2 % 2;
        List<String> list = this.f28526;
        int i5 = i3 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28515 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    private EnumC12013hp m29905() {
        int i = 2 % 2;
        int i2 = f28515 + 115;
        int i3 = i2 % 128;
        f28514 = i3;
        int i4 = i2 % 2;
        EnumC12013hp enumC12013hp = this.f28522;
        int i5 = i3 + 11;
        f28515 = i5 % 128;
        int i6 = i5 % 2;
        return enumC12013hp;
    }

    /* JADX INFO: renamed from: ﻏ */
    private EnumC12013hp m29911() {
        int i = 2 % 2;
        int i2 = f28514;
        int i3 = i2 + 1;
        f28515 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        EnumC12013hp enumC12013hp = this.f28524;
        int i4 = i2 + 55;
        f28515 = i4 % 128;
        int i5 = i4 % 2;
        return enumC12013hp;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m29928(String str) {
        int i = 2 % 2;
        int i2 = f28515 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28514 = i2 % 128;
        int i3 = i2 % 2;
        m29929(str, this.f28528);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m29933(List<String> list) {
        int i = 2 % 2;
        int i2 = f28514 + 47;
        f28515 = i2 % 128;
        if (i2 % 2 != 0) {
            m29934(list, this.f28528);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        m29934(list, this.f28528);
        int i3 = f28515 + 71;
        f28514 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 90 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m29919(String str) {
        int i = 2 % 2;
        int i2 = f28514 + 57;
        f28515 = i2 % 128;
        int i3 = i2 % 2;
        m29929(str, this.f28529);
        int i4 = f28514 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28515 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m29920(List<String> list) {
        int i = 2 % 2;
        int i2 = f28515 + 113;
        f28514 = i2 % 128;
        int i3 = i2 % 2;
        m29934(list, this.f28529);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m29916(String str) {
        int i = 2 % 2;
        int i2 = f28515 + 21;
        f28514 = i2 % 128;
        int i3 = i2 % 2;
        m29929(str, this.f28527);
        int i4 = f28515 + 33;
        f28514 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m29917(List<String> list) {
        int i = 2 % 2;
        int i2 = f28514 + 45;
        f28515 = i2 % 128;
        if (i2 % 2 != 0) {
            m29934(list, this.f28527);
            int i3 = 5 / 0;
        } else {
            m29934(list, this.f28527);
        }
        int i4 = f28515 + 115;
        f28514 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private void m29924(String str) {
        int i = 2 % 2;
        int i2 = f28515 + 91;
        f28514 = i2 % 128;
        int i3 = i2 % 2;
        m29929(str, this.f28525);
        int i4 = f28514 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28515 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m29925(List<String> list) {
        int i = 2 % 2;
        int i2 = f28514 + 35;
        f28515 = i2 % 128;
        int i3 = i2 % 2;
        m29934(list, this.f28525);
        int i4 = f28514 + 35;
        f28515 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m29932(String str) {
        int i = 2 % 2;
        int i2 = f28515 + 55;
        f28514 = i2 % 128;
        if (i2 % 2 == 0) {
            m29929(str, this.f28526);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        m29929(str, this.f28526);
        int i3 = f28514 + 97;
        f28515 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m29930(List<String> list) {
        int i = 2 % 2;
        int i2 = f28514 + 87;
        f28515 = i2 % 128;
        if (i2 % 2 != 0) {
            m29934(list, this.f28526);
            int i3 = 75 / 0;
        } else {
            m29934(list, this.f28526);
        }
        int i4 = f28514 + 101;
        f28515 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m29923(EnumC12013hp enumC12013hp) {
        int i = 2 % 2;
        int i2 = f28514;
        int i3 = i2 + 51;
        f28515 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (enumC12013hp != null) {
            int i4 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f28515 = i4 % 128;
            int i5 = i4 % 2;
            this.f28522 = enumC12013hp;
            int i6 = i2 + 55;
            f28515 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m29915(EnumC12013hp enumC12013hp) {
        int i = 2 % 2;
        if (enumC12013hp != null) {
            int i2 = f28514 + 63;
            int i3 = i2 % 128;
            f28515 = i3;
            int i4 = i2 % 2;
            this.f28524 = enumC12013hp;
            int i5 = i3 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f28514 = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = f28514 + 89;
        f28515 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ */
    private String m29903() {
        int i = 2 % 2;
        int i2 = f28514 + 35;
        f28515 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f28523.optString(C12035ik.f29392);
            throw null;
        }
        String strOptString = this.f28523.optString(C12035ik.f29392);
        int i3 = f28514 + 79;
        f28515 = i3 % 128;
        int i4 = i3 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱡ */
    private void m29908(String str) {
        int i = 2 % 2;
        int i2 = f28515 + 93;
        f28514 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f28523.put(C12035ik.f29392, str);
            int i4 = f28514 + 29;
            f28515 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ */
    private String m29909() {
        int i = 2 % 2;
        int i2 = f28514 + 77;
        f28515 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = this.f28523.optString(C12035ik.f29391);
        int i4 = f28515 + 109;
        f28514 = i4 % 128;
        int i5 = i4 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻏ */
    private void m29912(String str) {
        int i = 2 % 2;
        int i2 = f28515 + 37;
        f28514 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f28523.put(C12035ik.f29391, str);
            int i4 = f28514 + 23;
            f28515 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ */
    private String m29907() {
        int i = 2 % 2;
        int i2 = f28515 + 49;
        f28514 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f28523;
        if (i3 != 0) {
            return jSONObject.optString(C12035ik.f29386);
        }
        jSONObject.optString(C12035ik.f29386);
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ */
    private void m29904(String str) {
        int i = 2 % 2;
        int i2 = f28514 + 111;
        f28515 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f28523.put(C12035ik.f29386, str);
                int i3 = f28514 + 15;
                f28515 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 90 / 0;
                    return;
                }
                return;
            }
            this.f28523.put(C12035ik.f29386, str);
            Object obj = null;
            try {
                super.hashCode();
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﭖ */
    private String m29897() {
        int i = 2 % 2;
        int i2 = f28514 + 43;
        f28515 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = this.f28523.optString(C12035ik.f29393);
        int i4 = f28515 + 95;
        f28514 = i4 % 128;
        int i5 = i4 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱟ */
    private void m29906(String str) {
        int i = 2 % 2;
        int i2 = f28515 + 11;
        f28514 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f28523.put(C12035ik.f29393, str);
                int i3 = 57 / 0;
            } else {
                this.f28523.put(C12035ik.f29393, str);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﭸ */
    private String m29899() {
        int i = 2 % 2;
        int i2 = f28514 + 11;
        f28515 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f28523;
        if (i3 == 0) {
            return jSONObject.optString(C12035ik.f29388);
        }
        int i4 = 87 / 0;
        return jSONObject.optString(C12035ik.f29388);
    }

    /* JADX INFO: renamed from: ﺙ */
    private void m29910(String str) {
        int i = 2 % 2;
        int i2 = f28514 + 93;
        f28515 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f28523.put(C12035ik.f29388, str);
            int i4 = f28514 + 21;
            f28515 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﮌ */
    private JSONObject m29902() {
        int i = 2 % 2;
        int i2 = f28515 + 51;
        f28514 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f28523;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m29926(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f28515 + 71;
        f28514 = i2 % 128;
        int i3 = i2 % 2;
        this.f28523 = C12077jz.m30816(jSONObject);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f28514 + 47;
        f28515 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﭸ */
    private void m29900(String str) {
        int i = 2 % 2;
        int i2 = f28515 + 51;
        f28514 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f28523.put(C12035ik.f29383, str);
                int i3 = f28515 + 61;
                f28514 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 70 / 0;
                    return;
                }
                return;
            }
            this.f28523.put(C12035ik.f29383, str);
            try {
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﭴ */
    private String m29898() {
        int i = 2 % 2;
        int i2 = f28515 + 65;
        f28514 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = this.f28523.optString(C12035ik.f29383);
        int i4 = f28515 + 73;
        f28514 = i4 % 128;
        if (i4 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m29929(String str, List<String> list) {
        int i = 2 % 2;
        int i2 = f28514 + 71;
        f28515 = i2 % 128;
        int i3 = i2 % 2;
        if (list == null || TextUtils.isEmpty(str) || list.contains(str)) {
            return;
        }
        int i4 = f28515 + 91;
        f28514 = i4 % 128;
        int i5 = i4 % 2;
        list.add(str);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m29934(List<String> list, List<String> list2) {
        int i = 2 % 2;
        if (list != null) {
            int i2 = f28514 + 97;
            f28515 = i2 % 128;
            if (i2 % 2 == 0) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    int i3 = f28515 + 17;
                    f28514 = i3 % 128;
                    if (i3 % 2 == 0) {
                        m29929(it.next(), list2);
                        throw null;
                    }
                    m29929(it.next(), list2);
                    int i4 = f28514 + 35;
                    f28515 = i4 % 128;
                    int i5 = i4 % 2;
                }
                return;
            }
            list.iterator();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX INFO: renamed from: ﮉ */
    private Object m29901() {
        boolean z;
        int i = 2 % 2;
        int i2 = f28515 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28514 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f28528.size();
            throw null;
        }
        if (this.f28528.size() > 0 || this.f28529.size() > 0) {
            z = true;
        } else {
            int i3 = f28514 + 27;
            f28515 = i3 % 128;
            int i4 = i3 % 2;
            List<String> list = this.f28526;
            if (i4 != 0) {
                list.size();
                throw null;
            }
            if (list.size() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: סּ */
    private JSONObject m29896() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f28522 != null) {
                jSONObject.put(C12035ik.f29399, this.f28522.m30302());
            }
            if (this.f28524 != null) {
                jSONObject.put(C12035ik.f29394, this.f28524.m30302());
            }
            if (this.f28528.size() > 0) {
                jSONObject.put(C12035ik.f29392, new JSONArray((Collection) this.f28528));
            }
            if (this.f28529.size() > 0) {
                jSONObject.put(C12035ik.f29386, new JSONArray((Collection) this.f28529));
                int i2 = f28515 + 13;
                f28514 = i2 % 128;
                int i3 = i2 % 2;
            }
            if (this.f28527.size() > 0) {
                jSONObject.put(C12035ik.f29388, new JSONArray((Collection) this.f28527));
            }
            if (this.f28525.size() > 0) {
                jSONObject.put(C12035ik.f29393, new JSONArray((Collection) this.f28525));
            }
            if (this.f28526.size() > 0) {
                jSONObject.put(C12035ik.f29391, new JSONArray((Collection) this.f28526));
            }
            if (this.f28523.length() > 0) {
                int i4 = f28514 + 85;
                f28515 = i4 % 128;
                int i5 = i4 % 2;
                jSONObject.putOpt(C12035ik.f29390, this.f28523.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x0450  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        byte b = 1;
        switch (str.hashCode()) {
            case -1836320845:
                if (!str.equals(m29913("￭\t\u000f\f�\uffff\uffef\f\u0006\ufffb\ufffe\ufffe", View.combineMeasuredStates(0, 0) + 12, false, 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + FacebookRequestErrorClassification.EC_INVALID_TOKEN).intern())) {
                    b = -1;
                } else {
                    int i2 = f28515 + 111;
                    f28514 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 7;
                }
                break;
            case -1833890347:
                if (!str.equals(m29913("\u0002\u0002\uffe7\u000b\uffff\u0005\u0003\ufff3\u0010\n\uffff", 11 - (ViewConfiguration.getScrollBarSize() >> 8), false, TextUtils.indexOf("", "", 0, 0) + 10, 187 - Color.argb(0, 0, 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i4 = f28514 + 9;
                    f28515 = i4 % 128;
                    int i5 = i4 % 2;
                }
                break;
            case -1803337567:
                if (!str.equals(m29913("\uffff\t￠\u000f\u0000\u000e\u0000\ufffe\r\u0010\n￮\u0007\r\ufff0\uffff\r￼\uffde", 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, Color.argb(0, 0, 0, 0) + 6, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + FacebookRequestErrorClassification.EC_INVALID_TOKEN).intern())) {
                    b = -1;
                } else {
                    int i6 = f28514 + 109;
                    f28515 = i6 % 128;
                    int i7 = i6 % 2;
                    b = Ascii.ESC;
                }
                break;
            case -1712168770:
                if (!str.equals(m29913("\r\u0007\u000e￼\uffff\uffff￤\ufffe\n\t\ufff0", Color.blue(0) + 11, false, (ViewConfiguration.getTapTimeout() >> 16) + 3, (ViewConfiguration.getTouchSlop() >> 8) + FacebookRequestErrorClassification.EC_INVALID_TOKEN).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22500SO;
                }
                break;
            case -1409157227:
                if (!str.equals(m29913("\u0003\t￬￼\ufffa\t\f\u0006￪\u000b￼\ufffe\n", View.MeasureSpec.getMode(0) + 13, true, TextUtils.getCapsMode("", 0, 0) + 12, 193 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1362450249:
                if (!str.equals(m29921((-162387276) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) (103 - (KeyEvent.getMaxKeyCode() >> 16)), AndroidCharacter.getMirror('0') + 28778, (byte) TextUtils.getOffsetBefore("", 0), (-19) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i8 = f28514 + 97;
                    f28515 = i8 % 128;
                    if (i8 % 2 == 0) {
                        b = 33;
                    } else {
                        b = 12;
                    }
                }
                break;
            case -1273813711:
                if (!str.equals(m29913("\b\ufffe�\u0002\uffef\r\ufffe\f\ufffe￼\u000b\u000e\b￬\u0005\u000b￮", 18 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 192).intern())) {
                    b = -1;
                } else {
                    int i9 = f28514 + 91;
                    f28515 = i9 % 128;
                    int i10 = i9 % 2;
                    b = Ascii.ETB;
                }
                break;
            case -1249364341:
                if (!str.equals(m29913("\u0001\uffff\u000e\uffde\r\n", 5 - MotionEvent.axisFromString(""), false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6, 191 - View.MeasureSpec.getMode(0)).intern())) {
                    b = -1;
                } else {
                    int i11 = f28514 + 93;
                    f28515 = i11 % 128;
                    int i12 = i11 % 2;
                    b = Ascii.f22502US;
                }
                break;
            case -1245993915:
                if (!str.equals(m29913("\u000f\f�\uffff\u0001\uffff\u000e￣\u0007\ufffb\u0001\uffff\uffef\f\u0006￭\t", Color.blue(0) + 17, false, Color.green(0) + 4, (ViewConfiguration.getJumpTapTimeout() >> 16) + 191).intern())) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case -1190960472:
                if (!str.equals(m29921((-162387324) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) (KeyEvent.normalizeMetaState(0) + 23), AndroidCharacter.getMirror('0') + 28777, (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (-19) - View.combineMeasuredStates(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22494GS;
                }
                break;
            case -1099149698:
                if (!str.equals(m29913("\u0001\u0003\u0001\f\u0015\ufff0\u0001\u0012\u0005\u0010�\u0001\u000e\uffdf\u0000\u000e�\uffdf\u0000\n￡\u0010", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, true, Gravity.getAbsoluteGravity(0, 0) + 2, 189 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -1091371232:
                if (!str.equals(m29921((-162387409) - (ViewConfiguration.getTapTimeout() >> 16), (short) ((-30) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 440365203, (byte) Color.alpha(0), View.resolveSize(0, 0) - 19).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1016025794:
                if (!str.equals(m29913("�\t￥\u0000\u0000�\u000f\b\u000e\ufff1\u0001\u0003", 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, TextUtils.lastIndexOf("", '0') + 7, View.resolveSize(0, 0) + 189).intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -924327250:
                if (!str.equals(m29921(View.MeasureSpec.getSize(0) - 162387396, (short) ((-75) - Color.green(0)), 440365203 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (Process.myTid() >> 22), (-19) - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case -905814529:
                if (!str.equals(m29921(ExpandableListView.getPackedPositionChild(0L) - 162387280, (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), 440365221 - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-19) - View.resolveSize(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 32;
                }
                break;
            case -890333697:
                if (!str.equals(m29913("\ufffe\t\u0012￭\ufffe\u000f\u0002\r\ufffa\ufffe\u000bￜ\r\ufffe\u0000", ImageFormat.getBitsPerPixel(0) + 16, true, 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), 192 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -887729623:
                if (!str.equals(m29913("\uffff\u0001\ufffb\u0007￣\u000e\uffff\u0001\r\u0006\f\uffef", 11 - TextUtils.lastIndexOf("", '0', 0), true, Color.blue(0) + 8, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 191).intern())) {
                    b = -1;
                }
                break;
            case -869156349:
                if (!str.equals(m29913("\u0005\n\u0004\u0005\t￠", 6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), true, (ViewConfiguration.getEdgeSlop() >> 16) + 2, 196 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 34;
                }
                break;
            case -747967915:
                if (!str.equals(m29913("\t\ufffe\u0001\u0001￦\u0000\f\u000b\ufff2\u000f", (KeyEvent.getMaxKeyCode() >> 16) + 10, false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, TextUtils.lastIndexOf("", '0') + 189).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22490CR;
                }
                break;
            case -333660891:
                if (!str.equals(m29913("\u000b\u0005￬\b\u000e\u000b￼\ufffe\u0000\ufffe\r\uffef\u0002�\ufffe\b￮", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18, false, AndroidCharacter.getMirror('0') - '(', View.MeasureSpec.getMode(0) + 192).intern())) {
                    b = -1;
                } else {
                    int i13 = f28515 + 25;
                    f28514 = i13 % 128;
                    b = i13 % 2 != 0 ? Ascii.CAN : (byte) 9;
                }
                break;
            case -259609707:
                if (!str.equals(m29913("\u0003\u0001\uffff\u000e\u0011\u000b\uffef\b\u000e\ufff1\u0000\u000e�\uffdf\u0000\n￡\u0010\u0001", TextUtils.getCapsMode("", 0, 0) + 19, true, -TextUtils.lastIndexOf("", '0'), 188 - MotionEvent.axisFromString("")).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22493FS;
                }
                break;
            case -140869031:
                if (!str.equals(m29913("\n￭�\ufffb\n\r\u0007￫\f�\uffff�\ufffb\n\r\u0007￫\u0004", 18 - View.getDefaultSize(0, 0), true, 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 193 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC4;
                }
                break;
            case 20418827:
                if (!str.equals(m29921((-162387370) - KeyEvent.keyCodeFromString(""), (short) (Color.blue(0) - 22), TextUtils.indexOf("", "", 0, 0) + 440365221, (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 19).intern())) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 108267695:
                if (!str.equals(m29921((-162387355) - (ViewConfiguration.getScrollBarSize() >> 8), (short) ((-74) - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getWindowTouchSlop() >> 8) + 440365221, (byte) View.resolveSizeAndState(0, 0, 0), (-19) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22491EM;
                }
                break;
            case 177098421:
                if (!str.equals(m29913("\u0000\ufff2\u0005\u0000\u0001\u000b\ufff1\u000e\b�\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, false, 9 - (ViewConfiguration.getWindowTouchSlop() >> 8), 189 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i14 = f28514 + 7;
                    f28515 = i14 % 128;
                    int i15 = i14 % 2;
                    b = Ascii.f22499SI;
                }
                break;
            case 213978610:
                if (!str.equals(m29913("\u0000\u000e\u0000\u000f￠\t\uffff\uffde￼\r\uffff\uffde\r\u0000￼\u000f\u0004\u0011\u0000\uffef\u0014\u000b", Color.argb(0, 0, 0, 0) + 22, false, 1 - (ViewConfiguration.getTapTimeout() >> 16), View.getDefaultSize(0, 0) + FacebookRequestErrorClassification.EC_INVALID_TOKEN).intern())) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case 779164621:
                if (!str.equals(m29913("\ufffb�￭\n\u0004￫\u0007\r\n\ufffb�\u000b�\f￫\u0007\r\n", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, false, ExpandableListView.getPackedPositionGroup(0L) + 11, (ViewConfiguration.getTapTimeout() >> 16) + 193).intern())) {
                    b = -1;
                } else {
                    int i16 = f28514 + 29;
                    f28515 = i16 % 128;
                    b = i16 % 2 == 0 ? (byte) 19 : (byte) 55;
                }
                break;
            case 801466981:
                if (str.equals(m29913("\u0000￢\u0003\r￤\u0003\u0003\u0000\u000b\u0011\ufff4\u0003\u0011", 14 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 186 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 1195083870:
                if (!str.equals(m29921((-162387382) - ExpandableListView.getPackedPositionType(0L), (short) ((-37) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 440365203 - TextUtils.getTrimmedLength(""), (byte) View.MeasureSpec.getMode(0), (-18) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 1323380041:
                if (!str.equals(m29921(TextUtils.lastIndexOf("", '0') - 162387420, (short) (TextUtils.lastIndexOf("", '0') - 22), 440365210 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 19).intern())) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1340011123:
                if (!str.equals(m29913("\u0000\ufffe\r￢￼\b\u0007￮\u000b\u0005\f", 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.red(0) + 192).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1345250484:
                if (!str.equals(m29921((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 162387303, (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 65), 423588005 - Color.rgb(0, 0, 0), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getTouchSlop() >> 8) - 19).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22498RS;
                }
                break;
            case 1939710523:
                if (!str.equals(m29921(Gravity.getAbsoluteGravity(0, 0) - 162387339, (short) ((-25) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ((byte) KeyEvent.getModifierMetaStateMask()) + 440365210, (byte) View.getDefaultSize(0, 0), Color.argb(0, 0, 0, 0) - 19).intern())) {
                    b = -1;
                } else {
                    b = Ascii.SUB;
                }
                break;
            case 2108820561:
                if (!str.equals(m29913("\u0007￣\u000e\uffff\r\uffff�\f\u000f\t￭\u0006\f\uffef\uffff\u0001\ufffb", (KeyEvent.getMaxKeyCode() >> 16) + 17, true, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 5, TextUtils.indexOf((CharSequence) "", '0', 0) + 192).intern())) {
                    b = -1;
                } else {
                    int i17 = f28514 + 83;
                    f28515 = i17 % 128;
                    int i18 = i17 % 2;
                    b = Ascii.NAK;
                }
                break;
            case 2109208793:
                if (!str.equals(m29913("\u000f\u0001\ufff2\u000f\t\u0010\u0004\u0002\u0011￢\u000b\u0001￠\ufffe", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, false, 6 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 188).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return m29922();
            case 1:
                return m29927();
            case 2:
                return m29931();
            case 3:
                return m29914();
            case 4:
                return m29918();
            case 5:
                return Integer.valueOf(m29905().m30302());
            case 6:
                return Integer.valueOf(m29911().m30302());
            case 7:
                m29928((String) m29851(list, 0, String.class));
                return null;
            case 8:
                m29933((List<String>) m29851(list, 0, List.class));
                return null;
            case 9:
                m29919((String) m29851(list, 0, String.class));
                return null;
            case 10:
                m29920((List<String>) m29851(list, 0, List.class));
                return null;
            case 11:
                m29916((String) m29851(list, 0, String.class));
                return null;
            case 12:
                m29917((List<String>) m29851(list, 0, List.class));
                return null;
            case 13:
                m29924((String) m29851(list, 0, String.class));
                return null;
            case 14:
                m29925((List<String>) m29851(list, 0, List.class));
                return null;
            case 15:
                m29932((String) m29851(list, 0, String.class));
                return null;
            case 16:
                m29930((List<String>) m29851(list, 0, List.class));
                return null;
            case 17:
                m29923(EnumC12013hp.m30301(((Integer) m29851(list, 0, Integer.class)).intValue()));
                return null;
            case 18:
                m29915(EnumC12013hp.m30301(((Integer) m29851(list, 0, Integer.class)).intValue()));
                return null;
            case 19:
                m29908((String) m29851(list, 0, String.class));
                return null;
            case 20:
                return m29903();
            case 21:
                m29904((String) m29851(list, 0, String.class));
                return null;
            case 22:
                return m29907();
            case 23:
                m29912((String) m29851(list, 0, String.class));
                return null;
            case 24:
                return m29909();
            case 25:
                m29906((String) m29851(list, 0, String.class));
                return null;
            case 26:
                return m29897();
            case 27:
                m29910((String) m29851(list, 0, String.class));
                return null;
            case 28:
                return m29899();
            case 29:
                return m29902();
            case 30:
                m29926((JSONObject) m29851(list, 0, JSONObject.class));
                return null;
            case 31:
                return m29898();
            case 32:
                m29900((String) m29851(list, 0, String.class));
                return null;
            case 33:
                return m29901();
            case 34:
                return m29896();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29913(String str, int i, boolean z, int i2, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11889d.f28479) {
            char[] cArr2 = new char[i];
            C11889d.f28481 = 0;
            while (C11889d.f28481 < i) {
                C11889d.f28480 = cArr[C11889d.f28481];
                cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                int i4 = C11889d.f28481;
                cArr2[i4] = (char) (cArr2[i4] - f28521);
                C11889d.f28481++;
            }
            if (i2 > 0) {
                C11889d.f28478 = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
            }
            if (z) {
                char[] cArr4 = new char[i];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i) {
                    cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                    C11889d.f28481++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29921(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28517;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28516;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28520 + i] + i4);
                } else {
                    i5 = (short) (f28518[f28520 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28520 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28519);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28516;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28518;
                        int i8 = C12086m.f29836;
                        C12086m.f29836 = i8 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                    }
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
