package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3114ik;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3564co;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3304qt {

    /* JADX INFO: renamed from: lr */
    public static final Set<String> f11513lr = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.qt.1
        {
            add("8025677");
            add("5001121");
        }
    };

    /* JADX INFO: renamed from: ri */
    public static bgr f11514ri;

    /* JADX INFO: renamed from: sf */
    private static boolean f11515sf;

    /* JADX INFO: renamed from: aw */
    private boolean f11516aw;
    private String bgr;

    /* JADX INFO: renamed from: co */
    private String f11517co;

    /* JADX INFO: renamed from: di */
    private String f11518di;

    /* JADX INFO: renamed from: fi */
    private String f11519fi;

    /* JADX INFO: renamed from: ik */
    private boolean f11520ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private String f11521ka;

    /* JADX INFO: renamed from: mj */
    private String f11522mj;

    /* JADX INFO: renamed from: qt */
    private int f11523qt;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri> slm;

    /* JADX INFO: renamed from: vr */
    private C3114ik f11524vr;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.qt$ri */
    private static class ri {

        /* JADX INFO: renamed from: ri */
        private static final C3304qt f11527ri = new C3304qt();
    }

    private C3304qt() {
        this.f11520ik = false;
        this.jbs = 0;
        this.f11523qt = -1;
        this.slm = null;
    }

    /* JADX INFO: renamed from: ac */
    public static boolean m14664ac() {
        return f11515sf;
    }

    /* JADX INFO: renamed from: co */
    private static JSONObject m14665co(String str) {
        String strM16058lr = C3535ri.m16058lr("sp_global_file", str, (String) null);
        if (TextUtils.isEmpty(strM16058lr)) {
            return null;
        }
        try {
            return new JSONObject(strM16058lr);
        } catch (JSONException e) {
            C2707ac.m10196ik("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: di */
    public static int m14666di() {
        try {
            String strM14673ri = m14673ri("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strM14673ri)) {
                return 0;
            }
            return Integer.valueOf(strM14673ri).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    /* JADX INFO: renamed from: fi */
    public static int m14667fi() {
        try {
            String strM14673ri = m14673ri("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strM14673ri)) {
                return 0;
            }
            return Integer.valueOf(strM14673ri).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static void ihz() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            f11515sf = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jbs(String str) {
        if (TextUtils.isEmpty(this.f11522mj)) {
            this.f11522mj = str;
            return;
        }
        try {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray(this.f11522mj);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString)) {
                        map.put(strOptString, jSONObjectOptJSONObject);
                    }
                }
            }
            JSONArray jSONArray2 = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i2);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                    String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                        map.put(strOptString2, jSONObjectOptJSONObject2);
                    }
                }
            }
            Collection collectionValues = map.values();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                jSONArray3.put((JSONObject) it.next());
            }
            this.f11522mj = jSONArray3.toString();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: ka */
    public static Pair<String, Long> m14668ka(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectM14665co = m14665co(str);
            if (jSONObjectM14665co == null) {
                return null;
            }
            return new Pair<>(jSONObjectM14665co.getString("value"), Long.valueOf(jSONObjectM14665co.getLong("time")));
        } catch (JSONException e) {
            C2707ac.m10196ik("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static C3304qt m14669lr() {
        return ri.f11527ri;
    }

    /* JADX INFO: renamed from: lr */
    public static void m14670lr(int i) {
        if (i >= 0) {
            m14677ri("config_fail_times", String.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: qt */
    private static void m14671qt(String str) {
        bgr bgrVar;
        if (TextUtils.isEmpty(str) && (bgrVar = f11514ri) != null) {
            bgrVar.mo12646ri(4000, "appid cannot be empty");
        }
        C2707ac.m10196ik("TTAD.GlobalInfo", "appid cannot be empty");
    }

    /* JADX INFO: renamed from: ri */
    private String m14672ri(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m14673ri(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectM14665co = m14665co(str);
            if (jSONObjectM14665co == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectM14665co.getLong("time") <= j) {
                return jSONObjectM14665co.getString("value");
            }
        } catch (JSONException e) {
            C2707ac.m10196ik("TTAD.GlobalInfo", e.getMessage());
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public static void m14674ri(int i) {
        if (i >= 0) {
            m14677ri("domain_index", String.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14675ri(bgr bgrVar) {
        f11514ri = bgrVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m14677ri(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            C3535ri.m16077ri("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            C2707ac.m10196ik("TTAD.GlobalInfo", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: sf */
    private static void m14678sf(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        bgr bgrVar = f11514ri;
        if (bgrVar != null) {
            bgrVar.mo12646ri(4000, "Data is very long, the longest is 1000");
        }
        C2707ac.m10196ik("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public static boolean xha(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    /* JADX INFO: renamed from: aw */
    public C3114ik m14679aw() {
        if (this.f11524vr == null) {
            this.f11524vr = new C3114ik(10, 8);
        }
        return this.f11524vr;
    }

    public boolean bgr() {
        return true;
    }

    /* JADX INFO: renamed from: bu */
    public boolean m14680bu() {
        return "com.union_test.internationad".equals(C3571ig.m16435di());
    }

    /* JADX INFO: renamed from: co */
    public String m14681co() {
        return this.f11522mj;
    }

    /* JADX INFO: renamed from: di */
    public void m14682di(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.slm == null) {
                return;
            }
            this.slm.remove(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: fi */
    public com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri m14683fi(String str) {
        try {
            if (this.slm == null || str == null) {
                return null;
            }
            return this.slm.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m14684fi(int i) {
        this.jbs = i;
    }

    /* JADX INFO: renamed from: ik */
    public void m14685ik(int i) {
        this.xha = i;
    }

    /* JADX INFO: renamed from: ik */
    public void m14686ik(final String str) {
        m14678sf(str);
        if (com.bytedance.sdk.openadsdk.utils.dzy.m16391di()) {
            C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qt.2
                @Override // java.lang.Runnable
                public void run() {
                    C3304qt.this.jbs(str);
                }
            });
        } else {
            jbs(str);
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m14687ik(boolean z) {
        this.f11520ik = z;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m14688ik() {
        return C3535ri.m16080ri("sp_global_file", "sdk_activate_init", true);
    }

    public int jbs() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ka */
    public String m14689ka() {
        if (TextUtils.isEmpty(this.f11521ka)) {
            String strM14673ri = m14673ri("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strM14673ri)) {
                this.f11521ka = strM14673ri;
            }
        }
        return this.f11521ka;
    }

    /* JADX INFO: renamed from: ka */
    public void m14690ka(int i) {
        this.f11523qt = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m14691lr(String str) {
        this.f11519fi = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m14677ri("mediation_info", str);
    }

    /* JADX INFO: renamed from: lr */
    public void m14692lr(boolean z) {
        C3535ri.m16073ri("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: mj */
    public String m14693mj() {
        if (TextUtils.isEmpty(this.f11518di)) {
            this.f11518di = m14672ri(C3299nr.m14642ri());
        }
        return this.f11518di;
    }

    /* JADX INFO: renamed from: mj */
    public void m14694mj(String str) {
        this.f11517co = str;
    }

    /* JADX INFO: renamed from: nr */
    public String m14695nr() {
        if (!TextUtils.isEmpty(this.bgr)) {
            return this.bgr;
        }
        String strM16378ri = C3564co.m16378ri();
        this.bgr = strM16378ri;
        if (!TextUtils.isEmpty(strM16378ri)) {
            return this.bgr;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        C3564co.m16379ri(strValueOf);
        this.bgr = strValueOf;
        return strValueOf;
    }

    /* JADX INFO: renamed from: qt */
    public int m14696qt() {
        return this.f11523qt;
    }

    /* JADX INFO: renamed from: ri */
    public void m14697ri(String str) {
        m14671qt(str);
        this.f11521ka = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m14677ri("app_id", str);
    }

    /* JADX INFO: renamed from: ri */
    public void m14698ri(String str, com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri interfaceC3266ri) {
        try {
            if (TextUtils.isEmpty(str) || interfaceC3266ri == null) {
                return;
            }
            if (this.slm == null) {
                synchronized (C3304qt.class) {
                    if (this.slm == null) {
                        this.slm = new ConcurrentHashMap<>();
                    }
                }
            }
            if (this.slm != null) {
                this.slm.put(str, interfaceC3266ri);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14699ri(boolean z) {
        this.f11516aw = z;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m14700ri() {
        return this.f11516aw;
    }

    /* JADX INFO: renamed from: sf */
    public boolean m14701sf() {
        int i = this.f11523qt;
        return i < -1 || i > 1;
    }

    public boolean slm() {
        return "5001121".contains(this.f11521ka);
    }

    public void tan() {
        try {
            if (this.slm == null || this.slm.size() != 0) {
                return;
            }
            this.slm = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: uq */
    public String m14702uq() {
        return this.f11517co;
    }

    /* JADX INFO: renamed from: vr */
    public boolean m14703vr() {
        return f11513lr.contains(this.f11521ka);
    }

    public String xha() {
        String str = this.f11519fi;
        if (str != null) {
            return str;
        }
        String strM14673ri = m14673ri("mediation_info", Long.MAX_VALUE);
        this.f11519fi = strM14673ri;
        if (strM14673ri == null) {
            this.f11519fi = "";
        }
        return this.f11519fi;
    }
}
