package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfvz implements Runnable {
    zzfvz() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzfwc.zzc != null) {
            zzfwc.zzc.post(zzfwc.zzk);
            zzfwc.zzc.postDelayed(zzfwc.zzl, 200L);
        }
    }
}
