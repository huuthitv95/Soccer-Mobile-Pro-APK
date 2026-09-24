package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C11744X3;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdnx implements zzbpe {
    private final WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        zzdob zzdobVar = (zzdob) this.zza.get();
        if (zzdobVar != null && "_ac".equals((String) map.get(C11744X3.i.f26373j0))) {
            zzdobVar.zzD().onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmf)).booleanValue()) {
                zzdobVar.zzE().zzdu();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdobVar.zzE().zzdR();
            }
        }
    }
}
