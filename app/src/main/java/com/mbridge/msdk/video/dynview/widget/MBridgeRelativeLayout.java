package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.moffer.InterfaceC13966b;
import com.mbridge.msdk.video.dynview.moffer.InterfaceC13968d;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private InterfaceC13968d f40118a;

    /* JADX INFO: renamed from: b */
    private boolean f40119b;

    /* JADX INFO: renamed from: c */
    private AnimatorSet f40120c;

    /* JADX INFO: renamed from: d */
    private boolean f40121d;

    /* JADX INFO: renamed from: e */
    private InterfaceC13966b f40122e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f40120c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        InterfaceC13968d interfaceC13968d;
        super.onDetachedFromWindow();
        if (!this.f40119b && (interfaceC13968d = this.f40118a) != null) {
            this.f40119b = true;
            interfaceC13968d.mo41787a();
        }
        AnimatorSet animatorSet = this.f40120c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        InterfaceC13966b interfaceC13966b;
        super.onVisibilityChanged(view, i);
        if (!(view instanceof MBridgeRelativeLayout) || i != 0 || (interfaceC13966b = this.f40122e) == null || this.f40121d) {
            return;
        }
        this.f40121d = true;
        interfaceC13966b.mo41786a();
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f40120c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(InterfaceC13966b interfaceC13966b) {
        this.f40122e = interfaceC13966b;
    }

    public void setMoreOfferShowFailedCallBack(InterfaceC13968d interfaceC13968d) {
        this.f40118a = interfaceC13968d;
    }
}
