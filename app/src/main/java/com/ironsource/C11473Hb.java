package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.Hb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11473Hb {
    /* JADX INFO: renamed from: a */
    public final void m26007a(Map<String, String> map, boolean z) {
        if (z && TextUtils.isEmpty(C12367p.m32628h().m32671k()) && map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (IronSourceUtils.m32743a(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    C12367p.m32628h().mo27299f(str);
                    return;
                }
            }
        }
    }
}
