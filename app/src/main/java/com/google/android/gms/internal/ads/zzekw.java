package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzekw {
    boolean zza(Context context);

    String zzb(Context context);

    zzelb zzc(String str, WebView webView, String str2, String str3, String str4, zzeky zzekyVar, zzekx zzekxVar, String str5);

    zzelb zzd(String str, WebView webView, String str2, String str3, String str4, String str5, zzeky zzekyVar, zzekx zzekxVar, String str6);

    void zze(zzftu zzftuVar);

    void zzf(zzftu zzftuVar);

    void zzg(zzftu zzftuVar, View view);

    void zzh(zzftu zzftuVar, View view);

    zzfug zzi(VersionInfoParcel versionInfoParcel, WebView webView, boolean z);

    void zzj(zzfug zzfugVar, zzfuf zzfufVar);

    void zzk(zzfug zzfugVar, View view);
}
