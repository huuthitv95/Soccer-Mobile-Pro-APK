package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzls {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzls$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
        public static void $default$zza(zzls _this, zzpz zzpzVar) {
            throw new IllegalStateException("onPrepared not implemented");
        }

        public static void $default$zzb(zzls _this, zzlr zzlrVar, zzzf zzzfVar, zzaas[] zzaasVarArr) {
            throw new IllegalStateException("onTracksSelected not implemented");
        }

        public static void $default$zzc(zzls _this, zzpz zzpzVar) {
            throw new IllegalStateException("onStopped not implemented");
        }

        public static void $default$zzd(zzls _this, zzpz zzpzVar) {
            throw new IllegalStateException("onReleased not implemented");
        }

        public static long $default$zzf(zzls _this, zzpz zzpzVar) {
            throw new IllegalStateException("getBackBufferDurationUs not implemented");
        }

        public static boolean $default$zzg(zzls _this, zzpz zzpzVar) {
            throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
        }

        public static boolean $default$zzh(zzls _this, zzlr zzlrVar) {
            long j = zzlrVar.zzd;
            throw null;
        }

        public static boolean $default$zzi(zzls _this, zzlr zzlrVar) {
            zzbf zzbfVar = zzlrVar.zzb;
            throw null;
        }

        public static boolean $default$zzj(zzls _this, zzpz zzpzVar, zzbf zzbfVar, zzxc zzxcVar, long j) {
            zzef.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
            return false;
        }
    }

    void zza(zzpz zzpzVar);

    void zzb(zzlr zzlrVar, zzzf zzzfVar, zzaas[] zzaasVarArr);

    void zzc(zzpz zzpzVar);

    void zzd(zzpz zzpzVar);

    zzabd zze(zzpz zzpzVar);

    long zzf(zzpz zzpzVar);

    boolean zzg(zzpz zzpzVar);

    boolean zzh(zzlr zzlrVar);

    boolean zzi(zzlr zzlrVar);

    boolean zzj(zzpz zzpzVar, zzbf zzbfVar, zzxc zzxcVar, long j);
}
