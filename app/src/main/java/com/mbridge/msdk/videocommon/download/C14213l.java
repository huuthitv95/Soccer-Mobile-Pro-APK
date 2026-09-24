package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.videocommon.cache.C14201a;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.l */
/* JADX INFO: compiled from: UnitCacheCtroller.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14213l {

    /* JADX INFO: renamed from: c */
    private InterfaceC14217a f41055c;

    /* JADX INFO: renamed from: e */
    private ConcurrentHashMap<String, InterfaceC14217a> f41057e;

    /* JADX INFO: renamed from: h */
    private Context f41060h;

    /* JADX INFO: renamed from: j */
    private String f41062j;

    /* JADX INFO: renamed from: k */
    private C14223c f41063k;

    /* JADX INFO: renamed from: m */
    private int f41065m;

    /* JADX INFO: renamed from: p */
    private C14212k f41068p;

    /* JADX INFO: renamed from: q */
    private boolean f41069q;

    /* JADX INFO: renamed from: a */
    private List<CampaignEx> f41053a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private boolean f41054b = true;

    /* JADX INFO: renamed from: d */
    private String f41056d = "";

    /* JADX INFO: renamed from: f */
    private InterfaceC14204c f41058f = new a();

    /* JADX INFO: renamed from: g */
    private CopyOnWriteArrayList<Map<String, C14202a>> f41059g = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: i */
    private long f41061i = 3600;

    /* JADX INFO: renamed from: l */
    private int f41064l = 1;

    /* JADX INFO: renamed from: n */
    C13640l f41066n = null;

    /* JADX INFO: renamed from: o */
    C13640l f41067o = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.l$a */
    /* JADX INFO: compiled from: UnitCacheCtroller.java */
    class a implements InterfaceC14204c {
        a() {
        }

        @Override // com.mbridge.msdk.videocommon.download.InterfaceC14204c
        public void onProgress(long j, int i) {
            if (i == 5 || i == 4) {
                C14213l.this.f41054b = true;
                C14213l.this.m42612d();
            }
            if (i == 2) {
                C14213l.this.f41054b = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.l$b */
    /* JADX INFO: compiled from: UnitCacheCtroller.java */
    class b implements InterfaceC14217a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f41071a;

        b(CampaignEx campaignEx) {
            this.f41071a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34468a(String str) {
            if (C14213l.this.f41055c != null) {
                C14213l.this.f41055c.mo34468a(str);
            }
            if (C14213l.this.f41057e == null || C14213l.this.f41057e.size() <= 0 || this.f41071a == null) {
                return;
            }
            InterfaceC14217a interfaceC14217a = (InterfaceC14217a) C14213l.this.f41057e.get(this.f41071a.getRequestId() + "_" + this.f41071a.getSecondRequestIndex());
            if (interfaceC14217a != null) {
                interfaceC14217a.mo34468a(str);
                C14213l.this.f41057e.remove(this.f41071a.getRequestId() + "_" + this.f41071a.getSecondRequestIndex());
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34469a(String str, String str2) {
            if (C14213l.this.f41055c != null) {
                C14213l.this.f41055c.mo34469a(str, str2);
            }
            CampaignEx campaignEx = this.f41071a;
            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f41071a.getRsIgnoreCheckRule().size() > 0 && this.f41071a.getRsIgnoreCheckRule().contains(0)) {
                C13219q0.m37818c("UnitCacheCtroller", "Is not check video download status");
                return;
            }
            if (C14213l.this.f41057e == null || C14213l.this.f41057e.size() <= 0 || this.f41071a == null) {
                return;
            }
            InterfaceC14217a interfaceC14217a = (InterfaceC14217a) C14213l.this.f41057e.get(this.f41071a.getRequestId() + "_" + this.f41071a.getSecondRequestIndex());
            if (interfaceC14217a != null) {
                interfaceC14217a.mo34469a(str, str2);
                C14213l.this.f41057e.remove(this.f41071a.getRequestId() + "_" + this.f41071a.getSecondRequestIndex());
            }
        }
    }

    public C14213l(Context context, CampaignEx campaignEx, String str, int i) {
        this.f41065m = 1;
        try {
            boolean zM42544b = C14211j.m42542a().m42544b(i);
            this.f41069q = zM42544b;
            if (zM42544b) {
                this.f41062j = str;
                this.f41065m = i;
                this.f41068p = new C14212k(campaignEx, str, i);
                return;
            }
        } catch (Exception unused) {
            this.f41068p = null;
            this.f41069q = false;
        }
        this.f41060h = C13008c.m36588n().m36542d();
        List<CampaignEx> list = this.f41053a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.f41062j = str;
        this.f41065m = i;
        m42587a(this.f41053a);
    }

    public C14213l(Context context, List<CampaignEx> list, String str, int i) {
        this.f41065m = 1;
        try {
            boolean zM42544b = C14211j.m42542a().m42544b(i);
            this.f41069q = zM42544b;
            if (zM42544b) {
                this.f41062j = str;
                this.f41065m = i;
                this.f41068p = new C14212k(list, str, i);
                return;
            }
        } catch (Exception unused) {
            this.f41068p = null;
            this.f41069q = false;
        }
        this.f41060h = C13008c.m36588n().m36542d();
        List<CampaignEx> list2 = this.f41053a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f41062j = str;
        this.f41065m = i;
        m42587a(this.f41053a);
    }

    /* JADX INFO: renamed from: a */
    private int m42584a(CampaignEx campaignEx) {
        try {
            C13640l c13640l = this.f41066n;
            if (c13640l != null) {
                return c13640l.m39606C();
            }
            return 100;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            C13219q0.m37816b("UnitCacheCtroller", e.getMessage());
            return 100;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m42586a() {
        CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList = this.f41059g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i = 0;
                    while (i < this.f41059g.size()) {
                        Map<String, C14202a> map = this.f41059g.get(i);
                        Iterator<Map.Entry<String, C14202a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            C14202a value = it.next().getValue();
                            if (value != null && value.m42497h() != null && value.m42507t()) {
                                value.m42512y();
                                this.f41059g.remove(map);
                                i--;
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
                C13219q0.m37816b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[Catch: Exception -> 0x00f2, TryCatch #4 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: Exception -> 0x00f2, TryCatch #4 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[Catch: Exception -> 0x00f2, TryCatch #4 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[Catch: Exception -> 0x00f2, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX INFO: renamed from: a */
    private void m42587a(List<CampaignEx> list) {
        CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList;
        C14221a c14221aM42670c;
        C14223c c14223c;
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.get(0) != null) {
            this.f41056d = list.get(0).getCurrentLocalRid();
        }
        m42586a();
        m42608b();
        int i = this.f41065m;
        if (i == 1) {
            try {
                if (!TextUtils.isEmpty(this.f41062j)) {
                    C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), this.f41062j);
                    this.f41066n = c13640lM39720e;
                    if (c13640lM39720e == null) {
                        this.f41066n = C13640l.m39753i(this.f41062j);
                    }
                    C13640l c13640l = this.f41066n;
                    if (c13640l != null) {
                        this.f41061i = c13640l.m39660p();
                        this.f41064l = this.f41066n.m39662q();
                    }
                }
            } catch (Exception unused) {
                C13219q0.m37816b("UnitCacheCtroller", "make sure your had put native video jar into your project");
                return;
            }
        } else if (i == 287) {
            try {
                c14221aM42670c = C14222b.m42658b().m42670c();
                if (c14221aM42670c == null) {
                    C14222b.m42658b().m42660a();
                }
                if (c14221aM42670c != null) {
                    this.f41061i = c14221aM42670c.m42641c();
                }
                if (!TextUtils.isEmpty(this.f41062j)) {
                    this.f41063k = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), this.f41062j);
                }
                c14223c = this.f41063k;
                if (c14223c != null) {
                    this.f41064l = c14223c.m42736l();
                }
            } catch (Exception unused2) {
                C13219q0.m37816b("UnitCacheCtroller", "make sure your had put reward jar into your project");
                return;
            }
        } else if (i == 298) {
            C13640l c13640lM39709a = C13636h.m39706b().m39709a(C13008c.m36588n().m36533b(), this.f41062j);
            this.f41067o = c13640lM39709a;
            if (c13640lM39709a == null) {
                this.f41067o = C13636h.m39706b().m39716c(C13008c.m36588n().m36533b(), this.f41062j);
            }
            C13640l c13640l2 = this.f41067o;
            if (c13640l2 != null) {
                this.f41061i = c13640l2.m39660p();
                this.f41064l = this.f41067o.m39662q();
            }
        } else if (i == 94) {
            c14221aM42670c = C14222b.m42658b().m42670c();
            if (c14221aM42670c == null) {
                C14222b.m42658b().m42660a();
            }
            if (c14221aM42670c != null) {
                this.f41061i = c14221aM42670c.m42641c();
            }
            if (!TextUtils.isEmpty(this.f41062j)) {
                this.f41063k = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), this.f41062j);
            }
            c14223c = this.f41063k;
            if (c14223c != null) {
                this.f41064l = c14223c.m42736l();
            }
        } else if (i == 95) {
            try {
                if (!TextUtils.isEmpty(this.f41062j)) {
                    C13640l c13640lM39720e2 = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), this.f41062j);
                    if (c13640lM39720e2 == null) {
                        c13640lM39720e2 = C13640l.m39754j(this.f41062j);
                    }
                    if (c13640lM39720e2 != null) {
                        this.f41061i = c13640lM39720e2.m39660p();
                        this.f41064l = c13640lM39720e2.m39662q();
                    }
                }
            } catch (Exception unused3) {
                C13219q0.m37816b("UnitCacheCtroller", "make sure your had put feeds jar into your project");
                return;
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            CampaignEx campaignEx = list.get(i2);
            if (campaignEx != null) {
                int i3 = this.f41065m;
                String str = (i3 == 94 || i3 == 287) ? campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode() : campaignEx.getId() + campaignEx.getVideoUrlEncode() + campaignEx.getBidToken();
                if ((m42599d(campaignEx) || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && (copyOnWriteArrayList = this.f41059g) != null) {
                    synchronized (copyOnWriteArrayList) {
                        int i4 = 0;
                        while (true) {
                            try {
                                if (i4 >= this.f41059g.size()) {
                                    C14202a c14202a = new C14202a(this.f41060h, campaignEx, this.f41062j, this.f41064l);
                                    c14202a.m42487c(this.f41064l);
                                    c14202a.m42476a(this.f41065m);
                                    HashMap map = new HashMap();
                                    map.put(str, c14202a);
                                    this.f41059g.add(map);
                                    break;
                                }
                                Map<String, C14202a> map2 = this.f41059g.get(i4);
                                if (map2 != null && map2.containsKey(str)) {
                                    C14202a c14202a2 = map2.get(str);
                                    if (c14202a2 != null) {
                                        c14202a2.m42493e(campaignEx);
                                        c14202a2.m42487c(this.f41064l);
                                        c14202a2.m42486b(false);
                                        map2.remove(str);
                                        map2.put(str, c14202a2);
                                        this.f41059g.set(i4, map2);
                                    }
                                    m42600e(campaignEx);
                                    break;
                                }
                                i4++;
                            } catch (Throwable th) {
                                if (MBridgeConstans.DEBUG) {
                                    C13219q0.m37816b("UnitCacheCtroller", th.getMessage());
                                }
                            }
                        }
                    }
                }
            }
        }
        List<CampaignEx> list2 = this.f41053a;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.f41053a.clear();
    }

    /* JADX INFO: renamed from: a */
    private boolean m42588a(int i, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            C13219q0.m37818c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            C13219q0.m37813a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m42589a(CampaignEx.C13066c c13066c) {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m42590a(C14202a c14202a, int i) {
        long jM42502m = c14202a.m42502m();
        long jM42499j = c14202a.m42499j();
        if (TextUtils.isEmpty(c14202a.m42498i())) {
            C13219q0.m37813a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i == 0) {
            if (c14202a.m42497h() != null && !TextUtils.isEmpty(c14202a.m42497h().getVideoUrlEncode())) {
                return true;
            }
        } else if (jM42499j > 0 && jM42502m * 100 >= jM42499j * ((long) i)) {
            if (i != 100 || c14202a.m42504o() == 5) {
                return true;
            }
            c14202a.m42496g();
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m42591a(C14202a c14202a, int i, boolean z) {
        long jM42502m = c14202a.m42502m();
        long jM42499j = c14202a.m42499j();
        if (TextUtils.isEmpty(c14202a.m42498i())) {
            C13219q0.m37813a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx campaignExM42497h = c14202a.m42497h();
        if (campaignExM42497h != null) {
            if (campaignExM42497h.getRsIgnoreCheckRule() != null && campaignExM42497h.getRsIgnoreCheckRule().size() > 0 && campaignExM42497h.getRsIgnoreCheckRule().contains(0)) {
                C13219q0.m37818c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (campaignExM42497h.getIsTimeoutCheckVideoStatus() == 1 && campaignExM42497h.getVideoCheckType() == 1) {
                return true;
            }
            if (z && campaignExM42497h.getVideoCheckType() == 1) {
                if (i == 0) {
                    return true;
                }
                if ((jM42499j != 0 || jM42502m != 0) && jM42502m >= ((long) (i / 100)) * jM42499j) {
                    campaignExM42497h.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return m42590a(c14202a, i);
    }

    /* JADX INFO: renamed from: a */
    private boolean m42593a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !C13229v0.m37945l(str)) || C13182a1.m37596a(str) || m42597b(str, campaignEx);
            }
            C13219q0.m37818c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th) {
            C13219q0.m37817b("UnitCacheCtroller", th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m42594a(CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList) {
        try {
            for (Map<String, C14202a> map : copyOnWriteArrayList) {
                if (map != null) {
                    Iterator<Map.Entry<String, C14202a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().m42504o() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m42595b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return campaignEx.getReady_rate() != -1 ? campaignEx.getReady_rate() : m42598c(campaignEx);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    private boolean m42597b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !m42599d(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return C13182a1.m37597b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || C13182a1.m37597b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        C13219q0.m37818c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    /* JADX INFO: renamed from: c */
    private int m42598c(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f41067o == null) {
                    this.f41067o = C13636h.m39706b().m39719d(C13008c.m36588n().m36533b(), this.f41062j);
                }
                return this.f41067o.m39606C();
            }
            if (campaignEx.getAdType() == 42) {
                return m42584a((CampaignEx) null);
            }
            if (this.f41063k == null) {
                this.f41063k = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f41062j, false);
            }
            return this.f41063k.m42758w();
        } catch (Throwable th) {
            C13219q0.m37817b("UnitCacheCtroller", th.getMessage(), th);
            return 100;
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m42599d(CampaignEx campaignEx) {
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

    /* JADX INFO: renamed from: e */
    private void m42600e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("cache", 1);
                c13157e.m37501a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(m42595b(campaignEx)));
                if (m42595b(campaignEx) == 100) {
                    c13157e.m37501a("resumed_breakpoint", "2");
                } else {
                    c13157e.m37501a("resumed_breakpoint", "1");
                }
                c13157e.m37501a("resource_type", 4);
                c13157e.m37501a("scenes", "1");
                c13157e.m37501a("url", campaignEx.getVideoUrlEncode());
                C13156d.m37475b().m37483a("m_download_start", campaignEx, c13157e);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C14202a m42601a(int i, boolean z) {
        C14212k c14212k;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            return c14212k.m42575d();
        }
        try {
            return m42607b(i, z);
        } catch (Throwable th) {
            C13219q0.m37817b("UnitCacheCtroller", th.getMessage(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public C14202a m42602a(String str) {
        C14212k c14212k;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            return c14212k.m42567a(str);
        }
        CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList = this.f41059g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                for (Map<String, C14202a> map : this.f41059g) {
                    if (map != null && map.containsKey(str)) {
                        return map.get(str);
                    }
                }
            } catch (Throwable unused) {
                C13219q0.m37816b("UnitCacheCtroller", "failed to get campaignTast by cid");
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bd A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:126:0x020f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0214 A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:130:0x021a  */
    /* JADX WARN: Code duplicated, block: B:131:0x021e A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0222 A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0241 A[PHI: r16
  0x0241: PHI (r16v11 java.lang.String) = (r16v10 java.lang.String), (r16v10 java.lang.String), (r16v12 java.lang.String) binds: [B:127:0x0212, B:132:0x0220, B:140:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x0245  */
    /* JADX WARN: Code duplicated, block: B:149:0x0259 A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0175 A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:89:0x017b A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x018a A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0192 A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0196  */
    /* JADX WARN: Code duplicated, block: B:95:0x0199 A[Catch: Exception -> 0x027f, all -> 0x0293, TryCatch #0 {Exception -> 0x027f, blocks: (B:54:0x00fa, B:85:0x0166, B:87:0x0175, B:89:0x017b, B:91:0x018a, B:93:0x0192, B:95:0x0199, B:97:0x01a0, B:99:0x01a6, B:105:0x01ae, B:107:0x01bd, B:109:0x01c7, B:111:0x01d5, B:128:0x0214, B:131:0x021e, B:133:0x0222, B:135:0x022c, B:137:0x0232, B:139:0x0238, B:147:0x024f, B:149:0x0259, B:151:0x025f, B:153:0x0265, B:125:0x0201, B:57:0x0108, B:59:0x010e, B:61:0x0118, B:64:0x0121, B:66:0x0127, B:68:0x012d, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0148, B:78:0x0152, B:80:0x0158), top: B:180:0x00fa }] */
    /* JADX INFO: renamed from: a */
    public List<C14202a> m42603a(String str, int i, boolean z, List<CampaignEx> list, boolean z2, C13157e c13157e) {
        long j;
        String str2;
        String str3;
        boolean zIsEmpty;
        int iM42504o;
        int i2;
        int i3;
        C14212k c14212k;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            return c14212k.m42568a(list, z2);
        }
        ArrayList arrayList = new ArrayList();
        String str4 = "";
        CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList = this.f41059g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i4 = 0;
                    while (i4 < this.f41059g.size()) {
                        Map<String, C14202a> map = this.f41059g.get(i4);
                        Iterator<Map.Entry<String, C14202a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            try {
                                C14202a value = it.next().getValue();
                                if (value == null || value.m42497h() == null) {
                                    j = jCurrentTimeMillis;
                                    str4 = "task or task's campaign is NULL";
                                    i4 = i4;
                                } else {
                                    CampaignEx campaignExM42497h = value.m42497h();
                                    boolean z3 = false;
                                    for (CampaignEx campaignEx : list) {
                                        if (campaignExM42497h != null && campaignEx != null && !TextUtils.isEmpty(campaignExM42497h.getRequestId()) && !TextUtils.isEmpty(campaignEx.getRequestId()) && campaignExM42497h.getId().equals(campaignEx.getId()) && campaignExM42497h.getRequestId().equals(campaignEx.getRequestId())) {
                                            if (!TextUtils.isEmpty(campaignEx.getNLRid())) {
                                                campaignExM42497h.setNLRid(campaignEx.getNLRid());
                                            }
                                            z3 = true;
                                        }
                                    }
                                    if (!z3) {
                                        str4 = "campaign is not available";
                                        j = jCurrentTimeMillis;
                                    } else if ((!z || campaignExM42497h.isBidCampaign()) && (z || !campaignExM42497h.isBidCampaign())) {
                                        String str5 = campaignExM42497h.getendcard_url();
                                        String videoUrlEncode = campaignExM42497h.getVideoUrlEncode();
                                        String strM36781j = campaignExM42497h.getRewardTemplateMode() != null ? campaignExM42497h.getRewardTemplateMode().m36781j() : "";
                                        String str6 = str4;
                                        try {
                                            CampaignEx.C13066c rewardTemplateMode = campaignExM42497h.getRewardTemplateMode();
                                            j = jCurrentTimeMillis;
                                            if (i == 94 || i == 287) {
                                                if (TextUtils.isEmpty(strM36781j) || strM36781j.contains(CampaignEx.KEY_IS_CMPT_ENTRY) || m42588a(i, campaignExM42497h, strM36781j)) {
                                                    if (!m42597b(str5, campaignExM42497h)) {
                                                        str2 = "endcard is downloading or fail";
                                                    } else if (value.m42507t()) {
                                                        value.m42512y();
                                                        str3 = "task is displayed";
                                                    } else {
                                                        if (C13182a1.m37596a(videoUrlEncode)) {
                                                            if (m42589a(rewardTemplateMode)) {
                                                                arrayList.add(value);
                                                            } else {
                                                                str2 = "image list is downloading or fail";
                                                            }
                                                        } else if (m42591a(value, m42595b(campaignExM42497h), z2) && m42589a(rewardTemplateMode)) {
                                                            arrayList.add(value);
                                                        } else {
                                                            str2 = "video and image list is downloading or fail";
                                                        }
                                                        str4 = str6;
                                                    }
                                                    str6 = str2;
                                                    zIsEmpty = TextUtils.isEmpty(value.m42500k());
                                                    iM42504o = value.m42504o();
                                                    if (iM42504o != 5) {
                                                        i2 = i4;
                                                        if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                            i3 = 1;
                                                            i4 = i2;
                                                        } else {
                                                            long jM42503n = value.m42503n();
                                                            if (value.m42504o() == 1 || j - jM42503n <= this.f41061i * 1000) {
                                                                i4 = i2;
                                                            } else {
                                                                value.m42488c("download timeout");
                                                                value.m42496g();
                                                                this.f41059g.remove(map);
                                                                i4 = i2 - 1;
                                                                if (i == 1 || i == 94) {
                                                                    str4 = "video download time over dlct";
                                                                } else {
                                                                    str6 = "video download time over dlct";
                                                                }
                                                            }
                                                            if (iM42504o != 4 || iM42504o == 2) {
                                                                this.f41059g.remove(map);
                                                                value.m42496g();
                                                                i4--;
                                                                str3 = "video download stop or pause";
                                                            } else {
                                                                i3 = 1;
                                                            }
                                                        }
                                                        if (iM42504o != i3) {
                                                            if (i == 94 && i != 287) {
                                                                str4 = str6;
                                                            } else if (!m42591a(value, m42595b(campaignExM42497h), z2) && m42593a(str5, campaignExM42497h) && m42589a(rewardTemplateMode)) {
                                                                arrayList.add(value);
                                                                str4 = str6;
                                                            } else {
                                                                str3 = "video or endcard or image list is downloading or fail";
                                                            }
                                                        } else if (value.m42507t()) {
                                                            str3 = "video was displayed";
                                                        } else if (MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                            if (i == 94) {
                                                            }
                                                            if (!m42591a(value, m42595b(campaignExM42497h), z2)) {
                                                            }
                                                            str3 = "video or endcard or image list is downloading or fail";
                                                        } else {
                                                            if (!m42591a(value, m42595b(campaignExM42497h), z2) && m42593a(str5, campaignExM42497h) && m42589a(rewardTemplateMode)) {
                                                                arrayList.add(value);
                                                            } else {
                                                                str6 = "video or endcard or image list is downloading or fail";
                                                                if (i == 94) {
                                                                }
                                                                if (!m42591a(value, m42595b(campaignExM42497h), z2)) {
                                                                }
                                                                str3 = "video or endcard or image list is downloading or fail";
                                                            }
                                                            str4 = str6;
                                                        }
                                                    } else if (value.m42507t()) {
                                                        value.m42512y();
                                                        this.f41059g.remove(map);
                                                        i4--;
                                                        str3 = "task is displayed";
                                                    } else {
                                                        if (zIsEmpty) {
                                                            value.m42477a(0, 0);
                                                            if (i == 95) {
                                                                arrayList.add(value);
                                                            } else {
                                                                str3 = "resource path is not effective";
                                                            }
                                                        } else {
                                                            if (m42593a(str5, campaignExM42497h) || !m42589a(rewardTemplateMode)) {
                                                                return null;
                                                            }
                                                            arrayList.add(value);
                                                        }
                                                        str4 = str6;
                                                    }
                                                } else {
                                                    str3 = "template is null or download is not ready";
                                                }
                                                str4 = str3;
                                            } else {
                                                zIsEmpty = TextUtils.isEmpty(value.m42500k());
                                                iM42504o = value.m42504o();
                                                if (iM42504o != 5) {
                                                    if (value.m42507t()) {
                                                        value.m42512y();
                                                        this.f41059g.remove(map);
                                                        i4--;
                                                        str3 = "task is displayed";
                                                    } else {
                                                        if (zIsEmpty) {
                                                            if (m42593a(str5, campaignExM42497h)) {
                                                            }
                                                            return null;
                                                        }
                                                        value.m42477a(0, 0);
                                                        if (i == 95) {
                                                            arrayList.add(value);
                                                        } else {
                                                            str3 = "resource path is not effective";
                                                        }
                                                        str4 = str6;
                                                    }
                                                    str4 = str3;
                                                } else {
                                                    i2 = i4;
                                                    if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                        long jM42503n2 = value.m42503n();
                                                        if (value.m42504o() == 1) {
                                                            i4 = i2;
                                                            if (iM42504o != 4) {
                                                            }
                                                            this.f41059g.remove(map);
                                                            value.m42496g();
                                                            i4--;
                                                            str3 = "video download stop or pause";
                                                            str4 = str3;
                                                        } else {
                                                            i4 = i2;
                                                            if (iM42504o != 4) {
                                                            }
                                                            this.f41059g.remove(map);
                                                            value.m42496g();
                                                            i4--;
                                                            str3 = "video download stop or pause";
                                                            str4 = str3;
                                                        }
                                                    } else {
                                                        i3 = 1;
                                                        i4 = i2;
                                                    }
                                                    if (iM42504o != i3) {
                                                        if (i == 94) {
                                                        }
                                                        if (!m42591a(value, m42595b(campaignExM42497h), z2)) {
                                                        }
                                                        str3 = "video or endcard or image list is downloading or fail";
                                                        str4 = str3;
                                                    } else {
                                                        if (value.m42507t()) {
                                                            str3 = "video was displayed";
                                                        } else if (MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                            if (i == 94) {
                                                            }
                                                            if (!m42591a(value, m42595b(campaignExM42497h), z2)) {
                                                            }
                                                            str3 = "video or endcard or image list is downloading or fail";
                                                        } else {
                                                            if (!m42591a(value, m42595b(campaignExM42497h), z2)) {
                                                            }
                                                            str6 = "video or endcard or image list is downloading or fail";
                                                            if (i == 94) {
                                                            }
                                                            if (!m42591a(value, m42595b(campaignExM42497h), z2)) {
                                                            }
                                                            str3 = "video or endcard or image list is downloading or fail";
                                                        }
                                                        str4 = str3;
                                                    }
                                                }
                                            }
                                            jCurrentTimeMillis = j;
                                        } catch (Exception e) {
                                            e = e;
                                            str4 = str6;
                                            e.printStackTrace();
                                            if (arrayList.size() == 0) {
                                                c13157e.m37501a("is_ready_fail_reason", str4);
                                            }
                                            return arrayList;
                                        }
                                    } else {
                                        list = list;
                                    }
                                }
                                jCurrentTimeMillis = j;
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        i4++;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }
        try {
            if (arrayList.size() == 0 && c13157e != null) {
                c13157e.m37501a("is_ready_fail_reason", str4);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("UnitCacheCtroller", th.getMessage());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m42604a(InterfaceC14217a interfaceC14217a) {
        C14212k c14212k;
        if (!this.f41069q || (c14212k = this.f41068p) == null) {
            this.f41055c = interfaceC14217a;
        } else {
            c14212k.m42570a(interfaceC14217a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42605a(String str, InterfaceC14217a interfaceC14217a) {
        C14212k c14212k;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            c14212k.m42571a(str, interfaceC14217a);
            return;
        }
        if (this.f41057e == null) {
            this.f41057e = new ConcurrentHashMap<>();
        }
        if (interfaceC14217a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f41057e.put(str, interfaceC14217a);
    }

    /* JADX INFO: renamed from: a */
    public boolean m42606a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = list.get(i);
            if (campaignEx == null || !m42591a(new C14202a(C13008c.m36588n().m36542d(), campaignEx, str, this.f41064l), m42595b(campaignEx), false) || !m42593a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a4 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TRY_LEAVE, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bc A[Catch: Exception -> 0x02a5, all -> 0x02a7, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01d3 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f3 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01f9 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TRY_LEAVE, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0204 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TRY_ENTER, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0211  */
    /* JADX WARN: Code duplicated, block: B:143:0x022f A[Catch: Exception -> 0x02a5, all -> 0x02a7, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0235  */
    /* JADX WARN: Code duplicated, block: B:146:0x023a A[Catch: Exception -> 0x02a5, all -> 0x02a7, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:148:0x023e A[Catch: Exception -> 0x02a5, all -> 0x02a7, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0256 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TRY_ENTER, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:158:0x025e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x0260 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:197:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x015e A[Catch: Exception -> 0x02a5, all -> 0x02a7, TRY_ENTER, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0170 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TRY_LEAVE, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0181 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TRY_ENTER, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0187 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0194 A[Catch: Exception -> 0x02a5, all -> 0x02a7, TRY_LEAVE, TryCatch #1 {all -> 0x02a7, blocks: (B:11:0x001b, B:15:0x0027, B:17:0x0033, B:28:0x006d, B:29:0x0072, B:31:0x007a, B:32:0x008a, B:34:0x0090, B:36:0x009e, B:40:0x00a8, B:41:0x00b2, B:43:0x00b8, B:49:0x00d9, B:52:0x00e1, B:55:0x00e8, B:57:0x00f8, B:58:0x0100, B:87:0x015e, B:89:0x0170, B:91:0x017a, B:95:0x0181, B:97:0x0187, B:139:0x021f, B:99:0x0194, B:101:0x019c, B:103:0x019e, B:105:0x01a4, B:107:0x01aa, B:109:0x01ac, B:112:0x01af, B:114:0x01bc, B:116:0x01c6, B:118:0x01d3, B:124:0x01ed, B:126:0x01f3, B:128:0x01f9, B:130:0x0202, B:132:0x0204, B:138:0x0217, B:143:0x022f, B:146:0x023a, B:148:0x023e, B:150:0x0248, B:152:0x024e, B:154:0x0254, B:156:0x0256, B:159:0x0260, B:161:0x026a, B:163:0x0270, B:165:0x0276, B:62:0x010e, B:64:0x0114, B:66:0x011e, B:69:0x0127, B:71:0x012d, B:73:0x0133, B:75:0x013e, B:77:0x0144, B:79:0x014a, B:81:0x014c, B:83:0x0156, B:85:0x015c, B:183:0x02ac, B:184:0x02af, B:19:0x0035, B:21:0x0041, B:27:0x0057, B:174:0x029c, B:175:0x02a3, B:25:0x004b), top: B:190:0x001b }] */
    /* JADX INFO: renamed from: b */
    public C14202a m42607b(int i, boolean z) {
        C14202a c14202a;
        List<CampaignEx> listM42434c;
        C14202a c14202a2;
        char c;
        boolean zIsEmpty;
        int iM42504o;
        int i2;
        long jM42503n;
        int i3;
        C14212k c14212k;
        int i4 = i;
        z = z;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            return c14212k.m42579i();
        }
        CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList = this.f41059g;
        C14202a c14202a3 = null;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    int i5 = this.f41065m;
                    char c2 = 287;
                    int i6 = 94;
                    try {
                        if (i5 == 94 || i5 == 287) {
                            List<CampaignEx> listM42426b = C14201a.m42411a().m42426b(this.f41062j, 1, z);
                            if ((listM42426b == null || listM42426b.size() == 0) && (i4 == 94 || i4 == 287)) {
                                listM42426b = C14201a.m42411a().m42432c(this.f41062j, 1, z);
                            }
                            if (listM42426b == null) {
                                C13219q0.m37813a("UnitCacheCtroller", "UnitCache isReady campaignList = 0");
                                return null;
                            }
                            C13219q0.m37813a("UnitCacheCtroller", "UnitCache isReady campaignList = " + listM42426b.size());
                            listM42434c = listM42426b;
                        } else {
                            listM42434c = C14201a.m42411a().m42434c(this.f41062j, 1);
                            if (listM42434c == null) {
                                return null;
                            }
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i7 = 0;
                        while (i7 < this.f41059g.size()) {
                            Map<String, C14202a> map = this.f41059g.get(i7);
                            Iterator<Map.Entry<String, C14202a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                C14202a value = it.next().getValue();
                                if (value == null || value.m42497h() == null) {
                                    c14202a2 = c14202a3;
                                } else {
                                    c14202a2 = c14202a3;
                                    CampaignEx campaignExM42497h = value.m42497h();
                                    Iterator<CampaignEx> it2 = listM42434c.iterator();
                                    boolean z2 = false;
                                    while (it2.hasNext()) {
                                        if (campaignExM42497h.getId().equals(it2.next().getId())) {
                                            z2 = true;
                                        }
                                    }
                                    if (z2 && ((!z || campaignExM42497h.isBidCampaign()) && (z || !campaignExM42497h.isBidCampaign()))) {
                                        String str = campaignExM42497h.getendcard_url();
                                        String videoUrlEncode = campaignExM42497h.getVideoUrlEncode();
                                        String strM36781j = campaignExM42497h.getRewardTemplateMode() != null ? campaignExM42497h.getRewardTemplateMode().m36781j() : "";
                                        CampaignEx.C13066c rewardTemplateMode = campaignExM42497h.getRewardTemplateMode();
                                        if (this.f41065m == i6 || i4 == 287) {
                                            if (TextUtils.isEmpty(strM36781j) || strM36781j.contains(CampaignEx.KEY_IS_CMPT_ENTRY) || m42588a(this.f41065m, campaignExM42497h, strM36781j)) {
                                                if (!m42597b(str, campaignExM42497h)) {
                                                    zIsEmpty = TextUtils.isEmpty(value.m42500k());
                                                    iM42504o = value.m42504o();
                                                    if (this.f41065m != 298 && m42590a(value, m42595b(campaignExM42497h))) {
                                                        return value;
                                                    }
                                                    if (iM42504o != 5) {
                                                        if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                            listM42434c = listM42434c;
                                                            if (this.f41065m != 95) {
                                                                if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                                }
                                                                if (iM42504o != 1) {
                                                                    i2 = this.f41065m;
                                                                    i6 = 94;
                                                                    c = 287;
                                                                    if (i2 != 94) {
                                                                    }
                                                                }
                                                                if (value.m42507t()) {
                                                                    if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                        return value;
                                                                    }
                                                                    i2 = this.f41065m;
                                                                    i6 = 94;
                                                                    c = 287;
                                                                    if (i2 != 94) {
                                                                    }
                                                                }
                                                                i6 = 94;
                                                                c = 287;
                                                                c2 = c;
                                                                c14202a3 = c14202a2;
                                                                i6 = i6;
                                                                listM42434c = listM42434c;
                                                            } else {
                                                                if (value.m42507t()) {
                                                                    return value;
                                                                }
                                                                value.m42512y();
                                                                this.f41059g.remove(map);
                                                            }
                                                        } else {
                                                            jM42503n = value.m42503n();
                                                            if (value.m42504o() == 1) {
                                                                listM42434c = listM42434c;
                                                                if (jCurrentTimeMillis - jM42503n > this.f41061i * 1000) {
                                                                    value.m42488c("download timeout");
                                                                    value.m42496g();
                                                                    this.f41059g.remove(map);
                                                                    i7--;
                                                                    i3 = this.f41065m;
                                                                    if (i3 != 1 || i3 == 94) {
                                                                    }
                                                                }
                                                            } else {
                                                                listM42434c = listM42434c;
                                                            }
                                                            if (this.f41065m != 95) {
                                                                if (value.m42507t()) {
                                                                    return value;
                                                                }
                                                                value.m42512y();
                                                                this.f41059g.remove(map);
                                                            } else if (C13223s0.m37831a().m37842a("u_n_c_e_d", true) && (iM42504o == 4 || iM42504o == 2)) {
                                                                this.f41059g.remove(map);
                                                                value.m42496g();
                                                            } else {
                                                                if (iM42504o != 1) {
                                                                    i2 = this.f41065m;
                                                                    i6 = 94;
                                                                    c = 287;
                                                                    if ((i2 != 94 || i2 == 287) && m42590a(value, m42595b(campaignExM42497h)) && m42593a(str, campaignExM42497h) && m42589a(rewardTemplateMode)) {
                                                                    }
                                                                } else {
                                                                    if (value.m42507t()) {
                                                                        if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY && m42590a(value, m42595b(campaignExM42497h)) && m42593a(str, campaignExM42497h) && m42589a(rewardTemplateMode)) {
                                                                            return value;
                                                                        }
                                                                        i2 = this.f41065m;
                                                                        i6 = 94;
                                                                        c = 287;
                                                                        return i2 != 94 ? value : value;
                                                                    }
                                                                    i6 = 94;
                                                                    c = 287;
                                                                }
                                                                c2 = c;
                                                                c14202a3 = c14202a2;
                                                                i6 = i6;
                                                                listM42434c = listM42434c;
                                                            }
                                                        }
                                                        listM42434c = listM42434c;
                                                        c14202a3 = c14202a2;
                                                        c2 = 287;
                                                        i6 = 94;
                                                    } else if (value.m42507t()) {
                                                        value.m42512y();
                                                        this.f41059g.remove(map);
                                                        listM42434c = listM42434c;
                                                    } else {
                                                        if (zIsEmpty) {
                                                            return (m42593a(str, campaignExM42497h) || !m42589a(rewardTemplateMode)) ? c14202a2 : value;
                                                        }
                                                        value.m42477a(0, 0);
                                                        if (this.f41065m == 95) {
                                                            return value;
                                                        }
                                                    }
                                                    i7--;
                                                    listM42434c = listM42434c;
                                                    c14202a3 = c14202a2;
                                                    c2 = 287;
                                                    i6 = 94;
                                                } else if (value.m42507t()) {
                                                    value.m42512y();
                                                } else {
                                                    if (C13182a1.m37596a(videoUrlEncode)) {
                                                        if (m42589a(rewardTemplateMode)) {
                                                            return value;
                                                        }
                                                    } else if (m42590a(value, m42595b(campaignExM42497h)) && m42589a(rewardTemplateMode)) {
                                                        return value;
                                                    }
                                                    zIsEmpty = TextUtils.isEmpty(value.m42500k());
                                                    iM42504o = value.m42504o();
                                                    if (this.f41065m != 298) {
                                                    }
                                                    if (iM42504o != 5) {
                                                        if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                            jM42503n = value.m42503n();
                                                            if (value.m42504o() == 1) {
                                                                listM42434c = listM42434c;
                                                                if (jCurrentTimeMillis - jM42503n > this.f41061i * 1000) {
                                                                    value.m42488c("download timeout");
                                                                    value.m42496g();
                                                                    this.f41059g.remove(map);
                                                                    i7--;
                                                                    i3 = this.f41065m;
                                                                    if (i3 != 1) {
                                                                    }
                                                                }
                                                            } else {
                                                                listM42434c = listM42434c;
                                                            }
                                                            if (this.f41065m != 95) {
                                                                if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                                }
                                                                if (iM42504o != 1) {
                                                                    i2 = this.f41065m;
                                                                    i6 = 94;
                                                                    c = 287;
                                                                    if (i2 != 94) {
                                                                    }
                                                                }
                                                                if (value.m42507t()) {
                                                                    if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                        return value;
                                                                    }
                                                                    i2 = this.f41065m;
                                                                    i6 = 94;
                                                                    c = 287;
                                                                    if (i2 != 94) {
                                                                    }
                                                                }
                                                                i6 = 94;
                                                                c = 287;
                                                                c2 = c;
                                                                c14202a3 = c14202a2;
                                                                i6 = i6;
                                                                listM42434c = listM42434c;
                                                            } else {
                                                                if (value.m42507t()) {
                                                                    return value;
                                                                }
                                                                value.m42512y();
                                                                this.f41059g.remove(map);
                                                            }
                                                        } else {
                                                            listM42434c = listM42434c;
                                                            if (this.f41065m != 95) {
                                                                if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                                }
                                                                if (iM42504o != 1) {
                                                                    i2 = this.f41065m;
                                                                    i6 = 94;
                                                                    c = 287;
                                                                    if (i2 != 94) {
                                                                    }
                                                                }
                                                                if (value.m42507t()) {
                                                                    if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                        return value;
                                                                    }
                                                                    i2 = this.f41065m;
                                                                    i6 = 94;
                                                                    c = 287;
                                                                    if (i2 != 94) {
                                                                    }
                                                                }
                                                                i6 = 94;
                                                                c = 287;
                                                                c2 = c;
                                                                c14202a3 = c14202a2;
                                                                i6 = i6;
                                                                listM42434c = listM42434c;
                                                            } else {
                                                                if (value.m42507t()) {
                                                                    return value;
                                                                }
                                                                value.m42512y();
                                                                this.f41059g.remove(map);
                                                            }
                                                        }
                                                        listM42434c = listM42434c;
                                                        c14202a3 = c14202a2;
                                                        c2 = 287;
                                                        i6 = 94;
                                                    } else if (value.m42507t()) {
                                                        value.m42512y();
                                                        this.f41059g.remove(map);
                                                        listM42434c = listM42434c;
                                                    } else {
                                                        if (zIsEmpty) {
                                                            if (m42593a(str, campaignExM42497h)) {
                                                            }
                                                        }
                                                        value.m42477a(0, 0);
                                                        if (this.f41065m == 95) {
                                                            return value;
                                                        }
                                                    }
                                                    i7--;
                                                    listM42434c = listM42434c;
                                                    c14202a3 = c14202a2;
                                                    c2 = 287;
                                                    i6 = 94;
                                                }
                                            }
                                            listM42434c = listM42434c;
                                            i6 = 94;
                                            c = 287;
                                            c2 = c;
                                            c14202a3 = c14202a2;
                                            i6 = i6;
                                            listM42434c = listM42434c;
                                        } else {
                                            zIsEmpty = TextUtils.isEmpty(value.m42500k());
                                            iM42504o = value.m42504o();
                                            if (this.f41065m != 298) {
                                            }
                                            if (iM42504o != 5) {
                                                if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                    jM42503n = value.m42503n();
                                                    if (value.m42504o() == 1) {
                                                        listM42434c = listM42434c;
                                                        if (jCurrentTimeMillis - jM42503n > this.f41061i * 1000) {
                                                            value.m42488c("download timeout");
                                                            value.m42496g();
                                                            this.f41059g.remove(map);
                                                            i7--;
                                                            i3 = this.f41065m;
                                                            if (i3 != 1) {
                                                            }
                                                        }
                                                    } else {
                                                        listM42434c = listM42434c;
                                                    }
                                                    if (this.f41065m != 95) {
                                                        if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                        }
                                                        if (iM42504o != 1) {
                                                            i2 = this.f41065m;
                                                            i6 = 94;
                                                            c = 287;
                                                            if (i2 != 94) {
                                                            }
                                                        }
                                                        if (value.m42507t()) {
                                                            if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                return value;
                                                            }
                                                            i2 = this.f41065m;
                                                            i6 = 94;
                                                            c = 287;
                                                            if (i2 != 94) {
                                                            }
                                                        }
                                                        i6 = 94;
                                                        c = 287;
                                                        c2 = c;
                                                        c14202a3 = c14202a2;
                                                        i6 = i6;
                                                        listM42434c = listM42434c;
                                                    } else {
                                                        if (value.m42507t()) {
                                                            return value;
                                                        }
                                                        value.m42512y();
                                                        this.f41059g.remove(map);
                                                    }
                                                } else {
                                                    listM42434c = listM42434c;
                                                    if (this.f41065m != 95) {
                                                        if (C13223s0.m37831a().m37842a("u_n_c_e_d", true)) {
                                                        }
                                                        if (iM42504o != 1) {
                                                            i2 = this.f41065m;
                                                            i6 = 94;
                                                            c = 287;
                                                            if (i2 != 94) {
                                                            }
                                                        }
                                                        if (value.m42507t()) {
                                                            if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                return value;
                                                            }
                                                            i2 = this.f41065m;
                                                            i6 = 94;
                                                            c = 287;
                                                            if (i2 != 94) {
                                                            }
                                                        }
                                                        i6 = 94;
                                                        c = 287;
                                                        c2 = c;
                                                        c14202a3 = c14202a2;
                                                        i6 = i6;
                                                        listM42434c = listM42434c;
                                                    } else {
                                                        if (value.m42507t()) {
                                                            return value;
                                                        }
                                                        value.m42512y();
                                                        this.f41059g.remove(map);
                                                    }
                                                }
                                                listM42434c = listM42434c;
                                                c14202a3 = c14202a2;
                                                c2 = 287;
                                                i6 = 94;
                                            } else if (value.m42507t()) {
                                                value.m42512y();
                                                this.f41059g.remove(map);
                                                listM42434c = listM42434c;
                                            } else {
                                                if (zIsEmpty) {
                                                    if (m42593a(str, campaignExM42497h)) {
                                                    }
                                                }
                                                value.m42477a(0, 0);
                                                if (this.f41065m == 95) {
                                                    return value;
                                                }
                                                listM42434c = listM42434c;
                                                i6 = 94;
                                                c = 287;
                                                c2 = c;
                                                c14202a3 = c14202a2;
                                                i6 = i6;
                                                listM42434c = listM42434c;
                                            }
                                            i7--;
                                            listM42434c = listM42434c;
                                            c14202a3 = c14202a2;
                                            c2 = 287;
                                            i6 = 94;
                                        }
                                    }
                                    i4 = i;
                                }
                                c = c2;
                                c2 = c;
                                c14202a3 = c14202a2;
                                i6 = i6;
                                listM42434c = listM42434c;
                                i4 = i;
                            }
                            i7++;
                            z = z;
                            i6 = i6;
                            listM42434c = listM42434c;
                            i4 = i;
                        }
                        c14202a = c14202a3;
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e = e2;
                    c14202a = c14202a3;
                }
                return c14202a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a3 */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m42608b() {
        /*
            r14 = this;
            boolean r0 = r14.f41069q
            if (r0 == 0) goto Lc
            com.mbridge.msdk.videocommon.download.k r0 = r14.f41068p
            if (r0 == 0) goto Lc
            r0.m42569a()
            return
        Lc:
            com.mbridge.msdk.foundation.tools.s0 r0 = com.mbridge.msdk.foundation.tools.C13223s0.m37831a()
            java.lang.String r1 = "u_n_c_e_d"
            r2 = 1
            boolean r0 = r0.m37842a(r1, r2)
            if (r0 == 0) goto L1b
            goto La7
        L1b:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r0 = r14.f41059g
            if (r0 != 0) goto L21
            goto La7
        L21:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> La3
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La0
            r1 = 0
        L27:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r5 = r14.f41059g     // Catch: java.lang.Throwable -> La0
            int r5 = r5.size()     // Catch: java.lang.Throwable -> La0
            if (r1 >= r5) goto L9e
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r5 = r14.f41059g     // Catch: java.lang.Throwable -> La0
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> La0
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> La0
            java.util.Set r6 = r5.entrySet()     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> La0
        L3f:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> La0
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> La0
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> La0
            com.mbridge.msdk.videocommon.download.a r7 = (com.mbridge.msdk.videocommon.download.C14202a) r7     // Catch: java.lang.Throwable -> La0
            if (r7 != 0) goto L54
            goto L3f
        L54:
            long r8 = r7.m42503n()     // Catch: java.lang.Throwable -> La0
            long r8 = r3 - r8
            long r10 = r14.f41061i     // Catch: java.lang.Throwable -> La0
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L7d
            int r8 = r7.m42504o()     // Catch: java.lang.Throwable -> La0
            if (r8 != r2) goto L7d
            java.lang.String r8 = "download timeout"
            r7.m42488c(r8)     // Catch: java.lang.Throwable -> La0
            int r8 = r14.f41064l     // Catch: java.lang.Throwable -> La0
            r7.m42487c(r8)     // Catch: java.lang.Throwable -> La0
            r7.m42496g()     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r8 = r14.f41059g     // Catch: java.lang.Throwable -> La0
            r8.remove(r5)     // Catch: java.lang.Throwable -> La0
            int r1 = r1 + (-1)
        L7d:
            int r8 = r7.m42504o()     // Catch: java.lang.Throwable -> La0
            if (r8 == r2) goto L3f
            int r8 = r7.m42504o()     // Catch: java.lang.Throwable -> La0
            r9 = 5
            if (r8 == r9) goto L3f
            int r8 = r7.m42504o()     // Catch: java.lang.Throwable -> La0
            if (r8 == 0) goto L3f
            r7.m42496g()     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r7 = r14.f41059g     // Catch: java.lang.Throwable -> La0
            r7.remove(r5)     // Catch: java.lang.Throwable -> La0
            int r1 = r1 + (-1)
            goto L3f
        L9b:
            int r1 = r1 + 1
            goto L27
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            return
        La0:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            throw r1     // Catch: java.lang.Throwable -> La3
        La3:
            r0 = move-exception
            r0.printStackTrace()
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C14213l.m42608b():void");
    }

    /* JADX INFO: renamed from: b */
    public void m42609b(String str) {
        CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList;
        C14212k c14212k;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            c14212k.m42574c(str);
            return;
        }
        try {
            synchronized (this.f41059g) {
                if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f41059g) != null && copyOnWriteArrayList.size() > 0) {
                    for (Map<String, C14202a> map : this.f41059g) {
                        if (map != null) {
                            for (Map.Entry<String, C14202a> entry : map.entrySet()) {
                                if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                    this.f41059g.remove(map);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("UnitCacheCtroller", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42610b(List<CampaignEx> list) {
        C14212k c14212k;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            c14212k.m42572a(list);
            return;
        }
        List<CampaignEx> list2 = this.f41053a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        m42587a(this.f41053a);
    }

    /* JADX INFO: renamed from: c */
    public CopyOnWriteArrayList<Map<String, C14202a>> m42611c() {
        C14212k c14212k;
        return (!this.f41069q || (c14212k = this.f41068p) == null) ? this.f41059g : c14212k.m42576e();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0198 A[Catch: all -> 0x0223, TryCatch #0 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:92:0x017d, B:94:0x0181, B:95:0x018a, B:97:0x018e, B:101:0x0198, B:102:0x019c, B:104:0x01be, B:107:0x01c3, B:109:0x01c7, B:113:0x01d5, B:117:0x01de, B:119:0x01e9, B:121:0x01ed, B:124:0x01f1, B:127:0x01f7, B:129:0x0202, B:133:0x020a, B:134:0x020f, B:140:0x021c, B:139:0x0219, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:141:0x0221), top: B:147:0x0016, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:95:0x018a A[Catch: all -> 0x0223, TryCatch #0 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:92:0x017d, B:94:0x0181, B:95:0x018a, B:97:0x018e, B:101:0x0198, B:102:0x019c, B:104:0x01be, B:107:0x01c3, B:109:0x01c7, B:113:0x01d5, B:117:0x01de, B:119:0x01e9, B:121:0x01ed, B:124:0x01f1, B:127:0x01f7, B:129:0x0202, B:133:0x020a, B:134:0x020f, B:140:0x021c, B:139:0x0219, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:141:0x0221), top: B:147:0x0016, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x018e A[Catch: all -> 0x0223, TryCatch #0 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:92:0x017d, B:94:0x0181, B:95:0x018a, B:97:0x018e, B:101:0x0198, B:102:0x019c, B:104:0x01be, B:107:0x01c3, B:109:0x01c7, B:113:0x01d5, B:117:0x01de, B:119:0x01e9, B:121:0x01ed, B:124:0x01f1, B:127:0x01f7, B:129:0x0202, B:133:0x020a, B:134:0x020f, B:140:0x021c, B:139:0x0219, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:141:0x0221), top: B:147:0x0016, inners: #1, #2 }] */
    /* JADX INFO: renamed from: d */
    public void m42612d() {
        int iM42722g;
        ConcurrentHashMap<String, InterfaceC14217a> concurrentHashMap;
        InterfaceC14217a interfaceC14217a;
        C14212k c14212k;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            c14212k.m42580j();
            return;
        }
        m42608b();
        CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList = this.f41059g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                if (!m42594a(this.f41059g)) {
                    this.f41054b = true;
                }
                for (Map<String, C14202a> map : this.f41059g) {
                    if (map != null) {
                        Iterator<Map.Entry<String, C14202a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            C14202a value = it.next().getValue();
                            if (value != null && !value.m42507t()) {
                                if (this.f41065m == 95) {
                                    this.f41054b = true;
                                }
                                int iM42504o = value.m42504o();
                                CampaignEx campaignExM42497h = value.m42497h();
                                if (campaignExM42497h != null && iM42504o == 0) {
                                    iM42504o = C14203b.getInstance().m42523b(campaignExM42497h.getId(), campaignExM42497h.getVideoUrlEncode());
                                }
                                int i = iM42504o;
                                value.m42480a(new b(campaignExM42497h));
                                int iM42595b = m42595b(campaignExM42497h);
                                if (this.f41065m == 1) {
                                    if (this.f41066n == null) {
                                        this.f41066n = C13640l.m39753i(this.f41062j);
                                    }
                                    iM42595b = m42584a(campaignExM42497h);
                                }
                                int i2 = iM42595b;
                                value.m42490d(i2);
                                int i3 = this.f41065m;
                                if (i3 == 94 || i3 == 287 || i3 == 95) {
                                    if (this.f41063k == null) {
                                        this.f41063k = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f41062j, this.f41065m == 287);
                                    }
                                    C14223c c14223c = this.f41063k;
                                    iM42722g = c14223c != null ? c14223c.m42722g() : 0;
                                } else {
                                    if (i3 != 298) {
                                        iM42722g = 0;
                                    } else {
                                        if (this.f41067o == null) {
                                            this.f41067o = C13636h.m39706b().m39719d(C13008c.m36588n().m36533b(), this.f41062j);
                                        }
                                        C13640l c13640l = this.f41067o;
                                        if (c13640l != null) {
                                            iM42722g = c13640l.m39646i();
                                        } else {
                                            iM42722g = 0;
                                        }
                                    }
                                    if (this.f41065m == 1) {
                                        if (this.f41066n == null) {
                                            this.f41066n = C13636h.m39706b().m39719d(C13008c.m36588n().m36533b(), this.f41062j);
                                        }
                                        C13640l c13640l2 = this.f41066n;
                                        if (c13640l2 != null) {
                                            iM42722g = c13640l2.m39646i();
                                        }
                                    }
                                }
                                value.m42483b(iM42722g);
                                int videoCtnType = campaignExM42497h != null ? campaignExM42497h.getVideoCtnType() : 1;
                                value.m42492e(videoCtnType);
                                C13219q0.m37816b("UnitCacheCtroller", "ready_rate : " + i2 + " cd_rate : " + iM42722g + " videoCtnType : " + videoCtnType);
                                if (m42590a(value, m42595b(campaignExM42497h))) {
                                    String videoUrlEncode = campaignExM42497h != null ? campaignExM42497h.getVideoUrlEncode() : "";
                                    InterfaceC14217a interfaceC14217a2 = this.f41055c;
                                    if (interfaceC14217a2 != null) {
                                        int i4 = this.f41065m;
                                        if (i4 == 297 || i4 == 298) {
                                            try {
                                                interfaceC14217a2.mo34468a(videoUrlEncode);
                                            } catch (Exception e) {
                                                if (MBridgeConstans.DEBUG) {
                                                    C13219q0.m37816b("UnitCacheCtroller", e.getMessage());
                                                }
                                            }
                                            concurrentHashMap = this.f41057e;
                                            if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                                                String requestId = campaignExM42497h != null ? campaignExM42497h.getRequestId() : "";
                                                interfaceC14217a = this.f41057e.get(requestId + "_" + campaignExM42497h.getSecondRequestIndex());
                                                if (interfaceC14217a != null) {
                                                    try {
                                                        interfaceC14217a.mo34468a(videoUrlEncode);
                                                    } catch (Exception e2) {
                                                        if (MBridgeConstans.DEBUG) {
                                                            C13219q0.m37816b("UnitCacheCtroller", e2.getMessage());
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            concurrentHashMap = this.f41057e;
                                            if (concurrentHashMap != null) {
                                                if (campaignExM42497h != null) {
                                                }
                                                interfaceC14217a = this.f41057e.get(requestId + "_" + campaignExM42497h.getSecondRequestIndex());
                                                if (interfaceC14217a != null) {
                                                    interfaceC14217a.mo34468a(videoUrlEncode);
                                                }
                                            }
                                        }
                                    } else {
                                        concurrentHashMap = this.f41057e;
                                        if (concurrentHashMap != null) {
                                            if (campaignExM42497h != null) {
                                            }
                                            interfaceC14217a = this.f41057e.get(requestId + "_" + campaignExM42497h.getSecondRequestIndex());
                                            if (interfaceC14217a != null) {
                                                interfaceC14217a.mo34468a(videoUrlEncode);
                                            }
                                        }
                                    }
                                }
                                if (i != 1 && (i != 5 || !m42590a(value, i2))) {
                                    if (i == 4) {
                                        continue;
                                    } else {
                                        if (C13211m0.m37770s(this.f41060h) != 9 && this.f41064l == 2) {
                                            return;
                                        }
                                        if (i == 2 || this.f41054b) {
                                            value.m42479a(this.f41058f);
                                            if (m42590a(value, i2)) {
                                                int i5 = this.f41065m;
                                                if (i5 == 94 || i5 == 287) {
                                                    value.m42474B();
                                                }
                                            } else {
                                                int i6 = this.f41065m;
                                                if (i6 == 1 || i6 == 95 || i6 == 298) {
                                                    this.f41054b = false;
                                                }
                                                value.m42474B();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m42613e() {
        C14212k c14212k;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            c14212k.m42581k();
            return;
        }
        CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList = this.f41059g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    for (Map<String, C14202a> map : this.f41059g) {
                        if (map != null) {
                            Iterator<Map.Entry<String, C14202a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                C14202a value = it.next().getValue();
                                if (value != null && value.m42504o() == 1) {
                                    value.m42488c("playing and stop download");
                                    value.m42496g();
                                    this.f41059g.remove(map);
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("UnitCacheCtroller", th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m42614f(CampaignEx campaignEx) {
        C14212k c14212k;
        if (this.f41069q && (c14212k = this.f41068p) != null) {
            c14212k.m42578h(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f41053a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        m42587a(this.f41053a);
    }
}
