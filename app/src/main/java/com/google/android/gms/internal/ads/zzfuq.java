package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfuq implements zzfut {
    private static final zzfuq zza = new zzfuq(new zzfuu());
    private Date zzb;
    private boolean zzc;
    private final zzfuu zzd;
    private boolean zze;

    private zzfuq(zzfuu zzfuuVar) {
        this.zzd = zzfuuVar;
    }

    public static zzfuq zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void zzc(Context context) {
        if (this.zzc) {
            return;
        }
        zzfuu zzfuuVar = this.zzd;
        zzfuuVar.zzd(context);
        zzfuuVar.zzg(this);
        zzfuuVar.zze();
        this.zze = zzfuuVar.zza;
        this.zzc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    public final void zzd(boolean z) {
        if (!this.zze && z) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzfus.zza().zzf().iterator();
                    while (it.hasNext()) {
                        ((zzfty) it.next()).zzg().zzn(zzb());
                    }
                }
            }
        }
        this.zze = z;
    }
}
