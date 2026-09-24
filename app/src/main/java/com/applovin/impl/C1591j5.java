package com.applovin.impl;

import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.j5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1591j5 {

    /* JADX INFO: renamed from: a */
    private final JSONObject f1894a;

    /* JADX INFO: renamed from: b */
    private final Object f1895b = new Object();

    public C1591j5(JSONObject jSONObject) {
        this.f1894a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public double m2990a(String str, double d) {
        double d2;
        synchronized (this.f1895b) {
            d2 = JsonUtils.getDouble(this.f1894a, str, d);
        }
        return d2;
    }

    /* JADX INFO: renamed from: a */
    public float m2991a(String str, float f) {
        float f2;
        synchronized (this.f1895b) {
            f2 = JsonUtils.getFloat(this.f1894a, str, f);
        }
        return f2;
    }

    /* JADX INFO: renamed from: a */
    public int m2992a(String str, int i) {
        int i2;
        synchronized (this.f1895b) {
            i2 = JsonUtils.getInt(this.f1894a, str, i);
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public long m2993a(String str, long j) {
        long j2;
        synchronized (this.f1895b) {
            j2 = JsonUtils.getLong(this.f1894a, str, j);
        }
        return j2;
    }

    /* JADX INFO: renamed from: a */
    public Boolean m2994a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f1895b) {
            bool2 = JsonUtils.getBoolean(this.f1894a, str, bool);
        }
        return bool2;
    }

    /* JADX INFO: renamed from: a */
    public Object m2995a(Function function) {
        Object objApply;
        synchronized (this.f1895b) {
            objApply = function.apply(this);
        }
        return objApply;
    }

    /* JADX INFO: renamed from: a */
    public String m2996a(String str, String str2) {
        String string;
        synchronized (this.f1895b) {
            string = JsonUtils.getString(this.f1894a, str, str2);
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    public List m2997a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f1895b) {
            integerList = JsonUtils.getIntegerList(this.f1894a, str, list);
        }
        return integerList;
    }

    /* JADX INFO: renamed from: a */
    public JSONArray m2998a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f1895b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f1894a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m2999a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f1895b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f1894a);
        }
        return jSONObjectDeepCopy;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m3000a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f1895b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f1894a, str, jSONObject);
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: a */
    public void m3001a(Consumer consumer) {
        synchronized (this.f1895b) {
            consumer.accept(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3002a(String str, Object obj) {
        synchronized (this.f1895b) {
            JsonUtils.putObject(this.f1894a, str, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3003a(String str, boolean z) {
        synchronized (this.f1895b) {
            JsonUtils.putBoolean(this.f1894a, str, z);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m3004a(String str) {
        boolean zHas;
        synchronized (this.f1895b) {
            zHas = this.f1894a.has(str);
        }
        return zHas;
    }

    /* JADX INFO: renamed from: b */
    public Object m3005b(String str) {
        Object objOpt;
        synchronized (this.f1895b) {
            objOpt = this.f1894a.opt(str);
        }
        return objOpt;
    }

    /* JADX INFO: renamed from: b */
    public List m3006b(String str, List list) {
        List<String> stringList;
        synchronized (this.f1895b) {
            stringList = JsonUtils.getStringList(this.f1894a, str, list);
        }
        return stringList;
    }

    /* JADX INFO: renamed from: b */
    public void m3007b(String str, int i) {
        synchronized (this.f1895b) {
            JsonUtils.putInt(this.f1894a, str, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3008b(String str, long j) {
        synchronized (this.f1895b) {
            JsonUtils.putLong(this.f1894a, str, j);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3009b(String str, String str2) {
        synchronized (this.f1895b) {
            JsonUtils.putString(this.f1894a, str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3010c(String str) {
        synchronized (this.f1895b) {
            this.f1894a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f1895b) {
            string = this.f1894a.toString();
        }
        return string;
    }
}
