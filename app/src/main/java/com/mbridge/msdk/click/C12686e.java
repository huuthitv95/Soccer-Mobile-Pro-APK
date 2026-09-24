package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.C13164b;

/* JADX INFO: renamed from: com.mbridge.msdk.click.e */
/* JADX INFO: compiled from: CommonJumpLoader.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12686e extends C12689f {

    /* JADX INFO: renamed from: e */
    private int f33653e;

    /* JADX INFO: renamed from: h */
    private C13164b f33656h;

    /* JADX INFO: renamed from: i */
    private C12699p f33657i;

    /* JADX INFO: renamed from: b */
    JumpLoaderResult f33650b = null;

    /* JADX INFO: renamed from: c */
    private int f33651c = 0;

    /* JADX INFO: renamed from: d */
    private String f33652d = null;

    /* JADX INFO: renamed from: f */
    private InterfaceC12690g f33654f = null;

    /* JADX INFO: renamed from: g */
    private boolean f33655g = true;

    /* JADX INFO: renamed from: j */
    private Handler f33658j = new Handler(Looper.getMainLooper());

    public C12686e(Context context) {
        this.f33656h = new C13164b(context);
        this.f33657i = new C12699p(context);
    }

    /* JADX INFO: renamed from: a */
    public void m34663a() {
        this.f33655g = false;
    }

    /* JADX INFO: renamed from: a */
    public void m34664a(String str, CampaignEx campaignEx, InterfaceC12690g interfaceC12690g) {
        this.f33652d = new String(campaignEx.getClickURL());
        this.f33654f = interfaceC12690g;
        this.f33650b = null;
        this.f33657i.m34753a(campaignEx.getClickURL(), interfaceC12690g, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, C12701a.f33769p);
    }

    /* JADX INFO: renamed from: a */
    public void m34665a(String str, CampaignEx campaignEx, InterfaceC12690g interfaceC12690g, String str2, boolean z, boolean z2, int i) {
        String id;
        this.f33652d = str2;
        this.f33654f = interfaceC12690g;
        this.f33650b = null;
        this.f33653e = i;
        boolean z3 = false;
        if (campaignEx != null) {
            z3 = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id = campaignEx.getId();
        } else {
            id = "";
        }
        this.f33657i.m34753a(str2, interfaceC12690g, z3, id, str, campaignEx, z, z2, i);
    }
}
