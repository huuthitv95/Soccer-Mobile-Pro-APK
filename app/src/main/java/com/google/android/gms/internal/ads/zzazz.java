package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzazz implements Runnable {
    final /* synthetic */ zzbaa zza;

    zzazz(zzbaa zzbaaVar) {
        Objects.requireNonNull(zzbaaVar);
        this.zza = zzbaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbaa zzbaaVar = this.zza;
        synchronized (zzbaaVar.zzp()) {
            if (zzbaaVar.zzq()) {
                return;
            }
            zzbaaVar.zzr(true);
            try {
                zzbaaVar.zzn();
            } catch (Exception e) {
                this.zza.zzo().zzc(2023, -1L, e);
            }
            zzbaa zzbaaVar2 = this.zza;
            synchronized (zzbaaVar2.zzp()) {
                zzbaaVar2.zzr(false);
            }
        }
    }
}
