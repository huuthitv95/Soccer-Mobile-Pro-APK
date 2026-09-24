package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.model.C3274aw;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.p190aw.C3090di;
import com.bytedance.sdk.openadsdk.core.p190aw.C3091fi;
import com.bytedance.sdk.openadsdk.core.p221ka.C3263ri;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3230fi extends C2634di implements C3232ik.ik {

    /* JADX INFO: renamed from: aw */
    private List<String> f10815aw;
    private lr bgr;

    /* JADX INFO: renamed from: co */
    private int f10816co;

    /* JADX INFO: renamed from: di */
    AtomicBoolean f10817di;

    /* JADX INFO: renamed from: fi */
    protected boolean f10818fi;
    private ik jbs;

    /* JADX INFO: renamed from: ka */
    protected boolean f10819ka;

    /* JADX INFO: renamed from: mj */
    private wjv f10820mj;

    /* JADX INFO: renamed from: qt */
    private com.bytedance.sdk.openadsdk.core.model.wjv f10821qt;

    /* JADX INFO: renamed from: sf */
    private String f10822sf;
    private long slm;

    /* JADX INFO: renamed from: vr */
    private int f10823vr;
    AtomicBoolean xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.fi$ik */
    public static class ik {

        /* JADX INFO: renamed from: ri */
        protected int f10829ri = 0;

        /* JADX INFO: renamed from: lr */
        private C3090di f10828lr = C3090di.m12390ri();

        ik() {
        }

        /* JADX INFO: renamed from: lr */
        public void m13642lr() {
            m13643ri();
        }

        /* JADX INFO: renamed from: ri */
        public void m13643ri() {
            C3090di c3090di;
            int i = this.f10829ri;
            if (i != 0 && i != 4 && (c3090di = this.f10828lr) != null) {
                c3090di.m12400ka();
            }
            this.f10829ri = 4;
            this.f10828lr = null;
        }

        /* JADX INFO: renamed from: ri */
        public void m13644ri(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            C3090di c3090di = this.f10828lr;
            if (c3090di != null) {
                c3090di.m12406ri(view, friendlyObstructionPurpose);
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m13645ri(WebView webView) {
            if (webView != null && this.f10829ri == 0) {
                if (this.f10828lr == null) {
                    this.f10828lr = C3090di.m12390ri();
                }
                this.f10828lr.m12407ri(webView);
                this.f10828lr.m12401lr();
                this.f10829ri = 1;
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m13646ri(boolean z) {
            C3090di c3090di;
            if (this.f10829ri == 1 && z && (c3090di = this.f10828lr) != null) {
                c3090di.m12399ik();
                this.f10829ri = 3;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.fi$lr */
    public interface lr {
        /* JADX INFO: renamed from: lr */
        void mo11533lr();

        /* JADX INFO: renamed from: ri */
        View mo11534ri();

        /* JADX INFO: renamed from: ri */
        void mo11535ri(int i, int i2);

        /* JADX INFO: renamed from: ri */
        void mo11536ri(View view, int i);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.fi$ri */
    static class ri extends C2634di.ri {

        /* JADX INFO: renamed from: ri */
        public static final Set<String> f10830ri = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.ri.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };

        /* JADX INFO: renamed from: lr */
        C3232ik.ik f10831lr;

        public ri(C3232ik.ik ikVar) {
            this.f10831lr = ikVar;
        }

        /* JADX INFO: renamed from: ri */
        private void m13647ri(String str) {
            int iLastIndexOf;
            C3232ik.ik ikVar;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!f10830ri.contains(str.substring(iLastIndexOf).toLowerCase()) || (ikVar = this.f10831lr) == null) {
                    return;
                }
                ikVar.mo13636lr(str);
            }
        }

        /* JADX INFO: renamed from: ri */
        private void m13648ri(String str, int i, String str2) {
            C3232ik.ik ikVar = this.f10831lr;
            if (ikVar != null) {
                ikVar.mo13638ri(106, i);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C3232ik.ik ikVar = this.f10831lr;
            if (ikVar != null) {
                ikVar.mo13637ri();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            m13647ri(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                m13648ri(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            m13647ri(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f10831lr.mo13641ri(str);
            return true;
        }
    }

    public C3230fi(Context context) {
        super(context, C2634di.ik.DSP);
        this.f10819ka = false;
        this.f10818fi = false;
        this.f10817di = new AtomicBoolean(false);
        this.xha = new AtomicBoolean(false);
        this.f10816co = 0;
    }

    private void ihz() {
        if (this.f10815aw == null) {
            C3414ik.m15522lr(this.f10821qt, this.f10822sf, "dsp_html_success_url", (JSONObject) null);
        } else {
            C3414ik.m15533ri(new AbstractRunnableC2676ik("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C3230fi.this.f10815aw != null && C3230fi.this.xha.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = C3230fi.this.f10815aw.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            C3414ik.m15522lr(C3230fi.this.f10821qt, C3230fi.this.f10822sf, "dsp_html_error_url", jSONObject);
                            C3230fi.this.f10815aw = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ac */
    public void m13635ac() {
        this.f10817di.set(false);
        String strRko = this.f10821qt.rko();
        if (TextUtils.isEmpty(strRko)) {
            return;
        }
        String strM12415ri = C3091fi.m12415ri(strRko);
        String str = TextUtils.isEmpty(strM12415ri) ? strRko : strM12415ri;
        this.f10816co = 0;
        m9784ri(null, str, "text/html", "UTF-8", null);
        this.slm = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3232ik.ik
    /* JADX INFO: renamed from: lr */
    public void mo13636lr(String str) {
        if (this.f10815aw == null) {
            this.f10815aw = new ArrayList();
        }
        this.f10815aw.add(str);
    }

    @Override // com.bytedance.sdk.component.jbs.C2634di, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10819ka) {
            this.jbs.m13645ri(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.jbs.C2634di, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.jbs.m13643ri();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.f10823vr / 100.0f);
        } catch (Throwable unused) {
        }
        C3414ik.m15522lr(this.f10821qt, this.f10822sf, "load_rate", jSONObject);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        this.f10818fi = z;
        this.jbs.m13646ri(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3232ik.ik
    /* JADX INFO: renamed from: ri */
    public void mo13637ri() {
        if (this.f10817di.compareAndSet(false, true)) {
            this.f10819ka = true;
            this.jbs.m13645ri(getWebView());
            this.jbs.m13646ri(this.f10818fi);
            tan();
            ihz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3232ik.ik
    /* JADX INFO: renamed from: ri */
    public void mo13638ri(int i, int i2) {
        lr lrVar = this.bgr;
        if (lrVar != null) {
            lrVar.mo11535ri(i, i2);
        }
        this.f10816co = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i2);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.slm);
        } catch (Throwable unused) {
        }
        C3414ik.m15522lr(this.f10821qt, this.f10822sf, "render_html_fail", jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    public void m13639ri(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.jbs.m13644ri(view, friendlyObstructionPurpose);
    }

    /* JADX INFO: renamed from: ri */
    public void m13640ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, lr lrVar, String str) {
        this.bgr = lrVar;
        this.f10821qt = wjvVar;
        this.f10822sf = str;
        this.jbs = new ik();
        this.f10820mj = new wjv(getContext());
        setWebViewClient(new ri(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                C3230fi.this.f10823vr = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    C3230fi.this.mo13637ri();
                }
            }
        });
        com.bytedance.sdk.component.utils.jbs.m10234lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = C3230fi.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            C3230fi.this.f10820mj.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3232ik.ik
    /* JADX INFO: renamed from: ri */
    public void mo13641ri(String str) {
        boolean zM13502ri;
        if (TextUtils.isEmpty(str) || this.f10821qt == null || !this.f10820mj.m13743lr()) {
            return;
        }
        int iM16470ri = C3571ig.m16470ri(this.f10822sf);
        View viewMo11534ri = null;
        if (!C2724nr.m10260ri(str) && (this.f10821qt.lau() == null || TextUtils.isEmpty(this.f10821qt.lau().m14016ri()))) {
            C3274aw c3274aw = new C3274aw();
            c3274aw.m14018ri(str);
            this.f10821qt.m14497ri(c3274aw);
            str = null;
        }
        this.f10821qt.m14432ka(true);
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10821qt;
        if (wjvVar == null || wjvVar.lau() == null || TextUtils.isEmpty(this.f10821qt.lau().m14016ri())) {
            zM13502ri = false;
        } else {
            zM13502ri = C3214ig.m13502ri(getContext(), this.f10821qt, iM16470ri, this.f10822sf, true, (Map<String, Object>) null);
            if (!zM13502ri && !TextUtils.isEmpty(this.f10821qt.lau().m14014lr())) {
                str = this.f10821qt.lau().m14014lr();
                C3414ik.m15553ri(this.f10821qt, this.f10822sf, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!zM13502ri) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                C3214ig.m13501ri(getContext(), this.f10821qt, iM16470ri, (PAGNativeAd) null, (C3263ri) null, this.f10822sf, true, str2);
            }
        }
        if (this.f10820mj != null) {
            lr lrVar = this.bgr;
            if (lrVar != null) {
                viewMo11534ri = lrVar.mo11534ri();
                this.bgr.mo11536ri(this, 2);
            }
            C3277co c3277coM13744ri = this.f10820mj.m13744ri(getContext(), viewMo11534ri);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            C3414ik.m15563ri("click", this.f10821qt, c3277coM13744ri, this.f10822sf, true, (Map<String, Object>) map, this.f10820mj.m13743lr() ? 1 : 2);
        }
        wjv wjvVar2 = this.f10820mj;
        if (wjvVar2 != null) {
            wjvVar2.m13745ri();
        }
    }

    @Override // com.bytedance.sdk.component.jbs.C2634di
    public void slm() {
        this.jbs.m13642lr();
        super.slm();
    }

    public void tan() {
        lr lrVar = this.bgr;
        if (lrVar != null) {
            lrVar.mo11533lr();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.slm);
        } catch (Throwable unused) {
        }
        C3414ik.m15522lr(this.f10821qt, this.f10822sf, "render_html_success", jSONObject);
    }
}
