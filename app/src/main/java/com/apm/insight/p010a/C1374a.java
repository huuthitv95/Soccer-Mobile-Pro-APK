package com.apm.insight.p010a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.p011b.C1384i;
import com.apm.insight.runtime.C1471m;

/* JADX INFO: renamed from: com.apm.insight.a.a */
/* JADX INFO: compiled from: AlogUploadManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1374a implements ICrashCallback {

    /* JADX INFO: renamed from: d */
    private static volatile C1374a f367d;

    /* JADX INFO: renamed from: a */
    private volatile String f368a;

    /* JADX INFO: renamed from: b */
    private volatile C1384i.a f369b;

    /* JADX INFO: renamed from: c */
    private volatile C1384i.a f370c;

    /* JADX INFO: renamed from: e */
    private volatile boolean f371e = false;

    private C1374a() {
    }

    /* JADX INFO: renamed from: a */
    public static C1374a m898a() {
        if (f367d == null) {
            synchronized (C1374a.class) {
                if (f367d == null) {
                    f367d = new C1374a();
                }
            }
        }
        return f367d;
    }

    /* JADX INFO: renamed from: a */
    public final void m899a(String str, C1384i.a aVar, C1384i.a aVar2) {
        this.f368a = str;
        this.f369b = aVar;
        this.f370c = aVar2;
        if (this.f371e) {
            return;
        }
        this.f371e = true;
        C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }
}
