package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.common.base.Ascii;
import com.mbridge.msdk.thrid.okio.C13796f;
import com.mbridge.msdk.thrid.okio.InterfaceC13794d;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.k */
/* JADX INFO: compiled from: Huffman.java */
/* JADX INFO: loaded from: classes7.dex */
class C13757k {

    /* JADX INFO: renamed from: b */
    private static final int[] f39080b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 40, 41, 42, 7, 43, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 44, 8, 9, 45, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: c */
    private static final byte[] f39081c = {Ascii.f22490CR, Ascii.ETB, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.CAN, Ascii.f22498RS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22498RS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22498RS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22493FS, 6, 10, 10, Ascii.f22492FF, Ascii.f22490CR, 6, 8, Ascii.f22503VT, 10, 10, 8, Ascii.f22503VT, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, Ascii.f22499SI, 6, Ascii.f22492FF, 10, Ascii.f22490CR, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, Ascii.f22490CR, 19, Ascii.f22490CR, Ascii.f22500SO, 6, Ascii.f22499SI, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, Ascii.f22499SI, Ascii.f22503VT, Ascii.f22500SO, Ascii.f22490CR, Ascii.f22493FS, Ascii.DC4, Ascii.SYN, Ascii.DC4, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.SYN, Ascii.NAK, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.CAN, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SUB, Ascii.SUB, Ascii.DC4, 19, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.f22491EM, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.CAN, Ascii.f22491EM, 19, Ascii.NAK, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.ESC, Ascii.CAN, Ascii.NAK, Ascii.NAK, Ascii.SUB, Ascii.SUB, Ascii.f22493FS, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.DC4, Ascii.CAN, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.f22491EM, Ascii.f22491EM, Ascii.CAN, Ascii.CAN, Ascii.SUB, Ascii.ETB, Ascii.SUB, Ascii.ESC, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.f22493FS, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.SUB};

    /* JADX INFO: renamed from: d */
    private static final C13757k f39082d = new C13757k();

    /* JADX INFO: renamed from: a */
    private final a f39083a = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.k$a */
    /* JADX INFO: compiled from: Huffman.java */
    private static final class a {

        /* JADX INFO: renamed from: a */
        final a[] f39084a;

        /* JADX INFO: renamed from: b */
        final int f39085b;

        /* JADX INFO: renamed from: c */
        final int f39086c;

        a() {
            this.f39084a = new a[256];
            this.f39085b = 0;
            this.f39086c = 0;
        }

        a(int i, int i2) {
            this.f39084a = null;
            this.f39085b = i;
            int i3 = i2 & 7;
            this.f39086c = i3 == 0 ? 8 : i3;
        }
    }

    private C13757k() {
        m40575a();
    }

    /* JADX INFO: renamed from: a */
    private void m40575a() {
        int i = 0;
        while (true) {
            byte[] bArr = f39081c;
            if (i >= bArr.length) {
                return;
            }
            m40576a(i, f39080b[i], bArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m40576a(int i, int i2, byte b) {
        a aVar = new a(i, b);
        a aVar2 = this.f39083a;
        while (b > 8) {
            b = (byte) (b - 8);
            int i3 = (i2 >>> b) & 255;
            a[] aVarArr = aVar2.f39084a;
            if (aVarArr == null) {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
            if (aVarArr[i3] == null) {
                aVarArr[i3] = new a();
            }
            aVar2 = aVar2.f39084a[i3];
        }
        int i4 = 8 - b;
        int i5 = (i2 << i4) & 255;
        int i6 = 1 << i4;
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            aVar2.f39084a[i7] = aVar;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C13757k m40577b() {
        return f39082d;
    }

    /* JADX INFO: renamed from: a */
    int m40578a(C13796f c13796f) {
        long j = 0;
        for (int i = 0; i < c13796f.mo40923j(); i++) {
            j += (long) f39081c[c13796f.mo40912a(i) & 255];
        }
        return (int) ((j + 7) >> 3);
    }

    /* JADX INFO: renamed from: a */
    void m40579a(C13796f c13796f, InterfaceC13794d interfaceC13794d) throws IOException {
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < c13796f.mo40923j(); i2++) {
            int iMo40912a = c13796f.mo40912a(i2) & 255;
            int i3 = f39080b[iMo40912a];
            byte b = f39081c[iMo40912a];
            j = (j << b) | ((long) i3);
            i += b;
            while (i >= 8) {
                i -= 8;
                interfaceC13794d.writeByte((int) (j >> i));
            }
        }
        if (i > 0) {
            interfaceC13794d.writeByte((int) ((j << (8 - i)) | ((long) (255 >>> i))));
        }
    }

    /* JADX INFO: renamed from: a */
    byte[] m40580a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a aVar = this.f39083a;
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            i = (i << 8) | (b & 255);
            i2 += 8;
            while (i2 >= 8) {
                aVar = aVar.f39084a[(i >>> (i2 - 8)) & 255];
                if (aVar.f39084a == null) {
                    byteArrayOutputStream.write(aVar.f39085b);
                    i2 -= aVar.f39086c;
                    aVar = this.f39083a;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            a aVar2 = aVar.f39084a[(i << (8 - i2)) & 255];
            if (aVar2.f39084a != null || aVar2.f39086c > i2) {
                break;
            }
            byteArrayOutputStream.write(aVar2.f39085b);
            i2 -= aVar2.f39086c;
            aVar = this.f39083a;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
