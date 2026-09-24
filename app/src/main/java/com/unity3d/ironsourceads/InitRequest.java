package com.unity3d.ironsourceads;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class InitRequest {

    /* JADX INFO: renamed from: a */
    private final String f41381a;

    /* JADX INFO: renamed from: b */
    private final List<IronSourceAds.AdFormat> f41382b;

    /* JADX INFO: renamed from: c */
    private final LogLevel f41383c;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final String f41384a;

        /* JADX INFO: renamed from: b */
        private List<? extends IronSourceAds.AdFormat> f41385b;

        /* JADX INFO: renamed from: c */
        private LogLevel f41386c;

        public Builder(String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f41384a = appKey;
        }

        public final InitRequest build() {
            String str = this.f41384a;
            List<? extends IronSourceAds.AdFormat> listEmptyList = this.f41385b;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            LogLevel logLevel = this.f41386c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, listEmptyList, logLevel, null);
        }

        public final String getAppKey() {
            return this.f41384a;
        }

        public final Builder withLegacyAdFormats(List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.f41385b = legacyAdFormats;
            return this;
        }

        public final Builder withLogLevel(LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.f41386c = logLevel;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f41381a = str;
        this.f41382b = list;
        this.f41383c = logLevel;
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, logLevel);
    }

    public final String getAppKey() {
        return this.f41381a;
    }

    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f41382b;
    }

    public final LogLevel getLogLevel() {
        return this.f41383c;
    }
}
