package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcht extends zzcgh implements TextureView.SurfaceTextureListener, zzcgr {
    private final zzchb zzc;
    private final zzchc zzd;
    private final zzcha zze;
    private final zzdyz zzf;
    private zzcgg zzg;
    private Surface zzh;
    private zzcgs zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcgz zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcht(Context context, zzchc zzchcVar, zzchb zzchbVar, boolean z, boolean z2, zzcha zzchaVar, zzdyz zzdyzVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzchbVar;
        this.zzd = zzchcVar;
        this.zzo = z;
        this.zze = zzchaVar;
        zzchcVar.zza(this);
        this.zzf = zzdyzVar;
    }

    private final boolean zzT() {
        zzcgs zzcgsVar = this.zzi;
        return (zzcgsVar == null || !zzcgsVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z, Integer num) {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null && !z) {
            zzcgsVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z) {
            if (!zzT()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcgsVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzcio zzcioVarZzr = this.zzc.zzr(this.zzj);
            if (zzcioVarZzr instanceof zzcix) {
                zzcgs zzcgsVarZza = ((zzcix) zzcioVarZzr).zza();
                this.zzi = zzcgsVarZza;
                zzcgsVarZza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcioVarZzr instanceof zzciu)) {
                    String str = this.zzj;
                    String.valueOf(str);
                    String strValueOf = String.valueOf(str);
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzciu zzciuVar = (zzciu) zzcioVarZzr;
                String strZzF = zzF();
                ByteBuffer byteBufferZzu = zzciuVar.zzu();
                boolean zZzt = zzciuVar.zzt();
                String strZzs = zzciuVar.zzs();
                if (strZzs == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzcgs zzcgsVarZzE = zzE(num);
                    this.zzi = zzcgsVarZzE;
                    zzcgsVarZzE.zzr(new Uri[]{Uri.parse(strZzs)}, strZzF, byteBufferZzu, zZzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i5 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i5 >= strArr.length) {
                    break;
                }
                uriArr[i5] = Uri.parse(strArr[i5]);
                i5++;
            }
            this.zzi.zzq(uriArr, strZzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int iZzC = this.zzi.zzC();
            this.zzm = iZzC;
            if (iZzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcgs zzcgsVar = this.zzi;
            if (zzcgsVar != null) {
                zzcgsVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z) {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcgsVar.zzu(surface, z);
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(canonicalName);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(message);
        return sb.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzt != f) {
            this.zzt = f;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            zzcgsVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            zzcgsVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzt;
        if (f != 0.0f && this.zzn == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcgz zzcgzVar = this.zzn;
        if (zzcgzVar != null) {
            zzcgzVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzdyz zzdyzVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoJ)).booleanValue() && (zzdyzVar = this.zzf) != null) {
                zzdyy zzdyyVarZza = zzdyzVar.zza();
                zzdyyVarZza.zzc("action", "svp_aepv");
                zzdyyVarZza.zzd();
            }
            zzcgz zzcgzVar = new zzcgz(getContext());
            this.zzn = zzcgzVar;
            zzcgzVar.zzb(surfaceTexture, i, i2);
            zzcgz zzcgzVar2 = this.zzn;
            zzcgzVar2.start();
            SurfaceTexture surfaceTextureZze = zzcgzVar2.zze();
            if (surfaceTextureZze != null) {
                surfaceTexture = surfaceTextureZze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcgz zzcgzVar = this.zzn;
        if (zzcgzVar != null) {
            zzcgzVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcgz zzcgzVar = this.zzn;
        if (zzcgzVar != null) {
            zzcgzVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcho
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzN(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzA(int i) {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            zzcgsVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzB(int i) {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            zzcgsVar.zzz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzC(int i) {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            zzcgsVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        });
    }

    final zzcgs zzE(Integer num) {
        zzcha zzchaVar = this.zze;
        zzchb zzchbVar = this.zzc;
        zzcjq zzcjqVar = new zzcjq(zzchbVar.getContext(), zzchaVar, zzchbVar, num);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzcjqVar;
    }

    final String zzF() {
        zzchb zzchbVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzchbVar.getContext(), zzchbVar.zzs().afmaVersion);
    }

    final /* synthetic */ void zzG() {
        float fZzc = this.zzb.zzc();
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcgsVar.zzv(fZzc, false);
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    final /* synthetic */ void zzH() {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zzb();
        }
    }

    final /* synthetic */ void zzI() {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zze();
        }
    }

    final /* synthetic */ void zzJ(String str) {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zzc();
        }
    }

    final /* synthetic */ void zzL() {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zzd();
        }
    }

    final /* synthetic */ void zzM() {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zza();
        }
    }

    final /* synthetic */ void zzN(int i, int i2) {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzO() {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zzh();
        }
    }

    final /* synthetic */ void zzP(int i) {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzQ(boolean z, long j) {
        this.zzc.zzu(z, j);
    }

    final /* synthetic */ void zzR(String str) {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzS() {
        zzcgg zzcggVar = this.zzg;
        if (zzcggVar != null) {
            zzcggVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzb(zzcgg zzcggVar) {
        this.zzg = zzcggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzc(String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzchc zzchcVar = this.zzd;
        zzchcVar.zzf();
        this.zzb.zze();
        zzchcVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzi(int i) {
        if (zzU()) {
            this.zzi.zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzj(float f, float f2) {
        zzcgz zzcgzVar = this.zzn;
        if (zzcgzVar != null) {
            zzcgzVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final long zzm() {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            return zzcgsVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final long zzn() {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            return zzcgsVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final long zzo() {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            return zzcgsVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzp() {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            return zzcgsVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh, com.google.android.gms.internal.ads.zzche
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzr(final boolean z, final long j) {
        if (this.zzc != null) {
            zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzQ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzs(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzY();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzt(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzu(String str, Exception exc) {
        final String strZzZ = zzZ(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(strZzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzv(String str, Exception exc) {
        final String strZzZ = zzZ("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR(strZzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final Integer zzw() {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            return zzcgsVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzy(int i) {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            zzcgsVar.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzz(int i) {
        zzcgs zzcgsVar = this.zzi;
        if (zzcgsVar != null) {
            zzcgsVar.zzG(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzx(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z = true;
        }
        this.zzj = str;
        zzV(z, num);
    }
}
