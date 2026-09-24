package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlv implements Application.ActivityLifecycleCallbacks, zzlt {
    final /* synthetic */ zzlw zza;

    zzlv(zzlw zzlwVar) {
        this.zza = zzlwVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        zza(com.google.android.gms.internal.measurement.zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzd(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zze(com.google.android.gms.internal.measurement.zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zza(com.google.android.gms.internal.measurement.zzdj zzdjVar, Bundle bundle) throws Throwable {
        zzlv zzlvVar;
        zzio zzioVar;
        Uri uri;
        try {
            zzlw zzlwVar = this.zza;
            zzio zzioVar2 = zzlwVar.zzu;
            zzioVar2.zzaW().zzj().zza("onActivityCreated");
            Intent intent = zzdjVar.zzc;
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    uri = null;
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                            uri = data;
                        }
                    }
                } else {
                    uri = data;
                }
                if (uri != null && uri.isHierarchical()) {
                    zzioVar2.zzw();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                    String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                    zzlvVar = this;
                    try {
                        try {
                            zzioVar2.zzaX().zzq(new zzlu(zzlvVar, bundle == null, uri, str, queryParameter));
                        } catch (RuntimeException e) {
                            e = e;
                            zzlvVar.zza.zzu.zzaW().zze().zzb("Throwable caught in onActivityCreated", e);
                        }
                        zzioVar = zzlvVar.zza.zzu;
                    } catch (Throwable th) {
                        th = th;
                        zzlvVar.zza.zzu.zzt().zzs(zzdjVar, bundle);
                        throw th;
                    }
                }
                zzioVar.zzt().zzs(zzdjVar, bundle);
            }
            zzioVar = zzlwVar.zzu;
        } catch (RuntimeException e2) {
            e = e2;
            zzlvVar = this;
        } catch (Throwable th2) {
            th = th2;
            zzlvVar = this;
            zzlvVar.zza.zzu.zzt().zzs(zzdjVar, bundle);
            throw th;
        }
        zzioVar.zzt().zzs(zzdjVar, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzb(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        this.zza.zzu.zzt().zzt(zzdjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzc(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        zzio zzioVar = this.zza.zzu;
        zzioVar.zzt().zzu(zzdjVar);
        zzop zzopVarZzv = zzioVar.zzv();
        zzio zzioVar2 = zzopVarZzv.zzu;
        zzioVar2.zzaX().zzq(new zzoi(zzopVarZzv, zzioVar2.zzaU().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzd(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        zzio zzioVar = this.zza.zzu;
        zzop zzopVarZzv = zzioVar.zzv();
        zzio zzioVar2 = zzopVarZzv.zzu;
        zzioVar2.zzaX().zzq(new zzoh(zzopVarZzv, zzioVar2.zzaU().elapsedRealtime()));
        zzioVar.zzt().zzv(zzdjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zze(com.google.android.gms.internal.measurement.zzdj zzdjVar, Bundle bundle) {
        this.zza.zzu.zzt().zzw(zzdjVar, bundle);
    }
}
