package com.bytedance.sdk.component.p145fi.p146lr.p147ik;

import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.slm;
import com.bytedance.sdk.component.p145fi.tan;
import com.ironsource.C11744X3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2605ri<T> {

    /* JADX INFO: renamed from: lr */
    private tan f7345lr;

    /* JADX INFO: renamed from: ri */
    private C2600ik f7346ri;

    public C2605ri(C2600ik c2600ik, tan tanVar) {
        this.f7346ri = c2600ik;
        this.f7345lr = tanVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m9696ri(int i, String str, Throwable th) {
        try {
            tan tanVar = this.f7345lr;
            if (tanVar != null) {
                tanVar.mo9742ri(C11744X3.i.f26392t, this.f7346ri);
            }
            String strTan = this.f7346ri.tan();
            Map<String, List<C2600ik>> mapJbs = this.f7346ri.slm().jbs();
            List<C2600ik> list = mapJbs.get(strTan);
            if (list == null) {
                slm slmVarM9622di = this.f7346ri.m9622di();
                if (slmVarM9622di != null) {
                    slmVarM9622di.mo8254ri(i, str, th);
                }
            } else {
                synchronized (list) {
                    Iterator<C2600ik> it = list.iterator();
                    while (it.hasNext()) {
                        slm slmVarM9622di2 = it.next().m9622di();
                        if (slmVarM9622di2 != null) {
                            Objects.toString(slmVarM9622di2);
                            slmVarM9622di2.mo8254ri(i, str, th);
                        }
                    }
                    list.clear();
                    mapJbs.remove(strTan);
                }
            }
            tan tanVar2 = this.f7345lr;
            if (tanVar2 != null) {
                tanVar2.mo9741lr(C11744X3.i.f26392t, this.f7346ri);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9697ri(InterfaceC2630sf<T> interfaceC2630sf) {
        try {
            tan tanVar = this.f7345lr;
            if (tanVar != null) {
                tanVar.mo9742ri("success", this.f7346ri);
            }
            String strTan = this.f7346ri.tan();
            Map<String, List<C2600ik>> mapJbs = this.f7346ri.slm().jbs();
            List<C2600ik> list = mapJbs.get(strTan);
            if (list == null) {
                slm slmVarM9622di = this.f7346ri.m9622di();
                if (slmVarM9622di != null) {
                    Objects.toString(slmVarM9622di);
                    this.f7346ri.m9626mj();
                    slmVarM9622di.mo8255ri(interfaceC2630sf);
                }
            } else {
                synchronized (list) {
                    list.size();
                    for (C2600ik c2600ik : list) {
                        slm slmVarM9622di2 = c2600ik.m9622di();
                        if (slmVarM9622di2 != null) {
                            Objects.toString(slmVarM9622di2);
                            c2600ik.m9626mj();
                            slmVarM9622di2.mo8255ri(interfaceC2630sf);
                        }
                    }
                    list.clear();
                    mapJbs.remove(strTan);
                }
            }
            tan tanVar2 = this.f7345lr;
            if (tanVar2 != null) {
                tanVar2.mo9741lr("success", this.f7346ri);
            }
        } catch (Throwable unused) {
        }
    }
}
