package com.mbridge.msdk.config.dynamic.binddata;

import android.text.TextUtils;
import android.view.View;
import com.ironsource.C11744X3;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12897d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.binddata.a */
/* JADX INFO: compiled from: ComponentBindData.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12893a {
    /* JADX INFO: renamed from: a */
    public static void m36039a(String str, View view, C12894a c12894a) {
        if (TextUtils.isEmpty(str) || view == null) {
            return;
        }
        m36041b(str, view, c12894a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private static void m36041b(String str, View view, C12894a c12894a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArrSplit = str.split("\\|");
            HashMap map = new HashMap();
            C12717d c12717d = new C12717d();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(C11744X3.j.f26434b);
                if (strArrSplit2.length == 2) {
                    String str3 = strArrSplit2[1];
                    m36040a(str3, "", view, c12894a);
                    map.put(strArrSplit2[0], c12717d.m34892a(str3, c12894a));
                }
            }
            map.put("globalModel", c12894a);
            if (view instanceof InterfaceC12875a) {
                ((InterfaceC12875a) view).setXmlData(map);
            }
        } catch (Exception e) {
            C13219q0.m37817b("ComponentBindData", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m36040a(String str, String str2, View view, C12894a c12894a) {
        if (TextUtils.isEmpty(str) || view == null || !str.startsWith("$")) {
            return;
        }
        try {
            String strReplace = str.replace("$", "");
            C12897d c12897d = new C12897d(str, str2, view, 0);
            C12894a c12894aM35198a = C12770c.m35198a(c12894a, strReplace);
            if (c12894aM35198a != null) {
                c12894aM35198a.m36053b(strReplace, c12897d);
            }
        } catch (Exception e) {
            C13219q0.m37817b("ComponentBindData", e.getMessage(), e);
        }
    }
}
