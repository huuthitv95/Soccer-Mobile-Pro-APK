package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7k */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47697k extends AbstractC7040j0 {
    public static byte[] A03;
    public long A00;
    public View A01;
    public C472976 A02;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{Ascii.DC4, Ascii.ETB, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, Ascii.f22503VT, 38, 55, Ascii.ESC, 40, 40, 37, 40, -42, 45, Ascii.f22498RS, Ascii.f22502US, 34, Ascii.ESC, -42, 38, Ascii.ETB, 40, 41, Ascii.f22502US, 36, Ascii.f22494GS, -42, Ascii.f22491EM, Ascii.f22498RS, Ascii.ETB, Ascii.f22502US, 36, Ascii.ESC, Ascii.SUB, -42, Ascii.ETB, Ascii.SUB, 41, -42, -8, Ascii.ETB, 36, 36, Ascii.ESC, 40};
    }

    public C47697k(C472976 c472976, C5761O7 c5761o7) {
        super(c472976, c5761o7);
        this.A00 = 10000L;
        this.A02 = c472976;
    }

    private C7043j3 A01(Runnable runnable) {
        return new C7043j3(this, runnable);
    }

    private List<JSONObject> A04(C5762O8 c5762o8) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA03 = c5762o8.A03();
        String strA03 = A03(22, 12, 71);
        if (jSONObjectA03.has(strA03)) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(strA03).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i = 0; i < adsArray.length(); i++) {
                        arrayList.add((JSONObject) adsArray.get(i));
                    }
                }
            } catch (JSONException unused) {
                String strA04 = A03(36, 38, 101);
                this.A02.A0F().A5g(C6229Vm.A01(AdErrorType.UNKNOWN_ERROR, strA04).A03().getErrorCode(), strA04);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(InterfaceC7108k8 interfaceC7108k8, JSONObject jSONObject, C6118Tx c6118Tx) {
        this.A0C = false;
        C7042j2 c7042j2 = new C7042j2(this, interfaceC7108k8, AbstractC6340Xd.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c7042j2, c6118Tx.A05());
        interfaceC7108k8.AAt(this.A02, this.A09, this.A08.A08, A01(c7042j2), jSONObject, c6118Tx);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7040j0
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4e();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4f();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7040j0
    public final void A0R(InterfaceC5693N1 interfaceC5693N1, C6117Tw c6117Tw, C6115Tu c6115Tu, final C5762O8 c5762o8) {
        this.A02.A0F().A4Y();
        final InterfaceC7108k8 interfaceC7108k8 = (InterfaceC7108k8) interfaceC5693N1;
        if (interfaceC7108k8.AKL()) {
            final List<JSONObject> listA04 = A04(c5762o8);
            A06(interfaceC7108k8, listA04.get(0), c5762o8.A01());
            if (listA04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.O9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A02.A0a(interfaceC7108k8, listA04, c5762o8);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC7108k8, c5762o8.A03(), c5762o8.A01());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7040j0
    public final void A0U(String str) {
        this.A02.A0F().A4d(str != null);
        super.A0U(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7040j0
    public final void A0Y(boolean z) {
        super.A0Y(z);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC7108k8 interfaceC7108k8, List list, C5762O8 c5762o8) {
        A06(interfaceC7108k8, (JSONObject) list.get(1), c5762o8.A01());
    }
}
