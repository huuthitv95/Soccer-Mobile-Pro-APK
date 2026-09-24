package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.C3506ri;
import com.bytedance.sdk.openadsdk.utils.C3577ka;

/* JADX INFO: loaded from: classes3.dex */
public class PAGVideoMediaView extends PAGMediaView implements C3221ri.ri {

    /* JADX INFO: renamed from: ik */
    private final C3506ri f8584ik;

    /* JADX INFO: renamed from: ka */
    private wjv f8585ka;

    /* JADX INFO: renamed from: lr */
    private C3120di f8586lr;

    public PAGVideoMediaView(Context context, View view, C3506ri c3506ri) {
        super(context);
        m11080ri(view);
        this.f8584ik = c3506ri;
    }

    /* JADX INFO: renamed from: lr */
    private boolean m11078lr() {
        C3120di c3120di = this.f8586lr;
        if (c3120di != null) {
            return c3120di.m12804aw();
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    private void m11079ri() {
        C3120di c3120di = this.f8586lr;
        if (c3120di != null) {
            c3120di.m12818vr();
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m11080ri(View view) {
        if (view instanceof C3120di) {
            C3120di c3120di = (C3120di) view;
            this.f8586lr = c3120di;
            addView(c3120di, -1, -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        C3120di c3120di = this.f8586lr;
        if (c3120di != null) {
            c3120di.slm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri.ri
    public long getVideoProgress() {
        C3120di c3120di = this.f8586lr;
        if (c3120di == null || c3120di.getNativeVideoController() == null) {
            return 0L;
        }
        return this.f8586lr.getNativeVideoController().mo6373di();
    }

    public void handleInterruptVideo() {
        if (m11078lr()) {
            return;
        }
        m11079ri();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3577ka.m16533ri(this, this.f8585ka);
    }

    public void setMaterialMeta(wjv wjvVar) {
        this.f8585ka = wjvVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof C3221ri) {
            ((C3221ri) onClickListener).m13546ri((C3221ri.ri) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        C3506ri c3506ri = this.f8584ik;
        if (c3506ri == null) {
            return;
        }
        c3506ri.m15891ri(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }
}
