package com.mbridge.msdk.video.p291bt.module.orglistener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.videocommon.entity.C14216c;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.orglistener.d */
/* JADX INFO: compiled from: ProxyShowRewardListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13935d extends C13933b {

    /* JADX INFO: renamed from: c */
    private InterfaceC13939h f39926c;

    /* JADX INFO: renamed from: d */
    private C14223c f39927d;

    /* JADX INFO: renamed from: e */
    private String f39928e;

    /* JADX INFO: renamed from: f */
    private String f39929f;

    /* JADX INFO: renamed from: g */
    private boolean f39930g;

    /* JADX INFO: renamed from: h */
    private Context f39931h;

    /* JADX INFO: renamed from: i */
    private boolean f39932i = false;

    /* JADX INFO: renamed from: j */
    private boolean f39933j = false;

    /* JADX INFO: renamed from: k */
    private boolean f39934k = false;

    public C13935d(Context context, boolean z, C14223c c14223c, CampaignEx campaignEx, InterfaceC13939h interfaceC13939h, String str, String str2) {
        this.f39926c = interfaceC13939h;
        this.f39927d = c14223c;
        this.f39928e = str2;
        this.f39929f = str;
        this.f39930g = z;
        this.f39931h = context;
        m41689a(c14223c, campaignEx);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    /* JADX INFO: renamed from: a */
    private void m41689a(C14223c c14223c, CampaignEx campaignEx) {
        long jM39486c0;
        try {
            String strM36533b = C13008c.m36588n().m36533b();
            if (TextUtils.isEmpty(strM36533b)) {
                jM39486c0 = 0;
            } else {
                C13635g c13635gM39718d = C13636h.m39706b().m39718d(strM36533b);
                if (c13635gM39718d == null) {
                    c13635gM39718d = C13636h.m39706b().m39708a();
                }
                if (c13635gM39718d != null) {
                    jM39486c0 = c13635gM39718d.m39486c0() * 1000;
                } else {
                    jM39486c0 = 0;
                }
            }
            C14221a c14221aM42670c = C14222b.m42658b().m42670c();
            long jM42647e = c14221aM42670c != null ? c14221aM42670c.m42647e() : 0L;
            if (campaignEx != null) {
                if (!campaignEx.isSpareOffer(jM42647e, jM39486c0)) {
                    campaignEx.setSpareOfferFlag(0);
                    campaignEx.setCbt(0);
                    return;
                }
                campaignEx.setSpareOfferFlag(1);
                if (c14223c.m42682A() == 1) {
                    campaignEx.setCbt(1);
                } else {
                    campaignEx.setCbt(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39290a(C13154c c13154c) {
        super.mo39290a(c13154c);
        if (this.f39926c == null || this.f39932i) {
            return;
        }
        this.f39932i = true;
        m41686b();
        this.f39926c.mo39290a(c13154c);
        this.f39926c.mo39289a(2, this.f39929f, this.f39928e);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39291a(C13154c c13154c, String str) {
        super.mo39291a(c13154c, str);
        if (this.f39926c == null || this.f39933j) {
            return;
        }
        this.f39933j = true;
        m41685a();
        this.f39926c.mo39291a(c13154c, str);
        this.f39926c.mo39289a(4, this.f39929f, this.f39928e);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39292a(C13154c c13154c, boolean z, C14216c c14216c) {
        super.mo39292a(c13154c, z, c14216c);
        InterfaceC13939h interfaceC13939h = this.f39926c;
        if (interfaceC13939h == null || this.f39934k) {
            return;
        }
        this.f39934k = true;
        interfaceC13939h.mo39289a(7, this.f39929f, this.f39928e);
        this.f39926c.mo39292a(c13154c, z, c14216c);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39293a(String str, String str2) {
        super.mo39293a(str, str2);
        InterfaceC13939h interfaceC13939h = this.f39926c;
        if (interfaceC13939h != null) {
            interfaceC13939h.mo39293a(str, str2);
            this.f39926c.mo39289a(6, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39294a(boolean z, int i) {
        super.mo39294a(z, i);
        InterfaceC13939h interfaceC13939h = this.f39926c;
        if (interfaceC13939h == null || this.f39934k) {
            return;
        }
        interfaceC13939h.mo39294a(z, i);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39295a(boolean z, String str, String str2) {
        super.mo39295a(z, str, str2);
        InterfaceC13939h interfaceC13939h = this.f39926c;
        if (interfaceC13939h != null) {
            interfaceC13939h.mo39295a(z, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: b */
    public void mo39296b(String str, String str2) {
        super.mo39296b(str, str2);
        InterfaceC13939h interfaceC13939h = this.f39926c;
        if (interfaceC13939h != null) {
            interfaceC13939h.mo39296b(str, str2);
            this.f39926c.mo39289a(5, str, str2);
        }
    }
}
