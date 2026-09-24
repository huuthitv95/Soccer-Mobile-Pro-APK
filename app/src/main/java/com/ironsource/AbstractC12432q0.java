package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.q0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12432q0 {

    /* JADX INFO: renamed from: a */
    private final AbstractC12593x0 f31729a;

    /* JADX INFO: renamed from: b */
    private final C11645R6 f31730b;

    /* JADX INFO: renamed from: c */
    private final C11707V0 f31731c;

    /* JADX INFO: renamed from: d */
    private InterfaceC11552M0 f31732d;

    /* JADX INFO: renamed from: e */
    private InterfaceC12629z0 f31733e;

    /* JADX INFO: renamed from: f */
    private final C12466rg f31734f;

    /* JADX INFO: renamed from: g */
    private final WeakReference<InterfaceC11516K0> f31735g;

    /* JADX INFO: renamed from: h */
    private C12189f5 f31736h;

    /* JADX INFO: renamed from: i */
    private final C12616y5 f31737i;

    /* JADX INFO: renamed from: com.ironsource.q0$b */
    public static final class b implements InterfaceC12645zg {
        b() {
        }

        @Override // com.ironsource.InterfaceC12645zg
        /* JADX INFO: renamed from: a */
        public void mo32951a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            AbstractC12432q0.this.m33123a(i, errorReason);
        }

        @Override // com.ironsource.InterfaceC12645zg
        /* JADX INFO: renamed from: b */
        public void mo32953b(AbstractC11353B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC12432q0.this.f31737i.m34217e().m33951a(C12189f5.m31432a(AbstractC12432q0.this.f31736h), AbstractC12432q0.this.m33130e().mo26471u());
            InterfaceC11552M0 interfaceC11552M0M33135j = AbstractC12432q0.this.m33135j();
            if (interfaceC11552M0M33135j != null) {
                interfaceC11552M0M33135j.mo25479a(new C12539u0(AbstractC12432q0.this, instance.mo25345e()));
            }
        }

        @Override // com.ironsource.InterfaceC12645zg
        /* JADX INFO: renamed from: a */
        public void mo32952a(AbstractC11353B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC12432q0.this.m33131f().m33047e().m34211a().m26699e(AbstractC12432q0.this.m33133h());
            InterfaceC11552M0 interfaceC11552M0M33135j = AbstractC12432q0.this.m33135j();
            if (interfaceC11552M0M33135j != null) {
                interfaceC11552M0M33135j.mo25481b(new C12539u0(AbstractC12432q0.this, instance.mo25345e()));
            }
        }
    }

    public AbstractC12432q0(C12414p0 adTools, AbstractC12593x0 adUnitData, InterfaceC11516K0 listener, C11645R6 taskScheduler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.f31729a = adUnitData;
        this.f31730b = taskScheduler;
        C11707V0 c11707v0 = new C11707V0(adTools, adUnitData, C11426F0.b.MEDIATION);
        this.f31731c = c11707v0;
        this.f31734f = new C12466rg(c11707v0, adUnitData, false, m33121c());
        this.f31735g = new WeakReference<>(listener);
        this.f31737i = c11707v0.m33047e();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.mo26467b().m31567a() + ", adUnitId = " + adUnitData.mo26467b().m31570c());
    }

    /* JADX INFO: renamed from: a */
    protected abstract InterfaceC11407E mo26341a();

    /* JADX INFO: renamed from: d */
    public InterfaceC12274k0 m33129d() {
        return this.f31734f.m33270h() ? InterfaceC12274k0.b.f30717a : new InterfaceC12274k0.a(null, 1, null);
    }

    /* JADX INFO: renamed from: e */
    protected final AbstractC12593x0 m33130e() {
        return this.f31729a;
    }

    /* JADX INFO: renamed from: f */
    protected final C11707V0 m33131f() {
        return this.f31731c;
    }

    /* JADX INFO: renamed from: g */
    protected final C12135cd m33132g() {
        return this.f31729a.mo26467b().m31573f();
    }

    /* JADX INFO: renamed from: h */
    protected final String m33133h() {
        return this.f31729a.m34082l();
    }

    /* JADX INFO: renamed from: i */
    protected final InterfaceC12629z0 m33134i() {
        return this.f31733e;
    }

    /* JADX INFO: renamed from: j */
    protected final InterfaceC11552M0 m33135j() {
        return this.f31732d;
    }

    /* JADX INFO: renamed from: k */
    protected final C12466rg m33136k() {
        return this.f31734f;
    }

    /* JADX INFO: renamed from: c */
    private final b m33121c() {
        return new b();
    }

    /* JADX INFO: renamed from: a */
    protected final void m33126a(InterfaceC12629z0 interfaceC12629z0) {
        this.f31733e = interfaceC12629z0;
    }

    /* JADX INFO: renamed from: b */
    protected final void m33128b(InterfaceC11552M0 interfaceC11552M0) {
        this.f31732d = interfaceC11552M0;
    }

    /* JADX INFO: renamed from: a */
    public void m33125a(InterfaceC11552M0 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f31731c, (String) null, (String) null, 3, (Object) null));
        this.f31731c.m27635a(mo26343b());
        this.f31732d = loadListener;
        this.f31737i.m34213a(this.f31729a.mo26471u());
        this.f31736h = new C12189f5();
        this.f31734f.m33263a(mo26341a());
    }

    /* JADX INFO: renamed from: b */
    public C12468s0 mo26343b() {
        return new C12468s0(this.f31729a.mo26467b());
    }

    /* JADX INFO: renamed from: com.ironsource.q0$a */
    protected class a implements InterfaceC11425F {
        public a() {
        }

        @Override // com.ironsource.InterfaceC11425F
        /* JADX INFO: renamed from: a */
        public void mo25742a(AbstractC11353B instance, IronSourceError error) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.INTERNAL.verbose(AbstractC12432q0.this.m33122a(instance.m25356q()));
            AbstractC12432q0.this.f31737i.m34211a().m26690a(AbstractC12432q0.this.m33133h(), error.getErrorCode(), error.getErrorMessage(), null);
            InterfaceC12629z0 interfaceC12629z0M33134i = AbstractC12432q0.this.m33134i();
            if (interfaceC12629z0M33134i != null) {
                interfaceC12629z0M33134i.mo26402c(error);
            }
        }

        @Override // com.ironsource.InterfaceC11425F
        /* JADX INFO: renamed from: b */
        public void mo25743b(AbstractC11353B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC12432q0.this.m33122a(instance.m25356q()));
            AbstractC12432q0.this.m33136k().m33266c(instance);
            AbstractC12432q0.this.f31737i.m34211a().m26701g(AbstractC12432q0.this.m33133h());
            AbstractC12432q0.this.m33131f().m27642l().mo26267b(AbstractC12432q0.this.m33130e().mo26467b().m31567a());
        }

        @Override // com.ironsource.InterfaceC11425F
        /* JADX INFO: renamed from: a */
        public void mo25741a(AbstractC11353B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC12432q0.this.f31737i.m34211a().m26689a(AbstractC12432q0.this.m33133h());
            InterfaceC11516K0 interfaceC11516K0 = (InterfaceC11516K0) AbstractC12432q0.this.f31735g.get();
            if (interfaceC11516K0 != null) {
                interfaceC11516K0.mo26245e();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33124a(InterfaceC11515K adInstancePresenter, InterfaceC12629z0 displayListener) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.f31733e = displayListener;
        this.f31734f.m33264a(adInstancePresenter, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m33127a(boolean z) {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f31731c, (String) null, (String) null, 3, (Object) null));
        this.f31734f.m33267d();
        if (z) {
            this.f31731c.m33047e().m34217e().m33945a(this.f31731c.m33048f());
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m33123a(int i, String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(m33122a("errorCode = " + i + ", errorReason = " + errorReason));
        this.f31737i.m34217e().m33949a(C12189f5.m31432a(this.f31736h), i, errorReason, this.f31729a.mo26471u());
        InterfaceC11552M0 interfaceC11552M0 = this.f31732d;
        if (interfaceC11552M0 != null) {
            interfaceC11552M0.mo25478a(new IronSourceError(i, errorReason));
        }
    }

    /* JADX INFO: renamed from: a */
    protected final String m33122a(String str) {
        return C12414p0.m33033a(this.f31731c, str, (String) null, 2, (Object) null);
    }

    public /* synthetic */ AbstractC12432q0(C12414p0 c12414p0, AbstractC12593x0 abstractC12593x0, InterfaceC11516K0 interfaceC11516K0, C11645R6 c11645r6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12414p0, abstractC12593x0, interfaceC11516K0, (i & 8) != 0 ? new C11645R6(C11662S6.m27451a(c12414p0.m33225a())) : c11645r6);
    }
}
