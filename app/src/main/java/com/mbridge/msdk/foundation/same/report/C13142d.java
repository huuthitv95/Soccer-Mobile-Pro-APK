package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.tracker.C13814a;
import com.mbridge.msdk.tracker.C13818e;
import com.mbridge.msdk.tracker.C13822i;
import com.mbridge.msdk.tracker.C13826m;
import com.mbridge.msdk.tracker.InterfaceC13817d;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.d */
/* JADX INFO: compiled from: EventLibraryDecorate.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13142d implements InterfaceC13817d {
    /* JADX INFO: renamed from: a */
    private static void m37326a(Map<String, String> map, StringBuilder sb) {
    }

    /* JADX INFO: renamed from: b */
    static String m37327b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            i++;
            if (i <= jSONObject.length() - 1) {
                sb.append(next);
                sb.append(C11744X3.j.f26434b);
                sb.append(m37323a(String.valueOf(jSONObject.opt(next))));
                sb.append(C11744X3.j.f26436c);
            } else {
                sb.append(next);
                sb.append(C11744X3.j.f26434b);
                sb.append(m37323a(String.valueOf(jSONObject.opt(next))));
            }
        }
        return sb.toString();
    }

    @Override // com.mbridge.msdk.tracker.InterfaceC13817d
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo37328a(C13826m c13826m, List<C13822i> list, JSONObject jSONObject) {
        StringBuilder sbM37324a;
        Map<String, String> mapM37325a;
        if (list != null && !list.isEmpty()) {
            try {
                C13134c.m37279a(jSONObject);
                mapM37325a = m37325a(jSONObject);
                if (mapM37325a == null) {
                    try {
                        mapM37325a = new HashMap();
                    } catch (Exception unused) {
                        sbM37324a = null;
                        m37326a(mapM37325a, sbM37324a);
                        return null;
                    } catch (Throwable unused2) {
                        sbM37324a = null;
                        m37326a(mapM37325a, sbM37324a);
                        return null;
                    }
                }
                sbM37324a = m37324a(list);
                try {
                    mapM37325a.put("tun", String.valueOf(C13211m0.m37717B()));
                    mapM37325a.put("data", sbM37324a.toString());
                    return mapM37325a;
                } catch (Exception unused3) {
                    m37326a(mapM37325a, sbM37324a);
                    return null;
                } catch (Throwable unused4) {
                    m37326a(mapM37325a, sbM37324a);
                    return null;
                }
            } catch (Exception unused5) {
                sbM37324a = null;
                mapM37325a = null;
            } catch (Throwable unused6) {
                sbM37324a = null;
                mapM37325a = null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    static Map<String, String> m37325a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static StringBuilder m37324a(List<C13822i> list) {
        C13818e c13818eM41031d;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            C13822i c13822i = list.get(i);
            if (c13822i != null && (c13818eM41031d = c13822i.m41031d()) != null) {
                JSONObject jSONObjectM41014i = c13818eM41031d.m41014i();
                C13134c.m37279a(jSONObjectM41014i);
                if (jSONObjectM41014i == null) {
                    jSONObjectM41014i = new JSONObject();
                }
                try {
                    try {
                        jSONObjectM41014i.put("ts", c13818eM41031d.m41017l());
                        jSONObjectM41014i.put("rts", System.currentTimeMillis());
                        String strM41034i = c13822i.m41034i();
                        if (!TextUtils.isEmpty(strM41034i)) {
                            jSONObjectM41014i.put("reason_lib", strM41034i);
                        }
                        int iM41033h = c13822i.m41033h() - 1;
                        if (iM41033h >= 1) {
                            jSONObjectM41014i.put("retryed", iM41033h);
                        }
                        long jM41011d = c13818eM41031d.m41011d();
                        if (jM41011d > 0) {
                            jSONObjectM41014i.put("duration", jM41011d);
                        }
                    } catch (Exception e) {
                        if (C13814a.f39370a) {
                            Log.e("TrackManager", "decorateRequestParams: ", e);
                        }
                    }
                    sb.append(m37327b(jSONObjectM41014i));
                    if (i < list.size() - 1) {
                        sb.append("\n");
                    }
                } catch (Throwable th) {
                    sb.append(m37327b(jSONObjectM41014i));
                    throw th;
                }
            }
        }
        return sb;
    }

    /* JADX INFO: renamed from: a */
    private static String m37323a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, C11341A5.f23802O);
        } catch (Exception unused) {
            return str;
        }
    }
}
