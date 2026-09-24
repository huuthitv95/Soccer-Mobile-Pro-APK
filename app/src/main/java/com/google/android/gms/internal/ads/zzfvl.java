package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfvl implements Runnable {
    final /* synthetic */ zzfvm zza;
    private final WebView zzb;

    zzfvl(zzfvm zzfvmVar) {
        Objects.requireNonNull(zzfvmVar);
        this.zza = zzfvmVar;
        this.zzb = zzfvmVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
