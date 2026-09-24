package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.entity.C14216c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.h */
/* JADX INFO: compiled from: PlayableStatisticsOnNotifyListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14066h extends C14069k {
    public C14066h(CampaignEx campaignEx, C14202a c14202a, C14216c c14216c, String str, String str2, InterfaceC14058a interfaceC14058a, int i, boolean z) {
        super(campaignEx, c14202a, c14216c, str, str2, interfaceC14058a, i, z);
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.C14069k, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        if (i == 100) {
            m42182j();
            m42180h();
            m42181i();
            m42175b(2);
        } else if (i == 109) {
            m42169a(2);
        } else if (i == 122) {
            m42179g();
        } else if (i != 129) {
            String str = "";
            if (i == 118) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                m42170a(3, str);
            } else if (i == 119) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                m42170a(4, str);
            }
        } else {
            CampaignEx campaignEx = this.f40544b;
            if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 2) {
                m42182j();
                m42180h();
                m42181i();
                m42175b(1);
            }
        }
        super.mo41600a(i, obj);
    }
}
