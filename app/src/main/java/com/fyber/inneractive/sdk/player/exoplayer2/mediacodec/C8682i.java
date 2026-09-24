package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C8682i implements InterfaceC8680g {

    /* JADX INFO: renamed from: a */
    public final int f20245a;

    /* JADX INFO: renamed from: b */
    public MediaCodecInfo[] f20246b;

    public C8682i(boolean z) {
        this.f20245a = z ? 1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC8680g
    /* JADX INFO: renamed from: a */
    public final int mo21235a() {
        if (this.f20246b == null) {
            this.f20246b = new MediaCodecList(this.f20245a).getCodecInfos();
        }
        return this.f20246b.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC8680g
    /* JADX INFO: renamed from: a */
    public final MediaCodecInfo mo21236a(int i) {
        if (this.f20246b == null) {
            this.f20246b = new MediaCodecList(this.f20245a).getCodecInfos();
        }
        return this.f20246b[i];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC8680g
    /* JADX INFO: renamed from: a */
    public final boolean mo21237a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC8680g
    /* JADX INFO: renamed from: b */
    public final boolean mo21238b() {
        return true;
    }
}
