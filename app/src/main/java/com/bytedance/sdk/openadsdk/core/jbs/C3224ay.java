package com.bytedance.sdk.openadsdk.core.jbs;

import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri;
import com.bytedance.sdk.component.adexpress.p122fi.C2483fi;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3585ri;
import com.bytedance.sdk.openadsdk.utils.C3597xd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ay */
/* JADX INFO: loaded from: classes3.dex */
public class C3224ay extends AbstractC2487ri {

    /* JADX INFO: renamed from: ac */
    private C3237qt f10769ac;

    /* JADX INFO: renamed from: aw */
    private String f10770aw;
    private C3393aw bgr;

    /* JADX INFO: renamed from: bu */
    private com.bytedance.sdk.component.adexpress.p125lr.xha f10771bu;

    /* JADX INFO: renamed from: co */
    private InterfaceC3418fi f10772co;
    private final AbstractRunnableC2676ik ihz;
    private String jbs;

    /* JADX INFO: renamed from: mj */
    private Context f10773mj;

    /* JADX INFO: renamed from: nr */
    private com.bytedance.sdk.openadsdk.core.model.wjv.C3296ri f10774nr;

    /* JADX INFO: renamed from: qt */
    private com.bytedance.sdk.openadsdk.core.model.wjv f10775qt;

    /* JADX INFO: renamed from: sf */
    private JSONObject f10776sf;
    private dzy slm;
    private volatile int tan;

    /* JADX INFO: renamed from: uq */
    private final Runnable f10777uq;

    /* JADX INFO: renamed from: vr */
    private final Map<String, InterfaceC3370ik> f10778vr;
    C3585ri xha;

