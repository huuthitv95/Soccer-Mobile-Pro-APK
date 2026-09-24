package com.facebook.ads.redexgen.core;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.Ascii;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6444ZJ implements InterfaceC6135UF {
    public static PackageInfo A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"txu4RBo63YQ5Q7SoAp", "BY8ga9ljLbuWBmJa1ktUn6UmPorDtudq", "oIcH05TUMC1H4eRB0f575BffOzLV6s", "RDV9o0Xs0wR3bMJwiMoqv", "Drf", "fWBbnfM052TaJjbz2mNIhyXx2yjBcv", "vwrAcDNdoQtjOaT8FPnJSektvmYH0bUo", "A7bgPIcOUjT1m5u12vt0AimohlYQKPcw"};
    public static final EnumC5627Lw[] A06;
    public final C6046Sn A00;
    public final C6067T8 A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A05[4].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[3] = "e8Iif6peCxlhmB6JTHauJ";
        strArr[0] = "U2Egyo0LhTV3FJWkcb";
        A04 = new byte[]{-98, -70, -85, -83, -83, -81, -67, -67, -77, -84, -77, -74, -77, -66, -61, -55, -81, -72, -85, -84, -74, -81, -82, -26, -13, -26, -15, -12, -20, -69, -54, -54, -39, -57, -61, -56, -39, -51, -66, -59, -39, -48, -65, -52, -51, -61, -55, -56, -38, -20, -31, -38, -20, -25, -7, -17, -22, -14, 5, 5, 3, -6, -13, 6, 5, -6, 0, -1, Ascii.DLE, -6, -11, -7, 0, -5, -5, -4, 9, Ascii.SYN, Ascii.f22503VT, 6, 2, -4, 5, Ascii.SYN, -4, Ascii.f22499SI, Ascii.f22503VT, 9, -8, 10, -124, -117, -122, -122, -121, -108, -95, -106, -111, -115, -121, -112, -95, -106, -107, -95, -113, -107, -26, -7, -14, -24, -16, -23, -110, -112, -110, -105, -108, -73, -75, -60, -60, -71, -72, -45, -67, -72, -57, -96, -98, -81, -81, -90, -94, -81, -32, -35, -16, -35, -5, -20, -18, -21, -33, -31, -17, -17, -27, -22, -29, -5, -21, -20, -16, -27, -21, -22, -17, -120, -123, -104, -123, -93, -108, -106, -109, -121, -119, -105, -105, -115, -110, -117, -93, -109, -108, -104, -115, -109, -110, -105, -93, -121, -109, -103, -110, -104, -106, -99, -104, -107, -88, -107, -77, -92, -90, -93, -105, -103, -89, -89, -99, -94, -101, -77, -93, -92, -88, -99, -93, -94, -89, -77, -89, -88, -107, -88, -103, -71, -70, -61, -56, -66, -55, -50, -41, -26, -33, -33, -42, -35, -16, -44, -32, -29, -42, -16, -42, -25, -42, -33, -27, -28, -25, -10, -17, -17, -26, -19, 0, -19, -16, -24, -24, -26, -27, -81, -54, -46, -43, -50, -51, -119, -35, -40, -119, -53, -34, -46, -43, -51, -119, -34, -36, -50, -37, -119, -35, -40, -44, -50, -41, -96, -103, -85, -73, -99, -80, -89, -88, -92, -103, -79, -99, -86, -6, -11, -9, -14, -57, -62, -35, -63, -65, -63, -58, -61, -35, -46, -47, -35, -53, -47, -69, -74, -47, -59, -63, -57, -60, -75, -73, -24, -19, -14, -13, -32, -21, -21, -28, -15, -104, -101, -113, -115, -104, -111, 1, -11, -1, -7, -75, -83, -84, -79, -87, -68, -79, -73, -74, -57, -69, -83, -70, -66, -79, -85, -83, -10, -19, -4, -1, -9, -6, -13, 7, -4, 1, -8, -19, -82, -94, -76, -85, -76, -78, -66, -76, -78, -92, -79, -66, -88, -93, -100, -103, -103, -98, -113, -114, -74, -74, -61, -89, -80, -83, -87, -78, -72, -61, -73, -88, -81, -61, -70, -87, -74, -73, -83, -77, -78, 2, 2, Ascii.f22499SI, -13, -1, -2, -10, -7, -9, Ascii.f22499SI, 4, 3, Ascii.f22499SI, -3, 3, -6, -6, 7, -19, 0, -4, -6, -23, -5, -89, -89, -76, -98, -88, -76, -101, -89, -92, -94, -76, -88, -102, -89, -85, -98, -104, -102, -111, -111, -98, -110, -124, -111, -107, -120, -126, -124, -98, -110, -125, -118, -98, -107, -124, -111, -110, -120, -114, -115, -42, -40, -54, -29, -54, -58, -29, -59, -44, -44, -29, -51, -46, -41, -40, -59, -48, -48, -55, -56, -109, -107, -121, -96, -121, -125, -96, -126, -111, -111, -96, -105, -122, -109, -108, -118, -112, -113, -17, -33, -18, -31, -31, -22, -5, -28, -31, -27, -29, -28, -16, -10, -26, -11, -24, -24, -15, 2, -6, -20, -25, -9, -21, -27, -42, -35, -15, -43, -45, -30, -45, -44, -37, -34, -37, -26, -21, -65, -80, -73, -53, -71, -83, -70, -83, -77, -79, -80, -53, -81, -83, -81, -76, -79, -9, -23, -9, -9, -19, -13, -14, 3, -8, -19, -15, -23, 17, 10, 5, Ascii.DLE, Ascii.NAK, -106, -108, -122, -109, -96, -126, -120, -122, -113, -107, -59, -80, -69, -65, -80, -63, -80, -68, -62, -60, -53, -62, -62};
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010b A[Catch: IOException -> 0x0113, TryCatch #2 {IOException -> 0x0113, blocks: (B:28:0x0106, B:30:0x010b, B:32:0x0110), top: B:40:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0110 A[Catch: IOException -> 0x0113, TRY_LEAVE, TryCatch #2 {IOException -> 0x0113, blocks: (B:28:0x0106, B:30:0x010b, B:32:0x0110), top: B:40:0x0106 }] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final String A05(InterfaceC6133UD interfaceC6133UD) {
        C6131UB.A08(this.A01, true, null);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map mapA06 = A06();
                if (TextUtils.isEmpty(AbstractC6033SZ.A00().A03())) {
                    AbstractC6033SZ.A07(this.A01);
                }
                mapA06.put(A01(296, 4, 114), AbstractC6033SZ.A00().A03());
                mapA06.put(A01(587, 10, 2), AbstractC6139UJ.A06(new C6109To(this.A01), this.A01, false));
                if (C6171Up.A21(this.A01)) {
                    mapA06.put(A01(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 10, 53), C5700N8.A01(this.A01).A0K());
                }
                Iterator it = mapA06.entrySet().iterator();
                while (it.hasNext()) {
                    if (!interfaceC6133UD.A3A((String) ((Map.Entry) it.next()).getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(mapA06).toString().getBytes());
                deflaterOutputStream.close();
                String strReplaceAll = byteArrayOutputStream.toString().replaceAll(A01(0, 1, 85), A01(0, 0, 46));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return strReplaceAll;
            } catch (IOException e) {
                throw new RuntimeException(A01(257, 26, 42), e);
            }
        } catch (Throwable th) {
            if (A05[4].length() != 3) {
                throw new RuntimeException();
            }
            A05[1] = "YYekAclIzhra9Pv39zprUDIkOoogCrwo";
            if (deflaterOutputStream != null) {
                try {
                    deflaterOutputStream.close();
                    if (base64OutputStream != null) {
                        base64OutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                } catch (IOException unused2) {
                    throw th;
                }
            } else {
                if (base64OutputStream != null) {
                    base64OutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            }
            throw th;
        }
    }

    public final /* synthetic */ Map A06() {
        return AbstractC6132UC.A00(this);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0483 A[EDGE_INSN: B:104:0x0483->B:84:0x0483 BREAK  A[LOOP:0: B:62:0x03cd->B:69:0x040a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0483 A[EDGE_INSN: B:105:0x0483->B:84:0x0483 BREAK  A[LOOP:0: B:62:0x03cd->B:69:0x040a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x02de  */
    /* JADX WARN: Code duplicated, block: B:50:0x030d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0372  */
    /* JADX WARN: Code duplicated, block: B:60:0x037f  */
    /* JADX WARN: Code duplicated, block: B:64:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x040d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0410  */
    /* JADX WARN: Code duplicated, block: B:75:0x041f  */
    /* JADX WARN: Code duplicated, block: B:88:0x04af  */
    /* JADX WARN: Code duplicated, block: B:91:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:93:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:94:0x04d8  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC6135UF
    public final Map<String, String> A7y(InterfaceC6123U3 interfaceC6123U3) {
        String strA01;
        String strA02;
        String strA03;
        String strA04;
        C6067T8 c6067t8;
        String[] strArr;
        StringBuilder sb;
        EnumC5627Lw[] enumC5627LwArr;
        int i;
        int length;
        String[] strArr2;
        PackageInfo packageInfoA00;
        Map<String, String> mapA02;
        InterfaceC6084TP interfaceC6084TPA07;
        String[] strArr3;
        String strA87;
        String strA79 = interfaceC6123U3 != null ? interfaceC6123U3.A79() : null;
        String packageName = strA79 != null ? strA79 : this.A01.getPackageName();
        C6131UB.A08(this.A01, ProcessUtils.isRemoteRenderingProcess() ? true : C6171Up.A0n(this.A01), strA79);
        C6108Tn.A0B(this.A01);
        C6108Tn.A08(this.A01);
        HashMap map = new HashMap();
        C6128U8.A03(this.A01, map, strA79);
        map.put(A01(332, 6, 13), Locale.getDefault().toString());
        float f = AbstractC6334XX.A02;
        int i2 = this.A01.getResources().getDisplayMetrics().widthPixels;
        int i3 = this.A01.getResources().getDisplayMetrics().heightPixels;
        map.put(A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 7, 54), String.valueOf(f));
        map.put(A01(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 12, 100), String.valueOf((int) (i2 / f)));
        map.put(A01(514, 13, 93), String.valueOf((int) (i3 / f)));
        map.put(A01(57, 14, 114), AbstractC6033SZ.A03());
        map.put(A01(314, 9, 51), AbstractC6033SZ.A00().A02().name());
        map.put(A01(300, 14, 63), String.valueOf(AbstractC6033SZ.A00().A01()));
        C6109To c6109To = new C6109To(this.A01, strA79);
        map.put(A01(108, 6, 101), AbstractC6139UJ.A03(this.A01, c6109To));
        map.put(A01(129, 7, 30), c6109To.A08());
        map.put(A01(338, 4, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), c6109To.A09());
        map.put(A01(385, 6, 11), String.valueOf(C6131UB.A00(this.A01).A00));
        map.put(A01(323, 9, 96), c6109To.A0B());
        map.put(A01(539, 14, 83), EnumC6316XF.A01());
        map.put(A01(359, 12, 105), String.valueOf(AbstractC6362Xz.A00(this.A01).A00));
        map.put(A01(570, 12, 101), C6364Y1.A03(this.A01.A09().A01()));
        C6131UB.A06(this.A01, packageName, map);
        String strA05 = AbstractC6331XU.A03(this.A01, packageName);
        if (strA05 != null) {
            map.put(A01(48, 5, 90), strA05);
        }
        String strA06 = A01(582, 5, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
        if (interfaceC6123U3 != null && interfaceC6123U3.AAk() != null) {
            Boolean boolAAk = interfaceC6123U3.AAk();
            String[] strArr4 = A05;
            if (strArr4[7].charAt(0) != strArr4[6].charAt(0)) {
                String[] strArr5 = A05;
                strArr5[5] = "32RBgLNf778xvD9weLhwI46Snl5hrv";
                strArr5[2] = "IyuqHiwE4txdUinr9J2yO2mEn55tsE";
                map.put(strA06, String.valueOf(boolAAk));
            }
            throw new RuntimeException();
        }
        boolean zA05 = C6335XY.A05(this.A01);
        String[] strArr6 = A05;
        if (strArr6[3].length() == strArr6[0].length()) {
            throw new RuntimeException();
        }
        A05[4] = "M1q";
        map.put(strA06, String.valueOf(zA05));
        String strA8V = (interfaceC6123U3 == null || interfaceC6123U3.A8W() == null) ? this.A01.A05().A8V() : interfaceC6123U3.A8W();
        if (strA8V != null) {
            String[] strArr7 = A05;
            if (strArr7[7].charAt(0) != strArr7[6].charAt(0)) {
                String[] strArr8 = A05;
                strArr8[5] = "lzJ4Ecl31LKhf9GNtdySIIM2KCn5d6";
                strArr8[2] = "MfUCKgpZ3l00IXdOSEBXHLe94uIrQG";
                map.put(A01(342, 17, 41), strA8V);
            } else {
                map.put(A01(342, 17, 41), strA8V);
            }
        }
        map.put(A01(2, 21, 43), String.valueOf(c6109To.A0C()));
        if (c6109To.A03() != -1) {
            map.put(A01(29, 19, 59), String.valueOf(c6109To.A03()));
        }
        map.put(A01(597, 9, 48), C6124U4.A05(this.A01, packageName));
        map.put(A01(23, 6, 102), AbstractC6340Xd.A01(C6108Tn.A02()));
        if (AbstractC6170Uo.A05(this.A01) && (strA87 = this.A01.A05().A87()) != null) {
            map.put(A01(53, 4, 103), strA87);
        }
        String strA8c = this.A01.A05().A8c();
        if (!TextUtils.isEmpty(strA8c)) {
            map.put(A01(371, 14, 32), strA8c);
        }
        C6081TM c6081tmA7k = null;
        if (interfaceC6123U3 == null) {
            if (c6081tmA7k == null) {
                interfaceC6084TPA07 = this.A01.A07();
                strArr3 = A05;
                if (strArr3[3].length() != strArr3[0].length()) {
                    String[] strArr9 = A05;
                    strArr9[7] = "UvZ2k7gEJDaOAPFQ7LljUQwSSHt3Qj5l";
                    strArr9[6] = "lsSUyvw0Epval1a8yRy7YtOStWYNlmUT";
                    c6081tmA7k = interfaceC6084TPA07.A7k();
                }
            }
            strA01 = A01(FacebookRequestErrorClassification.EC_INVALID_TOKEN, 29, 21);
            strA02 = A01(159, 31, 5);
            strA03 = A01(136, 23, 93);
            if (c6081tmA7k != null) {
                map.put(strA03, c6081tmA7k.A08());
                map.put(strA02, String.valueOf(c6081tmA7k.A05()));
                map.put(strA01, String.valueOf(c6081tmA7k.A06()));
            } else {
                String strA07 = A01(606, 4, 23);
                map.put(strA03, strA07);
                map.put(strA02, strA07);
                map.put(strA01, strA07);
            }
            map.put(A01(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 10, 53), C5700N8.A01(this.A01).A0K());
            strA04 = this.A00.A03(this.A01);
            if (strA04 != null) {
                map.put(A01(71, 19, 120), strA04);
            }
            c6067t8 = this.A01;
            strArr = A05;
            if (strArr[3].length() != strArr[0].length()) {
                A05[1] = "xfpBh2d17TpisnhOgc4FARMiGoOeOma4";
                if (AbstractC6174Us.A0D(c6067t8)) {
                    map.put(A01(90, 18, 3), C6364Y1.A07(C6364Y1.A00()));
                }
            } else {
                A05[4] = "SgB";
                if (AbstractC6174Us.A0D(c6067t8)) {
                    map.put(A01(90, 18, 3), C6364Y1.A07(C6364Y1.A00()));
                }
            }
            map.put(A01(283, 13, 25), String.valueOf(this.A01.A04().A9m()));
            map.put(A01(244, 13, 98), String.valueOf(C6092TX.A0H(this.A01)));
            sb = new StringBuilder();
            enumC5627LwArr = A06;
            i = 0;
            while (true) {
                length = enumC5627LwArr.length;
                strArr2 = A05;
                if (strArr2[3].length() != strArr2[0].length()) {
                    String[] strArr10 = A05;
                    strArr10[5] = "zWUmLpLkv5ZkeLP8Nx8FR5P0NkpI1z";
                    strArr10[2] = "rR6LCigUl1U30r1W401qlH7SB9R1I9";
                    if (i >= length) {
                        break;
                        break;
                    }
                    sb.append(enumC5627LwArr[i].A03() + 4000);
                    if (i != enumC5627LwArr.length - 1) {
                        sb.append(A01(1, 1, 79));
                    }
                    i++;
                } else {
                    if (i >= length) {
                        break;
                        break;
                    }
                    sb.append(enumC5627LwArr[i].A03() + 4000);
                    if (i != enumC5627LwArr.length - 1) {
                        sb.append(A01(1, 1, 79));
                    }
                    i++;
                }
            }
            map.put(A01(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 18, 82), sb.toString());
            packageInfoA00 = A00(this.A01);
            map.put(A01(476, 20, 69), String.valueOf(packageInfoA00 != null));
            if (packageInfoA00 != null) {
                map.put(A01(496, 18, 2), String.valueOf(packageInfoA00.versionCode));
            }
            A03(interfaceC6123U3, map);
            if (A05[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr11 = A05;
            strArr11[3] = "GvfG5gBfjM6hmXKTNV25n";
            strArr11[0] = "CjMBMD2IWFco7mVmEr";
            if (C6171Up.A0y(this.A01)) {
                map.put(A01(553, 17, 45), AbstractC6340Xd.A01(mapA02));
            }
            return map;
        }
        C6067T8 c6067t9 = this.A01;
        String[] strArr12 = A05;
        if (strArr12[7].charAt(0) != strArr12[6].charAt(0)) {
            String[] strArr13 = A05;
            strArr13[3] = "QL1vZoGO1wQ14zpGXE2Sg";
            strArr13[0] = "5V9s84iDx7Ocfd5gsL";
            c6081tmA7k = interfaceC6123U3.A7m(c6067t9);
            if (c6081tmA7k == null) {
                interfaceC6084TPA07 = this.A01.A07();
                strArr3 = A05;
                if (strArr3[3].length() != strArr3[0].length()) {
                    String[] strArr14 = A05;
                    strArr14[7] = "UvZ2k7gEJDaOAPFQ7LljUQwSSHt3Qj5l";
                    strArr14[6] = "lsSUyvw0Epval1a8yRy7YtOStWYNlmUT";
                    c6081tmA7k = interfaceC6084TPA07.A7k();
                }
            }
            strA01 = A01(FacebookRequestErrorClassification.EC_INVALID_TOKEN, 29, 21);
            strA02 = A01(159, 31, 5);
            strA03 = A01(136, 23, 93);
            if (c6081tmA7k != null) {
                map.put(strA03, c6081tmA7k.A08());
                map.put(strA02, String.valueOf(c6081tmA7k.A05()));
                map.put(strA01, String.valueOf(c6081tmA7k.A06()));
            } else {
                String strA08 = A01(606, 4, 23);
                map.put(strA03, strA08);
                map.put(strA02, strA08);
                map.put(strA01, strA08);
            }
            map.put(A01(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 10, 53), C5700N8.A01(this.A01).A0K());
            strA04 = this.A00.A03(this.A01);
            if (strA04 != null && !TextUtils.isEmpty(strA04)) {
                map.put(A01(71, 19, 120), strA04);
            }
            c6067t8 = this.A01;
            strArr = A05;
            if (strArr[3].length() != strArr[0].length()) {
                A05[1] = "xfpBh2d17TpisnhOgc4FARMiGoOeOma4";
                if (AbstractC6174Us.A0D(c6067t8)) {
                    map.put(A01(90, 18, 3), C6364Y1.A07(C6364Y1.A00()));
                }
            } else {
                A05[4] = "SgB";
                if (AbstractC6174Us.A0D(c6067t8)) {
                    map.put(A01(90, 18, 3), C6364Y1.A07(C6364Y1.A00()));
                }
            }
            map.put(A01(283, 13, 25), String.valueOf(this.A01.A04().A9m()));
            map.put(A01(244, 13, 98), String.valueOf(C6092TX.A0H(this.A01)));
            sb = new StringBuilder();
            enumC5627LwArr = A06;
            i = 0;
            while (true) {
                length = enumC5627LwArr.length;
                strArr2 = A05;
                if (strArr2[3].length() != strArr2[0].length()) {
                    String[] strArr15 = A05;
                    strArr15[5] = "zWUmLpLkv5ZkeLP8Nx8FR5P0NkpI1z";
                    strArr15[2] = "rR6LCigUl1U30r1W401qlH7SB9R1I9";
                    if (i >= length) {
                        break;
                    }
                    sb.append(enumC5627LwArr[i].A03() + 4000);
                    if (i != enumC5627LwArr.length - 1) {
                        sb.append(A01(1, 1, 79));
                    }
                    i++;
                } else {
                    if (i >= length) {
                        break;
                    }
                    sb.append(enumC5627LwArr[i].A03() + 4000);
                    if (i != enumC5627LwArr.length - 1) {
                        sb.append(A01(1, 1, 79));
                    }
                    i++;
                }
            }
            map.put(A01(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 18, 82), sb.toString());
            packageInfoA00 = A00(this.A01);
            map.put(A01(476, 20, 69), String.valueOf(packageInfoA00 != null));
            if (packageInfoA00 != null) {
                map.put(A01(496, 18, 2), String.valueOf(packageInfoA00.versionCode));
            }
            A03(interfaceC6123U3, map);
            if (A05[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr16 = A05;
            strArr16[3] = "GvfG5gBfjM6hmXKTNV25n";
            strArr16[0] = "CjMBMD2IWFco7mVmEr";
            if (C6171Up.A0y(this.A01) && (mapA02 = AbstractC6126U6.A02(this.A01.A02())) != null) {
                map.put(A01(553, 17, 45), AbstractC6340Xd.A01(mapA02));
            }
            return map;
        }
        throw new RuntimeException();
    }

    static {
        A02();
        A03 = false;
        A06 = new EnumC5627Lw[]{EnumC5627Lw.A1D, EnumC5627Lw.A0r, EnumC5627Lw.A1E, EnumC5627Lw.A1O, EnumC5627Lw.A18, EnumC5627Lw.A1A, EnumC5627Lw.A2h, EnumC5627Lw.A2i, EnumC5627Lw.A2j};
    }

    public C6444ZJ(C6067T8 c6067t8, boolean z, C6046Sn c6046Sn) {
        this.A01 = c6067t8;
        this.A00 = c6046Sn;
        C6131UB.A08(c6067t8, z, null);
    }

    public static synchronized PackageInfo A00(C6067T8 c6067t8) {
        if (!A03) {
            A02 = AbstractC6345Xi.A00(c6067t8);
            A03 = true;
        }
        return A02;
    }

    private void A03(InterfaceC6123U3 interfaceC6123U3, Map<String, String> map) {
        String strA01;
        if (interfaceC6123U3 != null && interfaceC6123U3.AAg()) {
            map.put(A01(436, 18, 22), Boolean.TRUE.toString());
            if (interfaceC6123U3.A7N() != null) {
                map.put(A01(391, 21, 37), interfaceC6123U3.A7N());
            }
        }
        if (AbstractC6174Us.A09(this.A01)) {
            C6067T8 c6067t8 = this.A01;
            if (A05[1].charAt(25) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "qhmjNI7uMFHuEfCbgrNi3HvbFW0uqLeT";
            strArr[6] = "rAF5k5sPuv4hj6bjGKLvAsDqqwbdtY33";
            String strA03 = AbstractC6125U5.A03(c6067t8.A02());
            if (strA03 != null) {
                String remoteRenderingSdkVersion = A01(454, 22, 0);
                map.put(remoteRenderingSdkVersion, strA03);
            }
            String strA02 = AbstractC6125U5.A02(this.A01.A02());
            if (strA03 != null) {
                String remoteRenderingSdkVersion2 = A01(427, 9, 105);
                map.put(remoteRenderingSdkVersion2, strA02);
            }
            if (AbstractC6174Us.A0D(this.A01)) {
                String strA04 = AbstractC6125U5.A01(this.A01.A02());
                String[] strArr2 = A05;
                String remoteRenderingExtras = strArr2[7];
                if (remoteRenderingExtras.charAt(0) == strArr2[6].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A05;
                strArr3[7] = "Mj9TvIbv6bgZbZ2pKznECnYI7EK5ROuc";
                strArr3[6] = "5qjAp4YjV3Q6sbLE0XRdgT3gO1lX1tGk";
                if (strA03 != null) {
                    String remoteRenderingSdkVersion3 = A01(412, 15, 113);
                    map.put(remoteRenderingSdkVersion3, strA04);
                }
            }
        }
        if (C6171Up.A0x(this.A01) && (strA01 = AbstractC6126U6.A01(this.A01.A02())) != null) {
            String cache = A01(114, 5, 16);
            map.put(cache, strA01);
        }
    }

    public final String A04() {
        return A05(C6134UE.A00());
    }
}
