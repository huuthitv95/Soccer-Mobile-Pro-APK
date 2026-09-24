package com.bytedance.sdk.openadsdk.p236ka;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.jbs.C2635fi;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.bgr;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.bgr.C2901ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.settings.C3311di;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3347di;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi;
import com.bytedance.sdk.openadsdk.p266uq.C3546mj;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C3393aw {

    /* JADX INFO: renamed from: ik */
    private static final int[] f12060ik = {10, 30, 50, 75, 100};

    /* JADX INFO: renamed from: ac */
    private boolean f12061ac;

    /* JADX INFO: renamed from: aw */
    private String f12062aw;

    /* JADX INFO: renamed from: ay */
    private int f12063ay;
    private String bgr;
    private volatile long bnj;

    /* JADX INFO: renamed from: bu */
    private boolean f12064bu;

    /* JADX INFO: renamed from: co */
    private boolean f12065co;

    /* JADX INFO: renamed from: di */
    private int f12066di;

    /* JADX INFO: renamed from: dw */
    private long f12067dw;
    private final int[] dzy;

    /* JADX INFO: renamed from: fe */
    private volatile int f12068fe;
    private final AtomicInteger feb;

    /* JADX INFO: renamed from: fi */
    private long f12069fi;

    /* JADX INFO: renamed from: fr */
    private final wjv f12070fr;
    private final AtomicBoolean gcp;
    private long hcw;

    /* JADX INFO: renamed from: ig */
    private boolean f12071ig;
    private long igq;
    private int ihz;
    private final AtomicBoolean jbs;

    /* JADX INFO: renamed from: jc */
    private InterfaceC3398co f12072jc;

    /* JADX INFO: renamed from: ka */
    private int f12073ka;

    /* JADX INFO: renamed from: kt */
    private volatile long f12074kt;

    /* JADX INFO: renamed from: lr */
    AtomicBoolean f12075lr;

    /* JADX INFO: renamed from: mj */
    private final AtomicBoolean f12076mj;

    /* JADX INFO: renamed from: nd */
    private boolean f12077nd;

    /* JADX INFO: renamed from: nr */
    private C3546mj f12078nr;

    /* JADX INFO: renamed from: oh */
    private boolean f12079oh;
    private long ory;

    /* JADX INFO: renamed from: pv */
    private WeakReference<WebView> f12080pv;

    /* JADX INFO: renamed from: qd */
    private InterfaceC3418fi f12081qd;

    /* JADX INFO: renamed from: qh */
    private long f12082qh;

    /* JADX INFO: renamed from: qt */
    private final AtomicBoolean f12083qt;

    /* JADX INFO: renamed from: ri */
    public C3347di.ri f12084ri;
    private String rzk;

    /* JADX INFO: renamed from: sf */
    private int f12085sf;
    private volatile long siy;
    private C3347di slm;
    private boolean srn;

    /* JADX INFO: renamed from: su */
    private String f12086su;

    /* JADX INFO: renamed from: ta */
    private int f12087ta;
    private jbs tan;
    private final AtomicBoolean tnn;

    /* JADX INFO: renamed from: tw */
    private String f12088tw;

    /* JADX INFO: renamed from: uq */
    private long f12089uq;

    /* JADX INFO: renamed from: vr */
    private final Context f12090vr;
    private volatile long whw;
    private long wjv;

    /* JADX INFO: renamed from: xd */
    private final boolean f12091xd;
    private final AtomicBoolean xha;

    /* JADX INFO: renamed from: xm */
    private final AtomicBoolean f12092xm;

    /* JADX INFO: renamed from: zf */
    private long f12093zf;
    private final AtomicInteger zyn;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.aw$ri */
    private static class ri {

        /* JADX INFO: renamed from: ri */
        private final int[] f12111ri;

        public ri(int[] iArr) {
            this.f12111ri = iArr;
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int iIntValue;
            try {
                iIntValue = Float.valueOf(str).intValue();
                if (iIntValue > 100) {
                    iIntValue = 100;
                } else if (iIntValue < 0) {
                    iIntValue = 0;
                }
            } catch (Throwable unused) {
            }
            int[] iArr = this.f12111ri;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            iArr[0] = iIntValue;
        }
    }

    public C3393aw(wjv wjvVar, WebView webView) {
        this(wjvVar, webView, false);
    }

    public C3393aw(wjv wjvVar, WebView webView, InterfaceC3398co interfaceC3398co, int i) {
        this(wjvVar, webView);
        this.f12072jc = interfaceC3398co;
        this.f12087ta = i;
    }

    public C3393aw(wjv wjvVar, WebView webView, boolean z) {
        this.f12073ka = 0;
        this.f12069fi = -1L;
        this.f12066di = 1;
        this.xha = new AtomicBoolean(false);
        this.f12076mj = new AtomicBoolean(false);
        this.jbs = new AtomicBoolean(false);
        this.f12083qt = new AtomicBoolean(false);
        this.f12085sf = -1;
        this.f12061ac = false;
        this.ihz = 0;
        this.f12075lr = new AtomicBoolean(false);
        this.f12086su = "landingpage";
        this.igq = 0L;
        this.f12093zf = 0L;
        this.f12067dw = 0L;
        this.ory = 0L;
        this.hcw = 0L;
        this.f12079oh = false;
        this.f12091xd = false;
        int[] iArr = {0};
        this.dzy = iArr;
        this.f12071ig = false;
        this.srn = false;
        this.f12074kt = 0L;
        this.feb = new AtomicInteger(0);
        this.zyn = new AtomicInteger(0);
        this.tnn = new AtomicBoolean(false);
        this.f12068fe = 0;
        this.f12087ta = -1;
        this.f12092xm = new AtomicBoolean(false);
        this.gcp = new AtomicBoolean(false);
        this.f12077nd = false;
        Context contextM14642ri = C3299nr.m14642ri();
        this.f12090vr = contextM14642ri;
        this.f12070fr = wjvVar;
        if (webView == null) {
            return;
        }
        this.f12061ac = z;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.f12080pv = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (wjvVar != null && wjvVar.ezp()) {
            C3347di c3347di = new C3347di(webView2, wjvVar, contextM14642ri, this.f12061ac);
            this.slm = c3347di;
            this.f12084ri = c3347di.m15051ik();
        }
        if (wjvVar != null && wjvVar.evm() && C3322sf.m14819lr().m14831ay()) {
            this.tan = new jbs(wjvVar, webView, this.f12061ac);
        }
        if (webView instanceof C2635fi) {
            this.f12082qh = ((C2635fi) webView2).f7458ri;
        } else {
            this.f12082qh = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new ri(iArr), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e) {
            C2707ac.m10206ri("LandingPageLog", "addJavascriptInterface exception", e);
        }
        if (wjvVar != null && wjvVar.ljo() != null) {
            this.f12069fi = wjvVar.ljo().optLong("page_id", -1L);
        }
        this.f12088tw = String.valueOf(SystemClock.elapsedRealtime());
    }

    /* JADX INFO: renamed from: fi */
    private String m15346fi(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    private boolean jbs() {
        wjv wjvVar;
        return this.srn && (wjvVar = this.f12070fr) != null && wjvVar.dzy();
    }

    /* JADX INFO: renamed from: qt */
    private int m15350qt() {
        WeakReference<WebView> weakReference = this.f12080pv;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                    return 1;
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15352ri(int i, String str) {
        try {
            if (TextUtils.isEmpty(C3311di.f11560lr)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(C3311di.f11560lr);
            jSONObject.putOpt("cid", m15376ri().m14533tn());
            jSONObject.putOpt("ad_id", m15376ri().m14533tn());
            jSONObject.put("log_extra", m15376ri().yjg());
            C3571ig.m16486ri(sb, "\"/** adInfo **/\"", jSONObject.toString());
            C3571ig.m16486ri(sb, "\"/** first_page **/\"", String.valueOf(i));
            C3571ig.m16486ri(sb, "\"/** ix_to_externalurl **/\"", this.f12069fi != -1 ? "1" : "0");
            C3571ig.m16486ri(sb, "\"/** preload_status **/\"", this.f12087ta == 2 ? "2" : "0");
            C3571ig.m16486ri(sb, "\"/** scene_state **/\"", str);
            C3571ig.m16486ri(sb, "\"/** web_init_time **/\"", String.valueOf(this.f12082qh));
            C3571ig.m16486ri(sb, "\"/** channel_name **/\"", "\"" + m15376ri().mvf() + "\"");
            C3571ig.m16486ri(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            C3571ig.m16486ri(sb, "\"/** web_url **/\"", "\"" + m15376ri().smj() + "\"");
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strM15346fi = m15346fi(string);
            WeakReference<WebView> weakReference = this.f12080pv;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strM15346fi) || webView == null) {
                return;
            }
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.aw.3
                @Override // java.lang.Runnable
                public void run() {
                    bgr.m10210ri(webView, strM15346fi);
                }
            });
        } catch (Throwable th) {
            C2707ac.m10197ik(th.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15353ri(final wjv wjvVar, final String str, final long j, final int i, final boolean z) {
        C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, str, "lp_feeling_duration", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.aw.4
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i);
                    jSONObject.put("meta_pre_render", wjvVar.m14554wm() ? 1 : 0);
                    tan tanVarM14526su = wjvVar.m14526su();
                    if (tanVarM14526su == null) {
                        tanVarM14526su = new tan();
                    }
                    jSONObject.put("pre_render_status", tanVarM14526su.m14308ik());
                    jSONObject.put("pre_render_use_gecko", tanVarM14526su.m14312lr());
                    jSONObject.put("pre_render_add_type", tanVarM14526su.m14316ri());
                    jSONObject.put("is_reused", z ? 1 : 0);
                    Long.valueOf(j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m15355ri(String str, String str2, long j) {
        if (this.jbs.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i = 300;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i = iIndexOf;
                    }
                    str = str.substring(0, i);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            m15357ri("load_finish_progress", jSONObject, j);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m15356ri(String str, JSONObject jSONObject) {
        m15357ri(str, jSONObject, -1L);
    }

    /* JADX INFO: renamed from: ri */
    private void m15357ri(final String str, final JSONObject jSONObject, final long j) {
        if (!this.f12071ig || this.f12070fr == null || TextUtils.isEmpty(str)) {
            return;
        }
        C3546mj c3546mj = this.f12078nr;
        final int iM16181ig = c3546mj != null ? c3546mj.m16181ig() : -1;
        C3414ik.m15532ri(System.currentTimeMillis(), this.f12070fr, this.f12086su, str, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.aw.1
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                if (jSONObject != null) {
                    try {
                        boolean zM14092lr = C3279dw.m14092lr(C3393aw.this.f12070fr);
                        int i = 0;
                        jSONObject.put("is_playable", zM14092lr ? 1 : 0);
                        jSONObject.put("usecache", C3116ri.m12672ri().m12687ri(C3393aw.this.f12070fr) ? 1 : 0);
                        if (zM14092lr && ("load_finish".equals(str) || "load_fail".equals(str))) {
                            jSONObject.put("playable_has_show", iM16181ig);
                        }
                        if ("stay_page".equals(str)) {
                            JSONObject jSONObject2 = jSONObject;
                            if (C3393aw.this.f12063ay <= 1) {
                                i = 1;
                            }
                            jSONObject2.put("first_page", i);
                        }
                    } catch (JSONException unused) {
                    }
                }
                String unused2 = C3393aw.this.f12086su;
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 > 0) {
                        jSONObject2.put("duration", j2);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if ("load_start".equals(str) || "load_finish".equals(str) || "progress_load_finish".equals(str)) {
                        jSONObject2.put("is_reused", C3393aw.this.f12077nd ? 1 : 0);
                    }
                    if (C2901ri.m11164ik(C3393aw.this.f12070fr)) {
                        jSONObject2.put("is_lp_pre_render", C3393aw.this.ihz);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m15358ri(boolean z, final String str) {
        if (z) {
            final int iM15350qt = m15350qt();
            C3414ik.m15533ri(new AbstractRunnableC2676ik("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.ka.aw.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C3311di c3311diM14892xd = C3299nr.m14639ka().m14892xd();
                        boolean zM15359ri = C3393aw.this.m15359ri(c3311diM14892xd, str);
                        if (zM15359ri) {
                            if (!TextUtils.isEmpty(C3311di.f11560lr)) {
                                C3393aw.this.m15352ri(iM15350qt, str);
                                return;
                            }
                            if (TextUtils.isEmpty(c3311diM14892xd.f11564ik) || !zM15359ri) {
                                return;
                            }
                            String str2 = c3311diM14892xd.f11564ik;
                            C2742lr c2742lrM10410ik = C2751lr.m10463lr().m10466ik().m10410ik();
                            c2742lrM10410ik.m10365ik(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            c2742lrM10410ik.m10368ka(map);
                            c2742lrM10410ik.m10373ri(9);
                            c2742lrM10410ik.m10371lr("sendPrefLog");
                            c2742lrM10410ik.m10392ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.ka.aw.2.1
                                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                                /* JADX INFO: renamed from: ri */
                                public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                                    try {
                                        C3311di.f11560lr = c2739lr.m10357ka();
                                        C3393aw.this.m15352ri(iM15350qt, str);
                                    } catch (Exception e) {
                                        C2707ac.m10206ri("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                                    }
                                }

                                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                                /* JADX INFO: renamed from: ri */
                                public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                                }
                            });
                        }
                    } catch (Throwable th) {
                        C2707ac.m10197ik(th.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m15359ri(C3311di c3311di, String str) {
        str.hashCode();
        switch (str) {
            case "0":
                return c3311di.f11565ka;
            case "1":
                return c3311di.f11563fi;
            case "2":
                return c3311di.f11562di;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: di */
    public void m15361di() {
        if (jbs() && this.siy > 0 && this.whw > 0 && !this.f12092xm.getAndSet(true)) {
            C3414ik.m15516lr(this.whw - this.siy, this.f12070fr, this.rzk, (String) null);
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m15362fi() {
        if (jbs()) {
            this.siy = SystemClock.elapsedRealtime();
            m15361di();
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m15363fi(boolean z) {
        this.f12077nd = z;
    }

    /* JADX INFO: renamed from: ik */
    public void m15364ik(String str) {
        if (!this.f12071ig || this.f12070fr == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.f12087ta;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.f12070fr.smj();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        m15356ri("load_start", jSONObject);
    }

    /* JADX INFO: renamed from: ik */
    public void m15365ik(boolean z) {
        this.srn = z;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m15366ik() {
        return this.srn;
    }

    /* JADX INFO: renamed from: ka */
    public void m15367ka() {
        if (jbs()) {
            this.bnj = SystemClock.elapsedRealtime();
            C3414ik.m15536ri(this.f12070fr, this.rzk);
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m15368ka(String str) {
        if (!this.f12071ig || this.f12070fr == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.f12087ta;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.f12070fr.smj();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        m15356ri("progress_load_finish", jSONObject);
    }

    /* JADX INFO: renamed from: ka */
    public void m15369ka(boolean z) {
        WeakReference<WebView> weakReference = this.f12080pv;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                C2707ac.m10206ri("LandingPageLog", "removeJavascriptInterface exception", e);
            }
        }
        if (this.f12076mj.compareAndSet(false, true)) {
            m15358ri(z, "1");
            if (this.f12071ig) {
                C3414ik.m15544ri(this.f12070fr, this.f12086su, System.currentTimeMillis() - this.hcw, this.f12087ta, m15350qt());
            }
        } else if (this.f12066di == 2 && !this.f12083qt.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.f12066di);
                jSONObject.put("max_scroll_percent", this.dzy[0]);
                jSONObject.put("jump_times", this.feb.getAndSet(0));
                jSONObject.put("click_times", this.zyn.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            m15357ri("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.f12086su) || "landingpage_endcard".equals(this.f12086su) || "landingpage_split_screen".equals(this.f12086su) || "landingpage_direct".equals(this.f12086su) || "aggregate_page".equals(this.f12086su) || "landingpage_split_ceiling".equals(this.f12086su)) {
            C3366lr.m15165ri().m15174ri("landingFinish", this.f12070fr, this.f12088tw);
        }
    }

    /* JADX INFO: renamed from: lr */
    public C3393aw m15370lr(boolean z) {
        this.f12071ig = z;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC3418fi m15371lr() {
        return this.f12081qd;
    }

    /* JADX INFO: renamed from: lr */
    public void m15372lr(int i) {
        C3347di c3347di = this.slm;
        if (c3347di == null || !this.f12064bu) {
            return;
        }
        c3347di.m15056ri(i);
    }

    /* JADX INFO: renamed from: lr */
    public void m15373lr(WebView webView, String str, boolean z) {
        jbs jbsVar = this.tan;
        if (jbsVar == null || !z) {
            return;
        }
        jbsVar.m15577ri(webView, str);
    }

    /* JADX INFO: renamed from: lr */
    public void m15374lr(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.rzk = str;
    }

    /* JADX INFO: renamed from: mj */
    public void m15375mj() {
        if (("landingpage".equals(this.f12086su) || "landingpage_endcard".equals(this.f12086su) || "landingpage_split_screen".equals(this.f12086su) || "landingpage_direct".equals(this.f12086su) || "aggregate_page".equals(this.f12086su) || "landingpage_split_ceiling".equals(this.f12086su)) && this.f12066di == 2) {
            if (this.f12093zf > 0 || !m15366ik()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.igq, this.f12093zf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.f12066di);
                    jSONObject.put("max_scroll_percent", this.dzy[0]);
                    jSONObject.put("jump_times", this.feb.getAndSet(0));
                    jSONObject.put("click_times", this.zyn.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.f12083qt.set(true);
                m15357ri("stay_page", jSONObject, Math.min(jCurrentTimeMillis, 600000L));
                C3366lr.m15165ri().m15174ri("landingPause", this.f12070fr, this.f12088tw);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public wjv m15376ri() {
        return this.f12070fr;
    }

    /* JADX INFO: renamed from: ri */
    public void m15377ri(int i) {
        this.f12087ta = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m15378ri(long j) {
        this.f12093zf = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15379ri(MotionEvent motionEvent) {
        C3347di c3347di = this.slm;
        if (c3347di != null && this.f12064bu) {
            c3347di.m15057ri(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12074kt != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.zyn.incrementAndGet();
                this.zyn.get();
                if (this.tnn.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.f12070fr.smj());
                } catch (JSONException unused) {
                }
                m15357ri("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.f12074kt, 0L));
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15380ri(WebView webView, int i) {
        if (webView == null) {
            return;
        }
        if (this.f12074kt == 0) {
            this.f12074kt = SystemClock.elapsedRealtime();
        }
        if (this.f12067dw == 0 && i > 0) {
            this.f12067dw = System.currentTimeMillis();
        } else if (this.ory == 0 && i == 100) {
            this.ory = System.currentTimeMillis();
        }
        if (this.f12073ka != f12060ik.length && ("landingpage".equals(this.f12086su) || "landingpage_endcard".equals(this.f12086su) || "landingpage_split_screen".equals(this.f12086su) || "landingpage_direct".equals(this.f12086su) || "aggregate_page".equals(this.f12086su))) {
            int i2 = this.f12073ka;
            while (true) {
                int[] iArr = f12060ik;
                if (i2 >= iArr.length || i < iArr[this.f12073ka]) {
                    break;
                }
                int i3 = i2 + 1;
                this.f12073ka = i3;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j = this.f12069fi;
                    if (j != -1) {
                        jSONObject.put("page_id", j);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i2]);
                } catch (Exception unused) {
                }
                m15356ri("progress_load_finish", jSONObject);
                i2 = i3;
            }
        }
        if (i == 100) {
            m15392ri(false, SystemClock.elapsedRealtime());
            m15355ri(webView.getUrl(), "progress", Math.min(this.ory - this.f12067dw, 600000L));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15381ri(WebView webView, int i, String str, String str2, String str3, boolean z) {
        InterfaceC3418fi interfaceC3418fi = this.f12081qd;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.mo15590ri((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.f12066di != 2) {
            this.f12066di = 3;
        }
        this.f12085sf = i;
        this.f12062aw = str;
        this.bgr = str2;
        this.f12065co = z;
    }

    /* JADX INFO: renamed from: ri */
    public void m15382ri(WebView webView, String str, Bitmap bitmap, boolean z, int i) {
        this.f12064bu = z;
        this.f12063ay++;
        C3347di c3347di = this.slm;
        if (c3347di != null && z) {
            c3347di.m15054lr(str);
            this.slm.m15053lr();
        }
        jbs jbsVar = this.tan;
        if (jbsVar != null && z) {
            jbsVar.m15579ri(str, i);
        }
        WeakReference<WebView> weakReference = this.f12080pv;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.f12068fe) {
                    this.feb.incrementAndGet();
                }
                this.f12068fe = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e) {
                C2707ac.m10206ri("LandingPageLog", "copyBackForwardList exception", e);
            }
        }
        if (this.f12074kt == 0) {
            this.f12074kt = SystemClock.elapsedRealtime();
        }
        InterfaceC3418fi interfaceC3418fi = this.f12081qd;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.mo15583ka();
        }
        if (this.xha.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i2 = this.f12087ta;
                if (i2 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i2));
                }
            } catch (Exception unused) {
            }
            m15356ri("load_start", jSONObject);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15383ri(WebView webView, String str, boolean z) {
        m15392ri(false, SystemClock.elapsedRealtime());
        C3347di c3347di = this.slm;
        if (c3347di != null && z) {
            c3347di.m15055ri();
        }
        InterfaceC3418fi interfaceC3418fi = this.f12081qd;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.mo15582fi();
        }
        jbs jbsVar = this.tan;
        if (jbsVar != null && z) {
            jbsVar.m15578ri(str);
        }
        if (webView != null && !this.f12079oh && this.f12071ig) {
            this.f12079oh = true;
            bgr.m10210ri(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.f12076mj.compareAndSet(false, true)) {
            if (this.f12066di != 3) {
                this.f12066di = 2;
            }
            this.igq = System.currentTimeMillis();
            boolean z2 = this.f12066di == 2;
            int iM15350qt = m15350qt();
            if (!z2) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.f12085sf);
                    jSONObject.put("error_msg", this.f12062aw);
                    jSONObject.put("error_url", this.bgr);
                    jSONObject.put("first_page", iM15350qt);
                    int i = this.f12087ta;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.f12070fr.smj());
                    jSONObject.put("preload_h5_type", this.f12070fr.m14474qd());
                } catch (Exception unused) {
                }
                m15358ri(z, "2");
                m15356ri("load_fail", jSONObject);
                if (jbs()) {
                    C3414ik.m15545ri(this.f12070fr, this.rzk, SystemClock.elapsedRealtime() - this.bnj, this.f12085sf, this.f12062aw, this.bgr);
                }
                if (this.f12065co) {
                    jSONObject.remove("render_type");
                    jSONObject.remove("render_type_2");
                    m15356ri("load_fail_main", jSONObject);
                    return;
                }
                return;
            }
            long j = this.ory - this.f12067dw;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.f12085sf);
                jSONObject2.put("error_msg", this.f12062aw);
                jSONObject2.put("error_url", this.bgr);
                int i2 = this.f12087ta;
                if (i2 >= 0) {
                    jSONObject2.put("preload_status", i2);
                }
                jSONObject2.put("first_page", iM15350qt);
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.f12070fr.smj());
                jSONObject2.put("preload_h5_type", this.f12070fr.m14474qd());
            } catch (Exception unused2) {
            }
            m15358ri(z, "0");
            long jMin = Math.min(j, 600000L);
            m15357ri("load_finish", jSONObject2, jMin);
            if (jbs()) {
                this.whw = SystemClock.elapsedRealtime();
                m15361di();
                C3414ik.m15543ri(this.f12070fr, this.rzk, this.whw - this.bnj);
            }
            m15355ri(str, "load_finish", jMin);
            InterfaceC3398co interfaceC3398co = this.f12072jc;
            if (interfaceC3398co != null) {
                interfaceC3398co.mo10656ri(iM15350qt);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15384ri(C2634di c2634di) {
        int iSaa;
        Bitmap bitmapM16607ri;
        wjv wjvVar;
        if ((!"landingpage".equals(this.f12086su) && !"landingpage_endcard".equals(this.f12086su) && !"landingpage_split_screen".equals(this.f12086su) && !"landingpage_direct".equals(this.f12086su) && !"aggregate_page".equals(this.f12086su)) || (iSaa = C3299nr.m14639ka().saa()) == 0 || new Random().nextInt(100) + 1 > iSaa || c2634di == null || c2634di.getWebView() == null || c2634di.getVisibility() != 0 || (bitmapM16607ri = C3583qd.m16607ri(c2634di)) == null || (wjvVar = this.f12070fr) == null) {
            return;
        }
        C3583qd.m16621ri(wjvVar, this.f12086su, "landing_page_blank", bitmapM16607ri, c2634di.getUrl(), this.f12069fi);
    }

    /* JADX INFO: renamed from: ri */
    public void m15385ri(InterfaceC3398co interfaceC3398co) {
        this.f12072jc = interfaceC3398co;
    }

    /* JADX INFO: renamed from: ri */
    public void m15386ri(InterfaceC3418fi interfaceC3418fi) {
        this.f12081qd = interfaceC3418fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m15387ri(C3546mj c3546mj) {
        this.f12078nr = c3546mj;
    }

    /* JADX INFO: renamed from: ri */
    public void m15388ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3347di c3347di = this.slm;
        if (c3347di != null) {
            c3347di.m15058ri(str);
        }
        jbs jbsVar = this.tan;
        if (jbsVar != null) {
            jbsVar.m15575ik(str);
        }
        this.f12086su = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m15389ri(String str, long j) {
        if (!this.f12071ig || this.f12070fr == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", this.f12085sf);
            jSONObject.put("error_msg", this.f12062aw);
            jSONObject.put("error_url", this.bgr);
            int i = this.f12087ta;
            if (i >= 0) {
                jSONObject.put("preload_status", i);
            }
            jSONObject.put("first_page", m15350qt());
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            if (TextUtils.isEmpty(str)) {
                str = this.f12070fr.smj();
            }
            jSONObject.put("url", str);
            jSONObject.put("preload_h5_type", this.f12070fr.m14474qd());
        } catch (Exception unused) {
        }
        m15357ri("load_finish", jSONObject, Math.min(j, 600000L));
    }

    /* JADX INFO: renamed from: ri */
    public void m15390ri(String str, boolean z) {
        C3347di c3347di = this.slm;
        if (c3347di != null && z) {
            c3347di.m15052ik(str);
        }
        jbs jbsVar = this.tan;
        if (jbsVar == null || !z) {
            return;
        }
        jbsVar.m15576lr(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m15391ri(boolean z) {
        if (z) {
            this.ihz = 1;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15392ri(boolean z, long j) {
        if (z) {
            this.f12089uq = j;
        } else {
            this.wjv = j;
        }
        if (this.f12089uq <= 0 || this.wjv <= 0 || !this.f12064bu || !this.f12075lr.compareAndSet(false, true)) {
            return;
        }
        m15353ri(this.f12070fr, this.f12086su, this.wjv - this.f12089uq, this.ihz, this.f12077nd);
    }

    public void xha() {
        if (this.hcw == 0) {
            this.hcw = System.currentTimeMillis();
        }
        this.igq = System.currentTimeMillis();
        if ("landingpage".equals(this.f12086su) || "landingpage_endcard".equals(this.f12086su) || "landingpage_split_screen".equals(this.f12086su) || "landingpage_direct".equals(this.f12086su) || "aggregate_page".equals(this.f12086su)) {
            if (this.gcp.compareAndSet(false, true)) {
                C3366lr.m15165ri().m15174ri("landingStart", this.f12070fr, this.f12088tw);
            } else {
                C3366lr.m15165ri().m15174ri("landingContinue", this.f12070fr, this.f12088tw);
            }
        }
        if (C3273ac.m13973mj(this.f12070fr) || C3273ac.m13971lr(this.f12070fr)) {
            m15392ri(true, SystemClock.elapsedRealtime());
        }
    }
}
