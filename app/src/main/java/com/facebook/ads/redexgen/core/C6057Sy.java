package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6057Sy {
    public static byte[] A03;
    public static String[] A04 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final String A05;
    public static volatile C6057Sy A06;
    public final C6898ge A00;
    public final Map<String, C6054Sv> A02 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Float> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(C6067T8 c6067t8, C6054Sv c6054Sv, String str) throws Throwable {
        Bitmap bitmapA01;
        String str2 = c6054Sv.A08;
        int i = c6054Sv.A04;
        int i2 = c6054Sv.A05;
        long jCurrentTimeMillis = System.currentTimeMillis();
        IOException e = null;
        String strA08 = A08(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 9, 68);
        boolean zStartsWith = str2.startsWith(strA08);
        String strA09 = A08(239, 22, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        if (zStartsWith || str2.startsWith(strA09)) {
            String strSubstring = str2.startsWith(strA08) ? str2.substring(strA08.length()) : str2.substring(strA09.length());
            InputStream inputStreamOpen = null;
            try {
                try {
                    inputStreamOpen = this.A00.getAssets().open(strSubstring);
                    if (A0D(i, i2)) {
                        try {
                            bitmapA01 = AbstractC6061T2.A01(inputStreamOpen, i, i2);
                        } catch (IOException e2) {
                            e = e2;
                            A0C(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            A0C(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            throw th;
                        }
                    } else {
                        bitmapA01 = BitmapFactory.decodeStream(inputStreamOpen);
                    }
                    if (inputStreamOpen != null) {
                        A0A(inputStreamOpen);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (OutOfMemoryError e5) {
                e = e5;
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (A0D(i, i2)) {
            try {
                bitmapA01 = A05(str2, i, i2);
            } catch (IOException e6) {
                e = e6;
                A0C(e);
                bitmapA01 = A03(str2);
            }
        } else {
            bitmapA01 = A03(str2);
        }
        String string = e != null ? e.toString() : null;
        if (bitmapA01 == null) {
            C6059T0.A03(c6067t8, c6054Sv, str, C6059T0.A03, string, null, null);
            return null;
        }
        long jA00 = A00(str2, bitmapA01);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jA00 > 0) {
            C6059T0.A03(c6067t8, c6054Sv, str, C6059T0.A02, string, Long.valueOf(jA00), Long.valueOf(jCurrentTimeMillis2));
            return bitmapA01;
        }
        C6059T0.A03(c6067t8, c6054Sv, str, C6059T0.A01, string, null, null);
        if (C6171Up.A11(c6067t8)) {
            return null;
        }
        return bitmapA01;
    }

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{3, 4, 119, 41, 55, 62, 58, Ascii.f22491EM, Ascii.f22493FS, 88, Ascii.ETB, Ascii.f22490CR, Ascii.f22492FF, 8, Ascii.f22490CR, Ascii.f22492FF, 88, Ascii.f22493FS, Ascii.f22494GS, Ascii.f22503VT, Ascii.f22492FF, 17, Ascii.SYN, Ascii.f22491EM, Ascii.f22492FF, 17, Ascii.ETB, Ascii.SYN, 88, 80, Ascii.f22498RS, 17, Ascii.DC4, Ascii.f22494GS, 69, 122, 81, 76, 85, 89, 72, Ascii.CAN, 75, 81, 66, 93, Ascii.CAN, 93, SignedBytes.MAX_POWER_OF_TWO, 91, 93, 93, 92, 75, Ascii.CAN, 85, 89, SignedBytes.MAX_POWER_OF_TWO, Ascii.CAN, 75, 81, 66, 93, Ascii.CAN, 94, 87, 74, Ascii.CAN, 75, 76, 87, 74, 89, 95, 93, 2, Ascii.CAN, Ascii.DC2, 48, 50, 57, 52, 113, 52, 35, 35, 62, 35, 127, 113, 19, 56, 37, 60, 48, 33, 113, 56, 34, 113, 63, 36, Base64.padSymbol, Base64.padSymbol, 127, 125, 90, 82, 87, 94, 95, Ascii.ESC, 79, 84, Ascii.ESC, 88, 84, 75, 66, Ascii.ESC, 87, 84, 88, 90, 87, Ascii.ESC, 82, 86, 90, 92, 94, Ascii.ESC, 82, 85, 79, 84, Ascii.ESC, 88, 90, 88, 83, 94, Ascii.ESC, 19, 78, 73, 87, 6, 38, Ascii.f22494GS, Ascii.DC2, 17, Ascii.f22502US, Ascii.SYN, 83, 7, Ascii.f22493FS, 83, 4, 1, Ascii.SUB, 7, Ascii.SYN, 83, 17, Ascii.SUB, 7, Ascii.f22498RS, Ascii.DC2, 3, 83, 7, Ascii.f22493FS, 83, Ascii.NAK, Ascii.SUB, Ascii.f22502US, Ascii.SYN, 83, 91, 6, 1, Ascii.f22502US, 78, 70, 125, 114, 113, 127, 118, 51, 103, 124, 51, 100, 97, 122, 103, 118, 51, 113, 122, 103, 126, 114, 99, 51, 103, 124, 51, 124, 102, 103, 99, 102, 103, 51, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, Base64.padSymbol, 40, 40, 40, 85, 90, 95, 86, 9, Ascii.f22493FS, Ascii.f22493FS, 82, 93, 88, 81, Ascii.f22500SO, Ascii.ESC, Ascii.ESC, Ascii.ESC, 85, 90, 80, 70, 91, 93, 80, 107, 85, 71, 71, 81, SignedBytes.MAX_POWER_OF_TWO, Ascii.ESC, 115, 119, 123, 125, 127, 10, 9, 7, 2, 42, 49, 52, 49, 48, 40, 49};
    }

    static {
        A09();
        A05 = C6057Sy.class.getSimpleName();
    }

    public C6057Sy(C6898ge c6898ge) {
        this.A00 = c6898ge;
    }

    private int A00(String str, Bitmap bitmap) {
        String strA08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0C(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        ByteArrayOutputStream bOut = null;
        FileOutputStream fileOutputStream = null;
        try {
            bOut = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= C6171Up.A0H(this.A00)) {
                A0C(new Throwable(A08(35, 42, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) + size));
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (OutOfMemoryError e) {
            A0C(e);
            Log.e(A05, A08(184, 39, 80), e);
            return 0;
        } catch (FileNotFoundException e2) {
            Log.e(A05, A08(6, 29, 59) + file.getPath() + strA08, e2);
            A0C(e2);
            return 0;
        } catch (IOException e3) {
            A0C(e3);
            Log.e(A05, A08(148, 36, 48) + str + strA08, e3);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
    private final Bitmap A01(C6067T8 c6067t8, C6054Sv c6054Sv, int i, int i2, String str) throws Throwable {
        Bitmap bitmapDecodeFile;
        Bitmap bitmapA02;
        if (C6059T0.A06(c6067t8) && A08(266, 4, 37).equals(str)) {
            this.A02.put(c6054Sv.A08, c6054Sv);
        }
        String str2 = c6054Sv.A08;
        C6058Sz c6058Sz = new C6058Sz(c6054Sv.A06, c6054Sv.A07, A08(261, 5, 89), str, str2);
        File fileA07 = A07(this.A00);
        StringBuilder sbAppend = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 26);
        File file = new File(fileA07, sbAppend.append(url).toString());
        if (!file.exists()) {
            C6059T0.A04(c6067t8, c6058Sz, false);
            String url2 = A08(232, 7, 112);
            if (!str2.startsWith(url2)) {
                bitmapA02 = A02(c6067t8, c6054Sv, str);
            } else {
                if (A04[4].charAt(22) == 'U') {
                    throw new RuntimeException();
                }
                A04[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                String url3 = A08(239, 22, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                if (!str2.startsWith(url3)) {
                    bitmapA02 = A04(str2, i2, i);
                } else {
                    bitmapA02 = A02(c6067t8, c6054Sv, str);
                }
            }
            String str3 = c6054Sv.A08;
            if (A04[0].charAt(7) != 'l') {
                A04[5] = "mvVz";
                A0B(str3, bitmapA02);
                return bitmapA02;
            }
            A04[4] = "ZqrwEo7e3gbOTkHDiv52cvZJTxj52IUd";
            A0B(str3, bitmapA02);
            return bitmapA02;
        }
        C6059T0.A04(c6067t8, c6058Sz, true);
        try {
            if (A0D(i2, i)) {
                bitmapDecodeFile = AbstractC6061T2.A02(file.getCanonicalPath(), i2, i, this.A00);
            } else {
                String url4 = file.getCanonicalPath();
                bitmapDecodeFile = BitmapFactory.decodeFile(url4);
            }
            String url5 = c6054Sv.A08;
            A0B(url5, bitmapDecodeFile);
            return bitmapDecodeFile;
        } catch (IOException e) {
            A0C(e);
            return null;
        }
    }

    private Bitmap A03(String str) {
        byte[] bArrA72;
        InterfaceC6852fu interfaceC6852fuAGw = C6871gD.A00(this.A00).AGw(str, new C6867g9());
        if (interfaceC6852fuAGw == null || (bArrA72 = interfaceC6852fuAGw.A72()) == null) {
            return null;
        }
        int length = bArrA72.length;
        if (A04[4].charAt(22) == 'U') {
            throw new RuntimeException();
        }
        A04[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
        return BitmapFactory.decodeByteArray(bArrA72, 0, length);
    }

    private Bitmap A04(String str, int i, int i2) {
        Bitmap bitmapDecodeStream;
        try {
            boolean zA0D = A0D(i, i2);
            String strA08 = A08(232, 7, 112);
            if (zA0D) {
                bitmapDecodeStream = AbstractC6061T2.A02(str.substring(strA08.length()), i, i2, this.A00);
            } else {
                bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(strA08.length())), null, null);
            }
            int iA00 = A00(str, bitmapDecodeStream);
            if (C6171Up.A11(this.A00) && iA00 <= 0) {
                return null;
            }
            return bitmapDecodeStream;
        } catch (IOException e) {
            Log.e(A05, A08(105, 43, 120) + str + A08(0, 2, 105), e);
        }
    }

    private Bitmap A05(String str, int i, int i2) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap bitmapA01 = AbstractC6061T2.A01(inputStream, i, i2);
        A0A(inputStream);
        return bitmapA01;
    }

    public static C6057Sy A06(C6898ge c6898ge) {
        if (A06 == null) {
            synchronized (C6057Sy.class) {
                if (A06 == null) {
                    A06 = new C6057Sy(c6898ge);
                }
            }
        }
        return A06;
    }

    public static File A07(C6067T8 c6067t8) {
        return c6067t8.getCacheDir();
    }

    public static void A0A(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(String str, Bitmap bitmap) {
        if (!this.A01.containsKey(str) && bitmap != null && bitmap.getHeight() > 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            if (width > 0.0f) {
                this.A01.put(str, Float.valueOf(width));
            }
        }
    }

    private void A0C(Throwable th) {
        String strA08 = A08(261, 5, 89);
        if (th != null) {
            this.A00.A08().ABC(strA08, AbstractC6098Td.A1f, new C6099Te(th));
        } else {
            this.A00.A08().ABC(strA08, AbstractC6098Td.A1f, new C6099Te(A08(77, 28, 18)));
        }
    }

    private boolean A0D(int i, int i2) {
        return i > 0 && i2 > 0;
    }

    public final float A0E(String str) {
        if (this.A01.containsKey(str) && this.A01.get(str) != null) {
            return this.A01.get(str).floatValue();
        }
        if (A04[6].length() == 28) {
            throw new RuntimeException();
        }
        A04[6] = "EtgkjkQAQYyyMgrrXA05VcKpExUV0Ywa";
        return -1.0f;
    }

    public final Bitmap A0F(C6054Sv c6054Sv) {
        return A01(this.A00, c6054Sv, c6054Sv.A05, c6054Sv.A04, c6054Sv.A02);
    }

    public final Bitmap A0G(C6067T8 c6067t8, String str, int i, int i2, String str2) {
        C6054Sv c6054Sv = this.A02.get(str);
        return (!C6059T0.A06(c6067t8) || c6054Sv == null) ? A01(c6067t8, new C6054Sv(str, i, i2, A08(270, 7, 28), A08(270, 7, 28)), i2, i, str2) : A01(c6067t8, c6054Sv, i2, i, str2);
    }

    public final File A0H(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0I(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
