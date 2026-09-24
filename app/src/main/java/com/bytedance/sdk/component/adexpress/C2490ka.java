package com.bytedance.sdk.component.adexpress;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2490ka {
    /* JADX INFO: renamed from: ik */
    public static int m8808ik() {
        return C2531ri.m9163ri().m9166ik().mo9146co();
    }

    /* JADX INFO: renamed from: ka */
    public static int m8809ka() {
        InterfaceC2528ik interfaceC2528ikM9166ik = C2531ri.m9163ri().m9166ik();
        if (interfaceC2528ikM9166ik == null) {
            return 0;
        }
        return interfaceC2528ikM9166ik.mo9153nr();
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m8810lr() {
        InterfaceC2528ik interfaceC2528ikM9166ik = C2531ri.m9163ri().m9166ik();
        return interfaceC2528ikM9166ik != null && interfaceC2528ikM9166ik.jbs() == 1;
    }

    /* JADX INFO: renamed from: ri */
    public static Context m8811ri() {
        if (C2531ri.m9163ri().m9166ik() == null) {
            return null;
        }
        return C2531ri.m9163ri().m9166ik().mo9151lr();
    }
}
