package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import com.bytedance.adsdk.ugeno.xha.C2346lr;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: di */
    private JSONObject f5577di;

    /* JADX INFO: renamed from: fi */
    private String f5578fi;

    /* JADX INFO: renamed from: ik */
    private String f5579ik;
    private float jbs;

    /* JADX INFO: renamed from: ka */
    private JSONObject f5580ka;

    /* JADX INFO: renamed from: lr */
    private JSONObject f5581lr;

    /* JADX INFO: renamed from: mj */
    private float f5582mj;

    /* JADX INFO: renamed from: ri */
    private JSONObject f5583ri;
    private boolean xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.xha$ri */
    public static class C2248ri {

        /* JADX INFO: renamed from: di */
        private C2248ri f5584di;

        /* JADX INFO: renamed from: fi */
        private LinkedList<C2248ri> f5585fi;

        /* JADX INFO: renamed from: ik */
        private JSONObject f5586ik;
        private boolean jbs;

        /* JADX INFO: renamed from: ka */
        private JSONObject f5587ka;

        /* JADX INFO: renamed from: lr */
        private String f5588lr;

        /* JADX INFO: renamed from: mj */
        private String f5589mj;

        /* JADX INFO: renamed from: qt */
        private boolean f5590qt;

        /* JADX INFO: renamed from: ri */
        private String f5591ri;
        private String xha;

        /* JADX INFO: renamed from: di */
        public JSONObject m7459di() {
            return this.f5587ka;
        }

        /* JADX INFO: renamed from: fi */
        public List<C2248ri> m7460fi() {
            return this.f5585fi;
        }

        /* JADX INFO: renamed from: ik */
        public String m7461ik() {
            return this.f5588lr;
        }

        /* JADX INFO: renamed from: ka */
        public JSONObject m7462ka() {
            return this.f5586ik;
        }

        /* JADX INFO: renamed from: lr */
        public String m7463lr() {
            return this.xha;
        }

        /* JADX INFO: renamed from: lr */
        public void m7464lr(C2248ri c2248ri) {
            if (this.f5585fi == null) {
                this.f5585fi = new LinkedList<>();
            }
            this.f5585fi.addLast(c2248ri);
        }

        /* JADX INFO: renamed from: lr */
        public void m7465lr(boolean z) {
            this.f5590qt = z;
        }

        /* JADX INFO: renamed from: ri */
        public String m7466ri() {
            return this.f5591ri;
        }

        /* JADX INFO: renamed from: ri */
        public void m7467ri(int i, C2248ri c2248ri) {
            if (this.f5585fi == null) {
                this.f5585fi = new LinkedList<>();
            }
            this.f5585fi.add(i, c2248ri);
        }

        /* JADX INFO: renamed from: ri */
        public void m7468ri(C2248ri c2248ri) {
            if (this.f5585fi == null) {
                this.f5585fi = new LinkedList<>();
            }
            this.f5585fi.add(c2248ri);
        }

        /* JADX INFO: renamed from: ri */
        public void m7469ri(String str) {
            this.f5588lr = str;
        }

        /* JADX INFO: renamed from: ri */
        public void m7470ri(boolean z) {
            this.jbs = z;
        }

        public String toString() {
            return "UGNode{id='" + this.f5591ri + "', name='" + this.f5588lr + "'}";
        }
    }

    public xha(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public xha(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.f5583ri = jSONObject.optJSONObject("body");
            } else {
                this.f5583ri = jSONObject.optJSONObject("main_template");
            }
            this.f5581lr = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has(Constants.REFERRER_API_META) ? jSONObject.optJSONObject(Constants.REFERRER_API_META) : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.xha = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.f5579ik = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.f5579ik = "3.0";
                    }
                } else {
                    this.f5579ik = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.f5578fi = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.f5579ik = "3.0";
                this.xha = true;
            }
            this.f5580ka = jSONObject2;
            this.f5577di = jSONObject3;
        }
    }

    /* JADX INFO: renamed from: fi */
    private C2248ri m7439fi() {
        if (!m7445ka()) {
            return m7441ri(this.f5583ri, (C2248ri) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f = this.f5582mj;
            if (f > 0.0f) {
                jSONObject.put("width", f);
            }
            float f2 = this.jbs;
            if (f2 > 0.0f) {
                jSONObject.put("height", f2);
            }
            JSONObject jSONObject2 = this.f5580ka;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        C2248ri c2248ri = new C2248ri();
        c2248ri.f5588lr = "View";
        c2248ri.f5591ri = "virtualNode";
        c2248ri.f5586ik = jSONObject;
        c2248ri.f5584di = null;
        c2248ri.xha = this.f5579ik;
        c2248ri.f5589mj = this.f5578fi;
        c2248ri.m7468ri(m7441ri(this.f5583ri, c2248ri));
        return c2248ri;
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m7440ka(C2248ri c2248ri) {
        return (c2248ri == null || c2248ri.f5586ik == null) ? false : true;
    }

    /* JADX INFO: renamed from: ri */
    private C2248ri m7441ri(JSONObject jSONObject, C2248ri c2248ri) {
        C2248ri c2248riM7441ri;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        C2248ri c2248ri2 = new C2248ri();
        c2248ri2.f5591ri = strOptString2;
        if (this.xha && TextUtils.equals("Video", strOptString)) {
            c2248ri2.f5588lr = strOptString + "V3";
        } else {
            c2248ri2.f5588lr = strOptString;
        }
        c2248ri2.f5586ik = jSONObject2;
        c2248ri2.f5584di = c2248ri;
        c2248ri2.xha = this.f5579ik;
        c2248ri2.f5589mj = this.f5578fi;
        if (jSONObject2.has("i18n")) {
            c2248ri2.f5587ka = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            m7442ri(jSONObject, c2248ri2.f5586ik);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                String strOptString3 = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
                String strM7663ri = C2268lr.m7663ri(jSONObjectOptJSONObject.optString("id"), this.f5580ka);
                if (TextUtils.equals(strOptString3, "Template")) {
                    JSONObject jSONObject3 = this.f5581lr;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strM7663ri);
                        c2248riM7441ri = m7441ri(jSONObjectOptJSONObject, c2248ri2);
                    } else {
                        c2248riM7441ri = null;
                    }
                } else {
                    c2248riM7441ri = m7441ri(jSONObjectOptJSONObject, c2248ri2);
                }
                if (c2248riM7441ri != null) {
                    c2248riM7441ri.m7465lr(m7447lr(c2248riM7441ri));
                    c2248riM7441ri.m7470ri(m7450ri(c2248riM7441ri));
                }
                if (m7444ik(c2248riM7441ri)) {
                    i++;
                    c2248ri2.m7464lr(c2248riM7441ri);
                } else if (c2248riM7441ri != null) {
                    c2248ri2.m7467ri(i2 - i, c2248riM7441ri);
                }
            }
        }
        return c2248ri2;
    }

    /* JADX INFO: renamed from: ri */
    private void m7442ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.f5577di == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.f5577di.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (!TextUtils.equals(next, "events") || !jSONObject3.has("events")) {
                        jSONObject3.put(next, objOpt);
                    } else if (objOpt instanceof JSONArray) {
                        C2346lr.m8040ri(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ik */
    public List<C2248ri> m7443ik() {
        if (this.f5581lr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.f5581lr.keys();
        while (itKeys.hasNext()) {
            C2248ri c2248riM7441ri = m7441ri(this.f5581lr.optJSONObject(itKeys.next()), (C2248ri) null);
            if (c2248riM7441ri != null) {
                arrayList.add(c2248riM7441ri);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m7444ik(C2248ri c2248ri) {
        JSONObject jSONObjectM7462ka;
        if (c2248ri == null || (jSONObjectM7462ka = c2248ri.m7462ka()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectM7462ka.optString(C11744X3.i.f26338L), com.facebook.appevents.codeless.internal.Constants.PATH_TYPE_ABSOLUTE);
    }

    /* JADX INFO: renamed from: ka */
    public boolean m7445ka() {
        return this.xha;
    }

    /* JADX INFO: renamed from: lr */
    public String m7446lr() {
        return this.f5579ik;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m7447lr(C2248ri c2248ri) {
        JSONObject jSONObjectM7462ka;
        if (c2248ri == null || (jSONObjectM7462ka = c2248ri.m7462ka()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectM7462ka.optString("height"), "match_parent");
    }

    /* JADX INFO: renamed from: ri */
    public C2248ri m7448ri() {
        return m7439fi();
    }

    /* JADX INFO: renamed from: ri */
    public void m7449ri(float f, float f2) {
        this.f5582mj = f;
        this.jbs = f2;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7450ri(C2248ri c2248ri) {
        JSONObject jSONObjectM7462ka;
        if (c2248ri == null || (jSONObjectM7462ka = c2248ri.m7462ka()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectM7462ka.optString("width"), "match_parent");
    }
}
