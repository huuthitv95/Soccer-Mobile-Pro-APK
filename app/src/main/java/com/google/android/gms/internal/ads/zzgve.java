package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgve extends zzguq {
    final /* synthetic */ zzgvg zza;
    private final Object zzb;
    private int zzc;

    zzgve(zzgvg zzgvgVar, int i) {
        Objects.requireNonNull(zzgvgVar);
        this.zza = zzgvgVar;
        this.zzb = zzgvgVar.zzo(i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zzgvg zzgvgVar = this.zza;
            if (i < zzgvgVar.size() && Objects.equals(this.zzb, zzgvgVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzguq, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzguq, java.util.Map.Entry
    public final Object getValue() {
        zzgvg zzgvgVar = this.zza;
        Map mapZzc = zzgvgVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzgvgVar.zzp(i);
    }

    @Override // com.google.android.gms.internal.ads.zzguq, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgvg zzgvgVar = this.zza;
        Map mapZzc = zzgvgVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzgvgVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgvgVar.zzp(i);
        zzgvgVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
