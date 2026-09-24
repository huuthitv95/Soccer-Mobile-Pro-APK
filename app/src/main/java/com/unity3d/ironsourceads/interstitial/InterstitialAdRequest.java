package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.C11682T9;
import com.ironsource.C12480sc;
import com.ironsource.InterfaceC12463rd;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class InterstitialAdRequest {

    /* JADX INFO: renamed from: a */
    private final String f41425a;

    /* JADX INFO: renamed from: b */
    private final String f41426b;

    /* JADX INFO: renamed from: c */
    private final Bundle f41427c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12463rd f41428d;

    /* JADX INFO: renamed from: e */
    private final String f41429e;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final String f41430a;

        /* JADX INFO: renamed from: b */
        private final String f41431b;

        /* JADX INFO: renamed from: c */
        private Bundle f41432c;

        public Builder(String instanceId, String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.f41430a = instanceId;
            this.f41431b = adm;
        }

        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.f41430a);
            return new InterstitialAdRequest(this.f41430a, this.f41431b, this.f41432c, null);
        }

        public final String getAdm() {
            return this.f41431b;
        }

        public final String getInstanceId() {
            return this.f41430a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f41432c = extraParams;
            return this;
        }
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f41425a = str;
        this.f41426b = str2;
        this.f41427c = bundle;
        this.f41428d = new C12480sc(str);
        String strM27526b = C11682T9.m27526b();
        Intrinsics.checkNotNullExpressionValue(strM27526b, "generateMultipleUniqueInstanceId()");
        this.f41429e = strM27526b;
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f41429e;
    }

    public final String getAdm() {
        return this.f41426b;
    }

    public final Bundle getExtraParams() {
        return this.f41427c;
    }

    public final String getInstanceId() {
        return this.f41425a;
    }

    public final InterfaceC12463rd getProviderName$mediationsdk_release() {
        return this.f41428d;
    }
}
