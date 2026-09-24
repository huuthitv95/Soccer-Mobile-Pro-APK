package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaso {
    private final Executor zza;

    public zzaso(Handler handler) {
        this.zza = new zzasm(this, handler);
    }

    public final void zza(zzasx zzasxVar, zzatd zzatdVar, Runnable runnable) {
        zzasxVar.zzp();
        zzasxVar.zzc("post-response");
        ((zzasm) this.zza).zza.post(new zzasn(zzasxVar, zzatdVar, runnable));
    }

    public final void zzb(zzasx zzasxVar, zzatg zzatgVar) {
        zzasxVar.zzc("post-error");
        ((zzasm) this.zza).zza.post(new zzasn(zzasxVar, zzatd.zzb(zzatgVar), null));
    }
}
