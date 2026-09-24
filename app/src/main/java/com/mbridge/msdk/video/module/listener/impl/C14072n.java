package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.signal.InterfaceC14199j;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.entity.C14216c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.n */
/* JADX INFO: compiled from: VideoViewJSListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14072n extends C14073o {

    /* JADX INFO: renamed from: A */
    private boolean f40573A;

    /* JADX INFO: renamed from: B */
    private int f40574B;

    /* JADX INFO: renamed from: C */
    private boolean f40575C;

    /* JADX INFO: renamed from: D */
    private MBridgeVideoView.InterfaceC14055u f40576D;

    /* JADX INFO: renamed from: x */
    private IJSFactory f40577x;

    /* JADX INFO: renamed from: y */
    private int f40578y;

    /* JADX INFO: renamed from: z */
    private boolean f40579z;

    public C14072n(IJSFactory iJSFactory, CampaignEx campaignEx, C14216c c14216c, C14202a c14202a, String str, String str2, int i, int i2, InterfaceC14058a interfaceC14058a, int i3, boolean z, int i4) {
        super(campaignEx, c14216c, c14202a, str, str2, interfaceC14058a, i3, z);
        this.f40579z = false;
        this.f40573A = false;
        this.f40575C = false;
        this.f40577x = iJSFactory;
        this.f40578y = i;
        this.f40579z = i2 == 0;
        this.f40574B = i4;
        if (iJSFactory == null) {
            this.f40543a = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0289  */
    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Code duplicated, block: B:106:0x029b  */
    /* JADX WARN: Code duplicated, block: B:114:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:97:0x025f  */
    /* JADX WARN: Code duplicated, block: B:99:0x026a  */
    @Override // com.mbridge.msdk.video.module.listener.impl.C14073o, com.mbridge.msdk.video.module.listener.impl.C14069k, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        int i2;
        int i3 = i;
        if (this.f40543a) {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.f40577x.getJSVideoModule().dismissAllAlert();
                    if (i3 == 2) {
                        this.f40577x.getJSNotifyProxy().mo42346a(2, "");
                    }
                    this.f40577x.getJSVideoModule().videoOperate(3);
                    if (this.f40577x.getJSCommon().mo42227i() != 2) {
                        if (this.f40544b.getVideo_end_type() != 3) {
                            this.f40577x.getJSVideoModule().setVisible(8);
                        } else {
                            this.f40577x.getJSVideoModule().setVisible(0);
                        }
                        if (this.f40578y == 2 || this.f40577x.getJSContainerModule().endCardShowing() || this.f40544b.getAdSpaceT() == 2) {
                            i3 = 16;
                        } else {
                            this.f40577x.getJSContainerModule().showEndcard(this.f40544b.getVideo_end_type());
                        }
                    } else {
                        i3 = 16;
                    }
                    this.f40577x.getJSNotifyProxy().mo42344a(1);
                } else if (i3 != 5) {
                    if (i3 == 6) {
                        this.f40577x.getJSVideoModule().dismissAllAlert();
                        if (i3 == 2) {
                            this.f40577x.getJSNotifyProxy().mo42346a(2, "");
                        }
                        this.f40577x.getJSVideoModule().videoOperate(3);
                        if (this.f40577x.getJSCommon().mo42227i() != 2) {
                            if (this.f40544b.getVideo_end_type() != 3) {
                                this.f40577x.getJSVideoModule().setVisible(8);
                            } else {
                                this.f40577x.getJSVideoModule().setVisible(0);
                            }
                            if (this.f40578y == 2) {
                                i3 = 16;
                            } else {
                                i3 = 16;
                            }
                        } else {
                            i3 = 16;
                        }
                        this.f40577x.getJSNotifyProxy().mo42344a(1);
                    } else if (i3 != 8) {
                        if (i3 != 20) {
                            if (i3 != 114) {
                                if (i3 != 116) {
                                    switch (i3) {
                                        case 10:
                                            this.f40575C = true;
                                            this.f40577x.getJSNotifyProxy().mo42344a(0);
                                            break;
                                        case 11:
                                        case 12:
                                            this.f40577x.getJSVideoModule().videoOperate(3);
                                            if (this.f40544b.getVideo_end_type() == 3) {
                                                this.f40577x.getJSVideoModule().setVisible(0);
                                            } else if (this.f40544b.getAdSpaceT() != 2) {
                                                this.f40577x.getJSVideoModule().setVisible(8);
                                            }
                                            if (i3 == 12) {
                                                m42183k();
                                                i2 = 2;
                                            } else {
                                                i2 = 1;
                                            }
                                            this.f40577x.getJSNotifyProxy().mo42344a(i2);
                                            if (this.f40577x.getJSCommon().mo42227i() == 2) {
                                                this.f40577x.getJSVideoModule().setVisible(0);
                                                InterfaceC14199j jSVideoModule = this.f40577x.getJSVideoModule();
                                                this.f40577x.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                            } else if (i3 == 12) {
                                                if (this.f40574B == 1) {
                                                    if (this.f40544b.getAdSpaceT() != 2) {
                                                        this.f40577x.getJSContainerModule().showEndcard(this.f40544b.getVideo_end_type());
                                                    } else {
                                                        this.f40577x.getJSContainerModule().showVideoEndCover();
                                                    }
                                                }
                                            } else if (this.f40544b.getAdSpaceT() != 2) {
                                                this.f40577x.getJSContainerModule().showEndcard(this.f40544b.getVideo_end_type());
                                            } else {
                                                this.f40577x.getJSContainerModule().showVideoEndCover();
                                            }
                                            this.f40577x.getJSVideoModule().dismissAllAlert();
                                            if (i3 == 12 && !this.f40575C && this.f40574B == 1) {
                                                m42183k();
                                                m42182j();
                                                m42180h();
                                                m42181i();
                                                if (C13223s0.m37831a().m37842a("i_l_s_t_r_i", false) && !this.f40573A) {
                                                    this.f40573A = true;
                                                    MBridgeVideoView.InterfaceC14055u interfaceC14055u = this.f40576D;
                                                    if (interfaceC14055u != null) {
                                                        interfaceC14055u.mo41597a();
                                                    }
                                                }
                                            }
                                            break;
                                        case 13:
                                            if (!this.f40577x.getJSVideoModule().isH5Canvas()) {
                                                this.f40577x.getJSVideoModule().closeVideoOperate(0, 2);
                                            }
                                            this.f40577x.getJSNotifyProxy().mo42344a(-1);
                                            break;
                                        case 14:
                                            if (!this.f40579z) {
                                                this.f40577x.getJSVideoModule().closeVideoOperate(0, 1);
                                            }
                                            break;
                                        case 15:
                                            if (obj != null && (obj instanceof MBridgeVideoView.C14056v)) {
                                                this.f40579z = true;
                                                this.f40577x.getJSNotifyProxy().mo42347a((MBridgeVideoView.C14056v) obj);
                                            }
                                            break;
                                        default:
                                            switch (i3) {
                                                case INVALID_RI_ENDPOINT_VALUE:
                                                case 124:
                                                    this.f40577x.getJSNotifyProxy().mo42346a(i3 == 123 ? 7 : 6, "");
                                                    break;
                                                case INVALID_METRICS_ENDPOINT_VALUE:
                                                    this.f40577x.getJSContainerModule().hideAlertWebview();
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    InterfaceC14199j jSVideoModule2 = this.f40577x.getJSVideoModule();
                                    this.f40577x.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                }
                            } else if (this.f40577x.getJSCommon().mo42227i() == 2) {
                                InterfaceC14199j jSVideoModule3 = this.f40577x.getJSVideoModule();
                                this.f40577x.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                            }
                        } else if (C13223s0.m37831a().m37842a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.InterfaceC14055u)) {
                            this.f40576D = (MBridgeVideoView.InterfaceC14055u) obj;
                        }
                    } else if (this.f40577x.getJSContainerModule().showAlertWebView()) {
                        this.f40577x.getJSVideoModule().alertWebViewShowed();
                    } else {
                        this.f40577x.getJSVideoModule().showAlertView();
                    }
                } else if (obj != null && (obj instanceof Integer)) {
                    Integer num = ((Integer) obj).intValue() == 1 ? 2 : 1;
                    this.f40577x.getJSVideoModule().soundOperate(num.intValue(), -1);
                    this.f40577x.getJSNotifyProxy().mo42346a(5, num + "");
                }
            } else if (!this.f40577x.getJSContainerModule().endCardShowing()) {
                this.f40577x.getJSNotifyProxy().mo42346a(1, obj != null ? obj.toString() : "");
            }
        }
        super.mo41600a(i3, obj);
    }
}
