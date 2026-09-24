package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.same.net.C13111d;
import com.mbridge.msdk.setting.C13633e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.metrics.c */
/* JADX INFO: compiled from: MetricsData.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13154c implements Serializable, Cloneable {

    /* JADX INFO: renamed from: A */
    private int f36152A;

    /* JADX INFO: renamed from: B */
    private int f36153B;

    /* JADX INFO: renamed from: C */
    private CampaignEx f36154C;

    /* JADX INFO: renamed from: D */
    private CopyOnWriteArrayList<CampaignEx> f36155D;

    /* JADX INFO: renamed from: a */
    private boolean f36156a;

    /* JADX INFO: renamed from: b */
    private Map<String, Map<String, String>> f36157b;

    /* JADX INFO: renamed from: c */
    private Map<String, Map<String, String>> f36158c;

    /* JADX INFO: renamed from: d */
    private Map<String, Map<String, String>> f36159d;

    /* JADX INFO: renamed from: e */
    private Map<String, Long> f36160e;

    /* JADX INFO: renamed from: f */
    private C13082b f36161f;

    /* JADX INFO: renamed from: g */
    private String f36162g;

    /* JADX INFO: renamed from: h */
    private CopyOnWriteArrayList<CampaignEx> f36163h;

    /* JADX INFO: renamed from: i */
    private String f36164i;

    /* JADX INFO: renamed from: j */
    private int f36165j;

    /* JADX INFO: renamed from: k */
    private String f36166k;

    /* JADX INFO: renamed from: l */
    private String f36167l;

    /* JADX INFO: renamed from: m */
    private String f36168m;

    /* JADX INFO: renamed from: n */
    private String f36169n;

    /* JADX INFO: renamed from: o */
    private String f36170o;

    /* JADX INFO: renamed from: p */
    private String f36171p;

    /* JADX INFO: renamed from: q */
    private String f36172q;

    /* JADX INFO: renamed from: r */
    private String f36173r;

    /* JADX INFO: renamed from: s */
    private int f36174s;

    /* JADX INFO: renamed from: t */
    private int f36175t;

    /* JADX INFO: renamed from: u */
    private boolean f36176u;

    /* JADX INFO: renamed from: v */
    private boolean f36177v;

    /* JADX INFO: renamed from: w */
    private boolean f36178w;

    /* JADX INFO: renamed from: x */
    private boolean f36179x;

    /* JADX INFO: renamed from: y */
    private int f36180y;

    /* JADX INFO: renamed from: z */
    private int f36181z;

    public C13154c() {
        this.f36156a = false;
        this.f36157b = new HashMap();
        this.f36158c = new HashMap();
        this.f36159d = new HashMap();
        this.f36160e = new HashMap();
        this.f36162g = "";
        this.f36163h = new CopyOnWriteArrayList<>();
        this.f36174s = -1;
        this.f36176u = false;
        this.f36178w = false;
        this.f36155D = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: renamed from: A */
    public int m37412A() {
        return this.f36153B;
    }

    /* JADX INFO: renamed from: B */
    public String m37413B() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f36164i)) {
            return this.f36164i;
        }
        try {
            if (TextUtils.isEmpty(this.f36164i)) {
                String str = this.f36162g + this.f36173r;
                Map<String, Map<String, String>> map2 = this.f36157b;
                if (map2 != null && map2.containsKey(str) && (map = this.f36157b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f36164i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return this.f36164i;
    }

    /* JADX INFO: renamed from: C */
    public String m37414C() {
        return this.f36169n;
    }

    /* JADX INFO: renamed from: D */
    public boolean m37415D() {
        return this.f36176u;
    }

    /* JADX INFO: renamed from: E */
    public boolean m37416E() {
        return this.f36178w;
    }

    /* JADX INFO: renamed from: F */
    public boolean m37417F() {
        return this.f36177v;
    }

    /* JADX INFO: renamed from: G */
    public boolean m37418G() {
        return this.f36156a;
    }

    /* JADX INFO: renamed from: a */
    public void m37425a(boolean z) {
        this.f36176u = z;
    }

    /* JADX INFO: renamed from: b */
    public void m37429b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.f36155D.isEmpty()) {
                        this.f36155D.clear();
                    }
                    this.f36155D.addAll(list);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m37431c(String str) {
        C13082b c13082bM37464u;
        C13082b c13082bM37464u2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C13157e c13157e = new C13157e();
        try {
            this.f36173r = str;
            c13157e.m37501a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(m37413B())) {
                c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, m37413B());
            }
            if (this.f36165j != 0) {
                c13157e.m37501a("adtp", Integer.valueOf(m37441g()));
            }
            if (!TextUtils.isEmpty(m37462s())) {
                c13157e.m37501a(CampaignEx.JSON_KEY_HB, m37462s());
            }
            if (!TextUtils.isEmpty(m37451l())) {
                c13157e.m37501a("bid_tk", m37451l());
            }
            if (!TextUtils.isEmpty(str)) {
                c13157e.m37501a("key", str);
            }
            if (Arrays.asList(C13153b.f36137a).contains(str)) {
                c13157e.m37501a("from_cache", m37415D() ? "1" : "2");
            }
            if ("2000047".contains(str) && (c13082bM37464u2 = m37464u()) != null) {
                c13157e.m37501a("type", Integer.valueOf(c13082bM37464u2.m37028h()));
                c13157e.m37501a("reason", c13082bM37464u2.m37032l());
                if (!TextUtils.isEmpty(c13082bM37464u2.m37033m())) {
                    c13157e.m37501a("reason_d", c13082bM37464u2.m37033m());
                    c13157e.m37501a("type_d", Integer.valueOf(c13082bM37464u2.m37034n()));
                }
            }
            if ("2000048".contains(str) && (c13082bM37464u = m37464u()) != null && !TextUtils.isEmpty(c13082bM37464u.m37033m())) {
                c13157e.m37501a("type", Integer.valueOf(c13082bM37464u.m37034n()));
                c13157e.m37501a("reason", c13082bM37464u.m37033m());
            }
            if (this.f36165j == 296) {
                c13157e.m37501a("auto_load", m37447j());
                c13157e.m37501a("auto_refresh", Integer.valueOf(m37445i()));
                c13157e.m37501a("auto_refresh_interval", Integer.valueOf(m37449k()));
                c13157e.m37501a("content_type", Integer.valueOf(m37459p()));
                c13157e.m37501a("temp_display_type", Integer.valueOf(m37412A()));
            }
            m37411a(c13157e);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return c13157e.m37499a();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* JADX INFO: renamed from: d */
    public void m37435d(String str) {
        if (this.f36160e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f36160e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: e */
    public void m37437e(int i) {
        this.f36174s = i;
    }

    /* JADX INFO: renamed from: f */
    public void m37440f(String str) {
        this.f36172q = str;
    }

    /* JADX INFO: renamed from: g */
    public int m37441g() {
        return this.f36165j;
    }

    /* JADX INFO: renamed from: h */
    public void m37444h(String str) {
        this.f36171p = str;
    }

    /* JADX INFO: renamed from: i */
    public void m37446i(String str) {
        this.f36162g = str;
    }

    /* JADX INFO: renamed from: j */
    public void m37448j(String str) {
        this.f36173r = str;
    }

    /* JADX INFO: renamed from: k */
    public void m37450k(String str) {
        this.f36167l = str;
    }

    /* JADX INFO: renamed from: l */
    public String m37451l() {
        return this.f36166k;
    }

    /* JADX INFO: renamed from: m */
    public List<CampaignEx> m37453m() {
        return this.f36163h;
    }

    /* JADX INFO: renamed from: n */
    public CampaignEx m37455n() {
        return this.f36154C;
    }

    /* JADX INFO: renamed from: o */
    public List<CampaignEx> m37457o() {
        return this.f36155D;
    }

    /* JADX INFO: renamed from: p */
    public int m37459p() {
        return this.f36152A;
    }

    /* JADX INFO: renamed from: q */
    public int m37460q() {
        return this.f36174s;
    }

    /* JADX INFO: renamed from: r */
    public int m37461r() {
        return this.f36175t;
    }

    /* JADX INFO: renamed from: s */
    public String m37462s() {
        return this.f36171p;
    }

    /* JADX INFO: renamed from: t */
    public String m37463t() {
        return this.f36162g;
    }

    /* JADX INFO: renamed from: u */
    public C13082b m37464u() {
        return this.f36161f;
    }

    /* JADX INFO: renamed from: v */
    public Map<String, Map<String, String>> m37465v() {
        return this.f36159d;
    }

    /* JADX INFO: renamed from: w */
    public Map<String, Map<String, String>> m37466w() {
        return this.f36157b;
    }

    /* JADX INFO: renamed from: x */
    public String m37467x() {
        return this.f36167l;
    }

    /* JADX INFO: renamed from: y */
    public String m37468y() {
        return this.f36170o;
    }

    /* JADX INFO: renamed from: z */
    public String m37469z() {
        return this.f36168m;
    }

    /* JADX INFO: renamed from: a */
    public void m37424a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f36163h.isEmpty()) {
                    this.f36163h.clear();
                }
                this.f36163h.addAll(list);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m37438e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f36162g + str;
            Map<String, Map<String, String>> map = this.f36157b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f36157b.remove(str2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m37439f(int i) {
        this.f36175t = i;
    }

    /* JADX INFO: renamed from: g */
    public void m37443g(String str) {
        this.f36166k = str;
    }

    /* JADX INFO: renamed from: i */
    public int m37445i() {
        return this.f36180y;
    }

    /* JADX INFO: renamed from: j */
    public String m37447j() {
        return this.f36172q;
    }

    /* JADX INFO: renamed from: k */
    public int m37449k() {
        return this.f36181z;
    }

    /* JADX INFO: renamed from: l */
    public void m37452l(String str) {
        this.f36170o = str;
    }

    /* JADX INFO: renamed from: m */
    public void m37454m(String str) {
        this.f36168m = str;
    }

    /* JADX INFO: renamed from: n */
    public void m37456n(String str) {
        this.f36164i = str;
    }

    /* JADX INFO: renamed from: o */
    public void m37458o(String str) {
        this.f36169n = str;
    }

    /* JADX INFO: renamed from: d */
    public void m37436d(boolean z) {
        this.f36179x = z;
    }

    /* JADX INFO: renamed from: g */
    public void m37442g(int i) {
        this.f36153B = i;
    }

    /* JADX INFO: renamed from: d */
    public void m37434d(int i) {
        this.f36152A = i;
    }

    /* JADX INFO: renamed from: b */
    public void m37428b(String str, C13157e c13157e) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || c13157e == null) {
            return;
        }
        try {
            String str2 = this.f36162g + str;
            Map<String, Map<String, String>> map2 = this.f36158c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f36158c.get(str2)) != null) {
                    map.putAll(c13157e.m37499a());
                } else {
                    this.f36158c.put(str2, c13157e.m37499a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37421a(CampaignEx campaignEx) {
        this.f36154C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f36155D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                for (int i = 0; i < this.f36155D.size(); i++) {
                    if (this.f36155D.get(i) != null && this.f36155D.get(i).getId().equals(campaignEx.getId())) {
                        this.f36155D.set(i, campaignEx);
                        break;
                    }
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f36163h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i2 = 0; i2 < this.f36163h.size(); i2++) {
                if (this.f36163h.get(i2) != null && this.f36163h.get(i2).getId().equals(campaignEx.getId())) {
                    this.f36163h.set(i2, campaignEx);
                    return;
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public long m37426b(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f36160e) != null && map.containsKey(str)) {
                Long l = this.f36160e.get(str);
                return System.currentTimeMillis() - (l != null ? l.longValue() : 0L);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public void m37420a(int i) {
        this.f36165j = i;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m37419a(String str) {
        return this.f36158c.containsKey(str) ? this.f36158c.remove(str) : new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public void m37430b(boolean z) {
        this.f36178w = z;
    }

    /* JADX INFO: renamed from: b */
    public void m37427b(int i) {
        this.f36180y = i;
    }

    /* JADX INFO: renamed from: a */
    public void m37423a(String str, C13157e c13157e) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || c13157e == null) {
            return;
        }
        try {
            String str2 = this.f36162g + str;
            Map<String, Map<String, String>> map2 = this.f36157b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f36157b.get(str2)) != null) {
                    map.putAll(c13157e.m37499a());
                } else {
                    this.f36157b.put(str2, c13157e.m37499a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m37411a(C13157e c13157e) {
        if ("2000126".equals(this.f36173r)) {
            String strM37193a = C13111d.m37193a(m37451l());
            if (c13157e != null) {
                c13157e.m37501a("dns_ty", Integer.valueOf(C13633e.m39694a().m39695a(strM37193a)));
                c13157e.m37501a("dns_hs", strM37193a);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m37433c(boolean z) {
        this.f36177v = z;
    }

    /* JADX INFO: renamed from: c */
    public void m37432c(int i) {
        this.f36181z = i;
    }

    /* JADX INFO: renamed from: a */
    public void m37422a(C13082b c13082b) {
        this.f36161f = c13082b;
    }

    public C13154c(boolean z) {
        this.f36156a = false;
        this.f36157b = new HashMap();
        this.f36158c = new HashMap();
        this.f36159d = new HashMap();
        this.f36160e = new HashMap();
        this.f36162g = "";
        this.f36163h = new CopyOnWriteArrayList<>();
        this.f36174s = -1;
        this.f36176u = false;
        this.f36178w = false;
        this.f36155D = new CopyOnWriteArrayList<>();
        this.f36156a = z;
    }
}
