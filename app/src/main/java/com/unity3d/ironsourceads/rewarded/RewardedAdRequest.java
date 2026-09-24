package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.C11682T9;
import com.ironsource.C12480sc;
import com.ironsource.InterfaceC12463rd;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class RewardedAdRequest {

    /* JADX INFO: renamed from: a */
    private final String f41438a;

    /* JADX INFO: renamed from: b */
    private final String f41439b;

    /* JADX INFO: renamed from: c */
    private final Bundle f41440c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12463rd f41441d;

    /* JADX INFO: renamed from: e */
    private final String f41442e;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final String f41443a;

        /* JADX INFO: renamed from: b */
        private final String f41444b;

        /* JADX INFO: renamed from: c */
        private Bundle f41445c;

        public Builder(String instanceId, String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.f41443a = instanceId;
            this.f41444b = adm;
        }

        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.f41443a);
            return new RewardedAdRequest(this.f41443a, this.f41444b, this.f41445c, null);
        }

        public final String getAdm() {
            return this.f41444b;
        }

        public final String getInstanceId() {
            return this.f41443a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f41445c = extraParams;
            return this;
        }
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f41438a = str;
        this.f41439b = str2;
        this.f41440c = bundle;
        this.f41441d = new C12480sc(str);
        String strM27526b = C11682T9.m27526b();
        Intrinsics.checkNotNullExpressionValue(strM27526b, "generateMultipleUniqueInstanceId()");
        this.f41442e = strM27526b;
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f41442e;
    }

    public final String getAdm() {
        return this.f41439b;
    }

    public final Bundle getExtraParams() {
        return this.f41440c;
    }

    public final String getInstanceId() {
        return this.f41438a;
    }

    public final InterfaceC12463rd getProviderName$mediationsdk_release() {
        return this.f41441d;
    }
}
