package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaaz {
    private zzaay zza;
    private zzabi zzb;

    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    public zzmv zzg() {
        throw null;
    }

    public abstract void zzq(Object obj);

    public abstract zzaba zzr(zzmw[] zzmwVarArr, zzzf zzzfVar, zzxc zzxcVar, zzbf zzbfVar) throws zzje;

    public final void zzs(zzaay zzaayVar, zzabi zzabiVar) {
        zzgsw.zzi(this.zza == null);
        this.zza = zzaayVar;
        this.zzb = zzabiVar;
    }

    protected final void zzt() {
        zzaay zzaayVar = this.zza;
        if (zzaayVar != null) {
            zzaayVar.zzq();
        }
    }

    protected final zzabi zzu() {
        zzabi zzabiVar = this.zzb;
        zzabiVar.getClass();
        return zzabiVar;
    }
}
