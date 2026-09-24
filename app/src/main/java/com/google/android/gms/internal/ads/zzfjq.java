package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfjq extends zzcbf {
    private final zzfjg zza;
    private final zzfix zzb;
    private final zzfkf zzc;
    private zzdva zzd;
    private boolean zze = false;

    public zzfjq(zzfjg zzfjgVar, zzfix zzfixVar, zzfkf zzfkfVar) {
        this.zza = zzfjgVar;
        this.zzb = zzfixVar;
        this.zzc = zzfkfVar;
    }

    private final synchronized boolean zzy() {
        zzdva zzdvaVar = this.zzd;
        return (zzdvaVar == null || zzdvaVar.zze()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzgy)).booleanValue() == false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzcbg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzcbk r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzbhv r1 = com.google.android.gms.internal.ads.zzbie.zzgw     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzbic r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L2a
            if (r0 != 0) goto L19
            goto L2a
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L60
            if (r0 == 0) goto L2a
            goto L42
        L20:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcer r2 = com.google.android.gms.ads.internal.zzt.zzh()     // Catch: java.lang.Throwable -> L60
            r2.zzg(r0, r1)     // Catch: java.lang.Throwable -> L60
        L2a:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L44
            com.google.android.gms.internal.ads.zzbhv r0 = com.google.android.gms.internal.ads.zzbie.zzgy     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzbic r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L60
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L44
        L42:
            monitor-exit(r4)
            return
        L44:
            com.google.android.gms.internal.ads.zzfiz r0 = new com.google.android.gms.internal.ads.zzfiz     // Catch: java.lang.Throwable -> L60
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L60
            r4.zzd = r1     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzfjg r1 = r4.zza     // Catch: java.lang.Throwable -> L60
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzfjo r3 = new com.google.android.gms.internal.ads.zzfjo     // Catch: java.lang.Throwable -> L60
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L60
            r1.zza(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r4)
            return
        L60:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L60
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjq.zzb(com.google.android.gms.internal.ads.zzcbk):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzd(zzcbj zzcbjVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzcbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final boolean zze() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzh() throws RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized String zzl() throws RemoteException {
        zzdva zzdvaVar = this.zzd;
        if (zzdvaVar == null || zzdvaVar.zzn() == null) {
            return null;
        }
        return zzdvaVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzn(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfjp(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final Bundle zzo() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdva zzdvaVar = this.zzd;
        return zzdvaVar != null ? zzdvaVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (objUnwrap instanceof Activity) {
                    activity = (Activity) objUnwrap;
                }
            }
            this.zzd.zza(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzq(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzr(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final boolean zzs() {
        zzdva zzdvaVar = this.zzd;
        return zzdvaVar != null && zzdvaVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzt() throws RemoteException {
        zzdva zzdvaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhI)).booleanValue() && (zzdvaVar = this.zzd) != null) {
            return zzdvaVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzu(zzcbe zzcbeVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzq(zzcbeVar);
    }

    final /* synthetic */ zzfkf zzv() {
        return this.zzc;
    }

    final /* synthetic */ zzdva zzw() {
        return this.zzd;
    }

    final /* synthetic */ void zzx(zzdva zzdvaVar) {
        this.zzd = zzdvaVar;
    }
}
