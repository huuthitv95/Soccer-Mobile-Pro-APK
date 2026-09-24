package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzeet;
import com.google.android.gms.internal.ads.zzegg;
import com.google.android.gms.internal.ads.zzhaq;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzba implements zzhaq {
    private final Executor zza;
    private final zzeet zzb;

    public zzba(Executor executor, zzeet zzeetVar) {
        this.zza = executor;
        this.zzb = zzeetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        final zzcar zzcarVar = (zzcar) obj;
        return zzhbi.zzj(this.zzb.zza(zzcarVar), new zzhaq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                zzegg zzeggVar = (zzegg) obj2;
                zzbc zzbcVar = new zzbc(new JsonReader(new InputStreamReader(zzeggVar.zza())), zzeggVar.zzb());
                try {
                    zzbcVar.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzo(zzcarVar.zza).toString();
                } catch (JSONException unused) {
                    zzbcVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzhbi.zza(zzbcVar);
            }
        }, this.zza);
    }
}
