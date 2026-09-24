package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzifz implements Iterator {
    final /* synthetic */ zzigb zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzifz(zzigb zzigbVar, byte[] bArr) {
        Objects.requireNonNull(zzigbVar);
        this.zza = zzigbVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzigb zzigbVar = this.zza;
        if (i >= zzigbVar.zzj()) {
            return !zzigbVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzigb zzigbVar = this.zza;
        return i < zzigbVar.zzj() ? (zzify) zzigbVar.zzi()[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzigb zzigbVar = this.zza;
        zzigbVar.zzh();
        int i = this.zzb;
        if (i >= zzigbVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzigbVar.zzg(i);
        }
    }
}
