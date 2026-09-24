package com.ironsource;

import android.os.Bundle;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Ld */
/* JADX INFO: loaded from: classes6.dex */
public final class C11547Ld implements InterfaceC12604xb, InterfaceC11780Z5 {

    /* JADX INFO: renamed from: a */
    private final RewardedAdRequest f25070a;

    /* JADX INFO: renamed from: b */
    private final C12622yb f25071b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11706V<RewardedAd> f25072c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12416p2 f25073d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC12426pc f25074e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC12469s1 f25075f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC12158e0<RewardedAd> f25076g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC11638Qf.c f25077h;

    /* JADX INFO: renamed from: i */
    private final Executor f25078i;

    /* JADX INFO: renamed from: j */
    private C12189f5 f25079j;

    /* JADX INFO: renamed from: k */
    private InterfaceC11638Qf f25080k;

    /* JADX INFO: renamed from: l */
    private C11759Y1 f25081l;

    /* JADX INFO: renamed from: m */
    private boolean f25082m;

    /* JADX INFO: renamed from: com.ironsource.Ld$a */
    public static final class a implements InterfaceC11638Qf.a {
        a() {
        }

        @Override // com.ironsource.InterfaceC11638Qf.a
        /* JADX INFO: renamed from: a */
        public void mo26432a() {
            C11547Ld.this.m26430a(C12526t5.f32437a.m33766s());
        }
    }

    public C11547Ld(RewardedAdRequest adRequest, C12622yb loadTaskConfig, InterfaceC11706V<RewardedAd> adLoadTaskListener, InterfaceC12416p2 auctionResponseFetcher, InterfaceC12426pc networkLoadApi, InterfaceC12469s1 analytics, InterfaceC12158e0<RewardedAd> adObjectFactory, InterfaceC11638Qf.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f25070a = adRequest;
        this.f25071b = loadTaskConfig;
        this.f25072c = adLoadTaskListener;
        this.f25073d = auctionResponseFetcher;
        this.f25074e = networkLoadApi;
        this.f25075f = analytics;
        this.f25076g = adObjectFactory;
        this.f25077h = timerFactory;
        this.f25078i = taskFinishedExecutor;
    }

