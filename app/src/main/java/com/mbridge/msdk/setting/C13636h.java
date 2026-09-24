package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.manager.C12907a;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.tools.C13199g0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.h */
/* JADX INFO: compiled from: SettingManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13636h {

    /* JADX INFO: renamed from: a */
    public static final String f38099a = "h";

    /* JADX INFO: renamed from: b */
    private static volatile C13636h f38100b;

    /* JADX INFO: renamed from: c */
    private static volatile C13635g f38101c;

    /* JADX INFO: renamed from: d */
    private static HashMap<String, C13640l> f38102d = new HashMap<>();

    private C13636h() {
    }

    /* JADX INFO: renamed from: a */
    public static void m39705a(Context context, String str) {
        FastKV fastKVBuild;
        Map<String, Object> all = null;
        if (C13009d.m36589a().m36605e()) {
            try {
                fastKVBuild = new FastKV.Builder(C13098e.m37149b(EnumC13096c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                fastKVBuild = null;
            }
        } else {
            fastKVBuild = null;
        }
        if (fastKVBuild == null) {
            try {
                Map<String, ?> all2 = context.getSharedPreferences("mbridge", 0).getAll();
                for (String str2 : all2.keySet()) {
                    if (str2.startsWith(str + "_")) {
                        f38102d.put(str2, C13640l.m39756l((String) all2.get(str2)));
                    }
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            all = fastKVBuild.getAll();
        } catch (Exception unused2) {
        }
        if (all != null) {
            try {
                for (String str3 : all.keySet()) {
                    if (str3.startsWith(str + "_")) {
                        f38102d.put(str3, C13640l.m39756l((String) all.get(str3)));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C13636h m39706b() {
        if (f38100b == null) {
            synchronized (C13636h.class) {
                if (f38100b == null) {
                    f38100b = new C13636h();
                }
            }
        }
        return f38100b;
    }

    /* JADX INFO: renamed from: b */
    private C13640l m39707b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = C13008c.m36588n().m36533b();
        }
        String str3 = str + "_" + str2;
        if (f38102d.containsKey(str3)) {
            return f38102d.get(str3);
        }
        C13640l c13640lM39756l = null;
        try {
            c13640lM39756l = C13640l.m39756l(C12998a.m36460b().m36462a(str3));
            f38102d.put(str3, c13640lM39756l);
            return c13640lM39756l;
        } catch (Exception e) {
            e.printStackTrace();
            return c13640lM39756l;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13635g m39708a() {
        return C13637i.m39731a();
    }

    /* JADX INFO: renamed from: a */
    public C13640l m39709a(String str, String str2) {
        return m39707b(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m39710a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, m39710a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m39711a(String str) {
        C13637i.m39733a(str, this);
    }

    /* JADX INFO: renamed from: a */
    public void m39712a(String str, String str2, String str3) {
        String str4 = str + "_" + str2;
        C12998a.m36460b().m36464a(str4, str3);
        f38102d.put(str4, C13640l.m39756l(str3));
    }

    /* JADX INFO: renamed from: a */
    public boolean m39713a(String str, int i, String str2) {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            String str3 = str + "_" + i + "_" + str2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long jLongValue = ((Long) C13235y0.m37956a(contextM36542d, str3, 0L)).longValue();
            C13635g c13635gM39718d = m39718d(str);
            if (c13635gM39718d == null) {
                c13635gM39718d = m39706b().m39708a();
            } else {
                j = jLongValue;
            }
            if (j + (c13635gM39718d.m39550p0() * 1000) > jCurrentTimeMillis) {
                return false;
            }
            C13235y0.m37957b(contextM36542d, str3, Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public C13635g m39714b(String str) {
        C13635g c13635gM39718d;
        try {
            return (TextUtils.isEmpty(str) || (c13635gM39718d = m39718d(str)) == null) ? m39708a() : c13635gM39718d;
        } catch (Exception unused) {
            return m39708a();
        }
    }

    /* JADX INFO: renamed from: c */
    public C13635g m39715c() {
        return f38101c != null ? f38101c : m39708a();
    }

    /* JADX INFO: renamed from: c */
    public C13640l m39716c(String str, String str2) {
        C13640l c13640lM39709a = m39709a(str, str2);
        return c13640lM39709a == null ? C13640l.m39751N() : c13640lM39709a;
    }

    /* JADX INFO: renamed from: c */
    public String m39717c(String str) {
        return C12998a.m36460b().m36462a("ivreward_" + str);
    }

    /* JADX INFO: renamed from: d */
    public C13635g m39718d(String str) {
        if (f38101c == null) {
            try {
                String strM36462a = C12998a.m36460b().m36462a(str);
                if (!TextUtils.isEmpty(strM36462a)) {
                    JSONObject jSONObject = new JSONObject(strM36462a);
                    if (jSONObject.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        jSONObject.remove(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    }
                    if (jSONObject.has("c")) {
                        jSONObject.remove("c");
                    }
                    f38101c = C13635g.m39703D(jSONObject.toString());
                    if (f38101c != null) {
                        f38101c.m39433O0();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f38101c;
    }

    /* JADX INFO: renamed from: d */
    public C13640l m39719d(String str, String str2) {
        C13640l c13640lM39720e = m39720e(str, str2);
        return c13640lM39720e == null ? C13640l.m39751N() : c13640lM39720e;
    }

    /* JADX INFO: renamed from: e */
    public C13640l m39720e(String str, String str2) {
        C13640l c13640lM39707b = m39707b(str, str2);
        if (c13640lM39707b != null && c13640lM39707b.m39615L() == 0) {
            c13640lM39707b.m39632d(1);
        }
        return c13640lM39707b;
    }

    /* JADX INFO: renamed from: e */
    public String m39721e(String str) {
        if (str == null) {
            return "";
        }
        try {
            String strM36462a = C12998a.m36460b().m36462a(str);
            return strM36462a == null ? "" : strM36462a;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public String m39722f(String str) {
        C13635g c13635gM39718d = m39718d(str);
        if (c13635gM39718d == null) {
            return "0";
        }
        int iM39499e0 = c13635gM39718d.m39499e0();
        String strM39493d0 = c13635gM39718d.m39493d0();
        return (iM39499e0 == 0 || !(!TextUtils.isEmpty(strM39493d0) && !strM39493d0.equalsIgnoreCase(AbstractJsonLexerKt.NULL))) ? "0" : "1";
    }

    /* JADX INFO: renamed from: f */
    public String m39723f(String str, String str2) {
        return C12998a.m36460b().m36462a(str + "_" + str2);
    }

    /* JADX INFO: renamed from: g */
    public boolean m39724g(String str) {
        C13635g c13635gM39718d = m39718d(str);
        if (c13635gM39718d != null) {
            long jM39390B = c13635gM39718d.m39390B() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jM39579x = c13635gM39718d.m39579x() + jM39390B;
            if (jM39579x > jCurrentTimeMillis) {
                C13219q0.m37818c(f38099a, "app setting nexttime is not ready  [settingNextRequestTime= " + jM39579x + " currentTime = " + jCurrentTimeMillis + C11744X3.j.f26440e);
                return false;
            }
        }
        C13219q0.m37818c(f38099a, "app setting timeout or not exists");
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean m39725g(String str, String str2) {
        C13635g c13635gM39718d = m39718d(str2);
        if (m39724g(str2) && m39713a(str2, 1, str)) {
            new C13638j().m39746b(C13008c.m36588n().m36542d(), str2, C13008c.m36588n().m36538c());
        }
        C13640l c13640lM39720e = m39720e(str2, str);
        if (c13635gM39718d != null && c13640lM39720e != null) {
            long jM39570u0 = c13635gM39718d.m39570u0() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jM39658o = c13640lM39720e.m39658o() + jM39570u0;
            if (jM39658o > jCurrentTimeMillis) {
                C13219q0.m37818c(f38099a, "unit setting  nexttime is not ready  [settingNextRequestTime= " + jM39658o + " currentTime = " + jCurrentTimeMillis + C11744X3.j.f26440e);
                return false;
            }
        }
        C13219q0.m37818c(f38099a, "unit setting timeout or not exists");
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m39726h(String str) {
        C12998a.m36460b().m36467c("ivreward_" + str);
    }

    /* JADX INFO: renamed from: h */
    public void m39727h(String str, String str2) {
        C12998a.m36460b().m36464a(str, str2);
        f38101c = C13635g.m39703D(str2);
        if (f38101c != null) {
            f38101c.m39433O0();
            C12907a.m36194c().m36198a(str, str2);
        }
        C13637i.m39732a(f38101c);
        C13199g0.m37691a().m37692a(f38101c.m39438R());
    }

    /* JADX INFO: renamed from: i */
    public void m39728i(String str) {
        try {
            String strM39721e = m39721e(str);
            if (TextUtils.isEmpty(strM39721e)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM39721e);
            jSONObject.put("current_time", System.currentTimeMillis());
            m39727h(str, jSONObject.toString());
        } catch (Throwable th) {
            C13219q0.m37816b(f38099a, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m39729i(String str, String str2) {
        C12998a.m36460b().m36464a("ivreward_" + str, str2);
    }

    /* JADX INFO: renamed from: j */
    public void m39730j(String str, String str2) {
        try {
            String strM36462a = C12998a.m36460b().m36462a(str + "_" + str2);
            if (TextUtils.isEmpty(strM36462a)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM36462a);
            jSONObject.put("current_time", System.currentTimeMillis());
            m39712a(str, str2, jSONObject.toString());
        } catch (Throwable th) {
            C13219q0.m37816b(f38099a, th.getMessage());
        }
    }
}
