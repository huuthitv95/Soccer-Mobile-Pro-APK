package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfva implements zzfut {
    private static zzfva zza;
    private float zzb = 0.0f;
    private zzfuo zzc;
    private zzfus zzd;

    public zzfva(zzfup zzfupVar, zzful zzfulVar) {
    }

    public static zzfva zza() {
        if (zza == null) {
            zza = new zzfva(new zzfup(), new zzful());
        }
        return zza;
    }

    public final void zzb(Context context) {
        this.zzc = new zzfuo(new Handler(), context, new zzfuk(), this);
    }

    public final void zzc() {
        zzfur.zza().zzg(this);
        zzfur.zza().zze();
        zzfwc.zzb().zzc();
        this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    public final void zzd(boolean z) {
        if (z) {
            zzfwc.zzb().zzc();
        } else {
            zzfwc.zzb().zze();
        }
    }

    public final void zze() {
        zzfwc.zzb().zzd();
        zzfur.zza().zzf();
        this.zzc.zzb();
    }

    public final void zzf(float f) {
        this.zzb = f;
        if (this.zzd == null) {
            this.zzd = zzfus.zza();
        }
        Iterator it = this.zzd.zzf().iterator();
        while (it.hasNext()) {
            ((zzfty) it.next()).zzg().zzo(f);
        }
    }

    public final float zzg() {
        return this.zzb;
    }
}
