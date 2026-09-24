package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzias extends zziat implements Iterable {
    private final ArrayList zza = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzias) && ((zzias) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final void zza(zziat zziatVar) {
        this.zza.add(zziatVar);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zziat zzc(int i) {
        return (zziat) this.zza.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zziat
    public final String zzd() {
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        if (size == 1) {
            return ((zziat) arrayList.get(0)).zzd();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 37);
        sb.append("Array must have size 1, but has size ");
        sb.append(size);
        throw new IllegalStateException(sb.toString());
    }
}
