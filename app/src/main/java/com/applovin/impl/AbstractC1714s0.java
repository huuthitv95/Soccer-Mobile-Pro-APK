package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11676T3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.s0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1714s0 {

    /* JADX INFO: renamed from: a */
    private static final int[] f2783a = {7, 4, 2, 1, 11};

    /* JADX INFO: renamed from: b */
    private static final int[] f2784b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* JADX INFO: renamed from: c */
    private static final int[] f2785c = {15, 13};

    /* JADX INFO: renamed from: d */
    private static final int[] f2786d = {20};

    /* JADX INFO: renamed from: a */
    public static String m4308a(C1748l c1748l) {
        return m4310a((String) c1748l.m4801a(C1831z4.f3985m0), ((Boolean) c1748l.m4801a(C1831z4.f3970k3)).booleanValue() ? "5.0/ad" : "4.0/ad", c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static String m4309a(String str, C1748l c1748l) {
        return m4310a((String) c1748l.m4801a(C1831z4.f4003o0), str, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static String m4310a(String str, String str2, C1748l c1748l) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        return str + str2;
    }

    /* JADX INFO: renamed from: a */
    public static void m4311a(int i, C1748l c1748l) {
        if (i == 401) {
            C1768p.m5167h("AppLovinSdk", "SDK key \"" + c1748l.m4839k0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i == 418) {
            c1748l.m4849q0().m1876a(C1831z4.f3912e, Boolean.TRUE);
            c1748l.m4849q0().m1881e();
        } else if (i >= 400 && i < 500) {
            if (((Boolean) c1748l.m4801a(C1831z4.f3930g)).booleanValue()) {
                c1748l.m4791V0();
            }
        } else if (i == -1 && ((Boolean) c1748l.m4801a(C1831z4.f3930g)).booleanValue()) {
            c1748l.m4791V0();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4312a(JSONObject jSONObject, C1748l c1748l) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C1748l.m4756p()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    C1521c5.m2206a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            if (((Boolean) c1748l.m4801a(C1831z4.f3733H6)).booleanValue()) {
                C1521c5.m2205a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4313a(JSONObject jSONObject, boolean z, C1748l c1748l) {
        c1748l.m4856u().m4709a(jSONObject, z);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4314a(int i) {
        return i < 200 || i >= 300;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4315a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4316a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo networkInfoM4318b = m4318b(context);
        if (networkInfoM4318b != null) {
            return networkInfoM4318b.isConnected();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4317a(InputStream inputStream, C1748l c1748l) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) c1748l.m4801a(C1831z4.f3907d3)).intValue()];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: b */
    private static NetworkInfo m4318b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m4319b(C1748l c1748l) {
        return m4310a((String) c1748l.m4801a(C1831z4.f3976l0), ((Boolean) c1748l.m4801a(C1831z4.f3970k3)).booleanValue() ? "5.0/ad" : "4.0/ad", c1748l);
    }

    /* JADX INFO: renamed from: b */
    public static String m4320b(String str, C1748l c1748l) {
        return m4310a((String) c1748l.m4801a(C1831z4.f3994n0), str, c1748l);
    }

    /* JADX INFO: renamed from: b */
    public static void m4321b(JSONObject jSONObject, C1748l c1748l) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            c1748l.m4818b(C1511b5.f1150H, string);
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5175d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Map m4322c(C1748l c1748l) {
        HashMap map = new HashMap();
        String str = (String) c1748l.m4801a(C1831z4.f3957j);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) c1748l.m4801a(C1831z4.f3999n5)).booleanValue()) {
            map.put("api_key", c1748l.m4839k0());
        }
        map.putAll(AbstractC1701q7.m4042a(c1748l.m4759B().m4944e()));
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static void m4323c(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        try {
            if (jSONObject.has("settings")) {
                C1484a5 c1484a5M4849q0 = c1748l.m4849q0();
                if (jSONObject.isNull("settings")) {
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                c1484a5M4849q0.m1877a(jSONObject2);
                c1484a5M4849q0.m1881e();
                String strM5752b = C1831z4.f3765L6.m5752b();
                if (JsonUtils.valueExists(jSONObject2, strM5752b)) {
                    C1521c5.m2207b(C1511b5.f1152J, JsonUtils.getBoolean(jSONObject2, strM5752b, Boolean.FALSE), C1748l.m4756p());
                }
            }
        } catch (JSONException e) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("ConnectionUtils", "Unable to parse settings out of API response", e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m4324d(C1748l c1748l) {
        return m4310a((String) c1748l.m4801a(C1831z4.f3985m0), "4.0/ad", c1748l);
    }

    /* JADX INFO: renamed from: e */
    public static String m4325e(C1748l c1748l) {
        return m4310a((String) c1748l.m4801a(C1831z4.f3976l0), "4.0/ad", c1748l);
    }

    /* JADX INFO: renamed from: f */
    public static Long m4326f(C1748l c1748l) {
        C1704r0.d dVarM4141a = c1748l.m4862x().m4141a();
        if (dVarM4141a == null) {
            return null;
        }
        double dM4085c = AbstractC1701q7.m4085c(dVarM4141a.m4154b());
        double dM4093d = AbstractC1701q7.m4093d(dVarM4141a.m4152a());
        if (dM4093d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return null;
        }
        return Long.valueOf((long) (dM4085c / dM4093d));
    }

    /* JADX INFO: renamed from: g */
    public static String m4327g(C1748l c1748l) {
        NetworkInfo networkInfoM4318b = m4318b(C1748l.m4756p());
        if (networkInfoM4318b != null) {
            int type = networkInfoM4318b.getType();
            int subtype = networkInfoM4318b.getSubtype();
            if (type == 1) {
                return C11676T3.f25719b;
            }
            if (type == 0) {
                if (m4315a(subtype, f2783a)) {
                    return "2g";
                }
                if (m4315a(subtype, f2784b)) {
                    return C11676T3.f25718a;
                }
                if (m4315a(subtype, f2785c)) {
                    return "4g";
                }
                return m4315a(subtype, f2786d) ? "5g" : "mobile";
            }
        }
        return "unknown";
    }
}
