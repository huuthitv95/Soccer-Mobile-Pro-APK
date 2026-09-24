package com.fyber.inneractive.sdk.web;

import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.RunnableC9141d;
import com.fyber.inneractive.sdk.util.RunnableC9144e;
import com.fyber.inneractive.sdk.util.ThreadFactoryC9135b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C9226e {

    /* JADX INFO: renamed from: c */
    public RunnableC9144e f21542c;

    /* JADX INFO: renamed from: d */
    public RunnableC9141d f21543d;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f21546g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f21547h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f21548i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f21549j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f21550k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AbstractC9238i f21551l;

    /* JADX INFO: renamed from: b */
    public Handler f21541b = null;

    /* JADX INFO: renamed from: e */
    public final Object f21544e = new Object();

    /* JADX INFO: renamed from: f */
    public boolean f21545f = false;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f21540a = Executors.newSingleThreadExecutor(new ThreadFactoryC9135b());

    public C9226e(AbstractC9240i1 abstractC9240i1, String str, boolean z, String str2, String str3, String str4) {
        this.f21551l = abstractC9240i1;
        this.f21546g = str;
        this.f21547h = z;
        this.f21548i = str2;
        this.f21549j = str3;
        this.f21550k = str4;
    }

    /* JADX INFO: renamed from: a */
    public final Handler m22052a() {
        if (this.f21541b == null) {
            synchronized (this.f21544e) {
                this.f21541b = new Handler(Looper.getMainLooper());
            }
        }
        return this.f21541b;
    }
}
