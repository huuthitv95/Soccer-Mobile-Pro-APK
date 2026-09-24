package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzftw {
    private final zzfui zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzftx zzg;

    private zzftw(zzfui zzfuiVar, WebView webView, String str, List list, String str2, String str3, zzftx zzftxVar) {
        this.zza = zzfuiVar;
        this.zzb = webView;
        this.zzg = zzftxVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzftw zza(zzfui zzfuiVar, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzfvs.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzftw(zzfuiVar, webView, null, null, str, str2, zzftx.HTML);
    }

    public static zzftw zzb(zzfui zzfuiVar, WebView webView, String str, String str2) {
        zzfvs.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzftw(zzfuiVar, webView, null, null, str, "", zzftx.JAVASCRIPT);
    }

    public final zzfui zzc() {
        return this.zza;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zze() {
        return Collections.unmodifiableMap(this.zzd);
    }

    public final WebView zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zze;
    }

    public final zzftx zzi() {
        return this.zzg;
    }
}
