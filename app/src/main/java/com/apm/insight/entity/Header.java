package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.adjust.sdk.Constants;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.p022l.C1428d;
import com.apm.insight.p022l.C1435k;
import com.apm.insight.p022l.C1436l;
import com.apm.insight.runtime.C1473o;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.C12460ra;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Header {

    /* JADX INFO: renamed from: a */
    private static final String[] f535a = {"version_code", "manifest_version_code", C12460ra.f31825b, "update_version_code"};

    /* JADX INFO: renamed from: d */
    private static String f536d = null;

    /* JADX INFO: renamed from: e */
    private static int f537e = -1;

    /* JADX INFO: renamed from: f */
    private static int f538f = -1;

    /* JADX INFO: renamed from: b */
    private Context f539b;

    /* JADX INFO: renamed from: c */
    private JSONObject f540c = new JSONObject();

    public Header(Context context) {
        this.f539b = context;
    }

    /* JADX INFO: renamed from: a */
    public static Header m1060a(long j) {
        Header headerM1061a;
        C1473o c1473oM1709a = C1473o.m1709a();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject jSONObjectM1712a = c1473oM1709a.m1712a(j);
        if (jSONObjectM1712a == null || jSONObjectM1712a.length() == 0) {
            headerM1061a = m1061a(C1390e.m1032g());
            headerM1061a.m1073c();
            try {
                headerM1061a.f540c.put("errHeader", 1);
            } catch (Throwable unused) {
            }
        } else {
            try {
                if (!jSONObjectM1712a.has(C12460ra.f31825b)) {
                    jSONObjectM1712a.put(C12460ra.f31825b, 4444);
                }
            } catch (Exception unused2) {
            }
            headerM1061a = new Header(C1390e.m1032g());
        }
        m1065b(headerM1061a);
        headerM1061a.m1072a(jSONObjectM1712a);
        return headerM1061a;
    }

    /* JADX INFO: renamed from: a */
    public static Header m1061a(Context context) {
        Header header = new Header(context);
        JSONObject jSONObject = header.f540c;
        try {
            jSONObject.put("sdk_version", 20089);
            jSONObject.put("sdk_version_name", "2008-20250701130429");
        } catch (Exception unused) {
        }
        return header;
    }

    /* JADX INFO: renamed from: a */
    public static Header m1062a(Header header) {
        addRuntimeHeader(header.f540c);
        return header;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1063a() {
        if (f537e == -1) {
            f537e = m1070g().contains("64") ? 1 : 0;
        }
        return f537e == 1;
    }

    public static void addOtherHeader(JSONObject jSONObject) {
        Object obj;
        if (jSONObject == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (C1428d.m1312b()) {
                sb.append("MIUI-");
            } else if (C1428d.m1314c()) {
                sb.append("FLYME-");
            } else {
                String strM1309a = C1428d.m1309a();
                if (C1428d.m1310a(strM1309a)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strM1309a)) {
                    sb.append(strM1309a);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", C1436l.m1408a());
        } catch (Throwable unused) {
        }
        try {
            DisplayMetrics displayMetrics = C1390e.m1032g().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            if (i == 120) {
                obj = "ldpi";
            } else if (i != 240) {
                obj = i != 320 ? "mdpi" : "xhdpi";
            } else {
                obj = "hdpi";
            }
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", obj);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused2) {
        }
        try {
            String language = C1390e.m1032g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put(C11540L6.f24911F, C11744X3.f26142d);
            jSONObject.put("device_id", C1390e.m1024c().m1639a());
            String str = Build.VERSION.RELEASE;
            if (!str.contains(".")) {
                str = str + ".0";
            }
            jSONObject.put("os_version", str);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str2 = Build.MODEL;
            String str3 = Build.BRAND;
            if (str2 == null) {
                str2 = str3;
            } else if (str3 != null && !str2.contains(str3)) {
                str2 = str3 + ' ' + str2;
            }
            jSONObject.put("device_model", str2);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", m1070g());
            Context contextM1032g = C1390e.m1032g();
            String packageName = contextM1032g.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = contextM1032g.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo.applicationInfo != null) {
                int i2 = packageInfo.applicationInfo.labelRes;
                if (i2 > 0) {
                    jSONObject.put("display_name", contextM1032g.getString(i2));
                } else {
                    jSONObject.put("display_name", contextM1032g.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        C1398d.m1121a(jSONObject);
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        try {
            jSONObject.put("access", C1435k.m1404a(C1390e.m1032g()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C1390e.m1032g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put(C11540L6.f24937Q0, networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Header m1064b(Context context) {
        Header headerM1061a = m1061a(context);
        m1062a(headerM1061a);
        m1065b(headerM1061a);
        headerM1061a.m1073c();
        headerM1061a.m1074d();
        headerM1061a.m1075e();
        return headerM1061a;
    }

    /* JADX INFO: renamed from: b */
    public static void m1065b(Header header) {
        if (header == null) {
            return;
        }
        addOtherHeader(header.f540c);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1066b() {
        if (f538f == -1) {
            f538f = m1070g().contains("86") ? 1 : 0;
        }
        return f538f == 1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1067b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1068c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1069d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String strOptString = jSONObject.optString(C12460ra.f31825b);
            if (TextUtils.isEmpty(strOptString)) {
                return true;
            }
            try {
                return Integer.parseInt(strOptString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static String m1070g() {
        if (f536d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                        sb.append(Build.SUPPORTED_ABIS[i]);
                        if (i != Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                } else {
                    sb = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f536d = "unknown";
                }
                f536d = sb.toString();
            } catch (Exception e) {
                C1373a.m874b((Throwable) e);
                f536d = "unknown";
            }
        }
        return f536d;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m1071a(Map<String, Object> map) {
        try {
            if (map == null) {
                return this.f540c;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!this.f540c.has(entry.getKey())) {
                    this.f540c.put(entry.getKey(), entry.getValue());
                }
            }
            String[] strArr = f535a;
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (map.containsKey(str)) {
                    try {
                        this.f540c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                    } catch (Throwable unused) {
                        this.f540c.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.f540c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
                } catch (Throwable unused2) {
                }
            }
            if (map.containsKey("iid")) {
                this.f540c.put("udid", map.get("iid"));
                this.f540c.remove("iid");
            }
            if (map.containsKey("version_name")) {
                this.f540c.put("app_version", map.get("version_name"));
                this.f540c.remove("version_name");
            }
        } catch (Throwable unused3) {
        }
        return this.f540c;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m1072a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f540c;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                this.f540c.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return this.f540c;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m1073c() {
        return m1071a(C1390e.m1012a().m1509a());
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m1074d() {
        try {
            this.f540c.put("device_id", C1390e.m1024c().m1639a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f540c;
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m1075e() {
        try {
            long jM1514f = C1390e.m1012a().m1514f();
            if (jM1514f > 0) {
                this.f540c.put("user_id", jM1514f);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f540c;
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m1076f() {
        return this.f540c;
    }
}
