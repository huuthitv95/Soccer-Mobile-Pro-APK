package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.InterfaceC12693j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b;
import com.mbridge.msdk.video.signal.InterfaceC14179h;
import com.mbridge.msdk.video.signal.factory.C14177b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MBridgeH5EndCardViewDiff extends MBridgeBaseView implements InterfaceC14179h, InterfaceC13381b, InterfaceC12693j {
    public String unitId;

    public MBridgeH5EndCardViewDiff(Context context) {
        super(context);
    }

    public MBridgeH5EndCardViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract /* synthetic */ void close();

    public abstract /* synthetic */ void expand(String str, boolean z);

    public abstract /* synthetic */ CampaignEx getMraidCampaign();

    public abstract /* synthetic */ void handlerPlayableException(String str);

    public abstract /* synthetic */ void install(CampaignEx campaignEx);

    public abstract /* synthetic */ void notifyCloseBtn(int i);

    public void open(String str) {
        try {
            String clickURL = this.f40202b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f40202b.setClickURL(str);
                reportOpen(str);
            }
            this.f40202b.setClickTempSource(2);
            this.f40202b.setClickType(2);
            this.f40202b.setTriggerClickSource(2);
            C12682a c12682a = new C12682a(getContext(), this.unitId);
            c12682a.m34632a(this);
            c12682a.m34633a(this.f40202b);
            this.f40202b.setClickURL(clickURL);
            this.notifyListener.mo41600a(126, "");
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public abstract /* synthetic */ void orientation(Configuration configuration);

    public abstract /* synthetic */ void preLoadData(C14177b c14177b);

    public abstract /* synthetic */ void readyStatus(int i);

    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new C13146h(getContext()).m37371a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f40202b.isBidCampaign());
        }
    }

    public abstract /* synthetic */ void toggleCloseBtn(int i);

    public abstract /* synthetic */ void unload();

    public abstract /* synthetic */ void useCustomClose(boolean z);

    public abstract /* synthetic */ void webviewshow();
}
