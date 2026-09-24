package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.n */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10115n {

    /* JADX INFO: renamed from: a */
    protected final C10116o f22407a;

    /* JADX INFO: renamed from: c */
    private final IntentFilter f22409c;

    /* JADX INFO: renamed from: d */
    private final Context f22410d;

    /* JADX INFO: renamed from: b */
    protected final Set f22408b = new HashSet();

    /* JADX INFO: renamed from: e */
    private C10114m f22411e = null;

    /* JADX INFO: renamed from: f */
    private volatile boolean f22412f = false;

    protected AbstractC10115n(C10116o c10116o, IntentFilter intentFilter, Context context) {
        this.f22407a = c10116o;
        this.f22409c = intentFilter;
        this.f22410d = C10087ag.m22706a(context);
    }

    /* JADX INFO: renamed from: a */
    private final void m22741a() {
        C10114m c10114m;
        if ((this.f22412f || !this.f22408b.isEmpty()) && this.f22411e == null) {
            this.f22411e = new C10114m(this, null);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f22410d.registerReceiver(this.f22411e, this.f22409c, 2);
            } else {
                this.f22410d.registerReceiver(this.f22411e, this.f22409c);
            }
        }
        if (this.f22412f || !this.f22408b.isEmpty() || (c10114m = this.f22411e) == null) {
            return;
        }
        this.f22410d.unregisterReceiver(c10114m);
        this.f22411e = null;
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo22533c(Context context, Intent intent);

    /* JADX INFO: renamed from: e */
    public final synchronized void m22742e() {
        this.f22407a.m22752d("clearListeners", new Object[0]);
        this.f22408b.clear();
        m22741a();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m22743f(StateUpdatedListener stateUpdatedListener) {
        this.f22407a.m22752d("registerListener", new Object[0]);
        C10090aj.m22710a(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.f22408b.add(stateUpdatedListener);
        m22741a();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m22744g(boolean z) {
        this.f22412f = z;
        m22741a();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m22745h(StateUpdatedListener stateUpdatedListener) {
        this.f22407a.m22752d("unregisterListener", new Object[0]);
        C10090aj.m22710a(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
        this.f22408b.remove(stateUpdatedListener);
        m22741a();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m22746i(Object obj) {
        Iterator it = new HashSet(this.f22408b).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).onStateUpdate(obj);
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized boolean m22747j() {
        return this.f22411e != null;
    }
}
