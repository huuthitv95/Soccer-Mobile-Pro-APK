package com.bytedance.sdk.component.p130di.p131ri;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2548ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.p139lr.HandlerThreadC2559ik;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.C2577fi;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2549ka {

    /* JADX INFO: renamed from: ri */
    public static final C2549ka f7064ri = new C2549ka();

    /* JADX INFO: renamed from: lr */
    private void m9272lr(InterfaceC2552ri interfaceC2552ri) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2552ri == null || interfaceC2540fiM9549vr == null || xha.m9524di().m9528fi() == null || interfaceC2540fiM9549vr.mo9218ka() == null) {
            return;
        }
        xha.m9524di().m9541ri(interfaceC2552ri);
    }

    /* JADX INFO: renamed from: lr */
    private void m9273lr(C2564ri c2564ri, Context context) {
        C2546ik.m9242ri(context, "context == null");
        C2546ik.m9242ri(c2564ri, "AdLogConfig == null");
        C2546ik.m9242ri(c2564ri.m9432ka(), "AdLogDepend ==null");
    }

    /* JADX INFO: renamed from: ri */
    private void m9274ri(C2564ri c2564ri) {
        Executor executorMo9215fi;
        if (Looper.myLooper() != Looper.getMainLooper() && C2548ri.m9257lr()) {
            C2548ri.m9262ri();
            return;
        }
        InterfaceC2540fi interfaceC2540fiM9432ka = c2564ri.m9432ka();
        if (interfaceC2540fiM9432ka == null || !C2548ri.m9257lr() || (executorMo9215fi = interfaceC2540fiM9432ka.mo9215fi()) == null) {
            return;
        }
        executorMo9215fi.execute(new Runnable() { // from class: com.bytedance.sdk.component.di.ri.ka.1
            @Override // java.lang.Runnable
            public void run() {
                C2548ri.m9262ri();
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public void m9275lr() {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr == null || xha.m9524di().m9528fi() == null || interfaceC2540fiM9549vr.mo9218ka() == null) {
            return;
        }
        xha.m9524di().m9536qt();
    }

    /* JADX INFO: renamed from: ri */
    public void m9276ri() {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr == null || xha.m9524di().m9528fi() == null || interfaceC2540fiM9549vr.mo9218ka() == null) {
            return;
        }
        xha.m9524di().m9535mj();
    }

    /* JADX INFO: renamed from: ri */
    public void m9277ri(InterfaceC2552ri interfaceC2552ri) {
        m9272lr(interfaceC2552ri);
    }

    /* JADX INFO: renamed from: ri */
    public void m9278ri(C2564ri c2564ri, Context context) {
        m9273lr(c2564ri, context);
        xha.m9524di().m9538ri(context);
        xha.m9524di().m9542ri(c2564ri.m9435qt());
        xha.m9524di().m9534lr(c2564ri.xha());
        xha.m9524di().m9531ik(c2564ri.m9434mj());
        xha.m9524di().m9540ri(c2564ri.m9433lr());
        xha.m9524di().m9532ka(c2564ri.jbs());
        xha.m9524di().m9529fi(c2564ri.m9429di());
        xha.m9524di().m9543ri(c2564ri.m9436ri() == null ? C2577fi.f7212ri : c2564ri.m9436ri());
        xha.m9524di().m9539ri(c2564ri.m9432ka());
        xha.m9524di().m9546ri(c2564ri.m9431ik());
        xha.m9524di().m9537ri(c2564ri.m9430fi());
        HandlerThreadC2559ik.m9348ri(c2564ri.m9428co());
        HandlerThreadC2559ik.m9341lr(c2564ri.m9437sf());
        m9274ri(c2564ri);
    }

    /* JADX INFO: renamed from: ri */
    public void m9279ri(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr == null || xha.m9524di().m9528fi() == null || interfaceC2540fiM9549vr.mo9218ka() == null || !interfaceC2540fiM9549vr.mo9221mj()) {
            return;
        }
        if (interfaceC2540fiM9549vr.mo9214di() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (interfaceC2540fiM9549vr.mo9214di() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        xha.m9524di().m9544ri(str, list, z, map, i, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m9280ri(String str, boolean z) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr == null || xha.m9524di().m9528fi() == null || interfaceC2540fiM9549vr.mo9218ka() == null || !interfaceC2540fiM9549vr.mo9221mj()) {
            return;
        }
        if (interfaceC2540fiM9549vr.mo9214di() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        xha.m9524di().m9545ri(str, z);
    }

    /* JADX INFO: renamed from: ri */
    public void m9281ri(boolean z) {
        xha.m9524di().m9546ri(z);
    }
}
