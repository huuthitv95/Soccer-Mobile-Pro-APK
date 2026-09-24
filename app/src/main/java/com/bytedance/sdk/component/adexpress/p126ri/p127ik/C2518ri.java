package com.bytedance.sdk.component.adexpress.p126ri.p127ik;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ri.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2518ri {

    /* JADX INFO: renamed from: di */
    private String f6982di;

    /* JADX INFO: renamed from: fi */
    private lr f6983fi;

    /* JADX INFO: renamed from: ik */
    private String f6984ik;

    /* JADX INFO: renamed from: ka */
    private List<ri> f6985ka;

    /* JADX INFO: renamed from: lr */
    private String f6986lr;

    /* JADX INFO: renamed from: ri */
    private String f6987ri;
    private Map<String, C2518ri> xha = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ri.ik.ri$lr */
    public static class lr {

        /* JADX INFO: renamed from: ik */
        private List<Pair<String, String>> f6988ik;

        /* JADX INFO: renamed from: lr */
        private String f6989lr;

        /* JADX INFO: renamed from: ri */
        private String f6990ri;

        /* JADX INFO: renamed from: lr */
        public List<Pair<String, String>> m9052lr() {
            return this.f6988ik;
        }

        /* JADX INFO: renamed from: lr */
        public void m9053lr(String str) {
            this.f6989lr = str;
        }

        /* JADX INFO: renamed from: ri */
        public String m9054ri() {
            return this.f6990ri;
        }

        /* JADX INFO: renamed from: ri */
        public void m9055ri(String str) {
            this.f6990ri = str;
        }

        /* JADX INFO: renamed from: ri */
        public void m9056ri(List<Pair<String, String>> list) {
            this.f6988ik = list;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ri.ik.ri$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        private int f6991ik;

        /* JADX INFO: renamed from: lr */
        private String f6992lr;

        /* JADX INFO: renamed from: ri */
        private String f6993ri;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof ri)) {
                return super.equals(obj);
            }
            String str2 = this.f6993ri;
            if (str2 != null) {
                ri riVar = (ri) obj;
                if (str2.equals(riVar.m9060ri()) && (str = this.f6992lr) != null && str.equals(riVar.m9058lr())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ik */
        public int m9057ik() {
            return this.f6991ik;
        }

        /* JADX INFO: renamed from: lr */
        public String m9058lr() {
            return this.f6992lr;
        }

        /* JADX INFO: renamed from: lr */
        public void m9059lr(String str) {
            this.f6992lr = str;
        }

        /* JADX INFO: renamed from: ri */
        public String m9060ri() {
            return this.f6993ri;
        }

        /* JADX INFO: renamed from: ri */
        public void m9061ri(int i) {
            this.f6991ik = i;
        }

        /* JADX INFO: renamed from: ri */
        public void m9062ri(String str) {
            this.f6993ri = str;
        }
    }

    /* JADX INFO: renamed from: fi */
    public static C2518ri m9034fi(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m9035ri(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2518ri m9035ri(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        C2518ri c2518ri = new C2518ri();
        c2518ri.m9048ri(jSONObject.optString("name"));
        c2518ri.m9043lr(jSONObject.optString("version"));
        c2518ri.m9039ik(jSONObject.optString(C11744X3.i.f26354Z));
        c2518ri.m9041ka(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                ri riVar = new ri();
                riVar.m9062ri(jSONObjectOptJSONObject2.optString("url"));
                riVar.m9059lr(jSONObjectOptJSONObject2.optString("md5"));
                riVar.m9061ri(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(riVar);
            }
        }
        c2518ri.m9049ri(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    C2518ri c2518riM9035ri = m9035ri(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (c2518riM9035ri != null) {
                        c2518ri.m9046ri().put(next, c2518riM9035ri);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            lr lrVar = new lr();
            lrVar.m9055ri(jSONObjectOptJSONObject.optString("url"));
            lrVar.m9053lr(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                lrVar.m9056ri(arrayList2);
            }
            c2518ri.m9047ri(lrVar);
        }
        if (c2518ri.m9044mj()) {
            return c2518ri;
        }
        return null;
    }

    /* JADX INFO: renamed from: di */
    public List<ri> m9036di() {
        if (this.f6985ka == null) {
            this.f6985ka = new ArrayList();
        }
        return this.f6985ka;
    }

    /* JADX INFO: renamed from: fi */
    public lr m9037fi() {
        return this.f6983fi;
    }

    /* JADX INFO: renamed from: ik */
    public String m9038ik() {
        return this.f6986lr;
    }

    /* JADX INFO: renamed from: ik */
    public void m9039ik(String str) {
        this.f6984ik = str;
    }

    public JSONObject jbs() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", m9042lr());
            jSONObject.putOpt("version", m9038ik());
            jSONObject.putOpt(C11744X3.i.f26354Z, m9040ka());
            if (!TextUtils.isEmpty(this.f6982di)) {
                jSONObject.put("template_fetch_url", this.f6982di);
            }
            JSONArray jSONArray = new JSONArray();
            if (m9036di() != null) {
                for (ri riVar : m9036di()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", riVar.m9060ri());
                    jSONObject2.putOpt("md5", riVar.m9058lr());
                    jSONObject2.putOpt("level", Integer.valueOf(riVar.m9057ik()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.xha.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.xha.keySet()) {
                    C2518ri c2518ri = this.xha.get(str);
                    if (c2518ri != null) {
                        jSONObject3.put(str, c2518ri.jbs());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            lr lrVarM9037fi = m9037fi();
            if (lrVarM9037fi != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", lrVarM9037fi.f6990ri);
                jSONObject4.put("md5", lrVarM9037fi.f6989lr);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listM9052lr = lrVarM9037fi.m9052lr();
                if (listM9052lr != null) {
                    for (Pair<String, String> pair : listM9052lr) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ka */
    public String m9040ka() {
        return this.f6984ik;
    }

    /* JADX INFO: renamed from: ka */
    public void m9041ka(String str) {
        this.f6982di = str;
    }

    /* JADX INFO: renamed from: lr */
    public String m9042lr() {
        return this.f6987ri;
    }

    /* JADX INFO: renamed from: lr */
    public void m9043lr(String str) {
        this.f6986lr = str;
    }

    /* JADX INFO: renamed from: mj */
    public boolean m9044mj() {
        return (TextUtils.isEmpty(m9040ka()) || TextUtils.isEmpty(m9038ik()) || TextUtils.isEmpty(m9042lr())) ? false : true;
    }

    /* JADX INFO: renamed from: qt */
    public String m9045qt() {
        JSONObject jSONObjectJbs;
        if (!m9044mj() || (jSONObjectJbs = jbs()) == null) {
            return null;
        }
        return jSONObjectJbs.toString();
    }

    /* JADX INFO: renamed from: ri */
    public Map<String, C2518ri> m9046ri() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ri */
    public void m9047ri(lr lrVar) {
        this.f6983fi = lrVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m9048ri(String str) {
        this.f6987ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m9049ri(List<ri> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f6985ka = list;
    }

    public String xha() {
        return this.f6982di;
    }
}
