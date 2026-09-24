package com.chartboost.sdk.impl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.jh */
/* JADX INFO: loaded from: classes3.dex */
public final class C3852jh {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3917md f14972a;

    /* JADX INFO: renamed from: b */
    public final C4136wb f14973b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3972p1 f14974c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jh$a */
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14975b;

        /* JADX INFO: renamed from: c */
        public Object f14976c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f14977d;

        /* JADX INFO: renamed from: f */
        public int f14979f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14977d = obj;
            this.f14979f |= Integer.MIN_VALUE;
            return C3852jh.this.m18287a(null, null, null, null, null, this);
        }
    }

    public C3852jh(InterfaceC3917md networkClient, C4136wb macroProcessor, InterfaceC3972p1 applicationComponent) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(macroProcessor, "macroProcessor");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f14972a = networkClient;
        this.f14973b = macroProcessor;
        this.f14974c = applicationComponent;
    }

    public /* synthetic */ C3852jh(InterfaceC3917md interfaceC3917md, C4136wb c4136wb, InterfaceC3972p1 interfaceC3972p1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3917md, c4136wb, (i & 4) != 0 ? C3678c4.f13658b.mo17019a() : interfaceC3972p1);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167  */
    /* JADX WARN: Code duplicated, block: B:63:0x0175  */
    /* JADX WARN: Code duplicated, block: B:64:0x017a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
    
        if (r4 == r6) goto L56;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0140, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m18287a(java.lang.String r17, java.lang.String r18, java.lang.String r19, com.chartboost.sdk.impl.InterfaceC3806hh r20, java.lang.String r21, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3852jh.m18287a(java.lang.String, java.lang.String, java.lang.String, com.chartboost.sdk.impl.hh, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
