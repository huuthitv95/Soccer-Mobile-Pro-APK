package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C8672l;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8810i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8806e;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8724i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8731p f20353a;

    public RunnableC8724i(C8731p c8731p) {
        this.f20353a = c8731p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8731p c8731p = this.f20353a;
        if (c8731p.f20380G || c8731p.f20399s || c8731p.f20397q == null || !c8731p.f20398r) {
            return;
        }
        int size = c8731p.f20395o.size();
        for (int i = 0; i < size; i++) {
            if (((C8538g) c8731p.f20395o.valueAt(i)).m21059e() == null) {
                return;
            }
        }
        C8806e c8806e = c8731p.f20391k;
        synchronized (c8806e) {
            c8806e.f20616a = false;
        }
        C8740y[] c8740yArr = new C8740y[size];
        c8731p.f20406z = new boolean[size];
        c8731p.f20405y = new boolean[size];
        c8731p.f20404x = c8731p.f20397q.mo21021c();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                c8731p.f20403w = new C8741z(c8740yArr);
                c8731p.f20399s = true;
                InterfaceC8735t interfaceC8735t = c8731p.f20386f;
                long j = c8731p.f20404x;
                interfaceC8735t.mo21207a(new C8739x(j, j, 0L, 0L, c8731p.f20397q.mo21020a(), false), null);
                ((C8672l) c8731p.f20396p).f20182f.obtainMessage(8, c8731p).sendToTarget();
                return;
            }
            C8708o c8708oM21059e = ((C8538g) c8731p.f20395o.valueAt(i2)).m21059e();
            c8740yArr[i2] = new C8740y(c8708oM21059e);
            String str = c8708oM21059e.f20295f;
            if (!"video".equals(AbstractC8810i.m21326b(str)) && !"audio".equals(AbstractC8810i.m21326b(str))) {
                z = false;
            }
            c8731p.f20406z[i2] = z;
            c8731p.f20374A = z | c8731p.f20374A;
            i2++;
        }
    }
}
