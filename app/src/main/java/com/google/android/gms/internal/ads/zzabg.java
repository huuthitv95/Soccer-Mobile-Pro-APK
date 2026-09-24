package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabg {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzabh zzabhVar) {
        zzb(zzabhVar);
        this.zza.add(new zzabf(handler, zzabhVar));
    }

    public final void zzb(zzabh zzabhVar) {
        CopyOnWriteArrayList<zzabf> copyOnWriteArrayList = this.zza;
        for (zzabf zzabfVar : copyOnWriteArrayList) {
            if (zzabfVar.zzc() == zzabhVar) {
                zzabfVar.zza();
                copyOnWriteArrayList.remove(zzabfVar);
            }
        }
    }

    public final void zzc(final int i, final long j, final long j2) {
        for (final zzabf zzabfVar : this.zza) {
            if (!zzabfVar.zzd()) {
                zzabfVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzabfVar.zzc().zzX(i, j, j2);
                    }
                });
            }
        }
    }
}
