package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1765d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.d8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1534d8 {

    /* JADX INFO: renamed from: a */
    private static final DateFormat f1387a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* JADX INFO: renamed from: b */
    private static final Random f1388b = new Random(System.currentTimeMillis());

    /* JADX INFO: renamed from: a */
    public static Uri m2429a(String str, long j, Uri uri, EnumC1807w7 enumC1807w7, C1748l c1748l) {
        if (!URLUtil.isValidUrl(str)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("VastUtils", "Unable to replace macros in invalid URL string.");
            }
            return null;
        }
        try {
            String string = Integer.toString(enumC1807w7.m5555b());
            String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
            if (j >= 0) {
                strReplace = strReplace.replace("[CONTENTPLAYHEAD]", m2431a(j));
            }
            if (uri != null) {
                strReplace = strReplace.replace("[ASSETURI]", uri.toString());
            }
            return Uri.parse(strReplace.replace("[CACHEBUSTING]", m2430a()).replace("[TIMESTAMP]", m2444b()));
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("VastUtils", "Unable to replace macros in URL string " + str, th);
            }
            c1748l.m4764E().m4333a("VastUtils", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m2430a() {
        return Integer.toString(f1388b.nextInt(89999999) + 10000000);
    }

    /* JADX INFO: renamed from: a */
    private static String m2431a(long j) {
        if (j <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j);
        long minutes = timeUnit.toMinutes(j);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j % timeUnit2.toSeconds(1L)));
    }

    /* JADX INFO: renamed from: a */
    public static String m2432a(C1702q8 c1702q8, String str, String str2) {
        C1702q8 c1702q8M4126c = c1702q8.m4126c(str);
        if (c1702q8M4126c != null) {
            String strM4128d = c1702q8M4126c.m4128d();
            if (StringUtils.isValidString(strM4128d)) {
                return strM4128d;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public static String m2433a(AbstractC1798v7 abstractC1798v7) {
        C1702q8 c1702q8M4124b;
        if (abstractC1798v7 == null) {
            throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
        }
        List listM5482a = abstractC1798v7.m5482a();
        int size = abstractC1798v7.m5482a().size();
        if (size <= 0 || (c1702q8M4124b = ((C1702q8) listM5482a.get(size - 1)).m4124b("VASTAdTagURI")) == null) {
            return null;
        }
        return c1702q8M4124b.m4128d();
    }

    /* JADX INFO: renamed from: a */
    private static HashSet m2434a(HashSet hashSet, List list, AbstractC1798v7 abstractC1798v7, C1748l c1748l) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1514b8 c1514b8M2137a = C1514b8.m2137a((C1702q8) it.next(), abstractC1798v7, c1748l);
                if (c1514b8M2137a != null) {
                    hashSet.add(c1514b8M2137a);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    private static Set m2435a(AbstractC1798v7 abstractC1798v7, C1748l c1748l) {
        if (abstractC1798v7 == null) {
            return null;
        }
        List<C1702q8> listM5482a = abstractC1798v7.m5482a();
        HashSet hashSet = new HashSet(listM5482a.size());
        for (C1702q8 c1702q8 : listM5482a) {
            C1702q8 c1702q8M4124b = c1702q8.m4124b("Wrapper");
            if (c1702q8M4124b == null) {
                c1702q8M4124b = c1702q8.m4124b("InLine");
            }
            hashSet = m2434a(hashSet, c1702q8M4124b != null ? c1702q8M4124b.m4122a("Error") : c1702q8.m4122a("Error"), abstractC1798v7, c1748l);
        }
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5171a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public static void m2436a(C1702q8 c1702q8, Map map, AbstractC1798v7 abstractC1798v7, C1748l c1748l) {
        List<C1702q8> listM4122a;
        if (c1748l == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (c1702q8 == null) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        C1702q8 c1702q8M4126c = c1702q8.m4126c("TrackingEvents");
        if (c1702q8M4126c == null || (listM4122a = c1702q8M4126c.m4122a("Tracking")) == null) {
            return;
        }
        for (C1702q8 c1702q9 : listM4122a) {
            String str = (String) c1702q9.m4123a().get(NotificationCompat.CATEGORY_EVENT);
            if (StringUtils.isValidString(str)) {
                C1514b8 c1514b8M2137a = C1514b8.m2137a(c1702q9, abstractC1798v7, c1748l);
                if (c1514b8M2137a != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(c1514b8M2137a);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(c1514b8M2137a);
                        map.put(str, hashSet);
                    }
                }
            } else {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5174b("VastUtils", "Could not find event for tracking node = " + c1702q9);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2437a(AbstractC1798v7 abstractC1798v7, AppLovinAdLoadListener appLovinAdLoadListener, EnumC1807w7 enumC1807w7, int i, C1748l c1748l) {
        if (c1748l == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
        Set setM2435a = m2435a(abstractC1798v7, c1748l);
        if (CollectionUtils.isEmpty(setM2435a)) {
            return;
        }
        m2441a(setM2435a, enumC1807w7, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static void m2438a(List list, Set set, AbstractC1798v7 abstractC1798v7, C1748l c1748l) {
        if (c1748l == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1514b8 c1514b8M2137a = C1514b8.m2137a((C1702q8) it.next(), abstractC1798v7, c1748l);
            if (c1514b8M2137a != null) {
                set.add(c1514b8M2137a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2439a(Set set, long j, Uri uri, EnumC1807w7 enumC1807w7, C1748l c1748l) {
        if (c1748l == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        }
        if (set == null || set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1514b8 c1514b8 = (C1514b8) it.next();
            long j2 = j;
            Uri uri2 = uri;
            EnumC1807w7 enumC1807w8 = enumC1807w7;
            C1748l c1748l2 = c1748l;
            Uri uriM2429a = m2429a(c1514b8.m2141c(), j2, uri2, enumC1807w8, c1748l2);
            if (uriM2429a != null) {
                c1748l2.m4833h0().m5069a(C1765d.m5076b().m5116d(uriM2429a.toString()).m5108a(false).m5112b(c1514b8.m2142d()).m5109a(), false);
            }
            j = j2;
            uri = uri2;
            enumC1807w7 = enumC1807w8;
            c1748l = c1748l2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2440a(Set set, C1748l c1748l) {
        m2439a(set, -1L, (Uri) null, EnumC1807w7.UNSPECIFIED, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static void m2441a(Set set, EnumC1807w7 enumC1807w7, C1748l c1748l) {
        m2439a(set, -1L, (Uri) null, enumC1807w7, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2442a(C1702q8 c1702q8) {
        if (c1702q8 != null) {
            return c1702q8.m4124b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2443a(C1711r7 c1711r7) {
        C1789u7 c1789u7M4228a1;
        C1834z7 c1834z7M5318e;
        if (c1711r7 == null || (c1789u7M4228a1 = c1711r7.m4228a1()) == null || (c1834z7M5318e = c1789u7M4228a1.m5318e()) == null) {
            return false;
        }
        return c1834z7M5318e.m5761c() != null || StringUtils.isValidString(c1834z7M5318e.m5760b());
    }

    /* JADX INFO: renamed from: b */
    private static String m2444b() {
        DateFormat dateFormat = f1387a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2445b(C1702q8 c1702q8) {
        if (c1702q8 != null) {
            return c1702q8.m4124b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2446b(C1711r7 c1711r7) {
        C1544e8 c1544e8M4236j1;
        List listM2522g;
        return (c1711r7 == null || (c1544e8M4236j1 = c1711r7.m4236j1()) == null || (listM2522g = c1544e8M4236j1.m2522g()) == null || listM2522g.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC1807w7 m2447c(C1711r7 c1711r7) {
        if (m2446b(c1711r7) || m2443a(c1711r7)) {
            return null;
        }
        return EnumC1807w7.GENERAL_WRAPPER_ERROR;
    }
}
