package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C2982ac {

    /* JADX INFO: renamed from: ri */
    private static final Map<Integer, AbstractC3003ri<?, ?>> f9089ri = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lr */
    private static AbstractC3003ri<?, ?> m11614lr(Context context, int i) {
        if (i == 7) {
            return new C2985bu(context);
        }
        if (i == 8) {
            return new xha(context);
        }
        throw new IllegalArgumentException("Unsupported ad type: ".concat(String.valueOf(i)));
    }

    /* JADX INFO: renamed from: ri */
    public static AbstractC3003ri<?, ?> m11615ri(Context context, int i) {
        AbstractC3003ri<?, ?> abstractC3003riM11614lr;
        Map<Integer, AbstractC3003ri<?, ?>> map = f9089ri;
        AbstractC3003ri<?, ?> abstractC3003ri = map.get(Integer.valueOf(i));
        if (abstractC3003ri != null) {
            return abstractC3003ri;
        }
        synchronized (C2982ac.class) {
            abstractC3003riM11614lr = map.get(Integer.valueOf(i));
            if (abstractC3003riM11614lr == null) {
                abstractC3003riM11614lr = m11614lr(context, i);
                map.put(Integer.valueOf(i), abstractC3003riM11614lr);
            }
        }
        return abstractC3003riM11614lr;
    }
}
