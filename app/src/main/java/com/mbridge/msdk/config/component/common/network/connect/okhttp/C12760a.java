package com.mbridge.msdk.config.component.common.network.connect.okhttp;

import android.util.Log;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.config.component.common.network.InterfaceC12757a;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerOKHttp;
import com.mbridge.msdk.config.component.common.network.result.C12764a;
import com.mbridge.msdk.config.component.common.network.retry.C12767c;
import com.mbridge.msdk.config.component.common.network.retry.InterfaceC12765a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.nori.model.C12831a;
import com.mbridge.msdk.config.component.nori.monitor.C12832a;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.thrid.okhttp.AbstractC13790z;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13720i;
import com.mbridge.msdk.thrid.okhttp.C13777m;
import com.mbridge.msdk.thrid.okhttp.C13780p;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13716e;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.connect.okhttp.a */
/* JADX INFO: compiled from: ConnectionOkHttpClient.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12760a {

    /* JADX INFO: renamed from: h */
    private static volatile C13786v f33941h;

    /* JADX INFO: renamed from: a */
    private C12831a f33942a;

    /* JADX INFO: renamed from: b */
    private C12764a f33943b;

    /* JADX INFO: renamed from: c */
    private InterfaceC12757a f33944c;

    /* JADX INFO: renamed from: d */
    private InterfaceC12765a f33945d;

    /* JADX INFO: renamed from: e */
    private C12832a f33946e;

    /* JADX INFO: renamed from: f */
    private String f33947f;

    /* JADX INFO: renamed from: g */
    private InterfaceC13714d f33948g;

    public C12760a(C12831a c12831a, C12764a c12764a, InterfaceC12757a interfaceC12757a) {
        this.f33942a = c12831a;
        this.f33943b = c12764a;
        this.f33944c = interfaceC12757a;
        this.f33946e = c12764a.m35157b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m35120c() {
        if (this.f33944c == null) {
            return;
        }
        if (C12770c.m35208a(this.f33943b.m35165g())) {
            this.f33944c.mo35102b(this.f33943b);
            return;
        }
        if (this.f33943b.m35165g() == 200) {
            this.f33944c.mo35103c(this.f33943b);
            InterfaceC12765a interfaceC12765a = this.f33945d;
            if (interfaceC12765a != null) {
                interfaceC12765a.mo35167a();
                return;
            }
            return;
        }
        InterfaceC12765a interfaceC12765a2 = this.f33945d;
        if (interfaceC12765a2 != null) {
            interfaceC12765a2.mo35168b();
        } else if (this.f33942a.m35638g() <= 0) {
            this.f33944c.mo35104d(this.f33943b);
        } else {
            this.f33946e.m35649a(true);
            new C12767c(this.f33947f, this.f33942a, this.f33944c, this.f33943b).m35181c();
        }
    }

    /* JADX INFO: renamed from: b */
    private static C13786v m35117b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C13777m c13777m = new C13777m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, new SynchronousQueue(), C13723c.m40279a("OkHttp Dispatcher", false)));
        c13777m.m40685b(50);
        c13777m.m40682a(256);
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC13787w.HTTP_1_1);
        arrayList.add(EnumC13787w.HTTP_2);
        return new C13786v.b().m40803a(arrayList).m40799a(new C13720i(32, 5L, TimeUnit.MINUTES)).m40800a(c13777m).m40807b(30L, timeUnit).m40810d(30L, timeUnit).m40811e(30L, timeUnit).m40806a();
    }

    /* JADX INFO: renamed from: a */
    public C12764a m35121a(String str) {
        this.f33947f = str;
        C12832a c12832a = this.f33946e;
        if (c12832a != null) {
            c12832a.m35662m();
        }
        InterfaceC13714d interfaceC13714dM35116b = m35116b(str, this.f33942a);
        this.f33948g = interfaceC13714dM35116b;
        if (interfaceC13714dM35116b != null) {
            interfaceC13714dM35116b.mo40224a(new a());
            return this.f33943b;
        }
        C13219q0.m37816b("OkHttpClientConnection", "");
        this.f33943b.m35161c(1002);
        this.f33943b.m35152a(1002);
        this.f33943b.m35155a("create Call fail");
        m35120c();
        return this.f33943b;
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC13714d m35116b(String str, C12831a c12831a) {
        try {
            if (f33941h == null) {
                f33941h = m35117b();
            }
            C13786v c13786vM40806a = f33941h.m40790s().m40802a(new EventListenerOKHttp(this.f33946e)).m40804a(new MBridgeHostnameVerifier(str)).m40798a(Math.max(c12831a.m35642k(), 30L), TimeUnit.SECONDS).m40805a(false).m40806a();
            m35114a(c13786vM40806a);
            return c13786vM40806a.m40774a(m35113a(str, c12831a));
        } catch (Exception e) {
            C13219q0.m37816b("OkHttpClientConnection", "Failed to create request: " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.connect.okhttp.a$a */
    /* JADX INFO: compiled from: ConnectionOkHttpClient.java */
    class a implements InterfaceC13716e {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13716e
        /* JADX INFO: renamed from: a */
        public void mo35125a(InterfaceC13714d interfaceC13714d, IOException iOException) {
            if (interfaceC13714d.mo40226h()) {
                C12760a.this.f33943b.m35155a("Request was cancelled");
            } else if (iOException instanceof SocketTimeoutException) {
                C12760a.this.f33943b.m35161c(1001);
                C12760a.this.f33943b.m35152a(1001);
                C12760a.this.f33943b.m35155a("Connection timeout: " + iOException.getMessage());
            } else if (iOException instanceof UnknownHostException) {
                C12760a.this.f33943b.m35161c(1011);
                C12760a.this.f33943b.m35152a(1011);
                C12760a.this.f33943b.m35155a("Host unreachable: " + iOException.getMessage());
            } else if (iOException instanceof ConnectException) {
                C12760a.this.f33943b.m35161c(1002);
                C12760a.this.f33943b.m35152a(1002);
                C12760a.this.f33943b.m35155a("Connection refused: " + iOException.getMessage());
            } else {
                C12760a.this.f33943b.m35161c(1003);
                C12760a.this.f33943b.m35152a(1003);
                C12760a.this.f33943b.m35155a("Network error: " + iOException.getMessage());
            }
            C12760a.this.f33943b.m35158b(2);
            C12760a.this.m35120c();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13716e
        /* JADX INFO: renamed from: a */
        public void mo35124a(InterfaceC13714d interfaceC13714d, C13709a0 c13709a0) throws IOException {
            C12760a.this.f33943b.m35161c(c13709a0.m40169k());
            C12760a.this.f33943b.m35155a(c13709a0.m40173o());
            if (C12770c.m35208a(c13709a0.m40169k())) {
                String strM40166b = c13709a0.m40166b(HttpHeaders.LOCATION);
                if (strM40166b != null && !strM40166b.isEmpty()) {
                    C12760a.this.f33943b.m35159b(strM40166b);
                    C12760a.this.f33943b.m35158b(1);
                    Log.d("OkHttpClientConnection", "Redirect to: " + strM40166b);
                }
            } else if (c13709a0.m40167d() == null) {
                C12760a.this.f33943b.m35158b(2);
                C12760a.this.f33943b.m35155a("Response body is null");
                Log.e("OkHttpClientConnection", "Response body is null");
            } else {
                String strM40204n = c13709a0.m40167d().m40204n();
                C12760a.this.f33943b.m35159b(strM40204n);
                C12760a.this.f33943b.m35158b(1);
                StringBuilder sb = new StringBuilder("Response data length: ");
                sb.append(strM40204n != null ? strM40204n.length() : 0);
                Log.d("OkHttpClientConnection", sb.toString());
            }
            c13709a0.close();
            C12760a.this.m35120c();
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m35119b(C13789y.a aVar, C12831a c12831a) throws IOException {
        String strM35636e = c12831a.m35636e();
        if (strM35636e != null) {
            String upperCase = strM35636e.toUpperCase();
            upperCase.hashCode();
            upperCase.hashCode();
            switch (upperCase) {
                case "OPTIONS":
                    aVar.m40837a("OPTIONS", (AbstractC13790z) null);
                    return;
                case "GET":
                    aVar.m40844c();
                    return;
                case "PUT":
                    Map<String, Object> mapM35619a = c12831a.m35619a();
                    if (mapM35619a == null || mapM35619a.isEmpty()) {
                        return;
                    }
                    C13780p.a aVar2 = new C13780p.a();
                    for (Map.Entry<String, Object> entry : mapM35619a.entrySet()) {
                        aVar2.m40695a(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    aVar.m40847d(aVar2.m40696a());
                    return;
                case "HEAD":
                    aVar.m40846d();
                    return;
                case "POST":
                    Map<String, Object> mapM35619a2 = c12831a.m35619a();
                    C13780p.a aVar3 = new C13780p.a();
                    if (mapM35619a2 != null && !mapM35619a2.isEmpty()) {
                        for (Map.Entry<String, Object> entry2 : mapM35619a2.entrySet()) {
                            aVar3.m40695a(entry2.getKey(), String.valueOf(entry2.getValue()));
                        }
                    }
                    aVar.m40845c(aVar3.m40696a());
                    return;
                case "PATCH":
                    Map<String, Object> mapM35619a3 = c12831a.m35619a();
                    if (mapM35619a3 == null || mapM35619a3.isEmpty()) {
                        return;
                    }
                    C13780p.a aVar4 = new C13780p.a();
                    for (Map.Entry<String, Object> entry3 : mapM35619a3.entrySet()) {
                        aVar4.m40695a(entry3.getKey(), String.valueOf(entry3.getValue()));
                    }
                    aVar.m40841b(aVar4.m40696a());
                    return;
                case "TRACE":
                    aVar.m40837a("TRACE", (AbstractC13790z) null);
                    return;
                case "DELETE":
                    aVar.m40840b();
                    return;
                default:
                    throw new IllegalStateException("Unknown method type: " + strM35636e);
            }
        }
        throw new IOException("Request method cannot be null");
    }

    /* JADX INFO: renamed from: a */
    public void m35122a() {
        if (this.f33948g != null) {
            C13219q0.m37816b("OkHttpClientConnection", "取消当前重试任务");
            this.f33948g.cancel();
        }
    }

    /* JADX INFO: renamed from: a */
    private static C13789y m35113a(String str, C12831a c12831a) {
        C13789y.a aVarM40842b = new C13789y.a().m40842b(str);
        m35115a(aVarM40842b, c12831a);
        try {
            m35119b(aVarM40842b, c12831a);
        } catch (IOException e) {
            C13219q0.m37816b("OkHttpClientConnection", "Failed to set connection parameters: " + e.getMessage());
        }
        return aVarM40842b.m40839a();
    }

    /* JADX INFO: renamed from: a */
    private static void m35115a(C13789y.a aVar, C12831a c12831a) {
        Map<String, Object> mapM35625b = c12831a.m35625b();
        if (mapM35625b != null && !mapM35625b.isEmpty()) {
            for (Map.Entry<String, Object> entry : mapM35625b.entrySet()) {
                aVar.m40843b(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        aVar.m40838a(HttpHeaders.CONNECTION, "close");
    }

    /* JADX INFO: renamed from: a */
    public void m35123a(InterfaceC12765a interfaceC12765a) {
        this.f33945d = interfaceC12765a;
    }

    /* JADX INFO: renamed from: a */
    private void m35114a(C13786v c13786v) {
        if (this.f33946e == null || c13786v == null) {
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) c13786v.m40781j().m40681a();
        this.f33946e.m35645a(threadPoolExecutor.getPoolSize(), threadPoolExecutor.getActiveCount(), threadPoolExecutor.getQueue().size());
    }
}
