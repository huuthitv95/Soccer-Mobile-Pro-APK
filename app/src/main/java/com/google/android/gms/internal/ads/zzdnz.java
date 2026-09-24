package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdnz implements zzbpe {
    private final WeakReference zza;
    private final WeakReference zzb;

    /* synthetic */ zzdnz(zzdob zzdobVar, View view, byte[] bArr) {
        this.zza = new WeakReference(zzdobVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzor)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        zzdob zzdobVar = (zzdob) this.zza.get();
        if (zzdobVar == null) {
            return;
        }
        zzdobVar.zzC().zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzor)).booleanValue()) {
            zzdobVar.zzB((View) this.zzb.get());
        }
    }
}
