package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfto extends zzgvr {
    private final LinkedList zza = new LinkedList();

    @Override // com.google.android.gms.internal.ads.zzgvo, java.util.Collection, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzfsy zzfsyVar = (zzfsy) obj;
        if (zzfsyVar.zzf() != 3) {
            this.zza.add(zzfsyVar);
            return true;
        }
        LinkedList linkedList = this.zza;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zzfsy zzfsyVar2 = (zzfsy) listIterator.next();
            if (zzfsyVar2.zzf() == 3) {
                double dZze = zzfsyVar2.zze();
                double dZze2 = zzfsyVar.zze();
                if (dZze < dZze2 || (dZze == dZze2 && zzfsyVar2.zzc() > zzfsyVar.zzc())) {
                    listIterator.set(zzfsyVar);
                    zzfsyVar = zzfsyVar2;
                }
            }
        }
        linkedList.add(zzfsyVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public final Queue zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvo, com.google.android.gms.internal.ads.zzgvq
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr, com.google.android.gms.internal.ads.zzgvo
    public final /* synthetic */ Collection zzc() {
        return this.zza;
    }
}
