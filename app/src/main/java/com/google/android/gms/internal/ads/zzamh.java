package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzamh implements zzamo {
    private final zzamn zza;
    private final long zzb;
    private final long zzc;
    private final zzams zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzamh(zzams zzamsVar, long j, long j2, long j3, long j4, boolean z) {
        zzgsw.zza(j >= 0 && j2 > j);
        this.zzd = zzamsVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzamn();
    }

    @Override // com.google.android.gms.internal.ads.zzamo
    public final void zzb(long j) {
        long j2 = this.zzf - 1;
        String str = zzfk.zza;
        this.zzh = Math.max(0L, Math.min(j, j2));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzamo
    public final /* bridge */ /* synthetic */ zzags zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzamg(this, bArr);
        }
        return null;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ zzams zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzf;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzamo
    public final long zza(zzafq zzafqVar) throws IOException {
        long j;
        long j2;
        long jMax;
        int i = this.zze;
        if (i == 0) {
            long jZzn = zzafqVar.zzn();
            this.zzg = jZzn;
            this.zze = 1;
            long j3 = this.zzc - 65307;
            if (j3 > jZzn) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j4 = this.zzi;
                long j5 = this.zzj;
                if (j4 == j5) {
                    jMax = -1;
                    j2 = -1;
                } else {
                    long jZzn2 = zzafqVar.zzn();
                    zzamn zzamnVar = this.zza;
                    if (zzamnVar.zzb(zzafqVar, j5)) {
                        zzamnVar.zzc(zzafqVar, false);
                        zzafqVar.zzl();
                        long j6 = this.zzh;
                        j = 2;
                        long j7 = zzamnVar.zzb;
                        long j8 = j6 - j7;
                        int i2 = zzamnVar.zzd + zzamnVar.zze;
                        if (j8 < 0 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.zzj = jZzn2;
                                this.zzl = j7;
                            } else {
                                this.zzi = zzafqVar.zzn() + ((long) i2);
                                this.zzk = j7;
                            }
                            long j9 = this.zzj;
                            long j10 = this.zzi;
                            long j11 = j9 - j10;
                            if (j11 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.zzj = j10;
                                j2 = -1;
                                jMax = j10;
                            } else {
                                long jZzn3 = zzafqVar.zzn() - (((long) i2) * (j8 <= 0 ? 2L : 1L));
                                j2 = -1;
                                String str = zzfk.zza;
                                jMax = Math.max(j10, Math.min(jZzn3 + ((j8 * j11) / (this.zzl - this.zzk)), j9 - 1));
                            }
                        } else {
                            jMax = -1;
                            j2 = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j2 = -1;
                    }
                    if (jMax != j2) {
                        return jMax;
                    }
                    this.zze = 3;
                }
                j = 2;
                if (jMax != j2) {
                    return jMax;
                }
                this.zze = 3;
            } else {
                if (i != 3) {
                    return -1L;
                }
                j2 = -1;
                j = 2;
            }
            while (true) {
                zzamn zzamnVar2 = this.zza;
                zzamnVar2.zzb(zzafqVar, j2);
                zzamnVar2.zzc(zzafqVar, false);
                if (zzamnVar2.zzb > this.zzh) {
                    zzafqVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + j);
                }
                zzafqVar.zzf(zzamnVar2.zzd + zzamnVar2.zze);
                this.zzi = zzafqVar.zzn();
                this.zzk = zzamnVar2.zzb;
                j2 = -1;
            }
        }
        zzamn zzamnVar3 = this.zza;
        zzamnVar3.zza();
        if (!zzamnVar3.zzb(zzafqVar, -1L)) {
            throw new EOFException();
        }
        zzamnVar3.zzc(zzafqVar, false);
        zzafqVar.zzf(zzamnVar3.zzd + zzamnVar3.zze);
        long j12 = zzamnVar3.zzb;
        while ((zzamnVar3.zza & 4) != 4 && zzamnVar3.zzb(zzafqVar, -1L) && zzafqVar.zzn() < this.zzc && zzamnVar3.zzc(zzafqVar, true) && zzaft.zzd(zzafqVar, zzamnVar3.zzd + zzamnVar3.zze)) {
            j12 = zzamnVar3.zzb;
        }
        this.zzf = j12;
        this.zze = 4;
        return this.zzg;
    }
}
