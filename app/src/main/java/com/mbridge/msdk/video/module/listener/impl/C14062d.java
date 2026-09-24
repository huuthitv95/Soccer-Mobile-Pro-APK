package com.mbridge.msdk.video.module.listener.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.module.report.C14075b;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.entity.C14216c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.d */
/* JADX INFO: compiled from: ContainerViewStatisticsListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14062d extends C14069k {
    public C14062d(CampaignEx campaignEx, C14202a c14202a, C14216c c14216c, String str, String str2, InterfaceC14058a interfaceC14058a, int i, boolean z) {
        super(campaignEx, c14202a, c14216c, str, str2, interfaceC14058a, i, z);
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.C14069k, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        super.mo41600a(i, obj);
        if (this.f40543a) {
            try {
                CampaignEx campaignEx = this.f40544b;
                if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
                    m42172a(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i != 105 && i != 106 && i != 113) {
                if (i == 122) {
                    m42179g();
                    return;
                }
                switch (i) {
                    case 109:
                        m42169a(2);
                        m42175b(2);
                        break;
                    case 110:
                        m42169a(1);
                        m42175b(1);
                        break;
                    case 111:
                        m42175b(1);
                        break;
                }
            }
            C14075b.m42195a(C13008c.m36588n().m36542d(), this.f40544b);
            if (i != 105) {
                String noticeUrl = this.f40544b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (noticeUrl.contains(C13088a.f35871m)) {
                        noticeUrl = noticeUrl.replace(C13088a.f35871m + C11744X3.j.f26434b + Uri.parse(noticeUrl).getQueryParameter(C13088a.f35871m), C13088a.f35871m + "=2");
                    } else {
                        noticeUrl = noticeUrl + C11744X3.j.f26436c + C13088a.f35871m + "=2";
                    }
                }
                C12682a.m34606a(C13008c.m36588n().m36542d(), this.f40544b, this.f40549g, noticeUrl, true, false, C12701a.f33768o);
            }
        }
    }
}
