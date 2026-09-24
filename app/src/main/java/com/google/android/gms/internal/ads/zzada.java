package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzada {
    private final Context zza;
    private final zzadm zzb;
    private zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = 15000;
    private final zzadn zzh = new zzadn(1.0f);
    private zzdo zze = zzdo.zza;

    public zzada(Context context, zzadm zzadmVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzadmVar;
    }

    public final zzada zza(boolean z) {
        this.zzd = true;
        return this;
    }

    public final zzada zzb(zzdo zzdoVar) {
        this.zze = zzdoVar;
        return this;
    }

    public final zzada zzc(long j) {
        this.zzg = j;
        return this;
    }

    public final zzadi zzd() {
        zzgsw.zzi(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzadg(false);
        }
        zzadi zzadiVar = new zzadi(this, null);
        this.zzf = true;
        return zzadiVar;
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzadm zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzbs zzg() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    final /* synthetic */ zzdo zzi() {
        return this.zze;
    }

    final /* synthetic */ long zzj() {
        return this.zzg;
    }

    final /* synthetic */ zzadn zzk() {
        return this.zzh;
    }
}
