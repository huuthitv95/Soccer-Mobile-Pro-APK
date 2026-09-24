package com.unity3d.mediation;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayInitRequest {

    /* JADX INFO: renamed from: a */
    private final String f41475a;

    /* JADX INFO: renamed from: b */
    private final String f41476b;

    /* JADX INFO: renamed from: c */
    private final List<LevelPlay.AdFormat> f41477c;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final String f41478a;

        /* JADX INFO: renamed from: b */
        private String f41479b;

        public Builder(String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f41478a = appKey;
        }

        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.f41478a, this.f41479b, null, 4, null);
        }

        public final String getAppKey() {
            return this.f41478a;
        }

        public final Builder withUserId(String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.f41479b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f41475a = str;
        this.f41476b = str2;
        this.f41477c = list;
    }

    /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getAppKey() {
        return this.f41475a;
    }

    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f41477c;
    }

    public final String getUserId() {
        return this.f41476b;
    }
}
