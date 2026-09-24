package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dp */
/* JADX INFO: loaded from: classes6.dex */
public final class C11905dp {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28639 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static long f28640 = -7003100162638185398L;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28641 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private String f28642;

    /* JADX INFO: renamed from: ﻐ */
    private List<String> f28643;

    /* JADX INFO: renamed from: ﻛ */
    private String f28644;

    /* JADX INFO: renamed from: ｋ */
    private ISAdQualityAdType f28645;

    /* JADX INFO: renamed from: ﾇ */
    private JSONObject f28646;

    /* JADX INFO: renamed from: ﾒ */
    private String f28647;

    public C11905dp(JSONObject jSONObject) {
        this.f28645 = ISAdQualityAdType.UNKNOWN;
        this.f28644 = C11914dy.m30142(jSONObject.optString(m30039("簾琶氰搠", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2053).intern()));
        String strM30142 = C11914dy.m30142(jSONObject.optString(m30039("簫\ue095䕨ꨂ໖玈", (ViewConfiguration.getEdgeSlop() >> 16) + 40123).intern()));
        if (!TextUtils.isEmpty(strM30142)) {
            this.f28645 = ISAdQualityAdType.fromInt(Integer.parseInt(strM30142));
        }
        this.f28646 = jSONObject.optJSONObject(m30039("簺镴꺆쀶\ud95b\uf2e2", 59743 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        this.f28643 = C12077jz.m30800(jSONObject, m30039("簫踦頠ꨎ됀왨큤\ue24a\uec57ﺾ", 61966 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new ArrayList());
        this.f28647 = C11914dy.m30142(jSONObject.optString(m30039("簼\u0a0e遵Ẻ꒸㋂뤨䜅쵇宭", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30252).intern()));
        this.f28642 = C11914dy.m30142(jSONObject.optString(m30039("簽웲\u0992䲋靗\uda7eᴓ怲ꫥ\uedea゜筁빳ā", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 47837).intern()));
    }

    /* JADX INFO: renamed from: ﾇ */
    public final String m30044() {
        int i = 2 % 2;
        int i2 = f28639;
        int i3 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28641 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f28644;
        int i5 = i2 + 15;
        f28641 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ */
    public final ISAdQualityAdType m30043() {
        int i = 2 % 2;
        int i2 = f28639 + 61;
        int i3 = i2 % 128;
        f28641 = i3;
        int i4 = i2 % 2;
        ISAdQualityAdType iSAdQualityAdType = this.f28645;
        int i5 = i3 + 81;
        f28639 = i5 % 128;
        if (i5 % 2 == 0) {
            return iSAdQualityAdType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final JSONObject m30045() {
        int i = 2 % 2;
        int i2 = f28641 + 49;
        f28639 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f28646;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final List<String> m30041() {
        int i = 2 % 2;
        int i2 = f28641 + 47;
        f28639 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f28643;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final String m30042() {
        int i = 2 % 2;
        int i2 = f28641;
        int i3 = i2 + 21;
        f28639 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f28647;
        int i4 = i2 + 27;
        f28639 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final String m30040() {
        int i = 2 % 2;
        int i2 = f28639 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f28641 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f28642;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30039(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f28640);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
