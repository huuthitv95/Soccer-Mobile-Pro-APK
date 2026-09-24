package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaog {
    public static zzaoh zza(zzaoh zzaohVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzaohVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzaoh) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzaoh zzaohVar2 = new zzaoh();
                while (i < length2) {
                    zzaohVar2.zzr((zzaoh) map.get(strArr[i]));
                    i++;
                }
                return zzaohVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaohVar.zzr((zzaoh) map.get(strArr[0]));
                return zzaohVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    zzaohVar.zzr((zzaoh) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return zzaohVar;
    }
}
