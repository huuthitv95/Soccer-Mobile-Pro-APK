package com.bytedance.sdk.openadsdk.core.p190aw;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p054lr.C1978ri;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.jbs;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3090di {

    /* JADX INFO: renamed from: lr */
    private xha f9711lr;

    /* JADX INFO: renamed from: ri */
    final Set<Pair<View, FriendlyObstructionPurpose>> f9712ri = new HashSet();

    private C3090di() {
        C3091fi.m12416ri(C3299nr.m14642ri());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public void m12380di() {
        if (this.f9711lr != null) {
            try {
                m12406ri((View) null, (FriendlyObstructionPurpose) null);
                this.f9711lr.m12588lr();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    private Handler m12381fi() {
        return jbs.m10234lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12383lr(int i) {
        xha xhaVar = this.f9711lr;
        if (xhaVar != null) {
            try {
                xhaVar.mo12457lr(i);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12384lr(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        xha xhaVar = this.f9711lr;
        try {
            if (xhaVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.f9712ri.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                xhaVar.m12591ri(view, friendlyObstructionPurpose);
            }
            if (this.f9712ri.size() > 0) {
                xhaVar.m12592ri(this.f9712ri);
                this.f9712ri.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12385lr(WebView webView) {
        try {
            if (this.f9711lr == null) {
                this.f9711lr = C3102mj.m12520ri(webView);
            }
        } catch (Throwable th) {
            C2707ac.m10197ik("createWebViewSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put("message", th.getMessage());
            C3091fi.m12417ri(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12387lr(boolean z) {
        xha xhaVar = this.f9711lr;
        if (xhaVar != null) {
            try {
                xhaVar.mo12459ri(z);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12388lr(boolean z, float f) {
        if (this.f9711lr != null) {
            try {
                m12406ri((View) null, (FriendlyObstructionPurpose) null);
                this.f9711lr.mo12460ri(z, f);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: mj */
    public void m12389mj() {
        xha xhaVar = this.f9711lr;
        if (xhaVar != null) {
            try {
                xhaVar.m12586ik();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3090di m12390ri() {
        return new C3090di();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12391ri(View view, Set<C3103qt> set, wjv wjvVar) {
        try {
            if (this.f9711lr == null) {
                this.f9711lr = C3102mj.m12519ri(view, set);
                if (wjvVar.m14576zz()) {
                    return;
                }
                C3414ik.m15522lr(wjvVar, wjvVar.m14394fi(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th) {
            C2707ac.m10197ik("createVideoSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put("message", th.getMessage());
            C3091fi.m12417ri(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xha() {
        xha xhaVar = this.f9711lr;
        if (xhaVar != null) {
            try {
                xhaVar.m12587ka();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m12399ik() {
        if (C1978ri.m6210ri()) {
            xha();
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.6
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.xha();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m12400ka() {
        if (C1978ri.m6210ri()) {
            m12389mj();
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.7
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.m12389mj();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m12401lr() {
        if (C1978ri.m6210ri()) {
            m12380di();
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.4
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.m12380di();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m12402lr(long j, boolean z) {
        xha xhaVar = this.f9711lr;
        if (xhaVar != null) {
            try {
                xhaVar.mo12458ri(j / 1000.0f, z);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12403ri(final int i) {
        if (C1978ri.m6210ri()) {
            m12383lr(i);
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.2
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.m12383lr(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12404ri(final long j, final boolean z) {
        if (C1978ri.m6210ri()) {
            m12402lr(j, z);
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.9
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.m12402lr(j, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12405ri(final View view, final wjv wjvVar) {
        if (this.f9711lr != null) {
            return;
        }
        C3283ka c3283kaM14473qc = wjvVar.m14473qc();
        final Set<C3103qt> setM14186lr = c3283kaM14473qc != null ? c3283kaM14473qc.m14186lr() : null;
        if (view == null || setM14186lr == null) {
            return;
        }
        if (C1978ri.m6210ri()) {
            m12391ri(view, setM14186lr, wjvVar);
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.3
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.m12391ri(view, (Set<C3103qt>) setM14186lr, wjvVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12406ri(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (C1978ri.m6210ri()) {
            m12384lr(view, friendlyObstructionPurpose);
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.8
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.m12384lr(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12407ri(final WebView webView) {
        if (webView == null || this.f9711lr != null) {
            return;
        }
        if (C1978ri.m6210ri()) {
            m12385lr(webView);
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.1
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.m12385lr(webView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12408ri(final boolean z) {
        if (C1978ri.m6210ri()) {
            m12387lr(z);
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.10
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.m12387lr(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12409ri(final boolean z, final float f) {
        if (C1978ri.m6210ri()) {
            m12388lr(z, f);
        } else {
            m12381fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.5
                @Override // java.lang.Runnable
                public void run() {
                    C3090di.this.m12388lr(z, f);
                }
            });
        }
    }
}
