package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3072mj extends C3192ik {

    /* JADX INFO: renamed from: ri */
    private final C3022ri f9639ri;

    public C3072mj(C3022ri c3022ri) {
        super(c3022ri.srn);
        this.f9639ri = c3022ri;
        if (c3022ri.ajz != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    /* JADX INFO: renamed from: ri */
    private void m12294ri(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12295ri(AbstractC2998lr abstractC2998lr) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutXha;
        abstractC2998lr.mo11721ri(this);
        if (this.f9639ri.f9400ri != 1 && (rFEndCardBackUpLayoutXha = abstractC2998lr.xha()) != null) {
            addView(rFEndCardBackUpLayoutXha, new FrameLayout.LayoutParams(-1, -1));
        }
        m12294ri(abstractC2998lr.m11745mj(), this);
        m12294ri(abstractC2998lr.jbs(), this);
    }
}
