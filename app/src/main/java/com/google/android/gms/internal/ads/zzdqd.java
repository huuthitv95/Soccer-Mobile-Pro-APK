package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdqd implements zzblf {
    final /* synthetic */ zzdre zza;
    final /* synthetic */ ViewGroup zzb;

    zzdqd(zzdre zzdreVar, ViewGroup viewGroup) {
        this.zza = zzdreVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zza() {
        zzgvz zzgvzVar = zzdqc.zza;
        zzdre zzdreVar = this.zza;
        Map mapZzj = zzdreVar.zzj();
        if (mapZzj == null) {
            return;
        }
        int size = zzgvzVar.size();
        int i = 0;
        while (i < size) {
            Object obj = mapZzj.get((String) zzgvzVar.get(i));
            i++;
            if (obj != null) {
                zzdreVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final JSONObject zzc() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final JSONObject zzd() {
        return this.zza.zzp();
    }
}
