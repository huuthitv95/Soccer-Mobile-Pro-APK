package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.player.p277ui.C8878b;
import com.fyber.inneractive.sdk.player.p277ui.C8879c;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8086d extends AbstractC8084b {
    public C8086d(int i, C8237x0 c8237x0) {
        super(i, c8237x0);
    }

    /* JADX INFO: renamed from: a */
    public final void m20521a(int i, C8237x0 c8237x0) {
        EnumC8424u enumC8424u = EnumC8424u.VAST_DEFAULT_COMPANION_DISPLAYED;
        InneractiveAdRequest inneractiveAdRequest = c8237x0.f18381c;
        C9089g c9089g = c8237x0.f18382d;
        JSONArray jSONArray = c8237x0.f18384f;
        C8428w c8428w = new C8428w(c9089g);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArray;
        c8428w.m20808a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: a */
    public final void mo20503a(ViewGroup viewGroup, C8878b c8878b) {
        C8088f c8088f = (C8088f) m20510f();
        c8088f.m20522a(c8878b, null);
        ViewGroup viewGroup2 = c8088f.f17993c;
        AbstractC9195v.m22027a(viewGroup2);
        viewGroup.addView(viewGroup2);
        m20521a(this.f17986e, this.f17984c);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: c */
    public final InterfaceC8108n mo20507c() {
        return new C8088f(this);
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
    /* JADX INFO: renamed from: g */
    public final EnumC9150g mo20511g() {
        return EnumC9150g.DEFAULT_ENDCARD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: h */
    public final EnumC8094l mo20512h() {
        return EnumC8094l.Default;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: i */
    public final EnumC8300i mo20513i() {
        return EnumC8300i.Default_End_Card;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: l */
    public final boolean mo20516l() {
        return true;
    }
}
