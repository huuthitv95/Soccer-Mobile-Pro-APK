package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapr implements zzapm {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzare zzb;
    private zzapq zzg;
    private long zzh;
    private String zzi;
    private zzahb zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzapp zze = new zzapp(128);
    private long zzl = -9223372036854775807L;
    private final zzaqd zzf = new zzaqd(178, 128);
    private final zzes zzc = new zzes();

    zzapr(zzare zzareVar, String str) {
        this.zzb = zzareVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        zzgo.zzj(this.zzd);
        this.zze.zza();
        zzapq zzapqVar = this.zzg;
        if (zzapqVar != null) {
            zzapqVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzi = zzaraVar.zzc();
        this.zzj = zzafsVar.zzu(zzaraVar.zzb(), 2);
        this.zzg = new zzapq(this.zzj);
        this.zzb.zza(zzafsVar, zzaraVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0111  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        int i;
        int i2;
        this.zzg.getClass();
        this.zzj.getClass();
        int iZzg = zzesVar.zzg();
        int iZze = zzesVar.zze();
        byte[] bArrZzi = zzesVar.zzi();
        this.zzh += (long) zzesVar.zzd();
        this.zzj.zzc(zzesVar, zzesVar.zzd());
        while (true) {
            int iZzi = zzgo.zzi(bArrZzi, iZzg, iZze, this.zzd);
            if (iZzi == iZze) {
                break;
            }
            int i3 = iZzi + 3;
            int i4 = zzesVar.zzi()[i3] & 255;
            int i5 = iZzi - iZzg;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zzc(bArrZzi, iZzg, iZzi);
                }
                int i6 = i5 < 0 ? -i5 : 0;
                zzapp zzappVar = this.zze;
                if (zzappVar.zzb(i4, i6)) {
                    zzahb zzahbVar = this.zzj;
                    int i7 = zzappVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzappVar.zzc, zzappVar.zza);
                    zzer zzerVar = new zzer(bArrCopyOf, bArrCopyOf.length);
                    zzerVar.zzo(i7);
                    zzerVar.zzo(4);
                    zzerVar.zzg();
                    zzerVar.zzh(8);
                    if (zzerVar.zzi()) {
                        zzerVar.zzh(4);
                        zzerVar.zzh(3);
                    }
                    int iZzj = zzerVar.zzj(4);
                    float f = 1.0f;
                    if (iZzj == 15) {
                        int iZzj2 = zzerVar.zzj(8);
                        int iZzj3 = zzerVar.zzj(8);
                        if (iZzj3 == 0) {
                            zzef.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = iZzj2 / iZzj3;
                        }
                    } else if (iZzj < 7) {
                        f = zza[iZzj];
                    } else {
                        zzef.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzerVar.zzi()) {
                        zzerVar.zzh(2);
                        zzerVar.zzh(1);
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(15);
                            zzerVar.zzg();
                            zzerVar.zzh(15);
                            zzerVar.zzg();
                            zzerVar.zzh(15);
                            zzerVar.zzg();
                            zzerVar.zzh(3);
                            zzerVar.zzh(11);
                            zzerVar.zzg();
                            zzerVar.zzh(15);
                            zzerVar.zzg();
                            i2 = 2;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        i2 = 2;
                    }
                    if (zzerVar.zzj(i2) != 0) {
                        zzef.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzerVar.zzg();
                    int iZzj4 = zzerVar.zzj(16);
                    zzerVar.zzg();
                    if (zzerVar.zzi()) {
                        if (iZzj4 == 0) {
                            zzef.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i8 = iZzj4 - 1;
                            int i9 = 0;
                            while (i8 > 0) {
                                i8 >>= 1;
                                i9++;
                            }
                            zzerVar.zzh(i9);
                        }
                    }
                    zzerVar.zzg();
                    int iZzj5 = zzerVar.zzj(13);
                    zzerVar.zzg();
                    int iZzj6 = zzerVar.zzj(13);
                    zzerVar.zzg();
                    zzerVar.zzg();
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzn("video/mp2t");
                    zztVar.zzo("video/mp4v-es");
                    zztVar.zzv(iZzj5);
                    zztVar.zzw(iZzj6);
                    zztVar.zzB(f2);
                    zztVar.zzr(Collections.singletonList(bArrCopyOf));
                    zzahbVar.zzA(zztVar.zzO());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(bArrZzi, iZzg, iZzi);
            zzaqd zzaqdVar = this.zzf;
            if (i5 > 0) {
                zzaqdVar.zzd(bArrZzi, iZzg, iZzi);
                i = 0;
            } else {
                i = -i5;
            }
            if (zzaqdVar.zze(i)) {
                int iZza = zzgo.zza(zzaqdVar.zza, zzaqdVar.zzb);
                zzes zzesVar2 = this.zzc;
                String str2 = zzfk.zza;
                zzesVar2.zzb(zzaqdVar.zza, iZza);
                this.zzb.zzb(this.zzl, zzesVar2);
            }
            if (i4 == 178) {
                if (zzesVar.zzi()[iZzi + 2] == 1) {
                    zzaqdVar.zzc(178);
                }
                i4 = 178;
            }
            int i10 = iZze - iZzi;
            this.zzg.zzd(this.zzh - ((long) i10), i10, this.zzk);
            this.zzg.zzb(i4, this.zzl);
            iZzg = i3;
            iZze = iZze;
        }
        if (!this.zzk) {
            this.zze.zzc(bArrZzi, iZzg, iZze);
        }
        this.zzg.zzc(bArrZzi, iZzg, iZze);
        this.zzf.zzd(bArrZzi, iZzg, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        zzapq zzapqVar = this.zzg;
        zzapqVar.getClass();
        if (z) {
            zzapqVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
