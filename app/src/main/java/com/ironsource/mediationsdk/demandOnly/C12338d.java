package com.ironsource.mediationsdk.demandOnly;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C11399D9;
import com.ironsource.C11455Gb;
import com.ironsource.C12159e1;
import com.ironsource.C12189f5;
import com.ironsource.C12204g2;
import com.ironsource.C12279k5;
import com.ironsource.C12317m4;
import com.ironsource.C12434q2;
import com.ironsource.C12580w5;
import com.ironsource.InterfaceC11524K8;
import com.ironsource.InterfaceC12160e2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.C12352e;
import com.ironsource.mediationsdk.C12355h;
import com.ironsource.mediationsdk.C12357j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.d */
/* JADX INFO: loaded from: classes6.dex */
public class C12338d extends C12347m implements BannerSmashListener, InterfaceC12160e2 {

    /* JADX INFO: renamed from: n */
    private C12189f5 f31120n;

    /* JADX INFO: renamed from: o */
    private C12189f5 f31121o;

    /* JADX INFO: renamed from: p */
    private String f31122p;

    /* JADX INFO: renamed from: q */
    private String f31123q;

    /* JADX INFO: renamed from: r */
    private C12204g2 f31124r;

    /* JADX INFO: renamed from: s */
    private C12352e f31125s;

    /* JADX INFO: renamed from: t */
    private ISDemandOnlyBannerLayout f31126t;

    /* JADX INFO: renamed from: u */
    private final InterfaceC11524K8 f31127u;

    /* JADX INFO: renamed from: v */
    private final InterfaceC11524K8.a f31128v;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12355h f31129a;

