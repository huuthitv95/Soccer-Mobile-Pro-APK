package com.bytedance.adsdk.ugeno.p101ka;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2285di {

    /* JADX INFO: renamed from: lr */
    private List<ri> f5779lr;

    /* JADX INFO: renamed from: ri */
    private ri f5780ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.di$ri */
    public static class ri {

        /* JADX INFO: renamed from: di */
        private Map<String, Object> f5781di;

        /* JADX INFO: renamed from: fi */
        private Map<String, String> f5782fi;

        /* JADX INFO: renamed from: ik */
        private String f5783ik = "global";

        /* JADX INFO: renamed from: ka */
        private String f5784ka;

        /* JADX INFO: renamed from: lr */
        private String f5785lr;

        /* JADX INFO: renamed from: ri */
        private String f5786ri;

        /* JADX INFO: renamed from: fi */
        public String m7746fi() {
            return this.f5785lr;
        }

        /* JADX INFO: renamed from: ik */
        public Map<String, String> m7747ik() {
            return this.f5782fi;
        }

        /* JADX INFO: renamed from: ik */
        public void m7748ik(String str) {
            this.f5786ri = str;
        }

        /* JADX INFO: renamed from: ka */
        public String m7749ka() {
            return this.f5786ri;
        }

        /* JADX INFO: renamed from: ka */
        public void m7750ka(String str) {
            this.f5785lr = str;
        }

        /* JADX INFO: renamed from: lr */
        public String m7751lr() {
            return this.f5784ka;
        }

        /* JADX INFO: renamed from: lr */
        public void m7752lr(String str) {
            this.f5784ka = str;
        }

        /* JADX INFO: renamed from: lr */
        public void m7753lr(Map<String, Object> map) {
            this.f5781di = map;
        }

        /* JADX INFO: renamed from: ri */
        public String m7754ri() {
            return this.f5783ik;
        }

        /* JADX INFO: renamed from: ri */
        public void m7755ri(String str) {
            this.f5783ik = str;
        }

        /* JADX INFO: renamed from: ri */
        public void m7756ri(Map<String, String> map) {
            this.f5782fi = map;
        }

        public String toString() {
            return "Action{scheme='" + this.f5783ik + "', name='" + this.f5784ka + "', params=" + this.f5782fi + ", host='" + this.f5785lr + "', origin='" + this.f5786ri + "', extra=" + this.f5781di + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2285di m7743ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        C2285di c2285di = new C2285di();
        String strOptString = jSONObject.optString(DebugKt.DEBUG_PROPERTY_VALUE_ON);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        c2285di.f5780ri = C2284co.m7742ri(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            ri riVarM7742ri = C2284co.m7742ri(jSONArrayOptJSONArray.optString(i), jSONObject2);
            if (riVarM7742ri != null) {
                arrayList.add(riVarM7742ri);
            }
        }
        c2285di.f5779lr = arrayList;
        return c2285di;
    }

    /* JADX INFO: renamed from: lr */
    public List<ri> m7744lr() {
        return this.f5779lr;
    }

    /* JADX INFO: renamed from: ri */
    public ri m7745ri() {
        return this.f5780ri;
    }
}
