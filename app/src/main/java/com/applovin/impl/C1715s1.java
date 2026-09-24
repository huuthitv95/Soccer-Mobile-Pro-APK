package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.s1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1715s1 extends AbstractC1558g2 {

    /* JADX INFO: renamed from: i */
    private JSONObject f2787i;

    public C1715s1(C1748l c1748l) {
        super(c1748l, C1548f2.b.ERROR);
    }

    /* JADX INFO: renamed from: a */
    private List m4328a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f2787i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f2787i, BuildConfig.FLAVOR, null) : integerList;
    }

    /* JADX INFO: renamed from: a */
    public void m4330a(String str, String str2, int i, String str3) {
        List listM4328a = m4328a(str2);
        boolean z = listM4328a != null;
        if (z && listM4328a.contains(Integer.valueOf(i))) {
            return;
        }
        if (z || i >= 400) {
            HashMap map = new HashMap(4);
            map.put("source", str);
            map.put("url", StringUtils.emptyIfNull(str2));
            map.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i));
            map.put("error_message", AbstractC1568h2.m2784a(str3));
            m2682d(C1548f2.f1525d1, map);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4331a(String str, String str2, AbstractC1736b abstractC1736b) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("error_message", str2);
        if (abstractC1736b != null) {
            map.putAll(AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b));
            map.putAll(AbstractC1568h2.m2788a(abstractC1736b));
            boolean zMo4248y0 = abstractC1736b.mo4248y0();
            map.put("is_video_stream", String.valueOf(zMo4248y0));
            if (zMo4248y0 && (abstractC1736b instanceof C1735a)) {
                CollectionUtils.putStringIfValid("video_url", ((C1735a) abstractC1736b).m4443c1(), map);
            } else {
                CollectionUtils.putStringIfValid("video_url", abstractC1736b.mo4222I(), map);
            }
        }
        m2682d(C1548f2.f1517a1, map);
    }

    /* JADX INFO: renamed from: a */
    public void m4332a(String str, String str2, Throwable th, Map map) {
        m4334a(str + CertificateUtil.DELIMITER + str2, th, map);
    }

    /* JADX INFO: renamed from: a */
    public void m4333a(String str, Throwable th) {
        m4334a(str, th, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public void m4334a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid("source", str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), map2);
            arrayList.add(map2);
        }
        m2680a(C1548f2.f1505U0, arrayList, 0L);
    }

    /* JADX INFO: renamed from: b */
    public void m4335b() {
        this.f2787i = JsonUtils.deserialize((String) this.f1653a.m4801a(C1831z4.f3750K));
    }

    /* JADX INFO: renamed from: b */
    public void m4336b(final String str, final String str2, final Throwable th) {
        this.f1653a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f1653a, "reportCaughtException", new Runnable() { // from class: com.applovin.impl.s1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4329a(str, str2, th);
            }
        }), C1552f6.b.OTHER);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m4329a(String str, String str2, Throwable th) {
        m4332a(str, str2, th, new HashMap());
    }
}
