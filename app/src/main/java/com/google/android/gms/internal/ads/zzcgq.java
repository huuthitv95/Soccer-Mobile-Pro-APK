package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcgq {
    private final Context zza;
    private final zzchb zzb;
    private final ViewGroup zzc;
    private final zzdyz zzd;
    private zzcgp zze;

    public zzcgq(Context context, ViewGroup viewGroup, zzcki zzckiVar, zzdyz zzdyzVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzckiVar;
        this.zze = null;
        this.zzd = zzdyzVar;
    }

    public final Integer zza() {
        zzcgp zzcgpVar = this.zze;
        if (zzcgpVar != null) {
            return zzcgpVar.zzl();
        }
        return null;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcgp zzcgpVar = this.zze;
        if (zzcgpVar != null) {
            zzcgpVar.zzn(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzcha zzchaVar) {
        if (this.zze != null) {
            return;
        }
        zzchb zzchbVar = this.zzb;
        zzbil.zza(zzchbVar.zzq().zzc(), zzchbVar.zzi(), "vpr2");
        zzcgp zzcgpVar = new zzcgp(this.zza, zzchbVar, i5, z, zzchbVar.zzq().zzc(), zzchaVar, this.zzd);
        this.zze = zzcgpVar;
        this.zzc.addView(zzcgpVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i, i2, i3, i4);
        zzchbVar.zzdn(false);
    }

    public final zzcgp zzd() {
        return this.zze;
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcgp zzcgpVar = this.zze;
        if (zzcgpVar != null) {
            zzcgpVar.zzr();
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcgp zzcgpVar = this.zze;
        if (zzcgpVar != null) {
            zzcgpVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i) {
        zzcgp zzcgpVar = this.zze;
        if (zzcgpVar != null) {
            zzcgpVar.zzm(i);
        }
    }
}
