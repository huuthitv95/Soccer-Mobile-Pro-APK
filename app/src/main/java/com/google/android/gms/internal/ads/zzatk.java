package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzatk implements zzasw {
    private final Map zza = new HashMap();
    private final zzasj zzb;
    private final BlockingQueue zzc;
    private final zzaso zzd;

    zzatk(zzasj zzasjVar, BlockingQueue blockingQueue, zzaso zzasoVar) {
        this.zzd = zzasoVar;
        this.zzb = zzasjVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void zza(zzasx zzasxVar, zzatd zzatdVar) {
        List list;
        zzasg zzasgVar = zzatdVar.zzb;
        if (zzasgVar == null || zzasgVar.zza(System.currentTimeMillis())) {
            zzb(zzasxVar);
            return;
        }
        String strZzi = zzasxVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(strZzi);
        }
        if (list != null) {
            if (zzatj.zzb) {
                zzatj.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzasx) it.next(), zzatdVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void zzb(zzasx zzasxVar) {
        Map map = this.zza;
        String strZzi = zzasxVar.zzi();
        List list = (List) map.remove(strZzi);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzatj.zzb) {
            zzatj.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzi);
        }
        zzasx zzasxVar2 = (zzasx) list.remove(0);
        map.put(strZzi, list);
        zzasxVar2.zzu(this);
        try {
            this.zzc.put(zzasxVar2);
        } catch (InterruptedException e) {
            zzatj.zzc("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zza();
        }
    }

    final synchronized boolean zzc(zzasx zzasxVar) {
        Map map = this.zza;
        String strZzi = zzasxVar.zzi();
        if (!map.containsKey(strZzi)) {
            map.put(strZzi, null);
            zzasxVar.zzu(this);
            if (zzatj.zzb) {
                zzatj.zzb("new request, sending to network %s", strZzi);
            }
            return false;
        }
        List arrayList = (List) map.get(strZzi);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        zzasxVar.zzc("waiting-for-response");
        arrayList.add(zzasxVar);
        map.put(strZzi, arrayList);
        if (zzatj.zzb) {
            zzatj.zzb("Request for cacheKey=%s is in flight, putting on hold.", strZzi);
        }
        return true;
    }
}
