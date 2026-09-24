package com.google.android.gms.internal.games_v2;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzak {
    private final AtomicReference zza = new AtomicReference();

    protected abstract zzaj zza();

    public final void zzb() {
        zzaj zzajVar = (zzaj) this.zza.get();
        if (zzajVar != null) {
            zzajVar.zzd();
        }
    }

    public final void zzc(String str, int i) {
        zzaj zzajVar = (zzaj) this.zza.get();
        if (zzajVar == null) {
            zzaj zzajVarZza = zza();
            AtomicReference atomicReference = this.zza;
            while (!LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(atomicReference, null, zzajVarZza)) {
                if (atomicReference.get() != null) {
                    zzajVar = (zzaj) this.zza.get();
                }
            }
            zzajVar = zzajVarZza;
        }
        zzajVar.zzc(str, i);
    }
}
