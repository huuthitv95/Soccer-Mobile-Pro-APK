package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzglm {
    private final zzauq zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzglm(zzauq zzauqVar, long j, long j2, String str) {
        this.zza = zzauqVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = str;
    }

    static /* synthetic */ zzglm zza(zzauq zzauqVar, byte[] bArr, boolean z) throws zzaus, zzauo {
        zzauqVar.zza();
        zzauqVar.zzb(bArr);
        List list = (List) zzauqVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzauqVar.zzd(jLongValue, Optional.empty());
        String strZza = zzgdj.zza(zzaut.zza(), false);
        int length = strZza.length();
        String str = true != z ? "" : "-s";
        StringBuilder sb = new StringBuilder(length + 12 + str.length());
        sb.append("3.869425873.");
        sb.append(strZza);
        sb.append(str);
        return new zzglm(zzauqVar, jLongValue2, jLongValue3, sb.toString());
    }

    final /* synthetic */ String zzb(Map map) {
        return zzgdj.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    final /* synthetic */ void zzc(Map map) throws zzaus, zzauo {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    final /* synthetic */ String zzd() {
        return this.zzd;
    }
}
