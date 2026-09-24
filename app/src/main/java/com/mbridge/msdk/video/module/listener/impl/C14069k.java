package com.mbridge.msdk.video.module.listener.impl;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C12538u;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.entity.C13070d;
import com.mbridge.msdk.foundation.entity.C13072f;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13012b;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13019i;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.p289db.C13023m;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.module.report.C14075b;
import com.mbridge.msdk.videocommon.cache.C14201a;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.entity.C14216c;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.k */
/* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14069k extends C14064f {

    /* JADX INFO: renamed from: a */
    protected boolean f40543a;

    /* JADX INFO: renamed from: b */
    protected CampaignEx f40544b;

    /* JADX INFO: renamed from: c */
    protected List<CampaignEx> f40545c;

    /* JADX INFO: renamed from: d */
    protected boolean f40546d;

    /* JADX INFO: renamed from: e */
    protected C14202a f40547e;

    /* JADX INFO: renamed from: f */
    protected C14216c f40548f;

    /* JADX INFO: renamed from: g */
    protected String f40549g;

    /* JADX INFO: renamed from: h */
    protected String f40550h;

    /* JADX INFO: renamed from: i */
    protected InterfaceC14058a f40551i;

    /* JADX INFO: renamed from: j */
    protected int f40552j;

    /* JADX INFO: renamed from: k */
    private boolean f40553k = false;

    /* JADX INFO: renamed from: l */
    private boolean f40554l = false;

    /* JADX INFO: renamed from: m */
    private boolean f40555m = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.k$a */
    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C14069k c14069k = C14069k.this;
                if (!c14069k.f40543a || c14069k.f40544b == null || !C13182a1.m37597b(c14069k.f40549g) || C13008c.m36588n().m36542d() == null) {
                    return;
                }
                C13019i c13019iM36701a = C13019i.m36701a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                C13072f c13072f = new C13072f();
                c13072f.m36850a(System.currentTimeMillis());
                c13072f.m36853b(C14069k.this.f40549g);
                c13072f.m36851a(C14069k.this.f40544b.getId());
                c13019iM36701a.m36703a(c13072f);
            } catch (Throwable th) {
                C13219q0.m37817b("NotifyListener", th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.k$b */
    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C14069k c14069k = C14069k.this;
                if (c14069k.f40543a && c14069k.f40544b != null && C13182a1.m37597b(c14069k.f40549g)) {
                    C14201a c14201aM42411a = C14201a.m42411a();
                    C14069k c14069k2 = C14069k.this;
                    c14201aM42411a.m42418a(c14069k2.f40544b, c14069k2.f40549g);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
            try {
                C14201a c14201aM42411a2 = C14201a.m42411a();
                C14069k c14069k3 = C14069k.this;
                c14201aM42411a2.m42429b(c14069k3.f40550h, c14069k3.f40544b.getAdType());
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            } catch (Throwable th) {
                C13219q0.m37813a("NotifyListener", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.k$c */
    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j.m36706a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36709b(C14069k.this.f40544b.getId());
            } catch (Throwable th) {
                C13219q0.m37817b("NotifyListener", th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.k$d */
    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C14202a c14202a;
            try {
                if (C13223s0.m37831a().m37842a("c_r_v_f_w_s_e", false)) {
                    return;
                }
                C14069k c14069k = C14069k.this;
                if (!c14069k.f40543a || (c14202a = c14069k.f40547e) == null) {
                    return;
                }
                if (c14202a.m42497h() != null && !TextUtils.isEmpty(C14069k.this.f40547e.m42497h().getVideoUrlEncode())) {
                    C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36724a(C14069k.this.f40547e.m42497h().getVideoUrlEncode());
                }
                if (TextUtils.isEmpty(C14069k.this.f40547e.m42505p())) {
                    return;
                }
                File file = new File(C14069k.this.f40547e.m42505p());
                if (file.exists() && file.isFile() && file.delete()) {
                    C13219q0.m37813a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C14069k(CampaignEx campaignEx, C14202a c14202a, C14216c c14216c, String str, String str2, InterfaceC14058a interfaceC14058a, int i, boolean z) {
        this.f40546d = false;
        this.f40551i = new C14064f();
        this.f40552j = 1;
        if (!z && campaignEx != null && C13182a1.m37597b(str2) && c14202a != null && interfaceC14058a != null) {
            this.f40544b = campaignEx;
            this.f40550h = str;
            this.f40549g = str2;
            this.f40547e = c14202a;
            this.f40548f = c14216c;
            this.f40551i = interfaceC14058a;
            this.f40543a = true;
            this.f40552j = i;
            this.f40546d = false;
            return;
        }
        if (!z || campaignEx == null || !C13182a1.m37597b(str2) || interfaceC14058a == null) {
            return;
        }
        this.f40544b = campaignEx;
        this.f40550h = str;
        this.f40549g = str2;
        this.f40547e = c14202a;
        this.f40548f = c14216c;
        this.f40551i = interfaceC14058a;
        this.f40543a = true;
        this.f40552j = i;
        this.f40546d = true;
    }

    /* JADX INFO: renamed from: d */
    private void m42165d() {
        if (!this.f40543a || C13091b.f35900k == null || TextUtils.isEmpty(this.f40544b.getId())) {
            return;
        }
        C13091b.m37104a(this.f40549g, this.f40544b, C12538u.f32489j);
    }

    /* JADX INFO: renamed from: f */
    private void m42166f() {
        if (this.f40544b != null) {
            try {
                HashMap map = new HashMap();
                List<C13070d> listM36624a = C13012b.m36621a(C13008c.m36588n().m36542d()).m36624a(this.f40544b.getCampaignUnitId(), this.f40544b.getRequestId());
                if (listM36624a == null || listM36624a.size() <= 0 || listM36624a.get(0) == null) {
                    return;
                }
                if (listM36624a.get(0).m36807c() == 1) {
                    map.put("encrypt_p=", "encrypt_p=" + listM36624a.get(0).m36804b());
                    map.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        CampaignEx campaignEx = this.f40544b;
                        campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                        CampaignEx campaignEx2 = this.f40544b;
                        campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str, str2));
                    }
                }
                C13219q0.m37813a("BidReplaceCampignDao", "removeReplace count " + C13012b.m36621a(C13008c.m36588n().m36542d()).m36622a(this.f40544b.getRequestId()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private void m42167m() {
        new Thread(new c()).start();
    }

    /* JADX INFO: renamed from: a */
    protected void m42168a() {
        C14203b.getInstance().m42519a(false);
    }

    /* JADX INFO: renamed from: a */
    public void m42169a(int i) {
        CampaignEx campaignEx = this.f40544b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i == 1 || i == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i);
                    }
                    noticeUrl = sb.toString();
                } else if (i == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f40544b.setNoticeUrl(noticeUrl);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        super.mo41600a(i, obj);
        this.f40551i.mo41600a(i, obj);
    }

    /* JADX INFO: renamed from: a */
    public void m42170a(int i, String str) {
        if (this.f40544b != null) {
            C13145g.m37363c(new C13080n("2000062", this.f40544b.getId(), this.f40544b.getRequestId(), this.f40544b.getRequestIdNotice(), this.f40549g, C13211m0.m37770s(C13008c.m36588n().m36542d()), i, str), C13008c.m36588n().m36542d(), this.f40549g);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42171a(CampaignEx campaignEx) {
        this.f40544b = campaignEx;
    }

    /* JADX INFO: renamed from: a */
    protected void m42172a(String str) {
        List<CampaignEx> list;
        if (this.f40544b == null || (list = this.f40545c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f40544b = this.f40545c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("NotifyListener", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42173a(List<CampaignEx> list) {
        this.f40545c = list;
    }

    /* JADX INFO: renamed from: b */
    public void m42174b() {
        try {
            b bVar = new b();
            if (C13009d.m36589a().m36605e()) {
                C13167a.m37543b().execute(bVar);
            } else {
                bVar.run();
            }
        } catch (Throwable th) {
            C13219q0.m37817b("NotifyListener", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42175b(int i) {
        if (this.f40544b != null) {
            if (i == 1 || i == 2) {
                C14075b.m42196a(C13008c.m36588n().m36542d(), this.f40544b, i, this.f40552j);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    protected void m42176b(String str) {
        try {
            if (this.f40544b != null) {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("url", this.f40544b.getVideoUrlEncode());
                c13157e.m37501a("reason", str);
                String noticeUrl = this.f40544b.getNoticeUrl();
                String clickURL = this.f40544b.getClickURL();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    c13157e.m37501a("offer_url", noticeUrl);
                } else if (!TextUtils.isEmpty(clickURL)) {
                    c13157e.m37501a("offer_url", clickURL);
                }
                C13156d.m37475b().m37483a("2000021", this.f40544b, c13157e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m42177c() {
        a aVar = new a();
        if (C13009d.m36589a().m36605e()) {
            C13167a.m37543b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    /* JADX INFO: renamed from: e */
    protected void m42178e() {
        d dVar = new d();
        if (C13009d.m36589a().m36605e()) {
            C13167a.m37543b().execute(dVar);
        } else {
            dVar.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m42179g() {
        if (!this.f40543a || this.f40544b == null) {
            return;
        }
        C13080n c13080n = new C13080n("2000061", this.f40544b.getId(), this.f40544b.getRequestId(), this.f40544b.getRequestIdNotice(), this.f40549g, C13211m0.m37770s(C13008c.m36588n().m36542d()));
        c13080n.m36961b(this.f40544b.isMraid() ? C13080n.f35733N : C13080n.f35734O);
        C13145g.m37361b(c13080n, C13008c.m36588n().m36542d(), this.f40549g);
    }

    /* JADX INFO: renamed from: h */
    protected void m42180h() {
        String str;
        try {
            if (!this.f40543a || this.f40553k || TextUtils.isEmpty(this.f40544b.getImpressionURL())) {
                return;
            }
            this.f40553k = true;
            if (this.f40544b.isBidCampaign()) {
                m42166f();
            }
            String impressionURL = this.f40544b.getImpressionURL();
            if (this.f40544b.getSpareOfferFlag() == 1) {
                str = impressionURL + "&to=1&cbt=" + this.f40544b.getCbt() + "&tmorl=" + this.f40552j;
            } else {
                str = impressionURL + "&to=0&cbt=" + this.f40544b.getCbt() + "&tmorl=" + this.f40552j;
            }
            C12682a.m34606a(C13008c.m36588n().m36542d(), this.f40544b, this.f40549g, str, false, true, C12701a.f33766m);
            C14075b.m42204d(C13008c.m36588n().m36542d(), this.f40544b);
            m42167m();
            m42165d();
        } catch (Throwable th) {
            C13219q0.m37817b("NotifyListener", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: i */
    protected void m42181i() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f40544b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f40546d && !this.f40544b.isCampaignIsFiltered()) {
                this.f40554l = true;
                return;
            }
            if (!this.f40543a || (campaignEx = this.f40544b) == null || TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) || (map = C13091b.f35901l) == null || map.containsKey(this.f40544b.getOnlyImpressionURL()) || this.f40554l) {
                return;
            }
            C13091b.f35901l.put(this.f40544b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            String onlyImpressionURL = this.f40544b.getOnlyImpressionURL();
            if (this.f40544b.getSpareOfferFlag() == 1) {
                str = onlyImpressionURL + "&to=1&cbt=" + this.f40544b.getCbt() + "&tmorl=" + this.f40552j;
            } else {
                str = onlyImpressionURL + "&to=0&cbt=" + this.f40544b.getCbt() + "&tmorl=" + this.f40552j;
            }
            String str2 = str;
            if (!this.f40546d || this.f40544b.isCampaignIsFiltered()) {
                C12682a.m34606a(C13008c.m36588n().m36542d(), this.f40544b, this.f40549g, str2, false, true, C12701a.f33767n);
                m42174b();
            }
            this.f40554l = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: j */
    protected void m42182j() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (!this.f40543a || this.f40555m || (campaignEx = this.f40544b) == null) {
                return;
            }
            this.f40555m = true;
            if ((campaignEx.isDynamicView() && this.f40546d && !this.f40544b.isCampaignIsFiltered()) || (pv_urls = this.f40544b.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                C12682a.m34605a(C13008c.m36588n().m36542d(), this.f40544b, this.f40549g, it.next(), false, true);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("NotifyListener", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    protected void m42183k() {
        CampaignEx campaignEx = this.f40544b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCampaignUnitId()) || this.f40544b.getNativeVideoTracking() == null || this.f40544b.getNativeVideoTracking().m36911n() == null) {
            return;
        }
        Context contextM36542d = C13008c.m36588n().m36542d();
        CampaignEx campaignEx2 = this.f40544b;
        C12682a.m34607a(contextM36542d, campaignEx2, campaignEx2.getCampaignUnitId(), this.f40544b.getNativeVideoTracking().m36911n(), false, false);
    }

    /* JADX INFO: renamed from: l */
    protected void m42184l() {
        C14202a c14202a = this.f40547e;
        if (c14202a != null) {
            c14202a.m42491d(true);
        }
    }
}
