package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.activity.single.C2853fi;
import com.bytedance.sdk.openadsdk.common.C2931bu;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3011ik {

    /* JADX INFO: renamed from: ik */
    private TTAdDislikeToast f9328ik;

    /* JADX INFO: renamed from: lr */
    private C2931bu f9329lr;

    /* JADX INFO: renamed from: ri */
    private final C3022ri f9330ri;

    public C3011ik(C3022ri c3022ri) {
        this.f9330ri = c3022ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public boolean m11903ik() {
        return this.f9330ri.qmx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m11905ka() {
        TTAdDislikeToast tTAdDislikeToast = this.f9328ik;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m11908lr(final AbstractC2998lr abstractC2998lr) {
        if (this.f9329lr == null) {
            C2931bu c2931bu = new C2931bu(this.f9330ri.f9384ig, this.f9330ri.f9389lr);
            this.f9329lr = c2931bu;
            c2931bu.setCallback(new C2931bu.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.ik.1
                @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                /* JADX INFO: renamed from: lr */
                public void mo10546lr(View view) {
                    C3011ik.this.f9330ri.f9399qt.set(false);
                    if (C3011ik.this.f9330ri.ihz.f9497fi) {
                        if (C3011ik.this.f9330ri.f9374ay != null) {
                            C3011ik.this.f9330ri.f9374ay.m12266ri(0, true);
                            return;
                        }
                        return;
                    }
                    C3011ik.this.f9330ri.ihz.m12156ri(abstractC2998lr);
                    if (C3011ik.this.f9330ri.ihz.jbs()) {
                        C3011ik.this.f9330ri.ihz.ihz();
                    }
                    if (C3011ik.this.m11903ik()) {
                        C3011ik.this.f9330ri.ajz.m11008jc().m10941lr(C3011ik.this.f9330ri.ajz, 1);
                    }
                    C2897ik.m11146ri(C3011ik.this.f9330ri.f9389lr, 4);
                    C3011ik.this.f9330ri.wjv.m11969ri(0);
                    C3011ik.this.f9330ri.wjv.m11958fi();
                    if (C3011ik.this.f9330ri.aac != null) {
                        C3011ik.this.f9330ri.aac.mo16372ri();
                    }
                    AbstractC2998lr abstractC2998lr2 = abstractC2998lr;
                    if (abstractC2998lr2 != null) {
                        abstractC2998lr2.m11741bu();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                /* JADX INFO: renamed from: ri */
                public void mo10547ri(View view) {
                    C3011ik.this.f9330ri.f9399qt.set(true);
                    String str = "landing_page";
                    if (!C3273ac.m13971lr(C3011ik.this.f9330ri.f9389lr) && !C3273ac.m13968ka(C3011ik.this.f9330ri.f9389lr) && !C3273ac.m13958di(C3011ik.this.f9330ri.f9389lr) && !C3273ac.xha(C3011ik.this.f9330ri.f9389lr)) {
                        if (!C3011ik.this.f9330ri.jbs.get()) {
                            str = "video_player";
                        } else if (C3279dw.m14092lr(C3011ik.this.f9330ri.f9389lr)) {
                            str = "playable";
                        } else if (!C3011ik.this.f9330ri.f9389lr.che()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    C3011ik.this.f9329lr.setDislikeSource(str);
                    if (C3011ik.this.f9330ri.ihz.f9497fi) {
                        if (C3011ik.this.f9330ri.f9374ay != null) {
                            C3011ik.this.f9330ri.f9374ay.m12266ri(8, false);
                            return;
                        }
                        return;
                    }
                    abstractC2998lr.bgr();
                    if (C3011ik.this.f9330ri.ihz.m12126di()) {
                        C3011ik.this.f9330ri.ihz.m12168uq();
                    }
                    if (C3011ik.this.m11903ik()) {
                        C3011ik.this.f9330ri.ajz.m11008jc().m10941lr(C3011ik.this.f9330ri.ajz, 2);
                    }
                    C2897ik.m11146ri(C3011ik.this.f9330ri.f9389lr, 8);
                    C3011ik.this.f9330ri.wjv.m11957di();
                    C3011ik.this.f9330ri.wjv.m11966mj();
                    if (C3011ik.this.f9330ri.aac != null) {
                        C3011ik.this.f9330ri.aac.mo16371lr();
                    }
                    if (C3011ik.this.f9330ri.jbs.get()) {
                        C3011ik.this.f9330ri.f9393nr.set(true);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                /* JADX INFO: renamed from: ri */
                public void mo10548ri(FilterWord filterWord) {
                    if (C3011ik.this.f9330ri.f9401sf.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    C3011ik.this.f9330ri.f9401sf.set(true);
                    if (C3011ik.this.f9330ri.ajz != null) {
                        C3011ik.this.f9330ri.ajz.m11008jc().m10935ik(true);
                    }
                    C3011ik.this.m11905ka();
                }
            });
            ((FrameLayout) this.f9330ri.f9384ig.findViewById(R.id.content)).addView(this.f9329lr);
        }
        if (this.f9328ik == null) {
            this.f9328ik = new TTAdDislikeToast(this.f9330ri.f9384ig);
            ((FrameLayout) this.f9330ri.f9384ig.findViewById(R.id.content)).addView(this.f9328ik);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m11910lr() {
        TTAdDislikeToast tTAdDislikeToast = this.f9328ik;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11911ri() {
        TTAdDislikeToast tTAdDislikeToast = this.f9328ik;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11912ri(AbstractC2998lr abstractC2998lr) {
        if (this.f9330ri.f9384ig.isFinishing()) {
            return;
        }
        boolean z = (this.f9330ri.ajz instanceof C2853fi) && ((C2853fi) this.f9330ri.ajz).f8283ri;
        if (this.f9330ri.f9401sf.get() || !(this.f9330ri.ajz == null || !this.f9330ri.ajz.m11008jc().igq() || z)) {
            if (this.f9328ik == null) {
                this.f9328ik = new TTAdDislikeToast(this.f9330ri.f9384ig);
                ((FrameLayout) this.f9330ri.f9384ig.findViewById(R.id.content)).addView(this.f9328ik);
            }
            this.f9328ik.show(TTAdDislikeToast.getDislikeTip());
            this.f9330ri.f9401sf.set(true);
            return;
        }
        if (this.f9329lr == null) {
            try {
                m11908lr(abstractC2998lr);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        C2931bu c2931bu = this.f9329lr;
        if (c2931bu != null) {
            c2931bu.m11274ri();
        }
    }
}
