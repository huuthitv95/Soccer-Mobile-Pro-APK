package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C8533b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C8576e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C8581c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C8596m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C8599p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C8612e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.C8630a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.C8633b0;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.C8634c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.C8638e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.C8656u;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.C8662a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;
import java.lang.reflect.Constructor;
import java.util.Collections;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8528c implements InterfaceC8569k {

    /* JADX INFO: renamed from: a */
    public static final Constructor f19128a;

    static {
        Constructor constructor = null;
        try {
            constructor = Class.forName("com.fyber.inneractive.sdk.player.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC8567i.class).getConstructor(null);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
        f19128a = constructor;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8569k
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC8567i[] mo21028a() {
        InterfaceC8567i[] interfaceC8567iArr;
        Constructor constructor = f19128a;
        interfaceC8567iArr = new InterfaceC8567i[constructor == null ? 11 : 12];
        interfaceC8567iArr[0] = new C8576e();
        interfaceC8567iArr[1] = new C8596m(null);
        interfaceC8567iArr[2] = new C8599p();
        interfaceC8567iArr[3] = new C8581c(-9223372036854775807L);
        interfaceC8567iArr[4] = new C8634c(0L);
        interfaceC8567iArr[5] = new C8630a(0L);
        interfaceC8567iArr[6] = new C8633b0(1, new C8823v(0L), new C8638e(0, Collections.EMPTY_LIST));
        interfaceC8567iArr[7] = new C8533b();
        interfaceC8567iArr[8] = new C8612e();
        interfaceC8567iArr[9] = new C8656u();
        interfaceC8567iArr[10] = new C8662a();
        if (constructor != null) {
            try {
                interfaceC8567iArr[11] = (InterfaceC8567i) constructor.newInstance(null);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return interfaceC8567iArr;
    }
}
