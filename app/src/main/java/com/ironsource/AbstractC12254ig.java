package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ig */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12254ig {

    /* JADX INFO: renamed from: com.ironsource.ig$a */
    public static final class a extends AbstractC12254ig {

        /* JADX INFO: renamed from: a */
        private final AbstractC12236hg f30596a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC12236hg error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f30596a = error;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC12236hg m31770a() {
            return this.f30596a;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC12236hg m31772b() {
            return this.f30596a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f30596a, ((a) obj).f30596a);
        }

        public int hashCode() {
            return this.f30596a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f30596a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m31771a(AbstractC12236hg error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m31769a(a aVar, AbstractC12236hg abstractC12236hg, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC12236hg = aVar.f30596a;
            }
            return aVar.m31771a(abstractC12236hg);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ig$b */
    public static final class b extends AbstractC12254ig {

        /* JADX INFO: renamed from: a */
        public static final b f30597a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC12254ig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12254ig() {
    }
}
