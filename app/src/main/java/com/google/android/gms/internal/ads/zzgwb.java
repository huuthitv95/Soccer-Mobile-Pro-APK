package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgwb {
    Object[] zza;
    int zzb;
    zzgwa zzc;

    public zzgwb() {
        this(4);
    }

    private final void zze(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzgvu.zze(length, i2));
        }
    }

    private final zzgwc zzf(boolean z) {
        zzgwa zzgwaVar;
        zzgwa zzgwaVar2;
        if (z && (zzgwaVar2 = this.zzc) != null) {
            throw zzgwaVar2.zza();
        }
        zzgxz zzgxzVarZzk = zzgxz.zzk(this.zzb, this.zza, this);
        if (!z || (zzgwaVar = this.zzc) == null) {
            return zzgxzVarZzk;
        }
        throw zzgwaVar.zza();
    }

    public final zzgwb zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzguv.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final zzgwb zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgwc zzc() {
        return zzf(true);
    }

    public final zzgwc zzd() {
        return zzf(false);
    }

    zzgwb(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
