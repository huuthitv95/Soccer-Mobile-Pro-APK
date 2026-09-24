package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Jd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11511Jd implements InterfaceC11798a6 {

    /* JADX INFO: renamed from: a */
    private C11471H9 f24768a;

    /* JADX INFO: renamed from: b */
    private InterfaceC12122c0 f24769b;

    /* JADX INFO: renamed from: c */
    private InterfaceC11776Z1 f24770c;

    /* JADX INFO: renamed from: d */
    private InterfaceC12469s1 f24771d;

    /* JADX INFO: renamed from: e */
    private InterfaceC12214gc f24772e;

    /* JADX INFO: renamed from: f */
    private InterfaceC11621Pf f24773f;

    /* JADX INFO: renamed from: g */
    private InterfaceC11524K8 f24774g;

    /* JADX INFO: renamed from: h */
    private InterfaceC11524K8.a f24775h;

    /* JADX INFO: renamed from: i */
    private final Map<String, C11511Jd> f24776i;

    /* JADX INFO: renamed from: j */
    private RewardedAdInfo f24777j;

    /* JADX INFO: renamed from: k */
    private InterfaceC11529Kd f24778k;

    public C11511Jd(C11471H9 adInstance, InterfaceC12122c0 adNetworkShow, InterfaceC11776Z1 auctionDataReporter, InterfaceC12469s1 analytics, InterfaceC12214gc networkDestroyAPI, InterfaceC11621Pf threadManager, InterfaceC11524K8 sessionDepthService, InterfaceC11524K8.a sessionDepthServiceEditor, Map<String, C11511Jd> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f24768a = adInstance;
        this.f24769b = adNetworkShow;
        this.f24770c = auctionDataReporter;
        this.f24771d = analytics;
        this.f24772e = networkDestroyAPI;
        this.f24773f = threadManager;
        this.f24774g = sessionDepthService;
        this.f24775h = sessionDepthServiceEditor;
        this.f24776i = retainer;
        String strM25996f = adInstance.m25996f();
        Intrinsics.checkNotNullExpressionValue(strM25996f, "adInstance.instanceId");
        String strM25995e = this.f24768a.m25995e();
        Intrinsics.checkNotNullExpressionValue(strM25995e, "adInstance.id");
        this.f24777j = new RewardedAdInfo(strM25996f, strM25995e);
        C11763Y5 c11763y5 = new C11763Y5();
        this.f24768a.m25990a(c11763y5);
        c11763y5.m28011a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m26224e(C11511Jd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC11529Kd interfaceC11529Kd = this$0.f24778k;
        if (interfaceC11529Kd != null) {
            interfaceC11529Kd.onRewardedAdShown();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m26228a(RewardedAdInfo rewardedAdInfo) {
        Intrinsics.checkNotNullParameter(rewardedAdInfo, "<set-?>");
        this.f24777j = rewardedAdInfo;
    }

    /* JADX INFO: renamed from: b */
    public final RewardedAdInfo m26230b() {
        return this.f24777j;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC11529Kd m26231c() {
        return this.f24778k;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26232d() {
        boolean zMo31208a = this.f24769b.mo31208a(this.f24768a);
        InterfaceC12293l1.a.f30759a.m31972a(zMo31208a).mo31960a(this.f24771d);
        return zMo31208a;
    }

    protected final void finalize() {
        m26225a();
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC12293l1.a.f30759a.m31978f(new InterfaceC12415p1[0]).mo31960a(this.f24771d);
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidClick() {
        InterfaceC12293l1.a.f30759a.m31970a().mo31960a(this.f24771d);
        this.f24773f.mo27215a(new Runnable() { // from class: com.ironsource.Jd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11511Jd.m26221b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidDismiss() {
        this.f24776i.remove(this.f24777j.getAdId());
        InterfaceC12293l1.a.f30759a.m31973a(new InterfaceC12415p1[0]).mo31960a(this.f24771d);
        this.f24773f.mo27215a(new Runnable() { // from class: com.ironsource.Jd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C11511Jd.m26222c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidReward(String str, int i) {
        C12397o1.u uVar = new C12397o1.u("Virtual Item");
        C12397o1.t tVar = new C12397o1.t(1);
        C12397o1.q qVar = new C12397o1.q("DefaultRewardedVideo");
        String strM32732a = IronSourceUtils.m32732a(System.currentTimeMillis(), this.f24768a.m25997g());
        Intrinsics.checkNotNullExpressionValue(strM32732a, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC12293l1.a.f30759a.m31975c(uVar, tVar, qVar, new C12397o1.y(strM32732a)).mo31960a(this.f24771d);
        this.f24773f.mo27215a(new Runnable() { // from class: com.ironsource.Jd$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C11511Jd.m26223d(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11798a6
    public void onAdInstanceDidShow() {
        InterfaceC11524K8 interfaceC11524K8 = this.f24774g;
        IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.REWARDED_VIDEO;
        InterfaceC12293l1.a.f30759a.m31974b(new C12397o1.w(interfaceC11524K8.mo26265a(enumC12328a))).mo31960a(this.f24771d);
        this.f24775h.mo26267b(enumC12328a);
        this.f24770c.mo28005b("onAdInstanceDidShow");
        this.f24773f.mo27215a(new Runnable() { // from class: com.ironsource.Jd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C11511Jd.m26224e(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m26221b(C11511Jd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC11529Kd interfaceC11529Kd = this$0.f24778k;
        if (interfaceC11529Kd != null) {
            interfaceC11529Kd.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m26222c(C11511Jd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC11529Kd interfaceC11529Kd = this$0.f24778k;
        if (interfaceC11529Kd != null) {
            interfaceC11529Kd.onRewardedAdDismissed();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m26227a(InterfaceC11529Kd interfaceC11529Kd) {
        this.f24778k = interfaceC11529Kd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m26223d(C11511Jd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC11529Kd interfaceC11529Kd = this$0.f24778k;
        if (interfaceC11529Kd != null) {
            interfaceC11529Kd.onUserEarnedReward();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m26226a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f24776i.put(this.f24777j.getAdId(), this);
        if (!this.f24769b.mo31208a(this.f24768a)) {
            m26220a(C12526t5.f32437a.m33767t());
        } else {
            InterfaceC12293l1.a.f30759a.m31976d(new InterfaceC12415p1[0]).mo31960a(this.f24771d);
            this.f24769b.mo31207a(activity, this.f24768a);
        }
    }

    @Override // com.ironsource.InterfaceC11798a6
    /* JADX INFO: renamed from: a */
    public void mo26229a(String str) {
        m26220a(C12526t5.f32437a.m33748c(new IronSourceError(0, str)));
    }

    /* JADX INFO: renamed from: a */
    private final void m26220a(final IronSourceError ironSourceError) {
        this.f24776i.remove(this.f24777j.getAdId());
        InterfaceC12293l1.a.f30759a.m31971a(new C12397o1.j(ironSourceError.getErrorCode()), new C12397o1.k(ironSourceError.getErrorMessage())).mo31960a(this.f24771d);
        this.f24773f.mo27215a(new Runnable() { // from class: com.ironsource.Jd$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C11511Jd.m26219a(this.f$0, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26219a(C11511Jd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC11529Kd interfaceC11529Kd = this$0.f24778k;
        if (interfaceC11529Kd != null) {
            interfaceC11529Kd.onRewardedAdFailedToShow(error);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m26225a() {
        InterfaceC11621Pf.CC.m27261a(this.f24773f, new Runnable() { // from class: com.ironsource.Jd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C11511Jd.m26218a(this.f$0);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26218a(C11511Jd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC12293l1.d.f30782a.m32008b().mo31960a(this$0.f24771d);
        this$0.f24772e.mo31555a(this$0.f24768a);
    }

    public /* synthetic */ C11511Jd(C11471H9 c11471h9, InterfaceC12122c0 interfaceC12122c0, InterfaceC11776Z1 interfaceC11776Z1, InterfaceC12469s1 interfaceC12469s1, InterfaceC12214gc interfaceC12214gc, InterfaceC11621Pf interfaceC11621Pf, InterfaceC11524K8 interfaceC11524K8, InterfaceC11524K8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11471h9, interfaceC12122c0, interfaceC11776Z1, interfaceC12469s1, (i & 16) != 0 ? new C12232hc() : interfaceC12214gc, (i & 32) != 0 ? C11613P7.f25510a : interfaceC11621Pf, (i & 64) != 0 ? C11455Gb.f24351s.m25905d().mo25852s() : interfaceC11524K8, (i & 128) != 0 ? C11455Gb.f24351s.m25903a().mo25775i() : aVar, map);
    }
}
