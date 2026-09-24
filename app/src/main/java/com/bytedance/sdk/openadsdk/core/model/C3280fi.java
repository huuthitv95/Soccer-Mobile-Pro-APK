package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p190aw.C3103qt;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3280fi {

    /* JADX INFO: renamed from: lr */
    private C3283ka f11233lr;

    /* JADX INFO: renamed from: ri */
    private ArrayList<ri> f11234ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.fi$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        private C3097ka f11235ik;

        /* JADX INFO: renamed from: ka */
        private Set<C3103qt> f11236ka;

        /* JADX INFO: renamed from: lr */
        private final String f11237lr;

        /* JADX INFO: renamed from: ri */
        private final String f11238ri;

        public ri(JSONObject jSONObject) {
            this.f11238ri = jSONObject.optString("vast_url");
            this.f11237lr = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                C3097ka c3097ka = new C3097ka();
                this.f11235ik = c3097ka;
                c3097ka.m12489ri(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.f11236ka = C3103qt.m12525ri(jSONArrayOptJSONArray);
            }
        }

        /* JADX INFO: renamed from: ik */
        public String m14115ik() {
            return this.f11238ri;
        }

        /* JADX INFO: renamed from: ka */
        public String m14116ka() {
            return this.f11237lr;
        }

        /* JADX INFO: renamed from: lr */
        public Set<C3103qt> m14117lr() {
            return this.f11236ka;
        }

        /* JADX INFO: renamed from: ri */
        public C3097ka m14118ri() {
            return this.f11235ik;
        }

        /* JADX INFO: renamed from: ri */
        public void m14119ri(C3097ka c3097ka) {
            this.f11235ik = c3097ka;
        }

        /* JADX INFO: renamed from: ri */
        public void m14120ri(Set<C3103qt> set) {
            this.f11236ka = set;
        }
    }

    public C3280fi(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            ri riVar = new ri(jSONArray.optJSONObject(i));
            if (this.f11234ri == null) {
                this.f11234ri = new ArrayList<>();
            }
            this.f11234ri.add(riVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m14111ri(wjv wjvVar) {
        if (wjvVar == null || wjvVar.ory()) {
            return false;
        }
        int iLji = wjvVar.lji();
        int iM14552vz = wjvVar.m14552vz();
        return (iLji == 3 || iLji == 7 || iLji == 8) && (iM14552vz == 5 || iM14552vz == 15 || iM14552vz == 50);
    }

    /* JADX INFO: renamed from: ik */
    public boolean m14112ik() {
        ArrayList<ri> arrayList = this.f11234ri;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: lr */
    public C3283ka m14113lr() {
        if (this.f11233lr == null) {
            this.f11233lr = new C3283ka();
            ArrayList<ri> arrayList = this.f11234ri;
            if (arrayList != null) {
                for (ri riVar : arrayList) {
                    C3097ka c3097kaM14118ri = riVar.m14118ri();
                    Set<C3103qt> setM14117lr = riVar.m14117lr();
                    if (c3097kaM14118ri != null) {
                        this.f11233lr.m14188ri().m12483ri(c3097kaM14118ri);
                    }
                    if (setM14117lr != null) {
                        this.f11233lr.m14186lr().addAll(setM14117lr);
                    }
                }
            }
        }
        return this.f11233lr;
    }

    /* JADX INFO: renamed from: ri */
    public ArrayList<ri> m14114ri() {
        return this.f11234ri;
    }
}
