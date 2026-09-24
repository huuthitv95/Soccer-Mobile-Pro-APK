package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvi implements zzimi {
    private final zzcvg zza;

    private zzcvi(zzcvg zzcvgVar) {
        this.zza = zzcvgVar;
    }

    public static zzcvi zzc(zzcvg zzcvgVar) {
        return new zzcvi(zzcvgVar);
    }

    public static View zzd(zzcvg zzcvgVar) {
        View viewZzb = zzcvgVar.zzb();
        zzimq.zzb(viewZzb);
        return viewZzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
