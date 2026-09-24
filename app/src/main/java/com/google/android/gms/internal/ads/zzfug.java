package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfug {
    private final zzfui zza;
    private final WebView zzb;
    private zzfwj zzc;
    private final HashMap zzd;
    private final zzfuw zze;

    private zzfug(zzfui zzfuiVar, WebView webView, boolean z) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzfuw();
        zzfvs.zza();
        this.zza = zzfuiVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzftu) it.next()).zzb(webView);
            }
            this.zzc = new zzfwj(webView);
        }
        if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        WebViewCompat.addWebMessageListener(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList(ProxyConfig.MATCH_ALL_SCHEMES)), new zzfue(this));
    }

    public static zzfug zza(zzfui zzfuiVar, WebView webView, boolean z) {
        return new zzfug(zzfuiVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        WebViewCompat.removeWebMessageListener(this.zzb, "omidJsSessionService");
    }

    public final void zzb(zzfuf zzfufVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzftu) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfud(this, zzfufVar, timer), 1000L);
    }

    final View zzc() {
        zzfwj zzfwjVar = this.zzc;
        if (zzfwjVar == null) {
            return null;
        }
        return (View) zzfwjVar.get();
    }

    public final void zzd(View view, zzfub zzfubVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzftu) it.next()).zzd(view, zzfubVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfubVar, "Ad overlay");
    }

    final /* synthetic */ void zzf(String str) {
        zzftz zzftzVar = zzftz.DEFINED_BY_JAVASCRIPT;
        zzfuc zzfucVar = zzfuc.DEFINED_BY_JAVASCRIPT;
        zzfuh zzfuhVar = zzfuh.JAVASCRIPT;
        zzfty zzftyVar = new zzfty(zzftv.zza(zzftzVar, zzfucVar, zzfuhVar, zzfuhVar, false), zzftw.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzftyVar);
        zzftyVar.zzb(zzc());
        for (zzfuv zzfuvVar : this.zze.zza()) {
            zzftyVar.zzd((View) zzfuvVar.zza().get(), zzfuvVar.zzc(), zzfuvVar.zzd());
        }
        zzftyVar.zza();
    }

    final /* synthetic */ void zzg(String str) {
        HashMap map = this.zzd;
        zzftu zzftuVar = (zzftu) map.get(str);
        if (zzftuVar != null) {
            zzftuVar.zzc();
            map.remove(str);
        }
    }
}
