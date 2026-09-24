package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6549b0 {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", CmcdData.Factory.STREAMING_FORMAT_SS, "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C6549b0.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC5624Lt> A03;
    public final WeakReference<InterfaceC6550b1> A04;
    public final WeakReference<C6847fp> A05;
    public final WeakReference<C5600LV> A06;

    public C6549b0(C5600LV c5600lv, InterfaceC6550b1 interfaceC6550b1, C6847fp c6847fp, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C6902gi c6902gi) {
        this.A06 = new WeakReference<>(c5600lv);
        this.A04 = new WeakReference<>(interfaceC6550b1);
        this.A05 = new WeakReference<>(c6847fp);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c6902gi.A0F());
    }

    private InterfaceC5624Lt A00() {
        InterfaceC5624Lt funnel = this.A03.get();
        if (funnel == null) {
            return new C7132kX();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC6340Xd.A01(C6108Tn.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AKr(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AKs();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AKt();
            if (this.A06.get().isShown()) {
                A00().AKu();
                new Handler(Looper.getMainLooper()).post(new C5612Lh(this.A05));
            }
            InterfaceC6550b1 interfaceC6550b1 = this.A04.get();
            if (interfaceC6550b1 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC6548az(this, interfaceC6550b1));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C5600LV webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKv(true);
            return;
        }
        InterfaceC6550b1 interfaceC6550b1 = this.A04.get();
        if (interfaceC6550b1 == null) {
            A00().AKv(true);
            return;
        }
        InterfaceC5624Lt interfaceC5624LtA00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        interfaceC5624LtA00.AKv(false);
        interfaceC6550b1.AF8();
    }
}
