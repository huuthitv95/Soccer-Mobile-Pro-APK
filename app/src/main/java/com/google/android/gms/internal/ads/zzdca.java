package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdca {
    public static final zzcdb zza(Context context, VersionInfoParcel versionInfoParcel, zzfjt zzfjtVar, zzccx zzccxVar) {
        zzccy zzccyVar = zzfjtVar.zzA;
        if (zzccyVar == null) {
            return null;
        }
        zzfjy zzfjyVar = zzfjtVar.zzs;
        return new zzccw(context, versionInfoParcel, zzccyVar, zzfjyVar != null ? zzfjyVar.zzb : null, zzccxVar);
    }
}