    @Override // com.ironsource.InterfaceC11780Z5
    /* JADX INFO: renamed from: a */
    public void mo26429a(final C11471H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            this.f25078i.execute(new Runnable() { // from class: com.ironsource.Ld$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C11547Ld.m26426a(this.f$0, adInstance);
                }
            });
        } catch (Exception e) {
            m26428a(e);
        }
    }

    @Override // com.ironsource.InterfaceC12604xb
    public void start() {
        this.f25079j = new C12189f5();
        this.f25075f.mo31926a(new C12397o1.s(this.f25071b.m34230f()), new C12397o1.n(this.f25071b.m34231g().m32218b()), new C12397o1.b(this.f25070a.getAdId$mediationsdk_release()));
        InterfaceC12293l1.c.f30773a.m31985a().mo31960a(this.f25075f);
        m26425a(this.f25070a.getExtraParams());
        long jM34232h = this.f25071b.m34232h();
        InterfaceC11638Qf.c cVar = this.f25077h;
        InterfaceC11638Qf.b bVar = new InterfaceC11638Qf.b();
        bVar.m27309b(jM34232h);
        Unit unit = Unit.INSTANCE;
        InterfaceC11638Qf interfaceC11638QfMo27310a = cVar.mo27310a(bVar);
        this.f25080k = interfaceC11638QfMo27310a;
        if (interfaceC11638QfMo27310a != null) {
            interfaceC11638QfMo27310a.mo27305a(new a());
        }
        Object objMo32925a = this.f25073d.mo32925a();
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objMo32925a);
        if (thM44949exceptionOrNullimpl != null) {
            Intrinsics.checkNotNull(thM44949exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            m26430a(((C11782Z7) thM44949exceptionOrNullimpl).m28065a());
            objMo32925a = null;
        }
        C12315m2 c12315m2 = (C12315m2) objMo32925a;
        if (c12315m2 == null) {
            return;
        }
        InterfaceC12469s1 interfaceC12469s1 = this.f25075f;
        String strM32129b = c12315m2.m32129b();
        if (strM32129b != null) {
            interfaceC12469s1.mo31926a(new C12397o1.d(strM32129b));
        }
        JSONObject jSONObjectM32133f = c12315m2.m32133f();
        if (jSONObjectM32133f != null) {
            interfaceC12469s1.mo31926a(new C12397o1.m(jSONObjectM32133f));
        }
        String strM32128a = c12315m2.m32128a();
        if (strM32128a != null) {
            interfaceC12469s1.mo31926a(new C12397o1.g(strM32128a));
        }
        EnumC12322m9 enumC12322m9M34231g = this.f25071b.m34231g();
        C11763Y5 c11763y5 = new C11763Y5();
        c11763y5.m28010a(this);
        C11471H9 adInstance = new C11489I9(this.f25070a.getProviderName$mediationsdk_release().value(), c11763y5).m26085a(enumC12322m9M34231g.m32219b(EnumC12322m9.Bidder)).m26087b(this.f25071b.m34233i()).m26089c().m26083a(this.f25070a.getAdId$mediationsdk_release()).m26084a(MapsKt.plus(new C12250ic().m31741a(), C11593O5.f25279a.m26726a(this.f25070a.getExtraParams()))).m26081a();
        InterfaceC12469s1 interfaceC12469s2 = this.f25075f;
        String strM25995e = adInstance.m25995e();
        Intrinsics.checkNotNullExpressionValue(strM25995e, "adInstance.id");
        interfaceC12469s2.mo31926a(new C12397o1.b(strM25995e));
        C12462rc c12462rc = new C12462rc(c12315m2, this.f25071b.m34234j());
        this.f25081l = new C11759Y1(new C12301l9(this.f25070a.getInstanceId(), enumC12322m9M34231g.m32218b(), c12315m2.m32128a()), new C12333d(), c12315m2.m32130c());
        InterfaceC12293l1.d.f30782a.m32010c().mo31960a(this.f25075f);
        InterfaceC12426pc interfaceC12426pc = this.f25074e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC12426pc.mo33071a(adInstance, c12462rc);
    }

    public /* synthetic */ C11547Ld(RewardedAdRequest rewardedAdRequest, C12622yb c12622yb, InterfaceC11706V interfaceC11706V, InterfaceC12416p2 interfaceC12416p2, InterfaceC12426pc interfaceC12426pc, InterfaceC12469s1 interfaceC12469s1, InterfaceC12158e0 interfaceC12158e0, InterfaceC11638Qf.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, c12622yb, interfaceC11706V, interfaceC12416p2, interfaceC12426pc, interfaceC12469s1, interfaceC12158e0, (i & 128) != 0 ? new InterfaceC11638Qf.d() : cVar, (i & 256) != 0 ? C11613P7.f25510a.m27223d() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26426a(C11547Ld this$0, C11471H9 adInstance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.f25082m) {
            return;
        }
        this$0.f25082m = true;
        InterfaceC11638Qf interfaceC11638Qf = this$0.f25080k;
        if (interfaceC11638Qf != null) {
            interfaceC11638Qf.cancel();
        }
        C12189f5 c12189f5 = this$0.f25079j;
        if (c12189f5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c12189f5 = null;
        }
        InterfaceC12293l1.c.f30773a.m31988a(new C12397o1.f(C12189f5.m31432a(c12189f5))).mo31960a(this$0.f25075f);
        C11759Y1 c11759y1 = this$0.f25081l;
        if (c11759y1 != null) {
            c11759y1.mo28006c("onAdInstanceLoadSuccess");
        }
        InterfaceC12158e0<RewardedAd> interfaceC12158e0 = this$0.f25076g;
        C11759Y1 c11759y2 = this$0.f25081l;
        Intrinsics.checkNotNull(c11759y2);
        this$0.f25072c.mo26683a(interfaceC12158e0.mo25927a(adInstance, c11759y2));
    }

    /* JADX INFO: renamed from: a */
    private final void m26425a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapM26726a = C11593O5.f25279a.m26726a(bundle);
        for (String str : mapM26726a.keySet()) {
            String strValueOf = String.valueOf(mapM26726a.get(str));
            InterfaceC12293l1.c.f30773a.m31987a(new C12397o1.l(str + C11744X3.j.f26434b + strValueOf)).mo31960a(this.f25075f);
        }
    }

    @Override // com.ironsource.InterfaceC11780Z5
    /* JADX INFO: renamed from: a */
    public void mo26431a(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        m26430a(C12526t5.f32437a.m33749c(description));
    }

    /* JADX INFO: renamed from: a */
    public final void m26430a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.f25078i.execute(new Runnable() { // from class: com.ironsource.Ld$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C11547Ld.m26427a(this.f$0, error);
                }
            });
        } catch (Exception e) {
            m26428a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26427a(C11547Ld this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.f25082m) {
            return;
        }
        this$0.f25082m = true;
        InterfaceC11638Qf interfaceC11638Qf = this$0.f25080k;
        if (interfaceC11638Qf != null) {
            interfaceC11638Qf.cancel();
        }
        InterfaceC12293l1.c.a aVar = InterfaceC12293l1.c.f30773a;
        C12397o1.j jVar = new C12397o1.j(error.getErrorCode());
        C12397o1.k kVar = new C12397o1.k(error.getErrorMessage());
        C12189f5 c12189f5 = this$0.f25079j;
        if (c12189f5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c12189f5 = null;
        }
        aVar.m31986a(jVar, kVar, new C12397o1.f(C12189f5.m31432a(c12189f5))).mo31960a(this$0.f25075f);
        C11759Y1 c11759y1 = this$0.f25081l;
        if (c11759y1 != null) {
            c11759y1.mo28004a("onAdInstanceLoadFail");
        }
        this$0.f25072c.mo26684b(error);
    }

    /* JADX INFO: renamed from: a */
    private final void m26428a(Exception exc) {
        IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC12293l1.d.f30782a.m32005a(new C12397o1.k(ironSourceErrorBuildLoadFailedError.getErrorMessage())).mo31960a(this.f25075f);
        IronLog.CALLBACK.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
    }
}
