package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdxp implements zzdfl, zzddt, zzdci, zzdcz, com.google.android.gms.ads.internal.client.zza, zzdhw {
    private final zzbhd zza;
    private boolean zzb = false;

    public zzdxp(zzbhd zzbhdVar, @Nullable zzfho zzfhoVar) {
        this.zza = zzbhdVar;
        zzbhdVar.zzc(2);
        if (zzfhoVar != null) {
            zzbhdVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(final zzfke zzfkeVar) {
        this.zza.zzb(new zzbhc() { // from class: com.google.android.gms.internal.ads.zzdxo
            @Override // com.google.android.gms.internal.ads.zzbhc
            public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar) {
                zzbhj.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbhj.zzi.zza zzaVarZzcc = zzaVar.zzY().zzp().zzcc();
                zzaVarZzcc.zzd(zzfkeVar.zzb.zzb.zzb);
                zzbVarZzcc.zzr(zzaVarZzcc);
                zzaVar.zzaa(zzbVarZzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final synchronized void zzdr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzj(final zzbhj.zzb zzbVar) {
        zzbhc zzbhcVar = new zzbhc() { // from class: com.google.android.gms.internal.ads.zzdxl
            @Override // com.google.android.gms.internal.ads.zzbhc
            public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbhd zzbhdVar = this.zza;
        zzbhdVar.zzb(zzbhcVar);
        zzbhdVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzk(final zzbhj.zzb zzbVar) {
        zzbhc zzbhcVar = new zzbhc() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // com.google.android.gms.internal.ads.zzbhc
            public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbhd zzbhdVar = this.zza;
        zzbhdVar.zzb(zzbhcVar);
        zzbhdVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzl(final zzbhj.zzb zzbVar) {
        zzbhc zzbhcVar = new zzbhc() { // from class: com.google.android.gms.internal.ads.zzdxn
            @Override // com.google.android.gms.internal.ads.zzbhc
            public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbhd zzbhdVar = this.zza;
        zzbhdVar.zzb(zzbhcVar);
        zzbhdVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzm(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzo() {
        this.zza.zzc(1109);
    }
}
