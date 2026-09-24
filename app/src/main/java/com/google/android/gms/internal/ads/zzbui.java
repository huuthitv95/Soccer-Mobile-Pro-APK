package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbui implements zzhaq {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    zzbui(ListenableFuture listenableFuture, String str, zzbtp zzbtpVar, zzbto zzbtoVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzhbi.zzj(this.zzb, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzbuh
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return this.zza.zzc(obj, (zzbtj) obj2);
            }
        }, zzcff.zzh);
    }

    final /* synthetic */ ListenableFuture zzc(Object obj, zzbtj zzbtjVar) throws JSONException {
        zzcfk zzcfkVar = new zzcfk();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbpd.zzo.zzb(string, new zzbug(this, zzcfkVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbtjVar.zzb(this.zza, jSONObject);
        return zzcfkVar;
    }
}
