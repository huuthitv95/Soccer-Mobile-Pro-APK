package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.de */
/* JADX INFO: loaded from: classes3.dex */
public final class C3711de {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.de$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public AdSession f13832a;

        /* JADX INFO: renamed from: b */
        public AdEvents f13833b;

        /* JADX INFO: renamed from: c */
        public MediaEvents f13834c;

        public a(AdSession adSession, AdEvents adEvents, MediaEvents mediaEvents) {
            this.f13832a = adSession;
            this.f13833b = adEvents;
            this.f13834c = mediaEvents;
        }

        /* JADX INFO: renamed from: a */
        public final MediaEvents m17296a() {
            return this.f13834c;
        }

        /* JADX INFO: renamed from: a */
        public final void m17297a(AdEvents adEvents) {
            this.f13833b = adEvents;
        }

        /* JADX INFO: renamed from: a */
        public final void m17298a(AdSession adSession) {
            this.f13832a = adSession;
        }

        /* JADX INFO: renamed from: b */
        public final AdEvents m17299b() {
            return this.f13833b;
        }

        /* JADX INFO: renamed from: c */
        public final AdSession m17300c() {
            return this.f13832a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f13832a, aVar.f13832a) && Intrinsics.areEqual(this.f13833b, aVar.f13833b) && Intrinsics.areEqual(this.f13834c, aVar.f13834c);
        }

        public int hashCode() {
            AdSession adSession = this.f13832a;
            int iHashCode = (adSession == null ? 0 : adSession.hashCode()) * 31;
            AdEvents adEvents = this.f13833b;
            int iHashCode2 = (iHashCode + (adEvents == null ? 0 : adEvents.hashCode())) * 31;
            MediaEvents mediaEvents = this.f13834c;
            return iHashCode2 + (mediaEvents != null ? mediaEvents.hashCode() : 0);
        }

        public String toString() {
            return "OMSessionHolder(omSession=" + this.f13832a + ", omAdEvents=" + this.f13833b + ", mediaEvents=" + this.f13834c + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.de$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13835a;

        static {
            int[] iArr = new int[EnumC3709dc.values().length];
            try {
                iArr[EnumC3709dc.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3709dc.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3709dc.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3709dc.AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3709dc.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13835a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m17285a(C3952o3 webView, EnumC3709dc mtype, Partner partner, String str, List verificationScriptResourcesList, boolean z, List verificationListConfig) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(verificationScriptResourcesList, "verificationScriptResourcesList");
        Intrinsics.checkNotNullParameter(verificationListConfig, "verificationListConfig");
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(m17286a(mtype), m17289a(partner, str, verificationScriptResourcesList, z, verificationListConfig, mtype, webView));
            adSessionCreateAdSession.registerAdView(webView);
            AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionCreateAdSession);
            Intrinsics.checkNotNull(adSessionCreateAdSession);
            return new a(adSessionCreateAdSession, adEventsCreateAdEvents, m17290a(mtype, adSessionCreateAdSession));
        } catch (Exception e) {
            C4048sb.m19410b("OMSDK create session exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AdSessionConfiguration m17286a(EnumC3709dc enumC3709dc) {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(m17294b(enumC3709dc), ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, m17295c(enumC3709dc), false);
        } catch (IllegalArgumentException e) {
            C4048sb.m19407a("buildAdSessionVideoConfig error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AdSessionContext m17287a(Partner partner, C3952o3 c3952o3) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(partner, c3952o3, null, null);
        } catch (IllegalArgumentException e) {
            C4048sb.m19407a("buildHtmlContext error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AdSessionContext m17288a(Partner partner, String str, List list, boolean z, List list2) {
        try {
            return AdSessionContext.createNativeAdSessionContext(partner, str, m17293a(list, list2, z), null, null);
        } catch (IllegalArgumentException e) {
            C4048sb.m19407a("buildNativeContext error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AdSessionContext m17289a(Partner partner, String str, List list, boolean z, List list2, EnumC3709dc enumC3709dc, C3952o3 c3952o3) {
        return enumC3709dc == EnumC3709dc.HTML ? m17287a(partner, c3952o3) : m17288a(partner, str, list, z, list2);
    }

    /* JADX INFO: renamed from: a */
    public final MediaEvents m17290a(EnumC3709dc enumC3709dc, AdSession adSession) {
        if (enumC3709dc == EnumC3709dc.HTML) {
            return null;
        }
        return MediaEvents.createMediaEvents(adSession);
    }

    /* JADX INFO: renamed from: a */
    public final URL m17291a(String str) {
        try {
            return new URL(str);
        } catch (Exception e) {
            C4048sb.m19407a("buildVerificationResources invalid url", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m17292a(List list) {
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4034rj c4034rj = (C4034rj) it.next();
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(c4034rj.m19363c(), m17291a(c4034rj.m19362b()), c4034rj.m19361a()));
            }
            return arrayList;
        } catch (Exception e) {
            C4048sb.m19407a("buildVerificationResources error", e);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m17293a(List list, List list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.addAll(m17292a(list2));
        }
        arrayList.addAll(list);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final CreativeType m17294b(EnumC3709dc enumC3709dc) {
        int i = b.f13835a[enumC3709dc.ordinal()];
        if (i == 1) {
            return CreativeType.NATIVE_DISPLAY;
        }
        if (i == 2) {
            return CreativeType.HTML_DISPLAY;
        }
        if (i == 3) {
            return CreativeType.VIDEO;
        }
        if (i == 4) {
            return CreativeType.AUDIO;
        }
        if (i == 5) {
            return CreativeType.NATIVE_DISPLAY;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final Owner m17295c(EnumC3709dc enumC3709dc) {
        int i = b.f13835a[enumC3709dc.ordinal()];
        if (i == 1) {
            return Owner.NATIVE;
        }
        if (i == 2) {
            return Owner.NONE;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return Owner.NATIVE;
    }
}
