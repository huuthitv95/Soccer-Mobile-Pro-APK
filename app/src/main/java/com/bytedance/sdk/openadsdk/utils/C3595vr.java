package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.model.C3278di;
import com.bytedance.sdk.openadsdk.core.model.C3298zf;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.oem.InterfaceC3488ri;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C3595vr implements InterfaceC3488ri {

    /* JADX INFO: renamed from: ik */
    private static boolean f13338ik;

    /* JADX INFO: renamed from: lr */
    private static C3022ri f13339lr;

    /* JADX INFO: renamed from: ri */
    private static final C3595vr f13340ri = new C3595vr();

    /* JADX INFO: renamed from: lr */
    public static void m16667lr() {
        f13338ik = true;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16668ri() {
        if (f13339lr == null) {
            return;
        }
        IPBroadcastReceiver iPBroadcastReceiverM15817ri = IPBroadcastReceiver.m15817ri(C3299nr.m14642ri(), f13339lr.f9389lr);
        if (iPBroadcastReceiverM15817ri != null) {
            iPBroadcastReceiverM15817ri.m15821ri();
        }
        f13339lr = null;
        f13338ik = false;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16669ri(C3022ri c3022ri) {
        C3298zf c3298zfM14562xz = c3022ri.f9389lr.m14562xz();
        if (c3298zfM14562xz != null) {
            if (c3298zfM14562xz.xha() || c3298zfM14562xz.m14630mj()) {
                f13339lr = c3022ri;
                IPBroadcastReceiver iPBroadcastReceiverM15817ri = IPBroadcastReceiver.m15817ri(c3022ri.srn, c3022ri.f9389lr);
                if (iPBroadcastReceiverM15817ri != null) {
                    iPBroadcastReceiverM15817ri.m15822ri(f13340ri);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oem.InterfaceC3488ri
    /* JADX INFO: renamed from: ri */
    public void mo15826ri(String str, final int i) {
        C3278di c3278diTyz;
        C3022ri c3022ri = f13339lr;
        if (c3022ri == null || (c3278diTyz = c3022ri.f9389lr.tyz()) == null) {
            return;
        }
        String strM14069ik = c3278diTyz.m14069ik();
        if (TextUtils.isEmpty(strM14069ik) || !strM14069ik.equals(str)) {
            return;
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.vr.1
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                if (C3595vr.f13339lr == null || (i2 = i) <= 0 || i2 > 5) {
                    return;
                }
                boolean z = true;
                boolean z2 = i2 == 1;
                if (C3595vr.f13338ik) {
                    C3595vr.f13339lr.f9397qd.gcp();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    C3414ik.m15563ri("click", C3595vr.f13339lr.f9389lr, new C3277co.ri().m14066ri(), C3595vr.f13339lr.f9381fi, true, (Map<String, Object>) map, 1);
                } else {
                    z = z2;
                }
                if (z) {
                    C3595vr.m16668ri();
                }
            }
        });
    }
}
