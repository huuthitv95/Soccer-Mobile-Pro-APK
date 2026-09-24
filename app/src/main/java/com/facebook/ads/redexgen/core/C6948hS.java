package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6948hS implements InterfaceC6406Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C5976Re> A00;

    public C6948hS(C5976Re c5976Re) {
        this.A00 = new WeakReference<>(c5976Re);
    }

    private void A00(C5976Re c5976Re) {
        C6750eF c6750eFA07 = c5976Re.A07();
        if (c6750eFA07 != null && c5976Re.A04() != null) {
            c5976Re.A04().bringChildToFront(c6750eFA07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public void A44(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        C5976Re c5976Re = this.A00.get();
        if (c5976Re != null && c5976Re.A04() != null) {
            c5976Re.A04().addView(view, i, layoutParams);
            A00(c5976Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C5976Re c5976Re = this.A00.get();
        if (c5976Re != null && c5976Re.A04() != null) {
            c5976Re.A04().addView(view, layoutParams);
            A00(c5976Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public void A4k(String str, C6141UL c6141ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, c6141ul);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public void AAo(String str, C5740Nm c5740Nm) {
        if (this.A00.get() != null) {
            WeakReference<C5976Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c5740Nm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public void ADJ(int i) {
        C5976Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
