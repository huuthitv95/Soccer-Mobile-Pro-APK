package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3789h0 implements InterfaceC3627a {

    /* JADX INFO: renamed from: a */
    public final List f14350a = new ArrayList();

    @Override // com.chartboost.sdk.impl.InterfaceC3627a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JSONObject mo16769a(JSONObject response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator it = this.f14350a.iterator();
        while (it.hasNext()) {
            response = (JSONObject) ((InterfaceC3627a) it.next()).mo16769a(response);
        }
        return response;
    }
}
