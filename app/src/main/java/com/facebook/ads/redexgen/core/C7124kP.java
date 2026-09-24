package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7124kP implements InterfaceC5674Mh {
    public static byte[] A07;
    public static String[] A08 = {"F3MsLf6P", "OcoAPMR8U6yTwuATNsSjihct3nuq8KFx", "bdE6GcC1kS6ix1fgAcoyQkC9rv", "V0wqj6Me", "EdnIrf", "cKhO3MBZMfPQ2uYBFx142UbqGZ0vcEvq", "x8zWNoAeDf", "YEiR7yHxtXFy2pC0Q9KvxgBtY"};
    public C5681Mo A00;
    public boolean A01;
    public final C453740 A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "SFj9nJw9GR";
            strArr2[4] = "liv3w1";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 117);
            i4++;
        }
    }

    public static void A03() {
        A07 = new byte[]{Ascii.f22503VT, Ascii.f22499SI, Ascii.f22494GS};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, C5673Mg> map) throws IOException {
        try {
            C45363z c45363zA03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new C5681Mo(c45363zA03);
            } else {
                this.A00.A00(c45363zA03);
            }
            C5681Mo c5681Mo = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(c5681Mo);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.A06 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) AbstractC46115C.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) AbstractC46115C.A0f(this.A04)).init(1, (Key) AbstractC46115C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(c5681Mo, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(map.size());
            int iA00 = 0;
            for (C5673Mg c5673Mg : map.values()) {
                A04(c5673Mg, dataOutputStream);
                iA00 += A00(c5673Mg, 2);
            }
            dataOutputStream.writeInt(iA00);
            this.A02.A06(dataOutputStream);
            AbstractC46115C.A10(null);
        } catch (Throwable th) {
            AbstractC46115C.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, C5673Mg> map, SparseArray<String> sparseArray) {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i = dataInputStream.readInt();
            if (i < 0 || i > 2) {
                AbstractC46115C.A10(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A04 == null) {
                    AbstractC46115C.A10(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A04.init(2, (Key) AbstractC46115C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            } else if (this.A06) {
                this.A01 = true;
            }
            int i2 = dataInputStream.readInt();
            int iA00 = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                C5673Mg c5673MgA01 = A01(i, dataInputStream);
                map.put(c5673MgA01.A02, c5673MgA01);
                sparseArray.put(c5673MgA01.A01, c5673MgA01.A02);
                iA00 += A00(c5673MgA01, i);
            }
            int i4 = dataInputStream.readInt();
            boolean z = dataInputStream.read() == -1;
            if (i4 == iA00 && z) {
                AbstractC46115C.A10(dataInputStream);
                return true;
            }
            AbstractC46115C.A10(dataInputStream);
            return false;
        } catch (IOException unused) {
            if (0 != 0) {
                AbstractC46115C.A10(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                AbstractC46115C.A10(null);
            }
            throw th;
        }
    }

    static {
        A03();
    }

    public C7124kP(File file, byte[] bArr, boolean z) {
        AbstractC45353y.A08((bArr == null && z) ? false : true);
        Cipher cipherA05 = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            AbstractC45353y.A07(bArr.length == 16);
            try {
                cipherA05 = C5675Mi.A05();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 85));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            AbstractC45353y.A07(!z);
        }
        this.A06 = z;
        this.A04 = cipherA05;
        this.A05 = secretKeySpec;
        this.A03 = z ? new SecureRandom() : null;
        this.A02 = new C453740(file);
    }

    private int A00(C5673Mg c5673Mg, int i) {
        int result = c5673Mg.A01;
        int i2 = result * 31;
        int result2 = c5673Mg.A02.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long jA00 = AbstractC5676Mj.A00(c5673Mg.A03());
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + c5673Mg.A03().hashCode();
    }

    private C5673Mg A01(int i, DataInputStream dataInputStream) throws IOException {
        C7122kN c7122kNA02;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i >= 2) {
            c7122kNA02 = C5675Mi.A02(dataInputStream);
        } else {
            long length = dataInputStream.readLong();
            C5678Ml c5678Ml = new C5678Ml();
            C5678Ml.A00(c5678Ml, length);
            c7122kNA02 = C7122kN.A03.A05(c5678Ml);
        }
        return new C5673Mg(i2, utf, c7122kNA02);
    }

    private void A04(C5673Mg c5673Mg, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(c5673Mg.A01);
        dataOutputStream.writeUTF(c5673Mg.A02);
        C5675Mi.A08(c5673Mg.A03(), dataOutputStream);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void A5p() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final boolean A6S() {
        return this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AAF(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AAs(HashMap<String, C5673Mg> map, SparseArray<String> sparseArray) {
        AbstractC45353y.A08(!this.A01);
        if (!A06(map, sparseArray)) {
            map.clear();
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A08[7] = "LXlnn5Px";
            sparseArray.clear();
            this.A02.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AFd(C5673Mg c5673Mg, boolean z) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AGK(C5673Mg c5673Mg) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AKI(HashMap<String, C5673Mg> map) throws IOException {
        A05(map);
        this.A01 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AKJ(HashMap<String, C5673Mg> map) throws IOException {
        if (!this.A01) {
            return;
        }
        AKI(map);
    }
}
