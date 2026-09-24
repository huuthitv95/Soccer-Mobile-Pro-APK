package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Uc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11702Uc implements InterfaceC11469H7 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11357B3 f25957a;

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<String, Long> f25958b;

    public C11702Uc(InterfaceC11357B3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f25957a = storage;
        this.f25958b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.InterfaceC11469H7
    /* JADX INFO: renamed from: a */
    public Long mo25983a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.f25958b.get(identifier);
        if (l != null) {
            return l;
        }
        Long lMo25397b = this.f25957a.mo25397b(identifier);
        if (lMo25397b == null) {
            return null;
        }
        long jLongValue = lMo25397b.longValue();
        this.f25958b.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.InterfaceC11469H7
    /* JADX INFO: renamed from: a */
    public void mo25984a(long j, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f25958b.put(identifier, Long.valueOf(j));
        this.f25957a.mo25396a(identifier, j);
    }
}
