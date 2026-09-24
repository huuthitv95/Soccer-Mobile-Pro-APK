package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.listener.AbstractC13399b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class WindVaneWebViewForNV extends WindVaneWebView {

    /* JADX INFO: renamed from: r */
    private AbstractC13399b f37345r;

    /* JADX INFO: renamed from: s */
    private boolean f37346s;

    public WindVaneWebViewForNV(Context context) {
        super(context);
        this.f37346s = false;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC13399b abstractC13399b;
        if (i != 4 || (abstractC13399b = this.f37345r) == null) {
            return super.onKeyDown(i, keyEvent);
        }
        abstractC13399b.mo38751a();
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f37346s) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void orientation(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("orientation", C11744X3.i.f26320C);
            } else {
                jSONObject.put("orientation", C11744X3.i.f26322D);
            }
            C13392f.m38726a().m38728a((WebView) this, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setBackListener(AbstractC13399b abstractC13399b) {
        this.f37345r = abstractC13399b;
    }

    public void setInterceptTouch(boolean z) {
        this.f37346s = z;
    }

    public void webViewShow(CampaignEx campaignEx, String str) {
        try {
            C13392f.m38726a().m38728a((WebView) this, "webviewshow", "");
            C13080n c13080n = new C13080n();
            c13080n.m36990n(campaignEx.getRequestId());
            c13080n.m36992o(campaignEx.getRequestIdNotice());
            if (getContext() != null && getContext().getApplicationContext() != null) {
                c13080n.m36962b(campaignEx.getId());
                c13080n.m36961b(campaignEx.isMraid() ? C13080n.f35733N : C13080n.f35734O);
                C13145g.m37364d(c13080n, getContext().getApplicationContext(), str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37346s = false;
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37346s = false;
    }
}
