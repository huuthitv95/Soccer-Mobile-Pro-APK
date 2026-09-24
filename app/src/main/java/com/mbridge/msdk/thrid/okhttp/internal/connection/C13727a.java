package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13784t;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13741g;
import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.connection.a */
/* JADX INFO: compiled from: ConnectInterceptor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13727a implements InterfaceC13784t {

    /* JADX INFO: renamed from: a */
    public final C13786v f38806a;

    public C13727a(C13786v c13786v) {
        this.f38806a = c13786v;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t
    /* JADX INFO: renamed from: a */
    public C13709a0 mo40305a(InterfaceC13784t.a aVar) throws IOException {
        C13741g c13741g = (C13741g) aVar;
        C13789y c13789yMo40397d = c13741g.mo40397d();
        C13733g c13733gM40402i = c13741g.m40402i();
        return c13741g.m40394a(c13789yMo40397d, c13733gM40402i, c13733gM40402i.m40356a(this.f38806a, aVar, !c13789yMo40397d.m40829e().equals("GET")), c13733gM40402i.m40363c());
    }
}
