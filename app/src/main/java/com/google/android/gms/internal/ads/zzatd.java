package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzatd {
    public final Object zza;
    public final zzasg zzb;
    public final zzatg zzc;
    public boolean zzd;

    private zzatd(zzatg zzatgVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzatgVar;
    }

    private zzatd(Object obj, zzasg zzasgVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzasgVar;
        this.zzc = null;
    }

    public static zzatd zza(Object obj, zzasg zzasgVar) {
        return new zzatd(obj, zzasgVar);
    }

    public static zzatd zzb(zzatg zzatgVar) {
        return new zzatd(zzatgVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
