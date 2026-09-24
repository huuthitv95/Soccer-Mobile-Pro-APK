package com.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.O */
/* JADX INFO: loaded from: classes6.dex */
public class C11587O {

    /* JADX INFO: renamed from: a */
    private final C11426F0 f25256a;

    public C11587O(C11426F0 c11426f0) {
        this.f25256a = c11426f0;
    }

    /* JADX INFO: renamed from: a */
    public void m26688a(Activity activity, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (activity != null) {
            map.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f25256a.m25748a(EnumC11372C0.SHOW_AD, map);
    }

    /* JADX INFO: renamed from: b */
    public void m26695b(String str) {
        m26691a(str, (String) null);
    }

    /* JADX INFO: renamed from: c */
    public void m26697c(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        this.f25256a.m25748a(EnumC11372C0.AD_DISMISS_SCREEN, map);
    }

    /* JADX INFO: renamed from: d */
    public void m26698d(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25256a.m25748a(EnumC11372C0.AD_ENDED, map);
    }

    /* JADX INFO: renamed from: e */
    public void m26699e(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25256a.m25748a(EnumC11372C0.AD_INFO_CHANGED, map);
    }

    /* JADX INFO: renamed from: f */
    public void m26700f(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        this.f25256a.m25748a(EnumC11372C0.AD_LEFT_APPLICATION, map);
    }

    /* JADX INFO: renamed from: g */
    public void m26701g(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25256a.m25748a(EnumC11372C0.AD_OPENED, map);
    }

    /* JADX INFO: renamed from: h */
    public void m26702h(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        this.f25256a.m25748a(EnumC11372C0.AD_PRESENT_SCREEN, map);
    }

    /* JADX INFO: renamed from: i */
    public void m26703i(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25256a.m25748a(EnumC11372C0.AD_STARTED, map);
    }

    /* JADX INFO: renamed from: j */
    public void m26704j(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        this.f25256a.m25748a(EnumC11372C0.AD_VIEW_BOUND, map);
    }

    /* JADX INFO: renamed from: k */
    public void m26705k(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25256a.m25748a(EnumC11372C0.AD_VISIBLE, map);
    }

    /* JADX INFO: renamed from: b */
    public void m26696b(String str, String str2) {
        HashMap map = new HashMap();
        map.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("reason", str2);
        }
        this.f25256a.m25748a(EnumC11372C0.PLACEMENT_CAPPED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m26694a(boolean z) {
        HashMap map = new HashMap();
        map.put("status", z ? "true" : "false");
        this.f25256a.m25748a(EnumC11372C0.SHOW_AD_CHANCE, map);
    }

    /* JADX INFO: renamed from: a */
    public void m26690a(String str, int i, String str2, EnumC11349Ad enumC11349Ad) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        map.put("errorCode", Integer.valueOf(i));
        map.put("reason", str2);
        String strM26686a = m26686a(enumC11349Ad);
        if (strM26686a != null) {
            map.put(IronSourceConstants.EVENTS_EXT1, strM26686a);
        }
        this.f25256a.m25748a(EnumC11372C0.SHOW_AD_FAILED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m26689a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25256a.m25748a(EnumC11372C0.AD_CLICKED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m26691a(String str, String str2) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f25256a.m25748a(EnumC11372C0.AD_CLOSED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m26692a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map2.put("placement", str);
        }
        map2.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        map2.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        map2.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            map2.put("duration", Long.valueOf(j2));
        }
        if (map != null) {
            map2.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            map2.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f25256a.m25749a(EnumC11372C0.AD_REWARDED, map2, j);
    }

    /* JADX INFO: renamed from: a */
    public void m26693a(String str, String str2, boolean z) {
        HashMap map = new HashMap();
        map.put("isMultipleAdUnits", 1);
        map.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("reason", str2);
        }
        map.put(IronSourceConstants.EVENTS_EXT1, z ? "true" : "false");
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f25256a.m25748a(EnumC11372C0.CHECK_PLACEMENT_CAPPED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m26687a() {
        this.f25256a.m25748a(EnumC11372C0.SESSION_CAPPED, null);
    }

    /* JADX INFO: renamed from: a */
    private static String m26686a(EnumC11349Ad enumC11349Ad) {
        if (enumC11349Ad != EnumC11349Ad.NO_LOADED_ADS && enumC11349Ad != EnumC11349Ad.MAX_ATTEMPTS_REACHED) {
            return null;
        }
        return "recover show failed: " + enumC11349Ad.m25305b();
    }
}
