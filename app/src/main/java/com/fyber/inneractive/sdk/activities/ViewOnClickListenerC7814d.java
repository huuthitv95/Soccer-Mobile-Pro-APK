package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.d */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC7814d implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveFullscreenAdActivity f17488a;

    public ViewOnClickListenerC7814d(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f17488a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f17488a.dismissAd(true);
    }
}
