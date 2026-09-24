package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqq implements zzafa {
    private final zzfh zza;
    private final zzes zzb = new zzes();
    private final int zzc;

    public zzaqq(int i, zzfh zzfhVar, int i2) {
        this.zzc = i;
        this.zza = zzfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaez zza(zzafq zzafqVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzafqVar.zzn();
        int iMin = (int) Math.min(112800L, zzafqVar.zzo() - jZzn);
        zzes zzesVar = this.zzb;
        zzesVar.zza(iMin);
        zzafqVar.zzi(zzesVar.zzi(), 0, iMin);
        int iZze = zzesVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzesVar.zzd() >= 188 && (iZza2 = (iZza = zzarc.zza(zzesVar.zzi(), zzesVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzarc.zzb(zzesVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j) {
                    return j3 == -9223372036854775807L ? zzaez.zza(jZze, jZzn) : zzaez.zzc(jZzn + j4);
                }
                j4 = iZza;
                if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jZze > j) {
                    return zzaez.zzc(jZzn + j4);
                }
                j3 = jZze;
            }
            zzesVar.zzh(iZza2);
            j2 = iZza2;
        }
        return j3 != -9223372036854775807L ? zzaez.zzb(j3, jZzn + j2) : zzaez.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzb() {
        byte[] bArr = zzfk.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
