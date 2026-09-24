package com.iab.omid.library.fyber.adsession;

import android.view.View;
import com.iab.omid.library.fyber.internal.C11081a;
import com.iab.omid.library.fyber.internal.C11083c;
import com.iab.omid.library.fyber.internal.C11085e;
import com.iab.omid.library.fyber.internal.C11086f;
import com.iab.omid.library.fyber.internal.C11089i;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import com.iab.omid.library.fyber.publisher.C11096a;
import com.iab.omid.library.fyber.publisher.C11097b;
import com.iab.omid.library.fyber.utils.C11104g;
import com.iab.omid.library.fyber.weakreference.C11119a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.adsession.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11073a extends AdSession {

    /* JADX INFO: renamed from: a */
    private final AdSessionContext f23076a;

    /* JADX INFO: renamed from: b */
    private final AdSessionConfiguration f23077b;

    /* JADX INFO: renamed from: c */
    private final C11086f f23078c;

    /* JADX INFO: renamed from: d */
    private C11119a f23079d;

    /* JADX INFO: renamed from: e */
    private AdSessionStatePublisher f23080e;

    /* JADX INFO: renamed from: f */
    private boolean f23081f;

    /* JADX INFO: renamed from: g */
    private boolean f23082g;

    /* JADX INFO: renamed from: h */
    private final String f23083h;

    /* JADX INFO: renamed from: i */
    private boolean f23084i;

    /* JADX INFO: renamed from: j */
    private boolean f23085j;

    /* JADX INFO: renamed from: k */
    private PossibleObstructionListener f23086k;

    C11073a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    C11073a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f23078c = new C11086f();
        this.f23081f = false;
        this.f23082g = false;
        this.f23077b = adSessionConfiguration;
        this.f23076a = adSessionContext;
        this.f23083h = str;
        m23935b(null);
        this.f23080e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C11096a(str, adSessionContext.getWebView()) : new C11097b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23080e.mo24072i();
        C11083c.m23981c().m23983a(this);
        this.f23080e.m24052a(adSessionConfiguration);
    }

    /* JADX INFO: renamed from: a */
    private void m23932a() {
        if (this.f23084i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23933a(View view) {
        Collection<C11073a> collectionM23984b = C11083c.m23981c().m23984b();
        if (collectionM23984b == null || collectionM23984b.isEmpty()) {
            return;
        }
        for (C11073a c11073a : collectionM23984b) {
            if (c11073a != this && c11073a.m23940e() == view) {
                c11073a.f23079d.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23934b() {
        if (this.f23085j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23935b(View view) {
        this.f23079d = new C11119a(view);
    }

    /* JADX INFO: renamed from: a */
    public void m23936a(List<C11119a> list) {
        if (m23942g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C11119a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23086k.onPossibleObstructionsDetected(this.f23083h, arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    void m23937a(JSONObject jSONObject) {
        m23934b();
        m23939d().m24061a(jSONObject);
        this.f23085j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23082g) {
            return;
        }
        this.f23078c.m24004a(view, friendlyObstructionPurpose, str);
    }

    /* JADX INFO: renamed from: c */
    public String m23938c() {
        return this.f23083h;
    }

    /* JADX INFO: renamed from: d */
    public AdSessionStatePublisher m23939d() {
        return this.f23080e;
    }

    /* JADX INFO: renamed from: e */
    public View m23940e() {
        return this.f23079d.get();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23082g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C11104g.m24114a(errorType, "Error type is null");
        C11104g.m24116a(str, "Message is null");
        m23939d().m24053a(errorType, str);
    }

    /* JADX INFO: renamed from: f */
    public List<C11085e> m23941f() {
        return this.f23078c.m24003a();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void finish() {
        if (this.f23082g) {
            return;
        }
        this.f23079d.clear();
        removeAllFriendlyObstructions();
        this.f23082g = true;
        m23939d().m24069f();
        C11083c.m23981c().m23985b(this);
        m23939d().mo24063b();
        this.f23080e = null;
        this.f23086k = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m23942g() {
        return this.f23086k != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m23943h() {
        return this.f23081f && !this.f23082g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m23944i() {
        return this.f23082g;
    }

    /* JADX INFO: renamed from: j */
    public boolean m23945j() {
        return this.f23077b.isNativeImpressionOwner();
    }

    /* JADX INFO: renamed from: k */
    public boolean m23946k() {
        return this.f23077b.isNativeMediaEventsOwner();
    }

    /* JADX INFO: renamed from: l */
    public boolean m23947l() {
        return this.f23081f;
    }

    /* JADX INFO: renamed from: m */
    void m23948m() {
        m23932a();
        m23939d().m24070g();
        this.f23084i = true;
    }

    /* JADX INFO: renamed from: n */
    void m23949n() {
        m23934b();
        m23939d().m24071h();
        this.f23085j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f23082g || m23940e() == view) {
            return;
        }
        m23935b(view);
        m23939d().m24048a();
        m23933a(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23082g) {
            return;
        }
        this.f23078c.m24005b();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23082g) {
            return;
        }
        this.f23078c.m24006c(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23086k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void start() {
        if (this.f23081f || this.f23080e == null) {
            return;
        }
        this.f23081f = true;
        C11083c.m23981c().m23986c(this);
        this.f23080e.m24049a(C11089i.m24029c().m24031b());
        this.f23080e.m24060a(C11081a.m23972a().m23976b());
        this.f23080e.mo24054a(this, this.f23076a);
    }
}
