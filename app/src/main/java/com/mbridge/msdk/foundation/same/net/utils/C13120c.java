package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.c */
/* JADX INFO: compiled from: RequestControlUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13120c {

    /* JADX INFO: renamed from: a */
    private final String f35984a;

    /* JADX INFO: renamed from: b */
    private int f35985b;

    /* JADX INFO: renamed from: c */
    private ConcurrentHashMap<String, b> f35986c;

    /* JADX INFO: renamed from: d */
    private ArrayList<Integer> f35987d;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.c$b */
    /* JADX INFO: compiled from: RequestControlUtil.java */
    private static class b {

        /* JADX INFO: renamed from: a */
        public int f35988a;

        /* JADX INFO: renamed from: b */
        public String f35989b;

        /* JADX INFO: renamed from: c */
        public long f35990c;

        public b(long j, int i, String str) {
            this.f35990c = j;
            this.f35988a = i;
            this.f35989b = str;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.c$c */
    /* JADX INFO: compiled from: RequestControlUtil.java */
    private static class c {

        /* JADX INFO: renamed from: a */
        private static final C13120c f35991a = new C13120c();
    }

    /* JADX INFO: renamed from: a */
    private List<Integer> m37213a() {
        return Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616);
    }

    /* JADX INFO: renamed from: b */
    public static C13120c m37214b() {
        return c.f35991a;
    }

    private C13120c() {
        this.f35984a = "IDErrorUtil";
        this.f35986c = new ConcurrentHashMap<>();
        this.f35987d = new ArrayList<>();
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        c13635gM39718d = c13635gM39718d == null ? C13636h.m39706b().m39708a() : c13635gM39718d;
        this.f35985b = c13635gM39718d.m39567u() * 1000;
        if (c13635gM39718d.m39583y() == null || c13635gM39718d.m39583y().size() <= 0) {
            C13219q0.m37816b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.f35987d.addAll(m37213a());
        } else {
            C13219q0.m37816b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.f35987d.addAll(c13635gM39718d.m39583y());
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m37216a(String str, int i, String str2, long j) {
        if (this.f35986c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f35987d.contains(Integer.valueOf(i))) {
            C13219q0.m37816b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.f35986c.put(str, new b(j, i, str2));
        }
    }

    /* JADX INFO: renamed from: a */
    public C13112e m37215a(C13126e c13126e) {
        String str = c13126e.m37243a().get("app_id");
        String str2 = c13126e.m37243a().get("placement_id");
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String strReplace = c13126e.m37243a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = c13126e.m37243a().get("unit_ids");
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace(C11744X3.j.f26438d, "").replace(C11744X3.j.f26440e, "");
            }
        }
        String str4 = strReplace;
        String str5 = c13126e.m37243a().get("ad_type");
        if (TextUtils.isEmpty(str5)) {
            str5 = "0";
        }
        return m37211a(str, str4, str3, c13126e.m37243a().get("token"), str5);
    }

    /* JADX INFO: renamed from: a */
    private C13112e m37211a(String str, String str2, String str3, String str4, String str5) {
        int i;
        String str6 = str + "_" + str3 + "_" + str2 + "_" + str5;
        b bVarM37212a = m37212a(str6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13837g("data_res_type", "1"));
        if (bVarM37212a != null && !TextUtils.isEmpty(bVarM37212a.f35989b)) {
            try {
                if (bVarM37212a.f35988a != -1) {
                    return C13112e.m37195a(new JSONObject(bVarM37212a.f35989b), new C13117a(200, bVarM37212a.f35989b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (i = Integer.parseInt(str5)) != 287 && i != 94) {
                    if (System.currentTimeMillis() < ((long) (C13636h.m39706b().m39716c(str, str2).m39670u() * 1000)) + bVarM37212a.f35990c) {
                        return C13112e.m37195a(new JSONObject(bVarM37212a.f35989b), new C13117a(200, bVarM37212a.f35989b.getBytes(), arrayList));
                    }
                    this.f35986c.remove(str6);
                    return null;
                }
            } catch (Exception e) {
                C13219q0.m37816b("IDErrorUtil", e.getMessage());
            }
        }
        C13219q0.m37816b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    /* JADX INFO: renamed from: a */
    private synchronized b m37212a(String str) {
        b bVar;
        C13219q0.m37816b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.f35986c.containsKey(str) || (bVar = this.f35986c.get(str)) == null) {
            return null;
        }
        if (bVar.f35988a == -1) {
            return bVar;
        }
        if (System.currentTimeMillis() > bVar.f35990c + ((long) this.f35985b)) {
            this.f35986c.remove(str);
            if (this.f35986c.size() > 0) {
                for (Map.Entry<String, b> entry : this.f35986c.entrySet()) {
                    C13219q0.m37816b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().f35990c > this.f35985b) {
                        this.f35986c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        C13219q0.m37816b("IDErrorUtil", "getErrorInfo : " + bVar.f35989b);
        return bVar;
    }
}
