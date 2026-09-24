package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.InterfaceC2437mj;
import com.bytedance.sdk.component.adexpress.dynamic.p121ri.C2482ri;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3229di extends C2482ri {

    /* JADX INFO: renamed from: ik */
    private final AbstractRunnableC2676ik f10809ik;

    /* JADX INFO: renamed from: ka */
    private final Runnable f10810ka;

    /* JADX INFO: renamed from: lr */
    private com.bytedance.sdk.component.adexpress.p125lr.xha f10811lr;

    /* JADX INFO: renamed from: ri */
    private final C2500aw f10812ri;

    public C3229di(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, InterfaceC2437mj interfaceC2437mj, C2500aw c2500aw, InterfaceC2404ri interfaceC2404ri) {
        super(context, themeStatusBroadcastReceiver, z, interfaceC2437mj, c2500aw, interfaceC2404ri);
        this.f10809ik = new AbstractRunnableC2676ik("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.jbs.di.1
            @Override // java.lang.Runnable
            public void run() {
                C3229di.this.f10812ri.m8883ik();
                C3332vr.m14976ik().post(C3229di.this.f10810ka);
            }
        };
        this.f10810ka = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.di.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3229di.this.f10811lr != null) {
                    C3229di c3229di = C3229di.this;
                    C3229di.super.mo8759ri(c3229di.f10811lr);
                }
            }
        };
        this.f10812ri = c2500aw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p121ri.C2482ri
    /* JADX INFO: renamed from: lr */
    public void mo8754lr() {
        super.mo8754lr();
        C3332vr.m14976ik().removeCallbacks(this.f10810ka);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p121ri.C2482ri, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ri */
    public void mo8759ri(com.bytedance.sdk.component.adexpress.p125lr.xha xhaVar) {
        this.f10811lr = xhaVar;
        dzy.m16396ik((Runnable) this.f10809ik);
    }
}
