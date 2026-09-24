package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7254mj implements InterfaceC5323H1 {
    public static String[] A03 = {"Qzrb2NyX11iip4M0Dun9HjrVhDBjGiaF", "S4lxERGEQHczdoRlIRLlXReEKfWFWSGc", "txU8e6wljbe290bqTydjfEMDFUDvEmx5", "ZB68ibpDVF3DEFIIdRwQIG37zRUG2jhG", "NKfzuQ6LKFKezVni40AKhLW9Qs", "gUOm4cnsv29C5J2bDVOWEpGrIAhYUn7e", "xRx4EoAOCCZ90h8tA3pJ1YmFxzetviZR", "6LlO7okteSZZNTbDPWq3J1SHLhykMwkf"};
    public final int A00;
    public final C5336HE A01;
    public final C5341HJ A02;

    @Override // com.facebook.ads.redexgen.core.InterfaceC5323H1
    public final /* synthetic */ void AFs() {
    }

    public C7254mj(C5341HJ c5341hj, int i) {
        this.A02 = c5341hj;
        this.A00 = i;
        this.A01 = new C5336HE();
    }

    private long A00(InterfaceC7263ms interfaceC7263ms) throws IOException {
        while (interfaceC7263ms.A8i() < interfaceC7263ms.A8O() - 6 && !AbstractC5337HF.A09(interfaceC7263ms, this.A02, this.A00, this.A01)) {
            String[] strArr = A03;
            if (strArr[1].charAt(7) == strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "MdA2mB0qiCN7NKRKcBY3aVGEnEzRIKP4";
            strArr2[3] = "Kp5wPJFyOGMB7tBJUi3Fl7WX9iQtExSk";
            interfaceC7263ms.A47(1);
        }
        if (interfaceC7263ms.A8i() >= interfaceC7263ms.A8O() - 6) {
            interfaceC7263ms.A47((int) (interfaceC7263ms.A8O() - interfaceC7263ms.A8i()));
            return this.A02.A09;
        }
        return this.A01.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5323H1
    public final C5321Gz AIw(InterfaceC7263ms interfaceC7263ms, long j) throws IOException {
        long rightFrameFirstSampleNumber = interfaceC7263ms.A8n();
        long leftFrameFirstSampleNumber = A00(interfaceC7263ms);
        long jA8i = interfaceC7263ms.A8i();
        interfaceC7263ms.A47(Math.max(6, this.A02.A06));
        long searchPosition = A00(interfaceC7263ms);
        long leftFramePosition = interfaceC7263ms.A8i();
        if (leftFrameFirstSampleNumber <= j && searchPosition > j) {
            return C5321Gz.A03(jA8i);
        }
        if (searchPosition <= j) {
            return C5321Gz.A05(searchPosition, leftFramePosition);
        }
        return C5321Gz.A04(leftFrameFirstSampleNumber, rightFrameFirstSampleNumber);
    }
}
