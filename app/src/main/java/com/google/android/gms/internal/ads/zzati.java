package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzati {
    public static final boolean zza = zzatj.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzati() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzatj.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzath(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzath> list = this.zzb;
        long j = list.size() == 0 ? 0L : ((zzath) list.get(list.size() - 1)).zzc - ((zzath) list.get(0)).zzc;
        if (j > 0) {
            long j2 = ((zzath) list.get(0)).zzc;
            zzatj.zzb("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzath zzathVar : list) {
                long j3 = zzathVar.zzc;
                zzatj.zzb("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzathVar.zzb), zzathVar.zza);
                j2 = j3;
            }
        }
    }
}
