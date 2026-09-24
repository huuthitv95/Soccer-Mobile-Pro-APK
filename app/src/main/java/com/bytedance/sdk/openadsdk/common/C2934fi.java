package com.bytedance.sdk.openadsdk.common;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.jbs.C2638lr;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2934fi implements igq.InterfaceC2719ri {

    /* JADX INFO: renamed from: ac */
    private String f8790ac;

    /* JADX INFO: renamed from: aw */
    private int f8791aw;
    private boolean bgr;

    /* JADX INFO: renamed from: fi */
    private C2946ka f8795fi;

    /* JADX INFO: renamed from: ik */
    private WebView f8796ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private final C2634di f8797ka;

    /* JADX INFO: renamed from: lr */
    private final boolean f8798lr;

    /* JADX INFO: renamed from: mj */
    private float f8799mj;

    /* JADX INFO: renamed from: qt */
    private long f8801qt;

    /* JADX INFO: renamed from: ri */
    private final wjv f8802ri;
    private boolean slm;
    private int tan;

    /* JADX INFO: renamed from: vr */
    private long f8804vr;

    /* JADX INFO: renamed from: di */
    private String f8794di = "landingpage";
    private final Handler xha = new igq(C3332vr.m14978lr().getLooper(), this);

    /* JADX INFO: renamed from: sf */
    private final AtomicBoolean f8803sf = new AtomicBoolean(false);

    /* JADX INFO: renamed from: co */
    private Pattern f8793co = null;

    /* JADX INFO: renamed from: nr */
    private long f8800nr = -1;

    /* JADX INFO: renamed from: bu */
    private final List<Integer> f8792bu = new ArrayList();

    public C2934fi(wjv wjvVar, C2634di c2634di, String str, boolean z) {
        this.f8802ri = wjvVar;
        this.f8797ka = c2634di;
        this.f8798lr = z;
        m11300lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public boolean m11293di() {
        return xha() > 0 && !this.f8803sf.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public void m11295fi() {
        this.bgr = false;
        if (this.f8803sf.getAndSet(true)) {
            return;
        }
        this.f8801qt = SystemClock.elapsedRealtime();
        this.f8804vr = System.currentTimeMillis();
        m11303mj();
        if (this.f8795fi == null) {
            return;
        }
        WebView webView = this.f8796ik;
        if (webView != null) {
            this.f8790ac = webView.getUrl();
        }
        this.f8795fi.setVisibility(0);
        this.f8795fi.m11288ri(this.f8802ri);
        this.f8795fi.mo11286ri();
        this.f8795fi.setAlpha(this.f8799mj);
        this.f8795fi.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.fi.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        m11299ka();
        m11297ik();
    }

    /* JADX INFO: renamed from: ik */
    private void m11297ik() {
        Handler handler = this.xha;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.jbs);
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m11299ka() {
        Handler handler = this.xha;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m11300lr() {
        C2634di c2634di = this.f8797ka;
        if (c2634di != null) {
            this.f8796ik = c2634di.getWebView();
            View arbitrageLoadingView = this.f8797ka.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof C2946ka) {
                this.f8795fi = (C2946ka) arbitrageLoadingView;
            }
        }
        this.jbs = C3322sf.m14819lr().m14846fr();
        this.f8799mj = C3322sf.m14819lr().m14882su();
    }

    /* JADX INFO: renamed from: mj */
    private void m11303mj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.f8800nr);
            jSONObject.put("loading_show_timestamp", this.f8804vr);
            WebView webView = this.f8796ik;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        C3414ik.m15557ri(this.f8802ri, this.f8794di, jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    private void m11306ri(final int i) {
        WebView webView = this.f8796ik;
        if (webView != null && i == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.f8790ac)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.jbs.m10234lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fi.4
            @Override // java.lang.Runnable
            public void run() {
                if (C2934fi.this.f8795fi != null) {
                    C2934fi.this.f8803sf.set(false);
                    C2934fi.this.f8795fi.m11356ri(C2934fi.this.f8802ri, C2934fi.this.f8794di, i, C2934fi.this.f8790ac, C2934fi.this.f8801qt, C2934fi.this.bgr, C2934fi.this.f8791aw, C2934fi.this.f8804vr);
                    C2934fi.this.f8791aw = 0;
                }
            }
        });
        m11299ka();
    }

    /* JADX INFO: renamed from: ri */
    private void m11307ri(int i, WebView webView) {
        Integer.valueOf(i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        C3414ik.m15524lr(this.f8802ri, this.f8794di, jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m11308ri(int i, int i2) {
        if (i < i2 || this.f8792bu.contains(Integer.valueOf(i2)) || this.tan < 2) {
            return false;
        }
        this.f8792bu.add(Integer.valueOf(i2));
        return true;
    }

    private int xha() {
        try {
            return this.f8796ik.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m11311ik(WebView webView, String str, boolean z) {
        this.f8792bu.clear();
        this.slm = z;
        if (z) {
            this.bgr = true;
        }
        this.tan = xha();
    }

    /* JADX INFO: renamed from: lr */
    public void m11312lr(WebView webView, String str, boolean z) {
        if (!z || this.f8795fi == null) {
            return;
        }
        m11306ri(1);
    }

    /* JADX INFO: renamed from: ri */
    public void m11313ri() {
        if (dzy.m16391di()) {
            m11295fi();
        } else {
            com.bytedance.sdk.component.utils.jbs.m10234lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fi.2
                @Override // java.lang.Runnable
                public void run() {
                    C2934fi.this.m11295fi();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        if (message.what == 1) {
            m11306ri(0);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11314ri(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f8800nr = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11315ri(WebView webView, int i) {
        C2946ka c2946ka = this.f8795fi;
        if (c2946ka != null) {
            c2946ka.m11287ri(i);
        }
        if (this.slm) {
            if (m11308ri(i, 30)) {
                m11307ri(30, webView);
            }
            if (m11308ri(i, 50)) {
                m11307ri(50, webView);
            }
            if (m11308ri(i, 70)) {
                m11307ri(70, webView);
            }
        }
        if (this.f8795fi == null || i != 100) {
            return;
        }
        m11306ri(1);
    }

    /* JADX INFO: renamed from: ri */
    public void m11316ri(WebView webView, String str) {
        wjv wjvVar = this.f8802ri;
        if (wjvVar == null || !C2638lr.m9799ri(wjvVar.m14401fr().m14203ik(), str)) {
            return;
        }
        this.f8791aw++;
        com.bytedance.sdk.component.utils.jbs.m10234lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fi.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2934fi.this.m11293di()) {
                    C2934fi.this.m11313ri();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m11317ri(WebView webView, String str, boolean z) {
        if (z && m11293di()) {
            m11313ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11318ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8794di = str;
    }
}
