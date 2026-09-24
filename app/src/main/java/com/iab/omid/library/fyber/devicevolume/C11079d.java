package com.iab.omid.library.fyber.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.devicevolume.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11079d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    private final Context f23099a;

    /* JADX INFO: renamed from: b */
    private final AudioManager f23100b;

    /* JADX INFO: renamed from: c */
    private final C11076a f23101c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC11078c f23102d;

    /* JADX INFO: renamed from: e */
    private float f23103e;

    public C11079d(Handler handler, Context context, C11076a c11076a, InterfaceC11078c interfaceC11078c) {
        super(handler);
        this.f23099a = context;
        this.f23100b = (AudioManager) context.getSystemService("audio");
        this.f23101c = c11076a;
        this.f23102d = interfaceC11078c;
    }

    /* JADX INFO: renamed from: a */
    private float m23966a() {
        return this.f23101c.m23963a(this.f23100b.getStreamVolume(3), this.f23100b.getStreamMaxVolume(3));
    }

    /* JADX INFO: renamed from: a */
    private boolean m23967a(float f) {
        return f != this.f23103e;
    }

    /* JADX INFO: renamed from: b */
    private void m23968b() {
        this.f23102d.mo23965a(this.f23103e);
    }

    /* JADX INFO: renamed from: c */
    public void m23969c() {
        this.f23103e = m23966a();
        m23968b();
        this.f23099a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: d */
    public void m23970d() {
        this.f23099a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fM23966a = m23966a();
        if (m23967a(fM23966a)) {
            this.f23103e = fM23966a;
            m23968b();
        }
    }
}
