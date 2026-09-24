package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzmw {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzmw$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
        public static void $default$zzv(zzmw _this, zzmv zzmvVar) {
        }

        public static void $default$zzw(zzmw _this) {
        }

        public static boolean zzac(int i, boolean z) {
            int i2 = i & 7;
            if (i2 != 4) {
                return z && i2 == 3;
            }
            return true;
        }
    }

    String zzU();

    int zza();

    int zzad(zzv zzvVar) throws zzje;

    int zzu() throws zzje;

    void zzv(zzmv zzmvVar);

    void zzw();
}
