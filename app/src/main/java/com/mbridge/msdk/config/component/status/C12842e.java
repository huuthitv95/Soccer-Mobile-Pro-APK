package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.status.e */
/* JADX INFO: compiled from: MBVolumeEventPublisher.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12842e {

    /* JADX INFO: renamed from: b */
    private AudioManager f34418b;

    /* JADX INFO: renamed from: c */
    private b f34419c;

    /* JADX INFO: renamed from: a */
    private final String f34417a = "MBVolumeEventPublisher";

    /* JADX INFO: renamed from: d */
    private final List<InterfaceC12838a> f34420d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.status.e$b */
    /* JADX INFO: compiled from: MBVolumeEventPublisher.java */
    private final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                C12842e.this.m35741b();
            }
        }
    }

    public C12842e() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d != null) {
            this.f34418b = (AudioManager) contextM36542d.getApplicationContext().getSystemService("audio");
        }
        m35744c();
    }

    /* JADX INFO: renamed from: b */
    public void m35743b(InterfaceC12838a interfaceC12838a) {
        if (interfaceC12838a != null) {
            this.f34420d.remove(interfaceC12838a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m35744c() {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d != null) {
                this.f34419c = new b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                contextM36542d.registerReceiver(this.f34419c, intentFilter);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBVolumeEventPublisher", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m35745d() {
        if (this.f34420d.isEmpty()) {
            m35746e();
            this.f34418b = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m35746e() {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d != null) {
                contextM36542d.unregisterReceiver(this.f34419c);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBVolumeEventPublisher", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m35741b() {
        try {
            C12710b c12710b = new C12710b();
            c12710b.m34843b("916005");
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("volume"), String.valueOf(m35739a()));
            c12710b.m34841a(map);
            Iterator<InterfaceC12838a> it = this.f34420d.iterator();
            while (it.hasNext()) {
                it.next().mo35715a(c12710b);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBVolumeEventPublisher", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35742a(InterfaceC12838a interfaceC12838a) {
        if (this.f34420d.contains(interfaceC12838a)) {
            return;
        }
        this.f34420d.add(interfaceC12838a);
    }

    /* JADX INFO: renamed from: a */
    private double m35739a() {
        AudioManager audioManager = this.f34418b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f34418b;
        return (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
    }
}
