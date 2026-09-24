package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC7381oo extends InterfaceC47617c {
    void A5x();

    void A6L(C47777s c47777s, C7472qI[] c7472qIArr, InterfaceC5104DT interfaceC5104DT, long j, boolean z, boolean z2, long j2, long j3) throws C4904AD;

    InterfaceC47747p A7D();

    InterfaceC473178 A8T();

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    EnumC7031ir A99();

    int A9A();

    InterfaceC5104DT A9D();

    int A9N();

    boolean A9p();

    void AA9(int i, C48098O c48098o);

    boolean AAN();

    boolean AAP();

    boolean AAe();

    void ACU() throws IOException;

    void AIX(long j, long j2) throws C4904AD;

    void AIa(C7472qI[] c7472qIArr, InterfaceC5104DT interfaceC5104DT, long j, long j2) throws C4904AD;

    void AIm(long j) throws C4904AD;

    void AJN();

    String getName();

    void start() throws C4904AD;

    void stop();
}
