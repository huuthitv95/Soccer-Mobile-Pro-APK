package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p282h5.OnH5AdsEventListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbqb extends zzbqd {
    private final OnH5AdsEventListener zza;

    public zzbqb(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbqe
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
