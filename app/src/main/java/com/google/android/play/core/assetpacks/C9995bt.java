package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10090aj;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bt */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9995bt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    static AssetLocation m22600a(String str, String str2) throws IOException {
        int i;
        byte b;
        AssetLocation assetLocation;
        char c;
        char c2;
        Long lValueOf;
        int i2;
        C10090aj.m22711b(str != null, "Attempted to get file location from a null apk path.");
        C10090aj.m22711b(str2 != null, String.format("Attempted to get file location in apk %s with a null file path.", str));
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        byte[] bArr = new byte[22];
        randomAccessFile.seek(randomAccessFile.length() - 22);
        randomAccessFile.readFully(bArr);
        C9994bs c9994bsM22601b = C9993br.m22598b(bArr, 0) == 1347093766 ? m22601b(bArr) : null;
        byte b2 = 5;
        if (c9994bsM22601b == null) {
            long length = randomAccessFile.length();
            long jMax = (-22) + length;
            assetLocation = null;
            c = 3;
            i = 0;
            int iMin = (int) Math.min(1024L, randomAccessFile.length());
            byte[] bArr2 = new byte[iMin];
            byte[] bArr3 = new byte[22];
            loop0: while (true) {
                long j = (-65558) + length;
                if (j < 0) {
                    j = 0;
                }
                jMax = Math.max((jMax - ((long) iMin)) + 3, j);
                randomAccessFile.seek(jMax);
                randomAccessFile.readFully(bArr2);
                int i3 = iMin - 4;
                while (i3 >= 0) {
                    byte b3 = bArr2[i3];
                    if (b3 == b2) {
                        b = b2;
                        i2 = 2;
                    } else if (b3 != 6) {
                        b = b2;
                        if (b3 != 75) {
                            i2 = b3 != 80 ? -1 : 0;
                        } else {
                            i2 = 1;
                        }
                    } else {
                        b = b2;
                        i2 = 3;
                    }
                    if (i2 >= 0 && i3 >= i2) {
                        c2 = 2;
                        if (C9993br.m22598b(bArr2, i3 - i2) == 1347093766) {
                            randomAccessFile.seek((jMax + ((long) i3)) - ((long) i2));
                            randomAccessFile.readFully(bArr3);
                            c9994bsM22601b = m22601b(bArr3);
                            break loop0;
                        }
                    }
                    i3 -= 4;
                    b2 = b;
                }
                byte b4 = b2;
                if (jMax == j) {
                    throw new ZipException(String.format("End Of Central Directory signature not found in APK %s", str));
                }
                b2 = b4;
            }
        } else {
            i = 0;
            b = 5;
            assetLocation = null;
            c = 3;
            c2 = 2;
        }
        byte[] bytes = str2.getBytes("UTF-8");
        byte[] bArr4 = new byte[46];
        byte[] bArr5 = new byte[str2.length()];
        long jM22597a = c9994bsM22601b.f22105a;
        int i4 = i;
        while (true) {
            if (i4 >= c9994bsM22601b.f22106b) {
                lValueOf = assetLocation;
                break;
            }
            randomAccessFile.seek(jM22597a);
            randomAccessFile.readFully(bArr4);
            int iM22598b = C9993br.m22598b(bArr4, i);
            if (iM22598b != 1347092738) {
                Integer numValueOf = Integer.valueOf(i4);
                Integer numValueOf2 = Integer.valueOf(c9994bsM22601b.f22106b);
                Integer numValueOf3 = Integer.valueOf(iM22598b);
                Object[] objArr = new Object[6];
                objArr[0] = str2;
                objArr[1] = str;
                objArr[c2] = numValueOf;
                objArr[c] = numValueOf2;
                objArr[4] = numValueOf3;
                objArr[b] = 1347092738;
                throw new ZipException(String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", objArr));
            }
            randomAccessFile.seek(28 + jM22597a);
            int iM22597a = C9993br.m22597a(bArr4, 28);
            if (iM22597a == str2.length()) {
                randomAccessFile.seek(46 + jM22597a);
                randomAccessFile.read(bArr5);
                if (Arrays.equals(bArr5, bytes)) {
                    lValueOf = Long.valueOf(C9993br.m22599c(bArr4, 42));
                    break;
                }
            }
            jM22597a += (long) (iM22597a + 46 + C9993br.m22597a(bArr4, 30) + C9993br.m22597a(bArr4, 32));
            i4++;
            i = 0;
        }
        if (lValueOf == 0) {
            return assetLocation;
        }
        long jLongValue = lValueOf.longValue();
        byte[] bArr6 = new byte[8];
        randomAccessFile.seek(22 + jLongValue);
        randomAccessFile.readFully(bArr6);
        return new C9987bl(str, jLongValue + 30 + ((long) C9993br.m22597a(bArr6, 4)) + ((long) C9993br.m22597a(bArr6, 6)), C9993br.m22599c(bArr6, 0));
    }

    /* JADX INFO: renamed from: b */
    private static C9994bs m22601b(byte[] bArr) {
        int iM22597a = C9993br.m22597a(bArr, 10);
        return new C9994bs(C9993br.m22599c(bArr, 16), C9993br.m22599c(bArr, 12), iM22597a);
    }
}
