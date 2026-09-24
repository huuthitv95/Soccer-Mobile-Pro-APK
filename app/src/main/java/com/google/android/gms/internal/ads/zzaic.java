package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaic extends zzaih {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaic(zzahb zzahbVar) {
        super(zzahbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    protected final boolean zza(zzes zzesVar) throws zzaig {
        if (this.zzc) {
            zzesVar.zzk(1);
        } else {
            int iZzs = zzesVar.zzs();
            int i = iZzs >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(iZzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("audio/mpeg");
                zztVar.zzG(1);
                zztVar.zzH(i2);
                this.zza.zzA(zztVar.zzO());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzn("video/x-flv");
                zztVar2.zzo(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zztVar2.zzG(1);
                zztVar2.zzH(8000);
                this.zza.zzA(zztVar2.zzO());
                this.zzd = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new zzaig(sb.toString());
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    protected final boolean zzb(zzes zzesVar, long j) throws zzat {
        if (this.zze == 2) {
            int iZzd = zzesVar.zzd();
            zzahb zzahbVar = this.zza;
            zzahbVar.zzc(zzesVar, iZzd);
            zzahbVar.zze(j, 1, iZzd, 0, null);
            return true;
        }
        int iZzs = zzesVar.zzs();
        if (iZzs != 0 || this.zzd) {
            if (this.zze == 10 && iZzs != 1) {
                return false;
            }
            int iZzd2 = zzesVar.zzd();
            zzahb zzahbVar2 = this.zza;
            zzahbVar2.zzc(zzesVar, iZzd2);
            zzahbVar2.zze(j, 1, iZzd2, 0, null);
            return true;
        }
        int iZzd3 = zzesVar.zzd();
        byte[] bArr = new byte[iZzd3];
        zzesVar.zzm(bArr, 0, iZzd3);
        zzaen zzaenVarZza = zzaeo.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzn("video/x-flv");
        zztVar.zzo("audio/mp4a-latm");
        zztVar.zzk(zzaenVarZza.zzc);
        zztVar.zzG(zzaenVarZza.zzb);
        zztVar.zzH(zzaenVarZza.zza);
        zztVar.zzr(Collections.singletonList(bArr));
        this.zza.zzA(zztVar.zzO());
        this.zzd = true;
        return false;
    }
}
