package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zztc {
    private final Context zza;
    private final zzqb zzb;
    private boolean zzc;
    private zztb zzd;
    private zzqz zze;
    private zzte zzf;
    private zzsz zzg;

    @Deprecated
    public zztc() {
        this.zza = null;
        this.zzb = zzqb.zza;
    }

    public final zztj zza() {
        zzgsw.zzi(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zzte(new zzco[0]);
        }
        if (this.zze == null) {
            if (this.zzg == null) {
                this.zzg = new zzsz(this.zza);
            }
            if (this.zzd == null) {
                this.zzd = zztb.zza;
            }
            Context context = this.zza;
            zzst zzstVar = new zzst(context);
            zzstVar.zzb(context != null ? null : this.zzb);
            zzstVar.zzf(this.zzg);
            zzstVar.zza(this.zzd);
            this.zze = zzstVar.zzc();
        } else {
            zzgsw.zzi(this.zzg == null);
            zzgsw.zzi(this.zzd == null);
        }
        return new zztj(this, null);
    }

    final /* synthetic */ Context zzb() {
        return this.zza;
    }

    final /* synthetic */ zzqz zzc() {
        return this.zze;
    }

    final /* synthetic */ zzte zzd() {
        return this.zzf;
    }

    public zztc(Context context) {
        this.zza = context;
        this.zzb = zzqb.zza;
    }
}
