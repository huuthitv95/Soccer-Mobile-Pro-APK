package com.google.unity.ads.nextgen;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnityAdBase<AdT, CallbackT> {
    protected final Activity activity;

    /* JADX INFO: renamed from: ad */
    protected AdT f22624ad;
    protected final CallbackT callback;
    protected final Executor executor;

    protected UnityAdBase(Activity activity, CallbackT callback, Executor executor) {
        this.activity = activity;
        this.callback = callback;
        this.executor = executor;
    }
}
