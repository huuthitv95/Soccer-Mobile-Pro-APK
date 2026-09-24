package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.JL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5466JL {
    public static byte[] A03;
    public static String[] A04 = {"1LFyGIpszZgsQUUW5R18ay4ATJEAL43c", "dt6orGbglcsjMqs", "9FFDgagoC1", "foXErnBO9GEWWKnhx2CBLj59I1mQsasl", "8wc6iy8fDBcca8zNmQv", "", "jjxV28nHyp6my1wOvIi", "qfRjwVGa5Ot2KmC8yJE9Z4CCjcQdKZvd"};
    public static final C7149kp A05;
    public static final C7149kp A06;
    public int A01;
    public final List<C5463JI> A02 = new ArrayList();
    public int A00 = 0;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
            if (A04[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A04[1] = "QzkInJPgctLD5w2";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{45, 10, Ascii.DC2, 5, 8, Ascii.f22490CR, 0, 68, 55, 33, 34, 68, 10, 5, 9, 1, 56, 7, 4, Ascii.f22493FS, 38, 4, Ascii.f22502US, 2, 4, 5, 52, 47, 10, Ascii.f22502US, 10, 93, 123, 126, 107, 124, 81, 93, 98, 97, 121, 67, 97, 122, 103, 97, 96, 81, 76, 73, 67, 94, 120, 125, 104, 127, 82, 94, 97, 98, 122, SignedBytes.MAX_POWER_OF_TWO, 98, 121, 100, 98, 99, 82, 73, 108, 121, 108, 50, Ascii.DC4, 17, 4, 19, 62, 50, Ascii.f22490CR, Ascii.f22500SO, Ascii.SYN, 44, Ascii.f22500SO, Ascii.NAK, 8, Ascii.f22500SO, Ascii.f22499SI, 62, 37, 4, 7, Ascii.f22490CR, 8, 2, 10, 4, 19, 8, Ascii.f22499SI, 6, 62, 46, Ascii.f22499SI, 65, 103, 98, 119, 96, 77, 65, 126, 125, 101, 95, 125, 102, 123, 125, 124, 77, 87, 118, 123, 102, 77, 86, 115, 102, 115};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(InterfaceC7263ms interfaceC7263ms, List<Metadata.Entry> list) throws IOException {
        long jA8n = interfaceC7263ms.A8n();
        int iA8O = (int) ((interfaceC7263ms.A8O() - interfaceC7263ms.A8n()) - ((long) this.A01));
        C45944v c45944v = new C45944v(iA8O);
        interfaceC7263ms.readFully(c45944v.A0l(), 0, iA8O);
        for (int i = 0; i < this.A02.size(); i++) {
            C5463JI c5463ji = this.A02.get(i);
            c45944v.A0f((int) (c5463ji.A02 - jA8n));
            c45944v.A0g(4);
            int iA0E = c45944v.A0E();
            String[] strArr = A04;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A04[7] = "1HViS9NC9rn2qgqFvoB7LQiD1FLq6ChH";
            int iA00 = A00(c45944v.A0W(iA0E));
            int i2 = c5463ji.A01 - (iA0E + 8);
            switch (iA00) {
                case 2192:
                    list.add(A01(c45944v, i2));
                    break;
                case 2816:
                case 2817:
                case 2819:
                case NearbyMessagesStatusCodes.BLUETOOTH_OFF /* 2820 */:
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    static {
        A03();
        A06 = C7149kp.A02(AbstractJsonLexerKt.COLON);
        A05 = C7149kp.A02('*');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static int A00(String str) throws C44963K {
        byte b;
        switch (str.hashCode()) {
            case -1711564334:
                if (!str.equals(A02(16, 15, 81))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1332107749:
                if (!str.equals(A02(104, 26, 40))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1251387154:
                if (!str.equals(A02(51, 21, 55))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -830665521:
                if (!str.equals(A02(72, 32, 91))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1760745220:
                if (!str.equals(A02(31, 20, 52))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 2192;
            case 1:
                return 2816;
            case 2:
                return 2817;
            case 3:
                return 2819;
            case 4:
                return NearbyMessagesStatusCodes.BLUETOOTH_OFF;
            default:
                throw C44963K.A01(A02(0, 16, 94), null);
        }
    }

    public static SlowMotionData A01(C45944v c45944v, int i) throws C44963K {
        List<SlowMotionData.Segment> segments = new ArrayList<>();
        String dataString = c45944v.A0W(i);
        List<String> listA06 = A05.A06(dataString);
        for (int i2 = 0; i2 < listA06.size(); i2++) {
            List<String> listA07 = A06.A06(listA06.get(i2));
            if (listA07.size() == 3) {
                try {
                    long j = Long.parseLong(listA07.get(0));
                    long startTimeMs = Long.parseLong(listA07.get(1));
                    segments.add(new SlowMotionData.Segment(j, startTimeMs, 1 << (Integer.parseInt(listA07.get(2)) - 1)));
                } catch (NumberFormatException e) {
                    throw C44963K.A01(null, e);
                }
            } else {
                throw C44963K.A01(null, null);
            }
        }
        return new SlowMotionData(segments);
    }

    private void A04(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        C45944v c45944v = new C45944v(8);
        interfaceC7263ms.readFully(c45944v.A0l(), 0, 8);
        this.A01 = c45944v.A0E() + 8;
        if (c45944v.A0C() != 1397048916) {
            c5353hv.A00 = 0L;
        } else {
            c5353hv.A00 = interfaceC7263ms.A8n() - ((long) (this.A01 - 12));
            this.A00 = 2;
        }
    }

    private void A05(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        long jA8O = interfaceC7263ms.A8O();
        int i = (this.A01 - 12) - 8;
        C45944v c45944v = new C45944v(i);
        interfaceC7263ms.readFully(c45944v.A0l(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            c45944v.A0g(2);
            int i3 = c45944v.A0a();
            switch (i3) {
                case 2192:
                case 2816:
                case 2817:
                case 2819:
                case NearbyMessagesStatusCodes.BLUETOOTH_OFF /* 2820 */:
                    long streamLength = this.A01;
                    long j = jA8O - streamLength;
                    long streamLength2 = c45944v.A0E();
                    int size = c45944v.A0E();
                    this.A02.add(new C5463JI(i3, j - streamLength2, size));
                    break;
                default:
                    c45944v.A0g(8);
                    break;
            }
        }
        if (this.A02.isEmpty()) {
            c5353hv.A00 = 0L;
            return;
        }
        this.A00 = 3;
        long streamLength3 = this.A02.get(0).A02;
        c5353hv.A00 = streamLength3;
    }

    public final int A07(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
        long j = 0;
        switch (this.A00) {
            case 0:
                long jA8O = interfaceC7263ms.A8O();
                if (jA8O != -1 && jA8O >= 8) {
                    j = jA8O - 8;
                }
                c5353hv.A00 = j;
                this.A00 = 1;
                return 1;
            case 1:
                A04(interfaceC7263ms, c5353hv);
                return 1;
            case 2:
                A05(interfaceC7263ms, c5353hv);
                return 1;
            case 3:
                A06(interfaceC7263ms, slowMotionMetadataEntries);
                c5353hv.A00 = 0L;
                return 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final void A08() {
        this.A02.clear();
        this.A00 = 0;
    }
}
