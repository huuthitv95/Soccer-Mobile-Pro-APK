package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6982i2 implements InterfaceC5842PR {
    public static String[] A02 = {"gru2Lda4S7GCbNBLtOIdQEnlbYeRFwfL", "XnGCgKT7Pg2", "mKUX8sgZfunspLF5wjmFH8sDBtb3K48d", "jKk7kH4cQGBiDg5TKe33YqGV3AsPygQR", "TZdQK9usf81OKXIWMb61JsmxOZFMnA3k", "eyC2dzaRwXiJKVGsgdgz1meLL5sRgImY", "S4mkNNYHIh7xNNZ0OEskqLhCY0hDyySt", "ZXfiglEYlIOoTIuj216uQxYNuz12aQjw"};
    public final Rect A00 = new Rect();
    public final /* synthetic */ C5870Pv A01;

    public C6982i2(C5870Pv c5870Pv) {
        this.A01 = c5870Pv;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5842PR
    public final C5873Py ACw(View view, C5873Py c5873Py) {
        C5873Py c5873PyA06 = AbstractC5857Ph.A06(view, c5873Py);
        if (c5873PyA06.A07()) {
            return c5873PyA06;
        }
        Rect rect = this.A00;
        rect.left = c5873PyA06.A03();
        rect.top = c5873PyA06.A05();
        rect.right = c5873PyA06.A04();
        rect.bottom = c5873PyA06.A02();
        int count = this.A01.getChildCount();
        for (int i = 0; i < count; i++) {
            C5873Py c5873PyA05 = AbstractC5857Ph.A05(this.A01.getChildAt(i), c5873PyA06);
            rect.left = Math.min(c5873PyA05.A03(), rect.left);
            rect.top = Math.min(c5873PyA05.A05(), rect.top);
            rect.right = Math.min(c5873PyA05.A04(), rect.right);
            rect.bottom = Math.min(c5873PyA05.A02(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        if (A02[1].length() != 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "4mRHs0uPE72ppwyI9I2NgTpzqE63n9j5";
        strArr[2] = "Zp0DshFYJF7gm0rY227qRNMYobzVhEjB";
        C5873Py applied = c5873PyA06.A06(i2, i3, i4, i5);
        return applied;
    }
}
