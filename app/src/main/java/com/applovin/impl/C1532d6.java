package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.network.C1765d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.d6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1532d6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final String f1371g;

    /* JADX INFO: renamed from: h */
    private final List f1372h;

    /* JADX INFO: renamed from: i */
    private final C1619m3 f1373i;

    /* JADX INFO: renamed from: j */
    private final Map f1374j;

    /* JADX INFO: renamed from: k */
    private final Map f1375k;

    /* JADX INFO: renamed from: l */
    private final Map f1376l;

    /* JADX INFO: renamed from: m */
    private final MaxError f1377m;

    public C1532d6(String str, List list, Map map, Map map2, MaxError maxError, C1619m3 c1619m3, C1748l c1748l, boolean z) {
        super("TaskFireMediationPostbacks", c1748l);
        this.f1371g = str + "_urls";
        this.f1372h = list;
        this.f1374j = AbstractC1701q7.m4043a(map, c1748l);
        this.f1375k = map2 == null ? new HashMap() : map2;
        this.f1377m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f1373i = c1619m3;
        HashMap map3 = new HashMap(7);
        map3.put("AppLovin-Event-Type", str);
        if (z && c1619m3 != null) {
            map3.put("AppLovin-Ad-Network-Name", c1619m3.m3200c());
        }
        if (c1619m3 instanceof AbstractC1482a3) {
            AbstractC1482a3 abstractC1482a3 = (AbstractC1482a3) c1619m3;
            map3.put("AppLovin-Ad-Unit-Id", abstractC1482a3.getAdUnitId());
            map3.put("AppLovin-Ad-Format", abstractC1482a3.getFormat().getLabel());
            if (z) {
                map3.put("AppLovin-Third-Party-Ad-Placement-Id", abstractC1482a3.m1834U());
            }
        }
        if (maxError != null) {
            map3.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map3.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f1376l = map3;
    }

    /* JADX INFO: renamed from: a */
    private String m2413a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }

    /* JADX INFO: renamed from: a */
    private void m2414a(String str, Map map) {
        m3084b().m4833h0().m5073e(C1765d.m5076b().m5116d(str).m5113c("POST").m5107a(this.f1376l).m5108a(false).m5114c(map).m5115c(((Boolean) this.f1969a.m4801a(AbstractC1776t3.f3316C8)).booleanValue()).m5109a());
    }

    /* JADX INFO: renamed from: b */
    private String m2415b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    private Map m2416e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f1969a.m4801a(AbstractC1776t3.f3377x7)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    /* JADX INFO: renamed from: f */
    private List m2417f() {
        List list = this.f1372h;
        if (list != null) {
            return list;
        }
        C1619m3 c1619m3 = this.f1373i;
        if (c1619m3 != null) {
            return c1619m3.m3198b(this.f1371g);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private C1565h m2418g() {
        C1619m3 c1619m3 = this.f1373i;
        if (c1619m3 instanceof AbstractC1482a3) {
            return ((AbstractC1482a3) c1619m3).m1830Q().m2197f();
        }
        if (c1619m3 instanceof C1551f5) {
            return ((C1551f5) c1619m3).m2585u().m2197f();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1565h c1565hM2418g;
        List listM2417f = m2417f();
        if (CollectionUtils.isEmpty(listM2417f)) {
            return;
        }
        Map mapM2416e = m2416e();
        Iterator it = listM2417f.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(m2413a(m2415b((String) it.next(), this.f1374j), this.f1377m));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            HashMap map = new HashMap(this.f1375k);
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapM2416e.containsKey(queryParameter)) {
                    C1619m3 c1619m3 = this.f1373i;
                    if (c1619m3 != null) {
                        map.put(str, c1619m3.m3186a((String) mapM2416e.get(queryParameter)));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            map.putAll(this.f1969a.m4759B().m4944e());
            if (((Boolean) this.f1969a.m4801a(AbstractC1776t3.f3372u8)).booleanValue() && (c1565hM2418g = m2418g()) != null) {
                map.put("arn_info", c1565hM2418g.m2769e());
            }
            m2414a(builderClearQuery.build().toString(), map);
        }
    }
}
