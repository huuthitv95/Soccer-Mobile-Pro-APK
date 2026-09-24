package com.mbridge.msdk.mbnative.service;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbnative.controller.C13334d;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.listener.C13339a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.a */
/* JADX INFO: compiled from: NativeProvider.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13342a {

    /* JADX INFO: renamed from: a */
    private NativeController f37021a;

    /* JADX INFO: renamed from: b */
    private Handler f37022b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    private C13339a f37023c;

    /* JADX INFO: renamed from: d */
    private NativeListener.NativeTrackingListener f37024d;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.a$a */
    /* JADX INFO: compiled from: NativeProvider.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13342a.this.m38573f();
        }
    }

    public C13342a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m38573f() {
        this.f37023c.onAdLoadError("current request is loading");
        this.f37023c.m38559b();
    }

    public static void preload(Map<String, Object> map, int i) {
        C13219q0.m37818c("NativeProvider", "native provider preload");
        new C13334d().m38525a(map, i);
    }

    /* JADX INFO: renamed from: b */
    public void m38582b(View view, Campaign campaign) {
        C13219q0.m37818c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f37021a;
        if (nativeController == null) {
            return;
        }
        nativeController.m38468b(campaign, view);
    }

    /* JADX INFO: renamed from: c */
    public String m38584c() {
        NativeController nativeController = this.f37021a;
        return nativeController != null ? nativeController.m38472g() : "";
    }

    /* JADX INFO: renamed from: d */
    public void m38585d() {
        m38571a(0, "");
    }

    /* JADX INFO: renamed from: e */
    public void m38586e() {
        m38571a(1, "");
    }

    /* JADX INFO: renamed from: g */
    public void m38587g() {
        try {
            this.f37021a.m38473i();
        } catch (Exception unused) {
            C13219q0.m37816b("NativeProvider", "release failed");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38578a(C13339a c13339a) {
        this.f37023c = c13339a;
    }

    public C13342a(C13339a c13339a, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f37023c = c13339a;
        this.f37024d = nativeTrackingListener;
    }

    /* JADX INFO: renamed from: a */
    public void m38579a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f37024d = nativeTrackingListener;
    }

    /* JADX INFO: renamed from: a */
    public void m38575a(Context context, Resources resources, Map<String, Object> map) {
        this.f37021a = new NativeController(this.f37023c, this.f37024d, map, context);
    }

    /* JADX INFO: renamed from: a */
    public void m38580a(String str) {
        m38571a(0, str);
    }

    /* JADX INFO: renamed from: a */
    public void m38574a() {
        try {
            this.f37021a.m38470d();
        } catch (Exception unused) {
            C13219q0.m37816b("NativeProvider", "clear cache failed");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38583b(View view, List<View> list, Campaign campaign) {
        C13219q0.m37818c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f37021a;
        if (nativeController == null) {
            return;
        }
        nativeController.m38469b(campaign, view, list);
    }

    /* JADX INFO: renamed from: a */
    public void m38577a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f37021a;
        if (nativeController == null) {
            return;
        }
        nativeController.m38462a(campaign, view, list);
    }

    /* JADX INFO: renamed from: b */
    public String m38581b() {
        NativeController nativeController = this.f37021a;
        if (nativeController != null) {
            return nativeController.m38471e();
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public void m38576a(View view, Campaign campaign) {
        C13219q0.m37818c("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f37021a;
        if (nativeController == null) {
            return;
        }
        nativeController.m38461a(campaign, view);
    }

    /* JADX INFO: renamed from: a */
    private void m38571a(int i, String str) {
        if (this.f37021a != null) {
            C13339a c13339a = this.f37023c;
            if (c13339a != null && c13339a.m38558a()) {
                if (C13229v0.m37934h()) {
                    m38573f();
                    return;
                } else {
                    this.f37022b.post(new a());
                    return;
                }
            }
            C13339a c13339a2 = this.f37023c;
            if (c13339a2 != null) {
                c13339a2.m38559b();
            }
            this.f37021a.m38460a(i, str);
        }
    }
}
