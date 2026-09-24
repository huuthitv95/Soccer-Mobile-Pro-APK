package com.google.android.gms.internal.nearby;

import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzbi implements OnSuccessListener {
    private final zzcn zza;

    zzbi(zzcn zzcnVar) {
        this.zza = zzcnVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.zza.zzb((Void) obj);
    }
}
