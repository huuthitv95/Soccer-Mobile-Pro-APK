package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzclg implements Runnable {
    final /* synthetic */ zzcll zza;

    zzclg(zzcll zzcllVar) {
        Objects.requireNonNull(zzcllVar);
        this.zza = zzcllVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
