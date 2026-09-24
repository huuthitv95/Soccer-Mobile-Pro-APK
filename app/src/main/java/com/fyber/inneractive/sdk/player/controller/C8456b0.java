package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.exoplayer2.C8667g;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C8754h;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.b0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8456b0 implements VideoRendererEventListener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f18822a;

    /* JADX INFO: renamed from: b */
    public boolean f18823b = false;

    public C8456b0(C8463f c8463f) {
        this.f18822a = new WeakReference(c8463f);
    }

    /* JADX INFO: renamed from: a */
    public final String m20854a() {
        C8463f c8463f = (C8463f) this.f18822a.get();
        return c8463f == null ? C8456b0.class.getName() : IAlog.m21943a(c8463f);
    }

    /* JADX INFO: renamed from: a */
    public final void m20855a(int i, boolean z) {
        C8667g c8667g;
        IAlog.m21945a("%sonPlayerStateChanged called with pwr = %s state = %d", m20854a(), Boolean.valueOf(z), Integer.valueOf(i));
        C8463f c8463f = (C8463f) this.f18822a.get();
        if (c8463f == null || (c8667g = c8463f.f18843s) == null || c8463f.f18850z) {
            return;
        }
        if (i != 3) {
            if (i == 2) {
                if (c8463f.f18871e == EnumC8489b.Playing) {
                    c8463f.m20907a(EnumC8489b.Buffering);
                    return;
                }
                return;
            } else {
                if (i == 4) {
                    c8463f.m20907a(EnumC8489b.Completed);
                    return;
                }
                return;
            }
        }
        if (z) {
            c8463f.m20907a(EnumC8489b.Playing);
            return;
        }
        if (c8463f.f18871e == EnumC8489b.Preparing) {
            C8754h c8754h = c8667g.f20140o;
            if (c8754h != null && c8754h.f20443a > 0) {
                AbstractC8748b abstractC8748b = c8754h.f20444b[0];
                C8708o c8708o = abstractC8748b == null ? null : abstractC8748b.f20437d[abstractC8748b.mo21064a()];
                if (c8708o != null) {
                    int i2 = c8708o.f20299j;
                    int i3 = c8708o.f20300k;
                    c8463f.f18844t = i2;
                    c8463f.f18845u = i3;
                }
            }
            this.f18823b = true;
            c8463f.m20907a(EnumC8489b.Prepared);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i, long j) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(C8708o c8708o) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        C8463f c8463f = (C8463f) this.f18822a.get();
        if (c8463f != null) {
            c8463f.f18844t = i;
            c8463f.f18845u = i2;
        }
    }
}
