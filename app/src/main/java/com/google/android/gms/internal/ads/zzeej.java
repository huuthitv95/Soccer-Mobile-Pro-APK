package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeej implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzeej(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzeej zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzeej(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        zzfoy zzfoyVar = (zzfoy) this.zza.zzb();
        final CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzt.zzf().zza((Context) this.zzb.zzb());
        zzfos zzfosVar = zzfos.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfoyVar);
        return zzfoj.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                CookieManager cookieManager = cookieManagerZza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbz));
            }
        }, zzfosVar, zzfoyVar).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzeeb.zza).zzi();
    }
}
