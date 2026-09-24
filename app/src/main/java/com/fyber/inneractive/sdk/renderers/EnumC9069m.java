package com.fyber.inneractive.sdk.renderers;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.m */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC9069m {
    BANNER_WIDTH(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE),
    BANNER_HEIGHT(50),
    BANNER_TABLET_HEIGHT(90),
    BANNER_TABLET_WIDTH(728),
    RECTANGLE_HEIGHT(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION),
    RECTANGLE_WIDTH(300);

    final int value;

    EnumC9069m(int i) {
        this.value = i;
    }
}
