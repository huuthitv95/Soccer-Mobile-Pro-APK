package com.mbridge.msdk.interstitial.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13073g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.net.utils.C13119b;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interstitial.cache.C13249a;
import com.mbridge.msdk.interstitial.controller.C13250a;
import com.mbridge.msdk.interstitial.request.AbstractC13252b;
import com.mbridge.msdk.interstitial.request.C13251a;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.setting.util.C13645a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.mbridge.msdk.interstitial.adapter.a */
/* JADX INFO: compiled from: IntersAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13248a {

    /* JADX INFO: renamed from: a */
    private Context f36475a;

    /* JADX INFO: renamed from: b */
    private String f36476b;

    /* JADX INFO: renamed from: c */
    private String f36477c;

    /* JADX INFO: renamed from: d */
    private int f36478d;

    /* JADX INFO: renamed from: e */
    private boolean f36479e;

    /* JADX INFO: renamed from: f */
    private int f36480f;

    /* JADX INFO: renamed from: g */
    private String f36481g;

    /* JADX INFO: renamed from: h */
    private C13250a.b f36482h;

    /* JADX INFO: renamed from: i */
    private C13640l f36483i;

    /* JADX INFO: renamed from: j */
    private Handler f36484j;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.adapter.a$a */
    /* JADX INFO: compiled from: IntersAdapter.java */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            Object obj2;
            try {
                int i = message.what;
                if (i == 3) {
                    if (C13248a.this.f36482h == null || (obj = message.obj) == null || !(obj instanceof String)) {
                        return;
                    }
                    C13248a.this.f36482h.m38072b(C13248a.this.f36479e, (String) obj);
                    return;
                }
                if (i == 4 && C13248a.this.f36482h != null && (obj2 = message.obj) != null && (obj2 instanceof String)) {
                    C13248a.this.f36482h.m38071a(C13248a.this.f36479e, (String) obj2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.adapter.a$b */
    /* JADX INFO: compiled from: IntersAdapter.java */
    class b extends AbstractC13252b {
        b() {
        }

        @Override // com.mbridge.msdk.interstitial.request.AbstractC13252b
        /* JADX INFO: renamed from: a */
        public void mo38032a(CampaignUnit campaignUnit) {
            try {
                C13248a.this.m38000a(campaignUnit);
            } catch (Exception e) {
                e.printStackTrace();
                C13248a.this.m38012b("can't show because unknow error");
                C13248a.this.m38025m();
            }
        }

        @Override // com.mbridge.msdk.interstitial.request.AbstractC13252b
        /* JADX INFO: renamed from: b */
        public void mo38033b(int i, String str) {
            C13219q0.m37816b("IntersAdapter", str);
            C13248a.this.m38012b(str);
            C13248a.this.m38025m();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.adapter.a$c */
    /* JADX INFO: compiled from: IntersAdapter.java */
    class c extends C13092c.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f36487a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f36488b;

        c(CampaignEx campaignEx, Context context, InterfaceC13155a interfaceC13155a) {
            this.f36487a = campaignEx;
            this.f36488b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.C13092c.a
        /* JADX INFO: renamed from: a */
        public void mo34472a(String str, C13154c c13154c) {
            C13156d.m37475b().m37485a(str, c13154c, this.f36487a, this.f36488b, (InterfaceC13155a) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.adapter.a$d */
    /* JADX INFO: compiled from: IntersAdapter.java */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f36490a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f36491b;

        d(List list, List list2) {
            this.f36490a = list;
            this.f36491b = list2;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f36490a;
            if (list == null || list.size() <= 0) {
                C13248a.this.m38012b("no ads available");
            } else {
                C13248a c13248a = C13248a.this;
                c13248a.m38006a(c13248a.f36476b, (List<CampaignEx>) C13248a.this.m37997a((List<CampaignEx>) this.f36490a));
                CampaignEx campaignEx = (CampaignEx) this.f36490a.get(0);
                C13248a.this.m38016c(campaignEx != null ? campaignEx.getRequestId() : "");
            }
            C13020j.m36706a(C13017g.m36693a(C13248a.this.f36475a)).m36710d();
            List list2 = this.f36491b;
            if (list2 == null || list2.size() <= 0) {
                return;
            }
            C13248a.this.m38017c((List<CampaignEx>) this.f36491b);
        }
    }

    public C13248a(Context context, String str, String str2, String str3, boolean z) {
        this.f36475a = context;
        this.f36476b = str;
        this.f36477c = str2;
        this.f36481g = str3;
        this.f36479e = z;
        C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), str);
        this.f36483i = c13640lM39720e;
        if (c13640lM39720e == null) {
            this.f36483i = C13640l.m39752h(this.f36476b);
        }
        m38023i();
    }

    /* JADX INFO: renamed from: g */
    private int m38021g() {
        try {
            Map<String, Integer> map = C13250a.f36498q;
            int iIntValue = (TextUtils.isEmpty(this.f36476b) || map == null || !map.containsKey(this.f36476b)) ? 1 : map.get(this.f36476b).intValue();
            if (iIntValue <= 0) {
                return 1;
            }
            return iIntValue;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m38023i() {
        this.f36484j = new a(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: l */
    private C13126e m38024l() {
        String strM36533b = C13008c.m36588n().m36533b();
        String md5 = SameMD5.getMD5(C13008c.m36588n().m36533b() + C13008c.m36588n().m36538c());
        int i = this.f36479e ? 3 : 2;
        this.f36480f = 1;
        if (this.f36483i.m39635e() > 0) {
            this.f36480f = this.f36483i.m39635e();
        }
        int iM39638f = this.f36483i.m39638f() > 0 ? this.f36483i.m39638f() : 1;
        String strM37102a = C13091b.m37102a(this.f36476b, "interstitial");
        this.f36478d = m38008b();
        String strM38022h = m38022h();
        if (TextUtils.isEmpty(this.f36481g)) {
            this.f36481g = "0";
        }
        C13126e c13126e = new C13126e();
        C13119b.m37209a(c13126e, "app_id", strM36533b);
        C13119b.m37209a(c13126e, MBridgeConstans.PROPERTIES_UNIT_ID, this.f36476b);
        if (!TextUtils.isEmpty(this.f36477c)) {
            C13119b.m37209a(c13126e, MBridgeConstans.PLACEMENT_ID, this.f36477c);
        }
        C13119b.m37209a(c13126e, "sign", md5);
        C13119b.m37209a(c13126e, "category", this.f36481g);
        C13119b.m37209a(c13126e, "req_type", i + "");
        C13119b.m37209a(c13126e, "ad_num", iM39638f + "");
        C13119b.m37209a(c13126e, "tnum", this.f36480f + "");
        C13119b.m37209a(c13126e, "only_impression", "1");
        C13119b.m37209a(c13126e, "ping_mode", "1");
        C13119b.m37209a(c13126e, C13126e.f36056g, strM37102a);
        C13119b.m37209a(c13126e, C13126e.f36057h, m38014c());
        C13119b.m37209a(c13126e, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        C13119b.m37209a(c13126e, C13126e.f36058i, strM38022h);
        C13119b.m37209a(c13126e, "ad_type", "279");
        C13119b.m37209a(c13126e, TypedValues.CycleType.S_WAVE_OFFSET, this.f36478d + "");
        return c13126e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m38025m() {
        try {
            if (TextUtils.isEmpty(this.f36476b)) {
                return;
            }
            C13250a.m38046a(this.f36476b, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m38026n() {
        try {
            this.f36478d += this.f36480f;
            if (this.f36478d > m38021g()) {
                this.f36478d = 0;
            }
            if (TextUtils.isEmpty(this.f36476b)) {
                return;
            }
            C13250a.m38046a(this.f36476b, this.f36478d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m38029f() {
        return this.f36479e;
    }

    /* JADX INFO: renamed from: j */
    public void m38030j() {
        if (this.f36475a == null) {
            m38012b("context is null");
            return;
        }
        if (TextUtils.isEmpty(this.f36476b)) {
            m38012b("unitid is null");
            return;
        }
        C13640l c13640l = this.f36483i;
        if (c13640l == null) {
            m38012b("unitSetting is null please call load");
            return;
        }
        if (c13640l.m39638f() <= 0) {
            m38012b("controller don't request ad");
            return;
        }
        m37998a();
        List<CampaignEx> listM38020e = m38020e();
        if (listM38020e == null || listM38020e.size() <= 0) {
            m38031k();
        } else {
            CampaignEx campaignEx = listM38020e.get(0);
            m38016c(campaignEx != null ? campaignEx.getRequestId() : "");
        }
    }

    /* JADX INFO: renamed from: k */
    public void m38031k() {
        try {
            if (this.f36475a == null) {
                m38012b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f36476b)) {
                m38012b("unitid is null");
                return;
            }
            if (this.f36483i == null) {
                m38012b("unitSetting is null please call load");
                return;
            }
            C13126e c13126eM38024l = m38024l();
            if (c13126eM38024l == null) {
                m38012b("request parameter is null");
                return;
            }
            String strM37921d = C13229v0.m37921d(this.f36476b);
            if (!TextUtils.isEmpty(strM37921d)) {
                c13126eM38024l.m37245a("j", strM37921d);
            }
            C13251a c13251a = new C13251a(this.f36475a);
            b bVar = new b();
            bVar.setUnitId(this.f36476b);
            bVar.setPlacementId(this.f36477c);
            bVar.setAdType(279);
            c13251a.choiceV3OrV5BySetting(1, c13126eM38024l, bVar, "", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        } catch (Exception e) {
            e.printStackTrace();
            m38012b("can't show because unknow error");
            m38025m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m38016c(String str) {
        if (this.f36484j != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = str;
            messageObtain.what = 3;
            this.f36484j.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: e */
    private List<CampaignEx> m38020e() {
        try {
            if (C13249a.m38034a() != null) {
                return C13249a.m38034a().m38035a(this.f36476b, 1);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public CampaignEx m38028d() {
        try {
            if (TextUtils.isEmpty(this.f36476b)) {
                return null;
            }
            m37998a();
            List<CampaignEx> listM38020e = m38020e();
            if (listM38020e != null && listM38020e.size() > 0) {
                for (int i = 0; i < listM38020e.size(); i++) {
                    CampaignEx campaignEx = listM38020e.get(i);
                    if (campaignEx != null && (!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || !TextUtils.isEmpty(campaignEx.getMraid()))) {
                        return campaignEx;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private String m38022h() {
        try {
            return !TextUtils.isEmpty(C13250a.f36496o) ? C13250a.f36496o : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38012b(String str) {
        try {
            if (this.f36484j != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f36484j.sendMessage(messageObtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38006a(String str, List<CampaignEx> list) {
        if (C13249a.m38034a() != null) {
            C13249a.m38034a().m38038a(str, list);
        }
    }

    /* JADX INFO: renamed from: c */
    private String m38014c() {
        String strM37889a = "";
        try {
            JSONArray jSONArrayM37908b = C13229v0.m37908b(this.f36475a, this.f36476b);
            if (jSONArrayM37908b.length() > 0) {
                strM37889a = C13229v0.m37889a(jSONArrayM37908b);
            }
            C13219q0.m37818c("IntersAdapter", "get excludes:" + strM37889a);
            return strM37889a;
        } catch (Exception e) {
            e.printStackTrace();
            return strM37889a;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m37998a() {
        try {
            if (C13249a.m38034a() != null) {
                C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
                if (c13635gM39718d == null) {
                    c13635gM39718d = C13636h.m39706b().m39708a();
                }
                C13249a.m38034a().m38036a(c13635gM39718d.m39477b0() * 1000, this.f36476b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private List<CampaignEx> m38010b(List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int iM39635e = this.f36483i.m39635e();
                    for (int i = 0; i < list.size() && i < this.f36480f && arrayList.size() < iM39635e; i++) {
                        CampaignEx campaignEx = list.get(i);
                        int i2 = 1;
                        if ((campaignEx == null || campaignEx.getOfferType() != 1 || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && campaignEx != null && ((!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || campaignEx.isMraid()) && campaignEx.getOfferType() != 99)) {
                            if (C13229v0.m37916c(campaignEx)) {
                                if (!C13229v0.m37915c(this.f36475a, campaignEx.getPackageName())) {
                                    i2 = 2;
                                }
                                campaignEx.setRtinsType(i2);
                            }
                            if (C13092c.m37123b(this.f36475a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                C13229v0.m37896a(this.f36476b, campaignEx, C13088a.f35882x);
                            }
                            m37999a(campaignEx, null, this.f36475a, null);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m38017c(List<CampaignEx> list) {
        if (this.f36475a == null || list == null || list.size() == 0) {
            return;
        }
        C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(this.f36475a));
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = list.get(i);
            if (campaignEx != null && c13020jM36706a != null && !c13020jM36706a.m36707a(campaignEx.getId())) {
                C13073g c13073g = new C13073g();
                c13073g.m36859a(campaignEx.getId());
                c13073g.m36861b(campaignEx.getFca());
                c13073g.m36863c(campaignEx.getFcb());
                c13073g.m36857a(0);
                c13073g.m36865d(0);
                c13073g.m36858a(System.currentTimeMillis());
                c13020jM36706a.m36708b(c13073g);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38027a(C13250a.b bVar) {
        this.f36482h = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38000a(CampaignUnit campaignUnit) {
        if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
            ArrayList<CampaignEx> ads = campaignUnit.getAds();
            List<CampaignEx> listM38010b = m38010b(ads);
            m38005a(campaignUnit.getSessionId());
            m38026n();
            m38007a(ads, listM38010b);
            return;
        }
        m38012b("no server ads available");
    }

    /* JADX INFO: renamed from: a */
    private void m37999a(CampaignEx campaignEx, C13154c c13154c, Context context, InterfaceC13155a interfaceC13155a) {
        try {
            C13092c.m37119a(campaignEx, this.f36475a, c13154c, new c(campaignEx, context, interfaceC13155a));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38007a(List<CampaignEx> list, List<CampaignEx> list2) {
        new Thread(new d(list2, list)).start();
    }

    /* JADX INFO: renamed from: b */
    private int m38008b() {
        int i = 0;
        try {
            int iM38041a = !TextUtils.isEmpty(this.f36476b) ? C13250a.m38041a(this.f36476b) : 0;
            if (iM38041a <= m38021g()) {
                i = iM38041a;
            }
            C13219q0.m37818c("IntersAdapter", "getCurrentOffset:" + i);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public List<CampaignEx> m37997a(List<CampaignEx> list) throws Throwable {
        FileOutputStream fileOutputStream;
        ArrayList arrayList = new ArrayList(list.size());
        for (CampaignEx campaignEx : list) {
            if (campaignEx.isMraid() && !TextUtils.isEmpty(campaignEx.getMraid())) {
                C13145g.m37360a("m_download_start", campaignEx, "", this.f36476b, CampaignEx.CLICKMODE_ON);
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        String strM37149b = C13098e.m37149b(EnumC13096c.MBRIDGE_700_HTML);
                        String md5 = SameMD5.getMD5(C13188c1.m37646b(campaignEx.getMraid()));
                        if (TextUtils.isEmpty(md5)) {
                            md5 = String.valueOf(System.currentTimeMillis());
                        }
                        File file = new File(strM37149b, md5.concat(".html"));
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            StringBuilder sb = new StringBuilder();
                            String strM39764b = C13645a.m39758a().m39764b();
                            if (!TextUtils.isEmpty(strM39764b)) {
                                sb.append("<script>");
                                sb.append(strM39764b);
                                sb.append("</script>");
                            }
                            sb.append(campaignEx.getMraid());
                            fileOutputStream.write(sb.toString().getBytes());
                            fileOutputStream.flush();
                            campaignEx.setMraid(file.getAbsolutePath());
                            C13145g.m37360a("m_download_end", campaignEx, "", this.f36476b, CampaignEx.CLICKMODE_ON);
                            try {
                                fileOutputStream.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream2 = fileOutputStream;
                            e.printStackTrace();
                            campaignEx.setMraid("");
                            C13145g.m37360a("m_download_end", campaignEx, e.getMessage(), this.f36476b, CampaignEx.CLICKMODE_ON);
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                File file2 = new File(campaignEx.getMraid());
                if (!file2.exists() || !file2.isFile() || !file2.canRead()) {
                    m38012b("mraid resource write fail");
                }
            }
            arrayList.add(campaignEx);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m38005a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C13219q0.m37818c("IntersAdapter", "onload sessionId:" + str);
        C13250a.f36496o = str;
    }
}
