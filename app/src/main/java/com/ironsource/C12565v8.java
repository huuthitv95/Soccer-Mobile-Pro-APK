package com.ironsource;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.v8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12565v8 {
    /* JADX INFO: renamed from: a */
    public static C12476s8 m33936a(Context context, String str, String str2, String str3, Map<String, String> map) throws Exception {
        C12476s8.a aVar = new C12476s8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.m33303d(map.get("sessionid"));
        }
        aVar.m33298a(context);
        aVar.m33301b(str3);
        return aVar.m33304e(str).m33299a(str2).m33300a();
    }

    /* JADX INFO: renamed from: a */
    public static C11377C5 m33934a(JSONObject jSONObject) {
        return new C11377C5.a(jSONObject.optString(C11341A5.f23827r)).m25571b().m25572b(jSONObject.optBoolean("enabled")).m25567a(new C12529t8()).m25568a(m33937a()).m25569a(false).m25570a();
    }

    /* JADX INFO: renamed from: a */
    private static ArrayList<Pair<String, String>> m33937a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", C11341A5.f23800M));
        arrayList.add(new Pair<>(C11341A5.f23801N, C11341A5.f23802O));
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m33938a(C11660S4 c11660s4) {
        if (c11660s4 == null || c11660s4.m27446g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(c11660s4.m27446g().get("inAppBidding"));
    }

    /* JADX INFO: renamed from: a */
    public static C12386n8.e m33935a(C11660S4 c11660s4, C12386n8.e eVar) {
        if (c11660s4 == null || c11660s4.m27446g() == null || c11660s4.m27446g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(c11660s4.m27446g().get("rewarded"))) {
            return C12386n8.e.RewardedVideo;
        }
        return C12386n8.e.Interstitial;
    }
}
