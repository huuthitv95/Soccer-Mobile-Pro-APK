package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhb implements zzhj {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzhn zzd;

    protected zzhb(boolean z) {
        this.zza = z;
    }

    protected final void zzf(zzhn zzhnVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzih) this.zzb.get(i)).zza(this, zzhnVar, this.zza);
        }
    }

    protected final void zzg(zzhn zzhnVar) {
        this.zzd = zzhnVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzih) this.zzb.get(i)).zzb(this, zzhnVar, this.zza);
        }
    }

    protected final void zzh(int i) {
        zzhn zzhnVar = this.zzd;
        String str = zzfk.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzih) this.zzb.get(i2)).zzc(this, zzhnVar, this.zza, i);
        }
    }

    protected final void zzi() {
        zzhn zzhnVar = this.zzd;
        String str = zzfk.zza;
        for (int i = 0; i < this.zzc; i++) {
            ((zzih) this.zzb.get(i)).zzd(this, zzhnVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public /* synthetic */ Map zzj() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zze(zzih zzihVar) {
        zzihVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzihVar)) {
            return;
        }
        arrayList.add(zzihVar);
        this.zzc++;
    }
}
