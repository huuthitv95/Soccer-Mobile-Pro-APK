package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzfpi {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzfpi$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
        public static zzfpi zzn(Context context, int i) {
            boolean zBooleanValue;
            if (zzfpv.zza()) {
                int i2 = i - 2;
                if (i2 == 20 || i2 == 21) {
                    zBooleanValue = ((Boolean) zzbjx.zze.zze()).booleanValue();
                } else if (i2 != 110) {
                    switch (i2) {
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                        case 8:
                            zBooleanValue = ((Boolean) zzbjx.zzc.zze()).booleanValue();
                            break;
                        case 4:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            zBooleanValue = ((Boolean) zzbjx.zzd.zze()).booleanValue();
                            break;
                        case 5:
                            zBooleanValue = ((Boolean) zzbjx.zzb.zze()).booleanValue();
                            break;
                    }
                } else {
                    zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzki)).booleanValue();
                }
                if (zBooleanValue) {
                    return new zzfpk(context, i);
                }
            }
            return new zzfql();
        }

        public static zzfpi zzo(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
            zzfpi zzfpiVarZzn = zzn(context, i);
            if (zzfpiVarZzn instanceof zzfpk) {
                zzfpiVarZzn.zza();
                zzfpiVarZzn.zzp(i2);
                zzfpiVarZzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(zzmVar.zzm));
                String str = zzmVar.zzp;
                if (zzfpr.zza(str)) {
                    zzfpiVarZzn.zze(str);
                }
            }
            return zzfpiVarZzn;
        }
    }

    zzfpi zza();

    boolean zzb();

    zzfpi zzc();

    zzfpi zzd(boolean z);

    zzfpi zze(String str);

    zzfpi zzf(zzfpx zzfpxVar);

    zzfpi zzg(zzfkd zzfkdVar);

    zzfpi zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfpi zzi(String str);

    zzfpi zzj(Throwable th);

    zzfpi zzk(String str);

    boolean zzl();

    zzfpl zzm();

    zzfpi zzp(int i);
}
