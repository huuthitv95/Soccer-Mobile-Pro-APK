package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzanr {
    private final zzes zza = new zzes();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final zzcx zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzes zzesVar = this.zza;
        if (zzesVar.zze() == 0 || zzesVar.zzg() != zzesVar.zze() || !this.zzc) {
            return null;
        }
        zzesVar.zzh(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int iZzs = zzesVar.zzs();
            if (iZzs != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzesVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzesVar.zzs();
                    }
                    i = iZzs3 + i3;
                    Arrays.fill(iArr, i3, i, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzesVar.zzs()]);
                }
            }
            i3 = i;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(bitmapCreateBitmap);
        zzcwVar.zzi(this.zzf / this.zzd);
        zzcwVar.zzj(0);
        zzcwVar.zzf(this.zzg / this.zze, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(this.zzh / this.zzd);
        zzcwVar.zzn(this.zzi / this.zze);
        return zzcwVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    final /* synthetic */ void zzc(zzes zzesVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzesVar.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i2 = 0;
        for (int i3 = i / 5; i2 < i3; i3 = i3) {
            int iZzs = zzesVar.zzs();
            int iZzs2 = zzesVar.zzs();
            int iZzs3 = zzesVar.zzs();
            int iZzs4 = zzesVar.zzs();
            double d = iZzs2;
            int iZzs5 = zzesVar.zzs() << 24;
            String str = zzfk.zza;
            double d2 = iZzs3 - 128;
            double d3 = iZzs4 - 128;
            iArr[iZzs] = (Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)) << 16) | iZzs5 | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255));
            i2++;
        }
        this.zzc = true;
    }

    final /* synthetic */ void zzd(zzes zzesVar, int i) {
        int iZzx;
        if (i < 4) {
            return;
        }
        zzesVar.zzk(3);
        int i2 = i - 4;
        if ((zzesVar.zzs() & 128) != 0) {
            if (i2 < 7 || (iZzx = zzesVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzesVar.zzt();
            this.zzi = zzesVar.zzt();
            this.zza.zza(iZzx - 4);
            i2 = i - 11;
        }
        zzes zzesVar2 = this.zza;
        int iZzg = zzesVar2.zzg();
        int iZze = zzesVar2.zze();
        if (iZzg >= iZze || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iZze - iZzg);
        zzesVar.zzm(zzesVar2.zzi(), iZzg, iMin);
        zzesVar2.zzh(iZzg + iMin);
    }

    final /* synthetic */ void zze(zzes zzesVar, int i) {
        if (i < 19) {
            return;
        }
        this.zzd = zzesVar.zzt();
        this.zze = zzesVar.zzt();
        zzesVar.zzk(11);
        this.zzf = zzesVar.zzt();
        this.zzg = zzesVar.zzt();
    }
}
