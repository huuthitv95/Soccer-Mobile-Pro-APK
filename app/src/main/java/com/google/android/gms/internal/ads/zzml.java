package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzml {
    private final zzpz zza;
    private final zzmk zze;
    private final zzng zzh;
    private final zzdy zzi;
    private boolean zzj;
    private zzih zzk;
    private zzyx zzl = new zzyx(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzml(zzmk zzmkVar, zzng zzngVar, zzdy zzdyVar, zzpz zzpzVar) {
        this.zza = zzpzVar;
        this.zze = zzmkVar;
        this.zzh = zzngVar;
        this.zzi = zzdyVar;
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzmi zzmiVar = (zzmi) it.next();
            if (zzmiVar.zzc.isEmpty()) {
                zzs(zzmiVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzmi zzmiVar) {
        zzmh zzmhVar = (zzmh) this.zzf.get(zzmiVar);
        if (zzmhVar != null) {
            zzmhVar.zza.zzr(zzmhVar.zzb);
        }
    }

    private final void zzt(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzmi zzmiVar = (zzmi) this.zzb.remove(i2);
            this.zzd.remove(zzmiVar.zzb);
            zzu(i2, -zzmiVar.zza.zzz().zza());
            zzmiVar.zze = true;
            if (this.zzj) {
                zzw(zzmiVar);
            }
        }
    }

    private final void zzu(int i, int i2) {
        while (true) {
            List list = this.zzb;
            if (i >= list.size()) {
                return;
            }
            ((zzmi) list.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzv(zzmi zzmiVar) {
        zzwx zzwxVar = zzmiVar.zza;
        zzxd zzxdVar = new zzxd() { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzxd
            public final /* synthetic */ void zza(zzxe zzxeVar, zzbf zzbfVar) {
                this.zza.zzi(zzxeVar, zzbfVar);
            }
        };
        zzmg zzmgVar = new zzmg(this, zzmiVar);
        this.zzf.put(zzmiVar, new zzmh(zzwxVar, zzxdVar, zzmgVar));
        zzwxVar.zzl(new Handler(zzfk.zzf(), null), zzmgVar);
        zzwxVar.zzn(new Handler(zzfk.zzf(), null), zzmgVar);
        zzwxVar.zzp(zzxdVar, this.zzk, this.zza);
    }

    private final void zzw(zzmi zzmiVar) {
        if (zzmiVar.zze && zzmiVar.zzc.isEmpty()) {
            zzmh zzmhVar = (zzmh) this.zzf.remove(zzmiVar);
            zzmhVar.getClass();
            zzxe zzxeVar = zzmhVar.zza;
            zzxeVar.zzs(zzmhVar.zzb);
            zzmg zzmgVar = zzmhVar.zzc;
            zzxeVar.zzm(zzmgVar);
            zzxeVar.zzo(zzmgVar);
            this.zzg.remove(zzmiVar);
        }
    }

    public final zzbf zza(int i, int i2, List list) {
        zzgsw.zza(i >= 0 && i <= i2 && i2 <= zzc());
        zzgsw.zza(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzmi) this.zzb.get(i3)).zza.zzA((zzak) list.get(i3 - i));
        }
        return zzh();
    }

    public final boolean zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final void zzd(zzih zzihVar) {
        zzgsw.zzi(!this.zzj);
        this.zzk = zzihVar;
        int i = 0;
        while (true) {
            List list = this.zzb;
            if (i >= list.size()) {
                this.zzj = true;
                return;
            }
            zzmi zzmiVar = (zzmi) list.get(i);
            zzv(zzmiVar);
            this.zzg.add(zzmiVar);
            i++;
        }
    }

    public final zzxa zze(zzxc zzxcVar, zzabd zzabdVar, long j) {
        int i = zzms.zzb;
        Pair pair = (Pair) zzxcVar.zza;
        Object obj = pair.first;
        zzxc zzxcVarZza = zzxcVar.zza(pair.second);
        zzmi zzmiVar = (zzmi) this.zzd.get(obj);
        zzmiVar.getClass();
        this.zzg.add(zzmiVar);
        zzmh zzmhVar = (zzmh) this.zzf.get(zzmiVar);
        if (zzmhVar != null) {
            zzmhVar.zza.zzq(zzmhVar.zzb);
        }
        zzmiVar.zzc.add(zzxcVarZza);
        zzwu zzwuVarZzC = zzmiVar.zza.zzG(zzxcVarZza, zzabdVar, j);
        this.zzc.put(zzwuVarZzC, zzmiVar);
        zzr();
        return zzwuVarZzC;
    }

    public final void zzf(zzxa zzxaVar) {
        IdentityHashMap identityHashMap = this.zzc;
        zzmi zzmiVar = (zzmi) identityHashMap.remove(zzxaVar);
        zzmiVar.getClass();
        zzmiVar.zza.zzD(zzxaVar);
        zzmiVar.zzc.remove(((zzwu) zzxaVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzmiVar);
    }

    public final void zzg() {
        for (zzmh zzmhVar : this.zzf.values()) {
            try {
                zzmhVar.zza.zzs(zzmhVar.zzb);
            } catch (RuntimeException e) {
                zzef.zzf("MediaSourceList", "Failed to release child source.", e);
            }
            zzxe zzxeVar = zzmhVar.zza;
            zzmg zzmgVar = zzmhVar.zzc;
            zzxeVar.zzm(zzmgVar);
            zzxeVar.zzo(zzmgVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final zzbf zzh() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbf.zza;
        }
        int iZza = 0;
        for (int i = 0; i < list.size(); i++) {
            zzmi zzmiVar = (zzmi) list.get(i);
            zzmiVar.zzd = iZza;
            iZza += zzmiVar.zza.zzz().zza();
        }
        return new zzms(list, this.zzl);
    }

    final /* synthetic */ void zzi(zzxe zzxeVar, zzbf zzbfVar) {
        this.zze.zzo();
    }

    final /* synthetic */ zzng zzj() {
        return this.zzh;
    }

    final /* synthetic */ zzdy zzk() {
        return this.zzi;
    }

    public final zzbf zzl(List list, zzyx zzyxVar) {
        List list2 = this.zzb;
        zzt(0, list2.size());
        return zzm(list2.size(), list, zzyxVar);
    }

    public final zzbf zzm(int i, List list, zzyx zzyxVar) {
        if (!list.isEmpty()) {
            this.zzl = zzyxVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzmi zzmiVar = (zzmi) list.get(i2 - i);
                if (i2 > 0) {
                    zzmi zzmiVar2 = (zzmi) this.zzb.get(i2 - 1);
                    zzmiVar.zzc(zzmiVar2.zzd + zzmiVar2.zza.zzz().zza());
                } else {
                    zzmiVar.zzc(0);
                }
                zzu(i2, zzmiVar.zza.zzz().zza());
                this.zzb.add(i2, zzmiVar);
                this.zzd.put(zzmiVar.zzb, zzmiVar);
                if (this.zzj) {
                    zzv(zzmiVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzmiVar);
                    } else {
                        zzs(zzmiVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzbf zzn(int i, int i2, zzyx zzyxVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zzc()) {
            z = true;
        }
        zzgsw.zza(z);
        this.zzl = zzyxVar;
        zzt(i, i2);
        return zzh();
    }

    public final zzbf zzo(int i, int i2, int i3, zzyx zzyxVar) {
        zzgsw.zza(zzc() >= 0);
        this.zzl = null;
        return zzh();
    }

    public final zzbf zzp(zzyx zzyxVar) {
        int iZzc = zzc();
        if (zzyxVar.zza() != iZzc) {
            zzyxVar = zzyxVar.zzg().zzf(0, iZzc);
        }
        this.zzl = zzyxVar;
        return zzh();
    }

    public final zzyx zzq() {
        return this.zzl;
    }
}
