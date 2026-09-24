package com.bytedance.sdk.openadsdk.core.widget.p228ri;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3533ri;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3347di implements igq.InterfaceC2719ri {

    /* JADX INFO: renamed from: aw */
    float f11777aw;
    float bgr;

    /* JADX INFO: renamed from: bu */
    boolean f11779bu;

    /* JADX INFO: renamed from: co */
    float f11780co;
    private boolean hcw;
    private final boolean igq;
    String jbs;

    /* JADX INFO: renamed from: ka */
    WebView f11786ka;

    /* JADX INFO: renamed from: lr */
    wjv f11787lr;

    /* JADX INFO: renamed from: mj */
    boolean f11788mj;

    /* JADX INFO: renamed from: nr */
    boolean f11789nr;
    private long ory;

    /* JADX INFO: renamed from: qt */
    int f11790qt;

    /* JADX INFO: renamed from: ri */
    Context f11791ri;

    /* JADX INFO: renamed from: sf */
    float f11792sf;
    long slm;
    long tan;

    /* JADX INFO: renamed from: vr */
    float f11795vr;
    boolean xha;

    /* JADX INFO: renamed from: su */
    private final Handler f11793su = new igq(C3332vr.m14978lr().getLooper(), this);

    /* JADX INFO: renamed from: ik */
    String f11785ik = "landingpage";

    /* JADX INFO: renamed from: di */
    int f11781di = 0;

    /* JADX INFO: renamed from: zf */
    private final String f11796zf = ".*\\/serp\\?sc=.*&clkt=\\d+$";

    /* JADX INFO: renamed from: dw */
    private final String f11782dw = ".*\\/\\?caf_results=.*&clkt=\\d+$";

    /* JADX INFO: renamed from: ay */
    ri f11778ay = new ri() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.di.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3347di.ri
        /* JADX INFO: renamed from: ri */
        public void mo15059ri() {
            C3347di.this.f11788mj = true;
            C3347di.this.m15037di();
            C3347di c3347di = C3347di.this;
            c3347di.m15048ri(2, c3347di.jbs, C3347di.this.f11790qt);
        }
    };

    /* JADX INFO: renamed from: fr */
    GestureDetector f11784fr = new GestureDetector(C3299nr.m14642ri(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.di.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C3347di.this.f11779bu = true;
            return false;
        }
    });

    /* JADX INFO: renamed from: fi */
    int f11783fi = C3299nr.m14639ka().ihz();

    /* JADX INFO: renamed from: ac */
    Map<Integer, Long> f11776ac = new HashMap();
    Map<Integer, Float> ihz = new HashMap();

    /* JADX INFO: renamed from: uq */
    Map<Integer, Long> f11794uq = new HashMap();
    List<Integer> wjv = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ri.di$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo15059ri();
    }

    public C3347di(WebView webView, wjv wjvVar, Context context, boolean z) {
        this.f11787lr = wjvVar;
        this.f11786ka = webView;
        this.f11791ri = context;
        this.igq = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public void m15037di() {
        if (this.ihz.get(Integer.valueOf(this.f11790qt)) != null) {
            return;
        }
        float height = this.f11786ka.getHeight() / C3583qd.m16589lr(this.f11791ri, this.f11786ka.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        Float.valueOf(height);
        Integer.valueOf(this.f11790qt);
        this.ihz.put(Integer.valueOf(this.f11790qt), Float.valueOf(height));
    }

    /* JADX INFO: renamed from: fi */
    private boolean m15038fi() {
        try {
            int i = this.f11790qt;
            if (i == 2 || i == 3) {
                return Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.jbs) || Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.jbs);
            }
            return false;
        } catch (Throwable th) {
            C2707ac.m10196ik("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: ik */
    private void m15039ik(int i) {
        if (xha()) {
            return;
        }
        m15037di();
        this.xha = true;
        C3533ri c3533riM16045ri = new C3533ri.ri().m16044ri(this.jbs).m16043ri(this.f11790qt).m16042ri(this.f11792sf).m16037lr(this.f11780co).m16034ik(this.tan).m16035ik(i).m16045ri();
        try {
            if (this.hcw) {
                WebView.HitTestResult hitTestResult = this.f11786ka.getHitTestResult();
                c3533riM16045ri.m16029ri(hitTestResult.getExtra());
                c3533riM16045ri.m16028ri(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = c3533riM16045ri;
        this.f11793su.sendMessageDelayed(messageObtain, 100L);
    }

    /* JADX INFO: renamed from: ka */
    private void m15041ka() {
        if (xha()) {
            return;
        }
        C3533ri c3533riM16045ri = new C3533ri.ri().m16044ri(this.jbs).m16043ri(this.f11790qt).m16036ka(this.f11792sf).m16033fi(this.f11780co).m16032di(this.f11795vr).xha(this.tan).m16045ri();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = c3533riM16045ri;
        this.f11793su.sendMessageDelayed(messageObtain, 20L);
    }

    /* JADX INFO: renamed from: ka */
    private void m15042ka(String str) {
        if (xha()) {
            return;
        }
        C3414ik.m15535ri(this.f11787lr, new C3533ri.ri().m16044ri(this.jbs).m16039lr(Uri.decode(str)).m16045ri(), this.f11785ik);
    }

    /* JADX INFO: renamed from: lr */
    private void m15044lr(int i) {
        if (xha() || this.wjv.contains(Integer.valueOf(i))) {
            return;
        }
        this.wjv.add(Integer.valueOf(i));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.f11794uq.get(Integer.valueOf(i));
        C3414ik.m15517lr(this.f11787lr, new C3533ri.ri().m16044ri(this.jbs).m16043ri(this.f11790qt).m16041qt(jElapsedRealtime - (l != null ? l.longValue() : jElapsedRealtime)).m16045ri(), this.f11785ik);
    }

    /* JADX INFO: renamed from: lr */
    private boolean m15045lr(MotionEvent motionEvent) {
        this.f11777aw = motionEvent.getX();
        float y = motionEvent.getY();
        this.bgr = y;
        float f = this.f11780co;
        if (y - f == 0.0f) {
            return false;
        }
        this.f11795vr = y - f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: mj */
    public void m15046mj() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.f11786ka.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.f11790qt = currentIndex + 1;
            if (this.igq) {
                this.f11790qt = currentIndex + 2;
            }
        }
        Integer.valueOf(this.f11790qt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15048ri(int i, String str, int i2) {
        if (xha()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.f11776ac.get(Integer.valueOf(i2));
        long jLongValue = l != null ? l.longValue() : jElapsedRealtime;
        Float f = this.ihz.get(Integer.valueOf(i2));
        C3414ik.m15506ik(this.f11787lr, new C3533ri.ri().m16044ri(str).m16043ri(i2).m16040mj(jElapsedRealtime - jLongValue).jbs(f == null ? 0.0f : f.floatValue()).m16038lr(i).m16045ri(), this.f11785ik);
    }

    private boolean xha() {
        int i = this.f11781di + 1;
        this.f11781di = i;
        if (i > this.f11783fi) {
            return true;
        }
        return ("landingpage".equals(this.f11785ik) || "landingpage_endcard".equals(this.f11785ik) || "landingpage_split_screen".equals(this.f11785ik) || "landingpage_direct".equals(this.f11785ik) || "landingpage_split_ceiling".equals(this.f11785ik)) ? false : true;
    }

    /* JADX INFO: renamed from: ik */
    public ri m15051ik() {
        return this.f11778ay;
    }

    /* JADX INFO: renamed from: ik */
    public void m15052ik(String str) {
        if (this.xha) {
            this.f11789nr = true;
        }
        if (this.f11790qt == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf(C11744X3.j.f26436c, iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            m15042ka(str.substring(iIndexOf, iIndexOf2));
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m15053lr() {
        this.f11786ka.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.di.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                Boolean.valueOf(z);
                if (!z) {
                    if (!C3347di.this.f11788mj) {
                        C3347di.this.m15037di();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - C3347di.this.ory >= 50) {
                            C3347di c3347di = C3347di.this;
                            c3347di.m15048ri(3, c3347di.jbs, C3347di.this.f11790qt);
                            C3347di.this.ory = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    C3347di.this.f11788mj = false;
                }
                if (z) {
                    C3347di.this.m15046mj();
                    C3347di.this.f11776ac.put(Integer.valueOf(C3347di.this.f11790qt), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public void m15054lr(String str) {
        this.jbs = str;
        m15046mj();
        this.f11776ac.put(Integer.valueOf(this.f11790qt), Long.valueOf(SystemClock.elapsedRealtime()));
        this.f11794uq.put(Integer.valueOf(this.f11790qt), Long.valueOf(SystemClock.elapsedRealtime()));
        this.hcw = m15038fi();
    }

    /* JADX INFO: renamed from: ri */
    public void m15055ri() {
        m15044lr(this.f11790qt);
    }

    /* JADX INFO: renamed from: ri */
    public void m15056ri(int i) {
        float height = (i + this.f11786ka.getHeight()) / C3583qd.m16589lr(this.f11791ri, this.f11786ka.getContentHeight());
        Float f = this.ihz.get(Integer.valueOf(this.f11790qt));
        float fFloatValue = f == null ? 0.0f : f.floatValue();
        Float.valueOf(fFloatValue);
        Float.valueOf(height);
        Integer.valueOf(this.f11790qt);
        if (height > fFloatValue) {
            this.ihz.put(Integer.valueOf(this.f11790qt), Float.valueOf(height));
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        int i = message.what;
        C3533ri c3533ri = (C3533ri) message.obj;
        if (i == 100) {
            c3533ri.m16016ka(this.f11779bu ? 2 : 1);
            C3414ik.m15512ka(this.f11787lr, c3533ri, this.f11785ik);
            this.f11779bu = false;
        } else if (i == 200) {
            if (this.f11789nr) {
                m15048ri(1, c3533ri.m16010ik(), c3533ri.m16014ka());
            }
            c3533ri.m16012ik(this.f11789nr ? 1 : 0);
            C3414ik.m15504fi(this.f11787lr, c3533ri, this.f11785ik);
            this.xha = false;
            this.f11789nr = false;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15057ri(MotionEvent motionEvent) {
        this.f11784fr.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11792sf = motionEvent.getX();
            this.f11780co = motionEvent.getY();
            this.slm = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            m15039ik(2);
        } else {
            this.tan = SystemClock.elapsedRealtime() - this.slm;
            if (m15045lr(motionEvent)) {
                m15041ka();
            } else {
                m15039ik(1);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15058ri(String str) {
        this.f11785ik = str;
    }
}
