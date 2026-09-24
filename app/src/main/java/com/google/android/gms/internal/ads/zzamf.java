package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzamf implements zzagw {
    public final int zza;
    public final zzgzr zzb;

    public zzamf(int i, int[] iArr) {
        this.zza = i;
        this.zzb = iArr != null ? zzgzr.zzb(iArr) : zzgzr.zza();
    }

    public final String toString() {
        zzgzr zzgzrVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgzrVar.zzc());
        for (int i = 0; i < zzgzrVar.zzc(); i++) {
            arrayList.add(zzfk.zzz(zzgzrVar.zzd(i)));
        }
        String strZzz = zzfk.zzz(this.zza);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(strZzz.length() + 37 + string.length() + 1);
        sb.append("UnsupportedBrands{major=");
        sb.append(strZzz);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
