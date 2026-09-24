package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Bc */
/* JADX INFO: loaded from: classes6.dex */
public class C11366Bc {

    /* JADX INFO: renamed from: d */
    public static final String f23951d = "Ironsrc";

    /* JADX INFO: renamed from: e */
    public static final String f23952e = "7";

    /* JADX INFO: renamed from: f */
    public static final String f23953f = Omid.getVersion();

    /* JADX INFO: renamed from: g */
    public static final String f23954g = "omidVersion";

    /* JADX INFO: renamed from: h */
    public static final String f23955h = "omidPartnerName";

    /* JADX INFO: renamed from: i */
    public static final String f23956i = "omidPartnerVersion";

    /* JADX INFO: renamed from: j */
    public static final String f23957j = "omidActiveAdSessions";

    /* JADX INFO: renamed from: k */
    private static final String f23958k = "Invalid OMID impressionOwner";

    /* JADX INFO: renamed from: l */
    private static final String f23959l = "Invalid OMID videoEventsOwner";

    /* JADX INFO: renamed from: m */
    private static final String f23960m = "Missing OMID impressionOwner";

    /* JADX INFO: renamed from: n */
    private static final String f23961n = "Missing OMID videoEventsOwner";

    /* JADX INFO: renamed from: o */
    private static final String f23962o = "OMID has not been activated";

    /* JADX INFO: renamed from: p */
    private static final String f23963p = "Missing OMID creativeType";

    /* JADX INFO: renamed from: q */
    private static final String f23964q = "Missing adview id in OMID params";

    /* JADX INFO: renamed from: r */
    private static final String f23965r = "No adview found with the provided adViewId";

    /* JADX INFO: renamed from: s */
    private static final String f23966s = "OMID Session has already started";

    /* JADX INFO: renamed from: t */
    private static final String f23967t = "OMID Session has not started";

    /* JADX INFO: renamed from: a */
    private final Partner f23968a = Partner.createPartner(f23951d, f23952e);

    /* JADX INFO: renamed from: c */
    private boolean f23970c = false;

    /* JADX INFO: renamed from: b */
    private final HashMap<String, AdSession> f23969b = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.Bc$a */
    static class a {

        /* JADX INFO: renamed from: i */
        private static final String f23971i = "isolateVerificationScripts";

        /* JADX INFO: renamed from: j */
        private static final String f23972j = "impressionOwner";

        /* JADX INFO: renamed from: k */
        private static final String f23973k = "videoEventsOwner";

        /* JADX INFO: renamed from: l */
        private static final String f23974l = "customReferenceData";

        /* JADX INFO: renamed from: m */
        private static final String f23975m = "creativeType";

        /* JADX INFO: renamed from: n */
        private static final String f23976n = "impressionType";

        /* JADX INFO: renamed from: o */
        public static final String f23977o = "adViewId";

        /* JADX INFO: renamed from: a */
        public boolean f23978a;

        /* JADX INFO: renamed from: b */
        public Owner f23979b;

        /* JADX INFO: renamed from: c */
        public Owner f23980c;

        /* JADX INFO: renamed from: d */
        public String f23981d;

        /* JADX INFO: renamed from: e */
        public ImpressionType f23982e;

        /* JADX INFO: renamed from: f */
        public CreativeType f23983f;

        /* JADX INFO: renamed from: g */
        public String f23984g;

        /* JADX INFO: renamed from: h */
        public Owner f23985h;

