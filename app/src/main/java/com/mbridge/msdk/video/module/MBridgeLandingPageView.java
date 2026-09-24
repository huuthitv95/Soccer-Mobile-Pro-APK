package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.mbsignalcommon.base.InterfaceC13348a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.video.signal.factory.C14177b;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeLandingPageView extends MBridgeH5EndCardView {

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeLandingPageView$b */
    private static final class C14012b implements InterfaceC13348a {
        private C14012b() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.base.InterfaceC13348a
        /* JADX INFO: renamed from: a */
        public boolean mo38605a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            C13227u0.m37856a(C13008c.m36588n().m36542d(), str, (BaseTrackingListener) null);
            return true;
        }
    }

    public MBridgeLandingPageView(Context context) {
        super(context);
    }

    public MBridgeLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected String getURL() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null) {
            return C12684c.m34652a(campaignEx.getClickURL(), "-999", "-999");
        }
        return null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(C14177b c14177b) {
        if (this.f40205e) {
            this.f40288p.setFilter(new C14012b());
        }
        super.preLoadData(c14177b);
        setVisibility(0);
        setCloseVisible(0);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        try {
            C13219q0.m37813a(MBridgeBaseView.TAG, "webviewshow");
            C13392f.m38726a().m38728a((WebView) this.f40288p, "webviewshow", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
