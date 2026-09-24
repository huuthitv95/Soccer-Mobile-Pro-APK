package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.p028vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.C2735zf;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj;
import com.bytedance.sdk.openadsdk.common.C2934fi;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3347di;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2881ik;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2884mj;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2885qt;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2886ri;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.InterfaceC3398co;
import com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi;
import com.bytedance.sdk.openadsdk.p236ka.tan;
import com.bytedance.sdk.openadsdk.utils.C3565di;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class slm implements InterfaceC2884mj {

    /* JADX INFO: renamed from: ac */
    private View f9432ac;

    /* JADX INFO: renamed from: aw */
    private int f9433aw;

    /* JADX INFO: renamed from: ay */
    private long f9434ay;
    private int bgr;

    /* JADX INFO: renamed from: co */
    private final boolean f9436co;

    /* JADX INFO: renamed from: dw */
    private final C3022ri f9438dw;
    private boolean dzy;
    private C3348fi hcw;

    /* JADX INFO: renamed from: ig */
    private boolean f9442ig;
    private View ihz;

    /* JADX INFO: renamed from: ik */
    protected String f9443ik;

    /* JADX INFO: renamed from: ka */
    C3393aw f9445ka;

    /* JADX INFO: renamed from: kt */
    private int f9446kt;

    /* JADX INFO: renamed from: nr */
    private boolean f9449nr;

    /* JADX INFO: renamed from: pv */
    private boolean f9451pv;

    /* JADX INFO: renamed from: qh */
    private boolean f9453qh;

    /* JADX INFO: renamed from: qt */
    private final String f9454qt;

    /* JADX INFO: renamed from: ri */
    dzy f9455ri;
    private boolean rzk;

    /* JADX INFO: renamed from: sf */
    private int f9456sf;
    private boolean siy;
    private long srn;
    private boolean tan;
    private ILoader tnn;

    /* JADX INFO: renamed from: uq */
    private float f9459uq;

    /* JADX INFO: renamed from: vr */
    private C2634di f9460vr;
    private C3347di.ri whw;
    private float wjv;

    /* JADX INFO: renamed from: xd */
    private boolean f9461xd;
    protected InterfaceC3418fi xha;

    /* JADX INFO: renamed from: xm */
    private C2934fi f9462xm;
    private String zyn;

    /* JADX INFO: renamed from: lr */
    protected boolean f9447lr = true;
    private boolean slm = false;

    /* JADX INFO: renamed from: bu */
    private final AtomicBoolean f9435bu = new AtomicBoolean(true);

    /* JADX INFO: renamed from: fi */
    int f9440fi = 0;

    /* JADX INFO: renamed from: di */
    String f9437di = "";

    /* JADX INFO: renamed from: mj */
    boolean f9448mj = false;

    /* JADX INFO: renamed from: fr */
    private SparseArray<AbstractViewOnClickListenerC3218ik.ri> f9441fr = new SparseArray<>();

    /* JADX INFO: renamed from: su */
    private boolean f9457su = true;
    private float igq = -1.0f;

    /* JADX INFO: renamed from: zf */
    private float f9463zf = -1.0f;
    private boolean ory = false;

    /* JADX INFO: renamed from: oh */
    private long f9450oh = 0;

    /* JADX INFO: renamed from: qd */
    private long f9452qd = -1;

    /* JADX INFO: renamed from: jc */
    private volatile int f9444jc = 0;
    private int feb = -1;

    /* JADX INFO: renamed from: fe */
    private volatile int f9439fe = 0;

    /* JADX INFO: renamed from: ta */
    private volatile int f9458ta = 0;
    private long bnj = 0;
    public boolean jbs = false;
    private int gcp = -1;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.slm$ik */
    private static class C3036ik implements InterfaceC2885qt {

        /* JADX INFO: renamed from: ri */
        private final C2634di f9485ri;

        private C3036ik(C2634di c2634di) {
            this.f9485ri = c2634di;
        }

        @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2885qt
        /* JADX INFO: renamed from: lr */
        public void mo11096lr() {
            C2634di c2634di = this.f9485ri;
            if (c2634di == null) {
                return;
            }
            c2634di.m9779nr();
        }

        @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2885qt
        /* JADX INFO: renamed from: ri */
        public void mo11097ri() {
            C2634di c2634di = this.f9485ri;
            if (c2634di == null) {
                return;
            }
            c2634di.m9790vr();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.slm$ka */
    public interface InterfaceC3037ka {
        /* JADX INFO: renamed from: ri */
        void mo12113ri(WebView webView, String str);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.slm$lr */
    private static class C3038lr implements InterfaceC2886ri {

        /* JADX INFO: renamed from: ri */
        private final View f9486ri;

        public C3038lr(View view) {
            this.f9486ri = view;
        }

        @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2886ri
        /* JADX INFO: renamed from: lr */
        public int mo11098lr() {
            View view = this.f9486ri;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? C3583qd.m16580ik(C3299nr.m14642ri()) : measuredWidth;
        }

        @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2886ri
        /* JADX INFO: renamed from: ri */
        public int mo11099ri() {
            View view = this.f9486ri;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? C3583qd.m16578fi(C3299nr.m14642ri()) : measuredHeight;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.slm$ri */
    private static class C3039ri extends C3221ri implements C3220lr.ri {

        /* JADX INFO: renamed from: ik */
        private final View.OnClickListener f9487ik;

        /* JADX INFO: renamed from: lr */
        private final View f9488lr;

        /* JADX INFO: renamed from: ri */
        private final C3022ri f9489ri;

        public C3039ri(C3022ri c3022ri, View view, View.OnClickListener onClickListener) {
            super(c3022ri.f9384ig, c3022ri.f9389lr, c3022ri.f9381fi, c3022ri.f9387ka ? 7 : 5);
            this.f9489ri = c3022ri;
            this.f9488lr = view;
            this.f9487ik = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            m13536ri(map);
            m13534ri(c3022ri.f9406uq.m11944ik());
            m13531ri(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri, com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
        /* JADX INFO: renamed from: ri */
        public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
            if (!this.f9489ri.f9389lr.nhl()) {
                super.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
                this.f9489ri.f9397qd.mo10614xd();
            } else {
                this.f9487ik.onClick(view);
                this.f9488lr.setOnTouchListener(null);
                this.f9488lr.setOnClickListener(this.f9487ik);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
        /* JADX INFO: renamed from: ri */
        public void mo11528ri(View view, int i) {
            this.f9488lr.setOnTouchListener(null);
            this.f9488lr.setOnClickListener(this.f9487ik);
        }
    }

    public slm(C3022ri c3022ri) {
        this.f9438dw = c3022ri;
        this.f9454qt = c3022ri.f9381fi;
        this.f9436co = c3022ri.f9387ka;
    }

    /* JADX INFO: renamed from: aw */
    static /* synthetic */ int m12031aw(slm slmVar) {
        int i = slmVar.f9458ta;
        slmVar.f9458ta = i + 1;
        return i;
    }

    static /* synthetic */ int bgr(slm slmVar) {
        int i = slmVar.f9444jc;
        slmVar.f9444jc = i + 1;
        return i;
    }

    private InterfaceC3418fi dzy() {
        return new tan(2, this.f9436co ? "rewarded_video" : "fullscreen_interstitial_ad", this.f9438dw.f9389lr);
    }

    /* JADX INFO: renamed from: ri */
    private static String m12058ri(String str, wjv wjvVar, int i, int i2, int i3) {
        String str2;
        String str3;
        float fM14406gz = wjvVar.m14406gz();
        if (!TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (str.contains("?")) {
                    str3 = str + C11744X3.j.f26436c;
                } else {
                    str3 = str + "?";
                }
                str = str3 + "orientation=portrait";
            }
            if (str.contains("?")) {
                str2 = str + C11744X3.j.f26436c;
            } else {
                str2 = str + "?";
            }
            str = str2 + "height=" + i2 + "&width=" + i3 + "&aspect_ratio=" + fM14406gz;
        }
        return !C3279dw.m14092lr(wjvVar) ? C3565di.m16381ri(str) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12059ri(int i, InterfaceC3118lr interfaceC3118lr) {
        this.f9438dw.f9372ac.get();
        if (this.f9438dw.ajz == null || !this.f9438dw.ajz.f8467co || this.f9438dw.f9372ac.get()) {
            return;
        }
        this.f9438dw.f9372ac.set(true);
        if (this.f9438dw.f9410xe && C3273ac.m13950aw(this.f9438dw.f9389lr) && interfaceC3118lr != null) {
            interfaceC3118lr.mo10561fi();
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12061ri(String str, final InterfaceC3037ka interfaceC3037ka) {
        C2634di c2634di;
        final wjv wjvVar = this.f9438dw.f9389lr;
        C2634di c2634di2 = this.f9460vr;
        if (c2634di2 == null || c2634di2.getWebView() == null) {
            return;
        }
        C3393aw c3393awM15370lr = new C3393aw(wjvVar, this.f9460vr.getWebView(), new InterfaceC3398co() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.11
            @Override // com.bytedance.sdk.openadsdk.p236ka.InterfaceC3398co
            /* JADX INFO: renamed from: ri */
            public void mo10656ri(int i) {
                if (TextUtils.isEmpty(slm.this.zyn)) {
                    return;
                }
                C3414ik.ri.m15569ri(slm.this.f9446kt, slm.this.f9444jc, slm.this.f9458ta, slm.this.f9439fe - slm.this.f9458ta, wjvVar, "landingpage_endcard", i);
            }
        }, this.feb).m15370lr(true);
        this.f9445ka = c3393awM15370lr;
        this.whw = c3393awM15370lr.f12084ri;
        this.f9445ka.m15388ri(m12076co() ? "landingpage_endcard" : str);
        this.f9445ka.m15374lr(this.f9454qt);
        this.f9445ka.m15365ik(true);
        this.f9460vr.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.12
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                if (slm.this.f9445ka != null) {
                    slm.this.f9445ka.m15372lr(i2);
                }
            }
        });
        if (this.f9438dw.wjv != null) {
            this.f9445ka.m15387ri(this.f9438dw.wjv.m11968ri());
        }
        C2934fi c2934fiM16472ri = C3571ig.m16472ri(wjvVar, this.f9460vr, this.f9438dw.f9384ig, this.f9454qt);
        this.f9462xm = c2934fiM16472ri;
        if (c2934fiM16472ri != null) {
            c2934fiM16472ri.m11318ri(m12076co() ? "landingpage_endcard" : str);
        }
        if (m12076co()) {
            C3571ig.m16482ri(wjvVar, this.f9460vr);
        }
        C3348fi c3348fi = new C3348fi(C3299nr.m14642ri(), this.f9455ri, wjvVar.m14533tn(), this.f9462xm, this.f9445ka, wjvVar.che()) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                slm.this.rzk = false;
                slm.this.f9449nr = true;
                slm slmVar = slm.this;
                slmVar.m12059ri(100, slmVar.f9438dw.f9397qd);
                if (slm.this.f9438dw.ory.m12072ac()) {
                    View viewMo12226qt = slm.this.f9438dw.dzy.mo12226qt();
                    if (viewMo12226qt instanceof C3193ka) {
                        ((C3193ka) viewMo12226qt).setImageResource(C2729uq.m10305ka(slm.this.f9438dw.srn, "tt_skip_btn"));
                    }
                }
                DeviceUtils.AudioInfoReceiver.m16356ri(slm.this);
                slm.this.gcp = DeviceUtils.xha();
                if (slm.this.xha != null) {
                    slm.this.xha.mo15582fi();
                }
                C3022ri unused = slm.this.f9438dw;
                InterfaceC3037ka interfaceC3037ka2 = interfaceC3037ka;
                if (interfaceC3037ka2 != null) {
                    interfaceC3037ka2.mo12113ri(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
                if (slm.this.xha != null) {
                    slm.this.xha.mo15583ka();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str2, String str3) {
                super.onReceivedError(webView, i, str2, str3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !slm.this.m12066ri(webResourceRequest.getUrl().toString())) {
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        C3022ri unused = slm.this.f9438dw;
                        webResourceError.getErrorCode();
                        String.valueOf(webResourceError.getDescription());
                        String.valueOf(webResourceRequest.getUrl());
                    }
                    if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                        slm.this.f9435bu.set(false);
                        slm.this.rzk = false;
                        slm.this.m12059ri(webResourceError != null ? webResourceError.getErrorCode() : -1, slm.this.f9438dw.f9397qd);
                    }
                    if (slm.this.xha != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            slm.this.xha.mo15590ri(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceError != null) {
                        slm.this.f9440fi = webResourceError.getErrorCode();
                        slm.this.f9437di = String.valueOf(webResourceError.getDescription());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                C3022ri unused = slm.this.f9438dw;
                webResourceRequest.isForMainFrame();
                webResourceRequest.getUrl();
                webResourceResponse.getStatusCode();
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    slm.this.f9435bu.set(false);
                    slm.this.rzk = false;
                    if (webResourceResponse != null) {
                        slm.this.f9440fi = webResourceResponse.getStatusCode();
                        slm.this.f9437di = "onReceivedHttpError";
                    }
                    slm slmVar = slm.this;
                    slmVar.m12059ri(slmVar.f9440fi, slm.this.f9438dw.f9397qd);
                }
                if (slm.this.xha != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (webResourceResponse != null) {
                            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        }
                        slm.this.xha.mo15590ri(jSONObject);
                    } catch (JSONException unused2) {
                    }
                }
                if (webResourceRequest != null) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                try {
                    return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                } catch (Throwable th) {
                    C2707ac.m10206ri("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                try {
                    if (TextUtils.isEmpty(slm.this.zyn)) {
                        return super.shouldInterceptRequest(webView, str2);
                    }
                    slm.m12067sf(slm.this);
                    WebResourceResponseModel webResourceResponseModelM16748ri = C3611lr.m16744ri().m16748ri(slm.this.tnn, slm.this.zyn, str2);
                    if (webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getWebResourceResponse() != null) {
                        slm.m12031aw(slm.this);
                        return webResourceResponseModelM16748ri.getWebResourceResponse();
                    }
                    if (webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getMsg() == 2) {
                        slm.bgr(slm.this);
                    }
                    return super.shouldInterceptRequest(webView, str2);
                } catch (Throwable th) {
                    C2707ac.m10206ri("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str2);
                }
            }
        };
        this.hcw = c3348fi;
        this.f9460vr.setWebViewClient(c3348fi);
        this.hcw.m15072ri(wjvVar);
        this.hcw.m15073ri(this.f9436co ? "rewarded_video" : "fullscreen_interstitial_ad");
        if (wjvVar.che() && (c2634di = this.f9460vr) != null && c2634di.getWebView() != null) {
            this.f9460vr.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.3

                /* JADX INFO: renamed from: ik */
                private final int f9471ik = C3299nr.m14640lr();

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int i;
                    if (slm.this.f9445ka != null) {
                        slm.this.f9445ka.m15379ri(motionEvent);
                    }
                    if (slm.this.f9462xm != null) {
                        slm.this.f9462xm.m11314ri(motionEvent);
                    }
                    try {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 0) {
                            int i2 = 3;
                            if (actionMasked == 1) {
                                i = i2;
                            } else if (actionMasked != 2) {
                                i2 = actionMasked != 3 ? -1 : 4;
                                i = i2;
                            } else {
                                float rawX = motionEvent.getRawX();
                                float rawY = motionEvent.getRawY();
                                if (Math.abs(rawX - slm.this.f9459uq) >= this.f9471ik || Math.abs(rawY - slm.this.wjv) >= this.f9471ik) {
                                    slm.this.f9457su = false;
                                }
                                slm.this.igq += Math.abs(motionEvent.getX() - slm.this.f9459uq);
                                slm.this.f9463zf += Math.abs(motionEvent.getY() - slm.this.wjv);
                                i = (System.currentTimeMillis() - slm.this.f9434ay <= 200 || (slm.this.igq <= 8.0f && slm.this.f9463zf <= 8.0f)) ? 2 : 1;
                            }
                        } else {
                            slm.this.f9457su = true;
                            slm.this.f9441fr = new SparseArray();
                            slm.this.f9459uq = motionEvent.getRawX();
                            slm.this.wjv = motionEvent.getRawY();
                            slm.this.f9434ay = System.currentTimeMillis();
                            try {
                                long landingPageClickBegin = slm.this.f9460vr.getLandingPageClickBegin();
                                if (landingPageClickBegin > 0 && landingPageClickBegin < slm.this.f9434ay) {
                                    slm.this.f9434ay = landingPageClickBegin;
                                    slm.this.f9460vr.setLandingPageClickBegin(-1L);
                                }
                            } catch (Exception unused) {
                            }
                            slm.this.igq = -1.0f;
                            slm.this.f9463zf = -1.0f;
                            i = 0;
                        }
                        slm.this.f9441fr.put(motionEvent.getActionMasked(), new AbstractViewOnClickListenerC3218ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                        if (motionEvent.getAction() == 1 && C3273ac.m13958di(slm.this.f9438dw.f9389lr) && slm.this.f9438dw.f9397qd != null) {
                            slm.this.m12065ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    slm.this.f9438dw.f9397qd.mo10571qh();
                                }
                            });
                        }
                        if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!slm.this.slm || C3273ac.m13978qt(wjvVar)) && slm.this.f9457su)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("down_x", slm.this.f9459uq);
                            jSONObject.put("down_y", slm.this.wjv);
                            jSONObject.put("down_time", slm.this.f9434ay);
                            jSONObject.put("up_x", motionEvent.getRawX());
                            jSONObject.put("up_y", motionEvent.getRawY());
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                long landingPageClickEnd = slm.this.f9460vr.getLandingPageClickEnd();
                                if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                    try {
                                        slm.this.f9460vr.setLandingPageClickEnd(-1L);
                                    } catch (Exception unused2) {
                                    }
                                    jCurrentTimeMillis = landingPageClickEnd;
                                }
                            } catch (Exception unused3) {
                            }
                            jSONObject.put("up_time", jCurrentTimeMillis);
                            int[] iArr = new int[2];
                            slm slmVar = slm.this;
                            slmVar.ihz = slmVar.f9438dw.f9396pv.findViewById(520093713);
                            if (slm.this.ihz != null) {
                                slm.this.ihz.getLocationOnScreen(iArr);
                                jSONObject.put("button_x", iArr[0]);
                                jSONObject.put("button_y", iArr[1]);
                                jSONObject.put("button_width", slm.this.ihz.getWidth());
                                jSONObject.put("button_height", slm.this.ihz.getHeight());
                            }
                            if (slm.this.f9432ac != null) {
                                int[] iArr2 = new int[2];
                                slm.this.f9432ac.getLocationOnScreen(iArr2);
                                jSONObject.put("ad_x", iArr2[0]);
                                jSONObject.put("ad_y", iArr2[1]);
                                jSONObject.put("width", slm.this.f9432ac.getWidth());
                                jSONObject.put("height", slm.this.f9432ac.getHeight());
                            }
                            jSONObject.put("toolType", motionEvent.getToolType(0));
                            jSONObject.put("deviceId", motionEvent.getDeviceId());
                            jSONObject.put("source", motionEvent.getSource());
                            jSONObject.put("ft", C3277co.m14031ri(slm.this.f9441fr, C3304qt.m14669lr().m14700ri() ? 1 : 2));
                            jSONObject.put("user_behavior_type", slm.this.f9457su ? 1 : 2);
                            jSONObject.put("click_scence", 2);
                            if (slm.this.hcw != null) {
                                slm.this.hcw.m15075ri(jSONObject);
                            }
                            if (!slm.this.slm && !C3273ac.jbs(wjvVar)) {
                                if (slm.this.f9436co) {
                                    C3414ik.m15554ri(wjvVar, "rewarded_video", "click", jSONObject);
                                } else {
                                    C3414ik.m15554ri(wjvVar, "fullscreen_interstitial_ad", "click", jSONObject);
                                }
                                slm.this.slm = true;
                            }
                            return false;
                        }
                    } catch (Throwable th) {
                        Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th);
                    }
                    return false;
                }
            });
        }
        C2634di c2634di3 = this.f9460vr;
        if (c2634di3 != null) {
            c2634di3.setWebChromeClient(new C3350ka(this.f9455ri, this.f9445ka, this.f9462xm) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
        }
        m12100ri(this.f9460vr);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f9460vr.setLayerType(1, null);
        }
        this.f9460vr.setBackgroundColor(-1);
        this.f9460vr.setDisplayZoomControls(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m12065ri(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f9450oh < 100) {
            return false;
        }
        this.f9450oh = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m12066ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.f9438dw.f9389lr.che() && str.endsWith(".mp4");
    }

    /* JADX INFO: renamed from: sf */
    static /* synthetic */ int m12067sf(slm slmVar) {
        int i = slmVar.f9439fe;
        slmVar.f9439fe = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: xd */
    public void m12071xd() {
        this.f9461xd = true;
        this.f9453qh = false;
        this.f9438dw.f9386jc.removeMessages(600);
        this.f9438dw.f9386jc.removeMessages(700);
        this.f9438dw.f9386jc.removeMessages(900);
        this.f9438dw.f9394oh.m11863ka(false);
        this.f9438dw.slm.set(true);
        this.f9438dw.f9391nd.m11739aw();
        wjv wjvVar = this.f9438dw.f9389lr;
        wjvVar.nhl();
        if (wjvVar.nhl() || !C3571ig.m16463mj(C3279dw.m14097ri(wjvVar))) {
            return;
        }
        View viewMo12226qt = this.f9438dw.dzy.mo12226qt();
        View.OnClickListener onClickListener = (View.OnClickListener) viewMo12226qt.getTag(viewMo12226qt.getId());
        if (onClickListener != null) {
            C3039ri c3039ri = new C3039ri(this.f9438dw, viewMo12226qt, onClickListener);
            viewMo12226qt.setOnClickListener(c3039ri);
            viewMo12226qt.setOnTouchListener(c3039ri);
        }
    }

    /* JADX INFO: renamed from: ac */
    public boolean m12072ac() {
        if (wjv.m14334ik(this.f9438dw.f9389lr)) {
            return this.dzy && !this.f9451pv && this.f9438dw.hcw.m11821co();
        }
        return this.dzy && !this.f9451pv && this.f9435bu.get() && this.f9449nr;
    }

    /* JADX INFO: renamed from: aw */
    public boolean m12073aw() {
        return this.f9435bu.get();
    }

    /* JADX INFO: renamed from: ay */
    public boolean m12074ay() {
        return this.f9448mj;
    }

    public boolean bgr() {
        return this.f9449nr;
    }

    /* JADX INFO: renamed from: bu */
    public void m12075bu() {
        C2634di c2634di = this.f9460vr;
        if (c2634di != null) {
            c2634di.m9768aw();
        }
        if (this.f9452qd == 0) {
            this.f9452qd = SystemClock.elapsedRealtime();
        }
        wjv wjvVar = this.f9438dw.f9389lr;
        dzy dzyVar = this.f9455ri;
        if (dzyVar != null) {
            dzyVar.m13459sf();
            C2634di c2634di2 = this.f9460vr;
            if (c2634di2 != null) {
                if (c2634di2.getVisibility() == 0) {
                    this.f9455ri.m13448ri(true);
                    m12089lr(this.f9455ri, true);
                    m12103ri(this.f9455ri, false, true);
                    if (C3279dw.m14093mj(wjvVar) && !this.f9461xd && this.f9438dw.f9389lr.nhl()) {
                        xha();
                    }
                } else {
                    this.f9455ri.m13448ri(false);
                    m12089lr(this.f9455ri, false);
                    m12103ri(this.f9455ri, true, false);
                }
            }
        }
        C3393aw c3393aw = this.f9445ka;
        if (c3393aw != null) {
            c3393aw.xha();
        }
    }

    /* JADX INFO: renamed from: co */
    public boolean m12076co() {
        String str = this.f9443ik;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: di */
    public void m12077di() {
        wjv wjvVar = this.f9438dw.f9389lr;
        if (TextUtils.isEmpty(wjv.m14346ri(this.f9438dw.srn, wjvVar))) {
            if (wjvVar != null && !wjvVar.dzy() && this.tnn == null && m12076co()) {
                this.zyn = wjvVar.mvf();
                this.tnn = C3611lr.m16744ri().m16746lr();
                int iM16747ri = C3611lr.m16744ri().m16747ri(this.tnn, this.zyn);
                this.f9446kt = iM16747ri;
                this.feb = iM16747ri > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.zyn)) {
                    C3393aw c3393aw = this.f9445ka;
                    if (c3393aw != null) {
                        c3393aw.m15377ri(this.feb);
                    }
                    C3414ik.ri.m15571ri(this.bnj, wjvVar, "landingpage_endcard", this.tnn, this.zyn);
                }
            }
            if ((!TextUtils.isEmpty(this.f9443ik) && this.f9443ik.contains("play.google.com/store")) || ((wjvVar != null && !wjvVar.zyn() && C3273ac.m13973mj(wjvVar)) || C3273ac.xha(wjvVar))) {
                this.f9448mj = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.f9447lr + ",webViewIsLoading " + this.rzk);
            if (this.f9447lr) {
                boolean z = this.f9438dw.saa;
                if (this.f9460vr == null || ((!z && TextUtils.isEmpty(this.f9443ik)) || !wjv.m14340lr(wjvVar))) {
                    if (wjv.m14334ik(wjvVar)) {
                        this.f9438dw.hcw.m11824ik();
                    }
                } else {
                    if (this.rzk) {
                        return;
                    }
                    String str = this.f9443ik + "&is_pre_render=1";
                    C3393aw c3393aw2 = this.f9445ka;
                    if (c3393aw2 != null) {
                        c3393aw2.m15367ka();
                    }
                    C3594uq.m16663ri(this.f9460vr, str);
                    this.rzk = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: di */
    public void m12078di(boolean z) {
        this.f9451pv = true;
        JSONObject jSONObject = new JSONObject();
        wjv wjvVar = this.f9438dw.f9389lr;
        try {
            jSONObject.put("endcard_overlay_render_type", wjv.m14334ik(wjvVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        C3414ik.m15522lr(wjvVar, this.f9454qt, "use_second_endcard", jSONObject);
        this.f9452qd = SystemClock.elapsedRealtime();
        try {
            if (!wjv.m14334ik(wjvVar)) {
                this.f9455ri.mo13455ri("click_endcard_close", (JSONObject) null);
            } else if (z) {
                this.f9438dw.hcw.m11827mj();
                C3414ik.m15522lr(wjvVar, this.f9454qt, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        this.f9438dw.aac.mo16373ri(this.f9438dw.xha);
    }

    /* JADX INFO: renamed from: dw */
    public boolean m12079dw() {
        C2634di c2634di = this.f9460vr;
        return c2634di == null || c2634di.getWebView() == null;
    }

    /* JADX INFO: renamed from: fi */
    public void m12080fi() {
        if (C3279dw.m14088fi(this.f9438dw.f9389lr) && this.f9438dw.luy) {
            return;
        }
        m12077di();
    }

    /* JADX INFO: renamed from: fi */
    public void m12081fi(boolean z) {
        if (this.f9455ri == null || this.f9438dw.f9384ig.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            this.f9455ri.mo13455ri("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: fr */
    public void m12082fr() {
        InterfaceC3418fi interfaceC3418fi = this.xha;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.jbs();
        }
    }

    public boolean hcw() {
        return this.f9461xd;
    }

    public boolean igq() {
        return this.f9449nr && this.f9435bu.get();
    }

    public void ihz() {
        InterfaceC3418fi interfaceC3418fi = this.xha;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.xha();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2884mj
    /* JADX INFO: renamed from: ik */
    public void mo11095ik(int i) {
        int i2 = this.gcp;
        if (i2 <= 0 && i > 0) {
            m12085ka(false);
        } else if (i2 > 0 && i == 0) {
            m12085ka(true);
        }
        this.gcp = i;
    }

    /* JADX INFO: renamed from: ik */
    public void m12083ik(boolean z) {
        m12089lr(this.f9455ri, z);
    }

    /* JADX INFO: renamed from: ik */
    public boolean m12084ik() {
        return this.f9442ig;
    }

    public dzy jbs() {
        return this.f9455ri;
    }

    /* JADX INFO: renamed from: ka */
    public void m12085ka(boolean z) {
        if (C3279dw.m14092lr(this.f9438dw.f9389lr)) {
            return;
        }
        m12081fi(z);
    }

    /* JADX INFO: renamed from: ka */
    public boolean m12086ka() {
        return this.f9451pv;
    }

    /* JADX INFO: renamed from: lr */
    void m12087lr() {
        this.f9432ac = this.f9438dw.f9384ig.findViewById(R.id.content);
        C2634di c2634di = (C2634di) this.f9438dw.f9396pv.findViewById(com.bytedance.sdk.openadsdk.utils.slm.slm);
        this.f9460vr = c2634di;
        if (c2634di == null || !wjv.m14340lr(this.f9438dw.f9389lr)) {
            C3583qd.m16612ri((View) this.f9460vr, 8);
        } else {
            this.f9460vr.m9773fi();
        }
        C2634di c2634di2 = this.f9460vr;
        if (c2634di2 != null) {
            c2634di2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (slm.this.f9460vr == null || slm.this.f9460vr.getViewTreeObserver() == null) {
                        return;
                    }
                    slm.this.f9460vr.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = slm.this.f9460vr.getMeasuredWidth();
                    int measuredHeight = slm.this.f9460vr.getMeasuredHeight();
                    if (slm.this.f9460vr.getVisibility() == 0) {
                        slm.this.m12098ri(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m12088lr(int i) {
        InterfaceC3418fi interfaceC3418fi = this.xha;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.mo15603ri(i);
            this.xha.mo15595ik();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m12089lr(dzy dzyVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            dzyVar.mo13455ri(C11744X3.h.f26280V, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m12090lr(boolean z) {
        m12102ri(this.f9455ri, z);
    }

    /* JADX INFO: renamed from: mj */
    public C2634di m12091mj() {
        return this.f9460vr;
    }

    /* JADX INFO: renamed from: nr */
    public int m12092nr() {
        return this.f9440fi;
    }

    /* JADX INFO: renamed from: oh */
    public boolean m12093oh() {
        return this.jbs;
    }

    public void ory() {
        C3393aw c3393aw = this.f9445ka;
        if (c3393aw != null) {
            c3393aw.m15362fi();
        }
    }

    /* JADX INFO: renamed from: qt */
    public void m12094qt() {
        C1997lr c1997lrM14389eu;
        wjv wjvVar = this.f9438dw.f9389lr;
        String strM14446mj = wjvVar.m14446mj();
        if (!TextUtils.isEmpty(strM14446mj) && this.f9438dw.ajz != null && (this.f9438dw.ajz.m11005ig() || this.f9438dw.ajz.m11008jc().m10969su())) {
            this.f9443ik = strM14446mj;
        } else if (!C3279dw.m14088fi(wjvVar)) {
            this.f9443ik = C3279dw.m14085co(wjvVar);
        } else if (wjvVar != null && (c1997lrM14389eu = wjvVar.m14389eu()) != null) {
            this.f9443ik = c1997lrM14389eu.m6338co();
        }
        String strM12058ri = m12058ri(this.f9443ik, wjvVar, this.f9456sf, this.bgr, this.f9433aw);
        this.f9443ik = strM12058ri;
        if (TextUtils.isEmpty(strM12058ri)) {
            return;
        }
        this.dzy = this.f9443ik.contains("use_second_endcard=1");
    }

    /* JADX INFO: renamed from: ri */
    public void m12095ri() {
        if (this.tan) {
            return;
        }
        this.tan = true;
        this.f9456sf = this.f9438dw.bnj;
        this.f9433aw = this.f9438dw.whw;
        this.bgr = this.f9438dw.f9411xm;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m12087lr();
        this.bnj = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ri */
    public void m12096ri(float f) {
        C3583qd.m16611ri(this.f9460vr, f);
    }

    /* JADX INFO: renamed from: ri */
    public void m12097ri(int i) {
        if (this.f9449nr || !this.f9435bu.get()) {
            m12059ri(0, this.f9438dw.f9397qd);
        }
        C3583qd.m16612ri((View) this.f9460vr, i);
        C2634di c2634di = this.f9460vr;
        if (c2634di != null) {
            C3583qd.m16612ri((View) c2634di.getWebView(), i);
        }
        wjv wjvVar = this.f9438dw.f9389lr;
        if (this.f9460vr == null || !wjvVar.che()) {
            return;
        }
        this.f9460vr.setLandingPage(true);
        this.f9460vr.setTag("landingpage_endcard");
        this.f9460vr.setMaterialMeta(wjvVar.m14452nb());
    }

    /* JADX INFO: renamed from: ri */
    public void m12098ri(int i, int i2) {
        if (this.f9455ri == null || this.f9438dw.f9384ig.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            this.f9455ri.mo13455ri("resize", jSONObject);
        } catch (Exception e) {
            Log.e("TTAD.RFWVM", "", e);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12099ri(DownloadListener downloadListener) {
        C2634di c2634di = this.f9460vr;
        if (c2634di == null || downloadListener == null) {
            return;
        }
        c2634di.setDownloadListener(downloadListener);
    }

    /* JADX INFO: renamed from: ri */
    public void m12100ri(C2634di c2634di) {
        if (c2634di == null) {
            return;
        }
        C3349ik.m15077ri(this.f9438dw.f9384ig).m15081ri(false).m15080lr(false).m15082ri(c2634di.getWebView());
        c2634di.setUserAgentString(com.bytedance.sdk.openadsdk.utils.tan.m16659ri(c2634di.getWebView(), BuildConfig.VERSION_CODE));
        c2634di.setMixedContentMode(0);
    }

    /* JADX INFO: renamed from: ri */
    public void m12101ri(InterfaceC2879di interfaceC2879di, String str, final InterfaceC3118lr interfaceC3118lr) {
        if (this.f9460vr == null) {
            return;
        }
        HashMap map = new HashMap();
        final wjv wjvVar = this.f9438dw.f9389lr;
        map.put("click_scence", 2);
        this.xha = dzy();
        dzy dzyVar = new dzy(this.f9438dw.f9384ig);
        this.f9455ri = dzyVar;
        dzyVar.m13451ri(this.f9438dw.f9397qd);
        dzy dzyVarM13435ri = this.f9455ri.m13422lr(this.f9460vr).m13442ri(wjvVar).m13447ri(C3239lr.m13712ri(wjvVar)).m13411ik(wjvVar.m14533tn()).m13416ka(wjvVar.yjg()).m13421lr(wjvVar.m14472qa() ? 7 : 5).m13439ri(new C3038lr(this.f9460vr)).m13408fi(wjvVar.m14541uo()).m13435ri(this.f9460vr);
        if (m12076co()) {
            str = "landingpage_endcard";
        }
        dzyVarM13435ri.m13423lr(str).m13446ri(map).m13445ri(this.xha).m13443ri(new InterfaceC3338fi() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi
            /* JADX INFO: renamed from: ri */
            public void mo10615ri() {
                if (slm.this.hcw != null) {
                    slm.this.hcw.m15066ik();
                }
                InterfaceC3118lr interfaceC3118lr2 = interfaceC3118lr;
                if (interfaceC3118lr2 != null) {
                    interfaceC3118lr2.gcp();
                }
            }
        }).m13453ri(new dzy.InterfaceC3210ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.7
            @Override // com.bytedance.sdk.openadsdk.core.dzy.InterfaceC3210ri
            /* JADX INFO: renamed from: ri */
            public void mo12114ri() {
                slm.this.m12071xd();
            }
        });
        this.f9455ri.m13438ri(new C3036ik(this.f9460vr));
        this.f9455ri.m13433ri(this.f9438dw.dzy.mo12226qt()).m13436ri(this.f9438dw.wjv.m11959ik()).m13437ri(new InterfaceC2881ik() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.9
            @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2881ik
            /* JADX INFO: renamed from: ri */
            public void mo11087ri() {
                slm.this.f9442ig = true;
                slm.this.f9438dw.dzy.mo12226qt().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2881ik
            /* JADX INFO: renamed from: ri */
            public void mo11088ri(boolean z, int i, String str2) {
                if (z) {
                    slm.this.jbs = true;
                    if (slm.this.siy) {
                        slm.this.siy = false;
                        slm slmVar = slm.this;
                        slmVar.m12107ri(slmVar.f9438dw.zyn, true);
                    }
                }
                if (wjv.m14336ka(wjvVar)) {
                    slm.this.m12106ri(z, i, str2);
                }
            }
        });
        this.f9455ri.m13419ka(this.dzy);
    }

    /* JADX INFO: renamed from: ri */
    public void m12102ri(dzy dzyVar, boolean z) {
        if (this.f9455ri == null || this.f9438dw.f9384ig.isFinishing()) {
            return;
        }
        dzyVar.m13448ri(z);
    }

    /* JADX INFO: renamed from: ri */
    public void m12103ri(dzy dzyVar, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z2);
            AbstractC2859mj abstractC2859mj = this.f9438dw.ajz;
            String str = "end";
            if (abstractC2859mj != null) {
                jSONObject.put("multi_ads_show", abstractC2859mj.m11008jc().m10948qt());
                if (!abstractC2859mj.f8466bu) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", "end");
            }
            dzyVar.mo13455ri("endcard_control_event", jSONObject);
            if (!z2) {
                this.siy = false;
            } else {
                if (this.f9449nr) {
                    return;
                }
                this.siy = true;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12104ri(String str, final InterfaceC3118lr interfaceC3118lr) {
        m12061ri(str, new InterfaceC3037ka() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.slm.InterfaceC3037ka
            /* JADX INFO: renamed from: ri */
            public void mo12113ri(WebView webView, String str2) {
                if (slm.this.f9438dw.f9384ig.isFinishing()) {
                    return;
                }
                C3022ri unused = slm.this.f9438dw;
                slm.this.m12073aw();
            }
        });
        m12099ri(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                slm.this.f9438dw.f9406uq.m11945lr();
                InterfaceC3118lr interfaceC3118lr2 = interfaceC3118lr;
                if (interfaceC3118lr2 != null) {
                    interfaceC3118lr2.gcp();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m12105ri(boolean z) {
        this.f9447lr = z;
    }

    /* JADX INFO: renamed from: ri */
    public void m12106ri(boolean z, int i, String str) {
        InterfaceC3418fi interfaceC3418fi = this.xha;
        if (interfaceC3418fi == null) {
            return;
        }
        if (z) {
            interfaceC3418fi.mo15597lr();
        } else {
            interfaceC3418fi.mo15599ri(i, str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12107ri(boolean z, boolean z2) {
        m12103ri(this.f9455ri, z, z2);
    }

    /* JADX INFO: renamed from: sf */
    public void m12108sf() {
        C2634di c2634di = this.f9460vr;
        if (c2634di != null) {
            C2735zf.m10345ri(c2634di);
        }
        wjv wjvVar = this.f9438dw.f9389lr;
        long j = this.srn;
        if (j > 0) {
            if (this.f9452qd > 0) {
                this.srn = j + (SystemClock.elapsedRealtime() - this.f9452qd);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", wjv.m14334ik(wjvVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            C3414ik.m15555ri(this.f9438dw.f9389lr, this.f9454qt, "second_endcard_duration", jSONObject, this.srn);
        }
        this.f9460vr = null;
        if (this.xha != null && !C3273ac.m13968ka(wjvVar) && !C3273ac.xha(wjvVar) && !wjv.m14334ik(wjvVar)) {
            this.xha.mo15592ri(true);
            this.xha.mo15593sf();
        }
        dzy dzyVar = this.f9455ri;
        if (dzyVar != null) {
            dzyVar.m13403co();
        }
        C3393aw c3393aw = this.f9445ka;
        if (c3393aw != null) {
            c3393aw.m15369ka(wjvVar.che());
        }
        DeviceUtils.AudioInfoReceiver.m16354lr(this);
    }

    public void slm() {
        C2634di c2634di = this.f9460vr;
        if (c2634di != null) {
            c2634di.m9790vr();
        }
        if (this.f9452qd > 0) {
            this.srn += SystemClock.elapsedRealtime() - this.f9452qd;
            this.f9452qd = 0L;
        }
        dzy dzyVar = this.f9455ri;
        if (dzyVar != null) {
            dzyVar.m13448ri(false);
            m12089lr(this.f9455ri, false);
            m12103ri(this.f9455ri, true, false);
        }
    }

    /* JADX INFO: renamed from: su */
    public boolean m12109su() {
        dzy dzyVar = this.f9455ri;
        if (dzyVar == null) {
            return false;
        }
        return dzyVar.jbs();
    }

    public String tan() {
        return this.f9437di;
    }

    /* JADX INFO: renamed from: uq */
    public void m12110uq() {
        InterfaceC3418fi interfaceC3418fi = this.xha;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.mo15594di();
        }
    }

    /* JADX INFO: renamed from: vr */
    public void m12111vr() {
        InterfaceC3418fi interfaceC3418fi = this.xha;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.mo15596mj();
        }
        C3393aw c3393aw = this.f9445ka;
        if (c3393aw != null) {
            c3393aw.m15375mj();
        }
    }

    public void wjv() {
        C3393aw c3393aw = this.f9445ka;
        if (c3393aw != null) {
            c3393aw.m15378ri(System.currentTimeMillis());
        }
    }

    public void xha() {
        this.f9455ri.mo13455ri("showPlayableEndCardOverlay", (JSONObject) null);
        this.f9438dw.f9386jc.sendEmptyMessageDelayed(600, 1000L);
        this.f9438dw.f9386jc.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.10
            @Override // java.lang.Runnable
            public void run() {
                slm.this.m12071xd();
            }
        }, 1000L);
        if (this.f9438dw.aac != null) {
            this.f9438dw.aac.mo16373ri(0L);
        }
    }

    public void xha(boolean z) {
        this.f9453qh = z;
    }

    /* JADX INFO: renamed from: zf */
    public boolean m12112zf() {
        return this.f9453qh;
    }
}
