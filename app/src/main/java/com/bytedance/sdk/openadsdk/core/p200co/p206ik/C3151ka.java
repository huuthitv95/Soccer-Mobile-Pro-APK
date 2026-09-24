package com.bytedance.sdk.openadsdk.core.p200co.p206ik;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.InterfaceC2488ik;
import com.bytedance.sdk.component.adexpress.p122fi.C2483fi;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf;
import com.bytedance.sdk.component.adexpress.p125lr.bgr;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import com.bytedance.sdk.openadsdk.core.model.C3276bu;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.utils.srn;
import com.bytedance.sdk.openadsdk.utils.tan;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ik.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3151ka implements InterfaceC2510sf, InterfaceC3150ik<C2634di> {

    /* JADX INFO: renamed from: di */
    private InterfaceC3153ri f10347di;

    /* JADX INFO: renamed from: fi */
    private String f10348fi;

    /* JADX INFO: renamed from: ik */
    private C2634di f10349ik;
    private boolean jbs = false;

    /* JADX INFO: renamed from: ka */
    private dzy f10350ka;

    /* JADX INFO: renamed from: lr */
    private wjv f10351lr;

    /* JADX INFO: renamed from: mj */
    private final boolean f10352mj;

    /* JADX INFO: renamed from: qt */
    private ri f10353qt;

    /* JADX INFO: renamed from: ri */
    private Context f10354ri;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ik.ka$ri */
    public interface ri {
        void xha();
    }

    public C3151ka(Context context, wjv wjvVar, boolean z) {
        this.xha = 1;
        this.f10354ri = context;
        this.f10351lr = wjvVar;
        this.xha = wjvVar.bbu();
        this.f10352mj = z;
        if (z) {
            this.f10348fi = C3276bu.m14025lr(this.f10351lr).m14028ri(this.xha == 1);
        } else {
            this.f10348fi = C3276bu.m14024ik(this.f10351lr).m14028ri(this.xha == 1);
        }
    }

    /* JADX INFO: renamed from: mj */
    private void m13150mj() {
        dzy dzyVar = new dzy(this.f10354ri);
        this.f10350ka = dzyVar;
        dzyVar.m13422lr(this.f10349ik).m13442ri(this.f10351lr).m13411ik(this.f10351lr.m14533tn()).m13416ka(this.f10351lr.yjg()).m13408fi(this.f10351lr.m14541uo()).m13447ri(C3239lr.m13711ri(0.0f, 0.0f, false, this.f10351lr, null, null)).m13434ri(this).m13435ri(this.f10349ik);
    }

    /* JADX INFO: renamed from: ri */
    private void m13152ri(C2634di c2634di) {
        if (c2634di == null) {
            return;
        }
        try {
            C3349ik.m15077ri(this.f10354ri).m15081ri(false).m15082ri(c2634di.getWebView());
            c2634di.setVerticalScrollBarEnabled(false);
            c2634di.setHorizontalScrollBarEnabled(false);
            C3349ik.m15079ri(c2634di);
            c2634di.bgr();
            c2634di.setUserAgentString(tan.m16659ri(c2634di.getWebView(), BuildConfig.VERSION_CODE));
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
        } catch (Exception unused) {
        }
    }

    private void xha() {
        C3151ka c3151ka;
        this.f10349ik.setBackgroundColor(0);
        this.f10349ik.setBackgroundResource(R.color.transparent);
        this.f10349ik.setVisibility(8);
        m13152ri(this.f10349ik);
        if (this.f10351lr != null) {
            c3151ka = this;
            this.f10349ik.setWebViewClient(new C3348fi(this.f10354ri, this.f10350ka, this.f10351lr.m14533tn(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.co.ik.ka.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (C3151ka.this.f10353qt != null) {
                        C3151ka.this.f10353qt.xha();
                    }
                }
            });
        } else {
            c3151ka = this;
        }
        C2483fi.m8762ri().m8777ri(c3151ka.f10349ik, c3151ka.f10350ka);
        c3151ka.f10349ik.setWebChromeClient(new C3350ka(c3151ka.f10350ka));
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3150ik
    /* JADX INFO: renamed from: di, reason: merged with bridge method [inline-methods] */
    public C2634di mo13145ka() {
        return this.f10349ik;
    }

    /* JADX INFO: renamed from: fi */
    public dzy m13154fi() {
        return this.f10350ka;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3150ik
    /* JADX INFO: renamed from: ik */
    public void mo13144ik() {
        dzy dzyVar = this.f10350ka;
        if (dzyVar != null) {
            dzyVar.m13412ik();
        }
        this.f10350ka = null;
        try {
            C2634di c2634di = this.f10349ik;
            if (c2634di != null) {
                ViewGroup viewGroup = (ViewGroup) c2634di.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.f10349ik);
                }
                this.f10349ik.slm();
            }
        } catch (Throwable unused) {
        }
        if (this.f10353qt != null) {
            this.f10353qt = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3150ik
    /* JADX INFO: renamed from: lr */
    public void mo13146lr() {
        if (TextUtils.isEmpty(this.f10348fi)) {
            this.f10349ik.setVisibility(8);
        } else {
            this.f10349ik.m9767a_(this.f10348fi);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3150ik
    /* JADX INFO: renamed from: ri */
    public void mo13147ri() {
        this.f10349ik = new C2634di(this.f10354ri, C2634di.ik.EASY_PLAYABLE);
        xha();
        m13150mj();
        if (this.f10352mj) {
            return;
        }
        srn.m16656ri(this.f10349ik, false, this.f10351lr.m14404go(), false, new srn.InterfaceC3591lr() { // from class: com.bytedance.sdk.openadsdk.core.co.ik.ka.1
            @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
            /* JADX INFO: renamed from: lr */
            public void mo13024lr() {
                C3151ka.this.m13156ri(false);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
            /* JADX INFO: renamed from: ri */
            public void mo13025ri() {
                C3151ka.this.m13156ri(true);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
            /* JADX INFO: renamed from: ri */
            public void mo13026ri(View view, boolean z) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
            /* JADX INFO: renamed from: ri */
            public void mo13027ri(boolean z) {
                C3151ka.this.m13156ri(z);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf
    /* JADX INFO: renamed from: ri */
    public void mo8756ri(View view, int i, InterfaceC2488ik interfaceC2488ik) {
        InterfaceC3153ri interfaceC3153ri = this.f10347di;
        if (interfaceC3153ri != null) {
            interfaceC3153ri.mo13165ri(view, i, interfaceC2488ik);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf
    /* JADX INFO: renamed from: ri */
    public void mo8757ri(bgr bgrVar) {
    }

    /* JADX INFO: renamed from: ri */
    public void m13155ri(ri riVar) {
        this.f10353qt = riVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3150ik
    /* JADX INFO: renamed from: ri */
    public void mo13148ri(InterfaceC3153ri interfaceC3153ri) {
        this.f10347di = interfaceC3153ri;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3150ik
    /* JADX INFO: renamed from: ri */
    public void mo13149ri(InterfaceC3247vr interfaceC3247vr) {
        dzy dzyVar = this.f10350ka;
        if (dzyVar != null) {
            dzyVar.m13441ri(interfaceC3247vr);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13156ri(boolean z) {
        if (z == this.jbs) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z ? 1 : 0);
        } catch (Exception e) {
            e.getMessage();
        }
        this.f10350ka.mo13455ri("visibleStateChange", jSONObject);
        this.jbs = z;
    }
}
