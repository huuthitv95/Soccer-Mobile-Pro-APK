package com.fyber.inneractive.sdk.activities;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7813c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveFullscreenAdActivity f17487a;

    public RunnableC7813c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f17487a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17487a.isFinishing()) {
            return;
        }
        this.f17487a.hideNavigationBar();
    }
}
