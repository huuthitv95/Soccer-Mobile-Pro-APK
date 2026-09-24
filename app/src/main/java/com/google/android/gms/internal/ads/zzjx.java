package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjx implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaeh, zzrp, zzzi, zzwa, zzby, zzev {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzlb zza;

    /* synthetic */ zzjx(zzlb zzlbVar, byte[] bArr) {
        Objects.requireNonNull(zzlbVar);
        this.zza = zzlbVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzlb zzlbVar = this.zza;
        zzlbVar.zzQ(surfaceTexture);
        zzlbVar.zzS(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzlb zzlbVar = this.zza;
        zzlbVar.zzR(null);
        zzlbVar.zzS(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzS(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzS(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzS(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zza(zzfc zzfcVar) {
        this.zza.zzP(zzje.zzc(zzfcVar, 1003));
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzb(zziv zzivVar) {
        this.zza.zzV().zzN(zzivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzc(String str, long j, long j2) {
        this.zza.zzV().zzO(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzd(zzv zzvVar, zziw zziwVar) {
        this.zza.zzV().zzP(zzvVar, zziwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zze(int i, long j) {
        this.zza.zzV().zzQ(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzf(final zzbv zzbvVar) {
        zzdz zzdzVar = new zzdz() { // from class: com.google.android.gms.internal.ads.zzjv
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                int i = zzjx.zzb;
                ((zzaz) obj).zzt(zzbvVar);
            }
        };
        zzee zzeeVarZzU = this.zza.zzU();
        zzeeVarZzU.zze(25, zzdzVar);
        zzeeVarZzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzg(Object obj, long j) {
        zzlb zzlbVar = this.zza;
        zzlbVar.zzV().zzT(obj, j);
        if (zzlbVar.zzab() == obj) {
            zzee zzeeVarZzU = zzlbVar.zzU();
            zzeeVarZzU.zze(26, zzjw.zza);
            zzeeVarZzU.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzh(String str) {
        this.zza.zzV().zzR(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzi(zziv zzivVar) {
        this.zza.zzV().zzS(zzivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzj(long j, int i) {
        this.zza.zzV().zzU(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzk(Exception exc) {
        this.zza.zzV().zzV(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzl(zziv zzivVar) {
        this.zza.zzV().zzC(zzivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzm(String str, long j, long j2) {
        this.zza.zzV().zzD(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzn(zzv zzvVar, zziw zziwVar) {
        this.zza.zzV().zzE(zzvVar, zziwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzo(long j) {
        this.zza.zzV().zzF(j);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzp(int i, long j, long j2) {
        this.zza.zzV().zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzq(String str) {
        this.zza.zzV().zzH(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzr(zziv zzivVar) {
        this.zza.zzV().zzI(zzivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzs(final boolean z) {
        zzlb zzlbVar = this.zza;
        if (zzlbVar.zzac() == z) {
            return;
        }
        zzlbVar.zzad(z);
        zzee zzeeVarZzU = zzlbVar.zzU();
        zzeeVarZzU.zze(23, new zzdz() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                int i = zzjx.zzb;
                ((zzaz) obj).zzs(z);
            }
        });
        zzeeVarZzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzt(Exception exc) {
        this.zza.zzV().zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzu(Exception exc) {
        this.zza.zzV().zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzv(zzrq zzrqVar) {
        this.zza.zzV().zzL(zzrqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzw(zzrq zzrqVar) {
        this.zza.zzV().zzM(zzrqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzx(final int i) {
        this.zza.zzY().zza(new zzgsn() { // from class: com.google.android.gms.internal.ads.zzjt
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                int i2 = zzjx.zzb;
                return Integer.valueOf(i);
            }
        }, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzju
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                int i2 = zzjx.zzb;
                return Integer.valueOf(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzy(zzit zzitVar) {
        this.zza.zzZ().zza(zzitVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzz(zzit zzitVar) {
        this.zza.zzaa().zza(zzitVar);
    }
}
