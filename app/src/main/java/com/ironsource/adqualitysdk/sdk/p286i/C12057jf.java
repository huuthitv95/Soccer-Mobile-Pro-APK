package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.p286i.C12055jd.AnonymousClass3;
import com.ironsource.adqualitysdk.sdk.p286i.C12055jd.AnonymousClass4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12057jf {

    /* JADX INFO: renamed from: ﾇ */
    private static C12057jf f29613;

    /* JADX INFO: renamed from: ﻛ */
    private List<View> f29615 = new ArrayList();

    /* JADX INFO: renamed from: ｋ */
    private List<InterfaceC12064jm> f29616 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ */
    private List<View> f29614 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ */
    private InterfaceC12036il f29617 = new InterfaceC12036il() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.5
        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12036il
        /* JADX INFO: renamed from: ﻐ */
        public final void mo29849() {
            List<View> listM30780 = C12075jx.m30780();
            C12057jf.this.f29614.clear();
            C12057jf.this.f29614.addAll(C12057jf.this.f29615);
            for (int i = 0; i < listM30780.size(); i++) {
                View view = listM30780.get(i);
                C12057jf.this.f29614.remove(view);
                if (!C12057jf.this.f29615.contains(view)) {
                    C12057jf.this.f29615.add(view);
                    C12057jf.this.m30660(view);
                }
            }
            for (int i2 = 0; i2 < C12057jf.this.f29614.size(); i2++) {
                View view2 = (View) C12057jf.this.f29614.get(i2);
                C12057jf.this.f29615.remove(view2);
                C12057jf.this.m30659(view2);
            }
            C12057jf.this.f29614.clear();
        }
    };

    /* JADX INFO: renamed from: ﻛ */
    public static synchronized C12057jf m30656() {
        if (f29613 == null) {
            f29613 = new C12057jf();
        }
        return f29613;
    }

    private C12057jf() {
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m30661(final InterfaceC12064jm interfaceC12064jm) {
        synchronized (this) {
            this.f29616.add(interfaceC12064jm);
        }
        C12089p.m30935(C12055jd.m30631().new AnonymousClass3(this.f29617));
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                Iterator it = C12057jf.this.f29615.iterator();
                while (it.hasNext()) {
                    interfaceC12064jm.mo28223((View) it.next());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m30662(InterfaceC12064jm interfaceC12064jm) {
        synchronized (this) {
            this.f29616.remove(interfaceC12064jm);
            if (this.f29616.size() == 0) {
                C12089p.m30935(C12055jd.m30631().new AnonymousClass4(this.f29617));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ﾇ */
    public synchronized void m30660(View view) {
        Iterator<InterfaceC12064jm> it = this.f29616.iterator();
        while (it.hasNext()) {
            it.next().mo28223(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ｋ */
    public synchronized void m30659(View view) {
        Iterator<InterfaceC12064jm> it = this.f29616.iterator();
        while (it.hasNext()) {
            it.next().mo28222(view);
        }
    }
}
