package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.M6 */
/* JADX INFO: loaded from: classes6.dex */
public class C11558M6 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12582w7 f25120a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap<String, Object> f25121b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f25122c;

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f25123d;

    /* JADX INFO: renamed from: com.ironsource.M6$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f25124a;

        a(Context context) {
            this.f25124a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C11558M6.this.m26490e(this.f25124a);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C11558M6.this.f25122c.set(false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.M6$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        static volatile C11558M6 f25126a = new C11558M6();

        private b() {
        }
    }

    private C11558M6() {
        this.f25122c = new AtomicBoolean(false);
        this.f25123d = new AtomicBoolean(false);
        this.f25120a = C11455Gb.m25891U().mo25842a();
        this.f25121b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: b */
    static C11558M6 m26488b() {
        return b.f25126a;
    }

    /* JADX INFO: renamed from: d */
    private void m26489d(Context context) {
        if (context == null || this.f25123d.getAndSet(true)) {
            return;
        }
        m26486a("auid", this.f25120a.mo27898e(context));
        m26486a(C11540L6.f24899B, this.f25120a.mo27912l());
        m26486a(C11540L6.f25013t, this.f25120a.mo27921q());
        m26486a(C11540L6.f24911F, this.f25120a.mo27899f());
        m26486a(C11540L6.f25001p, this.f25120a.mo27881M(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            m26486a(C11540L6.f24904C1, adQualitySdkVersion);
        }
        String strMo27905i = this.f25120a.mo27905i();
        if (strMo27905i != null) {
            m26486a(C11540L6.f24914G, strMo27905i.replaceAll("[^0-9/.]", ""));
            m26486a(C11540L6.f24922J, strMo27905i);
        }
        m26486a(C11540L6.f24956a, String.valueOf(this.f25120a.mo27897e()));
        String strMo27930v = this.f25120a.mo27930v(context);
        if (!TextUtils.isEmpty(strMo27930v)) {
            m26486a(C11540L6.f24937Q0, strMo27930v);
        }
        String strM25653e = C11409E1.m25653e(context);
        if (!TextUtils.isEmpty(strM25653e)) {
            m26486a(C11540L6.f24998o, strM25653e);
        }
        String strMo27926s = this.f25120a.mo27926s(context);
        if (!TextUtils.isEmpty(strMo27926s)) {
            m26486a(C11540L6.f25023w0, strMo27926s);
        }
        m26486a("bid", context.getPackageName());
        m26486a("mem", String.valueOf(this.f25120a.mo27924r(context)));
        m26486a(C11540L6.f24960b0, "2.0");
        m26486a(C11540L6.f24963c0, Long.valueOf(C11409E1.m25654f(context)));
        m26486a(C11540L6.f24957a0, Long.valueOf(C11409E1.m25651d(context)));
        m26486a(C11540L6.f24965d, C11409E1.m25647b(context));
        m26486a(C11540L6.f24932O, Integer.valueOf(C11676T3.m27505f(context)));
        m26486a(C11540L6.f24952Y, C11676T3.m27506g(context));
        m26486a("stid", C11753Xc.m27955d(context));
        m26486a(C11540L6.f24917H, "android");
        m26486a(C11540L6.f25031z, this.f25120a.mo27928t());
        m26486a("mThreshold", this.f25120a.mo27885a(this.f25120a.mo27918o(context)));
        m26486a(C11540L6.f24978h0, KotlinVersion.CURRENT.toString());
        m26484a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m26490e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strMo27878J = this.f25120a.mo27878J(context);
            if (!TextUtils.isEmpty(strMo27878J)) {
                m26486a(C11540L6.f24947V0, strMo27878J);
            }
            String strMo27894c = this.f25120a.mo27894c(context);
            if (TextUtils.isEmpty(strMo27894c)) {
                return;
            }
            m26486a(C11540L6.f25010s, Boolean.valueOf(Boolean.parseBoolean(strMo27894c)));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    private void m26491f(Context context) {
        if (context == null) {
            return;
        }
        m26485a(context);
        String strMo27934z = this.f25120a.mo27934z(context);
        if (!TextUtils.isEmpty(strMo27934z)) {
            m26486a(C11540L6.f24927L0, strMo27934z);
        } else if (m26487a(C11540L6.f24927L0)) {
            m26496b(C11540L6.f24927L0);
        }
        m26486a("idfi", this.f25120a.mo27907j(context));
        String strMo27896d = this.f25120a.mo27896d(context);
        if (!TextUtils.isEmpty(strMo27896d)) {
            m26486a(C11540L6.f25004q, strMo27896d.toUpperCase(Locale.getDefault()));
        }
        m26486a(C11540L6.f25007r, this.f25120a.mo27870B(context));
        String strMo27895d = this.f25120a.mo27895d();
        if (!TextUtils.isEmpty(strMo27895d)) {
            m26486a("tz", strMo27895d);
        }
        String strM27576b = C11693U3.m27576b(context);
        if (!TextUtils.isEmpty(strM27576b) && !strM27576b.equals("none")) {
            m26486a(C11540L6.f24983j, strM27576b);
        }
        String strM27579d = C11693U3.m27579d(context);
        if (!TextUtils.isEmpty(strM27579d)) {
            m26486a(C11540L6.f24986k, strM27579d);
        }
        m26486a("vpn", Boolean.valueOf(C11693U3.m27580e(context)));
        String strMo27876H = this.f25120a.mo27876H(context);
        if (!TextUtils.isEmpty(strMo27876H)) {
            m26486a("icc", strMo27876H);
        }
        int iMo27927t = this.f25120a.mo27927t(context);
        if (iMo27927t >= 0) {
            m26486a(C11540L6.f24988k1, Integer.valueOf(iMo27927t));
        }
        m26486a(C11540L6.f24991l1, this.f25120a.mo27931w(context));
        m26486a(C11540L6.f24994m1, this.f25120a.mo27875G(context));
        m26486a(C11540L6.f24981i0, Float.valueOf(this.f25120a.mo27874F(context)));
        m26486a(C11540L6.f24992m, String.valueOf(this.f25120a.mo27903h()));
        m26486a(C11540L6.f24938R, Integer.valueOf(this.f25120a.mo27909k()));
        m26486a(C11540L6.f24936Q, Integer.valueOf(this.f25120a.mo27892c()));
        m26486a(C11540L6.f24953Y0, String.valueOf(this.f25120a.mo27883a()));
        m26486a(C11540L6.f24979h1, String.valueOf(this.f25120a.mo27913m()));
        m26486a("mcc", Integer.valueOf(C11676T3.m27501b(context)));
        m26486a("mnc", Integer.valueOf(C11676T3.m27502c(context)));
        m26486a(C11540L6.f24942T, Boolean.valueOf(this.f25120a.mo27908j()));
        m26486a(C11540L6.f24974g, Boolean.valueOf(this.f25120a.mo27872D(context)));
        m26486a(C11540L6.f24977h, Integer.valueOf(this.f25120a.mo27873E(context)));
        m26486a(C11540L6.f24959b, Boolean.valueOf(this.f25120a.mo27900f(context)));
        m26486a(C11540L6.f24924K, Boolean.valueOf(this.f25120a.mo27906i(context)));
        m26486a("rt", Boolean.valueOf(this.f25120a.mo27920p()));
        m26486a(C11540L6.f24954Z, String.valueOf(this.f25120a.mo27923r()));
        m26486a(C11540L6.f24968e, Integer.valueOf(this.f25120a.mo27911l(context)));
        m26486a(C11540L6.f24955Z0, Boolean.valueOf(this.f25120a.mo27879K(context)));
        m26486a(C11540L6.f24962c, this.f25120a.mo27915n(context));
        m26486a(C11540L6.f24966d0, this.f25120a.mo27925s());
        C11335A c11335a = new C11335A(C11455Gb.m25891U().mo25852s());
        HashMap map = new HashMap();
        c11335a.mo25235a(map);
        m26486a(C11540L6.f24909E0, map);
        m26486a(C11540L6.f24926L, ConfigFile.getConfigFile().getPluginType());
        m26486a(C11540L6.f24928M, ConfigFile.getConfigFile().getPluginVersion());
        m26486a(C11540L6.f24930N, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    /* JADX INFO: renamed from: a */
    protected void m26494a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    m26486a(str, map.get(str));
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    protected void m26498c(Context context) {
        try {
            m26489d(context);
            m26491f(context);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    protected void m26497b(String str, Object obj) {
        m26486a(str, obj);
    }

    /* JADX INFO: renamed from: b */
    protected void m26496b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f25121b.remove(str);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    protected JSONObject m26495b(Context context) throws JSONException {
        m26491f(context);
        return new JSONObject(C11594O6.m26728a(this.f25121b));
    }

    /* JADX INFO: renamed from: a */
    protected void m26492a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.f25121b.get(str);
            if (!(obj instanceof JSONArray)) {
                m26486a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONArray2.put(jSONArray.get(i));
            }
            m26486a(str, (Object) jSONArray2);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m26493a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f25121b.get(str);
            if (!(obj instanceof JSONObject)) {
                m26486a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            m26486a(str, (Object) jSONObject2);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m26486a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f25121b.put(str, obj);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m26487a(String str) {
        return str != null && this.f25121b.containsKey(str);
    }

    /* JADX INFO: renamed from: a */
    private void m26485a(Context context) {
        if (this.f25122c.get()) {
            return;
        }
        try {
            this.f25122c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            this.f25122c.set(false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m26484a() {
        String strMo28057a = C12102ag.f30052a.mo28057a();
        if (strMo28057a != null) {
            HashMap map = new HashMap();
            map.put("sdk", strMo28057a);
            HashMap map2 = new HashMap();
            map2.put(C11540L6.f24919H1, map);
            Map<String, Object> map3 = new HashMap<>();
            map3.put(C11540L6.f24910E1, map2);
            m26494a(map3);
        }
    }
}
