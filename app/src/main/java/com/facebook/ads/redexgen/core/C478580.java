package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.80 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C478580 implements InterfaceC7108k8 {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public InterfaceC5701N9 A01;
    public C5702NA A02;
    public C7084jk A03;
    public C7082ji A04;
    public C472976 A05;
    public InterfaceC6426Z1 A06;
    public C6427Z2 A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(C472976 c472976, C7082ji c7082ji, C6056Sx c6056Sx, InterfaceC5701N9 interfaceC5701N9, C6427Z2 c6427z2) {
        String strA7O = c7082ji.A7O();
        if (!TextUtils.isEmpty(strA7O)) {
            c6056Sx.A0e(new C6200VI(strA7O, c472976.A0A()));
        }
        C6219Vb c6219VbA0I = c7082ji.A0I();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (c6219VbA0I != null) {
            C6054Sv c6054Sv = new C6054Sv(c7082ji.A0I().getUrl(), c7082ji.A0I().getHeight(), c7082ji.A0I().getWidth(), c7082ji.A0b(), A03(2, 16, 120));
            c6054Sv.A01 = new C6062T3(false, -1, -1);
            c6056Sx.A0W();
            c6056Sx.A0c(c6054Sv);
        }
        if (c7082ji.A0H() != null) {
            c6056Sx.A0c(new C6054Sv(c7082ji.A0H().getUrl(), c7082ji.A0H().getHeight(), c7082ji.A0H().getWidth(), c7082ji.A0b(), A03(2, 16, 120)));
        }
        String strA0e = c7082ji.A0e();
        if (strA0e != null && !TextUtils.isEmpty(strA0e)) {
            c6056Sx.A0b(new C6052St(strA0e, c7082ji.A0b(), A03(2, 16, 120), c7082ji.A0D()));
        }
        AbstractC7077jd abstractC7077jdA0F = c7082ji.A0F();
        String strA03 = A03(2, 16, 120);
        if (abstractC7077jdA0F != null) {
            AbstractC5754O0.A00(c7082ji.A0F(), c6056Sx, strA03);
        }
        C7096jw c7096jw = new C7096jw(this, c6427z2, interfaceC5701N9, c472976);
        String clientToken2 = c7082ji.A0b();
        c6056Sx.A0X(c7096jw, new C6049Sq(clientToken2, strA03));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final String A7O() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final AdPlacementType A8k() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7108k8
    public final void AAt(C472976 c472976, InterfaceC6192VA interfaceC6192VA, EnumC6231Vp enumC6231Vp, InterfaceC5701N9 interfaceC5701N9, JSONObject jSONObject, C6118Tx c6118Tx) {
        c472976.A0F().A4N();
        this.A05 = c472976;
        this.A01 = interfaceC5701N9;
        C6056Sx c6056Sx = new C6056Sx(c472976);
        this.A00 = System.currentTimeMillis();
        C7082ji c7082jiA00 = AbstractC5710NI.A00(c472976, jSONObject, AbstractC6340Xd.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = c7082jiA00;
        if (!AbstractC5690Mx.A06(c472976, c7082jiA00, interfaceC6192VA)) {
            InterfaceC6426Z1 adViewListener = new C7098jy(this, c472976);
            this.A06 = adViewListener;
            C6427Z2 c6427z2 = new C6427Z2(c472976, interfaceC6192VA, c6056Sx, new WeakReference(adViewListener), c6118Tx.A04(), c6118Tx.A07(), c6118Tx.A08(), c6118Tx.A09(), c7082jiA00, this.A08);
            this.A07 = c6427z2;
            this.A03 = new C7084jk(c472976, new C7097jx(this, c472976, interfaceC5701N9), c6427z2.getViewabilityChecker(), interfaceC6192VA, c7082jiA00);
            A05(c472976, c7082jiA00, c6056Sx, interfaceC5701N9, c6427z2);
            this.A02 = new C5702NA(c472976, this.A08, this, interfaceC5701N9);
            this.A02.A02();
            return;
        }
        c472976.A0F().A52();
        interfaceC5701N9.AEN(this, C6229Vm.A00(AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC7139kf interfaceC7139kfA0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            interfaceC7139kfA0F.A4L(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        C5702NA c5702na = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (c5702na != null) {
            this.A02.A03();
        }
    }
}
