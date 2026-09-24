package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3267lr;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3289ri {

    /* JADX INFO: renamed from: co */
    private wjv f11329co;

    /* JADX INFO: renamed from: di */
    private C3281fr f11330di;

    /* JADX INFO: renamed from: fi */
    private wjv f11331fi;

    /* JADX INFO: renamed from: ik */
    private String f11332ik;
    private int jbs;

    /* JADX INFO: renamed from: lr */
    private int f11334lr;

    /* JADX INFO: renamed from: qt */
    private C3294uq f11336qt;

    /* JADX INFO: renamed from: ri */
    private String f11337ri;

    /* JADX INFO: renamed from: sf */
    private String f11338sf;

    /* JADX INFO: renamed from: ka */
    private List<wjv> f11333ka = new ArrayList();
    private JSONObject xha = new JSONObject();

    /* JADX INFO: renamed from: mj */
    private volatile boolean f11335mj = false;

    /* JADX INFO: renamed from: lr */
    public static C3289ri m14245lr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C3289ri c3289ri = new C3289ri();
            c3289ri.m14262ri(C3294uq.m14319ri(jSONObject.optJSONObject("loop_config")));
            c3289ri.m14254lr(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    wjv wjvVarM13905ri = C3267lr.m13905ri(jSONArrayOptJSONArray.optJSONObject(i), null, null, c3289ri, i);
                    if (wjvVarM13905ri != null) {
                        arrayList.add(wjvVarM13905ri);
                    }
                }
                c3289ri.m14265ri(arrayList);
            }
            c3289ri.m14264ri(jSONObject.optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                c3289ri.m14261ri(C3281fr.m14121ri(strOptString));
            }
            return c3289ri;
        } catch (Throwable th) {
            C2707ac.m10206ri("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static Map<String, wjv> m14246ri(C3289ri c3289ri) {
        if (c3289ri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (wjv wjvVar : c3289ri.m14252ka()) {
            if (!TextUtils.isEmpty(wjvVar.mvf())) {
                map.put(wjvVar.mvf(), wjvVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    /* JADX INFO: renamed from: co */
    public wjv m14247co() {
        return this.f11331fi;
    }

    /* JADX INFO: renamed from: di */
    public wjv m14248di() {
        if (this.f11333ka.size() > 0) {
            return this.f11333ka.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m14249fi() {
        List<wjv> list = this.f11333ka;
        return list != null && list.size() > 0;
    }

    /* JADX INFO: renamed from: ik */
    public int m14250ik() {
        return this.f11334lr;
    }

    /* JADX INFO: renamed from: ik */
    public void m14251ik(String str) {
        this.f11338sf = str;
    }

    public wjv jbs() {
        return this.f11329co;
    }

    /* JADX INFO: renamed from: ka */
    public List<wjv> m14252ka() {
        return this.f11333ka;
    }

    /* JADX INFO: renamed from: lr */
    public String m14253lr() {
        wjv wjvVarM14248di = m14248di();
        return wjvVarM14248di != null ? wjvVarM14248di.m14424jf() : "";
    }

    /* JADX INFO: renamed from: lr */
    public void m14254lr(int i) {
        this.jbs = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m14255lr(wjv wjvVar) {
        this.f11331fi = wjvVar;
    }

    /* JADX INFO: renamed from: lr */
    public void m14256lr(String str) {
        this.f11332ik = str;
    }

    /* JADX INFO: renamed from: mj */
    public boolean m14257mj() {
        return this.jbs == 1;
    }

    /* JADX INFO: renamed from: qt */
    public C3281fr m14258qt() {
        return this.f11330di;
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m14259ri() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ri */
    public void m14260ri(int i) {
        this.f11334lr = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m14261ri(C3281fr c3281fr) {
        this.f11330di = c3281fr;
    }

    /* JADX INFO: renamed from: ri */
    public void m14262ri(C3294uq c3294uq) {
        this.f11336qt = c3294uq;
    }

    /* JADX INFO: renamed from: ri */
    public void m14263ri(wjv wjvVar) {
        this.f11333ka.add(wjvVar);
        if (this.f11329co == null) {
            this.f11329co = wjvVar;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14264ri(String str) {
        this.f11337ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m14265ri(List<wjv> list) {
        this.f11333ka = list;
        if (list.isEmpty()) {
            return;
        }
        this.f11329co = list.get(0);
    }

    /* JADX INFO: renamed from: ri */
    public void m14266ri(JSONObject jSONObject) {
        this.xha = jSONObject;
    }

    /* JADX INFO: renamed from: sf */
    public String m14267sf() {
        return this.f11338sf;
    }

    public C3294uq xha() {
        return this.f11336qt;
    }
}
