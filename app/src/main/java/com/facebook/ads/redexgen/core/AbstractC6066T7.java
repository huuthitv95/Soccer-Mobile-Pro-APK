package com.facebook.ads.redexgen.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.T7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6066T7 {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", CmcdData.Factory.STREAMING_FORMAT_HLS, "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C6898ge> A01 = new AtomicReference<>();

    public static C6898ge A00() {
        AtomicReference<C6898ge> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = "t";
        return atomicReference.get();
    }

    public static void A01(C6898ge c6898ge) {
        if (c6898ge == null) {
            return;
        }
        AbstractC4940An.A00(A01, null, c6898ge);
    }
}
