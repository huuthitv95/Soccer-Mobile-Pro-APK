package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.d5 */
/* JADX INFO: loaded from: classes6.dex */
public class C12145d5 implements InterfaceC12600x7 {

    /* JADX INFO: renamed from: e */
    private static final int f30201e = 5;

    /* JADX INFO: renamed from: f */
    private static C12145d5 f30202f;

    /* JADX INFO: renamed from: a */
    private HandlerC12127c5 f30203a;

    /* JADX INFO: renamed from: b */
    private final JSONObject f30204b;

    /* JADX INFO: renamed from: c */
    private Thread f30205c;

    /* JADX INFO: renamed from: d */
    private final String f30206d;

    private C12145d5(String str, C11613P7 c11613p7, JSONObject jSONObject) {
        this.f30206d = str;
        this.f30203a = new HandlerC12127c5(c11613p7.m27214a());
        this.f30204b = jSONObject;
        IronSourceStorageUtils.deleteFolder(m31286b());
        IronSourceStorageUtils.makeDir(m31286b());
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C12145d5 m31284a(String str, C11613P7 c11613p7, JSONObject jSONObject) {
        if (f30202f == null) {
            f30202f = new C12145d5(str, c11613p7, jSONObject);
        }
        return f30202f;
    }

    /* JADX INFO: renamed from: b */
    private Thread m31287b(C12601x8 c12601x8, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.f30204b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.f30204b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.f30204b.optBoolean(C11778Z3.f26663H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return m31285a(new C11797a5(c12601x8, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), zOptBoolean, m31286b()), handler);
    }

    /* JADX INFO: renamed from: c */
    public boolean m31293c() {
        Thread thread = this.f30205c;
        return thread != null && thread.isAlive();
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m31294d() {
        f30202f = null;
        HandlerC12127c5 handlerC12127c5 = this.f30203a;
        if (handlerC12127c5 != null) {
            handlerC12127c5.m31259a();
            this.f30203a = null;
        }
    }

    @Override // com.ironsource.InterfaceC12600x7
    /* JADX INFO: renamed from: a */
    public void mo31289a(InterfaceC11510Jc interfaceC11510Jc) {
        this.f30203a.m31260a(interfaceC11510Jc);
    }

    /* JADX INFO: renamed from: a */
    private Thread m31285a(C11797a5 c11797a5, Handler handler) {
        return new Thread(new RunnableC12375mf(c11797a5, handler));
    }

    @Override // com.ironsource.InterfaceC12600x7
    /* JADX INFO: renamed from: a */
    public void mo31292a(C12601x8 c12601x8, String str, int i, int i2, Handler handler) {
        m31287b(c12601x8, str, i, i2, handler).start();
    }

    @Override // com.ironsource.InterfaceC12600x7
    /* JADX INFO: renamed from: a */
    public void mo31291a(C12601x8 c12601x8, String str, int i, int i2) {
        m31287b(c12601x8, str, i, i2, this.f30203a).start();
    }

    @Override // com.ironsource.InterfaceC12600x7
    /* JADX INFO: renamed from: a */
    public void mo31290a(C12601x8 c12601x8, String str) {
        int iOptInt = this.f30204b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.f30204b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.f30204b.optBoolean(C11778Z3.f26663H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadM31285a = m31285a(new C11797a5(c12601x8, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, m31286b()), this.f30203a);
        this.f30205c = threadM31285a;
        threadM31285a.start();
    }

    /* JADX INFO: renamed from: b */
    private String m31286b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f30206d, C11778Z3.f26659D);
    }

    /* JADX INFO: renamed from: a */
    public String m31288a() {
        return this.f30206d;
    }
}
