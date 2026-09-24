package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.devicevolume.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11230d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    private final Context f23505a;

    /* JADX INFO: renamed from: b */
    private final AudioManager f23506b;

    /* JADX INFO: renamed from: c */
    private final C11227a f23507c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC11229c f23508d;

    /* JADX INFO: renamed from: e */
    private float f23509e;

    public C11230d(Handler handler, Context context, C11227a c11227a, InterfaceC11229c interfaceC11229c) {
        super(handler);
        this.f23505a = context;
        this.f23506b = (AudioManager) context.getSystemService("audio");
        this.f23507c = c11227a;
        this.f23508d = interfaceC11229c;
    }

    /* JADX INFO: renamed from: a */
    private float m24728a() {
        return this.f23507c.m24725a(this.f23506b.getStreamVolume(3), this.f23506b.getStreamMaxVolume(3));
    }

    /* JADX INFO: renamed from: a */
    private boolean m24729a(float f) {
        return f != this.f23509e;
    }

    /* JADX INFO: renamed from: b */
    private void m24730b() {
        this.f23508d.mo24727a(this.f23509e);
    }

    /* JADX INFO: renamed from: c */
    public void m24731c() {
        this.f23509e = m24728a();
        m24730b();
        this.f23505a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: d */
    public void m24732d() {
        this.f23505a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fM24728a = m24728a();
        if (m24729a(fM24728a)) {
            this.f23509e = fM24728a;
            m24730b();
        }
    }
}
