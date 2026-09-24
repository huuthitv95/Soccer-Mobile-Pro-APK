package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.C10978a;
import com.iab.omid.library.bytedance2.internal.C10980c;
import com.iab.omid.library.bytedance2.internal.C10982e;
import com.iab.omid.library.bytedance2.internal.C10983f;
import com.iab.omid.library.bytedance2.internal.C10986i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.C10992a;
import com.iab.omid.library.bytedance2.publisher.C10993b;
import com.iab.omid.library.bytedance2.utils.C11000g;
import com.iab.omid.library.bytedance2.weakreference.C11015a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.adsession.a */
/* JADX INFO: loaded from: classes6.dex */
public class C10970a extends AdSession {

    /* JADX INFO: renamed from: a */
    private final AdSessionContext f22806a;

    /* JADX INFO: renamed from: b */
    private final AdSessionConfiguration f22807b;

    /* JADX INFO: renamed from: c */
    private final C10983f f22808c;

    /* JADX INFO: renamed from: d */
    private C11015a f22809d;

    /* JADX INFO: renamed from: e */
    private AdSessionStatePublisher f22810e;

    /* JADX INFO: renamed from: f */
    private boolean f22811f;

    /* JADX INFO: renamed from: g */
    private boolean f22812g;

    /* JADX INFO: renamed from: h */
    private final String f22813h;

    /* JADX INFO: renamed from: i */
    private boolean f22814i;

    /* JADX INFO: renamed from: j */
    private boolean f22815j;

    /* JADX INFO: renamed from: k */
    private PossibleObstructionListener f22816k;

    C10970a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    C10970a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f22808c = new C10983f();
        this.f22811f = false;
        this.f22812g = false;
        this.f22807b = adSessionConfiguration;
        this.f22806a = adSessionContext;
        this.f22813h = str;
        m23433b(null);
        this.f22810e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C10992a(str, adSessionContext.getWebView()) : new C10993b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f22810e.mo23560i();
        C10980c.m23477c().m23479a(this);
        this.f22810e.m23541a(adSessionConfiguration);
    }

    /* JADX INFO: renamed from: a */
    private void m23430a() {
        if (this.f22814i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23431a(View view) {
        Collection<C10970a> collectionM23480b = C10980c.m23477c().m23480b();
        if (collectionM23480b == null || collectionM23480b.isEmpty()) {
            return;
        }
        for (C10970a c10970a : collectionM23480b) {
            if (c10970a != this && c10970a.m23436c() == view) {
                c10970a.f22809d.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23432b() {
        if (this.f22815j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23433b(View view) {
        this.f22809d = new C11015a(view);
    }

    /* JADX INFO: renamed from: a */
    public void m23434a(List<C11015a> list) {
        if (m23438e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C11015a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f22816k.onPossibleObstructionsDetected(this.f22813h, arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    void m23435a(JSONObject jSONObject) {
        m23432b();
        getAdSessionStatePublisher().m23550a(jSONObject);
        this.f22815j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f22812g) {
            return;
        }
        this.f22808c.m23500a(view, friendlyObstructionPurpose, str);
    }

    /* JADX INFO: renamed from: c */
    public View m23436c() {
        return this.f22809d.get();
    }

    /* JADX INFO: renamed from: d */
    public List<C10982e> m23437d() {
        return this.f22808c.m23499a();
    }

    /* JADX INFO: renamed from: e */
    public boolean m23438e() {
        return this.f22816k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f22812g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C11000g.m23601a(errorType, "Error type is null");
        C11000g.m23603a(str, "Message is null");
        getAdSessionStatePublisher().m23542a(errorType, str);
    }

    /* JADX INFO: renamed from: f */
    public boolean m23439f() {
        return this.f22811f && !this.f22812g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f22812g) {
            return;
        }
        this.f22809d.clear();
        removeAllFriendlyObstructions();
        this.f22812g = true;
        getAdSessionStatePublisher().m23557f();
        C10980c.m23477c().m23481b(this);
        getAdSessionStatePublisher().mo23552b();
        this.f22810e = null;
        this.f22816k = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m23440g() {
        return this.f22812g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f22813h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f22810e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m23441h() {
        return this.f22807b.isNativeImpressionOwner();
    }

    /* JADX INFO: renamed from: i */
    public boolean m23442i() {
        return this.f22807b.isNativeMediaEventsOwner();
    }

    /* JADX INFO: renamed from: j */
    public boolean m23443j() {
        return this.f22811f;
    }

    /* JADX INFO: renamed from: k */
    void m23444k() {
        m23430a();
        getAdSessionStatePublisher().m23558g();
        this.f22814i = true;
    }

    /* JADX INFO: renamed from: l */
    void m23445l() {
        m23432b();
        getAdSessionStatePublisher().m23559h();
        this.f22815j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f22812g) {
            return;
        }
        C11000g.m23601a(view, "AdView is null");
        if (m23436c() == view) {
            return;
        }
        m23433b(view);
        getAdSessionStatePublisher().m23537a();
        m23431a(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f22812g) {
            return;
        }
        this.f22808c.m23501b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f22812g) {
            return;
        }
        this.f22808c.m23502c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f22816k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f22811f) {
            return;
        }
        this.f22811f = true;
        C10980c.m23477c().m23482c(this);
        this.f22810e.m23538a(C10986i.m23524c().m23526b());
        this.f22810e.m23549a(C10978a.m23468a().m23472b());
        this.f22810e.mo23543a(this, this.f22806a);
    }
}
