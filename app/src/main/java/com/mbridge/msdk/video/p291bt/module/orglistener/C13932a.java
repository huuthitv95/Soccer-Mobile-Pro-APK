package com.mbridge.msdk.video.p291bt.module.orglistener;

import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

/* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.orglistener.a */
/* JADX INFO: compiled from: DecoratorRewardVideoListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13932a implements InterVideoOutListener {

    /* JADX INFO: renamed from: a */
    public InterfaceC13938g f39919a;

    /* JADX INFO: renamed from: b */
    private String f39920b;

    /* JADX INFO: renamed from: c */
    private boolean f39921c;

    public C13932a(InterfaceC13938g interfaceC13938g) {
        this.f39920b = "";
        this.f39919a = interfaceC13938g;
    }

    public C13932a(InterfaceC13938g interfaceC13938g, String str, boolean z) {
        this.f39919a = interfaceC13938g;
        this.f39920b = str;
        this.f39921c = z;
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        InterfaceC13938g interfaceC13938g = this.f39919a;
        if (interfaceC13938g != null) {
            interfaceC13938g.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onAdShow(MBridgeIds mBridgeIds) {
        InterfaceC13938g interfaceC13938g = this.f39919a;
        if (interfaceC13938g != null) {
            interfaceC13938g.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onEndcardShow(MBridgeIds mBridgeIds) {
        InterfaceC13938g interfaceC13938g = this.f39919a;
        if (interfaceC13938g != null) {
            interfaceC13938g.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
        InterfaceC13938g interfaceC13938g = this.f39919a;
        if (interfaceC13938g != null) {
            interfaceC13938g.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onShowFail(C13154c c13154c, MBridgeIds mBridgeIds, String str) {
        InterfaceC13938g interfaceC13938g = this.f39919a;
        if (interfaceC13938g != null) {
            interfaceC13938g.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onVideoAdClicked(boolean z, MBridgeIds mBridgeIds) {
        InterfaceC13938g interfaceC13938g = this.f39919a;
        if (interfaceC13938g != null) {
            interfaceC13938g.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onVideoComplete(MBridgeIds mBridgeIds) {
        InterfaceC13938g interfaceC13938g = this.f39919a;
        if (interfaceC13938g != null) {
            interfaceC13938g.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        InterfaceC13938g interfaceC13938g = this.f39919a;
        if (interfaceC13938g != null) {
            interfaceC13938g.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        InterfaceC13938g interfaceC13938g = this.f39919a;
        if (interfaceC13938g != null) {
            interfaceC13938g.onVideoLoadSuccess(mBridgeIds);
        }
    }
}
