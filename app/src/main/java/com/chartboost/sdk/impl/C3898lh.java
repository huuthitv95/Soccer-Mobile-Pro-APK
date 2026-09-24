package com.chartboost.sdk.impl;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p300io.FilesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.lh */
/* JADX INFO: loaded from: classes3.dex */
public final class C3898lh implements InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3911m7 f15230a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.lh$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f15231b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(1);
            this.f15231b = map;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(MatchResult matchResult) {
            Intrinsics.checkNotNullParameter(matchResult, "matchResult");
            String value = matchResult.getValue();
            String str = (String) this.f15231b.get(value);
            return str != null ? str : value;
        }
    }

    public C3898lh(InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f15230a = eventTracker;
    }

    /* JADX INFO: renamed from: a */
    public final String m18514a(File htmlFile, Map allParams, String adTypeName, String location) {
        Intrinsics.checkNotNullParameter(htmlFile, "htmlFile");
        Intrinsics.checkNotNullParameter(allParams, "allParams");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            Regex regex = new Regex("\\{\\{\\s*([^}]+)\\s*\\}\\}|\\{%\\s*([^}]+)\\s*%\\}");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allParams.entrySet()) {
                String str = (String) entry.getKey();
                if (StringsKt.startsWith$default(str, "{{", false, 2, (Object) null) || StringsKt.startsWith$default(str, "{%", false, 2, (Object) null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return m18515a(regex.replace(FilesKt.readText(htmlFile, Charsets.UTF_8), new a(linkedHashMap)));
        } catch (Exception e) {
            C4048sb.m19410b("Failed to parse template", e);
            m18516a(adTypeName, location, e.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m18515a(String str) {
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "{{", false, 2, (Object) null)) {
            return str;
        }
        throw new IllegalArgumentException("Missing required template parameter " + str);
    }

    /* JADX INFO: renamed from: a */
    public final void m18516a(String str, String str2, String str3) {
        track((AbstractC3738ei) C3954o5.f15633m.m18877a(InterfaceC3807hi.i.HTML_MISSING_MUSTACHE_ERROR, str3, str, str2));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15230a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15230a.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15230a.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15230a.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15230a.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f15230a.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f15230a.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f15230a.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f15230a.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15230a.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15230a.mo43989track(event);
    }
}
