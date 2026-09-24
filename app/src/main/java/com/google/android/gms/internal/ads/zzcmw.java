package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.gadsme.nativeplugin.BuildConfig;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcmw implements zzbad {
    private final Context zza;
    private final zzgck zzb;

    zzcmw(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdD)).intValue();
        int i = 2;
        if (iIntValue != 1) {
            i = (iIntValue == 2 || iIntValue != 3) ? 3 : 4;
        }
        zzgdf zzgdfVarZze = zzgdg.zze();
        zzgdfVarZze.zza(((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdJ)).floatValue());
        zzgdg zzgdgVar = (zzgdg) zzgdfVarZze.zzbu();
        zzgdh zzgdhVarZzi = zzgdi.zzi();
        zzgdhVarZzi.zza(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdK)).booleanValue());
        zzgdhVarZzi.zzb(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdM)).longValue());
        zzgdi zzgdiVar = (zzgdi) zzgdhVarZzi.zzbu();
        zzgcn zzgcnVarZzw = zzgco.zzw();
        zzgcnVarZzw.zzi(i);
        zzgcnVarZzw.zzb(versionInfoParcel.afmaVersion);
        zzgcnVarZzw.zza(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdk)).booleanValue());
        zzgcnVarZzw.zzh(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdA)).intValue() == -1);
        zzgcnVarZzw.zzg(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdC)).intValue());
        zzgcnVarZzw.zze(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdL)).longValue());
        zzgcnVarZzw.zzd(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdB)).intValue());
        zzgcnVarZzw.zzc(zzgdgVar);
        zzgcnVarZzw.zzf(zzgdiVar);
        zzgck zzgckVarZza = zzgck.zza(context, zzcff.zza, (zzgco) zzgcnVarZzw.zzbu());
        this.zzb = zzgckVarZza;
        zzgckVarZza.zzb();
    }

    public final String zza() {
        int iZzh = this.zzb.zzh() - 1;
        if (iZzh == 1) {
            return BuildConfig.VERSION_NAME;
        }
        if (iZzh != 2) {
            return iZzh != 3 ? "uns" : "3.0";
        }
        return "2.0";
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    @Deprecated
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        Context context = this.zza;
        float fZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        float fZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2);
        zzgck zzgckVar = this.zzb;
        long j = i3;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j, 0, fZzE, fZzE2, 0);
        zzgckVar.zzg(motionEventObtain);
        motionEventObtain.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float fZzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j, 2, fZzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgckVar.zzg(motionEventObtain2);
        motionEventObtain2.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float fZzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j, 1, fZzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgckVar.zzg(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
