package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.e4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1540e4 {

    /* JADX INFO: renamed from: a */
    private final String f1417a;

    /* JADX INFO: renamed from: b */
    private final List f1418b;

    /* JADX INFO: renamed from: c */
    private final int f1419c;

    /* JADX INFO: renamed from: d */
    private Long f1420d;

    /* JADX INFO: renamed from: e */
    private final Map f1421e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final Deque f1422f = new ArrayDeque();

    public C1540e4(C1748l c1748l) {
        this.f1417a = (String) c1748l.m4801a(C1831z4.f4087y4);
        this.f1418b = c1748l.m4821c(C1831z4.f4095z4);
        this.f1419c = ((Integer) c1748l.m4801a(C1831z4.f3675A4)).intValue();
    }

    /* JADX INFO: renamed from: a */
    private void m2487a(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f1421e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f1421e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    public Long m2488a() {
        return this.f1420d;
    }

    /* JADX INFO: renamed from: a */
    public void m2489a(String str) {
        if (TextUtils.isEmpty(str) || this.f1419c <= 0) {
            return;
        }
        Map map = (Map) this.f1421e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                Iterator it = list.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / ((long) list.size())));
            }
        }
        if (this.f1422f.size() == this.f1419c) {
            this.f1422f.pollLast();
        }
        this.f1422f.addFirst(map2);
    }

    /* JADX INFO: renamed from: b */
    public Deque m2490b() {
        return this.f1422f;
    }

    /* JADX INFO: renamed from: b */
    public void m2491b(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f1418b) && this.f1419c > 0) {
            for (String str3 : this.f1418b) {
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    m2487a(j, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f1417a) && str.endsWith(this.f1417a)) {
            this.f1420d = Long.valueOf(j);
        }
    }
}
