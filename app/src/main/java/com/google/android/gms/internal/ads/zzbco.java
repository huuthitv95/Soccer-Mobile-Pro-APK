package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbco extends zzbcy {
    private List zzh;
    private final Context zzi;

    public zzbco(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2, Context context) {
        super(zzbblVar, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", zzaxfVar, i, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxf zzaxfVar = this.zzd;
        zzaxfVar.zzq(-1L);
        zzaxfVar.zzr(-1L);
        Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, contextZzb);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzaxfVar) {
            zzaxfVar.zzq(((Long) this.zzh.get(0)).longValue());
            zzaxfVar.zzr(((Long) this.zzh.get(1)).longValue());
        }
    }
}
