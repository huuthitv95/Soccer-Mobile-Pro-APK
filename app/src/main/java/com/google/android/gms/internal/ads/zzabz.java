package com.google.android.gms.internal.ads;

import androidx.media3.common.C0684C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabz {
    private static final Comparator zza = zzaby.zza;
    private static final Comparator zzb = zzabx.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzabw[] zzd = new zzabw[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzabz(int i) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i, float f) {
        zzabw zzabwVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzabw[] zzabwVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzabwVar = zzabwVarArr[i3];
        } else {
            zzabwVar = new zzabw(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzabwVar.zza = i4;
        zzabwVar.zzb = i;
        zzabwVar.zzc = f;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzabwVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 + C0684C.PRIORITY_PROCESSING_FOREGROUND;
            zzabw zzabwVar2 = (zzabw) arrayList.get(0);
            int i7 = zzabwVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                arrayList.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzabw[] zzabwVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzabwVarArr2[i8] = zzabwVar2;
                }
            } else {
                zzabwVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final float zzc(float f) {
        int i = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzabw) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f3 = 0.5f * f2;
            zzabw zzabwVar = (zzabw) arrayList.get(i);
            i2 += zzabwVar.zzb;
            if (i2 >= f3) {
                return zzabwVar.zzc;
            }
            i++;
        }
    }
}
