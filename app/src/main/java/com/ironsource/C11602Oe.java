package com.ironsource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Oe */
/* JADX INFO: loaded from: classes6.dex */
public final class C11602Oe implements InterfaceC11506J8, InterfaceC11506J8.a {

    /* JADX INFO: renamed from: a */
    private final Map<String, Integer> f25304a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<String, Integer> f25305b = new HashMap();

    @Override // com.ironsource.InterfaceC11506J8.a
    /* JADX INFO: renamed from: a */
    public void mo26205a(List<? extends InterfaceC11506J8.b> smashes) {
        Intrinsics.checkNotNullParameter(smashes, "smashes");
        for (InterfaceC11506J8.b bVar : smashes) {
            this.f25304a.put(bVar.mo26207c(), 0);
            this.f25305b.put(bVar.mo26207c(), Integer.valueOf(bVar.mo26206b()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.ironsource.InterfaceC11506J8
    /* JADX INFO: renamed from: b */
    public boolean mo26203b(InterfaceC11506J8.b smash) {
        boolean z;
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String strMo26207c = smash.mo26207c();
            if (this.f25304a.containsKey(strMo26207c)) {
                Integer num = this.f25304a.get(strMo26207c);
                Intrinsics.checkNotNull(num);
                if (num.intValue() >= smash.mo26206b()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.ironsource.InterfaceC11506J8.a
    /* JADX INFO: renamed from: a */
    public void mo26204a(InterfaceC11506J8.b smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String strMo26207c = smash.mo26207c();
            if (this.f25304a.containsKey(strMo26207c)) {
                Map<String, Integer> map = this.f25304a;
                Integer num = map.get(strMo26207c);
                Intrinsics.checkNotNull(num);
                map.put(strMo26207c, Integer.valueOf(num.intValue() + 1));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ironsource.InterfaceC11506J8
    /* JADX INFO: renamed from: a */
    public boolean mo26202a() {
        for (String str : this.f25305b.keySet()) {
            Integer num = this.f25304a.get(str);
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f25305b.get(str);
            Intrinsics.checkNotNull(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
