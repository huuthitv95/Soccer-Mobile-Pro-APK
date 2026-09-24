package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.C13234y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbanner.common.data.C13278a;
import com.mbridge.msdk.mbbanner.common.data.C13279b;
import com.mbridge.msdk.mbbanner.common.data.C13280c;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13283b;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13285d;
import com.mbridge.msdk.mbbanner.common.report.C13291a;
import com.mbridge.msdk.mbbanner.common.request.C13292a;
import com.mbridge.msdk.mbbanner.common.response.AbstractC13293a;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.common.util.C13294a;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.b */
/* JADX INFO: compiled from: BannerLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13288b {

    /* JADX INFO: renamed from: n */
    private static final String f36649n = "b";

    /* JADX INFO: renamed from: a */
    private Context f36650a;

    /* JADX INFO: renamed from: c */
    private C13279b f36652c;

    /* JADX INFO: renamed from: d */
    private C13294a f36653d;

    /* JADX INFO: renamed from: e */
    private InterfaceC13283b f36654e;

    /* JADX INFO: renamed from: f */
    private InterfaceC13285d f36655f;

    /* JADX INFO: renamed from: b */
    private int f36651b = 0;

    /* JADX INFO: renamed from: g */
    private volatile boolean f36656g = false;

    /* JADX INFO: renamed from: h */
    private Timer f36657h = new Timer();

    /* JADX INFO: renamed from: i */
    private volatile List<String> f36658i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private volatile boolean f36659j = false;

    /* JADX INFO: renamed from: k */
    private volatile boolean f36660k = false;

    /* JADX INFO: renamed from: l */
    private volatile boolean f36661l = false;

    /* JADX INFO: renamed from: m */
    private String f36662m = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.b$a */
    /* JADX INFO: compiled from: BannerLoader.java */
    class a extends TimerTask {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f36663a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36664b;

        a(String str, CampaignEx campaignEx) {
            this.f36663a = str;
            this.f36664b = campaignEx;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (C13288b.this.f36656g) {
                return;
            }
            C13288b.this.f36656g = true;
            C13288b.this.m38220a(this.f36663a, -1, "", false, this.f36664b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.b$c */
    /* JADX INFO: compiled from: BannerLoader.java */
    class c extends C13092c.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f36668a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36669b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Context f36670c;

        c(String str, CampaignEx campaignEx, Context context, InterfaceC13155a interfaceC13155a) {
            this.f36668a = str;
            this.f36669b = campaignEx;
            this.f36670c = context;
        }

        @Override // com.mbridge.msdk.foundation.same.C13092c.a
        /* JADX INFO: renamed from: a */
        public void mo34472a(String str, C13154c c13154c) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C13157e c13157e = new C13157e();
            c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36668a);
            c13154c.m37423a(str, c13157e);
            C13291a.m38290a(str, c13154c, this.f36669b, this.f36670c, null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.b$d */
    /* JADX INFO: compiled from: BannerLoader.java */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignUnit f36672a;

        d(CampaignUnit campaignUnit) {
            this.f36672a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13219q0.m37818c(C13288b.f36649n, "在单独子线程保存数据库 开始");
            C13020j.m36706a(C13017g.m36693a(C13288b.this.f36650a)).m36710d();
            CampaignUnit campaignUnit = this.f36672a;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f36672a.getAds().size() > 0) {
                BannerUtils.uisList(C13288b.this.f36650a, this.f36672a.getAds());
            }
            C13219q0.m37818c(C13288b.f36649n, "在单独子线程保存数据库 完成");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.b$e */
    /* JADX INFO: compiled from: BannerLoader.java */
    private static class e implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        private C13288b f36674a;

        /* JADX INFO: renamed from: b */
        private String f36675b;

        /* JADX INFO: renamed from: c */
        private CampaignEx f36676c;

        public e(C13288b c13288b, String str, CampaignEx campaignEx) {
            this.f36674a = c13288b;
            this.f36675b = str;
            this.f36676c = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            String str3;
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37818c(C13288b.f36649n, "DownloadImageListener campaign image fail");
            }
            C13288b c13288b = this.f36674a;
            if (c13288b != null) {
                str3 = str2;
                c13288b.m38220a(this.f36675b, 1, str3, false, this.f36676c);
            } else {
                str3 = str2;
            }
            try {
                C13154c c13154cM38282a = C13291a.m38282a(this.f36675b, this.f36676c.getCurrentLocalRid());
                c13154cM38282a.m37421a(this.f36676c);
                c13154cM38282a.m37437e(10);
                C13157e c13157e = new C13157e();
                c13154cM38282a.m37437e(10);
                c13157e.m37501a("resource_type", 10);
                c13157e.m37501a("result", 3);
                c13157e.m37501a("url", str3);
                C13291a.m38291a("m_download_end", c13154cM38282a, c13157e);
            } catch (Throwable th) {
                C13219q0.m37816b(C13288b.f36649n, th.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            String str2;
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37818c(C13288b.f36649n, "DownloadImageListener campaign image success");
            }
            C13288b c13288b = this.f36674a;
            if (c13288b != null) {
                str2 = str;
                c13288b.m38220a(this.f36675b, 1, str2, true, this.f36676c);
            } else {
                str2 = str;
            }
            try {
                C13154c c13154cM38282a = C13291a.m38282a(this.f36675b, this.f36676c.getCurrentLocalRid());
                c13154cM38282a.m37421a(this.f36676c);
                c13154cM38282a.m37437e(10);
                c13154cM38282a.m37437e(10);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("resource_type", 10);
                c13157e.m37501a("result", 1);
                c13157e.m37501a("url", str2);
                C13291a.m38291a("m_download_end", c13154cM38282a, c13157e);
            } catch (Throwable th) {
                C13219q0.m37816b(C13288b.f36649n, th.getMessage());
            }
        }
    }

    public C13288b(Context context, C13279b c13279b, InterfaceC13283b interfaceC13283b, C13294a c13294a) {
        this.f36650a = context.getApplicationContext();
        this.f36652c = c13279b;
        this.f36654e = interfaceC13283b;
        this.f36653d = c13294a;
    }

    /* JADX INFO: renamed from: b */
    private void m38216b(String str, List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                this.f36658i.add(campaignEx.getImageUrl());
                C13100b.m37152a(this.f36650a).m37155a(campaignEx.getImageUrl(), new e(this, str, campaignEx));
                C13154c c13154cM38282a = C13291a.m38282a(str, campaignEx.getCurrentLocalRid());
                c13154cM38282a.m37421a(campaignEx);
                c13154cM38282a.m37437e(10);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("resource_type", 10);
                C13291a.m38291a("m_download_start", c13154cM38282a, c13157e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38205a(String str, int i) {
        if (this.f36661l) {
            return;
        }
        if ((this.f36659j || this.f36660k) && this.f36658i.size() == 0) {
            C13219q0.m37818c(f36649n, "在子线程处理业务逻辑 完成");
            this.f36656g = true;
            this.f36661l = true;
            this.f36657h.cancel();
            this.f36653d.m38299a(this.f36654e, str, i);
            this.f36655f.mo38186a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38215b(String str, String str2, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m38220a(str, 3, str2, true, campaignEx);
    }

    /* JADX INFO: renamed from: a */
    private void m38207a(String str, CampaignEx campaignEx) {
        String str2 = f36649n;
        C13219q0.m37818c(str2, "在子线程处理业务逻辑 完成");
        C13219q0.m37818c(str2, "downloadResource--> Fail");
        this.f36656g = true;
        C13082b c13082b = new C13082b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        c13082b.m37018a(mBridgeIds);
        c13082b.m37023b(this.f36652c.m38163a());
        c13082b.m37017a(campaignEx);
        this.f36653d.m38301b(this.f36654e, c13082b);
        this.f36655f.mo38186a(str);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.b$b */
    /* JADX INFO: compiled from: BannerLoader.java */
    class b extends AbstractC13293a {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C13278a f36666c;

        b(C13278a c13278a) {
            this.f36666c = c13278a;
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.AbstractC13293a
        /* JADX INFO: renamed from: a */
        public void mo38223a(CampaignUnit campaignUnit) throws Throwable {
            try {
                C13219q0.m37818c(C13288b.f36649n, "requestCampaign--> Succeed");
                campaignUnit.setLocalRequestId(this.f36666c.m38156b());
                C13288b.this.f36653d.m38297a(C13288b.this.f36654e, campaignUnit, this.unitId);
                C13288b.this.m38208a(this.unitId, this.f36666c.m38156b(), campaignUnit);
            } catch (Exception e) {
                C13219q0.m37818c(C13288b.f36649n, "requestCampaign--> Fail with exception = " + e.getMessage());
                C13082b c13082b = new C13082b(880000);
                c13082b.m37018a(new MBridgeIds(this.placementId, this.unitId));
                c13082b.m37023b(this.f36666c.m38156b());
                c13082b.m37017a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                c13082b.m37021a((Throwable) e);
                C13288b.this.f36653d.m38298a(C13288b.this.f36654e, c13082b);
                C13288b.this.f36655f.mo38186a(this.unitId);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.AbstractC13293a
        /* JADX INFO: renamed from: a */
        public void mo38222a(int i, String str) {
            C13219q0.m37818c(C13288b.f36649n, "requestCampaign--> Fail errorCode:" + i + " msg:" + str);
            C13082b c13082b = new C13082b(880003);
            c13082b.m37024c(i + "#" + str);
            c13082b.m37018a(new MBridgeIds(this.placementId, this.unitId));
            c13082b.m37023b(this.f36666c.m38156b());
            C13288b.this.f36653d.m38298a(C13288b.this.f36654e, c13082b);
            C13288b.this.f36655f.mo38186a(this.unitId);
        }
    }

    /* JADX INFO: renamed from: b */
    private String m38213b() {
        return this.f36652c.m38169d();
    }

    /* JADX INFO: renamed from: b */
    private void m38214b(String str) {
        this.f36652c.m38167b(str);
    }

    /* JADX INFO: renamed from: a */
    public void m38220a(String str, int i, String str2, boolean z, CampaignEx campaignEx) {
        if (!z) {
            if (i == -1) {
                C13219q0.m37816b(f36649n, " unitId =" + str + " --> time out!");
            }
            this.f36657h.cancel();
            m38207a(str, campaignEx);
            return;
        }
        if (i == 1) {
            C13219q0.m37818c(f36649n, "downloadResource--> Success Image");
            synchronized (this) {
                this.f36658i.remove(str2);
                if (this.f36658i.size() == 0) {
                    m38205a(str, i);
                }
            }
            return;
        }
        if (i == 2) {
            C13219q0.m37818c(f36649n, "downloadResource--> Success banner_html");
            this.f36660k = true;
            m38205a(str, i);
        } else if (i == 3) {
            C13219q0.m37818c(f36649n, "downloadResource--> Success banner_url");
            this.f36659j = true;
            m38205a(str, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38206a(String str, int i, CampaignEx campaignEx) {
        this.f36657h.schedule(new a(str, campaignEx), i);
    }

    /* JADX INFO: renamed from: a */
    public void m38221a(String str, String str2, C13278a c13278a, InterfaceC13285d interfaceC13285d) {
        boolean z;
        try {
            C13219q0.m37818c(f36649n, "requestCampaign--> started");
            this.f36655f = interfaceC13285d;
            b bVar = new b(c13278a);
            bVar.setUnitId(str2);
            bVar.setPlacementId(str);
            bVar.setAdType(296);
            C13292a c13292a = new C13292a(this.f36650a);
            this.f36651b = m38198a(str2);
            C13126e c13126eM38170a = C13280c.m38170a(false, this.f36650a, str2, m38213b(), this.f36651b, c13278a);
            String strM37921d = C13229v0.m37921d(str2);
            if (!TextUtils.isEmpty(strM37921d)) {
                c13126eM38170a.m37245a("j", strM37921d);
            }
            String strM38153a = c13278a.m38153a();
            if (TextUtils.isEmpty(strM38153a)) {
                z = false;
            } else {
                bVar.m38295a(strM38153a);
                z = true;
            }
            this.f36653d.m38300a(z);
            c13292a.choiceV3OrV5BySetting(1, c13126eM38170a, bVar, strM38153a, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        } catch (Exception e2) {
            C13219q0.m37816b(f36649n, e2.getMessage());
            C13082b c13082b = new C13082b(880002);
            c13082b.m37018a(new MBridgeIds(str, str2));
            this.f36653d.m38298a(this.f36654e, c13082b);
            this.f36655f.mo38186a(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38208a(String str, String str2, CampaignUnit campaignUnit) throws Throwable {
        C13082b c13082b;
        CampaignEx campaignEx;
        if (campaignUnit == null) {
            C13082b c13082b2 = new C13082b(880003);
            MBridgeIds mBridgeIds = new MBridgeIds();
            mBridgeIds.setUnitId(str);
            c13082b2.m37018a(mBridgeIds);
            c13082b2.m37023b(str2);
            this.f36653d.m38298a(this.f36654e, c13082b2);
            this.f36655f.mo38186a(str);
            return;
        }
        List<CampaignEx> listM38201a = m38201a(str, campaignUnit);
        m38203a(campaignUnit);
        int i = 0;
        if (listM38201a != null && listM38201a.size() != 0) {
            C13219q0.m37818c(f36649n, "在子线程处理业务逻辑 开始");
            CampaignEx campaignEx2 = listM38201a.get(0);
            m38206a(str, 60000, campaignEx2);
            m38214b(campaignUnit.getSessionId());
            m38209a(str, listM38201a);
            String strTrim = campaignEx2.getBannerUrl().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                m38215b(str, strTrim, campaignEx2);
                if (listM38201a.size() > 0) {
                    while (i < listM38201a.size()) {
                        listM38201a.get(i).setBannerUrl(campaignEx2.getBannerUrl());
                        listM38201a.get(i).setHasMBTplMark(true);
                        i++;
                    }
                }
            } else {
                String strTrim2 = campaignEx2.getBannerHtml().trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    String strM38200a = m38200a(str, strTrim2, campaignEx2);
                    if (listM38201a.size() > 0) {
                        while (i < listM38201a.size()) {
                            listM38201a.get(i).setBannerHtml(strM38200a);
                            listM38201a.get(i).setHasMBTplMark(strTrim2.contains("<MBTPLMARK>"));
                            i++;
                        }
                    }
                } else {
                    this.f36660k = true;
                    this.f36659j = true;
                }
            }
            m38216b(str, listM38201a);
            return;
        }
        C13219q0.m37818c(f36649n, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
        if (this.f36662m.contains("INSTALLED")) {
            c13082b = new C13082b(880021, "APP ALREADY INSTALLED");
        } else {
            c13082b = new C13082b(880003);
        }
        MBridgeIds mBridgeIds2 = new MBridgeIds();
        mBridgeIds2.setUnitId(str);
        c13082b.m37018a(mBridgeIds2);
        c13082b.m37023b(str2);
        if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (campaignEx = campaignUnit.getAds().get(0)) != null) {
            c13082b.m37017a(campaignEx);
        }
        this.f36653d.m38298a(this.f36654e, c13082b);
        this.f36655f.mo38186a(str);
    }

    /* JADX INFO: renamed from: a */
    private List<CampaignEx> m38201a(String str, CampaignUnit campaignUnit) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    C13219q0.m37818c(f36649n, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    C13234y.m37955a(ads);
                    int i = 0;
                    while (i < ads.size()) {
                        CampaignEx campaignEx = ads.get(i);
                        if (campaignEx == null || campaignEx.getOfferType() == 99 || (TextUtils.isEmpty(campaignEx.getBannerUrl()) && TextUtils.isEmpty(campaignEx.getBannerHtml()) && TextUtils.isEmpty(campaignEx.getImageUrl()))) {
                            str2 = str;
                        } else {
                            if (C13229v0.m37916c(campaignEx)) {
                                campaignEx.setRtinsType(C13229v0.m37915c(this.f36650a, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (C13092c.m37123b(this.f36650a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                C13229v0.m37896a(str, campaignEx, C13088a.f35882x);
                                this.f36662m = "APP ALREADY INSTALLED";
                            }
                            str2 = str;
                            m38202a(campaignEx, this.f36650a, (C13154c) null, str2, (InterfaceC13155a) null);
                        }
                        i++;
                        str = str2;
                    }
                    C13219q0.m37818c(f36649n, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                    return arrayList;
                }
            } catch (Exception e2) {
                C13219q0.m37816b(f36649n, e2.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m38202a(CampaignEx campaignEx, Context context, C13154c c13154c, String str, InterfaceC13155a interfaceC13155a) {
        try {
            C13092c.m37119a(campaignEx, context, c13154c, new c(str, campaignEx, context, interfaceC13155a));
        } catch (Exception e2) {
            C13219q0.m37816b(f36649n, e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX INFO: renamed from: a */
    private String m38200a(String str, String str2, CampaignEx campaignEx) throws Throwable {
        File file;
        Throwable th;
        FileOutputStream fileOutputStream;
        String absolutePath = "";
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    String strM37149b = C13098e.m37149b(EnumC13096c.MBRIDGE_700_HTML);
                    String md5 = SameMD5.getMD5(C13188c1.m37646b(str2));
                    if (TextUtils.isEmpty(md5)) {
                        md5 = String.valueOf(System.currentTimeMillis());
                    }
                    File file2 = new File(strM37149b, md5.concat(".html"));
                    Uri.parse(str2).getPath();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(str2.getBytes());
                        fileOutputStream.flush();
                        absolutePath = file2.getAbsolutePath();
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream;
                        C13219q0.m37816b(f36649n, e.getMessage());
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        file = new File(absolutePath);
                        if (!file.exists()) {
                            m38220a(str, 2, str2, false, campaignEx);
                        } else {
                            m38220a(str, 2, str2, false, campaignEx);
                        }
                        return absolutePath;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (Exception e3) {
                                C13219q0.m37816b(f36649n, e3.getMessage());
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            C13219q0.m37816b(f36649n, e5.getMessage());
        }
        file = new File(absolutePath);
        if (!file.exists() && file.isFile() && file.canRead()) {
            m38220a(str, 2, str2, true, campaignEx);
        } else {
            m38220a(str, 2, str2, false, campaignEx);
        }
        return absolutePath;
    }

    /* JADX INFO: renamed from: a */
    private void m38203a(CampaignUnit campaignUnit) {
        new Thread(new d(campaignUnit)).start();
    }

    /* JADX INFO: renamed from: a */
    private int m38198a(String str) {
        try {
            int iM38168c = this.f36652c.m38168c();
            if (iM38168c > this.f36652c.m38166b()) {
                return 0;
            }
            return iM38168c;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38209a(String str, List<CampaignEx> list) {
        int size = this.f36651b;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    size += list.size();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (size > this.f36652c.m38166b()) {
            C13219q0.m37818c(f36649n, "saveNextOffset 重置offset为0");
            size = 0;
        }
        C13219q0.m37818c(f36649n, "saveNextOffset 算出 下次的offset是:" + size);
        if (C13182a1.m37597b(str)) {
            this.f36652c.m38164a(size);
        }
    }
}
