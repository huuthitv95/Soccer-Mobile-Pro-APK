package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzacm {
    final /* synthetic */ zzacn zza;
    private zzv zzb;

    /* synthetic */ zzacm(zzacn zzacnVar, byte[] bArr) {
        Objects.requireNonNull(zzacnVar);
        this.zza = zzacnVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzv(zzbvVar.zzb);
        zztVar.zzw(zzbvVar.zzc);
        zztVar.zzo(MimeTypes.VIDEO_RAW);
        this.zzb = zztVar.zzO();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            zzacn zzacnVar = this.zza;
            if (zzacnVar.zzA() != null) {
                zzacnVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVarZzO = this.zzb;
        if (zzvVarZzO == null) {
            zzvVarZzO = new zzt().zzO();
        }
        zzv zzvVar = zzvVarZzO;
        zzacn zzacnVar2 = this.zza;
        zzacnVar2.zzD().zzcS(j2, j, zzvVar, null);
        ((zzaek) zzacnVar2.zzz().remove()).zza(j);
    }
}
