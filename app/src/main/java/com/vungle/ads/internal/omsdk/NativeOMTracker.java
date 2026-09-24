package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.InteractionType;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.adsession.media.Position;
import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.OmSdkData;
import com.vungle.ads.internal.util.Logger;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: compiled from: NativeOMTracker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016J\u000e\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m43475d2 = {"Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "", "omSdkData", "", "omSdkJS", "isNativeVideo", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "adEvents", "Lcom/iab/omid/library/vungle/adsession/AdEvents;", "adSession", "Lcom/iab/omid/library/vungle/adsession/AdSession;", "()Z", "json", "Lkotlinx/serialization/json/Json;", "mediaEvents", "Lcom/iab/omid/library/vungle/adsession/media/MediaEvents;", "getNativeAdSession", "Lcom/iab/omid/library/vungle/adsession/AdSessionConfiguration;", "creativeType", "Lcom/iab/omid/library/vungle/adsession/CreativeType;", "impressionOccurred", "", "onMuteChanged", "muted", "onQuartileChanged", "quartile", "", "onQuartileStart", "duration", "", "volume", "onStateCompleted", "onStatePaused", "onStatePlay", "onUserInteraction", "start", "view", "Landroid/view/View;", "stop", "Companion", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class NativeOMTracker {
    private static final String TAG = "NativeAd-OMTracker";
    private AdEvents adEvents;
    private AdSession adSession;
    private final boolean isNativeVideo;
    private final Json json;
    private MediaEvents mediaEvents;

    public NativeOMTracker(String omSdkData, String omSdkJS, boolean z) {
        Object objM44946constructorimpl;
        OmSdkData omSdkData2;
        Intrinsics.checkNotNullParameter(omSdkData, "omSdkData");
        Intrinsics.checkNotNullParameter(omSdkJS, "omSdkJS");
        this.isNativeVideo = z;
        this.json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.omsdk.NativeOMTracker$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JsonBuilder Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.setIgnoreUnknownKeys(true);
                Json.setEncodeDefaults(true);
                Json.setExplicitNulls(false);
            }
        }, 1, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            NativeOMTracker nativeOMTracker = this;
            AdSessionConfiguration nativeAdSession = this.isNativeVideo ? getNativeAdSession(CreativeType.VIDEO) : getNativeAdSession(CreativeType.NATIVE_DISPLAY);
            Partner partnerCreatePartner = Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME);
            byte[] decoded = Base64.decode(omSdkData, 0);
            if (decoded != null) {
                Intrinsics.checkNotNullExpressionValue(decoded, "decoded");
                String str = new String(decoded, Charsets.UTF_8);
                Json json = this.json;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(OmSdkData.class));
                Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                omSdkData2 = (OmSdkData) json.decodeFromString(kSerializerSerializer, str);
            } else {
                omSdkData2 = null;
            }
            if ((omSdkData2 != null ? omSdkData2.getVendorURL() : null) == null) {
                Logger.INSTANCE.m43468e(TAG, "Invalid OMSDK data: missing vendorURL");
            } else {
                VerificationScriptResource verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(omSdkData2.getVendorKey(), new URL(omSdkData2.getVendorURL()), omSdkData2.getParams());
                Intrinsics.checkNotNullExpressionValue(verificationScriptResource, "verificationScriptResource");
                this.adSession = AdSession.createAdSession(nativeAdSession, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, omSdkJS, CollectionsKt.listOf(verificationScriptResource), null, null));
            }
            objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            Logger.INSTANCE.m43469e(TAG, "error occured when create omsdk adSession:", thM44949exceptionOrNullimpl);
        }
    }

    private final AdSessionConfiguration getNativeAdSession(CreativeType creativeType) {
        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, creativeType == CreativeType.NATIVE_DISPLAY ? Owner.NONE : Owner.NATIVE, false);
        Intrinsics.checkNotNullExpressionValue(adSessionConfigurationCreateAdSessionConfiguration, "createAdSessionConfigura…          false\n        )");
        return adSessionConfigurationCreateAdSessionConfiguration;
    }

    public final void impressionOccurred() {
        Unit unit;
        Logger.INSTANCE.m43467d(TAG, "track event: impressionOccurred");
        try {
            Result.Companion companion = Result.INSTANCE;
            NativeOMTracker nativeOMTracker = this;
            AdEvents adEvents = this.adEvents;
            if (adEvents != null) {
                adEvents.impressionOccurred();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m44946constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: renamed from: isNativeVideo, reason: from getter */
    public final boolean getIsNativeVideo() {
        return this.isNativeVideo;
    }

    public final void onMuteChanged(boolean muted) {
        Logger.INSTANCE.m43467d(TAG, "track event: onMuteChanged muted=" + muted);
        Unit unit = null;
        if (muted) {
            try {
                Result.Companion companion = Result.INSTANCE;
                NativeOMTracker nativeOMTracker = this;
                MediaEvents mediaEvents = this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(0.0f);
                    unit = Unit.INSTANCE;
                }
                Result.m44946constructorimpl(unit);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m44946constructorimpl(ResultKt.createFailure(th));
                return;
            }
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            NativeOMTracker nativeOMTracker2 = this;
            MediaEvents mediaEvents2 = this.mediaEvents;
            if (mediaEvents2 != null) {
                mediaEvents2.volumeChange(1.0f);
                unit = Unit.INSTANCE;
            }
            Result.m44946constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public final void onQuartileChanged(int quartile) {
        Logger.INSTANCE.m43467d(TAG, "track event: onQuartileChanged quartile=" + quartile);
        Unit unit = null;
        if (quartile == 5) {
            try {
                Result.Companion companion = Result.INSTANCE;
                NativeOMTracker nativeOMTracker = this;
                MediaEvents mediaEvents = this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.firstQuartile();
                    unit = Unit.INSTANCE;
                }
                Result.m44946constructorimpl(unit);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m44946constructorimpl(ResultKt.createFailure(th));
                return;
            }
        }
        if (quartile == 6) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                NativeOMTracker nativeOMTracker2 = this;
                MediaEvents mediaEvents2 = this.mediaEvents;
                if (mediaEvents2 != null) {
                    mediaEvents2.midpoint();
                    unit = Unit.INSTANCE;
                }
                Result.m44946constructorimpl(unit);
                return;
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m44946constructorimpl(ResultKt.createFailure(th2));
                return;
            }
        }
        if (quartile != 7) {
            return;
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            NativeOMTracker nativeOMTracker3 = this;
            MediaEvents mediaEvents3 = this.mediaEvents;
            if (mediaEvents3 != null) {
                mediaEvents3.thirdQuartile();
                unit = Unit.INSTANCE;
            }
            Result.m44946constructorimpl(unit);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th3));
        }
    }

    public final void onQuartileStart(float duration, float volume) {
        Unit unit;
        Logger.INSTANCE.m43467d(TAG, "track event: onQuartileStart duration=" + duration + " volume=" + volume);
        try {
            Result.Companion companion = Result.INSTANCE;
            NativeOMTracker nativeOMTracker = this;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.start(duration, volume);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m44946constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void onStateCompleted() {
        Unit unit;
        Logger.INSTANCE.m43467d(TAG, "track event: onStateCompleted");
        try {
            Result.Companion companion = Result.INSTANCE;
            NativeOMTracker nativeOMTracker = this;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.complete();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m44946constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void onStatePaused() {
        Unit unit;
        Logger.INSTANCE.m43467d(TAG, "track event: onStatePaused");
        try {
            Result.Companion companion = Result.INSTANCE;
            NativeOMTracker nativeOMTracker = this;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.pause();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m44946constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void onStatePlay() {
        Unit unit;
        Logger.INSTANCE.m43467d(TAG, "track event: onStatePlay");
        try {
            Result.Companion companion = Result.INSTANCE;
            NativeOMTracker nativeOMTracker = this;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.resume();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m44946constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void onUserInteraction() {
        Unit unit;
        Logger.INSTANCE.m43467d(TAG, "track event: onUserInteraction");
        try {
            Result.Companion companion = Result.INSTANCE;
            NativeOMTracker nativeOMTracker = this;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m44946constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void start(View view) {
        Object objM44946constructorimpl;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(view, "view");
        Logger.INSTANCE.m43467d(TAG, "start OM tracker");
        try {
            Result.Companion companion = Result.INSTANCE;
            NativeOMTracker nativeOMTracker = this;
            AdSession adSession = this.adSession;
            if (adSession != null) {
                this.adEvents = AdEvents.createAdEvents(adSession);
                if (this.isNativeVideo) {
                    this.mediaEvents = MediaEvents.createMediaEvents(adSession);
                }
                adSession.registerAdView(view);
                adSession.start();
                if (this.isNativeVideo) {
                    VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(false, Position.STANDALONE);
                    AdEvents adEvents = this.adEvents;
                    if (adEvents != null) {
                        adEvents.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                    }
                } else {
                    AdEvents adEvents2 = this.adEvents;
                    if (adEvents2 != null) {
                        adEvents2.loaded();
                    }
                }
                numValueOf = Integer.valueOf(Logger.INSTANCE.m43467d(TAG, "track event: loaded"));
            } else {
                numValueOf = null;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(numValueOf);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            Logger.INSTANCE.m43469e(TAG, "error occured when start omsdk adSession:", thM44949exceptionOrNullimpl);
        }
    }

    public final void stop() {
        AdSession adSession = this.adSession;
        if (adSession != null) {
            adSession.finish();
        }
        this.adSession = null;
        this.adEvents = null;
        this.mediaEvents = null;
    }
}
