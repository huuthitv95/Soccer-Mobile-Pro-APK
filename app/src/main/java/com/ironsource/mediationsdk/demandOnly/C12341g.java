package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C11399D9;
import com.ironsource.C11455Gb;
import com.ironsource.C12159e1;
import com.ironsource.C12189f5;
import com.ironsource.C12204g2;
import com.ironsource.C12258j2;
import com.ironsource.C12279k5;
import com.ironsource.C12317m4;
import com.ironsource.C12434q2;
import com.ironsource.C12580w5;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC11524K8;
import com.ironsource.InterfaceC12160e2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.C12352e;
import com.ironsource.mediationsdk.C12355h;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.g */
/* JADX INFO: loaded from: classes6.dex */
public class C12341g extends C12347m implements InterfaceC12348n.a, InterstitialSmashListener, InterfaceC12160e2 {

    /* JADX INFO: renamed from: n */
    private C12189f5 f31146n;

    /* JADX INFO: renamed from: o */
    private C12189f5 f31147o;

    /* JADX INFO: renamed from: p */
    private ISDemandOnlyInterstitialListener f31148p;

    /* JADX INFO: renamed from: q */
    private C12204g2 f31149q;

    /* JADX INFO: renamed from: r */
    private C12352e f31150r;

    /* JADX INFO: renamed from: s */
    private InterfaceC12350p f31151s;

    /* JADX INFO: renamed from: t */
    private final InterfaceC11524K8 f31152t;

