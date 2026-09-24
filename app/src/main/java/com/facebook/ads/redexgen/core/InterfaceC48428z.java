package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8z */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC48428z {
    void A59(C7472qI c7472qI, int i, int[] iArr) throws C48378s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z);

    C7451px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j, int i) throws C48418y, C48388t;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C48418y;

    void AJG(C7478qQ c7478qQ);

    void AJH(int i);

    void AJI(C441921 c441921);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z);

    void AJV(InterfaceC48398v interfaceC48398v);

    void AJd(C7451px c7451px);

    void AJg(C48098O c48098o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z);

    boolean AKN(C7472qI c7472qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i, int i2);

    void flush();

    void pause();

    void setVolume(float f);
}
