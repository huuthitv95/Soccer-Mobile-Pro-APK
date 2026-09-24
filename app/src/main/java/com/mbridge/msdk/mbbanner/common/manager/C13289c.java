package com.mbridge.msdk.mbbanner.common.manager;

import android.text.TextUtils;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c;
import com.mbridge.msdk.mbbanner.common.report.C13291a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.setting.C13640l;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.c */
/* JADX INFO: compiled from: BannerShowManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13289c extends C13290d {

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.c$a */
    /* JADX INFO: compiled from: BannerShowManager.java */
    class a implements NativeListener.TrackingExListener {
        a() {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            C13227u0.m37860a(campaign, C13289c.this.f36691d);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.NativeListener.TrackingExListener
        public void onLeaveApp() {
            InterfaceC13284c interfaceC13284c = C13289c.this.f36688a;
            if (interfaceC13284c != null) {
                interfaceC13284c.onLeaveApp();
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            C13227u0.m37860a(campaign, C13289c.this.f36691d);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            C13227u0.m37863b(campaign, C13289c.this.f36691d);
        }
    }

    public C13289c(MBBannerView mBBannerView, InterfaceC13284c interfaceC13284c, String str, String str2, boolean z, C13640l c13640l) {
        super(mBBannerView, interfaceC13284c, str, str2, z, c13640l);
    }

    @Override // com.mbridge.msdk.mbbanner.common.manager.C13290d
    /* JADX INFO: renamed from: a */
    public void mo38224a(CampaignEx campaignEx, boolean z, String str) {
        if (this.f36702o) {
            if (this.f36707t == null) {
                this.f36707t = new C12682a(C13008c.m36588n().m36542d(), this.f36703p);
            }
            this.f36707t.m34636a(new a());
            campaignEx.setCampaignUnitId(this.f36703p);
            this.f36707t.m34633a(campaignEx);
            if (!this.f36690c.isReportClick()) {
                this.f36690c.setReportClick(true);
                C13291a.m38283a(C13008c.m36588n().m36542d(), campaignEx);
            }
            InterfaceC13284c interfaceC13284c = this.f36688a;
            if (interfaceC13284c != null) {
                interfaceC13284c.mo38184c();
            }
            if (!z || TextUtils.isEmpty(str)) {
                return;
            }
            C13291a.m38285a(campaignEx, this.f36703p, str);
        }
    }
}
