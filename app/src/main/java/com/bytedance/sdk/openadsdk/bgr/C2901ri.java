package com.bytedance.sdk.openadsdk.bgr;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bykv.p028vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.InterfaceC2514ri;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.slm;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3585ri;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.bgr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2901ri {

    /* JADX INFO: renamed from: ik */
    private static int f8652ik = 2;

    /* JADX INFO: renamed from: ka */
    private static long f8653ka = 3600000;

    /* JADX INFO: renamed from: ri */
    private static volatile C2901ri f8654ri;

    /* JADX INFO: renamed from: fi */
    private LinkedHashMap<Integer, SoftReference<C2634di>> f8655fi;

    /* JADX INFO: renamed from: lr */
    private final Handler f8656lr;

    public C2901ri() {
        f8652ik = C3606fi.m16703ri("pre_render_count", 2);
        long jM16703ri = C3606fi.m16703ri("pre_render_duration", Constants.ONE_HOUR);
        f8653ka = jM16703ri;
        if (f8652ik <= 0) {
            f8652ik = 2;
        }
        if (jM16703ri <= 0) {
            f8653ka = 3600000L;
        }
        this.f8655fi = new LinkedHashMap<>();
        this.f8656lr = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                SoftReference softReference;
                int i = message.what;
                if (C2901ri.this.f8655fi == null || (softReference = (SoftReference) C2901ri.this.f8655fi.get(Integer.valueOf(i))) == null) {
                    return false;
                }
                C2634di c2634di = (C2634di) softReference.get();
                C2901ri.this.m11169ri(i, 2, new wjv(), c2634di == null ? "" : c2634di.getTag());
                return false;
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m11164ik(wjv wjvVar) {
        return C3273ac.m13973mj(wjvVar) || C3273ac.m13971lr(wjvVar) || C3273ac.m13965ik(wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    public static C2901ri m11167ri() {
        if (f8654ri == null) {
            synchronized (C2901ri.class) {
                if (f8654ri == null) {
                    f8654ri = new C2901ri();
                }
            }
        }
        return f8654ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11169ri(int i, int i2, wjv wjvVar, String str) {
        LinkedHashMap<Integer, SoftReference<C2634di>> linkedHashMap = this.f8655fi;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i))) {
            this.f8655fi.remove(Integer.valueOf(i));
        }
        Handler handler = this.f8656lr;
        if (handler != null) {
            handler.removeMessages(i);
        }
        m11176ri(wjvVar, str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11170ri(final int i, final wjv wjvVar, final String str, final boolean z) {
        Boolean.valueOf(z);
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.3
            /* JADX INFO: renamed from: ri */
            private C3348fi m11180ri(final C2634di c2634di, C3393aw c3393aw) {
                C3348fi c3348fi = new C3348fi(C3299nr.m14642ri(), null, wjvVar.m14533tn(), c3393aw, true) { // from class: com.bytedance.sdk.openadsdk.bgr.ri.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        C2634di c2634di2 = c2634di;
                        if (c2634di2 != null) {
                            c2634di2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        C2634di c2634di2 = c2634di;
                        if (c2634di2 != null) {
                            c2634di2.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i2, String str2, String str3) {
                        String strKa = m15061ka(str3);
                        boolean z2 = strKa != null && strKa.startsWith("image");
                        boolean z3 = strKa != null && strKa.startsWith("mp4");
                        if (!z2 && !z3 && !c2634di.m9774ik()) {
                            C2901ri.this.m11169ri(i, 4, wjvVar, str);
                        }
                        super.onReceivedError(webView, i2, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            C2901ri.this.m11169ri(i, 4, wjvVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        try {
                            if (!z) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            C2634di c2634di2 = c2634di;
                            if (c2634di2 != null) {
                                c2634di2.f7432ri++;
                            }
                            WebResourceResponseModel webResourceResponseModelM16748ri = C3611lr.m16744ri().m16748ri(C3611lr.m16744ri().m16746lr(), wjvVar.mvf(), str2);
                            if (webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getWebResourceResponse() != null) {
                                C2634di c2634di3 = c2634di;
                                if (c2634di3 != null) {
                                    c2634di3.f7425lr++;
                                }
                                return webResourceResponseModelM16748ri.getWebResourceResponse();
                            }
                            if (c2634di != null && webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getMsg() == 2) {
                                c2634di.f7422ik++;
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        return super.shouldOverrideUrlLoading(webView, str2);
                    }
                };
                c3348fi.m15072ri(wjvVar);
                c3348fi.m15073ri(str);
                return c3348fi;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
            @Override // java.lang.Runnable
            public void run() {
                C3585ri c3585riM14960fi;
                Activity activityM16638lr;
                if (C2901ri.this.f8655fi != null && C2901ri.this.f8655fi.size() >= C2901ri.f8652ik) {
                    Map.Entry entry = (Map.Entry) C2901ri.this.f8655fi.entrySet().iterator().next();
                    SoftReference softReference = (SoftReference) entry.getValue();
                    if (softReference != null) {
                        C2634di c2634di = (C2634di) softReference.get();
                        C2901ri.this.m11169ri(((Integer) entry.getKey()).intValue(), 1, wjvVar, c2634di == null ? "" : c2634di.getTag());
                    }
                }
                if (C2901ri.this.f8656lr != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    C2901ri.this.f8656lr.sendMessageDelayed(messageObtain, C2901ri.f8653ka);
                }
                SoftReference softReference2 = new SoftReference(new C2634di(C3299nr.m14642ri(), false, C2634di.ik.LANDING_PAGE_PRE_RENDER));
                final C2634di c2634di2 = (C2634di) softReference2.get();
                if (c2634di2 == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.dzy dzyVar = null;
                c2634di2.setLayerType(2, null);
                C3583qd.m16612ri((View) c2634di2, 4);
                c2634di2.setTag(str);
                c2634di2.setLandingPage(true);
                tan tanVarM14526su = wjvVar.m14526su();
                int iM14316ri = tanVarM14526su != null ? tanVarM14526su.m14316ri() : 3;
                if (iM14316ri == 2) {
                    int iM16580ik = C3583qd.m16580ik(C3299nr.m14642ri());
                    int iM16578fi = C3583qd.m16578fi(C3299nr.m14642ri());
                    int iBbu = wjvVar.bbu();
                    if (iBbu == 1) {
                        if (iM16580ik >= iM16578fi) {
                            c2634di2.layout(0, 0, iM16578fi, iM16580ik);
                        } else {
                            c2634di2.layout(0, 0, iM16580ik, iM16578fi);
                        }
                    } else if (iBbu == 2) {
                        if (iM16580ik < iM16578fi) {
                            c2634di2.layout(0, 0, iM16578fi, iM16580ik);
                        } else {
                            c2634di2.layout(0, 0, iM16580ik, iM16578fi);
                        }
                    }
                } else if (iM14316ri == 1 && (c3585riM14960fi = slm.m14959ri().m14960fi()) != null && (activityM16638lr = c3585riM14960fi.m16638lr()) != null) {
                    final int iHashCode = activityM16638lr.hashCode();
                    c3585riM14960fi.m16640ri(new InterfaceC2514ri() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.3.1
                        @Override // com.bytedance.sdk.component.adexpress.InterfaceC2514ri
                        /* JADX INFO: renamed from: ri */
                        public void mo8795ri(Activity activity) {
                            int i2 = iHashCode;
                            if (i2 == 0 || activity == null || i2 != activity.hashCode() || c2634di2.m9774ik()) {
                                return;
                            }
                            C2901ri.this.m11169ri(i, 5, wjvVar, str);
                        }
                    });
                    FrameLayout frameLayout = (FrameLayout) activityM16638lr.findViewById(R.id.content);
                    if (frameLayout != null) {
                        frameLayout.addView(c2634di2);
                    }
                }
                int iM16747ri = C3611lr.m16744ri().m16747ri(C3611lr.m16744ri().m16746lr(), wjvVar.mvf());
                C3393aw c3393aw = new C3393aw(wjvVar, c2634di2.getWebView());
                c3393aw.m15377ri(iM16747ri > 0 ? 2 : 0);
                c3393aw.m15391ri(true);
                c3393aw.m15370lr(true);
                c2634di2.setWebViewClient(m11180ri(c2634di2, c3393aw));
                c2634di2.setWebChromeClient(new C3350ka(dzyVar, c3393aw) { // from class: com.bytedance.sdk.openadsdk.bgr.ri.3.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i2) {
                        super.onProgressChanged(webView, i2);
                        if (i2 == 100) {
                            c2634di2.setPreProgressHundred(true);
                        }
                    }
                });
                C2901ri.this.m11171ri(c2634di2, wjvVar.smj());
                C2901ri.m11175ri(wjvVar, str, Double.valueOf((System.currentTimeMillis() / 1000) - wjvVar.jfv()).floatValue(), "web_start_pre_render");
                if (C2901ri.this.f8655fi != null) {
                    C2901ri.this.f8655fi.put(Integer.valueOf(i), softReference2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11171ri(C2634di c2634di, String str) {
        if (c2634di == null) {
            return;
        }
        C3349ik.m15077ri(C3299nr.m14642ri()).m15081ri(false).m15080lr(false).m15082ri(c2634di.getWebView());
        c2634di.setMixedContentMode(0);
        C3594uq.m16663ri(c2634di, str);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11175ri(wjv wjvVar, String str, final float f, String str2) {
        C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.4
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f);
                } catch (Throwable unused) {
                }
                Float.valueOf(f);
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m11176ri(wjv wjvVar, final String str, final int i) {
        C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, str, "web_delete_pre_render", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.5
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public C2634di m11177lr(wjv wjvVar) {
        if (wjvVar == null || TextUtils.isEmpty(wjvVar.smj())) {
            return null;
        }
        String strSmj = wjvVar.smj();
        if (TextUtils.isEmpty(strSmj)) {
            return null;
        }
        int iHashCode = strSmj.hashCode();
        SoftReference<C2634di> softReference = this.f8655fi.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        C2634di c2634di = softReference.get();
        m11175ri(wjvVar, c2634di.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - wjvVar.jfv()).floatValue(), "web_use_pre_render");
        m11169ri(iHashCode, 3, wjvVar, c2634di.getTag());
        return c2634di;
    }

    /* JADX INFO: renamed from: ri */
    public void m11178ri(final wjv wjvVar) {
        final String str;
        if (wjvVar == null || !m11164ik(wjvVar)) {
            return;
        }
        tan tanVarM14526su = wjvVar.m14526su();
        if (tanVarM14526su == null) {
            tanVarM14526su = new tan();
        }
        Boolean.valueOf(wjvVar.m14554wm());
        if (wjvVar.m14554wm()) {
            String strSmj = wjvVar.smj();
            if (TextUtils.isEmpty(strSmj)) {
                return;
            }
            final int iHashCode = strSmj.hashCode();
            if (C3273ac.m13971lr(wjvVar)) {
                str = "landingpage_split_screen";
            } else if (C3273ac.m13968ka(wjvVar)) {
                str = "landingpage_direct";
            } else {
                str = C3273ac.m13965ik(wjvVar) ? "landingpage_split_ceiling" : "";
            }
            LinkedHashMap<Integer, SoftReference<C2634di>> linkedHashMap = this.f8655fi;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                HashMap map = new HashMap();
                map.put(wjvVar.mvf(), wjvVar);
                if (tanVarM14526su.m14312lr() == 2) {
                    C3611lr.m16744ri().m16751ri((Map<String, wjv>) map, new C3611lr.ri() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.2
                        @Override // com.bytedance.sdk.openadsdk.xha.C3611lr.ri
                        /* JADX INFO: renamed from: ri */
                        public void mo11179ri() {
                            C2901ri.this.m11170ri(iHashCode, wjvVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (tanVarM14526su.m14312lr() == 1) {
                    C3611lr.m16744ri().m16751ri((Map<String, wjv>) map, (C3611lr.ri) null, true);
                    m11170ri(iHashCode, wjvVar, str, true);
                } else if (tanVarM14526su.m14312lr() == 0) {
                    m11170ri(iHashCode, wjvVar, str, false);
                }
            }
        }
    }
}
