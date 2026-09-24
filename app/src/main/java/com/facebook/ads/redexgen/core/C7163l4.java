package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7163l4 implements InterfaceC5577L8 {
    public static String[] A05 = {"ueDbV1wfakHSWIQF7BEzGoLlZXsjLXAz", "DUk", "o0l", "JXBQRCbHgV51hCMTPiBs95yrGLtJ9vRB", "UUCtZFjpq77XJSMaCIYouODFHgisrwF4", "OUp13aafPcRzH6W84Z44X0AbLYnCU3jN", "RRsP4MaHzu2rfmisltpPpgYoVzHnYDNm", "WbSPhlBTq3Mh8neaDCFEdYJRI0JZWypJ"};
    public final int A00;
    public final /* synthetic */ C7162l3 A04;
    public final C45934u A03 = new C45934u(new byte[5]);
    public final SparseArray<InterfaceC5586LH> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5577L8
    public final void A5A(C45944v c45944v) {
        C460253 c460253;
        if (c45944v.A0I() != 2) {
            return;
        }
        if (this.A04.A09 == 1 || this.A04.A09 == 2 || this.A04.A02 == 1) {
            c460253 = (C460253) this.A04.A0I.get(0);
        } else {
            c460253 = new C460253(((C460253) this.A04.A0I.get(0)).A02());
            this.A04.A0I.add(c460253);
        }
        if ((c45944v.A0I() & 128) == 0) {
            return;
        }
        c45944v.A0g(1);
        int iA0M = c45944v.A0M();
        int i = 3;
        c45944v.A0g(3);
        c45944v.A0h(this.A03, 2);
        this.A03.A09(3);
        int i2 = 13;
        this.A04.A01 = this.A03.A04(13);
        c45944v.A0h(this.A03, 2);
        int i3 = 4;
        this.A03.A09(4);
        c45944v.A0g(this.A03.A04(12));
        int i4 = 21;
        if (this.A04.A09 == 2 && this.A04.A05 == null) {
            this.A04.A05 = this.A04.A0H.A5V(21, new C5582LD(21, null, null, AbstractC46115C.A07));
            if (this.A04.A05 != null) {
                this.A04.A05.AAA(c460253, this.A04.A03, new C5585LG(iA0M, 21, 8192));
            }
        }
        this.A01.clear();
        this.A02.clear();
        int iA07 = c45944v.A07();
        while (iA07 > 0) {
            c45944v.A0h(this.A03, 5);
            int iA04 = this.A03.A04(8);
            this.A03.A09(i);
            int iA05 = this.A03.A04(i2);
            this.A03.A09(i3);
            int iA06 = this.A03.A04(12);
            C5582LD c5582ldA00 = A00(c45944v, iA06);
            if (iA04 == 6 || iA04 == 5) {
                iA04 = c5582ldA00.A00;
            }
            iA07 -= iA06 + 5;
            int i5 = this.A04.A09 == 2 ? iA04 : iA05;
            if (!this.A04.A0C.get(i5)) {
                InterfaceC5586LH interfaceC5586LHA5V = (this.A04.A09 == 2 && iA04 == i4) ? this.A04.A05 : this.A04.A0H.A5V(iA04, c5582ldA00);
                if (this.A04.A09 == 2) {
                    SparseIntArray sparseIntArray = this.A02;
                    String[] strArr = A05;
                    if (strArr[0].charAt(21) == strArr[3].charAt(21)) {
                        throw new RuntimeException();
                    }
                    A05[7] = "JJxGvbQzsWrYD5XHKTSp80Ux1McJryio";
                    if (iA05 < sparseIntArray.get(i5, 8192)) {
                        this.A02.put(i5, iA05);
                        this.A01.put(i5, interfaceC5586LHA5V);
                    }
                } else {
                    this.A02.put(i5, iA05);
                    this.A01.put(i5, interfaceC5586LHA5V);
                }
            }
            i4 = 21;
            i = 3;
            i3 = 4;
            i2 = 13;
        }
        int size = this.A02.size();
        for (int i6 = 0; i6 < size; i6++) {
            int iKeyAt = this.A02.keyAt(i6);
            int iValueAt = this.A02.valueAt(i6);
            this.A04.A0C.put(iKeyAt, true);
            this.A04.A0D.put(iValueAt, true);
            InterfaceC5586LH interfaceC5586LHValueAt = this.A01.valueAt(i6);
            if (interfaceC5586LHValueAt != null) {
                if (interfaceC5586LHValueAt != this.A04.A05) {
                    interfaceC5586LHValueAt.AAA(c460253, this.A04.A03, new C5585LG(iA0M, iKeyAt, 8192));
                }
                this.A04.A0B.put(iValueAt, interfaceC5586LHValueAt);
            }
        }
        if (this.A04.A09 != 2) {
            this.A04.A0B.remove(this.A00);
            this.A04.A02 = this.A04.A09 != 1 ? this.A04.A02 - 1 : 0;
            if (this.A04.A02 == 0) {
                this.A04.A03.A6O();
                this.A04.A08 = true;
                return;
            }
            return;
        }
        if (this.A04.A08) {
            return;
        }
        InterfaceC5332HA interfaceC5332HA = this.A04.A03;
        String[] strArr2 = A05;
        if (strArr2[1].length() != strArr2[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A05;
        strArr3[0] = "hBvWu7G0FYrLQDeafFD7KKlceKy2jgRX";
        strArr3[3] = "VoSHbxg0JUdlXnrGoiizfFeUaWFRK7d9";
        interfaceC5332HA.A6O();
        this.A04.A02 = 0;
        this.A04.A08 = true;
    }

    public C7163l4(C7162l3 c7162l3, int i) {
        this.A04 = c7162l3;
        this.A00 = i;
    }

    private C5582LD A00(C45944v c45944v, int i) {
        int descriptorTag = c45944v.A09();
        int descriptorLength = descriptorTag + i;
        int i2 = -1;
        String strTrim = null;
        ArrayList arrayList = null;
        while (c45944v.A09() < descriptorLength) {
            int positionOfNextDescriptor = c45944v.A0I();
            int iA09 = c45944v.A09() + c45944v.A0I();
            if (iA09 > descriptorLength) {
                break;
            }
            if (positionOfNextDescriptor == 5) {
                long jA0Q = c45944v.A0Q();
                if (jA0Q == 1094921523) {
                    i2 = 129;
                } else if (jA0Q == 1161904947) {
                    i2 = 135;
                } else if (jA0Q == 1094921524) {
                    i2 = 172;
                } else if (jA0Q == 1212503619) {
                    i2 = 36;
                }
            } else if (positionOfNextDescriptor == 106) {
                i2 = 129;
            } else if (positionOfNextDescriptor == 122) {
                i2 = 135;
            } else {
                String[] strArr = A05;
                String str = strArr[1];
                String str2 = strArr[2];
                int descriptorsStartPosition = str.length();
                if (descriptorsStartPosition != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "GzIOqzBb8TAh93bRV2CN08O62ZCaAqRX";
                strArr2[3] = "fp9XAk3ifz38aVsym619EhTf04al4HEa";
                if (positionOfNextDescriptor == 127) {
                    int descriptorsStartPosition2 = c45944v.A0I();
                    if (descriptorsStartPosition2 == 21) {
                        i2 = 172;
                    }
                } else if (positionOfNextDescriptor == 123) {
                    i2 = 138;
                } else {
                    String[] strArr3 = A05;
                    String str3 = strArr3[1];
                    String str4 = strArr3[2];
                    int descriptorsStartPosition3 = str3.length();
                    if (descriptorsStartPosition3 != str4.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A05;
                    strArr4[5] = "wqYpRyaK4cDMDpt9hZQKwXCqV01Ydwf6";
                    strArr4[4] = "1qKbohas3rI7JmruTyrxsTuTEMq9fdbm";
                    if (positionOfNextDescriptor == 10) {
                        String strA0W = c45944v.A0W(3);
                        String[] strArr5 = A05;
                        String str5 = strArr5[1];
                        String str6 = strArr5[2];
                        int descriptorsStartPosition4 = str5.length();
                        if (descriptorsStartPosition4 != str6.length()) {
                            strTrim = strA0W.trim();
                        } else {
                            A05[6] = "aW10g0SpfKclE3j5mqsPv8AasgcB3Ji3";
                            strTrim = strA0W.trim();
                        }
                    } else if (positionOfNextDescriptor == 89) {
                        i2 = 89;
                        arrayList = new ArrayList();
                        while (c45944v.A09() < iA09) {
                            String strTrim2 = c45944v.A0W(3).trim();
                            int iA0I = c45944v.A0I();
                            byte[] bArr = new byte[4];
                            c45944v.A0k(bArr, 0, 4);
                            arrayList.add(new C5581LC(strTrim2, iA0I, bArr));
                        }
                    } else if (positionOfNextDescriptor == 111) {
                        i2 = 257;
                    }
                }
            }
            c45944v.A0g(iA09 - c45944v.A09());
        }
        c45944v.A0f(descriptorLength);
        return new C5582LD(i2, strTrim, arrayList, Arrays.copyOfRange(c45944v.A0l(), descriptorTag, descriptorLength));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5577L8
    public final void AAA(C460253 c460253, InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
    }
}
