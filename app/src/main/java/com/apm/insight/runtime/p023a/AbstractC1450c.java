package com.apm.insight.runtime.p023a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.AttachUserData;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.entity.C1395a;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.p022l.C1438n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.runtime.a.c */
/* JADX INFO: compiled from: BaseAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1450c {

    /* JADX INFO: renamed from: a */
    protected CrashType f824a;

    /* JADX INFO: renamed from: b */
    protected Context f825b;

    /* JADX INFO: renamed from: c */
    private ICommonParams f826c = C1390e.m1012a().m1511c();

    /* JADX INFO: renamed from: d */
    private C1449b f827d;

    /* JADX INFO: renamed from: e */
    private C1451d f828e;

    /* JADX INFO: renamed from: com.apm.insight.runtime.a.c$a */
    /* JADX INFO: compiled from: BaseAssembly.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        C1395a mo1171a(int i, C1395a c1395a);

        /* JADX INFO: renamed from: b */
        C1395a mo1172b(int i, C1395a c1395a);
    }

    AbstractC1450c(CrashType crashType, Context context, C1449b c1449b, C1451d c1451d) {
        this.f824a = crashType;
        this.f825b = context;
        this.f827d = c1449b;
        this.f828e = c1451d;
    }

    /* JADX INFO: renamed from: b */
    private C1395a m1598b(C1395a c1395a) {
        c1395a.m1087a(C1390e.m1042q(), C1390e.m1043r());
        if (C1390e.m1039n()) {
            c1395a.m1095a("is_mp", (Object) 1);
        }
        try {
            c1395a.m1093a(this.f826c.getPluginInfo());
        } catch (Throwable th) {
            try {
                HashMap map = new HashMap();
                map.put("Data fetch failed since source misstake:\n" + C1437m.m1412a(th), 0);
                c1395a.m1093a(map);
            } catch (Throwable unused) {
            }
        }
        c1395a.m1098b(C1390e.m1041p());
        C1390e.m1032g();
        c1395a.m1095a("process_name", C1425a.m1291b());
        return c1395a;
    }

    /* JADX INFO: renamed from: c */
    private C1395a m1599c(C1395a c1395a) {
        C1449b c1449b;
        if (!C1425a.m1292b(C1390e.m1032g())) {
            c1395a.m1095a("remote_process", (Object) 1);
        }
        c1395a.m1095a("pid", Integer.valueOf(Process.myPid()));
        c1395a.m1088a(C1390e.m1035j());
        if (mo1603b() && (c1449b = this.f827d) != null) {
            c1395a.m1090a(c1449b);
        }
        try {
            c1395a.m1092a(this.f826c.getPatchInfo());
        } catch (Throwable th) {
            try {
                c1395a.m1092a(Arrays.asList("Data fetch failed since source misstake:\n" + C1437m.m1412a(th)));
            } catch (Throwable unused) {
            }
        }
        String strM1036k = C1390e.m1036k();
        if (strM1036k != null) {
            c1395a.m1095a("business", (Object) strM1036k);
        }
        c1395a.m1095a("is_background", Boolean.valueOf(!C1425a.m1290a()));
        return c1395a;
    }

    /* JADX INFO: renamed from: a */
    public int mo1600a() {
        return 6;
    }

    /* JADX INFO: renamed from: a */
    public C1395a mo1601a(int i, C1395a c1395a) {
        if (c1395a == null) {
            c1395a = new C1395a();
        }
        if (i == 0) {
            m1598b(c1395a);
            return c1395a;
        }
        if (i == 1) {
            m1599c(c1395a);
            List<AttachUserData> listM888a = C1390e.m1021b().m888a(this.f824a);
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = c1395a.m1102c().optJSONObject("custom");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                c1395a.m1095a("custom", jSONObjectOptJSONObject);
            }
            if (listM888a != null) {
                for (int i2 = 0; i2 < listM888a.size(); i2++) {
                    try {
                        AttachUserData attachUserData = listM888a.get(i2);
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        C1395a.m1081a(jSONObjectOptJSONObject, attachUserData.getUserData(this.f824a));
                        map.put("custom_cost_" + attachUserData.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                    } catch (Throwable th) {
                        C1395a.m1080a(jSONObjectOptJSONObject, th);
                    }
                }
            }
            try {
                jSONObjectOptJSONObject.put("fd_count", C1373a.m882f());
            } catch (Throwable unused) {
            }
            List<AttachUserData> listM895b = C1390e.m1021b().m895b(this.f824a);
            if (listM895b != null) {
                JSONObject jSONObjectOptJSONObject2 = c1395a.m1102c().optJSONObject("custom_long");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    c1395a.m1095a("custom_long", jSONObjectOptJSONObject2);
                }
                for (int i3 = 0; i3 < listM895b.size(); i3++) {
                    try {
                        AttachUserData attachUserData2 = listM895b.get(i3);
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        C1395a.m1081a(jSONObjectOptJSONObject2, attachUserData2.getUserData(this.f824a));
                        map.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                    } catch (Throwable th2) {
                        C1395a.m1080a(jSONObjectOptJSONObject2, th2);
                    }
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                jSONObjectOptJSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } else {
            if (i == 2) {
                C1451d c1451d = this.f828e;
                c1395a.m1095a("battery", Integer.valueOf(c1451d != null ? c1451d.m1606a() : 0));
                c1395a.m1101c(C1390e.m1021b().m889a());
                return c1395a;
            }
            if (i == 5 && mo1604c()) {
                c1395a.m1099b(C1438n.m1434a());
                return c1395a;
            }
        }
        return c1395a;
    }

    /* JADX INFO: renamed from: a */
    public C1395a mo1545a(C1395a c1395a) {
        return c1395a;
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1602a(C1395a c1395a, a aVar, boolean z) {
        if (c1395a == null) {
            c1395a = new C1395a();
        }
        C1395a c1395a2 = c1395a;
        for (int i = 0; i < mo1600a(); i++) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar != null) {
                try {
                    c1395a2 = aVar.mo1171a(i, c1395a2);
                } catch (Throwable unused) {
                }
            }
            try {
                c1395a2 = mo1601a(i, c1395a2);
            } catch (Throwable unused2) {
            }
            if (aVar != null) {
                try {
                    mo1600a();
                    c1395a2 = aVar.mo1172b(i, c1395a2);
                } catch (Throwable unused3) {
                }
                if (z) {
                    if (i != 0) {
                        c1395a.m1103c(c1395a2.m1102c());
                    } else {
                        c1395a = c1395a2;
                    }
                    c1395a2 = new C1395a();
                }
            }
            c1395a.m1097b("step_cost_".concat(String.valueOf(i)), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return mo1545a(c1395a);
    }

    /* JADX INFO: renamed from: b */
    protected boolean mo1603b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    protected boolean mo1604c() {
        return true;
    }
}