    /* JADX INFO: renamed from: u */
    private final InterfaceC11524K8.a f31153u;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.g$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + C12341g.this.m32445k());
            C12341g.this.m32391a(new IronSourceError(1052, "load timed out"));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.g$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + C12341g.this.m32445k());
            C12341g.this.m32391a(new IronSourceError(1052, "load timed out"));
        }
    }

    public C12341g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j, AbstractAdapter abstractAdapter, C12352e c12352e) {
        super(new C12159e1(networkSettings, networkSettings.getInterstitialSettings(), IronSource.EnumC12328a.INTERSTITIAL), abstractAdapter);
        this.f31151s = new InterfaceC12350p.b();
        this.f31152t = C11455Gb.m25891U().mo25852s();
        this.f31153u = C11455Gb.m25885O().mo25775i();
        this.f31148p = iSDemandOnlyInterstitialListener;
        this.f31198f = j;
        this.f31150r = c12352e;
        this.f31193a.initInterstitial(str, str2, this.f31195c, this);
    }

    /* JADX INFO: renamed from: c */
    private void m32383c(InterfaceC12349o interfaceC12349o) {
        this.f31146n = new C12189f5();
        m32434a(new a());
        if (!m32448n()) {
            m32391a(new IronSourceError(InterfaceC12339e.a.f31142k, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            C12333d.a aVar = (C12333d.a) interfaceC12349o.mo32452a(new C12279k5());
            C12434q2 c12434q2Mo32355a = new InterfaceC12335a.a(aVar.m32351h()).mo32355a(m32443h());
            if (c12434q2Mo32355a == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                m32381a(EnumC12598x5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
                m32391a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            String strM33151k = c12434q2Mo32355a.m33151k();
            if (strM33151k == null) {
                IronLog.INTERNAL.error("serverData is null");
                m32391a(new IronSourceError(InterfaceC12339e.a.f31140i, "No available ad to load"));
                return;
            }
            m32440b(strM33151k);
            m32432a(aVar.m32344a());
            m32435a(aVar.m32349f());
            m32381a(EnumC12598x5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.f31149q.m31517a(c12434q2Mo32355a.m33142b());
            this.f31147o = new C12189f5();
            this.f31193a.loadInterstitialForBidding(this.f31195c, null, strM33151k, this);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            m32391a(ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: q */
    private C12355h m32385q() {
        String str = m32444i() + m32443h();
        C12355h c12355h = new C12355h(this.f31205m);
        c12355h.m32498b(IronSourceUtils.m32779g());
        c12355h.m32495a(true);
        c12355h.m32501c(true);
        c12355h.m32503d(str);
        c12355h.m32500c(m32446l());
        c12355h.m32485a(this.f31152t.mo26265a(this.f31205m));
        C12258j2 c12258j2 = new C12258j2(m32443h(), false);
        c12258j2.m31783a(this.f31151s.value());
        Map<String, Object> interstitialBiddingData = this.f31193a.getInterstitialBiddingData(this.f31195c, new JSONObject());
        if (interstitialBiddingData != null) {
            c12258j2.m31786b(interstitialBiddingData);
        }
        c12355h.m32488a(c12258j2);
        return c12355h;
    }

    /* JADX INFO: renamed from: r */
    private void m32386r() {
        this.f31147o = new C12189f5();
        this.f31193a.loadInterstitial(this.f31195c, null, this);
    }

    /* JADX INFO: renamed from: s */
    private void m32387s() {
        if (!this.f31150r.m32464a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            m32391a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        m32381a(EnumC12598x5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        C12355h c12355hM32385q = m32385q();
        IronLog.INTERNAL.verbose("auction waterfallString = " + c12355hM32385q.m32517r());
        m32381a(EnumC12598x5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c12355hM32385q.m32517r()}});
        this.f31150r.m32457a(ContextProvider.getInstance().getApplicationContext(), c12355hM32385q, this);
    }

    /* JADX INFO: renamed from: t */
    private void m32388t() {
        this.f31199g = null;
        this.f31200h = null;
        this.f31202j = null;
        this.f31149q = new C12204g2();
    }

    /* JADX INFO: renamed from: u */
    private void m32389u() {
        this.f31146n = new C12189f5();
        m32434a(new b());
        if (m32448n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            m32381a(EnumC12598x5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
            m32391a(ironSourceErrorBuildLoadFailedError);
        } else if (m32449o()) {
            m32387s();
        } else {
            m32386r();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12348n.a
    /* JADX INFO: renamed from: a */
    public void mo32390a(InterfaceC12349o interfaceC12349o) {
        IronLog.INTERNAL.verbose("state=" + m32445k());
        C12347m.a aVar = C12347m.a.NOT_LOADED;
        C12347m.a aVar2 = C12347m.a.LOADED;
        C12347m.a aVar3 = C12347m.a.LOAD_IN_PROGRESS;
        C12347m.a aVarM32431a = m32431a(new C12347m.a[]{aVar, aVar2}, aVar3);
        if (aVarM32431a != aVar && aVarM32431a != aVar2) {
            m32391a(new IronSourceError(1050, aVarM32431a == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        m32388t();
        m32381a(EnumC12598x5.IS_INSTANCE_LOAD, (Object[][]) null);
        m32383c(interfaceC12349o);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12348n.a
    /* JADX INFO: renamed from: b */
    public void mo32393b() {
        IronLog.INTERNAL.verbose("state=" + m32445k());
        C12347m.a aVar = C12347m.a.NOT_LOADED;
        C12347m.a aVar2 = C12347m.a.LOADED;
        C12347m.a aVar3 = C12347m.a.LOAD_IN_PROGRESS;
        C12347m.a aVarM32431a = m32431a(new C12347m.a[]{aVar, aVar2}, aVar3);
        if (aVarM32431a != aVar && aVarM32431a != aVar2) {
            this.f31148p.onInterstitialAdLoadFailed(m32446l(), new IronSourceError(1050, aVarM32431a == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        m32388t();
        m32381a(EnumC12598x5.IS_INSTANCE_LOAD, (Object[][]) null);
        m32389u();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12348n.a
    /* JADX INFO: renamed from: e */
    public void mo32394e() {
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose("instanceName = " + m32443h() + ", state=" + m32445k());
        m32381a(EnumC12598x5.IS_INSTANCE_SHOW, (Object[][]) null);
        C12347m.a aVar = C12347m.a.LOADED;
        C12347m.a aVar2 = C12347m.a.SHOW_IN_PROGRESS;
        if (m32438a(aVar, aVar2)) {
            this.f31193a.showInterstitial(this.f31195c, this);
            return;
        }
        if (m32437a(aVar2)) {
            ironSourceError = new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing");
        } else {
            ironSourceError = m32437a(C12347m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(1066, "showInterstitial error: no available ads to show");
        }
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h());
        m32381a(EnumC12598x5.IS_INSTANCE_CLICKED, new Object[0][]);
        this.f31148p.onInterstitialAdClicked(m32446l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClicked(Map map) {
        onInterstitialAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        m32439b(C12347m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h());
        m32381a(EnumC12598x5.IS_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f31152t.mo26265a(this.f31205m))}});
        this.f31153u.mo26267b(this.f31205m);
        this.f31148p.onInterstitialAdClosed(m32446l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClosed(Map map) {
        onInterstitialAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + m32443h() + " state=" + m32445k());
        m32381a(EnumC12598x5.TROUBLESHOOTING_IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C12189f5.m31432a(this.f31147o))}});
        m32391a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdLoadFailed(IronSourceError ironSourceError, Map map) {
        onInterstitialAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h());
        m32381a(EnumC12598x5.IS_INSTANCE_OPENED, new Object[0][]);
        m32382a(this.f31149q.m31516a(), IronSourceUtils.m32731a());
        this.f31148p.onInterstitialAdOpened(m32446l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdOpened(Map map) {
        onInterstitialAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h() + " state=" + m32445k());
        m32450p();
        m32381a(EnumC12598x5.TROUBLESHOOTING_IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C12189f5.m31432a(this.f31147o))}});
        if (m32438a(C12347m.a.LOAD_IN_PROGRESS, C12347m.a.LOADED)) {
            m32381a(EnumC12598x5.IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C12189f5.m31432a(this.f31146n))}});
            m32382a(this.f31149q.m31520c(), IronSourceUtils.m32731a());
            this.f31148p.onInterstitialAdReady(m32446l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdReady(Map map) {
        onInterstitialAdReady();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + m32443h() + " state=" + m32445k());
        m32439b(C12347m.a.NOT_LOADED);
        m32381a(EnumC12598x5.IS_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f31148p.onInterstitialAdShowFailed(m32446l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowFailed(IronSourceError ironSourceError, Map map) {
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowSucceeded(Map map) {
        onInterstitialAdShowSucceeded();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h());
        m32381a(EnumC12598x5.IS_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdVisible(Map map) {
        onInterstitialAdVisible();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitFailed(IronSourceError ironSourceError, Map map) {
        onInterstitialInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitSuccess(Map map) {
        onInterstitialInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12348n.a
    /* JADX INFO: renamed from: a */
    public boolean mo32392a() {
        EnumC12598x5 enumC12598x5;
        boolean zIsInterstitialReady = false;
        if (!m32437a(C12347m.a.LOADED)) {
            m32381a(EnumC12598x5.IS_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsInterstitialReady = this.f31193a.isInterstitialReady(this.f31195c);
            if (zIsInterstitialReady) {
                enumC12598x5 = EnumC12598x5.IS_INSTANCE_READY_TRUE;
            } else {
                enumC12598x5 = EnumC12598x5.IS_INSTANCE_READY_FALSE;
            }
            m32381a(enumC12598x5, (Object[][]) null);
            return zIsInterstitialReady;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception=" + e.getMessage());
            return zIsInterstitialReady;
        }
    }

    /* JADX INFO: renamed from: a */
    void m32391a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + m32443h() + ", error = " + ironSourceError.getErrorMessage());
        m32450p();
        if (m32438a(C12347m.a.LOAD_IN_PROGRESS, C12347m.a.NOT_LOADED)) {
            m32380a(ironSourceError, C12189f5.m31432a(this.f31146n));
            m32382a(this.f31149q.m31518b(), IronSourceUtils.m32731a());
            this.f31148p.onInterstitialAdLoadFailed(m32446l(), ironSourceError);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32381a(EnumC12598x5 enumC12598x5, Object[][] objArr) {
        Map<String, Object> mapMo32372j = mo32372j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapMo32372j.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e));
            }
        }
        C11399D9.m25613i().mo25281a(new C12580w5(enumC12598x5, new JSONObject(mapMo32372j)));
    }

    /* JADX INFO: renamed from: c */
    private void m32384c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (m32437a(C12347m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                m32391a(new IronSourceError(InterfaceC12339e.a.f31140i, "No available ad to load"));
            } else {
                m32381a(EnumC12598x5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f31193a.loadInterstitialForBidding(this.f31195c, null, str, this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32380a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1158) {
            m32381a(EnumC12598x5.IS_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            m32381a(EnumC12598x5.IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32382a(List<String> list, String str) {
        m32433a(list, m32443h(), m32444i(), this.f31202j, str);
    }

    @Override // com.ironsource.InterfaceC12160e2
    /* JADX INFO: renamed from: a */
    public void mo31346a(C12333d.a aVar, int i, long j, int i2, String str) {
        String strM33151k;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f31199g = aVar.m32344a();
        this.f31200h = aVar.m32349f();
        this.f31151s = aVar.m32343a(m32446l());
        InterfaceC12335a.a aVar2 = new InterfaceC12335a.a(aVar.m32351h());
        if (aVar2.isEmpty()) {
            strM33151k = "";
        } else {
            C12434q2 c12434q2 = aVar2.get(0);
            this.f31149q.m31517a(c12434q2.m33142b());
            this.f31149q.m31521c(c12434q2.m33148h());
            this.f31149q.m31519b(c12434q2.m33147g());
            strM33151k = c12434q2.m33151k();
            m32440b(strM33151k);
        }
        if (!TextUtils.isEmpty(str)) {
            m32381a(EnumC12598x5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        m32381a(EnumC12598x5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        m32381a(EnumC12598x5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, aVar2.mo32357b()}});
        if (m32437a(C12347m.a.LOAD_IN_PROGRESS)) {
            if (aVar2.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
                ironLog.error("interstitial - empty waterfall");
                m32391a(ironSourceError);
                return;
            }
            m32384c(strM33151k);
        }
    }

    @Override // com.ironsource.InterfaceC11691U1
    /* JADX INFO: renamed from: a */
    public void mo27554a(List<C12434q2> list, String str, C12434q2 c12434q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.InterfaceC11691U1
    /* JADX INFO: renamed from: a */
    public void mo27553a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("error " + i + " - " + str);
        this.f31199g = null;
        this.f31200h = null;
        m32381a(EnumC12598x5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, m32445k()}});
        if (m32437a(C12347m.a.LOAD_IN_PROGRESS)) {
            m32391a(new IronSourceError(InterfaceC12339e.a.f31141j, "No available ad to load"));
        }
    }
}
