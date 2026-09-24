package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes7.dex */
public interface InitListener {
    void onInitFailed(IronSourceError ironSourceError);

    void onInitSuccess();
}
