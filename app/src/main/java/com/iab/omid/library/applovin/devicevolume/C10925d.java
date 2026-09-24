package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.devicevolume.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C10925d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    private final Context f22694a;

    /* JADX INFO: renamed from: b */
    private final AudioManager f22695b;

    /* JADX INFO: renamed from: c */
    private final C10922a f22696c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC10924c f22697d;

    /* JADX INFO: renamed from: e */
    private float f22698e;

    public C10925d(Handler handler, Context context, C10922a c10922a, InterfaceC10924c interfaceC10924c) {
        super(handler);
        this.f22694a = context;
        this.f22695b = (AudioManager) context.getSystemService("audio");
        this.f22696c = c10922a;
        this.f22697d = interfaceC10924c;
    }

    /* JADX INFO: renamed from: a */
    private float m23209a() {
        return this.f22696c.m23206a(this.f22695b.getStreamVolume(3), this.f22695b.getStreamMaxVolume(3));
    }

    /* JADX INFO: renamed from: a */
    private boolean m23210a(float f) {
        return f != this.f22698e;
    }

    /* JADX INFO: renamed from: b */
    private void m23211b() {
        this.f22697d.mo23208a(this.f22698e);
    }

    /* JADX INFO: renamed from: c */
    public void m23212c() {
        this.f22698e = m23209a();
        m23211b();
        this.f22694a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: d */
    public void m23213d() {
        this.f22694a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fM23209a = m23209a();
        if (m23210a(fM23209a)) {
            this.f22698e = fM23209a;
            m23211b();
        }
    }
}
