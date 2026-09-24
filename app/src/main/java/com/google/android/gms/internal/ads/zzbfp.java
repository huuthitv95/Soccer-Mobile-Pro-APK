package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbfp implements Comparator {
    public zzbfp(zzbfq zzbfqVar) {
        Objects.requireNonNull(zzbfqVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbff zzbffVar = (zzbff) obj;
        zzbff zzbffVar2 = (zzbff) obj2;
        if (zzbffVar.zzb() < zzbffVar2.zzb()) {
            return -1;
        }
        if (zzbffVar.zzb() > zzbffVar2.zzb()) {
            return 1;
        }
        if (zzbffVar.zza() < zzbffVar2.zza()) {
            return -1;
        }
        if (zzbffVar.zza() > zzbffVar2.zza()) {
            return 1;
        }
        float fZzd = (zzbffVar.zzd() - zzbffVar.zzb()) * (zzbffVar.zzc() - zzbffVar.zza());
        float fZzd2 = (zzbffVar2.zzd() - zzbffVar2.zzb()) * (zzbffVar2.zzc() - zzbffVar2.zza());
        if (fZzd > fZzd2) {
            return -1;
        }
        return fZzd < fZzd2 ? 1 : 0;
    }
}
