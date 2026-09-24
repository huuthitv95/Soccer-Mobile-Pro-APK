package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Z */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47587Z {
    public static final C7320no A0E = new C7320no(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C7320no A04;
    public final C7320no A05;
    public final C7302nW A06;
    public final C5196Ex A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC7031ir A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C47587Z(Timeline timeline, long j, C7302nW c7302nW, C5196Ex c5196Ex) {
        this(timeline, A0E, j, -9223372036854775807L, 1, false, c7302nW, c5196Ex, A0E, j, j, j, EnumC7031ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C47587Z(Timeline timeline, C7320no c7320no, long j, long j2, int i, boolean z, C7302nW c7302nW, C5196Ex c5196Ex, C7320no c7320no2, long j3, long j4, long j5) {
        this(timeline, c7320no, j, j2, i, z, c7302nW, c5196Ex, c7320no2, j3, j4, j5, EnumC7031ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C47587Z(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C7320no c7320no, long j, long j2, int i, boolean z, C7302nW c7302nW, C5196Ex c5196Ex, C7320no c7320no2, long j3, long j4, long j5, EnumC7031ir enumC7031ir, boolean z2) {
        this.A03 = timeline;
        this.A05 = c7320no;
        this.A02 = j;
        this.A01 = j2;
        this.A0C = j;
        this.A00 = i;
        this.A0A = z;
        this.A06 = c7302nW;
        this.A07 = c5196Ex;
        this.A04 = c7320no2;
        this.A0B = j3;
        this.A0D = j4;
        this.A0C = j5;
        this.A08 = enumC7031ir;
        this.A09 = z2;
    }

    public static void A00(C47587Z c47587z, C47587Z c47587z2) {
        c47587z2.A0C = c47587z.A0C;
        c47587z2.A0B = c47587z.A0B;
        c47587z2.A0D = c47587z.A0D;
    }

    public final C47587Z A01(int i) {
        C47587Z c47587z = new C47587Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c47587z);
        return c47587z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C47587Z A02(int i, EnumC7031ir enumC7031ir, boolean z) {
        C47587Z c47587z = new C47587Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC7031ir, z);
        A00(this, c47587z);
        return c47587z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C47587Z A03(int i, boolean z) {
        C47587Z c47587z = new C47587Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z);
        A00(this, c47587z);
        return c47587z;
    }

    public final C47587Z A04(Timeline timeline) {
        C47587Z c47587z = new C47587Z(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c47587z);
        return c47587z;
    }

    public final C47587Z A05(C7320no c7320no) {
        return new C47587Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c7320no, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C47587Z A06(C7320no c7320no, long j, long j2, long j3) {
        long j4 = j2;
        Timeline timeline = this.A03;
        if (!c7320no.A00()) {
            j4 = -9223372036854775807L;
        }
        return new C47587Z(timeline, c7320no, j, j4, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j3, j);
    }

    public final C47587Z A07(C7302nW c7302nW, C5196Ex c5196Ex) {
        C47587Z c47587z = new C47587Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c7302nW, c5196Ex, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c47587z);
        return c47587z;
    }

    public final C47587Z A08(boolean z) {
        C47587Z c47587z = new C47587Z(this.A03, this.A05, this.A02, this.A01, this.A00, z, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c47587z);
        return c47587z;
    }
}
