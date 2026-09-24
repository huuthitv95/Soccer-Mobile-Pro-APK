package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdgw implements AppEventListener, OnAdMetadataChangedListener, zzdcf, com.google.android.gms.ads.internal.client.zza, zzdew, zzdcz, zzdee, com.google.android.gms.ads.internal.overlay.zzr, zzdcv, zzdkm {
    private final zzdfv zza = new zzdfv(this, null);

    @Nullable
    private zzesq zzb;

    @Nullable
    private zzesu zzc;

    @Nullable
    private zzffs zzd;

    @Nullable
    private zzfix zze;

    private static void zzs(Object obj, zzdgv zzdgvVar) {
        if (obj != null) {
            zzdgvVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(this.zzb, zzdga.zza);
        zzs(this.zzc, zzdgn.zza);
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzs(this.zze, zzdgt.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzdfn
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final /* synthetic */ void zza(Object obj) {
                ((zzesq) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzd(final zzcbd zzcbdVar, final String str, final String str2) {
        zzs(this.zzb, new zzdgv(zzcbdVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdfu
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzdfm
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfix) obj).zzd(zzcbdVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdK() {
        zzs(this.zzb, zzdfx.zza);
        zzs(this.zze, zzdgp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdR() {
        zzs(this.zzb, zzdgb.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
        zzs(this.zzd, zzdgh.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(final int i) {
        zzs(this.zzd, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzdft
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final /* synthetic */ void zza(Object obj) {
                ((zzffs) obj).zzdU(i);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        zzs(this.zzb, zzdgd.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzds() {
        zzs(this.zzb, zzdfw.zza);
        zzs(this.zze, zzdgo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdt() {
        zzs(this.zzb, zzdge.zza);
        zzs(this.zze, zzdgu.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdu() {
        zzs(this.zzb, zzdgc.zza);
        zzs(this.zzc, zzdgm.zza);
        zzs(this.zze, zzdgs.zza);
        zzs(this.zzd, zzdgl.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzs(this.zzd, zzdgi.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzs(this.zzd, zzdgj.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzs(this.zzd, zzdgk.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zze() {
        zzs(this.zzb, zzdfy.zza);
        zzs(this.zze, zzdgq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
        zzs(this.zzb, zzdfz.zza);
        zzs(this.zze, zzdgr.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzs(this.zzd, zzdgg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(this.zze, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzdfr
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfix) obj).zzj(zzeVar);
            }
        });
        zzs(this.zzb, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzdfs
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final /* synthetic */ void zza(Object obj) {
                ((zzesq) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzl() {
        zzs(this.zzd, zzdgf.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzs(this.zzb, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzdfo
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final /* synthetic */ void zza(Object obj) {
                ((zzesq) obj).zzm(zztVar);
            }
        });
        zzs(this.zze, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzdfp
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfix) obj).zzm(zztVar);
            }
        });
        zzs(this.zzd, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzdfq
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final /* synthetic */ void zza(Object obj) {
                ((zzffs) obj).zzm(zztVar);
            }
        });
    }

    public final zzdfv zzn() {
        return this.zza;
    }

    final /* synthetic */ void zzo(zzesq zzesqVar) {
        this.zzb = zzesqVar;
    }

    final /* synthetic */ void zzp(zzesu zzesuVar) {
        this.zzc = zzesuVar;
    }

    final /* synthetic */ void zzq(zzffs zzffsVar) {
        this.zzd = zzffsVar;
    }

    final /* synthetic */ void zzr(zzfix zzfixVar) {
        this.zze = zzfixVar;
    }
}
