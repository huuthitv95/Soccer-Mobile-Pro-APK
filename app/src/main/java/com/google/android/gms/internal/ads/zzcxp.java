package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxp implements zzeos {
    public final List zza;

    public zzcxp(zzcxh zzcxhVar) {
        this.zza = Collections.singletonList(zzhbi.zza(zzcxhVar));
    }

    public zzcxp(List list) {
        this.zza = list;
    }

    public static zzelg zza(zzenm zzenmVar) {
        return new zzelh(zzenmVar, zzcxo.zza);
    }

    public static zzelg zzb(zzelg zzelgVar) {
        return new zzelh(zzelgVar, zzcxn.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeos
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzhbi.zzr((ListenableFuture) it.next(), new zzcxm(this), zzhbz.zza());
        }
    }
}
