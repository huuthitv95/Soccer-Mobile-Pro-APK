package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import android.content.Context;
import com.bytedance.sdk.component.p130di.p131ri.C2555lr;
import com.bytedance.sdk.component.p130di.p131ri.C2564ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri.C2554ri;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3430ri;
import com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3524ik;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3435lr {

    /* JADX INFO: renamed from: ri */
    public static AtomicInteger f12452ri = new AtomicInteger(0);

    /* JADX INFO: renamed from: lr */
    public static final AtomicBoolean f12451lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ik */
    public static void m15664ik() {
        try {
            C2555lr.m9309ka();
            C2555lr.m9307fi();
        } catch (Throwable th) {
            C2707ac.m10196ik("AdLogSwitchUtils", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m15665lr() {
        C2555lr.m9308ik();
    }

    /* JADX INFO: renamed from: ri */
    public static InterfaceC3524ik m15666ri() {
        return C3436mj.f12456ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m15667ri(Context context) {
        try {
            if (f12451lr.compareAndSet(false, true)) {
                C2555lr.m9313ri(new C2564ri.ri().m9445ri(new C3431di()).m9440lr(C2551ri.m9295ik()).m9438ik(C2551ri.m9294fi()).m9444ri(C2551ri.m9296ka()).m9443ri(new xha()).m9446ri(C3434ka.f12449ri).m9439lr(C3299nr.m14639ka().bgr()).m9441ri(C3299nr.m14639ka().m14889vr()).m9442ri(C3299nr.m14639ka().m14849id()).m9447ri(), context);
                m15665lr();
            }
        } catch (Throwable unused) {
            f12451lr.set(false);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15668ri(C3430ri c3430ri) {
        C2554ri c2554ri = new C2554ri(c3430ri.m15631fi(), c3430ri);
        c2554ri.m9302ik(c3430ri.m15630di() ? (byte) 1 : (byte) 2);
        c2554ri.m9303lr((byte) 0);
        if (C2555lr.m9310lr()) {
            m15667ri(C3299nr.m14642ri());
        }
        C2555lr.m9312ri(c2554ri);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15669ri(String str) {
        m15670ri(str, false);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15670ri(String str, boolean z) {
        if (C2555lr.m9310lr()) {
            m15667ri(C3299nr.m14642ri());
        }
        C2555lr.m9316ri(str, z);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15671ri(final List<String> list, final int i, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3414ik.m15533ri(new AbstractRunnableC2676ik("track") { // from class: com.bytedance.sdk.openadsdk.ka.ri.lr.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2555lr.m9310lr()) {
                    C3435lr.m15667ri(C3299nr.m14642ri());
                }
                C2555lr.m9314ri(C3089aw.m12377ri(C3299nr.m14642ri()), list, true, i, str);
            }
        });
    }
}
