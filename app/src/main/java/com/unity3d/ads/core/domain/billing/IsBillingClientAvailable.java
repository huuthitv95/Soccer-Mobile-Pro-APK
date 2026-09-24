package com.unity3d.ads.core.domain.billing;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: compiled from: IsBillingClientAvailable.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0005"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "", "()V", "invoke", "", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            IsBillingClientAvailable isBillingClientAvailable = this;
            objM44946constructorimpl = Result.m44946constructorimpl(Class.forName("com.android.billingclient.api.BillingClient"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m44953isSuccessimpl(objM44946constructorimpl);
    }
}
