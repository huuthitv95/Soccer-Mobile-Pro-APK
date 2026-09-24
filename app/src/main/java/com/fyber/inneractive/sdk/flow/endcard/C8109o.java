package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.player.p277ui.C8878b;
import com.fyber.inneractive.sdk.player.p277ui.C8879c;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9240i1;
import com.fyber.inneractive.sdk.web.C9214a;
import com.fyber.inneractive.sdk.web.C9217b;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8109o extends AbstractC8084b {

    /* JADX INFO: renamed from: g */
    public final String f18040g;

    /* JADX INFO: renamed from: h */
    public C9214a f18041h;

    public C8109o(C8237x0 c8237x0, String str, int i) {
        super(i, c8237x0);
        this.f18041h = new C9214a(null, 0);
        this.f18040g = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m20533a(int i, C8237x0 c8237x0) {
        String strM20534n = m20534n();
        this.f18041h = new C9214a(strM20534n, i);
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(strM20534n)) {
            try {
                jSONObject.put("version", strM20534n);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "version", strM20534n);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(((C8110p) m20510f()).f18044l);
        try {
            jSONObject.put("loaded_from_cache", boolValueOf);
        } catch (Exception unused2) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "loaded_from_cache", boolValueOf);
        }
        EnumC8424u enumC8424u = EnumC8424u.FMP_COMPANION_SUCCESSFULLY_SHOWN;
        InneractiveAdRequest inneractiveAdRequest = c8237x0.f18381c;
        C9089g c9089g = c8237x0.f18382d;
        JSONArray jSONArray = c8237x0.f18384f;
        C8428w c8428w = new C8428w(c9089g);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArray;
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: a */
    public final void mo20503a(ViewGroup viewGroup, C8878b c8878b) {
        C8110p c8110p = (C8110p) m20510f();
        View viewMo20506b = c8110p.mo20506b();
        if (viewMo20506b != null) {
            AbstractC9195v.m22027a(viewMo20506b);
            viewGroup.addView(viewMo20506b);
            AbstractC9240i1 abstractC9240i1 = c8110p.m20541e().f18827a;
            if (abstractC9240i1 != null) {
                abstractC9240i1.mo21933a(true);
            }
        }
        m20533a(this.f17986e, this.f17984c);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: a */
    public final void mo20504a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (inneractiveInfrastructureError.isErrorAlreadyReported(EnumC8415t.FMP_COMPANION_FAILED_LOADING)) {
            return;
        }
        Throwable cause = inneractiveInfrastructureError.getCause();
        IAlog.m21945a("%s sending FMP_COMPANION_FAILED_LOADING event", this.f17982a);
        JSONObject jSONObject = new JSONObject();
        String strM22025a = AbstractC9195v.m22025a(cause);
        if (!TextUtils.isEmpty(strM22025a)) {
            try {
                jSONObject.put("error", strM22025a);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "error", strM22025a);
            }
        }
        String strM20534n = m20534n();
        if (!TextUtils.isEmpty(strM20534n)) {
            try {
                jSONObject.put("version", strM20534n);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "version", strM20534n);
            }
        }
        Boolean bool = Boolean.FALSE;
        try {
            jSONObject.put("loaded_from_cache", bool);
        } catch (Exception unused3) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "loaded_from_cache", bool);
        }
        C8237x0 c8237x0 = this.f17984c;
        EnumC8415t enumC8415t = EnumC8415t.FMP_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest = c8237x0.f18381c;
        C9089g c9089g = c8237x0.f18382d;
        JSONArray jSONArray = c8237x0.f18384f;
        C8428w c8428w = new C8428w(c9089g);
        c8428w.f18754b = enumC8415t;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArray;
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: c */
    public final InterfaceC8108n mo20507c() {
        return new C8110p(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: d */
    public final C8879c mo20508d() {
        View viewMo20506b = m20510f().mo20506b();
        C8879c c8879cMo20508d = super.mo20508d();
        c8879cMo20508d.f20869e = viewMo20506b;
        return c8879cMo20508d;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: g */
    public final EnumC9150g mo20511g() {
        C9214a c9214a = this.f18041h;
        EnumC9150g enumC9150g = EnumC9150g.FMP_ENDCARD;
        enumC9150g.m21963a(c9214a.f21518a);
        enumC9150g.m21962a(c9214a.f21519b);
        return enumC9150g;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: h */
    public final EnumC8094l mo20512h() {
        return EnumC8094l.Fmp;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: i */
    public final EnumC8300i mo20513i() {
        return EnumC8300i.FMP_End_Card;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: j */
    public final boolean mo20514j() {
        return this.f17986e > 1;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: l */
    public final boolean mo20516l() {
        C8110p c8110p = (C8110p) m20510f();
        return c8110p.f18055f && c8110p.mo20506b() != null;
    }

    /* JADX INFO: renamed from: n */
    public final String m20534n() {
        C8111q c8111q;
        C9217b c9217b = (C9217b) ((C8110p) m20510f()).m20541e().f18827a;
        if (c9217b == null || (c8111q = c9217b.f21523N) == null) {
            return null;
        }
        return c8111q.f18047c;
    }
}
