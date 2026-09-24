package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgun extends zzgul implements ListIterator {
    final /* synthetic */ zzguo zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgun(zzguo zzguoVar) {
        super(zzguoVar);
        Objects.requireNonNull(zzguoVar);
        this.zzd = zzguoVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzguo zzguoVar = this.zzd;
        boolean zIsEmpty = zzguoVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzgup zzgupVar = zzguoVar.zzf;
        zzgupVar.zzq(zzgupVar.zzp() + 1);
        if (zIsEmpty) {
            zzguoVar.zzc();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgun(zzguo zzguoVar, int i) {
        super(zzguoVar, ((List) zzguoVar.zzb).listIterator(i));
        Objects.requireNonNull(zzguoVar);
        this.zzd = zzguoVar;
    }
}
