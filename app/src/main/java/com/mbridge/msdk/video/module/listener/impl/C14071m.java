package com.mbridge.msdk.video.module.listener.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13937f;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.entity.C14216c;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.m */
/* JADX INFO: compiled from: VideoViewDefaultListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14071m extends C14073o {

    /* JADX INFO: renamed from: A */
    private Timer f40560A;

    /* JADX INFO: renamed from: B */
    private Handler f40561B;

    /* JADX INFO: renamed from: C */
    private boolean f40562C;

    /* JADX INFO: renamed from: D */
    private boolean f40563D;

    /* JADX INFO: renamed from: E */
    private boolean f40564E;

    /* JADX INFO: renamed from: F */
    private int f40565F;

    /* JADX INFO: renamed from: G */
    private int f40566G;

    /* JADX INFO: renamed from: H */
    private MBridgeVideoView.InterfaceC14055u f40567H;

    /* JADX INFO: renamed from: x */
    private MBridgeVideoView f40568x;

    /* JADX INFO: renamed from: y */
    private MBridgeContainerView f40569y;

    /* JADX INFO: renamed from: z */
    private int f40570z;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.m$a */
    /* JADX INFO: compiled from: VideoViewDefaultListener.java */
    class a extends TimerTask {

        /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: VideoViewDefaultListener.java */
        class RunnableC15568a implements Runnable {
            RunnableC15568a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C14071m.this.f40569y.showVideoClickView(-1);
                C14071m.this.f40568x.soundOperate(0, 2);
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                C14071m.this.f40561B.post(new RunnableC15568a());
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    public C14071m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C14216c c14216c, C14202a c14202a, String str, String str2, int i, int i2, InterfaceC14058a interfaceC14058a, int i3, boolean z, int i4) {
        super(campaignEx, c14216c, c14202a, str, str2, interfaceC14058a, i3, z);
        this.f40561B = new Handler();
        this.f40562C = false;
        this.f40563D = false;
        this.f40564E = false;
        this.f40568x = mBridgeVideoView;
        this.f40569y = mBridgeContainerView;
        this.f40566G = i;
        this.f40570z = i2;
        this.f40565F = i4;
        if (mBridgeVideoView != null) {
            this.f40562C = mBridgeVideoView.getVideoSkipTime() == 0;
        }
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f40543a = false;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m42186a(int i, int i2) {
        CampaignEx campaignEx;
        if (this.f40562C || this.f40568x == null || (campaignEx = this.f40544b) == null) {
            return;
        }
        int i3 = this.f40570z;
        int i4 = (i3 < 0 || i < i3) ? 1 : 2;
        if (i4 != 2 && (campaignEx.getVideoCompleteTime() != 0 ? i > this.f40544b.getVideoCompleteTime() : this.f40568x.mCurrPlayNum > 1)) {
            i4 = 2;
        }
        if (i4 != 2 && this.f40568x.mCurrPlayNum > 1 && i == i2) {
            i4 = 2;
        }
        if (i4 == 2) {
            this.f40568x.closeVideoOperate(0, i4);
            this.f40562C = true;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m42189n() {
        try {
            Timer timer = this.f40560A;
            if (timer != null) {
                timer.cancel();
                this.f40560A = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o */
    private void m42190o() {
        if (!this.f40563D && this.f40565F == 1) {
            m42182j();
            m42180h();
            m42181i();
            if (C13223s0.m37831a().m37842a("i_l_s_t_r_i", false) && !this.f40564E) {
                this.f40564E = true;
                MBridgeVideoView.InterfaceC14055u interfaceC14055u = this.f40567H;
                if (interfaceC14055u != null) {
                    interfaceC14055u.mo41597a();
                }
            }
        }
        if (this.f40544b.getAdSpaceT() != 2) {
            this.f40569y.showEndcard(this.f40544b.getVideo_end_type());
        } else {
            this.f40569y.showVideoEndCover();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX INFO: renamed from: p */
    private void m42191p() {
        CampaignEx campaignEx;
        CampaignEx campaignEx2 = this.f40544b;
        if (campaignEx2 == null || campaignEx2.getDynamicTempCode() != 5) {
            return;
        }
        MBridgeVideoView mBridgeVideoView = this.f40568x;
        if (mBridgeVideoView == null || mBridgeVideoView.mCampOrderViewData == null) {
            campaignEx = null;
        } else {
            int i = 0;
            for (int i2 = 0; i2 < this.f40568x.mCampOrderViewData.size(); i2++) {
                if (this.f40568x.mCampOrderViewData.get(i2) != null && this.f40568x.mCampOrderViewData.get(i2).getId() == this.f40544b.getId()) {
                    i = i2 - 1;
                    break;
                }
            }
            if (i < 0 || this.f40568x.mCampOrderViewData.get(i) == null) {
                campaignEx = null;
            } else {
                campaignEx = this.f40568x.mCampOrderViewData.get(i);
            }
        }
        if (campaignEx != null) {
            MBridgeVideoView mBridgeVideoView2 = this.f40568x;
            if (mBridgeVideoView2 != null) {
                mBridgeVideoView2.setCampaign(campaignEx);
            }
            MBridgeContainerView mBridgeContainerView = this.f40569y;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setCampaign(campaignEx);
            }
            m42171a(campaignEx);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m42192q() {
        try {
            m42189n();
            this.f40560A = new Timer();
            this.f40560A.schedule(new a(), 3000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0210  */
    /* JADX WARN: Code duplicated, block: B:111:0x0228  */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:114:0x0237  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:161:0x0301  */
    /* JADX WARN: Code duplicated, block: B:167:0x031e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0321  */
    /* JADX WARN: Code duplicated, block: B:170:0x0328  */
    @Override // com.mbridge.msdk.video.module.listener.impl.C14073o, com.mbridge.msdk.video.module.listener.impl.C14069k, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        CampaignEx campaignEx;
        CampaignEx campaignEx2;
        int bufferTimeout;
        String playURL;
        int i2;
        if (this.f40543a) {
            if (i != 1) {
                if (i == 2) {
                    this.f40568x.dismissAllAlert();
                    this.f40568x.videoOperate(3);
                    campaignEx = this.f40544b;
                    if (campaignEx == null && campaignEx.isDynamicView() && this.f40544b.getDynamicTempCode() == 5) {
                        if (this.f40569y != null) {
                            MBridgeVideoView mBridgeVideoView = this.f40568x;
                            if (mBridgeVideoView.mCurrPlayNum == mBridgeVideoView.mCampaignSize) {
                                if (this.f40544b.getAdSpaceT() == 2) {
                                    i = 16;
                                } else {
                                    this.f40569y.setRewardStatus(true);
                                    this.f40569y.showOrderCampView();
                                }
                            }
                        }
                        C13937f.m41694a(this.f40544b, this.f40549g, this.f40568x.mCurrentPlayProgressTime);
                        if (this.f40563D) {
                            m42183k();
                            if (this.f40565F == 1) {
                                m42190o();
                            }
                            i = 12;
                        } else if (this.f40566G == 2) {
                            i = 16;
                        } else {
                            i = 16;
                        }
                    } else if (this.f40563D) {
                        m42183k();
                        if (this.f40565F == 1) {
                            m42190o();
                        }
                        i = 12;
                    } else if (this.f40566G == 2 || this.f40569y.endCardShowing() || this.f40544b.getAdSpaceT() == 2) {
                        i = 16;
                    } else {
                        this.f40569y.showEndcard(this.f40544b.getVideo_end_type());
                    }
                } else if (i != 5) {
                    if (i == 6) {
                        this.f40568x.dismissAllAlert();
                        this.f40568x.videoOperate(3);
                        campaignEx = this.f40544b;
                        if (campaignEx == null) {
                            if (this.f40563D) {
                                m42183k();
                                if (this.f40565F == 1) {
                                    m42190o();
                                }
                                i = 12;
                            } else if (this.f40566G == 2) {
                                i = 16;
                            } else {
                                i = 16;
                            }
                        } else if (this.f40563D) {
                            m42183k();
                            if (this.f40565F == 1) {
                                m42190o();
                            }
                            i = 12;
                        } else if (this.f40566G == 2) {
                            i = 16;
                        } else {
                            i = 16;
                        }
                    } else if (i == 8) {
                        MBridgeContainerView mBridgeContainerView = this.f40569y;
                        if (mBridgeContainerView == null) {
                            MBridgeVideoView mBridgeVideoView2 = this.f40568x;
                            if (mBridgeVideoView2 != null) {
                                mBridgeVideoView2.showAlertView();
                            }
                        } else if (mBridgeContainerView.showAlertWebView()) {
                            MBridgeVideoView mBridgeVideoView3 = this.f40568x;
                            if (mBridgeVideoView3 != null) {
                                mBridgeVideoView3.alertWebViewShowed();
                            }
                        } else {
                            MBridgeVideoView mBridgeVideoView4 = this.f40568x;
                            if (mBridgeVideoView4 != null) {
                                mBridgeVideoView4.showAlertView();
                            }
                        }
                    } else if (i != 20) {
                        switch (i) {
                            case 10:
                                this.f40563D = true;
                                this.f40568x.soundOperate(0, 2);
                                this.f40568x.progressOperate(0, 2);
                                break;
                            case 11:
                                this.f40568x.videoOperate(3);
                                this.f40568x.dismissAllAlert();
                                CampaignEx campaignEx3 = this.f40544b;
                                if (campaignEx3 == null || campaignEx3.getVideo_end_type() == 3 || this.f40544b.getRewardTemplateMode() == null || this.f40544b.getRewardTemplateMode().m36782k() == 5002010) {
                                    this.f40568x.setVisibility(0);
                                } else if (this.f40544b.getAdSpaceT() != 2) {
                                    this.f40568x.setVisibility(8);
                                }
                                CampaignEx campaignEx4 = this.f40544b;
                                if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5) {
                                    MBridgeVideoView mBridgeVideoView5 = this.f40568x;
                                    if (mBridgeVideoView5.mCurrPlayNum != mBridgeVideoView5.mCampaignSize) {
                                        campaignEx2 = this.f40544b;
                                        if (campaignEx2 == null) {
                                            if (this.f40544b.getAdSpaceT() != 2) {
                                                this.f40569y.showEndcard(this.f40544b.getVideo_end_type());
                                            } else {
                                                this.f40569y.showVideoEndCover();
                                            }
                                        } else if (this.f40544b.getAdSpaceT() != 2) {
                                            this.f40569y.showEndcard(this.f40544b.getVideo_end_type());
                                        } else {
                                            this.f40569y.showVideoEndCover();
                                        }
                                    } else {
                                        MBridgeContainerView mBridgeContainerView2 = this.f40569y;
                                        if (mBridgeContainerView2 != null) {
                                            mBridgeContainerView2.setRewardStatus(true);
                                            this.f40569y.showOrderCampView();
                                        }
                                    }
                                } else {
                                    campaignEx2 = this.f40544b;
                                    if (campaignEx2 == null || campaignEx2.getRewardTemplateMode() == null || this.f40544b.getRewardTemplateMode().m36782k() != 5002010) {
                                        if (this.f40544b.getAdSpaceT() != 2) {
                                            this.f40569y.showEndcard(this.f40544b.getVideo_end_type());
                                        } else {
                                            this.f40569y.showVideoEndCover();
                                        }
                                    }
                                }
                                break;
                            case 12:
                                m42183k();
                                this.f40568x.videoOperate(3);
                                this.f40568x.dismissAllAlert();
                                if (this.f40544b.getVideo_end_type() != 3) {
                                    this.f40568x.setVisibility(8);
                                } else {
                                    this.f40568x.setVisibility(0);
                                }
                                if (this.f40563D || this.f40565F != 0) {
                                    if (this.f40544b.isDynamicView() && this.f40544b.getDynamicTempCode() == 5 && TextUtils.isEmpty(this.f40544b.getendcard_url())) {
                                        m42191p();
                                        this.f40565F = 0;
                                    }
                                    m42190o();
                                }
                                break;
                            case 13:
                                MBridgeVideoView mBridgeVideoView6 = this.f40568x;
                                if (mBridgeVideoView6 != null) {
                                    mBridgeVideoView6.closeVideoOperate(0, 2);
                                    playURL = this.f40568x.getPlayURL();
                                    bufferTimeout = this.f40568x.getBufferTimeout();
                                } else {
                                    bufferTimeout = -1;
                                    playURL = "";
                                }
                                CampaignEx campaignEx5 = this.f40544b;
                                String videoUrlEncode = campaignEx5 != null ? campaignEx5.getVideoUrlEncode() : "";
                                C13157e c13157e = new C13157e();
                                c13157e.m37501a("play_url", playURL);
                                c13157e.m37501a("video_url", videoUrlEncode);
                                c13157e.m37501a("timeout", Integer.valueOf(bufferTimeout));
                                C13156d.m37475b().m37483a("m_video_buffer_timeout", this.f40544b, c13157e);
                                break;
                            case 14:
                                if (!this.f40562C) {
                                    this.f40568x.closeVideoOperate(0, 1);
                                }
                                break;
                            case 15:
                                if (obj != null && (obj instanceof MBridgeVideoView.C14056v)) {
                                    MBridgeVideoView.C14056v c14056v = (MBridgeVideoView.C14056v) obj;
                                    int videoInteractiveType = this.f40569y.getVideoInteractiveType();
                                    if (this.f40544b.getAdSpaceT() == 2) {
                                        SoundImageView soundImageView = this.f40568x.mSoundImageView;
                                        if (soundImageView != null && (soundImageView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40568x.mSoundImageView.getLayoutParams();
                                            layoutParams.setMargins(C13229v0.m37876a(C13008c.m36588n().m36542d(), 5.0f), 0, 0, C13229v0.m37876a(C13008c.m36588n().m36542d(), 85.0f));
                                            this.f40568x.mSoundImageView.setLayoutParams(layoutParams);
                                        }
                                        TextView textView = this.f40568x.tvFlag;
                                        if (textView != null && (textView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f40568x.tvFlag.getLayoutParams();
                                            layoutParams2.setMargins(C13229v0.m37876a(C13008c.m36588n().m36542d(), 5.0f), 0, 0, C13229v0.m37876a(C13008c.m36588n().m36542d(), 85.0f));
                                            this.f40568x.tvFlag.setVisibility(0);
                                            this.f40568x.tvFlag.setLayoutParams(layoutParams2);
                                        }
                                        this.f40569y.showVideoClickView(1);
                                    } else if (videoInteractiveType >= 0 && c14056v.f40511a >= videoInteractiveType) {
                                        this.f40569y.showVideoClickView(1);
                                        this.f40568x.soundOperate(0, 1);
                                    }
                                    this.f40562C = c14056v.f40513c;
                                    if (this.f40544b.getDynamicTempCode() != 5) {
                                        int i3 = this.f40570z;
                                        if (((i3 >= 0 && ((i2 = c14056v.f40511a) >= i3 || i2 == c14056v.f40512b)) || (this.f40544b.getVideoCompleteTime() > 0 && (c14056v.f40511a > this.f40544b.getVideoCompleteTime() || c14056v.f40511a == c14056v.f40512b))) && !this.f40562C) {
                                            this.f40568x.closeVideoOperate(0, 2);
                                            this.f40562C = true;
                                        }
                                    } else {
                                        m42186a(c14056v.f40511a, c14056v.f40512b);
                                    }
                                }
                                break;
                        }
                    } else if (C13223s0.m37831a().m37842a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.InterfaceC14055u)) {
                        this.f40567H = (MBridgeVideoView.InterfaceC14055u) obj;
                    }
                } else if (obj != null && (obj instanceof Integer)) {
                    this.f40568x.soundOperate((((Integer) obj).intValue() == 1 ? 2 : 1).intValue(), -1);
                }
            } else if (!this.f40569y.endCardShowing()) {
                int videoInteractiveType2 = this.f40569y.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.f40569y.isLast()) {
                            this.f40569y.showVideoClickView(1);
                            this.f40568x.soundOperate(0, 1);
                            m42192q();
                        } else {
                            this.f40569y.showVideoClickView(-1);
                            this.f40568x.soundOperate(0, 2);
                            m42189n();
                        }
                    }
                } else if (this.f40569y.miniCardLoaded()) {
                    this.f40569y.showVideoClickView(2);
                }
            }
        }
        super.mo41600a(i, obj);
    }
}
