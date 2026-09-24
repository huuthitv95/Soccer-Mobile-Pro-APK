package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12121c implements InterfaceC12163e5<JSONObject> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11712V5 f30139a;

    /* JADX INFO: renamed from: b */
    private final String f30140b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12600x7 f30141c;

    /* JADX INFO: renamed from: d */
    private final Function1<Result<? extends JSONObject>, Unit> f30142d;

    /* JADX INFO: renamed from: e */
    private C12601x8 f30143e;

    /* JADX WARN: Multi-variable type inference failed */
    public C12121c(InterfaceC11712V5 fileUrl, String destinationPath, InterfaceC12600x7 downloadManager, Function1<? super Result<? extends JSONObject>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f30139a = fileUrl;
        this.f30140b = destinationPath;
        this.f30141c = downloadManager;
        this.f30142d = onFinish;
        this.f30143e = new C12601x8(mo31200c(), C11744X3.f26147i);
    }

    @Override // com.ironsource.InterfaceC11510Jc
    /* JADX INFO: renamed from: a */
    public void mo26216a(C12601x8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Intrinsics.areEqual(file.getName(), C11744X3.f26147i)) {
            try {
                JSONObject jSONObjectM31198c = m31198c(file);
                Function1<Result<? extends JSONObject>, Unit> function1Mo31202i = mo31202i();
                Result.Companion companion = Result.INSTANCE;
                function1Mo31202i.invoke(Result.m44945boximpl(Result.m44946constructorimpl(jSONObjectM31198c)));
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                Function1<Result<? extends JSONObject>, Unit> function1Mo31202i2 = mo31202i();
                Result.Companion companion2 = Result.INSTANCE;
                function1Mo31202i2.invoke(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(e))));
            }
        }
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: b */
    public void mo31199b(C12601x8 c12601x8) {
        Intrinsics.checkNotNullParameter(c12601x8, "<set-?>");
        this.f30143e = c12601x8;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: c */
    public String mo31200c() {
        return this.f30140b;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: d */
    public InterfaceC11712V5 mo31201d() {
        return this.f30139a;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: i */
    public Function1<Result<? extends JSONObject>, Unit> mo31202i() {
        return this.f30142d;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: j */
    public /* synthetic */ boolean mo31203j() {
        return mo31204k().exists();
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: k */
    public C12601x8 mo31204k() {
        return this.f30143e;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: l */
    public InterfaceC12600x7 mo31205l() {
        return this.f30141c;
    }

    @Override // com.ironsource.InterfaceC12163e5
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo31206m() {
        InterfaceC12163e5.CC.$default$m(this);
    }

    /* JADX INFO: renamed from: c */
    private final JSONObject m31198c(C12601x8 c12601x8) {
        return new JSONObject(IronSourceStorageUtils.readFile(c12601x8));
    }

    @Override // com.ironsource.InterfaceC11510Jc
    /* JADX INFO: renamed from: a */
    public void mo26217a(C12601x8 c12601x8, C12404o8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends JSONObject>, Unit> function1Mo31202i = mo31202i();
        Result.Companion companion = Result.INSTANCE;
        function1Mo31202i.invoke(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(new Exception("Unable to download abTestMap.json: " + error.m32957b())))));
    }
}
