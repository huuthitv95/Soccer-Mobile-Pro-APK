package com.mbridge.msdk.video.p291bt.module.orglistener;

import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.videocommon.entity.C14216c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.orglistener.b */
/* JADX INFO: compiled from: DefaultShowRewardListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13933b implements InterfaceC13939h {

    /* JADX INFO: renamed from: a */
    private Boolean f39922a = null;

    /* JADX INFO: renamed from: b */
    private Boolean f39923b = null;

    /* JADX INFO: renamed from: a */
    public void m41685a() {
        this.f39923b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39289a(int i, String str, String str2) {
        C13219q0.m37813a("ShowRewardListener", "onAutoLoad: " + str2);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39290a(C13154c c13154c) {
        C13219q0.m37813a("ShowRewardListener", "onAdShow");
        this.f39922a = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39291a(C13154c c13154c, String str) {
        C13219q0.m37813a("ShowRewardListener", "onShowFail:" + str);
        this.f39923b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39292a(C13154c c13154c, boolean z, C14216c c14216c) {
        C13219q0.m37813a("ShowRewardListener", "onAdClose:isCompleteView:" + z + ",reward:" + c14216c);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39293a(String str, String str2) {
        C13219q0.m37813a("ShowRewardListener", "onEndcardShow: " + str2);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39294a(boolean z, int i) {
        C13219q0.m37813a("ShowRewardListener", "onAdCloseWithIVReward: " + z + "  " + i);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: a */
    public void mo39295a(boolean z, String str, String str2) {
        C13219q0.m37813a("ShowRewardListener", "onVideoAdClicked:" + str2);
    }

    /* JADX INFO: renamed from: b */
    public void m41686b() {
        this.f39922a = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
    /* JADX INFO: renamed from: b */
    public void mo39296b(String str, String str2) {
        C13219q0.m37813a("ShowRewardListener", "onVideoComplete: " + str2);
    }

    /* JADX INFO: renamed from: c */
    public Boolean m41687c() {
        return this.f39923b;
    }

    /* JADX INFO: renamed from: d */
    public Boolean m41688d() {
        return this.f39922a;
    }
}
