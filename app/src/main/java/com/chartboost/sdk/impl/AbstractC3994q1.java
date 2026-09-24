package com.chartboost.sdk.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.q1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3994q1 {

    /* JADX INFO: renamed from: a */
    public static final Function1 f15845a = a.f15846b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q1$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f15846b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3920mg invoke(InterfaceC3859k1 it) {
            JSONObject jSONObject;
            String str = JsonUtils.EMPTY_JSON;
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                String string = it.mo18325i().getString("config", JsonUtils.EMPTY_JSON);
                if (string != null) {
                    str = string;
                }
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                C4048sb.m19410b("Error reading config from shared preferences", e);
                jSONObject = new JSONObject();
            }
            return new C3920mg(jSONObject);
        }
    }
}
