package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12530t9 implements InterfaceC11798a6 {

    /* JADX INFO: renamed from: a */
    private C11471H9 f32445a;

    /* JADX INFO: renamed from: b */
    private InterfaceC12122c0 f32446b;

    /* JADX INFO: renamed from: c */
    private InterfaceC11776Z1 f32447c;

    /* JADX INFO: renamed from: d */
    private InterfaceC12469s1 f32448d;

    /* JADX INFO: renamed from: e */
    private InterfaceC12214gc f32449e;

    /* JADX INFO: renamed from: f */
    private InterfaceC11621Pf f32450f;

    /* JADX INFO: renamed from: g */
    private InterfaceC11524K8 f32451g;

    /* JADX INFO: renamed from: h */
    private InterfaceC11524K8.a f32452h;

    /* JADX INFO: renamed from: i */
    private final Map<String, C12530t9> f32453i;

    /* JADX INFO: renamed from: j */
    private InterstitialAdInfo f32454j;

    /* JADX INFO: renamed from: k */
    private InterfaceC12548u9 f32455k;

    public C12530t9(C11471H9 adInstance, InterfaceC12122c0 adNetworkShow, InterfaceC11776Z1 auctionDataReporter, InterfaceC12469s1 analytics, InterfaceC12214gc networkDestroyAPI, InterfaceC11621Pf threadManager, InterfaceC11524K8 sessionDepthService, InterfaceC11524K8.a sessionDepthServiceEditor, Map<String, C12530t9> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f32445a = adInstance;
        this.f32446b = adNetworkShow;
        this.f32447c = auctionDataReporter;
        this.f32448d = analytics;
        this.f32449e = networkDestroyAPI;
        this.f32450f = threadManager;
        this.f32451g = sessionDepthService;
        this.f32452h = sessionDepthServiceEditor;
        this.f32453i = retainer;
        String strM25996f = adInstance.m25996f();
        Intrinsics.checkNotNullExpressionValue(strM25996f, "adInstance.instanceId");
        String strM25995e = this.f32445a.m25995e();
        Intrinsics.checkNotNullExpressionValue(strM25995e, "adInstance.id");
        this.f32454j = new InterstitialAdInfo(strM25996f, strM25995e);
        C11763Y5 c11763y5 = new C11763Y5();
        this.f32445a.m25990a(c11763y5);
        c11763y5.m28011a(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m33784a(InterstitialAdInfo interstitialAdInfo) {
        Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.f32454j = interstitialAdInfo;
    }

    /* JADX INFO: renamed from: b */
    public final InterstitialAdInfo m33785b() {
        return this.f32454j;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC12548u9 m33786c() {
        return this.f32455k;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m33787d() {
        boolean zMo31208a = this.f32446b.mo31208a(this.f32445a);
        InterfaceC12293l1.a.f30759a.m31972a(zMo31208a).mo31960a(this.f32448d);
        return zMo31208a;
    }

    protected final void finalize() {
        m33781a();
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC12293l1.a.f30759a.m31978f(new InterfaceC12415p1[0]).mo31960a(this.f32448d);
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidClick() {
        InterfaceC12293l1.a.f30759a.m31970a().mo31960a(this.f32448d);
        this.f32450f.mo27215a(new Runnable() { // from class: com.ironsource.t9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12530t9.m33778b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidDismiss() {
        this.f32453i.remove(this.f32454j.getAdId());
        InterfaceC12293l1.a.f30759a.m31973a(new InterfaceC12415p1[0]).mo31960a(this.f32448d);
        this.f32450f.mo27215a(new Runnable() { // from class: com.ironsource.t9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C12530t9.m33779c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidReward(String str, int i) {
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidShow() {
        InterfaceC11524K8 interfaceC11524K8 = this.f32451g;
        IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.INTERSTITIAL;
        InterfaceC12293l1.a.f30759a.m31974b(new C12397o1.w(interfaceC11524K8.mo26265a(enumC12328a))).mo31960a(this.f32448d);
        this.f32452h.mo26267b(enumC12328a);
        this.f32447c.mo28005b("onAdInstanceDidShow");
        this.f32450f.mo27215a(new Runnable() { // from class: com.ironsource.t9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12530t9.m33780d(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m33778b(C12530t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC12548u9 interfaceC12548u9 = this$0.f32455k;
        if (interfaceC12548u9 != null) {
            interfaceC12548u9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m33779c(C12530t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC12548u9 interfaceC12548u9 = this$0.f32455k;
        if (interfaceC12548u9 != null) {
            interfaceC12548u9.onAdInstanceDidDismiss();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33783a(InterfaceC12548u9 interfaceC12548u9) {
        this.f32455k = interfaceC12548u9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m33780d(C12530t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC12548u9 interfaceC12548u9 = this$0.f32455k;
        if (interfaceC12548u9 != null) {
            interfaceC12548u9.onAdInstanceDidShow();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33782a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f32453i.put(this.f32454j.getAdId(), this);
        if (!this.f32446b.mo31208a(this.f32445a)) {
            m33775a(C12526t5.f32437a.m33767t());
        } else {
            InterfaceC12293l1.a.f30759a.m31976d(new InterfaceC12415p1[0]).mo31960a(this.f32448d);
            this.f32446b.mo31207a(activity, this.f32445a);
        }
    }

    @Override // com.ironsource.InterfaceC11798a6
    /* JADX INFO: renamed from: a */
    public void mo26229a(String str) {
        m33775a(C12526t5.f32437a.m33748c(new IronSourceError(0, str)));
    }

    /* JADX INFO: renamed from: a */
    private final void m33775a(final IronSourceError ironSourceError) {
        this.f32453i.remove(this.f32454j.getAdId());
        InterfaceC12293l1.a.f30759a.m31971a(new C12397o1.j(ironSourceError.getErrorCode()), new C12397o1.k(ironSourceError.getErrorMessage())).mo31960a(this.f32448d);
        this.f32450f.mo27215a(new Runnable() { // from class: com.ironsource.t9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C12530t9.m33777a(this.f$0, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33777a(C12530t9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC12548u9 interfaceC12548u9 = this$0.f32455k;
        if (interfaceC12548u9 != null) {
            interfaceC12548u9.onAdInstanceDidFailedToShow(error);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33781a() {
        InterfaceC11621Pf.CC.m27261a(this.f32450f, new Runnable() { // from class: com.ironsource.t9$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C12530t9.m33776a(this.f$0);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33776a(C12530t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC12293l1.d.f30782a.m32008b().mo31960a(this$0.f32448d);
        this$0.f32449e.mo31555a(this$0.f32445a);
    }

    public /* synthetic */ C12530t9(C11471H9 c11471h9, InterfaceC12122c0 interfaceC12122c0, InterfaceC11776Z1 interfaceC11776Z1, InterfaceC12469s1 interfaceC12469s1, InterfaceC12214gc interfaceC12214gc, InterfaceC11621Pf interfaceC11621Pf, InterfaceC11524K8 interfaceC11524K8, InterfaceC11524K8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11471h9, interfaceC12122c0, interfaceC11776Z1, interfaceC12469s1, (i & 16) != 0 ? new C12232hc() : interfaceC12214gc, (i & 32) != 0 ? C11613P7.f25510a : interfaceC11621Pf, (i & 64) != 0 ? C11455Gb.f24351s.m25905d().mo25852s() : interfaceC11524K8, (i & 128) != 0 ? C11455Gb.f24351s.m25903a().mo25775i() : aVar, map);
    }
}
