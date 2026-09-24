package com.bytedance.sdk.openadsdk.p236ka;

import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri.InterfaceC2553lr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p236ka.p242lr.C3424ik;
import com.bytedance.sdk.openadsdk.p236ka.p242lr.InterfaceC3425lr;
import com.bytedance.sdk.openadsdk.p236ka.p242lr.InterfaceC3426ri;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3435lr;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3430ri implements InterfaceC2553lr {

    /* JADX INFO: renamed from: qt */
    private static final Set<String> f12391qt = new HashSet(Arrays.asList("insight_log"));

    /* JADX INFO: renamed from: sf */
    private static final Map<String, String> f12392sf = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.ka.ri.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* JADX INFO: renamed from: ac */
    private InterfaceC3426ri f12393ac;

    /* JADX INFO: renamed from: aw */
    private JSONObject f12394aw;

    /* JADX INFO: renamed from: ay */
    private String f12395ay;
    private String bgr;

    /* JADX INFO: renamed from: bu */
    private String f12396bu;

    /* JADX INFO: renamed from: co */
    private final AtomicBoolean f12397co;

    /* JADX INFO: renamed from: di */
    private final String f12398di;

    /* JADX INFO: renamed from: fi */
    private long f12399fi;

    /* JADX INFO: renamed from: fr */
    private List<String> f12400fr;
    private String ihz;

    /* JADX INFO: renamed from: ik */
    private boolean f12401ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private long f12402ka;

    /* JADX INFO: renamed from: lr */
    protected final JSONObject f12403lr;

    /* JADX INFO: renamed from: mj */
    private int f12404mj;

    /* JADX INFO: renamed from: nr */
    private String f12405nr;

    /* JADX INFO: renamed from: ri */
    public final String f12406ri;
    private String slm;
    private String tan;

    /* JADX INFO: renamed from: uq */
    private String f12407uq;

    /* JADX INFO: renamed from: vr */
    private String f12408vr;
    private int wjv;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri$ri */
    public static final class ri {

        /* JADX INFO: renamed from: ac */
        private String f12409ac;

        /* JADX INFO: renamed from: aw */
        private String f12410aw;
        private InterfaceC3425lr bgr;

        /* JADX INFO: renamed from: bu */
        private int f12411bu;

        /* JADX INFO: renamed from: co */
        private final int f12412co;

        /* JADX INFO: renamed from: di */
        private String f12413di;

        /* JADX INFO: renamed from: fi */
        private String f12414fi;
        private List<String> ihz;

        /* JADX INFO: renamed from: ik */
        private String f12415ik;
        private String jbs;

        /* JADX INFO: renamed from: ka */
        private String f12416ka;

        /* JADX INFO: renamed from: lr */
        private String f12417lr;

        /* JADX INFO: renamed from: mj */
        private String f12418mj;

        /* JADX INFO: renamed from: nr */
        private int f12419nr;

        /* JADX INFO: renamed from: qt */
        private JSONObject f12420qt;

        /* JADX INFO: renamed from: ri */
        public int f12421ri;

        /* JADX INFO: renamed from: sf */
        private String f12422sf;
        private final long slm;
        private boolean tan;

        /* JADX INFO: renamed from: vr */
        private InterfaceC3426ri f12423vr;
        private String xha;

        public ri(long j, wjv wjvVar) {
            this.f12411bu = -1;
            this.f12419nr = -1;
            this.f12421ri = -1;
            if (wjvVar != null) {
                this.tan = C3279dw.m14092lr(wjvVar);
                this.f12411bu = wjvVar.m14567zb();
                this.f12419nr = wjvVar.m14453nd();
                this.f12421ri = wjvVar.m14552vz();
            }
            this.slm = j;
            this.f12412co = C2724nr.m10255ik(C3299nr.m14642ri());
        }

        /* JADX INFO: renamed from: di */
        public ri m15647di(String str) {
            this.jbs = str;
            return this;
        }

        /* JADX INFO: renamed from: fi */
        public ri m15648fi(String str) {
            this.f12418mj = str;
            return this;
        }

        /* JADX INFO: renamed from: ik */
        public ri m15649ik(String str) {
            this.f12416ka = str;
            return this;
        }

        /* JADX INFO: renamed from: ka */
        public ri m15650ka(String str) {
            this.f12414fi = str;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m15651lr(String str) {
            this.f12415ik = str;
            return this;
        }

        /* JADX INFO: renamed from: mj */
        public ri m15652mj(String str) {
            this.f12409ac = str;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m15653ri(String str) {
            this.f12410aw = str;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m15654ri(List<String> list) {
            this.ihz = list;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m15655ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f12420qt = jSONObject;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public void m15656ri(InterfaceC3426ri interfaceC3426ri) {
            C3366lr.m15165ri().m15175ri(this.f12416ka, this.f12409ac, this.xha, this.f12415ik);
            this.f12423vr = interfaceC3426ri;
            C3430ri c3430ri = new C3430ri(this);
            try {
                InterfaceC3425lr interfaceC3425lr = this.bgr;
                if (interfaceC3425lr != null) {
                    interfaceC3425lr.mo15612ri(c3430ri.f12403lr, this.slm);
                } else {
                    new C3424ik().mo15612ri(c3430ri.f12403lr, this.slm);
                }
            } catch (Throwable unused) {
            }
            C3435lr.m15668ri(c3430ri);
        }

        public ri xha(String str) {
            this.xha = str;
            return this;
        }
    }

    C3430ri(ri riVar) {
        this.f12398di = "adiff";
        this.f12397co = new AtomicBoolean(false);
        this.f12394aw = new JSONObject();
        if (TextUtils.isEmpty(riVar.f12417lr)) {
            this.f12406ri = C3593su.m16658ri();
        } else {
            this.f12406ri = riVar.f12417lr;
        }
        this.f12393ac = riVar.f12423vr;
        this.f12407uq = riVar.f12413di;
        this.bgr = riVar.f12415ik;
        this.f12408vr = riVar.f12416ka;
        if (TextUtils.isEmpty(riVar.f12414fi)) {
            this.slm = "app_union";
        } else {
            this.slm = riVar.f12414fi;
        }
        this.ihz = riVar.f12422sf;
        this.f12396bu = riVar.f12418mj;
        this.tan = riVar.jbs;
        this.f12405nr = riVar.xha;
        this.wjv = riVar.f12412co;
        this.f12395ay = riVar.f12410aw;
        this.f12394aw = riVar.f12420qt = riVar.f12420qt != null ? riVar.f12420qt : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.f12403lr = jSONObject;
        if (!TextUtils.isEmpty(riVar.f12410aw)) {
            try {
                jSONObject.put("app_log_url", riVar.f12410aw);
            } catch (JSONException e) {
                C2707ac.m10196ik("AdEvent", e.getMessage());
            }
        }
        this.f12400fr = riVar.ihz;
        if (riVar.ihz != null && !riVar.ihz.isEmpty()) {
            try {
                this.f12403lr.putOpt("app_log_url_back", new JSONArray((Collection) riVar.ihz));
            } catch (Throwable th) {
                C2707ac.m10196ik("AdEvent", th.getMessage());
            }
        }
        this.xha = riVar.f12411bu;
        this.f12404mj = riVar.f12419nr;
        this.jbs = riVar.f12421ri;
        this.f12401ik = riVar.tan;
        this.f12399fi = System.currentTimeMillis();
        xha();
    }

    public C3430ri(String str, JSONObject jSONObject) {
        this.f12398di = "adiff";
        this.f12397co = new AtomicBoolean(false);
        this.f12394aw = new JSONObject();
        this.f12406ri = str;
        this.f12403lr = jSONObject;
    }

    /* JADX INFO: renamed from: lr */
    private void m15624lr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : f12392sf.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(f12392sf.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    private boolean m15625lr(String str) {
        str.hashCode();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: mj */
    private void m15626mj() throws JSONException {
        this.f12403lr.putOpt("app_log_url", this.f12395ay);
        List<String> list = this.f12400fr;
        if (list != null && !list.isEmpty()) {
            try {
                this.f12403lr.putOpt("app_log_url_back", new JSONArray((Collection) this.f12400fr));
            } catch (Throwable th) {
                C2707ac.m10196ik("AdEvent", th.getMessage());
            }
        }
        this.f12403lr.putOpt(ViewHierarchyConstants.TAG_KEY, this.bgr);
        this.f12403lr.putOpt("label", this.f12408vr);
        this.f12403lr.putOpt("category", this.slm);
        if (!TextUtils.isEmpty(this.f12396bu)) {
            try {
                this.f12403lr.putOpt("value", Long.valueOf(Long.parseLong(this.f12396bu)));
            } catch (NumberFormatException unused) {
                this.f12403lr.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.tan)) {
            try {
                this.f12403lr.putOpt("ext_value", Long.valueOf(Long.parseLong(this.tan)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f12407uq)) {
            this.f12403lr.putOpt("log_extra", this.f12407uq);
        }
        if (!TextUtils.isEmpty(this.ihz)) {
            try {
                this.f12403lr.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.ihz)));
            } catch (NumberFormatException unused3) {
            }
        }
        m15628ri(this.f12403lr, this.f12408vr);
        try {
            if (!this.f12403lr.has("nt")) {
                this.f12403lr.putOpt("nt", Integer.valueOf(this.wjv));
            }
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.f12394aw.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f12403lr.putOpt(next, this.f12394aw.opt(next));
        }
    }

    /* JADX INFO: renamed from: ri */
    private JSONObject m15627ri(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.f12406ri);
            }
            if (this.f12401ik) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.xha);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.f12404mj);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.jbs);
                }
            }
            m15624lr(jSONObject);
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.f12406ri + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            C2707ac.m10196ik("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m15628ri(JSONObject jSONObject, String str) {
        try {
            Set<String> set = f12391qt;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            C2707ac.m10197ik("AdEvent", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m15629ri(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private void xha() {
        JSONObject jSONObject = this.f12394aw;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.f12394aw.optString("category");
            String strOptString3 = this.f12394aw.optString("log_extra");
            if (m15629ri(this.f12396bu, this.slm, this.f12407uq)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !m15625lr(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.f12396bu) || TextUtils.equals(this.f12396bu, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.slm) || !m15625lr(this.slm)) && (TextUtils.isEmpty(strOptString2) || !m15625lr(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.f12407uq) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!m15629ri(this.f12396bu, this.slm, this.f12407uq)) {
            return;
        }
        this.f12402ka = C3435lr.f12452ri.incrementAndGet();
    }

    /* JADX INFO: renamed from: di */
    public boolean m15630di() {
        Set<String> setM14830aw;
        if (this.f12403lr == null || (setM14830aw = C3299nr.m14639ka().m14830aw()) == null) {
            return false;
        }
        String strOptString = this.f12403lr.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setM14830aw.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.f12408vr)) {
            return false;
        }
        return setM14830aw.contains(this.f12408vr);
    }

    /* JADX INFO: renamed from: fi */
    public String m15631fi() {
        return this.f12406ri;
    }

    /* JADX INFO: renamed from: ik */
    public JSONObject mo15406ik() {
        if (this.f12397co.get()) {
            return this.f12403lr;
        }
        try {
            m15626mj();
            if (this.f12403lr.has("ad_extra_data")) {
                Object objOpt = this.f12403lr.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.f12403lr.put("ad_extra_data", m15627ri((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.f12403lr.put("ad_extra_data", m15627ri(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e) {
                        C2707ac.m10197ik("AdEvent", "json error", e.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.f12406ri);
                    if (this.f12401ik) {
                        jSONObject.put("interaction_method", this.xha);
                        jSONObject.put("real_interaction_method", this.f12404mj);
                        jSONObject.put("image_mode", this.jbs);
                    }
                    this.f12403lr.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e2) {
                    C2707ac.m10197ik("AdEvent", "json error", e2.getMessage());
                }
            }
            this.f12397co.set(true);
        } catch (Throwable unused) {
        }
        return this.f12403lr;
    }

    /* JADX INFO: renamed from: ka */
    public JSONObject m15632ka() {
        JSONObject jSONObjectMo15406ik = mo15406ik();
        try {
            JSONObject jSONObject = new JSONObject(jSONObjectMo15406ik.toString());
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.remove("app_log_url");
                jSONObjectOptJSONObject.remove("app_log_url_back");
            }
            return jSONObject;
        } catch (JSONException e) {
            C2707ac.m10196ik("AdEvent", e.getMessage());
            return jSONObjectMo15406ik;
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri.InterfaceC2553lr
    /* JADX INFO: renamed from: lr */
    public long mo9299lr() {
        return this.f12402ka;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri.InterfaceC2553lr
    /* JADX INFO: renamed from: ri */
    public long mo9300ri() {
        return this.f12399fi;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri.InterfaceC2553lr
    /* JADX INFO: renamed from: ri */
    public JSONObject mo9301ri(String str) {
        return mo15406ik();
    }
}
