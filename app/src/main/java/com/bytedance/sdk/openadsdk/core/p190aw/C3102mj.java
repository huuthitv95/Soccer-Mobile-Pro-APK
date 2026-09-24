package com.bytedance.sdk.openadsdk.core.p190aw;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3102mj {
    /* JADX INFO: renamed from: ri */
    public static xha m12519ri(View view, Set<C3103qt> set) {
        AdSession adSessionM12521ri = m12521ri(CreativeType.VIDEO, set, Owner.NATIVE);
        return new jbs(adSessionM12521ri, AdEvents.createAdEvents(adSessionM12521ri), view, MediaEvents.createMediaEvents(adSessionM12521ri));
    }

    /* JADX INFO: renamed from: ri */
    public static xha m12520ri(WebView webView) {
        Partner partnerM12414ri = C3091fi.m12414ri();
        if (partnerM12414ri == null) {
            throw new IllegalArgumentException("Parameter 'partner' may not be null.");
        }
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerM12414ri, webView, "", ""));
        return new xha(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
    }

    /* JADX INFO: renamed from: ri */
    private static AdSession m12521ri(CreativeType creativeType, Set<C3103qt> set, Owner owner) {
        List<VerificationScriptResource> listM12522ri = m12522ri(set);
        listM12522ri.isEmpty();
        Partner partnerM12414ri = C3091fi.m12414ri();
        if (partnerM12414ri == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerM12414ri, C3091fi.m12412lr(), listM12522ri, "", ""));
    }

    /* JADX INFO: renamed from: ri */
    private static List<VerificationScriptResource> m12522ri(Set<C3103qt> set) {
        ArrayList arrayList = new ArrayList();
        for (C3103qt c3103qt : set) {
            try {
                if (TextUtils.isEmpty(c3103qt.m12529ri()) || TextUtils.isEmpty(c3103qt.m12528lr())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(c3103qt.m12527ik()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(c3103qt.m12529ri(), c3103qt.m12527ik(), c3103qt.m12528lr()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
