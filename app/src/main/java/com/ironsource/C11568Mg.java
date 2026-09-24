package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Mg */
/* JADX INFO: loaded from: classes6.dex */
public class C11568Mg {

    /* JADX INFO: renamed from: a */
    private final String f25180a;

    /* JADX INFO: renamed from: b */
    private Context f25181b;

    /* JADX INFO: renamed from: c */
    private C11796a4 f25182c;

    /* JADX INFO: renamed from: d */
    private C11677T4 f25183d;

    /* JADX INFO: renamed from: e */
    private int f25184e;

    /* JADX INFO: renamed from: f */
    private C12145d5 f25185f;

    /* JADX INFO: renamed from: g */
    private int f25186g;

    /* JADX INFO: renamed from: h */
    private int f25187h;

    /* JADX INFO: renamed from: i */
    private final String f25188i = "Mg";

    /* JADX INFO: renamed from: j */
    private a f25189j;

    /* JADX INFO: renamed from: com.ironsource.Mg$a */
    protected enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public C11568Mg(Context context, C11796a4 c11796a4, C11677T4 c11677t4, int i, C12145d5 c12145d5, String str) {
        a aVarM26575h = m26575h();
        this.f25189j = aVarM26575h;
        if (aVarM26575h != a.NOT_ALLOWED) {
            this.f25181b = context;
            this.f25182c = c11796a4;
            this.f25183d = c11677t4;
            this.f25184e = i;
            this.f25185f = c12145d5;
            this.f25186g = 0;
        }
        this.f25180a = str;
    }

    /* JADX INFO: renamed from: h */
    private a m26575h() {
        this.f25187h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.m33642i(this.f25188i, "getInitialState mMaxAllowedTrials: " + this.f25187h);
        if (this.f25187h > 0) {
            return a.NOT_RECOVERED;
        }
        Logger.m33642i(this.f25188i, "recovery is not allowed by config");
        return a.NOT_ALLOWED;
    }

    /* JADX INFO: renamed from: j */
    private void m26576j() {
        if (this.f25186g != this.f25187h) {
            this.f25189j = a.NOT_RECOVERED;
            return;
        }
        Logger.m33642i(this.f25188i, "handleRecoveringEndedFailed | Reached max trials");
        this.f25189j = a.NOT_ALLOWED;
        m26578a();
    }

    /* JADX INFO: renamed from: k */
    private void m26577k() {
        m26578a();
        this.f25189j = a.RECOVERED;
    }

    /* JADX INFO: renamed from: a */
    public boolean m26580a(C12386n8.c cVar, C12386n8.b bVar) {
        Logger.m33642i(this.f25188i, "shouldRecoverWebController: ");
        a aVar = this.f25189j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.m33642i(this.f25188i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != C12386n8.c.Native) {
            Logger.m33642i(this.f25188i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == C12386n8.b.Loading || bVar == C12386n8.b.None) {
            Logger.m33642i(this.f25188i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.m33642i(this.f25188i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.m33642i(this.f25188i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.f25181b == null || this.f25182c == null || this.f25183d == null) {
            Logger.m33642i(this.f25188i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.m33642i(this.f25188i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    /* JADX INFO: renamed from: b */
    public Context m26581b() {
        return this.f25181b;
    }

    /* JADX INFO: renamed from: c */
    public String m26582c() {
        return this.f25180a;
    }

    /* JADX INFO: renamed from: d */
    public C11796a4 m26583d() {
        return this.f25182c;
    }

    /* JADX INFO: renamed from: e */
    public int m26584e() {
        return this.f25184e;
    }

    /* JADX INFO: renamed from: f */
    public C11677T4 m26585f() {
        return this.f25183d;
    }

    /* JADX INFO: renamed from: g */
    public C12145d5 m26586g() {
        return this.f25185f;
    }

    /* JADX INFO: renamed from: i */
    public JSONObject m26587i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11744X3.i.f26317A0, m26589m());
            jSONObject.put(C11744X3.i.f26319B0, this.f25186g);
            jSONObject.put(C11744X3.i.f26321C0, this.f25187h);
            return jSONObject;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m26588l() {
        return this.f25189j == a.IN_RECOVERING;
    }

    /* JADX INFO: renamed from: m */
    public boolean m26589m() {
        return this.f25189j == a.RECOVERED;
    }

    /* JADX INFO: renamed from: n */
    public void m26590n() {
        a aVar = this.f25189j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.f25186g++;
            Logger.m33642i(this.f25188i, "recoveringStarted - trial number " + this.f25186g);
            this.f25189j = aVar2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m26578a() {
        this.f25181b = null;
        this.f25182c = null;
        this.f25183d = null;
        this.f25185f = null;
    }

    /* JADX INFO: renamed from: a */
    public void m26579a(boolean z) {
        if (this.f25189j != a.IN_RECOVERING) {
            return;
        }
        if (z) {
            m26577k();
        } else {
            m26576j();
        }
    }
}
