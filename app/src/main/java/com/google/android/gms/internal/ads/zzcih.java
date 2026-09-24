package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcih implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzchb zzchbVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcig zzcigVar = (zzcig) it.next();
            if (zzcigVar.zza == zzchbVar) {
                arrayList.add(zzcigVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcig) it2.next()).zzb.zzl();
        }
        return true;
    }

    final zzcig zzb(zzchb zzchbVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcig zzcigVar = (zzcig) it.next();
            if (zzcigVar.zza == zzchbVar) {
                return zzcigVar;
            }
        }
        return null;
    }

    public final void zzc(zzcig zzcigVar) {
        this.zza.add(zzcigVar);
    }

    public final void zzd(zzcig zzcigVar) {
        this.zza.remove(zzcigVar);
    }
}
