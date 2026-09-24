package com.bytedance.sdk.openadsdk.p266uq.p268ri;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.C2945ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.widget.C3345qt;
import com.bytedance.sdk.openadsdk.core.widget.jbs;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p266uq.AbstractC3548ri;
import com.bytedance.sdk.openadsdk.p266uq.C3541fi;
import com.bytedance.sdk.openadsdk.p266uq.C3546mj;
import com.bytedance.sdk.openadsdk.p266uq.EnumC3543ka;
import com.bytedance.sdk.openadsdk.p266uq.InterfaceC3542ik;
import com.bytedance.sdk.openadsdk.p266uq.xha;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.tan;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3552ri {

    /* JADX INFO: renamed from: ac */
    private lr f13067ac;

    /* JADX INFO: renamed from: aw */
    private volatile boolean f13068aw;

    /* JADX INFO: renamed from: ay */
    private long f13069ay;
    private volatile boolean bgr;

    /* JADX INFO: renamed from: bu */
    private AtomicBoolean f13070bu;

    /* JADX INFO: renamed from: co */
    private boolean f13071co;

    /* JADX INFO: renamed from: di */
    private C3345qt f13072di;

    /* JADX INFO: renamed from: fi */
    private final FrameLayout f13073fi;

    /* JADX INFO: renamed from: fr */
    private StringBuilder f13074fr;
    private boolean ihz;

    /* JADX INFO: renamed from: ik */
    private final wjv f13075ik;
    private final String jbs;

    /* JADX INFO: renamed from: ka */
    private final int f13076ka;

    /* JADX INFO: renamed from: lr */
    private final Context f13077lr;

    /* JADX INFO: renamed from: mj */
    private String f13078mj;

    /* JADX INFO: renamed from: nr */
    private jbs f13079nr;

    /* JADX INFO: renamed from: qt */
    private C3546mj f13080qt;

    /* JADX INFO: renamed from: ri */
    protected C2634di f13081ri;

    /* JADX INFO: renamed from: sf */
    private InterfaceC2879di f13082sf;
    private AtomicBoolean slm;

    /* JADX INFO: renamed from: su */
    private ri f13083su;
    private C3221ri tan;

    /* JADX INFO: renamed from: uq */
    private int f13084uq;

    /* JADX INFO: renamed from: vr */
    private int f13085vr;
    private int wjv;
    private dzy xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.ri.ri$lr */
    public interface lr {
        /* JADX INFO: renamed from: ri */
        void mo16272ri();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.ri.ri$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo12179ri(int i);
    }

    public C3552ri(Context context, wjv wjvVar, int i, boolean z, FrameLayout frameLayout) {
        this(context, wjvVar, i, z, frameLayout, false);
    }

    public C3552ri(Context context, wjv wjvVar, int i, boolean z, FrameLayout frameLayout, boolean z2) {
        this(context, wjvVar, i, z, frameLayout, z2, 0);
    }

    public C3552ri(Context context, wjv wjvVar, int i, boolean z, FrameLayout frameLayout, boolean z2, int i2) {
        this.f13071co = true;
        this.slm = new AtomicBoolean(false);
        this.f13070bu = new AtomicBoolean(false);
        this.wjv = 0;
        this.f13069ay = 0L;
        this.f13077lr = context;
        this.f13075ik = wjvVar;
        this.f13084uq = i2;
        if (wjvVar != null && wjvVar.m14428ka() != null && wjvVar.m14428ka().m14252ka() != null) {
            this.wjv = wjvVar.m14428ka().m14252ka().size();
        }
        this.f13076ka = i;
        String strM16444ik = C3571ig.m16444ik(wjvVar.m14388eb().getDurationSlotType());
        this.f13078mj = strM16444ik;
        int iM16470ri = C3571ig.m16470ri(strM16444ik);
        this.ihz = z2;
        if (z2) {
            this.f13078mj = C3571ig.m16458lr(iM16470ri);
        }
        this.jbs = C3279dw.m14085co(wjvVar);
        this.f13073fi = frameLayout;
        m16291ri(frameLayout);
        m16290ri(iM16470ri);
        m16283ik(z);
        m16287mj();
    }

    /* JADX INFO: renamed from: ik */
    private void m16283ik(boolean z) {
        C2705vr c2705vrM13420lr;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.f13075ik.m14533tn());
            jSONObject.put("log_extra", this.f13075ik.yjg());
        } catch (Throwable unused) {
        }
        if (C3304qt.m14669lr().m14703vr()) {
            xha.m16307ri(new xha.InterfaceC3553ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.1
            });
        }
        C3546mj c3546mjM16160ri = C3546mj.m16160ri(C3299nr.m14642ri(), this.f13081ri.getWebView(), new InterfaceC3542ik() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.2
            @Override // com.bytedance.sdk.openadsdk.p266uq.InterfaceC3542ik
            /* JADX INFO: renamed from: ri */
            public void mo16117ri(String str, JSONObject jSONObject2) {
                if (C3552ri.this.xha != null) {
                    C3552ri.this.xha.mo13455ri(str, jSONObject2);
                }
            }
        }, new AbstractC3548ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.3
            @Override // com.bytedance.sdk.openadsdk.p266uq.AbstractC3548ri
            /* JADX INFO: renamed from: ik */
            public void mo16239ik() {
                if (C3552ri.this.xha.bgr() != null) {
                    C3552ri.this.xha.bgr().mo10576ri(true);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p266uq.AbstractC3548ri
            /* JADX INFO: renamed from: lr */
            public void mo16240lr() {
                C3552ri.this.xha.m13425lr(true);
                if (C3552ri.this.f13082sf != null) {
                    C3552ri.this.f13082sf.mo11086ri();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p266uq.AbstractC3548ri
            /* JADX INFO: renamed from: ri */
            public EnumC3543ka mo16242ri() {
                String strM11347di = C2945ik.m11347di();
                strM11347di.hashCode();
                switch (strM11347di) {
                    case "2g":
                        return EnumC3543ka.TYPE_2G;
                    case "3g":
                        return EnumC3543ka.TYPE_3G;
                    case "4g":
                        return EnumC3543ka.TYPE_4G;
                    case "5g":
                        return EnumC3543ka.TYPE_5G;
                    case "wifi":
                        return EnumC3543ka.TYPE_WIFI;
                    default:
                        return EnumC3543ka.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p266uq.AbstractC3548ri
            /* JADX INFO: renamed from: ri */
            public void mo16243ri(int i, String str) {
                C3552ri.this.f13071co = false;
                if (i == 2 || i == 3 || i == 4) {
                    C3552ri.this.m16300ri(2, i);
                } else if (i == 5) {
                    C3552ri.this.m16300ri(3, i);
                } else {
                    C3552ri.this.m16300ri(1, 0);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p266uq.AbstractC3548ri
            /* JADX INFO: renamed from: ri */
            public void mo16244ri(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                C3414ik.m15532ri(System.currentTimeMillis(), C3552ri.this.f13075ik, C3552ri.this.f13078mj, "playable_track", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.3.1
                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ik */
                    public JSONObject mo11121ik() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ri */
                    public JSONObject mo10798ri() {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (C3552ri.this.f13075ik.m14450mm()) {
                                jSONObject3.put("is_pre_render", 1);
                            }
                            return jSONObject3;
                        } catch (JSONException e) {
                            C2707ac.m10196ik("PlayableManager", e.getMessage());
                            return null;
                        }
                    }
                });
            }
        });
        this.f13080qt = c3546mjM16160ri;
        c3546mjM16160ri.xha(this.jbs).m16176fi(C2945ik.m11353ri(C3299nr.m14642ri())).m16194lr(C2945ik.m11348fi()).m16213ri(C2945ik.m11352ri()).m16187ka(C2945ik.m11350ka()).m16183ik(jSONObject).m16182ik(C3279dw.m14095qt(this.f13075ik)).m16188ka(true).m16215ri(z).m16184ik(false).m16212ri(C3279dw.m14084bu(this.f13075ik)).m16193lr(C3279dw.m14084bu(this.f13075ik)).m16214ri("sdkEdition", C2945ik.m11349ik()).m16177fi(C3279dw.m14086di(this.f13075ik)).m16171di(this.f13078mj);
        this.f13080qt.m16211ri(C3541fi.m16111lr(this.f13077lr));
        Set<String> setM16223sf = this.f13080qt.m16223sf();
        final WeakReference weakReference = new WeakReference(this.f13080qt);
        for (String str : setM16223sf) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (c2705vrM13420lr = this.xha.m13420lr()) != null) {
                c2705vrM13420lr.m10186ri(str, new AbstractC2698ka<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.4
                    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
                    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public JSONObject mo10166ri(String str2, JSONObject jSONObject2, C2696fi c2696fi) {
                        try {
                            C3546mj c3546mj = (C3546mj) weakReference.get();
                            if (c3546mj == null) {
                                return null;
                            }
                            return c3546mj.m16190ka(mo10153ri(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: mj */
    private void m16287mj() {
        this.f13081ri.setWebViewClient(new C3348fi(C3299nr.m14642ri(), this.xha, this.f13075ik.m14533tn(), null, true) { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (C3552ri.this.f13080qt != null) {
                    C3552ri.this.f13080qt.jbs(str);
                }
                if (C3552ri.this.f13071co) {
                    C3552ri.this.m16300ri(0, 0);
                    C3414ik.m15531ri(System.currentTimeMillis(), C3552ri.this.f13075ik, C3552ri.this.f13078mj, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                C3552ri.this.f13071co = false;
                if (C3552ri.this.f13080qt != null) {
                    C3552ri.this.f13080qt.m16174di(C3116ri.m12672ri().m12687ri(C3552ri.this.f13075ik));
                    C3552ri.this.f13080qt.m16218ri(i, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    C3552ri.this.f13071co = false;
                    if (C3552ri.this.f13080qt == null || webResourceError == null || webResourceRequest == null) {
                        return;
                    }
                    C3552ri.this.f13080qt.m16174di(C3116ri.m12672ri().m12687ri(C3552ri.this.f13075ik));
                    C3552ri.this.f13080qt.m16218ri(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    C3552ri.this.f13071co = false;
                    if (C3552ri.this.f13080qt != null) {
                        C3552ri.this.f13080qt.m16174di(C3116ri.m12672ri().m12687ri(C3552ri.this.f13075ik));
                        C3552ri.this.f13080qt.m16222ri(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (C3552ri.this.f13075ik.m14389eu() != null && !TextUtils.isEmpty(C3552ri.this.f13075ik.m14389eu().m6336aw())) {
                        if (C3552ri.this.f13080qt != null) {
                            C3552ri.this.f13080qt.m16209qt(str);
                        }
                        String strM14085co = C3279dw.m14085co(C3552ri.this.f13075ik);
                        WebResourceResponse webResourceResponseM12685ri = C3116ri.m12672ri().m12685ri(C3552ri.this.f13075ik.m14389eu().m6336aw(), strM14085co, str);
                        if (webResourceResponseM12685ri == null) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        if (C3552ri.this.f13080qt != null) {
                            C3552ri.this.f13080qt.m16224sf(str);
                        }
                        return webResourceResponseM12685ri;
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }
        });
        this.f13081ri.setWebChromeClient(new C3350ka(this.xha) { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (C3552ri.this.f13072di == null || C3552ri.this.f13072di.getVisibility() != 0) {
                    return;
                }
                C3552ri.this.f13072di.setProgress(i);
            }
        });
        C3349ik.m15077ri(this.f13077lr).m15081ri(false).m15080lr(false).m15082ri(this.f13081ri.getWebView());
        C2634di c2634di = this.f13081ri;
        c2634di.setUserAgentString(tan.m16659ri(c2634di.getWebView(), BuildConfig.VERSION_CODE));
        this.f13081ri.setMixedContentMode(0);
    }

    /* JADX INFO: renamed from: ri */
    private void m16290ri(int i) {
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.xha = new dzy(this.f13077lr);
        String strM14541uo = this.f13075ik.m14541uo();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", this.f13075ik.zyn());
            jSONObject.put("currentIndex", this.f13084uq);
            jSONObject.put("totalAdCount", this.wjv);
        } catch (JSONException unused) {
        }
        this.xha.m13422lr(this.f13081ri).m13442ri(this.f13075ik).m13447ri(C3239lr.m13713ri(this.f13075ik, true, jSONObject)).m13411ik(this.f13075ik.m14533tn()).m13416ka(this.f13075ik.yjg()).m13421lr(i).m13408fi(strM14541uo).m13435ri(this.f13081ri).m13423lr(this.f13078mj).m13446ri(map).m13445ri(new com.bytedance.sdk.openadsdk.p236ka.tan(3, this.f13078mj, this.f13075ik));
    }

    /* JADX INFO: renamed from: ri */
    private void m16291ri(FrameLayout frameLayout) {
        C2634di c2634di = new C2634di(this.f13077lr, true, C2634di.ik.PLAYABLE);
        this.f13081ri = c2634di;
        c2634di.m9773fi();
        this.f13081ri.setLayerType(2, null);
        this.f13081ri.setVisibility(4);
        this.f13081ri.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f13081ri.setEnabled(true);
        this.f13081ri.setTag(this.f13078mj);
        this.f13081ri.setMaterialMeta(this.f13075ik.m14452nb());
        this.f13081ri.setLandingPage(true);
        frameLayout.addView(this.f13081ri, new FrameLayout.LayoutParams(-1, -1));
        jbs jbsVar = new jbs(this.f13077lr);
        this.f13079nr = jbsVar;
        jbsVar.m15008ri(this.f13075ik, this.f13078mj, this.tan, this.ihz);
        frameLayout.addView(this.f13079nr, new FrameLayout.LayoutParams(-1, -1));
        if (this.f13075ik.dvr()) {
            C3345qt c3345qt = new C3345qt(this.f13077lr);
            this.f13072di = c3345qt;
            c3345qt.m15116lr();
            frameLayout.addView(this.f13072di, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: renamed from: di */
    public boolean m16294di() {
        dzy dzyVar = this.xha;
        if (dzyVar != null) {
            return dzyVar.m13407di();
        }
        return false;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m16295fi() {
        return this.f13068aw;
    }

    /* JADX INFO: renamed from: ik */
    public void m16296ik() {
        C3546mj c3546mj;
        if (!this.slm.get() || (c3546mj = this.f13080qt) == null) {
            return;
        }
        c3546mj.m16184ik(false);
    }

    /* JADX INFO: renamed from: ka */
    public void m16297ka() {
        C3546mj c3546mj = this.f13080qt;
        if (c3546mj != null) {
            c3546mj.m16206pv();
        }
        C2634di c2634di = this.f13081ri;
        if (c2634di != null) {
            c2634di.slm();
        }
        dzy dzyVar = this.xha;
        if (dzyVar != null) {
            dzyVar.m13403co();
        }
        this.f13069ay = System.currentTimeMillis();
        this.f13074fr = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb = this.f13074fr;
                sb.append(stackTraceElement);
                sb.append("\n");
            }
        } catch (Throwable th) {
            C2707ac.m10206ri("PlayableManager", "onDestroy() error", th);
        }
        this.f13081ri = null;
    }

    /* JADX INFO: renamed from: lr */
    public void m16298lr() {
        C3546mj c3546mj;
        if (!this.slm.get() || (c3546mj = this.f13080qt) == null) {
            return;
        }
        c3546mj.m16184ik(true);
    }

    /* JADX INFO: renamed from: lr */
    public void m16299lr(boolean z) {
        C3546mj c3546mj = this.f13080qt;
        if (c3546mj != null) {
            c3546mj.m16177fi(z);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo16276ri() {
        C3345qt c3345qt;
        final boolean z = true;
        if (this.slm.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.f13073fi;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (this.bgr || (c3345qt = this.f13072di) == null) {
            this.f13080qt.m16184ik(true);
            dzy dzyVar = this.xha;
            if (dzyVar != null && dzyVar.bgr() != null) {
                this.xha.bgr().mo10561fi();
            }
            ri riVar = this.f13083su;
            if (riVar != null) {
                riVar.mo12179ri(this.f13085vr);
            }
            z = false;
        } else {
            c3345qt.m15032lr(this.f13075ik, this.f13076ka);
            C3546mj c3546mj = this.f13080qt;
            if (c3546mj != null) {
                c3546mj.ory();
            }
        }
        if (this.f13080qt != null) {
            C3414ik.m15532ri(System.currentTimeMillis(), this.f13075ik, this.f13078mj, "playable_track", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.7
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ik */
                public JSONObject mo11121ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ri */
                public JSONObject mo10798ri() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", C3552ri.this.f13080qt.srn());
                        jSONObject.put("has_loading", z);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            this.f13080qt.m16174di(C3116ri.m12672ri().m12687ri(this.f13075ik));
        }
        C2634di c2634di = this.f13081ri;
        if (c2634di != null) {
            c2634di.setVisibility(0);
        } else {
            C3521ka.m15952ri("plb_npe_crash", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.8
                @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                /* JADX INFO: renamed from: ri */
                public InterfaceC3530ik mo11574ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    if (C3552ri.this.f13074fr != null) {
                        jSONObject.put("destroy_stack_trace", C3552ri.this.f13074fr.toString());
                    }
                    jSONObject.put("destroy_ts", C3552ri.this.f13069ay);
                    return C3531ka.m15967lr().m15985ri("plb_npe_crash").m15980lr(jSONObject.toString());
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16300ri(final int i, final int i2) {
        ri riVar;
        C3546mj c3546mj;
        lr lrVar;
        if (this.bgr) {
            return;
        }
        this.bgr = true;
        this.f13085vr = i;
        if (i == 2) {
            this.f13068aw = true;
            this.f13080qt.m16216ri(3);
        } else if (i == 1) {
            this.f13068aw = true;
            this.f13080qt.m16216ri(2);
        } else if (i == 3) {
            this.f13068aw = true;
            this.f13080qt.m16216ri(4);
        } else if (i == 0) {
            this.f13080qt.m16216ri(1);
        }
        if (this.f13068aw && (lrVar = this.f13067ac) != null) {
            lrVar.mo16272ri();
        }
        if (this.slm.get() && (c3546mj = this.f13080qt) != null) {
            c3546mj.m16184ik(true);
        }
        dzy dzyVar = this.xha;
        if (dzyVar != null && dzyVar.bgr() != null) {
            this.xha.bgr().mo10561fi();
        }
        if (!this.f13068aw && (riVar = this.f13083su) != null) {
            riVar.mo12179ri(i);
        }
        C3345qt c3345qt = this.f13072di;
        if (c3345qt != null) {
            c3345qt.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.9
                @Override // java.lang.Runnable
                public void run() {
                    if (C3552ri.this.f13068aw) {
                        C3552ri.this.f13079nr.setVisibility(0);
                        if (C3552ri.this.f13083su != null) {
                            C3552ri.this.f13083su.mo12179ri(i);
                        }
                        C3552ri.this.m16305ri(true);
                    }
                    C3552ri.this.f13080qt.xha(C3552ri.this.f13068aw);
                    C3552ri.this.f13072di.m15030ik();
                    if (C3552ri.this.slm.get()) {
                        C3414ik.m15532ri(System.currentTimeMillis(), C3552ri.this.f13075ik, C3552ri.this.f13078mj, "playable_track", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.9.1
                            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                            /* JADX INFO: renamed from: ik */
                            public JSONObject mo11121ik() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                            /* JADX INFO: renamed from: ri */
                            public JSONObject mo10798ri() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i);
                                    jSONObject.put("remove_loading_page_reason", i2);
                                    jSONObject.put("playable_url", C3552ri.this.jbs);
                                    jSONObject.put("duration", C3552ri.this.f13072di.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16301ri(InterfaceC3118lr interfaceC3118lr) {
        dzy dzyVar = this.xha;
        if (dzyVar != null) {
            dzyVar.m13451ri(interfaceC3118lr);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16302ri(C3221ri c3221ri) {
        this.tan = c3221ri;
        C3345qt c3345qt = this.f13072di;
        if (c3345qt != null && c3345qt.getDownloadButton() != null) {
            C3195mj downloadButton = this.f13072di.getDownloadButton();
            downloadButton.setOnClickListener(c3221ri);
            downloadButton.setOnTouchListener(c3221ri);
        }
        jbs jbsVar = this.f13079nr;
        if (jbsVar != null) {
            jbsVar.setClickListener(c3221ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16303ri(lr lrVar) {
        this.f13067ac = lrVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m16304ri(ri riVar) {
        this.f13083su = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m16305ri(boolean z) {
        C3546mj c3546mj = this.f13080qt;
        if (c3546mj != null) {
            c3546mj.m16215ri(z);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16306ri(boolean z, InterfaceC2879di interfaceC2879di) {
        this.f13082sf = interfaceC2879di;
        this.f13080qt.m16195lr(z);
        C3116ri.m12672ri().m12684lr(this.f13075ik);
        this.f13081ri.m9767a_(this.jbs);
        C3546mj c3546mj = this.f13080qt;
        if (c3546mj != null) {
            c3546mj.m16174di(C3116ri.m12672ri().m12687ri(this.f13075ik));
            this.f13080qt.m16202mj(this.jbs);
        }
    }

    public dzy xha() {
        return this.xha;
    }
}
