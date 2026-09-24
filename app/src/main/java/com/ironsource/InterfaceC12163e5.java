package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.ironsource.e5 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12163e5<T> extends InterfaceC11510Jc {

    /* JADX INFO: renamed from: com.ironsource.e5$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$m(InterfaceC12163e5 _this) {
            _this.mo31205l().mo31289a(_this);
            if (_this.mo31204k().exists()) {
                IronSourceStorageUtils.deleteFile(_this.mo31204k());
            }
            try {
                _this.mo31205l().mo31291a(_this.mo31204k(), _this.mo31201d().value(), 5, 5);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                Function1<Result<? extends T>, Unit> function1Mo31202i = _this.mo31202i();
                Result.Companion companion = Result.INSTANCE;
                function1Mo31202i.invoke(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(e))));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    void mo31199b(C12601x8 c12601x8);

    /* JADX INFO: renamed from: c */
    String mo31200c();

    /* JADX INFO: renamed from: d */
    InterfaceC11712V5 mo31201d();

    /* JADX INFO: renamed from: i */
    Function1<Result<? extends T>, Unit> mo31202i();

    /* JADX INFO: renamed from: j */
    boolean mo31203j();

    /* JADX INFO: renamed from: k */
    C12601x8 mo31204k();

    /* JADX INFO: renamed from: l */
    InterfaceC12600x7 mo31205l();

    /* JADX INFO: renamed from: m */
    void mo31206m();
}
