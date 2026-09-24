package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.C3288qt;
import com.ironsource.C11744X3;
import java.util.Iterator;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3565di {
    /* JADX INFO: renamed from: ri */
    public static String m16381ri(String str) {
        if (!C2730vr.m10314ik() || TextUtils.isEmpty(str)) {
            return str;
        }
        C3288qt c3288qt = new C3288qt(C3304qt.m14669lr().m14681co());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = c3288qt.m14243lr().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append(C11744X3.j.f26436c);
                    sb.append(c3288qt.m14244ri());
                } else {
                    sb.append("?");
                    sb.append(c3288qt.m14244ri());
                }
            }
        }
        return sb.toString();
    }
}
