package com.bytedance.sdk.component.p145fi.p146lr.p152lr;

import com.bytedance.sdk.component.p145fi.InterfaceC2593di;
import com.bytedance.sdk.component.p145fi.InterfaceC2595ik;
import com.bytedance.sdk.component.p145fi.InterfaceC2596ka;
import com.bytedance.sdk.component.p145fi.InterfaceC2597lr;
import com.bytedance.sdk.component.p145fi.InterfaceC2623nr;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2598di;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2600ik;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2605ri;
import com.bytedance.sdk.component.p145fi.p154ri.C2628lr;
import com.bytedance.sdk.component.p145fi.tan;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2616ik implements InterfaceC2614di {
    /* JADX INFO: renamed from: lr */
    private void m9723lr(final InterfaceC2597lr interfaceC2597lr, final C2598di c2598di, final String str, final byte[] bArr) {
        if (interfaceC2597lr == null || !interfaceC2597lr.xha()) {
            return;
        }
        c2598di.m9590mj().submit(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.lr.ik.1
            @Override // java.lang.Runnable
            public void run() {
                c2598di.m9585ik(interfaceC2597lr).mo9705ri(str, bArr);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m9724ri(InterfaceC2597lr interfaceC2597lr, C2598di c2598di, String str, byte[] bArr) {
        if (interfaceC2597lr == null || !interfaceC2597lr.mo9573di()) {
            return;
        }
        c2598di.m9588lr(interfaceC2597lr).mo9705ri(str, bArr);
    }

    /* JADX INFO: renamed from: ri */
    private byte[] m9725ri(C2598di c2598di, C2600ik c2600ik, C2605ri c2605ri) {
        InterfaceC2596ka interfaceC2596kaM9584fi = c2598di.m9584fi();
        c2600ik.m9631ri(false);
        try {
            InterfaceC2593di interfaceC2593diMo9572ri = interfaceC2596kaM9584fi.mo9572ri(new C2628lr(c2600ik.mo9571ri(), false, false, c2600ik.m9627nr()));
            if (interfaceC2593diMo9572ri == null) {
                c2605ri.m9696ri(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iMo9563ri = interfaceC2593diMo9572ri.mo9563ri();
            if (iMo9563ri != 200) {
                Object objMo9562lr = interfaceC2593diMo9572ri.mo9562lr();
                c2605ri.m9696ri(iMo9563ri, interfaceC2593diMo9572ri.mo9561ik(), objMo9562lr instanceof Throwable ? (Throwable) objMo9562lr : null);
                return null;
            }
            byte[] bArr = (byte[]) interfaceC2593diMo9572ri.mo9562lr();
            if (bArr == null) {
                c2605ri.m9696ri(iMo9563ri, interfaceC2593diMo9572ri.mo9561ik(), new Exception("net data is empty"));
                return null;
            }
            m9724ri(c2600ik.m9620bu(), c2598di, c2600ik.xha(), bArr);
            m9723lr(c2600ik.m9620bu(), c2598di, c2600ik.xha(), bArr);
            return bArr;
        } catch (Throwable th) {
            c2605ri.m9696ri(1004, "net request failed!", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private byte[] m9726ri(InterfaceC2597lr interfaceC2597lr, C2598di c2598di, String str) {
        c2598di.m9585ik(interfaceC2597lr);
        Collection<InterfaceC2595ik> collectionM9587ka = c2598di.m9587ka();
        if (collectionM9587ka == null) {
            return null;
        }
        Iterator<InterfaceC2595ik> it = collectionM9587ka.iterator();
        while (it.hasNext()) {
            byte[] bArrRi = it.next().mo9704ri(str);
            if (bArrRi != null) {
                return bArrRi;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public String mo9721ri() {
        return "data_intercept";
    }

    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public boolean mo9722ri(C2600ik c2600ik, tan tanVar, C2605ri c2605ri) {
        InterfaceC2597lr interfaceC2597lrM9620bu = c2600ik.m9620bu();
        C2598di c2598diSlm = c2600ik.slm();
        byte[] bArrM9725ri = null;
        if (interfaceC2597lrM9620bu != null && c2598diSlm != null) {
            if (interfaceC2597lrM9620bu.mo9573di()) {
                if (tanVar != null) {
                    tanVar.mo9742ri("data_cache", c2600ik);
                }
                InterfaceC2623nr interfaceC2623nrM9588lr = c2598diSlm.m9588lr(interfaceC2597lrM9620bu);
                bArrM9725ri = interfaceC2623nrM9588lr != null ? interfaceC2623nrM9588lr.mo9704ri(c2600ik.xha()) : null;
                if (tanVar != null) {
                    tanVar.mo9741lr("data_cache", c2600ik);
                }
                c2600ik.xha();
                c2600ik.mo9571ri();
                Boolean.valueOf(bArrM9725ri == null);
            }
            if (interfaceC2597lrM9620bu.xha() && bArrM9725ri == null) {
                if (tanVar != null) {
                    tanVar.mo9742ri("disk_cache", c2600ik);
                }
                byte[] bArrM9726ri = m9726ri(interfaceC2597lrM9620bu, c2598diSlm, c2600ik.xha());
                if (bArrM9726ri != null) {
                    m9724ri(c2600ik.m9620bu(), c2598diSlm, c2600ik.xha(), bArrM9726ri);
                }
                if (tanVar != null) {
                    tanVar.mo9741lr("disk_cache", c2600ik);
                }
                c2600ik.xha();
                c2600ik.mo9571ri();
                Boolean.valueOf(bArrM9726ri == null);
                bArrM9725ri = bArrM9726ri;
            }
        }
        if (c2598diSlm != null && bArrM9725ri == null) {
            if (tanVar != null) {
                tanVar.mo9742ri("net_request", c2600ik);
            }
            bArrM9725ri = m9725ri(c2598diSlm, c2600ik, c2605ri);
            c2600ik.xha();
            c2600ik.mo9571ri();
            Boolean.valueOf(bArrM9725ri == null);
            if (tanVar != null) {
                tanVar.mo9741lr("net_request", c2600ik);
            }
        }
        if (bArrM9725ri != null) {
            c2600ik.m9632ri(bArrM9725ri);
            return true;
        }
        c2600ik.xha();
        c2600ik.mo9571ri();
        Boolean.valueOf(bArrM9725ri == null);
        return false;
    }
}
