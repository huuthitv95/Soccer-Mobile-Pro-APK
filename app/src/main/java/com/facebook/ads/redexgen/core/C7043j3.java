package com.facebook.ads.redexgen.core;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7043j3 implements InterfaceC5701N9 {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ C47697k A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{89, 10, Ascii.f22500SO, 83, 89, 91, 92, 92, 32, 3, Ascii.f22492FF, Ascii.f22492FF, 7, Ascii.DLE, 66, Ascii.f22503VT, Ascii.f22499SI, Ascii.DC2, Ascii.DLE, 7, 17, 17, Ascii.f22503VT, Ascii.f22490CR, Ascii.f22492FF, 66, 4, Ascii.f22503VT, Ascii.DLE, 7, 6, Ascii.f22493FS, Ascii.f22494GS, 49, Ascii.DC2, Ascii.f22494GS, Ascii.f22494GS, Ascii.SYN, 1, 63, Ascii.f22493FS, Ascii.DC4, Ascii.DC4, Ascii.SUB, Ascii.f22494GS, Ascii.DC4, 58, Ascii.f22498RS, 3, 1, Ascii.SYN, 0, 0, Ascii.SUB, Ascii.f22493FS, Ascii.f22494GS};
    }

    static {
        A01();
    }

    public C7043j3(C47697k c47697k, Runnable runnable) {
        this.A00 = c47697k;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5701N9
    public final void ADC(InterfaceC7108k8 interfaceC7108k8) {
        this.A00.A02.A0F().A4a();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5701N9
    public final void ADD(InterfaceC7108k8 interfaceC7108k8, View view) {
        this.A00.A02.A0F().A4Z(interfaceC7108k8 == ((AbstractC7040j0) this.A00).A00);
        if (interfaceC7108k8 != ((AbstractC7040j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        InterfaceC5693N1 interfaceC5693N1 = ((AbstractC7040j0) this.A00).A01;
        C47697k c47697k = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC7040j0) c47697k).A01 = interfaceC7108k8;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC7108k8);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0Q(interfaceC5693N1);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5701N9
    public final void ADE(InterfaceC7108k8 interfaceC7108k8) {
        AbstractC6240Vy.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        this.A00.A02.A0F().A4c();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5701N9
    public final void AEN(InterfaceC7108k8 interfaceC7108k8, C6229Vm c6229Vm) {
        this.A00.A02.A0F().A4b(interfaceC7108k8 == ((AbstractC7040j0) this.A00).A00, c6229Vm.A03().getErrorCode());
        if (interfaceC7108k8 != ((AbstractC7040j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC7108k8);
        this.A00.ADp(c6229Vm);
    }
}
