package com.bytedance.sdk.component.p130di.p131ri.p141ri;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2547lr;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2557ka;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2562ri;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2582di;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2583fi;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2585ka;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2586lr;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2587ri;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.xha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2567ik implements InterfaceC2568ka {

    /* JADX INFO: renamed from: co */
    private C2551ri f7195co;

    /* JADX INFO: renamed from: di */
    private C2583fi f7196di;

    /* JADX INFO: renamed from: fi */
    private C2582di f7197fi;

    /* JADX INFO: renamed from: ik */
    private C2586lr f7198ik;
    private C2551ri jbs;

    /* JADX INFO: renamed from: ka */
    private xha f7199ka;

    /* JADX INFO: renamed from: lr */
    private C2587ri f7200lr;

    /* JADX INFO: renamed from: mj */
    private C2551ri f7201mj;

    /* JADX INFO: renamed from: qt */
    private C2551ri f7202qt;

    /* JADX INFO: renamed from: ri */
    private C2585ka f7203ri;

    /* JADX INFO: renamed from: sf */
    private C2551ri f7204sf;
    private C2551ri xha;

    public C2567ik() {
        Context contextM9528fi = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9528fi();
        if (C2562ri.m9377ri()) {
            this.xha = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9548sf();
            this.f7203ri = new C2585ka(contextM9528fi, this.xha);
        }
        if (C2562ri.m9371fi()) {
            if (com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().jbs() != null) {
                this.jbs = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().jbs();
            } else {
                this.jbs = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9527co();
            }
            this.f7198ik = new C2586lr(contextM9528fi, this.jbs);
        }
        if (C2562ri.m9375lr()) {
            this.f7201mj = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9527co();
            this.f7200lr = new C2587ri(contextM9528fi, this.f7201mj);
        }
        if (C2562ri.m9372ik()) {
            this.f7202qt = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9527co();
            this.f7199ka = new xha(contextM9528fi, this.f7202qt);
        }
        if (C2562ri.m9373ka()) {
            this.f7204sf = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9526aw();
            this.f7197fi = new C2582di(contextM9528fi, this.f7204sf);
        }
        if (C2562ri.m9370di()) {
            this.f7195co = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().bgr();
            this.f7196di = new C2583fi(contextM9528fi, this.f7195co);
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m9460ri(List<InterfaceC2552ri> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<InterfaceC2552ri> it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC2552ri next = it.next();
                    if (next != null) {
                        String strMo9284ik = next.mo9284ik();
                        if (!TextUtils.isEmpty(strMo9284ik) && list2.contains(strMo9284ik)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: lr */
    public List<InterfaceC2552ri> m9461lr(InterfaceC2552ri interfaceC2552ri, int i) {
        if (interfaceC2552ri.mo9286ka() == 0 && interfaceC2552ri.mo9283fi() == 1 && C2562ri.m9377ri()) {
            if (this.xha.m9297lr() <= i) {
                return null;
            }
            List<InterfaceC2552ri> listRi = this.f7203ri.m9508ri(this.xha.m9297lr() - i, "_id");
            if (listRi != null && listRi.size() != 0) {
                C2547lr.m9244ri(C2557ka.f7082ka.igq(), 1);
            }
            return listRi;
        }
        if (interfaceC2552ri.mo9286ka() == 3 && interfaceC2552ri.mo9283fi() == 2 && C2562ri.m9371fi()) {
            if (this.jbs.m9297lr() > i) {
                return this.f7198ik.m9508ri(this.jbs.m9297lr() - i, "_id");
            }
        } else if (interfaceC2552ri.mo9286ka() == 0 && interfaceC2552ri.mo9283fi() == 2 && C2562ri.m9375lr()) {
            if (this.f7201mj.m9297lr() > i) {
                List<InterfaceC2552ri> listM9508ri = this.f7200lr.m9508ri(this.f7201mj.m9297lr() - i, "_id");
                if (listM9508ri != null && listM9508ri.size() != 0) {
                    C2547lr.m9244ri(C2557ka.f7082ka.m9416zf(), 1);
                }
                return listM9508ri;
            }
        } else if (interfaceC2552ri.mo9286ka() == 1 && interfaceC2552ri.mo9283fi() == 2 && C2562ri.m9372ik()) {
            if (this.f7202qt.m9297lr() > i) {
                List<InterfaceC2552ri> listM9520ri = this.f7199ka.m9520ri(this.f7202qt.m9297lr() - i, "_id");
                if (listM9520ri != null && listM9520ri.size() != 0) {
                    C2547lr.m9244ri(C2557ka.f7082ka.m9384dw(), 1);
                }
                return listM9520ri;
            }
        } else if (interfaceC2552ri.mo9286ka() == 1 && interfaceC2552ri.mo9283fi() == 3 && C2562ri.m9373ka()) {
            if (this.f7204sf.m9297lr() > i) {
                List<InterfaceC2552ri> listRi2 = this.f7197fi.m9520ri(this.f7204sf.m9297lr() - i, "_id");
                if (listRi2 != null && listRi2.size() != 0) {
                    C2547lr.m9244ri(C2557ka.f7082ka.ory(), 1);
                }
                return listRi2;
            }
        } else if (interfaceC2552ri.mo9286ka() == 2 && interfaceC2552ri.mo9283fi() == 3 && C2562ri.m9370di() && this.f7195co.m9297lr() > i) {
            return this.f7196di.m9520ri(this.f7195co.m9297lr() - i, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public List<InterfaceC2552ri> mo9448ri(int i, int i2, List<String> list) {
        if (C2562ri.m9377ri()) {
            List<InterfaceC2552ri> listRi = this.f7203ri.m9509ri("_id");
            if (m9460ri(listRi, list)) {
                listRi.size();
                C2547lr.m9244ri(C2557ka.f7082ka.wjv(), 1);
                return listRi;
            }
        }
        if (C2562ri.m9371fi()) {
            List<InterfaceC2552ri> listRi2 = this.f7198ik.m9509ri("_id");
            if (m9460ri(listRi2, list)) {
                listRi2.size();
                return listRi2;
            }
        }
        if (C2562ri.m9375lr()) {
            List<InterfaceC2552ri> listM9509ri = this.f7200lr.m9509ri("_id");
            if (m9460ri(listM9509ri, list)) {
                listM9509ri.size();
                C2547lr.m9244ri(C2557ka.f7082ka.m9380ay(), 1);
                return listM9509ri;
            }
        }
        if (C2562ri.m9372ik()) {
            List<InterfaceC2552ri> listM9518lr = this.f7199ka.m9518lr("_id");
            if (m9460ri(listM9518lr, list)) {
                listM9518lr.size();
                C2547lr.m9244ri(C2557ka.f7082ka.m9387fr(), 1);
                return listM9518lr;
            }
        }
        if (C2562ri.m9373ka()) {
            List<InterfaceC2552ri> listLr = this.f7197fi.m9518lr("_id");
            if (m9460ri(listLr, list)) {
                listLr.size();
                C2547lr.m9244ri(C2557ka.f7082ka.m9407su(), 1);
                return listLr;
            }
        }
        if (!C2562ri.m9370di()) {
            return null;
        }
        List<InterfaceC2552ri> listLr2 = this.f7196di.m9518lr("_id");
        if (!m9460ri(listLr2, list)) {
            return null;
        }
        listLr2.size();
        return listLr2;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public void mo9449ri(int i, long j) {
        C2585ka c2585ka = this.f7203ri;
        if (c2585ka != null) {
            c2585ka.m9510ri(i, j);
        }
        C2586lr c2586lr = this.f7198ik;
        if (c2586lr != null) {
            c2586lr.m9510ri(i, j);
        }
        C2587ri c2587ri = this.f7200lr;
        if (c2587ri != null) {
            c2587ri.m9510ri(i, j);
        }
        xha xhaVar = this.f7199ka;
        if (xhaVar != null) {
            xhaVar.m9521ri(i, j);
        }
        C2582di c2582di = this.f7197fi;
        if (c2582di != null) {
            c2582di.m9521ri(i, j);
        }
        C2583fi c2583fi = this.f7196di;
        if (c2583fi != null) {
            c2583fi.m9521ri(i, j);
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public void mo9450ri(int i, List<InterfaceC2552ri> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        InterfaceC2552ri interfaceC2552ri = list.get(0);
        if (i == 200 || i == -1) {
            C2547lr.m9244ri(C2557ka.f7082ka.rzk(), list.size());
            if (i != 200) {
                C2547lr.m9244ri(C2557ka.f7082ka.gcp(), list.size());
            }
            if (interfaceC2552ri.mo9286ka() == 0 && interfaceC2552ri.mo9283fi() == 1) {
                if (C2562ri.m9377ri()) {
                    this.f7203ri.m9506lr(list);
                    return;
                }
                return;
            }
            if (interfaceC2552ri.mo9286ka() == 3 && interfaceC2552ri.mo9283fi() == 2) {
                if (C2562ri.m9371fi()) {
                    this.f7198ik.m9506lr(list);
                    return;
                }
                return;
            }
            if (interfaceC2552ri.mo9286ka() == 0 && interfaceC2552ri.mo9283fi() == 2) {
                if (C2562ri.m9375lr()) {
                    this.f7200lr.m9506lr(list);
                    return;
                }
                return;
            }
            if (interfaceC2552ri.mo9286ka() == 1 && interfaceC2552ri.mo9283fi() == 2) {
                if (C2562ri.m9372ik()) {
                    this.f7199ka.m9519lr(list);
                }
            } else if (interfaceC2552ri.mo9286ka() == 1 && interfaceC2552ri.mo9283fi() == 3) {
                if (C2562ri.m9373ka()) {
                    this.f7197fi.m9519lr(list);
                }
            } else if (interfaceC2552ri.mo9286ka() == 2 && interfaceC2552ri.mo9283fi() == 3 && C2562ri.m9370di()) {
                this.f7196di.m9519lr(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public void mo9451ri(InterfaceC2552ri interfaceC2552ri, int i) {
        if (interfaceC2552ri == null) {
            return;
        }
        try {
            interfaceC2552ri.mo9288lr(System.currentTimeMillis());
            if (interfaceC2552ri.mo9286ka() == 0 && interfaceC2552ri.mo9283fi() == 1) {
                if (C2562ri.m9377ri()) {
                    this.f7203ri.m9498ri(interfaceC2552ri);
                    return;
                }
                return;
            }
            if (interfaceC2552ri.mo9286ka() == 3 && interfaceC2552ri.mo9283fi() == 2) {
                if (C2562ri.m9371fi()) {
                    this.f7198ik.m9498ri(interfaceC2552ri);
                    return;
                }
                return;
            }
            if (interfaceC2552ri.mo9286ka() == 0 && interfaceC2552ri.mo9283fi() == 2) {
                if (C2562ri.m9375lr()) {
                    this.f7200lr.m9498ri(interfaceC2552ri);
                    return;
                }
                return;
            }
            if (interfaceC2552ri.mo9286ka() == 1 && interfaceC2552ri.mo9283fi() == 2) {
                if (C2562ri.m9372ik()) {
                    this.f7199ka.m9498ri(interfaceC2552ri);
                }
            } else if (interfaceC2552ri.mo9286ka() == 1 && interfaceC2552ri.mo9283fi() == 3) {
                if (C2562ri.m9373ka()) {
                    this.f7197fi.m9498ri(interfaceC2552ri);
                }
            } else if (interfaceC2552ri.mo9286ka() == 2 && interfaceC2552ri.mo9283fi() == 3 && C2562ri.m9370di()) {
                this.f7196di.m9498ri(interfaceC2552ri);
            }
        } catch (Throwable unused) {
            C2547lr.m9244ri(C2557ka.f7082ka.m9412xd(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public boolean mo9452ri(int i, boolean z) {
        C2583fi c2583fi;
        C2582di c2582di;
        xha xhaVar;
        C2587ri c2587ri;
        C2586lr c2586lr;
        C2585ka c2585ka;
        if (C2562ri.m9377ri() && (c2585ka = this.f7203ri) != null && c2585ka.m9512ri(i)) {
            C2547lr.m9244ri(C2557ka.f7082ka.bgr(), 1);
            return true;
        }
        if (C2562ri.m9371fi() && (c2586lr = this.f7198ik) != null && c2586lr.m9512ri(i)) {
            return true;
        }
        if (C2562ri.m9375lr() && (c2587ri = this.f7200lr) != null && c2587ri.m9512ri(i)) {
            C2547lr.m9244ri(C2557ka.f7082ka.m9411vr(), 1);
            return true;
        }
        if (C2562ri.m9372ik() && (xhaVar = this.f7199ka) != null && xhaVar.m9523ri(i)) {
            C2547lr.m9244ri(C2557ka.f7082ka.slm(), 1);
            return true;
        }
        if (!C2562ri.m9373ka() || (c2582di = this.f7197fi) == null || !c2582di.m9523ri(i)) {
            return C2562ri.m9370di() && (c2583fi = this.f7196di) != null && c2583fi.m9523ri(i);
        }
        C2547lr.m9244ri(C2557ka.f7082ka.m9381bu(), 1);
        return true;
    }
}
