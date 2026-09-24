package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.chartboost.adsession.media.InteractionType;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import com.iab.omid.library.chartboost.adsession.media.Position;
import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ee */
/* JADX INFO: loaded from: classes9.dex */
public final class C3734ee {

    /* JADX INFO: renamed from: a */
    public final C3711de.a f14075a;

    /* JADX INFO: renamed from: b */
    public final boolean f14076b;

    /* JADX INFO: renamed from: c */
    public boolean f14077c;

    /* JADX INFO: renamed from: d */
    public boolean f14078d;

    /* JADX INFO: renamed from: e */
    public boolean f14079e;

    /* JADX INFO: renamed from: f */
    public boolean f14080f;

    /* JADX INFO: renamed from: g */
    public boolean f14081g;

    public C3734ee(C3711de.a sessionHolder, boolean z) {
        Intrinsics.checkNotNullParameter(sessionHolder, "sessionHolder");
        this.f14075a = sessionHolder;
        this.f14076b = z;
    }

    /* JADX INFO: renamed from: a */
    public final MediaEvents m17546a(String str) {
        if (this.f14075a.m17296a() == null) {
            C4048sb.m19408a("MediaEvents are null when executing " + str, (Throwable) null, 2, (Object) null);
        } else {
            C4048sb.m19408a("MediaEvents valid when executing: " + str, (Throwable) null, 2, (Object) null);
        }
        return this.f14075a.m17296a();
    }

    /* JADX INFO: renamed from: a */
    public final void m17547a() {
        Unit unit;
        if (!this.f14076b) {
            C4048sb.m19411b("OMSDK signal impression event OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdEvents adEventsM17299b = this.f14075a.m17299b();
            if (adEventsM17299b != null) {
                adEventsM17299b.impressionOccurred();
                C4048sb.m19408a("Signal om ad event impression occurred!", (Throwable) null, 2, (Object) null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Omid signal impression event is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17548a(float f) {
        try {
            MediaEvents mediaEventsM17546a = m17546a("signalMediaVolumeChange volume: " + f);
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.volumeChange(f);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17549a(float f, float f2) {
        this.f14077c = false;
        this.f14078d = false;
        this.f14079e = false;
        try {
            MediaEvents mediaEventsM17546a = m17546a("signalMediaStart duration: " + f + " and volume " + f2);
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.start(f, f2);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17550a(View obstructionView) {
        Intrinsics.checkNotNullParameter(obstructionView, "obstructionView");
        AdSession adSessionM17300c = this.f14075a.m17300c();
        if (adSessionM17300c != null) {
            adSessionM17300c.addFriendlyObstruction(obstructionView, FriendlyObstructionPurpose.OTHER, "Industry Icon");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17551a(PlayerState playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        try {
            MediaEvents mediaEventsM17546a = m17546a("signalMediaStateChange state: " + playerState.name());
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.playerStateChange(playerState);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17552a(Integer num) {
        Unit unit;
        VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia;
        if (!this.f14076b) {
            C4048sb.m19411b("OMSDK signal load OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdEvents adEventsM17299b = this.f14075a.m17299b();
            if (adEventsM17299b != null) {
                boolean z = num != null && num.intValue() > 0;
                if (z) {
                    if (z) {
                        vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(num != null ? num.intValue() : 0.0f, true, Position.STANDALONE);
                    } else {
                        vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    adEventsM17299b.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                } else {
                    adEventsM17299b.loaded();
                }
                C4048sb.m19408a("Signal om ad event loaded!", (Throwable) null, 2, (Object) null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Omid load event is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17553b() {
        try {
            MediaEvents mediaEventsM17546a = m17546a("signalMediaBufferFinish");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.bufferFinish();
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17554c() {
        try {
            MediaEvents mediaEventsM17546a = m17546a("signalMediaBufferStart");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.bufferStart();
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17555d() {
        try {
            MediaEvents mediaEventsM17546a = m17546a("signalMediaComplete");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.complete();
            }
            this.f14080f = true;
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m17556e() {
        try {
            if (this.f14077c) {
                return;
            }
            C4048sb.m19408a("Signal media first quartile", (Throwable) null, 2, (Object) null);
            MediaEvents mediaEventsM17546a = m17546a("signalMediaFirstQuartile");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.firstQuartile();
            }
            this.f14077c = true;
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m17557f() {
        try {
            if (this.f14078d) {
                return;
            }
            C4048sb.m19408a("Signal media midpoint", (Throwable) null, 2, (Object) null);
            MediaEvents mediaEventsM17546a = m17546a("signalMediaMidpoint");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.midpoint();
            }
            this.f14078d = true;
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m17558g() {
        try {
            MediaEvents mediaEventsM17546a = m17546a("signalMediaPause");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.pause();
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m17559h() {
        try {
            MediaEvents mediaEventsM17546a = m17546a("signalMediaResume");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.resume();
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m17560i() {
        try {
            if (this.f14081g || this.f14080f) {
                return;
            }
            C4048sb.m19408a("Signal media skipped", (Throwable) null, 2, (Object) null);
            MediaEvents mediaEventsM17546a = m17546a("signalMediaSkipped");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.skipped();
            }
            this.f14081g = true;
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m17561j() {
        try {
            if (this.f14079e) {
                return;
            }
            C4048sb.m19408a("Signal media third quartile", (Throwable) null, 2, (Object) null);
            MediaEvents mediaEventsM17546a = m17546a("signalMediaThirdQuartile");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.thirdQuartile();
            }
            this.f14079e = true;
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m17562k() {
        try {
            MediaEvents mediaEventsM17546a = m17546a("signalUserInteractionClick");
            if (mediaEventsM17546a != null) {
                mediaEventsM17546a.adUserInteraction(InteractionType.CLICK);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m17563l() {
        Unit unit;
        if (!this.f14076b) {
            C4048sb.m19411b("OMSDK start session OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdSession adSessionM17300c = this.f14075a.m17300c();
            if (adSessionM17300c != null) {
                adSessionM17300c.start();
                C4048sb.m19408a("Omid session started successfully! Version: " + Omid.getVersion(), (Throwable) null, 2, (Object) null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Omid start session is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Error", e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public final void m17564m() {
        try {
            if (!this.f14076b) {
                C4048sb.m19411b("OMSDK stop session OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
                return;
            }
            try {
                AdSession adSessionM17300c = this.f14075a.m17300c();
                if (adSessionM17300c != null) {
                    adSessionM17300c.finish();
                    adSessionM17300c.registerAdView(null);
                }
                Omid.updateLastActivity();
                C4048sb.m19408a("Omid session finished!", (Throwable) null, 2, (Object) null);
            } catch (Exception e) {
                C4048sb.m19410b("OMSDK stop session exception", e);
            }
        } finally {
            this.f14075a.m17298a((AdSession) null);
            this.f14075a.m17297a((AdEvents) null);
        }
    }
}
