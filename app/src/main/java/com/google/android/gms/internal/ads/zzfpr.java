package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfpr {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzka), str);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfpi zzfpiVar) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            zzhbi.zzr(zzhba.zzw(listenableFuture), new zzfpn(zzfpiVar), zzcff.zzh);
        }
    }

    public static zzfny zzc(final zzfpi zzfpiVar) {
        return new zzfny() { // from class: com.google.android.gms.internal.ads.zzfpq
            @Override // com.google.android.gms.internal.ads.zzfny
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
                    zzfpiVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(ListenableFuture listenableFuture, zzfps zzfpsVar, zzfpi zzfpiVar) {
        zzh(listenableFuture, zzfpsVar, zzfpiVar, false);
    }

    public static void zze(ListenableFuture listenableFuture, zzfps zzfpsVar, zzfpi zzfpiVar) {
        zzh(listenableFuture, zzfpsVar, zzfpiVar, true);
    }

    public static void zzf(ListenableFuture listenableFuture, zzfps zzfpsVar, zzfpi zzfpiVar) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            zzhbi.zzr(zzhba.zzw(listenableFuture), new zzfpp(zzfpsVar, zzfpiVar), zzcff.zzh);
        }
    }

    public static int zzg(zzfkm zzfkmVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzfkmVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    private static void zzh(ListenableFuture listenableFuture, zzfps zzfpsVar, zzfpi zzfpiVar, boolean z) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            zzhbi.zzr(zzhba.zzw(listenableFuture), new zzfpo(zzfpsVar, zzfpiVar, z), zzcff.zzh);
        }
    }
}
