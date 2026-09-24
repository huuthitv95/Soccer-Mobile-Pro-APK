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

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MBBidInterstitialVideoHandler {

    /* JADX INFO: renamed from: a */
    private C13613a f36562a;

    /* JADX INFO: renamed from: b */
    private String f36563b;

    /* JADX INFO: renamed from: c */
    private String f36564c;

    /* JADX INFO: renamed from: d */
    private String f36565d;

    /* JADX INFO: renamed from: e */
    private String f36566e;

    /* JADX INFO: renamed from: f */
    private String f36567f;

    /* JADX INFO: renamed from: g */
    private String f36568g;

    /* JADX INFO: renamed from: h */
    private InterstitialVideoListener f36569h;

    /* JADX INFO: renamed from: i */
    private int f36570i = 2;

    /* JADX INFO: renamed from: j */
    private boolean f36571j = false;

    /* JADX INFO: renamed from: k */
    private boolean f36572k = false;

    /* JADX INFO: renamed from: l */
    private boolean f36573l = false;

    /* JADX INFO: renamed from: m */
    private boolean f36574m = false;

    /* JADX INFO: renamed from: n */
    private int f36575n;

    /* JADX INFO: renamed from: o */
    private int f36576o;

    /* JADX INFO: renamed from: p */
    private int f36577p;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (C13008c.m36588n().m36542d() == null && context != null) {
            C13008c.m36588n().m36535b(context);
        }
        m38124a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m38124a(String str, String str2) {
        String strM37926e = C13229v0.m37926e(str2);
        if (!TextUtils.isEmpty(strM37926e)) {
            C13229v0.m37922d(str2, strM37926e);
        }
        this.f36563b = str2;
        this.f36564c = str;
        m38123a();
    }

    /* JADX INFO: renamed from: b */
    private void m38126b(String str, String str2) {
        try {
            if (this.f36562a == null) {
                C13613a c13613a = new C13613a();
                this.f36562a = c13613a;
                c13613a.m39246d(true);
                this.f36562a.m39248e(true);
                this.f36562a.m39244c(str, str2);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    public void clearVideoCache() {
        try {
            C13613a c13613a = this.f36562a;
            if (c13613a != null) {
                c13613a.m39247e();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        C13613a c13613a = this.f36562a;
        return c13613a != null ? c13613a.m39253j() : "";
    }

    public String getRequestId() {
        C13613a c13613a = this.f36562a;
        return c13613a != null ? c13613a.m39256m() : "";
    }

    public boolean isBidReady() {
        m38123a();
        C13613a c13613a = this.f36562a;
        if (c13613a != null) {
            return c13613a.m39245c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        m38123a();
        if (this.f36562a != null) {
            this.f36562a.m39241a(false, C13156d.m37475b().m37479a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36563b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        m38123a();
        if (this.f36562a != null) {
            this.f36562a.m39242a(true, str, C13156d.m37475b().m37479a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36563b, true, 2));
        }
    }

    public void playVideoMute(int i) {
        this.f36570i = i;
        C13613a c13613a = this.f36562a;
        if (c13613a != null) {
            c13613a.m39234a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f36565d = str;
        this.f36566e = str2;
        this.f36567f = str3;
        this.f36568g = str4;
        this.f36572k = true;
        this.f36573l = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f36563b, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i, int i2) {
        this.f36575n = i;
        this.f36576o = i2;
        this.f36577p = C13088a.f35845K;
        this.f36574m = true;
        m38125b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f36569h = interstitialVideoListener;
        this.f36571j = true;
        C13613a c13613a = this.f36562a;
        if (c13613a == null || c13613a.m39264u()) {
            return;
        }
        this.f36562a.m39237a(new C13270a(interstitialVideoListener, this.f36563b, true));
        this.f36571j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f36569h = interstitialVideoListener;
        this.f36571j = true;
        C13613a c13613a = this.f36562a;
        if (c13613a == null || c13613a.m39264u()) {
            return;
        }
        this.f36562a.m39237a(new C13270a(interstitialVideoListener, this.f36563b, true));
        this.f36571j = false;
    }

    public void showFromBid() {
        m38123a();
        if (this.f36562a != null) {
            this.f36562a.m39238a((String) null, (String) null, (String) null, C13156d.m37475b().m37479a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36563b, false, -1));
        }
    }

    public void setIVRewardEnable(int i, double d) {
        this.f36575n = i;
        this.f36576o = (int) (d * 100.0d);
        this.f36577p = C13088a.f35844J;
        this.f36574m = true;
        m38125b();
    }

    /* JADX INFO: renamed from: a */
    private void m38123a() {
        C13613a c13613a;
        if (this.f36562a == null) {
            m38126b(this.f36564c, this.f36563b);
        }
        if (this.f36571j) {
            C13613a c13613a2 = this.f36562a;
            if (c13613a2 != null) {
                c13613a2.m39237a(new C13270a(this.f36569h, this.f36563b, true));
            }
            this.f36571j = false;
        }
        if (this.f36572k) {
            C13613a c13613a3 = this.f36562a;
            if (c13613a3 != null) {
                c13613a3.m39239a(this.f36565d, this.f36566e, this.f36567f, this.f36568g);
            }
            this.f36572k = false;
        }
        if (!this.f36574m || (c13613a = this.f36562a) == null) {
            return;
        }
        c13613a.m39235a(this.f36575n, this.f36577p, this.f36576o);
        this.f36574m = false;
    }

    /* JADX INFO: renamed from: b */
    private void m38125b() {
        C13613a c13613a = this.f36562a;
        if (c13613a != null) {
            c13613a.m39235a(this.f36575n, this.f36577p, this.f36576o);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        m38124a(str, str2);
    }
}
