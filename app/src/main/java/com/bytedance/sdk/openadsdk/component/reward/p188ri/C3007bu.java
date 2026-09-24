package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.slm;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3091fi;
import com.bytedance.sdk.openadsdk.core.p190aw.C3092ik;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.core.p219ik.xha;
import com.bytedance.sdk.openadsdk.core.srn;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2884mj;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C3007bu implements InterfaceC2884mj {

    /* JADX INFO: renamed from: di */
    private xha f9291di;

    /* JADX INFO: renamed from: fi */
    private boolean f9292fi;

    /* JADX INFO: renamed from: ik */
    private C2634di f9293ik;
    private final C3022ri jbs;

    /* JADX INFO: renamed from: ka */
    private ImageView f9294ka;

    /* JADX INFO: renamed from: lr */
    private final wjv f9295lr;

    /* JADX INFO: renamed from: mj */
    private volatile boolean f9296mj;

    /* JADX INFO: renamed from: qt */
    private int f9297qt;

    /* JADX INFO: renamed from: ri */
    private final Activity f9298ri;
    private final AtomicBoolean xha = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.bu$ri */
    private static class ri implements slm {

        /* JADX INFO: renamed from: ik */
        private final WeakReference<C3007bu> f9305ik;

        /* JADX INFO: renamed from: ka */
        private final AtomicBoolean f9306ka;

        /* JADX INFO: renamed from: lr */
        private final String f9307lr;

        /* JADX INFO: renamed from: ri */
        private final WeakReference<ImageView> f9308ri;

        public ri(ImageView imageView, String str, C3007bu c3007bu, AtomicBoolean atomicBoolean) {
            this.f9308ri = new WeakReference<>(imageView);
            this.f9307lr = str;
            this.f9305ik = new WeakReference<>(c3007bu);
            this.f9306ka = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8254ri(int i, String str, Throwable th) {
            C3007bu c3007bu;
            ImageView imageView = this.f9308ri.get();
            if (imageView == null || (c3007bu = this.f9305ik.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            c3007bu.m11849ri(-2, this.f9307lr);
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
            C3007bu c3007bu;
            ImageView imageView = this.f9308ri.get();
            if (imageView == null || (c3007bu = this.f9305ik.get()) == null || interfaceC2630sf == null) {
                return;
            }
            Object objMo9673lr = interfaceC2630sf.mo9673lr();
            if (objMo9673lr == null) {
                c3007bu.m11849ri(-1, this.f9307lr);
                return;
            }
            if (objMo9673lr instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objMo9673lr);
            } else if (objMo9673lr instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m(objMo9673lr)) {
                    cc$$ExternalSyntheticApiModelOutline0.m17094m(objMo9673lr).start();
                }
                imageView.setImageDrawable((Drawable) objMo9673lr);
            }
            this.f9306ka.set(true);
            c3007bu.m11844ik();
        }
    }

    public C3007bu(C3022ri c3022ri) {
        this.jbs = c3022ri;
        this.f9295lr = c3022ri.f9389lr;
        this.f9298ri = c3022ri.f9384ig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m11844ik() {
        m11849ri(Integer.MAX_VALUE, (String) null);
    }

    /* JADX INFO: renamed from: ka */
    private void m11845ka() {
        this.f9293ik.m9773fi();
        m11850ri(this.f9293ik);
        this.f9293ik.setDisplayZoomControls(false);
        this.f9293ik.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bu.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    C3007bu.this.m11844ik();
                }
            }
        });
        this.f9293ik.setWebViewClient(new C2634di.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bu.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                C3007bu.this.m11844ik();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    C3007bu.this.m11849ri(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (C3007bu.this.m11853ri(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m11848ri(int i, int i2) {
        if (i == 0 || i2 == 0 || this.f9294ka == null) {
            return;
        }
        int iM16580ik = C3583qd.m16580ik((Context) this.f9298ri);
        int iM16578fi = C3583qd.m16578fi(this.f9298ri);
        float f = i / i2;
        float f2 = iM16580ik;
        if (f <= f2 / iM16578fi) {
            iM16580ik = (int) Math.ceil(f2 * f);
        } else {
            iM16578fi = (int) Math.ceil(f2 / f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9294ka.getLayoutParams();
        layoutParams.width = iM16580ik;
        layoutParams.height = iM16578fi;
        layoutParams.gravity = 17;
        this.f9294ka.setLayoutParams(layoutParams);
        this.f9294ka.setOnClickListener(this.f9291di);
        this.f9294ka.setOnTouchListener(this.f9291di);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11849ri(final int i, final String str) {
        if (this.f9296mj) {
            return;
        }
        this.f9296mj = true;
        if (i != Integer.MAX_VALUE) {
            C3414ik.m15533ri(new AbstractRunnableC2676ik("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bu.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i);
                        jSONObject.put("error_code", i);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        C3414ik.m15522lr(C3007bu.this.f9295lr, C3007bu.this.f9295lr.m14394fi(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            wjv wjvVar = this.f9295lr;
            C3414ik.m15522lr(wjvVar, wjvVar.m14394fi(), "load_vast_endcard_success", (JSONObject) null);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m11850ri(C2634di c2634di) {
        c2634di.setVerticalScrollBarEnabled(false);
        c2634di.setHorizontalScrollBarEnabled(false);
        c2634di.setMixedContentMode(0);
        c2634di.setJavaScriptEnabled(true);
        c2634di.setJavaScriptCanOpenWindowsAutomatically(true);
        c2634di.setDomStorageEnabled(true);
        c2634di.setDatabaseEnabled(true);
        c2634di.setCacheMode(-1);
        c2634di.setAllowFileAccess(false);
        c2634di.setSupportZoom(true);
        c2634di.setBuiltInZoomControls(true);
        c2634di.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        c2634di.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m11853ri(String str) {
        wjv wjvVar;
        if (str == null || (wjvVar = this.f9295lr) == null || wjvVar.m14525sr() == null || this.f9291di == null) {
            return false;
        }
        this.f9295lr.m14525sr().m12534di(str);
        this.f9291di.onClick(this.f9293ik);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2884mj
    /* JADX INFO: renamed from: ik */
    public void mo11095ik(int i) {
        int i2 = this.f9297qt;
        if (i2 == 0 && i > 0) {
            this.f9295lr.m14525sr().m12546ri().jbs(this.jbs.ihz.m12122aw());
        } else if (i2 > 0 && i == 0) {
            this.f9295lr.m14525sr().m12546ri().m12477mj(this.jbs.ihz.m12122aw());
        }
        this.f9297qt = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m11854lr() {
        DeviceUtils.AudioInfoReceiver.m16354lr(this);
        C2634di c2634di = this.f9293ik;
        if (c2634di != null) {
            srn.m14966ri(c2634di.getWebView());
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11855ri() {
        DeviceUtils.AudioInfoReceiver.m16356ri(this);
        this.f9297qt = DeviceUtils.xha();
        if (this.f9295lr.m14525sr() != null) {
            this.f9291di = new xha("VAST_END_CARD", this.f9295lr.m14525sr()) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bu.1
            };
            C3092ik c3092ikM12537ik = this.f9295lr.m14525sr().m12537ik();
            if (c3092ikM12537ik != null) {
                String strM12423ka = c3092ikM12537ik.m12423ka();
                if (!TextUtils.isEmpty(strM12423ka)) {
                    this.f9292fi = true;
                    this.f9294ka = (ImageView) this.jbs.f9396pv.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13296qt);
                    m11848ri(c3092ikM12537ik.m12426ri(), c3092ikM12537ik.m12424lr());
                    C3491ka.m15834ri(strM12423ka).mo9660ri(c3092ikM12537ik.m12426ri()).mo9655lr(c3092ikM12537ik.m12424lr()).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())).mo9652ik(1).mo9658ri(new C3492lr(this.f9295lr, strM12423ka, new ri(this.f9294ka, strM12423ka, this, this.xha)));
                    return;
                }
                C2634di c2634di = (C2634di) this.jbs.f9396pv.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13298sf);
                this.f9293ik = c2634di;
                if (c2634di == null) {
                    return;
                }
                m11845ka();
                String strM12422ik = c3092ikM12537ik.m12422ik();
                if (strM12422ik != null) {
                    this.f9292fi = true;
                    if (strM12422ik.startsWith(ProxyConfig.MATCH_HTTP)) {
                        this.f9293ik.m9767a_(strM12422ik);
                        return;
                    }
                    String strM12415ri = C3091fi.m12415ri(strM12422ik);
                    String str = TextUtils.isEmpty(strM12415ri) ? strM12422ik : strM12415ri;
                    this.f9293ik.setDefaultTextEncodingName("UTF -8");
                    this.f9293ik.m9784ri(null, str, "text/html", "UTF-8", null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11856ri(AbstractC3217fi abstractC3217fi) {
        xha xhaVar = this.f9291di;
        if (xhaVar != null) {
            xhaVar.m13549ri(abstractC3217fi);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11857ri(C3040vr c3040vr) {
        C3092ik c3092ikM12537ik;
        if (!this.f9292fi) {
            return false;
        }
        if (this.f9294ka == null || !this.xha.get()) {
            C2634di c2634di = this.f9293ik;
            if (c2634di != null) {
                c2634di.setVisibility(0);
                if (this.f9293ik.getWebView() != null) {
                    this.f9293ik.getWebView().setOnTouchListener(this.f9291di);
                }
            }
        } else {
            this.f9294ka.setVisibility(0);
        }
        wjv wjvVar = this.f9295lr;
        if (wjvVar == null || wjvVar.m14525sr() == null || (c3092ikM12537ik = this.f9295lr.m14525sr().m12537ik()) == null) {
            return true;
        }
        c3092ikM12537ik.m12425lr(c3040vr != null ? c3040vr.m12122aw() : -1L);
        return true;
    }
}
