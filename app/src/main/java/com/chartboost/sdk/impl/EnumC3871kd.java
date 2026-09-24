package com.chartboost.sdk.impl;

import com.ironsource.C12538u;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.kd */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3871kd {
    GET_PARAMETERS("getParameters"),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION("getDefaultPosition"),
    GET_ORIENTATION_PROPERTIES("getOrientationProperties"),
    CLICK("click"),
    CLOSE("close"),
    SKIPPED("skipped"),
    VIDEO_COMPLETED("videoCompleted"),
    VIDEO_RESUMED("videoResumed"),
    VIDEO_PAUSED("videoPaused"),
    VIDEO_REPLAY("videoReplay"),
    CURRENT_VIDEO_DURATION("currentVideoDuration"),
    TOTAL_VIDEO_DURATION("totalVideoDuration"),
    SHOW("show"),
    ERROR("error"),
    WARNING("warning"),
    DEBUG("debug"),
    TRACKING("tracking"),
    OPEN_URL("openUrl"),
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    REWARD(C12538u.f32489j),
    REWARDED_VIDEO_COMPLETED("rewardedVideoCompleted"),
    PLAY_VIDEO("playVideo"),
    PAUSE_VIDEO("pauseVideo"),
    CLOSE_VIDEO("closeVideo"),
    MUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_MUTE),
    UNMUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE),
    OM_MEASUREMENT_RESOURCES("OMMeasurementResources"),
    START("start"),
    BUFFER_START("bufferStart"),
    BUFFER_END("bufferEnd"),
    VIDEO_FINISHED("videoFinished"),
    VIDEO_STARTED("videoStarted"),
    VIDEO_ENDED("videoEnded"),
    VIDEO_FAILED("videoFailed"),
    PLAYBACK_TIME("playbackTime"),
    ON_BACKGROUND("onBackground"),
    ON_FOREGROUND("onForeground");


    /* JADX INFO: renamed from: T */
    public static final /* synthetic */ EnumEntries f15093T = EnumEntriesKt.enumEntries(m18413a());

    /* JADX INFO: renamed from: c */
    public static final a f15094c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final Map f15095d;

    /* JADX INFO: renamed from: b */
    public final String f15118b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.kd$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC3871kd m18417a(String cmdName) {
            Intrinsics.checkNotNullParameter(cmdName, "cmdName");
            return (EnumC3871kd) EnumC3871kd.f15095d.get(cmdName);
        }
    }

    static {
        EnumEntries enumEntriesM18415d = m18415d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntriesM18415d, 10)), 16));
        for (Object obj : enumEntriesM18415d) {
            linkedHashMap.put(((EnumC3871kd) obj).f15118b, obj);
        }
        f15095d = linkedHashMap;
    }

    EnumC3871kd(String str) {
        this.f15118b = str;
    }

    /* JADX INFO: renamed from: d */
    public static EnumEntries m18415d() {
        return f15093T;
    }

    /* JADX INFO: renamed from: c */
    public final String m18416c() {
        return this.f15118b;
    }
}
