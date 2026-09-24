package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.z3 */
/* JADX INFO: loaded from: classes9.dex */
public final class C4194z3 implements CacheEvictor {

    /* JADX INFO: renamed from: a */
    public final long f17085a;

    /* JADX INFO: renamed from: b */
    public final b f17086b;

    /* JADX INFO: renamed from: c */
    public final Function0 f17087c;

    /* JADX INFO: renamed from: d */
    public final Lazy f17088d;

    /* JADX INFO: renamed from: e */
    public long f17089e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.z3$a */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f17090b = new a();

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.z3$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C15491a extends FunctionReferenceImpl implements Function2 {

            /* JADX INFO: renamed from: b */
            public static final C15491a f17091b = new C15491a();

            public C15491a() {
                super(2, AbstractC3632a4.class, "compare", "compare(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)I", 1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(CacheSpan p0, CacheSpan p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                return Integer.valueOf(AbstractC3632a4.m16802b(p0, p1));
            }
        }

        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public static final int m20099a(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TreeSet invoke() {
            final C15491a c15491a = C15491a.f17091b;
            return new TreeSet(new Comparator() { // from class: com.chartboost.sdk.impl.z3$a$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C4194z3.a.m20099a(c15491a, obj, obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.z3$b */
    /* JADX INFO: loaded from: classes3.dex */
    public interface b {
        /* JADX INFO: renamed from: c */
        void mo20102c(String str);
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.z3$c */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TreeSet invoke() {
            return (TreeSet) C4194z3.this.f17087c.invoke();
        }
    }

    public C4194z3(long j, b evictUrlCallback, Function0 treeSetFactory) {
        Intrinsics.checkNotNullParameter(evictUrlCallback, "evictUrlCallback");
        Intrinsics.checkNotNullParameter(treeSetFactory, "treeSetFactory");
        this.f17085a = j;
        this.f17086b = evictUrlCallback;
        this.f17087c = treeSetFactory;
        this.f17088d = LazyKt.lazy(new c());
    }

    public /* synthetic */ C4194z3(long j, b bVar, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, bVar, (i & 4) != 0 ? a.f17090b : function0);
    }

    /* JADX INFO: renamed from: a */
    public final TreeSet m20097a() {
        return (TreeSet) this.f17088d.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m20098a(Cache cache, long j) {
        while (this.f17089e + j > this.f17085a && !m20097a().isEmpty()) {
            CacheSpan cacheSpan = (CacheSpan) m20097a().first();
            C4048sb.m19408a("evictCache() - " + cacheSpan.key, (Throwable) null, 2, (Object) null);
            cache.removeSpan(cacheSpan);
            b bVar = this.f17086b;
            String key = cacheSpan.key;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            bVar.mo20102c(key);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        m20097a().add(span);
        this.f17089e += span.length;
        m20098a(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        m20097a().remove(span);
        this.f17089e -= span.length;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan oldSpan, CacheSpan newSpan) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(oldSpan, "oldSpan");
        Intrinsics.checkNotNullParameter(newSpan, "newSpan");
        onSpanRemoved(cache, oldSpan);
        onSpanAdded(cache, newSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(Cache cache, String key, long j, long j2) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(key, "key");
        if (j2 != -1) {
            m20098a(cache, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }
}
