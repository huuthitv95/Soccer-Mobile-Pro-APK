package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.util.UrlConst;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.y */
/* JADX INFO: loaded from: classes4.dex */
public final class C8432y {

    /* JADX INFO: renamed from: a */
    public final String f18764a;

    /* JADX INFO: renamed from: b */
    public final HashMap f18765b;

    /* JADX INFO: renamed from: c */
    public String f18766c;

    public C8432y(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        String strM20383a;
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            strM20383a = UrlConst.HTTPS + IAConfigManager.f17654M.f17677i.f17794f;
        } else {
            strM20383a = AbstractC7945a.m20383a(property, "Event");
        }
        this.f18766c = null;
        if (TextUtils.isEmpty(strM20383a)) {
            throw new InvalidParameterException();
        }
        this.f18765b = new HashMap();
        this.f18764a = strM20383a;
        m20810a(str7 == null ? "8.4.3" : str7, C11540L6.f24946V);
        m20810a(AbstractC9174o.f21470a.getPackageName(), "pkgn");
        if (IAConfigManager.m20377c()) {
            return;
        }
        m20810a(C11744X3.f26142d, "osn");
        m20810a(Build.VERSION.RELEASE, C11540L6.f24914G);
        m20810a(AbstractC9162k.m21974j(), C11540L6.f24899B);
        m20810a(AbstractC9162k.m21976l(), "pkgv");
        m20810a(str, "appid");
        m20810a(str2, "session");
        m20810a(str3, "adnt");
        m20810a(l, "adnt_id");
        m20810a(str4, CampaignEx.JSON_KEY_CREATIVE_ID);
        m20810a(str5, "adomain");
        m20810a(str6, FirebaseAnalytics.Param.CAMPAIGN_ID);
    }

    /* JADX INFO: renamed from: a */
    public final void m20810a(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.f18765b.put(str, obj);
    }
}
