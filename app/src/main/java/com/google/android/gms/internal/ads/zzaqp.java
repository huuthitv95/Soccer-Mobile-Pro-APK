package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaqp {
    private final List zza;
    private final zzahb[] zzc;
    private final String zzb = "video/mp2t";
    private final zzgy zzd = new zzgy(new zzgx() { // from class: com.google.android.gms.internal.ads.zzaqo
        @Override // com.google.android.gms.internal.ads.zzgx
        public final /* synthetic */ void zza(long j, zzes zzesVar) {
            this.zza.zzf(j, zzesVar);
        }
    });

    public zzaqp(List list, String str) {
        this.zza = list;
        this.zzc = new zzahb[list.size()];
    }

    public final void zza(zzafs zzafsVar, zzara zzaraVar) {
        int i = 0;
        while (true) {
            zzahb[] zzahbVarArr = this.zzc;
            if (i >= zzahbVarArr.length) {
                return;
            }
            zzaraVar.zza();
            zzahb zzahbVarZzu = zzafsVar.zzu(zzaraVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i);
            String str = zzvVar.zzp;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzgsw.zzf(z, "Invalid closed caption MIME type provided: %s", str);
            String strZzc = zzvVar.zza;
            if (strZzc == null) {
                strZzc = zzaraVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(strZzc);
            zztVar.zzn(this.zzb);
            zztVar.zzo(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzL(zzvVar.zzM);
            zztVar.zzr(zzvVar.zzs);
            zzahbVarZzu.zzA(zztVar.zzO());
            zzahbVarArr[i] = zzahbVarZzu;
            i++;
        }
    }

    public final void zzb(int i) {
        this.zzd.zza(i);
    }

    public final void zzc(long j, zzes zzesVar) {
        this.zzd.zzc(j, zzesVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    final /* synthetic */ void zzf(long j, zzes zzesVar) {
        zzafc.zza(j, zzesVar, this.zzc);
    }
}
