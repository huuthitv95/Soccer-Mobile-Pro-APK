package com.mbridge.msdk.splash.middle;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.report.C13665a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.middle.d */
/* JADX INFO: compiled from: SplashShowListenerImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13664d {

    /* JADX INFO: renamed from: a */
    private MBSplashShowListener f38353a;

    /* JADX INFO: renamed from: b */
    private CampaignEx f38354b;

    /* JADX INFO: renamed from: c */
    private C13663c f38355c;

    public C13664d(C13663c c13663c, MBSplashShowListener mBSplashShowListener, CampaignEx campaignEx) {
        this.f38355c = c13663c;
        this.f38353a = mBSplashShowListener;
        this.f38354b = campaignEx;
    }

    /* JADX INFO: renamed from: a */
    public void m40011a(MBridgeIds mBridgeIds) {
        MBSplashShowListener mBSplashShowListener = this.f38353a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdClicked(mBridgeIds);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40012a(MBridgeIds mBridgeIds, int i) {
        MBSplashShowListener mBSplashShowListener = this.f38353a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onDismiss(mBridgeIds, i);
        }
        C13663c c13663c = this.f38355c;
        if (c13663c != null) {
            c13663c.f38346x = false;
        }
        if (i == 6 || i == 4 || i == 5) {
            C13665a.m40022a(this.f38354b, mBridgeIds.getUnitId(), i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40013a(MBridgeIds mBridgeIds, int i, int i2, int i3) {
        MBSplashShowListener mBSplashShowListener = this.f38353a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayStart(mBridgeIds);
        }
        C13665a.m40023a(this.f38354b, mBridgeIds.getUnitId(), i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public void m40014a(MBridgeIds mBridgeIds, long j) {
        MBSplashShowListener mBSplashShowListener = this.f38353a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdTick(mBridgeIds, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40015a(MBridgeIds mBridgeIds, String str) {
        C13663c c13663c = this.f38355c;
        if (c13663c != null) {
            c13663c.f38346x = false;
        }
        C13148j.m37380a(C13008c.m36588n().m36542d(), this.f38354b, mBridgeIds.getUnitId(), str);
        MBSplashShowListener mBSplashShowListener = this.f38353a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(mBridgeIds, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m40016b(MBridgeIds mBridgeIds) {
        C13663c c13663c = this.f38355c;
        if (c13663c != null) {
            c13663c.f38346x = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_to", this.f38355c.m40004e());
            jSONObject.put("allow_skip", this.f38355c.m40005f() ? 1 : 0);
            jSONObject.put("countdown", this.f38355c.m40000d());
        } catch (JSONException e) {
            C13219q0.m37816b("SplashShowListenerImpl", "e:" + e.getMessage());
        }
        C13148j.m37395b(C13008c.m36588n().m36542d(), this.f38354b, mBridgeIds.getUnitId(), jSONObject.toString());
        MBSplashShowListener mBSplashShowListener = this.f38353a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowSuccessed(mBridgeIds);
        }
    }
}
