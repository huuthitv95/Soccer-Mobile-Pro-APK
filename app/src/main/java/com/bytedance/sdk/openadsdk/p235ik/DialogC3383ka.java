package com.bytedance.sdk.openadsdk.p235ik;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.ka */
/* JADX INFO: loaded from: classes3.dex */
public class DialogC3383ka extends TTDislikeDialogAbstract {

    /* JADX INFO: renamed from: ka */
    private ri f12031ka;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.ka$ri */
    public interface ri {
        /* JADX INFO: renamed from: lr */
        void mo15290lr();

        /* JADX INFO: renamed from: ri */
        void mo15291ri();

        /* JADX INFO: renamed from: ri */
        void mo15292ri(int i, FilterWord filterWord);
    }

    public DialogC3383ka(Context context, String str, List<FilterWord> list) {
        super(context, C2729uq.m10301di(context, "tt_dislikeDialog"));
        this.f7919ri = str;
        this.f7918lr = list;
    }

    /* JADX INFO: renamed from: lr */
    private void m15305lr() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.ik.ka.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (DialogC3383ka.this.f12031ka != null) {
                    ri unused = DialogC3383ka.this.f12031ka;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.ik.ka.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (DialogC3383ka.this.f12031ka != null) {
                    DialogC3383ka.this.f12031ka.mo15290lr();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m15307ri() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(C3583qd.m16580ik(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new jbs(getContext(), this.f7916ik, this.f7918lr);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            m15307ri();
            m15305lr();
            setMaterialMeta(this.f7919ri, this.f7918lr);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p235ik.C3386qt.lr
    /* JADX INFO: renamed from: ri */
    public void mo11275ri(int i) {
        FilterWord filterWordM15323lr;
        if (C3386qt.f12039ik == i) {
            dismiss();
            return;
        }
        if (C3386qt.f12038fi == i) {
            ri riVar = this.f12031ka;
            if (riVar != null) {
                riVar.mo15291ri();
                return;
            }
            return;
        }
        if (C3386qt.f12041lr != i || (filterWordM15323lr = this.f7916ik.m15323lr()) == null || C3386qt.f12042ri.equals(filterWordM15323lr)) {
            return;
        }
        ri riVar2 = this.f12031ka;
        if (riVar2 != null) {
            try {
                riVar2.mo15292ri(0, filterWordM15323lr);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    /* JADX INFO: renamed from: ri */
    public void m15308ri(ri riVar) {
        this.f12031ka = riVar;
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
