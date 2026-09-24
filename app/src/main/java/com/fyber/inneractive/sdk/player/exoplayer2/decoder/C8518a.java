package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8518a {

    /* JADX INFO: renamed from: a */
    public final MediaCodec.CryptoInfo f19095a;

    /* JADX INFO: renamed from: b */
    public final MediaCodec.CryptoInfo.Pattern f19096b = Util$$ExternalSyntheticApiModelOutline0.m320m(0, 0);

    public C8518a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f19095a = cryptoInfo;
    }

    /* JADX INFO: renamed from: a */
    public static void m21014a(C8518a c8518a) {
        c8518a.f19096b.set(0, 0);
        c8518a.f19095a.setPattern(c8518a.f19096b);
    }
}
