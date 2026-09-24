package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.InterfaceC3614Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.internal.Model.CBError;
import com.facebook.internal.AnalyticsEvents;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3696d implements InterfaceC3949o0, InterfaceC3743f0, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final C3720e0 f13770a;

    /* JADX INFO: renamed from: b */
    public final C3904m0 f13771b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f13772c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f13773d;

    /* JADX INFO: renamed from: e */
    public final C3719e f13774e;

    /* JADX INFO: renamed from: f */
    public final C4031rg f13775f;

    /* JADX INFO: renamed from: g */
    public final C3768g2 f13776g;

    /* JADX INFO: renamed from: h */
    public final Function0 f13777h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC3911m7 f13778i;

    /* JADX INFO: renamed from: j */
    public InterfaceC3614Ad f13779j;

    /* JADX INFO: renamed from: k */
    public AdCallback f13780k;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.d$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13781a;

        static {
            int[] iArr = new int[CBError.Impression.values().length];
            try {
                iArr[CBError.Impression.ASSET_MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CBError.Impression.ASSETS_DOWNLOAD_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CBError.Impression.ASSET_PREFETCH_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_CLIENT_RECEIVED_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_PAGE_LOAD_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CBError.Impression.ERROR_LOADING_WEB_VIEW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f13781a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.d$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2 {
        public b(Object obj) {
            super(2, obj, AbstractC3696d.class, "onAdFailToLoad", "onAdFailToLoad(Ljava/lang/String;Lcom/chartboost/sdk/internal/Model/CBError$Type;)V", 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17241a(String str, CBError.Type p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((AbstractC3696d) this.receiver).mo17230a(str, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m17241a((String) obj, (CBError.Type) obj2);
            return Unit.INSTANCE;
        }
    }

    public AbstractC3696d(C3720e0 adUnitLoader, C3904m0 adUnitRenderer, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, C3719e adApiCallbackSender, C4031rg session, C3768g2 base64Wrapper, InterfaceC3911m7 eventTracker, Function0 androidVersion) {
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f13770a = adUnitLoader;
        this.f13771b = adUnitRenderer;
        this.f13772c = sdkConfig;
        this.f13773d = backgroundExecutorService;
        this.f13774e = adApiCallbackSender;
        this.f13775f = session;
        this.f13776g = base64Wrapper;
        this.f13777h = androidVersion;
        this.f13778i = eventTracker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m17218a(InterfaceC3614Ad ad, AbstractC3696d this$0, String location, String str) {
        Intrinsics.checkNotNullParameter(ad, "$ad");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(location, "$location");
        if (!(ad instanceof Banner)) {
            C3720e0.m17419a(this$0.f13770a, location, this$0, str, null, 8, null);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) ad;
        Banner banner = (Banner) ad;
        this$0.f13770a.m17437a(location, this$0, str, new C3674c0(viewGroup, banner.getBannerWidth(), banner.getBannerHeight()));
    }

    /* JADX INFO: renamed from: a */
    public static final void m17219a(AbstractC3696d this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C3950o1 c3950o1M17424a = this$0.f13770a.m17424a();
        if (c3950o1M17424a != null) {
            this$0.f13771b.m18589a(c3950o1M17424a, this$0);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19411b("Missing app request on render", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17220a() {
        if (m17234b()) {
            this.f13770a.m17439b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17221a(InterfaceC3614Ad ad, AdCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f13779j = ad;
        this.f13780k = callback;
        this.f13773d.execute(new Runnable() { // from class: com.chartboost.sdk.impl.d$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3696d.m17219a(this.f$0);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m17222a(InterfaceC3807hi eventName, String message, AbstractC3628a0 adType, String location) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        track((AbstractC3738ei) new C4091ua(eventName, message, adType.m16771b(), location, this.f13771b.m18581F(), null, 32, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m17223a(InterfaceC3807hi interfaceC3807hi, String str, String str2) {
        String strM16771b;
        String location;
        AbstractC3628a0 abstractC3628a0M19220a;
        InterfaceC3614Ad interfaceC3614Ad = this.f13779j;
        if (interfaceC3614Ad == null || (abstractC3628a0M19220a = AbstractC4014r.m19220a(interfaceC3614Ad)) == null || (strM16771b = abstractC3628a0M19220a.m16771b()) == null) {
            strM16771b = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        String str3 = strM16771b;
        InterfaceC3614Ad interfaceC3614Ad2 = this.f13779j;
        if (interfaceC3614Ad2 == null || (location = interfaceC3614Ad2.getLocation()) == null) {
            location = "";
        }
        String str4 = location;
        track(interfaceC3807hi == InterfaceC3807hi.b.INVALID_URL_ERROR ? new C3954o5(interfaceC3807hi, str, str3, str4, this.f13771b.m18581F(), m17239f(str2)) : new C4091ua(interfaceC3807hi, str, str3, str4, this.f13771b.m18581F(), m17239f(str2)));
    }

    /* JADX INFO: renamed from: a */
    public final void m17224a(CBError.Impression impression, String str) {
        InterfaceC3807hi.i iVar;
        switch (a.f13781a[impression.ordinal()]) {
            case 1:
            case 2:
            case 3:
                iVar = InterfaceC3807hi.i.UNAVAILABLE_ASSET_ERROR;
                break;
            case 4:
            case 5:
            case 6:
                iVar = InterfaceC3807hi.i.WEBVIEW_ERROR;
                break;
            default:
                iVar = InterfaceC3807hi.i.FINISH_FAILURE;
                break;
        }
        m17223a(iVar, impression.name(), str);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3949o0
    /* JADX INFO: renamed from: a */
    public void mo17225a(String str) {
        this.f13774e.m17399a(str, this.f13779j, this.f13780k);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3949o0
    /* JADX INFO: renamed from: a */
    public void mo17226a(String str, int i) {
        this.f13774e.m17400a(str, this.f13779j, this.f13780k, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m17227a(final String location, final InterfaceC3614Ad ad, AdCallback callback, String str) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f13779j = ad;
        this.f13780k = callback;
        Object objM17825a = C3788h.f14349a.m17825a(str, this.f13776g, new b(this));
        if (Result.m44949exceptionOrNullimpl(objM17825a) == null) {
            final String str2 = (String) objM17825a;
            this.f13773d.execute(new Runnable() { // from class: com.chartboost.sdk.impl.d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3696d.m17218a(ad, this, location, str2);
                }
            });
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3743f0
    /* JADX INFO: renamed from: a */
    public void mo17228a(String bidResponse, InterfaceC3807hi trackingEventName) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        m17223a(trackingEventName, "", (String) null);
        InterfaceC3614Ad interfaceC3614Ad = this.f13779j;
        if (interfaceC3614Ad != null) {
            interfaceC3614Ad.cache(bidResponse);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3949o0
    /* JADX INFO: renamed from: a */
    public void mo17229a(String str, CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        m17224a(error, str);
        this.f13774e.m17403a(str, AbstractC3992q.m19084a(error), this.f13779j, this.f13780k);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3743f0
    /* JADX INFO: renamed from: a */
    public void mo17230a(String str, CBError.Type error) {
        Intrinsics.checkNotNullParameter(error, "error");
        m17223a(InterfaceC3807hi.a.FINISH_FAILURE, error.getName(), str);
        this.f13774e.m17401a(str, AbstractC3992q.m19081a(error), this.f13779j, this.f13780k);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3949o0
    /* JADX INFO: renamed from: a */
    public void mo17231a(String str, String str2, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String str3 = "Click error: " + error.name() + " url: " + str2;
        m17223a(InterfaceC3807hi.b.INVALID_URL_ERROR, str3, str);
        this.f13774e.m17402a(str, AbstractC3992q.m19083a(error, str3), this.f13779j, this.f13780k);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3949o0
    /* JADX INFO: renamed from: b */
    public void mo17232b(String str) {
        this.f13774e.m17402a(str, (ClickError) null, this.f13779j, this.f13780k);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3743f0
    /* JADX INFO: renamed from: b */
    public void mo17233b(String str, InterfaceC3807hi trackingEventName) {
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        m17223a(trackingEventName, "", str);
        this.f13774e.m17401a(str, (CacheError) null, this.f13779j, this.f13780k);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17234b() {
        C3950o1 c3950o1M17424a = this.f13770a.m17424a();
        return (c3950o1M17424a != null ? c3950o1M17424a.m18857a() : null) != null;
    }

    /* JADX INFO: renamed from: c */
    public final void m17235c() {
        AbstractC3628a0 abstractC3628a0M19220a;
        InterfaceC3614Ad interfaceC3614Ad = this.f13779j;
        if (interfaceC3614Ad == null || (abstractC3628a0M19220a = AbstractC4014r.m19220a(interfaceC3614Ad)) == null) {
            return;
        }
        this.f13775f.m19349a(abstractC3628a0M19220a);
        C4048sb.m19413c("Current session impression count: " + this.f13775f.m19352b(abstractC3628a0M19220a) + " in session: " + this.f13775f.m19351b(), null, 2, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3949o0
    /* JADX INFO: renamed from: c */
    public void mo17236c(String str) {
        m17223a(InterfaceC3807hi.f.IMPRESSION_RECORDED, "", str);
        this.f13774e.m17404b(str, this.f13779j, this.f13780k);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f13778i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f13778i.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage, reason: collision with other method in class */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13778i.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3949o0
    /* JADX INFO: renamed from: d */
    public void mo17237d(String str) {
        this.f13774e.m17405c(str, this.f13779j, this.f13780k);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3949o0
    /* JADX INFO: renamed from: e */
    public void mo17238e(String str) {
        m17223a(InterfaceC3807hi.i.FINISH_SUCCESS, "", str);
        m17235c();
        this.f13774e.m17403a(str, (ShowError) null, this.f13779j, this.f13780k);
    }

    /* JADX INFO: renamed from: f */
    public final C4076th m17239f(String str) {
        if (str == null) {
            str = "";
        }
        return new C4076th(null, null, str, null, null, null, null, null, 251, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17240g(String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (((Number) this.f13777h.invoke()).intValue() < 21) {
            return true;
        }
        C3920mg c3920mg = (C3920mg) this.f13772c.get();
        if (c3920mg == null || !c3920mg.m18668g()) {
            return location.length() == 0;
        }
        C4048sb.m19411b("Chartboost Integration Warning: your account has been disabled for this session. This app has no active publishing campaigns, please create a publishing campaign in the Chartboost dashboard and wait at least 30 minutes to re-enable. If you need assistance, please visit http://chartboo.st/publishing .", (Throwable) null, 2, (Object) null);
        return true;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f13778i.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist, reason: collision with other method in class */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13778i.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f13778i.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh, reason: collision with other method in class */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f13778i.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f13778i.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store, reason: collision with other method in class */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f13778i.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f13778i.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track, reason: collision with other method in class */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13778i.mo43989track(event);
    }
}
