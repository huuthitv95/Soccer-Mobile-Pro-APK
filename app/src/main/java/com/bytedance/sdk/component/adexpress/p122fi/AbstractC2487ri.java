package com.bytedance.sdk.component.adexpress.p122fi;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.InterfaceC2488ik;
import com.bytedance.sdk.component.adexpress.InterfaceC2514ri;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2507mj;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf;
import com.bytedance.sdk.component.adexpress.p125lr.bgr;
import com.bytedance.sdk.component.adexpress.p125lr.xha;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.adexpress.theme.InterfaceC2532ri;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2722lr;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.fi.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2487ri implements InterfaceC2505ka<C2634di>, InterfaceC2510sf, InterfaceC2514ri, InterfaceC2532ri {

    /* JADX INFO: renamed from: aw */
    private boolean f6857aw;
    private int bgr;

    /* JADX INFO: renamed from: co */
    private C2500aw f6858co;

    /* JADX INFO: renamed from: ik */
    protected boolean f6861ik;
    private String jbs;

    /* JADX INFO: renamed from: ka */
    protected C2634di f6862ka;

    /* JADX INFO: renamed from: lr */
    protected boolean f6863lr;

    /* JADX INFO: renamed from: mj */
    private String f6864mj;

    /* JADX INFO: renamed from: qt */
    private volatile xha f6865qt;

    /* JADX INFO: renamed from: ri */
    protected JSONObject f6866ri;

    /* JADX INFO: renamed from: sf */
    private InterfaceC2507mj f6867sf;
    private Context xha;

    /* JADX INFO: renamed from: fi */
    protected int f6860fi = 8;

    /* JADX INFO: renamed from: di */
    protected AtomicBoolean f6859di = new AtomicBoolean(false);

    public AbstractC2487ri(Context context, C2500aw c2500aw, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f6863lr = false;
        this.xha = context;
        this.f6858co = c2500aw;
        this.f6864mj = c2500aw.m8884ka();
        themeStatusBroadcastReceiver.m9173ri(this);
        if (C2490ka.m8810lr()) {
            m8782co();
            return;
        }
        C2634di c2634diM8781aw = m8781aw();
        this.f6862ka = c2634diM8781aw;
        if (c2634diM8781aw != null) {
            this.f6863lr = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        } else {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (C2490ka.m8811ri() != null) {
                this.f6862ka = new C2634di(C2490ka.m8811ri(), C2634di.ik.ADS);
            }
        }
    }

    /* JADX INFO: renamed from: aw */
    private C2634di m8781aw() {
        return this.f6858co.wjv() ? C2483fi.m8762ri().m8772ri(this.xha, this.f6864mj) : C2483fi.m8762ri().m8768lr(this.xha, this.f6864mj);
    }

    private void bgr() {
        if (this.f6858co.wjv()) {
            C2483fi.m8762ri().m8771lr(this.f6862ka);
        } else {
            C2483fi.m8762ri().m8765ik(this.f6862ka);
        }
    }

    /* JADX INFO: renamed from: co */
    private void m8782co() {
        if (this.xha == null && C2490ka.m8811ri() != null) {
            this.xha = C2490ka.m8811ri();
        }
        if (this.xha != null) {
            C2634di c2634diM8781aw = m8781aw();
            this.f6862ka = c2634diM8781aw;
            if (c2634diM8781aw == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.f6862ka = new C2634di(new MutableContextWrapper(this.xha.getApplicationContext()), this.f6858co.wjv() ? C2634di.ik.ADS_V3 : C2634di.ik.ADS);
            } else {
                this.f6863lr = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    private int m8783lr(Activity activity) {
        return activity.hashCode();
    }

    /* JADX INFO: renamed from: ri */
    private void m8784ri(float f, float f2) {
        this.f6858co.m8881fi().mo8987fi();
        if (mo8752ik() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mo8793ri().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            mo8793ri().setLayoutParams(layoutParams);
            return;
        }
        int iM8833ri = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.xha, f);
        int iM8833ri2 = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.xha, f2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) mo8793ri().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iM8833ri, iM8833ri2);
        }
        layoutParams2.width = iM8833ri;
        layoutParams2.height = iM8833ri2;
        mo8793ri().setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: ri */
    private void m8785ri(int i, String str) {
        if (this.f6865qt != null) {
            this.f6865qt.mo8981ri(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m8787ri(bgr bgrVar, float f, float f2) {
        bgrVar.m8961qt();
        boolean z = this.f6861ik;
        if (!z || this.f6857aw) {
            if (!z) {
                C2483fi.m8762ri().m8767ka(this.f6862ka);
            }
            m8785ri(bgrVar.m8961qt(), bgrVar.jbs());
        } else {
            m8784ri(f, f2);
            mo8794ri(this.f6860fi);
            if (this.f6865qt != null) {
                this.f6865qt.mo8982ri(mo8793ri(), bgrVar);
            }
        }
    }

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

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ik */
    public int mo8752ik() {
        return 0;
    }

    protected void jbs() {
    }

    /* JADX INFO: renamed from: ka */
    public void mo8789ka() {
        if (this.f6859di.get()) {
            return;
        }
        this.f6859di.set(true);
        xha();
        if (this.f6862ka.getParent() != null) {
            ((ViewGroup) this.f6862ka.getParent()).removeView(this.f6862ka);
        }
        if (this.f6861ik) {
            bgr();
        } else {
            C2483fi.m8762ri().m8767ka(this.f6862ka);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public C2634di mo8751fi() {
        return mo8793ri();
    }

    /* JADX INFO: renamed from: mj */
    public void mo8791mj() {
        jbs();
        Activity activityM10240ri = C2722lr.m10240ri(this.f6862ka);
        if (activityM10240ri != null) {
            this.bgr = m8783lr(activityM10240ri);
        }
    }

    /* JADX INFO: renamed from: qt */
    protected void mo8792qt() {
    }

    /* JADX INFO: renamed from: ri */
    public C2634di mo8793ri() {
        return this.f6862ka;
    }

    /* JADX INFO: renamed from: ri */
    public abstract void mo8794ri(int i);

    @Override // com.bytedance.sdk.component.adexpress.InterfaceC2514ri
    /* JADX INFO: renamed from: ri */
    public void mo8795ri(Activity activity) {
        if (this.bgr == 0 || activity == null || activity.hashCode() != this.bgr) {
            return;
        }
        mo8789ka();
        mo8792qt();
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf
    /* JADX INFO: renamed from: ri */
    public void mo8756ri(View view, int i, InterfaceC2488ik interfaceC2488ik) {
        InterfaceC2507mj interfaceC2507mj = this.f6867sf;
        if (interfaceC2507mj != null) {
            interfaceC2507mj.mo9002ri(view, i, interfaceC2488ik);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf
    /* JADX INFO: renamed from: ri */
    public void mo8757ri(final bgr bgrVar) {
        if (bgrVar == null) {
            if (this.f6865qt != null) {
                this.f6865qt.mo8981ri(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zM8959lr = bgrVar.m8959lr();
        final float fM8949ik = (float) bgrVar.m8949ik();
        final float fM8952ka = (float) bgrVar.m8952ka();
        if (mo8752ik() != 0 || (fM8949ik > 0.0f && fM8952ka > 0.0f)) {
            this.f6861ik = zM8959lr;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m8787ri(bgrVar, fM8949ik, fM8952ka);
                return;
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.fi.ri.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC2487ri.this.m8787ri(bgrVar, fM8949ik, fM8952ka);
                    }
                });
                return;
            }
        }
        if (this.f6865qt != null) {
            this.f6865qt.mo8981ri(105, "width is " + fM8949ik + "height is " + fM8952ka);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8796ri(InterfaceC2507mj interfaceC2507mj) {
        this.f6867sf = interfaceC2507mj;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ri */
    public void mo8759ri(xha xhaVar) {
        String str;
        this.f6865qt = xhaVar;
        if (mo8793ri() == null || mo8793ri().getWebView() == null) {
            xha xhaVar2 = this.f6865qt;
            StringBuilder sb = new StringBuilder("SSWebview null is ");
            sb.append(mo8793ri() == null);
            sb.append(" or Webview is null");
            xhaVar2.mo8981ri(102, sb.toString());
            return;
        }
        if (TextUtils.isEmpty(this.jbs)) {
            this.f6865qt.mo8981ri(102, "url is empty");
            return;
        }
        if (this.f6858co.wjv()) {
            if (mo8752ik() == 9 && !C2523lr.m9114lr(this.f6866ri)) {
                xha xhaVar3 = this.f6865qt;
                StringBuilder sb2 = new StringBuilder("data null is ");
                sb2.append(this.f6866ri == null);
                xhaVar3.mo8981ri(103, sb2.toString());
                return;
            }
        } else if (!C2523lr.m9121ri(this.f6866ri)) {
            xha xhaVar4 = this.f6865qt;
            StringBuilder sb3 = new StringBuilder("data null is ");
            sb3.append(this.f6866ri == null);
            xhaVar4.mo8981ri(103, sb3.toString());
            return;
        }
        this.f6858co.m8881fi().mo8997ri(this.f6863lr);
        if (!this.f6863lr) {
            C2634di c2634diMo8793ri = mo8793ri();
            c2634diMo8793ri.m9770bu();
            this.f6858co.m8881fi();
            c2634diMo8793ri.m9767a_(this.jbs);
            return;
        }
        try {
            int iM8882fr = this.f6858co.m8882fr();
            if (this.f6858co.wjv() && iM8882fr == 1) {
                this.f6858co.m8883ik();
                str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.f6858co.m8883ik() + ";") + "window.SDK_TRIGGER_RENDER();";
            } else {
                str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
            }
            this.f6862ka.m9770bu();
            this.f6858co.m8881fi();
            com.bytedance.sdk.component.utils.bgr.m10210ri(this.f6862ka.getWebView(), str);
        } catch (Exception e) {
            C2483fi.m8762ri().m8767ka(this.f6862ka);
            this.f6865qt.mo8981ri(102, "load exception is " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8797ri(String str) {
        this.jbs = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m8798ri(JSONObject jSONObject) {
        this.f6866ri = jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public void m8799ri(boolean z) {
        this.f6857aw = z;
    }

    /* JADX INFO: renamed from: sf */
    public C2500aw m8800sf() {
        return this.f6858co;
    }

    public abstract void xha();
}
