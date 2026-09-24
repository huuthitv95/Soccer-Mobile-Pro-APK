package com.bytedance.sdk.component.p130di.p131ri.p134ik;

import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2547lr {
    /* JADX INFO: renamed from: ri */
    public static void m9244ri(AtomicLong atomicLong, int i) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr == null || !interfaceC2540fiM9549vr.xha() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
