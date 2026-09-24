package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzazg implements Runnable {
    private zzazg() {
        throw null;
    }

    /* synthetic */ zzazg(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzazh.zzd = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = zzazh.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzazh.zzb;
        } catch (Throwable th) {
            zzazh.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
