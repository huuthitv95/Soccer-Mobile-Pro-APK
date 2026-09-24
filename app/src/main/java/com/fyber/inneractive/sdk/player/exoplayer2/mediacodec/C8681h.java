package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8681h implements InterfaceC8680g {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC8680g
    /* JADX INFO: renamed from: a */
    public final int mo21235a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC8680g
    /* JADX INFO: renamed from: a */
    public final MediaCodecInfo mo21236a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC8680g
    /* JADX INFO: renamed from: a */
    public final boolean mo21237a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC8680g
    /* JADX INFO: renamed from: b */
    public final boolean mo21238b() {
        return false;
    }
}
