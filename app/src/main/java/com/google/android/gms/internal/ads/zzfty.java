package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfty extends zzftu {
    private final zzftw zza;
    private zzfwj zzc;
    private zzfvi zzd;
    private final String zzg;
    private final zzfuw zzb = new zzfuw();
    private boolean zze = false;
    private boolean zzf = false;

    zzfty(zzftv zzftvVar, zzftw zzftwVar, String str) {
        this.zza = zzftwVar;
        this.zzg = str;
        zzk(null);
        if (zzftwVar.zzi() == zzftx.HTML || zzftwVar.zzi() == zzftx.JAVASCRIPT) {
            this.zzd = new zzfvj(str, zzftwVar.zzf());
        } else {
            this.zzd = new zzfvm(str, zzftwVar.zze(), null);
        }
        this.zzd.zza();
        zzfus.zza().zzb(this);
        this.zzd.zzj(zzftvVar);
    }

    private final void zzk(View view) {
        this.zzc = new zzfwj(view);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zza() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzfus.zza().zzc(this);
        this.zzd.zzo(zzfva.zza().zzg());
        this.zzd.zzn(zzfuq.zza().zzb());
        this.zzd.zzk(this, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zzb(View view) {
        if (this.zzf || zzi() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzp();
        Collection<zzfty> collectionZze = zzfus.zza().zze();
        if (collectionZze == null || collectionZze.isEmpty()) {
            return;
        }
        for (zzfty zzftyVar : collectionZze) {
            if (zzftyVar != this && zzftyVar.zzi() == view) {
                zzftyVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zzm();
        zzfus.zza().zzd(this);
        this.zzd.zzb();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zzd(View view, zzfub zzfubVar, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfubVar, "Ad overlay");
    }

    public final List zzf() {
        return this.zzb.zza();
    }

    public final zzfvi zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final View zzi() {
        return (View) this.zzc.get();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
