package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzatq {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzatq(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }

    static zzatq zza(zzatr zzatrVar) throws IOException {
        if (zzatt.zzi(zzatrVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzatt.zzm(zzatrVar);
        String strZzm2 = zzatt.zzm(zzatrVar);
        long jZzk = zzatt.zzk(zzatrVar);
        long jZzk2 = zzatt.zzk(zzatrVar);
        long jZzk3 = zzatt.zzk(zzatrVar);
        long jZzk4 = zzatt.zzk(zzatrVar);
        int iZzi = zzatt.zzi(zzatrVar);
        if (iZzi < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzi).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(iZzi);
            throw new IOException(sb.toString());
        }
        List arrayList = iZzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iZzi; i++) {
            arrayList.add(new zzasp(zzatt.zzm(zzatrVar).intern(), zzatt.zzm(zzatrVar).intern()));
        }
        return new zzatq(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    zzatq(String str, zzasg zzasgVar) {
        String str2 = zzasgVar.zzb;
        long j = zzasgVar.zzc;
        long j2 = zzasgVar.zzd;
        long j3 = zzasgVar.zze;
        long j4 = zzasgVar.zzf;
        List arrayList = zzasgVar.zzh;
        if (arrayList == null) {
            Map map = zzasgVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzasp((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }
}
