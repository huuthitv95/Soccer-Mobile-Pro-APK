package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1750n;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.applovin.impl.n5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1662n5 extends AbstractRunnableC1601k5 implements C1812x3.a {

    /* JADX INFO: renamed from: g */
    protected final AbstractC1736b f2410g;

    /* JADX INFO: renamed from: h */
    private AppLovinAdLoadListener f2411h;

    /* JADX INFO: renamed from: i */
    protected final String f2412i;

    /* JADX INFO: renamed from: j */
    private final C1750n f2413j;

    /* JADX INFO: renamed from: k */
    private final Collection f2414k;

    /* JADX INFO: renamed from: l */
    private boolean f2415l;

    /* JADX INFO: renamed from: m */
    protected ExecutorService f2416m;

    /* JADX INFO: renamed from: n */
    protected ExecutorService f2417n;

    /* JADX INFO: renamed from: o */
    protected List f2418o;

    /* JADX INFO: renamed from: p */
    private C1526d0 f2419p;

    /* JADX INFO: renamed from: com.applovin.impl.n5$a */
    class a implements C1536e0.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1536e0.a f2420a;

        a(C1536e0.a aVar) {
            this.f2420a = aVar;
        }

        @Override // com.applovin.impl.C1536e0.a
        /* JADX INFO: renamed from: a */
        public void mo2339a(Uri uri) {
            if (uri == null) {
                C1768p c1768p = AbstractC1662n5.this.f1971c;
                if (C1768p.m5160a()) {
                    AbstractC1662n5 abstractC1662n5 = AbstractC1662n5.this;
                    abstractC1662n5.f1971c.m5174b(abstractC1662n5.f1970b, "Failed to cache video");
                }
                AbstractC1662n5.this.mo3661a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", AbstractC1662n5.this.f2410g.getAdIdNumber());
                AbstractC1662n5.this.f1969a.m4856u().m4702a(bundle, "video_caching_failed");
                return;
            }
            C1768p c1768p2 = AbstractC1662n5.this.f1971c;
            if (C1768p.m5160a()) {
                AbstractC1662n5 abstractC1662n6 = AbstractC1662n5.this;
                abstractC1662n6.f1971c.m5171a(abstractC1662n6.f1970b, "Finish caching video for ad #" + AbstractC1662n5.this.f2410g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f2420a.mo2339a(uri);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.n5$b */
    class b implements C1526d0.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f2422a;

        b(c cVar) {
            this.f2422a = cVar;
        }

        @Override // com.applovin.impl.C1526d0.c
        /* JADX INFO: renamed from: a */
        public void mo2340a(String str, boolean z) {
            if (z) {
                AbstractC1662n5.this.mo3661a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            c cVar = this.f2422a;
            if (cVar != null) {
                cVar.mo3671a(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.n5$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo3671a(String str);
    }

    AbstractC1662n5(String str, AbstractC1736b abstractC1736b, C1748l c1748l, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, c1748l);
        this.f2412i = UUID.randomUUID().toString();
        if (abstractC1736b == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f2410g = abstractC1736b;
        this.f2411h = appLovinAdLoadListener;
        this.f2413j = c1748l.m4771I();
        this.f2414k = m3653g();
        if (((Boolean) c1748l.m4801a(C1831z4.f3743J0)).booleanValue()) {
            if (c1748l.m4853s0().m2613e()) {
                this.f2416m = c1748l.m4853s0().m2601a();
                this.f2417n = c1748l.m4853s0().m2612d();
                return;
            }
            String mediationServeId = StringUtils.isValidString(abstractC1736b.getMediationServeId()) ? abstractC1736b.getMediationServeId() : UUID.randomUUID().toString();
            this.f2416m = c1748l.m4853s0().m2602a("com.applovin.sdk.caching." + mediationServeId, ((Integer) c1748l.m4801a(C1831z4.f3759L0)).intValue());
            this.f2417n = c1748l.m4853s0().m2602a("com.applovin.sdk.caching.html." + mediationServeId, ((Integer) c1748l.m4801a(C1831z4.f3767M0)).intValue());
        }
    }

    /* JADX INFO: renamed from: a */
    private Uri m3652a(String str, String str2) {
        File fileM4971a = this.f2413j.m4971a(AbstractC1701q7.m4031a(Uri.parse(str2), this.f2410g.getCachePrefix(), this.f1969a), C1748l.m4756p());
        if (fileM4971a == null) {
            return null;
        }
        String str3 = str + str2;
        if (!this.f2413j.m4978a(fileM4971a, str3, Arrays.asList(str), this.f1969a.m4771I().m4970a(str3, this.f2410g), this.f2412i, AbstractC1568h2.m2787a((AppLovinAdImpl) this.f2410g))) {
            return null;
        }
        return Uri.parse(AdPayload.FILE_SCHEME + fileM4971a.getAbsolutePath());
    }

    /* JADX INFO: renamed from: g */
    private Collection m3653g() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f1969a.m4801a(C1831z4.f3703E0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m3654h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f2411h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f2410g);
            this.f2411h = null;
        }
    }

    /* JADX INFO: renamed from: a */
    Uri m3655a(String str, List list, boolean z) {
        try {
            int iM4970a = this.f1969a.m4771I().m4970a(str, this.f2410g);
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) this.f2410g);
            String strM4973a = this.f2413j.m4973a(m3080a(), str, this.f2410g.getCachePrefix(), list, z, iM4970a, this.f2412i, mapM2787a);
            if (!StringUtils.isValidString(strM4973a)) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "Failed to cache image: " + str);
                }
                m3663a(str, "cacheImageResource", mapM2787a);
                return null;
            }
            File fileM4971a = this.f2413j.m4971a(strM4973a, m3080a());
            if (fileM4971a != null) {
                Uri uriFromFile = Uri.fromFile(fileM4971a);
                if (uriFromFile != null) {
                    return uriFromFile;
                }
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "Unable to extract Uri from image file");
                }
                m3663a(strM4973a, "extractUriFromImageFile", mapM2787a);
                return null;
            }
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to retrieve File from cached image filename = " + strM4973a);
            }
            m3663a(strM4973a, "retrieveImageFile", mapM2787a);
            return null;
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Failed to cache image at url = " + str, th);
            }
            Map mapM2787a2 = AbstractC1568h2.m2787a((AppLovinAdImpl) this.f2410g);
            CollectionUtils.putStringIfValid("url", str, mapM2787a2);
            this.f1969a.m4764E().m4332a(this.f1970b, "cacheImageResource", th, mapM2787a2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    protected C1526d0 m3656a(String str, List list, c cVar) {
        C1526d0 c1526d0 = new C1526d0(str, this.f2410g, list, this.f2417n, this.f2412i, this.f1969a, new b(cVar));
        this.f2419p = c1526d0;
        return c1526d0;
    }

    /* JADX INFO: renamed from: a */
    protected C1536e0 m3657a(String str, C1536e0.a aVar) {
        return m3658a(str, this.f2410g.m4505S(), true, aVar);
    }

    /* JADX INFO: renamed from: a */
    protected C1536e0 m3658a(String str, List list, boolean z, C1536e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!C1768p.m5160a()) {
                return null;
            }
            this.f1971c.m5171a(this.f1970b, "No video to cache, skipping...");
            return null;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Caching video " + str + "...");
        }
        return new C1536e0(str, this.f2410g, list, z, this.f2412i, this.f1969a, new a(aVar));
    }

    /* JADX INFO: renamed from: a */
    String m3659a(String str, List list, AbstractC1736b abstractC1736b) {
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3711F0)).booleanValue()) {
                StringBuilder sb = new StringBuilder(str);
                List listM4501Q = abstractC1736b.m4501Q();
                List listM4484H = abstractC1736b.m4484H();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int iIndexOf = 0;
                    int i = 0;
                    while (iIndexOf < sb.length()) {
                        if (!m3670j()) {
                            iIndexOf = sb.indexOf(str2, i);
                            if (iIndexOf == -1) {
                                break;
                            }
                            int length = sb.length();
                            int i2 = iIndexOf;
                            while (!this.f2414k.contains(Character.valueOf(sb.charAt(i2))) && i2 < length) {
                                i2++;
                            }
                            if (i2 > iIndexOf && i2 != length) {
                                String strSubstring = sb.substring(str2.length() + iIndexOf, i2);
                                String str3 = str2 + strSubstring;
                                if (StringUtils.isValidString(strSubstring) && !listM4484H.contains(str3)) {
                                    Uri uriM3652a = m3652a(str2, strSubstring);
                                    if (uriM3652a != null) {
                                        sb.replace(iIndexOf, i2, uriM3652a.toString());
                                        abstractC1736b.m4523a(uriM3652a.toString(), str3);
                                    } else {
                                        if (listM4501Q.contains(str3)) {
                                            mo3661a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                            this.f2415l = true;
                                        }
                                        if (C1768p.m5160a()) {
                                            this.f1971c.m5174b(this.f1970b, "Failed to cache HTML Resource: " + str3);
                                        }
                                        m3663a(str3, "cacheHtmlResource", AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b));
                                    }
                                } else if (C1768p.m5160a()) {
                                    this.f1971c.m5171a(this.f1970b, "Skip caching of optional or non-resource: " + strSubstring);
                                }
                                i = i2;
                            } else if (C1768p.m5160a()) {
                                this.f1971c.m5174b(this.f1970b, "Unable to cache resource; ad HTML is invalid.");
                            }
                        }
                    }
                }
                return sb.toString();
            }
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Resource caching is disabled, skipping cache...");
                return str;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    protected List m3660a(List list) {
        this.f2418o = list;
        return this.f1969a.m4853s0().m2599a(list, this.f2416m);
    }

    /* JADX INFO: renamed from: a */
    void mo3661a(int i) {
        if (this.f2411h != null) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Calling back ad load failed with error code: " + i);
            }
            this.f2411h.failedToReceiveAd(i);
            this.f2411h = null;
        }
        m3668f();
    }

    @Override // com.applovin.impl.C1812x3.a
    /* JADX INFO: renamed from: a */
    public void mo3662a(AbstractC1482a3 abstractC1482a3) {
        if (abstractC1482a3.m1833T().equalsIgnoreCase(this.f2410g.getMediationServeId())) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Updating flag for timeout...");
            }
            m3668f();
        }
        this.f1969a.m4820b0().m5577b(this);
    }

    /* JADX INFO: renamed from: a */
    protected void m3663a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f1969a.m4764E().m2678a(C1548f2.f1503T0, str2, map2);
    }

    /* JADX INFO: renamed from: b */
    Uri m3664b(String str) {
        return m3665b(str, this.f2410g.m4505S(), true);
    }

    /* JADX INFO: renamed from: b */
    Uri m3665b(String str, List list, boolean z) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Caching video " + str + "...");
        }
        int iM4970a = this.f1969a.m4771I().m4970a(str, this.f2410g);
        Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) this.f2410g);
        String strM4973a = this.f2413j.m4973a(m3080a(), str, this.f2410g.getCachePrefix(), list, z, iM4970a, this.f2412i, mapM2787a);
        if (!StringUtils.isValidString(strM4973a)) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Failed to cache video: " + str);
            }
            m3663a(str, "cacheVideo", mapM2787a);
            mo3661a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileM4971a = this.f2413j.m4971a(strM4973a, m3080a());
        if (fileM4971a == null) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to retrieve File from cached video filename = " + strM4973a);
            }
            m3663a(strM4973a, "retrieveVideoFile", mapM2787a);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM4971a);
        if (uriFromFile == null) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to create URI from cached video file = " + fileM4971a);
            }
            m3663a(strM4973a, "extractUriFromVideoFile", mapM2787a);
            return null;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Finish caching video for ad #" + this.f2410g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strM4973a);
        }
        return uriFromFile;
    }

    /* JADX INFO: renamed from: c */
    protected String m3666c(String str, List list, boolean z) {
        try {
            InputStream inputStreamM4972a = this.f2413j.m4972a(str, list, z, AbstractC1568h2.m2787a((AppLovinAdImpl) this.f2410g));
            if (inputStreamM4972a == null) {
                if (inputStreamM4972a != null) {
                    inputStreamM4972a.close();
                }
                return null;
            }
            try {
                String strM4975a = this.f2413j.m4975a(inputStreamM4972a);
                inputStreamM4972a.close();
                return strM4975a;
            } catch (Throwable th) {
                try {
                    inputStreamM4972a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Unknown failure to read input stream.", th3);
            }
            this.f1971c.m5173a(this.f1970b, th3);
            this.f1969a.m4764E().m4329a(this.f1970b, "readInputStreamAsString", th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    void mo3667e() {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Rendered new ad:" + this.f2410g);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3654h();
            }
        });
    }

    /* JADX INFO: renamed from: f */
    protected void m3668f() {
        this.f2415l = true;
        List list = this.f2418o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f2418o.iterator();
            while (it.hasNext()) {
                ((AbstractCallableC1516c0) it.next()).m2148a(true);
            }
        }
        if (this.f1969a.m4853s0().m2613e()) {
            C1526d0 c1526d0 = this.f2419p;
            if (c1526d0 != null) {
                c1526d0.m2338c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f2416m;
        if (executorService != null) {
            executorService.shutdown();
            this.f2416m = null;
        }
        ExecutorService executorService2 = this.f2417n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f2417n = null;
        }
    }

    /* JADX INFO: renamed from: i */
    protected void m3669i() {
        this.f1969a.m4820b0().m5577b(this);
        if (!this.f1969a.m4853s0().m2613e()) {
            ExecutorService executorService = this.f2416m;
            if (executorService != null) {
                executorService.shutdown();
                this.f2416m = null;
            }
            ExecutorService executorService2 = this.f2417n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f2417n = null;
            }
        }
        MaxAdFormat maxAdFormatM5263d = this.f2410g.getAdZone().m5263d();
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3871Z0)).booleanValue() && maxAdFormatM5263d != null && maxAdFormatM5263d.isFullscreenAd()) {
            this.f1969a.m4834i().m4636b(this.f2410g);
        }
        this.f1969a.m4829f0().m2489a(this.f2412i);
    }

    /* JADX INFO: renamed from: j */
    protected boolean m3670j() {
        return this.f2415l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2410g.m4512V0()) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Subscribing to timeout events...");
            }
            this.f1969a.m4820b0().m5576a(this);
        }
    }
}
