package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7012iY implements InterfaceC6064T5 {
    public long A00;
    public InterstitialAd A01;
    public InterstitialAdListener A02;
    public RewardData A03;
    public RewardedAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public EnumSet<CacheFlag> A08;
    public final InterfaceC6123U3 A09;
    public final C6902gi A0A;
    public final String A0B;
    public final WeakReference<InterstitialAd> A0C;

    public C7012iY(C6902gi c6902gi, InterstitialAd interstitialAd, String str) {
        this(c6902gi, interstitialAd, str, new C7023ij());
    }

    public C7012iY(C6902gi c6902gi, InterstitialAd interstitialAd, String str, InterfaceC6123U3 interfaceC6123U3) {
        this.A0A = c6902gi;
        this.A0B = str;
        this.A01 = interstitialAd;
        this.A0C = new WeakReference<>(interstitialAd);
        this.A00 = -1L;
        c6902gi.A0N(this);
        this.A09 = interfaceC6123U3;
    }

    public final long A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6064T5
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final InterstitialAd A6k() {
        return this.A01 != null ? this.A01 : this.A0C.get();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6064T5
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final InterstitialAdListener A6o() {
        return this.A02;
    }

    public final RewardData A03() {
        return this.A03;
    }

    public final RewardedAdListener A04() {
        return this.A04;
    }

    public final C6902gi A05() {
        return this.A0A;
    }

    public final InterfaceC6123U3 A06() {
        return this.A09;
    }

    public final String A07() {
        return this.A05;
    }

    public final String A08() {
        return this.A06;
    }

    public final String A09() {
        return this.A07;
    }

    public final String A0A() {
        return this.A0B;
    }

    public final EnumSet<CacheFlag> A0B() {
        return this.A08;
    }

    public final void A0C(long j) {
        this.A00 = j;
    }

    public final void A0D(InterstitialAd interstitialAd) {
        if (interstitialAd == null && !C6171Up.A0u(this.A0A)) {
            return;
        }
        this.A01 = interstitialAd;
    }

    public final void A0E(InterstitialAdListener interstitialAdListener) {
        this.A02 = interstitialAdListener;
    }

    public final void A0F(RewardData rewardData) {
        this.A03 = rewardData;
    }

    public final void A0G(RewardedAdListener rewardedAdListener) {
        this.A04 = rewardedAdListener;
    }

    public final void A0H(String str) {
        this.A05 = str;
    }

    public final void A0I(String str) {
        this.A06 = str;
    }

    public final void A0J(String str) {
        this.A07 = str;
    }

    public final void A0K(EnumSet<CacheFlag> flags) {
        this.A08 = flags;
    }
}
