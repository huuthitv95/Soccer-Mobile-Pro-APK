package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzfth implements Comparator {
    static final /* synthetic */ zzfth zza = new zzfth();

    private /* synthetic */ zzfth() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzfsy zzfsyVar = (zzfsy) obj2;
        zzfsy zzfsyVar2 = (zzfsy) obj;
        int iCompare = Double.compare(zzfsyVar.zze(), zzfsyVar2.zze());
        return iCompare == 0 ? Long.compare(zzfsyVar2.zzd(), zzfsyVar.zzd()) : iCompare;
    }
}
