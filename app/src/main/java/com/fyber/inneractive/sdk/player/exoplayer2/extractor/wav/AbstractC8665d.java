package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.d */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8665d {
    /* JADX INFO: renamed from: a */
    public static C8663b m21187a(C8527b c8527b) throws InterruptedException, C8711r, EOFException {
        C8815n c8815n = new C8815n(16);
        if (C8664c.m21186a(c8527b, c8815n).f20123a != AbstractC8827z.m21379a("RIFF")) {
            return null;
        }
        c8527b.m21025a(c8815n.f20643a, 0, 4, false);
        c8815n.m21347e(0);
        int iM21340b = c8815n.m21340b();
        if (iM21340b != AbstractC8827z.m21379a("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + iM21340b);
            return null;
        }
        C8664c c8664cM21186a = C8664c.m21186a(c8527b, c8815n);
        while (c8664cM21186a.f20123a != AbstractC8827z.m21379a("fmt ")) {
            c8527b.m21024a((int) c8664cM21186a.f20124b, false);
            c8664cM21186a = C8664c.m21186a(c8527b, c8815n);
        }
        if (c8664cM21186a.f20124b < 16) {
            throw new IllegalStateException();
        }
        c8527b.m21025a(c8815n.f20643a, 0, 16, false);
        c8815n.m21347e(0);
        int iM21348f = c8815n.m21348f();
        int iM21348f2 = c8815n.m21348f();
        int iM21344d = c8815n.m21344d();
        if (iM21344d < 0) {
            throw new IllegalStateException(AbstractC8673m.m21221a("Top bit not zero: ", iM21344d));
        }
        int iM21344d2 = c8815n.m21344d();
        if (iM21344d2 < 0) {
            throw new IllegalStateException(AbstractC8673m.m21221a("Top bit not zero: ", iM21344d2));
        }
        int iM21348f3 = c8815n.m21348f();
        int iM21348f4 = c8815n.m21348f();
        int i = (iM21348f2 * iM21348f4) / 8;
        if (iM21348f3 != i) {
            throw new C8711r("Expected block alignment: " + i + "; got: " + iM21348f3);
        }
        int iM21378a = AbstractC8827z.m21378a(iM21348f4);
        if (iM21378a == 0) {
            Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + iM21348f4);
            return null;
        }
        if (iM21348f == 1 || iM21348f == 65534) {
            c8527b.m21024a(((int) c8664cM21186a.f20124b) - 16, false);
            return new C8663b(iM21348f2, iM21344d, iM21344d2, iM21348f3, iM21348f4, iM21378a);
        }
        Log.e("WavHeaderReader", "Unsupported WAV format type: " + iM21348f);
        return null;
    }
}
