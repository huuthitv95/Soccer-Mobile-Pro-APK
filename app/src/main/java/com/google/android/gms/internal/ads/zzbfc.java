package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbfc implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbeu zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbfe zze;

    zzbfc(zzbfe zzbfeVar, final zzbeu zzbeuVar, final WebView webView, final boolean z) {
        this.zzb = zzbeuVar;
        this.zzc = webView;
        this.zzd = z;
        Objects.requireNonNull(zzbfeVar);
        this.zze = zzbfeVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbfb
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzbeuVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
