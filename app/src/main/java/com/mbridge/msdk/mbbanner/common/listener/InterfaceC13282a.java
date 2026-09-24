package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.listener.a */
/* JADX INFO: compiled from: BannerBridgeListener.java */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC13282a {
    /* JADX INFO: renamed from: a */
    void mo38172a(CampaignEx campaignEx);

    /* JADX INFO: renamed from: a */
    void mo38173a(boolean z);

    /* JADX INFO: renamed from: a */
    void mo38174a(boolean z, String str);

    void close();

    void readyStatus(int i);

    void toggleCloseBtn(int i);

    void triggerCloseBtn(String str);
}
