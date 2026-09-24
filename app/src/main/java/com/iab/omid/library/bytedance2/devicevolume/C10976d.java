package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.devicevolume.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C10976d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    private final Context f22829a;

    /* JADX INFO: renamed from: b */
    private final AudioManager f22830b;

    /* JADX INFO: renamed from: c */
    private final C10973a f22831c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC10975c f22832d;

    /* JADX INFO: renamed from: e */
    private float f22833e;

    public C10976d(Handler handler, Context context, C10973a c10973a, InterfaceC10975c interfaceC10975c) {
        super(handler);
        this.f22829a = context;
        this.f22830b = (AudioManager) context.getSystemService("audio");
        this.f22831c = c10973a;
        this.f22832d = interfaceC10975c;
    }

    /* JADX INFO: renamed from: a */
    private float m23462a() {
        return this.f22831c.m23459a(this.f22830b.getStreamVolume(3), this.f22830b.getStreamMaxVolume(3));
    }

    /* JADX INFO: renamed from: a */
    private boolean m23463a(float f) {
        return f != this.f22833e;
    }

    /* JADX INFO: renamed from: b */
    private void m23464b() {
        this.f22832d.mo23461a(this.f22833e);
    }

    /* JADX INFO: renamed from: c */
    public void m23465c() {
        this.f22833e = m23462a();
        m23464b();
        this.f22829a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: d */
    public void m23466d() {
        this.f22829a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fM23462a = m23462a();
        if (m23463a(fM23462a)) {
            this.f22833e = fM23462a;
            m23464b();
        }
    }
}
