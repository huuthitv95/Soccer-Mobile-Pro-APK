package com.ironsource;

import com.ironsource.mediationsdk.C12333d;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12279k5 implements InterfaceC11437Fb<String, C12333d.a> {
    @Override // com.ironsource.InterfaceC11437Fb
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C12333d.a mo25577a(String input) throws JSONException {
        Intrinsics.checkNotNullParameter(input, "input");
        C12333d.a aVarM32334a = C12333d.m32333b().m32334a(new JSONObject(input));
        Intrinsics.checkNotNullExpressionValue(aVarM32334a, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarM32334a;
    }
}
