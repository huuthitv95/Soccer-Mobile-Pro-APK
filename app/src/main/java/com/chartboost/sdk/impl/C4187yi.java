package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.yi */
/* JADX INFO: loaded from: classes3.dex */
public final class C4187yi implements InterfaceC3911m7 {

    /* JADX INFO: renamed from: b */
    public static final C4187yi f17062b = new C4187yi();

    /* JADX INFO: renamed from: c */
    public static String f17063c = "Invalid user-agent value";

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3911m7 f17064a = AbstractC4142wh.m19810a();

    /* JADX INFO: renamed from: a */
    public final String m20065a() {
        return f17063c;
    }

    /* JADX INFO: renamed from: a */
    public final void m20066a(Context context) {
        String defaultUserAgent;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            defaultUserAgent = System.getProperty("http.agent");
        } catch (Exception e) {
            m20067a(e.toString());
            defaultUserAgent = "";
        }
        try {
            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        } catch (Exception e2) {
            m20067a(e2.toString());
        }
        if (defaultUserAgent != null) {
            f17063c = defaultUserAgent;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20067a(String str) {
        try {
            track((AbstractC3738ei) new C3796h7(InterfaceC3807hi.f.USER_AGENT_UPDATE_ERROR, str, null, null, null, 28, null));
        } catch (Exception e) {
            C4048sb.m19410b("sendUserAgentErrorTracking", e);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f17064a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f17064a.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17064a.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f17064a.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17064a.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f17064a.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f17064a.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f17064a.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f17064a.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f17064a.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17064a.mo43989track(event);
    }
}
