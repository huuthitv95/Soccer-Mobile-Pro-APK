package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.p022l.C1427c;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.apm.insight.runtime.f */
/* JADX INFO: compiled from: CrashTimes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1464f {

    /* JADX INFO: renamed from: a */
    private Context f855a;

    /* JADX INFO: renamed from: b */
    private HashMap<String, Long> f856b;

    /* JADX INFO: renamed from: c */
    private int f857c;

    /* JADX INFO: renamed from: d */
    private int f858d;

    public C1464f(Context context) {
        this.f856b = null;
        this.f857c = 50;
        this.f858d = 100;
        this.f855a = context;
        this.f856b = m1635b();
        this.f857c = C1447a.m1526a(this.f857c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f858d = C1447a.m1526a(this.f858d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    /* JADX INFO: renamed from: b */
    private HashMap<String, Long> m1635b() {
        File fileM1393h = C1434j.m1393h(this.f855a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayM1325a = C1430f.m1325a(fileM1393h.getAbsolutePath());
            if (!C1373a.m868a(jSONArrayM1325a)) {
                Long lDecode = Long.decode(jSONArrayM1325a.optString(0, null));
                if (System.currentTimeMillis() - lDecode.longValue() > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                    File fileM1390g = C1434j.m1390g(this.f855a);
                    fileM1393h.renameTo(new File(fileM1390g, String.valueOf(System.currentTimeMillis())));
                    String[] list = fileM1390g.list();
                    if (list != null && list.length > 5) {
                        Arrays.sort(list);
                        new File(fileM1390g, list[0]).delete();
                        return map;
                    }
                } else {
                    map.put("time", lDecode);
                    for (int i = 1; i < jSONArrayM1325a.length(); i++) {
                        String[] strArrSplit = jSONArrayM1325a.optString(i, "").split(" ");
                        if (strArrSplit.length == 2) {
                            map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                        }
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public final void m1636a() throws Throwable {
        HashMap<String, Long> map = this.f856b;
        Long lRemove = map.remove("time");
        if (lRemove == null) {
            C1386c.m990a();
            C1468j.m1652a(new RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lRemove);
        sb.append('\n');
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(' ');
            sb.append(entry.getValue());
            sb.append('\n');
        }
        try {
            C1430f.m1327a(C1434j.m1393h(this.f855a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1637a(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return C1427c.AnonymousClass1.m1305a(this.f856b, str, 1L).longValue() < ((long) this.f857c) && C1427c.AnonymousClass1.m1305a(this.f856b, "all", 1L).longValue() < ((long) this.f858d);
    }
}
