package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.ironsource.Xf */
/* JADX INFO: loaded from: classes6.dex */
public class C11756Xf {

    /* JADX INFO: renamed from: a */
    private final C11426F0 f26561a;

    public C11756Xf(C11426F0 c11426f0) {
        this.f26561a = c11426f0;
    }

    /* JADX INFO: renamed from: a */
    public void m27965a(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i));
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_NOTIFICATION_ERROR, map);
    }

    /* JADX INFO: renamed from: b */
    public void m27977b(int i, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i));
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_LOAD_FAILED, map);
    }

    /* JADX INFO: renamed from: c */
    public void m27979c() {
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    /* JADX INFO: renamed from: d */
    public void m27981d() {
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_SHOW, null);
    }

    /* JADX INFO: renamed from: e */
    public void m27983e() {
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    /* JADX INFO: renamed from: f */
    public void m27985f(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_ILLEGAL_STATE, map);
    }

    /* JADX INFO: renamed from: g */
    public void m27986g(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_INTERNAL_ERROR, map);
    }

    /* JADX INFO: renamed from: h */
    public void m27987h(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_LOAD_SKIPPED, map);
    }

    /* JADX INFO: renamed from: i */
    public void m27988i(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, map);
    }

    /* JADX INFO: renamed from: j */
    public void m27989j(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, map);
    }

    /* JADX INFO: renamed from: k */
    public void m27990k(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, map);
    }

    /* JADX INFO: renamed from: l */
    public void m27991l(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_CLOSED, map);
    }

    /* JADX INFO: renamed from: m */
    public void m27992m(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, map);
    }

    /* JADX INFO: renamed from: n */
    public void m27993n(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, map);
    }

    /* JADX INFO: renamed from: o */
    public void m27994o(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, map);
    }

    /* JADX INFO: renamed from: p */
    public void m27995p(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, map);
    }

    /* JADX INFO: renamed from: q */
    public void m27996q(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_OPENED, map);
    }

    /* JADX INFO: renamed from: r */
    public void m27997r(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, map);
    }

    /* JADX INFO: renamed from: s */
    public void m27998s(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, map);
    }

    /* JADX INFO: renamed from: t */
    public void m27999t(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, map);
    }

    /* JADX INFO: renamed from: u */
    public void m28000u(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT, map);
    }

    /* JADX INFO: renamed from: v */
    public void m28001v(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_WATERFALL_OVERHEAD, map);
    }

    /* JADX INFO: renamed from: c */
    public void m27980c(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, map);
    }

    /* JADX INFO: renamed from: d */
    public void m27982d(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, map);
    }

    /* JADX INFO: renamed from: e */
    public void m27984e(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, map);
    }

    /* JADX INFO: renamed from: b */
    public void m27976b() {
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_LOAD, null);
    }

    /* JADX INFO: renamed from: a */
    public void m27972a(Long l) {
        HashMap map = new HashMap();
        map.put("duration", l);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_LOAD_WHILE_LOADED, map);
    }

    /* JADX INFO: renamed from: b */
    public void m27978b(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_IMPRESSION_TIMEOUT, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27970a(LevelPlayAdError levelPlayAdError) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(levelPlayAdError.getErrorCode()));
        map.put("reason", levelPlayAdError.getErrorMessage());
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_SHOW_FAILED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27964a(int i, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i));
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27973a(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_AD_EXPIRED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27974a(String str, long j) {
        String str2;
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "provider=" + str + ";";
        }
        sb.append(str2);
        sb.append("expirationDuration=");
        sb.append(j);
        map.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_AD_EXPIRED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27975a(boolean z, long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z ? 1 : 0));
        map.put("duration", Long.valueOf(j));
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27966a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27971a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_AD_INFO_CHANGED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27963a() {
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, null);
    }

    /* JADX INFO: renamed from: a */
    public void m27969a(C11698U8 c11698u8) {
        HashMap map = new HashMap();
        double dM27611o = c11698u8.m27611o();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "revenue=%.3f,auctionId=%s", Double.valueOf(dM27611o), c11698u8.m27601e()));
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_ILR_REVENUE, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27968a(EnumC11349Ad enumC11349Ad) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, enumC11349Ad.m25305b());
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27967a(long j, long j2, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "refreshDuration=%d;notVisibleDuration=%d;reason=%s", Long.valueOf(j), Long.valueOf(j2), str));
        this.f26561a.m25748a(EnumC11372C0.TROUBLESHOOT_RELOAD, map);
    }
}
