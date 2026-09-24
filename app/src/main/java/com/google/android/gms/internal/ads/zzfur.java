package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfur extends zzfuu {
    private static final zzfur zzb = new zzfur();

    private zzfur() {
    }

    public static zzfur zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    public final boolean zzb() {
        Iterator it = zzfus.zza().zzf().iterator();
        while (it.hasNext()) {
            View viewZzi = ((zzfty) it.next()).zzi();
            if (viewZzi != null && viewZzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    public final void zzc(boolean z) {
        Iterator it = zzfus.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfty) it.next()).zzg().zzf(z);
        }
    }
}
