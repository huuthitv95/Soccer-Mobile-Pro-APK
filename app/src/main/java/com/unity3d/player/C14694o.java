package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.unity3d.player.o */
/* JADX INFO: loaded from: classes7.dex */
final class C14694o {

    /* JADX INFO: renamed from: a */
    private UnityPlayer f41795a;

    /* JADX INFO: renamed from: c */
    private a f41797c;

    /* JADX INFO: renamed from: b */
    private Context f41796b = null;

    /* JADX INFO: renamed from: d */
    private final Semaphore f41798d = new Semaphore(0);

    /* JADX INFO: renamed from: e */
    private final Lock f41799e = new ReentrantLock();

    /* JADX INFO: renamed from: f */
    private SurfaceHolderCallbackC14693n f41800f = null;

    /* JADX INFO: renamed from: g */
    private int f41801g = 2;

    /* JADX INFO: renamed from: h */
    private boolean f41802h = false;

    /* JADX INFO: renamed from: i */
    private boolean f41803i = false;

    /* JADX INFO: renamed from: com.unity3d.player.o$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f41804a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f41805b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f41806c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f41807d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f41808e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ long f41809f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ long f41810g;

        AnonymousClass1(String str, int i, int i2, int i3, boolean z, long j, long j2) {
            this.f41804a = str;
            this.f41805b = i;
            this.f41806c = i2;
            this.f41807d = i3;
            this.f41808e = z;
            this.f41809f = j;
            this.f41810g = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C14694o.this.f41800f != null) {
                C14685f.Log(5, "Video already playing");
                C14694o.this.f41801g = 2;
                C14694o.this.f41798d.release();
            } else {
                C14694o.this.f41800f = new SurfaceHolderCallbackC14693n(C14694o.this.f41796b, this.f41804a, this.f41805b, this.f41806c, this.f41807d, this.f41808e, this.f41809f, this.f41810g, new SurfaceHolderCallbackC14693n.a() { // from class: com.unity3d.player.o.1.1
                    @Override // com.unity3d.player.SurfaceHolderCallbackC14693n.a
                    /* JADX INFO: renamed from: a */
                    public final void mo43432a(int i) {
                        C14694o.this.f41799e.lock();
                        C14694o.this.f41801g = i;
                        if (i == 3 && C14694o.this.f41803i) {
                            C14694o.this.runOnUiThread(new Runnable() { // from class: com.unity3d.player.o.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C14694o.this.m43440d();
                                    C14694o.this.f41795a.resume();
                                }
                            });
                        }
                        if (i != 0) {
                            C14694o.this.f41798d.release();
                        }
                        C14694o.this.f41799e.unlock();
                    }
                });
                if (C14694o.this.f41800f != null) {
                    C14694o.this.f41795a.addView(C14694o.this.f41800f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.player.o$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo43233a();
    }

    C14694o(UnityPlayer unityPlayer) {
        this.f41795a = null;
        this.f41795a = unityPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m43440d() {
        SurfaceHolderCallbackC14693n surfaceHolderCallbackC14693n = this.f41800f;
        if (surfaceHolderCallbackC14693n != null) {
            this.f41795a.removeViewFromPlayer(surfaceHolderCallbackC14693n);
            this.f41803i = false;
            this.f41800f.destroyPlayer();
            this.f41800f = null;
            a aVar = this.f41797c;
            if (aVar != null) {
                aVar.mo43233a();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ boolean m43444h(C14694o c14694o) {
        c14694o.f41803i = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m43445a() {
        this.f41799e.lock();
        SurfaceHolderCallbackC14693n surfaceHolderCallbackC14693n = this.f41800f;
        if (surfaceHolderCallbackC14693n != null) {
            if (this.f41801g == 0) {
                surfaceHolderCallbackC14693n.CancelOnPrepare();
            } else if (this.f41803i) {
                boolean zM43431a = surfaceHolderCallbackC14693n.m43431a();
                this.f41802h = zM43431a;
                if (!zM43431a) {
                    this.f41800f.pause();
                }
            }
        }
        this.f41799e.unlock();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43446a(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, a aVar) {
        this.f41799e.lock();
        this.f41797c = aVar;
        this.f41796b = context;
        this.f41798d.drainPermits();
        this.f41801g = 2;
        runOnUiThread(new AnonymousClass1(str, i, i2, i3, z, j, j2));
        boolean z2 = false;
        try {
            this.f41799e.unlock();
            this.f41798d.acquire();
            this.f41799e.lock();
            if (this.f41801g != 2) {
                z2 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.o.2
            @Override // java.lang.Runnable
            public final void run() {
                C14694o.this.f41795a.pause();
            }
        });
        runOnUiThread((!z2 || this.f41801g == 3) ? new Runnable() { // from class: com.unity3d.player.o.4
            @Override // java.lang.Runnable
            public final void run() {
                C14694o.this.m43440d();
                C14694o.this.f41795a.resume();
            }
        } : new Runnable() { // from class: com.unity3d.player.o.3
            @Override // java.lang.Runnable
            public final void run() {
                if (C14694o.this.f41800f != null) {
                    C14694o.this.f41795a.addViewToPlayer(C14694o.this.f41800f, true);
                    C14694o.m43444h(C14694o.this);
                    C14694o.this.f41800f.requestFocus();
                }
            }
        });
        this.f41799e.unlock();
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public final void m43447b() {
        this.f41799e.lock();
        SurfaceHolderCallbackC14693n surfaceHolderCallbackC14693n = this.f41800f;
        if (surfaceHolderCallbackC14693n != null && this.f41803i && !this.f41802h) {
            surfaceHolderCallbackC14693n.start();
        }
        this.f41799e.unlock();
    }

    /* JADX INFO: renamed from: c */
    public final void m43448c() {
        this.f41799e.lock();
        SurfaceHolderCallbackC14693n surfaceHolderCallbackC14693n = this.f41800f;
        if (surfaceHolderCallbackC14693n != null) {
            surfaceHolderCallbackC14693n.updateVideoLayout();
        }
        this.f41799e.unlock();
    }

    protected final void runOnUiThread(Runnable runnable) {
        Context context = this.f41796b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            C14685f.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
