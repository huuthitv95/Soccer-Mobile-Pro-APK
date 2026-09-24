package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbk {
    private final zzfoy zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzimc zzg;
    private final String zzh;
    private final zzfcb zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfkm zzk;
    private final zzdhy zzl;

    zzdbk(zzfoy zzfoyVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzimc zzimcVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzfcb zzfcbVar, zzfkm zzfkmVar, zzdhy zzdhyVar) {
        this.zza = zzfoyVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzimcVar;
        this.zzh = str2;
        this.zzi = zzfcbVar;
        this.zzj = zzgVar;
        this.zzk = zzfkmVar;
        this.zzl = zzdhyVar;
    }

    public final ListenableFuture zza(Bundle bundle) {
        this.zzl.zza();
        zzfos zzfosVar = zzfos.SIGNALS;
        zzfoy zzfoyVar = this.zza;
        Objects.requireNonNull(zzfoyVar);
        return zzfoj.zza(this.zzi.zza(new Bundle(), bundle), zzfosVar, zzfoyVar).zzi();
    }

    public final ListenableFuture zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final ListenableFuture listenableFutureZza = zza(bundle);
        return this.zza.zzb(zzfos.REQUEST_PARCEL, listenableFutureZza, (ListenableFuture) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdbj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(listenableFutureZza, bundle);
            }
        }).zzi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzcar zzc(ListenableFuture listenableFuture, Bundle bundle) {
        Bundle bundle2 = (Bundle) listenableFuture.get();
        String str = (String) ((ListenableFuture) this.zzg.zzb()).get();
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhX)).booleanValue() && this.zzj.zzx()) {
            z = true;
        }
        boolean z2 = z;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzcar(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z2, this.zzk.zza(), bundle);
    }
}
