package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.de */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6713de extends AnimatorListenerAdapter {
    public static String[] A02 = {"BCZIhVNDQDCh76DtmyNtHAlhFMDATvVt", "BpxJG5PSy8RrC8gDj9F3m7wY3N24XhJv", "ijlTTH3qZVfV3k2EcDrdjmOyjm2IhbRx", "nG1o2sYesXs6M57Sh7jiiyWqAFcBt7Ov", "7oLodlqz52tT27TMmX1w5sX", "BpgZ9fjSEMvqLyG8EKapvQvzg2h53TAK", "RGI6AKM997BtZD7KRZnSFDXmKos5ru", "RnEGi"};
    public final /* synthetic */ C460455 A00;
    public final /* synthetic */ boolean A01;

    public C6713de(C460455 c460455, boolean z) {
        this.A00 = c460455;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0w(this.A00.A0D, true);
        if (!this.A01 && this.A00.A06 != null) {
            C5634M3 c5634m3 = this.A00.A06;
            String[] strArr = A02;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "ljAGPopRVKGa2tZDYlD1hZgNr97DsQwm";
            strArr2[5] = "7Tfn34ptiafVbRMsYTiCD1YlzW67R4Al";
            c5634m3.destroy();
        }
    }
}
