package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdtt implements zzblf {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdtu zzb;

    zzdtt(zzdtu zzdtuVar, String str) {
        Objects.requireNonNull(zzdtuVar);
        this.zzb = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zza() {
        zzdtu zzdtuVar = this.zzb;
        if (zzdtuVar.zzc() != null) {
            zzdtuVar.zzc().zza(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final JSONObject zzd() {
        return null;
    }
}
