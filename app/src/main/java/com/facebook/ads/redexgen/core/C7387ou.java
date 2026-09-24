package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ou */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7387ou implements InterfaceC47787t {
    public static byte[] A05;
    public InterfaceC5162EP A00;
    public final int A01;
    public final long A02;
    public final Context A03;
    public final InterfaceC4897A6 A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-77, -44, -43, -48, -28, -37, -29, -63, -44, -35, -45, -44, -31, -44, -31, -30, -75, -48, -46, -29, -34, -31, -24, -95, -50, -50, -53, -50, 124, -59, -54, -49, -48, -67, -54, -48, -59, -67, -48, -59, -54, -61, 124, -94, -94, -55, -52, -63, -61, 124, -63, -44, -48, -63, -54, -49, -59, -53, -54, -70, -25, -25, -28, -25, -107, -34, -29, -24, -23, -42, -29, -23, -34, -42, -23, -34, -29, -36, -107, -69, -63, -74, -72, -107, -38, -19, -23, -38, -29, -24, -34, -28, -29, -12, 33, 33, Ascii.f22498RS, 33, -49, Ascii.CAN, Ascii.f22494GS, 34, 35, Ascii.DLE, Ascii.f22494GS, 35, Ascii.CAN, Ascii.DLE, 35, Ascii.CAN, Ascii.f22494GS, Ascii.SYN, -49, -2, Ascii.f22502US, 36, 34, -49, Ascii.DC4, 39, 35, Ascii.DC4, Ascii.f22494GS, 34, Ascii.CAN, Ascii.f22498RS, Ascii.f22494GS, 6, 51, 51, 48, 51, -31, 42, 47, 52, 53, 34, 47, 53, 42, 34, 53, 42, 47, 40, -31, Ascii.ETB, 17, -6, -31, 38, 57, 53, 38, 47, 52, 42, 48, 47, Ascii.DLE, 51, 37, 40, 41, 40, -28, 10, 42, 49, 52, 41, 43, 5, 57, 40, 45, 51, Ascii.SYN, 41, 50, 40, 41, 54, 41, 54, -14, Ascii.f22500SO, 49, 35, 38, 39, 38, -30, Ascii.f22500SO, 43, 36, 40, 46, 35, 37, 3, 55, 38, 43, 49, Ascii.DC4, 39, 48, 38, 39, 52, 39, 52, -16, 6, 41, Ascii.ESC, Ascii.f22498RS, Ascii.f22502US, Ascii.f22498RS, -38, 6, 35, Ascii.f22493FS, 41, 42, 47, 45, -5, 47, Ascii.f22498RS, 35, 41, Ascii.f22492FF, Ascii.f22502US, 40, Ascii.f22498RS, Ascii.f22502US, 44, Ascii.f22502US, 44, -24, 4, 39, Ascii.f22491EM, Ascii.f22493FS, Ascii.f22494GS, Ascii.f22493FS, -40, 4, 33, Ascii.SUB, 46, 40, 48, Ascii.f22500SO, 33, Ascii.f22493FS, Ascii.f22494GS, 39, 10, Ascii.f22494GS, 38, Ascii.f22493FS, Ascii.f22494GS, 42, Ascii.f22494GS, 42, -26, -7, 5, 3, -60, -4, -9, -7, -5, -8, 5, 5, 1, -60, -9, -6, 9, -60, -9, 4, -6, 8, 5, -1, -6, Ascii.f22500SO, -60, 3, -5, -6, -1, -9, -55, -60, -5, Ascii.f22500SO, 5, 6, 2, -9, Ascii.f22499SI, -5, 8, -60, -5, Ascii.f22500SO, 10, -60, -4, -4, 3, 6, -5, -3, -60, -36, -4, 3, 6, -5, -3, -41, Ascii.f22503VT, -6, -1, 5, -24, -5, 4, -6, -5, 8, -5, 8, Ascii.ESC, 39, 37, -26, Ascii.f22498RS, Ascii.f22491EM, Ascii.ESC, Ascii.f22494GS, Ascii.SUB, 39, 39, 35, -26, Ascii.f22491EM, Ascii.f22493FS, 43, -26, Ascii.f22491EM, 38, Ascii.f22493FS, 42, 39, 33, Ascii.f22493FS, 48, -26, 37, Ascii.f22494GS, Ascii.f22493FS, 33, Ascii.f22491EM, -21, -26, Ascii.f22494GS, 48, 39, 40, 36, Ascii.f22491EM, 49, Ascii.f22494GS, 42, -26, Ascii.f22494GS, 48, 44, -26, Ascii.f22498RS, 36, Ascii.f22491EM, Ascii.ESC, -26, 4, 33, Ascii.SUB, Ascii.f22498RS, 36, Ascii.f22491EM, Ascii.ESC, -7, 45, Ascii.f22493FS, 33, 39, 10, Ascii.f22494GS, 38, Ascii.f22493FS, Ascii.f22494GS, 42, Ascii.f22494GS, 42, -56, -44, -46, -109, -53, -58, -56, -54, -57, -44, -44, -48, -109, -58, -55, -40, -109, -58, -45, -55, -41, -44, -50, -55, -35, -109, -46, -54, -55, -50, -58, -104, -109, -54, -35, -44, -43, -47, -58, -34, -54, -41, -109, -54, -35, -39, -109, -44, -43, -38, -40, -109, -79, -50, -57, -44, -43, -38, -40, -90, -38, -55, -50, -44, -73, -54, -45, -55, -54, -41, -54, -41, 35, 47, 45, -18, 38, 33, 35, 37, 34, 47, 47, 43, -18, 33, 36, 51, -18, 33, 46, 36, 50, 47, 41, 36, 56, -18, 45, 37, 36, 41, 33, -13, -18, 37, 56, 47, 48, 44, 33, 57, 37, 50, -18, 37, 56, 52, -18, 54, 48, -7, -18, Ascii.f22492FF, 41, 34, 54, 48, 56, Ascii.SYN, 41, 36, 37, 47, Ascii.DC2, 37, 46, 36, 37, 50, 37, 50};
    }

    public C7387ou(Context context) {
        this(context, 0);
    }

    public C7387ou(Context context, int i) {
        this(context, null, i, 5000L);
    }

    @Deprecated
    public C7387ou(Context context, InterfaceC4897A6 interfaceC4897A6, int i, long j) {
        this.A00 = new C7388ov(this);
        this.A03 = context;
        this.A01 = i;
        this.A02 = j;
        this.A04 = interfaceC4897A6;
    }

    private final void A02(Context context, InterfaceC4897A6 interfaceC4897A6, long j, Handler handler, InterfaceC5286GQ interfaceC5286GQ, int extensionRendererIndex, ArrayList<InterfaceC7381oo> arrayList) throws Exception {
        arrayList.add(new C435610(context, C7066jQ.A0T, new MediaCodecRendererMetaParameters(null, false), InterfaceC4982BT.A00, j, interfaceC4897A6, false, false, handler, interfaceC5286GQ, 50, 5, 0, 0, 0));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(487, 70, 110));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (InterfaceC7381oo) cls.getConstructor(clazz, clazz2, Handler.class, InterfaceC5286GQ.class, clazz3, clazz3).newInstance(true, Long.valueOf(j), handler, interfaceC5286GQ, 50, 5));
                    Log.i(A00(0, 23, 29), A00(243, 27, 102));
                } catch (Exception e) {
                    e = e;
                    throw new RuntimeException(A00(127, 33, 111), e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    private final void A03(Context context, InterfaceC4897A6 interfaceC4897A6, InterfaceC45213k[] interfaceC45213kArr, Handler handler, InterfaceC48358p interfaceC48358p, int extensionRendererIndex, ArrayList<InterfaceC7381oo> arrayList) throws Exception {
        int extensionRendererIndex2;
        int extensionRendererIndex3;
        String strA00 = A00(0, 23, 29);
        arrayList.add(new C435812(context, C7066jQ.A0T, new MediaCodecRendererMetaParameters(null, false), InterfaceC4982BT.A00, interfaceC4897A6, false, false, false, handler, interfaceC48358p, C48128R.A02(context), interfaceC45213kArr));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            extensionRendererIndex2 = size + 1;
            try {
                arrayList.add(size, (InterfaceC7381oo) Class.forName(A00(TTAdConstant.VIDEO_COVER_URL_CODE, 72, 19)).getConstructor(Handler.class, InterfaceC48358p.class, InterfaceC45213k[].class).newInstance(handler, interfaceC48358p, interfaceC45213kArr));
                Log.i(strA00, A00(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 28, 104));
            } catch (ClassNotFoundException unused) {
                size = extensionRendererIndex2;
                extensionRendererIndex2 = size;
            } catch (Exception e) {
                e = e;
                throw new RuntimeException(A00(93, 34, 93), e);
            }
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            Constructor<?> constructor = Class.forName(A00(343, 72, 102)).getConstructor(Handler.class, InterfaceC48358p.class, InterfaceC45213k[].class);
            extensionRendererIndex3 = extensionRendererIndex2 + 1;
            try {
                arrayList.add(extensionRendererIndex2, (InterfaceC7381oo) constructor.newInstance(handler, interfaceC48358p, interfaceC45213kArr));
                Log.i(strA00, A00(187, 28, 112));
            } catch (ClassNotFoundException unused3) {
                extensionRendererIndex2 = extensionRendererIndex3;
                extensionRendererIndex3 = extensionRendererIndex2;
            } catch (Exception e3) {
                e = e3;
                throw new RuntimeException(A00(59, 34, 35), e);
            }
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e4) {
            e = e4;
        }
        try {
            try {
                Constructor<?> constructor2 = Class.forName(A00(270, 73, 68)).getConstructor(Handler.class, InterfaceC48358p.class, InterfaceC45213k[].class);
                try {
                    arrayList.add(extensionRendererIndex3, (InterfaceC7381oo) constructor2.newInstance(handler, interfaceC48358p, interfaceC45213kArr));
                    Log.i(strA00, A00(160, 27, 114));
                } catch (Exception e5) {
                    e = e5;
                    throw new RuntimeException(A00(23, 36, 10), e);
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (ClassNotFoundException unused5) {
        }
    }

    private final void A04(Context context, InterfaceC4994Bf interfaceC4994Bf, Looper looper, int i, ArrayList<InterfaceC7381oo> arrayList) {
        arrayList.add(new C43971f(interfaceC4994Bf, looper));
    }

    private final void A05(Context context, InterfaceC5165ES interfaceC5165ES, Looper looper, int i, ArrayList<InterfaceC7381oo> arrayList) {
        arrayList.add(new C43931b(interfaceC5165ES, looper, this.A00));
    }

    private final InterfaceC45213k[] A06() {
        return new InterfaceC45213k[0];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC47787t
    public final InterfaceC7381oo[] A5Y(Handler handler, InterfaceC5286GQ interfaceC5286GQ, InterfaceC48358p interfaceC48358p, InterfaceC5165ES interfaceC5165ES, InterfaceC4994Bf interfaceC4994Bf, InterfaceC4897A6 interfaceC4897A6) throws Exception {
        InterfaceC4897A6 interfaceC4897A7 = interfaceC4897A6;
        if (interfaceC4897A7 == null) {
            interfaceC4897A7 = this.A04;
        }
        ArrayList<InterfaceC7381oo> arrayList = new ArrayList<>();
        A02(this.A03, interfaceC4897A7, this.A02, handler, interfaceC5286GQ, this.A01, arrayList);
        A03(this.A03, interfaceC4897A7, A06(), handler, interfaceC48358p, this.A01, arrayList);
        A05(this.A03, interfaceC5165ES, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, interfaceC4994Bf, handler.getLooper(), this.A01, arrayList);
        return (InterfaceC7381oo[]) arrayList.toArray(new InterfaceC7381oo[arrayList.size()]);
    }
}
