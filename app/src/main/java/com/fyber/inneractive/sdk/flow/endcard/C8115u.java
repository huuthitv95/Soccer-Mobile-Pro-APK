package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.fyber.inneractive.sdk.config.C8040s;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a;
import com.fyber.inneractive.sdk.flow.vast.C8224a;
import com.fyber.inneractive.sdk.flow.vast.C8231h;
import com.fyber.inneractive.sdk.player.controller.C8459d;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9240i1;
import com.fyber.inneractive.sdk.web.C9248m;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.u */
/* JADX INFO: loaded from: classes4.dex */
public class C8115u extends AbstractC8083a implements ValueCallback {

    /* JADX INFO: renamed from: c */
    public final C8224a f18052c;

    /* JADX INFO: renamed from: d */
    public C8459d f18053d;

    /* JADX INFO: renamed from: e */
    public String f18054e;

    /* JADX INFO: renamed from: f */
    public boolean f18055f;

    /* JADX INFO: renamed from: g */
    public ViewGroup f18056g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f18057h;

    /* JADX INFO: renamed from: i */
    public final C8113s f18058i;

    public C8115u(AbstractC8084b abstractC8084b) {
        super(abstractC8084b);
        this.f18055f = false;
        this.f18057h = new AtomicBoolean(false);
        this.f18058i = new C8113s(this);
        C8237x0 c8237x0 = abstractC8084b.f17984c;
        C8219t0 c8219t0 = c8237x0.f18380b;
        InneractiveAdRequest inneractiveAdRequest = c8237x0.f18381c;
        C9089g c9089g = c8237x0.f18382d;
        this.f18052c = new C8224a(c9089g.f21314n, inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), c9089g.f21305e, c9089g.f21306f, c8219t0.f18376d);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8083a, com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    /* JADX INFO: renamed from: a */
    public final void mo20499a() {
        AbstractC9195v.m22027a(mo20506b());
        AbstractC9240i1 abstractC9240i1 = m20541e().f18827a;
        if (abstractC9240i1 != null) {
            abstractC9240i1.mo21933a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20540a(InterfaceC8106a interfaceC8106a) {
        String str = this.f18054e;
        if (TextUtils.isEmpty(str)) {
            throw new C8231h("End-Card HTML not loaded", "No template");
        }
        m20541e().m20870a(str, interfaceC8106a == null ? this.f18058i : new C8114t(this, interfaceC8106a), !(this instanceof C8110p));
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    /* JADX INFO: renamed from: b */
    public final View mo20506b() {
        ViewGroup viewGroup = this.f18056g;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (!this.f18055f) {
            return null;
        }
        AbstractC9240i1 abstractC9240i1 = m20541e().f18827a;
        C9248m c9248m = abstractC9240i1 == null ? null : abstractC9240i1.f21565b;
        if (c9248m == null) {
            return null;
        }
        ViewGroup viewGroupM20498a = AbstractC8083a.m20498a(c9248m);
        this.f18056g = viewGroupM20498a;
        return viewGroupM20498a;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8083a
    /* JADX INFO: renamed from: c */
    public final void mo20500c() {
        C8459d c8459dM20541e = m20541e();
        AbstractC9240i1 abstractC9240i1 = c8459dM20541e.f18827a;
        if (abstractC9240i1 != null) {
            UnitDisplayType unitDisplayType = c8459dM20541e.f18829c;
            if (!UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) && !UnitDisplayType.REWARDED.equals(unitDisplayType)) {
                UnitDisplayType.VERTICAL.equals(unitDisplayType);
            }
            abstractC9240i1.m22083l();
        }
    }

    /* JADX INFO: renamed from: d */
    public C8111q mo20536d() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8083a, com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    public final void destroy() {
        mo20499a();
        C8459d c8459dM20541e = m20541e();
        AbstractC9240i1 abstractC9240i1 = c8459dM20541e.f18827a;
        if (abstractC9240i1 != null) {
            abstractC9240i1.mo21936e();
            c8459dM20541e.f18827a = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C8459d m20541e() {
        C8459d c8459d = this.f18053d;
        if (c8459d == null) {
            AbstractC8084b abstractC8084b = this.f17981b;
            c8459d = new C8459d(abstractC8084b.f17984c.f18379a, this.f18052c, abstractC8084b.mo20513i(), mo20536d());
            C8237x0 c8237x0 = this.f17981b.f17984c;
            AbstractC9240i1 abstractC9240i1 = c8459d.f18827a;
            if (abstractC9240i1 != null) {
                if (abstractC9240i1.f21582s == null) {
                    abstractC9240i1.setAdContent(c8237x0.f18380b);
                }
                if (abstractC9240i1.f21581r == null) {
                    abstractC9240i1.setAdRequest(c8237x0.f18381c);
                }
                if (abstractC9240i1.f21583t == null) {
                    abstractC9240i1.setAdResponse(c8237x0.f18382d);
                }
            }
            this.f18053d = c8459d;
        }
        return c8459d;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo20537f() {
        C8040s c8040s = IAConfigManager.f17654M.f17688t;
        return c8040s != null && c8040s.f17862b.m20446a(false, "dt_plbl");
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            IAlog.m21945a("%s Playable detected: %s", this.f17980a, str);
            try {
                this.f17981b.mo20505a(new JSONArray(str));
            } catch (JSONException e) {
                IAlog.m21950f("%s invalid playable detection method: %s", this.f17980a, e.getMessage());
            }
        }
        this.f17981b.mo20517m();
    }
}
