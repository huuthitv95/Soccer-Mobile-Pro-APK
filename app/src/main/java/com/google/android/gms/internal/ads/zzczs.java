package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzczs implements zzdfl, zzdky {
    private zzcak zza;
    private final Context zzc;
    private final zzfpv zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzczs(Context context, zzfpv zzfpvVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfpvVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzc() {
        zzcak zzcakVar;
        int i;
        zzbtw zzbtwVarZzb;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzbke.zzo.zze()).booleanValue()) {
                i = 2;
            } else {
                i = 3;
                if (!((Boolean) zzbke.zzp.zze()).booleanValue()) {
                    if (((Boolean) zzbke.zzn.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i = 2;
                            } else if (!TextUtils.equals(strOptString, NotificationCompat.CATEGORY_SERVICE)) {
                                i = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i = 1;
                    }
                }
            }
            int i2 = i - 1;
            if (i2 == 1) {
                zzbtwVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            } else if (i2 == 2) {
                zzbtwVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            }
            zzbtq zzbtqVar = zzbtt.zza;
            this.zza = new zzcan(this.zzc, zzbtwVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbtqVar, zzbtqVar), this.zze, this.zzf);
            this.zzg = true;
        }
        if (this.zzg && (zzcakVar = this.zza) != null) {
            ListenableFuture listenableFutureZzb = zzcakVar.zzb();
            if (!this.zzh && ((Boolean) zzbjw.zzi.zze()).booleanValue()) {
                listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf();
                    }
                }, this.zzf);
            }
            zzcfi.zza(listenableFutureZzb, "persistFlagsClient", zzcff.zzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(zzfke zzfkeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zze(String str) {
        zzc();
    }

    final /* synthetic */ void zzf() {
        zzbhp.zze(this.zzc);
        this.zzh = true;
    }
}
