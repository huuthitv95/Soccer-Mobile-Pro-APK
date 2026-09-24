package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.C9949aa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.z */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10127z {

    /* JADX INFO: renamed from: a */
    private static final Map f22426a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Context f22427b;

    /* JADX INFO: renamed from: c */
    private final C10116o f22428c;

    /* JADX INFO: renamed from: d */
    private final String f22429d;

    /* JADX INFO: renamed from: h */
    private boolean f22433h;

    /* JADX INFO: renamed from: i */
    private final Intent f22434i;

    /* JADX INFO: renamed from: m */
    private ServiceConnection f22438m;

    /* JADX INFO: renamed from: n */
    private IInterface f22439n;

    /* JADX INFO: renamed from: o */
    private final C9949aa f22440o;

    /* JADX INFO: renamed from: e */
    private final List f22430e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final Set f22431f = new HashSet();

    /* JADX INFO: renamed from: g */
    private final Object f22432g = new Object();

    /* JADX INFO: renamed from: k */
    private final IBinder.DeathRecipient f22436k = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.assetpacks.internal.q
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C10127z.m22764j(this.f22415a);
        }
    };

    /* JADX INFO: renamed from: l */
    private final AtomicInteger f22437l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    private final WeakReference f22435j = new WeakReference(null);

    public C10127z(Context context, C10116o c10116o, String str, Intent intent, C9949aa c9949aa, InterfaceC10122u interfaceC10122u) {
        this.f22427b = context;
        this.f22428c = c10116o;
        this.f22429d = str;
        this.f22434i = intent;
        this.f22440o = c9949aa;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m22764j(C10127z c10127z) {
        c10127z.f22428c.m22752d("reportBinderDeath", new Object[0]);
        InterfaceC10122u interfaceC10122u = (InterfaceC10122u) c10127z.f22435j.get();
        if (interfaceC10122u != null) {
            c10127z.f22428c.m22752d("calling onBinderDied", new Object[0]);
            interfaceC10122u.m22756a();
        } else {
            c10127z.f22428c.m22752d("%s : Binder has died.", c10127z.f22429d);
            Iterator it = c10127z.f22430e.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC10117p) it.next()).m22755c(c10127z.m22773v());
            }
            c10127z.f22430e.clear();
        }
        synchronized (c10127z.f22432g) {
            c10127z.m22774w();
        }
    }

    /* JADX INFO: renamed from: n */
    static /* bridge */ /* synthetic */ void m22768n(final C10127z c10127z, final TaskCompletionSource taskCompletionSource) {
        c10127z.f22431f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.assetpacks.internal.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f22416a.m22778t(taskCompletionSource, task);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    static /* bridge */ /* synthetic */ void m22770p(C10127z c10127z, AbstractRunnableC10117p abstractRunnableC10117p) {
        if (c10127z.f22439n != null || c10127z.f22433h) {
            if (!c10127z.f22433h) {
                abstractRunnableC10117p.run();
                return;
            } else {
                c10127z.f22428c.m22752d("Waiting to bind to the service.", new Object[0]);
                c10127z.f22430e.add(abstractRunnableC10117p);
                return;
            }
        }
        c10127z.f22428c.m22752d("Initiate binding to the service.", new Object[0]);
        c10127z.f22430e.add(abstractRunnableC10117p);
        ServiceConnectionC10126y serviceConnectionC10126y = new ServiceConnectionC10126y(c10127z, null);
        c10127z.f22438m = serviceConnectionC10126y;
        c10127z.f22433h = true;
        if (c10127z.f22427b.bindService(c10127z.f22434i, serviceConnectionC10126y, 1)) {
            return;
        }
        c10127z.f22428c.m22752d("Failed to bind to the service.", new Object[0]);
        c10127z.f22433h = false;
        Iterator it = c10127z.f22430e.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC10117p) it.next()).m22755c(new C10081aa());
        }
        c10127z.f22430e.clear();
    }

    /* JADX INFO: renamed from: q */
    static /* bridge */ /* synthetic */ void m22771q(C10127z c10127z) {
        c10127z.f22428c.m22752d("linkToDeath", new Object[0]);
        try {
            c10127z.f22439n.asBinder().linkToDeath(c10127z.f22436k, 0);
        } catch (RemoteException e) {
            c10127z.f22428c.m22751c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: r */
    static /* bridge */ /* synthetic */ void m22772r(C10127z c10127z) {
        c10127z.f22428c.m22752d("unlinkToDeath", new Object[0]);
        c10127z.f22439n.asBinder().unlinkToDeath(c10127z.f22436k, 0);
    }

    /* JADX INFO: renamed from: v */
    private final RemoteException m22773v() {
        return new RemoteException(String.valueOf(this.f22429d).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m22774w() {
        Iterator it = this.f22431f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m22773v());
        }
        this.f22431f.clear();
    }

    /* JADX INFO: renamed from: c */
    public final Handler m22775c() {
        Handler handler;
        Map map = f22426a;
        synchronized (map) {
            if (!map.containsKey(this.f22429d)) {
                HandlerThread handlerThread = new HandlerThread(this.f22429d, 10);
                handlerThread.start();
                map.put(this.f22429d, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f22429d);
        }
        return handler;
    }

    /* JADX INFO: renamed from: e */
    public final IInterface m22776e() {
        return this.f22439n;
    }

    /* JADX INFO: renamed from: s */
    public final void m22777s(AbstractRunnableC10117p abstractRunnableC10117p, TaskCompletionSource taskCompletionSource) {
        m22775c().post(new C10120s(this, abstractRunnableC10117p.m22754b(), taskCompletionSource, abstractRunnableC10117p));
    }

    /* JADX INFO: renamed from: t */
    final /* synthetic */ void m22778t(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f22432g) {
            this.f22431f.remove(taskCompletionSource);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m22779u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f22432g) {
            this.f22431f.remove(taskCompletionSource);
        }
        m22775c().post(new C10121t(this));
    }
}
