package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgsk implements zzgsx {
    protected zzgsk() {
    }

    public static zzgsk zzc(char c) {
        return new zzgsh(c);
    }

    @Override // com.google.android.gms.internal.ads.zzgsx
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
