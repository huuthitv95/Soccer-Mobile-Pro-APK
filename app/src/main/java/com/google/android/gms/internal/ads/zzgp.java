package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgp {
    private final boolean zza;

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    private zzgp(zzgs zzgsVar, zzgr zzgrVar) throws zzgq {
        int i = zzgrVar.zza;
        boolean z = false;
        zzgsw.zza(i == 6 || i == 3);
        int iMin = Math.min(4, zzgrVar.zzb.remaining());
        byte[] bArr = new byte[iMin];
        zzgrVar.zzb.asReadOnlyBuffer().get(bArr);
        zzer zzerVar = new zzer(bArr, iMin);
        zzgt.zzb(zzgsVar.zza);
        if (!zzerVar.zzi()) {
            int iZzj = zzerVar.zzj(2);
            boolean zZzi = zzerVar.zzi();
            zzgt.zzb(zzgsVar.zzb);
            if (zZzi) {
                boolean zZzi2 = (iZzj == 3 || iZzj == 0) ? true : zzerVar.zzi();
                zzerVar.zzg();
                zzgt.zzb(!zzgsVar.zzd);
                if (zzerVar.zzi()) {
                    zzgt.zzb(!zzgsVar.zze);
                    zzerVar.zzg();
                }
                zzgt.zzb(zzgsVar.zzc);
                if (iZzj != 3) {
                    zzerVar.zzg();
                }
                zzerVar.zzh(zzgsVar.zzf);
                if (iZzj != 2 && iZzj != 0 && !zZzi2) {
                    zzerVar.zzh(3);
                }
                if (iZzj == 3 || iZzj == 0 || zzerVar.zzj(8) != 0) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        this.zza = z;
    }

    public static zzgp zzb(zzgs zzgsVar, zzgr zzgrVar) {
        try {
            return new zzgp(zzgsVar, zzgrVar);
        } catch (zzgq unused) {
            return null;
        }
    }

    public final boolean zza() {
        return this.zza;
    }
}
