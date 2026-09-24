package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6938hI implements InterfaceC6674d1 {
    public static String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C6932hC A01;
    public final /* synthetic */ C6140UK A02;

    public C6938hI(C6932hC c6932hC, C6140UK c6140uk, NativeAd nativeAd) {
        this.A01 = c6932hC;
        this.A02 = c6140uk;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6674d1
    public final void AAn() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6674d1
    public final void ADm(C466362 c466362) {
        new Handler(Looper.getMainLooper()).postDelayed(new C6939hJ(this, c466362), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6674d1
    public final void AE2() {
        if (this.A01.A0H != null) {
            C466362 c466362 = this.A01.A0H;
            String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            c466362.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6674d1
    public final void AGC(View view, MotionEvent motionEvent) {
        this.A02.A1E().A06(this.A01.A0C, motionEvent, view, view);
        if (motionEvent.getAction() == 1 && !this.A01.A0U(this.A00) && this.A02.A17() != null) {
            this.A02.A17().onClick(view);
        }
    }
}
