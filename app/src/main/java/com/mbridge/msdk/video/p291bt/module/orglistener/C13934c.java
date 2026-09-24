package com.mbridge.msdk.video.p291bt.module.orglistener;

import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b;
import com.mbridge.msdk.videocommon.entity.C14216c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.orglistener.c */
/* JADX INFO: compiled from: H5ShowRewardListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13934c extends C13933b {

    /* JADX INFO: renamed from: c */
    private InterfaceC13931b f39924c;

    /* JADX INFO: renamed from: d */
    private String f39925d;

    public C13934c(InterfaceC13931b interfaceC13931b, String str) {
        this.f39924c = interfaceC13931b;
        this.f39925d = str;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39289a(int i, String str, String str2) {
        if (this.f39924c != null) {
            C13219q0.m37813a("H5ShowRewardListener", "onAutoLoad");
            this.f39924c.mo41641a(this.f39925d, i, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39290a(C13154c c13154c) {
        if (this.f39924c != null) {
            C13219q0.m37813a("H5ShowRewardListener", "onAdShow");
            this.f39924c.mo41640a(this.f39925d);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39291a(C13154c c13154c, String str) {
        if (this.f39924c != null) {
            C13219q0.m37813a("H5ShowRewardListener", "onShowFail");
            this.f39924c.mo41642a(this.f39925d, str);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39292a(C13154c c13154c, boolean z, C14216c c14216c) {
        if (this.f39924c != null) {
            C13219q0.m37813a("H5ShowRewardListener", "onAdClose");
            this.f39924c.mo41644a(this.f39925d, z, c14216c);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39293a(String str, String str2) {
        if (this.f39924c != null) {
            C13219q0.m37813a("H5ShowRewardListener", "onEndcardShow");
            this.f39924c.mo41647c(this.f39925d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39295a(boolean z, String str, String str2) {
        if (this.f39924c != null) {
            C13219q0.m37813a("H5ShowRewardListener", "onVideoAdClicked");
            this.f39924c.mo41646b(this.f39925d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: b */
    public void mo39296b(String str, String str2) {
        if (this.f39924c != null) {
            C13219q0.m37813a("H5ShowRewardListener", "onVideoComplete");
            this.f39924c.mo41643a(this.f39925d, str, str2);
        }
    }
}
