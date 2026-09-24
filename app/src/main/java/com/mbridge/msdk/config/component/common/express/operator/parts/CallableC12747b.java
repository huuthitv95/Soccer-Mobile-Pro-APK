package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.component.common.express.node.AbstractC12723d;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.parts.b */
/* JADX INFO: compiled from: HighLevelFutureCallable.java */
/* JADX INFO: loaded from: classes5.dex */
public class CallableC12747b implements Callable {

    /* JADX INFO: renamed from: a */
    private C12717d f33909a;

    /* JADX INFO: renamed from: b */
    private EnumC12718e f33910b;

    /* JADX INFO: renamed from: c */
    private AbstractC12723d f33911c;

    /* JADX INFO: renamed from: d */
    private C12894a f33912d;

    public CallableC12747b(C12717d c12717d, EnumC12718e enumC12718e, AbstractC12723d abstractC12723d, C12894a c12894a) {
        this.f33911c = abstractC12723d;
        this.f33909a = c12717d;
        this.f33910b = enumC12718e;
        this.f33912d = c12894a;
    }

    /* JADX INFO: renamed from: a */
    public void m35020a(Object obj) {
        this.f33912d.m36045a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.f33911c.mo34898a(this.f33909a, this.f33910b, this.f33912d);
    }
}
