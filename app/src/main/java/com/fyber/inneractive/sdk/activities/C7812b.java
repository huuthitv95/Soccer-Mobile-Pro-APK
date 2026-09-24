package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C7812b implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveBaseActivity f17486a;

    public C7812b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.f17486a = inneractiveBaseActivity;
    }

    public final void onBackInvoked() {
        this.f17486a.onBackPressed();
    }
}
