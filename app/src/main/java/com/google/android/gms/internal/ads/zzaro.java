package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaro implements zzafp {
    private final zzes zza = new zzes(4);
    private final zzagu zzb = new zzagu(-1, -1, MimeTypes.IMAGE_WEBP);

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zza;
        zzesVar.zza(4);
        zzafg zzafgVar = (zzafg) zzafqVar;
        zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
        if (zzesVar.zzz() == 1380533830) {
            zzafgVar.zzj(4, false);
            zzesVar.zza(4);
            zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
            if (zzesVar.zzz() == 1464156752) {
                return true;
            }
        }
        return false;
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
