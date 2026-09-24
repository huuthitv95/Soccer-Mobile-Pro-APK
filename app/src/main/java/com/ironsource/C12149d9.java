package com.ironsource;

import com.ironsource.environment.ContextProvider;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.d9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12149d9 {

    /* JADX INFO: renamed from: a */
    public static final C12149d9 f30242a = new C12149d9();

    private C12149d9() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final JSONObject m31304a() throws JSONException {
        new C11648R9().m27351b(ContextProvider.getInstance().getApplicationContext());
        String string = new C12131c9().m31267a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "InitProvider().getInitData().toString()");
        C11530Ke.m26303c(string);
        JSONObject encodedJsonInitResponse = new JSONObject().put("data", C11453G9.m25870e(C12261j5.m31853b().m31855c(), string));
        Intrinsics.checkNotNullExpressionValue(encodedJsonInitResponse, "encodedJsonInitResponse");
        return encodedJsonInitResponse;
    }
}
