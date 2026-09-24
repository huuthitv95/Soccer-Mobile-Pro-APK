package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.m2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3906m2 {

    /* JADX INFO: renamed from: h */
    public static final a f15318h = new a(null);

    /* JADX INFO: renamed from: a */
    public final Context f15319a;

    /* JADX INFO: renamed from: b */
    public final C3768g2 f15320b;

    /* JADX INFO: renamed from: c */
    public final C4105v2 f15321c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f15322d;

    /* JADX INFO: renamed from: e */
    public final C3665be f15323e;

    /* JADX INFO: renamed from: f */
    public final C4117ve f15324f;

    /* JADX INFO: renamed from: g */
    public final C4031rg f15325g;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.m2$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.m2$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ JSONObject f15326b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONObject jSONObject) {
            super(1);
            this.f15326b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair invoke(String str) {
            return TuplesKt.m43482to(str, this.f15326b.get(str));
        }
    }

    public C3906m2(Context context, C3768g2 base64Wrapper, C4105v2 identity, AtomicReference sdkConfiguration, C3665be openMeasurementManager, C4117ve privacyApi, C4031rg session) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f15319a = context;
        this.f15320b = base64Wrapper;
        this.f15321c = identity;
        this.f15322d = sdkConfiguration;
        this.f15323e = openMeasurementManager;
        this.f15324f = privacyApi;
        this.f15325g = session;
    }

    /* JADX INFO: renamed from: a */
    public final String m18625a() throws JSONException {
        List listListOf = CollectionsKt.listOf((Object[]) new InterfaceC4054sh[]{new C3980p9(this.f15321c), new C4116vd(this.f15322d, this.f15323e), new C3910m6(this.f15319a, this.f15321c, C3818i6.f14559d.m17963a()), new C3817i5(), new C4161xe(this.f15324f), new C4075tg(this.f15325g)});
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m43482to("package", this.f15319a.getPackageName()), TuplesKt.m43482to("token_version", "1.2"), TuplesKt.m43482to("android_api_level", Integer.valueOf(Build.VERSION.SDK_INT)));
        ArrayList arrayList = new ArrayList();
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectMo17960a = ((InterfaceC4054sh) it.next()).mo17960a();
            Iterator<String> itKeys = jSONObjectMo17960a.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            CollectionsKt.addAll(arrayList, SequencesKt.map(SequencesKt.asSequence(itKeys), new b(jSONObjectMo17960a)));
        }
        SortedMap sortedMap = MapsKt.toSortedMap(MapsKt.plus(mapMapOf, arrayList));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : sortedMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C3768g2 c3768g2 = this.f15320b;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return c3768g2.m17752c(string);
    }
}
