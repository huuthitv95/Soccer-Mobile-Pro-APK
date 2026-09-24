package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7297nR implements InterfaceC5185Em {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final InterfaceC454245 A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final InterfaceC5205F6 A09;
    public final int A0A;

    public C7297nR() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C7297nR(int i, int i2, int i3, float f) {
        this(null, -1, i, i2, i3, 1279, 719, f, 0.75f, 2000L, InterfaceC454245.A00);
    }

    public C7297nR(InterfaceC5205F6 interfaceC5205F6) {
        this(interfaceC5205F6, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, InterfaceC454245.A00);
    }

    public C7297nR(@MetaExoPlayerCustomization("No longer set through factory") InterfaceC5205F6 interfaceC5205F6, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i, @MetaExoPlayerCustomization("Removed from upstream") int i2, int i3, int i4, int i5, int i6, float f, float f2, long j, InterfaceC454245 interfaceC454245) {
        this.A09 = interfaceC5205F6;
        this.A0A = i;
        this.A05 = i2;
        this.A02 = i3;
        this.A06 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = j;
        this.A08 = interfaceC454245;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C43921a A00(C7435pg c7435pg, int[] iArr, int i, InterfaceC5205F6 interfaceC5205F6, AbstractC4978BP<C5167EU> abstractC4978BP) {
        return new C43921a(c7435pg, iArr, i, interfaceC5205F6, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, abstractC4978BP, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5185Em
    public final InterfaceC7284nE[] A5b(C5184El[] c5184ElArr, InterfaceC5205F6 interfaceC5205F6, C7320no c7320no, Timeline timeline) {
        InterfaceC7284nE interfaceC7284nEA00;
        AbstractC4978BP abstractC4978BPA00 = C43921a.A00(c5184ElArr);
        InterfaceC7284nE[] interfaceC7284nEArr = new InterfaceC7284nE[c5184ElArr.length];
        for (int i = 0; i < c5184ElArr.length; i++) {
            C5184El c5184El = c5184ElArr[i];
            if (c5184El != null && c5184El.A02.length != 0) {
                int length = c5184El.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    interfaceC7284nEA00 = new C43911Z(c5184El.A01, c5184El.A02[0], c5184El.A00);
                } else {
                    interfaceC7284nEA00 = A00(c5184El.A01, c5184El.A02, c5184El.A00, interfaceC5205F6, (AbstractC4978BP) abstractC4978BPA00.get(i));
                }
                interfaceC7284nEArr[i] = interfaceC7284nEA00;
            }
        }
        return interfaceC7284nEArr;
    }
}
