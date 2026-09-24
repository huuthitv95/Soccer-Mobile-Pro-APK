package com.bytedance.sdk.component.p130di.p131ri.p141ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2547lr;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2557ka;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2569lr extends AbstractC2576ri {

    /* JADX INFO: renamed from: ik */
    private final Queue<String> f7205ik;

    /* JADX INFO: renamed from: lr */
    private final C2567ik f7206lr;

    /* JADX INFO: renamed from: ri */
    private final InterfaceC2568ka f7207ri;

    public C2569lr() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.f7205ik = concurrentLinkedQueue;
        this.f7207ri = new C2565di(concurrentLinkedQueue);
        this.f7206lr = new C2567ik();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public synchronized List<InterfaceC2552ri> mo9448ri(int i, int i2, List<String> list) {
        List list2;
        List<InterfaceC2552ri> listMo9448ri = this.f7207ri.mo9448ri(i, i2, list);
        if (listMo9448ri == null || listMo9448ri.size() == 0) {
            ArrayList<String> arrayList = new ArrayList(this.f7205ik);
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(list);
            }
            List<InterfaceC2552ri> listMo9448ri2 = this.f7206lr.mo9448ri(i, i2, arrayList);
            if (listMo9448ri2 != null && listMo9448ri2.size() != 0) {
                HashMap map = new HashMap();
                for (InterfaceC2552ri interfaceC2552ri : listMo9448ri2) {
                    map.put(interfaceC2552ri.mo9284ik(), interfaceC2552ri);
                }
                arrayList.size();
                if (arrayList.size() != 0) {
                    for (String str : arrayList) {
                        if (map.get(str) != null) {
                            map.remove(str);
                        }
                    }
                }
                listMo9448ri2.clear();
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    listMo9448ri2.add(map.get((String) it.next()));
                }
            }
            list2 = listMo9448ri2;
        } else {
            listMo9448ri.size();
            if (i == 1 || i == 2) {
                list2 = listMo9448ri;
                List<InterfaceC2552ri> listM9461lr = this.f7206lr.m9461lr((InterfaceC2552ri) listMo9448ri.get(0), listMo9448ri.size());
                list2 = listMo9448ri;
                if (listM9461lr != null && listM9461lr.size() != 0) {
                    list2 = listMo9448ri;
                    listM9461lr.size();
                    HashMap map2 = new HashMap();
                    for (InterfaceC2552ri interfaceC2552ri2 : listM9461lr) {
                        map2.put(interfaceC2552ri2.mo9284ik(), interfaceC2552ri2);
                    }
                    ArrayList arrayList2 = new ArrayList(this.f7205ik);
                    for (InterfaceC2552ri interfaceC2552ri3 : listM9461lr) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (TextUtils.equals(interfaceC2552ri3.mo9284ik(), (String) it2.next())) {
                                map2.remove(interfaceC2552ri3.mo9284ik());
                                break;
                            }
                        }
                    }
                    for (InterfaceC2552ri interfaceC2552ri4 : listMo9448ri) {
                        map2.put(interfaceC2552ri4.mo9284ik(), interfaceC2552ri4);
                    }
                    listMo9448ri.clear();
                    Iterator it3 = map2.keySet().iterator();
                    while (it3.hasNext()) {
                        listMo9448ri.add(map2.get((String) it3.next()));
                    }
                    listM9461lr.clear();
                    list2 = listMo9448ri;
                }
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                this.f7205ik.offer(((InterfaceC2552ri) it4.next()).mo9284ik());
            }
            return list2;
        }
        return new ArrayList();
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public void mo9449ri(int i, long j) {
        this.f7206lr.mo9449ri(i, j);
        this.f7207ri.mo9449ri(i, j);
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public synchronized void mo9450ri(int i, List<InterfaceC2552ri> list) {
        Iterator<InterfaceC2552ri> it = list.iterator();
        while (it.hasNext()) {
            this.f7205ik.remove(it.next().mo9284ik());
        }
        InterfaceC2568ka interfaceC2568ka = this.f7207ri;
        if (interfaceC2568ka != null) {
            interfaceC2568ka.mo9450ri(i, list);
        }
        C2567ik c2567ik = this.f7206lr;
        if (c2567ik != null) {
            c2567ik.mo9450ri(i, list);
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public synchronized void mo9451ri(InterfaceC2552ri interfaceC2552ri, int i) {
        InterfaceC2568ka interfaceC2568ka;
        C2567ik c2567ik;
        if (i != 5) {
            if (xha.m9524di().m9549vr().mo9228ri(xha.m9524di().m9528fi()) && (interfaceC2568ka = this.f7207ri) != null && interfaceC2552ri != null) {
                interfaceC2568ka.mo9451ri(interfaceC2552ri, i);
            }
            c2567ik = this.f7206lr;
            if (c2567ik != null && interfaceC2552ri != null) {
                c2567ik.mo9451ri(interfaceC2552ri, i);
            }
        } else {
            c2567ik = this.f7206lr;
            if (c2567ik != null) {
                c2567ik.mo9451ri(interfaceC2552ri, i);
            }
        }
        throw th;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka
    /* JADX INFO: renamed from: ri */
    public synchronized boolean mo9452ri(int i, boolean z) {
        if (this.f7207ri.mo9452ri(i, z)) {
            C2547lr.m9244ri(C2557ka.f7082ka.hcw(), 1);
            return true;
        }
        if ((i != 1 && i != 2) || !this.f7206lr.mo9452ri(i, z)) {
            return false;
        }
        C2547lr.m9244ri(C2557ka.f7082ka.m9398oh(), 1);
        return true;
    }
}
