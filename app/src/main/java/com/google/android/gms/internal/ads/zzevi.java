package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzevi implements zzhaq {
    static final /* synthetic */ zzevi zza = new zzevi();

    private /* synthetic */ zzevi() {
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzhbi.zza(new zzevm(null, -1)) : zzhbi.zza(new zzevm(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
