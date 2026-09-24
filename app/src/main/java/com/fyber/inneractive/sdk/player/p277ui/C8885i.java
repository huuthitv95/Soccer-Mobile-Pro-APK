package com.fyber.inneractive.sdk.player.p277ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C8121g;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.flow.endcard.C8086d;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.network.events.AbstractC8371a;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.p278ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.player.AbstractC8846f;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.p277ui.remote.C8898d;
import com.fyber.inneractive.sdk.player.p277ui.remote.C8901g;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.C9155h1;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.i */
/* JADX INFO: loaded from: classes9.dex */
public final class C8885i extends AbstractC8902s {

    /* JADX INFO: renamed from: A */
    public C8892p f20886A;

    /* JADX INFO: renamed from: B */
    public final C8219t0 f20887B;

    /* JADX INFO: renamed from: z */
    public final C8891o f20888z;

    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x0144  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    /* JADX WARN: Illegal instructions before constructor call */
    public C8885i(Context context, InterfaceC8877a interfaceC8877a, C8870n c8870n, C8006r c8006r, String str) {
        C8121g c8121g;
        boolean zM21398a;
        C8892p c8892p;
        IAsmoothProgressBar iAsmoothProgressBar;
        boolean z;
        ImageView imageView;
        boolean z2;
        String str2;
        Boolean boolValueOf;
        C8219t0 c8219t0;
        C8219t0 c8219t1;
        C8006r c8006r2 = c8006r;
        super(context, c8006r2, null);
        this.f20887B = null;
        this.f20887B = c8870n != null ? c8870n.f20773b : null;
        if (context == null || c8870n == null || (c8219t1 = c8870n.f20773b) == null) {
            c8121g = null;
        } else {
            c8006r2 = c8006r;
            c8121g = new C8121g(context, false, c8219t1.f18373a, c8219t1.f18374b, c8006r);
        }
        if (c8870n == null || (c8219t0 = c8870n.f20773b) == null) {
            zM21398a = false;
        } else {
            AbstractC9087e abstractC9087e = c8219t0.f18374b;
            zM21398a = AbstractC8846f.m21398a(c8006r2, abstractC9087e != null ? ((C9089g) abstractC9087e).f21295E : EnumC8253m.NONE);
        }
        C8891o c8891o = new C8891o(context, c8121g, interfaceC8877a, c8006r2, zM21398a, str);
        this.f20888z = c8891o;
        if (c8870n != null) {
            C8293b c8293b = c8870n.f20834p;
            if (c8293b == null || TextUtils.isEmpty(c8293b.f18512n)) {
                IAlog.m21945a("%s : dynamic controls are not available", "IAVideoViewComposition");
            } else {
                C8901g c8901g = c8870n.f20839u;
                if ((c8901g != null ? c8901g.f20953a : null) == null) {
                    IAlog.m21945a("%s : dynamic controls are not available", "IAVideoViewComposition");
                } else {
                    C8898d c8898d = c8901g != null ? c8901g.f20953a : null;
                    if (c8898d.f20931h) {
                        IAlog.m21945a("%s : dynamic controls are already destroyed", "IAVideoViewComposition");
                    } else if (c8898d.f20930g) {
                        IAlog.m21945a("%s : dynamic controls load process timed out", "IAVideoViewComposition");
                        C8901g c8901g2 = c8870n.f20839u;
                        (c8901g2 != null ? c8901g2.f20953a : null).mo21463a(EnumC8372b.TEMPLATE_LOAD_TIMEOUT, "Template loading is timed out", true, null);
                    } else if (c8898d.f20925b.f21662j) {
                        c8892p = new C8892p(getContext().getApplicationContext(), interfaceC8877a, c8898d, c8891o);
                    } else {
                        IAlog.m21945a("%s : dynamic controls are not ready, yet", "IAVideoViewComposition");
                        C8901g c8901g3 = c8870n.f20839u;
                        (c8901g3 != null ? c8901g3.f20953a : null).mo21463a(EnumC8372b.TEMPLATE_ERROR, "Template isn't loaded yet", true, null);
                    }
                }
            }
            this.f20886A = c8892p;
            this.f20957m = c8891o.f20957m;
            this.f20962r = c8891o.f20962r;
            this.f20963s = c8891o.f20963s;
            this.f20958n = c8891o.f20958n;
            TextView textView = c8891o.f20966v;
            this.f20966v = textView;
            m21467a(textView, 10);
            m21467a(this.f20958n, 8);
            m21467a(this.f20957m, 7);
            m21467a(this.f20962r, -1);
            if (mo21427b()) {
                C8892p c8892p2 = this.f20886A;
                iAsmoothProgressBar = c8891o.f20908P;
                if (iAsmoothProgressBar == null && iAsmoothProgressBar.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                mo21444f(z);
                imageView = c8891o.f20906N;
                if (imageView == null && imageView.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mo21442d(z2);
                c8891o.mo21448i();
                attachViewToParent(c8892p2, 0, new RelativeLayout.LayoutParams(-1, -1));
                EnumC8424u enumC8424u = EnumC8424u.VAST_EVENT_DVC_IMPRESSION;
                InneractiveAdRequest adRequest = getAdRequest();
                AbstractC9087e adResponse = getAdResponse();
                C8898d c8898d2 = c8892p2.f20916M;
                str2 = c8898d2.f20929f;
                boolValueOf = Boolean.valueOf(c8898d2.f20932i);
                C8428w c8428w = new C8428w(enumC8424u, adRequest, adResponse);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loaded_from_cache", boolValueOf);
                } catch (Exception unused) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", "loaded_from_cache", boolValueOf);
                }
                try {
                    jSONObject.put("templateURL", str2);
                } catch (Exception unused2) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                }
                c8428w.f18758f.put(jSONObject);
                c8428w.m20808a((String) null);
            }
            View view = this.f20888z;
            attachViewToParent(view, 0, view.getLayoutParams());
        }
        IAlog.m21945a("%s : flow manager is missing, unexpected and dynamic controls status are unknown", "IAVideoViewComposition");
        AbstractC8371a.m20741a(EnumC8415t.VAST_ERROR_DVC_FAILURE, EnumC8372b.TEMPLATE_CONTENT_ERROR, getAdRequest(), getAdResponse(), "Missing flow manager", "", (Boolean) null);
        c8892p = null;
        this.f20886A = c8892p;
        this.f20957m = c8891o.f20957m;
        this.f20962r = c8891o.f20962r;
        this.f20963s = c8891o.f20963s;
        this.f20958n = c8891o.f20958n;
        TextView textView2 = c8891o.f20966v;
        this.f20966v = textView2;
        m21467a(textView2, 10);
        m21467a(this.f20958n, 8);
        m21467a(this.f20957m, 7);
        m21467a(this.f20962r, -1);
        if (mo21427b()) {
            C8892p c8892p3 = this.f20886A;
            iAsmoothProgressBar = c8891o.f20908P;
            if (iAsmoothProgressBar == null) {
                z = false;
            } else {
                z = false;
            }
            mo21444f(z);
            imageView = c8891o.f20906N;
            if (imageView == null) {
                z2 = false;
            } else {
                z2 = false;
            }
            mo21442d(z2);
            c8891o.mo21448i();
            attachViewToParent(c8892p3, 0, new RelativeLayout.LayoutParams(-1, -1));
            EnumC8424u enumC8424u2 = EnumC8424u.VAST_EVENT_DVC_IMPRESSION;
            InneractiveAdRequest adRequest2 = getAdRequest();
            AbstractC9087e adResponse2 = getAdResponse();
            C8898d c8898d3 = c8892p3.f20916M;
            str2 = c8898d3.f20929f;
            boolValueOf = Boolean.valueOf(c8898d3.f20932i);
            C8428w c8428w2 = new C8428w(enumC8424u2, adRequest2, adResponse2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("loaded_from_cache", boolValueOf);
            jSONObject2.put("templateURL", str2);
            c8428w2.f18758f.put(jSONObject2);
            c8428w2.m20808a((String) null);
        }
        View view2 = this.f20888z;
        attachViewToParent(view2, 0, view2.getLayoutParams());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21431a(C8892p c8892p) {
        return (c8892p == null || c8892p.f20916M.f20931h || !c8892p.mo21427b()) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21432a(int i, int i2) {
        this.f20888z.mo21432a(i, i2);
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21432a(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21433a(AbstractC8084b abstractC8084b, C8878b c8878b) {
        this.f20888z.mo21433a(abstractC8084b, c8878b);
        C8892p c8892p = this.f20886A;
        if (c8892p != null) {
            c8892p.destroy();
            this.f20886A = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21434a(C8086d c8086d, C8878b c8878b) {
        ViewGroup viewGroup;
        C8892p c8892p;
        this.f20888z.mo21434a(c8086d, c8878b);
        if (!m21431a(this.f20886A) || (viewGroup = this.f20962r) == null || viewGroup.getVisibility() != 0 || (c8892p = this.f20886A) == null) {
            return;
        }
        c8892p.destroy();
        this.f20886A = null;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e
    /* JADX INFO: renamed from: a */
    public final void mo21426a(C9155h1 c9155h1, int i, int i2) {
        this.f20888z.mo21426a(c9155h1, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21435a(boolean z) {
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21435a(z);
        } else {
            this.f20888z.mo21435a(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21436a(boolean z, int i, int i2) {
        this.f20959o = i;
        this.f20960p = i2;
        this.f20961q = z;
        C8891o c8891o = this.f20888z;
        c8891o.f20959o = i;
        c8891o.f20960p = i2;
        c8891o.f20961q = z;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21437a(boolean z, EnumC8253m enumC8253m) {
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21437a(z, enumC8253m);
        } else {
            this.f20888z.mo21437a(z, enumC8253m);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21438a(boolean z, String str) {
        this.f20888z.mo21438a(z, str);
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21438a(z, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    /* JADX INFO: renamed from: a */
    public final boolean mo21439a() {
        return m21431a(this.f20886A) ? this.f20886A.f20916M.f20937n : this.f20888z.mo21439a();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: b */
    public final void mo21440b(boolean z) {
        this.f20888z.mo21440b(z);
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21440b(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e, com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    /* JADX INFO: renamed from: b */
    public final boolean mo21427b() {
        C8892p c8892p = this.f20886A;
        return c8892p != null && c8892p.mo21427b();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: c */
    public final void mo21441c(boolean z) {
        this.f20888z.mo21441c(z);
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21441c(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: d */
    public final void mo21442d(boolean z) {
        this.f20888z.mo21442d(z);
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21442d(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: e */
    public final void mo21443e(boolean z) {
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21443e(z);
        } else {
            this.f20888z.mo21443e(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: f */
    public final void mo21444f(boolean z) {
        this.f20888z.mo21444f(z);
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21444f(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: g */
    public final void mo21445g() {
        C8891o c8891o = this.f20888z;
        c8891o.m21458p();
        c8891o.f20895C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: g */
    public final void mo21446g(boolean z) {
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21446g(z);
        } else {
            this.f20888z.mo21446g(z);
        }
    }

    public InneractiveAdRequest getAdRequest() {
        C8219t0 c8219t0 = this.f20887B;
        if (c8219t0 != null) {
            return c8219t0.f18373a;
        }
        return null;
    }

    public AbstractC9087e getAdResponse() {
        C8219t0 c8219t0 = this.f20887B;
        if (c8219t0 != null) {
            return c8219t0.f18374b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View getEndCardView() {
        return this.f20888z.getEndCardView();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View[] getTrackingFriendlyView() {
        return m21431a(this.f20886A) ? this.f20886A.getTrackingFriendlyView() : this.f20888z.getTrackingFriendlyView();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return m21431a(this.f20886A) ? this.f20886A.getTrackingFriendlyViewObstructionPurposeOther() : this.f20888z.getTrackingFriendlyViewObstructionPurposeOther();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: h */
    public final void mo21447h() {
        this.f20888z.mo21447h();
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21447h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: i */
    public final void mo21448i() {
        this.f20888z.mo21448i();
        if (m21431a(this.f20886A)) {
            this.f20886A.mo21448i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: j */
    public final void mo21449j() {
        this.f20888z.mo21449j();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: k */
    public final void mo21450k() {
        this.f20888z.mo21450k();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: l */
    public final boolean mo21451l() {
        return m21431a(this.f20886A) ? this.f20886A.f20916M.f20936m : this.f20888z.mo21451l();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: m */
    public final void mo21452m() {
        this.f20888z.mo21452m();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: n */
    public final void mo21453n() {
        this.f20888z.mo21453n();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: o */
    public final void mo21454o() {
        this.f20888z.mo21454o();
        this.f20965u = this.f20888z.f20965u;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setAppInfoButtonRound(TextView textView) {
        this.f20888z.setAppInfoButtonRound(textView);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e
    public void setListener(InterfaceC8890n interfaceC8890n) {
        super.setListener(interfaceC8890n);
        this.f20888z.setListener(interfaceC8890n);
        if (m21431a(this.f20886A)) {
            this.f20886A.setListener(interfaceC8890n);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setMuteButtonState(boolean z) {
        this.f20888z.setMuteButtonState(z);
        if (m21431a(this.f20886A)) {
            this.f20886A.setMuteButtonState(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setRemainingTime(String str) {
        this.f20888z.setRemainingTime(str);
        if (m21431a(this.f20886A)) {
            this.f20886A.setRemainingTime(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setSkipText(String str) {
        this.f20888z.setSkipText(str);
        if (m21431a(this.f20886A)) {
            this.f20886A.setSkipText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e
    public void setUnitConfig(InterfaceC8041s0 interfaceC8041s0) {
        super.setUnitConfig(interfaceC8041s0);
        this.f20888z.setUnitConfig(interfaceC8041s0);
        if (m21431a(this.f20886A)) {
            this.f20886A.setUnitConfig(interfaceC8041s0);
        }
    }
}
