package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzyl implements zzxb {
    private final zzhi zza;
    private final zzxu zzb;
    private int zzc;
    private final zzabm zzd;

    public zzyl(zzhi zzhiVar, final zzafv zzafvVar) {
        zzxu zzxuVar = new zzxu() { // from class: com.google.android.gms.internal.ads.zzyk
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ zzxv zza(zzpz zzpzVar) {
                return new zzwe(zzafvVar);
            }
        };
        zzabm zzabmVar = new zzabm(-1);
        this.zza = zzhiVar;
        this.zzb = zzxuVar;
        this.zzd = zzabmVar;
        this.zzc = 1048576;
    }

    public final zzyl zza(int i) {
        this.zzc = i;
        return this;
    }

    public final zzym zzb(zzak zzakVar) {
        zzag zzagVar = zzakVar.zzb;
        zzagVar.getClass();
        zzhi zzhiVar = this.zza;
        zzxu zzxuVar = this.zzb;
        zzagVar.getClass();
        return new zzym(zzakVar, zzhiVar, zzxuVar, zzuf.zza, this.zzd, this.zzc, false, 0, null, null, null);
    }
}
