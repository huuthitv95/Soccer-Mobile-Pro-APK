package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.openadsdk.core.model.wjv;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3410ri {

    /* JADX INFO: renamed from: di */
    private boolean f12168di = false;

    /* JADX INFO: renamed from: fi */
    private AbstractC3405ik f12169fi;

    /* JADX INFO: renamed from: ik */
    private JSONObject f12170ik;

    /* JADX INFO: renamed from: ka */
    private JSONObject f12171ka;

    /* JADX INFO: renamed from: lr */
    private String f12172lr;

    /* JADX INFO: renamed from: ri */
    private wjv f12173ri;

    public C3410ri(wjv wjvVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f12173ri = wjvVar;
        this.f12172lr = str;
        this.f12170ik = jSONObject;
        this.f12171ka = jSONObject2;
    }

    /* JADX INFO: renamed from: di */
    public boolean m15440di() {
        return this.f12168di;
    }

    /* JADX INFO: renamed from: fi */
    public AbstractC3405ik m15441fi() {
        return this.f12169fi;
    }

    /* JADX INFO: renamed from: ik */
    public JSONObject m15442ik() {
        if (this.f12170ik == null) {
            this.f12170ik = new JSONObject();
        }
        return this.f12170ik;
    }

    /* JADX INFO: renamed from: ka */
    public JSONObject m15443ka() {
        if (this.f12171ka == null) {
            this.f12171ka = new JSONObject();
        }
        return this.f12171ka;
    }

    /* JADX INFO: renamed from: lr */
    public String m15444lr() {
        return this.f12172lr;
    }

    /* JADX INFO: renamed from: ri */
    public wjv m15445ri() {
        return this.f12173ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m15446ri(AbstractC3405ik abstractC3405ik) {
        this.f12169fi = abstractC3405ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m15447ri(boolean z) {
        this.f12168di = z;
    }

    public void xha() {
        AbstractC3405ik abstractC3405ik = this.f12169fi;
        if (abstractC3405ik != null) {
            abstractC3405ik.mo15420ri(this);
        }
    }
}
