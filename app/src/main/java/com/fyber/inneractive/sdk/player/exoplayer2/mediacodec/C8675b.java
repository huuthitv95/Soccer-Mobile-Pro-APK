package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8675b extends Exception {
    public C8675b(C8708o c8708o, C8679f c8679f, int i) {
        super("Decoder init failed: [" + i + "], " + c8708o, c8679f);
        String str = c8708o.f20295f;
        Math.abs(i);
    }

    public C8675b(C8708o c8708o, Exception exc, String str) {
        super("Decoder init failed: " + str + ", " + c8708o, exc);
        String str2 = c8708o.f20295f;
        if (AbstractC8827z.f20671a < 21 || !(exc instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) exc).getDiagnosticInfo();
    }
}
