package com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.C3274aw;
import com.bytedance.sdk.openadsdk.core.model.C3278di;
import com.bytedance.sdk.openadsdk.core.model.C3298zf;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.slm;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3569fi;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.facebook.share.internal.ShareConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ihz.ri.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3372lr implements InterfaceC3370ik {

    /* JADX INFO: renamed from: ik */
    private final WeakReference<Context> f11981ik;

    /* JADX INFO: renamed from: lr */
    protected int f11982lr;

    /* JADX INFO: renamed from: ri */
    protected String f11983ri;

    public C3372lr(Context context, String str) {
        this.f11981ik = new WeakReference<>(context);
        this.f11983ri = str;
        "====tag===".concat(String.valueOf(str));
        if (C3299nr.m14642ri() == null) {
            C3299nr.m14641lr(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public void m15241fi(wjv wjvVar) {
        if (m15254lr(wjvVar)) {
            wjvVar.m14382di(true);
            C3569fi.m16420ri(wjvVar);
            return;
        }
        if (mo15237ka(wjvVar)) {
            wjvVar.m14382di(true);
            C3569fi.m16420ri(wjvVar);
            return;
        }
        if (m15257ri(wjvVar, false)) {
            C3569fi.m16420ri(wjvVar);
            return;
        }
        if (mo15236ik(wjvVar)) {
            wjvVar.m14382di(true);
            C3569fi.m16420ri(wjvVar);
        } else {
            if (wjvVar.tyz() != null || wjvVar.smj() == null) {
                return;
            }
            C3214ig.m13497ri(m15255ri(), wjvVar.smj(), wjvVar, C3571ig.m16470ri(this.f11983ri), this.f11983ri, true);
            wjvVar.m14382di(true);
            C3569fi.m16420ri(wjvVar);
        }
    }

    /* JADX INFO: renamed from: lr */
    private static boolean m15242lr() {
        return false;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m15243lr(wjv wjvVar, Context context, boolean z) {
        String strM14069ik;
        IPBroadcastReceiver iPBroadcastReceiverM15817ri;
        if (wjvVar != null && context != null) {
            try {
                C3298zf c3298zfM14562xz = wjvVar.m14562xz();
                if (c3298zfM14562xz != null && !TextUtils.isEmpty(c3298zfM14562xz.m14631qt())) {
                    if (c3298zfM14562xz.jbs() && m15250ri(wjvVar, context, z)) {
                        return true;
                    }
                    if (c3298zfM14562xz.xha() || c3298zfM14562xz.m14630mj()) {
                        if (wjvVar.m14458nr() == 1) {
                            strM14069ik = c3298zfM14562xz.m14632ri();
                        } else {
                            strM14069ik = (wjvVar.tyz() == null || TextUtils.isEmpty(wjvVar.tyz().m14069ik())) ? null : wjvVar.tyz().m14069ik();
                        }
                        if (!TextUtils.isEmpty(strM14069ik) && (iPBroadcastReceiverM15817ri = IPBroadcastReceiver.m15817ri(context, wjvVar)) != null) {
                            iPBroadcastReceiverM15817ri.m15823ri(strM14069ik, wjvVar);
                        }
                    }
                    final boolean zM15260ri = C3373ri.m15260ri(context, c3298zfM14562xz.m14631qt(), wjvVar, C3571ig.m16454lr(wjvVar), m15245ri(wjvVar, z, c3298zfM14562xz), true);
                    dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zM15260ri) {
                                C3304qt.m14677ri("oem_store", "1");
                            } else {
                                C3304qt.m14677ri("oem_store", "-2");
                            }
                        }
                    });
                    return zM15260ri;
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("GPDownLoader", th.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    private static Intent m15244ri(Context context, C3298zf c3298zf) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strM14624ka = c3298zf.m14624ka();
            if (TextUtils.isEmpty(strM14624ka)) {
                intent.setPackage("com.android.vending");
            } else {
                intent.setPackage(strM14624ka);
            }
            intent.setData(Uri.parse(c3298zf.m14631qt()));
            boolean z = true;
            if (c3298zf.m14627lr() != 1) {
                z = false;
            }
            intent.putExtra("overlay", z);
            if (TextUtils.isEmpty(c3298zf.m14621ik())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", c3298zf.m14621ik());
            }
            c3298zf.m14634ri(intent);
            return intent;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static Map<String, Object> m15245ri(wjv wjvVar, boolean z, C3298zf c3298zf) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", c3298zf.m14617di());
            jSONObject.put("from_web", z ? 1 : 0);
            jSONObject.put("is_w2a", wjvVar.m14458nr());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: ri */
    private void m15246ri(wjv wjvVar, Map<String, Object> map) {
        if (wjvVar != null && wjvVar.m14565yv() == 0) {
            map.put("auto_click", Boolean.valueOf((wjvVar == null || wjvVar.tan()) ? false : true));
        }
        if (wjvVar != null && wjvVar.m14565yv() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.f11982lr >= 11));
        }
        map.put("can_query_install", Integer.valueOf(m15242lr() ? 1 : 0));
    }

    /* JADX INFO: renamed from: ri */
    private static void m15248ri(final JSONObject jSONObject, wjv wjvVar, String str, final int i) {
        try {
            C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, str, "gp_mini_card_status", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.2
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ri */
                public JSONObject mo10798ri() {
                    try {
                        jSONObject.put("status", i);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15249ri(Context context, String str, String str2, String str3, wjv wjvVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                C3414ik.m15522lr(wjvVar, str3, "store_open", (JSONObject) null);
                C3569fi.m16420ri(wjvVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(String.valueOf(str2)));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        C3414ik.m15522lr(wjvVar, str3, "store_open", (JSONObject) null);
                        C3569fi.m16420ri(wjvVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15250ri(wjv wjvVar, Context context, boolean z) {
        if (wjvVar != null && wjvVar.m14562xz() != null && wjvVar.m14562xz().jbs() && !TextUtils.isEmpty(wjvVar.m14562xz().m14631qt()) && context != null) {
            try {
                C3298zf c3298zfM14562xz = wjvVar.m14562xz();
                String strM16476ri = C3571ig.m16476ri(wjvVar);
                final JSONObject jSONObjectM14636sf = c3298zfM14562xz.m14636sf();
                jSONObjectM14636sf.put("from_web", z ? 1 : 0);
                jSONObjectM14636sf.put("is_w2a", wjvVar.m14458nr());
                C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, strM16476ri, "gp_mini_card_status", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.3
                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ri */
                    public JSONObject mo10798ri() {
                        try {
                            jSONObjectM14636sf.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObjectM14636sf;
                    }
                });
                Intent intentM15244ri = m15244ri(context, c3298zfM14562xz);
                if (intentM15244ri == null) {
                    m15248ri(jSONObjectM14636sf, wjvVar, strM16476ri, -2);
                    return false;
                }
                if (!(context instanceof Activity)) {
                    Activity activityM16638lr = slm.m14959ri().m14960fi().m16638lr();
                    if (activityM16638lr != null && com.bytedance.sdk.openadsdk.utils.wjv.m16673ri(activityM16638lr)) {
                        context = activityM16638lr;
                    }
                } else if (!com.bytedance.sdk.openadsdk.utils.wjv.m16673ri((Activity) context)) {
                    context = null;
                }
                if (!(context instanceof Activity)) {
                    m15248ri(jSONObjectM14636sf, wjvVar, strM16476ri, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || intentM15244ri.resolveActivity(packageManager) == null) {
                    m15248ri(jSONObjectM14636sf, wjvVar, strM16476ri, -4);
                    return false;
                }
                try {
                    ((Activity) context).startActivityForResult(intentM15244ri, 0);
                    m15248ri(jSONObjectM14636sf, wjvVar, strM16476ri, 1);
                    return true;
                } catch (Throwable unused) {
                    m15248ri(jSONObjectM14636sf, wjvVar, strM16476ri, -3);
                    return false;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15251ri(wjv wjvVar, String str) {
        if (wjvVar == null || wjvVar.m14562xz() == null) {
            return false;
        }
        String strM14619fi = wjvVar.m14562xz().m14619fi();
        if (TextUtils.isEmpty(strM14619fi)) {
            return false;
        }
        return Pattern.compile(strM14619fi).matcher(str).matches();
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15252ri(wjv wjvVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentM16471ri;
        if (wjvVar != null && wjvVar.gqj() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentM16471ri = C3571ig.m16471ri(context, str)) == null) {
                return false;
            }
            intentM16471ri.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentM16471ri.addFlags(268435456);
            }
            context.startActivity(intentM16471ri);
            if (map == null) {
                map = new HashMap<>();
            }
            if (wjvVar != null && wjvVar.m14565yv() == 0) {
                map.put("auto_click", Boolean.valueOf(!wjvVar.tan()));
            }
            map.put("can_query_install", Integer.valueOf(m15242lr() ? 1 : 0));
            C3414ik.m15553ri(wjvVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15253ri(String str, wjv wjvVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if ("market".equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!ProxyConfig.MATCH_HTTP.equals(scheme) && !"https".equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter(ShareConstants.MEDIA_URI)) != null) {
                        return m15253ri(queryParameter, wjvVar);
                    }
                }
                return true;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik
    /* JADX INFO: renamed from: ik */
    public boolean mo15236ik(wjv wjvVar) {
        C3278di c3278diTyz;
        if (wjvVar == null || (c3278diTyz = wjvVar.tyz()) == null) {
            return false;
        }
        return m15256ri(m15255ri(), wjvVar, c3278diTyz.m14077ri(), c3278diTyz.m14069ik());
    }

    @Override // com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik
    /* JADX INFO: renamed from: ka */
    public boolean mo15237ka(wjv wjvVar) {
        C3278di c3278diTyz;
        if (wjvVar == null || (c3278diTyz = wjvVar.tyz()) == null || wjvVar.gqj() == 0) {
            return false;
        }
        String strM14069ik = c3278diTyz.m14069ik();
        if (TextUtils.isEmpty(strM14069ik)) {
            return false;
        }
        return m15252ri(wjvVar, strM14069ik, m15255ri(), this.f11983ri, new HashMap());
    }

    /* JADX INFO: renamed from: lr */
    public boolean m15254lr(wjv wjvVar) {
        C3274aw c3274awLau = wjvVar.lau();
        if (c3274awLau == null) {
            return false;
        }
        HashMap map = new HashMap();
        m15246ri(wjvVar, map);
        if (C3373ri.m15260ri(m15255ri(), c3274awLau.m14016ri(), wjvVar, C3571ig.m16454lr(wjvVar), map, true)) {
            return true;
        }
        C3414ik.m15553ri(wjvVar, this.f11983ri, "open_fallback_url", map);
        return false;
    }

    /* JADX INFO: renamed from: ri */
    protected Context m15255ri() {
        WeakReference<Context> weakReference = this.f11981ik;
        return (weakReference == null || weakReference.get() == null) ? C3299nr.m14642ri() : this.f11981ik.get();
    }

    @Override // com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik
    /* JADX INFO: renamed from: ri */
    public void mo15238ri(int i) {
        this.f11982lr = i;
    }

    @Override // com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik
    /* JADX INFO: renamed from: ri */
    public void mo15239ri(final wjv wjvVar) {
        if (m15255ri() == null || wjvVar == null) {
            return;
        }
        if (C3606fi.m16703ri("gp_downloader_async", 0) == 1) {
            dzy.jbs().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    C3372lr.this.m15241fi(wjvVar);
                }
            });
        } else {
            m15241fi(wjvVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m15256ri(Context context, wjv wjvVar, String str, String str2) {
        return m15249ri(context, str, str2, this.f11983ri, wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m15257ri(wjv wjvVar, boolean z) {
        return m15243lr(wjvVar, m15255ri(), z);
    }
}
