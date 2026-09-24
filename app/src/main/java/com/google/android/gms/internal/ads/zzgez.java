package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgez implements zzgeq, zzgem, zzgff {
    private static final zzihf zza;
    private final Context zzb;
    private final zzgdu zzc;
    private final ExecutorService zzd;
    private final zzgdn zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzawi zzq = zzawj.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();

    static {
        zzihe zziheVarZzc = zzihf.zzc();
        zziheVarZzc.zza(17);
        zza = (zzihf) zziheVarZzc.zzbu();
    }

    public zzgez(Context context, zzgdu zzgduVar, ExecutorService executorService, zzgdn zzgdnVar, Random random, String str, long j, long j2, double d, String str2, long j3) {
        this.zzb = context;
        this.zzc = zzgduVar;
        this.zzd = executorService;
        this.zze = zzgdnVar;
        this.zzg = str;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = d;
        this.zzk = str2;
        this.zzl = j3;
        this.zzf = random.nextDouble() < d;
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final ListenableFuture zza() {
        return zzhbi.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgex
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final void zzb(int i, long j, Throwable th, String str) {
        long jLongValue;
        Long lValueOf;
        if (this.zzf) {
            synchronized (this.zzo) {
                List list = this.zzr;
                synchronized (this.zzp) {
                    HashMap map = this.zzt;
                    Integer numValueOf = Integer.valueOf(i);
                    Long l = (Long) map.get(numValueOf);
                    if (l == null) {
                        l = 0L;
                    }
                    jLongValue = 1 + l.longValue();
                    lValueOf = Long.valueOf(jLongValue);
                    map.put(numValueOf, lValueOf);
                }
                lValueOf.getClass();
                list.add(new zzgew(i, j, th, str, jLongValue));
                if (!this.zzs) {
                    this.zzs = true;
                    this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgey
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzd();
                        }
                    }, this.zzi);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgff
    public final void zzc(zzgfe zzgfeVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgfeVar.zza());
        }
    }

    final void zzd() {
        zzawi zzawiVar;
        zzgvz zzgvzVarZzq;
        String string;
        synchronized (this.zzn) {
            zzawiVar = (zzawi) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzgvzVarZzq = zzgvz.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzgvzVarZzq.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            zzgew zzgewVar = (zzgew) zzgvzVarZzq.get(i);
            if (i2 >= this.zzh) {
                zze((zzawj) zzawiVar.zzbu());
                zzawiVar.zzb();
                i2 = 0;
            }
            zzaxa zzaxaVarZza = zzaxb.zza();
            zzaxaVarZza.zza(zzgewVar.zza);
            zzaxaVarZza.zzb(zzgewVar.zzb);
            zzaxaVarZza.zze(zzgewVar.zze);
            String str = zzgewVar.zzd;
            if (str != null) {
                zzaxaVarZza.zzf(str);
            }
            Throwable th = zzgewVar.zzc;
            zzaxaVarZza.zzg(th == null ? 2 : 3);
            if (th != null) {
                zzaxaVarZza.zzc(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            string = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    string = "";
                }
                zzaxaVarZza.zzd(string);
            }
            zzawiVar.zza((zzaxb) zzaxaVarZza.zzbu());
            i++;
            i2++;
        }
        if (i2 > 0) {
            zze((zzawj) zzawiVar.zzbu());
            zzawiVar.zzb();
        }
    }

    protected final void zze(zzawj zzawjVar) {
        try {
            zzgeu zzgeuVarZza = zzgev.zza();
            zzgeuVarZza.zzb(zza);
            zzges zzgesVarZza = zzget.zza();
            zzgesVarZza.zza(zzawjVar);
            zzgeuVarZza.zza((zzget) zzgesVarZza.zzbu());
            this.zze.zzb(this.zzg, ((zzgev) zzgeuVarZza.zzbu()).zzaN(), CommonGatewayClient.HEADER_PROTOBUF);
        } catch (RuntimeException unused) {
        }
    }

    final /* synthetic */ void zzf() {
        int i;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        double d = this.zzj;
        long j = this.zzl;
        Locale locale = Locale.getDefault();
        zzawi zzawiVarZza = zzawj.zza();
        zzawiVarZza.zzc(Build.VERSION.SDK_INT);
        zzawiVarZza.zzd(Build.MODEL);
        zzawiVarZza.zze(locale.getLanguage());
        zzawiVarZza.zzf(locale.getCountry());
        zzawiVarZza.zzi(str);
        zzawiVarZza.zzg(context.getPackageName());
        zzawiVarZza.zzl(j);
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            zzawiVarZza.zzk((int) (1.0d / d));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zzawiVarZza.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zzawiVarZza.zzm(i);
        } catch (RuntimeException unused2) {
        }
        zzawj zzawjVar = (zzawj) zzawiVarZza.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzawjVar);
        }
    }
}
