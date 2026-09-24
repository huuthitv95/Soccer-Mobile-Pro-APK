package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapw implements zzapm {
    private zzahb zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzes zzb = new zzes(10);
    private long zze = -9223372036854775807L;

    public zzapw(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        zzahb zzahbVarZzu = zzafsVar.zzu(zzaraVar.zzb(), 5);
        this.zzc = zzahbVarZzu;
        zzt zztVar = new zzt();
        zztVar.zza(zzaraVar.zzc());
        zztVar.zzn(this.zza);
        zztVar.zzo("application/id3");
        zzahbVarZzu.zzA(zztVar.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int iZzd = zzesVar.zzd();
            int i = this.zzg;
            if (i < 10) {
                int iMin = Math.min(iZzd, 10 - i);
                byte[] bArrZzi = zzesVar.zzi();
                int iZzg = zzesVar.zzg();
                zzes zzesVar2 = this.zzb;
                System.arraycopy(bArrZzi, iZzg, zzesVar2.zzi(), this.zzg, iMin);
                if (this.zzg + iMin == 10) {
                    zzesVar2.zzh(0);
                    if (zzesVar2.zzs() != 73 || zzesVar2.zzs() != 68 || zzesVar2.zzs() != 51) {
                        zzef.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzesVar2.zzk(3);
                        this.zzf = zzesVar2.zzG() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzd, this.zzf - this.zzg);
            this.zzc.zzc(zzesVar, iMin2);
            this.zzg += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        int i;
        this.zzc.getClass();
        if (this.zzd && (i = this.zzf) != 0 && this.zzg == i) {
            zzgsw.zzi(this.zze != -9223372036854775807L);
            this.zzc.zze(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
