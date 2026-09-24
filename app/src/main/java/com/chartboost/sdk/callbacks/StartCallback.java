package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.StartError;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m43475d2 = {"Lcom/chartboost/sdk/callbacks/StartCallback;", "", "onStartCompleted", "", "error", "Lcom/chartboost/sdk/events/StartError;", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
public interface StartCallback {
    void onStartCompleted(StartError error);
}
