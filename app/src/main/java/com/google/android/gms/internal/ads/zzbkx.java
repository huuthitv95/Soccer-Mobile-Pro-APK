package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzbkx implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzbkx zza = new zzbkx();

    private /* synthetic */ zzbkx() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return iInterfaceQueryLocalInterface instanceof zzbkz ? (zzbkz) iInterfaceQueryLocalInterface : new zzbkz(iBinder);
    }
}
