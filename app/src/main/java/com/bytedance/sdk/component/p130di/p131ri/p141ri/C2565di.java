package com.bytedance.sdk.component.p130di.p131ri.p141ri;

import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2547lr;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2557ka;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2562ri;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p142lr.C2570di;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p142lr.C2571fi;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p142lr.C2572ik;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p142lr.C2574lr;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p142lr.C2575ri;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p142lr.xha;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2565di implements InterfaceC2568ka {

    /* JADX INFO: renamed from: aw */
    private C2551ri f7184aw;
    private Queue<String> bgr;

    /* JADX INFO: renamed from: co */
    private C2551ri f7185co;

    /* JADX INFO: renamed from: di */
    private C2572ik f7186di;

    /* JADX INFO: renamed from: fi */
    private xha f7187fi;

    /* JADX INFO: renamed from: ik */
    private C2575ri f7188ik;
    private C2551ri jbs;

    /* JADX INFO: renamed from: ka */
    private C2574lr f7189ka;

    /* JADX INFO: renamed from: lr */
    private C2571fi f7190lr;

    /* JADX INFO: renamed from: mj */
    private C2551ri f7191mj;

    /* JADX INFO: renamed from: qt */
    private C2551ri f7192qt;

    /* JADX INFO: renamed from: ri */
    InterfaceC2566fi f7193ri = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9530ik();

    /* JADX INFO: renamed from: sf */
    private C2551ri f7194sf;
    private C2570di xha;

    public C2565di(Queue<String> queue) {
        this.bgr = queue;
        if (C2562ri.m9377ri()) {
            this.f7191mj = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9548sf();
            this.f7190lr = new C2571fi(this.f7191mj, queue);
        }
        if (C2562ri.m9371fi()) {
            if (com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().jbs() != null) {
                this.f7192qt = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().jbs();
            } else {
                this.f7192qt = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9527co();
            }
            this.f7189ka = new C2574lr(this.f7192qt, queue);
        }
        if (C2562ri.m9375lr()) {
            this.jbs = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9527co();
            this.f7188ik = new C2575ri(this.jbs, queue);
        }
        if (C2562ri.m9372ik()) {
            this.f7194sf = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9527co();
            this.f7187fi = new xha(this.f7194sf, queue);
        }
        if (C2562ri.m9373ka()) {
            this.f7185co = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9526aw();
            this.f7186di = new C2572ik(this.f7185co, queue);
        }
        if (C2562ri.m9370di()) {
            this.f7184aw = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().bgr();
            this.xha = new C2570di(this.f7184aw, queue);
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public List<InterfaceC2552ri> mo9448ri(int i, int i2, List<String> list) {
        List<InterfaceC2552ri> listRi;
        List<InterfaceC2552ri> listRi2;
        List<InterfaceC2552ri> listRi3;
        List<InterfaceC2552ri> listRi4;
        List<InterfaceC2552ri> listRi5;
        List<InterfaceC2552ri> listRi6;
        if (C2562ri.m9377ri() && this.f7190lr.m9462lr(i, i2) && (listRi6 = this.f7190lr.m9463ri(i, i2)) != null && listRi6.size() != 0) {
            C2547lr.m9244ri(C2557ka.f7082ka.m9397nr(), 1);
            return listRi6;
        }
        if (C2562ri.m9371fi() && this.f7189ka.m9462lr(i, i2) && (listRi5 = this.f7189ka.m9463ri(i, i2)) != null && listRi5.size() != 0) {
            return listRi5;
        }
        if (C2562ri.m9375lr() && this.f7188ik.m9462lr(i, i2) && (listRi4 = this.f7188ik.m9463ri(i, i2)) != null && listRi4.size() != 0) {
            C2547lr.m9244ri(C2557ka.f7082ka.tan(), 1);
            return listRi4;
        }
        if (C2562ri.m9372ik() && this.f7187fi.m9462lr(i, i2) && (listRi3 = this.f7187fi.m9463ri(i, i2)) != null && listRi3.size() != 0) {
            C2547lr.m9244ri(C2557ka.f7082ka.m9378ac(), 1);
            return listRi3;
        }
        if (C2562ri.m9373ka() && this.f7186di.m9462lr(i, i2) && (listRi2 = this.f7186di.m9463ri(i, i2)) != null && listRi2.size() != 0) {
            C2547lr.m9244ri(C2557ka.f7082ka.ihz(), 1);
            return listRi2;
        }
        if (!C2562ri.m9370di() || !this.xha.m9462lr(i, i2) || (listRi = this.xha.m9463ri(i, i2)) == null || listRi.size() == 0) {
            return null;
        }
        return listRi;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public void mo9449ri(int i, long j) {
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public void mo9450ri(int i, List<InterfaceC2552ri> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        InterfaceC2552ri interfaceC2552ri = list.get(0);
        byte bMo9283fi = interfaceC2552ri.mo9283fi();
        byte bMo9286ka = interfaceC2552ri.mo9286ka();
        if (bMo9286ka == 0 && bMo9283fi == 1 && C2562ri.m9377ri()) {
            this.f7190lr.m9464ri(i, list);
            return;
        }
        if (bMo9286ka == 3 && bMo9283fi == 2 && C2562ri.m9371fi()) {
            this.f7189ka.m9464ri(i, list);
            return;
        }
        if (bMo9286ka == 0 && bMo9283fi == 2 && C2562ri.m9375lr()) {
            this.f7188ik.m9464ri(i, list);
            return;
        }
        if (bMo9286ka == 1 && bMo9283fi == 2 && C2562ri.m9372ik()) {
            this.f7187fi.m9464ri(i, list);
            return;
        }
        if (bMo9286ka == 1 && bMo9283fi == 3 && C2562ri.m9373ka()) {
            this.f7186di.m9464ri(i, list);
        } else if (bMo9286ka == 2 && bMo9283fi == 3 && C2562ri.m9370di()) {
            this.xha.m9464ri(i, list);
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public void mo9451ri(InterfaceC2552ri interfaceC2552ri, int i) {
        try {
            byte bMo9286ka = interfaceC2552ri.mo9286ka();
            byte bMo9283fi = interfaceC2552ri.mo9283fi();
            if (bMo9286ka == 0 && bMo9283fi == 1 && C2562ri.m9377ri()) {
                this.f7190lr.m9465ri(interfaceC2552ri);
                return;
            }
            if (bMo9286ka == 3 && bMo9283fi == 2 && C2562ri.m9371fi()) {
                this.f7189ka.m9465ri(interfaceC2552ri);
                return;
            }
            if (bMo9286ka == 0 && bMo9283fi == 2 && C2562ri.m9375lr()) {
                this.f7188ik.m9465ri(interfaceC2552ri);
                return;
            }
            if (bMo9286ka == 1 && bMo9283fi == 2 && C2562ri.m9372ik()) {
                this.f7187fi.m9465ri(interfaceC2552ri);
                return;
            }
            if (bMo9286ka == 1 && bMo9283fi == 3 && C2562ri.m9373ka()) {
                this.f7186di.m9465ri(interfaceC2552ri);
            } else if (bMo9286ka == 2 && bMo9283fi == 3 && C2562ri.m9370di()) {
                this.xha.m9465ri(interfaceC2552ri);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public boolean mo9452ri(int i, boolean z) {
        C2570di c2570di;
        C2551ri c2551ri;
        C2572ik c2572ik;
        C2551ri c2551ri2;
        xha xhaVar;
        C2551ri c2551ri3;
        C2575ri c2575ri;
        C2551ri c2551ri4;
        C2574lr c2574lr;
        C2551ri c2551ri5;
        C2571fi c2571fi;
        C2551ri c2551ri6;
        if (C2562ri.m9377ri() && (c2571fi = this.f7190lr) != null && (c2551ri6 = this.f7191mj) != null && c2571fi.m9462lr(i, c2551ri6.m9298ri())) {
            return true;
        }
        if (C2562ri.m9371fi() && (c2574lr = this.f7189ka) != null && (c2551ri5 = this.f7192qt) != null && c2574lr.m9462lr(i, c2551ri5.m9298ri())) {
            return true;
        }
        if (C2562ri.m9375lr() && (c2575ri = this.f7188ik) != null && (c2551ri4 = this.jbs) != null && c2575ri.m9462lr(i, c2551ri4.m9298ri())) {
            return true;
        }
        if (C2562ri.m9372ik() && (xhaVar = this.f7187fi) != null && (c2551ri3 = this.f7194sf) != null && xhaVar.m9462lr(i, c2551ri3.m9298ri())) {
            return true;
        }
        if (!C2562ri.m9373ka() || (c2572ik = this.f7186di) == null || (c2551ri2 = this.f7185co) == null || !c2572ik.m9462lr(i, c2551ri2.m9298ri())) {
            return C2562ri.m9370di() && (c2570di = this.xha) != null && (c2551ri = this.f7184aw) != null && c2570di.m9462lr(i, c2551ri.m9298ri());
        }
        return true;
    }
}
