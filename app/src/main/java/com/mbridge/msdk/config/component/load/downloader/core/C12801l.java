package com.mbridge.msdk.config.component.load.downloader.core;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import com.mbridge.msdk.config.component.database.C12771a;
import com.mbridge.msdk.config.component.load.downloader.C12812f;
import com.mbridge.msdk.config.component.load.downloader.database.C12807a;
import com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c;
import com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12810d;
import com.mbridge.msdk.config.component.load.downloader.utils.C12818a;
import com.mbridge.msdk.thrid.okhttp.C13720i;
import com.mbridge.msdk.thrid.okhttp.C13777m;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.l */
/* JADX INFO: compiled from: GlobalComponent.java */
/* JADX INFO: loaded from: classes5.dex */
public final class C12801l {

    /* JADX INFO: renamed from: e */
    private static volatile C12801l f34163e;

    /* JADX INFO: renamed from: a */
    private int f34164a = 4096;

    /* JADX INFO: renamed from: b */
    private C12812f f34165b;

    /* JADX INFO: renamed from: c */
    private InterfaceC12809c f34166c;

    /* JADX INFO: renamed from: d */
    private volatile C13786v f34167d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.l$a */
    /* JADX INFO: compiled from: GlobalComponent.java */
    class a implements InterfaceC12810d {
        a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12810d
        public SQLiteDatabase getWritableDatabase() {
            return C12771a.m35212a().m35213a(true);
        }
    }

    private C12801l() {
    }

    /* JADX INFO: renamed from: c */
    public static C12801l m35424c() {
        if (C12818a.m35509b(f34163e)) {
            synchronized (C12801l.class) {
                if (C12818a.m35509b(f34163e)) {
                    f34163e = new C12801l();
                }
            }
        }
        return f34163e;
    }

    /* JADX INFO: renamed from: e */
    private void m35425e() {
        HandlerThread handlerThread = new HandlerThread("mb_db_thread");
        handlerThread.start();
        this.f34166c = new C12807a(new Handler(handlerThread.getLooper()), new a());
    }

    /* JADX INFO: renamed from: a */
    public int m35426a() {
        return this.f34164a;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12809c m35428b() {
        return this.f34166c;
    }

    /* JADX INFO: renamed from: d */
    public C13786v m35429d() {
        if (this.f34167d == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(EnumC13787w.HTTP_1_1);
            C13777m c13777m = new C13777m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C13723c.m40279a("OkHttp Dispatcher", false)));
            c13777m.m40682a(this.f34165b.m35479f());
            c13777m.m40685b(this.f34165b.m35480g());
            C13786v.b bVar = new C13786v.b();
            long jM35474a = this.f34165b.m35474a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f34167d = bVar.m40807b(jM35474a, timeUnit).m40810d(this.f34165b.m35474a(), timeUnit).m40811e(this.f34165b.m35477d(), timeUnit).m40800a(c13777m).m40809c(this.f34165b.m35475b(), timeUnit).m40808b(true).m40799a(new C13720i(32, 5L, TimeUnit.MINUTES)).m40803a(arrayList).m40806a();
        }
        return this.f34167d;
    }

    /* JADX INFO: renamed from: a */
    public void m35427a(C12812f c12812f) {
        this.f34165b = c12812f;
        m35425e();
    }
}
