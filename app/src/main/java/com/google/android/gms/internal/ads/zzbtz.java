package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbtz implements zzbpu {
    final /* synthetic */ zzbua zza;
    private final zzbtc zzb;
    private final zzcfk zzc;

    public zzbtz(zzbua zzbuaVar, zzbtc zzbtcVar, zzcfk zzcfkVar) {
        Objects.requireNonNull(zzbuaVar);
        this.zza = zzbuaVar;
        this.zzb = zzbtcVar;
        this.zzc = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbtl());
            } else {
                this.zzc.zzd(new zzbtl(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.zzb.zza();
        }
    }
}
