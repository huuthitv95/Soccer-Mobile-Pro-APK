package com.mbridge.msdk.tracker.network.toolbox;

import com.google.android.exoplayer2.C9415C;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import com.ironsource.C11794a2;
import com.mbridge.msdk.tracker.network.C13833c0;
import com.mbridge.msdk.tracker.network.C13837g;
import com.mbridge.msdk.tracker.network.C13847q;
import com.mbridge.msdk.tracker.network.InterfaceC13830b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.f */
/* JADX INFO: compiled from: HttpHeaderParser.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13856f {
    /* JADX INFO: renamed from: a */
    public static InterfaceC13830b.a m41264a(C13847q c13847q) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c13847q.f39516c;
        if (map == null) {
            return null;
        }
        String str = map.get(HttpHeaders.DATE);
        long jM41271b = str != null ? m41271b(str) : 0L;
        String str2 = map.get(HttpHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get(HttpHeaders.EXPIRES);
        long jM41271b2 = str3 != null ? m41271b(str3) : j;
        String str4 = map.get(HttpHeaders.LAST_MODIFIED);
        long jM41271b3 = str4 != null ? m41271b(str4) : j;
        String str5 = map.get("ETag");
        if (i != 0) {
            j5 = jCurrentTimeMillis + (j2 * 1000);
            if (z) {
                j4 = j5;
            } else {
                Long.signum(j3);
                j4 = j5 + (j3 * 1000);
            }
        } else {
            j4 = (jM41271b <= j || jM41271b2 < jM41271b) ? j : jCurrentTimeMillis + (jM41271b2 - jM41271b);
            j5 = j4;
        }
        InterfaceC13830b.a aVar = new InterfaceC13830b.a();
        aVar.f39426a = c13847q.f39515b;
        aVar.f39427b = str5;
        aVar.f39431f = j5;
        aVar.f39430e = j4;
        aVar.f39428c = jM41271b;
        aVar.f39429d = jM41271b3;
        aVar.f39432g = map;
        aVar.f39433h = c13847q.f39517d;
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    static String m41265a(long j) {
        return m41268a("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* JADX INFO: renamed from: a */
    public static String m41266a(Map<String, String> map) {
        return m41267a(map, C9415C.ISO88591_NAME);
    }

    /* JADX INFO: renamed from: a */
    public static String m41267a(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split(C11744X3.j.f26434b, 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals(C11341A5.f23801N)) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static SimpleDateFormat m41268a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: a */
    static List<C13837g> m41269a(List<C13837g> list, InterfaceC13830b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<C13837g> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().m41105a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<C13837g> list2 = aVar.f39433h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (C13837g c13837g : aVar.f39433h) {
                    if (!treeSet.contains(c13837g.m41105a())) {
                        arrayList.add(c13837g);
                    }
                }
            }
        } else if (!aVar.f39432g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f39432g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C13837g(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    static Map<String, String> m41270a(InterfaceC13830b.a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = aVar.f39427b;
        if (str != null) {
            map.put(HttpHeaders.IF_NONE_MATCH, str);
        }
        long j = aVar.f39429d;
        if (j > 0) {
            map.put(HttpHeaders.IF_MODIFIED_SINCE, m41265a(j));
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static long m41271b(String str) {
        try {
            Date date = m41268a("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException e) {
            if ("0".equals(str) || C11794a2.f26725f.equals(str)) {
                C13833c0.m41097d("Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                C13833c0.m41094a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }
}
