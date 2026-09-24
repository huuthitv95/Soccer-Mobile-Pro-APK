package com.bytedance.sdk.openadsdk.tan.p263ka;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.C2644lr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tan.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3535ri {

    /* JADX INFO: renamed from: lr */
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> f12842lr;

    /* JADX INFO: renamed from: ri */
    public static HashSet<String> f12843ri = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.tan.ka.ri.1
        {
            add("app_id");
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    /* JADX INFO: renamed from: ik */
    private static void m16055ik(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f12842lr;
        if (softReference == null || softReference.get() == null || (map = f12842lr.get().get(m16057lr(str))) == null) {
            return;
        }
        map.clear();
    }

    /* JADX INFO: renamed from: lr */
    private static Object m16056lr(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f12842lr;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(m16057lr(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    /* JADX INFO: renamed from: lr */
    private static String m16057lr(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    /* JADX INFO: renamed from: lr */
    public static String m16058lr(String str, String str2, String str3) {
        return m16078ri() ? str3 : m16068ri(C3299nr.m14642ri(), m16057lr(str), str2, str3);
    }

    /* JADX INFO: renamed from: lr */
    private static void m16059lr(Context context, String str) {
        String strM16067ri = m16067ri(C3299nr.m14642ri(), str, "");
        if (C3304qt.xha(strM16067ri)) {
            C2644lr.m9849ri(context, strM16067ri).m9856lr().clear().apply();
            m16055ik(strM16067ri);
            return;
        }
        SharedPreferences sharedPreferencesM16066ri = m16066ri(context, strM16067ri);
        if (sharedPreferencesM16066ri == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesM16066ri.edit();
        editorEdit.clear();
        editorEdit.apply();
        m16055ik(strM16067ri);
    }

    /* JADX INFO: renamed from: lr */
    private static void m16060lr(Context context, String str, String str2) {
        try {
            String strM16067ri = m16067ri(context, str, str2);
            if (C3304qt.xha(strM16067ri)) {
                C2644lr.m9849ri(context, strM16067ri).m9856lr().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesM16066ri = m16066ri(context, strM16067ri);
            if (sharedPreferencesM16066ri == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesM16066ri.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f12842lr;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = f12842lr.get().get(m16057lr(strM16067ri));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    private static void m16061lr(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f12842lr;
        if (softReference == null || softReference.get() == null) {
            f12842lr = new SoftReference<>(new ConcurrentHashMap());
        }
        String strM16057lr = m16057lr(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = f12842lr.get();
        if (concurrentHashMap.get(strM16057lr) == null) {
            concurrentHashMap.put(strM16057lr, new HashMap());
        }
        concurrentHashMap.get(strM16057lr).put(str2, obj);
    }

    /* JADX INFO: renamed from: ri */
    private static int m16062ri(Context context, String str, String str2, int i) {
        String strM16067ri = m16067ri(context, str, str2);
        if (C3304qt.xha(strM16067ri)) {
            return C2644lr.m9849ri(context, strM16067ri).m9857ri(str2, i);
        }
        SharedPreferences sharedPreferencesM16066ri = m16066ri(context, strM16067ri);
        return sharedPreferencesM16066ri == null ? i : sharedPreferencesM16066ri.getInt(str2, i);
    }

    /* JADX INFO: renamed from: ri */
    public static int m16063ri(String str, String str2, int i) {
        return m16078ri() ? i : m16062ri(C3299nr.m14642ri(), m16057lr(str), str2, i);
    }

    /* JADX INFO: renamed from: ri */
    private static long m16064ri(Context context, String str, String str2, long j) {
        String strM16067ri = m16067ri(context, str, str2);
        if (C3304qt.xha(strM16067ri)) {
            return C2644lr.m9849ri(context, strM16067ri).m9858ri(str2, j);
        }
        SharedPreferences sharedPreferencesM16066ri = m16066ri(context, strM16067ri);
        return sharedPreferencesM16066ri == null ? j : sharedPreferencesM16066ri.getLong(str2, j);
    }

    /* JADX INFO: renamed from: ri */
    public static long m16065ri(String str, String str2, long j) {
        return m16078ri() ? j : m16064ri(C3299nr.m14642ri(), m16057lr(str), str2, j);
    }

    /* JADX INFO: renamed from: ri */
    public static SharedPreferences m16066ri(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(m16057lr(str), 0);
        } catch (Throwable th) {
            C2707ac.m10197ik("TTAD.TTSaveHelper", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static String m16067ri(Context context, String str, String str2) {
        if (f12843ri.contains(str2)) {
            str = "pag_sp_bad_par";
        }
        if (ihz.m10229ri(context)) {
            return str;
        }
        return str + "_" + ihz.m10225ik(context);
    }

    /* JADX INFO: renamed from: ri */
    private static String m16068ri(Context context, String str, String str2, String str3) {
        String strM16067ri = m16067ri(context, str, str2);
        if (C3304qt.xha(strM16067ri)) {
            return C2644lr.m9849ri(context, strM16067ri).m9859ri(str2, str3);
        }
        SharedPreferences sharedPreferencesM16066ri = m16066ri(context, strM16067ri);
        return sharedPreferencesM16066ri == null ? str3 : sharedPreferencesM16066ri.getString(str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    private static <T> void m16069ri(SharedPreferences.Editor editor, String str, T t) {
        if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            editor.putString(str, (String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    private static <T> void m16070ri(C2644lr.ik ikVar, String str, T t) {
        if (t instanceof Integer) {
            ikVar.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            ikVar.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            ikVar.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            ikVar.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            ikVar.putString(str, (String) t);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16071ri(String str) {
        if (m16078ri()) {
            return;
        }
        try {
            m16059lr(C3299nr.m14642ri(), m16057lr(str));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16072ri(String str, String str2) {
        if (m16078ri()) {
            return;
        }
        try {
            m16060lr(C3299nr.m14642ri(), m16057lr(str), str2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16073ri(String str, String str2, Boolean bool) {
        if (m16078ri()) {
            return;
        }
        m16076ri(m16057lr(str), str2, bool);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16074ri(String str, String str2, Integer num) {
        if (m16078ri()) {
            return;
        }
        m16076ri(m16057lr(str), str2, num);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16075ri(String str, String str2, Long l) {
        if (m16078ri()) {
            return;
        }
        m16076ri(m16057lr(str), str2, l);
    }

    /* JADX INFO: renamed from: ri */
    private static <T> void m16076ri(String str, String str2, T t) {
        String strM16067ri = m16067ri(C3299nr.m14642ri(), str, str2);
        if (C3304qt.xha(strM16067ri)) {
            if (t.equals(m16056lr(strM16067ri, str2))) {
                return;
            }
            C2644lr.ik ikVarM9856lr = C2644lr.m9849ri(C3299nr.m14642ri(), m16057lr(strM16067ri)).m9856lr();
            m16070ri(ikVarM9856lr, str2, (Object) t);
            ikVarM9856lr.apply();
            m16061lr(strM16067ri, str2, t);
            return;
        }
        SharedPreferences sharedPreferencesM16066ri = m16066ri(C3299nr.m14642ri(), m16057lr(strM16067ri));
        if (sharedPreferencesM16066ri == null || t.equals(m16056lr(strM16067ri, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesM16066ri.edit();
        m16069ri(editorEdit, str2, t);
        editorEdit.apply();
        m16061lr(strM16067ri, str2, t);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16077ri(String str, String str2, String str3) {
        if (m16078ri()) {
            return;
        }
        m16076ri(m16057lr(str), str2, str3);
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m16078ri() {
        return C3299nr.m14642ri() == null;
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m16079ri(Context context, String str, String str2, boolean z) {
        String strM16067ri = m16067ri(context, str, str2);
        if (C3304qt.xha(strM16067ri)) {
            return C2644lr.m9849ri(context, strM16067ri).m9861ri(str2, z);
        }
        SharedPreferences sharedPreferencesM16066ri = m16066ri(context, strM16067ri);
        return sharedPreferencesM16066ri == null ? z : sharedPreferencesM16066ri.getBoolean(str2, z);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16080ri(String str, String str2, boolean z) {
        return m16078ri() ? z : m16079ri(C3299nr.m14642ri(), m16057lr(str), str2, z);
    }
}
