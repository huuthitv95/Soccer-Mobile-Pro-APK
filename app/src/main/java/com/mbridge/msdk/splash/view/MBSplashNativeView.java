package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.shake.AbstractC13648b;
import com.mbridge.msdk.shake.C13647a;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.splash.common.C13651c;

/* JADX INFO: loaded from: classes7.dex */
public class MBSplashNativeView extends BaseMBSplashNativeView {

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.MBSplashNativeView$a */
    class ViewOnClickListenerC13696a implements View.OnClickListener {
        ViewOnClickListenerC13696a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBSplashNativeView.this.m40104a(0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.MBSplashNativeView$b */
    class C13697b extends AbstractC13648b {
        C13697b(int i, int i2) {
            super(i, i2);
        }

        @Override // com.mbridge.msdk.shake.AbstractC13648b
        /* JADX INFO: renamed from: a */
        public void mo36324a() {
            MBSplashNativeView mBSplashNativeView = MBSplashNativeView.this;
            if (mBSplashNativeView.f38417J || mBSplashNativeView.f38416I) {
                return;
            }
            mBSplashNativeView.m40104a(4);
            C13647a.m39776a().m39780b(this);
        }
    }

    public MBSplashNativeView(Context context) {
        super(context);
    }

    public MBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBSplashNativeView(Context context, MBSplashView mBSplashView, C13651c c13651c) {
        super(context, mBSplashView, c13651c);
    }

    @Override // com.mbridge.msdk.splash.view.BaseMBSplashNativeView
    /* JADX INFO: renamed from: b */
    protected void mo40105b() {
        if (this.f38450x == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f38422O = mBShakeView;
            mBShakeView.initView(this.f38421N.getAdCall());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f38422O.setLayoutParams(layoutParams);
            addView(this.f38422O);
            this.f38444r.setVisibility(4);
            this.f38444r.setEnabled(false);
            C13185b1.m37632a(this.f38422O, this.f38421N.getLocalRequestId(), this.f38421N.getLocalAllowTrackClick());
            this.f38422O.setOnClickListener(new ViewOnClickListenerC13696a());
            this.f38426S = new C13697b(this.f38451y, this.f38452z * 1000);
        }
    }

    @Override // com.mbridge.msdk.splash.view.BaseMBSplashNativeView
    /* JADX INFO: renamed from: e */
    protected void mo40106e() {
        this.f38439m.setVisibility(8);
    }
}
