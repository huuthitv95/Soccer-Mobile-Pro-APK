package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.c5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1521c5 {

    /* JADX INFO: renamed from: b */
    private static C1748l f1283b;

    /* JADX INFO: renamed from: c */
    private static SharedPreferences f1284c;

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f1285a;

    public C1521c5(C1748l c1748l) {
        this.f1285a = C1748l.m4756p().getSharedPreferences("com.applovin.sdk.preferences." + c1748l.m4839k0(), 0);
        f1283b = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private static SharedPreferences m2200a(Context context) {
        if (f1284c == null) {
            f1284c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f1284c;
    }

    /* JADX INFO: renamed from: a */
    public static Object m2201a(C1511b5 c1511b5, Object obj, Context context) {
        return m2203a(c1511b5.m2109a(), obj, c1511b5.m2110b(), m2200a(context));
    }

    /* JADX INFO: renamed from: a */
    public static Object m2202a(C1511b5 c1511b5, Object obj, SharedPreferences sharedPreferences, boolean z) {
        return m2204a(c1511b5.m2109a(), obj, c1511b5.m2110b(), sharedPreferences, z);
    }

    /* JADX INFO: renamed from: a */
    public static Object m2203a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return m2204a(str, obj, cls, sharedPreferences, true);
    }

    /* JADX INFO: renamed from: a */
    public static Object m2204a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z) {
        Object stringSet;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return obj;
            }
            if (Boolean.class.equals(cls)) {
                stringSet = obj != null ? Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue())) : Boolean.valueOf(sharedPreferences.getBoolean(str, false));
            } else if (Float.class.equals(cls)) {
                stringSet = obj != null ? Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue())) : Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
            } else if (Integer.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, obj.getClass().equals(Long.class) ? ((Long) obj).intValue() : ((Integer) obj).intValue()));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, obj.getClass().equals(Integer.class) ? ((Integer) obj).longValue() : ((Long) obj).longValue()));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                stringSet = obj != null ? Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue())))) : Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) obj);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
            }
            if (stringSet == null) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return obj;
            }
            Object objCast = cls.cast(stringSet);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return objCast;
        } catch (Throwable th) {
            if (z) {
                try {
                    C1768p.m5164c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2205a(final SharedPreferences.Editor editor) {
        try {
            if (!AbstractC1701q7.m4113i()) {
                editor.commit();
                return;
            }
            C1748l c1748l = f1283b;
            if (c1748l == null || c1748l.m4853s0() == null) {
                editor.apply();
                return;
            }
            C1552f6 c1552f6M4853s0 = f1283b.m4853s0();
            C1748l c1748l2 = f1283b;
            Objects.requireNonNull(editor);
            c1552f6M4853s0.m2604a((AbstractRunnableC1601k5) new C1788u6(c1748l2, true, "commitSharedPreferencesChanges", new Runnable() { // from class: com.applovin.impl.c5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    editor.commit();
                }
            }), C1552f6.b.OTHER);
        } catch (Throwable th) {
            C1768p.m5164c("SharedPreferencesManager", "Unable to apply changes", th);
            try {
                f1283b.m4764E().m4329a("SharedPreferencesManager", "persistChanges", th);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2206a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z = editor != null;
        if (!z) {
            editor = sharedPreferences.edit();
        }
        if (obj == null) {
            editor.remove(str);
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else {
            if (!(obj instanceof Set)) {
                C1768p.m5167h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
            editor.putStringSet(str, (Set) obj);
        }
        if (z) {
            return;
        }
        m2205a(editor);
    }

    /* JADX INFO: renamed from: b */
    public static void m2207b(C1511b5 c1511b5, Object obj, Context context) {
        m2206a(c1511b5.m2109a(), obj, m2200a(context), (SharedPreferences.Editor) null);
    }

    /* JADX INFO: renamed from: a */
    public Object m2208a(C1511b5 c1511b5) {
        Object objM2209a = m2209a(c1511b5, null);
        m2214b(c1511b5);
        return objM2209a;
    }

    /* JADX INFO: renamed from: a */
    public Object m2209a(C1511b5 c1511b5, Object obj) {
        return m2210a(c1511b5, obj, this.f1285a);
    }

    /* JADX INFO: renamed from: a */
    public Object m2210a(C1511b5 c1511b5, Object obj, SharedPreferences sharedPreferences) {
        return m2203a(c1511b5.m2109a(), obj, c1511b5.m2110b(), sharedPreferences);
    }

    /* JADX INFO: renamed from: a */
    public void m2211a(SharedPreferences sharedPreferences) {
        m2205a(sharedPreferences.edit().clear());
    }

    /* JADX INFO: renamed from: a */
    public void m2212a(String str, Object obj, SharedPreferences.Editor editor) {
        m2206a(str, obj, (SharedPreferences) null, editor);
    }

    /* JADX INFO: renamed from: a */
    public void m2213a(String str, Object obj, SharedPreferences sharedPreferences) {
        m2206a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    /* JADX INFO: renamed from: b */
    public void m2214b(C1511b5 c1511b5) {
        m2205a(this.f1285a.edit().remove(c1511b5.m2109a()));
    }

    /* JADX INFO: renamed from: b */
    public void m2215b(C1511b5 c1511b5, Object obj) {
        m2216b(c1511b5, obj, this.f1285a);
    }

    /* JADX INFO: renamed from: b */
    public void m2216b(C1511b5 c1511b5, Object obj, SharedPreferences sharedPreferences) {
        m2213a(c1511b5.m2109a(), obj, sharedPreferences);
    }
}
