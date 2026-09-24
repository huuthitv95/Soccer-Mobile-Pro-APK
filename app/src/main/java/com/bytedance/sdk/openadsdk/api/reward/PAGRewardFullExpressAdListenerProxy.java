package com.bytedance.sdk.openadsdk.api.reward;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;

/* JADX INFO: loaded from: classes3.dex */
public class PAGRewardFullExpressAdListenerProxy implements PAGExpressAdWrapperListener {

    /* JADX INFO: renamed from: ri */
    private final PAGExpressAdWrapperListener f8593ri;

    /* JADX INFO: renamed from: lr */
    private boolean f8592lr = false;

    /* JADX INFO: renamed from: ik */
    private final Handler f8591ik = new Handler(Looper.getMainLooper());

    public PAGRewardFullExpressAdListenerProxy(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.f8593ri = pAGExpressAdWrapperListener;
    }

    /* JADX INFO: renamed from: lr */
    private void m11082lr(final Runnable runnable) {
        m11083ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.1
            @Override // java.lang.Runnable
            public void run() {
                if (!PAGRewardFullExpressAdListenerProxy.this.f8592lr && PAGRewardFullExpressAdListenerProxy.this.f8593ri != null) {
                    PAGRewardFullExpressAdListenerProxy.this.f8592lr = true;
                    runnable.run();
                } else {
                    Log.i("ExpressAdListenerProxy", "onRenderFail or onRenderSuccess has been called before mHasNotified = " + PAGRewardFullExpressAdListenerProxy.this.f8592lr);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m11083ri(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f8591ik.post(runnable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f8593ri;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f8593ri;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i) {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f8593ri;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdShow(view, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(final View view, final String str, final int i) {
        m11082lr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.2
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.f8593ri.onRenderFail(view, str, i);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(final View view, final float f, final float f2) {
        m11082lr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.3
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.f8593ri.onRenderSuccess(view, f, f2);
            }
        });
    }

    public void triggerUnfinishedFail(final View view) {
        m11082lr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.4
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.f8593ri.onRenderFail(view, BackupConstant.UNFINISHED_FAIL_MSG, BackupConstant.UNFINISHED_FAIL_CODE);
            }
        });
    }
}
