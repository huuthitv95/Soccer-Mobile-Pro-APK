package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zziem {
    protected volatile zzifc zza;
    private volatile zzicn zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziem)) {
            return false;
        }
        zziem zziemVar = (zziem) obj;
        zzifc zzifcVar = this.zza;
        zzifc zzifcVar2 = zziemVar.zza;
        if (zzifcVar == null && zzifcVar2 == null) {
            return zzc().equals(zziemVar.zzc());
        }
        if (zzifcVar != null && zzifcVar2 != null) {
            return zzifcVar.equals(zzifcVar2);
        }
        if (zzifcVar != null) {
            zziemVar.zzd(zzifcVar.zzbw());
            return zzifcVar.equals(zziemVar.zza);
        }
        zzd(zzifcVar2.zzbw());
        return this.zza.equals(zzifcVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzifc zza(zzifc zzifcVar) {
        zzifc zzifcVar2 = this.zza;
        this.zzb = null;
        this.zza = zzifcVar;
        return zzifcVar2;
    }

    public final int zzb() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzbr();
        }
        return 0;
    }

    public final zzicn zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = zzicn.zza;
            } else {
                this.zzb = this.zza.zzaM();
            }
            return this.zzb;
        }
    }

    protected final void zzd(zzifc zzifcVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzifcVar;
                this.zzb = zzicn.zza;
            } catch (zzieg unused) {
                this.zzc = true;
                this.zza = zzifcVar;
                this.zzb = zzicn.zza;
            }
        }
    }
}
