package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.model.vast.C8294c;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.p277ui.C8878b;
import com.fyber.inneractive.sdk.player.p277ui.C8879c;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.response.InterfaceC9091i;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8085c extends AbstractC8084b implements InterfaceC9091i {

    /* JADX INFO: renamed from: g */
    public final C8294c f17988g;

    public AbstractC8085c(C8237x0 c8237x0, C8294c c8294c, int i) {
        super(i, c8237x0);
        this.f17988g = c8294c;
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC9091i
    /* JADX INFO: renamed from: a */
    public final List mo20518a(EnumC8315x enumC8315x) {
        return this.f17988g.mo20518a(enumC8315x);
    }

    /* JADX INFO: renamed from: a */
    public final void m20519a(int i, C8237x0 c8237x0) {
        C8870n.m21417a(this, EnumC8315x.EVENT_CREATIVE_VIEW);
        m20520a(EnumC8424u.VAST_COMPANION_DISPLAYED, c8237x0);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: a */
    public final void mo20503a(ViewGroup viewGroup, C8878b c8878b) {
        View viewMo20506b = m20510f().mo20506b();
        if (viewMo20506b != null) {
            ((AbstractC8083a) m20510f()).mo20500c();
            AbstractC9195v.m22027a(viewMo20506b);
            viewGroup.addView(viewMo20506b);
            viewMo20506b.requestFocus();
            m20519a(this.f17986e, this.f17984c);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: a */
    public final void mo20504a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.m21944a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), mo20513i(), this.f17982a);
        EnumC8415t enumC8415t = EnumC8415t.VAST_COMPANION_FAILED_LOADING;
        if (inneractiveInfrastructureError.isErrorAlreadyReported(enumC8415t)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM20700a = this.f17988g.m20700a();
        try {
            jSONObject.put("companion_data", jSONObjectM20700a);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectM20700a);
        }
        Throwable cause = inneractiveInfrastructureError.getCause();
        String strDescription = inneractiveInfrastructureError.description();
        if (TextUtils.isEmpty(strDescription)) {
            strDescription = AbstractC9195v.m22025a(cause);
        }
        if (!TextUtils.isEmpty(strDescription)) {
            try {
                jSONObject.put("reason", inneractiveInfrastructureError);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "reason", inneractiveInfrastructureError);
            }
        }
        C8237x0 c8237x0 = this.f17984c;
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

    /* JADX INFO: renamed from: a */
    public final void m20520a(EnumC8424u enumC8424u, C8237x0 c8237x0) {
        InneractiveAdRequest inneractiveAdRequest = c8237x0.f18381c;
        C9089g c9089g = c8237x0.f18382d;
        JSONArray jSONArray = c8237x0.f18384f;
        C8428w c8428w = new C8428w(c9089g);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArray;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM20700a = this.f17988g.m20700a();
        try {
            jSONObject.put("companion_data", jSONObjectM20700a);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectM20700a);
        }
        JSONArray jSONArray2 = this.f17983b;
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            JSONArray jSONArray3 = this.f17983b;
            try {
                jSONObject.put("plbl_det", jSONArray3);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "plbl_det", jSONArray3);
            }
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: d */
    public final C8879c mo20508d() {
        C7994v c7994v = this.f17984c.f18385g;
        View viewMo20506b = m20510f().mo20506b();
        C8879c c8879cMo20508d = super.mo20508d();
        c8879cMo20508d.f20869e = viewMo20506b;
        boolean z = false;
        if (c7994v != null) {
            Boolean boolMo20420c = c7994v.mo20420c("cta_text_all_caps");
            if (boolMo20420c != null ? boolMo20420c.booleanValue() : false) {
                z = true;
            }
        }
        c8879cMo20508d.f20866b = z;
        boolean zM20502b = AbstractC8084b.m20502b(c7994v);
        Integer numValueOf = Integer.valueOf(AbstractC8084b.m20501a(c7994v));
        if (zM20502b) {
            c8879cMo20508d.f20868d = numValueOf;
        }
        return c8879cMo20508d;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: e */
    public final void mo20509e() {
        mo20499a();
        View viewMo20506b = m20510f().mo20506b();
        if (viewMo20506b != null) {
            viewMo20506b.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: g */
    public final EnumC9150g mo20511g() {
        return EnumC9150g.VAST_ENDCARD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: h */
    public final EnumC8094l mo20512h() {
        return EnumC8094l.Companion;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: i */
    public final EnumC8300i mo20513i() {
        return this.f17988g.f18515a;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: l */
    public boolean mo20516l() {
        return m20510f().mo20506b() != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: m */
    public final void mo20517m() {
        super.mo20517m();
        m20520a(EnumC8424u.VAST_COMPANION_LOADED, this.f17984c);
    }
}
