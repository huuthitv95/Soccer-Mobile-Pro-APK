package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.applovin.impl.d0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1526d0 extends AbstractCallableC1516c0 {

    /* JADX INFO: renamed from: f */
    private final String f1307f;

    /* JADX INFO: renamed from: g */
    private final AbstractC1736b f1308g;

    /* JADX INFO: renamed from: h */
    private final List f1309h;

    /* JADX INFO: renamed from: i */
    private final c f1310i;

    /* JADX INFO: renamed from: j */
    private StringBuffer f1311j;

    /* JADX INFO: renamed from: k */
    private final Object f1312k;

    /* JADX INFO: renamed from: l */
    private final ExecutorService f1313l;

    /* JADX INFO: renamed from: m */
    private final String f1314m;

    /* JADX INFO: renamed from: n */
    private List f1315n;

    /* JADX INFO: renamed from: o */
    private List f1316o;

    /* JADX INFO: renamed from: com.applovin.impl.d0$a */
    class a implements C1536e0.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f1317a;

        a(String str) {
            this.f1317a = str;
        }

        @Override // com.applovin.impl.C1536e0.a
        /* JADX INFO: renamed from: a */
        public void mo2339a(Uri uri) {
            if (uri != null) {
                if (((Boolean) C1526d0.this.f1226a.m4801a(C1831z4.f3831U0)).booleanValue()) {
                    synchronized (C1526d0.this.f1312k) {
                        StringUtils.replaceAll(C1526d0.this.f1311j, this.f1317a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(C1526d0.this.f1311j, this.f1317a, uri.toString());
                }
                C1526d0.this.f1308g.m4523a(uri.toString(), this.f1317a);
                return;
            }
            C1768p c1768p = C1526d0.this.f1228c;
            if (C1768p.m5160a()) {
                C1526d0 c1526d0 = C1526d0.this;
                c1526d0.f1228c.m5171a(c1526d0.f1227b, "Failed to cache JavaScript resource " + this.f1317a);
            }
            if (C1526d0.this.f1310i != null) {
                C1526d0.this.f1310i.mo2340a(C1526d0.this.f1307f, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.d0$b */
    class b implements C1536e0.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f1319a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f1320b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f1321c;

        b(String str, String str2, String str3) {
            this.f1319a = str;
            this.f1320b = str2;
            this.f1321c = str3;
        }

        @Override // com.applovin.impl.C1536e0.a
        /* JADX INFO: renamed from: a */
        public void mo2339a(Uri uri) {
            if (uri != null) {
                if (((Boolean) C1526d0.this.f1226a.m4801a(C1831z4.f3831U0)).booleanValue()) {
                    synchronized (C1526d0.this.f1312k) {
                        StringUtils.replaceAll(C1526d0.this.f1311j, this.f1319a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(C1526d0.this.f1311j, this.f1319a, uri.toString());
                }
                C1526d0.this.f1308g.m4523a(uri.toString(), this.f1319a);
                return;
            }
            if (!C1526d0.this.f1308g.m4501Q().contains(this.f1320b + this.f1321c) || C1526d0.this.f1310i == null) {
                return;
            }
            C1526d0.this.f1310i.mo2340a(C1526d0.this.f1307f, true);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.d0$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo2340a(String str, boolean z);
    }

    public C1526d0(String str, AbstractC1736b abstractC1736b, List list, ExecutorService executorService, String str2, C1748l c1748l, c cVar) {
        super("AsyncTaskCacheHTMLResources", c1748l);
        this.f1307f = str;
        this.f1308g = abstractC1736b;
        this.f1309h = list;
        this.f1313l = executorService;
        this.f1314m = str2;
        this.f1310i = cVar;
        this.f1311j = new StringBuffer(str);
        this.f1312k = new Object();
    }

    /* JADX INFO: renamed from: a */
    private void m2328a(String str) {
        c cVar;
        if (this.f1230e.get() || (cVar = this.f1310i) == null) {
            return;
        }
        cVar.mo2340a(str, false);
    }

    /* JADX INFO: renamed from: a */
    private void m2329a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f1313l.submit((C1536e0) it.next()));
        }
        this.f1316o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private HashSet m2333d() {
        HashSet hashSet = new HashSet();
        List listM4484H = this.f1308g.m4484H();
        Collection collectionM2336f = m2336f();
        for (String str : this.f1309h) {
            int iIndexOf = 0;
            int i = 0;
            while (iIndexOf < this.f1307f.length()) {
                if (this.f1230e.get()) {
                    return null;
                }
                iIndexOf = this.f1307f.indexOf(str, i);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f1307f.length();
                int i2 = iIndexOf;
                while (!collectionM2336f.contains(Character.valueOf(this.f1307f.charAt(i2))) && i2 < length) {
                    i2++;
                }
                if (i2 <= iIndexOf || i2 == length) {
                    if (C1768p.m5160a()) {
                        this.f1228c.m5174b(this.f1227b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String strSubstring = this.f1307f.substring(str.length() + iIndexOf, i2);
                String str2 = str + strSubstring;
                if (StringUtils.isValidString(strSubstring) && !listM4484H.contains(str2)) {
                    hashSet.add(new C1536e0(str2, this.f1308g, Arrays.asList(str), true, this.f1314m, this.f1226a, new b(str2, str, strSubstring)));
                } else if (C1768p.m5160a()) {
                    this.f1228c.m5171a(this.f1227b, "Skip caching of optional or non-resource " + strSubstring);
                }
                i = i2;
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: e */
    private HashSet m2335e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f1307f, (String) this.f1226a.m4801a(C1831z4.f3972k5)), 1)) {
            if (this.f1230e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new C1536e0(str, this.f1308g, Collections.EMPTY_LIST, false, this.f1314m, this.f1226a, new a(str)));
            } else if (C1768p.m5160a()) {
                this.f1228c.m5171a(this.f1227b, "Skip caching of non-resource " + str);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    private Collection m2336f() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f1226a.m4801a(C1831z4.f3703E0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetM2335e;
        if (this.f1230e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f1307f)) {
            m2328a(this.f1307f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f1226a.m4801a(C1831z4.f3711F0)).booleanValue()) {
            if (C1768p.m5160a()) {
                this.f1228c.m5171a(this.f1227b, "Resource caching is disabled, skipping cache...");
            }
            m2328a(this.f1307f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetM2333d = m2333d();
        if (hashSetM2333d != null) {
            hashSet.addAll(hashSetM2333d);
        }
        if (((Boolean) this.f1226a.m4801a(C1831z4.f3963j5)).booleanValue() && (hashSetM2335e = m2335e()) != null) {
            hashSet.addAll(hashSetM2335e);
        }
        this.f1315n = new ArrayList(hashSet);
        if (this.f1230e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f1315n;
        if (list == null || list.isEmpty()) {
            m2328a(this.f1307f);
            return Boolean.FALSE;
        }
        if (C1768p.m5160a()) {
            this.f1228c.m5171a(this.f1227b, "Executing " + this.f1315n.size() + " caching operations...");
        }
        if (this.f1226a.m4853s0().m2613e()) {
            m2329a(this.f1315n);
        } else {
            this.f1313l.invokeAll(this.f1315n);
        }
        if (((Boolean) this.f1226a.m4801a(C1831z4.f3831U0)).booleanValue()) {
            synchronized (this.f1312k) {
                m2328a(this.f1311j.toString());
            }
        } else {
            m2328a(this.f1311j.toString());
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c */
    public void m2338c() {
        List list = this.f1315n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1536e0) it.next()).m2148a(true);
            }
        }
        List<Future> list2 = this.f1316o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }
}
