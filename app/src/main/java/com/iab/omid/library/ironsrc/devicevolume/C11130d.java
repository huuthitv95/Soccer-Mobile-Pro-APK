package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.devicevolume.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11130d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    private final Context f23234a;

    /* JADX INFO: renamed from: b */
    private final AudioManager f23235b;

    /* JADX INFO: renamed from: c */
    private final C11127a f23236c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC11129c f23237d;

    /* JADX INFO: renamed from: e */
    private float f23238e;

    public C11130d(Handler handler, Context context, C11127a c11127a, InterfaceC11129c interfaceC11129c) {
        super(handler);
        this.f23234a = context;
        this.f23235b = (AudioManager) context.getSystemService("audio");
        this.f23236c = c11127a;
        this.f23237d = interfaceC11129c;
    }

    /* JADX INFO: renamed from: a */
    private float m24219a() {
        return this.f23236c.m24216a(this.f23235b.getStreamVolume(3), this.f23235b.getStreamMaxVolume(3));
    }

    /* JADX INFO: renamed from: a */
    private boolean m24220a(float f) {
        return f != this.f23238e;
    }

    /* JADX INFO: renamed from: b */
    private void m24221b() {
        this.f23237d.mo24218a(this.f23238e);
    }

    /* JADX INFO: renamed from: c */
    public void m24222c() {
        this.f23238e = m24219a();
        m24221b();
        this.f23234a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: d */
    public void m24223d() {
        this.f23234a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fM24219a = m24219a();
        if (m24220a(fM24219a)) {
            this.f23238e = fM24219a;
            m24221b();
        }
    }
}
