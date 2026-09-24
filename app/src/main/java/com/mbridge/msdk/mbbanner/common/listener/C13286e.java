package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.setting.C13640l;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.listener.e */
/* JADX INFO: compiled from: ProxyBannerShowListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13286e implements InterfaceC13284c {

    /* JADX INFO: renamed from: a */
    private InterfaceC13284c f36631a;

    /* JADX INFO: renamed from: b */
    private C13640l f36632b;

    public C13286e(InterfaceC13284c interfaceC13284c, C13640l c13640l) {
        this.f36632b = c13640l;
        this.f36631a = interfaceC13284c;
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
    /* JADX INFO: renamed from: a */
    public void mo38182a(List<CampaignEx> list) {
        InterfaceC13284c interfaceC13284c = this.f36631a;
        if (interfaceC13284c != null) {
            interfaceC13284c.mo38182a(list);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
    /* JADX INFO: renamed from: b */
    public void mo38183b() {
        InterfaceC13284c interfaceC13284c = this.f36631a;
        if (interfaceC13284c != null) {
            interfaceC13284c.mo38183b();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
    /* JADX INFO: renamed from: c */
    public void mo38184c() {
        InterfaceC13284c interfaceC13284c = this.f36631a;
        if (interfaceC13284c != null) {
            interfaceC13284c.mo38184c();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
    /* JADX INFO: renamed from: d */
    public void mo38185d() {
        InterfaceC13284c interfaceC13284c = this.f36631a;
        if (interfaceC13284c != null) {
            interfaceC13284c.mo38185d();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
    public void onLeaveApp() {
        InterfaceC13284c interfaceC13284c = this.f36631a;
        if (interfaceC13284c != null) {
            interfaceC13284c.onLeaveApp();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
    /* JADX INFO: renamed from: a */
    public void mo38181a(C13082b c13082b) {
        InterfaceC13284c interfaceC13284c = this.f36631a;
        if (interfaceC13284c != null) {
            interfaceC13284c.mo38181a(c13082b);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
    /* JADX INFO: renamed from: a */
    public void mo38179a() {
        InterfaceC13284c interfaceC13284c = this.f36631a;
        if (interfaceC13284c != null) {
            interfaceC13284c.mo38179a();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
    /* JADX INFO: renamed from: a */
    public void mo38180a(CampaignEx campaignEx) {
        InterfaceC13284c interfaceC13284c = this.f36631a;
        if (interfaceC13284c != null) {
            interfaceC13284c.mo38180a(campaignEx);
        }
    }
}
