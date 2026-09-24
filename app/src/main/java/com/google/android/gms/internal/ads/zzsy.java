package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsy extends zzcp {
    private int[] zzd;
    private int[] zze;

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int[] iArr = this.zze;
        iArr.getClass();
        int[] iArr2 = iArr;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzk = zzk(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i6 : iArr2) {
                int iZzF = (zzfk.zzF(this.zzb.zzd) * i6) + iPosition;
                int i7 = this.zzb.zzd;
                if (i7 == 2) {
                    byteBufferZzk.putShort(byteBuffer.getShort(iZzF));
                } else if (i7 == 3) {
                    byteBufferZzk.put(byteBuffer.get(iZzF));
                } else if (i7 == 4) {
                    byteBufferZzk.putFloat(byteBuffer.getFloat(iZzF));
                } else if (i7 == 21) {
                    if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                        i = iZzF;
                    } else {
                        i = iZzF + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iZzF + 1);
                    if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                        iZzF += 2;
                    }
                    i2 = ((b << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) | ((b2 << Ascii.DLE) & 16711680) | ((byteBuffer.get(iZzF) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    i3 = i2 >> 8;
                    if ((i3 & ViewCompat.MEASURED_STATE_MASK) != 0 || (i3 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzgsw.zzf(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                    zzgsw.zza(byteBufferZzk.remaining() >= 3);
                    if (byteBufferZzk.order() == ByteOrder.BIG_ENDIAN) {
                        i4 = (i2 >> 24) & 255;
                    } else {
                        i4 = i3 & 255;
                    }
                    byte b3 = (byte) i4;
                    int i8 = (i2 >> 16) & 255;
                    if (byteBufferZzk.order() == ByteOrder.BIG_ENDIAN) {
                        i5 = i3 & 255;
                    } else {
                        i5 = (i2 >> 24) & 255;
                    }
                    byteBufferZzk.put(b3).put((byte) i8).put((byte) i5);
                } else if (i7 == 22) {
                    byteBufferZzk.putInt(byteBuffer.getInt(iZzF));
                } else if (i7 == 268435456) {
                    byteBufferZzk.putShort(byteBuffer.getShort(iZzF));
                } else if (i7 == 1342177280) {
                    if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                        i = iZzF;
                    } else {
                        i = iZzF + 2;
                    }
                    byte b4 = byteBuffer.get(i);
                    byte b5 = byteBuffer.get(iZzF + 1);
                    if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                        iZzF += 2;
                    }
                    i2 = ((b4 << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) | ((b5 << Ascii.DLE) & 16711680) | ((byteBuffer.get(iZzF) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    i3 = i2 >> 8;
                    if ((i3 & ViewCompat.MEASURED_STATE_MASK) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    zzgsw.zzf(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                    zzgsw.zza(byteBufferZzk.remaining() >= 3);
                    if (byteBufferZzk.order() == ByteOrder.BIG_ENDIAN) {
                        i4 = (i2 >> 24) & 255;
                    } else {
                        i4 = i3 & 255;
                    }
                    byte b6 = (byte) i4;
                    int i9 = (i2 >> 16) & 255;
                    if (byteBufferZzk.order() == ByteOrder.BIG_ENDIAN) {
                        i5 = i3 & 255;
                    } else {
                        i5 = (i2 >> 24) & 255;
                    }
                    byteBufferZzk.put(b6).put((byte) i9).put((byte) i5);
                } else if (i7 == 1610612736) {
                    byteBufferZzk.putInt(byteBuffer.getInt(iZzF));
                } else {
                    if (i7 != 1879048192) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 21);
                        sb.append("Unexpected encoding: ");
                        sb.append(i7);
                        throw new IllegalStateException(sb.toString());
                    }
                    byteBufferZzk.putDouble(byteBuffer.getDouble(iZzF));
                }
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i = zzclVar.zzd;
        if (!zzfk.zzC(i)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i2 = zzclVar.zzc;
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 >= length) {
                return z ? new zzcl(zzclVar.zzb, length, i) : zzcl.zza;
            }
            int i4 = iArr[i3];
            if (i4 >= i2) {
                String string = Arrays.toString(iArr);
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 59);
                sb.append("Channel map (");
                sb.append(string);
                sb.append(") trying to access non-existent input channel.");
                throw new zzcn(sb.toString(), zzclVar);
            }
            z |= i4 != i3;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzo(zzcm zzcmVar) {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(int[] iArr) {
        this.zzd = iArr;
    }
}
