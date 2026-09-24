package com.chartboost.sdk.impl;

import com.ironsource.C11494Ie;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC4080u {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u$a */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static String m19513a(InterfaceC4080u interfaceC4080u, JSONObject receiver, String error, String response) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                receiver.put("error", error);
                receiver.put(C11494Ie.f24627n, response);
            } catch (Exception e) {
                C4048sb.m19410b("Cannot create error json for the event", e);
            }
            String string = receiver.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo18650a(C3982pb c3982pb, Function1 function1);
}
