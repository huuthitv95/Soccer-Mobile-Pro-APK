package com.fyber.inneractive.sdk.player.controller;

import android.view.View;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.d0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC8460d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8464f0 f18832a;

    public ViewOnClickListenerC8460d0(C8464f0 c8464f0) {
        this.f18832a = c8464f0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f18832a.f18852b.dismiss();
        C8481v c8481v = this.f18832a.f18851a;
        c8481v.f18892b.m20940d(c8481v.f18891a);
    }
}
