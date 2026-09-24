package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.top.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3060ik extends View implements InterfaceC3062ri<C3060ik> {

    /* JADX INFO: renamed from: ri */
    private InterfaceC3062ri<C3060ik> f9580ri;

    public C3060ik(Context context) {
        this(context, null);
    }

    public C3060ik(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3060ik(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: ri */
    private void m12211ri(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(slm.f13322zz);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void clickSkip() {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void clickSound(String str) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.clickSound(str);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public View getCloseButton() {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            return interfaceC3062ri.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.f9580ri;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: ri */
    public C3060ik m12212ri(wjv wjvVar) {
        if (this.f9580ri == null) {
            TopLayoutDislike2 topLayoutDislike2Load = new TopLayoutDislike2(getContext()).load(wjvVar);
            this.f9580ri = topLayoutDislike2Load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                m12211ri(topLayoutDislike2Load, (ViewGroup) parent);
            }
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setCountDownFor1InN(CharSequence charSequence, int i) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setCountDownFor1InN(charSequence, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setListener(InterfaceC3061lr interfaceC3061lr) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setListener(interfaceC3061lr);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowDislike(boolean z) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setShowDislike(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowEndCardNextAd(boolean z, wjv wjvVar) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setShowEndCardNextAd(z, wjvVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowPlayableNextAd(boolean z, wjv wjvVar) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setShowPlayableNextAd(z, wjvVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowSkip(boolean z) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setShowSkip(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowSound(boolean z) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setShowSound(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setSkipEnable(boolean z) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setSkipEnable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setSkipInvisiable() {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setSkipText(CharSequence charSequence) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setSoundMute(boolean z) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void showCloseButton() {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void showCountDownText() {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void showSkipButton() {
        InterfaceC3062ri<C3060ik> interfaceC3062ri = this.f9580ri;
        if (interfaceC3062ri != null) {
            interfaceC3062ri.showSkipButton();
        }
    }
}
