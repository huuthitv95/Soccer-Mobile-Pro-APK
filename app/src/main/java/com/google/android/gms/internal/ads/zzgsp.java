package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgsp extends zzgsm implements Serializable {
    private final Pattern zza;

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsm
    public final zzgsl zza(CharSequence charSequence) {
        return new zzgso(this.zza.matcher(charSequence));
    }

    zzgsp(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
