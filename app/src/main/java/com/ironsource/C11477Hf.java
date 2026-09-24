package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Hf */
/* JADX INFO: loaded from: classes6.dex */
public final class C11477Hf {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11387Cf f24443a;

    /* JADX INFO: renamed from: com.ironsource.Hf$c */
    public static final class c implements InterfaceC12621ya {
        c() {
        }

        @Override // com.ironsource.InterfaceC12621ya
        /* JADX INFO: renamed from: b */
        public void mo26034b(IronSourceError ironSourceError) {
            C11477Hf.this.m26013a(C11495If.f24683b, LevelPlay.AdFormat.BANNER, C11549Lf.f25085a.m26441a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC12621ya
        /* JADX INFO: renamed from: d */
        public void mo26035d(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24687f, LevelPlay.AdFormat.BANNER, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12621ya
        /* JADX INFO: renamed from: e */
        public void mo26036e(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24691j, LevelPlay.AdFormat.BANNER, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12621ya
        /* JADX INFO: renamed from: f */
        public void mo26037f(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24694m, LevelPlay.AdFormat.BANNER, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12621ya
        /* JADX INFO: renamed from: g */
        public void mo26038g(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24692k, LevelPlay.AdFormat.BANNER, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12621ya
        /* JADX INFO: renamed from: h */
        public void mo26039h(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24693l, LevelPlay.AdFormat.BANNER, C11549Lf.f25085a.m26441a(adInfo));
        }
    }

    public C11477Hf(InterfaceC11387Cf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f24443a = javaScriptEvaluator;
    }

    /* JADX INFO: renamed from: b */
    private final void m26014b() {
        C11459Gf c11459Gf = C11459Gf.f24392a;
        c11459Gf.m25938a((InterfaceC12133cb) null);
        c11459Gf.m25939a((InterfaceC12389nb) null);
        c11459Gf.m25941a((InterfaceC12621ya) null);
    }

    /* JADX INFO: renamed from: c */
    private final void m26015c() {
        C11459Gf.f24392a.m25950e();
    }

    /* JADX INFO: renamed from: d */
    public final void m26017d() {
        C11459Gf c11459Gf = C11459Gf.f24392a;
        c11459Gf.m25938a(new a());
        c11459Gf.m25939a(new b());
        c11459Gf.m25941a(new c());
    }

    /* JADX INFO: renamed from: a */
    public final void m26016a() {
        m26014b();
        m26015c();
    }

    /* JADX INFO: renamed from: com.ironsource.Hf$a */
    public static final class a implements InterfaceC12133cb {
        a() {
        }

        @Override // com.ironsource.InterfaceC12133cb
        /* JADX INFO: renamed from: a */
        public void mo26018a(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24682a, LevelPlay.AdFormat.INTERSTITIAL, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12133cb
        /* JADX INFO: renamed from: b */
        public void mo26021b(IronSourceError ironSourceError) {
            C11477Hf.this.m26013a(C11495If.f24683b, LevelPlay.AdFormat.INTERSTITIAL, C11549Lf.f25085a.m26441a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC12133cb
        /* JADX INFO: renamed from: c */
        public void mo26022c(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24684c, LevelPlay.AdFormat.INTERSTITIAL, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12133cb
        /* JADX INFO: renamed from: d */
        public void mo26023d(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24687f, LevelPlay.AdFormat.INTERSTITIAL, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12133cb
        /* JADX INFO: renamed from: e */
        public void mo26024e(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24685d, LevelPlay.AdFormat.INTERSTITIAL, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12133cb
        /* JADX INFO: renamed from: a */
        public void mo26019a(IronSourceError ironSourceError, AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24686e, LevelPlay.AdFormat.INTERSTITIAL, C11549Lf.f25085a.m26441a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC12133cb
        /* JADX INFO: renamed from: b */
        public void mo26020b(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24688g, LevelPlay.AdFormat.INTERSTITIAL, C11549Lf.f25085a.m26441a(adInfo));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Hf$b */
    public static final class b implements InterfaceC12425pb, InterfaceC12407ob {
        b() {
        }

        @Override // com.ironsource.InterfaceC12425pb
        /* JADX INFO: renamed from: a */
        public void mo26027a(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24682a, LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12425pb
        /* JADX INFO: renamed from: b */
        public void mo26031b(IronSourceError ironSourceError) {
            C11477Hf.this.m26013a(C11495If.f24683b, LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC12389nb
        /* JADX INFO: renamed from: c */
        public void mo26032c(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24684c, LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12407ob
        /* JADX INFO: renamed from: d */
        public void mo26033d(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24689h, LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(adInfo));
        }

        @Override // com.ironsource.InterfaceC12407ob
        /* JADX INFO: renamed from: a */
        public void mo26025a() {
            C11477Hf.this.m26013a(C11495If.f24695n, LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC12389nb
        /* JADX INFO: renamed from: b */
        public void mo26029b(C12135cd c12135cd, AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24690i, LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(C11459Gf.f24392a.m25934a(c12135cd), adInfo));
        }

        @Override // com.ironsource.InterfaceC12389nb
        /* JADX INFO: renamed from: a */
        public void mo26028a(IronSourceError ironSourceError, AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24686e, LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC12389nb
        /* JADX INFO: renamed from: a */
        public void mo26026a(C12135cd c12135cd, AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24687f, LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(C11459Gf.f24392a.m25934a(c12135cd), adInfo));
        }

        @Override // com.ironsource.InterfaceC12389nb
        /* JADX INFO: renamed from: b */
        public void mo26030b(AdInfo adInfo) {
            C11477Hf.this.m26013a(C11495If.f24688g, LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(adInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m26013a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f24443a.mo25585a(str, adFormat, list);
    }
}
