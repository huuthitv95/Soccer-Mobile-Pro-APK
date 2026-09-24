package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.StartError;
import com.chartboost.sdk.privacy.model.COPPA;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.og */
/* JADX INFO: loaded from: classes3.dex */
public final class C3965og implements InterfaceC3702d5, InterfaceC3943ng {

    /* JADX INFO: renamed from: a */
    public final Context f15697a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f15698b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3945ni f15699c;

    /* JADX INFO: renamed from: d */
    public final C4117ve f15700d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f15701e;

    /* JADX INFO: renamed from: f */
    public final C4073te f15702f;

    /* JADX INFO: renamed from: g */
    public final C4131w6 f15703g;

    /* JADX INFO: renamed from: h */
    public final C4031rg f15704h;

    /* JADX INFO: renamed from: i */
    public final C4166xj f15705i;

    /* JADX INFO: renamed from: j */
    public final Lazy f15706j;

    /* JADX INFO: renamed from: k */
    public final C4201za f15707k;

    /* JADX INFO: renamed from: l */
    public final C4179ya f15708l;

    /* JADX INFO: renamed from: m */
    public final C3769g3 f15709m;

    /* JADX INFO: renamed from: n */
    public final C3735ef f15710n;

    /* JADX INFO: renamed from: o */
    public final C4105v2 f15711o;

    /* JADX INFO: renamed from: p */
    public final C3665be f15712p;

    /* JADX INFO: renamed from: q */
    public final C3829ih f15713q;

    /* JADX INFO: renamed from: r */
    public boolean f15714r;

    /* JADX INFO: renamed from: s */
    public boolean f15715s;

    /* JADX INFO: renamed from: t */
    public final ConcurrentLinkedQueue f15716t;

    /* JADX INFO: renamed from: u */
    public boolean f15717u;

