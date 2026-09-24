package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahv implements zzafp {
    private final zzes zza = new zzes(4);
    private final zzagu zzb = new zzagu(-1, -1, MimeTypes.IMAGE_AVIF);

    private final boolean zzh(zzafq zzafqVar, int i) throws IOException {
        zzes zzesVar = this.zza;
        zzesVar.zza(4);
        ((zzafg) zzafqVar).zzh(zzesVar.zzi(), 0, 4, false);
        return zzesVar.zzz() == ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        ((zzafg) zzafqVar).zzj(4, false);
        return zzh(zzafqVar, 1718909296) && zzh(zzafqVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzb.zzc(zzafsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        return this.zzb.zzd(zzafqVar, zzagpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzb.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }
}
