package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.H */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11461H {

    /* JADX INFO: renamed from: c */
    public static final a f24395c = new a(null);

    /* JADX INFO: renamed from: a */
    private final AbstractC12593x0 f24396a;

    /* JADX INFO: renamed from: b */
    private final C12591wg f24397b;

    /* JADX INFO: renamed from: com.ironsource.H$a */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.H$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C15507a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f24398a;

            static {
                int[] iArr = new int[EnumC11352Ag.values().length];
                try {
                    iArr[EnumC11352Ag.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC11352Ag.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f24398a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC11461H m25959a(AbstractC12593x0 adUnitData, C12591wg waterfallInstances) {
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            int i = C15507a.f24398a[(adUnitData.m34075d() ? EnumC11352Ag.BIDDER_SENSITIVE : EnumC11352Ag.DEFAULT).ordinal()];
            if (i == 1) {
                return new C12399o3(adUnitData, waterfallInstances);
            }
            if (i == 2) {
                return adUnitData.m34087q() ? new C12289kf(adUnitData, waterfallInstances) : new C11430F4(adUnitData, waterfallInstances);
            }
            throw new NoWhenBranchMatchedException();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.H$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final List<AbstractC11353B> f24399a = new ArrayList();

        /* JADX INFO: renamed from: b */
        private final List<AbstractC11353B> f24400b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private final List<AbstractC11353B> f24401c = new ArrayList();

        /* JADX INFO: renamed from: d */
        private boolean f24402d;

        /* JADX INFO: renamed from: a */
        public final List<AbstractC11353B> m25960a() {
            return this.f24399a;
        }

        /* JADX INFO: renamed from: b */
        public final List<AbstractC11353B> m25962b() {
            return this.f24400b;
        }

        /* JADX INFO: renamed from: c */
        public final List<AbstractC11353B> m25963c() {
            return this.f24401c;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m25964d() {
            return this.f24402d;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m25965e() {
            return m25967g() == 0;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m25966f() {
            return this.f24399a.isEmpty() && this.f24401c.isEmpty();
        }

        /* JADX INFO: renamed from: g */
        public final int m25967g() {
            return this.f24399a.size() + this.f24400b.size() + this.f24401c.size();
        }

        /* JADX INFO: renamed from: a */
        public final void m25961a(boolean z) {
            this.f24402d = z;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.H$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final AbstractC11353B f24403a;

        /* JADX INFO: renamed from: b */
        private final List<AbstractC11353B> f24404b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC11353B abstractC11353B, List<? extends AbstractC11353B> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            this.f24403a = abstractC11353B;
            this.f24404b = orderedInstances;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC11353B m25969a() {
            return this.f24403a;
        }

        /* JADX INFO: renamed from: b */
        public final List<AbstractC11353B> m25971b() {
            return this.f24404b;
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC11353B m25972c() {
            return this.f24403a;
        }

        /* JADX INFO: renamed from: d */
        public final List<AbstractC11353B> m25973d() {
            return this.f24404b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f24403a, cVar.f24403a) && Intrinsics.areEqual(this.f24404b, cVar.f24404b);
        }

        public int hashCode() {
            AbstractC11353B abstractC11353B = this.f24403a;
            return ((abstractC11353B == null ? 0 : abstractC11353B.hashCode()) * 31) + this.f24404b.hashCode();
        }

        public String toString() {
            return "ShowSelection(instanceToShow=" + this.f24403a + ", orderedInstances=" + this.f24404b + ")";
        }

        /* JADX INFO: renamed from: a */
        public final c m25970a(AbstractC11353B abstractC11353B, List<? extends AbstractC11353B> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            return new c(abstractC11353B, orderedInstances);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ c m25968a(c cVar, AbstractC11353B abstractC11353B, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC11353B = cVar.f24403a;
            }
            if ((i & 2) != 0) {
                list = cVar.f24404b;
            }
            return cVar.m25970a(abstractC11353B, list);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.H$d */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((AbstractC11353B) t).m25348h().m33152l()), Integer.valueOf(((AbstractC11353B) t2).m25348h().m33152l()));
        }
    }

    public AbstractC11461H(AbstractC12593x0 adUnitData, C12591wg waterfallInstances) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f24396a = adUnitData;
        this.f24397b = waterfallInstances;
    }

    /* JADX INFO: renamed from: b */
    private final List<AbstractC11353B> m25952b() {
        return CollectionsKt.sortedWith(this.f24397b.m34067b(), new d());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo25767a(AbstractC11353B abstractC11353B, b bVar);

    /* JADX INFO: renamed from: a */
    protected boolean mo25955a(AbstractC11353B instance, C12591wg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final c m25957c() {
        Object next;
        List<AbstractC11353B> listM25952b = m25952b();
        Iterator<T> it = listM25952b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AbstractC11353B) next).m25362w()) {
                return new c((AbstractC11353B) next, listM25952b);
            }
        }
        next = null;
        return new c((AbstractC11353B) next, listM25952b);
    }

    /* JADX INFO: renamed from: d */
    public final b m25958d() {
        IronLog.INTERNAL.verbose(this.f24396a.mo26467b().m31567a().name() + " waterfall size: " + this.f24397b.m34067b().size());
        b bVar = new b();
        boolean zMo32184k = C11455Gb.f24351s.m25905d().mo25846h().mo32184k();
        Iterator<AbstractC11353B> it = this.f24397b.m34067b().iterator();
        while (it.hasNext() && !m25951a(it.next(), bVar, zMo32184k)) {
        }
        return bVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25954a(AbstractC11353B instance) {
        Object next;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Iterator<T> it = m25952b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((AbstractC11353B) next).m25361v()) {
                return Intrinsics.areEqual(next, instance);
            }
        }
        next = null;
        return Intrinsics.areEqual(next, instance);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25953a() {
        int i;
        List<AbstractC11353B> listM34067b = this.f24397b.m34067b();
        if ((listM34067b instanceof Collection) && listM34067b.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = listM34067b.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC11353B) it.next()).m25362w() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.f24396a.m34081k();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo25956a(b loadSelection) {
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return loadSelection.m25967g() >= this.f24396a.m34081k();
    }

    /* JADX INFO: renamed from: a */
    private final boolean m25951a(AbstractC11353B abstractC11353B, b bVar, boolean z) {
        if (abstractC11353B.m25361v()) {
            IronLog.INTERNAL.verbose(abstractC11353B.m25344d().name() + " - Instance " + abstractC11353B.m25356q() + " is failed to load");
        } else if (abstractC11353B.m25362w()) {
            IronLog.INTERNAL.verbose(abstractC11353B.m25344d().name() + " - Instance " + abstractC11353B.m25356q() + " is already loaded");
            bVar.m25962b().add(abstractC11353B);
        } else if (abstractC11353B.m25363x()) {
            IronLog.INTERNAL.verbose(abstractC11353B.m25344d().name() + " - Instance " + abstractC11353B.m25356q() + " still loading");
            bVar.m25963c().add(abstractC11353B);
        } else if (mo25955a(abstractC11353B, this.f24397b) && !z) {
            IronLog.INTERNAL.verbose(abstractC11353B.m25344d().name() + " - Instance " + abstractC11353B.m25356q() + " is not better than already loaded instances");
        } else {
            mo25767a(abstractC11353B, bVar);
        }
        return mo25956a(bVar);
    }
}
