package com.bytedance.sdk.component.jbs;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2638lr {
    /* JADX INFO: renamed from: ri */
    public static boolean m9799ri(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    if (Pattern.matches(it.next(), str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }
}
