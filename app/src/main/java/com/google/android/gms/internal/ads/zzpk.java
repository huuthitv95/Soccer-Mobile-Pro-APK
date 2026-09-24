package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpk {
    private final zzbd zza;
    private zzgvz zzb = zzgvz.zzi();
    private zzgwc zzc = zzgwc.zza();
    private zzxc zzd;
    private zzxc zze;
    private zzxc zzf;

    public zzpk(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(zzbf zzbfVar) {
        zzgwb zzgwbVar = new zzgwb();
        if (this.zzb.isEmpty()) {
            zzk(zzgwbVar, this.zze, zzbfVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzgwbVar, this.zzf, zzbfVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzgwbVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzgwbVar, (zzxc) this.zzb.get(i), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgwbVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzgwbVar.zzc();
    }

    private final void zzk(zzgwb zzgwbVar, zzxc zzxcVar, zzbf zzbfVar) {
        if (zzxcVar == null) {
            return;
        }
        if (zzbfVar.zze(zzxcVar.zza) != -1) {
            zzgwbVar.zza(zzxcVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzxcVar);
        if (zzbfVar2 != null) {
            zzgwbVar.zza(zzxcVar, zzbfVar2);
        }
    }

    private static zzxc zzl(zzbb zzbbVar, zzgvz zzgvzVar, zzxc zzxcVar, zzbd zzbdVar) {
        zzbf zzbfVarZzq = zzbbVar.zzq();
        int iZzr = zzbbVar.zzr();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(iZzr);
        int iZzf = -1;
        if (!zzbbVar.zzx() && !zzbfVarZzq.zzg()) {
            iZzf = zzbfVarZzq.zzd(iZzr, zzbdVar, false).zzf(zzfk.zzs(zzbbVar.zzu()));
        }
        int i = iZzf;
        for (int i2 = 0; i2 < zzgvzVar.size(); i2++) {
            zzxc zzxcVar2 = (zzxc) zzgvzVar.get(i2);
            if (zzm(zzxcVar2, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i)) {
                return zzxcVar2;
            }
        }
        if (zzgvzVar.isEmpty() && zzxcVar != null && zzm(zzxcVar, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i)) {
            return zzxcVar;
        }
        return null;
    }

    private static boolean zzm(zzxc zzxcVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzxcVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            return zzxcVar.zzb == i && zzxcVar.zzc == i2;
        }
        return zzxcVar.zzb == -1 && zzxcVar.zze == i3;
    }

    public final zzxc zza() {
        return this.zzd;
    }

    public final zzxc zzb() {
        return this.zze;
    }

    public final zzxc zzc() {
        return this.zzf;
    }

    public final zzxc zzd() {
        Object next;
        Object objLast;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (list instanceof List) {
            List list2 = list;
            if (list2.isEmpty()) {
                throw new NoSuchElementException();
            }
            objLast = list2.get(list2.size() - 1);
        } else if (list instanceof SortedSet) {
            objLast = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            objLast = next;
        }
        return (zzxc) objLast;
    }

    public final zzbf zze(zzxc zzxcVar) {
        return (zzbf) this.zzc.get(zzxcVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, zzxc zzxcVar, zzbb zzbbVar) {
        this.zzb = zzgvz.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzxc) list.get(0);
            zzxcVar.getClass();
            this.zzf = zzxcVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    final /* synthetic */ zzgvz zzi() {
        return this.zzb;
    }
}
