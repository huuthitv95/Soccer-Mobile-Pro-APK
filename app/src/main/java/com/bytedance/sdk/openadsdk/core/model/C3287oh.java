package com.bytedance.sdk.openadsdk.core.model;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.oh */
/* JADX INFO: loaded from: classes3.dex */
public class C3287oh {

    /* JADX INFO: renamed from: di */
    private ri f11316di;

    /* JADX INFO: renamed from: fi */
    private JSONObject f11317fi;

    /* JADX INFO: renamed from: ik */
    private String f11318ik;

    /* JADX INFO: renamed from: ka */
    private String f11319ka;

    /* JADX INFO: renamed from: lr */
    private String f11320lr;

    /* JADX INFO: renamed from: ri */
    private String f11321ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.oh$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        private JSONArray f11322ik;

        /* JADX INFO: renamed from: lr */
        private JSONArray f11323lr;

        /* JADX INFO: renamed from: ri */
        private JSONArray f11324ri;

        /* JADX INFO: renamed from: ri */
        public static ri m14231ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            ri riVar = new ri();
            riVar.m14237ri(jSONArrayOptJSONArray);
            riVar.m14235lr(jSONObject.optJSONArray(RemoteConfigComponent.FETCH_FILE_NAME));
            riVar.m14233ik(jSONObject.optJSONArray("script"));
            return riVar;
        }

        /* JADX INFO: renamed from: ik */
        public JSONArray m14232ik() {
            return this.f11322ik;
        }

        /* JADX INFO: renamed from: ik */
        public void m14233ik(JSONArray jSONArray) {
            this.f11322ik = jSONArray;
        }

        /* JADX INFO: renamed from: lr */
        public JSONArray m14234lr() {
            return this.f11323lr;
        }

        /* JADX INFO: renamed from: lr */
        public void m14235lr(JSONArray jSONArray) {
            this.f11323lr = jSONArray;
        }

        /* JADX INFO: renamed from: ri */
        public JSONArray m14236ri() {
            return this.f11324ri;
        }

        /* JADX INFO: renamed from: ri */
        public void m14237ri(JSONArray jSONArray) {
            this.f11324ri = jSONArray;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3287oh m14224ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3287oh c3287oh = new C3287oh();
        c3287oh.f11321ri = jSONObject.optString("id");
        c3287oh.f11319ka = jSONObject.optString("data");
        c3287oh.f11318ik = jSONObject.optString("url");
        c3287oh.f11320lr = jSONObject.optString("md5");
        c3287oh.f11317fi = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            c3287oh.f11316di = ri.m14231ri(jSONObjectOptJSONObject);
        }
        return c3287oh;
    }

    /* JADX INFO: renamed from: di */
    public ri m14225di() {
        return this.f11316di;
    }

    /* JADX INFO: renamed from: fi */
    public JSONObject m14226fi() {
        return this.f11317fi;
    }

    /* JADX INFO: renamed from: ik */
    public String m14227ik() {
        return this.f11318ik;
    }

    /* JADX INFO: renamed from: ka */
    public String m14228ka() {
        return this.f11319ka;
    }

    /* JADX INFO: renamed from: lr */
    public String m14229lr() {
        return this.f11320lr;
    }

    /* JADX INFO: renamed from: ri */
    public String m14230ri() {
        return this.f11321ri;
    }
}
