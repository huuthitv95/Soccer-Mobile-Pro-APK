package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.m */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC7823m implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f17497a;

    public ViewOnClickListenerC7823m(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f17497a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f17497a.finish();
    }
}
