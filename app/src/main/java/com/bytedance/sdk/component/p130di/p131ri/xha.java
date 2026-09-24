package com.bytedance.sdk.component.p130di.p131ri;

import android.content.Context;
import com.bytedance.sdk.component.p130di.p131ri.p132di.C2539ri;
import com.bytedance.sdk.component.p130di.p131ri.p133fi.C2544lr;
import com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2545ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2557ka;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.InterfaceC2556ik;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: co */
    private static xha f7234co;
    private static volatile InterfaceC2545ri jbs;

    /* JADX INFO: renamed from: aw */
    private final AtomicBoolean f7235aw = new AtomicBoolean(false);
    private long bgr;

    /* JADX INFO: renamed from: di */
    private volatile C2551ri f7236di;

    /* JADX INFO: renamed from: fi */
    private volatile C2551ri f7237fi;

    /* JADX INFO: renamed from: ik */
    private volatile C2551ri f7238ik;

    /* JADX INFO: renamed from: ka */
    private volatile C2551ri f7239ka;

    /* JADX INFO: renamed from: lr */
    private volatile C2551ri f7240lr;

    /* JADX INFO: renamed from: mj */
    private volatile InterfaceC2540fi f7241mj;

    /* JADX INFO: renamed from: qt */
    private volatile InterfaceC2556ik f7242qt;

    /* JADX INFO: renamed from: ri */
    private volatile Context f7243ri;

    /* JADX INFO: renamed from: sf */
    private volatile Map<Integer, InterfaceC2556ik> f7244sf;
    private volatile InterfaceC2566fi xha;

    private xha() {
    }

    /* JADX INFO: renamed from: di */
    public static synchronized xha m9524di() {
        if (f7234co == null) {
            f7234co = new xha();
        }
        return f7234co;
    }

    /* JADX INFO: renamed from: ka */
    public static InterfaceC2545ri m9525ka() {
        if (jbs == null) {
            synchronized (xha.class) {
                if (jbs == null) {
                    jbs = new C2544lr();
                }
            }
        }
        return jbs;
    }

    /* JADX INFO: renamed from: aw */
    public C2551ri m9526aw() {
        return this.f7239ka;
    }

    public C2551ri bgr() {
        return this.f7237fi;
    }

    /* JADX INFO: renamed from: co */
    public C2551ri m9527co() {
        return this.f7238ik;
    }

    /* JADX INFO: renamed from: fi */
    public Context m9528fi() {
        return this.f7243ri;
    }

    /* JADX INFO: renamed from: fi */
    public void m9529fi(C2551ri c2551ri) {
        this.f7237fi = c2551ri;
    }

    /* JADX INFO: renamed from: ik */
    public InterfaceC2566fi m9530ik() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ik */
    public void m9531ik(C2551ri c2551ri) {
        this.f7238ik = c2551ri;
    }

    public C2551ri jbs() {
        return this.f7236di;
    }

    /* JADX INFO: renamed from: ka */
    public void m9532ka(C2551ri c2551ri) {
        this.f7239ka = c2551ri;
    }

    /* JADX INFO: renamed from: lr */
    public Map<Integer, InterfaceC2556ik> m9533lr() {
        return this.f7244sf;
    }

    /* JADX INFO: renamed from: lr */
    public void m9534lr(C2551ri c2551ri) {
        this.f7240lr = c2551ri;
    }

    /* JADX INFO: renamed from: mj */
    public void m9535mj() {
        C2557ka.f7084ri.m9327lr();
    }

    /* JADX INFO: renamed from: qt */
    public void m9536qt() {
        C2557ka.f7084ri.m9325ik();
    }

    /* JADX INFO: renamed from: ri */
    public void m9537ri(long j) {
        this.bgr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m9538ri(Context context) {
        this.f7243ri = context;
    }

    /* JADX INFO: renamed from: ri */
    public void m9539ri(InterfaceC2540fi interfaceC2540fi) {
        this.f7241mj = interfaceC2540fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m9540ri(C2551ri c2551ri) {
        this.f7236di = c2551ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m9541ri(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri == null) {
            return;
        }
        interfaceC2552ri.mo9293ri(System.currentTimeMillis());
        C2557ka.f7084ri.m9330ri(interfaceC2552ri, interfaceC2552ri.mo9286ka());
    }

    /* JADX INFO: renamed from: ri */
    public void m9542ri(InterfaceC2556ik interfaceC2556ik) {
        this.f7242qt = interfaceC2556ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m9543ri(InterfaceC2566fi interfaceC2566fi) {
        this.xha = interfaceC2566fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m9544ri(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        C2539ri.m9211ri().mo9190ri(str, list, z, map, i, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m9545ri(String str, boolean z) {
        C2539ri.m9211ri().mo9191ri(str, z);
    }

    /* JADX INFO: renamed from: ri */
    public void m9546ri(boolean z) {
        this.f7235aw.set(z);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m9547ri() {
        return this.f7235aw.get();
    }

    /* JADX INFO: renamed from: sf */
    public C2551ri m9548sf() {
        return this.f7240lr;
    }

    public long slm() {
        return this.bgr * SignalManager.TWENTY_FOUR_HOURS_MILLIS;
    }

    /* JADX INFO: renamed from: vr */
    public InterfaceC2540fi m9549vr() {
        return this.f7241mj;
    }

    public InterfaceC2556ik xha() {
        return this.f7242qt;
    }
}