        /* JADX INFO: renamed from: a */
        public static a m25494a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.f23978a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String strOptString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(C11366Bc.f23960m);
            }
            try {
                aVar.f23979b = Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
                String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(strOptString)) {
                    throw new IllegalArgumentException(C11366Bc.f23961n);
                }
                try {
                    aVar.f23980c = Owner.valueOf(strOptString2.toUpperCase(Locale.getDefault()));
                    aVar.f23981d = jSONObject.optString("customReferenceData", "");
                    aVar.f23983f = m25495b(jSONObject);
                    aVar.f23982e = m25496c(jSONObject);
                    aVar.f23984g = m25498e(jSONObject);
                    aVar.f23985h = m25497d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e) {
                    C12317m4.m32153d().m32155a(e);
                    throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + strOptString2);
                }
            } catch (IllegalArgumentException e2) {
                C12317m4.m32153d().m32155a(e2);
                throw new IllegalArgumentException("Invalid OMID impressionOwner " + strOptString);
            }
        }

        /* JADX INFO: renamed from: b */
        private static CreativeType m25495b(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(C11366Bc.f23963p + strOptString);
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(C11366Bc.f23963p + strOptString);
        }

        /* JADX INFO: renamed from: c */
        private static ImpressionType m25496c(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(C11366Bc.f23963p + strOptString);
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(C11366Bc.f23963p + strOptString);
        }

        /* JADX INFO: renamed from: d */
        private static Owner m25497d(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e) {
                C12317m4.m32153d().m32155a(e);
                return owner;
            }
        }

        /* JADX INFO: renamed from: e */
        private static String m25498e(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            throw new IllegalArgumentException(C11366Bc.f23964q + strOptString);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25489a(Context context) throws IllegalArgumentException {
        if (this.f23970c) {
            return;
        }
        Omid.activate(context);
        this.f23970c = true;
    }

    /* JADX INFO: renamed from: b */
    public void m25491b(JSONObject jSONObject) throws IllegalStateException {
        m25487a(jSONObject);
        String strOptString = jSONObject.optString("adViewId");
        AdSession adSession = this.f23969b.get(strOptString);
        if (adSession == null) {
            throw new IllegalStateException(f23967t);
        }
        adSession.finish();
        this.f23969b.remove(strOptString);
    }

    /* JADX INFO: renamed from: c */
    public void m25492c(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        m25487a(jSONObject);
        AdSession adSession = this.f23969b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(f23967t);
        }
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            adEventsCreateAdEvents.loaded();
        }
        adEventsCreateAdEvents.impressionOccurred();
    }

    /* JADX INFO: renamed from: d */
    public void m25493d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        m25490a(a.m25494a(jSONObject));
    }

    /* JADX INFO: renamed from: a */
    public C11720Vd m25488a() {
        C11720Vd c11720Vd = new C11720Vd();
        c11720Vd.m27757b(f23954g, SDKUtils.encodeString(f23953f));
        c11720Vd.m27757b(f23955h, SDKUtils.encodeString(f23951d));
        c11720Vd.m27757b(f23956i, SDKUtils.encodeString(f23952e));
        c11720Vd.m27757b(f23957j, SDKUtils.encodeString(Arrays.toString(this.f23969b.keySet().toArray())));
        return c11720Vd;
    }

    /* JADX INFO: renamed from: a */
    public void m25490a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (this.f23970c) {
            if (!TextUtils.isEmpty(aVar.f23984g)) {
                String str = aVar.f23984g;
                if (!this.f23969b.containsKey(str)) {
                    InterfaceC11434F8 interfaceC11434F8Mo31278a = C12282k8.m31929a().mo31278a(str);
                    if (interfaceC11434F8Mo31278a != null) {
                        AdSession adSessionM25486a = m25486a(aVar, interfaceC11434F8Mo31278a);
                        adSessionM25486a.start();
                        this.f23969b.put(str, adSessionM25486a);
                        return;
                    }
                    throw new IllegalStateException(f23965r);
                }
                throw new IllegalStateException(f23966s);
            }
            throw new IllegalStateException(f23964q);
        }
        throw new IllegalStateException(f23962o);
    }

    /* JADX INFO: renamed from: a */
    private AdSession m25486a(a aVar, InterfaceC11434F8 interfaceC11434F8) throws IllegalArgumentException {
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f23983f, aVar.f23982e, aVar.f23979b, aVar.f23980c, aVar.f23978a), AdSessionContext.createHtmlAdSessionContext(this.f23968a, interfaceC11434F8.getPresentingView(), null, aVar.f23981d));
        adSessionCreateAdSession.registerAdView(interfaceC11434F8.getPresentingView());
        return adSessionCreateAdSession;
    }

    /* JADX INFO: renamed from: a */
    private void m25487a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f23970c) {
            throw new IllegalStateException(f23962o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f23967t);
        }
    }
}
