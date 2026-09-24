package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.yf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12626yf {
    /* JADX INFO: renamed from: a */
    public final void m34248a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(testSuiteControllerUrl, "testSuiteControllerUrl");
        C11459Gf c11459Gf = C11459Gf.f24392a;
        m34247a(context, m34245a(appKey, sdkVersion, c11459Gf.m25947c(context), c11459Gf.m25933a(context), c11459Gf.m25944b(context), bool, initResponse, z, c11459Gf.m25945b(), c11459Gf.m25948c(), m34246a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: b */
    public final String m34249b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m34244a(context).getString("dataString", "");
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m34246a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : C11459Gf.f24392a.m25949d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private final String m34245a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String string = new JSONObject(MapsKt.mapOf(TuplesKt.m43482to(C11683Ta.f25802o, C11744X3.f26142d), TuplesKt.m43482to("appKey", str), TuplesKt.m43482to("sdkVersion", str2), TuplesKt.m43482to("bundleId", str3), TuplesKt.m43482to("appName", str4), TuplesKt.m43482to("appVersion", str5), TuplesKt.m43482to("initResponse", jSONObject), TuplesKt.m43482to("isRvManual", Boolean.valueOf(z)), TuplesKt.m43482to("generalProperties", jSONObject2), TuplesKt.m43482to("adaptersVersion", jSONObject3), TuplesKt.m43482to("metaData", jSONObject4), TuplesKt.m43482to("gdprConsent", bool))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: a */
    private final SharedPreferences m34244a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    private final void m34247a(Context context, String str) {
        SharedPreferences.Editor editorEdit = m34244a(context).edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", str);
        editorEdit.apply();
    }
}
