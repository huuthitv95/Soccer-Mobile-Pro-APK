package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.dw */
/* JADX INFO: loaded from: classes3.dex */
public class C2716dw {

    /* JADX INFO: renamed from: ik */
    private static final HashMap<Class<?>, Class<?>> f7758ik;

    /* JADX INFO: renamed from: lr */
    private static Map<String, Method> f7759lr = new HashMap();

    /* JADX INFO: renamed from: ri */
    public static final Class<?>[] f7760ri;

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        f7758ik = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        f7760ri = new Class[0];
    }

    /* JADX INFO: renamed from: ri */
    public static int m10217ri(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: ri */
    public static int m10218ri(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
