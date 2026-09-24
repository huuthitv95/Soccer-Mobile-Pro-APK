package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.media.MediaCodec;
import android.os.Handler;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8834f implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaCodecVideoRenderer f20727a;

    public C8834f(MediaCodecVideoRenderer mediaCodecVideoRenderer, MediaCodec mediaCodec) {
        this.f20727a = mediaCodecVideoRenderer;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer = this.f20727a;
        if (this == mediaCodecVideoRenderer.f20711p0 && !mediaCodecVideoRenderer.f20694Y) {
            mediaCodecVideoRenderer.f20694Y = true;
            mediaCodecVideoRenderer.f20686Q.renderedFirstFrame(mediaCodecVideoRenderer.f20692W);
        }
    }
}
