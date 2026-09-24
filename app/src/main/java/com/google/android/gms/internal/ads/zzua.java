package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzua {
    public final int zza;
    public final zzxc zzb;
    private final CopyOnWriteArrayList zzc;

    public zzua() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzua(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzxc zzxcVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxcVar;
    }

    public final zzua zza(int i, zzxc zzxcVar) {
        return new zzua(this.zzc, 0, zzxcVar);
    }

    public final void zzb(Handler handler, zzub zzubVar) {
        this.zzc.add(new zztz(handler, zzubVar));
    }

    public final void zzc(zzub zzubVar) {
        CopyOnWriteArrayList<zztz> copyOnWriteArrayList = this.zzc;
        for (zztz zztzVar : copyOnWriteArrayList) {
            if (zztzVar.zza == zzubVar) {
                copyOnWriteArrayList.remove(zztzVar);
            }
        }
    }
}
