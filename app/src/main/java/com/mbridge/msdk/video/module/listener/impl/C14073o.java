package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.module.report.C14075b;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.entity.C14216c;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.o */
/* JADX INFO: compiled from: VideoViewStatisticsListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14073o extends C14069k {

    /* JADX INFO: renamed from: n */
    private boolean f40580n;

    /* JADX INFO: renamed from: o */
    private boolean f40581o;

    /* JADX INFO: renamed from: p */
    private boolean f40582p;

    /* JADX INFO: renamed from: q */
    private boolean f40583q;

    /* JADX INFO: renamed from: r */
    private boolean f40584r;

    /* JADX INFO: renamed from: s */
    private boolean f40585s;

    /* JADX INFO: renamed from: t */
    protected int f40586t;

    /* JADX INFO: renamed from: u */
    private Map<Integer, String> f40587u;

    /* JADX INFO: renamed from: v */
    private MBridgeVideoView.InterfaceC14055u f40588v;

    /* JADX INFO: renamed from: w */
    private int f40589w;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.o$a */
    /* JADX INFO: compiled from: VideoViewStatisticsListener.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40590a;

        a(Object obj) {
            this.f40590a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f40590a;
            if (obj instanceof String) {
                C14073o.this.m42176b((String) obj);
            }
        }
    }

    public C14073o(CampaignEx campaignEx, C14216c c14216c, C14202a c14202a, String str, String str2, InterfaceC14058a interfaceC14058a, int i, boolean z) {
        super(campaignEx, c14202a, c14216c, str, str2, interfaceC14058a, i, z);
        this.f40585s = false;
        this.f40586t = 0;
        this.f40589w = -1;
        if (this.f40543a) {
            this.f40587u = campaignEx.getAdvImpList();
        }
        this.f40586t = campaignEx.getVideoCompleteTime();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0147 A[Catch: all -> 0x0167, TryCatch #0 {all -> 0x0167, blocks: (B:18:0x0026, B:19:0x002e, B:21:0x003d, B:23:0x0048, B:22:0x0045, B:24:0x0059, B:80:0x0161, B:25:0x0061, B:27:0x0074, B:29:0x0078, B:31:0x007e, B:33:0x0083, B:35:0x0087, B:38:0x0098, B:40:0x009c, B:41:0x00a0, B:43:0x00bc, B:44:0x00c5, B:46:0x00c9, B:51:0x00d1, B:52:0x00d5, B:53:0x00e8, B:56:0x00ee, B:58:0x00f2, B:60:0x00fb, B:62:0x00ff, B:64:0x0111, B:66:0x0115, B:67:0x0125, B:69:0x0129, B:70:0x0133, B:72:0x013d, B:74:0x0141, B:75:0x0147, B:77:0x014b, B:79:0x014f), top: B:85:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x014b A[Catch: all -> 0x0167, TryCatch #0 {all -> 0x0167, blocks: (B:18:0x0026, B:19:0x002e, B:21:0x003d, B:23:0x0048, B:22:0x0045, B:24:0x0059, B:80:0x0161, B:25:0x0061, B:27:0x0074, B:29:0x0078, B:31:0x007e, B:33:0x0083, B:35:0x0087, B:38:0x0098, B:40:0x009c, B:41:0x00a0, B:43:0x00bc, B:44:0x00c5, B:46:0x00c9, B:51:0x00d1, B:52:0x00d5, B:53:0x00e8, B:56:0x00ee, B:58:0x00f2, B:60:0x00fb, B:62:0x00ff, B:64:0x0111, B:66:0x0115, B:67:0x0125, B:69:0x0129, B:70:0x0133, B:72:0x013d, B:74:0x0141, B:75:0x0147, B:77:0x014b, B:79:0x014f), top: B:85:0x0006 }] */
    @Override // com.mbridge.msdk.video.module.listener.impl.C14069k, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        int i2;
        CampaignEx campaignEx;
        try {
            if (i != 2) {
                int videoLength = 0;
                if (i != 20) {
                    if (i != 130) {
                        if (i == 6) {
                            if (this.f40543a && !this.f40582p) {
                                this.f40582p = true;
                                m42184l();
                                C14075b.m42202b(C13008c.m36588n().m36542d(), this.f40544b);
                            }
                        } else if (i != 7) {
                            if (i == 15) {
                                m42182j();
                                m42180h();
                                m42181i();
                                if (C13223s0.m37831a().m37842a("i_l_s_t_r_i", false) && !this.f40583q) {
                                    this.f40583q = true;
                                    MBridgeVideoView.InterfaceC14055u interfaceC14055u = this.f40588v;
                                    if (interfaceC14055u != null) {
                                        interfaceC14055u.mo41597a();
                                    }
                                }
                                if (obj == null || !(obj instanceof MBridgeVideoView.C14056v)) {
                                    i2 = 0;
                                } else {
                                    int i3 = ((MBridgeVideoView.C14056v) obj).f40511a;
                                    videoLength = ((MBridgeVideoView.C14056v) obj).f40512b;
                                    i2 = i3;
                                }
                                if (videoLength == 0 && (campaignEx = this.f40544b) != null) {
                                    videoLength = campaignEx.getVideoLength();
                                }
                                C14075b.m42197a(C13008c.m36588n().m36542d(), this.f40544b, i2, videoLength, this.f40552j);
                                C14075b.m42200a(this.f40544b, this.f40587u, this.f40549g, i2);
                                if (!this.f40584r) {
                                    this.f40584r = true;
                                    C14075b.m42199a(this.f40544b, this.f40549g);
                                }
                                if (!this.f40585s) {
                                    int i4 = this.f40586t;
                                    if (i4 != 0) {
                                        videoLength = i4;
                                    }
                                    if (i2 >= videoLength) {
                                        this.f40585s = true;
                                        i = 17;
                                    }
                                }
                                C13219q0.m37816b("NotifyListener", "onPlayProgress:" + i2);
                                this.f40589w = i2;
                            } else if (i != 16) {
                                switch (i) {
                                    case 11:
                                        m42168a();
                                        m42184l();
                                        break;
                                    case 12:
                                        a aVar = new a(obj);
                                        if (C13009d.m36589a().m36605e()) {
                                            C13167a.m37543b().execute(aVar);
                                        } else {
                                            aVar.run();
                                        }
                                        m42184l();
                                        m42177c();
                                        m42174b();
                                        m42178e();
                                        m42168a();
                                        break;
                                    case 13:
                                        m42177c();
                                        m42174b();
                                        break;
                                }
                            } else if (this.f40543a) {
                                this.f40582p = true;
                                m42184l();
                                C14075b.m42202b(C13008c.m36588n().m36542d(), this.f40544b);
                            }
                        } else if (this.f40543a && obj != null && (obj instanceof Integer)) {
                            int iIntValue = ((Integer) obj).intValue();
                            if (iIntValue == 2) {
                                if (!this.f40581o) {
                                    this.f40581o = true;
                                    C14075b.m42205e(C13008c.m36588n().m36542d(), this.f40544b);
                                }
                            } else if (iIntValue == 1 && !this.f40580n) {
                                this.f40580n = true;
                                C14075b.m42206f(C13008c.m36588n().m36542d(), this.f40544b);
                            }
                        }
                    } else if (obj instanceof Integer) {
                        this.f40586t = ((Integer) obj).intValue();
                    }
                } else if (C13223s0.m37831a().m37842a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.InterfaceC14055u)) {
                    this.f40588v = (MBridgeVideoView.InterfaceC14055u) obj;
                }
            } else if (this.f40543a) {
                this.f40582p = true;
                m42184l();
                C14075b.m42202b(C13008c.m36588n().m36542d(), this.f40544b);
            }
            this.f40551i.mo41600a(i, obj);
        } catch (Throwable th) {
            C13219q0.m37817b("NotifyListener", th.getMessage(), th);
        }
    }
}
