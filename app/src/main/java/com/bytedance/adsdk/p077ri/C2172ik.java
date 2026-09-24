package com.bytedance.adsdk.p077ri;

import com.bytedance.adsdk.p077ri.p078lr.C2217ri;
import com.bytedance.adsdk.p077ri.p078lr.p086ri.C2218ri;
import com.bytedance.adsdk.ugeno.p094ik.InterfaceC2269ri;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2172ik implements InterfaceC2269ri {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ri.ik$ri */
    static class ri implements InterfaceC2269ri.ri {

        /* JADX INFO: renamed from: lr */
        private String f5407lr;

        /* JADX INFO: renamed from: ri */
        private C2217ri f5408ri;

        private ri(String str) {
            this.f5407lr = str;
            this.f5408ri = C2217ri.m7302ri(str);
        }

        /* JADX INFO: renamed from: ri */
        public static ri m7218ri(String str) {
            return new ri(str);
        }

        @Override // com.bytedance.adsdk.ugeno.p094ik.InterfaceC2269ri.ri
        /* JADX INFO: renamed from: ri */
        public Object mo7219ri(JSONObject jSONObject) {
            C2217ri c2217ri = this.f5408ri;
            if (c2217ri == null) {
                return this.f5407lr;
            }
            Object objM7305ri = c2217ri.m7305ri(jSONObject);
            if (objM7305ri instanceof String) {
                return objM7305ri;
            }
            if (objM7305ri instanceof C2218ri) {
                return String.valueOf(slm.m7313ri((C2218ri) objM7305ri));
            }
            if (objM7305ri == null || !objM7305ri.getClass().isArray()) {
                return String.valueOf(objM7305ri);
            }
            try {
                return new JSONArray(objM7305ri).toString();
            } catch (JSONException unused) {
                return String.valueOf(objM7305ri);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p094ik.InterfaceC2269ri
    /* JADX INFO: renamed from: ri */
    public InterfaceC2269ri.ri mo7217ri(String str) {
        return ri.m7218ri(str);
    }
}
