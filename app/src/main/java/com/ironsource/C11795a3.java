package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11795a3 implements InterfaceC12604xb, InterfaceC11410E2 {

    /* JADX INFO: renamed from: a */
    private final BannerAdRequest f26726a;

    /* JADX INFO: renamed from: b */
    private final AdSize f26727b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12416p2 f26728c;

    /* JADX INFO: renamed from: d */
    private final C12622yb f26729d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC12426pc f26730e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC12469s1 f26731f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC11706V<BannerAdView> f26732g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC11464H2 f26733h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC11638Qf.c f26734i;

    /* JADX INFO: renamed from: j */
    private final Executor f26735j;

    /* JADX INFO: renamed from: k */
    private C12189f5 f26736k;

    /* JADX INFO: renamed from: l */
    private InterfaceC11638Qf f26737l;

    /* JADX INFO: renamed from: m */
    private C11759Y1 f26738m;

    /* JADX INFO: renamed from: n */
    private boolean f26739n;

    /* JADX INFO: renamed from: com.ironsource.a3$a */
    public static final class a implements InterfaceC11638Qf.a {
        a() {
        }

        @Override // com.ironsource.InterfaceC11638Qf.a
        /* JADX INFO: renamed from: a */
        public void mo26432a() {
            C11795a3.this.m28104a(C12526t5.f32437a.m33766s());
        }
    }

    public C11795a3(BannerAdRequest adRequest, AdSize size, InterfaceC12416p2 auctionResponseFetcher, C12622yb loadTaskConfig, InterfaceC12426pc networkLoadApi, InterfaceC12469s1 analytics, InterfaceC11706V<BannerAdView> adLoadTaskListener, InterfaceC11464H2 adLayoutFactory, InterfaceC11638Qf.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f26726a = adRequest;
        this.f26727b = size;
        this.f26728c = auctionResponseFetcher;
        this.f26729d = loadTaskConfig;
        this.f26730e = networkLoadApi;
        this.f26731f = analytics;
        this.f26732g = adLoadTaskListener;
        this.f26733h = adLayoutFactory;
        this.f26734i = timerFactory;
        this.f26735j = taskFinishedExecutor;
    }

    /* JADX INFO: renamed from: a */
    private final void m28100a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapM26726a = C11593O5.f25279a.m26726a(bundle);
        for (String str : mapM26726a.keySet()) {
            String strValueOf = String.valueOf(mapM26726a.get(str));
            InterfaceC12293l1.c.f30773a.m31987a(new C12397o1.l(str + C11744X3.j.f26434b + strValueOf)).mo31960a(this.f26731f);
        }
    }

    @Override // com.ironsource.InterfaceC11410E2
    public void onBannerLoadFail(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        m28104a(C12526t5.f32437a.m33749c(description));
    }

    @Override // com.ironsource.InterfaceC11410E2
    public void onBannerLoadSuccess(final C11471H9 adInstance, final C12166e8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        try {
            this.f26735j.execute(new Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C11795a3.m28101a(this.f$0, adInstance, adContainer);
                }
            });
        } catch (Exception e) {
            m28103a(e);
        }
    }

    @Override // com.ironsource.InterfaceC12604xb
    public void start() {
        this.f26736k = new C12189f5();
        this.f26731f.mo31926a(new C12397o1.s(this.f26729d.m34230f()), new C12397o1.n(this.f26729d.m34231g().m32218b()), new C12397o1.c(this.f26727b), new C12397o1.b(this.f26726a.getAdId$mediationsdk_release()));
        InterfaceC12293l1.c.f30773a.m31985a().mo31960a(this.f26731f);
        m28100a(this.f26726a.getExtraParams());
        long jM34232h = this.f26729d.m34232h();
        InterfaceC11638Qf.c cVar = this.f26734i;
        InterfaceC11638Qf.b bVar = new InterfaceC11638Qf.b();
        bVar.m27309b(jM34232h);
        Unit unit = Unit.INSTANCE;
        InterfaceC11638Qf interfaceC11638QfMo27310a = cVar.mo27310a(bVar);
        this.f26737l = interfaceC11638QfMo27310a;
        if (interfaceC11638QfMo27310a != null) {
            interfaceC11638QfMo27310a.mo27305a(new a());
        }
        Object objMo32925a = this.f26728c.mo32925a();
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objMo32925a);
        if (thM44949exceptionOrNullimpl != null) {
            Intrinsics.checkNotNull(thM44949exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            m28104a(((C11782Z7) thM44949exceptionOrNullimpl).m28065a());
            objMo32925a = null;
        }
        C12315m2 c12315m2 = (C12315m2) objMo32925a;
        if (c12315m2 == null) {
            return;
        }
        InterfaceC12469s1 interfaceC12469s1 = this.f26731f;
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
        EnumC12322m9 enumC12322m9M34231g = this.f26729d.m34231g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C12130c8 c12130c8 = new C12130c8(AdapterUtils.dpToPixels(applicationContext, this.f26727b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.f26727b.getHeight()), this.f26727b.getSizeDescription());
        C11420Ec c11420Ec = new C11420Ec();
        c11420Ec.m25728a(this);
        C11471H9 adInstance = new C11489I9(this.f26726a.getProviderName$mediationsdk_release().value(), c11420Ec).m26085a(enumC12322m9M34231g.m32219b(EnumC12322m9.Bidder)).m26082a(c12130c8).m26087b(this.f26729d.m34233i()).m26083a(this.f26726a.getAdId$mediationsdk_release()).m26084a(MapsKt.plus(new C12250ic().m31741a(), C11593O5.f25279a.m26726a(this.f26726a.getExtraParams()))).m26081a();
        C12462rc c12462rc = new C12462rc(c12315m2, this.f26729d.m34234j());
        this.f26738m = new C11759Y1(new C12301l9(this.f26726a.getInstanceId(), enumC12322m9M34231g.m32218b(), c12315m2.m32128a()), new C12333d(), c12315m2.m32130c());
        InterfaceC12293l1.d.f30782a.m32010c().mo31960a(this.f26731f);
        InterfaceC12426pc interfaceC12426pc = this.f26730e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC12426pc.mo33071a(adInstance, c12462rc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m28101a(C11795a3 this$0, C11471H9 adInstance, C12166e8 adContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.f26739n) {
            return;
        }
        this$0.f26739n = true;
        InterfaceC11638Qf interfaceC11638Qf = this$0.f26737l;
        if (interfaceC11638Qf != null) {
            interfaceC11638Qf.cancel();
        }
        C12189f5 c12189f5 = this$0.f26736k;
        if (c12189f5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c12189f5 = null;
        }
        InterfaceC12293l1.c.f30773a.m31988a(new C12397o1.f(C12189f5.m31432a(c12189f5))).mo31960a(this$0.f26731f);
        C11759Y1 c11759y1 = this$0.f26738m;
        if (c11759y1 != null) {
            c11759y1.mo28006c("onBannerLoadSuccess");
        }
        InterfaceC11464H2 interfaceC11464H2 = this$0.f26733h;
        C11759Y1 c11759y2 = this$0.f26738m;
        Intrinsics.checkNotNull(c11759y2);
        this$0.f26732g.mo26683a(interfaceC11464H2.mo25974a(adInstance, adContainer, c11759y2));
    }

    public /* synthetic */ C11795a3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC12416p2 interfaceC12416p2, C12622yb c12622yb, InterfaceC12426pc interfaceC12426pc, InterfaceC12469s1 interfaceC12469s1, InterfaceC11706V interfaceC11706V, InterfaceC11464H2 interfaceC11464H2, InterfaceC11638Qf.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC12416p2, c12622yb, interfaceC12426pc, interfaceC12469s1, interfaceC11706V, interfaceC11464H2, (i & 256) != 0 ? new InterfaceC11638Qf.d() : cVar, (i & 512) != 0 ? C11613P7.f25510a.m27223d() : executor);
    }

    /* JADX INFO: renamed from: a */
    public final void m28104a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.f26735j.execute(new Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C11795a3.m28102a(this.f$0, error);
                }
            });
        } catch (Exception e) {
            m28103a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m28102a(C11795a3 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.f26739n) {
            return;
        }
        this$0.f26739n = true;
        InterfaceC11638Qf interfaceC11638Qf = this$0.f26737l;
        if (interfaceC11638Qf != null) {
            interfaceC11638Qf.cancel();
        }
        InterfaceC12293l1.c.a aVar = InterfaceC12293l1.c.f30773a;
        C12397o1.j jVar = new C12397o1.j(error.getErrorCode());
        C12397o1.k kVar = new C12397o1.k(error.getErrorMessage());
        C12189f5 c12189f5 = this$0.f26736k;
        if (c12189f5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c12189f5 = null;
        }
        aVar.m31986a(jVar, kVar, new C12397o1.f(C12189f5.m31432a(c12189f5))).mo31960a(this$0.f26731f);
        C11759Y1 c11759y1 = this$0.f26738m;
        if (c11759y1 != null) {
            c11759y1.mo28004a("onBannerLoadFail");
        }
        this$0.f26732g.mo26684b(error);
    }

    /* JADX INFO: renamed from: a */
    private final void m28103a(Exception exc) {
        IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC12293l1.d.f30782a.m32005a(new C12397o1.k(ironSourceErrorBuildLoadFailedError.getErrorMessage())).mo31960a(this.f26731f);
        IronLog.CALLBACK.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
    }
}
