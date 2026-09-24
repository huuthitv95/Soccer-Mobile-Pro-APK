package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbje;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzimy;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzk implements zzbje {
    final /* synthetic */ zzbjf zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Uri zzd;

    zzk(zzs zzsVar, zzbjf zzbjfVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbjfVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbje
    public final void zza() {
        zzbjf zzbjfVar = this.zza;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(zzbjfVar.zzc());
        zzs.zzai(builder, this.zzb);
        CustomTabsIntent customTabsIntentBuild = builder.build();
        Intent intent = customTabsIntentBuild.intent;
        Context context = this.zzc;
        intent.setPackage(zzimy.zza(context));
        customTabsIntentBuild.launchUrl(context, this.zzd);
        zzbjfVar.zzb((Activity) context);
    }
}
