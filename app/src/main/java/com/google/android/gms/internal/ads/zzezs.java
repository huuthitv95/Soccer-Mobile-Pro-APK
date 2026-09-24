package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C11744X3;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezs implements zzfbw {
    public final Bundle zza;

    public zzezs(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = zzflb.zza(bundle, C11744X3.i.f26328G);
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(C11744X3.i.f26328G, bundleZza);
    }
}
