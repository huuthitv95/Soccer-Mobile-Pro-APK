package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.i4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12242i4 implements InterfaceC12163e5<C12601x8> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11712V5 f30572a;

    /* JADX INFO: renamed from: b */
    private final String f30573b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12600x7 f30574c;

    /* JADX INFO: renamed from: d */
    private final Function1<Result<? extends C12601x8>, Unit> f30575d;

    /* JADX INFO: renamed from: e */
    private C12601x8 f30576e;

    /* JADX WARN: Multi-variable type inference failed */
    public C12242i4(InterfaceC11712V5 fileUrl, String destinationPath, InterfaceC12600x7 downloadManager, Function1<? super Result<? extends C12601x8>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f30572a = fileUrl;
        this.f30573b = destinationPath;
        this.f30574c = downloadManager;
        this.f30575d = onFinish;
        this.f30576e = new C12601x8(mo31200c());
    }

    @Override // com.ironsource.InterfaceC11510Jc
    /* JADX INFO: renamed from: a */
    public void mo26216a(C12601x8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Function1<Result<? extends C12601x8>, Unit> function1Mo31202i = mo31202i();
        Result.Companion companion = Result.INSTANCE;
        function1Mo31202i.invoke(Result.m44945boximpl(Result.m44946constructorimpl(file)));
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: b */
    public void mo31199b(C12601x8 c12601x8) {
        Intrinsics.checkNotNullParameter(c12601x8, "<set-?>");
        this.f30576e = c12601x8;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: c */
    public String mo31200c() {
        return this.f30573b;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: d */
    public InterfaceC11712V5 mo31201d() {
        return this.f30572a;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: i */
    public Function1<Result<? extends C12601x8>, Unit> mo31202i() {
        return this.f30575d;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: j */
    public /* synthetic */ boolean mo31203j() {
        return mo31204k().exists();
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: k */
    public C12601x8 mo31204k() {
        return this.f30576e;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: l */
    public InterfaceC12600x7 mo31205l() {
        return this.f30574c;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo31206m() {
        InterfaceC12163e5.CC.$default$m(this);
    }

    @Override // com.ironsource.InterfaceC11510Jc
    /* JADX INFO: renamed from: a */
    public void mo26217a(C12601x8 c12601x8, C12404o8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends C12601x8>, Unit> function1Mo31202i = mo31202i();
        Result.Companion companion = Result.INSTANCE;
        function1Mo31202i.invoke(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(new Exception("Unable to download mobileController.html: " + error.m32957b())))));
    }
}
