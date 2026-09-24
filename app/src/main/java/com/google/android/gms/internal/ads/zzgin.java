package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgin extends zzgik {
    private final Map zza;
    private final zzghg zzb;
    private final DisplayMetrics zzc;

    zzgin(zzaxf zzaxfVar, zzghg zzghgVar, Map map, DisplayMetrics displayMetrics, zzgpu zzgpuVar) {
        super("ksCcm9STSGSzSoV9tjhUqH1fQaul5xz2DaiecQSQ1K1N1HTiSrTD427/oPr8ccue", "zJpc2Ezdor+bAY6wK+g3rUu0yAue75LbxJGq3xWFA+U=", zzaxfVar, zzghgVar, zzgpuVar.zza(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        this.zzb = zzghgVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / ((double) displayMetrics.density));
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object obj = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr = (Object[]) method.invoke("", obj, displayMetrics);
        objArr.getClass();
        Object[] objArr2 = objArr;
        zzayb zzaybVarZza = zzayc.zza();
        Object obj2 = objArr2[0];
        if (obj2 != null && objArr2[1] != null) {
            zzaybVarZza.zza(((Long) obj2).longValue());
            zzaybVarZza.zzb(((Long) objArr2[1]).longValue());
        }
        Object obj3 = objArr2[2];
        if (obj3 != null) {
            zzaybVarZza.zzh(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[3];
        if (obj4 != null) {
            zzaybVarZza.zzf(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[4];
        if (obj5 != null) {
            zzaybVarZza.zzc(((Long) obj5).longValue());
        }
        Object obj6 = objArr2[5];
        if (obj6 != null) {
            zzaybVarZza.zzs(((Long) obj6).longValue() != 0 ? 2 : 1);
        }
        Object obj7 = objArr2[6];
        if (obj7 != null) {
            zzaybVarZza.zzj(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[7];
        if (obj8 != null) {
            zzaybVarZza.zzi(((Long) obj8).longValue());
        }
        Object obj9 = objArr2[8];
        if (obj9 != null) {
            zzaybVarZza.zzt(((Long) obj9).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzaxfVar) {
            Method methodZzc = this.zzb.zzc("UE2ABGv5l/V3kKbCM/VgO5eQ1h3z+cPMOyCPI/dIsC43b4/cTZeQpl7GRL4h/vIk", "F3Gi1VclXFdiZroyLatwhPRyfihzegTPzd2DFW5Fd7E=");
            if (methodZzc == null) {
                throw null;
            }
            Method method2 = methodZzc;
            Object[] objArr3 = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
            if (objArr3 == null) {
                throw null;
            }
            Object[] objArr4 = objArr3;
            Object obj10 = objArr4[0];
            if (obj10 != null) {
                zzaxfVar.zzh(((Long) obj10).longValue());
            }
            Object obj11 = objArr4[1];
            if (obj11 != null) {
                zzaxfVar.zzi(((Long) obj11).longValue());
            }
            Object obj12 = objArr4[2];
            if (obj12 != null) {
                zzaxfVar.zzj(((Long) obj12).longValue());
            }
            Object obj13 = objArr4[3];
            if (obj13 != null) {
                zzaxfVar.zzv(((Long) obj13).longValue());
            }
            Object obj14 = objArr4[4];
            if (obj14 != null) {
                zzaxfVar.zzw(((Long) obj14).longValue());
            }
            zzgga zzggaVar = (zzgga) map.get("oe");
            if (zzggaVar != null) {
                long j = zzggaVar.zza;
                if (j > 0) {
                    zzaxfVar.zzz(j);
                }
                long j2 = zzggaVar.zzb;
                if (j2 > 0) {
                    zzaxfVar.zzy(j2);
                }
                long j3 = zzggaVar.zzc;
                if (j3 > 0) {
                    zzaxfVar.zzx(j3);
                }
                long j4 = zzggaVar.zzd;
                if (j4 > 0) {
                    zzaxfVar.zzA(j4);
                }
            }
            zzgga zzggaVar2 = (zzgga) map.get("oe");
            if (zzggaVar2 != null && zzggaVar2.zza != 0 && zzc(displayMetrics)) {
                double d = zzggaVar2.zze;
                if (displayMetrics == null) {
                    throw null;
                }
                zzaybVarZza.zzl(zzb(d, displayMetrics));
                zzaybVarZza.zzm(zzb(zzggaVar2.zzh - zzggaVar2.zzf, displayMetrics));
                zzaybVarZza.zzn(zzb(zzggaVar2.zzi - zzggaVar2.zzg, displayMetrics));
                zzaybVarZza.zzq(zzb(zzggaVar2.zzf, displayMetrics));
                zzaybVarZza.zzr(zzb(zzggaVar2.zzg, displayMetrics));
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                if (motionEvent != null) {
                    long jZzb = zzb(((zzggaVar2.zzf - zzggaVar2.zzh) + motionEvent.getRawX()) - motionEvent.getX(), displayMetrics);
                    if (jZzb != 0) {
                        zzaybVarZza.zzo(jZzb);
                    }
                    long jZzb2 = zzb(((zzggaVar2.zzg - zzggaVar2.zzi) + motionEvent.getRawY()) - motionEvent.getY(), displayMetrics);
                    if (jZzb2 != 0) {
                        zzaybVarZza.zzp(jZzb2);
                    }
                }
            }
            zzaxfVar.zzJ(zzaybVarZza);
            zzggb[] zzggbVarArr = (zzggb[]) map.get("ro");
            if (zzggbVarArr != null && zzc(displayMetrics)) {
                for (int i = 0; i <= zzggbVarArr.length - 2; i++) {
                    zzggb zzggbVar = zzggbVarArr[i];
                    zzayb zzaybVarZza2 = zzayc.zza();
                    double d2 = zzggbVar.zza;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    zzaybVarZza2.zza(zzb(d2, displayMetrics));
                    zzaybVarZza2.zzb(zzb(zzggbVar.zzb, displayMetrics));
                    zzaxfVar.zzK((zzayc) zzaybVarZza2.zzbu());
                }
            }
        }
    }
}
