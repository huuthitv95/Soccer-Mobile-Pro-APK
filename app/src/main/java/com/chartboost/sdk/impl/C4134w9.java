package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.w9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4134w9 implements InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final C4001q8 f16708a;

    /* JADX INFO: renamed from: b */
    public final C4131w6 f16709b;

    /* JADX INFO: renamed from: c */
    public final C4143wi f16710c;

    /* JADX INFO: renamed from: d */
    public final C3708db f16711d;

    /* JADX INFO: renamed from: e */
    public final AbstractC3628a0 f16712e;

    /* JADX INFO: renamed from: f */
    public final C3746f3 f16713f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3644ag f16714g;

    /* JADX INFO: renamed from: h */
    public final Mediation f16715h;

    /* JADX INFO: renamed from: i */
    public final C3665be f16716i;

    /* JADX INFO: renamed from: j */
    public final C3828ig f16717j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC3642ae f16718k;

    /* JADX INFO: renamed from: l */
    public final Function2 f16719l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC3911m7 f16720m;

    /* JADX INFO: renamed from: n */
    public final EndpointRepository f16721n;

    /* JADX INFO: renamed from: o */
    public final C4031rg f16722o;

    public C4134w9(C4001q8 fileCache, C4131w6 downloader, C4143wi urlResolver, C3708db intentResolver, AbstractC3628a0 adType, C3746f3 networkService, InterfaceC3644ag requestBodyBuilder, Mediation mediation, C3665be measurementManager, C3828ig sdkBiddingTemplateParser, InterfaceC3642ae openMeasurementImpressionCallback, Function2 impressionFactory, InterfaceC3911m7 eventTracker, EndpointRepository endpointRepository, C4031rg session) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(measurementManager, "measurementManager");
        Intrinsics.checkNotNullParameter(sdkBiddingTemplateParser, "sdkBiddingTemplateParser");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionFactory, "impressionFactory");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f16708a = fileCache;
        this.f16709b = downloader;
        this.f16710c = urlResolver;
        this.f16711d = intentResolver;
        this.f16712e = adType;
        this.f16713f = networkService;
        this.f16714g = requestBodyBuilder;
        this.f16715h = mediation;
        this.f16716i = measurementManager;
        this.f16717j = sdkBiddingTemplateParser;
        this.f16718k = openMeasurementImpressionCallback;
        this.f16719l = impressionFactory;
        this.f16720m = eventTracker;
        this.f16721n = endpointRepository;
        this.f16722o = session;
    }

    /* JADX INFO: renamed from: a */
    public final C3845ja m19772a(C3950o1 appRequest, InterfaceC3971p0 callback, ViewGroup viewGroup, InterfaceC3891la impressionIntermediateCallback, InterfaceC4178y9 impressionClickCallback, C4003qa viewProtocolBuilder, InterfaceC3868ka impressionInterface, InterfaceC3856jl webViewTimeoutInterface, C3848jd nativeBridgeCommand, C3898lh templateLoader) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        Intrinsics.checkNotNullParameter(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(templateLoader, "templateLoader");
        try {
            File fileM19313a = this.f16708a.m19133a().m19313a();
            C3651b0 c3651b0M18857a = appRequest.m18857a();
            String strM18865d = appRequest.m18865d();
            if (c3651b0M18857a == null) {
                return new C3845ja(null, CBError.Impression.PENDING_IMPRESSION_ERROR);
            }
            Intrinsics.checkNotNull(fileM19313a);
            CBError.Impression impressionM19776a = m19776a(c3651b0M18857a, fileM19313a, strM18865d);
            if (impressionM19776a != null) {
                return new C3845ja(null, impressionM19776a);
            }
            String strM19777a = m19777a(templateLoader, c3651b0M18857a, fileM19313a, strM18865d);
            return strM19777a == null ? new C3845ja(null, CBError.Impression.ERROR_LOADING_WEB_VIEW) : new C3845ja(m19775a(appRequest, c3651b0M18857a, strM18865d, this.f16716i.m16926a(strM19777a), callback, viewGroup, impressionIntermediateCallback, impressionClickCallback, viewProtocolBuilder, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand), null);
        } catch (Exception e) {
            C4048sb.m19410b("showReady exception:", e);
            return new C3845ja(null, CBError.Impression.INTERNAL);
        }
    }

    /* JADX INFO: renamed from: a */
    public final EnumC3914ma m19773a(String str) {
        return Intrinsics.areEqual(str, "video") ? EnumC3914ma.INTERSTITIAL_VIDEO : EnumC3914ma.INTERSTITIAL;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC3914ma m19774a(String str, AbstractC3628a0 abstractC3628a0) {
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.b.f13429g)) {
            return m19773a(str);
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.c.f13430g)) {
            return EnumC3914ma.INTERSTITIAL_REWARD_VIDEO;
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.a.f13428g)) {
            return EnumC3914ma.BANNER;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final C4149x2 m19775a(C3950o1 c3950o1, C3651b0 c3651b0, String str, String str2, InterfaceC3971p0 interfaceC3971p0, ViewGroup viewGroup, InterfaceC3891la interfaceC3891la, InterfaceC4178y9 interfaceC4178y9, C4003qa c4003qa, InterfaceC3868ka interfaceC3868ka, InterfaceC3856jl interfaceC3856jl, C3848jd c3848jd) {
        EnumC3914ma enumC3914maM19774a = m19774a(c3651b0.m16874p(), this.f16712e);
        C3839j4 c3839j4 = new C3839j4(this.f16713f, this.f16714g, this.f16720m, this.f16721n, this.f16722o);
        C4195z4 c4195z4 = new C4195z4(this.f16713f, this.f16714g, this.f16720m, this.f16721n, this.f16722o);
        AbstractC3930n3 abstractC3930n3M19154a = c4003qa.m19154a(str, c3651b0, this.f16712e.m16771b(), str2, interfaceC3971p0, interfaceC3868ka, interfaceC3856jl, c3848jd);
        return (C4149x2) this.f16719l.invoke(new C3753fa(this.f16710c, this.f16711d, c3839j4, AbstractC4142wh.m19809a(this.f16712e.m16771b(), str, this.f16715h, this.f16720m), c4195z4, enumC3914maM19774a, this.f16718k, c3950o1, this.f16709b, abstractC3930n3M19154a, new C3730ea(0, 0, 0, 0, 15, null), c3651b0, this.f16712e, str, interfaceC3891la, interfaceC4178y9, interfaceC3971p0, this.f16720m), viewGroup);
    }

    /* JADX INFO: renamed from: a */
    public final CBError.Impression m19776a(C3651b0 c3651b0, File file, String str) {
        Map mapM16862d = c3651b0.m16862d();
        if (mapM16862d.isEmpty()) {
            return null;
        }
        for (C4038s1 c4038s1 : mapM16862d.values()) {
            File fileM19376a = c4038s1.m19376a(file);
            if (fileM19376a == null || !fileM19376a.exists()) {
                C4048sb.m19411b("Asset does not exist: " + c4038s1.f16218b, (Throwable) null, 2, (Object) null);
                String str2 = c4038s1.f16218b;
                if (str2 == null) {
                    str2 = "";
                } else {
                    Intrinsics.checkNotNull(str2);
                }
                m19778a(str, str2);
                return CBError.Impression.ASSET_MISSING;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m19777a(C3898lh c3898lh, C3651b0 c3651b0, File file, String str) {
        C4038s1 c4038s1M16864f = c3651b0.m16864f();
        String strM19377a = c4038s1M16864f.m19377a();
        if (strM19377a == null || strM19377a.length() == 0) {
            C4048sb.m19411b("AdUnit does not have a template body", (Throwable) null, 2, (Object) null);
            return null;
        }
        File fileM19376a = c4038s1M16864f.m19376a(file);
        HashMap map = new HashMap(c3651b0.m16877s());
        if (c3651b0.m16884z().length() > 0 && c3651b0.m16861c().length() > 0) {
            C3828ig c3828ig = this.f16717j;
            Intrinsics.checkNotNull(fileM19376a);
            String strM18019a = c3828ig.m18019a(fileM19376a, c3651b0.m16884z(), c3651b0.m16861c());
            if (strM18019a != null) {
                return strM18019a;
            }
        }
        if (c3651b0.m16856C().length() == 0 || c3651b0.m16855B().length() == 0) {
            map.put("{% native_video_player %}", "false");
        } else {
            map.put("{% native_video_player %}", "true");
        }
        for (Map.Entry entry : c3651b0.m16862d().entrySet()) {
            map.put(entry.getKey(), ((C4038s1) entry.getValue()).f16218b);
        }
        Intrinsics.checkNotNull(fileM19376a);
        return c3898lh.m18514a(fileM19376a, map, this.f16712e.m16771b(), str);
    }

    /* JADX INFO: renamed from: a */
    public final void m19778a(String str, String str2) {
        track((AbstractC3738ei) new C3954o5(InterfaceC3807hi.i.UNAVAILABLE_ASSET_ERROR, str2, this.f16712e.m16771b(), str, this.f16715h, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f16720m.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f16720m.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16720m.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f16720m.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16720m.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f16720m.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f16720m.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f16720m.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f16720m.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f16720m.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16720m.mo43989track(event);
    }
}
