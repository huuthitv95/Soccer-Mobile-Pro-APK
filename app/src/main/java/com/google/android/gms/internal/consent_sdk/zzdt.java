package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdt extends zzdq {
    private final zzdv zza;

    zzdt(zzdv zzdvVar, int i) {
        super(zzdvVar.size(), i);
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdq
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
