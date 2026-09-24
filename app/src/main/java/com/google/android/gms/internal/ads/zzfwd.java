package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfwd extends zzfwe {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfwd(zzfvw zzfvwVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfvwVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
