package com.mbridge.msdk.video.p291bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeBTLayout extends BTBaseView {

    /* JADX INFO: renamed from: p */
    private WebView f39831p;

    public MBridgeBTLayout(Context context) {
        super(context);
    }

    public MBridgeBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f39831p != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put(C11744X3.i.f26373j0, str);
                jSONObject2.put("data", jSONObject);
                C13392f.m38726a().m38728a(this.f39831p, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C13893d.m41513c().m41457a(this.f39831p, "broadcast", getInstanceId());
            }
        }
    }

    public WebView getBtWebView() {
        return this.f39831p;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void init(Context context) {
    }

    public void notifyEvent(String str) {
        WebView webView = this.f39831p;
        if (webView != null) {
            BTBaseView.m41515a(webView, str, this.f39714d);
        }
    }

    public void onBackPressed() {
        if (this.f39831p != null) {
            C13893d.m41513c().m41457a(this.f39831p, "onSystemBackPressed", this.f39714d);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f39831p != null) {
            try {
                CampaignEx campaignEx = this.f39712b;
                if (campaignEx == null || !campaignEx.isDynamicView()) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put("orientation", C11744X3.i.f26320C);
                    } else {
                        jSONObject.put("orientation", C11744X3.i.f26322D);
                    }
                    jSONObject.put("instanceId", this.f39714d);
                    C13392f.m38726a().m38728a(this.f39831p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void onDestory() {
    }

    public void setWebView(WebView webView) {
        this.f39831p = webView;
    }
}
