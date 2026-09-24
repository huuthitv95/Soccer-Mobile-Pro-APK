package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.b0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1506b0 implements C1805w5.b, C1787u5.b {

    /* JADX INFO: renamed from: a */
    private final C1748l f1128a;

    /* JADX INFO: renamed from: b */
    private final a f1129b;

    /* JADX INFO: renamed from: c */
    private C1826z f1130c;

    /* JADX INFO: renamed from: d */
    private String f1131d;

    /* JADX INFO: renamed from: com.applovin.impl.b0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2061a(b bVar, String str);

        /* JADX INFO: renamed from: a */
        void mo2062a(C1826z c1826z, String str);
    }

    /* JADX INFO: renamed from: com.applovin.impl.b0$b */
    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public C1506b0(C1748l c1748l, a aVar) {
        this.f1128a = c1748l;
        this.f1129b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static List m2055a(C1826z c1826z, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1479a0 c1479a0 = (C1479a0) it.next();
            List list2 = (List) c1826z.m5728a().get(c1479a0.m1764b());
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!((C1479a0) it2.next()).m1762a(c1479a0));
            }
            arrayList.add(c1479a0);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m2056a() {
        C1826z c1826z = this.f1130c;
        if (c1826z != null) {
            this.f1129b.mo2062a(c1826z, this.f1131d);
        } else {
            this.f1128a.m4853s0().m2603a(new C1805w5(this.f1128a, this));
        }
    }

    @Override // com.applovin.impl.C1805w5.b
    /* JADX INFO: renamed from: a */
    public void mo2057a(b bVar) {
        this.f1129b.mo2061a(bVar, (String) null);
    }

    @Override // com.applovin.impl.C1787u5.b
    /* JADX INFO: renamed from: a */
    public void mo2058a(b bVar, String str) {
        this.f1129b.mo2061a(bVar, str);
    }

    @Override // com.applovin.impl.C1805w5.b
    /* JADX INFO: renamed from: a */
    public void mo2059a(String str) {
        this.f1128a.m4853s0().m2603a(new C1787u5(this.f1128a, str, this));
    }

    @Override // com.applovin.impl.C1787u5.b
    /* JADX INFO: renamed from: a */
    public void mo2060a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        for (String str3 : str.split("\n")) {
            String strTrim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(strTrim)) {
                C1479a0 c1479a0 = new C1479a0(strTrim, i);
                if (c1479a0.m1770h()) {
                    String strM1764b = c1479a0.m1764b();
                    List arrayList2 = map.containsKey(strM1764b) ? (List) map.get(strM1764b) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(c1479a0);
                        map.put(strM1764b, arrayList2);
                    }
                } else {
                    arrayList.add(c1479a0);
                }
            }
            i++;
        }
        this.f1130c = new C1826z(map, arrayList);
        this.f1131d = str2;
        this.f1128a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1128a.m4782Q().m5171a("AppAdsTxtService", "app-ads.txt fetched: " + this.f1130c);
        }
        this.f1129b.mo2062a(this.f1130c, str2);
    }
}
