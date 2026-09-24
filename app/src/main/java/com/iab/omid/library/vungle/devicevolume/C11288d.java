package com.iab.omid.library.vungle.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.devicevolume.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11288d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    private final Handler f23651a;

    /* JADX INFO: renamed from: b */
    private final Context f23652b;

    /* JADX INFO: renamed from: c */
    private final AudioManager f23653c;

    /* JADX INFO: renamed from: d */
    private final C11285a f23654d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC11287c f23655e;

    /* JADX INFO: renamed from: f */
    private final AtomicReference<Float> f23656f;

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f23657g;

    /* JADX INFO: renamed from: h */
    private final ExecutorService f23658h;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.devicevolume.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.vungle.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC15506a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ float f23660a;

            RunnableC15506a(float f) {
                this.f23660a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11288d.this.f23655e.mo24983a(this.f23660a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fM24984a = C11288d.this.m24984a();
            C11288d.this.f23657g.set(false);
            if (((Float) C11288d.this.f23656f.getAndSet(Float.valueOf(fM24984a))).floatValue() != fM24984a) {
                C11288d.this.f23651a.post(new RunnableC15506a(fM24984a));
            }
        }
    }

    public C11288d(Handler handler, Context context, C11285a c11285a, InterfaceC11287c interfaceC11287c) {
        super(handler);
        this.f23656f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f23657g = new AtomicBoolean(false);
        this.f23658h = Executors.newSingleThreadExecutor();
        this.f23651a = handler;
        this.f23652b = context;
        this.f23653c = (AudioManager) context.getSystemService("audio");
        this.f23654d = c11285a;
        this.f23655e = interfaceC11287c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public float m24984a() {
        return this.f23654d.m24981a(this.f23653c.getStreamVolume(3), this.f23653c.getStreamMaxVolume(3));
    }

    /* JADX INFO: renamed from: d */
    private void m24989d() {
        this.f23658h.submit(new a());
    }

    /* JADX INFO: renamed from: b */
    public void m24991b() {
        m24989d();
        this.f23652b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: c */
    public void m24992c() {
        this.f23652b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        if (this.f23657g.getAndSet(true)) {
            return;
        }
        m24989d();
    }
}
