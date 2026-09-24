package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ki */
/* JADX INFO: loaded from: classes3.dex */
public final class C3876ki {

    /* JADX INFO: renamed from: a */
    public final C3746f3 f15129a;

    /* JADX INFO: renamed from: b */
    public final C3784gi f15130b;

    /* JADX INFO: renamed from: c */
    public final Function1 f15131c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3888l7 f15132d;

    /* JADX INFO: renamed from: e */
    public final String f15133e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ki$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f15134b = new a();

        public a() {
            super(1, JSONArray.class, "<init>", "<init>(Ljava/util/Collection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONArray invoke(Collection collection) {
            return new JSONArray(collection);
        }
    }

    public C3876ki(C3746f3 networkService, C3784gi trackingEventCache, Function1 jsonFactory, InterfaceC3888l7 eventTracker, String sessionId) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f15129a = networkService;
        this.f15130b = trackingEventCache;
        this.f15131c = jsonFactory;
        this.f15132d = eventTracker;
        this.f15133e = sessionId;
    }

    public /* synthetic */ C3876ki(C3746f3 c3746f3, C3784gi c3784gi, Function1 function1, InterfaceC3888l7 interfaceC3888l7, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3746f3, c3784gi, (i & 4) != 0 ? a.f15134b : function1, interfaceC3888l7, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m18432a(String url, List events) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(events, "events");
        C3899li c3899li = new C3899li(url, this.f15130b, this.f15133e, null, this.f15132d, 8, null);
        c3899li.m17834a((JSONArray) this.f15131c.invoke(events));
        this.f15129a.m17614a(c3899li);
    }
}
