package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p207ka.C3156lr;
import com.bytedance.sdk.openadsdk.core.p200co.p215mj.C3180ri;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3187lr;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3188ri;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C3004aw {

    /* JADX INFO: renamed from: aw */
    private AbstractViewOnTouchListenerC2318ik f9266aw;
    private AbstractViewOnTouchListenerC2318ik bgr;

    /* JADX INFO: renamed from: bu */
    private boolean f9267bu;

    /* JADX INFO: renamed from: di */
    private volatile long f9269di;

    /* JADX INFO: renamed from: ik */
    private FrameLayout f9271ik;
    private String jbs;

    /* JADX INFO: renamed from: lr */
    private final C3022ri f9273lr;

    /* JADX INFO: renamed from: mj */
    private volatile long f9274mj;

    /* JADX INFO: renamed from: ri */
    final wjv f9276ri;
    private volatile long xha;

    /* JADX INFO: renamed from: ka */
    private final AtomicBoolean f9272ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fi */
    private final AtomicBoolean f9270fi = new AtomicBoolean(false);

    /* JADX INFO: renamed from: qt */
    private final AtomicBoolean f9275qt = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sf */
    private long f9277sf = 0;

    /* JADX INFO: renamed from: co */
    private long f9268co = 0;

    /* JADX INFO: renamed from: vr */
    private String f9278vr = null;
    private boolean slm = false;

    public C3004aw(C3022ri c3022ri) {
        this.f9273lr = c3022ri;
        this.f9276ri = c3022ri.f9389lr;
        this.jbs = c3022ri.f9381fi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bgr() {
        C3180ri c3180riM14411ig;
        wjv wjvVar = this.f9276ri;
        if (wjvVar == null || (c3180riM14411ig = wjvVar.m14411ig()) == null) {
            return;
        }
        C3156lr c3156lr = new C3156lr(this.f9273lr.f9384ig, this.f9276ri, c3180riM14411ig, this.jbs, new InterfaceC3187lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.aw.3
            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik
            /* JADX INFO: renamed from: lr */
            public void mo11832lr(String str) {
                C3414ik.m15560ri(C3004aw.this.f9276ri, true, C3004aw.this.jbs, "success", SystemClock.elapsedRealtime() - C3004aw.this.f9268co, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3187lr
            /* JADX INFO: renamed from: ri */
            public void mo11833ri() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3187lr
            /* JADX INFO: renamed from: ri */
            public void mo11834ri(int i, String str) {
                C3004aw.this.f9270fi.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik
            /* JADX INFO: renamed from: ri */
            public void mo11835ri(int i, String str, String str2) {
                C3004aw.this.f9270fi.set(false);
                C3414ik.m15560ri(C3004aw.this.f9276ri, true, C3004aw.this.jbs, C11744X3.g.f26257e, SystemClock.elapsedRealtime() - C3004aw.this.f9268co, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3187lr
            /* JADX INFO: renamed from: ri */
            public void mo11836ri(AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik) {
                C3004aw.this.bgr = abstractViewOnTouchListenerC2318ik;
                C3004aw.this.f9270fi.set(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik
            /* JADX INFO: renamed from: ri */
            public void mo11837ri(String str) {
                C3004aw.this.f9268co = SystemClock.elapsedRealtime();
            }
        });
        c3156lr.m13181ri(new InterfaceC3188ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.aw.4
            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3188ri
            /* JADX INFO: renamed from: lr */
            public void mo11838lr() {
                C3004aw.this.slm = true;
                C3004aw.this.f9273lr.dzy.mo12226qt().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3188ri
            /* JADX INFO: renamed from: ri */
            public String mo11839ri() {
                return "overlay";
            }
        });
        c3156lr.m13178ri();
        c3156lr.m13179ri(this.f9273lr.dzy.mo12226qt());
    }

    /* JADX INFO: renamed from: aw */
    public boolean m11820aw() {
        return this.f9270fi.get();
    }

    /* JADX INFO: renamed from: co */
    public boolean m11821co() {
        return this.f9272ka.get();
    }

    /* JADX INFO: renamed from: di */
    public void m11822di() {
        this.f9274mj = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: fi */
    public void m11823fi() {
        this.f9269di = SystemClock.elapsedRealtime();
        C3414ik.m15536ri(this.f9276ri, this.jbs);
    }

    /* JADX INFO: renamed from: ik */
    public void m11824ik() {
        C3180ri c3180riM14469pv;
        wjv wjvVar = this.f9276ri;
        if (wjvVar == null || (c3180riM14469pv = wjvVar.m14469pv()) == null) {
            return;
        }
        C3156lr c3156lr = new C3156lr(this.f9273lr.f9384ig, this.f9276ri, c3180riM14469pv, this.jbs, new InterfaceC3187lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.aw.1
            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik
            /* JADX INFO: renamed from: lr */
            public void mo11832lr(String str) {
                C3004aw.this.f9278vr = str;
                C3414ik.m15560ri(C3004aw.this.f9276ri, false, C3004aw.this.jbs, "success", SystemClock.elapsedRealtime() - C3004aw.this.f9277sf, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3187lr
            /* JADX INFO: renamed from: ri */
            public void mo11833ri() {
                C3004aw.this.m11823fi();
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3187lr
            /* JADX INFO: renamed from: ri */
            public void mo11834ri(int i, String str) {
                C3004aw.this.f9272ka.set(false);
                C3414ik.m15545ri(C3004aw.this.f9276ri, C3004aw.this.jbs, SystemClock.elapsedRealtime() - C3004aw.this.f9269di, i, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik
            /* JADX INFO: renamed from: ri */
            public void mo11835ri(int i, String str, String str2) {
                C3004aw.this.f9278vr = str2;
                C3004aw.this.f9272ka.set(false);
                C3414ik.m15560ri(C3004aw.this.f9276ri, false, C3004aw.this.jbs, C11744X3.g.f26257e, SystemClock.elapsedRealtime() - C3004aw.this.f9277sf, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3187lr
            /* JADX INFO: renamed from: ri */
            public void mo11836ri(AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik) {
                C3004aw.this.f9266aw = abstractViewOnTouchListenerC2318ik;
                C3004aw.this.f9272ka.set(true);
                C3004aw.this.xha = SystemClock.elapsedRealtime();
                if (C3004aw.this.f9273lr.ory.m12072ac()) {
                    View viewMo12226qt = C3004aw.this.f9273lr.dzy.mo12226qt();
                    if (viewMo12226qt instanceof C3193ka) {
                        ((C3193ka) viewMo12226qt).setImageResource(C2729uq.m10305ka(C3004aw.this.f9273lr.srn, "tt_skip_btn"));
                    }
                }
                C3004aw.this.bgr();
                C3004aw.this.jbs();
                C3414ik.m15543ri(C3004aw.this.f9276ri, C3004aw.this.jbs, C3004aw.this.xha - C3004aw.this.f9269di);
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik
            /* JADX INFO: renamed from: ri */
            public void mo11837ri(String str) {
                C3004aw.this.f9277sf = SystemClock.elapsedRealtime();
            }
        });
        if (this.f9276ri.m14411ig() != null) {
            c3156lr.m13181ri(new InterfaceC3188ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.aw.2
                @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3188ri
                /* JADX INFO: renamed from: lr */
                public void mo11838lr() {
                }

                @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3188ri
                /* JADX INFO: renamed from: ri */
                public String mo11839ri() {
                    return Constants.NORMAL;
                }
            });
        }
        c3156lr.m13178ri();
        c3156lr.m13179ri(this.f9273lr.dzy.mo12226qt());
    }

    public void jbs() {
        if (this.f9274mj <= 0 || this.xha <= 0 || this.f9275qt.getAndSet(true)) {
            return;
        }
        C3414ik.m15516lr(this.xha - this.f9274mj, this.f9276ri, this.jbs, this.f9278vr);
    }

    /* JADX INFO: renamed from: ka */
    public boolean m11825ka() {
        return this.slm;
    }

    /* JADX INFO: renamed from: lr */
    void m11826lr() {
        this.f9271ik = (FrameLayout) this.f9273lr.f9396pv.findViewById(slm.f13257bu);
    }

    /* JADX INFO: renamed from: mj */
    public void m11827mj() {
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.bgr;
        if (abstractViewOnTouchListenerC2318ik != null) {
            this.f9271ik.addView(abstractViewOnTouchListenerC2318ik.m7879sf(), new FrameLayout.LayoutParams(this.bgr.m7857pv(), this.bgr.m7842ig()));
        }
    }

    /* JADX INFO: renamed from: qt */
    public void m11828qt() {
        C3414ik.m15507ik(this.f9276ri, this.jbs);
    }

    /* JADX INFO: renamed from: ri */
    public void m11829ri() {
        if (this.f9267bu) {
            return;
        }
        this.f9267bu = true;
        m11826lr();
    }

    /* JADX INFO: renamed from: ri */
    public void m11830ri(int i) {
        C3583qd.m16612ri((View) this.f9271ik, i);
    }

    /* JADX INFO: renamed from: sf */
    public void m11831sf() {
        C3414ik.m15530ri(SystemClock.elapsedRealtime() - this.f9274mj, this.f9276ri, this.jbs);
    }

    public void xha() {
        m11828qt();
        jbs();
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.f9266aw;
        if (abstractViewOnTouchListenerC2318ik != null) {
            this.f9271ik.addView(abstractViewOnTouchListenerC2318ik.m7879sf(), new FrameLayout.LayoutParams(this.f9266aw.m7857pv(), this.f9266aw.m7842ig()));
        }
    }
}
