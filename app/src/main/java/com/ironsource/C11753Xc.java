package com.ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Xc */
/* JADX INFO: loaded from: classes6.dex */
public class C11753Xc {

    /* JADX INFO: renamed from: a */
    public static final String f26544a = "com.google.market";

    /* JADX INFO: renamed from: b */
    public static final String f26545b = "com.android.vending";

    /* JADX INFO: renamed from: c */
    public static final String f26546c = "isInstalled";

    /* JADX INFO: renamed from: d */
    private static final String f26547d = "Xc";

    /* JADX INFO: renamed from: e */
    private static final ArrayList<String> f26548e = new a();

    /* JADX INFO: renamed from: com.ironsource.Xc$a */
    class a extends ArrayList<String> {
        a() {
            add("com.android.vending");
            add(C11753Xc.f26544a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Xc$b */
    class b extends JSONObject {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f26549a;

        b(boolean z) throws JSONException {
            this.f26549a = z;
            put("isInstalled", z);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Xc$c */
    private enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{C11753Xc.f26544a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});


        /* JADX INFO: renamed from: h */
        private static final Map<String, c> f26555h = new HashMap();

        /* JADX INFO: renamed from: a */
        private final int f26557a;

        /* JADX INFO: renamed from: b */
        private final String[] f26558b;

        static {
            for (c cVar : values()) {
                for (String str : cVar.m27960d()) {
                    f26555h.put(str, cVar);
                }
            }
        }

        c(int i, String[] strArr) {
            this.f26557a = i;
            this.f26558b = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static ArrayList<String> m27958b() {
            return new ArrayList<>(f26555h.keySet());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public int m27959c() {
            return this.f26557a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public String[] m27960d() {
            return this.f26558b;
        }
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m27950a(Context context) {
        return m27951a(context, f26548e);
    }

    /* JADX INFO: renamed from: b */
    public static String m27953b(Context context) {
        Iterator<String> it = f26548e.iterator();
        while (it.hasNext()) {
            String strM27949a = m27949a(context, it.next());
            if (!TextUtils.isEmpty(strM27949a)) {
                return strM27949a;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    private static ArrayList<String> m27954c(Context context) {
        List<ApplicationInfo> listMo27877I = C11455Gb.m25891U().mo25842a().mo27877I(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : listMo27877I) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static Integer m27955d(Context context) {
        JSONObject jSONObjectM27951a = m27951a(context, (ArrayList<String>) c.m27958b());
        int iPow = 0;
        for (c cVar : c.values()) {
            for (String str : cVar.m27960d()) {
                JSONObject jSONObjectOptJSONObject = jSONObjectM27951a.optJSONObject(str);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                    iPow = (int) (((double) iPow) + Math.pow(2.0d, cVar.m27959c() - 1));
                    break;
                }
            }
        }
        return Integer.valueOf(iPow);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m27956e(Context context) {
        JSONObject jSONObjectM27950a = m27950a(context);
        Iterator<String> itKeys = jSONObjectM27950a.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject = jSONObjectM27950a.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static String m27949a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m27951a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> arrayListM27954c = m27954c(context);
            for (String str : arrayList) {
                jSONObject.put(str, m27952a(arrayListM27954c.contains(str.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            Log.d(f26547d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m27952a(boolean z) throws JSONException {
        return new b(z);
    }
}
