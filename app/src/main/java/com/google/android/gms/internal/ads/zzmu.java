package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzmu extends zzmp {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzmu$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
        public static long $default$zzV(zzmu _this, long j, long j2) {
            if (_this.zze() == 1) {
                return (_this.zzaa() || _this.zzab()) ? 1000000L : 10000L;
            }
            return 10000L;
        }

        public static boolean $default$zzW(zzmu _this, long j) {
            return false;
        }

        public static void $default$zzX(zzmu _this, float f, float f2) throws zzje {
        }

        public static void $default$zzY(zzmu _this) {
        }

        public static void $default$zzt(zzmu _this) {
        }
    }

    String zzU();

    long zzV(long j, long j2);

    boolean zzW(long j);

    void zzX(float f, float f2) throws zzje;

    void zzY();

    void zzZ(long j, long j2) throws zzje;

    int zza();

    boolean zzaa();

    boolean zzab();

    zzmw zzb();

    void zzc(int i, zzpz zzpzVar, zzdo zzdoVar);

    void zzcT() throws zzje;

    void zzcU(zzv[] zzvVarArr, zzyu zzyuVar, long j, long j2, zzxc zzxcVar) throws zzje;

    zzyu zzcV();

    boolean zzcW();

    zzlv zzd();

    int zze();

    void zzf(zzmx zzmxVar, zzv[] zzvVarArr, zzyu zzyuVar, long j, boolean z, boolean z2, long j2, long j3, zzxc zzxcVar) throws zzje;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j, boolean z) throws zzje;

    void zzq();

    void zzr();

    void zzs();

    void zzt();
}
