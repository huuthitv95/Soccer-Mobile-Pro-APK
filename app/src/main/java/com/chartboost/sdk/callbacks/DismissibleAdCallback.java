package com.chartboost.sdk.callbacks;

import androidx.core.app.NotificationCompat;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m43475d2 = {"Lcom/chartboost/sdk/callbacks/DismissibleAdCallback;", "Lcom/chartboost/sdk/callbacks/AdCallback;", "onAdDismiss", "", NotificationCompat.CATEGORY_EVENT, "Lcom/chartboost/sdk/events/DismissEvent;", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
public interface DismissibleAdCallback extends AdCallback {

    @Metadata(m43476k = 3, m43477mv = {1, 9, 0}, m43479xi = 48)
    public static final class DefaultImpls {
        public static void onAdExpired(DismissibleAdCallback dismissibleAdCallback, ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AdCallback.DefaultImpls.onAdExpired(dismissibleAdCallback, event);
        }
    }

    void onAdDismiss(DismissEvent event);
}
