package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.advanced.middle.C12662d;
import com.mbridge.msdk.advanced.report.C12663a;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.c */
/* JADX INFO: compiled from: NativeAdvancedShowManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12657c extends C12655a {

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.c$a */
    /* JADX INFO: compiled from: NativeAdvancedShowManager.java */
    class a implements NativeListener.TrackingExListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33497a;

        a(CampaignEx campaignEx) {
            this.f33497a = campaignEx;
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
            if (campaign == null) {
                return;
            }
            C13227u0.m37860a(campaign, C12657c.this.f33402c);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.NativeListener.TrackingExListener
        public void onLeaveApp() {
            C12657c c12657c = C12657c.this;
            C12662d c12662d = c12657c.f33403d;
            if (c12662d != null) {
                c12662d.m34529d(c12657c.f33411l);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            C13227u0.m37860a(campaign, C12657c.this.f33402c);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            C13227u0.m37863b(this.f33497a, C12657c.this.f33402c);
        }
    }

    public C12657c(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.advanced.manager.C12655a
    /* JADX INFO: renamed from: a */
    public void mo34400a(CampaignEx campaignEx, boolean z, String str) {
        if (this.f33404e == null) {
            this.f33404e = new C12682a(C13008c.m36588n().m36542d(), this.f33409j);
        }
        this.f33404e.m34636a(new a(campaignEx));
        if (z && !TextUtils.isEmpty(str)) {
            C12663a.m34536a(campaignEx, this.f33409j, str);
        }
        campaignEx.setCampaignUnitId(this.f33409j);
        this.f33404e.m34633a(campaignEx);
        if (!this.f33401b.isReportClick()) {
            this.f33401b.setReportClick(true);
            C12663a.m34533a(C13008c.m36588n().m36542d(), campaignEx);
        }
        C12662d c12662d = this.f33403d;
        if (c12662d != null) {
            c12662d.m34527b(this.f33411l);
        }
    }
}
