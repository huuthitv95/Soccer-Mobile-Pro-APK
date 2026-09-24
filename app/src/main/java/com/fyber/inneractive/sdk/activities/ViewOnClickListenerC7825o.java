package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.o */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC7825o implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f17499a;

    public ViewOnClickListenerC7825o(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f17499a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f17499a.finish();
    }
}
