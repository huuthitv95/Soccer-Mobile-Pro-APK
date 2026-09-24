package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.interstitialvideo.listener.C13270a;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.C13613a;
import com.mbridge.msdk.setting.C13636h;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MBInterstitialVideoHandler {

    /* JADX INFO: renamed from: a */
    private String f36578a;

    /* JADX INFO: renamed from: b */
    private C13613a f36579b;

    /* JADX INFO: renamed from: c */
    private String f36580c;

    /* JADX INFO: renamed from: d */
    private String f36581d;

    /* JADX INFO: renamed from: e */
    private String f36582e;

    /* JADX INFO: renamed from: f */
    private String f36583f;

    /* JADX INFO: renamed from: g */
    private String f36584g;

    /* JADX INFO: renamed from: h */
    private InterstitialVideoListener f36585h;

    /* JADX INFO: renamed from: i */
    private int f36586i = 2;

    /* JADX INFO: renamed from: j */
    private boolean f36587j = false;

    /* JADX INFO: renamed from: k */
    private boolean f36588k = false;

    /* JADX INFO: renamed from: l */
    private boolean f36589l = false;

    /* JADX INFO: renamed from: m */
    private int f36590m;

    /* JADX INFO: renamed from: n */
    private int f36591n;

    /* JADX INFO: renamed from: o */
    private int f36592o;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (C13008c.m36588n().m36542d() == null && context != null) {
            C13008c.m36588n().m36535b(context);
        }
        m38128a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m38128a(String str, String str2) {
        String strM37926e = C13229v0.m37926e(str2);
        if (!TextUtils.isEmpty(strM37926e)) {
            C13229v0.m37922d(str2, strM37926e);
        }
        this.f36580c = str2;
        this.f36578a = str;
        m38127a();
    }

    /* JADX INFO: renamed from: b */
    private void m38130b(String str, String str2) {
        try {
            if (this.f36579b == null) {
                C13613a c13613a = new C13613a();
                this.f36579b = c13613a;
                c13613a.m39246d(true);
                this.f36579b.m39244c(str, str2);
                C13636h.m39706b().m39726h(str2);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    public void clearVideoCache() {
        try {
            C13613a c13613a = this.f36579b;
            if (c13613a != null) {
                c13613a.m39247e();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        C13613a c13613a = this.f36579b;
        return c13613a != null ? c13613a.m39253j() : "";
    }

    public String getRequestId() {
        C13613a c13613a = this.f36579b;
        return c13613a != null ? c13613a.m39256m() : "";
    }

    public boolean isReady() {
        m38127a();
        C13613a c13613a = this.f36579b;
        if (c13613a != null) {
            return c13613a.m39245c(true);
        }
        return false;
    }

    public void load() {
        m38127a();
        if (this.f36579b != null) {
            this.f36579b.m39241a(true, C13156d.m37475b().m37479a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36580c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        m38127a();
        if (this.f36579b != null) {
            this.f36579b.m39241a(false, C13156d.m37475b().m37479a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36580c, true, 1));
        }
    }

    public void playVideoMute(int i) {
        this.f36586i = i;
        C13613a c13613a = this.f36579b;
        if (c13613a != null) {
            c13613a.m39234a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f36581d = str;
        this.f36582e = str2;
        this.f36583f = str3;
        this.f36584g = str4;
        this.f36588k = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f36580c, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i, int i2) {
        this.f36590m = i;
        this.f36591n = i2;
        this.f36592o = C13088a.f35845K;
        this.f36589l = true;
        m38129b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f36585h = interstitialVideoListener;
        this.f36587j = true;
        C13613a c13613a = this.f36579b;
        if (c13613a == null || c13613a.m39264u()) {
            return;
        }
        this.f36579b.m39237a(new C13270a(interstitialVideoListener));
        this.f36587j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f36585h = interstitialVideoListener;
        this.f36587j = true;
        C13613a c13613a = this.f36579b;
        if (c13613a == null || c13613a.m39264u()) {
            return;
        }
        this.f36579b.m39237a(new C13270a(interstitialVideoListener));
        this.f36587j = false;
    }

    public void show() {
        m38127a();
        if (this.f36579b != null) {
            this.f36579b.m39238a((String) null, (String) null, (String) null, C13156d.m37475b().m37479a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36580c, false, -1));
        }
    }

    public void setIVRewardEnable(int i, double d) {
        this.f36590m = i;
        this.f36591n = (int) (d * 100.0d);
        this.f36592o = C13088a.f35844J;
        this.f36589l = true;
        m38129b();
    }

    /* JADX INFO: renamed from: a */
    private void m38127a() {
        C13613a c13613a;
        if (this.f36579b == null) {
            m38130b(this.f36578a, this.f36580c);
        }
        if (this.f36587j) {
            this.f36579b.m39237a(new C13270a(this.f36585h, this.f36580c, false));
            this.f36587j = false;
        }
        if (this.f36588k) {
            this.f36579b.m39239a(this.f36581d, this.f36582e, this.f36583f, this.f36584g);
            this.f36588k = false;
        }
        if (!this.f36589l || (c13613a = this.f36579b) == null) {
            return;
        }
        c13613a.m39235a(this.f36590m, this.f36592o, this.f36591n);
        this.f36589l = false;
    }

    /* JADX INFO: renamed from: b */
    private void m38129b() {
        C13613a c13613a = this.f36579b;
        if (c13613a != null) {
            c13613a.m39235a(this.f36590m, this.f36592o, this.f36591n);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        m38128a(str, str2);
    }
}
