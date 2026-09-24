package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzmq {
    private final zzmp zza;
    private final zzmo zzb;
    private final zzbf zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzmq(zzmo zzmoVar, zzmp zzmpVar, zzbf zzbfVar, int i, zzdo zzdoVar, Looper looper) {
        this.zzb = zzmoVar;
        this.zza = zzmpVar;
        this.zzc = zzbfVar;
        this.zzf = looper;
        this.zzg = i;
    }

    public final zzmp zza() {
        return this.zza;
    }

    public final zzmq zzb(int i) {
        zzgsw.zzi(!this.zzh);
        this.zzd = i;
        return this;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzmq zzd(Object obj) {
        zzgsw.zzi(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final Object zze() {
        return this.zze;
    }

    public final Looper zzf() {
        return this.zzf;
    }

    public final zzmq zzg() {
        zzgsw.zzi(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z) {
        this.zzi = z | this.zzi;
        notifyAll();
    }
}
