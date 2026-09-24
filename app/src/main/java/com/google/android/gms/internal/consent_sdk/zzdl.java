package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdl extends zzdn {
    zzdl(zzdo zzdoVar, CharSequence charSequence, zzdh zzdhVar) {
        super(zzdoVar, charSequence);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    final int zzd(int i) {
        CharSequence charSequence = this.zza;
        int length = charSequence.length();
        zzdj.zzb(i, length, "index");
        while (i < length) {
            if (charSequence.charAt(i) == ',') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
