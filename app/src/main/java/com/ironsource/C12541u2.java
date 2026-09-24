package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C12352e;
import com.ironsource.mediationsdk.C12353f;
import com.ironsource.mediationsdk.C12355h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u2 */
/* JADX INFO: loaded from: classes6.dex */
public class C12541u2 {

    /* JADX INFO: renamed from: a */
    private final C11707V0 f32524a;

    /* JADX INFO: renamed from: b */
    private final AbstractC12593x0 f32525b;

    /* JADX INFO: renamed from: c */
    private final C12352e f32526c;

    /* JADX INFO: renamed from: d */
    private final C12222h2 f32527d;

    /* JADX INFO: renamed from: com.ironsource.u2$a */
    public static final class a implements C11657S1.d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC12559v2 f32529b;

        a(InterfaceC12559v2 interfaceC12559v2) {
            this.f32529b = interfaceC12559v2;
        }

        @Override // com.ironsource.C11657S1.d
        /* JADX INFO: renamed from: a */
        public void mo27433a(C11657S1 auction) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            C12541u2.this.m33872b(auction, this.f32529b);
        }

        @Override // com.ironsource.C11657S1.d
        /* JADX INFO: renamed from: a */
        public void mo27434a(C11657S1 auction, String error) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            Intrinsics.checkNotNullParameter(error, "error");
            C12541u2.this.m33872b(auction, this.f32529b);
        }
    }

    public C12541u2(C11707V0 adTools, AbstractC12593x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f32524a = adTools;
        this.f32525b = adUnitData;
        C12470s2 c12470s2M34076e = adUnitData.m34076e();
        String strM32764d = IronSourceUtils.m32764d();
        Intrinsics.checkNotNullExpressionValue(strM32764d, "getSessionId()");
        C12352e c12352e = new C12352e(new C12353f(c12470s2M34076e, strM32764d));
        this.f32526c = c12352e;
        this.f32527d = new C12222h2(adTools, c12352e);
    }

    /* JADX INFO: renamed from: b */
    public final C12222h2 m33874b() {
        return this.f32527d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m33872b(C11657S1 c11657s1, InterfaceC12559v2 interfaceC12559v2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m33869a("auction waterfallString = " + ((Object) c11657s1.m27423d().m31668c())));
        if (!c11657s1.m27426g()) {
            ironLog.verbose(m33869a("auction failed - no candidates"));
            this.f32524a.m33047e().m34214b().m27485a(1005, "No candidates available for auctioning");
            interfaceC12559v2.mo33730a(C11354B0.m25371e(this.f32525b.mo26467b().m31567a()), "no available ad to load");
        } else {
            this.f32524a.m33047e().m34214b().m27490b(c11657s1.m27423d().m31668c().toString());
            this.f32526c.m32457a(ContextProvider.getInstance().getApplicationContext(), m33867a(c11657s1, this.f32524a.m33048f()), new b(interfaceC12559v2, c11657s1));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m33873a(InterfaceC12559v2 completionListener) {
        Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(m33868a());
        this.f32524a.m33047e().m34214b().m27488a(this.f32525b.mo26467b().m31571d());
        m33870a(new C11657S1(this.f32524a, this.f32525b), completionListener);
    }

    /* JADX INFO: renamed from: com.ironsource.u2$b */
    public static final class b implements InterfaceC11691U1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12559v2 f32530a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11657S1 f32531b;

        b(InterfaceC12559v2 interfaceC12559v2, C11657S1 c11657s1) {
            this.f32530a = interfaceC12559v2;
            this.f32531b = c11657s1;
        }

        @Override // com.ironsource.InterfaceC11691U1
        /* JADX INFO: renamed from: a */
        public void mo27554a(List<C12434q2> newWaterfall, String auctionId, C12434q2 c12434q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f32530a.mo33732a(newWaterfall, this.f32531b.m27422c(), auctionId, c12434q2, jSONObject, jSONObject2, i, j, i2, str);
        }

        @Override // com.ironsource.InterfaceC11691U1
        /* JADX INFO: renamed from: a */
        public void mo27553a(int i, String str, int i2, String auctionFallback, long j) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.f32530a.mo33731a(i, str, i2, auctionFallback, j);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m33870a(C11657S1 c11657s1, InterfaceC12559v2 interfaceC12559v2) {
        if (!c11657s1.m27425f()) {
            m33872b(c11657s1, interfaceC12559v2);
        } else {
            c11657s1.m27421a(new a(interfaceC12559v2));
        }
    }

    /* JADX INFO: renamed from: a */
    private final C12355h m33867a(C11657S1 c11657s1, int i) {
        C12355h c12355h = new C12355h(this.f32525b.mo26467b().m31567a());
        c12355h.m32498b(IronSourceUtils.m32779g());
        c12355h.m32494a(c11657s1.m27423d().m31663a());
        c12355h.m32493a(c11657s1.m27423d().m31667b());
        c12355h.m32487a(this.f32524a.m27638h());
        c12355h.m32485a(i);
        c12355h.m32486a(this.f32524a.m27641k());
        C11405Df c11405DfM31574g = this.f32525b.mo26467b().m31574g();
        c12355h.m32506e(c11405DfM31574g != null ? c11405DfM31574g.m25635b() : false);
        c12355h.m32491a(this.f32525b.mo26467b().m31571d());
        InterfaceC12276k2 interfaceC12276k2M27639i = this.f32524a.m27639i();
        if (interfaceC12276k2M27639i != null) {
            interfaceC12276k2M27639i.mo27435a(c12355h);
        }
        return c12355h;
    }

    /* JADX INFO: renamed from: a */
    private final String m33869a(String str) {
        return C12414p0.m33033a(this.f32524a, str, (String) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    private final String m33868a() {
        return C12414p0.m33033a(this.f32524a, (String) null, (String) null, 2, (Object) null);
    }
}
