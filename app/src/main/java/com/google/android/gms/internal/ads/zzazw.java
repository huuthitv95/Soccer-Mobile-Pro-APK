package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzazw {
    public static final String zza(Context context, String str, long j, boolean z) {
        try {
            zzayq zzayqVarZza = zzayr.zza();
            zzayqVarZza.zzb(str);
            zzayqVarZza.zza("0.828153725");
            zzayqVarZza.zzd(context.getPackageName());
            zzayqVarZza.zzf((System.currentTimeMillis() - j) / 1000);
            zzayqVarZza.zzc(System.currentTimeMillis() / 1000);
            try {
                zzayqVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzayqVarZza.zze(-1L);
            }
            zzayx zzayxVarZzc = zzazh.zzc(((zzayr) zzayqVarZza.zzbu()).zzaN(), null);
            zzayxVarZzc.zzc(5);
            zzayxVarZzc.zzd(2);
            return Base64.encodeToString(((zzayy) zzayxVarZzc.zzbu()).zzaN(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
