package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzeoc {
    private final zzhcb zzc;
    private zzeos zzf;
    private final String zzh;
    private final int zzi;
    private final zzeor zzj;
    private zzfjt zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;
    private boolean zzl = false;

    zzeoc(zzfke zzfkeVar, zzeor zzeorVar, zzhcb zzhcbVar) {
        this.zzi = zzfkeVar.zzb.zzb.zzr;
        this.zzj = zzeorVar;
        this.zzc = zzhcbVar;
        this.zzh = zzeoy.zzb(zzfkeVar);
        List list = zzfkeVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzfjt) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfjt) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi && zzf(false)) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z) {
        for (zzfjt zzfjtVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfjtVar);
            int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (z || !this.zze.contains(zzfjtVar.zzat)) {
                numValueOf.getClass();
                if (iIntValue < this.zzg) {
                    return true;
                }
                numValueOf.getClass();
                if (iIntValue > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.zza.get((zzfjt) it.next());
            int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            Integer.valueOf(iIntValue).getClass();
            if (iIntValue < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        return zzf(true) || zzg();
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzeos zzeosVar = this.zzf;
        if (zzeosVar != null) {
            this.zzc.zza(zzeosVar);
        } else {
            this.zzc.zzb(new zzeov(3, this.zzh));
        }
    }

    @Nullable
    final synchronized zzfjt zza() {
        if (zze()) {
            int i = 0;
            while (true) {
                List list = this.zzb;
                if (i >= list.size()) {
                    break;
                }
                zzfjt zzfjtVar = (zzfjt) list.get(i);
                String str = zzfjtVar.zzat;
                Set set = this.zze;
                if (!set.contains(str)) {
                    if (zzfjtVar.zzav) {
                        this.zzl = true;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        set.add(str);
                    }
                    this.zzd.add(zzfjtVar);
                    return (zzfjt) list.remove(i);
                }
                i++;
            }
        }
        return null;
    }

    final synchronized void zzb(zzeos zzeosVar, zzfjt zzfjtVar) {
        this.zzl = false;
        this.zzd.remove(zzfjtVar);
        if (zzd()) {
            zzeosVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfjtVar);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        Integer numValueOf = Integer.valueOf(iIntValue);
        numValueOf.getClass();
        if (iIntValue > this.zzg) {
            this.zzj.zzf(zzfjtVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        numValueOf.getClass();
        this.zzg = iIntValue;
        this.zzf = zzeosVar;
        this.zzk = zzfjtVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    final synchronized void zzc(Throwable th, zzfjt zzfjtVar) {
        this.zzl = false;
        this.zzd.remove(zzfjtVar);
        this.zze.remove(zzfjtVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
