package com.ironsource;

import com.ironsource.AbstractC12259j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Jg */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11514Jg<Smash extends AbstractC12259j3<?>> {

    /* JADX INFO: renamed from: g */
    public static final a f24782g = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f24783a;

    /* JADX INFO: renamed from: b */
    private final boolean f24784b;

    /* JADX INFO: renamed from: c */
    private final List<Smash> f24785c;

    /* JADX INFO: renamed from: d */
    private final List<Smash> f24786d;

    /* JADX INFO: renamed from: e */
    private final List<Smash> f24787e;

    /* JADX INFO: renamed from: f */
    private final List<Smash> f24788f;

    /* JADX INFO: renamed from: com.ironsource.Jg$a */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.Jg$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C15509a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f24789a;

            static {
                int[] iArr = new int[EnumC11352Ag.values().length];
                try {
                    iArr[EnumC11352Ag.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC11352Ag.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f24789a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final <Smash extends AbstractC12259j3<?>> AbstractC11514Jg<Smash> m26244a(EnumC11352Ag loadingStrategy, int i, boolean z, List<? extends Smash> waterfall) {
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            int i2 = C15509a.f24789a[loadingStrategy.ordinal()];
            if (i2 == 1) {
                return new C11466H4(i, z, waterfall);
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new C12417p3(i, z, waterfall, false, 8, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC11514Jg(int i, boolean z, List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.f24783a = i;
        this.f24784b = z;
        this.f24785c = waterfall;
        this.f24786d = new ArrayList();
        this.f24787e = new ArrayList();
        this.f24788f = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    private final boolean m26238b(Smash smash) {
        return m26237b() < m26236a(smash);
    }

    /* JADX INFO: renamed from: a */
    public final List<Smash> m26239a() {
        return this.f24788f;
    }

    /* JADX INFO: renamed from: c */
    public final List<Smash> m26240c() {
        return this.f24786d;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo25980c(Smash smash);

    /* JADX INFO: renamed from: d */
    public final int m26241d() {
        return this.f24786d.size() + this.f24787e.size() + this.f24788f.size();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo26243e() {
        return m26241d() >= this.f24783a;
    }

    /* JADX INFO: renamed from: a */
    private final int m26236a(Smash smash) {
        return smash.m31824i().m33152l();
    }

    /* JADX INFO: renamed from: d */
    public final void m26242d(Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (smash.m31836x()) {
            IronLog.INTERNAL.verbose(smash.m31822g().name() + " - smash " + smash.m31826k() + " is failed to load");
            return;
        }
        if (smash.m31837y()) {
            IronLog.INTERNAL.verbose(smash.m31822g().name() + " - Smash " + smash.m31826k() + " is already loaded");
            this.f24787e.add(smash);
            return;
        }
        if (smash.m31838z()) {
            IronLog.INTERNAL.verbose(smash.m31822g().name() + " - Smash " + smash.m31826k() + " still loading");
            this.f24788f.add(smash);
            return;
        }
        if (smash.m31808A().get()) {
            IronLog.INTERNAL.verbose(smash.m31822g().name() + " - Smash " + smash.m31826k() + " marked as loading candidate");
            this.f24788f.add(smash);
            return;
        }
        if (!this.f24784b || !m26238b(smash)) {
            mo25980c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.m31822g().name() + " - Smash " + smash.m31826k() + " is not better than already loaded smashes");
    }

    /* JADX INFO: renamed from: b */
    private final int m26237b() {
        Integer num;
        List<Smash> list = this.f24785c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC12259j3) obj).m31837y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(m26236a((AbstractC12259j3) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(m26236a((AbstractC12259j3) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
