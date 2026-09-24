package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcs extends zzbcy {
    private final zzbbs zzh;
    private long zzi;

    public zzbcs(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2, zzbbs zzbbsVar) {
        super(zzbblVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", zzaxfVar, i, 53);
        this.zzh = zzbbsVar;
        if (zzbbsVar != null) {
            this.zzi = zzbbsVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
