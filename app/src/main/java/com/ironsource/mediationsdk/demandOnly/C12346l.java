package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C11455Gb;
import com.ironsource.C11686Td;
import com.ironsource.C12135cd;
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
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.l */
/* JADX INFO: loaded from: classes6.dex */
public class C12346l extends C12347m implements InterfaceC12348n.b, RewardedVideoSmashListener, InterfaceC12160e2 {

    /* JADX INFO: renamed from: n */
    private C12189f5 f31184n;

    /* JADX INFO: renamed from: o */
    private C12189f5 f31185o;

    /* JADX INFO: renamed from: p */
    private ISDemandOnlyRewardedVideoListener f31186p;

    /* JADX INFO: renamed from: q */
    private C12204g2 f31187q;

    /* JADX INFO: renamed from: r */
    private C12352e f31188r;

    /* JADX INFO: renamed from: s */
    private InterfaceC12350p f31189s;

    /* JADX INFO: renamed from: t */
    private final InterfaceC11524K8 f31190t;

    /* JADX INFO: renamed from: u */
    private final InterfaceC11524K8.a f31191u;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.l$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + C12346l.this.m32445k());
            C12346l.this.m32426a(new IronSourceError(1055, "load timed out"));
        }
    }

    C12346l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j, AbstractAdapter abstractAdapter, C12352e c12352e) {
        super(new C12159e1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.EnumC12328a.REWARDED_VIDEO), abstractAdapter);
        this.f31189s = new InterfaceC12350p.b();
        this.f31190t = C11455Gb.m25891U().mo25852s();
        this.f31191u = C11455Gb.m25885O().mo25775i();
        this.f31186p = iSDemandOnlyRewardedVideoListener;
        this.f31198f = j;
        this.f31188r = c12352e;
        this.f31193a.initRewardedVideoForDemandOnly(str, str2, this.f31195c, this);
    }

    /* JADX INFO: renamed from: c */
    private void m32417c(InterfaceC12349o interfaceC12349o) {
        this.f31184n = new C12189f5();
        m32434a(m32421s());
        if (!m32448n()) {
            m32426a(new IronSourceError(InterfaceC12344j.a.f31180k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            C12333d.a aVar = (C12333d.a) interfaceC12349o.mo32452a(new C12279k5());
            C12434q2 c12434q2Mo32355a = new InterfaceC12335a.a(aVar.m32351h()).mo32355a(m32443h());
            if (c12434q2Mo32355a == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                m32415a(EnumC12598x5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
                m32426a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            String strM33151k = c12434q2Mo32355a.m33151k();
            if (strM33151k == null) {
                IronLog.INTERNAL.error("serverData is null");
                m32426a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            m32440b(strM33151k);
            m32432a(aVar.m32344a());
            m32435a(aVar.m32349f());
            m32415a(EnumC12598x5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.f31187q.m31517a(c12434q2Mo32355a.m33142b());
            this.f31185o = new C12189f5();
            this.f31193a.loadRewardedVideoForBidding(this.f31195c, null, strM33151k, this);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            m32426a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: q */
    private IronSourceError m32419q() {
        if (m32437a(C12347m.a.SHOW_IN_PROGRESS)) {
            return new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing");
        }
        return m32437a(C12347m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    /* JADX INFO: renamed from: r */
    private C12355h m32420r() {
        String str = m32444i() + m32443h();
        C12355h c12355h = new C12355h(this.f31205m);
        c12355h.m32498b(IronSourceUtils.m32779g());
        c12355h.m32495a(true);
        c12355h.m32501c(true);
        c12355h.m32503d(str);
        c12355h.m32500c(m32446l());
        c12355h.m32485a(this.f31190t.mo26265a(this.f31205m));
        C12258j2 c12258j2 = new C12258j2(m32443h(), false);
        c12258j2.m31783a(this.f31189s.value());
        Map<String, Object> rewardedVideoBiddingData = this.f31193a.getRewardedVideoBiddingData(this.f31195c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            c12258j2.m31786b(rewardedVideoBiddingData);
        }
        c12355h.m32488a(c12258j2);
        return c12355h;
    }

    /* JADX INFO: renamed from: s */
    private TimerTask m32421s() {
        return new a();
    }

    /* JADX INFO: renamed from: t */
    private void m32422t() {
        this.f31185o = new C12189f5();
        this.f31193a.loadRewardedVideo(this.f31195c, null, this);
    }

    /* JADX INFO: renamed from: u */
    private void m32423u() {
        if (!this.f31188r.m32464a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            m32426a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        m32415a(EnumC12598x5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        C12355h c12355hM32420r = m32420r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + c12355hM32420r.m32517r());
        m32415a(EnumC12598x5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c12355hM32420r.m32517r()}});
        this.f31188r.m32457a(ContextProvider.getInstance().getApplicationContext(), c12355hM32420r, this);
    }

    /* JADX INFO: renamed from: v */
    private void m32424v() {
        this.f31199g = null;
        this.f31200h = null;
        this.f31202j = null;
        this.f31187q = new C12204g2();
    }

    /* JADX INFO: renamed from: w */
    private void m32425w() {
        this.f31184n = new C12189f5();
        m32434a(m32421s());
        if (m32448n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            m32415a(EnumC12598x5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            m32426a(ironSourceErrorBuildLoadFailedError);
        } else if (m32449o()) {
            m32423u();
        } else {
            m32422t();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12348n.b
    /* JADX INFO: renamed from: a */
    public boolean mo32427a() {
        boolean zIsRewardedVideoAvailable = false;
        if (!m32437a(C12347m.a.LOADED)) {
            m32415a(EnumC12598x5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsRewardedVideoAvailable = this.f31193a.isRewardedVideoAvailable(this.f31195c);
            m32415a(zIsRewardedVideoAvailable ? EnumC12598x5.RV_INSTANCE_READY_TRUE : EnumC12598x5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return zIsRewardedVideoAvailable;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception=" + e.getMessage());
            return zIsRewardedVideoAvailable;
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12348n.b
    /* JADX INFO: renamed from: b */
    public void mo32428b(InterfaceC12349o interfaceC12349o) {
        IronLog.INTERNAL.verbose("state=" + m32445k());
        C12347m.a aVar = C12347m.a.NOT_LOADED;
        C12347m.a aVar2 = C12347m.a.LOADED;
        C12347m.a aVar3 = C12347m.a.LOAD_IN_PROGRESS;
        C12347m.a aVarM32431a = m32431a(new C12347m.a[]{aVar, aVar2}, aVar3);
        if (aVarM32431a != aVar && aVarM32431a != aVar2) {
            m32426a(new IronSourceError(1053, aVarM32431a == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        m32424v();
        m32415a(EnumC12598x5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        m32417c(interfaceC12349o);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12348n.b
    /* JADX INFO: renamed from: d */
    public void mo32430d() {
        IronLog.INTERNAL.verbose("instanceName = " + m32443h() + ", state=" + m32445k());
        m32415a(EnumC12598x5.RV_INSTANCE_SHOW, (Object[][]) null);
        if (m32438a(C12347m.a.LOADED, C12347m.a.SHOW_IN_PROGRESS)) {
            this.f31193a.showRewardedVideo(this.f31195c, this);
        } else {
            onRewardedVideoAdShowFailed(m32419q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h());
        m32415a(EnumC12598x5.RV_BUSINESS_INSTANCE_CLICKED, new Object[0][]);
        this.f31186p.onRewardedVideoAdClicked(m32446l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClicked(Map map) {
        onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        m32439b(C12347m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h());
        m32415a(EnumC12598x5.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f31190t.mo26265a(this.f31205m))}});
        this.f31191u.mo26267b(this.f31205m);
        this.f31186p.onRewardedVideoAdClosed(m32446l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClosed(Map map) {
        onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdEnded(Map map) {
        onRewardedVideoAdEnded();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h());
        m32415a(EnumC12598x5.RV_BUSINESS_INSTANCE_OPENED, new Object[0][]);
        m32416a(this.f31187q.m31516a(), IronSourceUtils.m32731a());
        this.f31186p.onRewardedVideoAdOpened(m32446l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdOpened(Map map) {
        onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h());
        Map<String, Object> mapMo32372j = mo32372j();
        if (!TextUtils.isEmpty(C12367p.m32628h().m32666g())) {
            mapMo32372j.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C12367p.m32628h().m32666g());
        }
        if (C12367p.m32628h().m32672m() != null) {
            for (String str : C12367p.m32628h().m32672m().keySet()) {
                mapMo32372j.put("custom_" + str, C12367p.m32628h().m32672m().get(str));
            }
        }
        C12135cd c12135cdM27378a = C12367p.m32628h().m32665e().m26133c().m26606f().m27378a();
        if (c12135cdM27378a != null) {
            mapMo32372j.put("placement", c12135cdM27378a.m32814c());
            mapMo32372j.put(IronSourceConstants.EVENTS_REWARD_NAME, c12135cdM27378a.m31269f());
            mapMo32372j.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(c12135cdM27378a.m31268e()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        C12580w5 c12580w5 = new C12580w5(EnumC12598x5.RV_BUSINESS_INSTANCE_REWARDED, new JSONObject(mapMo32372j));
        c12580w5.m34044a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.m32732a(c12580w5.m34047d(), m32443h()));
        C11686Td.m27533i().mo25281a(c12580w5);
        this.f31186p.onRewardedVideoAdRewarded(m32446l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdRewarded(Map map) {
        onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + m32443h() + " state=" + m32445k());
        m32439b(C12347m.a.NOT_LOADED);
        m32415a(EnumC12598x5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f31186p.onRewardedVideoAdShowFailed(m32446l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, Map map) {
        onRewardedVideoAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdStarted(Map map) {
        onRewardedVideoAdStarted();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h());
        m32415a(EnumC12598x5.RV_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdVisible(Map map) {
        onRewardedVideoAdVisible();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAvailabilityChanged(boolean z, Map map) {
        onRewardedVideoAvailabilityChanged(z);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitFailed(IronSourceError ironSourceError, Map map) {
        onRewardedVideoInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitSuccess(Map map) {
        onRewardedVideoInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + m32443h() + " state=" + m32445k());
        m32415a(EnumC12598x5.TROUBLESHOOT_RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C12189f5.m31432a(this.f31185o))}});
        m32426a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadFailed(IronSourceError ironSourceError, Map map) {
        onRewardedVideoLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m32443h() + " state=" + m32445k());
        m32450p();
        m32415a(EnumC12598x5.TROUBLESHOOT_RV_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C12189f5.m31432a(this.f31185o))}});
        if (m32438a(C12347m.a.LOAD_IN_PROGRESS, C12347m.a.LOADED)) {
            m32415a(EnumC12598x5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C12189f5.m31432a(this.f31184n))}});
            m32416a(this.f31187q.m31520c(), IronSourceUtils.m32731a());
            this.f31186p.onRewardedVideoAdLoadSuccess(m32446l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadSuccess(Map map) {
        onRewardedVideoLoadSuccess();
    }

    /* JADX INFO: renamed from: a */
    void m32426a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + m32443h() + ", error = " + ironSourceError.getErrorMessage());
        m32450p();
        if (m32438a(C12347m.a.LOAD_IN_PROGRESS, C12347m.a.NOT_LOADED)) {
            m32414a(ironSourceError, C12189f5.m31432a(this.f31184n));
            m32416a(this.f31187q.m31518b(), IronSourceUtils.m32731a());
            this.f31186p.onRewardedVideoAdLoadFailed(m32446l(), ironSourceError);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32415a(EnumC12598x5 enumC12598x5, Object[][] objArr) {
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
        C11686Td.m27533i().mo25281a(new C12580w5(enumC12598x5, new JSONObject(mapMo32372j)));
    }

    /* JADX INFO: renamed from: a */
    private void m32414a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1058) {
            m32415a(EnumC12598x5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            m32415a(EnumC12598x5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12348n.b
    /* JADX INFO: renamed from: c */
    public void mo32429c() {
        String str;
        IronLog.INTERNAL.verbose("state=" + m32445k());
        C12347m.a aVar = C12347m.a.NOT_LOADED;
        C12347m.a aVar2 = C12347m.a.LOADED;
        C12347m.a aVar3 = C12347m.a.LOAD_IN_PROGRESS;
        C12347m.a aVarM32431a = m32431a(new C12347m.a[]{aVar, aVar2}, aVar3);
        if (aVarM32431a != aVar && aVarM32431a != aVar2) {
            if (aVarM32431a == aVar3) {
                str = "load already in progress";
            } else {
                str = "cannot load because show is in progress";
            }
            this.f31186p.onRewardedVideoAdLoadFailed(m32446l(), new IronSourceError(1053, str));
            return;
        }
        m32424v();
        m32415a(EnumC12598x5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        m32425w();
    }

    /* JADX INFO: renamed from: a */
    private void m32416a(List<String> list, String str) {
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
        this.f31189s = aVar.m32343a(m32446l());
        InterfaceC12335a.a aVar2 = new InterfaceC12335a.a(aVar.m32351h());
        if (aVar2.isEmpty()) {
            strM33151k = "";
        } else {
            C12434q2 c12434q2 = aVar2.get(0);
            this.f31187q.m31517a(c12434q2.m33142b());
            this.f31187q.m31521c(c12434q2.m33148h());
            this.f31187q.m31519b(c12434q2.m33147g());
            strM33151k = c12434q2.m33151k();
            m32440b(strM33151k);
        }
        if (!TextUtils.isEmpty(str)) {
            m32415a(EnumC12598x5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        m32415a(EnumC12598x5.TROUBLESHOOT_RV_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        m32415a(EnumC12598x5.TROUBLESHOOT_RV_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, aVar2.mo32357b()}});
        if (m32437a(C12347m.a.LOAD_IN_PROGRESS)) {
            if (aVar2.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
                ironLog.error("rewardedVideo - empty waterfall");
                m32426a(ironSourceError);
                return;
            }
            m32418c(strM33151k);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m32418c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (m32437a(C12347m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                m32426a(new IronSourceError(1062, "No available ad to load"));
            } else {
                m32415a(EnumC12598x5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f31193a.loadRewardedVideoForBidding(this.f31195c, null, str, this);
            }
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
        IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.f31199g = null;
        this.f31200h = null;
        m32415a(EnumC12598x5.TROUBLESHOOT_RV_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, m32445k()}});
        if (m32437a(C12347m.a.LOAD_IN_PROGRESS)) {
            m32426a(new IronSourceError(InterfaceC12344j.a.f31179j, "No available ad to load"));
        }
    }
}
