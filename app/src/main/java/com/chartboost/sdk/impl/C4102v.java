package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.AbstractC4214b;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.net.URL;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C4102v implements InterfaceC4080u, C3792h3.a, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3628a0 f16503a;

    /* JADX INFO: renamed from: b */
    public final C4001q8 f16504b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3644ag f16505c;

    /* JADX INFO: renamed from: d */
    public final C3746f3 f16506d;

    /* JADX INFO: renamed from: e */
    public final C3858k0 f16507e;

    /* JADX INFO: renamed from: f */
    public final C3757fe f16508f;

    /* JADX INFO: renamed from: g */
    public final C3665be f16509g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3911m7 f16510h;

    /* JADX INFO: renamed from: i */
    public final EndpointRepository f16511i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC3972p1 f16512j;

    /* JADX INFO: renamed from: k */
    public C3690cg f16513k;

    /* JADX INFO: renamed from: l */
    public C3982pb f16514l;

    /* JADX INFO: renamed from: m */
    public Function1 f16515m;

    public C4102v(AbstractC3628a0 adTraits, C4001q8 fileCache, InterfaceC3644ag requestBodyBuilder, C3746f3 networkService, C3858k0 adUnitParser, C3757fe openRTBAdUnitParser, C3665be openMeasurementManager, InterfaceC3911m7 eventTracker, EndpointRepository endpointRepository, InterfaceC3972p1 applicationComponent) {
        Intrinsics.checkNotNullParameter(adTraits, "adTraits");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(adUnitParser, "adUnitParser");
        Intrinsics.checkNotNullParameter(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f16503a = adTraits;
        this.f16504b = fileCache;
        this.f16505c = requestBodyBuilder;
        this.f16506d = networkService;
        this.f16507e = adUnitParser;
        this.f16508f = openRTBAdUnitParser;
        this.f16509g = openMeasurementManager;
        this.f16510h = eventTracker;
        this.f16511i = endpointRepository;
        this.f16512j = applicationComponent;
    }

    public /* synthetic */ C4102v(AbstractC3628a0 abstractC3628a0, C4001q8 c4001q8, InterfaceC3644ag interfaceC3644ag, C3746f3 c3746f3, C3858k0 c3858k0, C3757fe c3757fe, C3665be c3665be, InterfaceC3911m7 interfaceC3911m7, EndpointRepository endpointRepository, InterfaceC3972p1 interfaceC3972p1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3628a0, c4001q8, interfaceC3644ag, c3746f3, c3858k0, c3757fe, c3665be, interfaceC3911m7, endpointRepository, (i & 512) != 0 ? C3678c4.f13658b.mo17019a() : interfaceC3972p1);
    }

    /* JADX INFO: renamed from: a */
    public final C3651b0 m19608a(C3690cg c3690cg, JSONObject jSONObject, String str) {
        try {
            C3725e5 c3725e5M17182a = c3690cg.m17182a();
            if (m19617b(this.f16503a, c3725e5M17182a.m17481b(), c3725e5M17182a.m17482c())) {
                return this.f16508f.m17694a(this.f16503a, jSONObject);
            }
            if (c3725e5M17182a.m17483d()) {
                return this.f16507e.m18310a(jSONObject);
            }
            return null;
        } catch (Exception e) {
            InterfaceC3807hi.a aVar = InterfaceC3807hi.a.GET_RESPONSE_PARSING_ERROR;
            JSONObject jSONObject2 = new JSONObject();
            String message = e.getMessage();
            if (message == null) {
                message = "no message";
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            track((AbstractC3738ei) new C3954o5(aVar, m19612a(jSONObject2, message, string), this.f16503a.m16771b(), str, null, null, 48, null));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3780ge m19609a(C3792h3.a aVar, int i, int i2, String str, int i3, C3690cg c3690cg, C3665be c3665be, C4031rg c4031rg) {
        C3725e5 c3725e5M17182a = c3690cg.m17182a();
        Intrinsics.checkNotNullExpressionValue(c3725e5M17182a, "getConfigurationFields(...)");
        URL urlM19613a = m19613a(c3725e5M17182a);
        C3984pd c3984pd = new C3984pd(AbstractC4214b.m20171a(urlM19613a), urlM19613a.getPath(), c3690cg, EnumC4095ue.NORMAL, aVar);
        C4190z c4190z = new C4190z(this.f16503a, Integer.valueOf(i), Integer.valueOf(i2), str, i3);
        C3725e5 c3725e5M17182a2 = c3690cg.m17182a();
        return new C3780ge(c3984pd, c4190z, c3665be, this.f16510h, c4031rg, m19616a(this.f16503a, c3725e5M17182a2.m17481b(), c3725e5M17182a2.m17482c()));
    }

    /* JADX INFO: renamed from: a */
    public final C3792h3 m19610a(String str, int i, int i2, boolean z, C3690cg c3690cg, C3792h3.a aVar, C3665be c3665be, C4031rg c4031rg) {
        int iM19433d;
        String rewarded;
        AbstractC3628a0 abstractC3628a0 = this.f16503a;
        AbstractC3628a0.c cVar = AbstractC3628a0.c.f13430g;
        if (Intrinsics.areEqual(abstractC3628a0, cVar)) {
            iM19433d = c3690cg.m17192h().m19434e();
        } else {
            iM19433d = Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.b.f13429g) ? c3690cg.m17192h().m19433d() : c3690cg.m17192h().m19430a();
        }
        int i3 = iM19433d;
        C3725e5 c3725e5M17182a = c3690cg.m17182a();
        boolean zM19617b = m19617b(this.f16503a, c3725e5M17182a.m17481b(), c3725e5M17182a.m17482c());
        if (c3725e5M17182a.m17481b()) {
            AbstractC3628a0 abstractC3628a1 = this.f16503a;
            AbstractC3628a0.a aVar2 = AbstractC3628a0.a.f13428g;
            if (Intrinsics.areEqual(abstractC3628a1, aVar2)) {
                rewarded = c3725e5M17182a.m17482c().getBanner();
            } else if (Intrinsics.areEqual(abstractC3628a1, AbstractC3628a0.b.f13429g)) {
                rewarded = c3725e5M17182a.m17482c().getInterstitial();
            } else {
                if (!Intrinsics.areEqual(abstractC3628a1, cVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                rewarded = c3725e5M17182a.m17482c().getRewarded();
            }
            if (m19618b(rewarded)) {
                if (Intrinsics.areEqual(this.f16503a, aVar2) || !c3725e5M17182a.m17483d()) {
                    C4048sb.m19408a(this.f16503a.m16771b() + " endpoint explicitly disabled, failing load", (Throwable) null, 2, (Object) null);
                    return null;
                }
                C4048sb.m19408a(this.f16503a.m16771b() + " NRP endpoint explicitly disabled, falling back to WebView", (Throwable) null, 2, (Object) null);
                return m19611a(aVar, str, i3, z, c3690cg, c3665be, c4031rg);
            }
        }
        return zM19617b ? m19609a(aVar, i, i2, str, i3, c3690cg, c3665be, c4031rg) : m19611a(aVar, str, i3, z, c3690cg, c3665be, c4031rg);
    }

    /* JADX INFO: renamed from: a */
    public final C3974p3 m19611a(C3792h3.a aVar, String str, int i, boolean z, C3690cg c3690cg, C3665be c3665be, C4031rg c4031rg) {
        Partner partnerM16929c;
        URL endPointUrl = this.f16511i.getEndPointUrl(this.f16503a.m16770a());
        AbstractC3654b3.c cVar = AbstractC3654b3.c.POST;
        String strM20171a = AbstractC4214b.m20171a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        C3974p3 c3974p3 = new C3974p3(cVar, strM20171a, path, c3690cg, EnumC4095ue.NORMAL, null, aVar, this.f16510h, c4031rg);
        JSONObject jSONObjectM19147e = this.f16504b.m19147e();
        Intrinsics.checkNotNullExpressionValue(jSONObjectM19147e, "getWebViewCacheAssets(...)");
        c3974p3.m19013b("cache_assets", jSONObjectM19147e);
        c3974p3.m19013b(FirebaseAnalytics.Param.LOCATION, str);
        c3974p3.m19013b("imp_depth", Integer.valueOf(i));
        if (c3665be.m16933g() && (partnerM16929c = c3665be.m16929c()) != null) {
            c3974p3.m19014c("omidpn", partnerM16929c.getName());
            c3974p3.m19014c("omidpv", partnerM16929c.getVersion());
        }
        c3974p3.m19013b("cache", Boolean.valueOf(z));
        c3974p3.f14362s = true;
        return c3974p3;
    }

    /* JADX INFO: renamed from: a */
    public String m19612a(JSONObject jSONObject, String str, String str2) {
        return InterfaceC4080u.a.m19513a(this, jSONObject, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX INFO: renamed from: a */
    public final URL m19613a(C3725e5 c3725e5) {
        String rewarded;
        AbstractC3628a0 abstractC3628a0 = this.f16503a;
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.a.f13428g)) {
            if (!c3725e5.m17481b() || (rewarded = c3725e5.m17482c().getBanner()) == null || rewarded.length() <= 0) {
                rewarded = null;
            }
        } else if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.b.f13429g)) {
            if (!c3725e5.m17481b() || (rewarded = c3725e5.m17482c().getInterstitial()) == null || rewarded.length() <= 0) {
                rewarded = null;
            }
        } else {
            if (!Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.c.f13430g)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!c3725e5.m17481b() || (rewarded = c3725e5.m17482c().getRewarded()) == null || rewarded.length() <= 0) {
                rewarded = null;
            }
        }
        if (rewarded == null) {
            URL endPointUrl = this.f16511i.getEndPointUrl(this.f16503a.m16770a());
            C4048sb.m19408a("Using default endpoint for " + this.f16503a.m16771b() + ": " + endPointUrl, (Throwable) null, 2, (Object) null);
            return endPointUrl;
        }
        try {
            URL url = new URL(rewarded);
            C4048sb.m19408a("Using NRP waterfall endpoint for " + this.f16503a.m16771b() + ": " + rewarded, (Throwable) null, 2, (Object) null);
            return url;
        } catch (Exception e) {
            C4048sb.m19410b("Invalid NRP waterfall endpoint URL for " + this.f16503a.m16771b() + ": " + rewarded, e);
            URL endPointUrl2 = this.f16511i.getEndPointUrl(this.f16503a.m16770a());
            C4048sb.m19408a("Falling back to default endpoint for " + this.f16503a.m16771b() + ": " + endPointUrl2, (Throwable) null, 2, (Object) null);
            return endPointUrl2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19614a(C3651b0 c3651b0, C3792h3 c3792h3) {
        Function1 function1 = this.f16515m;
        C3982pb c3982pb = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        C3982pb c3982pb2 = this.f16514l;
        if (c3982pb2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            c3982pb = c3982pb2;
        }
        function1.invoke(new C4004qb(c3982pb.m19055a(), c3651b0, null, c3792h3.f13520h, c3792h3.f13519g));
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17844a(C3792h3 c3792h3, CBError cBError) {
        Function1 function1 = this.f16515m;
        C3982pb c3982pb = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        C3982pb c3982pb2 = this.f16514l;
        if (c3982pb2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            c3982pb = c3982pb2;
        }
        C3950o1 c3950o1M19055a = c3982pb.m19055a();
        if (cBError == null) {
            cBError = new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response");
        }
        function1.invoke(new C4004qb(c3950o1M19055a, null, cBError, 0L, 0L, 26, null));
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17845a(C3792h3 c3792h3, JSONObject jSONObject) {
        if (c3792h3 == null || jSONObject == null) {
            m19615a("Unexpected response");
            return;
        }
        C3690cg c3690cg = this.f16513k;
        Unit unit = null;
        if (c3690cg == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBodyFields");
            c3690cg = null;
        }
        C3982pb c3982pb = this.f16514l;
        if (c3982pb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
            c3982pb = null;
        }
        JSONObject jSONObjectMo16769a = c3982pb.m19058d().mo16769a(jSONObject);
        C3982pb c3982pb2 = this.f16514l;
        if (c3982pb2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
            c3982pb2 = null;
        }
        C3651b0 c3651b0M19608a = m19608a(c3690cg, jSONObjectMo16769a, c3982pb2.m19055a().m18865d());
        if (c3651b0M19608a != null) {
            m19614a(c3651b0M19608a, c3792h3);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m19615a("Error parsing response");
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4080u
    /* JADX INFO: renamed from: a */
    public void mo18650a(C3982pb params, Function1 callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f16514l = params;
        this.f16515m = callback;
        this.f16513k = this.f16505c.mo16842a();
        String strM18865d = params.m19055a().m18865d();
        Integer numM19056b = params.m19056b();
        int iIntValue = numM19056b != null ? numM19056b.intValue() : 0;
        Integer numM19057c = params.m19057c();
        int iIntValue2 = numM19057c != null ? numM19057c.intValue() : 0;
        boolean zM19059e = params.m19059e();
        C3690cg c3690cg = this.f16513k;
        if (c3690cg == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBodyFields");
            c3690cg = null;
        }
        C3792h3 c3792h3M19610a = m19610a(strM18865d, iIntValue, iIntValue2, zM19059e, c3690cg, this, this.f16509g, this.f16512j.mo18997k());
        if (c3792h3M19610a != null) {
            c3792h3M19610a.f13521i = AbstractC3654b3.b.ASYNC;
            this.f16506d.m17614a(c3792h3M19610a);
            return;
        }
        callback.invoke(new C4004qb(params.m19055a(), null, new CBError(CBError.Impression.END_POINT_DISABLED, this.f16503a.m16771b() + " endpoint is explicitly disabled by server configuration"), 0L, 0L, 26, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m19615a(String str) {
        Function1 function1 = this.f16515m;
        C3982pb c3982pb = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        C3982pb c3982pb2 = this.f16514l;
        if (c3982pb2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            c3982pb = c3982pb2;
        }
        function1.invoke(new C4004qb(c3982pb.m19055a(), null, new CBError(CBError.Internal.UNEXPECTED_RESPONSE, str), 0L, 0L, 26, null));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19616a(AbstractC3628a0 abstractC3628a0, boolean z, C4197z6 c4197z6) {
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.a.f13428g)) {
            return z && !m19618b(c4197z6.getBanner());
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.b.f13429g)) {
            return z && !m19618b(c4197z6.getInterstitial());
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.c.f13430g)) {
            return z && !m19618b(c4197z6.getRewarded());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19617b(AbstractC3628a0 abstractC3628a0, boolean z, C4197z6 c4197z6) {
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.a.f13428g)) {
            return true;
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.b.f13429g)) {
            return z && !m19618b(c4197z6.getInterstitial());
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.c.f13430g)) {
            return z && !m19618b(c4197z6.getRewarded());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19618b(String str) {
        return Intrinsics.areEqual(str, "");
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f16510h.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f16510h.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16510h.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f16510h.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16510h.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f16510h.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f16510h.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f16510h.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f16510h.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f16510h.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16510h.mo43989track(event);
    }
}
