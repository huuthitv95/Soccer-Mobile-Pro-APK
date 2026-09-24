package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzffb implements zzetg {
    protected final zzcmx zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzffs zzd;
    private final zzfhk zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfpv zzh;
    private final zzfkl zzi;

    @Nullable
    private ListenableFuture zzj;

    protected zzffb(Context context, Executor executor, zzcmx zzcmxVar, zzfhk zzfhkVar, zzffs zzffsVar, zzfkl zzfklVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcmxVar;
        this.zze = zzfhkVar;
        this.zzd = zzffsVar;
        this.zzi = zzfklVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcmxVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzdbm zzg(zzfhi zzfhiVar) {
        zzfey zzfeyVar = (zzfey) zzfhiVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjt)).booleanValue()) {
            zzcuw zzcuwVar = new zzcuw(this.zzg);
            zzdbo zzdboVar = new zzdbo();
            zzdboVar.zza(this.zzb);
            zzdboVar.zzb(zzfeyVar.zza);
            zzdbp zzdbpVarZze = zzdboVar.zze();
            zzdie zzdieVar = new zzdie();
            zzffs zzffsVar = this.zzd;
            Executor executor = this.zzc;
            zzdieVar.zzd(zzffsVar, executor);
            zzdieVar.zzg(zzffsVar, executor);
            return zzc(zzcuwVar, zzdbpVarZze, zzdieVar.zzn());
        }
        zzffs zzffsVarZzn = zzffs.zzn(this.zzd);
        zzdie zzdieVar2 = new zzdie();
        Executor executor2 = this.zzc;
        zzdieVar2.zzc(zzffsVarZzn, executor2);
        zzdieVar2.zzi(zzffsVarZzn, executor2);
        zzdieVar2.zzj(zzffsVarZzn, executor2);
        zzdieVar2.zzk(zzffsVarZzn, executor2);
        zzdieVar2.zzd(zzffsVarZzn, executor2);
        zzdieVar2.zzg(zzffsVarZzn, executor2);
        zzdieVar2.zzl(zzffsVarZzn);
        zzcuw zzcuwVar2 = new zzcuw(this.zzg);
        zzdbo zzdboVar2 = new zzdbo();
        zzdboVar2.zza(this.zzb);
        zzdboVar2.zzb(zzfeyVar.zza);
        return zzc(zzcuwVar2, zzdboVar2.zze(), zzdieVar2.zzn());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzetg
    public final synchronized boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzete zzeteVar, zzetf zzetfVar) throws Throwable {
        Throwable th;
        boolean z;
        zzfps zzfpsVar;
        zzcuj zzcujVar;
        try {
            try {
                if (!zzmVar.zzb()) {
                    if (((Boolean) zzbkc.zzd.zze()).booleanValue()) {
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmB)).booleanValue()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        z = false;
                    }
                    if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmC)).intValue() || !z) {
                        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffa
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdi)).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzay.zzc();
                }
                if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzcujVar = (zzcuj) this.zze.zzd()) == null) {
                    zzfpsVar = null;
                } else {
                    zzfps zzfpsVarZzd = zzcujVar.zzd();
                    zzfpsVarZzd.zzi(7);
                    zzfpsVarZzd.zzc(zzmVar.zzp);
                    zzfpsVarZzd.zzd(zzmVar.zzm);
                    zzfpsVar = zzfpsVarZzd;
                }
                Context context = this.zzb;
                boolean z2 = zzmVar.zzf;
                zzflj.zzb(context, z2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkm)).booleanValue() && z2) {
                    this.zza.zzw().zzc(true);
                }
                Bundle bundleZza = zzdyk.zza(new Pair(zzdyi.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdyi.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
                zzfkl zzfklVar = this.zzi;
                zzfklVar.zzg(str);
                zzfklVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzd());
                zzfklVar.zza(zzmVar);
                zzfklVar.zzv(bundleZza);
                zzfkm zzfkmVarZzA = zzfklVar.zzA();
                zzfpi zzfpiVarZzo = zzfpi.CC.zzo(context, zzfpr.zzg(zzfkmVarZzA), 7, zzmVar);
                zzfey zzfeyVar = new zzfey(null);
                zzfeyVar.zza = zzfkmVarZzA;
                ListenableFuture listenableFutureZzc = this.zze.zzc(new zzfhl(zzfeyVar, null), new zzfhj() { // from class: com.google.android.gms.internal.ads.zzfez
                    @Override // com.google.android.gms.internal.ads.zzfhj
                    public final /* synthetic */ zzdbm zza(zzfhi zzfhiVar) {
                        return this.zza.zzf(zzfhiVar);
                    }
                }, null);
                this.zzj = listenableFutureZzc;
                zzhbi.zzr(listenableFutureZzc, new zzfex(this, zzetfVar, zzfpsVar, zzfpiVarZzo, zzfeyVar), this.zzc);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    protected abstract zzdbm zzc(zzcuw zzcuwVar, zzdbp zzdbpVar, zzdif zzdifVar);

    public final void zzd(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzp(zzxVar);
    }

    final /* synthetic */ void zze() {
        this.zzd.zzdJ(zzflo.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzffs zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzfhk zzj() {
        return this.zze;
    }

    final /* synthetic */ zzfpv zzk() {
        return this.zzh;
    }

    final /* synthetic */ void zzl(ListenableFuture listenableFuture) {
        this.zzj = null;
    }
}
