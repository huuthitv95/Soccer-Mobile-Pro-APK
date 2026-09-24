package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.C2858lr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.C3578lr;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2993lr {
    /* JADX INFO: renamed from: ri */
    public static void m11711ri(final wjv wjvVar, final boolean z, final boolean z2) {
        C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.lr.1
            @Override // java.lang.Runnable
            public void run() {
                wjv wjvVar2 = wjvVar;
                if (wjvVar2 == null || wjvVar2.m14367bl()) {
                    return;
                }
                try {
                    Context contextM14642ri = C3299nr.m14642ri();
                    AdSlot adSlotM14388eb = wjvVar.m14388eb();
                    if (adSlotM14388eb != null) {
                        boolean zM16535lr = C3578lr.m16535lr();
                        if (zM16535lr) {
                            if (z2) {
                                C2985bu.m11638ri(contextM14642ri).m11800ri(adSlotM14388eb.getCodeId(), wjvVar);
                            } else {
                                xha.m12322ri(contextM14642ri).m11800ri(adSlotM14388eb.getCodeId(), wjvVar);
                            }
                        } else if (z2) {
                            slm.m12192ri(contextM14642ri).m12204ri(adSlotM14388eb.getCodeId(), wjvVar);
                        } else {
                            C2987di.m11663ri(contextM14642ri).m11675ri(adSlotM14388eb.getCodeId(), wjvVar);
                        }
                        if (z) {
                            if (zM16535lr) {
                                if (z2) {
                                    C2985bu.m11638ri(contextM14642ri).m11793ri(adSlotM14388eb);
                                    return;
                                } else {
                                    xha.m12322ri(contextM14642ri).m11793ri(adSlotM14388eb);
                                    return;
                                }
                            }
                            if (z2) {
                                slm.m12192ri(contextM14642ri).m12202ri(adSlotM14388eb);
                            } else {
                                C2987di.m11663ri(contextM14642ri).m11673ri(adSlotM14388eb);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m11712ri(final C3022ri c3022ri) {
        C2858lr c2858lrM11008jc;
        int iM10947oh = 0;
        if (c3022ri == null) {
            return false;
        }
        if (c3022ri.ajz == null || c3022ri.ajz.m11008jc() == null) {
            c2858lrM11008jc = null;
        } else {
            c2858lrM11008jc = c3022ri.ajz.m11008jc();
            if (c2858lrM11008jc != null) {
                iM10947oh = c2858lrM11008jc.m10947oh();
            }
        }
        boolean zM13503ri = C3214ig.m13503ri(c3022ri.f9384ig, c3022ri.f9389lr, c3022ri.f9381fi, c3022ri.f9387ka ? 7 : 5, iM10947oh);
        if (zM13503ri) {
            if (c3022ri.f9389lr != null) {
                C3197dw.m13337ri().m13352ri(c3022ri.f9389lr, new C3197dw.lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.lr.2
                    @Override // com.bytedance.sdk.openadsdk.core.C3197dw.lr
                    /* JADX INFO: renamed from: ri */
                    public void mo11713ri() {
                        C3022ri c3022ri2 = c3022ri;
                        if (c3022ri2 == null || c3022ri2.f9397qd == null) {
                            return;
                        }
                        c3022ri.f9397qd.gcp();
                    }
                });
            }
            if (c2858lrM11008jc != null && c2858lrM11008jc.m10969su()) {
                c2858lrM11008jc.m10930dw();
            }
        }
        return zM13503ri;
    }
}
