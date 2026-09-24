package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.metrics.e */
/* JADX INFO: compiled from: ParameterWrapper.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13157e {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f36187a = new HashMap();

    /* JADX INFO: renamed from: a */
    public void m37501a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f36187a.put(str, (String) obj);
            } else {
                this.f36187a.put(str, obj + "");
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m37504b(String str) {
        return this.f36187a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public void m37505c(String str) {
        if (this.f36187a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f36187a.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public boolean m37503a(String str) {
        return this.f36187a.containsKey(str);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m37499a() {
        return this.f36187a;
    }

    /* JADX INFO: renamed from: a */
    public void m37500a(C13157e c13157e) {
        Map<String, String> map;
        Map<String, String> map2;
        if (c13157e == null || (map = c13157e.f36187a) == null || (map2 = this.f36187a) == null) {
            return;
        }
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public void m37502a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f36187a.putAll(map);
    }
}
