package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaeo {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzaen zza(byte[] bArr) throws zzat {
        return zzb(new zzer(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaen zzb(com.google.android.gms.internal.ads.zzer r11, boolean r12) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeo.zzb(com.google.android.gms.internal.ads.zzer, boolean):com.google.android.gms.internal.ads.zzaen");
    }

    private static int zzc(zzer zzerVar) {
        int iZzj = zzerVar.zzj(5);
        return iZzj == 31 ? zzerVar.zzj(6) + 32 : iZzj;
    }

    private static int zzd(zzer zzerVar) throws zzat {
        int iZzj = zzerVar.zzj(4);
        if (iZzj == 15) {
            if (zzerVar.zzc() >= 24) {
                return zzerVar.zzj(24);
            }
            throw zzat.zzb("AAC header insufficient data", null);
        }
        if (iZzj < 13) {
            return zzb[iZzj];
        }
        throw zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }
}
