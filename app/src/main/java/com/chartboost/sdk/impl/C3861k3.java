package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.k3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3861k3 implements InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3911m7 f15017a;

    public C3861k3(InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f15017a = eventTracker;
    }

    /* JADX INFO: renamed from: a */
    public final void m18339a(C3952o3 c3952o3, float f, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seconds", Float.valueOf(f));
        String strM18416c = EnumC3871kd.PLAYBACK_TIME.m18416c();
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        m18342a(strM18416c, string, c3952o3, location, adTypeName);
    }

    /* JADX INFO: renamed from: a */
    public final void m18340a(C3952o3 c3952o3, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        m18345b(EnumC3871kd.ON_BACKGROUND.m18416c(), c3952o3, location, adTypeName);
    }

    /* JADX INFO: renamed from: a */
    public final void m18341a(String str, C3952o3 c3952o3, String str2, String str3) {
        try {
            if (c3952o3 == null) {
                track((AbstractC3738ei) new C3954o5(InterfaceC3807hi.i.WEBVIEW_ERROR, "Webview is null", str3, str2, null, null, 48, null));
                C4048sb.m19411b("Calling native to javascript webview is null", (Throwable) null, 2, (Object) null);
            } else {
                C4048sb.m19408a("Calling native to javascript: " + str, (Throwable) null, 2, (Object) null);
                c3952o3.loadUrl(str);
            }
        } catch (Exception e) {
            track((AbstractC3738ei) new C3954o5(InterfaceC3807hi.i.WEBVIEW_CRASH, "Cannot open url: " + e, str3, str2, null, null, 48, null));
            C4048sb.m19410b("Calling native to javascript. Cannot open url", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18342a(String str, String str2, C3952o3 c3952o3, String str3, String str4) {
        m18341a("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\", " + str2 + ")", c3952o3, str3, str4);
    }

    /* JADX INFO: renamed from: b */
    public final void m18343b(C3952o3 c3952o3, float f, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", Float.valueOf(f));
        String strM18416c = EnumC3871kd.VIDEO_STARTED.m18416c();
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        m18342a(strM18416c, string, c3952o3, location, adTypeName);
    }

    /* JADX INFO: renamed from: b */
    public final void m18344b(C3952o3 c3952o3, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        m18345b(EnumC3871kd.ON_FOREGROUND.m18416c(), c3952o3, location, adTypeName);
    }

    /* JADX INFO: renamed from: b */
    public final void m18345b(String str, C3952o3 c3952o3, String str2, String str3) {
        m18341a("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\")", c3952o3, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public final void m18346c(C3952o3 c3952o3, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        m18345b(EnumC3871kd.VIDEO_ENDED.m18416c(), c3952o3, location, adTypeName);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15017a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15017a.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15017a.mo43985clearFromStorage(event);
    }

    /* JADX INFO: renamed from: d */
    public final void m18347d(C3952o3 c3952o3, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        m18345b(EnumC3871kd.VIDEO_FAILED.m18416c(), c3952o3, location, adTypeName);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15017a.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15017a.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f15017a.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f15017a.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f15017a.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f15017a.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15017a.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15017a.mo43989track(event);
    }
}
