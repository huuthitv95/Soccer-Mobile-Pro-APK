package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.C11132a;
import com.iab.omid.library.ironsrc.internal.C11134c;
import com.iab.omid.library.ironsrc.internal.C11136e;
import com.iab.omid.library.ironsrc.internal.C11137f;
import com.iab.omid.library.ironsrc.internal.C11140i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.C11147a;
import com.iab.omid.library.ironsrc.publisher.C11148b;
import com.iab.omid.library.ironsrc.utils.C11155g;
import com.iab.omid.library.ironsrc.weakreference.C11170a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.adsession.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11124a extends AdSession {

    /* JADX INFO: renamed from: a */
    private final AdSessionContext f23211a;

    /* JADX INFO: renamed from: b */
    private final AdSessionConfiguration f23212b;

    /* JADX INFO: renamed from: c */
    private final C11137f f23213c;

    /* JADX INFO: renamed from: d */
    private C11170a f23214d;

    /* JADX INFO: renamed from: e */
    private AdSessionStatePublisher f23215e;

    /* JADX INFO: renamed from: f */
    private boolean f23216f;

    /* JADX INFO: renamed from: g */
    private boolean f23217g;

    /* JADX INFO: renamed from: h */
    private final String f23218h;

    /* JADX INFO: renamed from: i */
    private boolean f23219i;

    /* JADX INFO: renamed from: j */
    private boolean f23220j;

    /* JADX INFO: renamed from: k */
    private PossibleObstructionListener f23221k;

    C11124a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    C11124a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f23213c = new C11137f();
        this.f23216f = false;
        this.f23217g = false;
        this.f23212b = adSessionConfiguration;
        this.f23211a = adSessionContext;
        this.f23218h = str;
        m24190b(null);
        this.f23215e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C11147a(str, adSessionContext.getWebView()) : new C11148b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23215e.mo24325i();
        C11134c.m24234c().m24236a(this);
        this.f23215e.m24305a(adSessionConfiguration);
    }

    /* JADX INFO: renamed from: a */
    private void m24187a() {
        if (this.f23219i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24188a(View view) {
        Collection<C11124a> collectionM24237b = C11134c.m24234c().m24237b();
        if (collectionM24237b == null || collectionM24237b.isEmpty()) {
            return;
        }
        for (C11124a c11124a : collectionM24237b) {
            if (c11124a != this && c11124a.m24193c() == view) {
                c11124a.f23214d.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24189b() {
        if (this.f23220j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24190b(View view) {
        this.f23214d = new C11170a(view);
    }

    /* JADX INFO: renamed from: a */
    public void m24191a(List<C11170a> list) {
        if (m24195e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C11170a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23221k.onPossibleObstructionsDetected(this.f23218h, arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    void m24192a(JSONObject jSONObject) {
        m24189b();
        getAdSessionStatePublisher().m24314a(jSONObject);
        this.f23220j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23217g) {
            return;
        }
        this.f23213c.m24257a(view, friendlyObstructionPurpose, str);
    }

    /* JADX INFO: renamed from: c */
    public View m24193c() {
        return this.f23214d.get();
    }

    /* JADX INFO: renamed from: d */
    public List<C11136e> m24194d() {
        return this.f23213c.m24256a();
    }

    /* JADX INFO: renamed from: e */
    public boolean m24195e() {
        return this.f23221k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23217g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C11155g.m24367a(errorType, "Error type is null");
        C11155g.m24369a(str, "Message is null");
        getAdSessionStatePublisher().m24306a(errorType, str);
    }

    /* JADX INFO: renamed from: f */
    public boolean m24196f() {
        return this.f23216f && !this.f23217g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f23217g) {
            return;
        }
        this.f23214d.clear();
        removeAllFriendlyObstructions();
        this.f23217g = true;
        getAdSessionStatePublisher().m24322f();
        C11134c.m24234c().m24238b(this);
        getAdSessionStatePublisher().mo24316b();
        this.f23215e = null;
        this.f23221k = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m24197g() {
        return this.f23217g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f23218h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f23215e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m24198h() {
        return this.f23212b.isNativeImpressionOwner();
    }

    /* JADX INFO: renamed from: i */
    public boolean m24199i() {
        return this.f23212b.isNativeMediaEventsOwner();
    }

    /* JADX INFO: renamed from: j */
    public boolean m24200j() {
        return this.f23216f;
    }

    /* JADX INFO: renamed from: k */
    void m24201k() {
        m24187a();
        getAdSessionStatePublisher().m24323g();
        this.f23219i = true;
    }

    /* JADX INFO: renamed from: l */
    void m24202l() {
        m24189b();
        getAdSessionStatePublisher().m24324h();
        this.f23220j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f23217g || m24193c() == view) {
            return;
        }
        m24190b(view);
        getAdSessionStatePublisher().m24301a();
        m24188a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23217g) {
            return;
        }
        this.f23213c.m24258b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23217g) {
            return;
        }
        this.f23213c.m24259c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23221k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f23216f || this.f23215e == null) {
            return;
        }
        this.f23216f = true;
        C11134c.m24234c().m24239c(this);
        this.f23215e.m24302a(C11140i.m24282c().m24284b());
        this.f23215e.m24313a(C11132a.m24225a().m24229b());
        this.f23215e.mo24307a(this, this.f23211a);
    }
}
