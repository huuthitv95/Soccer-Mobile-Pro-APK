package com.ironsource;

import com.ironsource.AbstractC12259j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Dg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11406Dg<Smash extends AbstractC12259j3<?>> {

    /* JADX INFO: renamed from: a */
    private final C11723W f24229a;

    /* JADX INFO: renamed from: com.ironsource.Dg$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((AbstractC12259j3) t).m31824i().m33152l()), Integer.valueOf(((AbstractC12259j3) t2).m31824i().m33152l()));
        }
    }

    public C11406Dg(C11723W managerData) {
        Intrinsics.checkNotNullParameter(managerData, "managerData");
        this.f24229a = managerData;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25636a(AbstractC12259j3<?> smash, List<? extends Smash> waterfall) {
        Object next;
        Intrinsics.checkNotNullParameter(smash, "smash");
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = m25638b(waterfall).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((AbstractC12259j3) next).m31836x()) {
                return Intrinsics.areEqual(next, smash);
            }
        }
        next = null;
        return Intrinsics.areEqual(next, smash);
    }

    /* JADX INFO: renamed from: b */
    public final List<Smash> m25638b(List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        return CollectionsKt.sortedWith(waterfall, new a());
    }

    /* JADX INFO: renamed from: c */
    public final Smash m25639c(List<? extends Smash> waterfall) {
        Object next;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = m25638b(waterfall).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AbstractC12259j3) next).m31809B()) {
                return (Smash) next;
            }
        }
        next = null;
        return (Smash) next;
    }

    /* JADX INFO: renamed from: d */
    public final C11424Eg<Smash> m25640d(List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.f24229a.m27768b().name() + " waterfall size: " + waterfall.size());
        AbstractC11514Jg<Smash> abstractC11514JgM26244a = AbstractC11514Jg.f24782g.m26244a(this.f24229a.m27770c() ? EnumC11352Ag.BIDDER_SENSITIVE : EnumC11352Ag.DEFAULT, this.f24229a.m27776i(), this.f24229a.m27779m(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            abstractC11514JgM26244a.m26242d(it.next());
            if (abstractC11514JgM26244a.mo26243e()) {
                return new C11424Eg<>(abstractC11514JgM26244a);
            }
        }
        return new C11424Eg<>(abstractC11514JgM26244a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25637a(List<? extends Smash> waterfall) {
        int i;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC12259j3) it.next()).m31837y() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.f24229a.m27776i();
    }
}
