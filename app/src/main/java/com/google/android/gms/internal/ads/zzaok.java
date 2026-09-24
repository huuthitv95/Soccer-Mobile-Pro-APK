package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaok {
    private boolean zzd;
    private boolean zze;
    private int[] zzf;
    private int zzg;
    private int zzh;
    private Rect zzi;
    private long zzb = -9223372036854775807L;
    private long zzc = -9223372036854775807L;
    private final int[] zza = new int[4];
    private int zzj = -1;
    private int zzk = -1;

    private static int zzg(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    private static int zzh(int i, int i2) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | ((i2 * 17) << 24);
    }

    private final void zzi(zzer zzerVar, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int i3 = !z ? 1 : 0;
        int iWidth = rect.width();
        int i4 = i3 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i5 = 0;
            do {
                int i6 = 1;
                int iZzj = 0;
                while (true) {
                    if (iZzj >= i6 || i6 > 64) {
                        i = iZzj & 3;
                        if (iZzj >= 4) {
                            i2 = iZzj >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (zzerVar.zzc() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    } else {
                        iZzj = (iZzj << 4) | zzerVar.zzj(4);
                        i6 <<= 2;
                    }
                }
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    Arrays.fill(iArr, i4, i7, this.zza[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            zzerVar.zzm();
        }
    }

    public final void zza(String str) {
        int i;
        String strTrim = str.trim();
        String str2 = zzfk.zza;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] strArrSplit = str3.substring(9).split(",", -1);
                this.zzf = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = this.zzf;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        zzef.zzd("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str3.startsWith("size: ")) {
                String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 36);
                    sb.append("Ignoring malformed IDX size line: '");
                    sb.append(str3);
                    sb.append("'");
                    zzef.zzc("VobsubParser", sb.toString());
                } else {
                    try {
                        this.zzg = Integer.parseInt(strArrSplit2[0]);
                        this.zzh = Integer.parseInt(strArrSplit2[1]);
                        this.zzd = true;
                    } catch (RuntimeException e2) {
                        zzef.zzd("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    public final zzcx zzb(zzes zzesVar) {
        Rect rect;
        if (this.zzf == null || !this.zzd || !this.zze || (rect = this.zzi) == null || this.zzj == -1 || this.zzk == -1 || rect.width() < 2 || this.zzi.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzi;
        int[] iArr = new int[rect2.width() * rect2.height()];
        zzer zzerVar = new zzer();
        zzesVar.zzh(this.zzj);
        zzerVar.zza(zzesVar);
        zzi(zzerVar, true, rect2, iArr);
        zzesVar.zzh(this.zzk);
        zzerVar.zza(zzesVar);
        zzi(zzerVar, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(bitmapCreateBitmap);
        zzcwVar.zzi(rect2.left / this.zzg);
        zzcwVar.zzj(0);
        zzcwVar.zzf(rect2.top / this.zzh, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(rect2.width() / this.zzg);
        zzcwVar.zzn(rect2.height() / this.zzh);
        return zzcwVar.zzr();
    }

    public final void zzc() {
        this.zzb = -9223372036854775807L;
        this.zzc = -9223372036854775807L;
        this.zze = false;
        this.zzi = null;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0069. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:24:0x0056 for B:30:0x0069 already processed. Defaulting to fallback option. */
    final /* synthetic */ void zzd(zzes zzesVar) {
        boolean z;
        if (this.zzf == null) {
            zzef.zzc("VobsubParser", "Skipping SPU (no palette)");
            return;
        }
        if (!this.zzd) {
            zzef.zzc("VobsubParser", "Skipping SPU (no plane)");
            return;
        }
        int iZzg = zzesVar.zzg() - 2;
        zzesVar.zzh(zzesVar.zzt() + iZzg);
        do {
            int i = 4;
            if (zzesVar.zzd() < 4) {
                z = false;
            } else {
                int iZzg2 = zzesVar.zzg();
                int iZzt = zzesVar.zzt() * 10000;
                int iZzt2 = zzesVar.zzt() + iZzg;
                boolean z2 = iZzt2 != iZzg2 && iZzt2 < zzesVar.zze();
                int iZze = z2 ? iZzt2 : zzesVar.zze();
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        if (zzesVar.zzg() >= iZze && z3) {
                            long j = iZzt;
                            int iZzs = zzesVar.zzs();
                            if (iZzs != 255) {
                                switch (iZzs) {
                                    case 0:
                                        break;
                                    case 1:
                                        this.zzb = j;
                                        z3 = true;
                                        i = 4;
                                        break;
                                    case 2:
                                        this.zzc = j;
                                        z3 = true;
                                        i = 4;
                                        break;
                                    case 3:
                                        if (zzesVar.zzd() < 2) {
                                            zzef.zzc("VobsubParser", "Incomplete color command");
                                            z3 = false;
                                        } else {
                                            int iZzs2 = zzesVar.zzs();
                                            int iZzs3 = zzesVar.zzs();
                                            int[] iArr = this.zza;
                                            iArr[3] = zzg(this.zzf, iZzs2 >> 4);
                                            iArr[2] = zzg(this.zzf, iZzs2 & 15);
                                            iArr[1] = zzg(this.zzf, iZzs3 >> 4);
                                            iArr[0] = zzg(this.zzf, iZzs3 & 15);
                                            this.zze = true;
                                            z3 = true;
                                        }
                                        i = 4;
                                        break;
                                    case 4:
                                        if (zzesVar.zzd() < 2) {
                                            zzef.zzc("VobsubParser", "Incomplete alpha command");
                                        } else if (this.zze) {
                                            int iZzs4 = zzesVar.zzs();
                                            int iZzs5 = zzesVar.zzs();
                                            int[] iArr2 = this.zza;
                                            iArr2[3] = zzh(iArr2[3], iZzs4 >> 4);
                                            iArr2[2] = zzh(iArr2[2], iZzs4 & 15);
                                            iArr2[1] = zzh(iArr2[1], iZzs5 >> 4);
                                            iArr2[0] = zzh(iArr2[0], iZzs5 & 15);
                                            z3 = true;
                                            i = 4;
                                        } else {
                                            zzef.zzc("VobsubParser", "Ignoring alpha command before color command");
                                        }
                                        i = 4;
                                        z3 = false;
                                        break;
                                    case 5:
                                        if (zzesVar.zzd() >= 6) {
                                            int iZzs6 = zzesVar.zzs();
                                            int iZzs7 = zzesVar.zzs();
                                            int i2 = iZzs7 >> 4;
                                            int iZzs8 = ((iZzs7 & 15) << 8) | zzesVar.zzs();
                                            int iZzs9 = zzesVar.zzs();
                                            int iZzs10 = zzesVar.zzs();
                                            this.zzi = new Rect((iZzs6 << i) | i2, (iZzs9 << i) | (iZzs10 >> 4), iZzs8 + 1, (((iZzs10 & 15) << 8) | zzesVar.zzs()) + 1);
                                            z3 = true;
                                            i = 4;
                                        } else {
                                            zzef.zzc("VobsubParser", "Incomplete area command");
                                            z3 = false;
                                        }
                                        break;
                                    case 6:
                                        if (zzesVar.zzd() >= i) {
                                            this.zzj = zzesVar.zzt();
                                            this.zzk = zzesVar.zzt();
                                        } else {
                                            zzef.zzc("VobsubParser", "Incomplete offsets command");
                                            z3 = false;
                                        }
                                        break;
                                    default:
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzs).length() + 22);
                                        sb.append("Unrecognized command: ");
                                        sb.append(iZzs);
                                        zzef.zzc("VobsubParser", sb.toString());
                                        z3 = false;
                                        break;
                                }
                                if (zzesVar.zzg() >= iZze) {
                                }
                            } else {
                                z3 = false;
                            }
                        }
                    }
                }
                if (z2) {
                    zzesVar.zzh(iZzt2);
                }
                z = z2;
            }
        } while (z);
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }
}
