package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzanq implements zzane {
    private static final byte[] zza = {0, 7, 8, Ascii.f22499SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzanj zzg;
    private final zzani zzh;
    private final zzanp zzi;
    private Bitmap zzj;

    public zzanq(List list) {
        zzes zzesVar = new zzes((byte[]) list.get(0));
        int iZzt = zzesVar.zzt();
        int iZzt2 = zzesVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzanj(719, 575, 0, 719, 0, 575);
        this.zzh = new zzani(0, zzd(), zze(), zzf());
        this.zzi = new zzanp(iZzt, iZzt2);
    }

    private static zzani zzb(zzer zzerVar, int i) {
        int[] iArr;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i2 = 8;
        int iZzj5 = zzerVar.zzj(8);
        zzerVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i3 = i - 2;
        while (i3 > 0) {
            int iZzj6 = zzerVar.zzj(i2);
            int iZzj7 = zzerVar.zzj(i2);
            if ((iZzj7 & 128) != 0) {
                iArr = iArrZzd;
            } else {
                iArr = (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            }
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzerVar.zzj(i2);
                iZzj4 = zzerVar.zzj(i2);
                iZzj = zzerVar.zzj(i2);
                iZzj2 = zzerVar.zzj(i2);
                i3 -= 6;
            } else {
                int iZzj8 = zzerVar.zzj(6) << 2;
                int iZzj9 = zzerVar.zzj(4) << 4;
                i3 -= 4;
                iZzj = zzerVar.zzj(4) << 4;
                iZzj2 = zzerVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d = iZzj3;
            String str = zzfk.zza;
            double d2 = iZzj4 - 128;
            double d3 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            iZzj5 = iZzj5;
            i2 = 8;
        }
        return new zzani(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzank zzc(zzer zzerVar) {
        byte[] bArr;
        int iZzj = zzerVar.zzj(16);
        zzerVar.zzh(4);
        int iZzj2 = zzerVar.zzj(2);
        boolean zZzi = zzerVar.zzi();
        zzerVar.zzh(1);
        byte[] bArr2 = zzfk.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzerVar.zzj(16);
                int iZzj4 = zzerVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzerVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzerVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzank(iZzj, zZzi, bArr2, bArr);
        }
        zzerVar.zzh(zzerVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzank(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzg(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzg(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fe A[LOOP:3: B:89:0x0163->B:121:0x01fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    private static void zzh(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int i4;
        int iZzj4;
        int iZzj5;
        int i5;
        int i6;
        int iZzj6;
        int i7;
        Paint paint2 = paint;
        zzer zzerVar = new zzer(bArr, bArr.length);
        int i8 = i2;
        int i9 = i3;
        byte[] bArrZzi = null;
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        while (zzerVar.zzc() != 0) {
            int iZzj7 = zzerVar.zzj(8);
            if (iZzj7 != 240) {
                int i10 = 4;
                int i11 = 1;
                int i12 = 2;
                switch (iZzj7) {
                    case 16:
                        int i13 = 1;
                        if (i == 3) {
                            if (bArrZzi == null) {
                                bArr3 = zzb;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzi;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrZzi3 == null) {
                            bArr3 = zza;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrZzi3;
                        }
                        int i14 = 0;
                        while (true) {
                            int iZzj8 = zzerVar.zzj(2);
                            if (iZzj8 != 0) {
                                iZzj2 = i13;
                                iZzj = iZzj8;
                            } else {
                                if (zzerVar.zzi()) {
                                    iZzj3 = zzerVar.zzj(3) + 3;
                                    iZzj = zzerVar.zzj(2);
                                } else {
                                    if (zzerVar.zzi()) {
                                        iZzj2 = i13;
                                        iZzj = 0;
                                    } else {
                                        int iZzj9 = zzerVar.zzj(2);
                                        if (iZzj9 == 0) {
                                            c = 4;
                                            i14 = i13;
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else if (iZzj9 == i13) {
                                            c = 4;
                                            i14 = i14;
                                            iZzj2 = 2;
                                            iZzj = 0;
                                        } else if (iZzj9 == 2) {
                                            c = 4;
                                            i14 = i14;
                                            iZzj2 = zzerVar.zzj(4) + 12;
                                            iZzj = zzerVar.zzj(2);
                                        } else if (iZzj9 != 3) {
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else {
                                            iZzj3 = zzerVar.zzj(8) + 29;
                                            iZzj = zzerVar.zzj(2);
                                        }
                                        if (iZzj2 == 0 && paint2 != null) {
                                            int i15 = i9 + 1;
                                            float f = i9;
                                            if (bArr2 != 0) {
                                                iZzj = bArr2[iZzj];
                                            }
                                            paint2.setColor(iArr[iZzj]);
                                            canvas.drawRect(i8, f, i8 + iZzj2, i15, paint2);
                                        }
                                        i8 += iZzj2;
                                        if (i14 != 0) {
                                            zzerVar.zzm();
                                        } else {
                                            paint2 = paint;
                                            i14 = i14;
                                            i13 = 1;
                                        }
                                    }
                                    c = 4;
                                    if (iZzj2 == 0) {
                                    }
                                    i8 += iZzj2;
                                    if (i14 != 0) {
                                        zzerVar.zzm();
                                    } else {
                                        paint2 = paint;
                                        i14 = i14;
                                        i13 = 1;
                                    }
                                }
                                iZzj2 = iZzj3;
                            }
                            c = 4;
                            if (iZzj2 == 0) {
                            }
                            i8 += iZzj2;
                            if (i14 != 0) {
                                zzerVar.zzm();
                            } else {
                                paint2 = paint;
                                i14 = i14;
                                i13 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrZzi2 == null ? zzc : bArrZzi2 : null;
                        boolean z = false;
                        while (true) {
                            int iZzj10 = zzerVar.zzj(i10);
                            if (iZzj10 != 0) {
                                i4 = 1;
                                z = z;
                            } else if (zzerVar.zzi()) {
                                if (zzerVar.zzi()) {
                                    int iZzj11 = zzerVar.zzj(i12);
                                    if (iZzj11 == 0) {
                                        i4 = 1;
                                    } else if (iZzj11 == 1) {
                                        i4 = i12;
                                    } else if (iZzj11 == i12) {
                                        iZzj4 = zzerVar.zzj(i10) + 9;
                                        iZzj5 = zzerVar.zzj(i10);
                                    } else if (iZzj11 != 3) {
                                        z = z;
                                        iZzj10 = 0;
                                        i4 = 0;
                                    } else {
                                        iZzj4 = zzerVar.zzj(8) + 25;
                                        iZzj5 = zzerVar.zzj(i10);
                                    }
                                    iZzj10 = 0;
                                } else {
                                    iZzj4 = zzerVar.zzj(i12) + i10;
                                    iZzj5 = zzerVar.zzj(i10);
                                }
                                i4 = iZzj4;
                                z = z;
                                iZzj10 = iZzj5;
                            } else {
                                int iZzj12 = zzerVar.zzj(3);
                                if (iZzj12 != 0) {
                                    i4 = iZzj12 + 2;
                                    iZzj10 = 0;
                                } else {
                                    z = true;
                                    iZzj10 = 0;
                                    i4 = 0;
                                }
                            }
                            if (i4 == 0 || paint2 == null) {
                                i5 = i12;
                            } else {
                                int i16 = i9 + 1;
                                float f2 = i9;
                                if (bArr4 != 0) {
                                    iZzj10 = bArr4[iZzj10];
                                }
                                paint2.setColor(iArr[iZzj10]);
                                i5 = 2;
                                canvas.drawRect(i8, f2, i8 + i4, i16, paint2);
                            }
                            i8 += i4;
                            if (z) {
                                zzerVar.zzm();
                                continue;
                            } else {
                                i12 = i5;
                                z = z;
                                i10 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i17 = i8;
                        int i18 = 0;
                        while (true) {
                            int iZzj13 = zzerVar.zzj(8);
                            if (iZzj13 != 0) {
                                i6 = i18;
                                iZzj6 = i11;
                            } else if (zzerVar.zzi()) {
                                i6 = i18;
                                iZzj6 = zzerVar.zzj(7);
                                iZzj13 = zzerVar.zzj(8);
                            } else {
                                int iZzj14 = zzerVar.zzj(7);
                                if (iZzj14 != 0) {
                                    i6 = i18;
                                    iZzj6 = iZzj14;
                                    iZzj13 = 0;
                                } else {
                                    i6 = i11;
                                    iZzj13 = 0;
                                    iZzj6 = 0;
                                }
                            }
                            if (iZzj6 == 0 || paint2 == null) {
                                i7 = i11;
                            } else {
                                paint2.setColor(iArr[iZzj13]);
                                i7 = i11;
                                canvas.drawRect(i17, i9, i17 + iZzj6, i9 + 1, paint2);
                            }
                            i17 += iZzj6;
                            if (i6 != 0) {
                                i8 = i17;
                                continue;
                            } else {
                                i11 = i7;
                                i18 = i6;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzj7) {
                            case 32:
                                bArrZzi3 = zzi(4, 4, zzerVar);
                                break;
                            case 33:
                                bArrZzi = zzi(4, 8, zzerVar);
                                break;
                            case 34:
                                bArrZzi2 = zzi(16, 8, zzerVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i9 += 2;
                i8 = i2;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzi(int i, int i2, zzer zzerVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzerVar.zzj(i2);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        boolean z;
        zzamw zzamwVar;
        Canvas canvas;
        char c;
        char c2;
        char c3;
        int i3;
        Canvas canvas2;
        int i4;
        zzann zzannVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i5;
        int iZzj5;
        zzer zzerVar = new zzer(bArr, i + i2);
        zzerVar.zzf(i);
        while (true) {
            z = true;
            if (zzerVar.zzc() >= 48 && zzerVar.zzj(8) == 15) {
                zzanp zzanpVar = this.zzi;
                int iZzj6 = zzerVar.zzj(8);
                int iZzj7 = zzerVar.zzj(16);
                int iZzj8 = zzerVar.zzj(16);
                int iZze = zzerVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzerVar.zzc()) {
                    zzef.zzc("DvbParser", "Data field length exceeds limit");
                    zzerVar.zzh(zzerVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzanpVar.zza) {
                                zzanl zzanlVar = zzanpVar.zzi;
                                int iZzj9 = zzerVar.zzj(8);
                                int iZzj10 = zzerVar.zzj(4);
                                int iZzj11 = zzerVar.zzj(2);
                                zzerVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i6 = iZzj8 - 2; i6 > 0; i6 -= 6) {
                                    int iZzj12 = zzerVar.zzj(8);
                                    zzerVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzanm(zzerVar.zzj(16), zzerVar.zzj(16)));
                                }
                                zzanl zzanlVar2 = new zzanl(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzanlVar2.zzb != 0) {
                                    zzanpVar.zzi = zzanlVar2;
                                    zzanpVar.zzc.clear();
                                    zzanpVar.zzd.clear();
                                    zzanpVar.zze.clear();
                                } else if (zzanlVar != null) {
                                    if (zzanlVar.zza != zzanlVar2.zza) {
                                        zzanpVar.zzi = zzanlVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzanl zzanlVar3 = zzanpVar.zzi;
                            if (iZzj7 == zzanpVar.zza && zzanlVar3 != null) {
                                int iZzj13 = zzerVar.zzj(8);
                                zzerVar.zzh(4);
                                boolean zZzi = zzerVar.zzi();
                                zzerVar.zzh(3);
                                int iZzj14 = zzerVar.zzj(16);
                                int iZzj15 = zzerVar.zzj(16);
                                int iZzj16 = zzerVar.zzj(3);
                                int iZzj17 = zzerVar.zzj(3);
                                zzerVar.zzh(2);
                                int iZzj18 = zzerVar.zzj(8);
                                int iZzj19 = zzerVar.zzj(8);
                                int iZzj20 = zzerVar.zzj(4);
                                int iZzj21 = zzerVar.zzj(2);
                                zzerVar.zzh(2);
                                int i7 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i7 > 0) {
                                    int iZzj22 = zzerVar.zzj(16);
                                    int iZzj23 = zzerVar.zzj(2);
                                    int iZzj24 = zzerVar.zzj(2);
                                    int iZzj25 = zzerVar.zzj(12);
                                    zzerVar.zzh(4);
                                    int iZzj26 = zzerVar.zzj(12);
                                    int i8 = i7 - 6;
                                    if (iZzj23 == 1) {
                                        i7 -= 8;
                                        iZzj = zzerVar.zzj(8);
                                        iZzj2 = zzerVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i7 -= 8;
                                        iZzj = zzerVar.zzj(8);
                                        iZzj2 = zzerVar.zzj(8);
                                    } else {
                                        i7 = i8;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzano(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzann zzannVar2 = new zzann(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzanlVar3.zzb == 0 && (zzannVar = (zzann) zzanpVar.zzc.get(zzannVar2.zza)) != null) {
                                    int i9 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzannVar.zzj;
                                        if (i9 < sparseArray3.size()) {
                                            zzannVar2.zzj.put(sparseArray3.keyAt(i9), (zzano) sparseArray3.valueAt(i9));
                                            i9++;
                                        }
                                    }
                                }
                                zzanpVar.zzc.put(zzannVar2.zza, zzannVar2);
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzanpVar.zza) {
                                zzani zzaniVarZzb = zzb(zzerVar, iZzj8);
                                zzanpVar.zzd.put(zzaniVarZzb.zza, zzaniVarZzb);
                            } else if (iZzj7 == zzanpVar.zzb) {
                                zzani zzaniVarZzb2 = zzb(zzerVar, iZzj8);
                                zzanpVar.zzf.put(zzaniVarZzb2.zza, zzaniVarZzb2);
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzanpVar.zza) {
                                zzank zzankVarZzc = zzc(zzerVar);
                                zzanpVar.zze.put(zzankVarZzc.zza, zzankVarZzc);
                            } else if (iZzj7 == zzanpVar.zzb) {
                                zzank zzankVarZzc2 = zzc(zzerVar);
                                zzanpVar.zzg.put(zzankVarZzc2.zza, zzankVarZzc2);
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzanpVar.zza) {
                                zzerVar.zzh(4);
                                boolean zZzi2 = zzerVar.zzi();
                                zzerVar.zzh(3);
                                int iZzj27 = zzerVar.zzj(16);
                                int iZzj28 = zzerVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzerVar.zzj(16);
                                    iZzj3 = zzerVar.zzj(16);
                                    iZzj5 = zzerVar.zzj(16);
                                    iZzj4 = zzerVar.zzj(16);
                                    i5 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i5 = 0;
                                    iZzj5 = 0;
                                }
                                zzanpVar.zzh = new zzanj(iZzj27, iZzj28, i5, iZzj3, iZzj5, iZzj4);
                            }
                            break;
                    }
                    zzerVar.zzo(iZze - zzerVar.zze());
                }
            }
        }
        zzanp zzanpVar2 = this.zzi;
        zzanl zzanlVar4 = zzanpVar2.zzi;
        if (zzanlVar4 == null) {
            zzamwVar = new zzamw(zzgvz.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzanj zzanjVar = zzanpVar2.zzh;
            if (zzanjVar == null) {
                zzanjVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzanjVar.zza + 1 != bitmap.getWidth() || zzanjVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzanjVar.zza + 1, zzanjVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzanlVar4.zzc;
            int i10 = 0;
            while (i10 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzanm zzanmVar = (zzanm) sparseArray4.valueAt(i10);
                zzann zzannVar3 = (zzann) zzanpVar2.zzc.get(sparseArray4.keyAt(i10));
                int i11 = zzanmVar.zza + zzanjVar.zzc;
                int i12 = zzanmVar.zzb + zzanjVar.zze;
                int i13 = zzannVar3.zzc;
                int i14 = i11 + i13;
                boolean z2 = z;
                int iMin = Math.min(i14, zzanjVar.zzd);
                int i15 = zzannVar3.zzd;
                int i16 = i12 + i15;
                canvas3.clipRect(i11, i12, iMin, Math.min(i16, zzanjVar.zzf));
                int i17 = zzannVar3.zzf;
                zzani zzaniVar = (zzani) zzanpVar2.zzd.get(i17);
                if (zzaniVar == null && (zzaniVar = (zzani) zzanpVar2.zzf.get(i17)) == null) {
                    zzaniVar = this.zzh;
                }
                SparseArray sparseArray5 = zzannVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i18 = i10;
                int i19 = 0;
                while (i19 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i19);
                    int i20 = i19;
                    zzano zzanoVar = (zzano) sparseArray5.valueAt(i19);
                    SparseArray sparseArray7 = sparseArray5;
                    zzank zzankVar = (zzank) zzanpVar2.zze.get(iKeyAt);
                    if (zzankVar == null) {
                        zzankVar = (zzank) zzanpVar2.zzg.get(iKeyAt);
                    }
                    if (zzankVar != null) {
                        Paint paint = zzankVar.zzb ? null : this.zzd;
                        int i21 = zzannVar3.zze;
                        int i22 = zzanoVar.zza + i11;
                        int i23 = i12 + zzanoVar.zzb;
                        canvas2 = canvas3;
                        int[] iArr = i21 == 3 ? zzaniVar.zzd : i21 == 2 ? zzaniVar.zzc : zzaniVar.zzb;
                        i4 = i14;
                        zzh(zzankVar.zzc, iArr, i21, i22, i23, paint, canvas2);
                        zzh(zzankVar.zzd, iArr, i21, i22, i23 + 1, paint, canvas2);
                    } else {
                        canvas2 = canvas3;
                        i4 = i14;
                    }
                    i11 = i11;
                    i14 = i4;
                    i19 = i20 + 1;
                    i13 = i13;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzanpVar2 = zzanpVar2;
                }
                zzanp zzanpVar3 = zzanpVar2;
                Canvas canvas4 = canvas3;
                int i24 = i11;
                int i25 = i13;
                int i26 = i14;
                float f = i12;
                float f2 = i24;
                if (zzannVar3.zzb) {
                    int i27 = zzannVar3.zze;
                    if (i27 == 3) {
                        i3 = zzaniVar.zzd[zzannVar3.zzg];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i27 == 2 ? zzaniVar.zzc[zzannVar3.zzh] : zzaniVar.zzb[zzannVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i3);
                    float f3 = i26;
                    c2 = c3;
                    c = 3;
                    canvas = canvas4;
                    canvas.drawRect(f2, f, f3, i16, paint2);
                } else {
                    canvas = canvas4;
                    c = 3;
                    c2 = 2;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i24, i12, i25, i15));
                float f4 = zzanjVar.zza;
                zzcwVar.zzi(f2 / f4);
                zzcwVar.zzj(0);
                float f5 = zzanjVar.zzb;
                zzcwVar.zzf(f / f5, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i25 / f4);
                zzcwVar.zzn(i15 / f5);
                arrayList.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i10 = i18 + 1;
                z = z2;
                zzanpVar2 = zzanpVar3;
                sparseArray4 = sparseArray6;
            }
            zzamwVar = new zzamw(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdsVar.zza(zzamwVar);
    }
}
