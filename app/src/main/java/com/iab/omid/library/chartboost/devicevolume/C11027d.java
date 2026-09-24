package com.iab.omid.library.chartboost.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.devicevolume.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11027d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    private final Handler f22958a;

    /* JADX INFO: renamed from: b */
    private final Context f22959b;

    /* JADX INFO: renamed from: c */
    private final AudioManager f22960c;

    /* JADX INFO: renamed from: d */
    private final C11024a f22961d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC11026c f22962e;

    /* JADX INFO: renamed from: f */
    private final AtomicReference<Float> f22963f;

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f22964g;

    /* JADX INFO: renamed from: h */
    private final ExecutorService f22965h;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.devicevolume.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.chartboost.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC15505a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ float f22967a;

            RunnableC15505a(float f) {
                this.f22967a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11027d.this.f22962e.mo23704a(this.f22967a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fM23705a = C11027d.this.m23705a();
            C11027d.this.f22964g.set(false);
            if (((Float) C11027d.this.f22963f.getAndSet(Float.valueOf(fM23705a))).floatValue() != fM23705a) {
                C11027d.this.f22958a.post(new RunnableC15505a(fM23705a));
            }
        }
    }

    public C11027d(Handler handler, Context context, C11024a c11024a, InterfaceC11026c interfaceC11026c) {
        super(handler);
        this.f22963f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f22964g = new AtomicBoolean(false);
        this.f22965h = Executors.newSingleThreadExecutor();
        this.f22958a = handler;
        this.f22959b = context;
        this.f22960c = (AudioManager) context.getSystemService("audio");
        this.f22961d = c11024a;
        this.f22962e = interfaceC11026c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public float m23705a() {
        return this.f22961d.m23702a(this.f22960c.getStreamVolume(3), this.f22960c.getStreamMaxVolume(3));
    }

    /* JADX INFO: renamed from: d */
    private void m23710d() {
        this.f22965h.submit(new a());
    }

    /* JADX INFO: renamed from: b */
    public void m23712b() {
        m23710d();
        this.f22959b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: c */
    public void m23713c() {
        this.f22959b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        if (this.f22964g.getAndSet(true)) {
            return;
        }
        m23710d();
    }
}
