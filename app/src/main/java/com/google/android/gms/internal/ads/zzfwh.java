package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfwh extends zzfwd {
    public zzfwh(zzfvw zzfvwVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfvwVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfus zzfusVarZza = zzfus.zza();
        if (zzfusVarZza != null) {
            for (zzfty zzftyVar : zzfusVarZza.zze()) {
                if (this.zza.contains(zzftyVar.zzh())) {
                    zzftyVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwe, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfwe
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
