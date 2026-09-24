package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.k6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1602k6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final AppLovinAdLoadListener f1975g;

    /* JADX INFO: renamed from: h */
    private final a f1976h;

    /* JADX INFO: renamed from: com.applovin.impl.k6$a */
    private static final class a extends AbstractC1798v7 {
        a(JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
            super(jSONObject, jSONObject2, c1748l);
        }

        /* JADX INFO: renamed from: a */
        void m3095a(C1702q8 c1702q8) {
            if (c1702q8 == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f3479b.add(c1702q8);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.k6$b */
    private static final class b extends AbstractC1602k6 {

        /* JADX INFO: renamed from: i */
        private final String f1977i;

        b(String str, AbstractC1798v7 abstractC1798v7, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
            super(abstractC1798v7, appLovinAdLoadListener, c1748l);
            this.f1977i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1702q8 c1702q8M3093b = m3093b(this.f1977i);
            if (c1702q8M3093b != null) {
                m3091a(c1702q8M3093b);
                return;
            }
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to process XML: " + this.f1977i);
            }
            m3094c(this.f1977i);
            m3092a(EnumC1807w7.XML_PARSING);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.k6$c */
    private static final class c extends AbstractC1602k6 {

        /* JADX INFO: renamed from: i */
        private final JSONObject f1978i;

        c(AbstractC1798v7 abstractC1798v7, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
            super(abstractC1798v7, appLovinAdLoadListener, c1748l);
            this.f1978i = abstractC1798v7.m5483b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f1978i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "No VAST response received.");
                }
                m3092a(EnumC1807w7.NO_WRAPPER_RESPONSE);
                return;
            }
            if (string.length() >= ((Integer) this.f1969a.m4801a(C1831z4.f3819S4)).intValue()) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "VAST response is over max length");
                }
                m3092a(EnumC1807w7.XML_PARSING);
                return;
            }
            C1702q8 c1702q8M3093b = m3093b(string);
            if (c1702q8M3093b != null) {
                m3091a(c1702q8M3093b);
                return;
            }
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to process XML: " + string);
            }
            m3094c(string);
            m3092a(EnumC1807w7.XML_PARSING);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.k6$d */
    private static final class d extends AbstractC1602k6 {

        /* JADX INFO: renamed from: i */
        private final C1702q8 f1979i;

        d(C1702q8 c1702q8, AbstractC1798v7 abstractC1798v7, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
            super(abstractC1798v7, appLovinAdLoadListener, c1748l);
            if (c1702q8 == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (abstractC1798v7 == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f1979i = c1702q8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Processing VAST Wrapper response...");
            }
            m3091a(this.f1979i);
        }
    }

    AbstractC1602k6(AbstractC1798v7 abstractC1798v7, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        super("TaskProcessVastResponse", c1748l);
        if (abstractC1798v7 == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f1975g = appLovinAdLoadListener;
        this.f1976h = (a) abstractC1798v7;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1602k6 m3088a(C1702q8 c1702q8, AbstractC1798v7 abstractC1798v7, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        return new d(c1702q8, abstractC1798v7, appLovinAdLoadListener, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1602k6 m3089a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        return new b(str, new a(jSONObject, jSONObject2, c1748l), appLovinAdLoadListener, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1602k6 m3090a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        return new c(new a(jSONObject, jSONObject2, c1748l), appLovinAdLoadListener, c1748l);
    }

    /* JADX INFO: renamed from: a */
    void m3091a(C1702q8 c1702q8) {
        int iM5485d = this.f1976h.m5485d();
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Finished parsing XML at depth " + iM5485d);
        }
        this.f1976h.m3095a(c1702q8);
        if (!AbstractC1534d8.m2445b(c1702q8)) {
            if (!AbstractC1534d8.m2442a(c1702q8)) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "VAST response is an error");
                }
                m3092a(EnumC1807w7.NO_WRAPPER_RESPONSE);
                return;
            } else {
                if (C1768p.m5160a()) {
                    this.f1971c.m5171a(this.f1970b, "VAST response is inline. Rendering ad...");
                }
                this.f1969a.m4853s0().m2603a(new C1663n6(this.f1976h, this.f1975g, this.f1969a));
                return;
            }
        }
        int iIntValue = ((Integer) this.f1969a.m4801a(C1831z4.f3827T4)).intValue();
        if (iM5485d < iIntValue) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "VAST response is wrapper. Resolving...");
            }
            this.f1969a.m4853s0().m2603a(new C1720s6(this.f1976h, this.f1975g, this.f1969a));
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Reached beyond max wrapper depth of " + iIntValue);
        }
        m3092a(EnumC1807w7.WRAPPER_LIMIT_REACHED);
    }

    /* JADX INFO: renamed from: a */
    void m3092a(EnumC1807w7 enumC1807w7) {
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Failed to process VAST response due to VAST error code " + enumC1807w7);
        }
        AbstractC1534d8.m2437a(this.f1976h, this.f1975g, enumC1807w7, -6, this.f1969a);
    }

    /* JADX INFO: renamed from: b */
    protected C1702q8 m3093b(String str) {
        try {
            return C1712r8.m4289a(str, this.f1969a);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Failed to process VAST response", th);
            }
            m3092a(EnumC1807w7.XML_PARSING);
            this.f1969a.m4764E().m4333a(this.f1970b, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    protected void m3094c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f1969a.m4801a(C1831z4.f3981l5)), 1).iterator();
        while (it.hasNext()) {
            C1702q8 c1702q8M3093b = m3093b("<VAST>" + it.next() + "</VAST>");
            if (c1702q8M3093b != null) {
                this.f1976h.m3095a(c1702q8M3093b);
            }
        }
    }
}
