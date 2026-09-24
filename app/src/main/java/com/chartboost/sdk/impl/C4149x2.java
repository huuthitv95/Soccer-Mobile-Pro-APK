package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.x2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4149x2 implements InterfaceC4200z9, InterfaceC3799ha, InterfaceC3638aa, InterfaceC4025ra {

    /* JADX INFO: renamed from: a */
    public final C3753fa f16807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4200z9 f16808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3799ha f16809c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3638aa f16810d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC4025ra f16811e;

    /* JADX INFO: renamed from: f */
    public EnumC3937na f16812f;

    public C4149x2(C3753fa impressionDependency, InterfaceC4200z9 impressionClick, InterfaceC3799ha impressionDismiss, InterfaceC3638aa impressionComplete, InterfaceC4025ra impressionView) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        Intrinsics.checkNotNullParameter(impressionClick, "impressionClick");
        Intrinsics.checkNotNullParameter(impressionDismiss, "impressionDismiss");
        Intrinsics.checkNotNullParameter(impressionComplete, "impressionComplete");
        Intrinsics.checkNotNullParameter(impressionView, "impressionView");
        this.f16807a = impressionDependency;
        this.f16808b = impressionClick;
        this.f16809c = impressionDismiss;
        this.f16810d = impressionComplete;
        this.f16811e = impressionView;
        this.f16812f = EnumC3937na.LOADING;
    }

    /* JADX INFO: renamed from: A */
    public final void m19833A() {
        if (mo19051j() && Intrinsics.areEqual(this.f16807a.m17670a(), AbstractC3628a0.c.f13430g)) {
            m19881z();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m19834B() {
        if (this.f16807a.m17681l().m17531b() <= 1) {
            m19843K();
            C3730ea c3730eaM17681l = this.f16807a.m17681l();
            c3730eaM17681l.m17532b(c3730eaM17681l.m17531b() + 1);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m19835C() {
        if (this.f16807a.m17687r().m18753u() == null) {
            return true;
        }
        AbstractC3969ok abstractC3969okM18753u = this.f16807a.m17687r().m18753u();
        return (abstractC3969okM18753u != null ? abstractC3969okM18753u.getRootView() : null) == null;
    }

    /* JADX INFO: renamed from: D */
    public final void m19836D() {
        try {
            if (this.f16807a.m17687r() instanceof C3809hk) {
                ((C3809hk) this.f16807a.m17687r()).m17921I();
            } else {
                this.f16807a.m17687r().m18754v();
                this.f16807a.m17687r().m18730a(EnumC4012qj.VOLUME_CHANGE);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Invalid mute video command", e);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m19837E() {
        mo19863b(this.f16807a.m17683n(), Float.valueOf(this.f16807a.m17687r().m18752t()), Float.valueOf(this.f16807a.m17687r().m18751s()));
        mo19865d();
    }

    /* JADX INFO: renamed from: F */
    public final void m19838F() {
        if (this.f16807a.m17681l().m17533c() <= 1) {
            m19834B();
            C3730ea c3730eaM17681l = this.f16807a.m17681l();
            c3730eaM17681l.m17534c(c3730eaM17681l.m17533c() + 1);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m19839G() {
        if (this.f16812f != EnumC3937na.DISPLAYED || mo19051j()) {
            return;
        }
        mo19053l();
        mo19044d(true);
    }

    /* JADX INFO: renamed from: H */
    public final void m19840H() {
        try {
            AbstractC3930n3 abstractC3930n3M17687r = this.f16807a.m17687r();
            Intrinsics.checkNotNull(abstractC3930n3M17687r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((C3809hk) abstractC3930n3M17687r).m17924L();
        } catch (Exception e) {
            C4048sb.m19410b("Invalid pause video command", e);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m19841I() {
        try {
            AbstractC3930n3 abstractC3930n3M17687r = this.f16807a.m17687r();
            Intrinsics.checkNotNull(abstractC3930n3M17687r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((C3809hk) abstractC3930n3M17687r).m17925M();
        } catch (Exception e) {
            C4048sb.m19410b("Invalid play video command", e);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m19842J() {
        this.f16812f = EnumC3937na.LOADING;
        CBError.Impression impressionM18717A = this.f16807a.m17687r().m18717A();
        if (impressionM18717A == null) {
            mo19048g();
        } else {
            m19862b(impressionM18717A);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m19843K() {
        mo16811a(this.f16807a.m17683n(), Float.valueOf(this.f16807a.m17687r().m18752t()), Float.valueOf(this.f16807a.m17687r().m18751s()));
    }

    /* JADX INFO: renamed from: L */
    public final boolean m19844L() {
        return this.f16807a.m17670a().m16772c();
    }

    /* JADX INFO: renamed from: M */
    public final void m19845M() {
        if (this.f16807a.m17681l().m17535d() <= 1) {
            m19881z();
            m19834B();
            C3730ea c3730eaM17681l = this.f16807a.m17681l();
            c3730eaM17681l.m17536d(c3730eaM17681l.m17535d() + 1);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m19846N() {
        try {
            if (this.f16807a.m17687r() instanceof C3809hk) {
                ((C3809hk) this.f16807a.m17687r()).m17927O();
            } else {
                this.f16807a.m17687r().m18720D();
                this.f16807a.m17687r().m18730a(EnumC4012qj.VOLUME_CHANGE);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Invalid unmute video command", e);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m19847O() {
        this.f16807a.m17687r().mo16800w();
    }

    /* JADX INFO: renamed from: P */
    public final void m19848P() {
        this.f16807a.m17687r().mo17930f();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3638aa
    /* JADX INFO: renamed from: a */
    public void mo16810a() {
        this.f16810d.mo16810a();
    }

    /* JADX INFO: renamed from: a */
    public final void m19849a(float f) {
        this.f16807a.m17687r().m18725a(f);
    }

    /* JADX INFO: renamed from: a */
    public final void m19850a(float f, float f2) {
        this.f16807a.m17687r().m18726a(f, f2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: a */
    public void mo19034a(ViewGroup viewGroup) {
        this.f16811e.mo19034a(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: a */
    public void mo19851a(C3884l3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f16808b.mo19851a(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3799ha
    /* JADX INFO: renamed from: a */
    public void mo17795a(EnumC3937na state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f16809c.mo17795a(state);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: a */
    public void mo19036a(EnumC3937na state, CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f16811e.mo19036a(state, activity);
    }

    /* JADX INFO: renamed from: a */
    public final void m19852a(EnumC4012qj vastVideoEvent) {
        Intrinsics.checkNotNullParameter(vastVideoEvent, "vastVideoEvent");
        this.f16807a.m17687r().m18730a(vastVideoEvent);
    }

    /* JADX INFO: renamed from: a */
    public final void m19853a(EnumC4029re playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        this.f16807a.m17687r().m18731a(playerState);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: a */
    public void mo19037a(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16811e.mo19037a(error);
    }

    /* JADX INFO: renamed from: a */
    public final void m19854a(String event) {
        List list;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.length() <= 0 || (list = (List) this.f16807a.m17671b().m16870l().get(event)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f16807a.m17687r().m18737d((String) it.next());
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: a */
    public void mo19855a(String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16808b.mo19855a(str, error);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3638aa
    /* JADX INFO: renamed from: a */
    public void mo16811a(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f16810d.mo16811a(location, f, f2);
    }

    /* JADX INFO: renamed from: a */
    public final void m19856a(List verificationScriptResourceList, Integer num) {
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        this.f16807a.m17687r().m18732a(verificationScriptResourceList, num);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: a */
    public void mo19039a(boolean z) {
        this.f16811e.mo19039a(z);
    }

    /* JADX INFO: renamed from: a */
    public final void m19857a(boolean z, String forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        this.f16807a.m17687r().m18733a(z, forceOrientation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: a */
    public boolean mo19858a(String urlFromCreative, Boolean bool, EnumC3937na impressionState) {
        Intrinsics.checkNotNullParameter(urlFromCreative, "urlFromCreative");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        return this.f16808b.mo19858a(urlFromCreative, bool, impressionState);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: b */
    public void mo19041b() {
        this.f16811e.mo19041b();
    }

    /* JADX INFO: renamed from: b */
    public final void m19859b(float f) {
        this.f16807a.m17687r().m18735b(f);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: b */
    public void mo19860b(C3884l3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f16808b.mo19860b(cbUrl);
    }

    /* JADX INFO: renamed from: b */
    public void m19861b(EnumC3937na newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f16812f = newState;
    }

    /* JADX INFO: renamed from: b */
    public final void m19862b(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (mo19051j()) {
            this.f16807a.m17672c().mo18613m();
        } else {
            mo19037a(error);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: b */
    public void mo19863b(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f16808b.mo19863b(location, f, f2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: b */
    public void mo19042b(boolean z) {
        this.f16811e.mo19042b(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3799ha
    /* JADX INFO: renamed from: c */
    public void mo17797c() {
        this.f16809c.mo17797c();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: c */
    public void mo19864c(C3884l3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f16808b.mo19864c(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: c */
    public void mo19043c(boolean z) {
        this.f16811e.mo19043c(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: d */
    public void mo19865d() {
        this.f16808b.mo19865d();
    }

    /* JADX INFO: renamed from: d */
    public final void m19866d(C3884l3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        mo19858a(cbUrl.m18483b(), cbUrl.m18482a(), this.f16812f);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: d */
    public void mo19044d(boolean z) {
        this.f16811e.mo19044d(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: e */
    public void mo19867e(boolean z) {
        this.f16808b.mo19867e(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: e */
    public boolean mo19046e() {
        return this.f16811e.mo19046e();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3799ha
    /* JADX INFO: renamed from: f */
    public void mo17798f(boolean z) {
        this.f16809c.mo17798f(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: f */
    public boolean mo19047f() {
        return this.f16811e.mo19047f();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: g */
    public void mo19048g() {
        this.f16811e.mo19048g();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: h */
    public boolean mo19049h() {
        return this.f16811e.mo19049h();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: i */
    public ViewGroup mo19050i() {
        return this.f16811e.mo19050i();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: j */
    public boolean mo19051j() {
        return this.f16811e.mo19051j();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: k */
    public void mo19052k() {
        this.f16811e.mo19052k();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: l */
    public void mo19053l() {
        this.f16811e.mo19053l();
    }

    /* JADX INFO: renamed from: m */
    public final void m19868m() {
        mo17795a(this.f16812f);
    }

    /* JADX INFO: renamed from: n */
    public final void m19869n() {
        try {
            AbstractC3930n3 abstractC3930n3M17687r = this.f16807a.m17687r();
            Intrinsics.checkNotNull(abstractC3930n3M17687r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((C3809hk) abstractC3930n3M17687r).m17917E();
        } catch (Exception e) {
            C4048sb.m19410b("Invalid close video command", e);
        }
    }

    /* JADX INFO: renamed from: o */
    public final String m19870o() {
        return this.f16807a.m17671b().m16871m();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    public void onResume() {
        this.f16811e.onResume();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    public void onStart() {
        this.f16811e.onStart();
    }

    /* JADX INFO: renamed from: p */
    public final String m19871p() {
        return this.f16807a.m17671b().m16878t();
    }

    /* JADX INFO: renamed from: q */
    public EnumC3937na m19872q() {
        return this.f16812f;
    }

    /* JADX INFO: renamed from: r */
    public final String m19873r() {
        return this.f16807a.m17683n();
    }

    /* JADX INFO: renamed from: s */
    public final String m19874s() {
        return this.f16807a.m17687r().m18741i();
    }

    /* JADX INFO: renamed from: t */
    public final String m19875t() {
        return this.f16807a.m17687r().m18743k();
    }

    /* JADX INFO: renamed from: u */
    public final String m19876u() {
        return this.f16807a.m17687r().m18745m();
    }

    /* JADX INFO: renamed from: v */
    public final String m19877v() {
        return this.f16807a.m17687r().m18747o();
    }

    /* JADX INFO: renamed from: w */
    public final String m19878w() {
        return this.f16807a.m17687r().m18748p();
    }

    /* JADX INFO: renamed from: x */
    public final int m19879x() {
        if (this.f16807a.m17687r() instanceof C3809hk) {
            return ((C3809hk) this.f16807a.m17687r()).m17919G();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC3969ok m19880y() {
        return this.f16807a.m17687r().m18753u();
    }

    /* JADX INFO: renamed from: z */
    public final void m19881z() {
        if (this.f16807a.m17681l().m17529a() <= 1) {
            mo16810a();
            C3730ea c3730eaM17681l = this.f16807a.m17681l();
            c3730eaM17681l.m17530a(c3730eaM17681l.m17529a() + 1);
        }
    }
}
