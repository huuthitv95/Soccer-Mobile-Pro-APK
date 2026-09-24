package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfwi extends zzfwd {
    public zzfwi(zzfvw zzfvwVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfvwVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfvw zzfvwVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfvo.zzg(jSONObject, zzfvwVar.zzd())) {
            return null;
        }
        zzfvwVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwe, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfwe
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfus zzfusVarZza;
        if (!TextUtils.isEmpty(str) && (zzfusVarZza = zzfus.zza()) != null) {
            for (zzfty zzftyVar : zzfusVarZza.zze()) {
                if (this.zza.contains(zzftyVar.zzh())) {
                    zzftyVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
