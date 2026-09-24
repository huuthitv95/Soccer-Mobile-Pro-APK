package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzbtn {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbtw zzc;
    private zzbtw zzd;

    private static final Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zze(Context context) {
        if (((Boolean) zzbkk.zzc.zze()).booleanValue()) {
            return false;
        }
        return com.google.android.gms.ads.internal.util.zzs.zzk(zzd(context)).zza().toLowerCase(Locale.ROOT).equals("ru");
    }

    public final zzbtw zza(Context context, VersionInfoParcel versionInfoParcel, zzfpv zzfpvVar) {
        zzbtw zzbtwVar;
        String str;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                Context contextZzd = zzd(context);
                if (zze(context)) {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzc);
                } else {
                    str = (String) zzbko.zza.zze();
                }
                this.zzd = new zzbtw(contextZzd, versionInfoParcel, str, zzfpvVar);
            }
            zzbtwVar = this.zzd;
        }
        return zzbtwVar;
    }

    public final zzbtw zzb(Context context, VersionInfoParcel versionInfoParcel, zzfpv zzfpvVar) {
        zzbtw zzbtwVar;
        String str;
        synchronized (this.zza) {
            if (this.zzc == null) {
                if (zze(context)) {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzc);
                } else if (((Boolean) zzbkk.zzg.zze()).booleanValue()) {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zza);
                } else {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzb);
                }
                this.zzc = new zzbtw(zzd(context), versionInfoParcel, str, zzfpvVar);
            }
            zzbtwVar = this.zzc;
        }
        return zzbtwVar;
    }

    public final void zzc() {
        synchronized (this.zza) {
            zzbtw zzbtwVar = this.zzc;
            if (zzbtwVar != null) {
                zzbtwVar.zzc();
                this.zzc = null;
            }
        }
    }
}
