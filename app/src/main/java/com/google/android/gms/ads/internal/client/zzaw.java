package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.ads.p282h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcbw;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcea;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzfc zzc;
    private final zzbnl zzd;
    private final zzbym zze;
    private zzbzo zzf;
    private final zzl zzg;

    public zzaw(zzk zzkVar, zzi zziVar, zzfc zzfcVar, zzbnl zzbnlVar, zzcci zzcciVar, zzbym zzbymVar, zzbnm zzbnmVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfcVar;
        this.zzd = zzbnlVar;
        this.zze = zzbymVar;
        this.zzg = zzlVar;
    }

    static /* synthetic */ void zzl(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zza().zzi(context, zzay.zzg().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zza(Context context, zzr zzrVar, String str, zzbuq zzbuqVar) {
        return (zzbu) new zzam(this, context, zzrVar, str, zzbuqVar).zzd(context, false);
    }

    public final zzbu zzb(Context context, zzr zzrVar, String str, zzbuq zzbuqVar) {
        return (zzbu) new zzan(this, context, zzrVar, str, zzbuqVar).zzd(context, false);
    }

    public final zzbq zzc(Context context, String str, zzbuq zzbuqVar) {
        return (zzbq) new zzap(this, context, str, zzbuqVar).zzd(context, false);
    }

    public final zzch zzd(Context context, zzbuq zzbuqVar) {
        return (zzch) new zzar(this, context, zzbuqVar).zzd(context, false);
    }

    public final zzblw zze(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzblw) new zzav(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzcbw zzf(Context context, String str, zzbuq zzbuqVar) {
        return (zzcbw) new zzaa(this, context, str, zzbuqVar).zzd(context, false);
    }

    public final zzbyp zzg(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("useClientJar flag not found in activity intent extras.");
        }
        return (zzbyp) zzacVar.zzd(activity, booleanExtra);
    }

    public final zzdt zzh(Context context, zzbuq zzbuqVar) {
        return (zzdt) new zzae(this, context, zzbuqVar).zzd(context, false);
    }

    public final zzcea zzi(Context context, zzbuq zzbuqVar) {
        return (zzcea) new zzag(this, context, zzbuqVar).zzd(context, false);
    }

    public final zzbyi zzj(Context context, zzbuq zzbuqVar) {
        return (zzbyi) new zzai(this, context, zzbuqVar).zzd(context, false);
    }

    public final zzbqh zzk(Context context, zzbuq zzbuqVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbqh) new zzak(this, context, zzbuqVar, onH5AdsEventListener).zzd(context, false);
    }

    final /* synthetic */ zzk zzm() {
        return this.zza;
    }

    final /* synthetic */ zzi zzn() {
        return this.zzb;
    }

    final /* synthetic */ zzfc zzo() {
        return this.zzc;
    }

    final /* synthetic */ zzbnl zzp() {
        return this.zzd;
    }

    final /* synthetic */ zzbym zzq() {
        return this.zze;
    }

    final /* synthetic */ zzbzo zzr() {
        return this.zzf;
    }

    final /* synthetic */ void zzs(zzbzo zzbzoVar) {
        this.zzf = zzbzoVar;
    }

    final /* synthetic */ zzl zzt() {
        return this.zzg;
    }
}
