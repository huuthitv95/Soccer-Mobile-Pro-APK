package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzigg extends RuntimeException {
    public zzigg(zzifc zzifcVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzieg zza() {
        return new zzieg(getMessage());
    }
}
