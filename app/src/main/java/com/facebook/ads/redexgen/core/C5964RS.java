package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.RS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5964RS {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C6986i7<AbstractC5956RK, C5962RQ> A00 = new C6986i7<>();
    public final C5822P6<AbstractC5956RK> A01 = new C5822P6<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private C5933Qx A00(AbstractC5956RK abstractC5956RK, int i) {
        C5962RQ c5962rqA0B;
        C5933Qx info;
        int iA08 = this.A00.A08(abstractC5956RK);
        if (iA08 >= 0 && (c5962rqA0B = this.A00.A0B(iA08)) != null) {
            int i2 = c5962rqA0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i2 & i) != 0) {
                int i3 = c5962rqA0B.A00;
                int index = ~i;
                c5962rqA0B.A00 = i3 & index;
                if (i == 4) {
                    info = c5962rqA0B.A02;
                } else if (i == 8) {
                    info = c5962rqA0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = c5962rqA0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(iA08);
                    C5962RQ.A02(c5962rqA0B);
                }
                return info;
            }
        }
        return null;
    }

    public final C5933Qx A03(AbstractC5956RK abstractC5956RK) {
        return A00(abstractC5956RK, 8);
    }

    public final C5933Qx A04(AbstractC5956RK abstractC5956RK) {
        return A00(abstractC5956RK, 4);
    }

    public final AbstractC5956RK A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C5962RQ.A01();
    }

    public final void A08(long j, AbstractC5956RK abstractC5956RK) {
        this.A01.A0B(j, abstractC5956RK);
    }

    public final void A09(AbstractC5956RK abstractC5956RK) {
        C5962RQ c5962rqA00 = this.A00.get(abstractC5956RK);
        if (c5962rqA00 == null) {
            c5962rqA00 = C5962RQ.A00();
            this.A00.put(abstractC5956RK, c5962rqA00);
        }
        c5962rqA00.A00 |= 1;
    }

    public final void A0A(AbstractC5956RK abstractC5956RK) {
        C5962RQ c5962rq = this.A00.get(abstractC5956RK);
        if (c5962rq == null) {
            return;
        }
        c5962rq.A00 &= -2;
    }

    public final void A0B(AbstractC5956RK abstractC5956RK) {
        for (int iA06 = this.A01.A06() - 1; iA06 >= 0; iA06--) {
            if (abstractC5956RK == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
        }
        C5962RQ info = this.A00.remove(abstractC5956RK);
        if (info != null) {
            C5962RQ.A02(info);
        }
    }

    public final void A0C(AbstractC5956RK abstractC5956RK) {
        A0A(abstractC5956RK);
    }

    public final void A0D(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx) {
        C5962RQ c5962rqA00 = this.A00.get(abstractC5956RK);
        if (c5962rqA00 == null) {
            c5962rqA00 = C5962RQ.A00();
            this.A00.put(abstractC5956RK, c5962rqA00);
        }
        c5962rqA00.A00 |= 2;
        c5962rqA00.A02 = c5933Qx;
    }

    public final void A0E(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx) {
        C5962RQ c5962rqA00 = this.A00.get(abstractC5956RK);
        if (c5962rqA00 == null) {
            c5962rqA00 = C5962RQ.A00();
            this.A00.put(abstractC5956RK, c5962rqA00);
        }
        c5962rqA00.A01 = c5933Qx;
        c5962rqA00.A00 |= 8;
    }

    public final void A0F(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx) {
        C5962RQ c5962rqA00 = this.A00.get(abstractC5956RK);
        if (c5962rqA00 == null) {
            c5962rqA00 = C5962RQ.A00();
            this.A00.put(abstractC5956RK, c5962rqA00);
        }
        c5962rqA00.A02 = c5933Qx;
        c5962rqA00.A00 |= 4;
    }

    public final void A0G(InterfaceC5963RR interfaceC5963RR) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC5956RK abstractC5956RKA09 = this.A00.A09(size);
            C5962RQ c5962rqA0A = this.A00.A0A(size);
            if ((c5962rqA0A.A00 & 3) == 3) {
                interfaceC5963RR.AKZ(abstractC5956RKA09);
            } else {
                int index = c5962rqA0A.A00;
                if ((index & 1) != 0) {
                    if (c5962rqA0A.A02 == null) {
                        interfaceC5963RR.AKZ(abstractC5956RKA09);
                    } else {
                        interfaceC5963RR.AHB(abstractC5956RKA09, c5962rqA0A.A02, c5962rqA0A.A01);
                    }
                } else if ((c5962rqA0A.A00 & 14) == 14) {
                    interfaceC5963RR.AH9(abstractC5956RKA09, c5962rqA0A.A02, c5962rqA0A.A01);
                } else if ((c5962rqA0A.A00 & 12) == 12) {
                    interfaceC5963RR.AHD(abstractC5956RKA09, c5962rqA0A.A02, c5962rqA0A.A01);
                } else {
                    int index2 = c5962rqA0A.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC5963RR.AHB(abstractC5956RKA09, c5962rqA0A.A02, null);
                    } else {
                        int index3 = c5962rqA0A.A00;
                        if ((index3 & 8) != 0) {
                            C5933Qx c5933Qx = c5962rqA0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            interfaceC5963RR.AH9(abstractC5956RKA09, c5933Qx, c5962rqA0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C5962RQ.A02(c5962rqA0A);
        }
    }

    public final boolean A0H(AbstractC5956RK abstractC5956RK) {
        C5962RQ record = this.A00.get(abstractC5956RK);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC5956RK abstractC5956RK) {
        C5962RQ record = this.A00.get(abstractC5956RK);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
