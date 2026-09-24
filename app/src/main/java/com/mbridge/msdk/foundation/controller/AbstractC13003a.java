package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.status.C12839b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.report.crashreport.C13140d;
import com.mbridge.msdk.foundation.same.report.crashreport.C13141e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13222s;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a */
/* JADX INFO: compiled from: BaseMBSDKContext.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13003a {

    /* JADX INFO: renamed from: q */
    public static final String f35475q = "c";

    /* JADX INFO: renamed from: r */
    public static HashMap<String, String> f35476r = new HashMap<>();

    /* JADX INFO: renamed from: s */
    public static C12839b f35477s;

    /* JADX INFO: renamed from: b */
    protected String f35479b;

    /* JADX INFO: renamed from: c */
    protected Context f35480c;

    /* JADX INFO: renamed from: d */
    protected String f35481d;

    /* JADX INFO: renamed from: e */
    private WeakReference<Activity> f35482e;

    /* JADX INFO: renamed from: f */
    private String f35483f;

    /* JADX INFO: renamed from: g */
    private int f35484g;

    /* JADX INFO: renamed from: j */
    private String f35487j;

    /* JADX INFO: renamed from: k */
    private String f35488k;

    /* JADX INFO: renamed from: l */
    private int f35489l;

    /* JADX INFO: renamed from: n */
    private WeakReference<Context> f35491n;

    /* JADX INFO: renamed from: o */
    private JSONObject f35492o;

    /* JADX INFO: renamed from: a */
    private final C13222s f35478a = new C13222s();

    /* JADX INFO: renamed from: h */
    private JSONObject f35485h = new JSONObject();

    /* JADX INFO: renamed from: i */
    private boolean f35486i = false;

    /* JADX INFO: renamed from: m */
    private ConcurrentHashMap<String, String> f35490m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p */
    private int f35493p = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$a */
    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13141e.m37317a(AbstractC13003a.this.f35480c).m37322a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$b */
    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13140d.m37312c();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$c */
    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC13003a abstractC13003a = AbstractC13003a.this;
                abstractC13003a.f35479b = (String) C13235y0.m37956a(abstractC13003a.f35480c, "sp_appId", "");
            } catch (Throwable th) {
                C13219q0.m37816b(AbstractC13003a.f35475q, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$d */
    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC13003a abstractC13003a = AbstractC13003a.this;
                abstractC13003a.f35487j = (String) C13235y0.m37956a(abstractC13003a.f35480c, "sp_appKey", "");
            } catch (Throwable th) {
                C13219q0.m37816b(AbstractC13003a.f35475q, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$e */
    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public interface e {
    }

    /* JADX INFO: renamed from: m */
    private void m36523m() {
        try {
            if (AbstractC13005b.m36562i() && C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objM37956a = C13235y0.m37956a(this.f35480c, MBridgeConstans.SP_GA_ID, "");
                Object objM37956a2 = C13235y0.m37956a(this.f35480c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objM37956a instanceof String) {
                    String str = (String) objM37956a;
                    if (TextUtils.isEmpty(str)) {
                        C13198g.m37689d();
                    } else {
                        C13198g.m37683a(str);
                    }
                    if (objM37956a2 instanceof Integer) {
                        C13198g.m37680a(((Integer) objM37956a2).intValue());
                    }
                }
            }
        } catch (Exception e2) {
            C13219q0.m37816b(f35475q, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo36528a(e eVar);

    /* JADX INFO: renamed from: b */
    public void m36534b(int i) {
        this.f35489l = i;
    }

    /* JADX INFO: renamed from: c */
    public void m36539c(int i) {
        this.f35493p = i;
    }

    /* JADX INFO: renamed from: d */
    public Context m36542d() {
        return this.f35480c;
    }

    /* JADX INFO: renamed from: e */
    public C13222s m36544e() {
        return this.f35478a;
    }

    /* JADX INFO: renamed from: f */
    public Context m36546f() {
        WeakReference<Context> weakReference = this.f35491n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: g */
    public int m36548g() {
        return this.f35484g;
    }

    /* JADX INFO: renamed from: h */
    public String m36549h() {
        return !TextUtils.isEmpty(this.f35488k) ? this.f35488k : "";
    }

    /* JADX INFO: renamed from: i */
    public String m36550i() {
        try {
            if (!TextUtils.isEmpty(this.f35481d)) {
                return this.f35481d;
            }
            Context context = this.f35480c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.f35481d = packageName;
            return packageName;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public String m36551j() {
        if (!TextUtils.isEmpty(this.f35488k)) {
            return this.f35488k;
        }
        Context context = this.f35480c;
        if (context != null) {
            return (String) C13235y0.m37956a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public JSONObject m36552k() {
        return this.f35492o;
    }

    /* JADX INFO: renamed from: l */
    public int m36553l() {
        return this.f35493p;
    }

    /* JADX INFO: renamed from: a */
    public WeakReference<Activity> m36525a() {
        return this.f35482e;
    }

    /* JADX INFO: renamed from: b */
    public void m36536b(e eVar) {
        try {
            C13211m0.m37722D(this.f35480c);
            mo36528a(eVar);
            C13636h.m39705a(this.f35480c, this.f35479b);
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    PackageManager packageManager = this.f35480c.getPackageManager();
                    C13211m0.m37740d(packageManager.getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                    PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 0);
                    C13211m0.m37744f(packageInfo != null ? packageInfo.versionName : "0");
                } catch (PackageManager.NameNotFoundException unused) {
                    C13211m0.m37740d(0);
                } catch (Throwable th) {
                    C13219q0.m37816b(f35475q, th.getMessage());
                }
            }
            try {
                C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
                if (c13635gM39718d == null) {
                    c13635gM39718d = C13636h.m39706b().m39708a();
                }
                C13222s c13222sM36544e = C13008c.m36588n().m36544e();
                if (c13222sM36544e != null && c13222sM36544e.m37828b() && c13635gM39718d != null && c13635gM39718d.m39404F() == 1) {
                    C13167a.m37544c().post(new a());
                }
                if (c13222sM36544e == null || !c13222sM36544e.m37827a()) {
                    return;
                }
                C13167a.m37544c().post(new b());
            } catch (Throwable th2) {
                C13219q0.m37816b(f35475q, th2.getMessage());
            }
        } catch (Exception e2) {
            C13219q0.m37816b(f35475q, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m36540c(e eVar) {
        if (this.f35486i) {
            return;
        }
        m36523m();
        try {
            JSONObject jSONObject = new JSONObject();
            this.f35492o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e2) {
            C13219q0.m37816b(f35475q, e2.getMessage());
        }
        m36536b(eVar);
    }

    /* JADX INFO: renamed from: d */
    public void m36543d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f35488k = str;
            Context context = this.f35480c;
            if (context != null) {
                C13235y0.m37957b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m36545e(String str) {
        Context context;
        try {
            this.f35479b = str;
            if (TextUtils.isEmpty(str) || (context = this.f35480c) == null) {
                return;
            }
            C13235y0.m37957b(context, "sp_appId", str);
        } catch (Exception e2) {
            C13219q0.m37816b(f35475q, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m36547f(String str) {
        Context context;
        try {
            this.f35487j = str;
            if (TextUtils.isEmpty(str) || (context = this.f35480c) == null) {
                return;
            }
            C13235y0.m37957b(context, "sp_appKey", str);
        } catch (Exception e2) {
            C13219q0.m37816b(f35475q, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36531a(WeakReference<Activity> weakReference) {
        this.f35482e = weakReference;
    }

    /* JADX INFO: renamed from: a */
    public void m36527a(Context context) {
        if (context instanceof Activity) {
            this.f35491n = new WeakReference<>(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36526a(int i) {
        this.f35484g = i;
    }

    /* JADX INFO: renamed from: a */
    public BitmapDrawable m36524a(String str, int i) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str2;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f35490m) == null || !concurrentHashMap.containsKey(str) || !C13223s0.m37831a().m37842a("w_m_r_l", true)) {
            return null;
        }
        String str3 = this.f35490m.get(str);
        BitmapDrawable bitmapDrawableM37948n = C13229v0.m37948n(str3);
        int i2 = TextUtils.isEmpty(str3) ? 2 : 1;
        if (TextUtils.isEmpty(str3)) {
            str2 = "get watermark failed";
        } else {
            str2 = bitmapDrawableM37948n != null ? "" : "str to bitmap failed";
        }
        C13148j.m37391a(str, i, i2, str2, bitmapDrawableM37948n == null ? 2 : 1, str3);
        return bitmapDrawableM37948n;
    }

    /* JADX INFO: renamed from: a */
    public void m36532a(JSONObject jSONObject) {
        this.f35492o = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m36529a(String str) {
        try {
            if (this.f35490m != null && !TextUtils.isEmpty(str) && this.f35490m.containsKey(str)) {
                this.f35490m.remove(str);
            }
        } catch (Exception e2) {
            C13219q0.m37816b(f35475q, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public String m36538c() {
        try {
            if (!TextUtils.isEmpty(this.f35487j)) {
                return this.f35487j;
            }
            C13167a.m37543b().execute(new d());
            return "";
        } catch (Throwable th) {
            C13219q0.m37816b(f35475q, th.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36530a(String str, JSONObject jSONObject) {
        if (C13223s0.m37831a().m37842a("w_m_r_l", true)) {
            try {
                if (this.f35485h == null) {
                    this.f35485h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.f35485h.put(next, jSONObject.get(next));
                    }
                }
                if (this.f35485h.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f35490m == null) {
                        this.f35490m = new ConcurrentHashMap<>();
                    }
                    this.f35490m.put(str, this.f35485h.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e2) {
                C13219q0.m37816b(f35475q, e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m36541c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f35481d = str;
    }

    /* JADX INFO: renamed from: b */
    public String m36533b() {
        try {
            if (!TextUtils.isEmpty(this.f35479b)) {
                return this.f35479b;
            }
            C13167a.m37543b().execute(new c());
            return "";
        } catch (Exception e2) {
            C13219q0.m37816b(f35475q, e2.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36537b(String str) {
        Context context;
        try {
            this.f35483f = str;
            if (TextUtils.isEmpty(str) || (context = this.f35480c) == null) {
                return;
            }
            C13235y0.m37957b(context, "applicationIds", str);
        } catch (Exception e2) {
            C13219q0.m37816b(f35475q, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36535b(Context context) {
        this.f35480c = context;
    }
}
