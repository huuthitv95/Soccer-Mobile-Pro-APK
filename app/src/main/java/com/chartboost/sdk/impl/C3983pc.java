package com.chartboost.sdk.impl;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.pc */
/* JADX INFO: loaded from: classes3.dex */
public final class C3983pc implements InterfaceC4123vk {

    /* JADX INFO: renamed from: a */
    public static final a f15811a = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.pc$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4123vk
    /* JADX INFO: renamed from: a */
    public InterfaceC4101uk mo19060a(InterfaceC4013qk manager, WebView webView) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(webView, "webView");
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(manager.mo18637a(), webView, "", ""));
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionCreateAdSession);
        Intrinsics.checkNotNull(adSessionCreateAdSession);
        Intrinsics.checkNotNull(adEventsCreateAdEvents);
        return new C3961oc(manager, adSessionCreateAdSession, adEventsCreateAdEvents, webView);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4123vk
    /* JADX INFO: renamed from: a */
    public InterfaceC4167xk mo19061a(InterfaceC4013qk manager, View videoView, Set viewabilityVendors) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(viewabilityVendors, "viewabilityVendors");
        AdSession adSessionM19062a = m19062a(manager, CreativeType.VIDEO, viewabilityVendors, Owner.NATIVE);
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionM19062a);
        MediaEvents mediaEventsCreateMediaEvents = MediaEvents.createMediaEvents(adSessionM19062a);
        Intrinsics.checkNotNull(adEventsCreateAdEvents);
        Intrinsics.checkNotNull(mediaEventsCreateMediaEvents);
        return new C4005qc(manager, adSessionM19062a, adEventsCreateAdEvents, mediaEventsCreateMediaEvents, videoView);
    }

    /* JADX INFO: renamed from: a */
    public AdSession m19062a(InterfaceC4013qk manager, CreativeType creativeType, Set viewabilityVendors, Owner mediaEventsOwner) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(viewabilityVendors, "viewabilityVendors");
        Intrinsics.checkNotNullParameter(mediaEventsOwner, "mediaEventsOwner");
        List listM19063a = m19063a(viewabilityVendors);
        if (listM19063a.isEmpty()) {
            throw new IllegalArgumentException("verificationScriptResources is empty");
        }
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, mediaEventsOwner, false), AdSessionContext.createNativeAdSessionContext(manager.mo18637a(), manager.mo18642c(), listM19063a, "", ""));
        Intrinsics.checkNotNullExpressionValue(adSessionCreateAdSession, "createAdSession(...)");
        return adSessionCreateAdSession;
    }

    /* JADX INFO: renamed from: a */
    public final List m19063a(Set set) {
        String strM20072c;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4189yk c4189yk = (C4189yk) it.next();
            String strM20071b = c4189yk.m20071b();
            if (strM20071b == null || strM20071b.length() == 0 || (strM20072c = c4189yk.m20072c()) == null || strM20072c.length() == 0) {
                VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(c4189yk.m20070a());
                Intrinsics.checkNotNullExpressionValue(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters, "createVerificationScript…rceWithoutParameters(...)");
                arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
            } else {
                VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(c4189yk.m20071b(), c4189yk.m20070a(), c4189yk.m20072c());
                Intrinsics.checkNotNullExpressionValue(verificationScriptResourceCreateVerificationScriptResourceWithParameters, "createVerificationScript…sourceWithParameters(...)");
                arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithParameters);
            }
        }
        return arrayList;
    }
}
