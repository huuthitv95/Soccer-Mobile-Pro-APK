package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.C2578ik;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import com.bytedance.sdk.component.p130di.p131ri.xha.C2588ri;
import com.bytedance.sdk.component.utils.C2707ac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2584ik {

    /* JADX INFO: renamed from: ik */
    private static int f7221ik = 20;

    /* JADX INFO: renamed from: fi */
    private boolean f7223fi;

    /* JADX INFO: renamed from: mj */
    private boolean f7226mj;

    /* JADX INFO: renamed from: ri */
    private final Context f7227ri;

    /* JADX INFO: renamed from: lr */
    protected final List<InterfaceC2552ri> f7225lr = new ArrayList();

    /* JADX INFO: renamed from: ka */
    private final List<InterfaceC2552ri> f7224ka = new ArrayList();

    /* JADX INFO: renamed from: di */
    private boolean f7222di = false;
    private volatile boolean xha = false;
    private final Runnable jbs = new Runnable() { // from class: com.bytedance.sdk.component.di.ri.ri.ri.ri.ik.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (AbstractC2584ik.this) {
                AbstractC2584ik.this.xha = false;
                if (AbstractC2584ik.this.f7225lr.isEmpty()) {
                    AbstractC2584ik.this.f7222di = false;
                    return;
                }
                if (AbstractC2584ik.this.f7223fi) {
                    int size = AbstractC2584ik.this.f7225lr.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC2584ik.this.f7224ka.add(AbstractC2584ik.this.f7225lr.get(i));
                    }
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(AbstractC2584ik.this.f7225lr);
                }
                AbstractC2584ik.this.f7225lr.clear();
                AbstractC2584ik.this.f7222di = false;
                if (arrayList != null) {
                    AbstractC2584ik.this.m9497ka(arrayList);
                    return;
                }
                AbstractC2584ik abstractC2584ik = AbstractC2584ik.this;
                abstractC2584ik.m9497ka(abstractC2584ik.f7224ka);
                AbstractC2584ik.this.f7224ka.clear();
            }
        }
    };

    public AbstractC2584ik(Context context) {
        this.f7226mj = true;
        this.f7227ri = context;
        try {
            InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
            if (interfaceC2540fiM9549vr != null) {
                this.f7226mj = interfaceC2540fiM9549vr.mo9212aw();
                this.f7223fi = interfaceC2540fiM9549vr.bgr();
                f7221ik = interfaceC2540fiM9549vr.mo9230vr();
            }
            C2707ac.m10207ri("DBInsertMemRepo", "enableOpt:" + this.f7226mj + ",BATCH_SIZE:" + f7221ik, Boolean.valueOf(this.f7223fi));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9491ri() {
        if (!this.f7222di) {
            C2588ri.m9552ri().postDelayed(this.jbs, this.f7223fi ? mo9494di() : C2588ri.m9551lr());
            this.f7222di = true;
        }
        if (this.f7226mj && this.f7225lr.size() >= f7221ik && !this.xha) {
            C2588ri.m9552ri().removeCallbacks(this.jbs);
            C2588ri.m9552ri().post(this.jbs);
            this.f7222di = true;
            this.xha = true;
        }
    }

    /* JADX INFO: renamed from: di */
    protected long mo9494di() {
        return 10000L;
    }

    /* JADX INFO: renamed from: fi */
    public Context m9495fi() {
        return this.f7227ri;
    }

    /* JADX INFO: renamed from: ik */
    protected synchronized void m9496ik(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<InterfaceC2552ri> it = this.f7225lr.iterator();
                    while (it.hasNext()) {
                        InterfaceC2552ri next = it.next();
                        if (next != null) {
                            String strMo9284ik = next.mo9284ik();
                            if (!TextUtils.isEmpty(strMo9284ik) && list.contains(strMo9284ik)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    mo9487lr();
                    th.getMessage();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m9497ka(List<InterfaceC2552ri> list) {
        C2578ik.m9471ri(m9495fi(), mo9487lr(), list);
    }

    /* JADX INFO: renamed from: lr */
    public abstract String mo9487lr();

    /* JADX INFO: renamed from: ri */
    public synchronized void m9498ri(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri.mo9282di() != null && !TextUtils.isEmpty(interfaceC2552ri.mo9284ik())) {
            this.f7225lr.add(interfaceC2552ri);
            m9491ri();
        }
    }
}
