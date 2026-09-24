package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;
import com.tiktok.util.UrlConst;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7945a {
    /* JADX INFO: renamed from: a */
    public static C8028r0 m20382a(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        HashMap map = iAConfigManager.f17670b;
        if (map != null && map.containsKey(str)) {
            return (C8028r0) iAConfigManager.f17670b.get(str);
        }
        IAlog.m21947c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m20383a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return UrlConst.HTTPS + str + "/simpleM2M/" + str2;
        }
        return UrlConst.HTTPS + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
