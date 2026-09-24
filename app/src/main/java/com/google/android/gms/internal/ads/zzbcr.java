package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcr extends zzbcy {
    public zzbcr(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2) {
        super(zzbblVar, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", zzaxfVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxf zzaxfVar = this.zzd;
        synchronized (zzaxfVar) {
            zzbbg zzbbgVar = new zzbbg((String) this.zze.invoke(null, null));
            zzaxfVar.zzF(zzbbgVar.zza.longValue());
            zzaxfVar.zzG(zzbbgVar.zzb.longValue());
        }
    }
}
