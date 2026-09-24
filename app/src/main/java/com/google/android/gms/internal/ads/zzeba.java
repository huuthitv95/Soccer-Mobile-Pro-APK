package com.google.android.gms.internal.ads;

import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzeba implements zzhbf {
    final /* synthetic */ zzebk zza;

    zzeba(zzebk zzebkVar) {
        Objects.requireNonNull(zzebkVar);
        this.zza = zzebkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        synchronized (this) {
            zzebk zzebkVar = this.zza;
            zzebkVar.zzn(true);
            zzebkVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzebkVar.zzo()));
            zzebkVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzebk zzebkVar = this.zza;
            zzebkVar.zzn(true);
            zzebkVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzebkVar.zzo()));
            zzebkVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzl(str);
                }
            });
        }
    }
}
