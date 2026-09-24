package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcp extends zzbcy {
    private final boolean zzh;

    public zzbcp(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2) {
        super(zzbblVar, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", zzaxfVar, i, 61);
        this.zzh = zzbblVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        zzaxf zzaxfVar = this.zzd;
        synchronized (zzaxfVar) {
            zzaxfVar.zzQ(jLongValue);
        }
    }
}
