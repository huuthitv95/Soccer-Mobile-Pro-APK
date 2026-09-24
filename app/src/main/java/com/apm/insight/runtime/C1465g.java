package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1390e;
import com.apm.insight.ICommonParams;
import com.apm.insight.nativecrash.C1442b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.apm.insight.runtime.g */
/* JADX INFO: compiled from: DefaultCommonParams.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1465g {

    /* JADX INFO: renamed from: a */
    private String f859a = null;

    /* JADX INFO: renamed from: b */
    private int f860b = -1;

    /* JADX INFO: renamed from: a */
    public static C1442b m1638a(Context context) {
        return new C1442b(context, new ICommonParams() { // from class: com.apm.insight.runtime.g.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final String m1639a() {
        if (!TextUtils.isEmpty(this.f859a) && !"0".equals(this.f859a)) {
            return this.f859a;
        }
        String strM1512d = C1390e.m1012a().m1512d();
        this.f859a = strM1512d;
        if (!TextUtils.isEmpty(strM1512d) && !"0".equals(this.f859a)) {
            return this.f859a;
        }
        String strM1715b = C1473o.m1709a().m1715b();
        this.f859a = strM1715b;
        return strM1715b;
    }

    /* JADX INFO: renamed from: a */
    public final void m1640a(String str) {
        this.f859a = str;
        C1473o.m1709a().m1713a(str);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1641b() {
        return this.f859a != null;
    }
}
