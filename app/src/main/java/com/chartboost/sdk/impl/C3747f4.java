package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.f4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3747f4 {

    /* JADX INFO: renamed from: a */
    public final C4008qf f14145a;

    /* JADX INFO: renamed from: b */
    public final C4168y f14146b;

    /* JADX INFO: renamed from: c */
    public final C3829ih f14147c;

    /* JADX INFO: renamed from: d */
    public final Mediation f14148d;

    /* JADX INFO: renamed from: e */
    public boolean f14149e;

    /* JADX INFO: renamed from: f */
    public final boolean f14150f;

    public C3747f4(C4008qf renderableConfig, C4168y adMarkupConfig, C3829ih telemetryManager, Mediation mediation) {
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        this.f14145a = renderableConfig;
        this.f14146b = adMarkupConfig;
        this.f14147c = telemetryManager;
        this.f14148d = mediation;
        this.f14150f = renderableConfig.m19180e();
    }

    /* JADX INFO: renamed from: a */
    public final List m17615a(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4120vh((String) it.next(), "GET", null, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m17616a(List list, String str) {
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.CLICK.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C3865k7 c3865k7 : arrayList) {
            C4120vh c4120vh = null;
            try {
                new URL(c3865k7.m18359e());
                String strM18359e = c3865k7.m18359e();
                String upperCase = c3865k7.m18357c().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                String strM18355a = c3865k7.m18355a();
                if (strM18355a == null || StringsKt.isBlank(strM18355a)) {
                    strM18355a = null;
                }
                c4120vh = new C4120vh(strM18359e, upperCase, strM18355a, c3865k7.m18356b());
            } catch (Exception e) {
                C4048sb.m19416e("Error processing tracker from " + str + ": URL='" + c3865k7.m18359e() + "', Method='" + c3865k7.m18357c() + "'. Error: " + e.getMessage(), e);
            }
            if (c4120vh != null) {
                arrayList2.add(c4120vh);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17617a(AbstractC3724e4 clickContext, boolean z) {
        EnumC3953o4 enumC3953o4;
        Intrinsics.checkNotNullParameter(clickContext, "clickContext");
        boolean z2 = this.f14150f;
        if (z2 && this.f14149e) {
            C4048sb.m19408a("Click deduplicated. Event: " + clickContext, (Throwable) null, 2, (Object) null);
            return false;
        }
        if (!z) {
            C4048sb.m19408a("Click ignored due to lack of user gesture. Event: " + clickContext, (Throwable) null, 2, (Object) null);
            return false;
        }
        C4048sb.m19408a("Handling click tracking. Event: " + clickContext + ", Dedupe: " + z2 + ", FirstTracked: " + this.f14149e, (Throwable) null, 2, (Object) null);
        ArrayList arrayList = new ArrayList();
        boolean z3 = clickContext instanceof AbstractC3724e4.d;
        if (z3) {
            arrayList.addAll(m17615a(((AbstractC3724e4.d) clickContext).m17479a()));
        } else if (clickContext instanceof AbstractC3724e4.c) {
            arrayList.addAll(m17615a(((AbstractC3724e4.c) clickContext).m17478a()));
        } else if (clickContext instanceof AbstractC3724e4.b) {
            arrayList.addAll(m17615a(((AbstractC3724e4.b) clickContext).m17477a()));
        } else if (clickContext instanceof AbstractC3724e4.a) {
            arrayList.addAll(m17615a(((AbstractC3724e4.a) clickContext).m17476a()));
        }
        arrayList.addAll(m17616a(this.f14145a.m19181f(), "RenderableConfig"));
        arrayList.addAll(m17616a(this.f14146b.m20002d(), "AdMarkupConfig"));
        if (!arrayList.isEmpty()) {
            if (clickContext instanceof AbstractC3724e4.a) {
                enumC3953o4 = EnumC3953o4.CTA;
            } else if (clickContext instanceof AbstractC3724e4.c) {
                enumC3953o4 = EnumC3953o4.VAST_COMPANION;
            } else {
                if (!z3 && !(clickContext instanceof AbstractC3724e4.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC3953o4 = EnumC3953o4.BODY;
            }
            EnumC3953o4 enumC3953o5 = enumC3953o4;
            C3829ih.m18024a(this.f14147c, new C3770g4(this.f14146b.m20000b(), CollectionsKt.emptyList(), enumC3953o5, null, null, null, null, this.f14148d, 120, null), CollectionsKt.distinct(arrayList), null, 4, null);
            C4048sb.m19408a("Submitted " + CollectionsKt.distinct(arrayList).size() + " unique click trackers for clickType: " + enumC3953o5.m18873b() + ".", (Throwable) null, 2, (Object) null);
        }
        if (this.f14150f) {
            this.f14149e = true;
            C4048sb.m19408a("First click tracked. Subsequent clicks will be deduplicated.", (Throwable) null, 2, (Object) null);
        }
        return true;
    }
}
