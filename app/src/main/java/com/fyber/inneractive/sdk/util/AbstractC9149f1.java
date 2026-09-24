package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.C11744X3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.f1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9149f1 {
    /* JADX INFO: renamed from: a */
    public static String m21960a(String str, HashMap map) {
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(z ? "?" : C11744X3.j.f26436c);
            sb.append((String) entry.getKey());
            sb.append(C11744X3.j.f26434b);
            sb.append(Uri.encode((String) entry.getValue()));
            z = false;
        }
        return sb.toString();
    }
}
