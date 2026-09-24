package com.chartboost.sdk.impl;

import java.io.File;
import java.util.Comparator;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.v5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4108v5 implements InterfaceC4062t3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4084u3 f16540a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4040s3 f16541b;

    /* JADX INFO: renamed from: c */
    public final CoroutineDispatcher f16542c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.v5$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public long f16543b;

        /* JADX INFO: renamed from: c */
        public long f16544c;

        /* JADX INFO: renamed from: d */
        public Object f16545d;

        /* JADX INFO: renamed from: e */
        public Object f16546e;

        /* JADX INFO: renamed from: f */
        public Object f16547f;

        /* JADX INFO: renamed from: g */
        public int f16548g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ long f16549h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C4108v5 f16550i;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.v5$a$a, reason: collision with other inner class name */
        public static final class C15486a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, C4108v5 c4108v5, Continuation continuation) {
            super(2, continuation);
            this.f16549h = j;
            this.f16550i = c4108v5;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f16549h, this.f16550i, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00c5 A[Catch: Exception -> 0x0073, TryCatch #5 {Exception -> 0x0073, blocks: (B:35:0x00bf, B:37:0x00c5, B:39:0x00d1, B:43:0x00fe, B:45:0x0102, B:15:0x004a, B:18:0x0064, B:21:0x006d, B:34:0x00af), top: B:92:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[Catch: Exception -> 0x0073, TryCatch #5 {Exception -> 0x0073, blocks: (B:35:0x00bf, B:37:0x00c5, B:39:0x00d1, B:43:0x00fe, B:45:0x0102, B:15:0x004a, B:18:0x0064, B:21:0x006d, B:34:0x00af), top: B:92:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:45:0x0102 A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #5 {Exception -> 0x0073, blocks: (B:35:0x00bf, B:37:0x00c5, B:39:0x00d1, B:43:0x00fe, B:45:0x0102, B:15:0x004a, B:18:0x0064, B:21:0x006d, B:34:0x00af), top: B:92:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0107  */
        /* JADX WARN: Code duplicated, block: B:51:0x0122  */
        /* JADX WARN: Code duplicated, block: B:52:0x0123 A[Catch: Exception -> 0x01c3, PHI: r2 r5 r10 r12 r14 r15 r16
  0x0123: PHI (r2v14 java.lang.Object) = (r2v30 java.lang.Object), (r2v40 java.lang.Object) binds: [B:50:0x0120, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r5v2 java.io.File) = (r5v8 java.io.File), (r5v17 java.io.File) binds: [B:50:0x0120, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r10v2 long) = (r10v5 long), (r10v9 long) binds: [B:50:0x0120, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r12v7 long) = (r12v13 long), (r12v18 long) binds: [B:50:0x0120, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r14v1 java.util.Iterator) = (r14v2 java.util.Iterator), (r14v8 java.util.Iterator) binds: [B:50:0x0120, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r15v0 java.lang.String) = (r15v4 java.lang.String), (r15v10 java.lang.String) binds: [B:50:0x0120, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r16v4 long) = (r16v5 long), (r16v8 long) binds: [B:50:0x0120, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {Exception -> 0x01c3, blocks: (B:49:0x010a, B:52:0x0123, B:63:0x0179, B:69:0x01aa), top: B:90:0x010a }] */
        /* JADX WARN: Code duplicated, block: B:54:0x012b  */
        /* JADX WARN: Code duplicated, block: B:65:0x018e A[Catch: Exception -> 0x01a7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01a7, blocks: (B:55:0x012d, B:65:0x018e), top: B:88:0x012d }] */
        /* JADX WARN: Code duplicated, block: B:69:0x01aa A[Catch: Exception -> 0x01c3, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x01c3, blocks: (B:49:0x010a, B:52:0x0123, B:63:0x0179, B:69:0x01aa), top: B:90:0x010a }] */
        /* JADX WARN: Code duplicated, block: B:86:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01aa -> B:61:0x0173). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 497
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C4108v5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4108v5(InterfaceC4084u3 storage, InterfaceC4040s3 notifier, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(notifier, "notifier");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f16540a = storage;
        this.f16541b = notifier;
        this.f16542c = ioDispatcher;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4062t3
    /* JADX INFO: renamed from: a */
    public Object mo19453a(Function0 function0, long j, Continuation continuation) {
        return BuildersKt.withContext(this.f16542c, new a(j, this, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4062t3
    /* JADX INFO: renamed from: a */
    public boolean mo19454a(C4018r3 c4018r3) {
        if (c4018r3 != null) {
            return System.currentTimeMillis() > c4018r3.m19293a();
        }
        C4048sb.m19417e("Cannot check expiry: Metadata is null.", null, 2, null);
        return false;
    }
}
