package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.util.b */
/* JADX INFO: compiled from: ComponentSharedPreferencesManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12769b {

    /* JADX INFO: renamed from: c */
    private static C12769b f34007c;

    /* JADX INFO: renamed from: a */
    private SharedPreferences f34008a;

    /* JADX INFO: renamed from: b */
    private final Map<String, Object> f34009b = new ConcurrentHashMap();

    private C12769b(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        this.f34008a = context.getSharedPreferences(TextUtils.isEmpty(str) ? "mbridge_component_sp" : str, 0);
    }

    /* JADX INFO: renamed from: a */
    public static C12769b m35186a(Context context) {
        if (f34007c == null) {
            synchronized (C12769b.class) {
                if (f34007c == null) {
                    f34007c = new C12769b(context, "mbridge_component_sp");
                }
            }
        }
        return f34007c;
    }

    /* JADX INFO: renamed from: b */
    public void m35195b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f34008a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
        m35188a(str, (Object) str2);
    }

    /* JADX INFO: renamed from: b */
    public void m35194b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f34008a.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
        m35188a(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public String m35192a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Object objM35187a = m35187a(str);
        if (objM35187a instanceof String) {
            return (String) objM35187a;
        }
        String string = this.f34008a.getString(str, str2);
        m35188a(str, (Object) string);
        return string;
    }

    /* JADX INFO: renamed from: a */
    public int m35190a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        Object objM35187a = m35187a(str);
        if (objM35187a instanceof Integer) {
            return ((Integer) objM35187a).intValue();
        }
        int i2 = this.f34008a.getInt(str, i);
        m35188a(str, Integer.valueOf(i2));
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public long m35191a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        Object objM35187a = m35187a(str);
        if (objM35187a instanceof Long) {
            return ((Long) objM35187a).longValue();
        }
        long j2 = this.f34008a.getLong(str, j);
        m35188a(str, Long.valueOf(j2));
        return j2;
    }

    /* JADX INFO: renamed from: a */
    public float m35189a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        Object objM35187a = m35187a(str);
        if (objM35187a instanceof Float) {
            return ((Float) objM35187a).floatValue();
        }
        float f2 = this.f34008a.getFloat(str, f);
        m35188a(str, Float.valueOf(f2));
        return f2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m35193a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        Object objM35187a = m35187a(str);
        if (objM35187a instanceof Boolean) {
            return ((Boolean) objM35187a).booleanValue();
        }
        boolean z2 = this.f34008a.getBoolean(str, z);
        m35188a(str, Boolean.valueOf(z2));
        return z2;
    }

    /* JADX INFO: renamed from: a */
    private Object m35187a(String str) {
        return this.f34009b.get(str);
    }

    /* JADX INFO: renamed from: a */
    private void m35188a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.f34009b.put(str, obj);
    }
}
