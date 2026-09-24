package com.mbridge.msdk.reward.candidate;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.cache.C12999a;
import com.mbridge.msdk.foundation.cache.C13000b;
import com.mbridge.msdk.foundation.cache.C13001c;
import com.mbridge.msdk.foundation.cache.C13002d;
import com.mbridge.msdk.foundation.controller.C13007b;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.reward.adapter.C13609c;
import com.mbridge.msdk.videocommon.setting.C14222b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.candidate.a */
/* JADX INFO: compiled from: RewardCandidateController.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13612a {

    /* JADX INFO: renamed from: a */
    private C13002d f37715a;

    public C13612a(String str, boolean z) {
        try {
            this.f37715a = C13007b.m36585a().m36587b(str, C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), str, z).m42684B());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private C13001c m39151a(double d, String str, C13609c c13609c, C13154c c13154c, String str2, int i) {
        C13001c c13001cM36474a = this.f37715a.m36474a();
        try {
            if (c13001cM36474a.m36521g() > 0) {
                return c13001cM36474a;
            }
            JSONObject jSONObjectM36484c = this.f37715a.m36484c(str);
            try {
                if (jSONObjectM36484c == null) {
                    c13001cM36474a.m36518d("setting config not mapping");
                    c13001cM36474a.m36510a(C13001c.f35465k);
                    return c13001cM36474a;
                }
                int iOptInt = jSONObjectM36484c.optInt("max_usage_limit", 10);
                int iOptInt2 = jSONObjectM36484c.optInt("max_cache_num", 20);
                if (iOptInt2 <= 0) {
                    c13001cM36474a.m36518d("max cache num error");
                    c13001cM36474a.m36510a(C13001c.f35465k);
                    return c13001cM36474a;
                }
                long j = 8640000;
                long jOptLong = jSONObjectM36484c.optLong("show_interval_time", 8640000L);
                if (jOptLong != 0) {
                    j = jOptLong;
                }
                List<C13000b> listM36476a = this.f37715a.m36476a(iOptInt, System.currentTimeMillis() - (j * 1000));
                if (listM36476a != null && listM36476a.size() > 0) {
                    return m39153a(listM36476a, jSONObjectM36484c, iOptInt2, d, c13609c, c13154c, str2, true, i);
                }
                c13001cM36474a.m36518d("no cache");
                c13001cM36474a.m36510a(C13001c.f35465k);
                m39157a(c13154c, str2, c13001cM36474a, (List<C12999a.b>) null, jSONObjectM36484c, 2);
                return c13001cM36474a;
            } catch (Exception unused) {
                c13001cM36474a.m36518d("getHighestCampaigns exception");
                c13001cM36474a.m36510a(C13001c.f35465k);
                return c13001cM36474a;
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    private C13001c m39152a(String str, C13154c c13154c, String str2, C13082b c13082b, int i, C13609c c13609c) {
        String strM37032l;
        int i2;
        if (c13082b != null) {
            int iM37028h = c13082b.m37028h();
            strM37032l = c13082b.m37032l();
            i2 = iM37028h;
        } else {
            strM37032l = null;
            i2 = 0;
        }
        String str3 = strM37032l;
        C13002d c13002d = this.f37715a;
        if (c13002d == null) {
            C13001c c13001c = new C13001c();
            c13001c.m36518d("can not get manager");
            c13001c.m36510a(C13001c.f35465k);
            return c13001c;
        }
        C13001c c13001cM36475a = c13002d.m36475a(str);
        if (c13001cM36475a.m36521g() > C13001c.f35464j) {
            return c13001cM36475a;
        }
        String[] strArrSplit = C13207k0.m37712a(str.split("_")[3]).split("\\|");
        double d = Double.parseDouble(strArrSplit[0]);
        C13001c c13001cM39151a = m39151a(d, strArrSplit.length > 1 ? strArrSplit[1] : "", c13609c, c13154c, str, i);
        this.f37715a.m36481a(c13001cM39151a.m36515c(), c13154c, str2, i2, str3, i, d);
        return c13001cM39151a;
    }

    /* JADX INFO: renamed from: a */
    private C13001c m39153a(List<C13000b> list, JSONObject jSONObject, int i, double d, C13609c c13609c, C13154c c13154c, String str, boolean z, int i2) {
        List<C13000b> list2;
        int i3;
        List<C13000b> listM39155a = list;
        C13001c c13001c = new C13001c();
        if (jSONObject == null) {
            c13001c.m36518d("config is null");
            c13001c.m36510a(C13001c.f35465k);
            return c13001c;
        }
        if (listM39155a == null || listM39155a.size() == 0) {
            c13001c.m36518d("candidate is null");
            c13001c.m36510a(C13001c.f35465k);
            return c13001c;
        }
        for (int i4 = 0; i4 < listM39155a.size(); i4++) {
            C13000b c13000b = listM39155a.get(i4);
            if (c13000b != null) {
                c13001c.m36511a(c13000b.m36505e());
            }
        }
        if (listM39155a.size() > 0 && ((listM39155a = m39154a(listM39155a, c13001c)) == null || listM39155a.size() == 0)) {
            c13001c.m36518d("existed");
            c13001c.m36510a(C13001c.f35465k);
        }
        if (listM39155a.size() > 0 && ((listM39155a = m39155a(listM39155a, c13609c, c13001c)) == null || listM39155a.size() == 0)) {
            c13001c.m36518d("not ready");
            c13001c.m36510a(C13001c.f35465k);
        }
        ArrayList arrayList = null;
        if (listM39155a != null && listM39155a.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            double dOptDouble = jSONObject.optDouble("t_disc", 0.8d);
            double dOptDouble2 = jSONObject.optDouble("u_disc", 0.95d);
            double dOptDouble3 = jSONObject.optDouble("max_ecppv_diff", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            int iOptInt = jSONObject.optInt(SDKConstants.PARAM_A2U_TIME_INTERVAL, 1800);
            int size = listM39155a.size();
            double d2 = 0.0d;
            C13000b c13000b2 = null;
            int i5 = 0;
            while (i5 < size) {
                C13000b c13000b3 = listM39155a.get(i5);
                if (c13000b3 != null) {
                    i3 = i5;
                    double dPow = Math.pow(dOptDouble2, c13000b3.m36506f()) * c13000b3.m36496b() * Math.pow(dOptDouble, (System.currentTimeMillis() - c13000b3.m36508h()) / (((double) iOptInt) * 1000.0d));
                    list2 = listM39155a;
                    arrayList2.add(new C12999a.b(dPow, c13000b3));
                    if (dPow >= d - dOptDouble3 && dPow > d2) {
                        d2 = dPow;
                        c13000b2 = c13000b3;
                    }
                } else {
                    list2 = listM39155a;
                    i3 = i5;
                }
                i5 = i3 + 1;
                listM39155a = list2;
            }
            C13002d c13002d = this.f37715a;
            if (c13002d != null) {
                c13002d.m36480a(arrayList2, i);
            }
            if (c13000b2 != null) {
                c13001c.m36512a(c13000b2.m36491a());
                c13001c.m36510a(C13001c.f35466l);
            } else {
                c13001c.m36518d("no match campaign");
                c13001c.m36510a(C13001c.f35465k);
            }
            arrayList = arrayList2;
        }
        if (z) {
            m39157a(c13154c, str, c13001c, arrayList, jSONObject, 2);
        }
        return c13001c;
    }

    /* JADX INFO: renamed from: a */
    private List<C13000b> m39154a(List<C13000b> list, C13001c c13001c) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM36491a;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C13000b c13000b = list.get(i);
            if (c13000b != null && (copyOnWriteArrayListM36491a = c13000b.m36491a()) != null && copyOnWriteArrayListM36491a.size() != 0) {
                int i2 = 0;
                boolean z = false;
                while (i2 < copyOnWriteArrayListM36491a.size()) {
                    CampaignEx campaignEx = copyOnWriteArrayListM36491a.get(i2);
                    boolean zM37915c = C13229v0.m37915c(C13008c.m36588n().m36542d(), campaignEx.getPackageName());
                    if (zM37915c) {
                        c13001c.m36514b(c13000b.m36505e());
                        C13002d c13002d = this.f37715a;
                        if (c13002d != null) {
                            c13002d.m36479a(c13000b.m36503d(), c13000b.m36505e(), 2, campaignEx.getEcppv());
                        }
                        z = zM37915c;
                        break;
                    }
                    i2++;
                    z = zM37915c;
                }
                if (!z) {
                    arrayList.add(c13000b);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private List<C13000b> m39155a(List<C13000b> list, C13609c c13609c, C13001c c13001c) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM36491a;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C13000b c13000b = list.get(i);
            if (c13000b != null && (copyOnWriteArrayListM36491a = c13000b.m36491a()) != null && copyOnWriteArrayListM36491a.size() != 0) {
                boolean zM39119a = false;
                for (int i2 = 0; i2 < copyOnWriteArrayListM36491a.size(); i2++) {
                    CampaignEx campaignEx = copyOnWriteArrayListM36491a.get(i2);
                    if (c13609c != null && !(zM39119a = c13609c.m39119a(copyOnWriteArrayListM36491a, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())))) {
                        c13001c.m36516c(c13000b.m36505e());
                        C13002d c13002d = this.f37715a;
                        if (c13002d == null) {
                            break;
                        }
                        c13002d.m36479a(c13000b.m36503d(), c13000b.m36505e(), 2, campaignEx.getEcppv());
                        break;
                    }
                }
                if (zM39119a) {
                    arrayList.add(c13000b);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public C13001c m39156a(String str, C13154c c13154c, CampaignEx campaignEx, C13082b c13082b, int i, C13609c c13609c) {
        String requestId;
        C13001c c13001c = new C13001c();
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                try {
                    requestId = campaignEx.getRequestId();
                } catch (Exception unused) {
                    c13001c.m36518d("getRewardCandidateCampaignList result exception");
                    c13001c.m36510a(C13001c.f35465k);
                    return c13001c;
                }
            } catch (Exception unused2) {
                c13001c.m36518d("getCandidateCampaignList result exception");
                c13001c.m36510a(C13001c.f35465k);
                return c13001c;
            }
        }
        return m39152a(str, c13154c, requestId, c13082b, i, c13609c);
    }

    /* JADX INFO: renamed from: a */
    public void m39157a(C13154c c13154c, String str, C13001c c13001c, List<C12999a.b> list, JSONObject jSONObject, int i) {
        String str2;
        try {
            C13157e c13157e = new C13157e();
            if (i == 1) {
                str2 = "cb";
            } else if (i != 2) {
                str2 = i != 3 ? "unknown" : "track";
            } else {
                str2 = "candidate";
            }
            c13157e.m37501a("scene", str2);
            C13002d c13002d = this.f37715a;
            if (c13002d != null) {
                double dM36483b = c13002d.m36483b(str);
                if (dM36483b >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    c13157e.m37501a("bp", C13207k0.m37713b(dM36483b + ""));
                }
                c13157e.m37501a("cb_state", m39160a(str) ? "open" : "close");
                try {
                    C13002d c13002d2 = this.f37715a;
                    JSONObject jSONObjectM36484c = c13002d2.m36484c(c13002d2.m36485d(str));
                    if (jSONObjectM36484c != null) {
                        c13157e.m37501a("config", jSONObjectM36484c.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (c13001c != null) {
                if (c13001c.m36521g() == C13001c.f35466l) {
                    c13157e.m37501a("result", 1);
                } else {
                    c13157e.m37501a("result", 2);
                    c13157e.m37501a("reason", c13001c.m36519e());
                }
                c13157e.m37501a("acr", c13001c.m36509a());
                c13157e.m37501a("her", c13001c.m36517d());
                c13157e.m37501a(CmcdConfiguration.KEY_NEXT_RANGE_REQUEST, c13001c.m36520f());
                c13157e.m37501a("cer", c13001c.m36513b());
            } else {
                c13157e.m37501a("result", 2);
                c13157e.m37501a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C13000b c13000bM36490a = list.get(i2).m36490a();
                    if (c13000bM36490a != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", C13207k0.m37713b(c13000bM36490a.m36496b() + ""));
                        jSONObject2.put("showCount", c13000bM36490a.m36506f());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - c13000bM36490a.m36508h());
                        jSONArray.put(jSONObject2);
                    }
                }
                c13157e.m37501a("data", jSONArray.toString());
            }
            if (c13154c != null) {
                c13154c.m37448j("m_candidate_data");
                c13154c.m37438e("m_candidate_data");
                c13154c.m37423a("m_candidate_data", c13157e);
                if (c13001c != null && c13001c.m36515c() != null) {
                    c13154c.m37429b(c13001c.m36515c());
                }
            }
            C13156d.m37475b().m37491b("m_candidate_data", c13154c, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39158a(String str, String str2, int i, String str3) {
        C13002d c13002d = this.f37715a;
        if (c13002d != null) {
            c13002d.m36479a(str, str2, i, str3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39159a(List<CampaignEx> list, String str, C13609c c13609c, String str2) {
        try {
            if (this.f37715a == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f37715a.m36478a(C12999a.f35445f, 2, list, this.f37715a.m36473a(list, str) > 0, "", "", -1, str2);
            C13002d c13002d = this.f37715a;
            JSONObject jSONObjectM36484c = c13002d.m36484c(c13002d.m36485d(str));
            if (jSONObjectM36484c == null || this.f37715a.m36483b(str) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            m39153a(this.f37715a.m36476a(jSONObjectM36484c.optInt("max_usage_limit", 10), 0L), jSONObjectM36484c, jSONObjectM36484c.optInt("max_cache_num", 20), -1.0d, c13609c, new C13154c(), str, false, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m39160a(String str) {
        JSONObject jSONObjectM36484c;
        try {
            C13002d c13002d = this.f37715a;
            return (c13002d == null || (jSONObjectM36484c = c13002d.m36484c(c13002d.m36485d(str))) == null || jSONObjectM36484c.optInt("c_cb", 0) != 1) ? false : true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
