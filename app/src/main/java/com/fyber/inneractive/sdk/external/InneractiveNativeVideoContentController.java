package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.AbstractC8221u0;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveNativeVideoContentController extends AbstractC8221u0 {

    /* JADX INFO: renamed from: a */
    public WeakReference f17930a;

    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8128j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) AbstractC9195v.m22024a(this.f17930a)) != null) {
            ((Renderer) this.f17930a.get()).pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) AbstractC9195v.m22024a(this.f17930a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.f17930a = new WeakReference(renderer);
    }
}
