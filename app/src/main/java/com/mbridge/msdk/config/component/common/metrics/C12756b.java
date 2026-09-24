package com.mbridge.msdk.config.component.common.metrics;

import android.text.TextUtils;
import bolts.MeasurementEvent;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.metrics.b */
/* JADX INFO: compiled from: MetricsUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12756b {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m35096a(C12710b c12710b, Map<String, Object> map, C12894a c12894a) {
        Map<String, Object> mapM35097a;
        Map<String, Object> mapM35097a2;
        Map<String, Object> mapM35097a3;
        Map<String, Object> mapM35097a4;
        Object obj;
        HashMap map2 = new HashMap();
        try {
            boolean zM35100a = m35100a(c12710b.m34842b(), C12770c.m35209b("20"));
            boolean zM35100a2 = m35100a(c12710b.m34842b(), C12770c.m35209b("21"));
            boolean zM35100a3 = m35100a(c12710b.m34842b(), C12770c.m35209b("22"));
            boolean zM35100a4 = m35100a(c12710b.m34842b(), C12770c.m35209b("23"));
            map2.put(C12770c.m35209b("key"), c12710b.m34844c());
            if (zM35100a && (mapM35097a4 = m35097a(c12894a.m36051b(C12770c.m35209b("50")))) != null && (obj = mapM35097a4.get(C12770c.m35209b(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY))) != null) {
                map2.put(C12770c.m35209b("e_s_name"), String.valueOf(obj));
            }
            HashMap map3 = null;
            Map<String, Object> mapM35097a5 = map != null ? m35097a(map.get("event_gen_data")) : null;
            Map<String, Object> mapM35097a6 = map != null ? m35097a(map.get("event_replace_data")) : null;
            if (mapM35097a6 != null && mapM35097a6.containsKey(C12770c.m35209b("24")) && (mapM35097a3 = m35097a(mapM35097a6.get(C12770c.m35209b("24")))) != null && !mapM35097a3.isEmpty()) {
                map3 = new HashMap(mapM35097a3);
                mapM35097a6.remove(C12770c.m35209b("24"));
            }
            if (zM35100a2 && mapM35097a5 != null) {
                map2.put(C12770c.m35209b("e_output"), mapM35097a5);
            }
            if (zM35100a3) {
                map2.put(C12770c.m35209b("execute_c_config"), m35098a(m35097a(c12710b.m34842b().get(C12770c.m35209b("52")))));
                if (mapM35097a6 != null && !mapM35097a6.isEmpty()) {
                    mapM35097a6.remove(C12770c.m35209b("pre_action"));
                    map2.put(C12770c.m35209b("execute_e_config"), mapM35097a6);
                }
            }
            if (zM35100a4 && (mapM35097a = m35097a(c12710b.m34842b().get(C12770c.m35209b("51")))) != null && (mapM35097a2 = m35097a(mapM35097a.get(C12770c.m35209b("metrics")))) != null && !mapM35097a2.isEmpty()) {
                map2.putAll(mapM35097a2);
            }
            if (map3 != null && !map3.isEmpty()) {
                map2.putAll(C12770c.m35203a((Map<String, Object>) map3));
                return map2;
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MetricsUtil", th.getMessage());
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m35100a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return true;
        }
        return String.valueOf(obj).equals("1");
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, Object> m35097a(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof C12894a) {
            return ((C12894a) obj).m36052b();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, Object> m35098a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals(C12770c.m35209b("25")) && !entry.getKey().equals(C12770c.m35209b("13"))) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public static void m35099a(String str, Map<String, Object> map) {
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37502a(map);
            C13154c c13154c = new C13154c();
            c13154c.m37423a(str, c13157e);
            C13156d.m37475b().m37484a(str, c13154c);
        } catch (Throwable th) {
            C13219q0.m37816b("MetricsUtil", th.getMessage());
        }
    }
}
