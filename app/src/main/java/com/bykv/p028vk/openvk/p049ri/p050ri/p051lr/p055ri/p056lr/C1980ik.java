package com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p056lr;

import android.content.Context;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ri.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C1980ik {

    /* JADX INFO: renamed from: ri */
    public static final ConcurrentHashMap<String, C1981lr> f4565ri = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: ri */
    public static synchronized void m6221ri(Context context, C1996ik c1996ik, InterfaceC1994ri.ri riVar) {
        if (c1996ik == null) {
            return;
        }
        ConcurrentHashMap<String, C1981lr> concurrentHashMap = f4565ri;
        C1981lr c1981lr = concurrentHashMap.get(c1996ik.m6302bu());
        if (c1981lr == null) {
            c1981lr = new C1981lr(context, c1996ik);
            concurrentHashMap.put(c1996ik.m6302bu(), c1981lr);
            Integer.valueOf(c1996ik.m6304di());
            c1996ik.m6302bu();
        }
        c1981lr.m6241ri(riVar);
        Integer.valueOf(c1996ik.m6304di());
        c1996ik.m6302bu();
    }

    /* JADX INFO: renamed from: ri */
    public static synchronized void m6222ri(C1996ik c1996ik) {
        C1981lr c1981lrRemove = f4565ri.remove(c1996ik.m6302bu());
        if (c1981lrRemove != null) {
            c1981lrRemove.m6242ri(true);
        }
        Integer.valueOf(c1996ik.m6304di());
        c1996ik.m6302bu();
    }
}
