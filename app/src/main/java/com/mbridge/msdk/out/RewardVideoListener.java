package com.mbridge.msdk.out;

import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g;

/* JADX INFO: loaded from: classes6.dex */
public interface RewardVideoListener extends InterfaceC13938g {
    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    void onAdShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    void onEndcardShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    void onLoadSuccess(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    void onShowFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    void onVideoAdClicked(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    void onVideoComplete(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    void onVideoLoadFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    void onVideoLoadSuccess(MBridgeIds mBridgeIds);
}
