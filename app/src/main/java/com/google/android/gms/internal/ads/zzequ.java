package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzequ implements zzelg {
    private final zzbiz zza;
    private final zzhbs zzb;
    private final zzfoy zzc;
    private final zzerd zzd;

    public zzequ(zzfoy zzfoyVar, zzhbs zzhbsVar, zzbiz zzbizVar, zzerd zzerdVar) {
        this.zzc = zzfoyVar;
        this.zzb = zzhbsVar;
        this.zza = zzbizVar;
        this.zzd = zzerdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        zzfjy zzfjyVar;
        return (this.zza == null || (zzfjyVar = zzfjtVar.zzs) == null || zzfjyVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(zzfke zzfkeVar, zzfjt zzfjtVar) {
        zzcfk zzcfkVar = new zzcfk();
        zzeqz zzeqzVar = new zzeqz();
        zzeqzVar.zzd(new zzeqs(this, zzcfkVar, zzfkeVar, zzfjtVar, zzeqzVar));
        zzfjy zzfjyVar = zzfjtVar.zzs;
        final zzbiu zzbiuVar = new zzbiu(zzeqzVar, zzfjyVar.zzb, zzfjyVar.zza);
        zzfos zzfosVar = zzfos.CUSTOM_RENDER_SYN;
        zzfoy zzfoyVar = this.zzc;
        Objects.requireNonNull(zzfoyVar);
        return zzfoj.zzd(new zzfoe() { // from class: com.google.android.gms.internal.ads.zzeqt
            @Override // com.google.android.gms.internal.ads.zzfoe
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbiuVar);
            }
        }, this.zzb, zzfosVar, zzfoyVar).zzj(zzfos.CUSTOM_RENDER_ACK).zze(zzcfkVar).zzi();
    }

    final /* synthetic */ void zzc(zzbiu zzbiuVar) throws RemoteException {
        this.zza.zze(zzbiuVar);
    }

    final /* synthetic */ zzerd zzd() {
        return this.zzd;
    }
}