    /* JADX INFO: renamed from: v */
    public final AtomicBoolean f15718v;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.og$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StartCallback f15719b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ StartError f15720c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StartCallback startCallback, StartError startError) {
            super(0);
            this.f15719b = startCallback;
            this.f15720c = startError;
        }

        /* JADX INFO: renamed from: a */
        public final void m18959a() {
            this.f15719b.onStartCompleted(this.f15720c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18959a();
            return Unit.INSTANCE;
        }
    }

    public C3965og(Context context, SharedPreferences sharedPreferences, InterfaceC3945ni uiPoster, C4117ve privacyApi, AtomicReference sdkConfig, C4073te prefetcher, C4131w6 downloader, C4031rg session, C4166xj videoCachePolicy, Lazy videoRepository, C4201za initInstallRequest, C4179ya initConfigRequest, C3769g3 reachability, C3735ef providerInstallerHelper, C4105v2 identity, C3665be openMeasurementManager, C3829ih telemetryManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(videoCachePolicy, "videoCachePolicy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(initInstallRequest, "initInstallRequest");
        Intrinsics.checkNotNullParameter(initConfigRequest, "initConfigRequest");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(providerInstallerHelper, "providerInstallerHelper");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        this.f15697a = context;
        this.f15698b = sharedPreferences;
        this.f15699c = uiPoster;
        this.f15700d = privacyApi;
        this.f15701e = sdkConfig;
        this.f15702f = prefetcher;
        this.f15703g = downloader;
        this.f15704h = session;
        this.f15705i = videoCachePolicy;
        this.f15706j = videoRepository;
        this.f15707k = initInstallRequest;
        this.f15708l = initConfigRequest;
        this.f15709m = reachability;
        this.f15710n = providerInstallerHelper;
        this.f15711o = identity;
        this.f15712p = openMeasurementManager;
        this.f15713q = telemetryManager;
        this.f15715s = true;
        this.f15716t = new ConcurrentLinkedQueue();
        session.m19350a(this);
        this.f15718v = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m18933a(ChartboostError chartboostError) {
        m18944d(chartboostError);
        m18941c(chartboostError);
        m18934a(m18937b(chartboostError));
    }

    /* JADX INFO: renamed from: a */
    public final void m18934a(StartError startError) {
        m18938b();
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f15716t.poll();
            StartCallback startCallback = atomicReference != null ? (StartCallback) atomicReference.get() : null;
            if (startCallback == null) {
                this.f15717u = false;
                return;
            }
            this.f15699c.mo18805a(new a(startCallback, startError));
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3702d5
    /* JADX INFO: renamed from: a */
    public void mo17259a(String errorMsg) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        ChartboostError serverError = this.f15709m.m17757e() ? new ChartboostError.Connectivity.ServerError(errorMsg, null) : ChartboostError.Connectivity.NoInternet.INSTANCE;
        if (this.f15715s) {
            m18933a(serverError);
        } else if (m18945e() && m18946f()) {
            m18943d();
        } else if (m18945e()) {
            m18933a(new ChartboostError.Initialization.InvalidConfiguration("Cached configuration is corrupt or invalid", null));
        } else {
            m18933a(serverError);
        }
        m18953m();
    }

    /* JADX INFO: renamed from: a */
    public final void m18935a(String str, String str2) {
        if (!AbstractC3973p2.m19010a(this.f15697a)) {
            m18933a(new ChartboostError.Initialization.PermissionsNotSet("INTERNET and/or ACCESS_NETWORK_STATE permissions are not set.", null));
            return;
        }
        if (str.length() == 0 || str2.length() == 0 || str.length() != 24 || str2.length() != 40 || !AbstractC3987pg.f15821a.matches(str) || !AbstractC3987pg.f15821a.matches(str2)) {
            m18933a(ChartboostError.Initialization.InvalidCredentials.INSTANCE);
            return;
        }
        this.f15710n.m17566a();
        this.f15703g.m19754b();
        if (m18945e() && m18946f()) {
            m18949i();
        } else {
            m18951k();
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m18936a(String appId, String appSignature, StartCallback onStarted, ChartboostError chartboostError) {
        try {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(appSignature, "appSignature");
            Intrinsics.checkNotNullParameter(onStarted, "onStarted");
            try {
                C4022r7.f16130a.m19310a();
                this.f15716t.add(new AtomicReference(onStarted));
                if (this.f15717u) {
                    C4048sb.m19411b("Initialization already in progress", (Throwable) null, 2, (Object) null);
                    return;
                }
                if (chartboostError != null) {
                    m18933a(chartboostError);
                    return;
                }
                C4048sb.m19408a("Current session count: " + this.f15704h.m19351b(), (Throwable) null, 2, (Object) null);
                if (this.f15704h.m19351b() > 1) {
                    this.f15715s = false;
                }
                this.f15717u = true;
                if (this.f15714r) {
                    m18948h();
                } else {
                    m18935a(appId, appSignature);
                }
                m18940c();
            } catch (Exception e) {
                C4048sb.m19410b("Cannot initialize Chartboost sdk due to internal error", e);
                m18933a(new ChartboostError.Initialization.Internal("Internal SDK error: " + e.getMessage(), e));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3702d5
    /* JADX INFO: renamed from: a */
    public void mo17260a(JSONObject configJson) {
        Intrinsics.checkNotNullParameter(configJson, "configJson");
        m18942c(configJson);
        m18943d();
        m18939b(configJson);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3943ng
    /* JADX INFO: renamed from: a */
    public boolean mo18802a() {
        return this.f15714r;
    }

    /* JADX INFO: renamed from: b */
    public final StartError m18937b(ChartboostError chartboostError) {
        StartError.Code code;
        if (chartboostError instanceof ChartboostError.Initialization.InvalidCredentials) {
            code = StartError.Code.INVALID_CREDENTIALS;
        } else if ((chartboostError instanceof ChartboostError.Connectivity.NoInternet) || (chartboostError instanceof ChartboostError.Connectivity.NetworkError)) {
            code = StartError.Code.NETWORK_FAILURE;
        } else if (chartboostError instanceof ChartboostError.Connectivity.ServerError) {
            code = StartError.Code.SERVER_ERROR;
        } else if (chartboostError instanceof ChartboostError.Initialization.Disabled) {
            code = StartError.Code.DISABLED;
        } else if (chartboostError instanceof ChartboostError.Initialization.NoContext) {
            code = StartError.Code.NO_CONTEXT;
        } else if (chartboostError instanceof ChartboostError.Initialization.InvalidConfiguration) {
            code = StartError.Code.INVALID_CONFIGURATION;
        } else if (chartboostError instanceof ChartboostError.Initialization.OsVersionNotSupported) {
            code = StartError.Code.OS_VERSION_NOT_SUPPORTED;
        } else {
            code = chartboostError instanceof ChartboostError.Initialization.PermissionsNotSet ? StartError.Code.PERMISSIONS_NOT_SET : StartError.Code.INTERNAL;
        }
        return new StartError(code, chartboostError);
    }

    /* JADX INFO: renamed from: b */
    public final void m18938b() {
        if (C3851jg.f14967a.m18286d()) {
            C3958o9 c3958o9M19635h = this.f15711o.m19635h();
            C3851jg.m18281a("SetId: " + c3958o9M19635h.m18897d() + " scope:" + c3958o9M19635h.m18898e() + " Tracking state: " + c3958o9M19635h.m18899f() + " Identifiers: " + c3958o9M19635h.m18895b());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18939b(JSONObject jSONObject) {
        if (C3851jg.f14967a.m18286d()) {
            C3851jg.m18281a("Video player: " + new C3920mg(jSONObject).m18666e().m17348h());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18940c() {
        if (this.f15700d.m19697a(COPPA.COPPA_STANDARD) != null || this.f15714r) {
            return;
        }
        C4048sb.m19417e("COPPA is not set. If this app is child directed, please use ´addDataUseConsent(android.content.Context, com.chartboost.sdk.Privacy.model.COPPA)´ to set the correct value.", null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m18941c(ChartboostError chartboostError) {
        if (this.f15718v.getAndSet(true)) {
            C4048sb.m19408a("Initialization event already tracked this launch; skipping failure event.", (Throwable) null, 2, (Object) null);
            return;
        }
        boolean z = chartboostError instanceof ChartboostError.Initialization.Disabled;
        C3920mg c3920mg = (C3920mg) this.f15701e.get();
        if (!z && c3920mg != null && c3920mg.f15371c) {
            C4048sb.m19408a("SDK disabled via kill switch; skipping initialization failure event.", (Throwable) null, 2, (Object) null);
            this.f15718v.set(false);
            return;
        }
        try {
            C3829ih.m18024a(this.f15713q, new C3639ab(null, chartboostError.getMessage(), chartboostError.getCode(), chartboostError.getConstant(), chartboostError.getCauseDescription(), 1, null), null, C3865k7.b.INITIALIZATION, 2, null);
        } catch (Exception e) {
            C4048sb.m19410b("Failed to submit initialization failure event", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18942c(JSONObject jSONObject) {
        if (jSONObject == null || !AbstractC3973p2.m19011a(this.f15701e, jSONObject)) {
            return;
        }
        this.f15698b.edit().putString("config", jSONObject.toString()).apply();
    }

    /* JADX INFO: renamed from: d */
    public final void m18943d() {
        this.f15712p.m16931e();
        C3693cj.f13754a.m17205a(C3678c4.f13658b.mo17019a().mo18993g());
        m18957q();
        m18958r();
        m18952l();
        m18955o();
        this.f15715s = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m18944d(ChartboostError chartboostError) {
        C3829ih.m18024a(this.f15713q, new C3668bh(null, chartboostError.getMessage(), chartboostError.getCode(), chartboostError.getConstant(), chartboostError.getCauseDescription(), null, 1, null), CollectionsKt.emptyList(), null, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18945e() {
        String strM18950j = m18950j();
        return strM18950j != null && strM18950j.length() > 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18946f() {
        String strM18950j = m18950j();
        if (strM18950j != null && strM18950j.length() != 0) {
            try {
                boolean zM19011a = AbstractC3973p2.m19011a(this.f15701e, new JSONObject(strM18950j));
                if (!zM19011a) {
                    C4048sb.m19411b("Cached config is invalid or has invalid schema", (Throwable) null, 2, (Object) null);
                }
                return zM19011a;
            } catch (Exception e) {
                C4048sb.m19410b("Failed to parse cached config", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m18947g() {
        if (this.f15701e.get() == null || ((C3920mg) this.f15701e.get()).m18669h() == null) {
            return;
        }
        String strM18669h = ((C3920mg) this.f15701e.get()).m18669h();
        Intrinsics.checkNotNullExpressionValue(strM18669h, "getPublisherWarning(...)");
        C4048sb.m19417e(strM18669h, null, 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m18948h() {
        this.f15704h.m19356f();
        m18934a((StartError) null);
        this.f15714r = true;
        m18951k();
    }

    /* JADX INFO: renamed from: i */
    public final void m18949i() {
        m18934a((StartError) null);
        this.f15714r = true;
        m18956p();
        m18951k();
    }

    /* JADX INFO: renamed from: j */
    public final String m18950j() {
        return this.f15698b.getString("config", "");
    }

    /* JADX INFO: renamed from: k */
    public final void m18951k() {
        this.f15708l.m20052a(this);
    }

    /* JADX INFO: renamed from: l */
    public final void m18952l() {
        m18947g();
        C3920mg c3920mg = (C3920mg) this.f15701e.get();
        if (c3920mg != null) {
            this.f15700d.m19698a(c3920mg.f15359C);
        }
        this.f15707k.m20131a();
        m18954n();
    }

    /* JADX INFO: renamed from: m */
    public final void m18953m() {
        if (C3851jg.f14967a.m18286d()) {
            String strM18950j = m18950j();
            String str = JsonUtils.EMPTY_JSON;
            if (strM18950j == null) {
                strM18950j = JsonUtils.EMPTY_JSON;
            }
            if (strM18950j.length() != 0) {
                str = strM18950j;
            }
            m18939b(new JSONObject(str));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m18954n() {
        this.f15702f.m19489b();
    }

    /* JADX INFO: renamed from: o */
    public final void m18955o() {
        if (this.f15714r) {
            return;
        }
        this.f15704h.m19356f();
        m18934a((StartError) null);
        this.f15714r = true;
        m18956p();
    }

    /* JADX INFO: renamed from: p */
    public final void m18956p() {
        if (this.f15718v.getAndSet(true)) {
            C4048sb.m19408a("Initialization event already tracked this launch; skipping success event.", (Throwable) null, 2, (Object) null);
            return;
        }
        C3920mg c3920mg = (C3920mg) this.f15701e.get();
        if (c3920mg == null) {
            C4048sb.m19417e("SDK config is null; unable to track initialization success event.", null, 2, null);
            this.f15718v.set(false);
        } else {
            if (c3920mg.f15371c) {
                C4048sb.m19408a("SDK disabled via kill switch; skipping initialization success event.", (Throwable) null, 2, (Object) null);
                this.f15718v.set(false);
                return;
            }
            try {
                C3829ih.m18024a(this.f15713q, new C3639ab(null, null, null, null, null, 31, null), null, C3865k7.b.INITIALIZATION, 2, null);
            } catch (Exception e) {
                C4048sb.m19410b("Failed to submit initialization success event", e);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m18957q() {
        C3692ci c3692ciM18670i = ((C3920mg) this.f15701e.get()).m18670i();
        if (c3692ciM18670i != null) {
            C4187yi.f17062b.refresh(c3692ciM18670i);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m18958r() {
        C3717dk c3717dkM18666e = ((C3920mg) this.f15701e.get()).m18666e();
        if (c3717dkM18666e != null) {
            this.f15705i.m19989c(c3717dkM18666e.m17342b());
            this.f15705i.m19985b(c3717dkM18666e.m17343c());
            this.f15705i.m19988c(c3717dkM18666e.m17344d());
            this.f15705i.m19991d(c3717dkM18666e.m17345e());
            this.f15705i.m19993e(c3717dkM18666e.m17346f());
            this.f15705i.m19995f(c3717dkM18666e.m17347g());
            this.f15705i.m19981a(c3717dkM18666e.m17341a());
        }
        ((InterfaceC3855jk) this.f15706j.getValue()).mo18294a(this.f15697a);
    }
}
