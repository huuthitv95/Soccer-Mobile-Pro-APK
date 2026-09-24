package com.bytedance.sdk.component.adexpress.p126ri.p128lr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p122fi.C2483fi;
import com.bytedance.sdk.component.adexpress.p124ka.C2495ka;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2518ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.component.utils.xha;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ri.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2520fi extends AbstractC2521ik {

    /* JADX INFO: renamed from: lr */
    private static volatile C2520fi f7001lr;

    /* JADX INFO: renamed from: ri */
    private static File f7002ri;

    /* JADX INFO: renamed from: ik */
    private AtomicBoolean f7005ik = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ka */
    private AtomicBoolean f7006ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fi */
    private boolean f7004fi = false;

    /* JADX INFO: renamed from: di */
    private AtomicBoolean f7003di = new AtomicBoolean(false);
    private AtomicInteger xha = new AtomicInteger(0);

    /* JADX INFO: renamed from: mj */
    private AtomicLong f7007mj = new AtomicLong();

    private C2520fi() {
        jbs();
    }

    private void jbs() {
        C2495ka.m8819lr(new AbstractRunnableC2676ik("init") { // from class: com.bytedance.sdk.component.adexpress.ri.lr.fi.1
            @Override // java.lang.Runnable
            public void run() {
                C2524mj.m9126ri();
                C2520fi.this.f7005ik.set(false);
                C2520fi.this.m9081ka();
                C2520fi.this.xha();
                if (C2531ri.m9163ri().m9166ik() == null || !ihz.m10229ri(C2531ri.m9163ri().m9166ik().mo9151lr()) || C2531ri.m9163ri().m9166ik() == null) {
                    return;
                }
                C2531ri.m9163ri().m9166ik().mo9150ka();
            }
        }, 10);
    }

    /* JADX INFO: renamed from: lr */
    public static C2520fi m9074lr() {
        if (f7001lr == null) {
            synchronized (C2520fi.class) {
                if (f7001lr == null) {
                    f7001lr = new C2520fi();
                }
            }
        }
        return f7001lr;
    }

    /* JADX INFO: renamed from: mj */
    public static File m9075mj() {
        if (f7002ri == null) {
            try {
                File fileM9102ri = C2522ka.m9102ri();
                Context contextMo9151lr = C2531ri.m9163ri().m9166ik().mo9151lr();
                File file = new File(contextMo9151lr != null ? xha.m10331ri(contextMo9151lr, "tt_tmpl_pkg") : new File(fileM9102ri, "tt_tmpl_pkg"), "template");
                file.mkdirs();
                f7002ri = file;
            } catch (Throwable unused) {
            }
        }
        return f7002ri;
    }

    /* JADX INFO: renamed from: qt */
    private void m9076qt() {
        if (this.xha.getAndSet(0) <= 0 || System.currentTimeMillis() - this.f7007mj.get() <= 600000) {
            return;
        }
        xha();
    }

    /* JADX INFO: renamed from: di */
    public C2518ri m9078di() {
        return C2524mj.m9124lr();
    }

    /* JADX INFO: renamed from: fi */
    public boolean m9079fi() {
        return this.f7004fi;
    }

    /* JADX INFO: renamed from: ik */
    public void m9080ik() {
        jbs();
    }

    /* JADX INFO: renamed from: ka */
    public void m9081ka() {
        C2518ri c2518riM9124lr = C2524mj.m9124lr();
        if (c2518riM9124lr == null || !c2518riM9124lr.m9044mj()) {
            return;
        }
        boolean zM9084ri = m9084ri(c2518riM9124lr);
        if (!zM9084ri) {
            C2524mj.m9123ka();
        }
        this.f7004fi = zM9084ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.p126ri.p128lr.AbstractC2521ik
    /* JADX INFO: renamed from: ri */
    public File mo9082ri() {
        return m9075mj();
    }

    /* JADX INFO: renamed from: ri */
    public void m9083ri(boolean z) {
        List<C2518ri.ri> listRi;
        boolean z2;
        if (this.f7005ik.get()) {
            return;
        }
        try {
            if (this.f7006ka.get()) {
                if (z) {
                    this.xha.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.f7006ka.set(true);
            C2518ri c2518riMo9148fi = C2531ri.m9163ri().m9166ik().mo9148fi();
            C2518ri c2518riM9124lr = C2524mj.m9124lr();
            if (c2518riMo9148fi != null && c2518riMo9148fi.m9044mj()) {
                if (!C2524mj.m9125lr(c2518riMo9148fi)) {
                    this.f7006ka.set(false);
                    this.f7007mj.set(System.currentTimeMillis());
                    return;
                }
                if (C2531ri.m9163ri().m9166ik() != null) {
                    C2531ri.m9163ri().m9166ik().mo9149ik().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ri.lr.fi.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C2483fi.m8762ri().m8769lr();
                        }
                    });
                }
                C2524mj.m9127ri(c2518riMo9148fi);
                boolean zRi = (c2518riMo9148fi.m9037fi() == null || TextUtils.isEmpty(c2518riMo9148fi.m9037fi().m9054ri())) ? false : m9098ri(c2518riMo9148fi.m9037fi().m9054ri());
                if (c2518riMo9148fi.m9046ri().size() != 0) {
                    listRi = m9095ri(c2518riMo9148fi, c2518riM9124lr);
                    z2 = listRi != null;
                } else {
                    listRi = null;
                    z2 = zRi;
                }
                if (!zRi) {
                    List<C2518ri.ri> listLr = m9093lr(c2518riMo9148fi, c2518riM9124lr);
                    if (listRi == null || listLr == null) {
                        listRi = listLr;
                    } else {
                        listRi.addAll(listLr);
                    }
                    if (listLr == null) {
                        z3 = false;
                    }
                    if (listLr == null) {
                        this.f7006ka.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && m9084ri(c2518riMo9148fi)) {
                    C2524mj.m9127ri(c2518riMo9148fi);
                    C2524mj.m9122ik();
                    m9094lr(listRi);
                }
                m9081ka();
                this.f7006ka.set(false);
                this.f7007mj.set(System.currentTimeMillis());
                m9076qt();
                return;
            }
            this.f7006ka.set(false);
            m9096ri(109);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m9084ri(C2518ri c2518ri) {
        if (c2518ri == null) {
            return false;
        }
        return m9100ri(c2518ri.m9046ri()) || m9097ri(c2518ri.m9037fi()) || m9099ri(c2518ri.m9036di());
    }

    public void xha() {
        m9083ri(false);
    }
}
