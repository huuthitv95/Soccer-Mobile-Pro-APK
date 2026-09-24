package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.advanced.middle.C12661c;

/* JADX INFO: loaded from: classes4.dex */
public class MBOutNativeAdvancedViewGroup extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private C12661c f33604a;

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup$a */
    class RunnableC12679a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f33605a;

        RunnableC12679a(int i) {
            this.f33605a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBOutNativeAdvancedViewGroup.this.f33604a != null) {
                MBOutNativeAdvancedViewGroup.this.f33604a.m34524i(this.f33605a);
            }
        }
    }

    public MBOutNativeAdvancedViewGroup(Context context) {
        super(context);
    }

    public MBOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    private void m34592a(int i) {
        postDelayed(new RunnableC12679a(i), 200L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f33604a != null) {
            m34592a(1);
            if (getVisibility() == 0) {
                m34592a(2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C12661c c12661c = this.f33604a;
        if (c12661c != null) {
            c12661c.m34521f(1);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m34592a(2);
            if (getParent() != null) {
                m34592a(1);
                return;
            }
            return;
        }
        C12661c c12661c = this.f33604a;
        if (c12661c != null) {
            c12661c.m34521f(2);
        }
    }

    public void setProvider(C12661c c12661c) {
        this.f33604a = c12661c;
    }
}
