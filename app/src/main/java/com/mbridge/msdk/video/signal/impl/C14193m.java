package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.video.module.MBridgeContainerView;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.m */
/* JADX INFO: compiled from: JSContainerModule.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14193m extends C14185e {

    /* JADX INFO: renamed from: a */
    private MBridgeContainerView f40950a;

    public C14193m(MBridgeContainerView mBridgeContainerView) {
        this.f40950a = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public void configurationChanged(int i, int i2, int i3) {
        super.configurationChanged(i, i2, i3);
        try {
            MBridgeContainerView mBridgeContainerView = this.f40950a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.configurationChanged(i, i2, i3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public boolean endCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f40950a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.endCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public void hideAlertWebview() {
        super.hideAlertWebview();
        MBridgeContainerView mBridgeContainerView = this.f40950a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.hideAlertWebview();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        MBridgeContainerView mBridgeContainerView = this.f40950a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public boolean miniCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f40950a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.miniCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public void readyStatus(int i) {
        try {
            MBridgeContainerView mBridgeContainerView = this.f40950a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.readyStatus(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.readyStatus(i);
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public void resizeMiniCard(int i, int i2, int i3) {
        super.resizeMiniCard(i, i2, i3);
        try {
            MBridgeContainerView mBridgeContainerView = this.f40950a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.resizeMiniCard(i, i2, i3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public boolean showAlertWebView() {
        super.showAlertWebView();
        MBridgeContainerView mBridgeContainerView = this.f40950a;
        if (mBridgeContainerView != null) {
            return mBridgeContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showEndcard(int i) {
        super.showEndcard(i);
        try {
            MBridgeContainerView mBridgeContainerView = this.f40950a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showEndcard(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        super.showMiniCard(i, i2, i3, i4, i5);
        try {
            MBridgeContainerView mBridgeContainerView = this.f40950a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showMiniCard(i, i2, i3, i4, i5);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showVideoClickView(int i) {
        super.showVideoClickView(i);
        MBridgeContainerView mBridgeContainerView = this.f40950a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.showVideoClickView(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14185e, com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showVideoEndCover() {
        super.showVideoEndCover();
        try {
            MBridgeContainerView mBridgeContainerView = this.f40950a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showVideoEndCover();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
