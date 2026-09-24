package com.unity3d.services.core.extensions;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: CoroutineExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00022\u001e\b\u0004\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a@\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u001e\b\u0004\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a@\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u001e\b\u0004\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0016\"5\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m43475d2 = {"deferreds", "Ljava/util/LinkedHashMap;", "", "Lkotlinx/coroutines/Deferred;", "Lkotlin/collections/LinkedHashMap;", "getDeferreds", "()Ljava/util/LinkedHashMap;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "memoize", "T", "key", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runReturnSuspendCatching", "Lkotlin/Result;", "R", "block", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runSuspendCatching", "unity-ads_defaultRelease"}, m43476k = 2, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, Deferred<?>> deferreds = new LinkedHashMap<Object, Deferred<?>>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Deferred) {
                return containsValue((Deferred<?>) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsValue(Deferred<?> deferred) {
            return super.containsValue((Object) deferred);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, Deferred<?>>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, Deferred<?>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Deferred<?>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof Deferred)) {
                return remove(obj, (Deferred<?>) obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(Object obj, Deferred<?> deferred) {
            return super.remove(obj, (Object) deferred);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Object, Deferred<?>> eldest) {
            Intrinsics.checkNotNullParameter(eldest, "eldest");
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Deferred<?>> values() {
            return getValues();
        }
    };
    private static final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2 */
    /* JADX INFO: compiled from: CoroutineExtensions.kt */
    @Metadata(m43474d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 176)
    @DebugMetadata(m43503c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", m43504f = "CoroutineExtensions.kt", m43505i = {0, 0}, m43506l = {53, 45}, m43507m = "invokeSuspend", m43508n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, m43509s = {"L$0", "L$1"})
    public static final class C148482<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C148482(Object obj, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super C148482> continuation) {
            super(2, continuation);
            this.$key = obj;
            this.$action = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148482 c148482 = new C148482(this.$key, this.$action, continuation);
            c148482.L$0 = obj;
            return c148482;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C148482) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Mutex mutex;
            Function1<Continuation<? super T>, Object> function1;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    mutex = CoroutineExtensionsKt.getMutex();
                    Object obj3 = this.$key;
                    function1 = this.$action;
                    this.L$0 = coroutineScope;
                    this.L$1 = mutex;
                    this.L$2 = obj3;
                    this.L$3 = function1;
                    this.label = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                        obj2 = obj3;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                function1 = (Function1) this.L$3;
                obj2 = this.L$2;
                mutex = (Mutex) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                LinkedHashMap<Object, Deferred<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
                Deferred<?> deferredAsync$default = deferreds.get(obj2);
                if (deferredAsync$default == null) {
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                    deferreds.put(obj2, deferredAsync$default);
                }
                Deferred<?> deferred = deferredAsync$default;
                mutex.unlock(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                Object objAwait = deferred.await(this);
                return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Mutex mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            Function1<Continuation<? super T>, Object> function1 = this.$action;
            C148482<T> c148482 = this;
            mutex.lock(null, c148482);
            try {
                LinkedHashMap<Object, Deferred<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
                Deferred<?> deferredAsync$default = deferreds.get(obj2);
                if (deferredAsync$default == null) {
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                    deferreds.put(obj2, deferredAsync$default);
                }
                Deferred<?> deferred = deferredAsync$default;
                mutex.unlock(null);
                return deferred.await(c148482);
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1 */
    /* JADX INFO: compiled from: CoroutineExtensions.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 176)
    @DebugMetadata(m43503c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", m43504f = "CoroutineExtensions.kt", m43505i = {}, m43506l = {49}, m43507m = "runReturnSuspendCatching", m43508n = {}, m43509s = {})
    static final class C148491<R> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C148491(Continuation<? super C148491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objRunReturnSuspendCatching = CoroutineExtensionsKt.runReturnSuspendCatching(null, this);
            return objRunReturnSuspendCatching == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunReturnSuspendCatching : Result.m44945boximpl(objRunReturnSuspendCatching);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1 */
    /* JADX INFO: compiled from: CoroutineExtensions.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 176)
    @DebugMetadata(m43503c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", m43504f = "CoroutineExtensions.kt", m43505i = {}, m43506l = {15}, m43507m = "runSuspendCatching", m43508n = {}, m43509s = {})
    static final class C148501<R> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C148501(Continuation<? super C148501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objRunSuspendCatching = CoroutineExtensionsKt.runSuspendCatching(null, this);
            return objRunSuspendCatching == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunSuspendCatching : Result.m44945boximpl(objRunSuspendCatching);
        }
    }

    public static final LinkedHashMap<Object, Deferred<?>> getDeferreds() {
        return deferreds;
    }

    public static final Mutex getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return CoroutineScopeKt.coroutineScope(new C148482(obj, function1, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <R> Object runReturnSuspendCatching(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super Result<? extends R>> continuation) throws Throwable {
        C148491 c148491;
        Object objM44946constructorimpl;
        if (continuation instanceof C148491) {
            c148491 = (C148491) continuation;
            if ((c148491.label & Integer.MIN_VALUE) != 0) {
                c148491.label -= Integer.MIN_VALUE;
            } else {
                c148491 = new C148491(continuation);
            }
        } else {
            c148491 = new C148491(continuation);
        }
        Object objInvoke = c148491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c148491.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Result.Companion companion = Result.INSTANCE;
                c148491.label = 1;
                objInvoke = function1.invoke(c148491);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            objM44946constructorimpl = Result.m44946constructorimpl(objInvoke);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m44953isSuccessimpl(objM44946constructorimpl)) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m44946constructorimpl(objM44946constructorimpl);
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl == null) {
            return objM44946constructorimpl;
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
    }

    private static final <R> Object runReturnSuspendCatching$$forInline(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super Result<? extends R>> continuation) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(function1.invoke(continuation));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m44953isSuccessimpl(objM44946constructorimpl)) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m44946constructorimpl(objM44946constructorimpl);
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl == null) {
            return objM44946constructorimpl;
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <R> Object runSuspendCatching(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super Result<? extends R>> continuation) throws Throwable {
        C148501 c148501;
        if (continuation instanceof C148501) {
            c148501 = (C148501) continuation;
            if ((c148501.label & Integer.MIN_VALUE) != 0) {
                c148501.label -= Integer.MIN_VALUE;
            } else {
                c148501 = new C148501(continuation);
            }
        } else {
            c148501 = new C148501(continuation);
        }
        Object objInvoke = c148501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c148501.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Result.Companion companion = Result.INSTANCE;
                c148501.label = 1;
                objInvoke = function1.invoke(c148501);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            return Result.m44946constructorimpl(objInvoke);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    private static final <R> Object runSuspendCatching$$forInline(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super Result<? extends R>> continuation) {
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(function1.invoke(continuation));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }
}
