package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgln implements zzgko {
    private final zzgok zza;
    private final zzgnr zzb;
    private final ExecutorService zzc;
    private final zzgop zzd;
    private final zzgpu zze;
    private final Object zzf = new Object();
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final boolean zzj;
    private final boolean zzk;
    private zzglm zzl;

    zzgln(zzimx zzimxVar, zzgok zzgokVar, zzgnr zzgnrVar, zzgop zzgopVar, zzgpu zzgpuVar, zzgco zzgcoVar, ExecutorService executorService) {
        this.zza = zzgokVar;
        this.zzb = zzgnrVar;
        this.zzc = executorService;
        this.zzd = zzgopVar;
        this.zze = zzgpuVar;
        this.zzg = zzgcoVar.zzd();
        this.zzh = zzgcoVar.zzm();
        this.zzi = zzgcoVar.zzl();
        this.zzj = zzgcoVar.zzb();
        this.zzk = zzgcoVar.zzc();
    }

    private final ListenableFuture zzs() {
        return zzhbi.zzk(this.zzb.zzf(), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzglh
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzo((byte[]) obj);
                return null;
            }
        }, zzhbz.zza());
    }

    private final void zzt(zzauq zzauqVar, byte[] bArr, boolean z) {
        zzgps zzgpsVarZza = this.zze.zza(20102);
        try {
            try {
                zzgpsVarZza.zza();
                synchronized (this.zzf) {
                    this.zzl = zzglm.zza(zzauqVar, bArr, z);
                }
                zzgpsVarZza.zzc();
            } catch (zzauo e) {
                e = e;
                zzgpsVarZza.zzb(e);
                throw new zzgkp(2, e);
            } catch (zzaus e2) {
                e = e2;
                zzgpsVarZza.zzb(e);
                throw new zzgkp(2, e);
            } catch (Throwable th) {
                zzgpsVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgpsVarZza.zzc();
            throw th2;
        }
    }

    private final String zzu(Map map) throws zzaus, zzauo {
        String strZzb;
        zzgpu zzgpuVar = this.zze;
        zzgps zzgpsVarZza = zzgpuVar.zza(20110);
        try {
            zzgpsVarZza.zza();
            synchronized (this.zzf) {
                zzglm zzglmVar = this.zzl;
                if (zzglmVar == null) {
                    zzgpuVar.zzb(20109);
                    strZzb = "";
                } else {
                    strZzb = zzglmVar.zzb(map);
                }
            }
            zzgpsVarZza.zzc();
            return strZzb;
        } catch (Throwable th) {
            try {
                zzgpsVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgpsVarZza.zzc();
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final String zza() {
        synchronized (this.zzf) {
            zzglm zzglmVar = this.zzl;
            if (zzglmVar == null) {
                return "3.869425873.-1";
            }
            return zzglmVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zzb() {
        if (this.zzk) {
            return zzs();
        }
        zzhba zzhbaVarZzw = zzhba.zzw(this.zzb.zzb());
        ExecutorService executorService = this.zzc;
        return (zzhba) zzhbi.zzh((zzhba) zzhbi.zzj((zzhba) zzhbi.zzg(zzhbaVarZzw, Throwable.class, zzgll.zza, executorService), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi((zzgfd) obj);
            }
        }, executorService), Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj((Throwable) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zzc(final Context context) {
        return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgld
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(context);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzhbi.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgle
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzhbi.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzglf
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzf) {
                zzglm zzglmVar = this.zzl;
                if (zzglmVar != null) {
                    HashMap map = new HashMap();
                    map.put("evt", inputEvent);
                    zzglmVar.zzc(map);
                } else {
                    this.zze.zzb(20105);
                }
            }
        } catch (zzauo | zzaus e) {
            this.zze.zzd(20104, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Multi-variable type inference failed */
    final void zzh(Map map) {
        String strZzb;
        zzgps zzgpsVarZza;
        String str;
        map.put("v", this.zzg);
        ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
        ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
        byte[] bArrZzaN = null;
        long jZzd = -1;
        if (listenableFuture != null) {
            zzgps zzgpsVarZza2 = this.zze.zza(20107);
            try {
                try {
                    zzgpsVarZza2.zza();
                    zzayf zzayfVar = (zzayf) listenableFuture.get(this.zzi, TimeUnit.MILLISECONDS);
                    if (zzayfVar != null) {
                        bArrZzaN = zzayfVar.zzh().zzaN();
                        strZzb = zzayfVar.zzb().length() > 1 ? zzayfVar.zzb() : ExifInterface.LONGITUDE_EAST;
                        try {
                            if (zzayfVar.zzc()) {
                                jZzd = zzayfVar.zzd();
                            }
                        } catch (ClassCastException e) {
                            e = e;
                            zzgpsVarZza2.zzb(e);
                        } catch (InterruptedException e2) {
                            e = e2;
                            zzgpsVarZza2.zzb(e);
                        } catch (ExecutionException e3) {
                            e = e3;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zzgpsVarZza2.zzb(e);
                        } catch (TimeoutException e4) {
                            e = e4;
                            zzgpsVarZza2.zzb(e);
                        }
                    } else {
                        strZzb = ExifInterface.LONGITUDE_EAST;
                    }
                } catch (Throwable th) {
                    zzgpsVarZza2.zzc();
                    throw th;
                }
            } catch (ClassCastException e5) {
                e = e5;
                strZzb = ExifInterface.LONGITUDE_EAST;
                zzgpsVarZza2.zzb(e);
                zzgpsVarZza2.zzc();
                if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
                    zzgpsVarZza = this.zze.zza(20108);
                    try {
                        try {
                            zzgpsVarZza.zza();
                            str = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
                            if (true != zzgtn.zzc(str)) {
                                strZzb = str;
                            }
                        } catch (ClassCastException e6) {
                            e = e6;
                            zzgpsVarZza.zzb(e);
                        } catch (InterruptedException e7) {
                            e = e7;
                            zzgpsVarZza.zzb(e);
                        } catch (ExecutionException e8) {
                            e = e8;
                            Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            zzgpsVarZza.zzb(e);
                        } catch (TimeoutException e9) {
                            e = e9;
                            zzgpsVarZza.zzb(e);
                        }
                        zzgpsVarZza.zzc();
                    } catch (Throwable th2) {
                        zzgpsVarZza.zzc();
                        throw th2;
                    }
                }
                map.put("int", strZzb);
                if (bArrZzaN != null) {
                    map.put("att", bArrZzaN);
                }
                map.put("gv", Long.valueOf(jZzd));
            } catch (InterruptedException e10) {
                e = e10;
                strZzb = ExifInterface.LONGITUDE_EAST;
                zzgpsVarZza2.zzb(e);
                zzgpsVarZza2.zzc();
                if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
                    zzgpsVarZza = this.zze.zza(20108);
                    zzgpsVarZza.zza();
                    str = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
                    if (true != zzgtn.zzc(str)) {
                        strZzb = str;
                    }
                    zzgpsVarZza.zzc();
                }
                map.put("int", strZzb);
                if (bArrZzaN != null) {
                    map.put("att", bArrZzaN);
                }
                map.put("gv", Long.valueOf(jZzd));
            } catch (ExecutionException e11) {
                e = e11;
                strZzb = ExifInterface.LONGITUDE_EAST;
            } catch (TimeoutException e12) {
                e = e12;
                strZzb = ExifInterface.LONGITUDE_EAST;
                zzgpsVarZza2.zzb(e);
                zzgpsVarZza2.zzc();
                if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
                    zzgpsVarZza = this.zze.zza(20108);
                    zzgpsVarZza.zza();
                    str = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
                    if (true != zzgtn.zzc(str)) {
                        strZzb = str;
                    }
                    zzgpsVarZza.zzc();
                }
                map.put("int", strZzb);
                if (bArrZzaN != null) {
                    map.put("att", bArrZzaN);
                }
                map.put("gv", Long.valueOf(jZzd));
            }
            zzgpsVarZza2.zzc();
        } else {
            strZzb = ExifInterface.LONGITUDE_EAST;
        }
        if (strZzb.equals(ExifInterface.LONGITUDE_EAST) && listenableFuture2 != null) {
            zzgpsVarZza = this.zze.zza(20108);
            zzgpsVarZza.zza();
            str = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
            if (true != zzgtn.zzc(str)) {
                strZzb = str;
            }
            zzgpsVarZza.zzc();
        }
        map.put("int", strZzb);
        if (bArrZzaN != null) {
            map.put("att", bArrZzaN);
        }
        map.put("gv", Long.valueOf(jZzd));
    }

    final /* synthetic */ ListenableFuture zzi(zzgfd zzgfdVar) {
        if (this.zza.zzb(zzgfdVar)) {
            return zzhbi.zzk(this.zzb.zze(), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzglg
                @Override // com.google.android.gms.internal.ads.zzgsn
                public final /* synthetic */ Object apply(Object obj) {
                    this.zza.zzn((byte[]) obj);
                    return null;
                }
            }, zzhbz.zza());
        }
        this.zze.zzb(20103);
        throw new zzgkp(1);
    }

    final /* synthetic */ ListenableFuture zzj(Throwable th) {
        return this.zzj ? zzs() : zzhbi.zzc(th);
    }

    final /* synthetic */ String zzk(final Context context) throws zzaus, zzauo {
        final HashMap map = new HashMap();
        this.zze.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgli
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(map, context);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    final /* synthetic */ String zzl(final Context context, String str, final View view, final Activity activity) throws zzaus, zzauo {
        final HashMap map = new HashMap();
        final String str2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzglj
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    final /* synthetic */ String zzm(final Context context, final String str, final View view, Activity activity) throws zzaus, zzauo {
        final HashMap map = new HashMap();
        final Activity activity2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzglk
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    final /* synthetic */ Void zzn(byte[] bArr) {
        zzt(zzglq.zzc(), bArr, false);
        return null;
    }

    final /* synthetic */ Void zzo(byte[] bArr) {
        zzt(zzglq.zzc(), bArr, true);
        return null;
    }

    final /* synthetic */ void zzp(Map map, Context context) {
        map.putAll(this.zzd.zzb());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
        map.put("ctx", context);
    }

    final /* synthetic */ void zzq(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzc(context, view));
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", activity);
        map.put("bds", null);
    }

    final /* synthetic */ void zzr(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzd());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, "c");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", null);
        map.put("bds", str);
    }
}
