package com.fyber.inneractive.sdk.config.remote;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.remote.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8030b {

    /* JADX INFO: renamed from: a */
    public UnitDisplayType f17825a;

    /* JADX INFO: renamed from: b */
    public Boolean f17826b;

    /* JADX INFO: renamed from: c */
    public Integer f17827c;

    /* JADX INFO: renamed from: d */
    public Integer f17828d;

    /* JADX INFO: renamed from: a */
    public static C8030b m20450a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C8030b c8030b = new C8030b();
        int iOptInt = jSONObject.optInt(MessengerShareContentUtility.SHARE_BUTTON_HIDE, Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt(ToolBar.REFRESH, Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        c8030b.f17825a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        c8030b.f17826b = jSONObject.has("close") ? Boolean.valueOf(jSONObject.optBoolean("close", true)) : null;
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        c8030b.f17828d = numValueOf;
        c8030b.f17827c = iOptInt2 != Integer.MIN_VALUE ? numValueOf2 : null;
        return c8030b;
    }
}
