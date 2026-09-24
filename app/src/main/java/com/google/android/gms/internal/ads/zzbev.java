package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzbev {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzbeu zzbeuVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbeuVar);
        }
    }

    public final boolean zzb(zzbeu zzbeuVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbeu zzbeuVar2 = (zzbeu) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze() && !zzbeuVar.equals(zzbeuVar2) && zzbeuVar2.zzc().equals(zzbeuVar.zzc())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzbeuVar.equals(zzbeuVar2) && zzbeuVar2.zzb().equals(zzbeuVar.zzb())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzbeu zzbeuVar) {
        synchronized (this.zzb) {
            List list = this.zzc;
            if (list.size() >= 10) {
                int size = list.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                String string = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                list.remove(0);
            }
            int i2 = this.zza;
            this.zza = i2 + 1;
            zzbeuVar.zzk(i2);
            zzbeuVar.zzh();
            list.add(zzbeuVar);
        }
    }
}
