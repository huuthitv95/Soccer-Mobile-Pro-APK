package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.ory;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.p235ik.C3377ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3238ri extends C3192ik {

    /* JADX INFO: renamed from: di */
    protected String f10873di;

    /* JADX INFO: renamed from: fi */
    protected TTDislikeDialogAbstract f10874fi;

    /* JADX INFO: renamed from: ik */
    protected com.bytedance.sdk.openadsdk.core.model.wjv f10875ik;
    protected boolean jbs;

    /* JADX INFO: renamed from: ka */
    protected C3377ik f10876ka;

    /* JADX INFO: renamed from: lr */
    protected Context f10877lr;

    /* JADX INFO: renamed from: mj */
    protected int f10878mj;

    /* JADX INFO: renamed from: qt */
    protected boolean f10879qt;

    /* JADX INFO: renamed from: ri */
    private com.bytedance.sdk.openadsdk.p236ka.xha f10880ri;

    /* JADX INFO: renamed from: sf */
    protected String f10881sf;
    protected int xha;

    public AbstractC3238ri(Context context) {
        super(context);
        this.f10873di = "embeded_ad";
        this.jbs = true;
        this.f10879qt = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    protected String getDescription() {
        if (TextUtils.isEmpty(this.f10875ik.m14559xh())) {
            return !TextUtils.isEmpty(this.f10875ik.m14535tq()) ? this.f10875ik.m14535tq() : "";
        }
        return this.f10875ik.m14559xh();
    }

    protected String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10875ik;
        if (wjvVar == null) {
            return "";
        }
        if (wjvVar.tyz() == null || TextUtils.isEmpty(this.f10875ik.tyz().m14073lr())) {
            return !TextUtils.isEmpty(this.f10875ik.tpb()) ? this.f10875ik.tpb() : "";
        }
        return this.f10875ik.tyz().m14073lr();
    }

    public float getRealHeight() {
        return C3583qd.m16581ik(this.f10877lr, this.f10878mj);
    }

    public float getRealWidth() {
        return C3583qd.m16581ik(this.f10877lr, this.xha);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    protected String getTitle() {
        if (this.f10875ik.tyz() != null && !TextUtils.isEmpty(this.f10875ik.tyz().m14073lr())) {
            return this.f10875ik.tyz().m14073lr();
        }
        if (TextUtils.isEmpty(this.f10875ik.tpb())) {
            return !TextUtils.isEmpty(this.f10875ik.m14559xh()) ? this.f10875ik.m14559xh() : "";
        }
        return this.f10875ik.tpb();
    }

    protected C3120di getVideoView() {
        C3120di c3120di;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10875ik;
        if (wjvVar != null && this.f10877lr != null) {
            if (com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(wjvVar)) {
                try {
                    c3120di = new C3120di(this.f10877lr, this.f10875ik, this.f10873di, true, false, this.f10880ri);
                    c3120di.setVideoCacheUrl(this.f10881sf);
                    c3120di.setControllerStatusCallBack(new C3120di.lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ri.2
                        @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di.lr
                        /* JADX INFO: renamed from: ri */
                        public void mo12819ri(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    c3120di.setIsAutoPlay(this.jbs);
                    c3120di.m12815ri(this.f10879qt, "bannerGetVideoView");
                } catch (Throwable unused) {
                    c3120di = null;
                }
            } else {
                c3120di = null;
            }
            if (com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(this.f10875ik) && c3120di != null && c3120di.m12816ri(0L, true, false)) {
                return c3120di;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void mo13698ri() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f10874fi;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        C3377ik c3377ik = this.f10876ka;
        if (c3377ik != null) {
            c3377ik.mo14648ri();
        } else {
            TTDelegateActivity.m10599ri(this.f10875ik, (String) null);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m13699ri(View view) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10875ik;
        if (wjvVar == null || wjvVar.m14389eu() == null || view == null) {
            return;
        }
        m13700ri(view, this.f10875ik.m14540ud() == 1 && this.jbs);
    }

    /* JADX INFO: renamed from: ri */
    protected abstract void mo11556ri(View view, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar);

    /* JADX INFO: renamed from: ri */
    protected void m13700ri(View view, boolean z) {
        C3220lr c3220lr;
        if (view == null) {
            return;
        }
        if (z) {
            Context context = this.f10877lr;
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10875ik;
            String str = this.f10873di;
            c3220lr = new C3221ri(context, wjvVar, str, C3571ig.m16470ri(str));
        } else {
            Context context2 = this.f10877lr;
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f10875ik;
            String str2 = this.f10873di;
            c3220lr = new C3220lr(context2, wjvVar2, str2, C3571ig.m16470ri(str2));
        }
        view.setOnTouchListener(c3220lr);
        view.setOnClickListener(c3220lr);
        c3220lr.m13532ri(new InterfaceC3234lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ri.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3234lr
            /* JADX INFO: renamed from: ri */
            public void mo13683ri(View view2, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
                AbstractC3238ri.this.mo11556ri(view2, i, slmVar);
            }
        });
    }

    public void setDislikeInner(ory oryVar) {
        if (oryVar instanceof C3377ik) {
            this.f10876ka = (C3377ik) oryVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        if (tTDislikeDialogAbstract != null && (wjvVar = this.f10875ik) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(wjvVar.yjg(), this.f10875ik.m14409ib());
        }
        this.f10874fi = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }
}
