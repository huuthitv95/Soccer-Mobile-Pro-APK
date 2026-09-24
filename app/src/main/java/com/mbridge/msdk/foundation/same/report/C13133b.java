package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.b */
/* JADX INFO: compiled from: DomainReport.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13133b {

    /* JADX INFO: renamed from: a */
    private static String f36076a = "DomainReport";

    /* JADX INFO: renamed from: a */
    public static boolean m37277a(C13635g c13635g, String str) {
        if (c13635g != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int iM39422L = c13635g.m39422L();
                    JSONArray jSONArrayM39416J = c13635g.m39416J();
                    JSONArray jSONArrayM39413I = c13635g.m39413I();
                    if (jSONArrayM39413I != null) {
                        for (int i = 0; i < jSONArrayM39413I.length(); i++) {
                            if (str.contains(jSONArrayM39413I.getString(i))) {
                                return false;
                            }
                        }
                    }
                    if (iM39422L == 2) {
                        if (jSONArrayM39416J != null) {
                            for (int i2 = 0; i2 < jSONArrayM39416J.length(); i2++) {
                                if (str.contains(jSONArrayM39416J.getString(i2))) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            } catch (Exception e) {
                C13219q0.m37816b(f36076a, e.getMessage());
            }
        }
        return true;
    }
}
