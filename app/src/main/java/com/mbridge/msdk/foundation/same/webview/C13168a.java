package com.mbridge.msdk.foundation.same.webview;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.webview.a */
/* JADX INFO: compiled from: MBDownloadListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13168a implements DownloadListener {

    /* JADX INFO: renamed from: a */
    private String f36209a;

    /* JADX INFO: renamed from: b */
    private CampaignEx f36210b;

    public C13168a(CampaignEx campaignEx) {
        this.f36210b = campaignEx;
    }

    /* JADX INFO: renamed from: a */
    public void m37548a(String str) {
        this.f36209a = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
    }
}
