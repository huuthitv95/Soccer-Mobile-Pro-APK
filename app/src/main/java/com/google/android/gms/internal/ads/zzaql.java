package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaql implements zzafp {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzaqh zzi;
    private zzafs zzj;
    private boolean zzk;
    private final zzfh zza = new zzfh(0);
    private final zzes zzc = new zzes(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzaqi zzd = new zzaqi();

    static {
        int i = zzaqk.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        byte[] bArr = new byte[14];
        zzafg zzafgVar = (zzafg) zzafqVar;
        zzafgVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzafgVar.zzj(bArr[13] & 7, false);
        zzafgVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzj = zzafsVar;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        zzapm zzapoVar;
        zzafs zzafsVar = this.zzj;
        zzafsVar.getClass();
        long jZzo = zzafqVar.zzo();
        if (jZzo != -1) {
            zzaqi zzaqiVar = this.zzd;
            if (!zzaqiVar.zza()) {
                return zzaqiVar.zzc(zzafqVar, zzagpVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzaqi zzaqiVar2 = this.zzd;
            if (zzaqiVar2.zzd() != -9223372036854775807L) {
                zzaqh zzaqhVar = new zzaqh(zzaqiVar2.zzb(), zzaqiVar2.zzd(), jZzo);
                this.zzi = zzaqhVar;
                this.zzj.zzw(zzaqhVar.zza());
            } else {
                zzafsVar.zzw(new zzagr(zzaqiVar2.zzd(), 0L));
            }
        }
        zzaqh zzaqhVar2 = this.zzi;
        if (zzaqhVar2 != null && zzaqhVar2.zzc()) {
            return zzaqhVar2.zzd(zzafqVar, zzagpVar);
        }
        zzafqVar.zzl();
        long jZzm = jZzo != -1 ? jZzo - zzafqVar.zzm() : -1L;
        if (jZzm != -1 && jZzm < 4) {
            return -1;
        }
        zzes zzesVar = this.zzc;
        if (!zzafqVar.zzh(zzesVar.zzi(), 0, 4, true)) {
            return -1;
        }
        zzesVar.zzh(0);
        int iZzB = zzesVar.zzB();
        if (iZzB == 441) {
            return -1;
        }
        if (iZzB == 442) {
            zzafqVar.zzi(zzesVar.zzi(), 0, 10);
            zzesVar.zzh(9);
            zzafqVar.zzf((zzesVar.zzs() & 7) + 14);
            return 0;
        }
        if (iZzB == 443) {
            zzafqVar.zzi(zzesVar.zzi(), 0, 2);
            zzesVar.zzh(0);
            zzafqVar.zzf(zzesVar.zzt() + 6);
            return 0;
        }
        if ((iZzB >> 8) != 1) {
            zzafqVar.zzf(1);
            return 0;
        }
        int i = iZzB & 255;
        SparseArray sparseArray = this.zzb;
        zzaqj zzaqjVar = (zzaqj) sparseArray.get(i);
        if (!this.zze) {
            if (zzaqjVar == null) {
                zzapm zzapmVar = null;
                if (i == 189) {
                    zzapoVar = new zzapc(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzafqVar.zzn();
                } else if ((iZzB & 224) == 192) {
                    zzapoVar = new zzapy(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzafqVar.zzn();
                } else if ((iZzB & 240) == 224) {
                    zzapoVar = new zzapo(null, "video/mp2p");
                    this.zzg = true;
                    this.zzh = zzafqVar.zzn();
                } else if (zzapmVar != null) {
                    zzapmVar.zzb(this.zzj, new zzara(Integer.MIN_VALUE, i, 256));
                    zzaqjVar = new zzaqj(zzapmVar, this.zza);
                    sparseArray.put(i, zzaqjVar);
                }
                zzapmVar = zzapoVar;
                if (zzapmVar != null) {
                    zzapmVar.zzb(this.zzj, new zzara(Integer.MIN_VALUE, i, 256));
                    zzaqjVar = new zzaqj(zzapmVar, this.zza);
                    sparseArray.put(i, zzaqjVar);
                }
            }
            boolean z = this.zzf;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.zzg) {
                j = PlaybackStateCompat.ACTION_PLAY_FROM_URI + this.zzh;
            }
            if (zzafqVar.zzn() > j) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzafqVar.zzi(zzesVar.zzi(), 0, 2);
        zzesVar.zzh(0);
        int iZzt = zzesVar.zzt() + 6;
        if (zzaqjVar == null) {
            zzafqVar.zzf(iZzt);
        } else {
            zzesVar.zza(iZzt);
            zzafqVar.zzc(zzesVar.zzi(), 0, iZzt);
            zzesVar.zzh(6);
            zzaqjVar.zzb(zzesVar);
            zzesVar.zzf(zzesVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        zzfh zzfhVar = this.zza;
        if (zzfhVar.zzc() != -9223372036854775807L) {
            long jZza = zzfhVar.zza();
            if (jZza != -9223372036854775807L && jZza != 0 && jZza != j2) {
                zzfhVar.zzd(j2);
            }
        } else {
            zzfhVar.zzd(j2);
        }
        zzaqh zzaqhVar = this.zzi;
        int i = 0;
        if (zzaqhVar != null) {
            zzaqhVar.zzb(j2);
        }
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzaqj) sparseArray.valueAt(i)).zza();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }
}
