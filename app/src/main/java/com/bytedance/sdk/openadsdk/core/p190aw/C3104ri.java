package com.bytedance.sdk.openadsdk.core.p190aw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3104ri {

    /* JADX INFO: renamed from: co */
    private String f9855co;

    /* JADX INFO: renamed from: di */
    private String f9856di;

    /* JADX INFO: renamed from: fi */
    private String f9857fi;

    /* JADX INFO: renamed from: ik */
    C3092ik f9858ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private String f9859ka;

    /* JADX INFO: renamed from: lr */
    C3098lr f9860lr;

    /* JADX INFO: renamed from: mj */
    private double f9861mj;

    /* JADX INFO: renamed from: qt */
    private int f9862qt;

    /* JADX INFO: renamed from: ri */
    final C3283ka f9863ri = new C3283ka();

    /* JADX INFO: renamed from: sf */
    private String f9864sf = "VAST_ACTION_BUTTON";
    private String xha;

    /* JADX INFO: renamed from: ri */
    public static C3104ri m12530ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3104ri c3104ri = new C3104ri();
        C3097ka c3097kaM14188ri = c3104ri.f9863ri.m14188ri();
        if (c3097kaM14188ri == null) {
            c3097kaM14188ri = new C3097ka();
            c3104ri.f9863ri.m14189ri(c3097kaM14188ri);
        }
        c3097kaM14188ri.m12489ri(jSONObject.optJSONObject("videoTrackers"));
        c3104ri.f9860lr = C3098lr.m12491ri(jSONObject.optJSONObject("vastIcon"));
        c3104ri.f9858ik = C3092ik.m12418lr(jSONObject.optJSONObject("endCard"));
        c3104ri.f9859ka = jSONObject.optString("title");
        c3104ri.f9857fi = jSONObject.optString("description");
        c3104ri.f9856di = jSONObject.optString("clickThroughUrl");
        c3104ri.xha = jSONObject.optString("videoUrl");
        c3104ri.f9861mj = jSONObject.optDouble("videDuration");
        c3104ri.jbs = jSONObject.optInt("videoWidth");
        c3104ri.jbs = jSONObject.optInt("videoHeight");
        Set<C3103qt> setM14186lr = c3104ri.f9863ri.m14186lr();
        if (setM14186lr == null) {
            setM14186lr = new HashSet<>();
            c3104ri.f9863ri.m14191ri(setM14186lr);
        }
        setM14186lr.addAll(C3103qt.m12525ri(jSONObject.optJSONArray("viewabilityVendor")));
        return c3104ri;
    }

    /* JADX INFO: renamed from: aw */
    public C3283ka m12531aw() {
        return this.f9863ri;
    }

    /* JADX INFO: renamed from: co */
    public Set<C3103qt> m12532co() {
        return this.f9863ri.m14186lr();
    }

    /* JADX INFO: renamed from: di */
    public String m12533di() {
        return this.f9856di;
    }

    /* JADX INFO: renamed from: di */
    public void m12534di(String str) {
        this.f9855co = str;
    }

    /* JADX INFO: renamed from: fi */
    public String m12535fi() {
        return this.f9857fi;
    }

    /* JADX INFO: renamed from: fi */
    public void m12536fi(String str) {
        this.f9864sf = str;
    }

    /* JADX INFO: renamed from: ik */
    public C3092ik m12537ik() {
        return this.f9858ik;
    }

    /* JADX INFO: renamed from: ik */
    public void m12538ik(String str) {
        this.f9856di = str;
    }

    public String jbs() {
        C3092ik c3092ik;
        String str = this.f9856di;
        if (!TextUtils.isEmpty(this.f9855co)) {
            String str2 = this.f9855co;
            this.f9855co = null;
            return str2;
        }
        String str3 = this.f9864sf;
        str3.hashCode();
        if (str3.equals("VAST_ICON")) {
            C3098lr c3098lr = this.f9860lr;
            if (c3098lr != null && !TextUtils.isEmpty(c3098lr.f9746mj)) {
                str = this.f9860lr.f9746mj;
            }
        } else if (str3.equals("VAST_END_CARD") && (c3092ik = this.f9858ik) != null && !TextUtils.isEmpty(c3092ik.f9746mj)) {
            str = this.f9858ik.f9746mj;
        }
        this.f9864sf = "VAST_ACTION_BUTTON";
        return str;
    }

    /* JADX INFO: renamed from: ka */
    public String m12539ka() {
        return this.f9859ka;
    }

    /* JADX INFO: renamed from: ka */
    public void m12540ka(String str) {
        this.xha = str;
    }

    /* JADX INFO: renamed from: lr */
    public C3098lr m12541lr() {
        return this.f9860lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m12542lr(int i) {
        this.f9862qt = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m12543lr(String str) {
        this.f9857fi = str;
    }

    /* JADX INFO: renamed from: mj */
    public double m12544mj() {
        return this.f9861mj;
    }

    /* JADX INFO: renamed from: qt */
    public int m12545qt() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public C3097ka m12546ri() {
        return this.f9863ri.m14188ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m12547ri(double d) {
        this.f9861mj = d;
    }

    /* JADX INFO: renamed from: ri */
    public void m12548ri(int i) {
        this.jbs = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m12549ri(C3092ik c3092ik) {
        if (c3092ik != null) {
            c3092ik.m12429ri(this.xha);
        }
        this.f9858ik = c3092ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m12550ri(C3098lr c3098lr) {
        if (c3098lr != null) {
            c3098lr.m12429ri(this.xha);
        }
        this.f9860lr = c3098lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m12551ri(wjv wjvVar) {
        this.f9863ri.m14190ri(wjvVar);
        C3098lr c3098lr = this.f9860lr;
        if (c3098lr != null) {
            c3098lr.m12428ri(wjvVar);
        }
        C3092ik c3092ik = this.f9858ik;
        if (c3092ik != null) {
            c3092ik.m12428ri(wjvVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12552ri(String str) {
        this.f9859ka = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m12553ri(Set<C3103qt> set) {
        this.f9863ri.m14187lr(set);
    }

    /* JADX INFO: renamed from: sf */
    public int m12554sf() {
        return this.f9862qt;
    }

    public String xha() {
        return this.xha;
    }
}
