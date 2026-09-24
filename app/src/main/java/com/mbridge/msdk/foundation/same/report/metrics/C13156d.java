package com.mbridge.msdk.foundation.same.report.metrics;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.report.C13134c;
import com.mbridge.msdk.foundation.same.report.C13142d;
import com.mbridge.msdk.foundation.same.report.C13151m;
import com.mbridge.msdk.foundation.same.report.C13159n;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.tracker.C13818e;
import com.mbridge.msdk.tracker.C13826m;
import com.mbridge.msdk.tracker.C13873p;
import com.mbridge.msdk.tracker.C13881x;
import com.mbridge.msdk.tracker.network.toolbox.C13858h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.metrics.d */
/* JADX INFO: compiled from: MetricsManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13156d {

    /* JADX INFO: renamed from: e */
    private static C13156d f36182e;

    /* JADX INFO: renamed from: a */
    private volatile C13826m f36183a;

    /* JADX INFO: renamed from: b */
    private Map<String, C13157e> f36184b = new HashMap();

    /* JADX INFO: renamed from: c */
    private LinkedHashMap<String, C13154c> f36185c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: d */
    private Map<String, C13157e> f36186d = new HashMap();

    private C13156d() {
        if (this.f36183a == null) {
            this.f36183a = C13826m.m41070b("metrics_sdk", C13008c.m36588n().m36542d(), m37472a());
        }
        JSONObject jSONObjectM37281b = C13134c.m37281b();
        if (this.f36183a != null) {
            this.f36183a.m41075a(jSONObjectM37281b);
            this.f36183a.m41085h();
        }
    }

    /* JADX INFO: renamed from: a */
    public C13154c m37478a(boolean z, String str, C13157e c13157e, CampaignEx campaignEx, String str2) {
        C13154c c13154c;
        C13154c c13154c2 = new C13154c();
        try {
            m37474a(z, str2);
            String md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(C13229v0.m37920d()) : m37480a(str);
            campaignEx.setLocalRequestId(md5);
            c13154c2 = m37475b().m37489b(md5);
            if (c13154c2 == null) {
                c13154c = new C13154c();
                try {
                    m37475b().m37495c().put(md5, c13154c);
                    c13154c.m37436d(true);
                    m37475b().m37495c().put(md5, c13154c);
                    c13154c2 = c13154c;
                } catch (Exception e) {
                    e = e;
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("MetricsManager", e.getMessage());
                    }
                    return c13154c;
                }
            }
            c13154c2.m37446i(md5);
            c13154c2.m37456n(str2);
            if (c13157e != null) {
                if (c13157e.m37503a("adtp")) {
                    c13154c2.m37420a(Integer.parseInt((String) c13157e.m37504b("adtp")));
                }
                if (c13157e.m37503a(CampaignEx.JSON_KEY_HB)) {
                    String str3 = (String) c13157e.m37504b(CampaignEx.JSON_KEY_HB);
                    c13154c2.m37444h(str3);
                    if (str3.equals("1")) {
                        c13154c2.m37443g(str);
                    }
                }
            }
            c13154c2.m37440f(z ? "2" : "1");
            return c13154c2;
        } catch (Exception e2) {
            e = e2;
            c13154c = c13154c2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37490b(C13154c c13154c) {
        if (c13154c != null) {
            try {
                if (this.f36184b != null) {
                    C13157e c13157e = new C13157e();
                    c13157e.m37501a("rs_rid", c13154c.m37467x());
                    c13157e.m37501a("r_stid", c13154c.m37468y());
                    c13157e.m37501a("rus_rid", c13154c.m37469z());
                    c13157e.m37501a("u_stid", c13154c.m37414C());
                    this.f36184b.put(c13154c.m37413B(), c13157e);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public C13157e m37494c(String str) {
        Map<String, C13157e> map;
        C13157e c13157e = new C13157e();
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f36184b) != null && map.containsKey(str)) {
                return this.f36184b.get(str);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return c13157e;
    }

    /* JADX INFO: renamed from: d */
    public void m37497d(String str) {
        m37493b(str, "");
    }

    /* JADX INFO: renamed from: e */
    public void m37498e(String str) {
        try {
            JSONObject jSONObjectM37118a = C13092c.m37118a(str);
            if (jSONObjectM37118a != null && jSONObjectM37118a.length() != 0) {
                String strOptString = jSONObjectM37118a.optString("key");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                C13818e c13818e = new C13818e(strOptString);
                c13818e.m41002a(0);
                c13818e.m41008b(0);
                c13818e.m41004a(C13134c.m37283d());
                c13818e.m41006a(jSONObjectM37118a);
                C13826m c13826mM37496d = m37475b().m37496d();
                if (c13826mM37496d == null || !c13826mM37496d.m41084g()) {
                    return;
                }
                c13826mM37496d.m41081d(c13818e);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("EventLibraryReport", "reportByTrackManager error: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public C13826m m37496d() {
        try {
            JSONObject jSONObjectM37281b = C13134c.m37281b();
            if (this.f36183a == null) {
                this.f36183a = C13826m.m41070b("metrics_sdk", C13008c.m36588n().m36542d(), m37472a());
                if (this.f36183a != null) {
                    this.f36183a.m41075a(jSONObjectM37281b);
                    this.f36183a.m41085h();
                }
            } else {
                this.f36183a.m41075a(jSONObjectM37281b);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return this.f36183a;
    }

    /* JADX INFO: renamed from: c */
    public LinkedHashMap<String, C13154c> m37495c() {
        return this.f36185c;
    }

    /* JADX INFO: renamed from: b */
    public static C13156d m37475b() {
        if (f36182e == null) {
            synchronized (C13156d.class) {
                if (f36182e == null) {
                    f36182e = new C13156d();
                }
            }
        }
        return f36182e;
    }

    /* JADX INFO: renamed from: b */
    public void m37491b(String str, C13154c c13154c, InterfaceC13155a interfaceC13155a) {
        m37473a(str, c13154c, interfaceC13155a);
    }

    /* JADX INFO: renamed from: b */
    public void m37492b(String str, C13157e c13157e) {
        try {
            C13154c c13154c = new C13154c();
            if (c13157e.m37504b(MBridgeConstans.PROPERTIES_UNIT_ID) != null) {
                c13154c.m37456n(String.valueOf(c13157e.m37504b(MBridgeConstans.PROPERTIES_UNIT_ID)));
            }
            if (c13157e.m37504b("lrid") != null && (c13157e.m37504b("lrid") instanceof String)) {
                c13154c.m37446i(String.valueOf(c13157e.m37504b("lrid")));
            }
            c13154c.m37423a(str, c13157e);
            new C13158f().m37515b(str, m37496d(), c13154c, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public C13154c m37489b(String str) {
        return m37477a(str, "");
    }

    /* JADX INFO: renamed from: b */
    public void m37493b(String str, String str2) {
        LinkedHashMap<String, C13154c> linkedHashMap;
        try {
            String str3 = str + str2;
            if (!TextUtils.isEmpty(str3) && (linkedHashMap = this.f36185c) != null && linkedHashMap.containsKey(str3)) {
                this.f36185c.remove(str3);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public String m37480a(String str) {
        String md5 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                md5 = SameMD5.getMD5(C13229v0.m37920d());
            }
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(C13229v0.m37920d()) : md5;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return md5;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m37474a(boolean z, String str) {
        List<String> listM36682e;
        if (z) {
            try {
                C13015e c13015eM36643a = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                if (c13015eM36643a != null && (listM36682e = c13015eM36643a.m36682e(str)) != null && listM36682e.size() > 0) {
                    Iterator<String> it = listM36682e.iterator();
                    while (it.hasNext()) {
                        m37475b().m37497d(it.next());
                    }
                }
                LinkedHashMap<String, C13154c> linkedHashMapM37495c = m37475b().m37495c();
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
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37486a(String str, C13157e c13157e) {
        Map<String, C13157e> map = this.f36186d;
        if (map != null) {
            map.put(str, c13157e);
        }
    }

    /* JADX INFO: renamed from: a */
    public C13157e m37479a(int i, int i2, String str, boolean z, int i3) {
        C13157e c13157e = new C13157e();
        try {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, Integer.valueOf(i));
            c13157e.m37501a("adtp", Integer.valueOf(i2));
            c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (z) {
                c13157e.m37501a("auto_load", Integer.valueOf(i3));
                return c13157e;
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return c13157e;
    }

    /* JADX INFO: renamed from: a */
    private C13881x m37472a() {
        try {
            int iM37844b = C13223s0.m37831a().m37844b("metrics", "t_m_e_t", C13223s0.m37831a().m37843b("t_m_e_t", 604800000));
            int iM37844b2 = C13223s0.m37831a().m37844b("metrics", "t_m_e_s", C13223s0.m37831a().m37843b("t_m_e_s", 50));
            int iM37844b3 = C13223s0.m37831a().m37844b("metrics", "t_m_r_c", C13223s0.m37831a().m37843b("t_m_r_c", 50));
            int iM37844b4 = C13223s0.m37831a().m37844b("metrics", "t_m_t", C13223s0.m37831a().m37843b("t_m_t", 15000));
            int iM37844b5 = C13223s0.m37831a().m37844b("metrics", "t_m_r_t_s", C13223s0.m37831a().m37843b("t_m_r_t_s", 2));
            int iM37844b6 = C13223s0.m37831a().m37844b("metrics", "t_r_t", C13223s0.m37831a().m37843b("t_r_t", 1));
            if (iM37844b6 != 0 && iM37844b6 != 1) {
                iM37844b6 = 0;
            }
            return new C13881x.b().m41401a(iM37844b).m41407b(iM37844b2).m41409d(iM37844b3).m41408c(iM37844b4).m41410e(iM37844b5).m41403a(new C13142d()).m41404a(C13134c.m37282c()).m41405a(new C13159n()).m41402a(iM37844b6, m37471a(iM37844b6)).m41406a();
        } catch (Exception e) {
            C13219q0.m37816b("EventLibraryReport", "configTrackManager error: " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private C13873p m37471a(int i) {
        if (i == 1) {
            return new C13873p(new C13151m((byte) 2), C13121d.m37226h().f36033j, C13121d.m37226h().f36037n);
        }
        return new C13873p(new C13858h(), C13121d.m37226h().f36024d, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m37483a(String str, CampaignEx campaignEx, C13157e c13157e) {
        C13154c c13154c;
        String localRequestId = "";
        if (campaignEx != null) {
            try {
                localRequestId = campaignEx.getLocalRequestId();
                c13154c = m37495c().get(localRequestId);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            c13154c = null;
        }
        if (c13154c != null) {
            if (Arrays.asList(C13153b.f36144h).contains(str)) {
                c13154c = m37476a(c13154c);
            }
        } else {
            c13154c = new C13154c();
        }
        c13154c.m37421a(campaignEx);
        c13154c.m37446i(localRequestId);
        c13154c.m37423a(str, c13157e);
        m37473a(str, c13154c, (InterfaceC13155a) null);
    }

    /* JADX INFO: renamed from: a */
    public void m37482a(String str, CampaignEx campaignEx) {
        String currentLocalRid = "";
        if (campaignEx != null) {
            try {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        C13154c c13154c = m37495c().get(currentLocalRid);
        if (c13154c == null) {
            c13154c = new C13154c();
        }
        if (c13154c.m37457o() != null && !c13154c.m37457o().isEmpty() && campaignEx != null) {
            for (int i = 0; i < c13154c.m37457o().size(); i++) {
                if (c13154c.m37457o().get(i).getId().equals(campaignEx.getId())) {
                    c13154c.m37457o().set(i, campaignEx);
                    break;
                }
            }
        }
        c13154c.m37421a(campaignEx);
        c13154c.m37446i(currentLocalRid);
        m37473a(str, c13154c, (InterfaceC13155a) null);
    }

    /* JADX INFO: renamed from: a */
    public void m37487a(String str, List<CampaignEx> list, C13157e c13157e) {
        CampaignEx campaignEx;
        String currentLocalRid = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    currentLocalRid = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        C13154c c13154c = m37495c().get(currentLocalRid);
        if (c13154c == null) {
            c13154c = new C13154c();
        }
        c13154c.m37429b(list);
        if (list != null && list.size() > 0) {
            c13154c.m37446i(list.get(0).getCurrentLocalRid());
        }
        c13154c.m37423a(str, c13157e);
        m37473a(str, c13154c, (InterfaceC13155a) null);
    }

    /* JADX INFO: renamed from: a */
    public void m37481a(C13080n c13080n, CampaignEx campaignEx) {
        C13157e c13157e = new C13157e();
        c13157e.m37501a("result", Integer.valueOf(c13080n.m37008x()));
        c13157e.m37501a("scenes", c13080n.m36957a("scenes", ""));
        c13157e.m37501a("resource_type", Integer.valueOf(c13080n.m37009y()));
        c13157e.m37501a("url", c13080n.m36957a("url", ""));
        c13157e.m37501a("reason", c13080n.m37001t());
        c13157e.m37501a("mraid_type", Integer.valueOf(c13080n.m36993p()));
        m37475b().m37483a(c13080n.m36989n(), campaignEx, c13157e);
    }

    /* JADX INFO: renamed from: a */
    public void m37484a(String str, C13154c c13154c) {
        try {
            Map<String, C13157e> map = this.f36186d;
            if (map != null && map.containsKey(str) && c13154c != null) {
                c13154c.m37423a(str, this.f36186d.get(str));
            }
            new C13158f().m37513a(str, m37496d(), c13154c, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37485a(String str, C13154c c13154c, CampaignEx campaignEx, Context context, InterfaceC13155a interfaceC13155a) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (c13154c == null) {
                c13154c = new C13154c();
            }
            C13157e c13157e = new C13157e();
            c13157e.m37501a("st", Long.valueOf(System.currentTimeMillis()));
            if (campaignEx != null) {
                c13157e.m37501a("cid", campaignEx.getId());
                c13157e.m37501a("lrid", campaignEx.getLocalRequestId());
                c13157e.m37501a("rid", campaignEx.getRequestId());
                c13157e.m37501a("rid_n", campaignEx.getRequestIdNotice());
                c13157e.m37501a("adtp", Integer.valueOf(campaignEx.getAdType()));
                if (!c13157e.m37503a(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                }
                c13157e.m37501a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                c13157e.m37501a("bid_tk", campaignEx.getBidToken());
            }
            if (context != null) {
                c13157e.m37501a("network_type", Integer.valueOf(C13211m0.m37770s(context)));
            }
            c13154c.m37423a(str, c13157e);
            m37473a(str, c13154c, interfaceC13155a);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m37473a(String str, C13154c c13154c, InterfaceC13155a interfaceC13155a) {
        try {
            if (Arrays.asList(C13153b.f36139c).contains(str)) {
                c13154c.m37435d(str);
            }
            Map<String, C13157e> map = this.f36186d;
            if (map != null && map.containsKey(str)) {
                c13154c.m37423a(str, this.f36186d.get(str));
            }
            new C13158f().m37513a(str, m37496d(), c13154c, interfaceC13155a);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C13154c m37477a(String str, String str2) {
        LinkedHashMap<String, C13154c> linkedHashMap;
        try {
            String str3 = str + str2;
            if (!TextUtils.isEmpty(str3) && (linkedHashMap = this.f36185c) != null && linkedHashMap.containsKey(str3)) {
                return this.f36185c.get(str3);
            }
            return null;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13154c m37476a(C13154c c13154c) {
        if (c13154c == null) {
            return null;
        }
        try {
            return (C13154c) c13154c.clone();
        } catch (CloneNotSupportedException e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37488a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() == 0) {
                    return;
                }
                String strOptString = jSONObject.optString("key");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                C13818e c13818e = new C13818e(strOptString);
                c13818e.m41002a(0);
                c13818e.m41008b(0);
                c13818e.m41004a(C13134c.m37283d());
                c13818e.m41006a(jSONObject);
                C13826m c13826mM37496d = m37475b().m37496d();
                if (c13826mM37496d == null || !c13826mM37496d.m41084g()) {
                    return;
                }
                c13826mM37496d.m41081d(c13818e);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("EventLibraryReport", "reportByTrackManager error: " + e.getMessage());
                }
            }
        }
    }
}
