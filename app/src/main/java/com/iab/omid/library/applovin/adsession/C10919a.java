package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.C10927a;
import com.iab.omid.library.applovin.internal.C10929c;
import com.iab.omid.library.applovin.internal.C10931e;
import com.iab.omid.library.applovin.internal.C10932f;
import com.iab.omid.library.applovin.internal.C10935i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.C10942a;
import com.iab.omid.library.applovin.publisher.C10943b;
import com.iab.omid.library.applovin.utils.C10950g;
import com.iab.omid.library.applovin.weakreference.C10965a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.adsession.a */
/* JADX INFO: loaded from: classes6.dex */
public class C10919a extends AdSession {

    /* JADX INFO: renamed from: a */
    private final AdSessionContext f22671a;

    /* JADX INFO: renamed from: b */
    private final AdSessionConfiguration f22672b;

    /* JADX INFO: renamed from: c */
    private final C10932f f22673c;

    /* JADX INFO: renamed from: d */
    private C10965a f22674d;

    /* JADX INFO: renamed from: e */
    private AdSessionStatePublisher f22675e;

    /* JADX INFO: renamed from: f */
    private boolean f22676f;

    /* JADX INFO: renamed from: g */
    private boolean f22677g;

    /* JADX INFO: renamed from: h */
    private final String f22678h;

    /* JADX INFO: renamed from: i */
    private boolean f22679i;

    /* JADX INFO: renamed from: j */
    private boolean f22680j;

    /* JADX INFO: renamed from: k */
    private PossibleObstructionListener f22681k;

    C10919a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    C10919a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f22673c = new C10932f();
        this.f22676f = false;
        this.f22677g = false;
        this.f22672b = adSessionConfiguration;
        this.f22671a = adSessionContext;
        this.f22678h = str;
        m23178b(null);
        this.f22675e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C10942a(str, adSessionContext.getWebView()) : new C10943b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f22675e.mo23315i();
        C10929c.m23224c().m23226a(this);
        this.f22675e.m23295a(adSessionConfiguration);
    }

    /* JADX INFO: renamed from: a */
    private void m23175a() {
        if (this.f22679i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23176a(View view) {
        Collection<C10919a> collectionM23227b = C10929c.m23224c().m23227b();
        if (collectionM23227b == null || collectionM23227b.isEmpty()) {
            return;
        }
        for (C10919a c10919a : collectionM23227b) {
            if (c10919a != this && c10919a.m23183e() == view) {
                c10919a.f22674d.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23177b() {
        if (this.f22680j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23178b(View view) {
        this.f22674d = new C10965a(view);
    }

    /* JADX INFO: renamed from: a */
    public void m23179a(List<C10965a> list) {
        if (m23185g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C10965a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f22681k.onPossibleObstructionsDetected(this.f22678h, arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    void m23180a(JSONObject jSONObject) {
        m23177b();
        m23182d().m23304a(jSONObject);
        this.f22680j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f22677g) {
            return;
        }
        this.f22673c.m23247a(view, friendlyObstructionPurpose, str);
    }

    /* JADX INFO: renamed from: c */
    public String m23181c() {
        return this.f22678h;
    }

    /* JADX INFO: renamed from: d */
    public AdSessionStatePublisher m23182d() {
        return this.f22675e;
    }

    /* JADX INFO: renamed from: e */
    public View m23183e() {
        return this.f22674d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f22677g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C10950g.m23357a(errorType, "Error type is null");
        C10950g.m23359a(str, "Message is null");
        m23182d().m23296a(errorType, str);
    }

    /* JADX INFO: renamed from: f */
    public List<C10931e> m23184f() {
        return this.f22673c.m23246a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f22677g) {
            return;
        }
        this.f22674d.clear();
        removeAllFriendlyObstructions();
        this.f22677g = true;
        m23182d().m23312f();
        C10929c.m23224c().m23228b(this);
        m23182d().mo23306b();
        this.f22675e = null;
        this.f22681k = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m23185g() {
        return this.f22681k != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m23186h() {
        return this.f22676f && !this.f22677g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m23187i() {
        return this.f22677g;
    }

    /* JADX INFO: renamed from: j */
    public boolean m23188j() {
        return this.f22672b.isNativeImpressionOwner();
    }

    /* JADX INFO: renamed from: k */
    public boolean m23189k() {
        return this.f22672b.isNativeMediaEventsOwner();
    }

    /* JADX INFO: renamed from: l */
    public boolean m23190l() {
        return this.f22676f;
    }

    /* JADX INFO: renamed from: m */
    void m23191m() {
        m23175a();
        m23182d().m23313g();
        this.f22679i = true;
    }

    /* JADX INFO: renamed from: n */
    void m23192n() {
        m23177b();
        m23182d().m23314h();
        this.f22680j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f22677g || m23183e() == view) {
            return;
        }
        m23178b(view);
        m23182d().m23291a();
        m23176a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f22677g) {
            return;
        }
        this.f22673c.m23248b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f22677g) {
            return;
        }
        this.f22673c.m23249c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f22681k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f22676f || this.f22675e == null) {
            return;
        }
        this.f22676f = true;
        C10929c.m23224c().m23229c(this);
        this.f22675e.m23292a(C10935i.m23272c().m23274b());
        this.f22675e.m23303a(C10927a.m23215a().m23219b());
        this.f22675e.mo23297a(this, this.f22671a);
    }
}
