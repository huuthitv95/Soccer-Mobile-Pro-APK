package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwh implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcwh(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar2;
        this.zzb = zzimrVar3;
    }

    public static zzcwh zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzcwh(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        boolean zBooleanValue = Boolean.valueOf(zzcwf.zza()).booleanValue();
        zzelg zzelgVarZzb = ((zzeok) this.zza).zzb();
        zzeqi zzeqiVarZzb = ((zzeqj) this.zzb).zzb();
        if (true != zBooleanValue) {
            zzelgVarZzb = zzeqiVarZzb;
        }
        return zzelgVarZzb;
    }
}
