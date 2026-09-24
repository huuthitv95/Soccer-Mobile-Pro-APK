package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzddy implements zzdic {
    static final /* synthetic */ zzddy zza = new zzddy();

    private /* synthetic */ zzddy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdic
    public final /* synthetic */ void zza(Object obj) {
        ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
    }
}
