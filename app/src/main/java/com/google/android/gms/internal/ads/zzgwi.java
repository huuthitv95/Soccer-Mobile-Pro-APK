package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgwi extends zzgvt {
    Object[] zzd;
    private int zze;

    public zzgwi() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt, com.google.android.gms.internal.ads.zzgvu
    public final /* bridge */ /* synthetic */ zzgvu zzd(Object obj) {
        zzf(obj);
        return this;
    }

    zzgwi(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzgwj.zzo(i)];
    }

    public final zzgwi zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            super.zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgwj zzh() {
        zzgwj zzgwjVarZzw;
        int i = this.zzb;
        if (i == 0) {
            return zzgya.zza;
        }
        if (i == 1) {
            return new zzgyk(Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || zzgwj.zzo(i) != this.zzd.length) {
            zzgwjVarZzw = zzgwj.zzw(this.zzb, this.zza);
            this.zzb = zzgwjVarZzw.size();
        } else {
            int i2 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgwj.zzx(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.zze;
            Object[] objArr = this.zzd;
            zzgwjVarZzw = new zzgya(objArrCopyOf, i3, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgwjVarZzw;
    }

    public final zzgwi zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzo = zzgwj.zzo(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzo <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgvs.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i + 1;
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
