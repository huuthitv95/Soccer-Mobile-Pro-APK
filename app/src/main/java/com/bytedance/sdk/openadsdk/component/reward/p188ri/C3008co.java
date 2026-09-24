package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka;
import com.bytedance.sdk.openadsdk.component.reward.top.C3060ik;
import com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.co */
/* JADX INFO: loaded from: classes3.dex */
public class C3008co {

    /* JADX INFO: renamed from: di */
    private boolean f9309di;

    /* JADX INFO: renamed from: fi */
    private boolean f9310fi = false;

    /* JADX INFO: renamed from: ik */
    private final Activity f9311ik;

    /* JADX INFO: renamed from: ka */
    private final C3022ri f9312ka;

    /* JADX INFO: renamed from: lr */
    InterfaceC2469ka f9313lr;

    /* JADX INFO: renamed from: ri */
    C3060ik f9314ri;

    public C3008co(C3022ri c3022ri) {
        this.f9311ik = c3022ri.f9384ig;
        this.f9312ka = c3022ri;
    }

    /* JADX INFO: renamed from: fi */
    public void m11858fi() {
        C3060ik c3060ik;
        if (this.f9309di || (c3060ik = this.f9314ri) == null) {
            return;
        }
        c3060ik.setSkipInvisiable();
    }

    /* JADX INFO: renamed from: fi */
    public void m11859fi(boolean z) {
        C3060ik c3060ik;
        if (this.f9309di || (c3060ik = this.f9314ri) == null) {
            return;
        }
        c3060ik.setSkipEnable(z);
    }

    /* JADX INFO: renamed from: ik */
    public void m11860ik() {
        C3060ik c3060ik;
        if (this.f9309di || (c3060ik = this.f9314ri) == null) {
            return;
        }
        c3060ik.showSkipButton();
    }

    /* JADX INFO: renamed from: ik */
    public void m11861ik(boolean z) {
        C3060ik c3060ik;
        if (this.f9309di || (c3060ik = this.f9314ri) == null) {
            return;
        }
        c3060ik.setShowSound(z);
    }

    /* JADX INFO: renamed from: ka */
    public void m11862ka() {
        C3060ik c3060ik = this.f9314ri;
        if (c3060ik != null) {
            c3060ik.clickSkip();
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m11863ka(boolean z) {
        C3060ik c3060ik;
        if (this.f9309di || (c3060ik = this.f9314ri) == null) {
            return;
        }
        c3060ik.setShowSkip(z);
    }

    /* JADX INFO: renamed from: lr */
    public void m11864lr() {
        C3060ik c3060ik;
        if (this.f9309di || (c3060ik = this.f9314ri) == null) {
            return;
        }
        c3060ik.showCountDownText();
    }

    /* JADX INFO: renamed from: lr */
    public void m11865lr(boolean z) {
        C3060ik c3060ik = this.f9314ri;
        if (c3060ik != null) {
            c3060ik.setSoundMute(z);
        }
        InterfaceC2469ka interfaceC2469ka = this.f9313lr;
        if (interfaceC2469ka != null) {
            interfaceC2469ka.setSoundMute(z);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11866ri() {
        if (this.f9310fi) {
            return;
        }
        this.f9310fi = true;
        if (this.f9312ka.f9395pc != null) {
            this.f9314ri = this.f9312ka.f9395pc;
            this.f9309di = true;
        } else {
            this.f9314ri = (C3060ik) this.f9312ka.f9396pv.findViewById(slm.f13272gz);
        }
        C3060ik c3060ik = this.f9314ri;
        if (c3060ik != null) {
            c3060ik.m12212ri(this.f9312ka.f9389lr);
            if (this.f9312ka.f9389lr.m14576zz()) {
                m11873ri(false);
            } else {
                m11873ri(this.f9312ka.f9389lr.nlk());
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11867ri(int i) {
        View viewFindViewById;
        C3060ik c3060ik = this.f9314ri;
        if (c3060ik == null || c3060ik.getITopLayout() == null || i == 0 || (viewFindViewById = this.f9314ri.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i - (iArr[0] + viewFindViewById.getWidth());
        if (width < C3583qd.m16589lr(this.f9311ik, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin += C3583qd.m16589lr(this.f9311ik, 16.0f) - width;
            viewFindViewById.requestLayout();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11868ri(InterfaceC2469ka interfaceC2469ka) {
        this.f9313lr = interfaceC2469ka;
    }

    /* JADX INFO: renamed from: ri */
    public void m11869ri(InterfaceC3061lr interfaceC3061lr) {
        C3060ik c3060ik = this.f9314ri;
        if (c3060ik != null) {
            c3060ik.setListener(interfaceC3061lr);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11870ri(CharSequence charSequence) {
        C3060ik c3060ik;
        if (this.f9309di || (c3060ik = this.f9314ri) == null) {
            return;
        }
        c3060ik.setSkipText(charSequence);
    }

    /* JADX INFO: renamed from: ri */
    public void m11871ri(String str) {
        C3060ik c3060ik = this.f9314ri;
        if (c3060ik != null) {
            c3060ik.clickSound(str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11872ri(String str, CharSequence charSequence) {
        C3060ik c3060ik;
        if (this.f9309di || (c3060ik = this.f9314ri) == null) {
            return;
        }
        c3060ik.setTime(String.valueOf(str), charSequence);
    }

    /* JADX INFO: renamed from: ri */
    public void m11873ri(boolean z) {
        C3060ik c3060ik;
        if (this.f9309di || (c3060ik = this.f9314ri) == null) {
            return;
        }
        c3060ik.setShowDislike(z);
    }
}
