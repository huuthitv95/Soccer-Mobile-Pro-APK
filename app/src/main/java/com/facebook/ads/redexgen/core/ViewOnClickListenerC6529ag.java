package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ag */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6529ag implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C5637M6 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, Ascii.DLE, Ascii.f22494GS, 19, 33, Ascii.f22498RS, Ascii.CAN, 19, -35, Ascii.CAN, Ascii.f22494GS, 35, Ascii.DC4, Ascii.f22494GS, 35, -35, Ascii.DLE, Ascii.DC2, 35, Ascii.CAN, Ascii.f22498RS, Ascii.f22494GS, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A00.A07) && !A00(0, 11, 12).equals(this.A00.A07)) {
                Intent intent = new Intent(A00(22, 26, 51), AbstractC6312XB.A00(this.A00.A07));
                intent.addFlags(268435456);
                this.A00.A09.A0F().A9y();
                try {
                    C6297Wu.A0D(this.A00.A09, intent);
                    this.A00.A06.AF0();
                } catch (C6295Ws e) {
                    Throwable cause = e.getCause();
                    C6295Ws cause2 = e;
                    if (cause != null) {
                        cause2 = e.getCause();
                    }
                    this.A00.A09.A08().ABC(A00(11, 11, 3), AbstractC6098Td.A00, new C6099Te(cause2));
                }
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC6529ag(C5637M6 c5637m6) {
        this.A00 = c5637m6;
    }
}
