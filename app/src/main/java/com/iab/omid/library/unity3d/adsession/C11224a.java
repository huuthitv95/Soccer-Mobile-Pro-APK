package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import com.iab.omid.library.unity3d.internal.C11232a;
import com.iab.omid.library.unity3d.internal.C11234c;
import com.iab.omid.library.unity3d.internal.C11236e;
import com.iab.omid.library.unity3d.internal.C11239h;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.publisher.C11245a;
import com.iab.omid.library.unity3d.publisher.C11246b;
import com.iab.omid.library.unity3d.utils.C11253g;
import com.iab.omid.library.unity3d.weakreference.C11267a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.adsession.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11224a extends AdSession {

    /* JADX INFO: renamed from: l */
    private static final Pattern f23481l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    private final AdSessionContext f23482a;

    /* JADX INFO: renamed from: b */
    private final AdSessionConfiguration f23483b;

    /* JADX INFO: renamed from: d */
    private C11267a f23485d;

    /* JADX INFO: renamed from: e */
    private AdSessionStatePublisher f23486e;

    /* JADX INFO: renamed from: h */
    private final String f23489h;

    /* JADX INFO: renamed from: i */
    private boolean f23490i;

    /* JADX INFO: renamed from: j */
    private boolean f23491j;

    /* JADX INFO: renamed from: k */
    private PossibleObstructionListener f23492k;

    /* JADX INFO: renamed from: c */
    private final List<C11236e> f23484c = new ArrayList();

    /* JADX INFO: renamed from: f */
    private boolean f23487f = false;

    /* JADX INFO: renamed from: g */
    private boolean f23488g = false;

    C11224a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f23483b = adSessionConfiguration;
        this.f23482a = adSessionContext;
        String string = UUID.randomUUID().toString();
        this.f23489h = string;
        m24699d(null);
        this.f23486e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C11245a(string, adSessionContext.getWebView()) : new C11246b(string, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23486e.mo24819i();
        C11234c.m24743c().m24745a(this);
        this.f23486e.m24800a(adSessionConfiguration);
    }

    /* JADX INFO: renamed from: a */
    private void m24693a() {
        if (this.f23490i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m24694a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24695a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f23481l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C11236e m24696b(View view) {
        for (C11236e c11236e : this.f23484c) {
            if (c11236e.m24760c().get() == view) {
                return c11236e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m24697b() {
        if (this.f23491j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: c */
    private void m24698c(View view) {
        Collection<C11224a> collectionM24746b = C11234c.m24743c().m24746b();
        if (collectionM24746b == null || collectionM24746b.isEmpty()) {
            return;
        }
        for (C11224a c11224a : collectionM24746b) {
            if (c11224a != this && c11224a.m24702c() == view) {
                c11224a.f23485d.clear();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m24699d(View view) {
        this.f23485d = new C11267a(view);
    }

    /* JADX INFO: renamed from: a */
    public void m24700a(List<C11267a> list) {
        if (m24704e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C11267a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23492k.onPossibleObstructionsDetected(this.f23489h, arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    void m24701a(JSONObject jSONObject) {
        m24697b();
        getAdSessionStatePublisher().m24809a(jSONObject);
        this.f23491j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23488g) {
            return;
        }
        m24694a(view);
        m24695a(str);
        if (m24696b(view) == null) {
            this.f23484c.add(new C11236e(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: renamed from: c */
    public View m24702c() {
        return this.f23485d.get();
    }

    /* JADX INFO: renamed from: d */
    public List<C11236e> m24703d() {
        return this.f23484c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m24704e() {
        return this.f23492k != null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23488g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C11253g.m24859a(errorType, "Error type is null");
        C11253g.m24861a(str, "Message is null");
        getAdSessionStatePublisher().m24801a(errorType, str);
    }

    /* JADX INFO: renamed from: f */
    public boolean m24705f() {
        return this.f23487f && !this.f23488g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void finish() {
        if (this.f23488g) {
            return;
        }
        this.f23485d.clear();
        removeAllFriendlyObstructions();
        this.f23488g = true;
        getAdSessionStatePublisher().m24816f();
        C11234c.m24743c().m24747b(this);
        getAdSessionStatePublisher().mo24811b();
        this.f23486e = null;
        this.f23492k = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m24706g() {
        return this.f23488g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public String getAdSessionId() {
        return this.f23489h;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f23486e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m24707h() {
        return this.f23483b.isNativeImpressionOwner();
    }

    /* JADX INFO: renamed from: i */
    public boolean m24708i() {
        return this.f23483b.isNativeMediaEventsOwner();
    }

    /* JADX INFO: renamed from: j */
    public boolean m24709j() {
        return this.f23487f;
    }

    /* JADX INFO: renamed from: k */
    void m24710k() {
        m24693a();
        getAdSessionStatePublisher().m24817g();
        this.f23490i = true;
    }

    /* JADX INFO: renamed from: l */
    void m24711l() {
        m24697b();
        getAdSessionStatePublisher().m24818h();
        this.f23491j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f23488g) {
            return;
        }
        C11253g.m24859a(view, "AdView is null");
        if (m24702c() == view) {
            return;
        }
        m24699d(view);
        getAdSessionStatePublisher().m24796a();
        m24698c(view);
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23488g) {
            return;
        }
        this.f23484c.clear();
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23488g) {
            return;
        }
        m24694a(view);
        C11236e c11236eM24696b = m24696b(view);
        if (c11236eM24696b != null) {
            this.f23484c.remove(c11236eM24696b);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23492k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void start() {
        if (this.f23487f) {
            return;
        }
        this.f23487f = true;
        C11234c.m24743c().m24748c(this);
        this.f23486e.m24797a(C11239h.m24783c().m24785b());
        this.f23486e.m24808a(C11232a.m24734a().m24738b());
        this.f23486e.mo24802a(this, this.f23482a);
    }
}
