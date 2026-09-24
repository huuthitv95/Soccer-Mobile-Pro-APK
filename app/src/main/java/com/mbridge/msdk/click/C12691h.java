package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* JADX INFO: renamed from: com.mbridge.msdk.click.h */
/* JADX INFO: compiled from: DefaultAppletSchemeCallBack.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12691h extends AppletSchemeCallBack {

    /* JADX INFO: renamed from: a */
    private final NativeListener.NativeTrackingListener f33677a;

    /* JADX INFO: renamed from: b */
    private final CampaignEx f33678b;

    /* JADX INFO: renamed from: c */
    private final AppletsModel f33679c;

    /* JADX INFO: renamed from: d */
    private final C12682a f33680d;

    public C12691h(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, C12682a c12682a) {
        this.f33677a = nativeTrackingListener;
        this.f33678b = campaignEx;
        this.f33679c = appletsModel;
        this.f33680d = c12682a;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected void onRequestFailed(int i, String str, String str2) {
        CampaignEx campaignEx = this.f33678b;
        if (campaignEx == null || this.f33679c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f33677a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("DefaultAppletSchemeCallBack", e.getMessage());
                    }
                }
            }
            this.f33679c.setUserClick(false);
            this.f33679c.setRequestingFinish();
            this.f33678b.setClickURL(str2);
            C12682a c12682a = this.f33680d;
            if (c12682a != null) {
                try {
                    c12682a.m34633a(this.f33678b);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("DefaultAppletSchemeCallBack", e2.getMessage());
                    }
                }
            }
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("DefaultAppletSchemeCallBack", e3.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected void onRequestStart() {
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f33678b;
        if (campaignEx == null || this.f33679c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f33677a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("DefaultAppletSchemeCallBack", e.getMessage());
                    }
                }
            }
            this.f33679c.setUserClick(false);
            this.f33679c.setRequestingFinish();
            this.f33678b.setDeepLinkUrl(str);
            C12682a c12682a = this.f33680d;
            if (c12682a != null) {
                try {
                    c12682a.m34633a(this.f33678b);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("DefaultAppletSchemeCallBack", e2.getMessage());
                    }
                }
            }
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("DefaultAppletSchemeCallBack", e3.getMessage());
            }
        }
    }
}
