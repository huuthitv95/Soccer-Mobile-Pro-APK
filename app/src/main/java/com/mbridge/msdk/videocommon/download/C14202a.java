package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.C13079m;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13023m;
import com.mbridge.msdk.foundation.p289db.C13026n;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.videocommon.cache.C14201a;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.a */
/* JADX INFO: compiled from: CampaignDownLoadTask.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14202a implements Serializable {

    /* JADX INFO: renamed from: A */
    private int f40973A;

    /* JADX INFO: renamed from: B */
    private File f40974B;

    /* JADX INFO: renamed from: D */
    private int f40976D;

    /* JADX INFO: renamed from: E */
    private int f40977E;

    /* JADX INFO: renamed from: F */
    private int f40978F;

    /* JADX INFO: renamed from: G */
    private boolean f40979G;

    /* JADX INFO: renamed from: H */
    private C13640l f40980H;

    /* JADX INFO: renamed from: I */
    private C14223c f40981I;

    /* JADX INFO: renamed from: J */
    private C13640l f40982J;

    /* JADX INFO: renamed from: b */
    private int f40993b;

    /* JADX INFO: renamed from: c */
    private int f40994c;

    /* JADX INFO: renamed from: g */
    private InterfaceC14217a f40998g;

    /* JADX INFO: renamed from: h */
    private InterfaceC14217a f40999h;

    /* JADX INFO: renamed from: i */
    private CampaignEx f41000i;

    /* JADX INFO: renamed from: j */
    private String f41001j;

    /* JADX INFO: renamed from: k */
    private Context f41002k;

    /* JADX INFO: renamed from: l */
    private long f41003l;

    /* JADX INFO: renamed from: m */
    private String f41004m;

    /* JADX INFO: renamed from: n */
    private String f41005n;

    /* JADX INFO: renamed from: p */
    private String f41007p;

    /* JADX INFO: renamed from: r */
    private long f41009r;

    /* JADX INFO: renamed from: u */
    private C13023m f41012u;

    /* JADX INFO: renamed from: w */
    private String f41014w;

    /* JADX INFO: renamed from: x */
    private DownloadRequest f41015x;

    /* JADX INFO: renamed from: y */
    private int f41016y;

    /* JADX INFO: renamed from: z */
    private boolean f41017z;

    /* JADX INFO: renamed from: a */
    private boolean f40992a = false;

    /* JADX INFO: renamed from: d */
    private boolean f40995d = false;

    /* JADX INFO: renamed from: e */
    private volatile int f40996e = 0;

    /* JADX INFO: renamed from: f */
    private CopyOnWriteArrayList<InterfaceC14204c> f40997f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o */
    private long f41006o = 0;

    /* JADX INFO: renamed from: q */
    private boolean f41008q = false;

    /* JADX INFO: renamed from: s */
    private int f41010s = 100;

    /* JADX INFO: renamed from: t */
    private boolean f41011t = false;

    /* JADX INFO: renamed from: v */
    private boolean f41013v = false;

    /* JADX INFO: renamed from: C */
    private int f40975C = 1;

    /* JADX INFO: renamed from: K */
    private boolean f40983K = false;

    /* JADX INFO: renamed from: L */
    private boolean f40984L = false;

    /* JADX INFO: renamed from: M */
    private boolean f40985M = false;

    /* JADX INFO: renamed from: N */
    private boolean f40986N = false;

    /* JADX INFO: renamed from: O */
    private boolean f40987O = false;

    /* JADX INFO: renamed from: P */
    private boolean f40988P = false;

    /* JADX INFO: renamed from: Q */
    private boolean f40989Q = false;

    /* JADX INFO: renamed from: R */
    private OnDownloadStateListener f40990R = new b();

    /* JADX INFO: renamed from: S */
    private OnProgressStateListener f40991S = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.a$a */
    /* JADX INFO: compiled from: CampaignDownLoadTask.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C14202a.this.f41012u == null) {
                C14202a.this.f41012u = C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d()));
            }
            try {
                try {
                    C14202a.this.f41012u.m36724a(C14202a.this.f41004m);
                    if (!C13223s0.m37831a().m37842a("r_d_v_b_l", true)) {
                        File file = new File(C14202a.this.f41007p);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                    C14202a.this.f40996e = 0;
                } finally {
                    C14202a.this.f40996e = 0;
                }
            } catch (Throwable unused) {
                C13219q0.m37816b("CampaignDownLoadTask", "del DB or file failed");
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.a$b */
    /* JADX INFO: compiled from: CampaignDownLoadTask.java */
    class b implements OnDownloadStateListener {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                C13219q0.m37816b("CampaignDownLoadTask", "onDownloadComplete callback : " + C14202a.this.f41006o + "    " + C14202a.this.f41003l);
                if (C14202a.this.f41012u == null) {
                    C14202a.this.f41012u = C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                }
                C14202a.this.f41012u.m36723a(C14202a.this.f41004m, C14202a.this.f41006o, 5, C14202a.this.f41003l);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th) {
                        C13219q0.m37816b("CampaignDownLoadTask", th.getMessage());
                        str = "";
                    }
                } else {
                    str = "";
                }
                C14202a c14202a = C14202a.this;
                c14202a.m42478a(c14202a.f41006o, true, str);
                C14202a.this.m42444a(1, true, "");
            } catch (Exception e) {
                C13219q0.m37816b("CampaignDownLoadTask", e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (C14202a.this.f41015x == null || C14202a.this.f41015x.getStatus() == DownloadStatus.CANCELLED) {
                return;
            }
            C13157e c13157e = new C13157e();
            c13157e.m37501a("cache", C14202a.this.f41015x.get("cache", "2"));
            C14202a c14202a = C14202a.this;
            c14202a.m42446a(c14202a.f41000i, c13157e);
            String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
            C14202a.this.m42471r();
            C14202a.this.m42443a(3, message, "");
            C14202a.this.m42485b(message);
            C14202a c14202a2 = C14202a.this;
            c14202a2.m42444a(3, c14202a2.f41017z, message);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
            C14202a.this.f40996e = 1;
            if (C14202a.this.f41012u == null) {
                C14202a.this.f41012u = C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d()));
            }
            C14202a.this.f41012u.m36722a(C14202a.this.f41000i, C14202a.this.f41003l, C14202a.this.f41007p, C14202a.this.f40996e);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.a$c */
    /* JADX INFO: compiled from: CampaignDownLoadTask.java */
    class c implements OnProgressStateListener {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("cache", C14202a.this.f41015x.get("cache", "2"));
                C14202a c14202a = C14202a.this;
                c14202a.m42446a(c14202a.f41000i, c13157e);
                C14202a.this.f41006o = downloadProgress.getCurrent();
                C14202a.this.f41003l = downloadProgress.getTotal();
                C14202a.this.f41016y = downloadProgress.getCurrentDownloadRate();
                if (C14202a.this.f41010s != 100 && downloadProgress.getCurrentDownloadRate() >= C14202a.this.f41010s) {
                    C13219q0.m37816b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + C14202a.this.f41010s + " " + C14202a.this.f40994c);
                    if (C14202a.this.f40995d) {
                        return;
                    }
                    C14202a.this.f40995d = true;
                    if (!C14202a.this.f41017z) {
                        C14202a.this.m42444a(1, true, "");
                        C14202a.this.m42478a(downloadProgress.getCurrent(), false, "");
                    }
                    if (C14202a.this.f41015x == null || C14202a.this.f40975C != 2 || C14202a.this.f41017z) {
                        return;
                    }
                    C14202a.this.f41015x.cancel(downloadMessage);
                }
            } catch (Exception e) {
                C13219q0.m37816b("CampaignDownLoadTask", e.getMessage());
            }
        }
    }

    public C14202a(Context context, CampaignEx campaignEx, String str, int i) {
        this.f40993b = 1;
        this.f40979G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        C13635g c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
        if (c13635gM39714b != null) {
            this.f40979G = c13635gM39714b.m39412H0();
        }
        this.f40976D = C13088a.f35879u;
        this.f40977E = C13088a.f35880v;
        this.f40978F = C13088a.f35878t;
        this.f41009r = System.currentTimeMillis();
        this.f41002k = C13008c.m36588n().m36542d();
        this.f41000i = campaignEx;
        this.f41001j = str;
        this.f40993b = i;
        if (campaignEx != null) {
            this.f41004m = campaignEx.getVideoUrlEncode();
        }
        this.f41014w = C13215o0.m37804d(this.f41004m);
        this.f41005n = C13098e.m37149b(EnumC13096c.MBRIDGE_VC) + File.separator;
        this.f41007p = this.f41005n + this.f41014w;
        C13219q0.m37818c("CampaignDownLoadTask", this.f41000i.getAppName() + " videoLocalPath:" + this.f41007p + " videoUrl: " + this.f41000i.getVideoUrlEncode() + " " + this.f41010s);
        m42470q();
    }

    /* JADX INFO: renamed from: a */
    private int m42437a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            C13219q0.m37816b("CampaignDownLoadTask", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private DownloadRequest<?> m42442a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.f40976D).withConnectTimeout(this.f40978F).withWriteTimeout(this.f40977E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f41005n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).withTimeout(60000L).with("do_us_fi_re", Boolean.toString(this.f40979G)).with("download_scene", "download_video").with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f41010s)).with("scenes", str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m42443a(int i, String str, String str2) {
        C13080n c13080n = new C13080n(this.f41002k, this.f41000i, i, Long.toString(this.f41009r != 0 ? System.currentTimeMillis() - this.f41009r : 0L), this.f41003l, this.f40973A);
        c13080n.m36962b(this.f41000i.getId());
        c13080n.m37006v(this.f41000i.getVideoUrlEncode());
        c13080n.m36988m(str);
        c13080n.m36990n(this.f41000i.getRequestId());
        c13080n.m36984k(this.f41000i.getCurrentLocalRid());
        c13080n.m36992o(this.f41000i.getRequestIdNotice());
        c13080n.m37004u(this.f41001j);
        c13080n.m36996q(str2);
        c13080n.m36963b(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f41010s));
        c13080n.m36963b("url", this.f41000i.getVideoUrlEncode());
        c13080n.m36971e(4);
        DownloadRequest downloadRequest = this.f41015x;
        if (downloadRequest != null) {
            c13080n.m36963b("scenes", downloadRequest.get("scenes", ""));
            c13080n.m36963b("resumed_breakpoint", this.f41015x.get("resumed_breakpoint", ""));
        }
        int i2 = this.f40973A;
        if (i2 == 94 || i2 == 287) {
            return;
        }
        C13026n.m36744a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36745a(c13080n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m42444a(int i, boolean z, String str) {
        if (this.f40988P) {
            return;
        }
        try {
            this.f40988P = true;
            C13157e c13157e = new C13157e();
            DownloadRequest downloadRequest = this.f41015x;
            if (downloadRequest != null) {
                c13157e.m37501a("scenes", downloadRequest.get("scenes", ""));
                c13157e.m37501a("url", this.f41004m);
                c13157e.m37501a("resumed_breakpoint", this.f41015x.get("resumed_breakpoint", ""));
                c13157e.m37501a("h3c", "");
            }
            c13157e.m37501a("resource_type", 4);
            c13157e.m37501a("file_size", Long.valueOf(this.f41003l));
            c13157e.m37501a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f41010s));
            c13157e.m37501a("result", Integer.valueOf(i));
            c13157e.m37501a("reason", str);
            C13156d.m37475b().m37483a("m_download_end", this.f41000i, c13157e);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m42445a(long j, int i) {
        long j2;
        this.f41006o = j;
        int i2 = this.f41010s;
        if (100 * j >= ((long) i2) * this.f41003l && !this.f41011t && i != 4) {
            if (i2 == 100 && i != 5) {
                this.f40996e = 5;
                return;
            }
            this.f41011t = true;
            C13219q0.m37816b("CampaignDownLoadTask", "UpdateListener : state: " + i + " progress : " + j);
            String strM42500k = m42500k();
            if (TextUtils.isEmpty(strM42500k)) {
                InterfaceC14217a interfaceC14217a = this.f40998g;
                if (interfaceC14217a != null) {
                    interfaceC14217a.mo34468a(this.f41004m);
                }
                InterfaceC14217a interfaceC14217a2 = this.f40999h;
                if (interfaceC14217a2 != null) {
                    interfaceC14217a2.mo34468a(this.f41004m);
                }
            } else {
                InterfaceC14217a interfaceC14217a3 = this.f40998g;
                if (interfaceC14217a3 != null) {
                    interfaceC14217a3.mo34469a("file is not effective " + strM42500k, this.f41004m);
                }
                InterfaceC14217a interfaceC14217a4 = this.f40999h;
                if (interfaceC14217a4 != null) {
                    interfaceC14217a4.mo34469a("file is not effective " + strM42500k, this.f41004m);
                }
            }
        }
        if (this.f40992a || j <= 0) {
            j2 = j;
        } else {
            this.f40992a = true;
            if (this.f41012u == null) {
                this.f41012u = C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d()));
            }
            j2 = j;
            this.f41012u.m36723a(this.f41004m, j2, this.f40996e, this.f41003l);
        }
        CopyOnWriteArrayList<InterfaceC14204c> copyOnWriteArrayList = this.f40997f;
        if (copyOnWriteArrayList != null) {
            for (InterfaceC14204c interfaceC14204c : copyOnWriteArrayList) {
                if (interfaceC14204c != null) {
                    interfaceC14204c.onProgress(j2, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m42446a(CampaignEx campaignEx, C13157e c13157e) {
        if (this.f40987O || campaignEx == null || c13157e == null) {
            return;
        }
        this.f40987O = true;
        try {
            c13157e.m37501a("resource_type", 4);
            DownloadRequest downloadRequest = this.f41015x;
            if (downloadRequest != null) {
                c13157e.m37501a("scenes", downloadRequest.get("scenes", "1"));
                c13157e.m37501a("resumed_breakpoint", this.f41015x.get("resumed_breakpoint", "2"));
            } else {
                c13157e.m37501a("scenes", "1");
                c13157e.m37501a("resumed_breakpoint", "1");
            }
            c13157e.m37501a("url", campaignEx.getVideoUrlEncode());
            c13157e.m37501a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(m42455c(campaignEx)));
            C13156d.m37475b().m37483a("m_download_start", campaignEx, c13157e);
        } catch (Exception e) {
            C13219q0.m37816b("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private int m42451b(CampaignEx campaignEx) {
        try {
            C13640l c13640l = this.f40982J;
            if (c13640l != null) {
                return c13640l.m39606C();
            }
            return 100;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            C13219q0.m37816b("CampaignDownLoadTask", e.getMessage());
            return 100;
        }
    }

    /* JADX INFO: renamed from: c */
    private int m42455c(CampaignEx campaignEx) {
        int iM42457d;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            iM42457d = campaignEx.getReady_rate();
            C13219q0.m37813a("CampaignDownLoadTask", "ready_rate(campaign): " + iM42457d);
        } else {
            iM42457d = m42457d(campaignEx);
            C13219q0.m37813a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + iM42457d);
        }
        try {
            return Math.max(iM42457d, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: d */
    private int m42457d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f40980H == null) {
                    this.f40980H = C13636h.m39706b().m39719d(C13008c.m36588n().m36533b(), this.f41001j);
                }
                return this.f40980H.m39606C();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.f40982J == null) {
                    this.f40982J = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), this.f41001j);
                }
                return m42451b((CampaignEx) null);
            }
            if (this.f40981I == null) {
                this.f40981I = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f41001j, false);
            }
            return this.f40981I.m42758w();
        } catch (Throwable th) {
            C13219q0.m37817b("CampaignDownLoadTask", th.getMessage(), th);
            return 100;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m42458d() {
        C13167a.m37543b().execute(new a());
    }

    /* JADX INFO: renamed from: q */
    private void m42470q() {
        File file;
        File file2;
        try {
            if (TextUtils.isEmpty(this.f41004m)) {
                return;
            }
            if (TextUtils.isEmpty(this.f41005n)) {
                file = null;
            } else {
                file = new File(this.f41005n);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            if (file != null && file.exists() && ((file2 = this.f40974B) == null || !file2.exists())) {
                File file3 = new File(file + "/.nomedia");
                this.f40974B = file3;
                if (!file3.exists()) {
                    this.f40974B.createNewFile();
                }
            }
            m42472z();
            m42481a(this.f41004m);
        } catch (Exception e) {
            C13219q0.m37818c("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m42471r() {
        try {
            C13229v0.m37896a(this.f41001j, this.f41000i, C13088a.f35882x);
        } catch (Exception e) {
            C13219q0.m37816b("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: z */
    private void m42472z() {
        if (this.f41012u == null) {
            this.f41012u = C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        C13079m c13079mM36728b = this.f41012u.m36728b(this.f41004m, "");
        if (c13079mM36728b != null) {
            this.f41006o = c13079mM36728b.m36947c();
            if (this.f40996e != 2) {
                this.f40996e = c13079mM36728b.m36943b();
            }
            if (this.f40996e == 1) {
                this.f40996e = 2;
            }
            this.f41003l = c13079mM36728b.m36948d();
            if (c13079mM36728b.m36939a() > 0) {
                this.f41009r = c13079mM36728b.m36939a();
            }
            if (this.f40996e == 5) {
                if (Objects.exists(new File(this.f41005n + this.f41014w), this.f41005n, this.f41014w)) {
                    this.f41007p = this.f41005n + this.f41014w;
                } else {
                    m42458d();
                }
            } else if (this.f40996e != 0) {
                this.f41007p = this.f41005n + this.f41014w;
            }
        } else {
            this.f41012u.m36725a(this.f41004m, this.f41009r);
        }
        try {
            long j = this.f41003l;
            if (j <= 0 || this.f41006o * 100 < j * ((long) m42455c(this.f41000i))) {
                return;
            }
            if (m42455c(this.f41000i) == 100 || this.f40996e == 5) {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("cache", 1);
                m42446a(this.f41000i, c13157e);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m42473A() {
        if (this.f40989Q) {
            return;
        }
        try {
            this.f41017z = true;
            if (this.f40975C == 1) {
                C13219q0.m37816b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.f40975C);
            } else {
                if (this.f40993b == 3) {
                    C13219q0.m37816b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f40993b);
                    return;
                }
                C13219q0.m37816b("CampaignDownLoadTask", "resume()");
                this.f40987O = false;
                this.f40988P = false;
                DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f41004m, this.f41014w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                downloadMessage.setUseCronetDownload(m42437a(this.f41000i));
                DownloadRequest<?> downloadRequestM42442a = m42442a(downloadMessage, this.f40990R, this.f40991S, "2");
                this.f41015x = downloadRequestM42442a;
                downloadRequestM42442a.start();
            }
        } catch (Exception e) {
            C13219q0.m37816b("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: B */
    public void m42474B() {
        C13219q0.m37816b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f41004m)) {
                return;
            }
            if (m42498i() != null) {
                C13219q0.m37816b("CampaignDownLoadTask", new URL(m42498i()).getPath());
            }
            if (this.f41010s == 0 && this.f40975C == 2) {
                C13219q0.m37816b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f41015x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            InterfaceC14217a interfaceC14217a = this.f40998g;
            if (interfaceC14217a != null) {
                interfaceC14217a.mo34469a("VideoUrl is not illegal, Please check it.", "");
            }
            InterfaceC14217a interfaceC14217a2 = this.f40999h;
            if (interfaceC14217a2 != null) {
                interfaceC14217a2.mo34469a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m42475C() {
        C13219q0.m37816b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f41004m)) {
                InterfaceC14217a interfaceC14217a = this.f40998g;
                if (interfaceC14217a != null) {
                    interfaceC14217a.mo34468a(this.f41004m);
                    return;
                }
                return;
            }
            if (m42498i() != null) {
                C13219q0.m37816b("CampaignDownLoadTask", new URL(m42498i()).getPath());
            }
            if (this.f40993b == 3) {
                C13219q0.m37816b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                InterfaceC14217a interfaceC14217a2 = this.f40998g;
                if (interfaceC14217a2 != null) {
                    interfaceC14217a2.mo34468a(this.f41004m);
                    return;
                }
                return;
            }
            if (this.f41010s == 0 && this.f40975C == 2) {
                C13219q0.m37816b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                InterfaceC14217a interfaceC14217a3 = this.f40998g;
                if (interfaceC14217a3 != null) {
                    interfaceC14217a3.mo34468a(this.f41004m);
                    return;
                }
                return;
            }
            try {
                if (this.f40996e == 5 && Utils.getDownloadRate(this.f41003l, this.f41006o) >= this.f41010s) {
                    if (Objects.exists(new File(this.f41005n + this.f41014w), this.f41005n, this.f41014w)) {
                        this.f41007p = this.f41005n + this.f41014w;
                        InterfaceC14217a interfaceC14217a4 = this.f40998g;
                        if (interfaceC14217a4 != null) {
                            interfaceC14217a4.mo34468a(this.f41004m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e) {
                C13219q0.m37816b("CampaignDownLoadTask", "startForLoadRefactor: " + e.getMessage());
            }
            DownloadRequest downloadRequest = this.f41015x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            InterfaceC14217a interfaceC14217a5 = this.f40998g;
            if (interfaceC14217a5 != null) {
                interfaceC14217a5.mo34469a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42476a(int i) {
        this.f40973A = i;
    }

    /* JADX INFO: renamed from: a */
    public void m42477a(int i, int i2) {
        this.f40996e = i;
        if (this.f41012u == null) {
            this.f41012u = C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        this.f41012u.m36723a(this.f41004m, i2, i, this.f41003l);
    }

    /* JADX INFO: renamed from: a */
    public void m42478a(long j, boolean z, String str) {
        C13219q0.m37816b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f41006o + "  progressSize " + j + "  " + this.f41016y + "%   FileSize : " + this.f41003l + "  " + this.f41000i.getAppName());
        if (this.f41010s != 100 || this.f40993b == 3 || j == this.f41003l || z) {
            this.f40996e = 5;
            if (j == this.f41003l) {
                m42443a(1, "", str);
            }
            this.f40992a = false;
            m42445a(j, this.f40996e);
            return;
        }
        File file = new File(this.f41007p);
        C13219q0.m37816b("CampaignDownLoadTask", "progressSize = " + j + " fileSize = " + this.f41003l + " " + z + " absFileSize = " + (Objects.exists(file, this.f41005n, this.f41014w) ? file.length() : 0L));
        m42485b("File size is not match witch download size.");
    }

    /* JADX INFO: renamed from: a */
    public void m42479a(InterfaceC14204c interfaceC14204c) {
        CopyOnWriteArrayList<InterfaceC14204c> copyOnWriteArrayList = this.f40997f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(interfaceC14204c);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42480a(InterfaceC14217a interfaceC14217a) {
        this.f40998g = interfaceC14217a;
    }

    /* JADX INFO: renamed from: a */
    public void m42481a(String str) {
        int iM42455c;
        if (TextUtils.isEmpty(str)) {
            this.f40999h.mo34469a("VideoUrl is NULL, Please check it.", "");
            return;
        }
        if (this.f40996e == 1) {
            C13219q0.m37813a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
            return;
        }
        if (this.f40996e == 5 && Utils.getDownloadRate(this.f41003l, this.f41006o) >= this.f41010s) {
            C13219q0.m37813a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
            InterfaceC14217a interfaceC14217a = this.f40998g;
            if (interfaceC14217a != null) {
                interfaceC14217a.mo34468a(this.f41004m);
            }
            InterfaceC14217a interfaceC14217a2 = this.f40999h;
            if (interfaceC14217a2 != null) {
                interfaceC14217a2.mo34468a(this.f41004m);
            }
            try {
                File file = new File(this.f41007p);
                if (Objects.exists(file, this.f41005n, this.f41014w) && file.isFile()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            } catch (Exception e) {
                C13219q0.m37816b("CampaignDownLoadTask", e.getMessage());
            }
            C13157e c13157e = new C13157e();
            c13157e.m37501a("cache", 1);
            m42446a(this.f41000i, c13157e);
            return;
        }
        if (this.f40993b == 3) {
            C13219q0.m37813a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
            m42478a(0L, false, "");
            C13157e c13157e2 = new C13157e();
            c13157e2.m37501a("cache", 1);
            m42446a(this.f41000i, c13157e2);
            return;
        }
        try {
            iM42455c = m42455c(this.f41000i);
        } catch (Exception unused) {
            iM42455c = 100;
        }
        m42490d(iM42455c);
        if (iM42455c == 0) {
            InterfaceC14217a interfaceC14217a3 = this.f40998g;
            if (interfaceC14217a3 != null) {
                interfaceC14217a3.mo34468a(this.f41004m);
            }
            InterfaceC14217a interfaceC14217a4 = this.f40999h;
            if (interfaceC14217a4 != null) {
                interfaceC14217a4.mo34468a(this.f41004m);
            }
        }
        DownloadMessage downloadMessage = new DownloadMessage(this.f41000i, str, this.f41014w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        downloadMessage.setUseCronetDownload(m42437a(this.f41000i));
        downloadMessage.addExtra("resource_type", 4);
        this.f41015x = m42442a(downloadMessage, this.f40990R, this.f40991S, "1");
    }

    /* JADX INFO: renamed from: a */
    public void m42482a(boolean z) {
        this.f40983K = z;
    }

    /* JADX INFO: renamed from: b */
    public void m42483b(int i) {
        this.f40994c = i;
    }

    /* JADX INFO: renamed from: b */
    public void m42484b(InterfaceC14217a interfaceC14217a) {
        this.f40999h = interfaceC14217a;
    }

    /* JADX INFO: renamed from: b */
    public void m42485b(String str) {
        InterfaceC14217a interfaceC14217a = this.f40998g;
        if (interfaceC14217a != null) {
            interfaceC14217a.mo34469a(str, this.f41004m);
        }
        InterfaceC14217a interfaceC14217a2 = this.f40999h;
        if (interfaceC14217a2 != null) {
            interfaceC14217a2.mo34469a(str, this.f41004m);
        }
        C13219q0.m37816b("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f40996e == 4 || this.f40996e == 2 || this.f40996e == 5) {
            return;
        }
        this.f40996e = 4;
        CampaignEx campaignEx = this.f41000i;
        if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f41000i.getRsIgnoreCheckRule().size() <= 0 || !this.f41000i.getRsIgnoreCheckRule().contains(0)) {
            m42445a(this.f41006o, this.f40996e);
        } else {
            C13219q0.m37818c("CampaignDownLoadTask", "Is not check video download status");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42486b(boolean z) {
        this.f41013v = z;
    }

    /* JADX INFO: renamed from: c */
    public void m42487c(int i) {
        this.f40993b = i;
    }

    /* JADX INFO: renamed from: c */
    public void m42488c(String str) {
        m42471r();
        m42443a(2, str, "");
        this.f40996e = 4;
    }

    /* JADX INFO: renamed from: c */
    public void m42489c(boolean z) {
        this.f40984L = z;
    }

    /* JADX INFO: renamed from: d */
    public void m42490d(int i) {
        C13219q0.m37813a("CampaignDownLoadTask", "set ready rate: " + i);
        this.f41010s = i;
    }

    /* JADX INFO: renamed from: d */
    public void m42491d(boolean z) {
        this.f41008q = z;
    }

    /* JADX INFO: renamed from: e */
    public void m42492e(int i) {
        this.f40975C = i;
    }

    /* JADX INFO: renamed from: e */
    public void m42493e(CampaignEx campaignEx) {
        this.f41000i = campaignEx;
    }

    /* JADX INFO: renamed from: e */
    public void m42494e(boolean z) {
        this.f40986N = z;
    }

    /* JADX INFO: renamed from: f */
    public void m42495f(boolean z) {
        this.f40985M = z;
    }

    /* JADX INFO: renamed from: g */
    public void m42496g() {
        try {
            m42458d();
            CampaignEx campaignEx = this.f41000i;
            if (campaignEx == null || campaignEx.getPlayable_ads_without_video() != 2) {
                C14201a c14201aM42411a = C14201a.m42411a();
                if (c14201aM42411a != null) {
                    c14201aM42411a.m42417a(this.f41000i);
                }
            }
        } catch (Exception unused) {
            C13219q0.m37816b("CampaignDownLoadTask", "del file is failed");
        } finally {
            this.f40996e = 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public CampaignEx m42497h() {
        return this.f41000i;
    }

    /* JADX INFO: renamed from: i */
    public String m42498i() {
        return this.f41004m;
    }

    /* JADX INFO: renamed from: j */
    public long m42499j() {
        return this.f41003l;
    }

    /* JADX INFO: renamed from: k */
    public String m42500k() {
        String message = "";
        if (this.f40993b == 3) {
            return "";
        }
        String str = this.f41005n + this.f41014w;
        File file = new File(str);
        try {
            if (!Objects.exists(file, this.f41005n, this.f41014w)) {
                message = "file is not exist ";
            } else if (!file.isFile()) {
                message = "file is not file ";
            } else if (!file.canRead()) {
                message = "file can not read ";
            } else if (file.length() > 0) {
                this.f41007p = str;
            } else {
                message = "file length is 0 ";
            }
        } catch (Throwable th) {
            C13219q0.m37816b("CampaignDownLoadTask", th.getMessage());
            message = th.getMessage();
        }
        if (this.f40996e == 5 && !TextUtils.isEmpty(message)) {
            m42458d();
        }
        return message;
    }

    /* JADX INFO: renamed from: l */
    public String m42501l() {
        if (this.f40989Q) {
            try {
                File file = new File(this.f41007p);
                return (file.exists() && file.isFile()) ? this.f41007p : this.f41004m;
            } catch (Exception e) {
                C13219q0.m37816b("CampaignDownLoadTask", e.getMessage());
                return this.f41004m;
            }
        }
        try {
            File file2 = new File(this.f41007p);
            if (Objects.exists(file2, this.f41005n, this.f41014w) && file2.isFile()) {
                return this.f41007p;
            }
        } catch (Exception e2) {
            C13219q0.m37816b("CampaignDownLoadTask", e2.getMessage());
        }
        return this.f41004m;
    }

    /* JADX INFO: renamed from: m */
    public long m42502m() {
        return this.f41006o;
    }

    /* JADX INFO: renamed from: n */
    public long m42503n() {
        return this.f41009r;
    }

    /* JADX INFO: renamed from: o */
    public int m42504o() {
        return this.f40996e;
    }

    /* JADX INFO: renamed from: p */
    public String m42505p() {
        return this.f41007p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m42506s() {
        return this.f40983K;
    }

    /* JADX INFO: renamed from: t */
    public boolean m42507t() {
        return this.f41013v;
    }

    /* JADX INFO: renamed from: u */
    public boolean m42508u() {
        return this.f40984L;
    }

    /* JADX INFO: renamed from: v */
    public boolean m42509v() {
        return this.f40989Q;
    }

    /* JADX INFO: renamed from: w */
    public boolean m42510w() {
        return this.f40986N;
    }

    /* JADX INFO: renamed from: x */
    public boolean m42511x() {
        return this.f40985M;
    }

    /* JADX INFO: renamed from: y */
    public void m42512y() {
        if (this.f40997f != null) {
            this.f40997f = null;
        }
    }
}
