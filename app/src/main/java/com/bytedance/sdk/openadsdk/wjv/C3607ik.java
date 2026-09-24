package com.bytedance.sdk.openadsdk.wjv;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.wjv.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3607ik {

    /* JADX INFO: renamed from: ik */
    private final String f13364ik;

    /* JADX INFO: renamed from: lr */
    private final Context f13365lr;

    /* JADX INFO: renamed from: ri */
    private SharedPreferences f13366ri;

    public C3607ik(Context context, String str) {
        this.f13365lr = context;
        this.f13364ik = str;
    }

    /* JADX INFO: renamed from: lr */
    private SharedPreferences m16715lr() {
        Context context;
        SharedPreferences sharedPreferences = this.f13366ri;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.f13364ik) || (context = this.f13365lr) == null) {
            return null;
        }
        try {
            this.f13366ri = context.getSharedPreferences(this.f13364ik, 0);
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
        return this.f13366ri;
    }

    /* JADX INFO: renamed from: lr */
    public long m16716lr(String str, long j) {
        try {
            SharedPreferences sharedPreferencesM16715lr = m16715lr();
            if (sharedPreferencesM16715lr != null && sharedPreferencesM16715lr.contains(str)) {
                return sharedPreferencesM16715lr.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            Log.i("SPUnit", this.f13364ik + th.getMessage());
            return j;
        }
    }

    /* JADX INFO: renamed from: ri */
    public int m16717ri(String str, int i) {
        try {
            SharedPreferences sharedPreferencesM16715lr = m16715lr();
            if (sharedPreferencesM16715lr != null && sharedPreferencesM16715lr.contains(str)) {
                return sharedPreferencesM16715lr.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            Log.i("SPUnit", this.f13364ik + th.getMessage());
            return i;
        }
    }

    /* JADX INFO: renamed from: ri */
    public <T> T m16718ri(String str, T t, InterfaceC3609lr.ri<T> riVar) {
        String string;
        T tMo16739lr;
        if (str != null && !str.isEmpty()) {
            try {
                SharedPreferences sharedPreferencesM16715lr = m16715lr();
                if (sharedPreferencesM16715lr != null && sharedPreferencesM16715lr.contains(str) && (string = sharedPreferencesM16715lr.getString(str, null)) != null && riVar != null && (tMo16739lr = riVar.mo16739lr(string)) != null) {
                    return tMo16739lr;
                }
            } catch (Throwable th) {
                Log.i("SPUnit", this.f13364ik + th.getMessage());
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: ri */
    public String m16719ri(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesM16715lr = m16715lr();
            if (sharedPreferencesM16715lr != null && sharedPreferencesM16715lr.contains(str)) {
                return sharedPreferencesM16715lr.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.f13364ik + th.getMessage());
            return str2;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16720ri() {
        SharedPreferences sharedPreferencesM16715lr = m16715lr();
        if (sharedPreferencesM16715lr != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesM16715lr.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16721ri(String str, long j) {
        try {
            SharedPreferences sharedPreferencesM16715lr = m16715lr();
            if (sharedPreferencesM16715lr != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesM16715lr.edit();
                editorEdit.putLong(str, j);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16722ri(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesM16715lr = m16715lr();
            if (sharedPreferencesM16715lr != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesM16715lr.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                Double d = (Double) obj;
                                d.doubleValue();
                                editorEdit.putFloat(next, d.floatValue());
                            } else {
                                editorEdit.putString(next, String.valueOf(obj));
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m16723ri(String str, boolean z) {
        try {
            SharedPreferences sharedPreferencesM16715lr = m16715lr();
            if (sharedPreferencesM16715lr != null && sharedPreferencesM16715lr.contains(str)) {
                return sharedPreferencesM16715lr.getBoolean(str, z);
            }
            return z;
        } catch (Throwable th) {
            Log.i("SPUnit", this.f13364ik + th.getMessage());
            return z;
        }
    }
}
