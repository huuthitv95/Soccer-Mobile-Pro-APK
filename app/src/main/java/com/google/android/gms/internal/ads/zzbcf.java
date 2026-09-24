package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcf extends zzbcy {
    private final zzbbm zzh;

    public zzbcf(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2, zzbbm zzbbmVar) {
        super(zzbblVar, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", zzaxfVar, i, 85);
        this.zzh = zzbbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Method method = this.zze;
        zzbbm zzbbmVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzbbmVar.zzf()), Long.valueOf(zzbbmVar.zzg()), Long.valueOf(zzbbmVar.zzi()), Long.valueOf(zzbbmVar.zzh()));
        zzaxf zzaxfVar = this.zzd;
        synchronized (zzaxfVar) {
            zzaxfVar.zzY(jArr[0]);
            zzaxfVar.zzZ(jArr[1]);
        }
    }
}
