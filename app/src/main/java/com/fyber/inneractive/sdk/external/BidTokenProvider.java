package com.fyber.inneractive.sdk.external;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.C7855b;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class BidTokenProvider {
    public static String getBidderToken() {
        if (!InneractiveAdManager.wasInitialized()) {
            IAlog.m21946b("BidTokenProvider: Cannot generate token. Please init Fyber Marketplace SDK.", new Object[0]);
            return null;
        }
        C7855b c7855b = C7855b.f17518h;
        c7855b.getClass();
        if (IAConfigManager.m20377c()) {
            IAlog.m21945a("%sTCF purpose 1 disabled, returning null", IAlog.m21943a(c7855b));
            return null;
        }
        if (c7855b.f17523e.get() == null) {
            synchronized (c7855b.f17525g) {
                c7855b.m20340b();
            }
        } else {
            c7855b.m20342d();
        }
        String str = (String) c7855b.f17523e.get();
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        String str2 = iAConfigManager.f17680l;
        C8021o c8021o = iAConfigManager.f17688t.f17862b;
        String str3 = "token_size_limit";
        int iM20443a = c8021o.m20443a("token_size_limit", 4000, 1);
        if (!TextUtils.isEmpty(str2)) {
            str3 = "token_size_limit_" + str2.toLowerCase(Locale.US);
        }
        int iM20443a2 = c8021o.m20443a(str3, iM20443a, 1);
        if (str == null || str.getBytes().length <= iM20443a2) {
            IAlog.m21947c("token = %s", str);
            return str;
        }
        C8428w c8428w = new C8428w(EnumC8415t.TOKEN_EXCEEDS_LIMIT);
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        try {
            jSONObject.put("mediator", str2);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "mediator", str2);
        }
        Integer numValueOf = Integer.valueOf(str.getBytes().length);
        try {
            jSONObject.put("token_size", numValueOf);
        } catch (Exception unused2) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "token_size", numValueOf);
        }
        Integer numValueOf2 = Integer.valueOf(iM20443a2);
        try {
            jSONObject.put("token_limit", numValueOf2);
        } catch (Exception unused3) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "token_limit", numValueOf2);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
        IAlog.m21947c("token exceeds the limit, returning null", new Object[0]);
        return null;
    }
}
