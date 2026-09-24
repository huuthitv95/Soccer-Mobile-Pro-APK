package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.internal.C10112k;
import com.google.android.play.core.assetpacks.internal.C10116o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ci */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class ServiceConnectionC10011ci implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final C10116o f22173a = new C10116o("ExtractionForegroundServiceConnection");

    /* JADX INFO: renamed from: b */
    private final List f22174b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final Context f22175c;

    /* JADX INFO: renamed from: d */
    private ExtractionForegroundService f22176d;

    /* JADX INFO: renamed from: e */
    private Notification f22177e;

    ServiceConnectionC10011ci(Context context) {
        this.f22175c = context;
    }

    /* JADX INFO: renamed from: d */
    private final void m22617d() {
        ArrayList arrayList;
        synchronized (this.f22174b) {
            arrayList = new ArrayList(this.f22174b);
            this.f22174b.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C10112k) arrayList.get(i)).m22740e(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f22173a.m22750b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m22618a(Notification notification) {
        this.f22177e = notification;
    }

    /* JADX INFO: renamed from: b */
    final void m22619b() {
        this.f22173a.m22749a("Stopping foreground installation service.", new Object[0]);
        this.f22175c.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.f22176d;
        if (extractionForegroundService != null) {
            extractionForegroundService.m22479a();
        }
        m22617d();
    }

    /* JADX INFO: renamed from: c */
    final void m22620c(C10112k c10112k) {
        synchronized (this.f22174b) {
            this.f22174b.add(c10112k);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f22173a.m22749a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((BinderC10010ch) iBinder).f22172a;
        this.f22176d = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f22177e);
        m22617d();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
