package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzifs implements Iterator {
    private final ArrayDeque zza;
    private zzick zzb;

    /* synthetic */ zzifs(zzicn zzicnVar, byte[] bArr) {
        if (!(zzicnVar instanceof zzift)) {
            this.zza = null;
            this.zzb = (zzick) zzicnVar;
            return;
        }
        zzift zziftVar = (zzift) zzicnVar;
        ArrayDeque arrayDeque = new ArrayDeque(zziftVar.zzp());
        this.zza = arrayDeque;
        arrayDeque.push(zziftVar);
        this.zzb = zzb(zziftVar.zzo());
    }

    private final zzick zzb(zzicn zzicnVar) {
        while (zzicnVar instanceof zzift) {
            zzift zziftVar = (zzift) zzicnVar;
            this.zza.push(zziftVar);
            zzicnVar = zziftVar.zzo();
        }
        return (zzick) zzicnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzick next() {
        zzick zzickVarZzb;
        zzick zzickVar = this.zzb;
        if (zzickVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzickVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzickVarZzb = zzb(((zzift) arrayDeque.pop()).zzF());
        } while (zzickVarZzb.zzs());
        this.zzb = zzickVarZzb;
        return zzickVar;
    }
}
