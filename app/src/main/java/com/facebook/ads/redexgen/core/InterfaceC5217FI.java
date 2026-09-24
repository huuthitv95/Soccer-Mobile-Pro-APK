package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.InterfaceC5220FL;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC5217FI<T extends InterfaceC5220FL> {
    void AEc(T t, long j, long j2, boolean z);

    void AEe(T t, long j, long j2);

    C5218FJ AEf(T t, long j, long j2, IOException iOException, int i);

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "For Media3 Migration Backward Compatibility")
    void AEi(T t, long j, long j2, int i);
}
