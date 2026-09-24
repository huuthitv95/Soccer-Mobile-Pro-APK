package com.google.android.gms.internal.games_v2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzat implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzau zza;
    private final Application zzb;
    private boolean zzc = false;

    /* synthetic */ zzat(zzau zzauVar, Application application, zzas zzasVar) {
        this.zza = zzauVar;
        this.zzb = application;
    }

    static /* bridge */ /* synthetic */ void zza(zzat zzatVar) {
        if (zzatVar.zzc) {
            return;
        }
        zzatVar.zzb.registerActivityLifecycleCallbacks(zzatVar);
        zzatVar.zzc = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.zzb.unregisterActivityLifecycleCallbacks(this);
        if (this.zzc) {
            this.zzc = false;
            zzez.zza("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
            this.zza.zzc.zza();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
