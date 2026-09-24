package com.unity3d.ads.core.configuration;

import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: ForceAlternativeFlow.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m43475d2 = {"Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "", "()V", "_forceAlternativeFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "forceAlternativeFlow", "getForceAlternativeFlow", "()Z", "invoke", "", "force", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class ForceAlternativeFlow {
    private final MutableStateFlow<Boolean> _forceAlternativeFlow = StateFlowKt.MutableStateFlow(false);

    public final boolean getForceAlternativeFlow() {
        return this._forceAlternativeFlow.getValue().booleanValue();
    }

    public final void invoke(boolean force) {
        Boolean value;
        MutableStateFlow<Boolean> mutableStateFlow = this._forceAlternativeFlow;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(force)));
    }
}
