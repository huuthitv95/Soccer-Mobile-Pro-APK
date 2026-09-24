package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimh implements zzimr, zzimc {
    private static final Object zza = new Object();
    private volatile zzimr zzb;
    private volatile Object zzc = zza;

    private zzimh(zzimr zzimrVar) {
        this.zzb = zzimrVar;
    }

    public static zzimr zza(zzimr zzimrVar) {
        return zzimrVar instanceof zzimh ? zzimrVar : new zzimh(zzimrVar);
    }

    public static zzimc zzc(zzimr zzimrVar) {
        if (zzimrVar instanceof zzimc) {
            return (zzimc) zzimrVar;
        }
        zzimrVar.getClass();
        return new zzimh(zzimrVar);
    }

    private final synchronized Object zzd() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        Object objZzb = this.zzb.zzb();
        Object obj3 = this.zzc;
        if (obj3 != obj2 && obj3 != objZzb) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
        }
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
