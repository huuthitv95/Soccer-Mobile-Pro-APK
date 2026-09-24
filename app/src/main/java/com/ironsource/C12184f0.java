package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12184f0 implements InterfaceC12202g0 {

    /* JADX INFO: renamed from: b */
    public static final a f30361b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final String f30362c = "ext_";

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f30363a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.f0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC12202g0
    /* JADX INFO: renamed from: a */
    public void mo31402a(HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f30363a.putAll(params);
    }

    @Override // com.ironsource.InterfaceC12202g0
    /* JADX INFO: renamed from: b */
    public void mo31403b(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f30363a.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC12202g0
    public Map<String, String> get() {
        return this.f30363a;
    }

    @Override // com.ironsource.InterfaceC12202g0
    /* JADX INFO: renamed from: a */
    public void mo31401a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f30363a.put(key, value);
    }
}
