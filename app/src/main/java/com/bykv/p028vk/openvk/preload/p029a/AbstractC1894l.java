package com.bykv.p028vk.openvk.preload.p029a;

import com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.l */
/* JADX INFO: compiled from: SubBranchInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1894l<IN, OUT> extends AbstractC1886d<IN, OUT> {

    /* JADX INFO: renamed from: d */
    private Map<String, a> f4280d;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.l$a */
    /* JADX INFO: compiled from: SubBranchInterceptor.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        List<C1890h> f4281a = new ArrayList();

        /* JADX INFO: renamed from: a */
        public final a m5877a(C1890h c1890h) {
            this.f4281a.add(c1890h);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5878a(List<C1890h> list) {
            this.f4281a.addAll(list);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.l$b */
    /* JADX INFO: compiled from: SubBranchInterceptor.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private Map<String, a> f4282a = new HashMap();

        /* JADX INFO: renamed from: b */
        private AbstractC1883a f4283b;

        /* JADX INFO: renamed from: a */
        public final C1890h m5879a(Class<? extends AbstractC1894l> cls) {
            return C1890h.a.m5860a().m5865a(cls).m5866a(this.f4282a).m5864a(this.f4283b).m5867b();
        }

        /* JADX INFO: renamed from: a */
        public final a m5880a(String str) {
            if (this.f4282a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f4282a.put(str, aVar);
            return aVar;
        }
    }

    AbstractC1894l() {
    }

    /* JADX INFO: renamed from: a */
    static boolean m5875a(List<C1890h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f4268a == C1888f.class;
    }

    /* JADX INFO: renamed from: a */
    final Map<String, a> m5876a() {
        return this.f4280d;
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    protected final void mo5848a(Object... objArr) {
        Object obj;
        super.mo5848a(objArr);
        if (objArr == null || objArr.length != 1 || (obj = objArr[0]) == null) {
            throw new IllegalStateException("args error");
        }
        try {
            this.f4280d = (Map) obj;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