    public C3224ay(Context context, C2500aw c2500aw, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, InterfaceC3418fi interfaceC3418fi, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        super(context, c2500aw, themeStatusBroadcastReceiver);
        this.f10778vr = Collections.synchronizedMap(new HashMap());
        this.tan = 0;
        this.ihz = new AbstractRunnableC2676ik("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.jbs.ay.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3224ay.this.f6859di.get()) {
                    return;
                }
                C3224ay c3224ay = C3224ay.this;
                c3224ay.f10776sf = c3224ay.m8800sf().m8883ik();
                C3224ay c3224ay2 = C3224ay.this;
                c3224ay2.m8798ri(c3224ay2.f10776sf);
                if (C3224ay.this.tan == 0) {
                    C3224ay.this.m13582bu();
                }
                C3332vr.m14976ik().post(C3224ay.this.f10777uq);
            }
        };
        this.f10777uq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ay.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3224ay.this.f6859di.get() || C3224ay.this.f10771bu == null) {
                    return;
                }
                C3224ay.this.m13598co();
                C3224ay c3224ay = C3224ay.this;
                C3224ay.super.mo8759ri(c3224ay.f10771bu);
            }
        };
        if (this.f6862ka == null) {
            return;
        }
        this.f10773mj = context;
        this.jbs = c2500aw.m8884ka();
        this.f10775qt = wjvVar;
        this.f10772co = interfaceC3418fi;
        themeStatusBroadcastReceiver.m9173ri(this);
        m13582bu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bu */
    public void m13582bu() {
        if (this.f6862ka.getWebView() == null || !com.bytedance.sdk.openadsdk.utils.dzy.m16391di()) {
            this.tan = 1;
            com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ay.3
                @Override // java.lang.Runnable
                public void run() {
                    C3224ay.this.m13591nr();
                }
            });
        } else {
            m13591nr();
        }
        if (!bgr.m13607lr(this.f10775qt) || this.f6863lr) {
            return;
        }
        bgr.m13609ri(this.f10775qt);
    }

    /* JADX INFO: renamed from: lr */
    private void m13588lr(boolean z) {
        if (this.slm == null || this.f6862ka == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z);
            this.slm.mo13455ri("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m13589lr(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nr */
    public void m13591nr() {
        if (this.f6862ka == null || this.f6862ka.getWebView() == null || this.tan == 2) {
            return;
        }
        this.f10770aw = m13592ri(this.f10775qt);
        this.f6862ka.setDisplayZoomControls(false);
        m8797ri(C3597xd.m16679ri(this.f10770aw));
        m13597aw();
        dzy dzyVar = new dzy(this.f10773mj);
        this.slm = dzyVar;
        dzyVar.m13415ik(true);
        bgr();
        this.tan = 2;
    }

    /* JADX INFO: renamed from: ri */
    public static String m13592ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        return C2523lr.m9110ka((wjvVar == null || !wjvVar.nbc()) ? null : "v3");
    }

    /* JADX INFO: renamed from: ri */
    private void m13595ri(C2634di c2634di) {
        if (c2634di == null) {
            return;
        }
        try {
            C3349ik.m15077ri(this.f10773mj).m15081ri(false).m15082ri(c2634di.getWebView());
            c2634di.setVerticalScrollBarEnabled(false);
            c2634di.setHorizontalScrollBarEnabled(false);
            C3349ik.m15079ri(c2634di);
            c2634di.bgr();
            c2634di.setUserAgentString(com.bytedance.sdk.openadsdk.utils.tan.m16659ri(c2634di.getWebView(), BuildConfig.VERSION_CODE));
            c2634di.setMixedContentMode(0);
            c2634di.setJavaScriptEnabled(true);
            c2634di.setJavaScriptCanOpenWindowsAutomatically(true);
            c2634di.setDomStorageEnabled(true);
            c2634di.setDatabaseEnabled(true);
            c2634di.setAllowFileAccess(false);
            c2634di.setSupportZoom(true);
            c2634di.setBuiltInZoomControls(true);
            c2634di.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            c2634di.setUseWideViewPort(true);
            c2634di.setCacheMode(-1);
        } catch (Exception e) {
            C2707ac.m10196ik("TTAD.WebViewRender", e.toString());
        }
    }

    /* JADX INFO: renamed from: aw */
    public void m13597aw() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10775qt;
        if (wjvVar == null || wjvVar.sez() == null) {
            return;
        }
        this.f10774nr = this.f10775qt.sez();
    }

    public void bgr() {
        if (this.f6862ka == null || this.f6862ka.getWebView() == null) {
            return;
        }
        this.f6862ka.setBackgroundColor(0);
        this.f6862ka.setBackgroundResource(R.color.transparent);
        m13595ri(this.f6862ka);
        if (mo8793ri() != null) {
            this.bgr = new C3393aw(this.f10775qt, mo8793ri().getWebView()).m15370lr(false);
        }
        this.bgr.m15386ri(this.f10772co);
        this.f10769ac = new C3237qt(this.f10773mj, this.slm, this.f10775qt, this.bgr, m8800sf());
        this.f6862ka.setWebViewClient(this.f10769ac);
        this.f6862ka.setWebChromeClient(new C3350ka(this.slm, this.bgr));
        C2483fi.m8762ri().m8777ri(this.f6862ka, this.slm);
    }

    /* JADX INFO: renamed from: co */
    public void m13598co() {
        dzy dzyVar;
        if (this.f6862ka == null || this.f6862ka.getWebView() == null || (dzyVar = this.slm) == null) {
            return;
        }
        dzyVar.m13422lr(this.f6862ka).m13442ri(this.f10775qt).m13411ik(this.f10775qt.m14533tn()).m13416ka(this.f10775qt.yjg()).m13421lr(C3571ig.m16470ri(this.jbs)).m13408fi(this.f10775qt.m14541uo()).m13434ri(this).m13447ri(this.f10776sf).m13435ri(this.f6862ka).m13445ri(this.f10772co);
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri
    /* JADX INFO: renamed from: di */
    public void mo8788di() {
        if (mo8793ri() == null) {
            return;
        }
        try {
            mo8793ri().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ik */
    public int mo8752ik() {
        return this.f10775qt.hpn();
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri
    protected void jbs() {
        super.jbs();
        C3585ri c3585riM14960fi = com.bytedance.sdk.openadsdk.core.slm.m14959ri().m14960fi();
        this.xha = c3585riM14960fi;
        c3585riM14960fi.m16640ri(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri
    /* JADX INFO: renamed from: ka */
    public void mo8789ka() {
        if (this.f6859di.get()) {
            return;
        }
        super.mo8789ka();
        dzy dzyVar = this.slm;
        if (dzyVar != null) {
            dzyVar.m13412ik();
            this.slm.m13403co();
            this.slm = null;
        }
        C3393aw c3393aw = this.bgr;
        if (c3393aw != null) {
            c3393aw.m15369ka(false);
        }
        C3332vr.m14976ik().removeCallbacks(this.f10777uq);
        this.f10778vr.clear();
    }

    /* JADX INFO: renamed from: lr */
    public void m13599lr(int i) {
        if (this.slm == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i);
            this.slm.mo13455ri("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e) {
            C2707ac.m10196ik("TTAD.WebViewRender", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri
    /* JADX INFO: renamed from: mj */
    public void mo8791mj() {
        super.mo8791mj();
        if (this.slm == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.slm.mo13455ri("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.InterfaceC2532ri
    public void onThemeChanged(int i) {
        if (this.slm == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException unused) {
        }
        this.slm.mo13455ri("themeChange", jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri
    /* JADX INFO: renamed from: qt */
    protected void mo8792qt() {
        super.mo8792qt();
        C3585ri c3585ri = this.xha;
        if (c3585ri != null) {
            c3585ri.m16639lr(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri
    /* JADX INFO: renamed from: ri */
    public C2634di mo8793ri() {
        return this.f6862ka;
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri
    /* JADX INFO: renamed from: ri */
    public void mo8794ri(int i) {
        if (i == this.f6860fi) {
            return;
        }
        this.f6860fi = i;
        m13588lr(i == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf
    /* JADX INFO: renamed from: ri */
    public void mo8757ri(com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
        super.mo8757ri(bgrVar);
        if (this.f6861ik) {
            com.bytedance.sdk.component.utils.jbs.m10234lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ay.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = C3224ay.this.f6862ka.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ri */
    public void mo8759ri(com.bytedance.sdk.component.adexpress.p125lr.xha xhaVar) {
        this.f10771bu = xhaVar;
        com.bytedance.sdk.openadsdk.utils.dzy.m16396ik((Runnable) this.ihz);
    }

    /* JADX INFO: renamed from: ri */
    public void m13600ri(InterfaceC3118lr interfaceC3118lr) {
        dzy dzyVar = this.slm;
        if (dzyVar != null) {
            dzyVar.m13451ri(interfaceC3118lr);
        }
    }

    public dzy slm() {
        return this.slm;
    }

    /* JADX INFO: renamed from: vr */
    public C3237qt m13601vr() {
        return this.f10769ac;
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri
    public void xha() {
        dzy dzyVar = this.slm;
        if (dzyVar == null) {
            return;
        }
        dzyVar.mo13455ri("expressWebviewRecycle", (JSONObject) null);
    }
}
