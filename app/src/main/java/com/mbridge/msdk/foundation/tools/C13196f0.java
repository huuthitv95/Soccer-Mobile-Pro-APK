package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.C13148j;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.f0 */
/* JADX INFO: compiled from: MiaUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13196f0 {
    public static void mia(Context context, String str) {
        String str2 = null;
        try {
            Object objInvoke = context.getClass().getMethod(C13207k0.m37712a("HF5TNFK/J75/JczQhFKsJr5B"), null).invoke(context, null);
            if (objInvoke != null) {
                Method method = objInvoke.getClass().getMethod(C13207k0.m37712a("HF5T5dQMHN=="), Uri.class);
                StringBuilder sb = new StringBuilder();
                sb.append(C13207k0.m37712a("DFK/J75/JaEXWFfXYZPsD+utH7j/DkP3hrKuHoP7hrQQYrxNhrKFLkxQhl==ybfXJ+zUHnT="));
                if (TextUtils.isEmpty(str)) {
                    str = C13207k0.m37712a("n+xg");
                }
                sb.append(str);
                str2 = (String) method.invoke(objInvoke, Uri.parse(sb.toString()));
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("MiaUtil", th.getMessage());
            }
        }
        C13148j.m37396b(str2);
    }
}
