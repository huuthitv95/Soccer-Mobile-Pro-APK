package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.w8 */
/* JADX INFO: loaded from: classes3.dex */
public class C4133w8 {

    /* JADX INFO: renamed from: a */
    public final C3643af f16707a;

    public C4133w8(C3643af c3643af) {
        this.f16707a = c3643af;
    }

    /* JADX INFO: renamed from: a */
    public List m19768a(C3920mg.b bVar) {
        HashMap mapM16833a = this.f16707a.m16833a();
        List<DataUseConsent> listM19769a = m19769a(mapM16833a);
        ArrayList arrayList = new ArrayList();
        HashSet hashSetM19771b = m19771b(bVar);
        if (hashSetM19771b != null) {
            for (DataUseConsent dataUseConsent : listM19769a) {
                if (m19770a(hashSetM19771b, dataUseConsent)) {
                    arrayList.add(dataUseConsent);
                }
            }
        } else {
            if (mapM16833a.containsKey(CCPA.CCPA_STANDARD)) {
                arrayList.add((DataUseConsent) mapM16833a.get(CCPA.CCPA_STANDARD));
            }
            if (mapM16833a.containsKey(COPPA.COPPA_STANDARD)) {
                arrayList.add((DataUseConsent) mapM16833a.get(COPPA.COPPA_STANDARD));
            }
            if (mapM16833a.containsKey(LGPD.LGPD_STANDARD)) {
                arrayList.add((DataUseConsent) mapM16833a.get(LGPD.LGPD_STANDARD));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m19769a(HashMap map) {
        HashMap map2 = new HashMap(map);
        map2.remove(GDPR.GDPR_STANDARD);
        return new ArrayList(map2.values());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19770a(HashSet hashSet, DataUseConsent dataUseConsent) {
        if (hashSet.contains(dataUseConsent.getPrivacyStandardName())) {
            return true;
        }
        C4048sb.m19410b("DataUseConsent " + dataUseConsent.getPrivacyStandardName() + " is not whitelisted.", null);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final HashSet m19771b(C3920mg.b bVar) {
        if (bVar != null) {
            return bVar.m18680a();
        }
        return null;
    }
}
