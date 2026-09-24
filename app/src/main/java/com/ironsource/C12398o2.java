package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.o2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12398o2 implements InterfaceC12416p2 {

    /* JADX INFO: renamed from: a */
    private final String f31604a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12463rd f31605b;

    public C12398o2(String encryptedAuctionResponse, InterfaceC12463rd providerName) {
        Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f31604a = encryptedAuctionResponse;
        this.f31605b = providerName;
    }

    @Override // com.ironsource.InterfaceC12416p2
    /* JADX INFO: renamed from: a */
    public Object mo32925a() {
        Object objM44946constructorimpl;
        String strM31855c = C12261j5.m31853b().m31855c();
        Intrinsics.checkNotNullExpressionValue(strM31855c, "getInstance().mediationKey");
        C12388na c12388na = new C12388na(new C11412E4(this.f31604a, strM31855c));
        try {
            Result.Companion companion = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(c12388na.mo25659a());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl == null) {
            return C12315m2.f30902h.m32148a((JSONObject) objM44946constructorimpl, this.f31605b.value());
        }
        C12317m4.m32153d().m32155a(thM44949exceptionOrNullimpl);
        if (thM44949exceptionOrNullimpl instanceof IllegalArgumentException) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new C11782Z7(C12526t5.f32437a.m33750d())));
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m44946constructorimpl(ResultKt.createFailure(new C11782Z7(C12526t5.f32437a.m33755h())));
    }
}
