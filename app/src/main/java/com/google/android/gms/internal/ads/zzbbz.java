package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbbz extends zzbcy {
    private static final zzbcz zzh = new zzbcz();
    private final zzawy zzi;
    private final Context zzj;
    private final zzazf zzk;

    public zzbbz(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2, Context context, zzawr zzawrVar, zzawy zzawyVar, zzazf zzazfVar) {
        super(zzbblVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", zzaxfVar, i, 27);
        this.zzj = context;
        this.zzi = zzawyVar;
        this.zzk = zzazfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzazc zzc() throws IllegalAccessException, InvocationTargetException {
        String str;
        zzbhv zzbhvVar = zzbie.zzdE;
        int iZzb = (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue() <= 0 || ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue() >= this.zzi.zzb()) ? this.zzi.zzb() : ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue();
        zzazc zzazcVar = new zzazc((String) this.zze.invoke(null, this.zzj, false, ""));
        zzazf zzazfVar = this.zzk;
        if (zzazfVar == null || zzazfVar.zza() == null) {
            str = ExifInterface.LONGITUDE_EAST;
        } else {
            try {
                str = (String) zzazfVar.zza().get(iZzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = ExifInterface.LONGITUDE_EAST;
            }
        }
        zzazcVar.zza = str;
        return zzazcVar;
    }

    private final String zzd() {
        try {
            zzbbl zzbblVar = this.zza;
            if (zzbblVar.zzm() != null) {
                zzbblVar.zzm().get();
            }
            zzayf zzayfVarZzl = zzbblVar.zzl();
            if (zzayfVarZzl == null || !zzayfVarZzl.zza()) {
                return null;
            }
            return zzayfVarZzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzazc zzazcVarZzc;
        zzazc zzazcVar;
        zzbcz zzbczVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzbczVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            zzazc zzazcVar2 = (zzazc) atomicReferenceZza.get();
            if (zzazcVar2 == null || zzbbo.zzc(zzazcVar2.zza) || zzazcVar2.zza.equals(ExifInterface.LONGITUDE_EAST) || zzazcVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzbbo.zzc(null)) {
                    (!zzbbo.zzc(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                if (this.zzk != null) {
                    zzazcVarZzc = zzc();
                } else {
                    Boolean boolValueOf = Boolean.valueOf(i == 3 && !this.zzi.zza());
                    Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdq);
                    String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdp)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzi() && zzbbo.zzc(strZzb)) {
                        strZzb = zzd();
                    }
                    zzazc zzazcVar3 = new zzazc((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                    String str = zzazcVar3.zza;
                    if (zzbbo.zzc(str) || str.equals(ExifInterface.LONGITUDE_EAST)) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String strZzd = zzd();
                            if (!zzbbo.zzc(strZzd)) {
                                zzazcVar3.zza = strZzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzazcVarZzc = zzazcVar3;
                }
                atomicReferenceZza.set(zzazcVarZzc);
            }
            zzazcVar = (zzazc) atomicReferenceZza.get();
        }
        zzaxf zzaxfVar = this.zzd;
        synchronized (zzaxfVar) {
            if (zzazcVar != null) {
                zzaxfVar.zzo(zzazcVar.zza);
                zzaxfVar.zzu(zzazcVar.zzb);
                zzaxfVar.zzt(zzazcVar.zzc);
                zzaxfVar.zzD(zzazcVar.zzd);
                zzaxfVar.zzE(zzazcVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] bArrZzb = zzbbo.zzb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdr));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzbbo.zzb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzds)))));
            }
            Context context = this.zzj;
            return zzbdb.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
