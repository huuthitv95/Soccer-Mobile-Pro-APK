package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafc {
    public static void zza(long j, zzes zzesVar, zzahb[] zzahbVarArr) {
        int iZzB;
        while (true) {
            if (zzesVar.zzd() <= 1) {
                return;
            }
            int iZzc = zzc(zzesVar);
            int iZzc2 = zzc(zzesVar);
            int iZzg = zzesVar.zzg() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzesVar.zzd()) {
                zzef.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzg = zzesVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzs = zzesVar.zzs();
                int iZzt = zzesVar.zzt();
                if (iZzt == 49) {
                    iZzB = zzesVar.zzB();
                    iZzt = 49;
                } else {
                    iZzB = 0;
                }
                int iZzs2 = zzesVar.zzs();
                if (iZzt == 47) {
                    zzesVar.zzk(1);
                    iZzt = 47;
                }
                boolean z = iZzs == 181 && (iZzt == 49 || iZzt == 47) && iZzs2 == 3;
                if (iZzt == 49) {
                    z &= iZzB == 1195456820;
                }
                if (z) {
                    zzb(j, zzesVar, zzahbVarArr);
                }
            }
            zzesVar.zzh(iZzg);
        }
    }

    public static void zzb(long j, zzes zzesVar, zzahb[] zzahbVarArr) {
        int iZzs = zzesVar.zzs();
        if ((iZzs & 64) != 0) {
            int i = iZzs & 31;
            zzesVar.zzk(1);
            int iZzg = zzesVar.zzg();
            for (zzahb zzahbVar : zzahbVarArr) {
                int i2 = i * 3;
                zzesVar.zzh(iZzg);
                zzahbVar.zzc(zzesVar, i2);
                zzgsw.zzi(j != -9223372036854775807L);
                zzahbVar.zze(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzes zzesVar) {
        int i = 0;
        while (zzesVar.zzd() != 0) {
            int iZzs = zzesVar.zzs();
            i += iZzs;
            if (iZzs != 255) {
                return i;
            }
        }
        return -1;
    }
}
