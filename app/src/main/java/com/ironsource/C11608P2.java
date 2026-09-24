package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.P2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11608P2 implements InterfaceC11446G2 {

    /* JADX INFO: renamed from: a */
    private final C11471H9 f25327a;

    /* JADX INFO: renamed from: b */
    private final C12166e8 f25328b;

    /* JADX INFO: renamed from: c */
    private final C11759Y1 f25329c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12469s1 f25330d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC12214gc f25331e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC11621Pf f25332f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC11524K8 f25333g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC11524K8.a f25334h;

    /* JADX INFO: renamed from: i */
    private BannerAdInfo f25335i;

    /* JADX INFO: renamed from: j */
    private WeakReference<InterfaceC11625Q2> f25336j;

    /* JADX INFO: renamed from: k */
    private WeakReference<FrameLayout> f25337k;

    /* JADX INFO: renamed from: com.ironsource.P2$a */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            C12130c8 size = C11608P2.this.m26812d().getSize();
            ((FrameLayout) v).addView(C11608P2.this.m26812d(), 0, new FrameLayout.LayoutParams(size.m31264c(), size.m31262a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            ((FrameLayout) v).removeAllViews();
        }
    }

    public C11608P2(C11471H9 adInstance, C12166e8 container, C11759Y1 auctionDataReporter, InterfaceC12469s1 analytics, InterfaceC12214gc networkDestroyAPI, InterfaceC11621Pf threadManager, InterfaceC11524K8 sessionDepthService, InterfaceC11524K8.a sessionDepthServiceEditor) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        this.f25327a = adInstance;
        this.f25328b = container;
        this.f25329c = auctionDataReporter;
        this.f25330d = analytics;
        this.f25331e = networkDestroyAPI;
        this.f25332f = threadManager;
        this.f25333g = sessionDepthService;
        this.f25334h = sessionDepthServiceEditor;
        String strM25996f = adInstance.m25996f();
        Intrinsics.checkNotNullExpressionValue(strM25996f, "adInstance.instanceId");
        String strM25995e = adInstance.m25995e();
        Intrinsics.checkNotNullExpressionValue(strM25995e, "adInstance.id");
        this.f25335i = new BannerAdInfo(strM25996f, strM25995e);
        this.f25336j = new WeakReference<>(null);
        this.f25337k = new WeakReference<>(null);
        C11420Ec c11420Ec = new C11420Ec();
        adInstance.m25990a(c11420Ec);
        c11420Ec.m25729a(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m26807a(BannerAdInfo bannerAdInfo) {
        Intrinsics.checkNotNullParameter(bannerAdInfo, "<set-?>");
        this.f25335i = bannerAdInfo;
    }

    /* JADX INFO: renamed from: b */
    public final void m26810b(WeakReference<FrameLayout> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f25337k = value;
        FrameLayout frameLayout = value.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(m26803a());
        }
    }

    /* JADX INFO: renamed from: c */
    public final BannerAdInfo m26811c() {
        return this.f25335i;
    }

    /* JADX INFO: renamed from: d */
    public final C12166e8 m26812d() {
        return this.f25328b;
    }

    /* JADX INFO: renamed from: e */
    public final WeakReference<InterfaceC11625Q2> m26813e() {
        return this.f25336j;
    }

    /* JADX INFO: renamed from: f */
    public final WeakReference<FrameLayout> m26814f() {
        return this.f25337k;
    }

    protected final void finalize() {
        m26809b();
    }

    @Override // com.ironsource.InterfaceC11446G2
    public void onBannerClick() {
        InterfaceC12293l1.a.f30759a.m31970a().mo31960a(this.f25330d);
        this.f25332f.mo27215a(new Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C11608P2.m26805b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11446G2
    public void onBannerShowSuccess() {
        InterfaceC11524K8 interfaceC11524K8 = this.f25333g;
        IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.BANNER;
        InterfaceC12293l1.a.f30759a.m31978f(new C12397o1.w(interfaceC11524K8.mo26265a(enumC12328a))).mo31960a(this.f25330d);
        this.f25334h.mo26267b(enumC12328a);
        this.f25329c.mo28005b("onBannerShowSuccess");
        this.f25332f.mo27215a(new Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11608P2.m26806c(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m26806c(C11608P2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC11625Q2 interfaceC11625Q2 = this$0.f25336j.get();
        if (interfaceC11625Q2 != null) {
            interfaceC11625Q2.onBannerAdShown();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m26808a(WeakReference<InterfaceC11625Q2> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f25336j = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26804a(C11608P2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC12293l1.d.f30782a.m32008b().mo31960a(this$0.f25330d);
        this$0.f25331e.mo31555a(this$0.f25327a);
    }

    /* JADX INFO: renamed from: b */
    public final void m26809b() {
        InterfaceC11621Pf.CC.m27261a(this.f25332f, new Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C11608P2.m26804a(this.f$0);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: renamed from: a */
    private final a m26803a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m26805b(C11608P2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC11625Q2 interfaceC11625Q2 = this$0.f25336j.get();
        if (interfaceC11625Q2 != null) {
            interfaceC11625Q2.onBannerAdClicked();
        }
    }

    public /* synthetic */ C11608P2(C11471H9 c11471h9, C12166e8 c12166e8, C11759Y1 c11759y1, InterfaceC12469s1 interfaceC12469s1, InterfaceC12214gc interfaceC12214gc, InterfaceC11621Pf interfaceC11621Pf, InterfaceC11524K8 interfaceC11524K8, InterfaceC11524K8.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11471h9, c12166e8, c11759y1, interfaceC12469s1, (i & 16) != 0 ? new C12232hc() : interfaceC12214gc, (i & 32) != 0 ? C11613P7.f25510a : interfaceC11621Pf, (i & 64) != 0 ? C11455Gb.f24351s.m25905d().mo25852s() : interfaceC11524K8, (i & 128) != 0 ? C11455Gb.f24351s.m25903a().mo25775i() : aVar);
    }
}
