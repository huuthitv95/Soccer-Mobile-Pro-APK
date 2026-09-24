package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C11682T9;
import com.ironsource.C12480sc;
import com.ironsource.InterfaceC12463rd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class BannerAdRequest {

    /* JADX INFO: renamed from: a */
    private final Context f41393a;

    /* JADX INFO: renamed from: b */
    private final String f41394b;

    /* JADX INFO: renamed from: c */
    private final String f41395c;

    /* JADX INFO: renamed from: d */
    private final AdSize f41396d;

    /* JADX INFO: renamed from: e */
    private final Bundle f41397e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC12463rd f41398f;

    /* JADX INFO: renamed from: g */
    private final String f41399g;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final Context f41400a;

        /* JADX INFO: renamed from: b */
        private final String f41401b;

        /* JADX INFO: renamed from: c */
        private final String f41402c;

        /* JADX INFO: renamed from: d */
        private final AdSize f41403d;

        /* JADX INFO: renamed from: e */
        private Bundle f41404e;

        public Builder(Context context, String instanceId, String adm, AdSize size) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f41400a = context;
            this.f41401b = instanceId;
            this.f41402c = adm;
            this.f41403d = size;
        }

        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.f41401b + ", size: " + this.f41403d.getSizeDescription());
            return new BannerAdRequest(this.f41400a, this.f41401b, this.f41402c, this.f41403d, this.f41404e, null);
        }

        public final String getAdm() {
            return this.f41402c;
        }

        public final Context getContext() {
            return this.f41400a;
        }

        public final String getInstanceId() {
            return this.f41401b;
        }

        public final AdSize getSize() {
            return this.f41403d;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f41404e = extraParams;
            return this;
        }
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f41393a = context;
        this.f41394b = str;
        this.f41395c = str2;
        this.f41396d = adSize;
        this.f41397e = bundle;
        this.f41398f = new C12480sc(str);
        String strM27526b = C11682T9.m27526b();
        Intrinsics.checkNotNullExpressionValue(strM27526b, "generateMultipleUniqueInstanceId()");
        this.f41399g = strM27526b;
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, adSize, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f41399g;
    }

    public final String getAdm() {
        return this.f41395c;
    }

    public final Context getContext() {
        return this.f41393a;
    }

    public final Bundle getExtraParams() {
        return this.f41397e;
    }

    public final String getInstanceId() {
        return this.f41394b;
    }

    public final InterfaceC12463rd getProviderName$mediationsdk_release() {
        return this.f41398f;
    }

    public final AdSize getSize() {
        return this.f41396d;
    }
}
