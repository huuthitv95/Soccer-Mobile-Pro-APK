package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdg {
    private boolean zza;

    @Nullable
    private final zzhdt zzc;
    private final zzhde zzb = zzhde.zza;
    private zzhdh zzd = null;

    @Nullable
    private zzhdi zze = null;

    /* synthetic */ zzhdg(zzhdt zzhdtVar, byte[] bArr) {
        this.zzc = zzhdtVar;
    }

    public final zzhdg zza() {
        zzhdi zzhdiVar = this.zze;
        if (zzhdiVar != null) {
            zzhdiVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhdg zzb() {
        this.zzd = zzhdh.zza;
        return this;
    }

    final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zza = false;
    }

    final /* synthetic */ zzhde zze() {
        return this.zzb;
    }

    final /* synthetic */ zzhdt zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzhdh zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzhdi zzh() {
        return this.zze;
    }

    final /* synthetic */ void zzi(zzhdi zzhdiVar) {
        this.zze = zzhdiVar;
    }
}
