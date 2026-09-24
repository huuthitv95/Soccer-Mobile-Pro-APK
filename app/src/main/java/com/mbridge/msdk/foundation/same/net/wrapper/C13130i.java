package com.mbridge.msdk.foundation.same.net.wrapper;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.InterfaceC13109b;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.tracker.network.AbstractC13831b0;
import com.mbridge.msdk.tracker.network.AbstractC13838h;
import com.mbridge.msdk.tracker.network.C13847q;
import com.mbridge.msdk.tracker.network.C13867v;
import com.mbridge.msdk.tracker.network.InterfaceC13840j;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.wrapper.i */
/* JADX INFO: compiled from: MBridgeRequestListenerWrapper.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13130i<T> implements InterfaceC13840j<T> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC13109b<T> f36065a;

    /* JADX INFO: renamed from: b */
    private final Handler f36066b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.wrapper.i$a */
    /* JADX INFO: compiled from: MBridgeRequestListenerWrapper.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13867v f36067a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C13847q f36068b;

        a(C13867v c13867v, C13847q c13847q) {
            this.f36067a = c13867v;
            this.f36068b = c13847q;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C13130i.this.f36065a != null) {
                    C13130i.this.f36065a.onSuccess(C13130i.this.m37268a(this.f36067a, this.f36068b));
                }
            } catch (Exception e) {
                C13219q0.m37817b("MBridgeRequestListenerWrapper", "onResponseSuccess error", e);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.wrapper.i$b */
    /* JADX INFO: compiled from: MBridgeRequestListenerWrapper.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13867v f36070a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C13847q f36071b;

        b(C13867v c13867v, C13847q c13847q) {
            this.f36070a = c13867v;
            this.f36071b = c13847q;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C13130i.this.f36065a != null) {
                    C13130i.this.f36065a.onError(C13130i.this.m37270a(this.f36070a.f39592c, this.f36071b));
                }
            } catch (Exception e) {
                C13219q0.m37817b("MBridgeRequestListenerWrapper", "onResponseError error", e);
            }
        }
    }

    public C13130i(InterfaceC13109b<T> interfaceC13109b) {
        this.f36065a = interfaceC13109b;
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC13840j
    /* JADX INFO: renamed from: b */
    public void mo37272b(AbstractC13838h<T> abstractC13838h, C13867v<T> c13867v, C13847q c13847q) {
        C13219q0.m37813a("MBridgeRequestListenerWrapper", "onResponseError: " + c13867v.f39592c.mo41087d() + " " + c13867v.f39592c.getMessage());
        this.f36066b.post(new b(c13867v, c13847q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C13112e m37268a(C13867v<T> c13867v, C13847q c13847q) {
        if (c13867v == null) {
            return null;
        }
        return C13112e.m37195a(c13867v.f39590a, new C13117a(c13847q.f39514a, c13847q.f39515b, c13847q.f39517d));
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC13840j
    /* JADX INFO: renamed from: a */
    public void mo37271a(AbstractC13838h<T> abstractC13838h, C13867v<T> c13867v, C13847q c13847q) {
        C13219q0.m37813a("MBridgeRequestListenerWrapper", "onResponseSuccess: " + c13867v.f39590a);
        this.f36066b.post(new a(c13867v, c13847q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C13113a m37270a(AbstractC13831b0 abstractC13831b0, C13847q c13847q) {
        C13117a c13117a;
        if (abstractC13831b0 == null) {
            return null;
        }
        if (c13847q != null) {
            c13117a = new C13117a(c13847q.f39514a, c13847q.f39515b, c13847q.f39517d);
        } else {
            c13117a = new C13117a(0, null, null);
        }
        if (abstractC13831b0.mo41087d() == 0) {
            return new C13113a(2, c13117a, abstractC13831b0.getMessage());
        }
        if (abstractC13831b0.mo41087d() == 1) {
            return new C13113a(6, c13117a, abstractC13831b0.getMessage());
        }
        if (abstractC13831b0.mo41087d() == 2) {
            return new C13113a(8, c13117a, abstractC13831b0.getMessage());
        }
        if (abstractC13831b0.mo41087d() == 4) {
            return new C13113a(880041, c13117a, abstractC13831b0.getMessage());
        }
        if (abstractC13831b0.mo41087d() == 5) {
            return new C13113a(8, c13117a, abstractC13831b0.getMessage());
        }
        if (abstractC13831b0.mo41087d() == 6) {
            return new C13113a(15, c13117a, abstractC13831b0.getMessage());
        }
        if (abstractC13831b0.mo41087d() == 7) {
            return new C13113a(7, c13117a, abstractC13831b0.getMessage());
        }
        if (abstractC13831b0.mo41087d() == 8) {
            return new C13113a(10, c13117a, abstractC13831b0.getMessage());
        }
        if (abstractC13831b0.mo41087d() == 9) {
            return new C13113a(4, c13117a, abstractC13831b0.getMessage());
        }
        return new C13113a(2, c13117a, abstractC13831b0.getMessage());
    }
}
