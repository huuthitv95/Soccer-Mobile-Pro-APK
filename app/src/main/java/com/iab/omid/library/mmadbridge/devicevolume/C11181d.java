package com.iab.omid.library.mmadbridge.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.devicevolume.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11181d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    private final Context f23369a;

    /* JADX INFO: renamed from: b */
    private final AudioManager f23370b;

    /* JADX INFO: renamed from: c */
    private final C11178a f23371c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC11180c f23372d;

    /* JADX INFO: renamed from: e */
    private float f23373e;

    public C11181d(Handler handler, Context context, C11178a c11178a, InterfaceC11180c interfaceC11180c) {
        super(handler);
        this.f23369a = context;
        this.f23370b = (AudioManager) context.getSystemService("audio");
        this.f23371c = c11178a;
        this.f23372d = interfaceC11180c;
    }

    /* JADX INFO: renamed from: a */
    private float m24472a() {
        return this.f23371c.m24469a(this.f23370b.getStreamVolume(3), this.f23370b.getStreamMaxVolume(3));
    }

    /* JADX INFO: renamed from: a */
    private boolean m24473a(float f) {
        return f != this.f23373e;
    }

    /* JADX INFO: renamed from: b */
    private void m24474b() {
        this.f23372d.mo24471a(this.f23373e);
    }

    /* JADX INFO: renamed from: c */
    public void m24475c() {
        this.f23373e = m24472a();
        m24474b();
        this.f23369a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: d */
    public void m24476d() {
        this.f23369a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fM24472a = m24472a();
        if (m24473a(fM24472a)) {
            this.f23373e = fM24472a;
            m24474b();
        }
    }
}
