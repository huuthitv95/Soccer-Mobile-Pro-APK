package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzawa {
    public final zzauv zza;
    public final zzavw zzb;
    public final zzavt zzc;
    public final zzavo zzd;

    public zzawa(zzauv zzauvVar, zzavw zzavwVar, zzavo zzavoVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        this.zza = zzauvVar;
        this.zzb = zzavwVar;
        this.zzd = zzavoVar;
        this.zzc = new zzavt((i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)) ^ (i8 % 454333378));
    }

    public final Optional zza() {
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzavs();
            }
            zzavq zzavqVar = (zzavq) arrayDeque.pop();
            long j = zzavqVar.zza;
            long j2 = zzavqVar.zzb;
            long j3 = zzavqVar.zzc;
            zzavw zzavwVar = this.zzb;
            if (zzavwVar.zzb < j2) {
                return Optional.of(zzaup.zzG);
            }
            this.zzd.zza(j);
            if (j3 == 0) {
                while (zzavwVar.zzb > j2) {
                    zzavwVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzavm e) {
            e = e;
            throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzavn e2) {
            e = e2;
            throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzavs unused) {
            return Optional.of(zzaup.zzw);
        } catch (zzavu unused2) {
            return Optional.of(zzaup.zzG);
        }
    }
}
