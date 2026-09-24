package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ks */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7152ks implements InterfaceC5596LR {
    public static byte[] A09;
    public static String[] A0A = {"jhQijRHeS2b3DC", "TrxlLGPRt74PJqIyPQ202SRMEezA", "IB0ZY9fOXgD7jLe6Y4PRk3dCNjPCK6", "H6fabJXG57DAkPtsQTSNUghzavXSaH69", "ufMT47zQTczJDi2Vdc2LdI1YLyWR3nOe", "Lk9ILhYpp3cxsVDBevZ7UGW4HuH86l", "wl", "vesbJwqYWy5viKlOFyHJIQca6g"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final C5604LZ A02;
    public final InterfaceC5617Lm A04;
    public final C6067T8 A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C5606Lb A03 = new C5606Lb();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0126: INVOKE 
  (r10v1 ?? I:com.facebook.ads.redexgen.X.Lm)
  (r11 I:java.lang.String)
  (r12 I:int)
  (r13 I:java.lang.String)
  (r14 I:java.lang.Long)
  (r15 I:java.lang.Long)
  (r16 I:com.facebook.ads.redexgen.X.LX)
 INTERFACE call: com.facebook.ads.redexgen.X.Lm.AHU(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.LX):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.LX):void (m)], block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0141: INVOKE 
  (r10v0 ?? I:com.facebook.ads.redexgen.X.Lm)
  (r11 I:java.lang.String)
  (r12 I:int)
  (r13 I:java.lang.String)
  (r14 I:java.lang.Long)
  (r15 I:java.lang.Long)
  (r16 I:com.facebook.ads.redexgen.X.LX)
 INTERFACE call: com.facebook.ads.redexgen.X.Lm.AHU(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.LX):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.LX):void (m)], block:B:49:0x0135 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0124: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x013f: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0135 */
    private File A02(C5602LX c5602lx, String str, String str2, int i, C5605La c5605La) throws Exception {
        C5602LX c5602lx2;
        String strAHU;
        C5602LX c5602lx3;
        String strAHU2;
        String strA03 = A03(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 22, 17);
        try {
            String str3 = str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file = new File(A01(this.A05), str2);
            final long jA0R = C6171Up.A0R(this.A05);
            C7146km c7146km = new C7146km(file, new AbstractC7151kr(jA0R) { // from class: com.facebook.ads.redexgen.X.8L
                public static byte[] A01;
                public final long A00;

                static {
                    A01();
                }

                public static String A00(int i2, int i3, int i4) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                    for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                        bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 38);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A01 = new byte[]{-31, -11, Ascii.f22492FF, -76, 7, -3, Ascii.f22500SO, -7, -76, 1, 9, 7, 8, -76, -10, -7, -76, 4, 3, 7, -3, 8, -3, 10, -7, -76, 2, 9, 1, -10, -7, 6, -75};
                }

                {
                    if (jA0R > 0) {
                        this.A00 = jA0R;
                        return;
                    }
                    throw new IllegalArgumentException(A00(0, 33, 110));
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC7151kr
                public final boolean A08(File file2, long j, int i2) {
                    return j <= this.A00;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC7151kr, com.facebook.ads.redexgen.core.InterfaceC5607Lc
                public final /* bridge */ /* synthetic */ void AKR(File file2) throws IOException {
                    super.AKR(file2);
                }
            });
            if (c7146km.A09()) {
                if (this.A08) {
                    String str4 = A03(49, 22, 36) + c7146km.A00.getName();
                }
                this.A06.put(str3, file);
                c7146km.A06();
                this.A04.AHV(str3, true, c5602lx);
                return file;
            }
            if (this.A08) {
                String str5 = A03(71, 26, 76) + c7146km.A00.getName();
            }
            if (!c5605La.A04()) {
                return null;
            }
            this.A04.AHV(str3, false, c5602lx);
            for (int i2 = 0; i2 < this.A00; i2++) {
                try {
                    C6067T8 c6067t8 = this.A05;
                    if (A0A[3].charAt(31) != '9') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0A;
                    strArr[2] = "QJ6lhIf3SMnJsUHWjUzyv1yZJIRdgp";
                    strArr[5] = "f1TQksdEGnGezGtACwRIsNgGsb1lS2";
                    str3 = str3;
                    try {
                        A05(c6067t8, c7146km, str3, i, i2, jCurrentTimeMillis);
                        break;
                    } catch (C5613Li e) {
                        e = e;
                        if (i2 == this.A00 - 1) {
                            A06(c7146km);
                            if (e instanceof C7147kn) {
                                throw ((C7147kn) e);
                            }
                            if (e instanceof C7140kg) {
                                throw ((C7140kg) e);
                            }
                        }
                    }
                } catch (C5613Li e2) {
                    e = e2;
                }
            }
            int iA03 = c7146km.A03();
            c7146km.A06();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            c5605La.A00().A5D(file, this.A04);
            this.A06.put(str3, file);
            this.A04.AHU(str3, 2112, null, Long.valueOf(iA03), Long.valueOf(jCurrentTimeMillis2), c5602lx);
            return file;
        } catch (C7140kg e3) {
            this.A04.AHU(strAHU2, 2113, e3.toString(), null, null, c5602lx3);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e3);
            return null;
        } catch (C7147kn e4) {
            this.A04.AHU(strAHU, 2119, e4.toString(), null, null, c5602lx2);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e4);
            return null;
        }
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-95, -23, -30, -12, -95, -29, -26, -26, -17, -95, -22, -17, -11, -26, -13, -13, -10, -15, -11, -26, -27, -81, -128, 116, -70, -67, -64, -71, 116, -73, -64, -71, -75, -62, -71, -72, -114, 116, -52, -66, -33, Ascii.DC2, Ascii.DC2, 3, Ascii.f22503VT, Ascii.f22500SO, Ascii.DC2, -40, -66, -103, -73, -71, -66, -65, -60, -67, 118, -68, -65, -62, -69, 118, -71, -59, -61, -58, -62, -69, -54, -69, 118, -63, -33, -31, -26, -25, -20, -27, -98, -28, -25, -22, -29, -98, -20, -19, -14, -98, -31, -19, -21, -18, -22, -29, -14, -29, -98, -87, -57, -55, -50, -49, -44, -51, -122, -43, -52, -122, -121, -91, -78, 107, -72, 100, -89, -80, -77, -73, -87, 100, -89, -91, -89, -84, -87, 100, -86, -83, -80, -87, 114, -61, -31, -18, -89, -12, -96, -14, -27, -31, -28, -96, -31, -13, -13, -27, -12, -13, -82, -63, -33, -20, -91, -14, -98, -16, -29, -33, -30, -98, -22, -29, -20, -27, -14, -26, -98, -19, -28, -98, -124, -91, -84, -91, -76, -87, -82, -89, 96, -93, -95, -93, -88, -91, 96, -90, -87, -84, -91, 96, -95, -90, -76, -91, -78, 96, -91, -72, -93, -91, -91, -92, -87, -82, -89, 96, -78, -91, -76, -78, -71, 96, -95, -76, -76, -91, -83, -80, -76, -77, 122, 96, -120, -75, -75, -78, -75, 99, -90, -92, -90, -85, -84, -79, -86, 99, -73, -85, -88, 99, -87, -84, -81, -88, -89, -44, -44, -47, -44, -126, -59, -50, -57, -61, -48, -53, -48, -55, -126, -56, -53, -50, -57, -23, Ascii.SYN, Ascii.SYN, 19, Ascii.SYN, -60, 7, Ascii.DLE, 19, Ascii.ETB, Ascii.f22490CR, Ascii.DC2, Ascii.f22503VT, -60, Ascii.ETB, 19, Ascii.f22491EM, Ascii.SYN, 7, 9, -39, -2, -13, -1, -3, 0, -4, -11, 4, -11, -80, 2, -11, 3, 0, -1, -2, 3, -11, -66, 2, 32, 39, Ascii.ETB, Ascii.f22493FS, Ascii.NAK, -50, 34, Ascii.f22494GS, -50, 32, 19, Ascii.f22499SI, Ascii.DC2, -50, -31, -28, -18, -9, -83, -26, -23, -20, -27, -83, -29, -31, -29, -24, -27, -50, -32, -32, -46, -31, -89, -100, -100, -100, -77, -74, -71, -78, -121, 124, 124, 124, -82, -69, -79, -65, -68, -74, -79, -84, -82, -64, -64, -78, -63, 124};
    }

    static {
        A04();
        A0B = C7152ks.class.getSimpleName();
    }

    public C7152ks(C6067T8 c6067t8, C5604LZ c5604lz, InterfaceC5617Lm interfaceC5617Lm) {
        this.A05 = c6067t8;
        this.A08 = c5604lz.A02();
        this.A00 = c5604lz.A00();
        this.A04 = interfaceC5617Lm;
        this.A01 = c5604lz.A01();
        this.A02 = c5604lz;
    }

    public static C7150kq A00(Context context, String str) throws C5613Li {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr, 0, bArr.length);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return new C7150kq(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e) {
            throw new C5613Li(A03(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 18, 78), e);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 78));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0157 A[Catch: Li -> 0x015f, all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #15 {Li -> 0x015f, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:109:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:63:0x0190  */
    private void A05(Context context, C7146km c7146km, String str, int i, int i2, long j) throws Exception {
        InterfaceC5616Ll c7141kh;
        int iA06;
        int iA07;
        String[] strArr;
        String strA03 = A03(263, 20, 114);
        String strA04 = A03(342, 22, 27);
        if (str.startsWith(strA04)) {
            String localUrl = str.substring(strA04.length());
            c7141kh = A00(context, localUrl);
        } else {
            String strA05 = A03(333, 9, 59);
            if (str.startsWith(strA05)) {
                String localUrl2 = str.substring(strA05.length());
                c7141kh = A00(context, localUrl2);
            } else {
                c7141kh = new C7141kh(str, i);
            }
        }
        try {
            if (this.A08) {
                try {
                    try {
                        String str2 = A03(303, 15, 124) + str + A03(38, 11, 108) + i2;
                    } catch (C5613Li e) {
                        e = e;
                        iA06 = 0;
                        try {
                            if (c7141kh instanceof C7141kh) {
                                try {
                                    iA06 = ((C7141kh) c7141kh).A06();
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        c7141kh.close();
                                    } catch (C5613Li | IllegalArgumentException e2) {
                                        if (this.A08) {
                                            Log.e(A0B, strA03, e2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            try {
                                this.A05.A08().ABo(j, System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                c7141kh.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (A0A[4].charAt(27) == 'R') {
                                A0A[3] = "p8aYiN6IujE52Q2p9R2WzRwMj4wd2wO9";
                            }
                            throw new RuntimeException();
                        }
                    }
                } catch (C5613Li e3) {
                    e = e3;
                    iA06 = 0;
                    if (c7141kh instanceof C7141kh) {
                        iA06 = ((C7141kh) c7141kh).A06();
                    }
                    this.A05.A08().ABo(j, System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    c7141kh.close();
                    throw th;
                }
            }
            int iA03 = c7146km.A03();
            int length = c7141kh.length();
            boolean z = length < 0;
            if (A0A[3].charAt(31) == '9') {
                A0A[3] = "O2qol2VIPsSIkPIIN6kN5hssl2djupr9";
                if (z) {
                    boolean zA07 = A07(c7146km);
                    if (this.A08) {
                        String str3 = A03(149, 21, 76) + str + A03(22, 16, 34) + zA07;
                    }
                }
                try {
                    try {
                        if (z || iA03 < length) {
                            c7141kh.AGj(iA03);
                            byte[] buffer = new byte[8192];
                            while (true) {
                                int i3 = c7141kh.read(buffer);
                                if (i3 == -1) {
                                    break;
                                } else {
                                    c7146km.A08(buffer, i3);
                                }
                            }
                            if (!z || c7146km.A03() == length) {
                                c7146km.A07();
                                iA07 = 0;
                                if (c7141kh instanceof C7141kh) {
                                    iA07 = ((C7141kh) c7141kh).A06();
                                }
                                InterfaceC6097Tc interfaceC6097TcA08 = this.A05.A08();
                                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                long jA03 = c7146km.A03();
                                strArr = A0A;
                                if (strArr[2].length() != strArr[5].length()) {
                                    A0A[0] = "LJMphR6GQubhlr";
                                } else {
                                    A0A[0] = "i3csCW72L1z7Bc";
                                }
                                interfaceC6097TcA08.ABo(j, jCurrentTimeMillis, jA03, 0L, iA07, null);
                                c7141kh.close();
                                return;
                            }
                            throw new C7147kn(A03(283, 20, 94));
                        }
                        c7141kh.close();
                        return;
                    } catch (C5613Li | IllegalArgumentException e4) {
                        if (this.A08) {
                            String str4 = A0B;
                            String[] strArr2 = A0A;
                            if (strArr2[2].length() != strArr2[5].length()) {
                                throw new RuntimeException();
                            }
                            A0A[1] = "AOKjIt2kEVzrEy7KBqss66";
                            Log.e(str4, strA03, e4);
                            return;
                        }
                        return;
                    }
                    if (!z) {
                        c7146km.A07();
                    } else {
                        throw new C7147kn(A03(283, 20, 94));
                    }
                    iA07 = 0;
                    if (c7141kh instanceof C7141kh) {
                        iA07 = ((C7141kh) c7141kh).A06();
                    }
                    InterfaceC6097Tc interfaceC6097TcA09 = this.A05.A08();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                    long jA04 = c7146km.A03();
                    strArr = A0A;
                    if (strArr[2].length() != strArr[5].length()) {
                        A0A[0] = "LJMphR6GQubhlr";
                    } else {
                        A0A[0] = "i3csCW72L1z7Bc";
                    }
                    interfaceC6097TcA09.ABo(j, jCurrentTimeMillis2, jA04, 0L, iA07, null);
                } catch (C5613Li e5) {
                    e = e5;
                    iA06 = 0;
                    if (c7141kh instanceof C7141kh) {
                        iA06 = ((C7141kh) c7141kh).A06();
                    }
                    this.A05.A08().ABo(j, System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                    throw e;
                } catch (Throwable th5) {
                    th = th5;
                    c7141kh.close();
                    throw th;
                }
            }
            throw new RuntimeException();
        } catch (C5613Li e6) {
            e = e6;
            if (A0A[0].length() == 14) {
                String[] strArr3 = A0A;
                strArr3[2] = "7VHRmmesbfeDqucWLtEKLKcMBQJVNm";
                strArr3[5] = "oM47EpnTTF1S9ikTK6B0AzPGZuSKH0";
            }
        }
    }

    private void A06(C7146km c7146km) {
        try {
            File fileA04 = c7146km.A04();
            if (fileA04.exists()) {
                c7146km.A06();
                boolean zDelete = fileA04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(170, 52, 14) + zDelete);
                }
            }
        } catch (Exception e) {
            if (A0A[0].length() != 14) {
                throw new RuntimeException();
            }
            A0A[3] = "fJTJjiotuyJvZrF72L8221tI8VUznJb9";
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 18), e);
            }
        }
    }

    private boolean A07(C7146km c7146km) {
        try {
            c7146km.A05();
            if (A0A[4].charAt(27) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "zmS4hUlvHkaHxqc9Vg18exvolw";
            strArr[6] = "qC";
            return true;
        } catch (C7140kg e) {
            if (this.A08) {
                Log.e(A0B, A03(244, 19, 48), e);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.La != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> C5598LT<T> A08(C5602LX c5602lx, C5605La<T> c5605La) {
        Semaphore semaphore;
        if (c5605La.A03()) {
            File file = this.A06.get(c5602lx.A09);
            if (file != null) {
                this.A04.AHV(c5602lx.A09, true, c5602lx);
                return c5605La.A00().A3x(file, this.A04);
            }
            this.A04.AHV(c5602lx.A09, false, c5602lx);
            return new C5598LT<>(false, null);
        }
        String str = c5602lx.A09;
        String str2 = c5602lx.A04;
        StringBuilder sb = new StringBuilder();
        String baseUrl = this.A03.A03(str);
        String extension = sb.append(baseUrl).append(str2).toString();
        synchronized (this.A07) {
            semaphore = this.A07.get(extension);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(extension, semaphore);
            }
            try {
            } catch (Throwable th) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                    throw th;
                }
            }
        }
        try {
            semaphore.acquire();
            File fileA02 = A02(c5602lx, str, extension, this.A01, c5605La);
            if (fileA02 != null) {
                C5598LT<T> c5598ltA3x = c5605La.A00().A3x(fileA02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                }
                return c5598ltA3x;
            }
            C5598LT<T> c5598lt = new C5598LT<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
            }
            return c5598lt;
        } catch (InterruptedException unused) {
            if (this.A08) {
                StringBuilder sb2 = new StringBuilder();
                String baseUrl2 = A03(97, 11, 52);
                StringBuilder sbAppend = sb2.append(baseUrl2).append(str);
                String baseUrl3 = A03(0, 22, 79);
                sbAppend.append(baseUrl3).toString();
            }
            C5598LT<T> c5598lt2 = new C5598LT<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
                return c5598lt2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5596LR
    public final C5598LT<Bitmap> AIe(C5602LX c5602lx, boolean z) {
        return A08(c5602lx, new C5605La(new C7156kx(c5602lx.A01, c5602lx.A00, this.A02.A04(), this.A02.A03(), z)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.La != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5596LR
    public final File AIf(C5602LX c5602lx) {
        C5605La c5605La = new C5605La(new C7155kw());
        c5605La.A01(true);
        c5605La.A02(false);
        return (File) A08(c5602lx, c5605La).A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5596LR
    public final String AIg(C5602LX c5602lx) {
        return (String) A08(c5602lx, new C5605La(new C7154kv())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.La != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5596LR
    public final String AIh(C5602LX c5602lx) {
        C5605La c5605La = new C5605La(new C7154kv());
        c5605La.A01(true);
        c5605La.A02(false);
        return (String) A08(c5602lx, c5605La).A00();
    }
}
