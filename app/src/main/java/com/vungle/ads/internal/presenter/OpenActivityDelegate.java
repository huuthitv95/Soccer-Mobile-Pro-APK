package com.vungle.ads.internal.presenter;

import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: OpenActivityDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m43475d2 = {"Lcom/vungle/ads/internal/presenter/OpenActivityDelegate;", "", "openInlineInstall", "Lkotlin/Pair;", "", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public interface OpenActivityDelegate {
    Pair<Boolean, String> openInlineInstall(Intent intent);
}
