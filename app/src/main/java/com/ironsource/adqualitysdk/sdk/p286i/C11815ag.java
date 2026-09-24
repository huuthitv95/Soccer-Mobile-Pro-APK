package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ag */
/* JADX INFO: loaded from: classes6.dex */
public final class C11815ag implements Comparable<C11815ag> {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27115 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27116 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static long f27117 = -7896301694476326221L;

    /* JADX INFO: renamed from: ｋ */
    private C12054jc f27118;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C11815ag c11815ag) {
        int i = 2 % 2;
        int i2 = f27115 + 89;
        f27116 = i2 % 128;
        int i3 = i2 % 2;
        int iM28412 = m28412(c11815ag);
        int i4 = f27116 + 39;
        f27115 = i4 % 128;
        if (i4 % 2 != 0) {
            return iM28412;
        }
        throw null;
    }

    public C11815ag(C12054jc c12054jc) {
        this.f27118 = c12054jc;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized JSONObject m28416() {
        JSONObject jSONObjectM30621;
        int i = 2 % 2;
        int i2 = f27116 + 69;
        f27115 = i2 % 128;
        int i3 = i2 % 2;
        jSONObjectM30621 = this.f27118.m30621();
        int i4 = f27116 + 65;
        f27115 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectM30621;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized void m28417(int i) {
        int i2 = 2 % 2;
        int i3 = f27116 + 31;
        f27115 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f27118.m30621() != null) {
            int i5 = f27115 + 89;
            f27116 = i5 % 128;
            if (i5 % 2 != 0) {
                C12077jz.m30808(this.f27118.m30621(), i, m28413());
                throw null;
            }
            C12077jz.m30808(this.f27118.m30621(), i, m28413());
            int i6 = 2 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static List<String> m28413() {
        int i = 2 % 2;
        int i2 = f27116 + 103;
        f27115 = i2 % 128;
        int i3 = i2 % 2;
        List<String> listAsList = Arrays.asList(C12035ik.f29376);
        int i4 = f27116 + 27;
        f27115 = i4 % 128;
        int i5 = i4 % 2;
        return listAsList;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final C12054jc m28415() {
        int i = 2 % 2;
        int i2 = f27115;
        int i3 = i2 + 113;
        f27116 = i3 % 128;
        int i4 = i3 % 2;
        C12054jc c12054jc = this.f27118;
        int i5 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27116 = i5 % 128;
        if (i5 % 2 == 0) {
            return c12054jc;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ */
    private long m28410() {
        JSONObject jSONObjectM28416;
        int trimmedLength;
        int i = 2 % 2;
        int i2 = f27115 + 33;
        f27116 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM28416 = m28416();
            TextUtils.getTrimmedLength("");
            trimmedLength = 0;
        } else {
            jSONObjectM28416 = m28416();
            trimmedLength = TextUtils.getTrimmedLength("") + 1;
        }
        return jSONObjectM28416.optLong(m28414("尬짖屘ꌖ\ue887ǽ", trimmedLength).intern());
    }

    /* JADX INFO: renamed from: ﮐ */
    private long m28408() {
        JSONObject jSONObjectM28416;
        String strM28414;
        int i = 2 % 2;
        int i2 = f27115 + 101;
        f27116 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM28416 = m28416();
            strM28414 = m28414("\ue995⨗\ue9f0䃊\ue41c⓸", 1 - (TypedValue.complexToFloat(1) > 0.0f ? 1 : (TypedValue.complexToFloat(1) == 0.0f ? 0 : -1)));
        } else {
            jSONObjectM28416 = m28416();
            strM28414 = m28414("\ue995⨗\ue9f0䃊\ue41c⓸", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1);
        }
        return jSONObjectM28416.optInt(strM28414.intern());
    }

    /* JADX INFO: renamed from: ﺙ */
    private String m28409() {
        int i = 2 % 2;
        int i2 = f27115 + 83;
        f27116 = i2 % 128;
        int i3 = i2 % 2;
        String strM30619 = this.f27118.m30619();
        int i4 = f27116 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27115 = i4 % 128;
        int i5 = i4 % 2;
        return strM30619;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final String m28419() {
        JSONObject jSONObjectM28416;
        int i;
        int i2 = 2 % 2;
        int i3 = f27115 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27116 = i3 % 128;
        if (i3 % 2 != 0) {
            jSONObjectM28416 = m28416();
            i = 1;
        } else {
            jSONObjectM28416 = m28416();
            i = 0;
        }
        String strOptString = jSONObjectM28416.optString(m28414("㾣䲾㿓♡攐嶽뀑᷊", -ImageFormat.getBitsPerPixel(i)).intern());
        int i4 = f27116 + 15;
        f27115 = i4 % 128;
        int i5 = i4 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ｋ */
    public final String m28418() {
        int i = 2 % 2;
        int i2 = f27116 + 59;
        f27115 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = m28416().optString(m28414("킄芅탱\ue85f芳\uf71f垱", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1).intern(), null);
        int i4 = f27115 + 75;
        f27116 = i4 % 128;
        int i5 = i4 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m28420(String str) {
        int i = 2 % 2;
        int i2 = f27116 + 87;
        f27115 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m28416().put(m28414("킄芅탱\ue85f芳\uf71f垱", ExpandableListView.getPackedPositionGroup(0L) + 1).intern(), str);
            int i4 = f27115 + 33;
            f27116 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f27115 + 43;
        f27116 = i2 % 128;
        int i3 = i2 % 2;
        String string = m28416().toString();
        int i4 = f27115 + 17;
        f27116 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f27116;
        int i3 = i2 + 51;
        f27115 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 27;
            f27115 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m28409().equals(((C11815ag) obj).m28409());
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f27115 + 81;
        f27116 = i2 % 128;
        int i3 = i2 % 2;
        if (m28416() != null) {
            return m28416().hashCode();
        }
        int i4 = f27116 + 97;
        f27115 = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    /* JADX INFO: renamed from: ﾇ */
    private int m28412(C11815ag c11815ag) {
        int i = 2 % 2;
        long jM28410 = m28410();
        long jM28411 = c11815ag.m28410();
        if (jM28410 >= jM28411) {
            if (jM28410 != jM28411) {
                return 1;
            }
            int iM28411 = m28411(c11815ag);
            int i2 = f27116 + 25;
            f27115 = i2 % 128;
            int i3 = i2 % 2;
            return iM28411;
        }
        int i4 = f27116;
        int i5 = i4 + 97;
        f27115 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i6 = i4 + 3;
        f27115 = i6 % 128;
        if (i6 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private int m28411(C11815ag c11815ag) {
        int i = 2 % 2;
        long jM28408 = m28408();
        long jM28409 = c11815ag.m28408();
        if (jM28408 < jM28409) {
            int i2 = f27115;
            int i3 = i2 + 31;
            f27116 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 83;
            f27116 = i5 % 128;
            int i6 = i5 % 2;
            return -1;
        }
        if (jM28408 == jM28409) {
            int i7 = f27116 + 75;
            f27115 = i7 % 128;
            int i8 = i7 % 2;
            return 0;
        }
        int i9 = f27116 + 75;
        f27115 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 64 / 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28414(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f27117, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27117));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
