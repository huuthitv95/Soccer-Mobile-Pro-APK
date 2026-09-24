package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.AbstractC9183r;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.e */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC7815e implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveFullscreenAdActivity f17489a;

    public ViewOnSystemUiVisibilityChangeListenerC7815e(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f17489a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        if ((i & 2) == 0) {
            AbstractC9183r.f21478b.postDelayed(this.f17489a.mHideNavigationBarTask, 3000L);
        }
    }
}
