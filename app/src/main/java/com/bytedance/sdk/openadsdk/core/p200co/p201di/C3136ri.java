package com.bytedance.sdk.openadsdk.core.p200co.p201di;

import com.bytedance.adsdk.ugeno.core.InterfaceC2241nr;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3136ri extends C2500aw {

    /* JADX INFO: renamed from: fi */
    private boolean f10258fi;

    /* JADX INFO: renamed from: ik */
    private float f10259ik;

    /* JADX INFO: renamed from: ka */
    private float f10260ka;

    /* JADX INFO: renamed from: lr */
    private InterfaceC2241nr f10261lr;

    /* JADX INFO: renamed from: ri */
    private JSONObject f10262ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.ri$ri */
    public static class ri extends C2500aw.ri {

        /* JADX INFO: renamed from: fi */
        private boolean f10263fi;

        /* JADX INFO: renamed from: ik */
        private float f10264ik;

        /* JADX INFO: renamed from: ka */
        private float f10265ka;

        /* JADX INFO: renamed from: lr */
        private InterfaceC2241nr f10266lr;

        /* JADX INFO: renamed from: ri */
        private JSONObject f10267ri;

        /* JADX INFO: renamed from: di */
        public ri m13100di(boolean z) {
            this.f10263fi = z;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m13101lr(float f) {
            this.f10265ka = f;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.p125lr.C2500aw.ri
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public C3136ri mo8942ri() {
            return new C3136ri(this);
        }

        /* JADX INFO: renamed from: ri */
        public ri m13103ri(float f) {
            this.f10264ik = f;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m13104ri(InterfaceC2241nr interfaceC2241nr) {
            this.f10266lr = interfaceC2241nr;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m13105ri(JSONObject jSONObject) {
            this.f10267ri = jSONObject;
            return this;
        }
    }

    public C3136ri(ri riVar) {
        super(riVar);
        this.f10262ri = riVar.f10267ri;
        this.f10261lr = riVar.f10266lr;
        this.f10259ik = riVar.f10264ik;
        this.f10260ka = riVar.f10265ka;
        this.f10258fi = riVar.f10263fi;
    }

    /* JADX INFO: renamed from: dw */
    public float m13092dw() {
        return this.f10259ik;
    }

    public JSONObject hcw() {
        return this.f10262ri;
    }

    /* JADX INFO: renamed from: oh */
    public InterfaceC2241nr m13093oh() {
        return this.f10261lr;
    }

    public float ory() {
        return this.f10260ka;
    }

    /* JADX INFO: renamed from: xd */
    public boolean m13094xd() {
        return this.f10258fi;
    }
}
