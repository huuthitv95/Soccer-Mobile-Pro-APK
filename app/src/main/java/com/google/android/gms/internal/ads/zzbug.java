package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbug implements zzbpu {
    private final zzcfk zza;

    public zzbug(zzbui zzbuiVar, zzcfk zzcfkVar) {
        Objects.requireNonNull(zzbuiVar);
        this.zza = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbtl());
            } else {
                this.zza.zzd(new zzbtl(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
