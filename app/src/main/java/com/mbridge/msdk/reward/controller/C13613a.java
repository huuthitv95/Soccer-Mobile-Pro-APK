package com.mbridge.msdk.reward.controller;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bolts.MeasurementEvent;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.cache.C12999a;
import com.mbridge.msdk.foundation.cache.C13001c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.C13069c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13081a;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.p289db.C13012b;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13018h;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.adapter.C13608b;
import com.mbridge.msdk.reward.adapter.C13609c;
import com.mbridge.msdk.reward.adapter.InterfaceC13607a;
import com.mbridge.msdk.reward.candidate.C13612a;
import com.mbridge.msdk.reward.report.metrics.C13624a;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.system.AbstractC13706a;
import com.mbridge.msdk.timer.C13813b;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13933b;
import com.mbridge.msdk.videocommon.C14200a;
import com.mbridge.msdk.videocommon.cache.C14201a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.entity.C14216c;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.mbridge.msdk.videocommon.net.InterfaceC14220c;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a */
/* JADX INFO: compiled from: RewardVideoController.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13613a {

    /* JADX INFO: renamed from: b0 */
    public static String f37716b0 = "";

    /* JADX INFO: renamed from: c0 */
    public static String f37717c0;

    /* JADX INFO: renamed from: d0 */
    private static ConcurrentHashMap<String, Integer> f37718d0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e0 */
    private static ConcurrentHashMap<String, String> f37719e0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f0 */
    public static ConcurrentHashMap<String, i> f37720f0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: I */
    private Queue<Integer> f37729I;

    /* JADX INFO: renamed from: J */
    private String f37730J;

    /* JADX INFO: renamed from: S */
    private CopyOnWriteArrayList<CampaignEx> f37739S;

    /* JADX INFO: renamed from: T */
    private List<CampaignEx> f37740T;

    /* JADX INFO: renamed from: a */
    private Context f37747a;

    /* JADX INFO: renamed from: b */
    private C13609c f37749b;

    /* JADX INFO: renamed from: c */
    private C14223c f37750c;

    /* JADX INFO: renamed from: d */
    private C14221a f37751d;

    /* JADX INFO: renamed from: e */
    private volatile InterVideoOutListener f37752e;

    /* JADX INFO: renamed from: f */
    private volatile h f37753f;

    /* JADX INFO: renamed from: g */
    private String f37754g;

    /* JADX INFO: renamed from: h */
    private String f37755h;

    /* JADX INFO: renamed from: i */
    private MBridgeIds f37756i;

    /* JADX INFO: renamed from: j */
    g f37757j;

    /* JADX INFO: renamed from: k */
    private String f37758k;

    /* JADX INFO: renamed from: l */
    private volatile String f37759l;

    /* JADX INFO: renamed from: m */
    private String f37760m;

    /* JADX INFO: renamed from: q */
    private int f37764q;

    /* JADX INFO: renamed from: r */
    private int f37765r;

    /* JADX INFO: renamed from: s */
    private int f37766s;

    /* JADX INFO: renamed from: x */
    private boolean f37771x;

    /* JADX INFO: renamed from: n */
    private int f37761n = 0;

    /* JADX INFO: renamed from: p */
    private int f37763p = 2;

    /* JADX INFO: renamed from: t */
    private boolean f37767t = false;

    /* JADX INFO: renamed from: u */
    private boolean f37768u = false;

    /* JADX INFO: renamed from: v */
    private boolean f37769v = false;

    /* JADX INFO: renamed from: w */
    private boolean f37770w = false;

    /* JADX INFO: renamed from: y */
    private boolean f37772y = false;

    /* JADX INFO: renamed from: z */
    private String f37773z = "";

    /* JADX INFO: renamed from: A */
    private String f37721A = "";

    /* JADX INFO: renamed from: B */
    private ArrayList<Integer> f37722B = new ArrayList<>(7);

    /* JADX INFO: renamed from: C */
    private boolean f37723C = false;

    /* JADX INFO: renamed from: D */
    private final Object f37724D = new Object();

    /* JADX INFO: renamed from: E */
    public boolean f37725E = false;

    /* JADX INFO: renamed from: F */
    int f37726F = 25;

    /* JADX INFO: renamed from: G */
    int f37727G = 1;

    /* JADX INFO: renamed from: H */
    private List<CampaignEx> f37728H = new ArrayList();

    /* JADX INFO: renamed from: K */
    private C13017g f37731K = null;

    /* JADX INFO: renamed from: L */
    private volatile boolean f37732L = true;

    /* JADX INFO: renamed from: M */
    private volatile boolean f37733M = false;

    /* JADX INFO: renamed from: N */
    private volatile boolean f37734N = false;

    /* JADX INFO: renamed from: O */
    private volatile boolean f37735O = false;

    /* JADX INFO: renamed from: P */
    private volatile boolean f37736P = false;

    /* JADX INFO: renamed from: Q */
    private volatile boolean f37737Q = false;

    /* JADX INFO: renamed from: R */
    private volatile boolean f37738R = false;

    /* JADX INFO: renamed from: U */
    volatile boolean f37741U = false;

    /* JADX INFO: renamed from: V */
    volatile boolean f37742V = false;

    /* JADX INFO: renamed from: W */
    volatile boolean f37743W = false;

    /* JADX INFO: renamed from: X */
    volatile boolean f37744X = false;

    /* JADX INFO: renamed from: Y */
    volatile boolean f37745Y = false;

    /* JADX INFO: renamed from: Z */
    private JSONArray f37746Z = new JSONArray();

    /* JADX INFO: renamed from: a0 */
    private int f37748a0 = 1;

    /* JADX INFO: renamed from: o */
    private Handler f37762o = new HandlerC13614b(this);

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$a */
    /* JADX INFO: compiled from: RewardVideoController.java */
    class a implements InterfaceC14220c {
        a() {
        }

        @Override // com.mbridge.msdk.videocommon.net.InterfaceC14220c
        /* JADX INFO: renamed from: a */
        public void mo39266a(String str) {
        }

        @Override // com.mbridge.msdk.videocommon.net.InterfaceC14220c
        public void onFailed(String str) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b */
    /* JADX INFO: compiled from: RewardVideoController.java */
    class b implements C13608b.h {

        /* JADX INFO: renamed from: a */
        C13154c f37775a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f37776b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f37777c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C13609c f37778d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f37779e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a */
        /* JADX INFO: compiled from: RewardVideoController.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CampaignEx f37781a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ CopyOnWriteArrayList f37782b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37783c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f37784d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f37785e;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardVideoController.java */
            class C15560a implements C13608b.o {
                C15560a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39032a(String str, String str2, String str3, C14200a.a aVar, C13082b c13082b) {
                    a aVar2 = a.this;
                    C13613a c13613a = C13613a.this;
                    c13613a.m39198c(aVar2.f37784d, (List<CampaignEx>) c13613a.f37740T);
                    if (C13613a.this.f37753f == null || C13613a.this.f37744X) {
                        return;
                    }
                    C13613a.this.f37744X = true;
                    c13082b.m37024c("errorCode: 3301 errorMessage: temp preload failed");
                    b bVar = b.this;
                    if (bVar.f37775a == null) {
                        bVar.f37775a = new C13154c();
                    }
                    b bVar2 = b.this;
                    bVar2.f37775a.m37429b(C13613a.this.f37739S);
                    b.this.f37775a.m37422a(c13082b);
                    C13613a.this.f37753f.m39279b(c13082b, b.this.f37775a);
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39033a(String str, String str2, String str3, String str4, String str5, C14200a.a aVar) {
                    a aVar2 = a.this;
                    b bVar = b.this;
                    C13609c c13609c = bVar.f37778d;
                    if (c13609c != null && c13609c.m39120a(aVar2.f37782b, bVar.f37777c, bVar.f37779e)) {
                        if (C13613a.this.f37753f == null || C13613a.this.f37745Y) {
                            return;
                        }
                        C13613a.this.f37745Y = true;
                        a aVar3 = a.this;
                        C13613a.this.m39240a(aVar3.f37782b);
                        C13613a.this.f37753f.m39287d(str2, str3, b.this.f37775a);
                        return;
                    }
                    C13613a c13613a = C13613a.this;
                    c13613a.m39198c(str3, (List<CampaignEx>) c13613a.f37740T);
                    if (C13613a.this.f37753f == null || C13613a.this.f37744X) {
                        return;
                    }
                    C13613a.this.f37744X = true;
                    C13082b c13082bM37011a = C13081a.m37011a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f37775a == null) {
                        bVar2.f37775a = new C13154c();
                    }
                    a aVar4 = a.this;
                    b.this.f37775a.m37429b(aVar4.f37782b);
                    b.this.f37775a.m37422a(c13082bM37011a);
                    C13613a.this.f37753f.m39279b(c13082bM37011a, b.this.f37775a);
                }
            }

            a(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2, String str3) {
                this.f37781a = campaignEx;
                this.f37782b = copyOnWriteArrayList;
                this.f37783c = str;
                this.f37784d = str2;
                this.f37785e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13608b.m39002b().m39010a(C13613a.this.f37772y, C13613a.this.f37762o, C13613a.this.f37767t, C13613a.this.f37768u, null, this.f37781a.getRewardTemplateMode().m36781j(), C13613a.this.f37763p, b.this.f37776b, this.f37782b, H5DownLoadManager.getInstance().getH5ResAddress(this.f37781a.getRewardTemplateMode().m36781j()), this.f37783c, this.f37784d, this.f37785e, this.f37781a.getRequestIdNotice(), C13613a.this.f37750c, new C15560a());
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardVideoController.java */
        class RunnableC15561b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f37788a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f37789b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37790c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ CopyOnWriteArrayList f37791d;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b$a */
            /* JADX INFO: compiled from: RewardVideoController.java */
            class a implements C13608b.o {
                a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39032a(String str, String str2, String str3, C14200a.a aVar, C13082b c13082b) {
                    RunnableC15561b runnableC15561b = RunnableC15561b.this;
                    C13613a c13613a = C13613a.this;
                    c13613a.m39198c(runnableC15561b.f37790c, (List<CampaignEx>) c13613a.f37740T);
                    if (C13613a.this.f37753f == null || C13613a.this.f37744X) {
                        return;
                    }
                    C13613a.this.f37744X = true;
                    if (c13082b != null) {
                        c13082b.m37024c("errorCode: 3302 errorMessage: tpl preload failed");
                    }
                    b bVar = b.this;
                    if (bVar.f37775a == null) {
                        bVar.f37775a = new C13154c();
                    }
                    RunnableC15561b runnableC15561b2 = RunnableC15561b.this;
                    b.this.f37775a.m37429b(runnableC15561b2.f37791d);
                    b.this.f37775a.m37422a(c13082b);
                    C13613a.this.f37753f.m39279b(c13082b, b.this.f37775a);
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39033a(String str, String str2, String str3, String str4, String str5, C14200a.a aVar) {
                    RunnableC15561b runnableC15561b = RunnableC15561b.this;
                    b bVar = b.this;
                    C13609c c13609c = bVar.f37778d;
                    if (c13609c != null && c13609c.m39120a(runnableC15561b.f37791d, bVar.f37777c, bVar.f37779e)) {
                        if (C13613a.this.f37753f == null || C13613a.this.f37745Y) {
                            return;
                        }
                        C13613a.this.f37745Y = true;
                        C13219q0.m37813a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        RunnableC15561b runnableC15561b2 = RunnableC15561b.this;
                        C13613a.this.m39240a(runnableC15561b2.f37791d);
                        RunnableC15561b runnableC15561b3 = RunnableC15561b.this;
                        C13154c c13154c = b.this.f37775a;
                        if (c13154c != null) {
                            c13154c.m37429b(runnableC15561b3.f37791d);
                        }
                        C13613a.this.f37753f.m39287d(str2, str3, b.this.f37775a);
                        return;
                    }
                    C13613a c13613a = C13613a.this;
                    c13613a.m39198c(str3, (List<CampaignEx>) c13613a.f37740T);
                    if (C13613a.this.f37753f == null || C13613a.this.f37744X) {
                        return;
                    }
                    C13613a.this.f37744X = true;
                    C13082b c13082bM37011a = C13081a.m37011a(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f37775a == null) {
                        bVar2.f37775a = new C13154c();
                    }
                    b.this.f37775a.m37422a(c13082bM37011a);
                    RunnableC15561b runnableC15561b4 = RunnableC15561b.this;
                    b.this.f37775a.m37429b(runnableC15561b4.f37791d);
                    C13613a.this.f37753f.m39279b(c13082bM37011a, b.this.f37775a);
                }
            }

            RunnableC15561b(String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f37788a = str;
                this.f37789b = str2;
                this.f37790c = str3;
                this.f37791d = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13608b.m39002b().m39011a(C13613a.this.f37772y, C13613a.this.f37762o, C13613a.this.f37767t, C13613a.this.f37768u, this.f37788a, b.this.f37776b.getRequestIdNotice(), this.f37789b, this.f37790c, b.this.f37776b.getCMPTEntryUrl(), C13613a.this.f37763p, b.this.f37776b, this.f37791d, H5DownLoadManager.getInstance().getH5ResAddress(b.this.f37776b.getCMPTEntryUrl()), this.f37790c, C13613a.this.f37750c, new a(), true);
            }
        }

        b(CampaignEx campaignEx, boolean z, C13609c c13609c, int i) {
            this.f37776b = campaignEx;
            this.f37777c = z;
            this.f37778d = c13609c;
            this.f37779e = i;
            this.f37775a = C13156d.m37475b().m37495c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.h
        /* JADX INFO: renamed from: a */
        public void mo39013a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            C13613a.this.f37741U = true;
            if (this.f37777c) {
                if (!C13613a.this.f37742V || C13613a.this.f37743W || C13613a.this.f37762o == null) {
                    return;
                }
                C13613a.this.f37743W = true;
                C13613a.this.f37762o.post(new RunnableC15561b(str3, str, str2, copyOnWriteArrayList));
                return;
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j()) || campaignEx.getRewardTemplateMode().m36781j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || C13613a.this.f37762o == null) {
                    C13609c c13609c = this.f37778d;
                    if (c13609c == null || !c13609c.m39120a(copyOnWriteArrayList, this.f37777c, this.f37779e)) {
                        C13613a c13613a = C13613a.this;
                        c13613a.m39198c(str2, (List<CampaignEx>) c13613a.f37740T);
                        if (C13613a.this.f37753f != null && !C13613a.this.f37744X) {
                            C13613a.this.f37744X = true;
                            C13082b c13082bM37011a = C13081a.m37011a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f37775a == null) {
                                this.f37775a = new C13154c();
                            }
                            this.f37775a.m37429b(C13613a.this.f37739S);
                            this.f37775a.m37422a(c13082bM37011a);
                            C13613a.this.f37753f.m39279b(c13082bM37011a, this.f37775a);
                        }
                    } else if (C13613a.this.f37753f != null && !C13613a.this.f37745Y) {
                        C13613a.this.f37745Y = true;
                        C13219q0.m37813a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        C13613a.this.m39240a(copyOnWriteArrayList);
                        C13154c c13154c = this.f37775a;
                        if (c13154c != null) {
                            c13154c.m37429b(copyOnWriteArrayList);
                        }
                        C13613a.this.f37753f.m39287d(str, str2, this.f37775a);
                    }
                } else {
                    C13613a.this.f37762o.post(new a(campaignEx, copyOnWriteArrayList, str, str2, str3));
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.h
        /* JADX INFO: renamed from: a */
        public void mo39014a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, C13082b c13082b) {
            C13613a.this.f37741U = false;
            C13613a c13613a = C13613a.this;
            c13613a.m39198c(c13613a.f37755h, (List<CampaignEx>) C13613a.this.f37740T);
            if (C13613a.this.f37753f == null || C13613a.this.f37744X) {
                return;
            }
            C13613a.this.f37744X = true;
            if (this.f37775a == null) {
                this.f37775a = new C13154c();
            }
            this.f37775a.m37429b(copyOnWriteArrayList);
            if (c13082b != null) {
                c13082b.m37024c("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f37775a.m37422a(c13082b);
            C13613a.this.f37753f.m39279b(c13082b, this.f37775a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$c */
    /* JADX INFO: compiled from: RewardVideoController.java */
    /* JADX INFO: loaded from: classes9.dex */
    class c implements C13608b.n {

        /* JADX INFO: renamed from: a */
        C13154c f37794a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f37795b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CopyOnWriteArrayList f37796c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f37797d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f37798e;

        c(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, int i) {
            this.f37795b = campaignEx;
            this.f37796c = copyOnWriteArrayList;
            this.f37797d = z;
            this.f37798e = i;
            this.f37794a = C13156d.m37475b().m37495c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.n
        /* JADX INFO: renamed from: a */
        public void mo39030a(String str, String str2, C13082b c13082b) {
            String unitId = c13082b == null ? "" : c13082b.m37030j().getUnitId();
            C13613a c13613a = C13613a.this;
            c13613a.m39198c(unitId, (List<CampaignEx>) c13613a.f37740T);
            if (c13082b != null) {
                c13082b.m37024c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (this.f37794a == null) {
                this.f37794a = new C13154c();
            }
            this.f37794a.m37429b(this.f37796c);
            this.f37794a.m37422a(c13082b);
            if (!this.f37797d && C13613a.this.f37753f != null) {
                if (C13613a.this.f37744X) {
                    return;
                }
                C13613a.this.f37744X = true;
                C13613a.this.f37753f.m39279b(c13082b, this.f37794a);
                return;
            }
            if (this.f37798e != 1 || C13613a.this.f37744X || C13613a.this.f37753f == null) {
                return;
            }
            C13613a.this.f37744X = true;
            C13613a.this.f37753f.m39279b(c13082b, this.f37794a);
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.n
        /* JADX INFO: renamed from: a */
        public void mo39031a(String str, String str2, String str3, String str4) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d */
    /* JADX INFO: compiled from: RewardVideoController.java */
    class d implements C13608b.n {

        /* JADX INFO: renamed from: a */
        C13154c f37800a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f37801b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CopyOnWriteArrayList f37802c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C13609c f37803d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f37804e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f37805f;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a */
        /* JADX INFO: compiled from: RewardVideoController.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f37807a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f37808b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37809c;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardVideoController.java */
            class C15562a implements C13608b.o {
                C15562a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39032a(String str, String str2, String str3, C14200a.a aVar, C13082b c13082b) {
                    a aVar2 = a.this;
                    C13613a c13613a = C13613a.this;
                    c13613a.m39198c(aVar2.f37809c, (List<CampaignEx>) c13613a.f37740T);
                    if (C13613a.this.f37753f == null || C13613a.this.f37744X) {
                        return;
                    }
                    C13613a.this.f37744X = true;
                    if (c13082b != null) {
                        c13082b.m37024c("errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    d dVar = d.this;
                    if (dVar.f37800a == null) {
                        dVar.f37800a = new C13154c();
                    }
                    d dVar2 = d.this;
                    dVar2.f37800a.m37429b(dVar2.f37802c);
                    d.this.f37800a.m37422a(c13082b);
                    C13613a.this.f37753f.m39279b(c13082b, d.this.f37800a);
                }

                @Override // com.mbridge.msdk.reward.adapter.C13608b.o
                /* JADX INFO: renamed from: a */
                public void mo39033a(String str, String str2, String str3, String str4, String str5, C14200a.a aVar) {
                    d dVar = d.this;
                    C13609c c13609c = dVar.f37803d;
                    if (c13609c != null && c13609c.m39120a(dVar.f37802c, dVar.f37804e, dVar.f37805f)) {
                        if (C13613a.this.f37753f == null || C13613a.this.f37745Y) {
                            return;
                        }
                        C13613a.this.f37745Y = true;
                        C13219q0.m37813a("RewardVideoController", "Cache onVideoLoadSuccess");
                        d dVar2 = d.this;
                        C13613a.this.m39240a(dVar2.f37802c);
                        d dVar3 = d.this;
                        C13154c c13154c = dVar3.f37800a;
                        if (c13154c != null) {
                            c13154c.m37429b(dVar3.f37802c);
                        }
                        C13613a.this.f37753f.m39287d(str2, str3, d.this.f37800a);
                        return;
                    }
                    C13613a c13613a = C13613a.this;
                    c13613a.m39198c(str3, (List<CampaignEx>) c13613a.f37740T);
                    if (C13613a.this.f37753f == null || C13613a.this.f37744X) {
                        return;
                    }
                    C13613a.this.f37744X = true;
                    C13082b c13082bM37011a = C13081a.m37011a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    d dVar4 = d.this;
                    if (dVar4.f37800a == null) {
                        dVar4.f37800a = new C13154c();
                    }
                    d dVar5 = d.this;
                    dVar5.f37800a.m37429b(dVar5.f37802c);
                    d.this.f37800a.m37422a(c13082bM37011a);
                    C13613a.this.f37753f.m39279b(c13082bM37011a, d.this.f37800a);
                }
            }

            a(String str, String str2, String str3) {
                this.f37807a = str;
                this.f37808b = str2;
                this.f37809c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13608b c13608bM39002b = C13608b.m39002b();
                boolean z = C13613a.this.f37772y;
                Handler handler = C13613a.this.f37762o;
                boolean z2 = C13613a.this.f37767t;
                boolean z3 = C13613a.this.f37768u;
                String str = this.f37807a;
                String requestIdNotice = d.this.f37801b.getRequestIdNotice();
                String str2 = this.f37808b;
                String str3 = this.f37809c;
                String cMPTEntryUrl = d.this.f37801b.getCMPTEntryUrl();
                int i = C13613a.this.f37763p;
                d dVar = d.this;
                c13608bM39002b.m39011a(z, handler, z2, z3, str, requestIdNotice, str2, str3, cMPTEntryUrl, i, dVar.f37801b, dVar.f37802c, H5DownLoadManager.getInstance().getH5ResAddress(d.this.f37801b.getCMPTEntryUrl()), this.f37809c, C13613a.this.f37750c, new C15562a(), true);
            }
        }

        d(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, C13609c c13609c, boolean z, int i) {
            this.f37801b = campaignEx;
            this.f37802c = copyOnWriteArrayList;
            this.f37803d = c13609c;
            this.f37804e = z;
            this.f37805f = i;
            this.f37800a = C13156d.m37475b().m37495c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.n
        /* JADX INFO: renamed from: a */
        public void mo39030a(String str, String str2, C13082b c13082b) {
            String unitId;
            if (c13082b != null) {
                unitId = c13082b.m37030j().getUnitId();
                c13082b.m37024c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                unitId = "";
            }
            C13613a c13613a = C13613a.this;
            c13613a.m39198c(unitId, (List<CampaignEx>) c13613a.f37740T);
            if (this.f37800a == null) {
                this.f37800a = new C13154c();
            }
            this.f37800a.m37422a(c13082b);
            this.f37800a.m37429b(this.f37802c);
            C13613a.this.f37742V = false;
            if (C13613a.this.f37753f == null || C13613a.this.f37744X) {
                return;
            }
            C13613a.this.f37744X = true;
            C13613a.this.f37753f.m39279b(c13082b, this.f37800a);
        }

        @Override // com.mbridge.msdk.reward.adapter.C13608b.n
        /* JADX INFO: renamed from: a */
        public void mo39031a(String str, String str2, String str3, String str4) {
            C13613a.this.f37742V = true;
            if (!C13613a.this.f37741U || C13613a.this.f37743W || C13613a.this.f37762o == null) {
                return;
            }
            C13613a.this.f37743W = true;
            C13613a.this.f37762o.post(new a(str3, str, str2));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$e */
    /* JADX INFO: compiled from: RewardVideoController.java */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C13613a.this.f37731K == null) {
                    C13613a.this.f37731K = C13017g.m36693a(C13008c.m36588n().m36542d());
                }
                C13018h c13018hM36696a = C13018h.m36696a(C13613a.this.f37731K);
                if (c13018hM36696a != null) {
                    c13018hM36696a.m36700b(C13613a.this.f37755h);
                }
            } catch (Throwable unused) {
                C13219q0.m37816b("RewardVideoController", "can't find DailyPlayCapDao");
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$f */
    /* JADX INFO: compiled from: RewardVideoController.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a */
        private final C13609c f37813a;

        /* JADX INFO: renamed from: b */
        private final int f37814b;

        /* JADX INFO: renamed from: c */
        private final boolean f37815c;

        /* JADX INFO: renamed from: d */
        private boolean f37816d = false;

        /* JADX INFO: renamed from: e */
        private int f37817e;

        /* JADX INFO: renamed from: f */
        private String f37818f;

        /* JADX INFO: renamed from: g */
        private C13154c f37819g;

        public f(C13609c c13609c, int i, boolean z, String str, C13154c c13154c) {
            this.f37813a = c13609c;
            this.f37814b = i;
            this.f37815c = z;
            if (c13609c != null) {
                c13609c.m39128c(false);
            }
            this.f37818f = str;
            this.f37819g = c13154c;
        }

        /* JADX INFO: renamed from: a */
        public void m39267a() {
            this.f37816d = true;
        }

        /* JADX INFO: renamed from: a */
        public void m39268a(int i) {
            this.f37817e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37816d) {
                return;
            }
            C13609c c13609c = this.f37813a;
            if (c13609c != null) {
                c13609c.m39128c(true);
            }
            C13219q0.m37816b("RewardVideoController", "adSource=" + this.f37814b + " CommonCancelTimeTask mIsDevCall：" + this.f37815c);
            C13613a.this.m39168a(C13081a.m37011a(880023, "v3 is timeout"), this.f37819g);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$g */
    /* JADX INFO: compiled from: RewardVideoController.java */
    public class g implements InterfaceC13607a {

        /* JADX INFO: renamed from: a */
        private C13609c f37821a;

        /* JADX INFO: renamed from: b */
        private boolean f37822b;

        /* JADX INFO: renamed from: c */
        private f f37823c;

        public g(C13609c c13609c, boolean z) {
            this.f37821a = c13609c;
            this.f37822b = z;
        }

        /* JADX INFO: renamed from: a */
        public void m39269a(f fVar) {
            this.f37823c = fVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.InterfaceC13607a
        /* JADX INFO: renamed from: a */
        public void mo38980a(String str, C13154c c13154c) {
            f fVar = this.f37823c;
            if (fVar != null) {
                fVar.m39267a();
                C13613a.this.f37762o.removeCallbacks(this.f37823c);
            }
            if (C13613a.this.f37753f != null) {
                C13613a.this.f37753f.m39278a(C13613a.this.f37759l, C13613a.this.f37755h, c13154c);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.InterfaceC13607a
        /* JADX INFO: renamed from: a */
        public void mo38981a(List<CampaignEx> list, C13082b c13082b, C13154c c13154c) {
            f fVar = this.f37823c;
            if (fVar != null) {
                fVar.m39267a();
                C13613a.this.f37762o.removeCallbacks(this.f37823c);
            }
            C13609c c13609c = this.f37821a;
            if (c13609c != null) {
                c13609c.m39110a((InterfaceC13607a) null);
                this.f37821a = null;
            }
            C13613a.this.m39240a(list);
            if (C13613a.this.f37753f != null) {
                C13613a.this.f37753f.m39284a(c13082b, c13154c);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.InterfaceC13607a
        /* JADX INFO: renamed from: a */
        public void mo38982a(List<CampaignEx> list, C13154c c13154c) {
            f fVar = this.f37823c;
            if (fVar != null) {
                fVar.m39267a();
                C13613a.this.f37762o.removeCallbacks(this.f37823c);
            }
            C13613a.this.m39240a(list);
            if (C13613a.this.f37753f != null) {
                if (list != null && list.size() == 1) {
                    CampaignEx campaignEx = list.get(0);
                    if (!C13092c.m37121a(C13613a.this.f37747a, campaignEx) && campaignEx.getFilterAdsVideoCallState() == 0) {
                        if (C13613a.this.f37748a0 > 1) {
                            C13613a.m39215m(C13613a.this);
                            return;
                        }
                        C13082b c13082bM37011a = C13081a.m37011a(880020, "load exception second");
                        if (c13154c != null) {
                            c13154c.m37422a(c13082bM37011a);
                            c13154c.m37430b(true);
                        }
                        C13613a.this.f37753f.m39284a(c13082bM37011a, c13154c);
                        return;
                    }
                }
                C13613a.this.f37753f.m39286c(C13613a.this.f37759l, C13613a.this.f37755h, c13154c);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$h */
    /* JADX INFO: compiled from: RewardVideoController.java */
    public final class h {

        /* JADX INFO: renamed from: a */
        private WeakReference<InterVideoOutListener> f37825a;

        /* JADX INFO: renamed from: b */
        private volatile AtomicInteger f37826b;

        /* JADX INFO: renamed from: c */
        private Handler f37827c;

        /* JADX INFO: renamed from: d */
        private String f37828d;

        /* JADX INFO: renamed from: e */
        private boolean f37829e;

        private h(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f37825a = new WeakReference<>(interVideoOutListener);
            this.f37826b = new AtomicInteger(0);
            this.f37827c = handler;
            this.f37828d = str;
        }

        /* synthetic */ h(C13613a c13613a, InterVideoOutListener interVideoOutListener, Handler handler, String str, a aVar) {
            this(interVideoOutListener, handler, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public int m39270a() {
            return this.f37826b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m39272a(int i) {
            this.f37826b.set(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m39277a(String str, C13154c c13154c) {
            this.f37826b.set(2);
            m39282b(str, c13154c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m39278a(String str, String str2, C13154c c13154c) {
            WeakReference<InterVideoOutListener> weakReference = this.f37825a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((this.f37826b.get() != 1 && this.f37826b.get() != 3) || this.f37827c == null || C13613a.this.f37734N) {
                return;
            }
            C13613a.this.f37734N = true;
            C13613a.this.m39176a("2000127", c13154c, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (c13154c != null) {
                    bundle.putString("metrics_data_lrid", c13154c.m37463t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f37827c.sendMessage(messageObtain);
                if (C13223s0.m37831a().m37842a("l_s_i_l_v_s", false)) {
                    m39286c(str, str2, c13154c);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m39279b(C13082b c13082b, C13154c c13154c) {
            WeakReference<InterVideoOutListener> weakReference = this.f37825a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f37826b.get() == 2 || this.f37827c == null) {
                return;
            }
            C13613a.this.f37737Q = true;
            String strM37032l = c13082b != null ? c13082b.m37032l() : "";
            if (strM37032l.contains("resource load timeout")) {
                C13613a.this.f37736P = true;
            }
            if (C13613a.this.f37737Q && C13613a.this.f37736P && !C13613a.this.f37735O) {
                this.f37826b.set(2);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strM37032l;
                    messageObtain.what = 16;
                    if (c13154c != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", c13154c.m37463t());
                        messageObtain.setData(bundle);
                    }
                    this.f37827c.sendMessage(messageObtain);
                }
                if (c13154c == null) {
                    c13154c = new C13154c();
                }
                c13154c.m37425a(true);
                C13613a.this.m39176a("2000047", c13154c, interVideoOutListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m39282b(String str, C13154c c13154c) {
            WeakReference<InterVideoOutListener> weakReference = this.f37825a;
            C13613a.this.m39176a("2000047", c13154c, weakReference != null ? weakReference.get() : null);
            if (this.f37827c != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                if (c13154c != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", c13154c.m37463t());
                    messageObtain.setData(bundle);
                }
                this.f37827c.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m39283b(String str, String str2, C13154c c13154c) {
            WeakReference<InterVideoOutListener> weakReference = this.f37825a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f37827c == null || C13613a.this.f37734N) {
                return;
            }
            C13613a.this.f37734N = true;
            C13613a.this.m39176a("2000127", c13154c, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (c13154c != null) {
                    bundle.putString("metrics_data_lrid", c13154c.m37463t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f37827c.sendMessage(messageObtain);
                if (C13223s0.m37831a().m37842a("l_s_i_l_v_s", false)) {
                    m39287d(str, str2, c13154c);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m39284a(C13082b c13082b, C13154c c13154c) {
            String strM37032l;
            C13154c c13154c2;
            CampaignEx campaignEx;
            if (c13082b == null || c13154c == null) {
                strM37032l = "";
            } else {
                strM37032l = c13082b.m37032l();
                c13154c.m37422a(c13082b);
            }
            if (C13613a.this.f37749b == null || C13613a.this.f37748a0 != 1) {
                c13154c2 = c13154c;
            } else {
                C13613a.this.f37749b.m39110a(C13613a.this.f37757j);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM39131f = C13613a.this.f37749b.m39131f();
                CampaignEx campaignEx2 = (C13613a.this.f37728H == null || C13613a.this.f37728H.size() == 0) ? null : (CampaignEx) C13613a.this.f37728H.get(0);
                if (campaignEx2 != null) {
                    campaignEx = campaignEx2;
                } else if (copyOnWriteArrayListM39131f == null || copyOnWriteArrayListM39131f.size() == 0) {
                    campaignEx = null;
                } else {
                    campaignEx2 = copyOnWriteArrayListM39131f.get(0);
                    campaignEx = campaignEx2;
                }
                if (C13613a.this.f37768u && ((campaignEx == null || TextUtils.isEmpty(campaignEx.getNLRid())) && (copyOnWriteArrayListM39131f == null || copyOnWriteArrayListM39131f.size() == 0))) {
                    c13154c2 = c13154c;
                    if (C13613a.this.f37749b.m39118a(campaignEx, true, c13082b, 2, c13154c2)) {
                        return;
                    }
                } else {
                    c13154c2 = c13154c;
                }
                C13613a.this.f37749b.m39110a((InterfaceC13607a) null);
            }
            Handler handler = this.f37827c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f37825a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f37826b.get() == 2 || this.f37827c == null) {
                return;
            }
            C13613a.this.f37736P = true;
            if (!C13613a.this.f37738R || strM37032l.contains("resource load timeout")) {
                C13613a.this.f37737Q = true;
            }
            if (C13613a.this.f37735O) {
                this.f37826b.set(2);
            }
            if (C13613a.this.f37736P && C13613a.this.f37737Q && !C13613a.this.f37735O) {
                if (C13613a.this.f37748a0 > 1) {
                    C13613a.m39215m(C13613a.this);
                    C13613a.this.f37749b.m39110a(C13613a.this.f37757j);
                    return;
                }
                this.f37826b.set(2);
                C13613a.this.m39176a("2000047", c13154c2, interVideoOutListener);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strM37032l;
                    messageObtain.what = 16;
                    if (c13154c2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", c13154c2.m37463t());
                        messageObtain.setData(bundle);
                    }
                    this.f37827c.sendMessage(messageObtain);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m39285a(boolean z) {
            this.f37829e = z;
        }

        /* JADX INFO: renamed from: c */
        public void m39286c(String str, String str2, C13154c c13154c) {
            Handler handler = this.f37827c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f37825a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f37826b.get() == 2 || this.f37827c == null) {
                return;
            }
            C13613a.m39215m(C13613a.this);
            this.f37826b.set(2);
            if (C13613a.this.f37735O) {
                return;
            }
            C13613a.this.f37735O = true;
            if (c13154c == null) {
                c13154c = new C13154c();
            }
            c13154c.m37429b(C13613a.this.f37728H);
            C13613a.this.m39176a("2000048", c13154c, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", c13154c.m37463t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f37827c.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m39287d(String str, String str2, C13154c c13154c) {
            Handler handler = this.f37827c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f37825a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f37826b.get() == 2 || this.f37827c == null) {
                return;
            }
            if (this.f37826b.get() == 1) {
                this.f37826b.set(3);
            }
            if (C13613a.this.f37735O) {
                return;
            }
            C13613a.this.f37735O = true;
            if (c13154c == null) {
                c13154c = new C13154c();
            }
            c13154c.m37425a(true);
            c13154c.m37429b(C13613a.this.f37728H);
            C13613a.this.m39176a("2000048", c13154c, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", c13154c.m37463t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f37827c.sendMessage(messageObtain);
            }
            if (C13613a.this.f37736P) {
                this.f37826b.set(2);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$i */
    /* JADX INFO: compiled from: RewardVideoController.java */
    public final class i extends C13933b {

        /* JADX INFO: renamed from: c */
        private C13613a f37831c;

        /* JADX INFO: renamed from: d */
        private Handler f37832d;

        /* JADX INFO: renamed from: e */
        private int f37833e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$i$a */
        /* JADX INFO: compiled from: RewardVideoController.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f37831c != null) {
                    i.this.f37831c.m39241a(false, C13156d.m37475b().m37479a(0, C13613a.this.f37767t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, C13613a.this.f37755h, true, 1));
                }
            }
        }

        private i(C13613a c13613a, Handler handler) {
            this.f37833e = 0;
            this.f37831c = c13613a;
            this.f37832d = handler;
        }

        /* synthetic */ i(C13613a c13613a, C13613a c13613a2, Handler handler, a aVar) {
            this(c13613a2, handler);
        }

        @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
        /* JADX INFO: renamed from: a */
        public void mo39289a(int i, String str, String str2) {
            this.f37833e = i;
            C13613a c13613a = this.f37831c;
            if (c13613a == null || c13613a.f37768u || this.f37831c.f37767t || this.f37831c.f37750c == null || !this.f37831c.f37750c.m42705a(this.f37833e) || this.f37831c.f37753f == null || this.f37831c.f37753f.m39270a() == 1 || this.f37831c.f37753f.m39270a() == 3 || C13613a.this.f37722B.contains(Integer.valueOf(this.f37833e))) {
                return;
            }
            C13613a.this.f37722B.add(Integer.valueOf(this.f37833e));
            int iM42719f = this.f37831c.f37750c.m42719f() * 1000;
            if (this.f37833e == 4) {
                iM42719f = 3000;
            }
            Handler handler = this.f37832d;
            if (handler == null) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(), iM42719f);
            } else {
                handler.removeMessages(1001001);
                this.f37832d.sendEmptyMessageDelayed(1001001, iM42719f);
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
        /* JADX INFO: renamed from: a */
        public void mo39290a(C13154c c13154c) {
            C13613a.this.f37725E = false;
            try {
                C13612a c13612a = new C13612a(C13613a.this.f37755h, C13613a.this.f37767t);
                C13613a c13613a = this.f37831c;
                c13612a.m39158a(c13154c.m37463t(), (c13613a == null || c13613a.f37749b == null) ? "" : this.f37831c.f37749b.f37603H, 3, C13613a.f37716b0);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e.getMessage());
                }
            }
            try {
                C13613a c13613a2 = this.f37831c;
                if (c13613a2 != null) {
                    c13613a2.f37723C = true;
                    if (this.f37831c.f37749b != null) {
                        this.f37831c.f37749b.f37603H = "";
                    }
                    this.f37831c.m39260q();
                    if (C13613a.this.f37768u) {
                        C13613a.this.m39233a();
                    }
                    C13613a c13613a3 = C13613a.this;
                    c13613a3.m39177a("2000130", c13154c, c13613a3.f37752e, "");
                    m41686b();
                    if (this.f37831c.f37752e != null) {
                        this.f37831c.f37752e.onAdShow(C13613a.this.f37756i);
                        this.f37833e = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
        /* JADX INFO: renamed from: a */
        public void mo39291a(C13154c c13154c, String str) {
            try {
                C13613a c13613a = C13613a.this;
                c13613a.f37725E = false;
                if (this.f37831c != null) {
                    if (c13613a.f37768u) {
                        C13613a.this.m39233a();
                    }
                    this.f37831c.f37723C = false;
                    C13613a.this.m39177a("2000131", c13154c, this.f37831c.f37752e, str);
                    m41685a();
                    if (this.f37831c.f37752e != null) {
                        try {
                            this.f37831c.f37752e.onShowFail(c13154c, C13613a.this.f37756i, str);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                C13219q0.m37816b("RewardVideoController", e.getMessage());
                            }
                        }
                        this.f37833e = 4;
                    }
                }
            } catch (Exception e2) {
                this.f37833e = 0;
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
        /* JADX INFO: renamed from: a */
        public void mo39292a(C13154c c13154c, boolean z, C14216c c14216c) {
            try {
                C13613a c13613a = this.f37831c;
                if (c13613a != null && c13613a.f37752e != null) {
                    if (c14216c == null) {
                        c14216c = C14216c.m42619a(this.f37831c.f37760m);
                    }
                    if (C13613a.this.f37768u) {
                        C13613a.this.m39233a();
                        C13613a.this.m39265v();
                        C13091b.m37113d(C13613a.this.f37755h, C13613a.this.m39256m());
                    }
                    this.f37831c.f37752e.onAdClose(C13613a.this.f37756i, new RewardInfo(z, c14216c.m42626c(), String.valueOf(c14216c.m42623a())));
                    this.f37833e = 7;
                    this.f37831c.f37723C = false;
                    m39297e();
                }
                C13156d.m37475b().m37491b("2000152", c13154c, null);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
        /* JADX INFO: renamed from: a */
        public void mo39293a(String str, String str2) {
            try {
                C13613a c13613a = this.f37831c;
                if (c13613a == null || c13613a.f37752e == null) {
                    return;
                }
                try {
                    this.f37831c.f37752e.onEndcardShow(C13613a.this.f37756i);
                    C13084b.m37036b().m37040a(str2 + "_2", 2);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", e.getMessage());
                    }
                }
                this.f37833e = 6;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
        /* JADX INFO: renamed from: a */
        public void mo39294a(boolean z, int i) {
            try {
                C13613a c13613a = this.f37831c;
                if (c13613a == null || c13613a.f37752e == null) {
                    return;
                }
                try {
                    this.f37831c.f37752e.onAdCloseWithIVReward(C13613a.this.f37756i, new RewardInfo(z, i));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
        /* JADX INFO: renamed from: a */
        public void mo39295a(boolean z, String str, String str2) {
            try {
                C13613a c13613a = this.f37831c;
                if (c13613a == null || c13613a.f37752e == null) {
                    return;
                }
                if (C13613a.this.f37768u) {
                    C13613a.this.m39233a();
                }
                this.f37831c.f37723C = false;
                try {
                    this.f37831c.f37752e.onVideoAdClicked(z, C13613a.this.f37756i);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.orglistener.C13933b, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h
        /* JADX INFO: renamed from: b */
        public void mo39296b(String str, String str2) {
            try {
                C13613a c13613a = this.f37831c;
                if (c13613a == null || c13613a.f37752e == null) {
                    return;
                }
                try {
                    this.f37831c.f37752e.onVideoComplete(C13613a.this.f37756i);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", e.getMessage());
                    }
                }
                this.f37833e = 5;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e2.getMessage());
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m39297e() {
            C13613a.this.f37722B.clear();
            this.f37831c = null;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$j */
    /* JADX INFO: compiled from: RewardVideoController.java */
    public class j {
        public j() {
        }

        /* JADX INFO: renamed from: a */
        public void m39298a(String str, C13154c c13154c) {
            C13613a.this.f37748a0++;
            C13613a c13613a = C13613a.this;
            c13613a.m39243b(c13613a.f37771x, str, c13154c);
        }
    }

    /* JADX INFO: renamed from: a */
    private C13154c m39164a(C13157e c13157e) {
        C13154c c13154c;
        CampaignEx campaignEx;
        C13154c c13154c2 = null;
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM42524b = C14203b.getInstance().m42524b(this.f37755h);
            String currentLocalRid = "";
            int i2 = 0;
            if (copyOnWriteArrayListM42524b != null && copyOnWriteArrayListM42524b.size() > 0 && (campaignEx = copyOnWriteArrayListM42524b.get(0)) != null) {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            }
            c13154c2 = TextUtils.isEmpty(currentLocalRid) ? null : C13156d.m37475b().m37495c().get(currentLocalRid);
            try {
                if (C13223s0.m37831a().m37842a("a_u_a_c_f_s", false)) {
                    String simpleName = AbstractJsonLexerKt.NULL;
                    if (C13008c.m36588n() != null) {
                        Context contextM36546f = C13008c.m36588n().m36546f();
                        if (contextM36546f instanceof Activity) {
                            Activity activity = (Activity) contextM36546f;
                            simpleName = activity.getClass().getSimpleName();
                            if (activity.isFinishing()) {
                                i2 = 2;
                            } else {
                                i2 = activity.isDestroyed() ? 3 : 1;
                            }
                        }
                    }
                    c13157e.m37501a("context_status", Integer.valueOf(i2));
                    c13157e.m37501a("activity_name", simpleName);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e2.getMessage());
                }
            }
            if (c13154c2 != null) {
                c13154c2.m37429b(copyOnWriteArrayListM42524b);
                c13154c2.m37423a("2000128", c13157e);
                c13154c2.m37446i(currentLocalRid);
                c13154c2.m37456n(this.f37755h);
                C13624a.m39351a().m39354a("2000128", c13154c2);
                return c13154c2;
            }
            c13154c = new C13154c();
            try {
                c13154c.m37456n(this.f37755h);
                c13157e.m37501a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                c13154c.m37423a("2000128", c13157e);
                if (TextUtils.isEmpty(currentLocalRid)) {
                    c13154c.m37446i(SameMD5.getMD5(C13229v0.m37920d()));
                } else {
                    c13154c.m37446i(currentLocalRid);
                    c13154c.m37429b(copyOnWriteArrayListM42524b);
                    C13156d.m37475b().m37495c().put(currentLocalRid, c13154c);
                }
                C13624a.m39351a().m39354a("2000128", c13154c);
            } catch (Exception e3) {
                e = e3;
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e.getMessage());
                }
            }
            return c13154c;
        } catch (Exception e4) {
            e = e4;
            c13154c = c13154c2;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m39165a(String str) {
        String md5 = "";
        try {
            md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(C13229v0.m37920d()) : "";
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(C13229v0.m37920d()) : md5;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return md5;
        }
    }

    /* JADX INFO: renamed from: a */
    private CopyOnWriteArrayList<CampaignEx> m39167a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null && str.equals(campaignEx.getBidToken())) {
                    copyOnWriteArrayList.add(campaignEx);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39168a(C13082b c13082b, C13154c c13154c) {
        if (this.f37753f != null) {
            this.f37737Q = true;
            this.f37753f.m39284a(c13082b, c13154c);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39169a(C13154c c13154c) {
        if (this.f37753f != null) {
            C13082b c13082bM37011a = C13081a.m37011a(880035, "");
            if (c13154c != null) {
                c13154c.m37422a(c13082bM37011a);
                c13154c.m37430b(true);
            }
            this.f37753f.m39277a("bidToken is empty", c13154c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m39174a(String str, int i2) {
        try {
            if (f37718d0 == null || !C13182a1.m37597b(str)) {
                return;
            }
            f37718d0.put(str, Integer.valueOf(i2));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoController", e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39175a(String str, C13154c c13154c) {
        C14223c c14223c;
        C14223c c14223c2;
        try {
            if (this.f37749b == null) {
                m39207f();
            }
            if (this.f37749b != null) {
                C13219q0.m37816b("RewardVideoController", "controller 819");
                a aVar = null;
                if (this.f37768u ? m39188a(false) : this.f37749b.m39138l()) {
                    C13219q0.m37818c("RewardVideoController", "invoke adapter show isReady");
                    i iVar = new i(this, this, this.f37762o, aVar);
                    f37720f0.put(this.f37755h, iVar);
                    this.f37749b.m39112a(iVar, str, this.f37754g, this.f37763p, this.f37758k, c13154c);
                    this.f37725E = false;
                    return;
                }
                if (this.f37768u ? m39194b() : this.f37749b.m39139m()) {
                    C13219q0.m37818c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    i iVar2 = new i(this, this, this.f37762o, aVar);
                    f37720f0.put(this.f37755h, iVar2);
                    this.f37749b.m39112a(iVar2, str, this.f37754g, this.f37763p, this.f37758k, c13154c);
                    this.f37725E = false;
                    return;
                }
            }
            this.f37725E = false;
            m39177a("2000131", c13154c, this.f37752e, "can't show because load is failed");
            if (this.f37752e != null) {
                try {
                    this.f37752e.onShowFail(c13154c, this.f37756i, "can't show because load is failed");
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", e2.getMessage());
                    }
                }
            }
            if (this.f37767t || this.f37768u || (c14223c2 = this.f37750c) == null || !c14223c2.m42705a(4) || this.f37753f == null || this.f37753f.m39270a() == 1 || this.f37753f.m39270a() == 3) {
                return;
            }
            m39241a(false, C13156d.m37475b().m37479a(0, 94, this.f37755h, true, 1));
        } catch (Exception e3) {
            this.f37725E = false;
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoController", e3.getLocalizedMessage());
            }
            m39177a("2000131", c13154c, this.f37752e, "show exception");
            if (this.f37752e != null) {
                try {
                    this.f37752e.onShowFail(c13154c, this.f37756i, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", e3.getMessage());
                    }
                }
            }
            if (this.f37767t || this.f37768u || (c14223c = this.f37750c) == null || !c14223c.m42705a(4) || this.f37753f == null || this.f37753f.m39270a() == 1 || this.f37753f.m39270a() == 3) {
                return;
            }
            m39241a(false, C13156d.m37475b().m37479a(0, 94, this.f37755h, true, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39176a(String str, C13154c c13154c, InterVideoOutListener interVideoOutListener) {
        if (this.f37771x) {
            if (c13154c == null) {
                c13154c = new C13154c();
                c13154c.m37429b(this.f37728H);
            }
            try {
                C13157e c13157e = new C13157e();
                if (interVideoOutListener != null) {
                    c13157e.m37501a("listener_state", 1);
                } else {
                    c13157e.m37501a("listener_state", 2);
                }
                c13154c.m37423a(str, c13157e);
                C13624a.m39351a().m39354a(str, c13154c);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39177a(String str, C13154c c13154c, InterVideoOutListener interVideoOutListener, String str2) {
        if (c13154c == null) {
            try {
                c13154c = new C13154c();
                c13154c.m37429b(this.f37728H);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        C13157e c13157e = new C13157e();
        if (!TextUtils.isEmpty(str2)) {
            c13157e.m37501a("reason", str2);
        }
        if (interVideoOutListener != null) {
            c13157e.m37501a("listener_state", 1);
        } else {
            c13157e.m37501a("listener_state", 2);
        }
        c13154c.m37423a(str, c13157e);
        C13624a.m39351a().m39354a(str, c13154c);
    }

    /* JADX INFO: renamed from: a */
    public static void m39178a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f37719e0) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f37719e0.put(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private void m39179a(Queue<Integer> queue, boolean z, String str, C13154c c13154c) {
        C13154c c13154c2;
        Exception exc;
        C13082b c13082bM37011a;
        Integer numPoll;
        try {
            this.f37726F = 25;
            this.f37727G = 1;
            if (queue != null) {
                try {
                    if (queue.size() > 0 && (numPoll = queue.poll()) != null) {
                        this.f37726F = numPoll.intValue();
                    }
                } catch (Exception e2) {
                    exc = e2;
                    c13154c2 = c13154c;
                    c13082bM37011a = C13081a.m37011a(880020, "load mv api error:" + exc.getMessage());
                    if (c13154c2 != null) {
                        c13154c2.m37422a(c13082bM37011a);
                        c13154c2.m37430b(true);
                    }
                    m39168a(c13082bM37011a, c13154c2);
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", exc.getMessage());
                    }
                }
            }
            try {
                c13154c2 = c13154c;
                try {
                    m39236a(this.f37727G, this.f37726F, z, str, c13154c2);
                } catch (Exception e3) {
                    e = e3;
                    Exception exc2 = e;
                    try {
                        C13082b c13082bM37011a2 = C13081a.m37011a(880020, "load mv api error:" + exc2.getMessage());
                        if (c13154c2 != null) {
                            c13154c2.m37422a(c13082bM37011a2);
                            c13154c2.m37430b(true);
                        }
                        m39168a(c13082bM37011a2, c13154c2);
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardVideoController", exc2.getMessage());
                        }
                    } catch (Exception e4) {
                        e = e4;
                        exc = e;
                        c13082bM37011a = C13081a.m37011a(880020, "load mv api error:" + exc.getMessage());
                        if (c13154c2 != null) {
                            c13154c2.m37422a(c13082bM37011a);
                            c13154c2.m37430b(true);
                        }
                        m39168a(c13082bM37011a, c13154c2);
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardVideoController", exc.getMessage());
                        }
                    }
                }
            } catch (Exception e5) {
                e = e5;
                c13154c2 = c13154c;
            }
        } catch (Exception e6) {
            e = e6;
            c13154c2 = c13154c;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39180a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, C13609c c13609c) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean zIsEmpty = TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        boolean z = !zIsEmpty;
        int nscpt = campaignEx.getNscpt();
        this.f37741U = false;
        this.f37742V = false;
        this.f37743W = false;
        this.f37744X = false;
        this.f37745Y = false;
        C13608b.m39002b().m39009a(this.f37747a, z, nscpt, this.f37768u, this.f37767t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f37759l, this.f37755h, campaignEx.getRequestId(), copyOnWriteArrayList, new b(campaignEx, z, c13609c, nscpt), new c(campaignEx, copyOnWriteArrayList, z, nscpt));
        if (zIsEmpty) {
            return;
        }
        C13608b.m39002b().m39008a(this.f37747a, campaignEx, this.f37759l, this.f37755h, campaignEx.getRequestId(), new d(campaignEx, copyOnWriteArrayList, c13609c, z, nscpt));
    }

    /* JADX INFO: renamed from: a */
    private void m39181a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, C13154c c13154c) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("cache", 1);
            c13154c.m37423a("2000127", c13157e);
            c13154c.m37423a("2000048", c13157e);
            c13154c.m37424a(copyOnWriteArrayList);
        } catch (Exception e2) {
            C13219q0.m37816b("RewardVideoController", e2.getMessage());
        }
        this.f37738R = true;
        this.f37753f.m39285a(this.f37768u);
        this.f37753f.m39283b(this.f37759l, this.f37755h, c13154c);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        m39178a(campaignEx.getRequestId(), str);
        C13609c c13609c = this.f37749b;
        if (c13609c == null || !c13609c.m39120a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            m39180a(copyOnWriteArrayList, this.f37749b);
        } else {
            m39240a(copyOnWriteArrayList);
            this.f37753f.m39287d(this.f37759l, this.f37755h, c13154c);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39182a(boolean z, C13154c c13154c) {
        if (!this.f37771x) {
            if (z) {
                this.f37771x = z;
            }
        } else if (z) {
            String strM37014b = C13081a.m37014b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            C13082b c13082bM37011a = C13081a.m37011a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (c13154c != null) {
                c13154c.m37422a(c13082bM37011a);
                c13154c.m37430b(true);
            }
            this.f37753f.m39282b(strM37014b, c13154c);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39183a(boolean z, C13154c c13154c, C13157e c13157e) {
        if (c13157e == null) {
            c13157e = new C13157e();
        }
        c13154c.m37456n(this.f37755h);
        c13154c.m37420a(this.f37767t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        c13157e.m37501a("result", Integer.valueOf(z ? 1 : 2));
        c13157e.m37501a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f37768u ? 1 : 0));
        c13154c.m37423a("m_offer_ready", c13157e);
        C13624a.m39351a().m39354a("m_offer_ready", c13154c);
    }

    /* JADX INFO: renamed from: a */
    private void m39184a(boolean z, C13154c c13154c, List<CampaignEx> list) {
        if (c13154c == null) {
            c13154c = new C13154c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                c13154c.m37446i(campaignEx.getLocalRequestId());
                c13154c.m37443g(campaignEx.getBidToken());
            }
            c13154c.m37429b(list);
        }
        m39183a(z, c13154c, (C13157e) null);
    }

    /* JADX INFO: renamed from: a */
    private void m39185a(boolean z, String str, C13154c c13154c) {
        String str2 = str;
        C13154c c13154c2 = c13154c;
        if (this.f37753f != null) {
            if (!this.f37768u) {
                this.f37738R = m39196b(this.f37755h, c13154c2.m37463t());
                if (!this.f37738R) {
                    if (!m39199c()) {
                        this.f37738R = false;
                        C13609c c13609c = this.f37749b;
                        if (c13609c != null) {
                            c13609c.m39127c(this.f37739S);
                        }
                        this.f37753f.m39285a(this.f37768u);
                        m39179a(this.f37729I, z, str2, c13154c2);
                        return;
                    }
                    if (z) {
                        if (this.f37753f != null) {
                            String strM37014b = C13081a.m37014b(880019, "");
                            c13154c2.m37422a(C13081a.m37011a(880019, ""));
                            c13154c2.m37430b(true);
                            this.f37753f.m39277a(strM37014b, c13154c2);
                            return;
                        }
                        return;
                    }
                    this.f37738R = false;
                    C13609c c13609c2 = this.f37749b;
                    if (c13609c2 != null) {
                        c13609c2.m39127c(this.f37739S);
                    }
                    this.f37753f.m39285a(this.f37768u);
                    m39179a(this.f37729I, z, str2, c13154c2);
                    return;
                }
                if (m39199c()) {
                    C13219q0.m37813a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f37739S;
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                        Iterator<CampaignEx> it = this.f37739S.iterator();
                        while (it.hasNext()) {
                            C14201a.m42411a().m42418a(it.next(), this.f37755h);
                        }
                    }
                    C13609c c13609c3 = this.f37749b;
                    if (c13609c3 != null) {
                        c13609c3.m39127c(this.f37739S);
                    }
                    if (!z) {
                        this.f37738R = false;
                        this.f37753f.m39285a(this.f37768u);
                        m39179a(this.f37729I, z, str2, c13154c2);
                        return;
                    } else {
                        if (this.f37753f != null) {
                            String strM37014b2 = C13081a.m37014b(880019, "");
                            c13154c2.m37422a(C13081a.m37011a(880019, ""));
                            c13154c2.m37430b(true);
                            this.f37753f.m39277a(strM37014b2, c13154c2);
                            return;
                        }
                        return;
                    }
                }
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f37739S;
                if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) {
                    return;
                }
                try {
                    C13157e c13157e = new C13157e();
                    c13157e.m37501a("cache", 1);
                    c13154c2.m37423a("2000127", c13157e);
                    c13154c2.m37423a("2000048", c13157e);
                    c13154c2.m37424a(copyOnWriteArrayList2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", e2.getMessage());
                    }
                }
                this.f37753f.m39283b(this.f37759l, this.f37755h, c13154c2);
                CampaignEx campaignEx = copyOnWriteArrayList2.get(0);
                this.f37753f.m39285a(this.f37768u);
                C13609c c13609c4 = this.f37749b;
                if (c13609c4 == null || !c13609c4.m39120a(copyOnWriteArrayList2, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                    m39180a(copyOnWriteArrayList2, this.f37749b);
                } else {
                    m39240a(copyOnWriteArrayList2);
                    this.f37753f.m39287d(this.f37759l, this.f37755h, c13154c2);
                }
                if (this.f37732L) {
                    C13609c c13609c5 = this.f37749b;
                    if (c13609c5 != null) {
                        c13609c5.m39127c(this.f37739S);
                    }
                    m39179a(this.f37729I, z, str2, c13154c2);
                    return;
                }
                return;
            }
            List<CampaignEx> listM42427b = C14201a.m42411a().m42427b(this.f37755h, 1, this.f37768u, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM39191b = null;
            if (listM42427b != null && listM42427b.size() > 0) {
                if (m39199c()) {
                    C14201a.m42411a().m42431b(this.f37755h, str2);
                    if (!z || this.f37753f == null) {
                        return;
                    }
                    String strM37014b3 = C13081a.m37014b(880019, "");
                    C13082b c13082bM37011a = C13081a.m37011a(880019, "");
                    if (c13154c2 != null) {
                        c13154c2.m37422a(c13082bM37011a);
                        c13154c2.m37430b(true);
                    }
                    this.f37753f.m39277a(strM37014b3, c13154c2);
                    return;
                }
                if (this.f37749b == null) {
                    m39207f();
                }
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM39167a = m39167a(str2, listM42427b);
                if (copyOnWriteArrayListM39167a != null && copyOnWriteArrayListM39167a.size() > 0) {
                    m39181a(copyOnWriteArrayListM39167a, str2, c13154c2);
                    return;
                }
                try {
                    C13612a c13612a = new C13612a(this.f37755h, this.f37767t);
                    C13001c c13001c = new C13001c();
                    try {
                        if (c13612a.m39160a(str2)) {
                            c13001c = c13612a.m39156a(str2, c13154c2, (CampaignEx) null, new C13082b(880038), 1, this.f37749b);
                            if (c13001c != null && c13001c.m36521g() == C13001c.f35466l && c13001c.m36515c() != null && c13001c.m36515c().size() > 0 && this.f37749b != null) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM36515c = c13001c.m36515c();
                                ArrayList arrayList = new ArrayList();
                                for (CampaignEx campaignEx2 : listM42427b) {
                                    if (campaignEx2 != null) {
                                        String requestId = campaignEx2.getRequestId();
                                        if (!TextUtils.isEmpty(requestId)) {
                                            for (int i2 = 0; i2 < copyOnWriteArrayListM36515c.size(); i2++) {
                                                CampaignEx campaignEx3 = copyOnWriteArrayListM36515c.get(i2);
                                                if (campaignEx3 != null) {
                                                    if (requestId.equals(campaignEx3.getRequestId())) {
                                                        break;
                                                    } else if (i2 == copyOnWriteArrayListM36515c.size() - 1) {
                                                        arrayList.add(campaignEx2);
                                                    }
                                                }
                                            }
                                            if (copyOnWriteArrayListM36515c.size() != 0) {
                                                break;
                                            }
                                            arrayList.add(campaignEx2);
                                            break;
                                        }
                                    }
                                }
                                this.f37749b.m39127c(arrayList);
                                this.f37749b.m39117a(c13001c.m36515c(), false, true, true);
                                copyOnWriteArrayListM39191b = new CopyOnWriteArrayList<>(c13001c.m36515c());
                            }
                        } else {
                            copyOnWriteArrayListM39191b = m39191b(str2, listM42427b);
                            if (copyOnWriteArrayListM39191b.size() > 0) {
                                C13012b.m36621a(C13008c.m36588n().m36542d()).m36625a(str2, copyOnWriteArrayListM39191b);
                            }
                            c13001c.m36518d("cb is closed");
                            c13001c.m36510a(C13001c.f35465k);
                        }
                        try {
                            c13612a.m39157a(c13154c, str2, c13001c, (List<C12999a.b>) null, (JSONObject) null, 1);
                            c13154c2 = c13154c;
                            str2 = str2;
                            if (copyOnWriteArrayListM39191b != null && copyOnWriteArrayListM39191b.size() > 0) {
                                m39181a(copyOnWriteArrayListM39191b, str2, c13154c2);
                                if (this.f37749b != null && !c13612a.m39160a(str2)) {
                                    this.f37749b.m39127c(copyOnWriteArrayListM39191b);
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            c13154c2 = c13154c;
                            str2 = str2;
                            if (MBridgeConstans.DEBUG) {
                                C13219q0.m37816b("RewardVideoController", e.getMessage());
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        c13154c2 = c13154c;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
                this.f37738R = false;
                this.f37753f.m39285a(this.f37768u);
                m39179a(this.f37729I, z, str2, c13154c2);
                return;
            }
            if (m39199c()) {
                C14201a.m42411a().m42431b(this.f37755h, str2);
                if (!z || this.f37753f == null) {
                    return;
                }
                String strM37014b4 = C13081a.m37014b(880019, "");
                C13082b c13082bM37011a2 = C13081a.m37011a(880019, "");
                if (c13154c2 != null) {
                    c13154c2.m37422a(c13082bM37011a2);
                    c13154c2.m37430b(true);
                }
                this.f37753f.m39277a(strM37014b4, c13154c2);
                return;
            }
            try {
                C13612a c13612a2 = new C13612a(this.f37755h, this.f37767t);
                C13001c c13001c2 = new C13001c();
                try {
                    if (c13612a2.m39160a(str2)) {
                        if (this.f37749b == null) {
                            C13609c c13609c6 = new C13609c(this.f37747a, this.f37759l, this.f37755h);
                            this.f37749b = c13609c6;
                            c13609c6.m39129d(this.f37767t);
                            this.f37749b.m39130e(this.f37768u);
                            if (this.f37767t) {
                                this.f37749b.m39106a(this.f37764q, this.f37765r, this.f37766s);
                            }
                            this.f37749b.m39105a(this.f37763p);
                            this.f37749b.m39113a(this.f37750c);
                        }
                        c13001c2 = c13612a2.m39156a(str2, c13154c2, (CampaignEx) null, new C13082b(880038), 1, this.f37749b);
                        if (c13001c2 != null && c13001c2.m36521g() == C13001c.f35466l && c13001c2.m36515c() != null && c13001c2.m36515c().size() > 0 && this.f37749b != null) {
                            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM36515c2 = c13001c2.m36515c();
                            if (listM42427b != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (CampaignEx campaignEx4 : listM42427b) {
                                    if (campaignEx4 != null) {
                                        String requestId2 = campaignEx4.getRequestId();
                                        if (!TextUtils.isEmpty(requestId2)) {
                                            for (int i3 = 0; i3 < copyOnWriteArrayListM36515c2.size(); i3++) {
                                                CampaignEx campaignEx5 = copyOnWriteArrayListM36515c2.get(i3);
                                                if (campaignEx5 != null) {
                                                    if (requestId2.equals(campaignEx5.getRequestId())) {
                                                        break;
                                                    } else if (i3 == copyOnWriteArrayListM36515c2.size() - 1) {
                                                        arrayList2.add(campaignEx4);
                                                    }
                                                }
                                            }
                                            if (copyOnWriteArrayListM36515c2.size() != 0) {
                                                break;
                                            }
                                            arrayList2.add(campaignEx4);
                                            break;
                                        }
                                    }
                                }
                                this.f37749b.m39127c(arrayList2);
                            }
                            this.f37749b.m39117a(c13001c2.m36515c(), false, true, true);
                            copyOnWriteArrayListM39191b = new CopyOnWriteArrayList<>(c13001c2.m36515c());
                        }
                    } else {
                        copyOnWriteArrayListM39191b = m39191b(str2, listM42427b);
                        if (copyOnWriteArrayListM39191b.size() > 0) {
                            C13012b.m36621a(C13008c.m36588n().m36542d()).m36625a(str2, copyOnWriteArrayListM39191b);
                        }
                        c13001c2.m36518d("cb is closed 2");
                        c13001c2.m36510a(C13001c.f35465k);
                    }
                    try {
                        c13612a2.m39157a(c13154c, str2, c13001c2, (List<C12999a.b>) null, (JSONObject) null, 1);
                        c13154c2 = c13154c;
                        str2 = str2;
                        if (copyOnWriteArrayListM39191b != null && copyOnWriteArrayListM39191b.size() > 0) {
                            m39181a(copyOnWriteArrayListM39191b, str2, c13154c2);
                            if (this.f37749b != null && !c13612a2.m39160a(str2)) {
                                this.f37749b.m39127c(copyOnWriteArrayListM39191b);
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        c13154c2 = c13154c;
                        str2 = str2;
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardVideoController", e.getMessage());
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    c13154c2 = c13154c;
                }
            } catch (Exception e8) {
                e = e8;
            }
            this.f37738R = false;
            this.f37753f.m39285a(this.f37768u);
            m39179a(this.f37729I, z, str2, c13154c2);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m39187a(List<C13069c> list, String str, boolean z) {
        if (list == null) {
            return false;
        }
        for (C13069c c13069c : list) {
            if (c13069c != null && str.equals(c13069c.m36790b())) {
                this.f37749b.m39126c(c13069c.m36785a());
                this.f37749b.m39123b(c13069c.m36798d());
                if (this.f37749b.m39138l()) {
                    if (!z) {
                        return true;
                    }
                    C13154c c13154c = new C13154c();
                    c13154c.m37446i(c13069c.m36798d());
                    m39184a(false, c13154c, (List<CampaignEx>) this.f37749b.m39135h());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m39188a(boolean z) {
        if (this.f37749b == null) {
            m39207f();
        }
        List<C13069c> listM42413a = C14201a.m42411a().m42413a(this.f37755h);
        String str = this.f37721A;
        if (listM42413a == null || listM42413a.size() <= 0) {
            if (z) {
                m39202d("is_ready_ctir_false", "no effective campaign list");
                C13154c c13154c = new C13154c();
                c13154c.m37446i(str);
                c13154c.m37443g(this.f37773z);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", 8);
                c13154c.m37423a("m_offer_ready", c13157e);
                m39184a(false, c13154c, (List<CampaignEx>) this.f37749b.m39135h());
            }
            return false;
        }
        String strM37112d = C13091b.m37112d(this.f37755h);
        boolean zM39187a = TextUtils.isEmpty(strM37112d) ? false : m39187a(listM42413a, strM37112d, z);
        if (z) {
            m39202d("is_ready_ctir_" + zM39187a, "");
        }
        if (!zM39187a) {
            for (C13069c c13069c : listM42413a) {
                if (c13069c != null) {
                    this.f37749b.m39126c(c13069c.m36785a());
                    this.f37749b.m39123b(c13069c.m36798d());
                    if (this.f37749b.m39125b(z)) {
                        c13069c.m36798d();
                        return true;
                    }
                }
            }
        } else if (z) {
            C13154c c13154c2 = new C13154c();
            c13154c2.m37446i(str);
            m39184a(zM39187a, c13154c2, this.f37749b.m39135h());
        }
        return zM39187a;
    }

    /* JADX INFO: renamed from: b */
    private C13154c m39189b(boolean z, String str, C13157e c13157e) {
        C13154c c13154c;
        C13154c c13154c2 = new C13154c();
        try {
            m39193b(z);
            String md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(C13229v0.m37920d()) : m39165a(str);
            this.f37721A = md5;
            c13154c2 = C13156d.m37475b().m37489b(md5);
            if (c13154c2 == null) {
                c13154c = new C13154c();
                try {
                    C13156d.m37475b().m37495c().put(md5, c13154c);
                    c13154c.m37436d(true);
                    c13154c2 = c13154c;
                } catch (Exception e2) {
                    e = e2;
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", e.getMessage());
                    }
                    return c13154c;
                }
            }
            c13154c2.m37446i(md5);
            c13154c2.m37456n(this.f37755h);
            if (c13157e != null) {
                if (c13157e.m37503a("adtp")) {
                    c13154c2.m37420a(Integer.parseInt((String) c13157e.m37504b("adtp")));
                }
                if (c13157e.m37503a(CampaignEx.JSON_KEY_HB)) {
                    String str2 = (String) c13157e.m37504b(CampaignEx.JSON_KEY_HB);
                    c13154c2.m37444h(str2);
                    if (str2.equals("1")) {
                        c13154c2.m37443g(str);
                    }
                }
            }
            c13154c2.m37440f(z ? "2" : "1");
            if (z) {
                C13624a.m39351a().m39354a("2000123", c13154c2);
            }
            return c13154c2;
        } catch (Exception e3) {
            e = e3;
            c13154c = c13154c2;
        }
    }

    /* JADX INFO: renamed from: b */
    private CopyOnWriteArrayList<CampaignEx> m39191b(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int vcn = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > vcn) {
                                vcn = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= vcn && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        C13091b.m37105a(this.f37755h, str, vcn);
                        return copyOnWriteArrayList;
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e2.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: b */
    private void m39192b(C13154c c13154c) {
        if (this.f37753f != null) {
            String strM37014b = C13081a.m37014b(880001, "");
            C13082b c13082bM37011a = C13081a.m37011a(880001, "");
            if (c13154c != null) {
                c13154c.m37422a(c13082bM37011a);
                c13154c.m37430b(true);
            }
            this.f37753f.m39277a(strM37014b, c13154c);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m39193b(boolean z) {
        List<String> listM36682e;
        if (z) {
            try {
                C13015e c13015eM36643a = C13015e.m36643a(C13017g.m36693a(this.f37747a));
                if (c13015eM36643a != null && (listM36682e = c13015eM36643a.m36682e(this.f37755h)) != null && listM36682e.size() > 0) {
                    Iterator<String> it = listM36682e.iterator();
                    while (it.hasNext()) {
                        C13156d.m37475b().m37497d(it.next());
                    }
                }
                LinkedHashMap<String, C13154c> linkedHashMapM37495c = C13156d.m37475b().m37495c();
                if (linkedHashMapM37495c == null || linkedHashMapM37495c.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, C13154c>> it2 = linkedHashMapM37495c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, C13154c> next = it2.next();
                    if (next != null && next.getValue().m37416E()) {
                        it2.remove();
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m39194b() {
        if (this.f37749b == null) {
            m39207f();
        }
        List<C13069c> listM42413a = C14201a.m42411a().m42413a(this.f37755h);
        if (listM42413a == null || listM42413a.size() <= 0) {
            return false;
        }
        for (C13069c c13069c : listM42413a) {
            if (c13069c != null) {
                this.f37749b.m39126c(c13069c.m36785a());
                this.f37749b.m39123b(c13069c.m36798d());
                if (this.f37749b.m39139m()) {
                    return true;
                }
                C14201a.m42411a().m42436d(this.f37755h, c13069c.m36785a());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private boolean m39196b(String str, String str2) {
        try {
            C13609c c13609c = this.f37749b;
            if (c13609c == null || !str.equals(c13609c.m39137j())) {
                C13609c c13609c2 = new C13609c(this.f37747a, this.f37759l, str);
                this.f37749b = c13609c2;
                c13609c2.m39129d(this.f37767t);
                this.f37749b.m39130e(this.f37768u);
            }
            this.f37749b.m39105a(this.f37763p);
            this.f37749b.m39113a(this.f37750c);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoController", e2.getMessage());
            }
        }
        List<CampaignEx> listM42426b = C14201a.m42411a().m42426b(str, 1, this.f37768u);
        this.f37740T = C14201a.m42411a().m42414a(str, 1, this.f37768u);
        if (listM42426b == null || listM42426b.size() <= 0) {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f37739S;
            if (copyOnWriteArrayList == null) {
                return false;
            }
            copyOnWriteArrayList.clear();
            return false;
        }
        C14201a.m42411a().m42424a(str, listM42426b, str2);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f37739S;
        if (copyOnWriteArrayList2 == null) {
            this.f37739S = new CopyOnWriteArrayList<>();
        } else {
            copyOnWriteArrayList2.clear();
        }
        for (CampaignEx campaignEx : listM42426b) {
            campaignEx.setLocalRequestId(str2);
            this.f37739S.add(campaignEx);
        }
        m39240a(this.f37739S);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m39198c(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || this.f37735O) {
                    return;
                }
                C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36676b(list, str);
            } catch (Throwable th) {
                C13219q0.m37816b("RewardVideoController", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m39199c() {
        try {
            if (this.f37731K == null) {
                this.f37731K = C13017g.m36693a(C13008c.m36588n().m36542d());
            }
            C13018h c13018hM36696a = C13018h.m36696a(this.f37731K);
            if (this.f37750c == null) {
                this.f37750c = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f37755h, this.f37767t);
            }
            return c13018hM36696a != null && c13018hM36696a.m36699a(this.f37755h, this.f37750c.m42734k());
        } catch (Throwable unused) {
            C13219q0.m37816b("RewardVideoController", "cap check error");
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m39202d(String str, String str2) {
        try {
            C13154c c13154c = new C13154c();
            c13154c.m37456n(this.f37755h);
            c13154c.m37420a(this.f37767t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            C13157e c13157e = new C13157e();
            c13157e.m37501a(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, str);
            c13157e.m37501a("reason", str2);
            c13154c.m37423a("m_temp_is_ready_check", c13157e);
            C13624a.m39351a().m39354a("m_temp_is_ready_check", c13154c);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m39203d() {
        if (this.f37749b == null) {
            m39207f();
        }
        C13609c c13609c = this.f37749b;
        if (c13609c != null) {
            return c13609c.m39125b(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private void m39207f() {
        C13609c c13609c = new C13609c(this.f37747a, this.f37759l, this.f37755h);
        this.f37749b = c13609c;
        c13609c.m39129d(this.f37767t);
        this.f37749b.m39130e(this.f37768u);
        if (this.f37767t) {
            this.f37749b.m39106a(this.f37764q, this.f37765r, this.f37766s);
        }
        this.f37749b.m39113a(this.f37750c);
    }

    /* JADX INFO: renamed from: m */
    static /* synthetic */ int m39215m(C13613a c13613a) {
        int i2 = c13613a.f37748a0;
        c13613a.f37748a0 = i2 - 1;
        return i2;
    }

    /* JADX INFO: renamed from: w */
    private void m39226w() {
        C13015e.m36643a(C13017g.m36693a(this.f37747a)).m36673b(this.f37755h);
    }

    /* JADX INFO: renamed from: x */
    private void m39227x() {
        try {
            List<CampaignEx> listM36677c = C13015e.m36643a(C13017g.m36693a(this.f37747a)).m36677c(this.f37755h);
            if (listM36677c == null || listM36677c.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : listM36677c) {
                if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    C14200a.m42400b(campaignEx.getAdType(), campaignEx);
                } else {
                    C14200a.m42404e(this.f37755h + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j())) {
                        C14200a.m42404e(this.f37755h + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().m36781j());
                    }
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoController", e2.getMessage());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX INFO: renamed from: a */
    public C13154c m39231a(Message message) {
        C13154c c13154cM37489b;
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    c13154cM37489b = C13156d.m37475b().m37489b(data.getString("metrics_data_lrid"));
                } else {
                    c13154cM37489b = null;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else {
            c13154cM37489b = null;
        }
        return c13154cM37489b == null ? new C13154c() : c13154cM37489b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0016, B:10:0x002c, B:12:0x0036, B:15:0x003d, B:19:0x0072, B:21:0x0085, B:23:0x0093), top: B:30:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX INFO: renamed from: a */
    public C13154c m39232a(List<CampaignEx> list, C13154c c13154c) {
        String nLRid;
        String str;
        int i2;
        C13154c c13154c2 = new C13154c();
        String localRequestId = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (list.get(0) != null) {
                        localRequestId = list.get(0).getLocalRequestId();
                        nLRid = list.get(0).getNLRid();
                    } else {
                        nLRid = "";
                    }
                    c13154c2.m37446i(localRequestId);
                    c13154c2.m37429b(list);
                    str = localRequestId;
                    localRequestId = nLRid;
                } else {
                    str = "";
                }
                if (TextUtils.isEmpty(localRequestId)) {
                    return c13154c;
                }
                C13157e c13157e = new C13157e();
                c13157e.m37501a("cache", 1);
                c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
                c13157e.m37501a("auto_load", 2);
                c13154c2.m37423a("2000127", c13157e);
                c13154c2.m37423a("2000048", c13157e);
                if (this.f37767t) {
                    i2 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
                } else {
                    i2 = 94;
                }
                c13154c2.m37420a(i2);
                c13154c2.m37444h("1");
                c13154c2.m37440f("2");
                if (!TextUtils.isEmpty(str) && !C13156d.m37475b().m37495c().containsKey(str)) {
                    C13156d.m37475b().m37495c().put(str, c13154c2);
                    return c13154c2;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else {
            str = "";
            if (TextUtils.isEmpty(localRequestId)) {
                return c13154c;
            }
            C13157e c13157e2 = new C13157e();
            c13157e2.m37501a("cache", 1);
            c13157e2.m37501a(CampaignEx.JSON_KEY_HB, 1);
            c13157e2.m37501a("auto_load", 2);
            c13154c2.m37423a("2000127", c13157e2);
            c13154c2.m37423a("2000048", c13157e2);
            if (this.f37767t) {
                i2 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            } else {
                i2 = 94;
            }
            c13154c2.m37420a(i2);
            c13154c2.m37444h("1");
            c13154c2.m37440f("2");
            if (!TextUtils.isEmpty(str)) {
                C13156d.m37475b().m37495c().put(str, c13154c2);
                return c13154c2;
            }
        }
        return c13154c2;
    }

    /* JADX INFO: renamed from: a */
    public void m39233a() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f37756i;
            if (mBridgeIds != null) {
                if (!this.f37723C) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String strM39256m = m39256m();
                if (TextUtils.isEmpty(strM39256m)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f37719e0;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(strM39256m) && !TextUtils.isEmpty(f37719e0.get(strM39256m))) {
                    str = f37719e0.get(strM39256m);
                }
                this.f37756i.setBidToken(str);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39234a(int i2) {
        this.f37763p = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m39235a(int i2, int i3, int i4) {
        this.f37764q = i2;
        this.f37765r = i3;
        if (i3 == C13088a.f35845K) {
            this.f37766s = i4 < 0 ? 5 : i4;
        }
        if (i3 == C13088a.f35844J) {
            this.f37766s = i4 < 0 ? 80 : i4;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i2 == C13088a.f35842H ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i3 == C13088a.f35844J ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i4);
            C13636h.m39706b().m39729i(this.f37755h, jSONObject.toString());
        } catch (Exception unused) {
            C13219q0.m37816b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39236a(int i2, int i3, boolean z, String str, C13154c c13154c) {
        try {
            C13609c c13609c = this.f37749b;
            if (c13609c == null || !this.f37755h.equals(c13609c.m39137j())) {
                C13609c c13609c2 = new C13609c(this.f37747a, this.f37759l, this.f37755h);
                this.f37749b = c13609c2;
                c13609c2.m39129d(this.f37767t);
                this.f37749b.m39130e(this.f37768u);
            }
            if (this.f37767t) {
                this.f37749b.m39106a(this.f37764q, this.f37765r, this.f37766s);
            }
            this.f37728H = new ArrayList();
            this.f37749b.m39105a(this.f37763p);
            this.f37749b.m39113a(this.f37750c);
            f fVar = new f(this.f37749b, i2, z, str, c13154c);
            fVar.m39268a(i3);
            g gVar = new g(this.f37749b, z);
            this.f37757j = gVar;
            gVar.m39269a(fVar);
            this.f37749b.m39110a(this.f37757j);
            this.f37749b.m39109a(0, "");
            this.f37749b.m39111a(new j());
            this.f37749b.m39108a(i2, i3, z, str, this.f37772y, c13154c);
            this.f37762o.postDelayed(fVar, i3 * 1000);
        } catch (Exception e2) {
            C13082b c13082bM37011a = C13081a.m37011a(880020, e2.getMessage());
            if (c13154c != null) {
                c13154c.m37422a(c13082bM37011a);
                c13154c.m37430b(true);
            }
            m39168a(c13082bM37011a, c13154c);
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoController", e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39237a(InterVideoOutListener interVideoOutListener) {
        this.f37752e = interVideoOutListener;
        this.f37753f = new h(this, interVideoOutListener, this.f37762o, this.f37755h, null);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public void m39238a(String str, String str2, String str3, C13157e c13157e) {
        C14223c c14223c;
        C14223c c14223c2;
        C14223c c14223c3;
        C14223c c14223c4;
        C13154c c13154cM39164a = m39164a(c13157e);
        try {
            this.f37760m = str;
            this.f37754g = str2;
            this.f37758k = str3;
            synchronized (this.f37724D) {
                if (this.f37725E) {
                    m39177a("2000131", c13154cM39164a, this.f37752e, "campaing is show progressing ");
                    if (this.f37752e != null) {
                        try {
                            this.f37752e.onShowFail(c13154cM39164a, this.f37756i, "campaing is show progressing ");
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                C13219q0.m37816b("RewardVideoController", e2.getMessage());
                            }
                        }
                    }
                    return;
                }
                this.f37725E = true;
                Context context = this.f37747a;
                if (context == null) {
                    m39177a("2000131", c13154cM39164a, this.f37752e, "context is null");
                    if (this.f37752e != null) {
                        try {
                            this.f37752e.onShowFail(c13154cM39164a, this.f37756i, "context is null");
                        } catch (Exception e3) {
                            if (MBridgeConstans.DEBUG) {
                                C13219q0.m37816b("RewardVideoController", e3.getMessage());
                            }
                        }
                    }
                    if (!this.f37767t && !this.f37768u && (c14223c4 = this.f37750c) != null && c14223c4.m42705a(4) && this.f37753f != null && this.f37753f.m39270a() != 1 && this.f37753f.m39270a() != 3) {
                        m39241a(false, C13156d.m37475b().m37479a(0, 94, this.f37755h, true, 1));
                    }
                    this.f37725E = false;
                    return;
                }
                if (this.f37767t && !C13229v0.m37944l(context) && C13223s0.m37831a().m37842a("s_a_w_n_c", true)) {
                    m39177a("2000131", c13154cM39164a, this.f37752e, "network exception");
                    if (this.f37752e != null) {
                        try {
                            this.f37752e.onShowFail(c13154cM39164a, this.f37756i, "network exception");
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                C13219q0.m37816b("RewardVideoController", e4.getMessage());
                            }
                        }
                    }
                    if (!this.f37767t && !this.f37768u && (c14223c3 = this.f37750c) != null && c14223c3.m42705a(4) && this.f37753f != null && this.f37753f.m39270a() != 1 && this.f37753f.m39270a() != 3) {
                        m39241a(false, C13156d.m37475b().m37479a(0, 94, this.f37755h, true, 1));
                    }
                    this.f37725E = false;
                    return;
                }
                if (!m39199c()) {
                    if (TextUtils.isEmpty(this.f37754g)) {
                        this.f37754g = C13198g.m37689d();
                    }
                    try {
                        String str4 = new SimpleDateFormat("dd").format(new Date());
                        String str5 = (String) C13235y0.m37956a(this.f37747a, "reward_date", "0");
                        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str4) && !str5.equals(str4)) {
                            C13235y0.m37957b(this.f37747a, "reward_date", str4);
                        }
                    } catch (Exception e5) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardVideoController", e5.getMessage());
                        }
                    }
                    m39175a(str, c13154cM39164a);
                    return;
                }
                m39177a("2000131", c13154cM39164a, this.f37752e, "Play more than limit");
                if (this.f37752e != null) {
                    try {
                        this.f37752e.onShowFail(c13154cM39164a, this.f37756i, "Play more than limit");
                    } catch (Exception e6) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardVideoController", e6.getMessage());
                        }
                    }
                }
                if (!this.f37767t && !this.f37768u && (c14223c2 = this.f37750c) != null && c14223c2.m42705a(4) && this.f37753f != null && this.f37753f.m39270a() != 1 && this.f37753f.m39270a() != 3) {
                    m39241a(false, C13156d.m37475b().m37479a(0, 94, this.f37755h, true, 1));
                }
                this.f37725E = false;
                return;
                this.f37725E = false;
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e.getLocalizedMessage());
                }
                m39177a("2000131", c13154cM39164a, this.f37752e, "show exception");
                if (this.f37752e != null) {
                    try {
                        this.f37752e.onShowFail(c13154cM39164a, this.f37756i, "show exception");
                    } catch (Exception unused) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardVideoController", e.getMessage());
                        }
                    }
                }
                if (!this.f37767t || this.f37768u || (c14223c = this.f37750c) == null || !c14223c.m42705a(4) || this.f37753f == null || this.f37753f.m39270a() == 1 || this.f37753f.m39270a() == 3) {
                    return;
                }
                m39241a(false, C13156d.m37475b().m37479a(0, 94, this.f37755h, true, 1));
            }
        } catch (Exception e7) {
            this.f37725E = false;
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoController", e7.getLocalizedMessage());
            }
            m39177a("2000131", c13154cM39164a, this.f37752e, "show exception");
            if (this.f37752e != null) {
                this.f37752e.onShowFail(c13154cM39164a, this.f37756i, "show exception");
            }
            if (this.f37767t) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39239a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            C13235y0.m37957b(this.f37747a, "MBridge_ConfirmTitle" + this.f37755h, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            C13235y0.m37957b(this.f37747a, "MBridge_ConfirmContent" + this.f37755h, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            C13235y0.m37957b(this.f37747a, "MBridge_CancelText" + this.f37755h, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        C13235y0.m37957b(this.f37747a, "MBridge_ConfirmText" + this.f37755h, str3.trim());
    }

    /* JADX INFO: renamed from: a */
    public void m39240a(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            this.f37728H = new ArrayList();
        } else {
            this.f37728H = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39241a(boolean z, C13157e c13157e) {
        m39242a(z, "", c13157e);
    }

    /* JADX INFO: renamed from: a */
    public void m39242a(boolean z, String str, C13157e c13157e) {
        C13613a c13613a;
        C13154c c13154cM39189b = m39189b(z, str, c13157e);
        this.f37773z = str;
        if (this.f37753f == null) {
            c13613a = this;
            c13613a.f37753f = new h(c13613a, null, this.f37762o, this.f37755h, null);
        } else {
            c13613a = this;
        }
        if (c13613a.f37753f != null && c13613a.f37753f.m39270a() == 1) {
            m39182a(z, c13154cM39189b);
            return;
        }
        c13613a.f37748a0 = 1;
        if (c13613a.f37753f == null || c13613a.f37753f.m39270a() != 3) {
            c13613a.f37732L = true;
            if (c13613a.f37753f != null) {
                c13613a.f37753f.m39272a(1);
            }
        } else {
            c13613a.f37732L = false;
        }
        c13613a.f37771x = z;
        c13613a.f37762o.removeMessages(1001001);
        c13613a.f37735O = false;
        c13613a.f37734N = false;
        c13613a.f37736P = false;
        c13613a.f37737Q = false;
        m39227x();
        m39226w();
        C13608b.m39002b().m39012c();
        try {
            if (TextUtils.isEmpty(str)) {
                if (c13613a.f37767t) {
                    C13813b.getInstance().addInterstitialList(c13613a.f37759l, c13613a.f37755h);
                } else {
                    C13813b.getInstance().addRewardList(c13613a.f37759l, c13613a.f37755h);
                }
            }
            if (c13613a.f37768u && TextUtils.isEmpty(str)) {
                m39169a(c13154cM39189b);
                return;
            }
            if (AbstractC13706a.map == null) {
                m39192b(c13154cM39189b);
                return;
            }
            C14223c c14223cM42671c = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), c13613a.f37755h);
            c13613a.f37750c = c14223cM42671c;
            if (c14223cM42671c == null) {
                c13613a.f37730J = C13008c.m36588n().m36533b();
                C14222b.m42658b().m42665a(c13613a.f37730J, C13008c.m36588n().m36538c(), c13613a.f37755h, new a());
                c13613a.f37750c = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), c13613a.f37755h, c13613a.f37767t);
            }
            if (!TextUtils.isEmpty(c13613a.f37759l)) {
                c13613a.f37750c.m42721f(c13613a.f37759l);
            }
            int iM42740n = c13613a.f37750c.m42740n() * 1000;
            if (c13613a.f37762o != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001002;
                if (c13154cM39189b != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", c13154cM39189b.m37463t());
                    messageObtain.setData(bundle);
                }
                c13613a.f37762o.sendMessageDelayed(messageObtain, iM42740n);
            }
            c13613a.f37729I = c13613a.f37750c.m42764z();
            try {
                m39185a(z, str, c13154cM39189b);
            } catch (Exception e2) {
                if (c13613a.f37753f != null) {
                    C13082b c13082bM37011a = C13081a.m37011a(880020, "load exception");
                    if (c13154cM39189b != null) {
                        c13154cM39189b.m37422a(c13082bM37011a);
                        c13154cM39189b.m37430b(true);
                    }
                    c13613a.f37753f.m39284a(c13082bM37011a, c13154cM39189b);
                }
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardVideoController", e2.getMessage());
                }
            }
        } catch (Exception e3) {
            if (c13613a.f37753f != null) {
                C13082b c13082bM37011a2 = C13081a.m37011a(880001, "");
                if (c13154cM39189b != null) {
                    c13154cM39189b.m37422a(c13082bM37011a2);
                    c13154cM39189b.m37430b(true);
                }
                c13613a.f37753f.m39284a(c13082bM37011a2, c13154cM39189b);
            }
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoController", e3.getMessage());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0043 A[Catch: Exception -> 0x00e4, TRY_ENTER, TryCatch #2 {Exception -> 0x00e4, blocks: (B:3:0x002c, B:11:0x005c, B:14:0x006b, B:19:0x008f, B:10:0x0043), top: B:40:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0060 A[Catch: Exception -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x003d, blocks: (B:5:0x0030, B:13:0x0060, B:16:0x0071, B:18:0x007b), top: B:38:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public void m39243b(boolean z, String str, C13154c c13154c) {
        Exception exc;
        C13154c c13154cM37476a = C13156d.m37475b().m37476a(c13154c);
        String str2 = c13154cM37476a.m37463t() + "label_second";
        c13154cM37476a.m37446i(str2);
        C13156d.m37475b().m37495c().put(str2, c13154cM37476a);
        try {
            C13609c c13609c = this.f37749b;
            if (c13609c == null) {
                C13609c c13609c2 = new C13609c(this.f37747a, this.f37759l, this.f37755h);
                this.f37749b = c13609c2;
                c13609c2.m39129d(this.f37767t);
                this.f37749b.m39130e(this.f37768u);
                if (this.f37767t) {
                    this.f37749b.m39106a(this.f37764q, this.f37765r, this.f37766s);
                }
                if (c13154cM37476a.m37457o() != null) {
                    this.f37746Z.put(c13154cM37476a.m37457o().get(0).getId());
                }
                this.f37749b.m39105a(this.f37763p);
                this.f37749b.m39113a(this.f37750c);
                f fVar = new f(this.f37749b, this.f37727G, z, str, c13154cM37476a);
                fVar.m39268a(this.f37726F);
                this.f37757j.m39269a(fVar);
                this.f37749b.m39110a(this.f37757j);
                this.f37749b.m39109a(1, this.f37746Z.toString());
                this.f37749b.m39108a(this.f37727G, this.f37726F, z, str, this.f37772y, c13154cM37476a);
                this.f37762o.postDelayed(fVar, this.f37726F * 1000);
                return;
            }
            try {
                if (!this.f37755h.equals(c13609c.m39137j())) {
                    C13609c c13609c3 = new C13609c(this.f37747a, this.f37759l, this.f37755h);
                    this.f37749b = c13609c3;
                    c13609c3.m39129d(this.f37767t);
                    this.f37749b.m39130e(this.f37768u);
                }
                if (this.f37767t) {
                    this.f37749b.m39106a(this.f37764q, this.f37765r, this.f37766s);
                }
                if (c13154cM37476a.m37457o() != null && !c13154cM37476a.m37457o().isEmpty()) {
                    this.f37746Z.put(c13154cM37476a.m37457o().get(0).getId());
                }
                this.f37749b.m39105a(this.f37763p);
                this.f37749b.m39113a(this.f37750c);
                try {
                    f fVar2 = new f(this.f37749b, this.f37727G, z, str, c13154cM37476a);
                    try {
                        fVar2.m39268a(this.f37726F);
                        this.f37757j.m39269a(fVar2);
                        this.f37749b.m39110a(this.f37757j);
                        this.f37749b.m39109a(1, this.f37746Z.toString());
                        this.f37749b.m39108a(this.f37727G, this.f37726F, z, str, this.f37772y, c13154cM37476a);
                        this.f37762o.postDelayed(fVar2, this.f37726F * 1000);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        C13082b c13082bM37011a = C13081a.m37011a(880020, exc.getMessage());
                        c13154cM37476a.m37422a(c13082bM37011a);
                        c13154cM37476a.m37430b(true);
                        m39168a(c13082bM37011a, c13154cM37476a);
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardVideoController", exc.getMessage());
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                exc = e4;
            }
        } catch (Exception e5) {
            e = e5;
        }
        C13082b c13082bM37011a2 = C13081a.m37011a(880020, exc.getMessage());
        c13154cM37476a.m37422a(c13082bM37011a2);
        c13154cM37476a.m37430b(true);
        m39168a(c13082bM37011a2, c13154cM37476a);
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37816b("RewardVideoController", exc.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m39244c(String str, String str2) {
        try {
            this.f37747a = C13008c.m36588n().m36542d();
            this.f37755h = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f37759l = str;
            this.f37756i = new MBridgeIds(this.f37759l, this.f37755h);
            this.f37751d = C14222b.m42658b().m42670c();
            C13167a.m37543b().execute(new RunnableC13615c(this.f37747a, this.f37755h));
            if (this.f37731K == null) {
                this.f37731K = C13017g.m36693a(C13008c.m36588n().m36542d());
            }
        } catch (Throwable th) {
            C13219q0.m37817b("RewardVideoController", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m39245c(boolean z) {
        try {
            if (m39199c()) {
                if (z) {
                    m39202d("is_ready_start", "over cap check error");
                    C13154c c13154c = new C13154c();
                    C13157e c13157e = new C13157e();
                    c13157e.m37501a("type", 10);
                    c13154c.m37423a("m_offer_ready", c13157e);
                    m39184a(false, c13154c, (List<CampaignEx>) this.f37749b.m39135h());
                }
            } else {
                if (!this.f37768u) {
                    return m39203d();
                }
                try {
                    return m39188a(z);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoController", e2.getMessage());
                    }
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoController", th.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m39246d(boolean z) {
        this.f37767t = z;
        if (z) {
            this.f37763p = C13088a.f35858X;
        } else {
            this.f37763p = C13088a.f35857W;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m39247e() {
        C13215o0.m37798b();
    }

    /* JADX INFO: renamed from: e */
    public void m39248e(boolean z) {
        this.f37768u = z;
    }

    /* JADX INFO: renamed from: f */
    public void m39249f(boolean z) {
        this.f37772y = z;
    }

    /* JADX INFO: renamed from: g */
    public MBridgeIds m39250g() {
        return this.f37756i;
    }

    /* JADX INFO: renamed from: h */
    public List<CampaignEx> m39251h() {
        return this.f37740T;
    }

    /* JADX INFO: renamed from: i */
    public CopyOnWriteArrayList<CampaignEx> m39252i() {
        return this.f37739S;
    }

    /* JADX INFO: renamed from: j */
    public String m39253j() {
        C13609c c13609c = this.f37749b;
        return c13609c != null ? c13609c.m39133g() : "";
    }

    /* JADX INFO: renamed from: k */
    public h m39254k() {
        return this.f37753f;
    }

    /* JADX INFO: renamed from: l */
    public String m39255l() {
        return this.f37759l;
    }

    /* JADX INFO: renamed from: m */
    public String m39256m() {
        C13609c c13609c = this.f37749b;
        return c13609c != null ? c13609c.m39104a(this.f37723C) : "";
    }

    /* JADX INFO: renamed from: n */
    public C13609c m39257n() {
        return this.f37749b;
    }

    /* JADX INFO: renamed from: o */
    public InterVideoOutListener m39258o() {
        return this.f37752e;
    }

    /* JADX INFO: renamed from: p */
    public String m39259p() {
        return this.f37755h;
    }

    /* JADX INFO: renamed from: q */
    public void m39260q() {
        C13167a.m37543b().execute(new e());
    }

    /* JADX INFO: renamed from: r */
    public boolean m39261r() {
        return this.f37768u;
    }

    /* JADX INFO: renamed from: s */
    public boolean m39262s() {
        return this.f37771x;
    }

    /* JADX INFO: renamed from: t */
    public boolean m39263t() {
        return this.f37767t;
    }

    /* JADX INFO: renamed from: u */
    public boolean m39264u() {
        return (this.f37752e == null || this.f37753f == null) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public void m39265v() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.f37723C || (concurrentHashMap = f37719e0) == null || concurrentHashMap.containsKey(m39256m())) {
            return;
        }
        f37719e0.remove(m39256m());
    }
}
