package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.te */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12535te {

    /* JADX INFO: renamed from: com.ironsource.te$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m33821a(InterfaceC12535te interfaceC12535te, Runnable runnable, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            interfaceC12535te.mo33659a(runnable, j);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m33820a(InterfaceC12535te interfaceC12535te, AbstractRunnableC11754Xd abstractRunnableC11754Xd, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            interfaceC12535te.mo33655a(abstractRunnableC11754Xd, j);
        }
    }

    /* JADX INFO: renamed from: a */
    C11494Ie mo33649a(Context context, String str);

    /* JADX INFO: renamed from: a */
    InterfaceC12582w7 mo33650a();

    /* JADX INFO: renamed from: a */
    String mo33651a(Context context);

    /* JADX INFO: renamed from: a */
    void mo33652a(long j, C11494Ie.a aVar);

    /* JADX INFO: renamed from: a */
    void mo33653a(C11427F1 c11427f1);

    /* JADX INFO: renamed from: a */
    void mo33654a(AbstractRunnableC11754Xd abstractRunnableC11754Xd);

    /* JADX INFO: renamed from: a */
    void mo33655a(AbstractRunnableC11754Xd abstractRunnableC11754Xd, long j);

    /* JADX INFO: renamed from: a */
    void mo33656a(C12136ce c12136ce, String str, String str2);

    /* JADX INFO: renamed from: a */
    void mo33657a(EnumC12446qe enumC12446qe);

    /* JADX INFO: renamed from: a */
    void mo33658a(Runnable runnable);

    /* JADX INFO: renamed from: a */
    void mo33659a(Runnable runnable, long j);

    /* JADX INFO: renamed from: a */
    void mo33660a(String str, String str2);

    /* JADX INFO: renamed from: b */
    void mo33661b();

    /* JADX INFO: renamed from: b */
    void mo33662b(Runnable runnable);

    /* JADX INFO: renamed from: b */
    boolean mo33663b(Context context);

    /* JADX INFO: renamed from: c */
    C11767Y9 mo33664c();

    /* JADX INFO: renamed from: c */
    String mo33665c(Context context);

    /* JADX INFO: renamed from: c */
    void mo33666c(Runnable runnable);

    /* JADX INFO: renamed from: d */
    void mo33667d(Runnable runnable);

    /* JADX INFO: renamed from: d */
    boolean mo33668d();

    /* JADX INFO: renamed from: e */
    void mo33669e();

    /* JADX INFO: renamed from: e */
    void mo33670e(Runnable runnable);

    /* JADX INFO: renamed from: f */
    void mo33671f();

    /* JADX INFO: renamed from: g */
    C11648R9 mo33672g();
}
