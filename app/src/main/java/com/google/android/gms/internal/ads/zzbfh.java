package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbfh implements Comparator {
    zzbfh(zzbfj zzbfjVar) {
        Objects.requireNonNull(zzbfjVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbfm zzbfmVar = (zzbfm) obj;
        zzbfm zzbfmVar2 = (zzbfm) obj2;
        int i = zzbfmVar.zzc - zzbfmVar2.zzc;
        return i != 0 ? i : Long.compare(zzbfmVar.zza, zzbfmVar2.zza);
    }
}
