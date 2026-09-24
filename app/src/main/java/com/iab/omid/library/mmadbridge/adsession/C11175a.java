package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import com.iab.omid.library.mmadbridge.internal.C11183a;
import com.iab.omid.library.mmadbridge.internal.C11185c;
import com.iab.omid.library.mmadbridge.internal.C11187e;
import com.iab.omid.library.mmadbridge.internal.C11188f;
import com.iab.omid.library.mmadbridge.internal.C11191i;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.C11198a;
import com.iab.omid.library.mmadbridge.publisher.C11199b;
import com.iab.omid.library.mmadbridge.utils.C11206g;
import com.iab.omid.library.mmadbridge.weakreference.C11221a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.adsession.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11175a extends AdSession {

    /* JADX INFO: renamed from: a */
    private final AdSessionContext f23346a;

    /* JADX INFO: renamed from: b */
    private final AdSessionConfiguration f23347b;

    /* JADX INFO: renamed from: c */
    private final C11188f f23348c;

    /* JADX INFO: renamed from: d */
    private C11221a f23349d;

    /* JADX INFO: renamed from: e */
    private AdSessionStatePublisher f23350e;

    /* JADX INFO: renamed from: f */
    private boolean f23351f;

    /* JADX INFO: renamed from: g */
    private boolean f23352g;

    /* JADX INFO: renamed from: h */
    private final String f23353h;

    /* JADX INFO: renamed from: i */
    private boolean f23354i;

    /* JADX INFO: renamed from: j */
    private boolean f23355j;

    /* JADX INFO: renamed from: k */
    private PossibleObstructionListener f23356k;

    C11175a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    C11175a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f23348c = new C11188f();
        this.f23351f = false;
        this.f23352g = false;
        this.f23347b = adSessionConfiguration;
        this.f23346a = adSessionContext;
        this.f23353h = str;
        m24443b(null);
        this.f23350e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C11198a(str, adSessionContext.getWebView()) : new C11199b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23350e.mo24578i();
        C11185c.m24487c().m24489a(this);
        this.f23350e.m24558a(adSessionConfiguration);
    }

    /* JADX INFO: renamed from: a */
    private void m24440a() {
        if (this.f23354i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24441a(View view) {
        Collection<C11175a> collectionM24490b = C11185c.m24487c().m24490b();
        if (collectionM24490b == null || collectionM24490b.isEmpty()) {
            return;
        }
        for (C11175a c11175a : collectionM24490b) {
            if (c11175a != this && c11175a.m24446c() == view) {
                c11175a.f23349d.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24442b() {
        if (this.f23355j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24443b(View view) {
        this.f23349d = new C11221a(view);
    }

    /* JADX INFO: renamed from: a */
    public void m24444a(List<C11221a> list) {
        if (m24448e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C11221a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23356k.onPossibleObstructionsDetected(this.f23353h, arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    void m24445a(JSONObject jSONObject) {
        m24442b();
        getAdSessionStatePublisher().m24567a(jSONObject);
        this.f23355j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23352g) {
            return;
        }
        this.f23348c.m24510a(view, friendlyObstructionPurpose, str);
    }

    /* JADX INFO: renamed from: c */
    public View m24446c() {
        return this.f23349d.get();
    }

    /* JADX INFO: renamed from: d */
    public List<C11187e> m24447d() {
        return this.f23348c.m24509a();
    }

    /* JADX INFO: renamed from: e */
    public boolean m24448e() {
        return this.f23356k != null;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23352g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C11206g.m24620a(errorType, "Error type is null");
        C11206g.m24622a(str, "Message is null");
        getAdSessionStatePublisher().m24559a(errorType, str);
    }

    /* JADX INFO: renamed from: f */
    public boolean m24449f() {
        return this.f23351f && !this.f23352g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void finish() {
        if (this.f23352g) {
            return;
        }
        this.f23349d.clear();
        removeAllFriendlyObstructions();
        this.f23352g = true;
        getAdSessionStatePublisher().m24575f();
        C11185c.m24487c().m24491b(this);
        getAdSessionStatePublisher().mo24569b();
        this.f23350e = null;
        this.f23356k = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m24450g() {
        return this.f23352g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public String getAdSessionId() {
        return this.f23353h;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f23350e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m24451h() {
        return this.f23347b.isNativeImpressionOwner();
    }

    /* JADX INFO: renamed from: i */
    public boolean m24452i() {
        return this.f23347b.isNativeMediaEventsOwner();
    }

    /* JADX INFO: renamed from: j */
    public boolean m24453j() {
        return this.f23351f;
    }

    /* JADX INFO: renamed from: k */
    void m24454k() {
        m24440a();
        getAdSessionStatePublisher().m24576g();
        this.f23354i = true;
    }

    /* JADX INFO: renamed from: l */
    void m24455l() {
        m24442b();
        getAdSessionStatePublisher().m24577h();
        this.f23355j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f23352g) {
            return;
        }
        C11206g.m24620a(view, "AdView is null");
        if (m24446c() == view) {
            return;
        }
        m24443b(view);
        getAdSessionStatePublisher().m24554a();
        m24441a(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23352g) {
            return;
        }
        this.f23348c.m24511b();
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23352g) {
            return;
        }
        this.f23348c.m24512c(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23356k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void start() {
        if (this.f23351f) {
            return;
        }
        this.f23351f = true;
        C11185c.m24487c().m24492c(this);
        this.f23350e.m24555a(C11191i.m24535c().m24537b());
        this.f23350e.m24566a(C11183a.m24478a().m24482b());
        this.f23350e.mo24560a(this, this.f23346a);
    }
}
