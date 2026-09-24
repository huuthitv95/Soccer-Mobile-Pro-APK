package com.bytedance.sdk.component.xha;

import android.os.Bundle;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2659mj;
import com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri.InterfaceC2664fi;
import com.bytedance.sdk.component.xha.p169ik.C2736ik;
import com.bytedance.sdk.component.xha.p170lr.C2741ka;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import com.bytedance.sdk.component.xha.p170lr.C2743ri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.component.xha.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2744ri {

    /* JADX INFO: renamed from: lr */
    private static lr f7848lr;

    /* JADX INFO: renamed from: ri */
    private static InterfaceC2664fi f7849ri;

    /* JADX INFO: renamed from: ik */
    private AbstractC2671sf f7850ik;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.xha.ri$lr */
    public interface lr {
        /* JADX INFO: renamed from: ri */
        boolean mo10413ri();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.xha.ri$ri */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class ri {

        /* JADX INFO: renamed from: di */
        private Bundle f7851di;

        /* JADX INFO: renamed from: fi */
        private Set<String> f7852fi;

        /* JADX INFO: renamed from: ka */
        final List<InterfaceC2659mj> f7854ka = new ArrayList();

        /* JADX INFO: renamed from: ri */
        int f7856ri = 10000;

        /* JADX INFO: renamed from: lr */
        int f7855lr = 10000;

        /* JADX INFO: renamed from: ik */
        int f7853ik = 10000;

        /* JADX INFO: renamed from: ri */
        private static int m10415ri(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }

        /* JADX INFO: renamed from: ik */
        public ri m10417ik(long j, TimeUnit timeUnit) {
            this.f7853ik = m10415ri("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m10418lr(long j, TimeUnit timeUnit) {
            this.f7855lr = m10415ri("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m10419ri(long j, TimeUnit timeUnit) {
            this.f7856ri = m10415ri("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m10420ri(InterfaceC2659mj interfaceC2659mj) {
            this.f7854ka.add(interfaceC2659mj);
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m10421ri(boolean z) {
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2744ri m10422ri() {
            return new C2744ri(this);
        }
    }

    private C2744ri(ri riVar) {
        AbstractC2671sf.ri riVarM10009lr = new AbstractC2671sf.ri().m10010ri(riVar.f7856ri, TimeUnit.MILLISECONDS).m10008ik(riVar.f7853ik, TimeUnit.MILLISECONDS).m10009lr(riVar.f7855lr, TimeUnit.MILLISECONDS);
        if (riVar.f7854ka != null && riVar.f7854ka.size() > 0) {
            Iterator<InterfaceC2659mj> it = riVar.f7854ka.iterator();
            while (it.hasNext()) {
                riVarM10009lr.m10011ri(it.next());
            }
        }
        if (riVar.f7851di != null) {
            Bundle unused = riVar.f7851di;
        }
        Set unused2 = riVar.f7852fi;
        this.f7850ik = riVarM10009lr.m10012ri();
    }

    /* JADX INFO: renamed from: di */
    public static boolean m10405di() {
        lr lrVar = f7848lr;
        if (lrVar == null) {
            return false;
        }
        return lrVar.mo10413ri();
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m10406fi() {
        InterfaceC2664fi interfaceC2664fi = f7849ri;
        if (interfaceC2664fi == null) {
            return false;
        }
        return interfaceC2664fi.mo9980ri();
    }

    /* JADX INFO: renamed from: ri */
    public static void m10407ri() {
        C2736ik.m10351ri(C2736ik.ri.DEBUG);
    }

    /* JADX INFO: renamed from: ri */
    public static void m10408ri(InterfaceC2664fi interfaceC2664fi) {
        f7849ri = interfaceC2664fi;
    }

    /* JADX INFO: renamed from: ri */
    public static void m10409ri(lr lrVar) {
        f7848lr = lrVar;
    }

    /* JADX INFO: renamed from: ik */
    public C2742lr m10410ik() {
        return new C2742lr(this.f7850ik);
    }

    /* JADX INFO: renamed from: ka */
    public C2743ri m10411ka() {
        return new C2743ri(this.f7850ik);
    }

    /* JADX INFO: renamed from: lr */
    public C2741ka m10412lr() {
        return new C2741ka(this.f7850ik);
    }

    public AbstractC2671sf xha() {
        return this.f7850ik;
    }
}
