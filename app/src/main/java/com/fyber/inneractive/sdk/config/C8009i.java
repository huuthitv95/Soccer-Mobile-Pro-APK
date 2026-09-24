package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C8009i {

    /* JADX INFO: renamed from: a */
    public final Context f17785a;

    /* JADX INFO: renamed from: b */
    public WeakReference f17786b;

    public C8009i(Context context, Context context2) {
        C8007h c8007h = new C8007h(this);
        this.f17785a = context2;
        if (context instanceof Activity) {
            this.f17786b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(c8007h);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Context m20436a() {
        Context context = (Context) AbstractC9195v.m22024a(this.f17786b);
        return context != null ? context : this.f17785a;
    }
}