        a(C12355h c12355h) {
            this.f31129a = c12355h;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12338d.this.m32361a(83500, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.f31129a.m32517r());
            C12338d.this.m32361a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f31129a.m32517r()}});
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C12338d c12338d = C12338d.this;
            c12338d.f31125s.m32457a(applicationContext, this.f31129a, c12338d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.d$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + C12338d.this.m32445k());
            C12338d.this.m32362a(new IronSourceError(608, "load timed out"));
        }
    }

    public C12338d(String str, String str2, NetworkSettings networkSettings, long j, AbstractAdapter abstractAdapter, C12352e c12352e) {
        super(new C12159e1(networkSettings, networkSettings.getBannerSettings(), IronSource.EnumC12328a.BANNER), abstractAdapter);
        this.f31127u = C11455Gb.m25891U().mo25852s();
        this.f31128v = C11455Gb.m25885O().mo25775i();
        this.f31198f = j;
        this.f31122p = str;
        this.f31123q = str2;
        this.f31124r = new C12204g2();
        this.f31193a.initBannerForBidding(str, str2, this.f31195c, this);
        this.f31125s = c12352e;
    }

    /* JADX INFO: renamed from: c */
    private void m32365c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (m32437a(C12347m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                m32362a(new IronSourceError(618, "No available ad to load"));
            } else {
                m32361a(83302, (Object[][]) null);
                this.f31121o = new C12189f5();
                this.f31193a.initBannerForBidding(this.f31122p, this.f31123q, this.f31195c, this);
                this.f31193a.loadBannerForDemandOnlyForBidding(this.f31195c, str, this.f31126t, this);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private boolean m32366t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f31126t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    /* JADX INFO: renamed from: u */
    private void m32367u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(m32373q()));
    }

    /* JADX INFO: renamed from: v */
    private void m32368v() {
        this.f31199g = null;
        this.f31200h = null;
        this.f31124r = new C12204g2();
    }

    /* JADX INFO: renamed from: w */
    private void m32369w() {
        IronLog.INTERNAL.verbose();
        m32434a(new b());
    }

    /* JADX INFO: renamed from: a */
    public void m32371a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, InterfaceC12349o interfaceC12349o) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + m32445k());
        if (iSDemandOnlyBannerLayout == null) {
            m32361a(InterfaceC12336b.c.f31111e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + m32445k()}});
            return;
        }
        C12347m.a[] aVarArr = {C12347m.a.NOT_LOADED, C12347m.a.LOADED};
        C12347m.a aVar = C12347m.a.LOAD_IN_PROGRESS;
        C12347m.a aVarM32431a = m32431a(aVarArr, aVar);
        if (aVarM32431a == aVar || aVarM32431a == C12347m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                m32361a(InterfaceC12336b.c.f31111e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + m32445k()}});
                return;
            } else {
                String str = "banner layout in blocking state | state: " + m32445k();
                iSDemandOnlyBannerLayout.getListener().m34031a(m32446l(), new IronSourceError(619, str));
                m32361a(InterfaceC12336b.c.f31111e, new Object[][]{new Object[]{"reason", str}});
                return;
            }
        }
        m32368v();
        m32361a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            m32362a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.f31126t = iSDemandOnlyBannerLayout;
        if (!m32448n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            m32361a(3300, (Object[][]) null);
            m32362a(ironSourceErrorBuildLoadFailedError);
            return;
        }
        try {
            C12333d.a aVar2 = (C12333d.a) interfaceC12349o.mo32452a(new C12279k5());
            C12434q2 c12434q2Mo32355a = new InterfaceC12335a.a(aVar2.m32351h()).mo32355a(m32443h());
            if (c12434q2Mo32355a == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                m32361a(3300, (Object[][]) null);
                m32362a(ironSourceErrorBuildLoadFailedError2);
                return;
            }
            String strM33151k = c12434q2Mo32355a.m33151k();
            if (strM33151k == null) {
                ironLog.error("serverData is null");
                m32362a(new IronSourceError(618, "No available ad to load"));
                return;
            }
            m32440b(strM33151k);
            m32432a(aVar2.m32344a());
            m32435a(aVar2.m32349f());
            m32361a(83302, (Object[][]) null);
            this.f31124r.m31517a(c12434q2Mo32355a.m33142b());
            this.f31120n = new C12189f5();
            m32369w();
            this.f31193a.initBannerForBidding(this.f31122p, this.f31123q, this.f31195c, this);
            this.f31193a.loadBannerForDemandOnlyForBidding(this.f31195c, strM33151k, iSDemandOnlyBannerLayout, this);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            m32362a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.C12347m
    /* JADX INFO: renamed from: j */
    public Map<String, Object> mo32372j() {
        HashMap map = new HashMap();
        try {
            if (m32366t()) {
                map.put("reason", "banner is destroyed");
            } else {
                C12357j.m32540a(map, this.f31126t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f31193a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f31193a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f31194b.m31343i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f31194b.m31335a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (m32449o()) {
                map.put("isOneFlow", 1);
            }
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            map.put("instanceType", Integer.valueOf(this.f31194b.m31338d()));
            if (!TextUtils.isEmpty(this.f31199g)) {
                map.put("auctionId", this.f31199g);
            }
            JSONObject jSONObject = this.f31200h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f31200h);
            }
            if (!TextUtils.isEmpty(this.f31202j)) {
                map.put("dynamicDemandSource", this.f31202j);
                return map;
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("Instance: " + m32443h() + " " + e.getMessage());
        }
        return map;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + m32375s());
        m32361a(3008, (Object[][]) null);
        if (m32366t()) {
            return;
        }
        this.f31126t.getListener().m34030a(m32446l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdClicked(Map map) {
        onBannerAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + m32375s());
        m32361a(InterfaceC12336b.b.f31104g, (Object[][]) null);
        if (m32366t()) {
            return;
        }
        this.f31126t.getListener().m34032b(m32446l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLeftApplication(Map map) {
        onBannerAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + m32375s());
        m32361a(83300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C12189f5.m31432a(this.f31121o))}});
        m32362a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoadFailed(IronSourceError ironSourceError, Map map) {
        onBannerAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + m32375s());
        InterfaceC11524K8 interfaceC11524K8 = this.f31127u;
        IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.BANNER;
        int iMo26265a = interfaceC11524K8.mo26265a(enumC12328a);
        m32361a(InterfaceC12336b.c.f31110d, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iMo26265a)}, new Object[]{"duration", Long.valueOf(C12189f5.m31432a(this.f31121o))}});
        if (m32438a(C12347m.a.LOAD_IN_PROGRESS, C12347m.a.LOADED)) {
            m32450p();
            if (!m32366t()) {
                this.f31126t.m32354a(view, layoutParams);
            }
            m32361a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iMo26265a)}, new Object[]{"duration", Long.valueOf(C12189f5.m31432a(this.f31120n))}});
            this.f31128v.mo26267b(enumC12328a);
            m32364a(this.f31124r.m31520c(), IronSourceUtils.m32731a());
            if (m32366t()) {
                return;
            }
            this.f31126t.getListener().m34033c(m32446l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map map) {
        onBannerAdLoaded(view, layoutParams);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenDismissed(Map map) {
        onBannerAdScreenDismissed();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenPresented(Map map) {
        onBannerAdScreenPresented();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (m32438a(C12347m.a.LOADED, C12347m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + m32375s());
            m32361a(3009, (Object[][]) null);
            m32364a(this.f31124r.m31516a(), IronSourceUtils.m32731a());
            if (m32366t()) {
                return;
            }
            this.f31126t.getListener().m34034d(m32446l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdShown(Map map) {
        onBannerAdShown();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + m32375s() + " " + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitFailed(IronSourceError ironSourceError, Map map) {
        onBannerInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + m32375s());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitSuccess(Map map) {
        onBannerInitSuccess();
    }

    /* JADX INFO: renamed from: q */
    C12355h m32373q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m32443h());
        String str = "" + m32444i() + m32443h();
        C12355h c12355h = new C12355h(IronSource.EnumC12328a.BANNER);
        c12355h.m32493a(arrayList);
        c12355h.m32503d(str);
        c12355h.m32500c(m32446l());
        c12355h.m32498b(IronSourceUtils.m32779g());
        c12355h.m32495a(true);
        c12355h.m32501c(true);
        c12355h.m32489a(this.f31126t.getSize());
        return c12355h;
    }

    /* JADX INFO: renamed from: r */
    public void m32374r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        m32431a(new C12347m.a[]{C12347m.a.LOADED, C12347m.a.LOAD_IN_PROGRESS, C12347m.a.SHOW_IN_PROGRESS}, C12347m.a.NOT_LOADED);
        if (m32366t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        m32450p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f31126t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.m32353a();
        }
        this.f31126t = null;
        AbstractAdapter abstractAdapter = this.f31193a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f31195c);
        }
        m32361a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + m32446l());
    }

    /* JADX INFO: renamed from: s */
    public String m32375s() {
        return this.f31194b.m31342h().isMultipleInstances() ? this.f31194b.m31342h().getProviderTypeForReflection() : this.f31194b.m31342h().getProviderName();
    }

    /* JADX INFO: renamed from: a */
    public void m32370a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + m32445k());
        if (iSDemandOnlyBannerLayout == null) {
            m32361a(InterfaceC12336b.c.f31111e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + m32445k()}});
            return;
        }
        C12347m.a[] aVarArr = {C12347m.a.NOT_LOADED, C12347m.a.LOADED};
        C12347m.a aVar = C12347m.a.LOAD_IN_PROGRESS;
        C12347m.a aVarM32431a = m32431a(aVarArr, aVar);
        if (aVarM32431a != aVar && aVarM32431a != C12347m.a.SHOW_IN_PROGRESS) {
            m32368v();
            m32361a(3002, (Object[][]) null);
            if (!m32449o()) {
                ironLog.verbose("can't load banner when isOneFlow = false");
                m32362a(new IronSourceError(1063, "Missing configuration settings"));
                return;
            }
            this.f31126t = iSDemandOnlyBannerLayout;
            this.f31120n = new C12189f5();
            m32369w();
            if (this.f31125s.m32464a()) {
                m32367u();
                return;
            } else {
                ironLog.verbose("can't load the banner the auction isn't enabled");
                m32362a(new IronSourceError(1063, "Missing server configuration"));
                return;
            }
        }
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            m32361a(InterfaceC12336b.c.f31111e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + m32445k()}});
        } else {
            String str = "banner layout in blocking state | state: " + m32445k();
            iSDemandOnlyBannerLayout.getListener().m34031a(m32446l(), new IronSourceError(619, str));
            m32361a(InterfaceC12336b.c.f31111e, new Object[][]{new Object[]{"reason", str}});
        }
    }

    @Override // com.ironsource.InterfaceC11691U1
    /* JADX INFO: renamed from: a */
    public void mo27553a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.f31199g = null;
        this.f31200h = null;
        m32361a(InterfaceC12336b.c.f31113g, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, m32445k()}});
        if (m32437a(C12347m.a.LOAD_IN_PROGRESS)) {
            m32362a(new IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.ironsource.InterfaceC11691U1
    /* JADX INFO: renamed from: a */
    public void mo27554a(List<C12434q2> list, String str, C12434q2 c12434q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m32362a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + m32375s());
        if (m32438a(C12347m.a.LOAD_IN_PROGRESS, C12347m.a.NOT_LOADED)) {
            m32450p();
            m32363a(ironSourceError, C12189f5.m31432a(this.f31120n));
            m32364a(this.f31124r.m31518b(), IronSourceUtils.m32731a());
            if (m32366t()) {
                return;
            }
            this.f31126t.getListener().m34031a(m32446l(), ironSourceError);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32363a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 606) {
            m32361a(3306, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            m32361a(3300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m32361a(int i, Object[][] objArr) {
        Map<String, Object> mapMo32372j = mo32372j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        mapMo32372j.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        C11399D9.m25613i().mo25281a(new C12580w5(i, new JSONObject(mapMo32372j)));
    }

    /* JADX INFO: renamed from: a */
    private void m32364a(List<String> list, String str) {
        m32433a(list, m32443h(), m32444i(), this.f31202j, str);
    }

    @Override // com.ironsource.InterfaceC12160e2
    /* JADX INFO: renamed from: a */
    public void mo31346a(C12333d.a aVar, int i, long j, int i2, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f31199g = aVar.m32344a();
        this.f31200h = aVar.m32349f();
        InterfaceC12335a.a aVar2 = new InterfaceC12335a.a(aVar.m32351h());
        if (!TextUtils.isEmpty(str)) {
            m32361a(88002, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        m32361a(InterfaceC12336b.c.f31114h, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        m32361a(InterfaceC12336b.c.f31116j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, aVar2.mo32357b()}});
        if (m32437a(C12347m.a.LOAD_IN_PROGRESS)) {
            if (aVar2.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(3306, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                m32362a(ironSourceError);
                return;
            }
            C12434q2 c12434q2 = aVar2.get(0);
            this.f31124r.m31517a(c12434q2.m33142b());
            this.f31124r.m31521c(c12434q2.m33148h());
            this.f31124r.m31519b(c12434q2.m33147g());
            String strM33151k = c12434q2.m33151k();
            m32440b(strM33151k);
            m32365c(strM33151k);
        }
    }
}
