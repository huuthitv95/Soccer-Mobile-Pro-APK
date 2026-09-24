package com.mbridge.msdk.video.module.listener.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.a */
/* JADX INFO: compiled from: CommonContainerNotifyListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14059a extends C14064f {

    /* JADX INFO: renamed from: a */
    private Activity f40530a;

    /* JADX INFO: renamed from: b */
    private CampaignEx f40531b;

    public C14059a(Activity activity, CampaignEx campaignEx) {
        this.f40530a = activity;
        this.f40531b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        super.mo41600a(i, obj);
        if (i != 106 || this.f40530a == null || this.f40531b == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            String strM34652a = C12684c.m34652a(this.f40531b.getClickURL(), "-999", "-999");
            if (!TextUtils.isEmpty(strM34652a)) {
                intent.setData(Uri.parse(strM34652a));
                this.f40530a.startActivity(intent);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("NotifyListener", th.getMessage(), th);
        }
        this.f40530a.finish();
    }
}
