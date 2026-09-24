package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6056Sx {
    public static InterfaceC5596LR A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"9sbbD15", "Lu4K49mlxrSXSmjNh7fbv8QTyeXNNeG", "dxmg93Ac1Ci0DpKcQcYnCSB5QhHSt8Hl", "k6rgF4fsXLHTj2vl", "7FEQyJVT", "NWpMXisSbHx8hQWP", "4pbn9SiXGJE3zFdxdKEeQNSdsbhvbmq3", "cv"};
    public static final String A0E;
    public static final Map<String, C5602LX> A0F;
    public static final Map<String, C6058Sz> A0G;
    public long A00;
    public C6200VI A01;
    public final C6057Sy A03;
    public final C6067T8 A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ExecutorC6379YG.A02().submit(it.next()));
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        try {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Boolean bool = (Boolean) ((Future) it2.next()).get();
                atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e(A0E, A08(85, 42, 126), e);
            atomicBoolean.set(false);
        }
        return atomicBoolean;
    }

    public static void A0F() {
        A0C = new byte[]{121, 42, 122, 120, 124, 44, 42, 121, 95, Ascii.f22503VT, 92, 93, Ascii.f22499SI, 86, 90, 10, 34, 114, 47, 35, 34, 36, 118, Ascii.f22503VT, 41, 43, 32, 45, 104, 59, 60, 41, 58, 60, 45, 44, 102, 100, 70, 68, 79, 78, 73, SignedBytes.MAX_POWER_OF_TWO, 7, 68, 72, 74, 87, 75, 66, 83, 66, 63, Ascii.f22494GS, Ascii.f22502US, Ascii.DC4, Ascii.NAK, Ascii.DC2, Ascii.ESC, 92, Ascii.SUB, Ascii.f22494GS, Ascii.NAK, Ascii.DLE, Ascii.f22491EM, Ascii.CAN, 69, 103, 101, 110, 111, 104, 97, 38, 117, 114, 103, 116, 114, 99, 98, 40, 40, 40, 103, 90, 65, 71, 82, 86, 75, 77, 76, 2, 85, 74, 75, 78, 71, 2, 71, 90, 71, 65, 87, 86, 75, 76, 69, 2, 65, 67, 65, 74, 71, 2, 70, 77, 85, 76, 78, 77, 67, 70, 81, Ascii.f22492FF, 66, SignedBytes.MAX_POWER_OF_TWO, 66, 73, 68, 98, 78, 76, 81, 77, 68, 85, 72, 78, 79, 105, 78, 78, 74, 111, 109, 111, 100, 105, 74, 109, 101, 96, 121, 126, 105, 68, 99, 99, 103, 104, 117, 104, 110, 120, 121, 104, 101, 102, 104, 109, 119, 116, 122, 127, 68, 111, 114, 118, 126, 68, 118, 104, 89, 66, 69, 93};
    }

    static {
        A0F();
        A0E = C6056Sx.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C6056Sx(C6067T8 c6067t8) {
        this.A04 = c6067t8;
        this.A03 = C6057Sy.A06(c6067t8.A02());
        this.A08 = C6171Up.A2q(c6067t8);
        this.A09 = C6171Up.A2z(c6067t8, C6829fX.A03());
    }

    public static synchronized InterfaceC5596LR A03(C6898ge c6898ge) {
        if (A0A == null) {
            A0A = AbstractC5597LS.A00(c6898ge, new C5603LY().A00(C6171Up.A06(c6898ge)).A02(c6898ge.A05().AAO()).A01(-1).A03(C6171Up.A0p(c6898ge)).A04(C6171Up.A2y(c6898ge)).A05(), A05(c6898ge));
        }
        return A0A;
    }

    public static C5602LX A04(C6067T8 c6067t8, String str) {
        C5602LX c5602lx = A0F.get(str);
        if (C6059T0.A06(c6067t8) && c5602lx != null) {
            C5602LX storedCacheData = new C5602LX(c5602lx);
            return storedCacheData;
        }
        C5602LX storedCacheData2 = new C5602LX(str);
        return storedCacheData2;
    }

    public static C6906gm A05(C6898ge c6898ge) {
        return new C6906gm(c6898ge);
    }

    public static synchronized List<String> A09(C6067T8 c6067t8) {
        if (A0B == null) {
            A0B = new ArrayList();
            A0J(A0B, c6067t8);
        }
        return A0B;
    }

    public static /* synthetic */ Map A0A() {
        Map<String, C6058Sz> map = A0G;
        if (A0D[7].length() == 16) {
            throw new RuntimeException();
        }
        A0D[6] = "WjQPXn0MHZbTNsTxKlY7B5aUAaJR9kiv";
        return map;
    }

    public static void A0H(C6067T8 c6067t8, String str) {
        if (C6059T0.A06(c6067t8) && !TextUtils.isEmpty(str)) {
            C6058Sz c6058Sz = A0G.get(str);
            if (A0D[7].length() == 16) {
                throw new RuntimeException();
            }
            A0D[6] = "a10tGuQmEwUEP0sxRmqxEmZkNnUikCvX";
            if (c6058Sz != null) {
                c6058Sz.A00 = A08(185, 4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                C6898ge c6898geA02 = c6067t8.A02();
                C6833fb c6833fbA06 = C6833fb.A06(c6898geA02);
                String strA09 = C6833fb.A09(c6898geA02, AbstractC6312XB.A00(str));
                if (strA09 == null) {
                    strA09 = str;
                }
                C6059T0.A04(c6067t8, c6058Sz, c6833fbA06.A0J(strA09));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC6199VH enumC6199VH) {
        if (this.A01 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A08(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 12, 71), C6364Y1.A05(this.A00));
        this.A01.A04(enumC6199VH, map);
    }

    public static void A0J(List<String> cacheDirs, C6067T8 c6067t8) {
        A0K(cacheDirs, C7152ks.A01(c6067t8));
        A0K(cacheDirs, C6057Sy.A07(c6067t8));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String path2 = A08(0, 0, 103);
        if (path != path2) {
            Locale locale = Locale.getDefault();
            String path3 = A0D[4];
            if (path3.length() == 2) {
                throw new RuntimeException();
            }
            A0D[4] = "BAOa9xP";
            String path4 = path.toLowerCase(locale);
            list.add(path4);
        }
    }

    public final float A0M(String str) {
        return this.A03.A0E(str);
    }

    public final Bitmap A0N(String str) {
        return this.A07.get(str);
    }

    public final Bitmap A0O(String str, int i, int i2) {
        if (this.A08) {
            C5602LX c5602lxA04 = A04(this.A04, str);
            c5602lxA04.A03 = A08(185, 4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            c5602lxA04.A01 = i2;
            c5602lxA04.A00 = i;
            return A03(this.A04.A02()).AIe(c5602lxA04, true).A00();
        }
        return this.A03.A0G(this.A04, str, i, i2, A08(169, 4, 85));
    }

    public final File A0P(String str) {
        C5602LX c5602lxA04 = A04(this.A04, str);
        c5602lxA04.A03 = A08(185, 4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        return A03(this.A04.A02()).AIf(c5602lxA04);
    }

    public final File A0Q(String str) {
        if (this.A08) {
            return A0P(str);
        }
        return this.A03.A0H(str);
    }

    public final String A0R(String str) {
        if (this.A08) {
            return A0S(str);
        }
        return this.A03.A0I(str);
    }

    public final String A0S(String str) {
        C5602LX c5602lxA04 = A04(this.A04, str);
        c5602lxA04.A03 = A08(185, 4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        String strAIh = A03(this.A04.A02()).AIh(c5602lxA04);
        return strAIh != null ? strAIh : str;
    }

    public final String A0T(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0S(str);
    }

    public final void A0U() {
        AbstractC6240Vy.A05(A08(127, 19, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), A08(37, 16, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), A08(16, 7, 75));
    }

    public final void A0V() {
        AbstractC6240Vy.A05(A08(146, 16, 80), A08(53, 14, 32), A08(8, 8, 50));
    }

    public final void A0W() {
        this.A07.clear();
    }

    public final void A0X(InterfaceC6048Sp interfaceC6048Sp, C6049Sq c6049Sq) {
        AbstractC6240Vy.A05(A08(162, 7, 81), A08(67, 18, 90), A08(0, 8, 20));
        this.A00 = System.currentTimeMillis();
        C6059T0.A02(this.A04, c6049Sq, C6059T0.A07, A08(23, 14, 20), -1L);
        ExecutorC6379YG.A03().execute(new C6907gn(this, new ArrayList(this.A05), c6049Sq, interfaceC6048Sp, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0Y(C6052St c6052St) {
        this.A05.add(new CallableC6053Su(this, c6052St));
    }

    public final void A0Z(C6052St c6052St) {
        c6052St.A05 = true;
        this.A06.add(new CallableC6053Su(this, c6052St));
    }

    public final void A0a(C6052St c6052St) {
        c6052St.A05 = true;
        if (this.A09) {
            this.A06.add(new CallableC6051Ss(this, c6052St));
        } else {
            this.A06.add(new CallableC6053Su(this, c6052St));
        }
    }

    public final void A0b(C6052St c6052St) {
        if (this.A09) {
            this.A05.add(new CallableC6051Ss(this, c6052St));
        } else {
            this.A05.add(new CallableC6053Su(this, c6052St));
        }
    }

    public final void A0c(C6054Sv c6054Sv) {
        CallableC6055Sw callableC6055Sw = new CallableC6055Sw(this, c6054Sv);
        if (!c6054Sv.A03) {
            this.A05.add(callableC6055Sw);
        } else {
            this.A06.add(callableC6055Sw);
        }
    }

    public final void A0d(C6054Sv c6054Sv) {
        c6054Sv.A03 = true;
        A0c(c6054Sv);
    }

    public final void A0e(C6200VI c6200vi) {
        this.A01 = c6200vi;
    }
}
