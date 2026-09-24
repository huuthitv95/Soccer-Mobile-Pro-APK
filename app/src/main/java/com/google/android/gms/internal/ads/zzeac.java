package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeac {
    private final Map zza = new ConcurrentHashMap();

    zzeac() {
    }

    public final synchronized void zza(long j, int i, long j2) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziK)).booleanValue()) {
            if (i == 2) {
                zzeaa zzeaaVar = new zzeaa();
                zzeaaVar.zza(j);
                zzeaaVar.zzb(1);
                zzeaf zzeafVarZzc = zzeaaVar.zzc();
                Map map = this.zza;
                ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzeafVarZzc);
                if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                    arrayDeque2.removeFirst();
                    if (arrayDeque2.isEmpty()) {
                        map.remove(zzeafVarZzc);
                    }
                }
                i = 2;
            }
            zzeaa zzeaaVar2 = new zzeaa();
            zzeaaVar2.zza(j);
            zzeaaVar2.zzb(i);
            zzeaf zzeafVarZzc2 = zzeaaVar2.zzc();
            int iZzb = zzeafVarZzc2.zzb();
            if (iZzb != 0) {
                if (iZzb == 1) {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziR)).intValue();
                } else if (iZzb != 2) {
                    iIntValue = iZzb != 3 ? 0 : ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziT)).intValue();
                } else {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziS)).intValue();
                }
            }
            if (iIntValue > 0) {
                Map map2 = this.zza;
                ArrayDeque arrayDeque3 = (ArrayDeque) map2.get(zzeafVarZzc2);
                if (arrayDeque3 == null) {
                    arrayDeque3 = new ArrayDeque();
                    map2.put(zzeafVarZzc2, arrayDeque3);
                }
                arrayDeque3.addLast(Long.valueOf(j2));
                while (arrayDeque3.size() > iIntValue) {
                    arrayDeque3.removeFirst();
                }
                zzc();
                int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziU)).intValue();
                if (iIntValue2 <= 0) {
                    map2.clear();
                    return;
                }
                while (true) {
                    Iterator it = map2.values().iterator();
                    int size = 0;
                    while (it.hasNext()) {
                        size += ((ArrayDeque) it.next()).size();
                    }
                    if (size <= iIntValue2) {
                        break;
                    }
                    if (!map2.isEmpty()) {
                        Long l2 = Long.MAX_VALUE;
                        Map.Entry entry = null;
                        for (Map.Entry entry2 : map2.entrySet()) {
                            ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                            if (!arrayDeque4.isEmpty() && (l = (Long) arrayDeque4.peekFirst()) != null && l.longValue() < l2.longValue()) {
                                entry = entry2;
                                l2 = l;
                            }
                        }
                        if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                            arrayDeque.removeFirst();
                            if (arrayDeque.isEmpty()) {
                                map2.remove(entry.getKey());
                            }
                        }
                    }
                }
            }
        }
    }

    public final synchronized Map zzb() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziK)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                map.put((zzeaf) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    final void zzc() {
        long jLongValue;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzeaf zzeafVar = (zzeaf) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iZzb = zzeafVar.zzb();
            if (iZzb == 0) {
                jLongValue = 0;
            } else if (iZzb == 1) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziO)).longValue();
            } else if (iZzb == 2) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziP)).longValue();
            } else if (iZzb != 3) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziQ)).longValue();
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
