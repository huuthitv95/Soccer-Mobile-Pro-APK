package com.bytedance.sdk.openadsdk.core.jbs;

import android.view.View;
import com.bytedance.sdk.component.adexpress.p125lr.AbstractC2509ri;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class ihz extends AbstractC2509ri<AbstractC3238ri> {

    /* JADX INFO: renamed from: di */
    private final C2500aw f10832di;

    /* JADX INFO: renamed from: fi */
    private com.bytedance.sdk.component.adexpress.p125lr.xha f10833fi;

    /* JADX INFO: renamed from: ik */
    private final View f10834ik;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2504ik f10835ka;

    /* JADX INFO: renamed from: lr */
    private AbstractC3238ri f10836lr;

    /* JADX INFO: renamed from: ri */
    AtomicBoolean f10837ri = new AtomicBoolean(false);

    public ihz(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, C2500aw c2500aw) {
        this.f10834ik = view;
        this.f10832di = c2500aw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m13649lr() {
        if (this.f10837ri.get()) {
            return;
        }
        InterfaceC2504ik interfaceC2504ik = this.f10835ka;
        if (interfaceC2504ik == null || !interfaceC2504ik.mo8984ri((C3222ac) this.f10834ik, 0)) {
            this.f10833fi.mo8981ri(107, "backup false");
            return;
        }
        this.f10832di.m8881fi().mo8985di();
        AbstractC3238ri abstractC3238ri = (AbstractC3238ri) this.f10834ik.findViewWithTag("tt_express_backup_fl_tag_26");
        this.f10836lr = abstractC3238ri;
        if (abstractC3238ri == null) {
            this.f10833fi.mo8981ri(107, "backupview is null");
            return;
        }
        com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.p125lr.bgr();
        AbstractC3238ri abstractC3238ri2 = this.f10836lr;
        float realWidth = abstractC3238ri2 == null ? 0.0f : abstractC3238ri2.getRealWidth();
        AbstractC3238ri abstractC3238ri3 = this.f10836lr;
        float realHeight = abstractC3238ri3 != null ? abstractC3238ri3.getRealHeight() : 0.0f;
        bgrVar.m8968ri(true);
        bgrVar.m8963ri(realWidth);
        bgrVar.m8955lr(realHeight);
        this.f10833fi.mo8982ri(this.f10836lr, bgrVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public AbstractC3238ri mo8751fi() {
        return this.f10836lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.AbstractC2509ri
    /* JADX INFO: renamed from: ri */
    public void mo9003ri(InterfaceC2504ik interfaceC2504ik) {
        this.f10835ka = interfaceC2504ik;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ri */
    public void mo8759ri(com.bytedance.sdk.component.adexpress.p125lr.xha xhaVar) {
        this.f10833fi = xhaVar;
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ihz.1
            @Override // java.lang.Runnable
            public void run() {
                ihz.this.m13649lr();
            }
        });
    }
}
