package com.bytedance.adsdk.ugeno.p101ka;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2284co {
    /* JADX INFO: renamed from: ri */
    public static C2285di.ri m7742ri(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C2285di.ri riVar = new C2285di.ri();
        String strM7663ri = C2268lr.m7663ri(str, jSONObject);
        if (strM7663ri.contains("#")) {
            strM7663ri = strM7663ri.replace("#", "%23");
        }
        Uri uri = Uri.parse(strM7663ri);
        if (uri == null) {
            return null;
        }
        riVar.m7748ik(strM7663ri);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            riVar.m7755ri(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        riVar.m7752lr(authority);
        riVar.m7750ka(riVar.m7754ri() + "://" + riVar.m7751lr());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, C2268lr.m7663ri(uri.getQueryParameter(str2), jSONObject));
            }
        }
        riVar.m7756ri(map);
        return riVar;
    }
}
