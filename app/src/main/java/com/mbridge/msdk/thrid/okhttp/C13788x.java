package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.cache.C13724a;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13727a;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13735a;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13736b;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13741g;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13744j;
import com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g;
import com.mbridge.msdk.thrid.okio.C13791a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.x */
/* JADX INFO: compiled from: RealCall.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13788x implements InterfaceC13714d {

    /* JADX INFO: renamed from: a */
    final C13786v f39266a;

    /* JADX INFO: renamed from: b */
    final C13744j f39267b;

    /* JADX INFO: renamed from: c */
    final C13791a f39268c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private AbstractC13779o f39269d;

    /* JADX INFO: renamed from: e */
    final C13789y f39270e;

    /* JADX INFO: renamed from: f */
    final boolean f39271f;

    /* JADX INFO: renamed from: g */
    private boolean f39272g;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.x$a */
    /* JADX INFO: compiled from: RealCall.java */
    class a extends C13791a {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.C13791a
        /* JADX INFO: renamed from: j */
        protected void mo40557j() {
            C13788x.this.cancel();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.x$b */
    /* JADX INFO: compiled from: RealCall.java */
    final class b extends AbstractRunnableC13722b {

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ boolean f39274d = true;

        /* JADX INFO: renamed from: b */
        private final InterfaceC13716e f39275b;

        b(InterfaceC13716e interfaceC13716e) {
            super("OkHttp %s", C13788x.this.m40819e());
            this.f39275b = interfaceC13716e;
        }

        /* JADX INFO: renamed from: a */
        void m40821a(ExecutorService executorService) {
            if (!f39274d && Thread.holdsLock(C13788x.this.f39266a.m40781j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    C13788x.this.f39269d.callFailed(C13788x.this, interruptedIOException);
                    this.f39275b.mo35125a(C13788x.this, interruptedIOException);
                    C13788x.this.f39266a.m40781j().m40686b(this);
                }
            } catch (Throwable th) {
                C13788x.this.f39266a.m40781j().m40686b(this);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        protected void mo40263b() {
            C13788x.this.f39268c.m40858h();
            boolean z = false;
            try {
                try {
                    try {
                        this.f39275b.mo35124a(C13788x.this, C13788x.this.m40818c());
                        C13788x.this.f39266a.m40781j().m40686b(this);
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        IOException iOExceptionM40816a = C13788x.this.m40816a(e);
                        if (z) {
                            C13767g.m40635d().mo40606a(4, "Callback failure for " + C13788x.this.m40820f(), iOExceptionM40816a);
                        } else {
                            C13788x.this.f39269d.callFailed(C13788x.this, iOExceptionM40816a);
                            this.f39275b.mo35125a(C13788x.this, iOExceptionM40816a);
                        }
                        C13788x.this.f39266a.m40781j().m40686b(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        C13788x.this.cancel();
                        if (!z) {
                            this.f39275b.mo35125a(C13788x.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    C13788x.this.f39266a.m40781j().m40686b(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: renamed from: c */
        C13788x m40822c() {
            return C13788x.this;
        }

        /* JADX INFO: renamed from: d */
        String m40823d() {
            return C13788x.this.f39270e.m40831g().m40738g();
        }
    }

    private C13788x(C13786v c13786v, C13789y c13789y, boolean z) {
        this.f39266a = c13786v;
        this.f39270e = c13789y;
        this.f39271f = z;
        this.f39267b = new C13744j(c13786v, z);
        a aVar = new a();
        this.f39268c = aVar;
        aVar.mo40931a(c13786v.m40775b(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    static C13788x m40814a(C13786v c13786v, C13789y c13789y, boolean z) {
        C13788x c13788x = new C13788x(c13786v, c13789y, z);
        c13788x.f39269d = c13786v.m40783l().mo40690a(c13788x);
        return c13788x;
    }

    /* JADX INFO: renamed from: a */
    private void m40815a() {
        this.f39267b.m40414a(C13767g.m40635d().mo40605a("response.body().close()"));
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    IOException m40816a(@Nullable IOException iOException) {
        if (!this.f39268c.m40859i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13714d
    /* JADX INFO: renamed from: a */
    public void mo40224a(InterfaceC13716e interfaceC13716e) {
        synchronized (this) {
            if (this.f39272g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f39272g = true;
        }
        m40815a();
        this.f39269d.callStart(this);
        this.f39266a.m40781j().m40683a(new b(interfaceC13716e));
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13788x clone() {
        return m40814a(this.f39266a, this.f39270e, this.f39271f);
    }

    /* JADX INFO: renamed from: c */
    C13709a0 m40818c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f39266a.m40787p());
        arrayList.add(this.f39267b);
        arrayList.add(new C13735a(this.f39266a.m40780i()));
        this.f39266a.m40788q();
        arrayList.add(new C13724a(null));
        arrayList.add(new C13727a(this.f39266a));
        if (!this.f39271f) {
            arrayList.addAll(this.f39266a.m40789r());
        }
        arrayList.add(new C13736b(this.f39271f));
        C13709a0 c13709a0Mo40393a = new C13741g(arrayList, null, null, null, 0, this.f39270e, this, this.f39269d, this.f39266a.m40777e(), this.f39266a.m40796y(), this.f39266a.m40772C()).mo40393a(this.f39270e);
        if (!this.f39267b.m40415b()) {
            return c13709a0Mo40393a;
        }
        C13723c.m40282a(c13709a0Mo40393a);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13714d
    public void cancel() {
        this.f39267b.m40413a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13714d
    /* JADX INFO: renamed from: d */
    public C13709a0 mo40225d() throws IOException {
        synchronized (this) {
            if (this.f39272g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f39272g = true;
        }
        m40815a();
        this.f39268c.m40858h();
        this.f39269d.callStart(this);
        try {
            try {
                this.f39266a.m40781j().m40684a(this);
                C13709a0 c13709a0M40818c = m40818c();
                if (c13709a0M40818c == null) {
                    throw new IOException("Canceled");
                }
                this.f39266a.m40781j().m40687b(this);
                return c13709a0M40818c;
            } catch (IOException e) {
                IOException iOExceptionM40816a = m40816a(e);
                this.f39269d.callFailed(this, iOExceptionM40816a);
                throw iOExceptionM40816a;
            }
        } catch (Throwable th) {
            this.f39266a.m40781j().m40687b(this);
            throw th;
        }
        this.f39266a.m40781j().m40687b(this);
        throw th;
    }

    /* JADX INFO: renamed from: e */
    String m40819e() {
        return this.f39270e.m40831g().m40743l();
    }

    /* JADX INFO: renamed from: f */
    String m40820f() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo40226h() ? "canceled " : "");
        sb.append(this.f39271f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(m40819e());
        return sb.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13714d
    /* JADX INFO: renamed from: h */
    public boolean mo40226h() {
        return this.f39267b.m40415b();
    }
}
