package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2726ri;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C3089aw {

    /* JADX INFO: renamed from: ik */
    private static String f9707ik;

    /* JADX INFO: renamed from: ka */
    private static boolean f9708ka;

    /* JADX INFO: renamed from: lr */
    private static String f9709lr;

    /* JADX INFO: renamed from: ri */
    private static String f9710ri;

    /* JADX INFO: renamed from: di */
    private static void m12370di(Context context) {
        if (m12374ka(context) == null) {
            return;
        }
        String strM13508lr = C3215ik.m13505ri().m13508lr("abcd", (String) null);
        if (TextUtils.isEmpty(strM13508lr)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM13508lr);
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString("message");
            if (iOptInt == 3) {
                String strM10270ik = C2726ri.m10270ik(strOptString);
                if (TextUtils.isEmpty(strM10270ik)) {
                    return;
                }
                f9710ri = new JSONObject(strM10270ik).optString("abcd");
                m12378ri();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: fi */
    private static void m12371fi(Context context) {
        if (f9708ka || m12374ka(context) == null) {
            return;
        }
        f9709lr = String.valueOf(Build.TIME);
        f9707ik = C3215ik.m13505ri().m13508lr("uuid", (String) null);
        f9708ka = true;
    }

    /* JADX INFO: renamed from: ik */
    public static String m12373ik(Context context) {
        if (TextUtils.isEmpty(f9707ik) && !f9708ka) {
            synchronized (C3089aw.class) {
                if (!f9708ka) {
                    m12371fi(context);
                }
            }
        }
        return f9707ik;
    }

    /* JADX INFO: renamed from: ka */
    private static Context m12374ka(Context context) {
        return context == null ? C3299nr.m14642ri() : context;
    }

    /* JADX INFO: renamed from: lr */
    public static String m12375lr() {
        try {
            Locale locale = Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault();
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            return Locale.SIMPLIFIED_CHINESE.toString().equals(string) ? "zh" : "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: lr */
    public static String m12376lr(Context context) {
        if (f9709lr == null && !f9708ka) {
            synchronized (C3089aw.class) {
                if (!f9708ka) {
                    m12371fi(context);
                }
            }
        }
        return f9709lr;
    }

    /* JADX INFO: renamed from: ri */
    public static String m12377ri(Context context) {
        if (!TextUtils.isEmpty(f9710ri)) {
            return f9710ri;
        }
        m12370di(context);
        return f9710ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m12378ri() {
        if (TextUtils.isEmpty(f9710ri)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("update_did") { // from class: com.bytedance.sdk.openadsdk.core.aw.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", C3089aw.f9710ri);
                    C3215ik.m13505ri().m13512ri("abcd", C2726ri.m10278ri(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m12379ri(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(f9710ri)) {
                f9710ri = str;
            }
            m12378ri();
        }
        if (TextUtils.isEmpty(f9710ri)) {
            return;
        }
        C3324ik.m14913lr(f9710ri);
        C3129co.m13035ri(f9710ri);
    }
}
