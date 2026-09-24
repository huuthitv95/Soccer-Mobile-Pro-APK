package com.mbridge.msdk.advanced.middle;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.d */
/* JADX INFO: compiled from: NativeAdvancedShowListenerImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12662d {

    /* JADX INFO: renamed from: a */
    protected NativeAdvancedAdListener f33549a;

    /* JADX INFO: renamed from: b */
    protected CampaignEx f33550b;

    /* JADX INFO: renamed from: c */
    protected C12661c f33551c;

    public C12662d(C12661c c12661c, NativeAdvancedAdListener nativeAdvancedAdListener, CampaignEx campaignEx) {
        this.f33551c = c12661c;
        this.f33549a = nativeAdvancedAdListener;
        this.f33550b = campaignEx;
    }

    /* JADX INFO: renamed from: a */
    public void m34525a(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f33549a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.closeFullScreen(mBridgeIds);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34526a(MBridgeIds mBridgeIds, String str) {
        C13148j.m37380a(C13008c.m36588n().m36542d(), this.f33550b, mBridgeIds.getUnitId(), str);
    }

    /* JADX INFO: renamed from: b */
    public void m34527b(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f33549a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onClick(mBridgeIds);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m34528c(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f33549a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onClose(mBridgeIds);
            C12661c c12661c = this.f33551c;
            if (c12661c != null) {
                c12661c.f33519E = false;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m34529d(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f33549a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLeaveApp(mBridgeIds);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m34530e(MBridgeIds mBridgeIds) {
        C12661c c12661c = this.f33551c;
        if (c12661c != null) {
            c12661c.f33519E = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_to", "0");
            jSONObject.put("allow_skip", this.f33551c.m34520f());
        } catch (JSONException e) {
            C13219q0.m37816b("NativeAdvancedShowListenerImpl", "e:" + e.getMessage());
        }
        C13148j.m37395b(C13008c.m36588n().m36542d(), this.f33550b, mBridgeIds.getUnitId(), jSONObject.toString());
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f33549a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLogImpression(mBridgeIds);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m34531f(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f33549a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.showFullScreen(mBridgeIds);
        }
    }
}
