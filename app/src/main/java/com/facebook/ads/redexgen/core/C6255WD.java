package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.WD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6255WD {
    public static byte[] A08;
    public static String[] A09 = {"gkSyaXwR", "2VU3Nz3voiV1lmdRee4U2QJOpqB0EmXx", "l2PJ1mhNLKomP6h8XAPCJTvwOfm7DNfm", "U14uMoZpedA5MoqMp8wF", "ZGFJtzG5houIZuhA5wVIi53yZAjLLlX2", "TKuU0S0TRmpOZ7a0gUh222TH0KiJMCsX", "Ntgwe7QRVjptK5Vt0gMbvLxTukJluaCr", "4nIPbhAhAn1Dg8Q4wgXTfE5Yoh5xfpBP"};
    public static final ThreadFactoryC6377YE A0A;
    public static final Executor A0B;
    public static final AtomicReference<InterfaceC6259WH> A0C;
    public long A00;
    public long A01;
    public InterfaceC6254WC A02;
    public Map<String, String> A03;
    public final C5796Og A04;
    public final C6902gi A05;
    public final C6256WE A06;
    public final String A07;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A08 = new byte[]{113, 107, -97, 108, 106, 111, -96, 112, -32, -15, -17, -21, -19, -25, -16, -19, -23, -14, -8, 3, -10, -23, -11, -7, -23, -9, -8, 3, -19, -24, -126, -84, 89, -117, -121, 115, 89, -62, -61, -108, -70, -67, -64, -64, -108, -26, -39, -41, -39, -35, -22, -39, -40, -39, -6, -85, -47, -12, -9, -9, -85, -16, -3, -3, -6, -3, -85, -18, -6, -17, -16, -85, -26, -80, -2, -24, -85, -80, -2, -33, -35, -26, -35, -22, -31, -37, -57, -66, -51, -48, -56, -53, -60, 10, Ascii.f22503VT, -30, 5, 8, 8, -28, Ascii.f22503VT, Ascii.f22503VT, 7, -35, -33, -36, -29, -42, -47, -46};
    }

    static {
        A0B();
        A0A = new ThreadFactoryC6377YE();
        A0B = Executors.newCachedThreadPool(A0A);
        A0C = new AtomicReference<>();
    }

    public C6255WD(C6902gi c6902gi) {
        this(c6902gi, AbstractC5797Oh.A00(c6902gi.A02()));
    }

    public C6255WD(C6902gi c6902gi, C5796Og c5796Og) {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A05 = c6902gi;
        this.A06 = C6256WE.A00();
        this.A07 = AbstractC6260WI.A01(c6902gi);
        this.A04 = c5796Og;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C6044Sl A03(long j, C6252WA c6252wa) {
        return new C6044Sl(this, c6252wa, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A05 == null || !C6871gD.A0A(this.A05)) {
            return;
        }
        C6099Te c6099Te = new C6099Te(A06(8, 5, 102));
        c6099Te.A05(1);
        this.A05.A08().ABC(A06(86, 7, 32), AbstractC6098Td.A1x, c6099Te);
    }

    private void A0C(int i, String str) {
        String strA06 = A06(37, 16, 59);
        String strA07 = A06(0, 8, 1);
        String strA08 = A06(93, 10, 99);
        AbstractC6240Vy.A05(strA08, strA06, strA07);
        AbstractC6240Vy.A04(strA08, String.format(Locale.US, A06(53, 26, 82), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C6229Vm c6229Vm) {
        if (this.A02 != null) {
            this.A02.ADp(c6229Vm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C6229Vm c6229Vm) {
        ExecutorC6367Y4.A00(new C5960RO(this, c6229Vm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(C5952RG c5952rg) {
        if (this.A02 != null) {
            this.A02.AG7(c5952rg);
        } else {
            if (c5952rg.A00() == null || c5952rg.A00().A06() == null) {
                return;
            }
            C6288Wl.A00(this.A05).A0D(c5952rg.A00().A06().toString(), c5952rg.A00().A0B());
        }
    }

    private void A0M(C5952RG c5952rg) {
        InterfaceC6073TE syncModule;
        ExecutorC6367Y4.A00(new C6022SO(this, c5952rg));
        if (C6171Up.A2e(this.A05) && (syncModule = this.A05.A06()) != null) {
            syncModule.A6d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j, C6252WA c6252wa) {
        String clientChallenge;
        try {
            try {
                C6258WG c6258wgA07 = this.A06.A07(this.A05, str, j);
                C6117Tw c6117TwA00 = c6258wgA07.A00();
                if (c6117TwA00 != null) {
                    C6171Up.A0V(this.A05).A36(c6117TwA00.A0A());
                    if (C6171Up.A0x(this.A05) && c6117TwA00.A08() != null) {
                        AbstractC6126U6.A04(this.A05.A02(), c6117TwA00.A08());
                    }
                    if (C6171Up.A0y(this.A05) && c6117TwA00.A0D() != null) {
                        AbstractC6126U6.A05(this.A05.A02(), c6117TwA00.A0D());
                    }
                    this.A05.A08().ACP();
                    this.A04.A0N(c6117TwA00.A07());
                    AbstractC6251W9.A05(c6117TwA00.A05().A0B(), c6252wa);
                    C6391YS.A01(this.A05, A0B, c6117TwA00);
                    C6099Te c6099Te = new C6099Te(A06(30, 7, 0) + C6335XY.A02());
                    c6099Te.A06(1);
                    c6099Te.A0A(false);
                    this.A05.A08().ACA(A06(79, 7, 63), AbstractC6098Td.A1W, c6099Te);
                }
                switch (c6258wgA07.A01()) {
                    case A02:
                        C5952RG c5952rg = (C5952RG) c6258wgA07;
                        if (c6117TwA00 != null) {
                            if (c6117TwA00.A05().A0E()) {
                                AbstractC6251W9.A07(str, c6252wa);
                            }
                            if (this.A03 != null) {
                                clientChallenge = this.A03.get(A06(13, 17, 107));
                            } else {
                                clientChallenge = null;
                            }
                            if (!TextUtils.isEmpty(c6258wgA07.A02()) && !TextUtils.isEmpty(clientChallenge)) {
                                this.A05.A03().AIi(this.A05, clientChallenge, c6258wgA07.A02());
                            }
                        }
                        this.A05.A0F().A3X(C6364Y1.A01(this.A01), C6364Y1.A02(this.A01, this.A00));
                        A0M(c5952rg);
                        return;
                    case A03:
                        C5940R4 c5940r4 = (C5940R4) c6258wgA07;
                        String strA04 = c5940r4.A04();
                        AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c5940r4.A03(), AdErrorType.ERROR_MESSAGE);
                        A0C(c5940r4.A03(), strA04);
                        if (strA04 == null) {
                            strA04 = str;
                        }
                        this.A05.A0F().A3W(C6364Y1.A01(this.A01), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA04, adErrorTypeAdErrorTypeFromCode.isPublicError());
                        A0E(C6229Vm.A01(adErrorTypeAdErrorTypeFromCode, strA04));
                        return;
                    default:
                        AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                        this.A05.A0F().A3W(C6364Y1.A01(this.A01), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                        A0E(C6229Vm.A01(adErrorType, str));
                        return;
                }
            } catch (Exception e) {
                e = e;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                C6902gi c6902gi = this.A05;
                if (A09[0].length() == 29) {
                    throw new RuntimeException();
                }
                A09[0] = "STn1t4NLUPoQ";
                c6902gi.A0F().A3W(C6364Y1.A01(this.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0E(C6229Vm.A01(adErrorType2, message));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str, long j, C6252WA c6252wa) {
        A0B.execute(new C6050Sr(this, str, j, c6252wa));
    }

    private boolean A0P(C6252WA c6252wa) {
        String string = c6252wa.A06().toString();
        if (C6288Wl.A00(this.A05).A0F(string)) {
            return false;
        }
        int iA0A = C6288Wl.A00(this.A05).A0A(string);
        int storedAdsCount = C6171Up.A0J(this.A05);
        int iA09 = C6288Wl.A00(this.A05).A09(string);
        if (iA0A >= storedAdsCount || iA0A > iA09) {
            C6288Wl c6288WlA00 = C6288Wl.A00(this.A05);
            String type = c6252wa.A06().toString();
            Pair<String, String> pairA0B = c6288WlA00.A0B(type);
            if (pairA0B != null) {
                Object obj = pairA0B.second;
                String[] strArr = A09;
                String str = strArr[1];
                String str2 = strArr[4];
                int storedAdsCount2 = str.charAt(27);
                if (storedAdsCount2 == str2.charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[5] = "wxWvHA1chxzz72CPhzVDSI5kTKVxH7gh";
                strArr2[2] = "qa9WwGn6xu1bvFfukLGFlV7cMdAOaohF";
                if (obj != null && pairA0B.first != null) {
                    A0O(pairA0B.second.toString(), 0L, c6252wa);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0Q(C6252WA c6252wa) {
        this.A01 = System.currentTimeMillis();
        C6108Tn.A0B(this.A05);
        A0C.get();
        if (0 != 0) {
            throw new NullPointerException(A06(103, 7, 52));
        }
        if (C6171Up.A02(this.A05) > 0 && A0P(c6252wa)) {
            return;
        }
        if (AbstractC6251W9.A08(c6252wa)) {
            ExecutorC6379YG.A06.execute(new C6101Tg(this));
            String strA02 = AbstractC6251W9.A02(c6252wa);
            if (strA02 != null) {
                this.A05.A0F().AKg();
                A0O(strA02, 0L, c6252wa);
                return;
            } else {
                AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A05.A0F().A3W(C6364Y1.A01(this.A01), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0E(C6229Vm.A01(error, null));
                return;
            }
        }
        A0B.execute(new C6094TZ(this, c6252wa));
    }

    public final void A0R(InterfaceC6254WC interfaceC6254WC) {
        this.A02 = interfaceC6254WC;
    }
}
