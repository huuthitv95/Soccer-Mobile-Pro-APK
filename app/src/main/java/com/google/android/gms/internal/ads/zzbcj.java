package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcj extends zzbcy {
    private final zzbao zzh;
    private final long zzi;
    private final long zzj;

    public zzbcj(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2, zzbao zzbaoVar, long j, long j2) {
        super(zzbblVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", zzaxfVar, i, 11);
        this.zzh = zzbaoVar;
        this.zzi = j;
        this.zzj = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzbao zzbaoVar = this.zzh;
        if (zzbaoVar != null) {
            zzbam zzbamVar = new zzbam((String) this.zze.invoke(null, zzbaoVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzaxf zzaxfVar = this.zzd;
            synchronized (zzaxfVar) {
                zzaxfVar.zzf(zzbamVar.zza.longValue());
                if (zzbamVar.zzb.longValue() >= 0) {
                    zzaxfVar.zzW(zzbamVar.zzb.longValue());
                }
                if (zzbamVar.zzc.longValue() >= 0) {
                    zzaxfVar.zzX(zzbamVar.zzc.longValue());
                }
            }
        }
    }
}
