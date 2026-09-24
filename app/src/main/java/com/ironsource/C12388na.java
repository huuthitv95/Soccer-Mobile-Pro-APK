package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.na */
/* JADX INFO: loaded from: classes6.dex */
public final class C12388na implements InterfaceC11458Ge<JSONObject> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11458Ge<String> f31561a;

    public C12388na(InterfaceC11458Ge<String> serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f31561a = serverResponse;
    }

    @Override // com.ironsource.InterfaceC11458Ge
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject mo25659a() {
        return new JSONObject(this.f31561a.mo25659a());
    }
}
