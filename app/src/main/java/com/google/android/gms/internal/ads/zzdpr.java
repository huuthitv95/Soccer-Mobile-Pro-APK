package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpr {
    public static final zzdpr zza = new zzdpr(new zzdpq());
    private final zzbmq zzb;
    private final zzbmn zzc;
    private final zzbnd zzd;
    private final zzbna zze;
    private final zzbry zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdpr(zzdpq zzdpqVar) {
        this.zzb = zzdpqVar.zza;
        this.zzc = zzdpqVar.zzb;
        this.zzd = zzdpqVar.zzc;
        this.zzg = new SimpleArrayMap(zzdpqVar.zzf);
        this.zzh = new SimpleArrayMap(zzdpqVar.zzg);
        this.zze = zzdpqVar.zzd;
        this.zzf = zzdpqVar.zze;
    }

    /* synthetic */ zzdpr(zzdpq zzdpqVar, byte[] bArr) {
        this(zzdpqVar);
    }

    public final zzbmq zza() {
        return this.zzb;
    }

    public final zzbmn zzb() {
        return this.zzc;
    }

    public final zzbnd zzc() {
        return this.zzd;
    }

    public final zzbna zzd() {
        return this.zze;
    }

    public final zzbry zze() {
        return this.zzf;
    }

    public final zzbmw zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzbmw) this.zzg.get(str);
    }

    public final zzbmt zzg(String str) {
        return (zzbmt) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        SimpleArrayMap simpleArrayMap = this.zzg;
        ArrayList arrayList = new ArrayList(simpleArrayMap.size());
        for (int i = 0; i < simpleArrayMap.size(); i++) {
            arrayList.add((String) simpleArrayMap.keyAt(i));
        }
        return arrayList;
    }
}
