package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzarj implements zzafp {
    private zzafs zza;
    private zzahb zzb;
    private zzarg zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i = zzari.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        return zzarm.zza(zzafqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zza = zzafsVar;
        this.zzb = zzafsVar.zzu(0, 1);
        zzafsVar.zzv();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        int i;
        this.zzb.getClass();
        String str = zzfk.zza;
        int i2 = this.zzc;
        int iZzB = 4;
        if (i2 == 0) {
            zzgsw.zzi(zzafqVar.zzn() == 0);
            int i3 = this.zzf;
            if (i3 != -1) {
                zzafqVar.zzf(i3);
                this.zzc = 4;
            } else {
                if (!zzarm.zza(zzafqVar)) {
                    throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzafqVar.zzf((int) (zzafqVar.zzm() - zzafqVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long jZzE = -1;
        if (i2 == 1) {
            int i4 = zzarm.zza;
            zzes zzesVar = new zzes(8);
            zzarl zzarlVarZza = zzarl.zza(zzafqVar, zzesVar);
            if (zzarlVarZza.zza != 1685272116) {
                zzafqVar.zzl();
            } else {
                zzafqVar.zzk(8);
                zzesVar.zzh(0);
                zzafqVar.zzi(zzesVar.zzi(), 0, 8);
                jZzE = zzesVar.zzE();
                zzafqVar.zzf(((int) zzarlVarZza.zzb) + 8);
            }
            this.zzd = jZzE;
            this.zzc = 2;
            return 0;
        }
        if (i2 == 2) {
            zzark zzarkVarZzb = zzarm.zzb(zzafqVar);
            int i5 = zzarkVarZzb.zza;
            if (i5 == 17) {
                this.zze = new zzarf(this.zza, this.zzb, zzarkVarZzb);
            } else if (i5 == 6) {
                this.zze = new zzarh(this.zza, this.zzb, zzarkVarZzb, "audio/g711-alaw", -1);
            } else if (i5 == 7) {
                this.zze = new zzarh(this.zza, this.zzb, zzarkVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i6 = zzarkVarZzb.zze;
                if (i5 == 1) {
                    iZzB = zzfk.zzB(i6, ByteOrder.LITTLE_ENDIAN);
                    i = iZzB;
                } else {
                    if (i5 != 3) {
                        if (i5 == 65534) {
                            iZzB = zzfk.zzB(i6, ByteOrder.LITTLE_ENDIAN);
                            i = iZzB;
                        }
                    } else if (i6 == 32) {
                        i = iZzB;
                    }
                    i = 0;
                }
                if (i == 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 29);
                    sb.append("Unsupported WAV format type: ");
                    sb.append(i5);
                    throw zzat.zzc(sb.toString());
                }
                this.zze = new zzarh(this.zza, this.zzb, zzarkVarZzb, "audio/raw", i);
            }
            this.zzc = 3;
            return 0;
        }
        if (i2 != 3) {
            zzgsw.zzi(this.zzg != -1);
            long jZzn = this.zzg - zzafqVar.zzn();
            zzarg zzargVar = this.zze;
            zzargVar.getClass();
            return zzargVar.zzc(zzafqVar, jZzn) ? -1 : 0;
        }
        Pair pairZzc = zzarm.zzc(zzafqVar);
        this.zzf = ((Long) pairZzc.first).intValue();
        long jLongValue = ((Long) pairZzc.second).longValue();
        long j = this.zzd;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        long j2 = ((long) this.zzf) + jLongValue;
        this.zzg = j2;
        long jZzo = zzafqVar.zzo();
        if (jZzo != -1 && j2 > jZzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 29 + String.valueOf(jZzo).length());
            sb2.append("Data exceeds input length: ");
            sb2.append(j2);
            sb2.append(", ");
            sb2.append(jZzo);
            zzef.zzc("WavExtractor", sb2.toString());
            this.zzg = jZzo;
            j2 = jZzo;
        }
        zzarg zzargVar2 = this.zze;
        zzargVar2.getClass();
        zzargVar2.zzb(this.zzf, j2);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzarg zzargVar = this.zze;
        if (zzargVar != null) {
            zzargVar.zza(j2);
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
