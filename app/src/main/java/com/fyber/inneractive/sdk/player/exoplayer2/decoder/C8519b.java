package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8519b {

    /* JADX INFO: renamed from: a */
    public byte[] f19097a;

    /* JADX INFO: renamed from: b */
    public int[] f19098b;

    /* JADX INFO: renamed from: c */
    public int[] f19099c;

    /* JADX INFO: renamed from: d */
    public final MediaCodec.CryptoInfo f19100d;

    /* JADX INFO: renamed from: e */
    public final C8518a f19101e;

    public C8519b() {
        int i = AbstractC8827z.f20671a;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f19100d = cryptoInfo;
        this.f19101e = i >= 24 ? new C8518a(cryptoInfo) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m21015a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.f19098b = iArr;
        this.f19099c = iArr2;
        this.f19097a = bArr2;
        int i2 = AbstractC8827z.f20671a;
        if (i2 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f19100d;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i2 >= 24) {
                C8518a.m21014a(this.f19101e);
            }
        }
    }
}
