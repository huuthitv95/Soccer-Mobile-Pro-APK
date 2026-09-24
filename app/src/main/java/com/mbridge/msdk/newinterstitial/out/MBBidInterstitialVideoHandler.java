package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.newinterstitial.listener.C13437a;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.C13613a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* JADX INFO: renamed from: a */
    private String f37374a;

    /* JADX INFO: renamed from: b */
    private String f37375b;

    /* JADX INFO: renamed from: c */
    private String f37376c;

    /* JADX INFO: renamed from: d */
    private String f37377d;

    /* JADX INFO: renamed from: e */
    private String f37378e;

    /* JADX INFO: renamed from: f */
    private C13613a f37379f;

    /* JADX INFO: renamed from: g */
    private NewInterstitialListener f37380g;

    /* JADX INFO: renamed from: h */
    private int f37381h = 2;

    /* JADX INFO: renamed from: i */
    private boolean f37382i = false;

    /* JADX INFO: renamed from: j */
    private boolean f37383j = false;

    /* JADX INFO: renamed from: k */
    private boolean f37384k = false;

    /* JADX INFO: renamed from: l */
    private int f37385l;

    /* JADX INFO: renamed from: m */
    private int f37386m;
    public String mUnitId;

    /* JADX INFO: renamed from: n */
    private int f37387n;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (C13008c.m36588n().m36542d() == null && context != null) {
            C13008c.m36588n().m36535b(context);
        }
        m38940a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m38940a(String str, String str2) {
        String strM37926e = C13229v0.m37926e(str2);
        if (!TextUtils.isEmpty(strM37926e)) {
            C13229v0.m37922d(str2, strM37926e);
        }
        this.mUnitId = str2;
        this.f37374a = str;
        m38939a();
    }

    /* JADX INFO: renamed from: b */
    private void m38942b(String str, String str2) {
        try {
            if (this.f37379f == null) {
                C13613a c13613a = new C13613a();
                this.f37379f = c13613a;
                c13613a.m39246d(true);
                this.f37379f.m39248e(true);
                this.f37379f.m39244c(str, str2);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("MBBidInterstitialVideoHandler", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m38943c() {
        C13613a c13613a = this.f37379f;
        if (c13613a != null) {
            c13613a.m39235a(this.f37385l, this.f37387n, this.f37386m);
        }
    }

    public void clearVideoCache() {
        try {
            C13613a c13613a = this.f37379f;
            if (c13613a != null) {
                c13613a.m39247e();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        C13613a c13613a = this.f37379f;
        return c13613a != null ? c13613a.m39253j() : "";
    }

    public String getRequestId() {
        C13613a c13613a = this.f37379f;
        return c13613a != null ? c13613a.m39256m() : "";
    }

    public boolean isBidReady() {
        m38939a();
        C13613a c13613a = this.f37379f;
        if (c13613a != null) {
            return c13613a.m39245c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        m38939a();
        if (this.f37379f != null) {
            this.f37379f.m39241a(false, C13156d.m37475b().m37479a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        m38939a();
        if (this.f37379f != null) {
            this.f37379f.m39242a(true, str, C13156d.m37475b().m37479a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i) {
        this.f37381h = i;
        C13613a c13613a = this.f37379f;
        if (c13613a != null) {
            c13613a.m39234a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f37376c = str;
        this.f37375b = str2;
        this.f37377d = str3;
        this.f37378e = str4;
        this.f37383j = true;
        MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        C13008c.m36588n().m36530a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i, int i2) {
        this.f37385l = i;
        this.f37386m = i2;
        this.f37387n = C13088a.f35845K;
        this.f37384k = true;
        m38943c();
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f37380g = newInterstitialListener;
        this.f37382i = true;
        C13613a c13613a = this.f37379f;
        if (c13613a == null || c13613a.m39264u()) {
            return;
        }
        this.f37379f.m39237a(new C13437a(newInterstitialListener));
        this.f37382i = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f37380g = newInterstitialListener;
        this.f37382i = true;
        C13613a c13613a = this.f37379f;
        if (c13613a == null || c13613a.m39264u()) {
            return;
        }
        this.f37379f.m39237a(new C13437a(newInterstitialListener));
        this.f37382i = false;
    }

    public void showFromBid() {
        m38939a();
        if (this.f37379f != null) {
            this.f37379f.m39238a((String) null, (String) null, (String) null, C13156d.m37475b().m37479a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, false, -1));
        }
    }

    public void setIVRewardEnable(int i, double d) {
        this.f37385l = i;
        this.f37386m = (int) (d * 100.0d);
        this.f37387n = C13088a.f35844J;
        this.f37384k = true;
        m38943c();
    }

    /* JADX INFO: renamed from: a */
    private void m38939a() {
        if (this.f37379f == null) {
            m38942b(this.f37374a, this.mUnitId);
        }
        m38941b();
    }

    /* JADX INFO: renamed from: b */
    private void m38941b() {
        C13613a c13613a;
        if (this.f37382i) {
            C13613a c13613a2 = this.f37379f;
            if (c13613a2 != null) {
                c13613a2.m39237a(new C13437a(this.f37380g));
            }
            this.f37382i = false;
        }
        if (this.f37383j) {
            C13613a c13613a3 = this.f37379f;
            if (c13613a3 != null) {
                c13613a3.m39239a(this.f37376c, this.f37375b, this.f37377d, this.f37378e);
            }
            this.f37383j = false;
        }
        if (!this.f37384k || (c13613a = this.f37379f) == null) {
            return;
        }
        c13613a.m39235a(this.f37385l, this.f37387n, this.f37386m);
        this.f37384k = false;
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        m38940a(str, str2);
    }
}
