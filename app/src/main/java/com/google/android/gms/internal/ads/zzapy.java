package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapy implements zzapm {
    private final zzes zza;
    private final zzagm zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzahb zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzapy(String str, int i, String str2) {
        zzes zzesVar = new zzes(4);
        this.zza = zzesVar;
        zzesVar.zzi()[0] = -1;
        this.zzb = new zzagm();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzg = zzaraVar.zzc();
        this.zzf = zzafsVar.zzu(zzaraVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        this.zzf.getClass();
        while (zzesVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                byte[] bArrZzi = zzesVar.zzi();
                int iZzg = zzesVar.zzg();
                int iZze = zzesVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzesVar.zzh(iZze);
                        break;
                    }
                    int i2 = iZzg + 1;
                    byte b = bArrZzi[iZzg];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.zzk && (b & 224) == 224;
                    this.zzk = z;
                    if (z2) {
                        zzesVar.zzh(i2);
                        this.zzk = false;
                        this.zza.zzi()[1] = bArrZzi[iZzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    iZzg = i2;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzesVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzc(zzesVar, iMin);
                int i3 = this.zzi + iMin;
                this.zzi = i3;
                if (i3 >= this.zzm) {
                    zzgsw.zzi(this.zzn != -9223372036854775807L);
                    this.zzf.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int iMin2 = Math.min(zzesVar.zzd(), 4 - this.zzi);
                zzes zzesVar2 = this.zza;
                zzesVar.zzm(zzesVar2.zzi(), this.zzi, iMin2);
                int i4 = this.zzi + iMin2;
                this.zzi = i4;
                if (i4 >= 4) {
                    zzesVar2.zzh(0);
                    zzagm zzagmVar = this.zzb;
                    if (zzagmVar.zza(zzesVar2.zzB())) {
                        this.zzm = zzagmVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (((long) zzagmVar.zzg) * 1000000) / ((long) zzagmVar.zzd);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzg);
                            zztVar.zzn(this.zze);
                            zztVar.zzo(zzagmVar.zzb);
                            zztVar.zzp(4096);
                            zztVar.zzG(zzagmVar.zze);
                            zztVar.zzH(zzagmVar.zzd);
                            zztVar.zze(this.zzc);
                            zztVar.zzg(this.zzd);
                            this.zzf.zzA(zztVar.zzO());
                            this.zzj = true;
                        }
                        zzesVar2.zzh(0);
                        this.zzf.zzc(zzesVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
