package com.google.android.play.core.assetpacks.internal;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.am */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10093am {
    /* JADX INFO: renamed from: a */
    public static long m22713a(AbstractC10094an abstractC10094an, InputStream inputStream, OutputStream outputStream, long j) throws Throwable {
        OutputStream outputStream2;
        DataInputStream dataInputStream;
        AbstractC10094an abstractC10094an2;
        int unsignedShort;
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int i = dataInputStream2.readInt();
        if (i != -771763713) {
            throw new C10092al("Unexpected magic=".concat(String.valueOf(String.format("%x", Integer.valueOf(i)))));
        }
        int i2 = dataInputStream2.read();
        if (i2 != 4) {
            throw new C10092al("Unexpected version=" + i2);
        }
        long j2 = 0;
        while (true) {
            long j3 = j - j2;
            try {
                int unsignedShort2 = dataInputStream2.read();
                if (unsignedShort2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort2 == 0) {
                    outputStream.flush();
                    return j2;
                }
                switch (unsignedShort2) {
                    case 247:
                        outputStream2 = outputStream;
                        unsignedShort2 = dataInputStream2.readUnsignedShort();
                        m22715c(bArr, dataInputStream2, outputStream2, unsignedShort2, j3);
                        j2 += (long) unsignedShort2;
                        outputStream = outputStream2;
                        break;
                    case 248:
                        outputStream2 = outputStream;
                        unsignedShort2 = dataInputStream2.readInt();
                        m22715c(bArr, dataInputStream2, outputStream2, unsignedShort2, j3);
                        j2 += (long) unsignedShort2;
                        outputStream = outputStream2;
                        break;
                    case 249:
                        outputStream2 = outputStream;
                        DataInputStream dataInputStream3 = dataInputStream2;
                        AbstractC10094an abstractC10094an3 = abstractC10094an;
                        long unsignedShort3 = dataInputStream3.readUnsignedShort();
                        int i3 = dataInputStream3.read();
                        if (i3 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m22714b(bArr, abstractC10094an3, outputStream2, unsignedShort3, i3, j3);
                        abstractC10094an = abstractC10094an3;
                        dataInputStream2 = dataInputStream3;
                        unsignedShort2 = i3;
                        j2 += (long) unsignedShort2;
                        outputStream = outputStream2;
                        break;
                        break;
                    case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                        outputStream2 = outputStream;
                        dataInputStream = dataInputStream2;
                        abstractC10094an2 = abstractC10094an;
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        m22714b(bArr, abstractC10094an2, outputStream2, unsignedShort4, unsignedShort, j3);
                        abstractC10094an = abstractC10094an2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j2 += (long) unsignedShort2;
                        outputStream = outputStream2;
                        break;
                    case 251:
                        outputStream2 = outputStream;
                        dataInputStream = dataInputStream2;
                        abstractC10094an2 = abstractC10094an;
                        long unsignedShort5 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        m22714b(bArr, abstractC10094an2, outputStream2, unsignedShort5, unsignedShort, j3);
                        abstractC10094an = abstractC10094an2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j2 += (long) unsignedShort2;
                        outputStream = outputStream2;
                        break;
                    case 252:
                        outputStream2 = outputStream;
                        dataInputStream = dataInputStream2;
                        abstractC10094an2 = abstractC10094an;
                        long j4 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m22714b(bArr, abstractC10094an2, outputStream2, j4, unsignedShort, j3);
                        abstractC10094an = abstractC10094an2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j2 += (long) unsignedShort2;
                        outputStream = outputStream2;
                        break;
                        break;
                    case 253:
                        outputStream2 = outputStream;
                        dataInputStream = dataInputStream2;
                        abstractC10094an2 = abstractC10094an;
                        long j5 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        m22714b(bArr, abstractC10094an2, outputStream2, j5, unsignedShort, j3);
                        abstractC10094an = abstractC10094an2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j2 += (long) unsignedShort2;
                        outputStream = outputStream2;
                        break;
                    case 254:
                        outputStream2 = outputStream;
                        dataInputStream = dataInputStream2;
                        abstractC10094an2 = abstractC10094an;
                        long j6 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        m22714b(bArr, abstractC10094an2, outputStream2, j6, unsignedShort, j3);
                        abstractC10094an = abstractC10094an2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j2 += (long) unsignedShort2;
                        outputStream = outputStream2;
                        break;
                    case 255:
                        outputStream2 = outputStream;
                        dataInputStream = dataInputStream2;
                        long j7 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        abstractC10094an2 = abstractC10094an;
                        m22714b(bArr, abstractC10094an2, outputStream2, j7, unsignedShort, j3);
                        abstractC10094an = abstractC10094an2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j2 += (long) unsignedShort2;
                        outputStream = outputStream2;
                        break;
                    default:
                        outputStream2 = outputStream;
                        try {
                            m22715c(bArr, dataInputStream2, outputStream2, unsignedShort2, j3);
                            dataInputStream = dataInputStream2;
                            dataInputStream2 = dataInputStream;
                            j2 += (long) unsignedShort2;
                            outputStream = outputStream2;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            outputStream2.flush();
                            throw th2;
                        }
                        break;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream2 = outputStream;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m22714b(byte[] bArr, AbstractC10094an abstractC10094an, OutputStream outputStream, long j, int i, long j2) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (j < 0) {
            throw new IOException("inputOffset negative");
        }
        long j3 = i;
        if (j3 > j2) {
            throw new IOException("Output length overrun");
        }
        try {
            InputStream inputStreamM22716c = new C10095ao(abstractC10094an, j, j3, false).m22716c();
            while (i > 0) {
                try {
                    int iMin = Math.min(i, 16384);
                    int i2 = 0;
                    while (i2 < iMin) {
                        int i3 = inputStreamM22716c.read(bArr, i2, iMin - i2);
                        if (i3 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i2 += i3;
                        throw new IOException("patch underrun", e);
                    }
                    outputStream.write(bArr, 0, iMin);
                    i -= iMin;
                } catch (Throwable th) {
                    try {
                        inputStreamM22716c.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            inputStreamM22716c.close();
        } catch (EOFException e) {
            throw new IOException("patch underrun", e);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m22715c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (i > j) {
            throw new IOException("Output length overrun");
        }
        while (i > 0) {
            try {
                int iMin = Math.min(i, 16384);
                dataInputStream.readFully(bArr, 0, iMin);
                outputStream.write(bArr, 0, iMin);
                i -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }
}
