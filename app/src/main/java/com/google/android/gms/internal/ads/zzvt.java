package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzvt implements zzvw {
    static final /* synthetic */ zzvt zza = new zzvt();

    private /* synthetic */ zzvt() {
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final /* synthetic */ int zza(Object obj) {
        int i = zzvx.zza;
        String str = ((zzve) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
