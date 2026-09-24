package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcje implements zzhj {
    private final zzhj zza;
    private final long zzb;
    private final zzhj zzc;
    private long zzd;
    private Uri zze;

    zzcje(zzhj zzhjVar, int i, zzhj zzhjVar2) {
        this.zza = zzhjVar;
        this.zzb = i;
        this.zzc = zzhjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + ((long) iZza);
            this.zzd = j3;
            i3 = iZza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int iZza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + iZza2;
        this.zzd += (long) iZza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final long zzb(zzhn zzhnVar) throws IOException {
        Uri uri;
        zzhn zzhnVar2;
        Uri uri2 = zzhnVar.zza;
        this.zze = uri2;
        long j = zzhnVar.zze;
        long j2 = this.zzb;
        zzhn zzhnVar3 = null;
        if (j >= j2) {
            uri = uri2;
            zzhnVar2 = null;
        } else {
            long j3 = zzhnVar.zzf;
            long jMin = j2 - j;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            uri = uri2;
            zzhnVar2 = new zzhn(uri, j, jMin, null);
        }
        long j4 = zzhnVar.zzf;
        if (j4 == -1 || j + j4 > j2) {
            zzhnVar3 = new zzhn(uri, Math.max(j2, j), j4 != -1 ? Math.min(j4, (j + j4) - j2) : -1L, null);
        }
        long jZzb = zzhnVar2 != null ? this.zza.zzb(zzhnVar2) : 0L;
        long jZzb2 = zzhnVar3 != null ? this.zzc.zzb(zzhnVar3) : 0L;
        this.zzd = j;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zze(zzih zzihVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Map zzj() {
        return zzgwc.zza();
    }
}
