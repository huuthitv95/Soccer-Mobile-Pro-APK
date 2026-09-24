package com.bytedance.sdk.component.adexpress.p122fi;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.p124ka.C2492fi;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p168ri.C2689ac;
import com.bytedance.sdk.component.utils.C2735zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.fi.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2483fi {

    /* JADX INFO: renamed from: di */
    private static int f6848di = 10;

    /* JADX INFO: renamed from: fi */
    private static final byte[] f6849fi = new byte[0];
    private static volatile C2483fi jbs = null;

    /* JADX INFO: renamed from: mj */
    private static int f6850mj = 10;
    private final AtomicBoolean xha = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ri */
    private List<C2634di> f6854ri = new ArrayList();

    /* JADX INFO: renamed from: lr */
    private List<C2634di> f6853lr = new ArrayList();

    /* JADX INFO: renamed from: ik */
    private Map<Integer, C2484ik> f6851ik = new HashMap();

    /* JADX INFO: renamed from: ka */
    private Map<Integer, C2485ka> f6852ka = new HashMap();

    private C2483fi() {
        InterfaceC2528ik interfaceC2528ikM9166ik = C2531ri.m9163ri().m9166ik();
        if (interfaceC2528ikM9166ik != null) {
            f6848di = interfaceC2528ikM9166ik.mo9154qt();
            f6850mj = interfaceC2528ikM9166ik.mo9156sf();
        }
    }

    /* JADX INFO: renamed from: di */
    private void m8761di(C2634di c2634di) {
        if (c2634di == null) {
            return;
        }
        if (C2735zf.m10339lr(c2634di.getScene())) {
            C2735zf.m10345ri(c2634di);
            return;
        }
        if (this.f6854ri.size() >= f6848di) {
            try {
                Context context = c2634di.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                c2634di.slm();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.f6854ri.contains(c2634di)) {
            return;
        }
        try {
            Context context2 = c2634di.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                c2634di.setRecycler(true);
                this.f6854ri.add(c2634di);
                Integer.valueOf(m8764ik());
            }
        } catch (Throwable th2) {
            Integer.valueOf(m8764ik());
            th2.getMessage();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2483fi m8762ri() {
        if (jbs == null) {
            synchronized (C2483fi.class) {
                if (jbs == null) {
                    jbs = new C2483fi();
                }
            }
        }
        return jbs;
    }

    /* JADX INFO: renamed from: fi */
    public void m8763fi(C2634di c2634di) {
        WebView webView;
        if (c2634di == null || (webView = c2634di.getWebView()) == null) {
            return;
        }
        C2484ik c2484ik = this.f6851ik.get(Integer.valueOf(webView.hashCode()));
        if (c2484ik != null) {
            c2484ik.m8778ri(null);
        }
        c2634di.m9769b_("SDK_INJECT_GLOBAL");
    }

    /* JADX INFO: renamed from: ik */
    public int m8764ik() {
        return this.f6854ri.size();
    }

    /* JADX INFO: renamed from: ik */
    public void m8765ik(C2634di c2634di) {
        if (c2634di == null) {
            return;
        }
        C2735zf.m10338lr(c2634di);
        c2634di.m9769b_("SDK_INJECT_GLOBAL");
        m8763fi(c2634di);
        m8761di(c2634di);
    }

    /* JADX INFO: renamed from: ka */
    public int m8766ka() {
        return this.f6853lr.size();
    }

    /* JADX INFO: renamed from: ka */
    public boolean m8767ka(C2634di c2634di) {
        if (c2634di == null) {
            return false;
        }
        try {
            Context context = c2634di.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            c2634di.slm();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    /* JADX INFO: renamed from: lr */
    public C2634di m8768lr(Context context, String str) {
        if (C2735zf.m10339lr(C2634di.ik.ADS)) {
            if (!C2492fi.m8814ri(str) || C2735zf.m10340ri(C2634di.ik.ADS) > 1) {
                return C2735zf.m10342ri(context, null, 0, C2634di.ik.ADS);
            }
            return null;
        }
        if (m8764ik() <= 0) {
            return null;
        }
        if (C2492fi.m8814ri(str) && m8764ik() <= 1) {
            Integer.valueOf(m8764ik());
            return null;
        }
        C2634di c2634diRemove = this.f6854ri.remove(0);
        if (c2634diRemove == null) {
            return null;
        }
        try {
            Context context2 = c2634diRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                c2634diRemove.setRecycler(false);
                Integer.valueOf(m8764ik());
            }
            return c2634diRemove;
        } catch (Throwable unused) {
            Integer.valueOf(m8764ik());
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m8769lr() {
        for (C2634di c2634di : this.f6854ri) {
            if (c2634di != null) {
                try {
                    Context context = c2634di.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    c2634di.slm();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.f6854ri.clear();
        for (C2634di c2634di2 : this.f6853lr) {
            if (c2634di2 != null) {
                try {
                    Context context2 = c2634di2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    c2634di2.slm();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.f6853lr.clear();
    }

    /* JADX INFO: renamed from: lr */
    public void m8770lr(int i) {
        synchronized (f6849fi) {
            f6850mj = i;
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m8771lr(C2634di c2634di) {
        if (c2634di == null) {
            return;
        }
        C2735zf.m10338lr(c2634di);
        c2634di.m9769b_("SDK_INJECT_GLOBAL");
        m8763fi(c2634di);
        m8776ri(c2634di);
    }

    /* JADX INFO: renamed from: ri */
    public C2634di m8772ri(Context context, String str) {
        if (C2735zf.m10339lr(C2634di.ik.ADS_V3)) {
            if (!C2492fi.m8814ri(str) || C2735zf.m10340ri(C2634di.ik.ADS_V3) > 1) {
                return C2735zf.m10342ri(context, null, 0, C2634di.ik.ADS_V3);
            }
            return null;
        }
        if (m8766ka() <= 0) {
            return null;
        }
        if (C2492fi.m8814ri(str) && m8766ka() <= 1) {
            Integer.valueOf(m8766ka());
            return null;
        }
        C2634di c2634diRemove = this.f6853lr.remove(0);
        if (c2634diRemove == null) {
            return null;
        }
        try {
            Context context2 = c2634diRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                c2634diRemove.setRecycler(false);
                Integer.valueOf(m8766ka());
            }
            return c2634diRemove;
        } catch (Throwable unused) {
            Integer.valueOf(m8766ka());
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8773ri(int i) {
        synchronized (f6849fi) {
            f6848di = i;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8774ri(WebView webView, C2689ac c2689ac, String str) {
        if (webView == null || c2689ac == null || TextUtils.isEmpty(str)) {
            return;
        }
        C2485ka c2485ka = this.f6852ka.get(Integer.valueOf(webView.hashCode()));
        if (c2485ka != null) {
            c2485ka.m8779ri(c2689ac);
        } else {
            c2485ka = new C2485ka(c2689ac);
            this.f6852ka.put(Integer.valueOf(webView.hashCode()), c2485ka);
        }
        webView.addJavascriptInterface(c2485ka, str);
    }

    /* JADX INFO: renamed from: ri */
    public void m8775ri(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        C2485ka c2485ka = this.f6852ka.get(Integer.valueOf(webView.hashCode()));
        if (c2485ka != null) {
            c2485ka.m8779ri(null);
        }
        webView.removeJavascriptInterface(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m8776ri(C2634di c2634di) {
        if (c2634di == null) {
            return;
        }
        if (C2735zf.m10339lr(c2634di.getScene())) {
            C2735zf.m10345ri(c2634di);
            return;
        }
        if (this.f6853lr.size() >= f6850mj) {
            try {
                Context context = c2634di.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                c2634di.slm();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.f6853lr.contains(c2634di)) {
            return;
        }
        try {
            Context context2 = c2634di.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                c2634di.setRecycler(true);
                this.f6853lr.add(c2634di);
                Integer.valueOf(m8766ka());
            }
        } catch (Throwable th2) {
            Integer.valueOf(m8766ka());
            th2.getMessage();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8777ri(C2634di c2634di, InterfaceC2486lr interfaceC2486lr) {
        WebView webView;
        if (c2634di == null || interfaceC2486lr == null || (webView = c2634di.getWebView()) == null) {
            return;
        }
        C2484ik c2484ik = this.f6851ik.get(Integer.valueOf(webView.hashCode()));
        if (c2484ik != null) {
            c2484ik.m8778ri(interfaceC2486lr);
        } else {
            c2484ik = new C2484ik(interfaceC2486lr);
            this.f6851ik.put(Integer.valueOf(webView.hashCode()), c2484ik);
        }
        c2634di.m9783ri(c2484ik, "SDK_INJECT_GLOBAL");
    }
}
