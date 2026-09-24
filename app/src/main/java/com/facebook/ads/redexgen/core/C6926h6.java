package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6926h6 implements InterfaceC6048Sp {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", ExifInterface.LATITUDE_SOUTH, "m77T1m6dtAhGTcgbhkAg"};
    public final List<C7094ju> A00;
    public final /* synthetic */ C6925h5 A01;

    public C6926h6(C6925h5 c6925h5, List<C7094ju> list) {
        this.A01 = c6925h5;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A01.A05(true);
        this.A01.A01.A02();
        this.A01.A01.A03(0);
        Iterator<C7094ju> it = this.A00.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (zHasNext) {
                C6140UK c6140uk = new C6140UK(this.A01.A02, it.next(), null, C6140UK.A0K(), this.A01.A01.A01());
                if (c6140uk.A12() != null && c6140uk.A12().A0F() != null) {
                    ((AbstractC7035iv) c6140uk.A12().A0F()).A00(c6140uk);
                }
                this.A01.A01.A04(new NativeAd(this.A01.A02, c6140uk, this.A01.A00));
            } else {
                AbstractC6270WT.A00(new C6927h7(this));
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADL() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADT() {
        A00();
    }
}
