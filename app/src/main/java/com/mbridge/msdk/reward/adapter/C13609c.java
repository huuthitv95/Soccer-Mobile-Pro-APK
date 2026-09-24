package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkRequest;
import bolts.MeasurementEvent;
import com.mbridge.msdk.C12681b;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.cache.C12999a;
import com.mbridge.msdk.foundation.cache.C13001c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.C13070d;
import com.mbridge.msdk.foundation.entity.C13073g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.error.C13081a;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.p289db.C13012b;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13019i;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.utils.C13120c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C13384a;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.candidate.C13612a;
import com.mbridge.msdk.reward.controller.C13613a;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.reward.report.C13623a;
import com.mbridge.msdk.reward.report.metrics.C13624a;
import com.mbridge.msdk.reward.request.AbstractC13625a;
import com.mbridge.msdk.reward.request.C13626b;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.util.C13645a;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.util.C13887e;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h;
import com.mbridge.msdk.videocommon.C14200a;
import com.mbridge.msdk.videocommon.cache.C14201a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.download.C14211j;
import com.mbridge.msdk.videocommon.setting.C14223c;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c */
/* JADX INFO: compiled from: RewardMVVideoAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13609c {

    /* JADX INFO: renamed from: C */
    private String f37598C;

    /* JADX INFO: renamed from: D */
    private h f37599D;

    /* JADX INFO: renamed from: K */
    public String f37606K;

    /* JADX INFO: renamed from: V */
    private List<CampaignEx> f37617V;

    /* JADX INFO: renamed from: W */
    private CopyOnWriteArrayList<CampaignEx> f37618W;

    /* JADX INFO: renamed from: X */
    private List<CampaignEx> f37619X;

    /* JADX INFO: renamed from: a */
    private Context f37620a;

    /* JADX INFO: renamed from: b */
    private String f37621b;

    /* JADX INFO: renamed from: c */
    private String f37622c;

    /* JADX INFO: renamed from: d */
    private int f37623d;

    /* JADX INFO: renamed from: e */
    private int f37624e;

    /* JADX INFO: renamed from: f */
    private int f37625f;

    /* JADX INFO: renamed from: g */
    private boolean f37626g;

    /* JADX INFO: renamed from: h */
    private String f37627h;

    /* JADX INFO: renamed from: i */
    private InterfaceC13939h f37628i;

    /* JADX INFO: renamed from: j */
    private volatile InterfaceC13607a f37629j;

    /* JADX INFO: renamed from: k */
    private volatile C13613a.j f37630k;

    /* JADX INFO: renamed from: l */
    private C14223c f37631l;

    /* JADX INFO: renamed from: r */
    private boolean f37637r;

    /* JADX INFO: renamed from: s */
    private boolean f37638s;

    /* JADX INFO: renamed from: u */
    private String f37640u;

    /* JADX INFO: renamed from: v */
    private int f37641v;

    /* JADX INFO: renamed from: w */
    private int f37642w;

    /* JADX INFO: renamed from: x */
    private int f37643x;

    /* JADX INFO: renamed from: y */
    private CampaignUnit f37644y;

    /* JADX INFO: renamed from: z */
    private CopyOnWriteArrayList<CampaignEx> f37645z;

    /* JADX INFO: renamed from: m */
    private boolean f37632m = false;

    /* JADX INFO: renamed from: n */
    private boolean f37633n = false;

    /* JADX INFO: renamed from: o */
    public Object f37634o = new Object();

    /* JADX INFO: renamed from: p */
    private CopyOnWriteArrayList<CampaignEx> f37635p = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: q */
    private int f37636q = 2;

    /* JADX INFO: renamed from: t */
    private String f37639t = "";

    /* JADX INFO: renamed from: A */
    private boolean f37596A = false;

    /* JADX INFO: renamed from: B */
    private long f37597B = 0;

    /* JADX INFO: renamed from: E */
    private boolean f37600E = false;

    /* JADX INFO: renamed from: F */
    private boolean f37601F = false;

    /* JADX INFO: renamed from: G */
    public String f37602G = "";

    /* JADX INFO: renamed from: H */
    public String f37603H = "";

    /* JADX INFO: renamed from: I */
    public String f37604I = "";

    /* JADX INFO: renamed from: J */
    public int f37605J = 0;

    /* JADX INFO: renamed from: L */
    private Handler f37607L = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: M */
    private boolean f37608M = false;

    /* JADX INFO: renamed from: N */
    private long f37609N = 0;

    /* JADX INFO: renamed from: O */
    volatile boolean f37610O = false;

    /* JADX INFO: renamed from: P */
    volatile boolean f37611P = false;

    /* JADX INFO: renamed from: Q */
    volatile boolean f37612Q = false;

    /* JADX INFO: renamed from: R */
    volatile boolean f37613R = false;

    /* JADX INFO: renamed from: S */
    volatile boolean f37614S = false;

    /* JADX INFO: renamed from: T */
    public volatile boolean f37615T = false;

    /* JADX INFO: renamed from: U */
    private String f37616U = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$a */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:87:0x022b  */
        /* JADX WARN: Code duplicated, block: B:88:0x022d  */
        /* JADX WARN: Code duplicated, block: B:92:0x025d  */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CampaignEx campaignEx;
            C13082b c13082bM37011a;
            boolean z;
            C13154c c13154cM39036a = C13609c.this.m39036a(message);
            try {
                try {
                    int i = message.what;
                    if (i == 8) {
                        if (C13609c.this.f37629j == null || (campaignEx = (CampaignEx) message.obj) == null || TextUtils.isEmpty(C13609c.this.f37621b)) {
                            return;
                        }
                        C13623a.m39349a(C13609c.this.f37620a, campaignEx, C13609c.this.f37621b);
                        C13609c.this.m39138l();
                        return;
                    }
                    if (i == 18) {
                        if (C13609c.this.f37630k != null) {
                            C13609c.this.f37630k.m39298a(C13609c.this.f37598C, c13154cM39036a);
                            return;
                        }
                        return;
                    }
                    switch (i) {
                        case 1:
                        case 2:
                            C13609c.this.m39114a((String) message.obj, c13154cM39036a);
                            break;
                        case 3:
                            if (C13609c.this.f37629j != null) {
                                C13609c.this.f37629j.mo38980a("campaign is ok", c13154cM39036a);
                            }
                            Message message2 = new Message();
                            message2.what = 5;
                            if (c13154cM39036a != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("metrics_data_lrid", c13154cM39036a.m37463t());
                                message2.setData(bundle);
                            }
                            sendMessageDelayed(message2, C13088a.f35846L);
                            break;
                        case 4:
                            if (C13609c.this.f37629j != null) {
                                C13609c c13609c = C13609c.this;
                                c13609c.m39062a(c13609c.f37621b, (List<CampaignEx>) C13609c.this.f37617V, C13609c.this.f37638s, "");
                                try {
                                    C13082b c13082bM37011a2 = C13081a.m37011a(880002, "unknow error in load failed");
                                    Object obj = message.obj;
                                    if (obj == null) {
                                        if (C13609c.this.f37607L != null) {
                                            C13609c.this.f37607L.removeMessages(5);
                                        }
                                        removeMessages(6);
                                        C13219q0.m37813a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================00000");
                                        if (!C13609c.this.f37614S) {
                                            C13609c.this.f37614S = false;
                                            c13082bM37011a = C13081a.m37011a(880002, "errorCode: 3506 errorMessage: data load failed");
                                            c13082bM37011a2 = c13082bM37011a;
                                        }
                                    } else {
                                        String str = (String) obj;
                                        int i2 = message.arg1;
                                        if (TextUtils.isEmpty(str)) {
                                            if (C13609c.this.f37607L != null) {
                                                C13609c.this.f37607L.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            C13219q0.m37813a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================11111");
                                            if (!C13609c.this.f37614S) {
                                                C13609c.this.f37614S = false;
                                                c13082bM37011a = C13081a.m37011a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg null");
                                            }
                                        } else {
                                            if (C13609c.this.f37607L != null) {
                                                C13609c.this.f37607L.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            if (i2 == 880021) {
                                                c13082bM37011a = C13081a.m37011a(880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is APP ALREADY INSTALLED");
                                            } else if (i2 == 880003 || i2 == 6 || i2 == 7) {
                                                c13082bM37011a = C13081a.m37011a(880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + str);
                                            } else {
                                                c13082bM37011a = C13081a.m37011a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + str);
                                            }
                                        }
                                        c13082bM37011a2 = c13082bM37011a;
                                    }
                                    C13609c.this.f37614S = false;
                                    if (c13154cM39036a != null) {
                                        c13154cM39036a.m37429b(C13609c.this.f37617V);
                                        if (c13154cM39036a.m37464u() == null) {
                                            c13154cM39036a.m37422a(c13082bM37011a2);
                                        } else {
                                            c13082bM37011a2 = c13154cM39036a.m37464u();
                                        }
                                    }
                                    C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, c13082bM37011a2, c13154cM39036a);
                                } catch (Exception e) {
                                    if (C13609c.this.f37607L != null) {
                                        C13609c.this.f37607L.removeMessages(5);
                                    }
                                    removeMessages(6);
                                    C13609c c13609c2 = C13609c.this;
                                    c13609c2.m39062a(c13609c2.f37621b, (List<CampaignEx>) C13609c.this.f37617V, C13609c.this.f37638s, "");
                                    C13082b c13082bM37011a3 = C13081a.m37011a(880002, "errorCode: 3508 errorMessage: data load failed, exception is: " + e.getMessage());
                                    if (c13154cM39036a != null) {
                                        c13154cM39036a.m37429b(C13609c.this.f37617V);
                                        c13154cM39036a.m37422a(c13082bM37011a3);
                                    }
                                    C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, c13082bM37011a3, c13154cM39036a);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (C13609c.this.f37629j != null) {
                                if (C13609c.this.f37617V != null && C13609c.this.f37617V.size() > 0) {
                                    CampaignEx campaignEx2 = (CampaignEx) C13609c.this.f37617V.get(0);
                                    boolean z2 = !TextUtils.isEmpty(campaignEx2.getCMPTEntryUrl());
                                    int nscpt = campaignEx2.getNscpt();
                                    C13609c c13609c3 = C13609c.this;
                                    if (c13609c3.m39122a((List<CampaignEx>) c13609c3.f37645z, z2, nscpt, true, false)) {
                                        C13609c c13609c4 = C13609c.this;
                                        c13609c4.m39061a(c13609c4.f37621b, (List<CampaignEx>) C13609c.this.f37617V, (List<CampaignEx>) C13609c.this.f37619X, C13609c.this.f37638s);
                                        sendEmptyMessage(6);
                                        removeMessages(5);
                                        if (!C13609c.this.f37613R) {
                                            C13609c.this.f37613R = true;
                                            C13609c.this.f37629j.mo38982a(C13609c.this.f37645z, c13154cM39036a);
                                        }
                                    }
                                }
                                C13609c c13609c5 = C13609c.this;
                                c13609c5.m39062a(c13609c5.f37621b, (List<CampaignEx>) C13609c.this.f37617V, C13609c.this.f37638s, "");
                                if (C13609c.this.f37607L != null) {
                                    C13609c.this.f37607L.removeMessages(5);
                                    C13609c.this.f37607L.removeMessages(6);
                                }
                                CampaignEx campaignEx3 = (C13609c.this.f37617V == null || C13609c.this.f37617V.size() <= 0) ? null : (CampaignEx) C13609c.this.f37617V.get(0);
                                if (campaignEx3 == null && C13609c.this.f37618W != null && C13609c.this.f37618W.size() > 0) {
                                    campaignEx3 = (CampaignEx) C13609c.this.f37618W.get(0);
                                }
                                if (!C13609c.this.f37614S || (C13609c.this.f37615T && campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getNLRid()))) {
                                    C13082b c13082bM37011a4 = C13081a.m37011a(880010, "errorCode: 3401 errorMessage: resource load timeout");
                                    C13609c.this.f37614S = false;
                                    if (c13154cM39036a != null) {
                                        c13154cM39036a.m37422a(c13082bM37011a4);
                                    }
                                    C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, c13082bM37011a4, c13154cM39036a);
                                    if (C13609c.this.f37645z != null && C13609c.this.f37645z.size() > 0) {
                                        boolean z3 = false;
                                        for (CampaignEx campaignEx4 : C13609c.this.f37645z) {
                                            if (campaignEx4 != null) {
                                                try {
                                                    if (!TextUtils.isEmpty(campaignEx4.getVideoUrlEncode()) && !ResDownloadCheckManager.getInstance().containsVideoKey(campaignEx4.getVideoUrlEncode())) {
                                                        z = true;
                                                    }
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getendcard_url()) && !ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getendcard_url())) {
                                                        z = true;
                                                    }
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl())) {
                                                        if (!ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                            z = true;
                                                        } else if (!z3 && !z) {
                                                            if (C14200a.m42399b(C13609c.this.f37621b + "_" + campaignEx4.getRequestId() + "_" + campaignEx4.getCMPTEntryUrl()) == null) {
                                                                z3 = true;
                                                            }
                                                        }
                                                    }
                                                    if (campaignEx4 != null && campaignEx4.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx4.getRewardTemplateMode().m36781j()) && !campaignEx4.getRewardTemplateMode().m36781j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getRewardTemplateMode().m36781j()) && TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl()) && !z) {
                                                        C14200a.m42394a(campaignEx4.getAdType(), campaignEx4);
                                                    }
                                                } catch (Exception e2) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        C13219q0.m37816b("RewardMVVideoAdapter", e2.getMessage());
                                                    }
                                                }
                                            }
                                            z = false;
                                            if (campaignEx4 != null) {
                                                z = true;
                                            }
                                            if (campaignEx4 != null) {
                                                if (!ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                    z = true;
                                                } else if (!z3) {
                                                    if (C14200a.m42399b(C13609c.this.f37621b + "_" + campaignEx4.getRequestId() + "_" + campaignEx4.getCMPTEntryUrl()) == null) {
                                                        z3 = true;
                                                    }
                                                }
                                            }
                                            if (campaignEx4 != null) {
                                                C14200a.m42394a(campaignEx4.getAdType(), campaignEx4);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            C13609c c13609c6 = C13609c.this;
                            c13609c6.m39061a(c13609c6.f37621b, (List<CampaignEx>) C13609c.this.f37617V, (List<CampaignEx>) C13609c.this.f37619X, C13609c.this.f37638s);
                            if (C13609c.this.f37629j != null) {
                                removeMessages(6);
                                if (C13609c.this.f37607L != null) {
                                    C13609c.this.f37607L.removeMessages(5);
                                }
                                if (C13609c.this.f37629j != null && !C13609c.this.f37613R) {
                                    C13609c.this.f37613R = true;
                                    C13609c.this.f37629j.mo38982a(C13609c.this.f37645z, c13154cM39036a);
                                    break;
                                }
                            }
                            break;
                    }
                } catch (Throwable th) {
                    C13219q0.m37813a("RewardMVVideoAdapter", th.getMessage());
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$b */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    class b extends AbstractC13625a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C13154c f37647e;

        b(C13154c c13154c) {
            this.f37647e = c13154c;
        }

        @Override // com.mbridge.msdk.reward.request.AbstractC13625a
        /* JADX INFO: renamed from: a */
        public void mo39140a(CampaignUnit campaignUnit) throws Throwable {
            CampaignEx campaignEx;
            try {
                C13609c.this.m39078c(campaignUnit);
                C13609c.this.m39040a(campaignUnit);
                if (campaignUnit != null) {
                    C13609c.this.f37602G = campaignUnit.getRequestId();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                if (C13609c.this.f37645z != null && C13609c.this.f37645z.size() > 0 && (campaignEx = (CampaignEx) C13609c.this.f37645z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                    C13609c.this.f37645z.clear();
                }
                if (C13609c.this.f37617V != null) {
                    C13609c.this.f37617V.clear();
                }
                C13609c.this.f37610O = false;
                C13609c.this.f37611P = false;
                synchronized (C13609c.this.f37634o) {
                    if (C13609c.this.f37612Q) {
                        C13609c.this.f37612Q = false;
                    }
                    C13609c.this.f37614S = false;
                    C13609c.this.f37613R = false;
                    C13609c.this.m39072b("exception after load success", this.f37647e);
                    C13609c.this.m39095n();
                }
            }
        }

        @Override // com.mbridge.msdk.reward.request.AbstractC13625a
        /* JADX INFO: renamed from: b */
        public void mo39141b(int i, String str, C13154c c13154c) {
            CampaignEx campaignEx;
            if (i == -1) {
                C13609c.this.f37597B = System.currentTimeMillis();
            }
            if (C13609c.this.f37645z != null && C13609c.this.f37645z.size() > 0 && (campaignEx = (CampaignEx) C13609c.this.f37645z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                C13609c.this.f37645z.clear();
            }
            if (C13609c.this.f37617V != null) {
                C13609c.this.f37617V.clear();
            }
            C13609c.this.f37610O = false;
            C13609c.this.f37611P = false;
            synchronized (C13609c.this.f37634o) {
                if (C13609c.this.f37612Q) {
                    C13609c.this.f37612Q = false;
                }
            }
            C13609c.this.m39049a(c13154c, i);
            C13609c.this.f37614S = false;
            C13609c.this.f37613R = false;
            if (!C13609c.this.f37608M) {
                C13609c.this.m39043a(i, str, c13154c);
            }
            C13609c.this.m39095n();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    class c implements C13608b.h {

        /* JADX INFO: renamed from: a */
        C13154c f37649a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f37650b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f37651c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CopyOnWriteArrayList f37652d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f37653e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CampaignEx f37655a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f37656b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37657c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f37658d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ CopyOnWriteArrayList f37659e;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
            class C15557a implements C13608b.o {
                C15557a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39032a(String str, String str2, String str3, C14200a.a aVar, C13082b c13082b) {
                    if (c13082b != null) {
                        c13082b.m37019a("his_reason", "preload template failed is tpl :" + c.this.f37651c);
                    }
                    if (c.this.f37650b.getRsIgnoreCheckRule() != null && c.this.f37650b.getRsIgnoreCheckRule().size() > 0 && c.this.f37650b.getRsIgnoreCheckRule().contains(1)) {
                        C13219q0.m37818c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    a aVar2 = a.this;
                    C13609c c13609c = C13609c.this;
                    c13609c.m39062a(aVar2.f37657c, (List<CampaignEx>) c13609c.f37617V, C13609c.this.f37638s, str2);
                    if (C13609c.this.f37607L != null) {
                        C13609c.this.f37607L.removeMessages(5);
                    }
                    if (C13609c.this.f37629j == null || C13609c.this.f37614S) {
                        return;
                    }
                    C13609c.this.f37614S = false;
                    c cVar = c.this;
                    if (cVar.f37649a == null) {
                        cVar.f37649a = new C13154c();
                    }
                    c cVar2 = c.this;
                    cVar2.f37649a.m37429b(cVar2.f37652d);
                    c.this.f37649a.m37422a(c13082b);
                    C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, c13082b, c.this.f37649a);
                    C13219q0.m37813a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39033a(String str, String str2, String str3, String str4, String str5, C14200a.a aVar) {
                    c cVar = c.this;
                    if (C13609c.this.m39120a(cVar.f37652d, cVar.f37651c, cVar.f37653e)) {
                        C13609c c13609c = C13609c.this;
                        String str6 = c13609c.f37621b;
                        a aVar2 = a.this;
                        c13609c.m39061a(str6, aVar2.f37659e, (List<CampaignEx>) C13609c.this.f37619X, C13609c.this.f37638s);
                        if (C13609c.this.f37607L != null) {
                            C13609c.this.f37607L.removeMessages(5);
                        }
                        if (C13609c.this.f37629j == null || C13609c.this.f37613R) {
                            return;
                        }
                        C13609c.this.f37613R = true;
                        c cVar2 = c.this;
                        C13154c c13154c = cVar2.f37649a;
                        if (c13154c != null) {
                            c13154c.m37429b(cVar2.f37652d);
                        }
                        InterfaceC13607a interfaceC13607a = C13609c.this.f37629j;
                        c cVar3 = c.this;
                        interfaceC13607a.mo38982a(cVar3.f37652d, cVar3.f37649a);
                        return;
                    }
                    C13609c c13609c2 = C13609c.this;
                    c13609c2.m39062a(str3, (List<CampaignEx>) c13609c2.f37617V, C13609c.this.f37638s, str4);
                    if (C13609c.this.f37607L != null) {
                        C13609c.this.f37607L.removeMessages(5);
                    }
                    if (C13609c.this.f37629j == null || C13609c.this.f37614S) {
                        return;
                    }
                    C13609c.this.f37614S = false;
                    C13082b c13082bM37011a = C13081a.m37011a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    c cVar4 = c.this;
                    if (cVar4.f37649a == null) {
                        cVar4.f37649a = new C13154c();
                    }
                    c cVar5 = c.this;
                    cVar5.f37649a.m37429b(cVar5.f37652d);
                    c.this.f37649a.m37422a(c13082bM37011a);
                    InterfaceC13607a interfaceC13607a2 = C13609c.this.f37629j;
                    c cVar6 = c.this;
                    interfaceC13607a2.mo38981a(cVar6.f37652d, c13082bM37011a, cVar6.f37649a);
                    C13219q0.m37813a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                }
            }

            a(CampaignEx campaignEx, String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f37655a = campaignEx;
                this.f37656b = str;
                this.f37657c = str2;
                this.f37658d = str3;
                this.f37659e = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13608b c13608bM39002b = C13608b.m39002b();
                boolean z = C13609c.this.f37596A;
                Handler handler = C13609c.this.f37607L;
                boolean z2 = C13609c.this.f37637r;
                boolean z3 = C13609c.this.f37638s;
                String strM36781j = this.f37655a.getRewardTemplateMode().m36781j();
                int i = C13609c.this.f37636q;
                c cVar = c.this;
                c13608bM39002b.m39010a(z, handler, z2, z3, null, strM36781j, i, cVar.f37650b, cVar.f37652d, H5DownLoadManager.getInstance().getH5ResAddress(this.f37655a.getRewardTemplateMode().m36781j()), this.f37656b, this.f37657c, this.f37658d, this.f37655a.getRequestIdNotice(), C13609c.this.f37631l, new C15557a());
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f37662a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f37663b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ CopyOnWriteArrayList f37664c;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b$a */
            /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
            class a implements C13608b.o {
                a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39032a(String str, String str2, String str3, C14200a.a aVar, C13082b c13082b) {
                    if (c13082b != null) {
                        c13082b.m37019a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    if (c.this.f37650b.getRsIgnoreCheckRule() != null && c.this.f37650b.getRsIgnoreCheckRule().size() > 0 && c.this.f37650b.getRsIgnoreCheckRule().contains(3)) {
                        C13219q0.m37818c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    b bVar = b.this;
                    C13609c c13609c = C13609c.this;
                    c13609c.m39062a(bVar.f37663b, (List<CampaignEx>) c13609c.f37617V, C13609c.this.f37638s, str2);
                    if (C13609c.this.f37607L != null) {
                        C13609c.this.f37607L.removeMessages(5);
                    }
                    if (C13609c.this.f37629j == null || C13609c.this.f37614S) {
                        return;
                    }
                    C13609c.this.f37614S = false;
                    c cVar = c.this;
                    if (cVar.f37649a == null) {
                        cVar.f37649a = new C13154c();
                    }
                    c cVar2 = c.this;
                    cVar2.f37649a.m37429b(cVar2.f37652d);
                    c.this.f37649a.m37422a(c13082b);
                    C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, c13082b, c.this.f37649a);
                    C13219q0.m37813a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39033a(String str, String str2, String str3, String str4, String str5, C14200a.a aVar) {
                    c cVar = c.this;
                    if (C13609c.this.m39120a(cVar.f37652d, cVar.f37651c, cVar.f37653e)) {
                        C13609c c13609c = C13609c.this;
                        String str6 = c13609c.f37621b;
                        b bVar = b.this;
                        c13609c.m39061a(str6, bVar.f37664c, (List<CampaignEx>) C13609c.this.f37619X, C13609c.this.f37638s);
                        if (C13609c.this.f37607L != null) {
                            C13609c.this.f37607L.removeMessages(5);
                        }
                        if (C13609c.this.f37629j == null || C13609c.this.f37613R) {
                            return;
                        }
                        C13609c.this.f37613R = true;
                        c cVar2 = c.this;
                        C13154c c13154c = cVar2.f37649a;
                        if (c13154c != null) {
                            c13154c.m37429b(cVar2.f37652d);
                        }
                        InterfaceC13607a interfaceC13607a = C13609c.this.f37629j;
                        c cVar3 = c.this;
                        interfaceC13607a.mo38982a(cVar3.f37652d, cVar3.f37649a);
                        return;
                    }
                    C13609c c13609c2 = C13609c.this;
                    c13609c2.m39062a(str3, (List<CampaignEx>) c13609c2.f37617V, C13609c.this.f37638s, str4);
                    if (C13609c.this.f37607L != null) {
                        C13609c.this.f37607L.removeMessages(5);
                    }
                    if (C13609c.this.f37629j == null || C13609c.this.f37614S) {
                        return;
                    }
                    C13609c.this.f37614S = false;
                    C13082b c13082bM37011a = C13081a.m37011a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    c cVar4 = c.this;
                    if (cVar4.f37649a == null) {
                        cVar4.f37649a = new C13154c();
                    }
                    c cVar5 = c.this;
                    cVar5.f37649a.m37429b(cVar5.f37652d);
                    c.this.f37649a.m37422a(c13082bM37011a);
                    C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, c13082bM37011a, c.this.f37649a);
                    C13219q0.m37813a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                }
            }

            b(String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f37662a = str;
                this.f37663b = str2;
                this.f37664c = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13608b c13608bM39002b = C13608b.m39002b();
                boolean z = C13609c.this.f37596A;
                Handler handler = C13609c.this.f37607L;
                boolean z2 = C13609c.this.f37637r;
                boolean z3 = C13609c.this.f37638s;
                String str = this.f37662a;
                String requestIdNotice = c.this.f37650b.getRequestIdNotice();
                String str2 = C13609c.this.f37622c;
                String str3 = this.f37663b;
                String cMPTEntryUrl = c.this.f37650b.getCMPTEntryUrl();
                int i = C13609c.this.f37636q;
                c cVar = c.this;
                c13608bM39002b.m39011a(z, handler, z2, z3, str, requestIdNotice, str2, str3, cMPTEntryUrl, i, cVar.f37650b, cVar.f37652d, H5DownLoadManager.getInstance().getH5ResAddress(c.this.f37650b.getCMPTEntryUrl()), this.f37663b, C13609c.this.f37631l, new a(), false);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        class RunnableC15558c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CopyOnWriteArrayList f37667a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C13082b f37668b;

            RunnableC15558c(CopyOnWriteArrayList copyOnWriteArrayList, C13082b c13082b) {
                this.f37667a = copyOnWriteArrayList;
                this.f37668b = c13082b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13609c c13609c = C13609c.this;
                c13609c.m39062a(c13609c.f37621b, this.f37667a, C13609c.this.f37638s, "");
                if (C13609c.this.f37607L != null) {
                    C13609c.this.f37607L.removeMessages(5);
                }
                if (C13609c.this.f37614S || C13609c.this.f37629j == null) {
                    return;
                }
                C13609c.this.f37614S = false;
                c cVar = c.this;
                if (cVar.f37649a == null) {
                    cVar.f37649a = new C13154c();
                }
                c cVar2 = c.this;
                cVar2.f37649a.m37429b(cVar2.f37652d);
                C13082b c13082b = this.f37668b;
                if (c13082b != null) {
                    c13082b.m37024c("errorCode: 3201 errorMessage: campaign resource download failed");
                }
                c.this.f37649a.m37422a(this.f37668b);
                C13609c.this.f37629j.mo38981a(this.f37667a, this.f37668b, c.this.f37649a);
                C13219q0.m37813a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
            }
        }

        c(CampaignEx campaignEx, boolean z, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
            this.f37650b = campaignEx;
            this.f37651c = z;
            this.f37652d = copyOnWriteArrayList;
            this.f37653e = i;
            this.f37649a = C13156d.m37475b().m37495c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.h
        /* JADX INFO: renamed from: a */
        public void mo39013a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            C13609c.this.f37610O = true;
            if (this.f37651c) {
                if (!C13609c.this.f37611P || C13609c.this.f37612Q || C13609c.this.f37607L == null) {
                    return;
                }
                synchronized (C13609c.this.f37634o) {
                    if (C13609c.this.f37612Q) {
                        return;
                    }
                    C13609c.this.f37612Q = true;
                    C13609c.this.f37607L.post(new b(str3, str2, copyOnWriteArrayList));
                    return;
                }
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j()) || campaignEx.getRewardTemplateMode().m36781j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || C13609c.this.f37607L == null) {
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = copyOnWriteArrayList;
                    if (C13609c.this.m39120a(this.f37652d, this.f37651c, this.f37653e)) {
                        C13609c c13609c = C13609c.this;
                        c13609c.m39061a(c13609c.f37621b, copyOnWriteArrayList2, (List<CampaignEx>) C13609c.this.f37619X, C13609c.this.f37638s);
                        if (C13609c.this.f37607L != null) {
                            C13609c.this.f37607L.removeMessages(5);
                        }
                        if (C13609c.this.f37629j != null && !C13609c.this.f37613R) {
                            C13609c.this.f37613R = true;
                            C13154c c13154c = this.f37649a;
                            if (c13154c != null) {
                                c13154c.m37429b(this.f37652d);
                            }
                            C13609c.this.f37629j.mo38982a(this.f37652d, this.f37649a);
                        }
                    } else {
                        C13609c c13609c2 = C13609c.this;
                        c13609c2.m39062a(str5, (List<CampaignEx>) c13609c2.f37617V, C13609c.this.f37638s, str6);
                        if (C13609c.this.f37607L != null) {
                            C13609c.this.f37607L.removeMessages(5);
                        }
                        if (C13609c.this.f37629j != null && !C13609c.this.f37614S) {
                            C13609c.this.f37614S = false;
                            C13082b c13082bM37011a = C13081a.m37011a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f37649a == null) {
                                this.f37649a = new C13154c();
                            }
                            this.f37649a.m37429b(this.f37652d);
                            this.f37649a.m37422a(c13082bM37011a);
                            C13609c.this.f37629j.mo38981a(this.f37652d, c13082bM37011a, this.f37649a);
                            C13219q0.m37813a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                        }
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                } else {
                    C13609c.this.f37607L.post(new a(campaignEx, str, str2, str3, copyOnWriteArrayList));
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.h
        /* JADX INFO: renamed from: a */
        public void mo39014a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, C13082b c13082b) {
            C13609c.this.f37610O = false;
            if (C13609c.this.f37629j == null || C13609c.this.f37607L == null) {
                return;
            }
            C13609c.this.f37607L.post(new RunnableC15558c(copyOnWriteArrayList, c13082b));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$d */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    class d implements C13608b.n {

        /* JADX INFO: renamed from: a */
        C13154c f37670a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f37671b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f37672c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CopyOnWriteArrayList f37673d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f37674e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$d$a */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f37676a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C13082b f37677b;

            a(String str, C13082b c13082b) {
                this.f37676a = str;
                this.f37677b = c13082b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13609c c13609c = C13609c.this;
                c13609c.m39062a(c13609c.f37621b, (List<CampaignEx>) C13609c.this.f37617V, C13609c.this.f37638s, this.f37676a);
                if (C13609c.this.f37607L != null) {
                    C13609c.this.f37607L.removeMessages(5);
                }
                if (C13609c.this.f37614S || C13609c.this.f37629j == null) {
                    return;
                }
                C13609c.this.f37614S = false;
                C13082b c13082b = this.f37677b;
                if (c13082b != null) {
                    c13082b.m37024c("errorCode: 3202 errorMessage: temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f37670a == null) {
                    dVar.f37670a = new C13154c();
                }
                d dVar2 = d.this;
                dVar2.f37670a.m37429b(dVar2.f37673d);
                d.this.f37670a.m37422a(this.f37677b);
                C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, this.f37677b, d.this.f37670a);
                C13219q0.m37813a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$d$b */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f37679a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C13082b f37680b;

            b(String str, C13082b c13082b) {
                this.f37679a = str;
                this.f37680b = c13082b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13609c c13609c = C13609c.this;
                c13609c.m39062a(c13609c.f37621b, (List<CampaignEx>) C13609c.this.f37617V, C13609c.this.f37638s, this.f37679a);
                if (C13609c.this.f37607L != null) {
                    C13609c.this.f37607L.removeMessages(5);
                }
                if (C13609c.this.f37614S || C13609c.this.f37629j == null) {
                    return;
                }
                C13609c.this.f37614S = false;
                C13082b c13082b = this.f37680b;
                if (c13082b != null) {
                    c13082b.m37024c("errorCode: 3203 errorMessage: tpl temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f37670a == null) {
                    dVar.f37670a = new C13154c();
                }
                d dVar2 = d.this;
                dVar2.f37670a.m37429b(dVar2.f37673d);
                d.this.f37670a.m37422a(this.f37680b);
                C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, this.f37680b, d.this.f37670a);
                C13219q0.m37813a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
            }
        }

        d(CampaignEx campaignEx, boolean z, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
            this.f37671b = campaignEx;
            this.f37672c = z;
            this.f37673d = copyOnWriteArrayList;
            this.f37674e = i;
            this.f37670a = C13156d.m37475b().m37495c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.n
        /* JADX INFO: renamed from: a */
        public void mo39030a(String str, String str2, C13082b c13082b) {
            C13219q0.m37813a("RewardMVVideoAdapter", "template 下载失败： ");
            if (c13082b != null) {
                c13082b.m37024c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.f37672c && C13609c.this.f37629j != null && C13609c.this.f37607L != null) {
                C13219q0.m37813a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.f37671b.getRsIgnoreCheckRule() == null || this.f37671b.getRsIgnoreCheckRule().size() <= 0 || !this.f37671b.getRsIgnoreCheckRule().contains(1)) {
                    C13609c.this.f37607L.post(new a(str2, c13082b));
                    return;
                } else {
                    C13219q0.m37818c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.f37674e == 1) {
                if (this.f37671b.getRsIgnoreCheckRule() != null && this.f37671b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.f37671b.getRsIgnoreCheckRule().contains(3)) {
                        C13219q0.m37818c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.f37671b.getCMPTEntryUrl().equals(this.f37671b.getendcard_url()) && this.f37671b.getRsIgnoreCheckRule().contains(2)) {
                        C13219q0.m37818c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (C13609c.this.f37629j == null || C13609c.this.f37607L == null) {
                    return;
                }
                C13609c.this.f37607L.post(new b(str2, c13082b));
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.n
        /* JADX INFO: renamed from: a */
        public void mo39031a(String str, String str2, String str3, String str4) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$e */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    class e implements C13608b.n {

        /* JADX INFO: renamed from: a */
        C13154c f37682a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f37683b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CopyOnWriteArrayList f37684c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f37685d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f37686e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$e$a */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f37688a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f37689b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37690c;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
            class C15559a implements C13608b.o {
                C15559a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39032a(String str, String str2, String str3, C14200a.a aVar, C13082b c13082b) {
                    C13219q0.m37813a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                    C13219q0.m37816b("HBOPTIMIZE", "模板加载失败 requestId " + str2);
                    a aVar2 = a.this;
                    C13609c c13609c = C13609c.this;
                    c13609c.m39062a(aVar2.f37690c, (List<CampaignEx>) c13609c.f37617V, C13609c.this.f37638s, str2);
                    if (C13609c.this.f37607L != null) {
                        C13609c.this.f37607L.removeMessages(5);
                    }
                    if (C13609c.this.f37629j == null || C13609c.this.f37614S) {
                        return;
                    }
                    C13609c.this.f37614S = false;
                    e eVar = e.this;
                    if (eVar.f37682a == null) {
                        eVar.f37682a = new C13154c();
                    }
                    e eVar2 = e.this;
                    eVar2.f37682a.m37429b(eVar2.f37684c);
                    e.this.f37682a.m37422a(c13082b);
                    C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, c13082b, e.this.f37682a);
                    C13219q0.m37813a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39033a(String str, String str2, String str3, String str4, String str5, C14200a.a aVar) {
                    C13219q0.m37813a("HBOPTIMIZE", "模板加载成功 requestId " + str4);
                    e eVar = e.this;
                    if (C13609c.this.m39120a(eVar.f37684c, eVar.f37685d, eVar.f37686e)) {
                        C13609c c13609c = C13609c.this;
                        c13609c.m39061a(c13609c.f37621b, (List<CampaignEx>) C13609c.this.f37617V, (List<CampaignEx>) C13609c.this.f37619X, C13609c.this.f37638s);
                        if (C13609c.this.f37607L != null) {
                            C13609c.this.f37607L.removeMessages(5);
                        }
                        if (C13609c.this.f37629j == null || C13609c.this.f37613R) {
                            return;
                        }
                        C13609c.this.f37613R = true;
                        e eVar2 = e.this;
                        C13154c c13154c = eVar2.f37682a;
                        if (c13154c != null) {
                            c13154c.m37429b(eVar2.f37684c);
                        }
                        InterfaceC13607a interfaceC13607a = C13609c.this.f37629j;
                        e eVar3 = e.this;
                        interfaceC13607a.mo38982a(eVar3.f37684c, eVar3.f37682a);
                        return;
                    }
                    C13609c c13609c2 = C13609c.this;
                    c13609c2.m39062a(str3, (List<CampaignEx>) c13609c2.f37617V, C13609c.this.f37638s, a.this.f37688a);
                    if (C13609c.this.f37607L != null) {
                        C13609c.this.f37607L.removeMessages(5);
                    }
                    if (C13609c.this.f37629j == null || C13609c.this.f37614S) {
                        return;
                    }
                    C13609c.this.f37614S = false;
                    C13082b c13082bM37011a = C13081a.m37011a(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    e eVar4 = e.this;
                    if (eVar4.f37682a == null) {
                        eVar4.f37682a = new C13154c();
                    }
                    e eVar5 = e.this;
                    eVar5.f37682a.m37429b(eVar5.f37684c);
                    e.this.f37682a.m37422a(c13082bM37011a);
                    C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, c13082bM37011a, e.this.f37682a);
                    C13219q0.m37813a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                }
            }

            a(String str, String str2, String str3) {
                this.f37688a = str;
                this.f37689b = str2;
                this.f37690c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13608b c13608bM39002b = C13608b.m39002b();
                boolean z = C13609c.this.f37596A;
                Handler handler = C13609c.this.f37607L;
                boolean z2 = C13609c.this.f37637r;
                boolean z3 = C13609c.this.f37638s;
                String str = this.f37688a;
                String requestIdNotice = e.this.f37683b.getRequestIdNotice();
                String str2 = this.f37689b;
                String str3 = this.f37690c;
                String cMPTEntryUrl = e.this.f37683b.getCMPTEntryUrl();
                int i = C13609c.this.f37636q;
                e eVar = e.this;
                c13608bM39002b.m39011a(z, handler, z2, z3, str, requestIdNotice, str2, str3, cMPTEntryUrl, i, eVar.f37683b, eVar.f37684c, H5DownLoadManager.getInstance().getH5ResAddress(e.this.f37683b.getCMPTEntryUrl()), this.f37690c, C13609c.this.f37631l, new C15559a(), false);
            }
        }

        e(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, int i) {
            this.f37683b = campaignEx;
            this.f37684c = copyOnWriteArrayList;
            this.f37685d = z;
            this.f37686e = i;
            this.f37682a = C13156d.m37475b().m37495c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.n
        /* JADX INFO: renamed from: a */
        public void mo39030a(String str, String str2, C13082b c13082b) {
            C13219q0.m37813a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.f37683b.getRsIgnoreCheckRule() != null && this.f37683b.getRsIgnoreCheckRule().size() > 0) {
                if (this.f37683b.getRsIgnoreCheckRule().contains(3)) {
                    C13219q0.m37818c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.f37683b.getCMPTEntryUrl().equals(this.f37683b.getendcard_url()) && this.f37683b.getRsIgnoreCheckRule().contains(2)) {
                    C13219q0.m37818c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            C13609c c13609c = C13609c.this;
            c13609c.m39062a(c13609c.f37621b, (List<CampaignEx>) C13609c.this.f37617V, C13609c.this.f37638s, str2);
            C13609c.this.f37611P = false;
            if (C13609c.this.f37607L != null) {
                C13609c.this.f37607L.removeMessages(5);
            }
            if (C13609c.this.f37629j == null || C13609c.this.f37614S) {
                return;
            }
            C13609c.this.f37614S = false;
            if (c13082b != null) {
                c13082b.m37024c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.f37682a == null) {
                this.f37682a = new C13154c();
            }
            this.f37682a.m37429b(this.f37684c);
            this.f37682a.m37422a(c13082b);
            C13609c.this.f37629j.mo38981a(C13609c.this.f37617V, c13082b, this.f37682a);
            C13219q0.m37813a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.n
        /* JADX INFO: renamed from: a */
        public void mo39031a(String str, String str2, String str3, String str4) {
            C13219q0.m37813a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            C13609c.this.f37611P = true;
            if (!C13609c.this.f37610O || C13609c.this.f37612Q || C13609c.this.f37607L == null) {
                return;
            }
            synchronized (C13609c.this.f37634o) {
                if (C13609c.this.f37612Q) {
                    return;
                }
                C13609c.this.f37612Q = true;
                C13609c.this.f37607L.post(new a(str3, str, str2));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$f */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    class f extends C13092c.a {
        f() {
        }

        @Override // com.mbridge.msdk.foundation.same.C13092c.a
        /* JADX INFO: renamed from: a */
        public void mo34472a(String str, C13154c c13154c) {
            C13624a.m39351a().m39354a(str, c13154c);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$g */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignUnit f37694a;

        g(CampaignUnit campaignUnit) {
            this.f37694a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13020j.m36706a(C13017g.m36693a(C13609c.this.f37620a)).m36710d();
            CampaignUnit campaignUnit = this.f37694a;
            if (campaignUnit == null || campaignUnit.getAds() == null || this.f37694a.getAds().size() <= 0) {
                return;
            }
            C13609c.this.m39081d(this.f37694a.getAds());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$h */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a */
        private String f37696a;

        /* JADX INFO: renamed from: b */
        private C13154c f37697b;

        public h(String str, C13154c c13154c) {
            this.f37696a = str;
            this.f37697b = c13154c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C13609c.this.f37600E) {
                    return;
                }
                C13609c.this.f37601F = true;
                if (C13609c.this.f37607L != null) {
                    Message messageObtainMessage = C13609c.this.f37607L.obtainMessage();
                    messageObtainMessage.obj = this.f37696a;
                    messageObtainMessage.what = 2;
                    if (this.f37697b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f37697b.m37463t());
                        messageObtainMessage.setData(bundle);
                    }
                    C13609c.this.f37607L.sendMessage(messageObtainMessage);
                }
            } catch (Exception e) {
                C13219q0.m37816b("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$i */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a */
        private String f37699a;

        /* JADX INFO: renamed from: b */
        private C13154c f37700b;

        public i(String str, C13154c c13154c) {
            this.f37699a = str;
            this.f37700b = c13154c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C13884b.m41421a()) {
                    C13609c c13609c = C13609c.this;
                    c13609c.f37640u = C12681b.m34598a(c13609c.f37621b, C13609c.this.f37620a);
                }
                C13609c c13609c2 = C13609c.this;
                c13609c2.f37627h = C13229v0.m37881a(c13609c2.f37620a, C13609c.this.f37621b);
                if (C13609c.this.f37601F) {
                    return;
                }
                if (C13609c.this.f37599D != null && C13609c.this.f37607L != null) {
                    C13609c.this.f37607L.removeCallbacks(C13609c.this.f37599D);
                }
                C13609c.this.f37600E = true;
                if (C13609c.this.f37607L != null) {
                    Message messageObtainMessage = C13609c.this.f37607L.obtainMessage();
                    messageObtainMessage.obj = this.f37699a;
                    messageObtainMessage.what = 1;
                    if (this.f37700b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f37700b.m37463t());
                        messageObtainMessage.setData(bundle);
                    }
                    C13609c.this.f37607L.sendMessage(messageObtainMessage);
                }
                if (TextUtils.isEmpty(C13609c.this.f37627h)) {
                    return;
                }
                C13219q0.m37816b("RewardMVVideoAdapter", "excludeId : " + C13609c.this.f37627h);
            } catch (Exception e) {
                C13219q0.m37816b("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    public C13609c(Context context, String str, String str2) {
        try {
            this.f37620a = context.getApplicationContext();
            this.f37621b = str2;
            this.f37622c = str;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C13154c m39036a(Message message) {
        C13154c c13154c = new C13154c();
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    return C13156d.m37475b().m37489b(data.getString("metrics_data_lrid"));
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return c13154c;
    }

    /* JADX INFO: renamed from: a */
    private C13154c m39038a(List<CampaignEx> list) {
        C13154c c13154c = new C13154c();
        String localRequestId = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    localRequestId = list.get(0) != null ? list.get(0).getLocalRequestId() : "";
                    if (C13156d.m37475b().m37495c().containsKey(localRequestId)) {
                        C13154c c13154c2 = C13156d.m37475b().m37495c().get(localRequestId);
                        if (c13154c2 == null) {
                            try {
                                c13154c = new C13154c();
                            } catch (Exception e2) {
                                e = e2;
                                c13154c = c13154c2;
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                }
                                return c13154c;
                            }
                        } else {
                            c13154c = c13154c2;
                        }
                    }
                    c13154c.m37446i(localRequestId);
                    c13154c.m37429b(list);
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        C13157e c13157e = new C13157e();
        c13157e.m37501a("cache", 1);
        c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
        c13157e.m37501a("auto_load", 2);
        c13154c.m37423a("2000127", c13157e);
        c13154c.m37423a("2000048", c13157e);
        c13154c.m37420a(this.f37637r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        c13154c.m37444h("1");
        c13154c.m37440f("2");
        if (!TextUtils.isEmpty(localRequestId)) {
            C13156d.m37475b().m37495c().put(localRequestId, c13154c);
        }
        return c13154c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX INFO: renamed from: a */
    public C13610d m39040a(CampaignUnit campaignUnit) throws Throwable {
        boolean z;
        this.f37644y = campaignUnit;
        C13610d c13610dM39066b = m39066b(campaignUnit);
        new C13612a(this.f37621b, this.f37637r).m39159a(c13610dM39066b.m39146b(), this.f37598C, this, this.f37621b);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM39146b = c13610dM39066b.m39146b();
        if (c13610dM39066b.m39149e()) {
            if (c13610dM39066b.m39148d() == 0) {
                copyOnWriteArrayListM39146b.clear();
            } else if (c13610dM39066b.m39145a()) {
                m39071b(campaignUnit.getMetricsData());
            }
            if (c13610dM39066b.m39147c() != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        m39117a(copyOnWriteArrayListM39146b, true, false, z);
        return c13610dM39066b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e A[EDGE_INSN: B:24:0x006e->B:25:0x0071 BREAK  A[LOOP:0: B:16:0x004d->B:39:0x004d]] */
    /* JADX INFO: renamed from: a */
    private void m39042a() {
        String strM36809d;
        String strM36804b;
        List<C13070d> listM36624a = C13012b.m36621a(C13008c.m36588n().m36542d()).m36624a(this.f37621b, this.f37603H);
        if (listM36624a != null) {
            int size = listM36624a.size();
            String strM37112d = C13091b.m37112d(this.f37621b);
            if (size == 0) {
                return;
            }
            try {
                if (size != 1) {
                    if (!TextUtils.isEmpty(strM37112d)) {
                        Iterator<C13070d> it = listM36624a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                strM36804b = "";
                                strM36809d = "";
                                break;
                            }
                            C13070d next = it.next();
                            if (next != null && strM37112d.equals(next.m36801a())) {
                                strM36809d = next.m36809d();
                                strM36804b = next.m36804b();
                                break;
                            }
                        }
                    } else {
                        strM36804b = "";
                        strM36809d = "";
                        break;
                    }
                } else if (listM36624a.get(0) == null) {
                    strM36804b = "";
                    strM36809d = "";
                    break;
                } else {
                    strM36809d = listM36624a.get(0).m36809d();
                    strM36804b = listM36624a.get(0).m36804b();
                }
                if (TextUtils.isEmpty(strM36809d) || !strM36809d.equals(this.f37603H)) {
                    return;
                }
                C13012b.m36621a(C13008c.m36588n().m36542d()).m36626b(strM37112d, this.f37621b);
                C13091b.m37106a(this.f37621b, this.f37603H, strM36804b);
                C13091b.m37114e(this.f37621b);
            } catch (Exception e2) {
                C13219q0.m37813a("RewardMVVideoAdapter", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39043a(int i2, String str, C13154c c13154c) {
        if (this.f37607L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            messageObtain.arg1 = i2;
            if (c13154c != null) {
                c13154c.m37430b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", c13154c.m37463t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.f37607L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.f37607L.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39044a(C13020j c13020j, CampaignEx campaignEx) {
        if (c13020j == null || c13020j.m36707a(campaignEx.getId())) {
            return;
        }
        C13073g c13073g = new C13073g();
        c13073g.m36859a(campaignEx.getId());
        c13073g.m36861b(campaignEx.getFca());
        c13073g.m36863c(campaignEx.getFcb());
        c13073g.m36857a(0);
        c13073g.m36865d(0);
        c13073g.m36858a(System.currentTimeMillis());
        c13020j.m36708b(c13073g);
    }

    /* JADX INFO: renamed from: a */
    private void m39045a(CampaignEx campaignEx) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>(this.f37645z);
        boolean zIsEmpty = TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        boolean z = !zIsEmpty;
        int nscpt = campaignEx.getNscpt();
        this.f37610O = false;
        this.f37611P = false;
        synchronized (this.f37634o) {
            if (this.f37612Q) {
                this.f37612Q = false;
            }
        }
        this.f37614S = false;
        this.f37613R = false;
        if (this.f37638s) {
            C13012b.m36621a(C13008c.m36588n().m36542d()).m36623a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        C13608b.m39002b().m39009a(this.f37620a, z, nscpt, this.f37638s, this.f37637r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f37622c, this.f37621b, campaignEx.getRequestId(), copyOnWriteArrayList, new c(campaignEx, z, copyOnWriteArrayList, nscpt), new d(campaignEx, z, copyOnWriteArrayList, nscpt));
        if (zIsEmpty) {
            return;
        }
        C13608b.m39002b().m39008a(this.f37620a, campaignEx, this.f37622c, this.f37621b, campaignEx.getRequestId(), new e(campaignEx, copyOnWriteArrayList, z, nscpt));
    }

    /* JADX INFO: renamed from: a */
    private void m39046a(CampaignEx campaignEx, C13154c c13154c) {
        try {
            C13092c.m37119a(campaignEx, this.f37620a, c13154c, new f());
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39047a(CampaignUnit campaignUnit, List<CampaignEx> list) {
        C13167a.m37543b().execute(new g(campaignUnit));
    }

    /* JADX INFO: renamed from: a */
    private void m39048a(C13154c c13154c) {
        if (this.f37607L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            if (c13154c != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", c13154c.m37463t());
                messageObtain.setData(bundle);
            }
            this.f37607L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0027 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:16:0x002c, B:18:0x004a, B:20:0x0052, B:22:0x0056, B:25:0x005f, B:27:0x0078, B:26:0x006d, B:28:0x008e, B:15:0x0027), top: B:35:0x0004 }] */
    /* JADX INFO: renamed from: a */
    public void m39049a(C13154c c13154c, int i2) {
        Object objM37015a;
        if (c13154c != null) {
            try {
                if (c13154c.m37417F()) {
                    return;
                }
                C13157e c13157e = new C13157e();
                if (i2 != 3 && i2 != 880023 && i2 != 880041) {
                    switch (i2) {
                        case 10:
                        case 11:
                        case 12:
                            c13157e.m37501a("result", "2");
                            break;
                        default:
                            c13157e.m37501a("result", "1");
                            break;
                    }
                } else {
                    c13157e.m37501a("result", "2");
                }
                c13157e.m37501a("timeout", this.f37625f + "");
                C13082b c13082bM37464u = c13154c.m37464u();
                if (c13082bM37464u != null && (objM37015a = c13082bM37464u.m37015a("campaign_request_error")) != null && (objM37015a instanceof C13113a)) {
                    if (((C13113a) objM37015a).f35961c != null) {
                        c13157e.m37501a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.valueOf(((C13113a) objM37015a).f35961c.f35982d));
                    } else {
                        c13157e.m37501a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.valueOf(c13082bM37464u.m37027g()));
                    }
                    c13157e.m37501a("reason", c13082bM37464u.m37032l());
                    c13157e.m37501a("err_desc", c13082bM37464u.m37029i());
                    c13154c.m37422a((C13082b) null);
                }
                c13157e.m37501a("hst", m39091k());
                c13157e.m37501a("126_exclude", 1);
                c13154c.m37423a("2000126", c13157e);
                C13624a.m39351a().m39354a("2000126", c13154c);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39050a(C13154c c13154c, C13157e c13157e, List<CampaignEx> list) {
        if (c13154c != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        c13154c.m37429b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            c13154c.m37446i(campaignEx.getLocalRequestId());
                        }
                        c13154c.m37429b(list);
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            m39063a(false, c13154c, c13157e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39058a(String str) {
        if (C13182a1.m37597b(str)) {
            C13613a.f37717c0 = str;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39059a(String str, String str2, List<CampaignEx> list) {
        if (C14201a.m42411a() != null) {
            C14201a.m42411a().m42422a(str, str2, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX INFO: renamed from: a */
    private void m39060a(String str, List<CampaignEx> list, List<CampaignEx> list2) {
        CampaignEx campaignEx;
        String requestId;
        int vcn;
        String bidToken;
        String localRequestId = "";
        if (list != null) {
            try {
                if (list.size() <= 0 || (campaignEx = list.get(0)) == null) {
                    vcn = 1;
                    requestId = "";
                    bidToken = requestId;
                } else {
                    requestId = campaignEx.getRequestId();
                    vcn = campaignEx.getVcn();
                    bidToken = campaignEx.getBidToken();
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        localRequestId = campaignEx.getLocalRequestId();
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            vcn = 1;
            requestId = "";
            bidToken = requestId;
        }
        if (C14201a.m42411a() != null) {
            C14201a.m42411a().m42435c(str, localRequestId);
            C14201a.m42411a().m42428b(str);
            C14201a.m42411a().m42421a(str, localRequestId);
        }
        if (C14201a.m42411a() != null) {
            C14201a.m42411a().m42419a(str, vcn);
        }
        if (list != null && list.size() > 0) {
            C13613a.m39178a(requestId, bidToken);
            for (CampaignEx campaignEx2 : list) {
                if (campaignEx2 != null) {
                    C13091b.m37107a(campaignEx2.getCampaignUnitId(), campaignEx2.getRequestId(), campaignEx2.getId(), campaignEx2.getPlct(), campaignEx2.getPlctb(), campaignEx2.getTimestamp(), campaignEx2.getLocalRequestId());
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx3 : list2) {
                if (campaignEx3 != null) {
                    C13091b.m37111c(campaignEx3.getCampaignUnitId(), campaignEx3.getRequestId());
                }
            }
        }
        C13091b.m37114e(str);
        C13012b.m36621a(C13008c.m36588n().m36542d()).m36627d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39061a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z) {
        C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36665a(str, list, list2, z);
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx : list2) {
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j())) {
                    C14200a.m42404e(str + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().m36781j());
                    C14200a.m42400b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z) {
            m39060a(str, list, list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = list.get(0);
            C13612a c13612a = new C13612a(str, this.f37637r);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            c13612a.m39158a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39062a(String str, List<CampaignEx> list, boolean z, String str2) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36657a(str, (CampaignEx) null, z, str2);
            return;
        }
        CampaignEx campaignEx = list.get(0);
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEcppv()) || TextUtils.isEmpty(str2)) {
            C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36666a(str, list, z);
        } else {
            C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36657a(str, (CampaignEx) null, z, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39063a(boolean z, C13154c c13154c, C13157e c13157e) {
        if (c13157e == null) {
            c13157e = new C13157e();
        }
        c13154c.m37456n(this.f37621b);
        c13154c.m37420a(this.f37637r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        c13157e.m37501a("result", Integer.valueOf(z ? 1 : 2));
        c13157e.m37501a("bid_tk", this.f37598C);
        c13157e.m37501a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f37638s ? 1 : 0));
        c13154c.m37423a("m_offer_ready", c13157e);
        C13624a.m39351a().m39354a("m_offer_ready", c13154c);
    }

    /* JADX INFO: renamed from: a */
    private void m39064a(boolean z, C13154c c13154c, List<CampaignEx> list) {
        if (c13154c == null) {
            c13154c = new C13154c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                c13154c.m37446i(campaignEx.getLocalRequestId());
            }
            c13154c.m37429b(list);
        }
        m39063a(z, c13154c, (C13157e) null);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01de A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01e2 A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01eb A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0200 A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:129:0x022f A[PHI: r15
  0x022f: PHI (r15v4 'e' java.io.IOException) = (r15v7 'e' java.io.IOException), (r15v8 'e' java.io.IOException) binds: [B:128:0x022d, B:117:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:161:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0185 A[Catch: all -> 0x021e, Exception -> 0x0220, PHI: r4
  0x0185: PHI (r4v7 java.io.FileOutputStream) = (r4v6 java.io.FileOutputStream), (r4v11 java.io.FileOutputStream) binds: [B:34:0x0090, B:75:0x0176] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:82:0x018d A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a8 A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b2 A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b7 A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01be A[Catch: all -> 0x021e, Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:18:0x0042, B:20:0x004c, B:21:0x0051, B:23:0x0057, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007b, B:33:0x0086, B:35:0x0092, B:37:0x00a0, B:70:0x015d, B:72:0x016c, B:74:0x0172, B:76:0x0178, B:78:0x0181, B:79:0x0184, B:69:0x015a, B:41:0x00ad, B:44:0x00b8, B:80:0x0185, B:82:0x018d, B:84:0x0193, B:86:0x019d, B:91:0x01b2, B:92:0x01b7, B:94:0x01be, B:96:0x01c4, B:100:0x01d3, B:101:0x01d6, B:103:0x01de, B:110:0x020b, B:104:0x01e2, B:106:0x01eb, B:108:0x01f1, B:109:0x0200, B:89:0x01a8), top: B:140:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d2  */
    /* JADX INFO: renamed from: b */
    private C13610d m39066b(CampaignUnit campaignUnit) throws Throwable {
        FileOutputStream fileOutputStream;
        IOException e2;
        C13154c metricsData;
        int i2;
        String str;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        C13610d c13610d = new C13610d();
        c13610d.m39143a(copyOnWriteArrayList);
        if (!MBridgeConstans.DEBUG || !C13887e.f39664a) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    C14223c c14223c = this.f37631l;
                    if (c14223c != null) {
                        c14223c.m42706b();
                    }
                    if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                        ArrayList<CampaignEx> ads = campaignUnit.getAds();
                        this.f37617V = ads;
                        if (campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                            metricsData = null;
                        } else {
                            ArrayList<CampaignEx> ads2 = campaignUnit.getAds();
                            for (int i3 = 0; i3 < ads2.size(); i3++) {
                                CampaignEx campaignEx = ads2.get(i3);
                                campaignEx.setCampaignUnitId(this.f37621b);
                                ads2.set(i3, campaignEx);
                            }
                            metricsData = campaignUnit.getMetricsData();
                            if (metricsData == null) {
                                metricsData = new C13154c();
                                campaignUnit.setMetricsData(metricsData);
                            }
                            metricsData.m37429b(ads2);
                        }
                        for (int i4 = 0; i4 < ads.size() && i4 < Integer.MAX_VALUE; i4++) {
                            CampaignEx campaignEx2 = ads.get(i4);
                            if (campaignEx2.isMraid()) {
                                if (TextUtils.isEmpty(campaignEx2.getMraid().trim())) {
                                    continue;
                                } else {
                                    if (campaignEx2.getAdType() == 287) {
                                        str = ExifInterface.GPS_MEASUREMENT_3D;
                                    } else if (campaignEx2.getAdType() == 94) {
                                        str = "1";
                                    } else {
                                        str = campaignEx2.getAdType() == 42 ? "2" : "";
                                    }
                                    try {
                                        try {
                                            C13145g.m37360a("m_download_start", campaignEx2, "", this.f37621b, str);
                                            String strM37149b = C13098e.m37149b(EnumC13096c.MBRIDGE_700_HTML);
                                            String md5 = SameMD5.getMD5(campaignEx2.getMraid());
                                            if (TextUtils.isEmpty(md5)) {
                                                md5 = String.valueOf(System.currentTimeMillis());
                                            }
                                            File file = new File(strM37149b, md5.concat(".html"));
                                            fileOutputStream = new FileOutputStream(file);
                                            try {
                                                fileOutputStream.write(("<script>" + C13645a.m39758a().m39764b() + "</script>" + campaignEx2.getMraid()).getBytes());
                                                fileOutputStream.flush();
                                                campaignEx2.setMraid(file.getAbsolutePath());
                                                C13145g.m37360a("m_download_end", campaignEx2, "", this.f37621b, str);
                                                try {
                                                    fileOutputStream.close();
                                                    fileOutputStream2 = fileOutputStream;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    fileOutputStream2 = fileOutputStream;
                                                    e.printStackTrace();
                                                    if (fileOutputStream2 != null) {
                                                        try {
                                                            fileOutputStream2.close();
                                                        } catch (IOException e4) {
                                                            e2 = e4;
                                                            if (MBridgeConstans.DEBUG) {
                                                                C13219q0.m37816b("RewardMVVideoAdapter", e2.getMessage());
                                                            }
                                                        }
                                                    }
                                                    return c13610d;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (fileOutputStream != null) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (IOException e5) {
                                                            if (MBridgeConstans.DEBUG) {
                                                                C13219q0.m37816b("RewardMVVideoAdapter", e5.getMessage());
                                                            }
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e6) {
                                                e = e6;
                                                fileOutputStream2 = fileOutputStream;
                                                e.printStackTrace();
                                                campaignEx2.setMraid("");
                                                C13145g.m37360a("m_download_end", campaignEx2, e.getMessage(), this.f37621b, str);
                                                if (fileOutputStream2 != null) {
                                                    fileOutputStream2.close();
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileOutputStream2 = fileOutputStream;
                                                if (fileOutputStream2 != null) {
                                                    fileOutputStream2.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                    }
                                    File file2 = new File(campaignEx2.getMraid());
                                    if (!file2.exists() || !file2.isFile() || !file2.canRead()) {
                                        m39072b("mraid resource write fail", metricsData);
                                    } else if (campaignEx2.getOfferType() == 99) {
                                        if (m39074b(campaignEx2)) {
                                            if (C13182a1.m37596a(campaignEx2.getendcard_url())) {
                                            }
                                            if (C13884b.m41421a()) {
                                                if (C13229v0.m37915c(this.f37620a, campaignEx2.getPackageName())) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 2;
                                                }
                                                campaignEx2.setRtinsType(i2);
                                            }
                                            if (C13092c.m37121a(this.f37620a, campaignEx2)) {
                                                copyOnWriteArrayList.add(campaignEx2);
                                            } else {
                                                c13610d.m39144a(true);
                                                if (ads.size() == 1) {
                                                    C13229v0.m37896a(this.f37621b, campaignEx2, C13088a.f35882x);
                                                    this.f37616U = "APP ALREADY INSTALLED";
                                                } else {
                                                    C13229v0.m37896a(this.f37621b, campaignEx2, C13088a.f35882x);
                                                    this.f37616U = "APP ALREADY INSTALLED";
                                                }
                                            }
                                            m39046a(campaignEx2, metricsData);
                                        } else if (C13182a1.m37596a(campaignEx2.getVideoUrlEncode())) {
                                            this.f37616U = "No video campaign";
                                        } else {
                                            if (C13884b.m41421a()) {
                                                if (C13229v0.m37915c(this.f37620a, campaignEx2.getPackageName())) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 2;
                                                }
                                                campaignEx2.setRtinsType(i2);
                                            }
                                            if (C13092c.m37121a(this.f37620a, campaignEx2)) {
                                                copyOnWriteArrayList.add(campaignEx2);
                                            } else {
                                                c13610d.m39144a(true);
                                                if (ads.size() == 1) {
                                                    C13229v0.m37896a(this.f37621b, campaignEx2, C13088a.f35882x);
                                                    this.f37616U = "APP ALREADY INSTALLED";
                                                } else {
                                                    C13229v0.m37896a(this.f37621b, campaignEx2, C13088a.f35882x);
                                                    this.f37616U = "APP ALREADY INSTALLED";
                                                }
                                            }
                                            m39046a(campaignEx2, metricsData);
                                        }
                                    }
                                }
                            } else if (campaignEx2.getOfferType() == 99) {
                                if (m39074b(campaignEx2)) {
                                    if (C13182a1.m37596a(campaignEx2.getendcard_url()) || !TextUtils.isEmpty(campaignEx2.getMraid())) {
                                        if (C13884b.m41421a() && C13229v0.m37916c(campaignEx2)) {
                                            if (C13229v0.m37915c(this.f37620a, campaignEx2.getPackageName())) {
                                                i2 = 1;
                                            } else {
                                                i2 = 2;
                                            }
                                            campaignEx2.setRtinsType(i2);
                                        }
                                        if (C13092c.m37121a(this.f37620a, campaignEx2)) {
                                            copyOnWriteArrayList.add(campaignEx2);
                                        } else {
                                            c13610d.m39144a(true);
                                            if (ads.size() == 1 || campaignEx2.getFilterCallBackState() != 1) {
                                                C13229v0.m37896a(this.f37621b, campaignEx2, C13088a.f35882x);
                                                this.f37616U = "APP ALREADY INSTALLED";
                                            } else {
                                                c13610d.m39142a(campaignEx2);
                                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                                                copyOnWriteArrayList2.add(campaignEx2);
                                                c13610d.m39143a(copyOnWriteArrayList2);
                                            }
                                        }
                                        m39046a(campaignEx2, metricsData);
                                    } else {
                                        this.f37616U = "No video campaign";
                                    }
                                } else if (C13182a1.m37596a(campaignEx2.getVideoUrlEncode())) {
                                    this.f37616U = "No video campaign";
                                } else {
                                    if (C13884b.m41421a()) {
                                        if (C13229v0.m37915c(this.f37620a, campaignEx2.getPackageName())) {
                                            i2 = 1;
                                        } else {
                                            i2 = 2;
                                        }
                                        campaignEx2.setRtinsType(i2);
                                    }
                                    if (C13092c.m37121a(this.f37620a, campaignEx2)) {
                                        copyOnWriteArrayList.add(campaignEx2);
                                    } else {
                                        c13610d.m39144a(true);
                                        if (ads.size() == 1) {
                                            C13229v0.m37896a(this.f37621b, campaignEx2, C13088a.f35882x);
                                            this.f37616U = "APP ALREADY INSTALLED";
                                        } else {
                                            C13229v0.m37896a(this.f37621b, campaignEx2, C13088a.f35882x);
                                            this.f37616U = "APP ALREADY INSTALLED";
                                        }
                                    }
                                    m39046a(campaignEx2, metricsData);
                                }
                            }
                        }
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e8) {
                            e2 = e8;
                            if (MBridgeConstans.DEBUG) {
                                C13219q0.m37816b("RewardMVVideoAdapter", e2.getMessage());
                            }
                        }
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
            }
        }
        return c13610d;
    }

    /* JADX INFO: renamed from: b */
    private void m39070b() {
        if (C14201a.m42411a() != null) {
            try {
                C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
                if (c13635gM39718d == null) {
                    c13635gM39718d = C13636h.m39706b().m39708a();
                }
                C14201a.m42411a().m42416a(c13635gM39718d.m39486c0() * 1000, this.f37621b);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m39071b(C13154c c13154c) {
        if (this.f37607L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 18;
            if (c13154c != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", c13154c.m37463t());
                messageObtain.setData(bundle);
            }
            this.f37607L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m39072b(String str, C13154c c13154c) {
        if (this.f37607L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            if (c13154c != null) {
                c13154c.m37430b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", c13154c.m37463t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.f37607L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.f37607L.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m39073b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f37623d += list.size();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        C14223c c14223c = this.f37631l;
        if (c14223c == null || this.f37623d > c14223c.m42748r()) {
            this.f37623d = 0;
        }
        if (C13182a1.m37597b(this.f37621b)) {
            C13613a.m39174a(this.f37621b, this.f37623d);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m39074b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m39077c() {
        try {
            C13019i.m36701a(C13017g.m36693a(this.f37620a)).m36704a(this.f37621b);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m39078c(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            C13154c metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("result", 1);
                c13157e.m37501a("timeout", Integer.valueOf(this.f37625f));
                c13157e.m37501a("hst", m39091k());
                metricsData.m37429b(campaignUnit.getAds());
                metricsData.m37423a("2000126", c13157e);
                campaignUnit.setLocalRequestId(metricsData.m37463t());
                C13624a.m39351a().m39354a("2000126", metricsData);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m39080d() {
        try {
            Map<String, Long> map = C13091b.f35901l;
            if (map == null || map.size() <= 0) {
                return;
            }
            C13091b.f35901l.clear();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m39081d(List<CampaignEx> list) {
        if (this.f37620a == null || list == null || list.size() == 0) {
            return;
        }
        C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(this.f37620a));
        for (int i2 = 0; i2 < list.size(); i2++) {
            CampaignEx campaignEx = list.get(i2);
            if (campaignEx != null) {
                if (!C13884b.m41421a()) {
                    m39044a(c13020jM36706a, campaignEx);
                } else if (C13229v0.m37915c(this.f37620a, campaignEx.getPackageName())) {
                    C12681b.m34599a(campaignEx);
                } else {
                    m39044a(c13020jM36706a, campaignEx);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private String m39082e() {
        return C12681b.m34597a();
    }

    /* JADX INFO: renamed from: i */
    private String m39087i() {
        try {
            return C13182a1.m37597b(C13613a.f37717c0) ? C13613a.f37717c0 : "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    private String m39091k() {
        C13635g c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
        return C13121d.m37226h().m37227a(this.f37598C, TextUtils.isEmpty(this.f37598C) ? c13635gM39714b.m39566t0() : c13635gM39714b.m39394C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m39095n() {
        try {
            if (C13182a1.m37597b(this.f37621b)) {
                C13613a.m39174a(this.f37621b, 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m39104a(boolean z) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM42524b;
        CampaignEx campaignEx;
        if (!z) {
            return this.f37602G;
        }
        if (TextUtils.isEmpty(this.f37603H) && (copyOnWriteArrayListM42524b = C14203b.getInstance().m42524b(this.f37621b)) != null && copyOnWriteArrayListM42524b.size() > 0 && (campaignEx = copyOnWriteArrayListM42524b.get(0)) != null) {
            this.f37603H = campaignEx.getRequestId();
        }
        return this.f37603H;
    }

    /* JADX INFO: renamed from: a */
    public void m39105a(int i2) {
        this.f37636q = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m39106a(int i2, int i3, int i4) {
        this.f37641v = i2;
        this.f37642w = i3;
        this.f37643x = i4;
    }

    /* JADX INFO: renamed from: a */
    public void m39107a(int i2, int i3, boolean z, C13154c c13154c) {
        m39108a(i2, i3, z, "", this.f37596A, c13154c);
    }

    /* JADX INFO: renamed from: a */
    public void m39108a(int i2, int i3, boolean z, String str, boolean z2, C13154c c13154c) {
        CampaignEx campaignEx;
        this.f37624e = i2;
        this.f37625f = i3;
        this.f37626g = z;
        this.f37598C = str;
        this.f37596A = z2;
        boolean zM38711b = false;
        this.f37615T = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f37645z;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.f37645z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.f37645z.clear();
        }
        List<CampaignEx> list = this.f37617V;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f37618W;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.f37610O = false;
        this.f37611P = false;
        synchronized (this.f37634o) {
            if (this.f37612Q) {
                this.f37612Q = false;
            }
        }
        this.f37614S = false;
        this.f37613R = false;
        try {
            zM38711b = C13384a.m38711b(this.f37620a);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
        if (!zM38711b) {
            C13082b c13082bM37011a = C13081a.m37011a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (c13154c != null) {
                c13154c.m37422a(c13082bM37011a);
            }
            m39072b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", c13154c);
            return;
        }
        if (this.f37620a == null) {
            C13082b c13082bM37011a2 = C13081a.m37011a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (c13154c != null) {
                c13154c.m37422a(c13082bM37011a2);
            }
            m39072b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", c13154c);
            return;
        }
        if (C13182a1.m37596a(this.f37621b)) {
            C13082b c13082bM37011a3 = C13081a.m37011a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (c13154c != null) {
                c13154c.m37422a(c13082bM37011a3);
            }
            m39072b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", c13154c);
            return;
        }
        if (this.f37631l == null) {
            C13082b c13082bM37011a4 = C13081a.m37011a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
            if (c13154c != null) {
                c13154c.m37422a(c13082bM37011a4);
            }
            m39072b("RewardUnitSetting is null", c13154c);
            return;
        }
        m39080d();
        m39077c();
        C13219q0.m37818c("RewardMVVideoAdapter", "load 开始清除过期数据");
        m39070b();
        m39115a(str, z2, c13154c);
    }

    /* JADX INFO: renamed from: a */
    public void m39109a(int i2, String str) {
        this.f37605J = i2;
        this.f37606K = str;
    }

    /* JADX INFO: renamed from: a */
    public void m39110a(InterfaceC13607a interfaceC13607a) {
        this.f37629j = interfaceC13607a;
    }

    /* JADX INFO: renamed from: a */
    public void m39111a(C13613a.j jVar) {
        this.f37630k = jVar;
    }

    /* JADX INFO: renamed from: a */
    public void m39112a(InterfaceC13939h interfaceC13939h, String str, String str2, int i2, String str3, C13154c c13154c) {
        boolean z;
        try {
            this.f37628i = interfaceC13939h;
            if (this.f37620a != null && !C13182a1.m37596a(this.f37621b)) {
                Intent intent = new Intent(this.f37620a, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBridgeConstans.UNIT_ID, this.f37621b);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f37622c);
                intent.putExtra(MBridgeConstans.REWARD_ID, str);
                intent.putExtra(MBridgeConstans.MUTE_STATE, i2);
                intent.putExtra(MBridgeConstans.IS_IV, this.f37637r);
                intent.putExtra(MBridgeConstans.IS_BID, this.f37638s);
                intent.putExtra(MBridgeConstans.EXTRA_DATA, str3);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM42524b = C14203b.getInstance().m42524b(this.f37621b);
                if (copyOnWriteArrayListM42524b == null || copyOnWriteArrayListM42524b.size() <= 0) {
                    InterfaceC13939h interfaceC13939h2 = this.f37628i;
                    if (interfaceC13939h2 != null) {
                        interfaceC13939h2.mo39291a(c13154c, "load failed");
                        return;
                    }
                    z = false;
                } else {
                    CampaignEx campaignEx = copyOnWriteArrayListM42524b.get(0);
                    z = true;
                    if (copyOnWriteArrayListM42524b.size() == 1 && !C13092c.m37121a(this.f37620a, campaignEx) && campaignEx.getFilterAdsShowCallState() == 1) {
                        C14201a.m42411a().m42430b(this.f37621b, campaignEx);
                        InterfaceC13939h interfaceC13939h3 = this.f37628i;
                        if (interfaceC13939h3 != null) {
                            interfaceC13939h3.mo39291a(c13154c, "show_campaign_filtered");
                            return;
                        }
                    }
                    if (campaignEx != null) {
                        this.f37603H = campaignEx.getRequestId();
                    }
                    if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z = false;
                    }
                    m39042a();
                }
                intent.putExtra(MBridgeConstans.IS_BIG_OFFER, z);
                if (this.f37637r) {
                    intent.putExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, this.f37641v);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, this.f37642w);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE, this.f37643x);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBridgeConstans.USER_ID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.f37622c, this.f37621b, this.f37631l);
                try {
                    if (C13223s0.m37831a().m37842a("a_u_a_c_f_s", false) && C13008c.m36588n() != null && C13008c.m36588n().m36546f() != null) {
                        Activity activity = (Activity) C13008c.m36588n().m36546f();
                        C13219q0.m37818c("RewardMVVideoAdapter", activity.getClass().getSimpleName() + " start MBRewardVideoActivity");
                        activity.startActivity(intent);
                        return;
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b("RewardMVVideoAdapter", th.getMessage());
                }
                intent.addFlags(268435456);
                this.f37620a.startActivity(intent);
                return;
            }
            InterfaceC13939h interfaceC13939h4 = this.f37628i;
            if (interfaceC13939h4 != null) {
                interfaceC13939h4.mo39291a(c13154c, "context or unitid is null");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            InterfaceC13939h interfaceC13939h5 = this.f37628i;
            if (interfaceC13939h5 != null) {
                interfaceC13939h5.mo39291a(c13154c, "show failed, exception is " + e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39113a(C14223c c14223c) {
        try {
            this.f37631l = c14223c;
            if (c14223c == null || c14223c.m42742o() * 1000 == C13088a.f35846L) {
                return;
            }
            C13088a.f35846L = this.f37631l.m42742o() * 1000;
        } catch (Throwable th) {
            C13219q0.m37817b("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39114a(String str, C13154c c13154c) {
        if (this.f37631l != null && TextUtils.isEmpty(str)) {
            int iM42746q = this.f37631l.m42746q() * 1000;
            List<CampaignEx> list = this.f37619X;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.f37619X.get(0).getTimestamp() < iM42746q) {
                    m39072b("hit ltorwc", c13154c);
                    return;
                }
            }
        }
        m39124b(str, this.f37596A, c13154c);
    }

    /* JADX INFO: renamed from: a */
    public void m39115a(String str, boolean z, C13154c c13154c) {
        C13167a.m37547f().execute(new i(str, c13154c));
        if (this.f37607L == null) {
            m39124b(str, z, c13154c);
            return;
        }
        h hVar = new h(str, c13154c);
        this.f37599D = hVar;
        this.f37607L.postDelayed(hVar, 90000L);
    }

    /* JADX INFO: renamed from: a */
    public void m39116a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        CampaignUnit campaignUnit = this.f37644y;
        if (campaignUnit != null) {
            m39058a(campaignUnit.getSessionId());
        }
        m39073b(copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            C13219q0.m37818c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
            m39059a(this.f37622c, this.f37621b, copyOnWriteArrayList);
        }
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        this.f37645z = copyOnWriteArrayList;
        m39045a(campaignEx);
    }

    /* JADX INFO: renamed from: a */
    public void m39117a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z, boolean z2, boolean z3) {
        C13154c metricsData;
        try {
            if (z2) {
                this.f37617V = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.f37618W = copyOnWriteArrayList2;
                metricsData = m39038a((List<CampaignEx>) copyOnWriteArrayList2);
            } else {
                metricsData = this.f37644y.getMetricsData();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardMVVideoAdapter", e2.getMessage());
            }
            metricsData = null;
        }
        m39047a(this.f37644y, copyOnWriteArrayList);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            C13219q0.m37818c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
            if (TextUtils.isEmpty(this.f37616U)) {
                this.f37616U = "APP ALREADY INSTALLED";
            }
            m39043a(this.f37616U.contains("INSTALL") ? 880021 : 880003, this.f37616U, metricsData);
            return;
        }
        C13219q0.m37818c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
        if (z) {
            C13157e c13157e = new C13157e();
            if (z2) {
                c13157e.m37501a("cache", 1);
            } else {
                c13157e.m37501a("cache", 2);
            }
            if (metricsData != null) {
                metricsData.m37423a("2000127", c13157e);
                metricsData.m37423a("2000048", c13157e);
            }
            m39048a(metricsData);
        }
        List<CampaignEx> listM42426b = C14201a.m42411a().m42426b(this.f37621b, 1, this.f37638s);
        if (listM42426b != null && listM42426b.size() > 0 && metricsData != null) {
            C13157e c13157e2 = new C13157e();
            CampaignEx campaignEx = copyOnWriteArrayList.get(0);
            c13157e2.m37501a("cid", campaignEx.getId());
            c13157e2.m37501a("price", "");
            c13157e2.m37501a("bid_tk", this.f37598C);
            c13157e2.m37501a("lrid", campaignEx.getLocalRequestId());
            CampaignEx campaignEx2 = listM42426b.get(0);
            c13157e2.m37501a("cid_old", C13092c.m37117a(listM42426b));
            c13157e2.m37501a("price_old", "");
            c13157e2.m37501a("bid_tk_old", campaignEx2.getBidToken());
            c13157e2.m37501a("lrid_old", campaignEx2.getLocalRequestId());
            metricsData.m37423a("m_load_overwrite", c13157e2);
            C13624a.m39351a().m39354a("m_load_overwrite", metricsData);
        }
        if (z3) {
            m39116a(copyOnWriteArrayList);
        } else {
            this.f37616U = "campaign filtered";
            m39043a(880021, "campaign filtered", metricsData);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m39118a(CampaignEx campaignEx, boolean z, C13082b c13082b, int i2, C13154c c13154c) {
        C13609c c13609c;
        C13154c c13154c2;
        C13001c c13001c;
        C13001c c13001c2 = new C13001c();
        C13612a c13612a = new C13612a(this.f37621b, this.f37637r);
        boolean z2 = false;
        if (c13612a.m39160a(this.f37598C)) {
            return false;
        }
        if (!this.f37615T) {
            this.f37615T = true;
            c13001c2 = c13612a.m39156a(this.f37598C, c13154c, campaignEx, c13082b, i2, this);
            c13154c2 = c13154c;
            c13609c = this;
            if (c13001c2 != null && c13001c2.m36521g() > C13001c.f35463i) {
                if (c13001c2.m36515c() != null && c13001c2.m36515c().size() > 0) {
                    m39117a(c13001c2.m36515c(), true, true, true);
                } else if (c13001c2.m36521g() == C13001c.f35465k && c13082b != null) {
                    c13082b.m37016a(C13081a.m37013b(880038));
                    c13082b.m37026d(c13001c2.m36519e());
                }
            }
            c13001c = c13001c2;
            c13612a.m39157a(c13154c2, c13609c.f37598C, c13001c, (List<C12999a.b>) null, (JSONObject) null, 3);
            return z2;
        }
        c13609c = this;
        c13154c2 = c13154c;
        c13001c2.m36518d("isCandidate:false");
        c13001c2.m36510a(C13001c.f35465k);
        c13001c = c13001c2;
        z2 = true;
        c13612a.m39157a(c13154c2, c13609c.f37598C, c13001c, (List<C12999a.b>) null, (JSONObject) null, 3);
        return z2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m39119a(List<CampaignEx> list, boolean z) {
        if (list == null || list.size() <= 0) {
            C13219q0.m37813a("RewardVideoController", "数据为空");
        } else {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && C14203b.getInstance().m42520a(94, this.f37621b, list)) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            C13219q0.m37818c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            C13219q0.m37818c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f37621b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        C13219q0.m37813a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        C13219q0.m37818c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j())) {
                        C13219q0.m37813a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f37621b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().m36781j())) {
                        C13219q0.m37813a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m39120a(List<CampaignEx> list, boolean z, int i2) {
        return m39122a(list, z, i2, false, false);
    }

    /* JADX INFO: renamed from: a */
    public boolean m39121a(List<CampaignEx> list, boolean z, int i2, boolean z2) {
        return m39122a(list, z, i2, false, z2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m39122a(List<CampaignEx> list, boolean z, int i2, boolean z2, boolean z3) {
        C13154c c13154c = new C13154c();
        C13157e c13157e = new C13157e();
        if (list == null || list.size() <= 0) {
            c13157e.m37501a(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, "is_ready_crwtpl_empty");
            c13157e.m37501a("reason", "campaign list is empty error");
            c13157e.m37501a("type", 8);
        } else {
            CampaignEx campaignEx = list.get(0);
            c13154c.m37446i(campaignEx.getCurrentLocalRid());
            boolean zM42522a = C14203b.getInstance().m42522a(94, this.f37621b, this.f37638s, list.size(), z, i2, list, z2, c13157e);
            c13157e.m37501a(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, "is_ready_crwtpl_" + zM42522a);
            if (zM42522a) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            C13219q0.m37818c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            C13219q0.m37818c("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f37621b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                    if (z3) {
                        c13157e.m37501a(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, "is_ready_crwtpl_" + zM42522a);
                        c13157e.m37501a("reason", "h5 big template checkPreLoadState error");
                        c13157e.m37501a("type", 5);
                        m39050a(c13154c, c13157e, list);
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        C13219q0.m37818c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j())) {
                        return true;
                    }
                    String str = this.f37621b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().m36781j();
                    if (z3) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str, true);
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(str)) {
                        return true;
                    }
                    if (z3) {
                        c13157e.m37501a(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, "is_ready_crwtpl_" + zM42522a);
                        c13157e.m37501a("reason", "h5 template checkPreLoadState error");
                        c13157e.m37501a("type", 5);
                        m39050a(c13154c, c13157e, list);
                    }
                }
            }
        }
        m39050a(c13154c, c13157e, list);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m39123b(String str) {
        this.f37604I = str;
    }

    /* JADX INFO: renamed from: b */
    public void m39124b(String str, boolean z, C13154c c13154c) {
        boolean zM42543a;
        try {
            if (this.f37620a == null) {
                C13082b c13082bM37011a = C13081a.m37011a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (c13154c != null) {
                    c13154c.m37422a(c13082bM37011a);
                }
                m39072b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", c13154c);
                return;
            }
            if (C13182a1.m37596a(this.f37621b)) {
                C13082b c13082bM37011a2 = C13081a.m37011a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (c13154c != null) {
                    c13154c.m37422a(c13082bM37011a2);
                }
                m39072b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", c13154c);
                return;
            }
            if (this.f37631l == null) {
                C13082b c13082bM37011a3 = C13081a.m37011a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (c13154c != null) {
                    c13154c.m37422a(c13082bM37011a3);
                }
                m39072b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", c13154c);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.f37597B < this.f37631l.m42744p() * 1000) {
                    C13082b c13082bM37011a4 = C13081a.m37011a(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (c13154c != null) {
                        c13154c.m37422a(c13082bM37011a4);
                        c13154c.m37430b(true);
                    }
                    m39072b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", c13154c);
                    return;
                }
            }
            C13126e c13126eM39150a = new C13611e(this.f37622c, this.f37621b, this.f37637r, this.f37631l, c13154c != null ? c13154c.m37463t() : "").m39150a(this.f37626g, this.f37627h, this.f37623d, m39087i(), m39082e(), this.f37640u, str, z, this.f37641v);
            if (c13126eM39150a == null) {
                C13082b c13082bM37011a5 = C13081a.m37011a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (c13154c != null) {
                    c13154c.m37422a(c13082bM37011a5);
                }
                m39072b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", c13154c);
                return;
            }
            if (this.f37605J != 0) {
                c13126eM39150a.m37245a("r_index", this.f37605J + "");
            }
            if (!TextUtils.isEmpty(this.f37606K)) {
                c13126eM39150a.m37245a("invalid_ad_ids", this.f37606K);
            }
            this.f37609N = System.currentTimeMillis();
            C13626b c13626b = new C13626b(this.f37620a);
            b bVar = new b(c13154c);
            bVar.m39364a(str);
            bVar.setUnitId(this.f37621b);
            bVar.setPlacementId(this.f37622c);
            boolean z2 = this.f37637r;
            int i2 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            bVar.setAdType(z2 ? 287 : 94);
            bVar.m39363a(c13154c);
            try {
                C14211j c14211jM42542a = C14211j.m42542a();
                if (!this.f37637r) {
                    i2 = 94;
                }
                zM42543a = c14211jM42542a.m42543a(i2);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e2.getMessage());
                }
                zM42543a = false;
            }
            boolean z3 = zM42543a;
            try {
                if (C13120c.m37214b().m37215a(c13126eM39150a) == null) {
                    C13157e c13157e = new C13157e();
                    c13157e.m37501a("hst", m39091k());
                    if (this.f37605J != 0) {
                        c13157e.m37501a("r_index", this.f37605J + "");
                    }
                    c13154c.m37423a("2000125", c13157e);
                    C13624a.m39351a().m39354a("2000125", c13154c);
                }
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    e3.printStackTrace();
                }
            }
            if (z3) {
                c13626b.getCampaign(1, str, c13126eM39150a, bVar, C13092c.m37115a(this.f37625f * 1000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
            } else {
                c13626b.choiceV3OrV5BySetting(1, c13126eM39150a, bVar, str, C13092c.m37115a(this.f37625f * 1000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            m39072b("Load exception", c13154c);
            m39095n();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m39125b(boolean z) {
        C13154c c13154c = new C13154c();
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM42427b = C14201a.m42411a().m42427b(this.f37621b, 1, this.f37638s, this.f37639t);
        if (copyOnWriteArrayListM42427b == null || copyOnWriteArrayListM42427b.size() <= 0) {
            C13219q0.m37813a("RewardVideoController", "database has not can use data");
            if (z) {
                C13157e c13157e = new C13157e();
                c13157e.m37501a(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, "is_ready_cse");
                c13157e.m37501a("reason", "no effective campaign list");
                c13157e.m37501a("type", 8);
                m39050a(c13154c, c13157e, copyOnWriteArrayListM42427b);
            }
            return false;
        }
        CampaignEx campaignEx = copyOnWriteArrayListM42427b.get(0);
        c13154c.m37446i(campaignEx.getCurrentLocalRid());
        int iM42412a = C14201a.m42411a().m42412a(this.f37621b, 1, this.f37638s, this.f37639t);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || copyOnWriteArrayListM42427b.size() >= iM42412a) {
            boolean zM39121a = m39121a(copyOnWriteArrayListM42427b, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z);
            if (z) {
                m39064a(zM39121a, c13154c, copyOnWriteArrayListM42427b);
            }
            return zM39121a;
        }
        if (z) {
            C13157e c13157e2 = new C13157e();
            c13157e2.m37501a(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, "is_ready_cltr");
            c13157e2.m37501a("reason", "nscpt error");
            c13157e2.m37501a("type", 8);
            m39050a(c13154c, c13157e2, copyOnWriteArrayListM42427b);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m39126c(String str) {
        this.f37639t = str;
    }

    /* JADX INFO: renamed from: c */
    public void m39127c(List<CampaignEx> list) {
        this.f37619X = list;
    }

    /* JADX INFO: renamed from: c */
    public void m39128c(boolean z) {
        this.f37608M = z;
    }

    /* JADX INFO: renamed from: d */
    public void m39129d(boolean z) {
        this.f37637r = z;
    }

    /* JADX INFO: renamed from: e */
    public void m39130e(boolean z) {
        this.f37638s = z;
    }

    /* JADX INFO: renamed from: f */
    public CopyOnWriteArrayList<CampaignEx> m39131f() {
        return this.f37618W;
    }

    /* JADX INFO: renamed from: f */
    public void m39132f(boolean z) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z || (copyOnWriteArrayList = this.f37645z) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        C14201a.m42411a().m42423a(this.f37621b, this.f37645z);
    }

    /* JADX INFO: renamed from: g */
    public String m39133g() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f37645z;
        return (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) ? C13092c.m37122b(this.f37619X) : C13092c.m37122b(this.f37645z);
    }

    /* JADX INFO: renamed from: g */
    public boolean m39134g(boolean z) {
        if (z) {
            List<CampaignEx> list = this.f37619X;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.f37619X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37621b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().m36781j(), true);
                    }
                }
            }
            C14201a.m42411a().m42425a(this.f37621b, this.f37619X, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f37645z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        for (CampaignEx campaignEx2 : this.f37645z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(1);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().m36781j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37621b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().m36781j(), true);
                }
            }
        }
        C14201a.m42411a().m42425a(this.f37621b, this.f37645z, "load_timeout", 1);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public CopyOnWriteArrayList<CampaignEx> m39135h() {
        return this.f37645z;
    }

    /* JADX INFO: renamed from: h */
    public void m39136h(boolean z) {
        if (z) {
            List<CampaignEx> list = this.f37619X;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.f37619X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37621b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().m36781j(), false);
                    }
                }
            }
            C14201a.m42411a().m42425a(this.f37621b, this.f37619X, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f37645z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx2 : this.f37645z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(0);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().m36781j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37621b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().m36781j(), false);
                }
            }
        }
        C14201a.m42411a().m42425a(this.f37621b, this.f37645z, "load_timeout", 0);
    }

    /* JADX INFO: renamed from: j */
    public String m39137j() {
        return this.f37621b;
    }

    /* JADX INFO: renamed from: l */
    public boolean m39138l() {
        return m39125b(false);
    }

    /* JADX INFO: renamed from: m */
    public boolean m39139m() {
        List<CampaignEx> listM42433c = C14201a.m42411a().m42433c(this.f37621b, 1, this.f37638s, this.f37639t);
        if (listM42433c == null || listM42433c.size() <= 0) {
            C13219q0.m37813a("test_isReay_db", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = listM42433c.get(0);
        int iM42412a = C14201a.m42411a().m42412a(this.f37621b, 1, this.f37638s, this.f37639t);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || listM42433c.size() >= iM42412a) {
            return m39120a(listM42433c, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }
}
