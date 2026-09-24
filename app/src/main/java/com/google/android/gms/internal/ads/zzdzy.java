package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.ironsource.C11495If;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdzy implements AppEventListener, zzdfl, com.google.android.gms.ads.internal.client.zza, zzdcf, zzdcz, zzdda, zzddt, zzdci, zzfoz {
    private final List zza;
    private final zzdzm zzb;
    private long zzc;

    public zzdzy(zzdzm zzdzmVar, zzcmx zzcmxVar) {
        this.zzb = zzdzmVar;
        this.zza = Collections.singletonList(zzcmxVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        String.valueOf(simpleName);
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(simpleName)), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzi(com.google.android.gms.ads.internal.client.zza.class, C11495If.f24687f, new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzi(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zza(Context context) {
        zzi(zzdda.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzb(Context context) {
        zzi(zzdda.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzc(Context context) {
        zzi(zzdda.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    @ParametersAreNonnullByDefault
    public final void zzd(zzcbd zzcbdVar, String str, String str2) {
        zzi(zzdcf.class, "onRewarded", zzcbdVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzi(zzdci.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdK() {
        zzi(zzdcf.class, C11495If.f24692k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdL(zzfos zzfosVar, String str) {
        zzi(zzfor.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdM(zzfos zzfosVar, String str) {
        zzi(zzfor.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdN(zzfos zzfosVar, String str, Throwable th) {
        zzi(zzfor.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdO(zzfos zzfosVar, String str) {
        zzi(zzfor.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        zzi(zzdfl.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(zzfke zzfkeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        zzi(zzdcz.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzds() {
        zzi(zzdcf.class, C11495If.f24688g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdt() {
        zzi(zzdcf.class, C11495If.f24684c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zze() {
        zzi(zzdcf.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
        zzi(zzdcf.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzg() {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        zzi(zzddt.class, C11495If.f24691j, new Object[0]);
    }
}
