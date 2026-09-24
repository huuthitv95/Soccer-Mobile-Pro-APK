package com.bytedance.sdk.component.adexpress.p125lr;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka;
import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.InterfaceC2437mj;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.xha;
import com.bytedance.sdk.component.adexpress.dynamic.p121ri.C2482ri;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2506lr implements InterfaceC2508qt {

    /* JADX INFO: renamed from: di */
    private int f6948di;

    /* JADX INFO: renamed from: fi */
    private C2500aw f6949fi;

    /* JADX INFO: renamed from: ik */
    private ThemeStatusBroadcastReceiver f6950ik;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2507mj f6951ka;

    /* JADX INFO: renamed from: lr */
    private C2482ri f6952lr;

    /* JADX INFO: renamed from: ri */
    private Context f6953ri;

    public C2506lr(Context context, C2500aw c2500aw, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, InterfaceC2437mj interfaceC2437mj, InterfaceC2507mj interfaceC2507mj, InterfaceC2404ri interfaceC2404ri, C2482ri c2482ri) {
        this.f6953ri = context;
        this.f6949fi = c2500aw;
        this.f6950ik = themeStatusBroadcastReceiver;
        this.f6951ka = interfaceC2507mj;
        if (c2482ri != null) {
            this.f6952lr = c2482ri;
        } else {
            this.f6952lr = new C2482ri(this.f6953ri, this.f6950ik, z, interfaceC2437mj, this.f6949fi, interfaceC2404ri);
        }
        this.f6952lr.m8758ri(this.f6951ka);
        if (interfaceC2437mj instanceof xha) {
            this.f6948di = 3;
        } else {
            this.f6948di = 2;
        }
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC2469ka m9001lr() {
        C2482ri c2482ri = this.f6952lr;
        if (c2482ri != null) {
            return c2482ri.m8753ka();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt
    /* JADX INFO: renamed from: ri */
    public void mo8978ri() {
        C2482ri c2482ri = this.f6952lr;
        if (c2482ri != null) {
            c2482ri.mo8754lr();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt
    /* JADX INFO: renamed from: ri */
    public boolean mo8980ri(final InterfaceC2508qt.ri riVar) {
        this.f6949fi.m8881fi().mo8994ri(this.f6948di);
        this.f6952lr.mo8759ri(new xha() { // from class: com.bytedance.sdk.component.adexpress.lr.lr.1
            @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
            /* JADX INFO: renamed from: ri */
            public void mo8981ri(int i, String str) {
                C2506lr.this.f6949fi.m8881fi().mo8995ri(C2506lr.this.f6948di, i, str, riVar.mo8972lr(C2506lr.this));
                if (riVar.mo8972lr(C2506lr.this)) {
                    riVar.mo8974ri(C2506lr.this);
                    return;
                }
                InterfaceC2513vr interfaceC2513vrMo8971lr = riVar.mo8971lr();
                if (interfaceC2513vrMo8971lr == null) {
                    return;
                }
                interfaceC2513vrMo8971lr.mo9010a_(i);
            }

            @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
            /* JADX INFO: renamed from: ri */
            public void mo8982ri(View view, bgr bgrVar) {
                if (riVar.mo8970ik()) {
                    return;
                }
                C2506lr.this.f6949fi.m8881fi().mo8988fi(C2506lr.this.f6948di);
                C2506lr.this.f6949fi.m8881fi().mo8986di(C2506lr.this.f6948di);
                C2506lr.this.f6949fi.m8881fi().jbs();
                InterfaceC2513vr interfaceC2513vrMo8971lr = riVar.mo8971lr();
                if (interfaceC2513vrMo8971lr == null) {
                    return;
                }
                interfaceC2513vrMo8971lr.mo9011ri(C2506lr.this.f6952lr, bgrVar);
                riVar.mo8976ri(true);
            }
        });
        return true;
    }
}
