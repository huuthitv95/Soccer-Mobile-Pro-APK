package com.mbridge.msdk.video.p291bt.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.InterfaceC12693j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.impl.C14191k;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MBridgeBTWebViewDiff extends BTBaseView implements InterfaceC13381b, InterfaceC12693j {
    public C14191k jsCommon;
    public WindVaneWebView webView;

    public MBridgeBTWebViewDiff(Context context) {
        super(context);
    }

    public MBridgeBTWebViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract /* synthetic */ void close();

    public abstract /* synthetic */ void expand(String str, boolean z);

    public abstract /* synthetic */ CampaignEx getMraidCampaign();

    public void open(String str) {
        try {
            String clickURL = this.f39712b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f39712b.setClickURL(str);
                reportOpen(str);
            }
            this.f39712b.setClickTempSource(2);
            this.f39712b.setClickType(2);
            this.f39712b.setTriggerClickSource(2);
            C12682a c12682a = new C12682a(getContext(), this.f39713c);
            c12682a.m34632a(this);
            c12682a.m34633a(this.f39712b);
            this.f39712b.setClickURL(clickURL);
        } catch (Throwable th) {
            C13219q0.m37816b(BTBaseView.TAG, th.getMessage());
        }
    }

    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new C13146h(getContext()).m37371a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f39713c, str, this.f39712b.isBidCampaign());
            }
        } catch (Throwable th) {
            C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setChinaAlertInstallState(C14191k c14191k) {
    }

    public abstract /* synthetic */ void unload();

    public abstract /* synthetic */ void useCustomClose(boolean z);
}
