package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.hf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12235hf implements InterfaceC11596O8 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11357B3 f30505a;

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<String, Integer> f30506b;

    /* JADX INFO: renamed from: c */
    private ConcurrentHashMap<String, Long> f30507c;

    public C12235hf(InterfaceC11357B3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30505a = storage;
        this.f30506b = new ConcurrentHashMap<>();
        this.f30507c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.InterfaceC11596O8
    /* JADX INFO: renamed from: a */
    public void mo26737a(int i, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f30506b.put(identifier, Integer.valueOf(i));
        this.f30505a.mo25395a(identifier, i);
    }

    @Override // com.ironsource.InterfaceC11596O8
    /* JADX INFO: renamed from: b */
    public Long mo26739b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.f30507c.get(identifier);
        if (l != null) {
            return l;
        }
        Long lMo25394a = this.f30505a.mo25394a(identifier);
        if (lMo25394a == null) {
            return null;
        }
        long jLongValue = lMo25394a.longValue();
        this.f30507c.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.InterfaceC11596O8
    /* JADX INFO: renamed from: a */
    public int mo26736a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Integer num = this.f30506b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer numMo25399c = this.f30505a.mo25399c(identifier);
        if (numMo25399c != null) {
            int iIntValue = numMo25399c.intValue();
            this.f30506b.put(identifier, Integer.valueOf(iIntValue));
            return iIntValue;
        }
        this.f30506b.put(identifier, 0);
        return 0;
    }

    @Override // com.ironsource.InterfaceC11596O8
    /* JADX INFO: renamed from: a */
    public void mo26738a(long j, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f30507c.put(identifier, Long.valueOf(j));
        this.f30505a.mo25398b(identifier, j);
    }
}
