package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.internal.GmsLogger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzez {
    private static final GmsLogger zza = new GmsLogger("Games");

    public static void zza(String str, String str2) {
        zza.m22263d(zzi(str), str2);
    }

    public static void zzb(String str, String str2, Throwable th) {
        zza.m22264d(zzi("GamesApiManager"), "Authentication task failed", th);
    }

    public static void zzc(String str, String str2) {
        zza.m22265e(zzi(str), str2);
    }

    public static void zzd(String str, String str2, Throwable th) {
        zza.m22266e(zzi(str), str2, th);
    }

    public static void zze(String str, String str2, Throwable th) {
        zza.m22268i(zzi("SnapshotContentsEntity"), "Failed to write snapshot data", th);
    }

    public static void zzf(String str, String str2) {
        zza.m22269v(zzi(str), str2);
    }

    public static void zzg(String str, String str2) {
        zza.m22271w(zzi(str), str2);
    }

    public static void zzh(String str, String str2, Throwable th) {
        zza.m22272w(zzi(str), str2, th);
    }

    private static String zzi(String str) {
        return String.format("%s[%s]", "PlayGamesServices", str);
    }
}
