package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbaa implements zzbad {
    private static zzbaa zzb;
    private final Context zzc;
    private final zzfya zzd;
    private final zzfyh zze;
    private final zzfyj zzf;
    private final zzbbf zzg;
    private final zzfwq zzh;
    private final Executor zzi;
    private final zzbdh zzj;
    private final zzfyg zzk;
    private final zzbbu zzm;
    private final zzbbm zzn;
    private final zzbbd zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzbaa(Context context, zzfwq zzfwqVar, zzfya zzfyaVar, zzfyh zzfyhVar, zzfyj zzfyjVar, zzbbf zzbbfVar, Executor executor, zzfwl zzfwlVar, zzbdh zzbdhVar, zzbbu zzbbuVar, zzbbm zzbbmVar, zzbbd zzbbdVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfwqVar;
        this.zzd = zzfyaVar;
        this.zze = zzfyhVar;
        this.zzf = zzfyjVar;
        this.zzg = zzbbfVar;
        this.zzi = executor;
        this.zzj = zzbdhVar;
        this.zzm = zzbbuVar;
        this.zzn = zzbbmVar;
        this.zzo = zzbbdVar;
        this.zzr = false;
        this.zzk = new zzazy(this, zzfwlVar);
    }

    public static synchronized zzbaa zza(Context context, zzawh zzawhVar, boolean z) {
        zzfwr zzfwrVarZzh;
        zzfwrVarZzh = zzfws.zzh();
        zzfwrVarZzh.zza(zzawhVar.zza());
        zzfwrVarZzh.zzb(zzawhVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfwrVarZzh.zzh(), z);
    }

    private static synchronized zzbaa zzs(Context context, Executor executor, zzfws zzfwsVar, boolean z) {
        if (zzb == null) {
            zzfwq zzfwqVarZza = zzfwq.zza(context, executor, z);
            zzbao zzbaoVarZza = zzbao.zza(context);
            zzbbu zzbbuVarZza = zzbbu.zza(context, executor);
            zzbbm zzbbmVar = new zzbbm();
            zzbbd zzbbdVar = new zzbbd();
            zzfxg zzfxgVarZza = zzfxg.zza(context, executor, zzfwqVarZza, zzfwsVar);
            zzbbe zzbbeVar = new zzbbe(context);
            zzbbf zzbbfVar = new zzbbf(zzfwsVar, zzfxgVarZza, new zzbbs(context, zzbbeVar), zzbbeVar, zzbaoVarZza, zzbbuVarZza, zzbbmVar, zzbbdVar);
            zzbdh zzbdhVarZzb = zzfxn.zzb(context, zzfwqVarZza);
            zzfwl zzfwlVar = new zzfwl();
            zzbaa zzbaaVar = new zzbaa(context, zzfwqVarZza, new zzfya(context, zzbdhVarZzb), new zzfyh(context, zzbdhVarZzb, new zzazx(zzfwqVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdl)).booleanValue()), new zzfyj(context, zzbbfVar, zzfwqVarZza, zzfwlVar, false), zzbbfVar, executor, zzfwlVar, zzbdhVarZzb, zzbbuVarZza, zzbbmVar, zzbbdVar);
            zzb = zzbaaVar;
            zzbaaVar.zzc();
            zzb.zzm();
        }
        return zzb;
    }

    private final zzfxz zzt(int i) {
        if (zzfxn.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdj)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfxz zzfxzVarZzt = zzt(1);
        if (zzfxzVarZzt == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfxzVarZzt)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzd(MotionEvent motionEvent) {
        zzfwt zzfwtVarZzb = this.zzf.zzb();
        if (zzfwtVarZzb != null) {
            try {
                zzfwtVarZzb.zzd(null, motionEvent);
            } catch (zzfyi e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zze(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznt)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzf(Context context, String str, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzc();
        zzm();
        zzfwt zzfwtVarZzb = this.zzf.zzb();
        if (zzfwtVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfwtVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzo.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzj(Context context, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzb(context, view);
        zzm();
        zzfwt zzfwtVarZzb = this.zzf.zzb();
        if (zzfwtVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfwtVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzl(Context context) {
        this.zzm.zzb();
        this.zzn.zza();
        zzm();
        zzfwt zzfwtVarZzb = this.zzf.zzb();
        if (zzfwtVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfwtVarZzb.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfxz zzfxzVarZzc = this.zzf.zzc();
                if ((zzfxzVarZzc == null || zzfxzVarZzc.zze(3600L)) && zzfxn.zza(this.zzj)) {
                    this.zzi.execute(new zzazz(this));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d0 A[Catch: all -> 0x011c, zzieg -> 0x011e, TryCatch #0 {zzieg -> 0x011e, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:29:0x009e, B:33:0x00b7, B:39:0x00d0, B:40:0x00dd, B:42:0x00e3, B:44:0x00eb, B:45:0x00ed, B:36:0x00c1, B:37:0x00c8, B:23:0x0074, B:25:0x007a, B:27:0x008c, B:46:0x00f7, B:47:0x0104, B:48:0x0111), top: B:58:0x0021, outer: #2 }] */
    final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzfxz zzfxzVarZzt;
        zzbdp zzbdpVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfxz zzfxzVarZzt2 = zzt(1);
        if (zzfxzVarZzt2 != null) {
            String strZza = zzfxzVarZzt2.zza().zza();
            strZzb = zzfxzVarZzt2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbdh zzbdhVar = this.zzj;
                zzfwq zzfwqVar = this.zzh;
                zzfye zzfyeVarZza = zzfwz.zza(context, 1, zzbdhVar, str, strZzb, "1", zzfwqVar);
                byte[] bArr = zzfyeVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfwqVar.zzb(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzbdj zzbdjVarZzd = zzbdj.zzd(zzicn.zzt(bArr, 0, length), zzidb.zza());
                        if (zzbdjVarZzd.zza().zza().isEmpty() || zzbdjVarZzd.zza().zzb().isEmpty() || zzbdjVarZzd.zzc().zzA().length == 0 || ((zzfxzVarZzt = zzt(1)) != null && (zzbdpVarZza = zzfxzVarZzt.zza()) != null && zzbdjVarZzd.zza().zza().equals(zzbdpVarZza.zza()) && zzbdjVarZzd.zza().zzb().equals(zzbdpVarZza.zzb()))) {
                            this.zzh.zzb(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfyg zzfygVar = this.zzk;
                            int i = zzfyeVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdj)).booleanValue()) {
                                zZza = this.zzd.zza(zzbdjVarZzd, zzfygVar);
                            } else if (i == 3) {
                                zZza = this.zze.zzb(zzbdjVarZzd);
                            } else if (i == 4) {
                                zZza = this.zze.zza(zzbdjVarZzd, zzfygVar);
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfxz zzfxzVarZzt3 = zzt(1);
                                if (zzfxzVarZzt3 != null) {
                                    if (this.zzf.zza(zzfxzVarZzt3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzieg e) {
                this.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
        } finally {
            this.zzl.countDown();
        }
    }

    final /* synthetic */ zzfwq zzo() {
        return this.zzh;
    }

    final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    final /* synthetic */ void zzr(boolean z) {
        this.zzq = z;
    }
}
