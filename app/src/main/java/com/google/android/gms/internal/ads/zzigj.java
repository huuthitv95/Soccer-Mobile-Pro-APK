package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzigj extends zzigh {
    zzigj() {
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final /* bridge */ /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzigi) obj).zzk(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i, int i2) {
        ((zzigi) obj).zzk((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i, long j) {
        ((zzigi) obj).zzk((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i, zzicn zzicnVar) {
        ((zzigi) obj).zzk((i << 3) | 2, zzicnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final /* bridge */ /* synthetic */ void zze(Object obj, int i, Object obj2) {
        ((zzigi) obj).zzk((i << 3) | 3, (zzigi) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final /* synthetic */ Object zzf() {
        return zzigi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final /* synthetic */ Object zzg(Object obj) {
        zzigi zzigiVar = (zzigi) obj;
        zzigiVar.zzd();
        return zzigiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzidr zzidrVar = (zzidr) obj;
        zzigi zzigiVar = zzidrVar.zzt;
        if (zzigiVar != zzigi.zza()) {
            return zzigiVar;
        }
        zzigi zzigiVarZzb = zzigi.zzb();
        zzidrVar.zzt = zzigiVarZzb;
        return zzigiVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzidr) obj).zzt = (zzigi) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    final void zzj(Object obj) {
        ((zzidr) obj).zzt.zzd();
    }
}
