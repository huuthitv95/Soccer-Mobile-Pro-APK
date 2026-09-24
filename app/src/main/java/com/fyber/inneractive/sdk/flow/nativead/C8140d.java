package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.AbstractC8129k;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8119f;
import com.fyber.inneractive.sdk.flow.C8235w0;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.flow.RunnableC8081e;
import com.fyber.inneractive.sdk.flow.nativead.mainasset.AbstractC8154e;
import com.fyber.inneractive.sdk.flow.nativead.mainasset.C8150a;
import com.fyber.inneractive.sdk.flow.nativead.mainasset.InterfaceC8153d;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.nativead.C9100f;
import com.fyber.inneractive.sdk.response.nativead.C9104j;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8140d extends AbstractC8129k {

    /* JADX INFO: renamed from: m */
    public final String f18109m = "Native";

    /* JADX INFO: renamed from: n */
    public C8142f f18110n;

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k, com.fyber.inneractive.sdk.interfaces.InterfaceC8262c
    public final void cancel() {
        AbstractC8236x abstractC8236x = this.f18091c;
        if (abstractC8236x != null) {
            ((C8235w0) abstractC8236x).destroy();
        }
        C8142f c8142f = this.f18110n;
        if (c8142f != null) {
            c8142f.f18117d.clear();
            c8142f.f18119f = null;
            Iterator it = c8142f.f18114a.iterator();
            while (it.hasNext()) {
                ((InterfaceC8139c) it.next()).destroy();
            }
            c8142f.f18114a.clear();
            this.f18110n = null;
        }
        this.f18099k.m20496a();
        IAlog.m21945a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.m21943a(this));
        AbstractC9183r.f21478b.removeCallbacks(this.f18100l);
        this.f18089a = null;
        this.f18090b = null;
        this.f18091c = null;
        this.f18092d = null;
        this.f18093e = null;
        this.f18094f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k
    /* JADX INFO: renamed from: e */
    public final String mo20555e() {
        return "send_failed_native_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k
    /* JADX INFO: renamed from: g */
    public final void mo20557g() {
        AbstractC9087e abstractC9087e = this.f18090b;
        if (abstractC9087e == null || ((C9104j) abstractC9087e).f21360Q.f21361K == null) {
            return;
        }
        C8006r c8006r = this.f18095g;
        InneractiveAdRequest inneractiveAdRequest = this.f18089a;
        C9104j c9104j = (C9104j) this.f18090b;
        C8142f c8142f = new C8142f(c8006r, inneractiveAdRequest, c9104j, c9104j.f21360Q.f21361K, this, this.f18109m);
        this.f18110n = c8142f;
        InterfaceC8153d interfaceC8153dM20569a = AbstractC8154e.m20569a(c8142f.f18122i, c8142f.f18124k, c8142f.f18121h, c8142f.f18116c, c8142f.f18123j, c8142f);
        if (interfaceC8153dM20569a == null) {
            if (c8142f.f18120g.compareAndSet(false, true)) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, EnumC8125i.NATIVE_AD_EMPTY_CONTENT);
                inneractiveInfrastructureError.setCause(new C8150a("Could not start loading main media"));
                C8140d c8140d = c8142f.f18119f;
                c8140d.getClass();
                AbstractC9183r.f21477a.execute(new RunnableC8081e(new C8119f(c8140d.f18090b, c8140d.f18089a, "send_failed_native_creatives", c8140d.f18095g.m20435b()), inneractiveInfrastructureError));
                c8140d.m20552b(inneractiveInfrastructureError);
                return;
            }
            return;
        }
        c8142f.f18114a.add(interfaceC8153dM20569a);
        CopyOnWriteArrayList copyOnWriteArrayList = c8142f.f18114a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = c8142f.f18116c.f21355a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (C9100f c9100f : c8142f.f18116c.f21355a) {
                if (c9100f != null && c9100f.f21342a != 2 && c9100f.f21345d != null) {
                    arrayList.add(c9100f);
                }
            }
        }
        copyOnWriteArrayList.add(new C8144h(arrayList, c8142f.f18125l));
        Iterator it = c8142f.f18114a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8139c) it.next()).mo20563b();
        }
    }
}
