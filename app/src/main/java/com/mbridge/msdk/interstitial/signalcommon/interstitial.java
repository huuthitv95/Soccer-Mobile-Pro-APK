package com.mbridge.msdk.interstitial.signalcommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.interstitial.cache.C13249a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.AbstractC13393g;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class interstitial extends AbsFeedBackForH5 {

    /* JADX INFO: renamed from: h */
    private static final String f36522h = "com.mbridge.msdk.interstitial.signalcommon.interstitial";

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f36523i = 0;

    /* JADX INFO: renamed from: g */
    private Object f36524g;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.signalcommon.interstitial$a */
    class RunnableC13254a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f36525a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36526b;

        RunnableC13254a(List list, String str) {
            this.f36525a = list;
            this.f36526b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13249a c13249aM38034a = C13249a.m38034a();
            if (c13249aM38034a != null) {
                c13249aM38034a.m38039a(this.f36525a, this.f36526b);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.signalcommon.interstitial$b */
    class RunnableC13255b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f36528a;

        RunnableC13255b(List list) {
            this.f36528a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f36528a.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) this.f36528a.get(i);
                if (campaignEx != null) {
                    C13020j.m36706a(C13017g.m36693a(((AbstractC13393g) interstitial.this).f37179a)).m36709b(campaignEx.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38090b() {
        try {
            Context context = this.f37179a;
            if (context != null && m38082a(context) == 1) {
                try {
                    MBInterstitialActivity mBInterstitialActivity = (MBInterstitialActivity) this.f37179a;
                    if (mBInterstitialActivity != null) {
                        mBInterstitialActivity.hideLoading();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m38092c() {
        try {
            C13392f.m38726a().m38731b(this.f36524g, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m38093d() {
        MBInterstitialActivity mBInterstitialActivity;
        try {
            Context context = this.f37179a;
            if (context == null || m38082a(context) != 1 || (mBInterstitialActivity = (MBInterstitialActivity) this.f37179a) == null) {
                return;
            }
            mBInterstitialActivity.showWebView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> getExcludeIdList(String str) {
        Exception e;
        ArrayList arrayList;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strOptString = new JSONObject(str).optString(C13126e.f36057h);
            if (!TextUtils.isEmpty(strOptString)) {
                JSONArray jSONArray = new JSONArray(strOptString);
                if (jSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                                arrayList.add(jSONArray.optString(i));
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }
                    return arrayList;
                }
            }
            return null;
        } catch (Exception e3) {
            e = e3;
            arrayList = null;
        }
        e.printStackTrace();
        return arrayList;
    }

    public void getInfo(Object obj, String str) {
        try {
            this.f36524g = obj;
            Context context = this.f37179a;
            if (context == null) {
                m38092c();
                return;
            }
            int iM38082a = m38082a(context);
            if (TextUtils.isEmpty(m38084a())) {
                m38092c();
            } else if (iM38082a == 1) {
                m38087a(obj, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            m38092c();
        }
    }

    public void install(Object obj, String str) {
        try {
            Context context = this.f37179a;
            if (context != null && (context instanceof MBInterstitialActivity)) {
                ((MBInterstitialActivity) context).clickTracking();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openURL(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                C12684c.m34659c(this.f37179a, strOptString);
            } else if (iOptInt == 2) {
                C12684c.m34661e(this.f37179a, strOptString);
            }
        } catch (JSONException e) {
            C13219q0.m37816b(f36522h, e.getMessage());
        } catch (Throwable th) {
            C13219q0.m37816b(f36522h, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38087a(Object obj, String str) {
        try {
            m38090b();
            m38093d();
            Context context = this.f37179a;
            if (context == null) {
                m38092c();
                return;
            }
            if (m38082a(context) != 1) {
                m38092c();
                return;
            }
            Context context2 = this.f37179a;
            if (context2 instanceof MBInterstitialActivity) {
                ((MBInterstitialActivity) context2).mIsMBPage = true;
            }
            String strM38084a = m38084a();
            if (TextUtils.isEmpty(strM38084a)) {
                m38092c();
                return;
            }
            List<CampaignEx> listM38086a = m38086a(strM38084a);
            if (listM38086a == null) {
                m38092c();
                return;
            }
            String strM38085a = m38085a(listM38086a);
            if (TextUtils.isEmpty(strM38085a)) {
                m38092c();
                return;
            }
            C13392f.m38726a().m38731b(obj, strM38085a);
            m38088a(strM38084a, listM38086a);
            m38091b(strM38084a, listM38086a);
            m38089a(listM38086a, strM38084a);
        } catch (Exception e) {
            e.printStackTrace();
            m38092c();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38091b(String str, List<CampaignEx> list) {
        try {
            if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
                new Thread(new RunnableC13255b(list)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private List<CampaignEx> m38086a(String str) {
        try {
            if (TextUtils.isEmpty(str) || C13249a.m38034a() == null) {
                return null;
            }
            return C13249a.m38034a().m38035a(str, 1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38089a(List<CampaignEx> list, String str) {
        try {
            new Thread(new RunnableC13254a(list, str)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private String m38085a(List<CampaignEx> list) {
        if (list == null) {
            return "";
        }
        try {
            if (list.size() <= 0) {
                return "";
            }
            JSONArray camplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", camplistToJson);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private int m38082a(Context context) {
        return (context == null || !(context instanceof MBInterstitialActivity)) ? -1 : 1;
    }

    /* JADX INFO: renamed from: a */
    private String m38084a() {
        MBInterstitialActivity mBInterstitialActivity;
        String str = null;
        try {
            Context context = this.f37179a;
            if (context == null) {
                return null;
            }
            if (m38082a(context) == 1) {
                try {
                    Context context2 = this.f37179a;
                    if (context2 != null && (context2 instanceof MBInterstitialActivity) && (mBInterstitialActivity = (MBInterstitialActivity) context2) != null) {
                        str = mBInterstitialActivity.mUnitid;
                        return str;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private void m38088a(String str, List<CampaignEx> list) {
        try {
            if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
                for (int i = 0; i < list.size(); i++) {
                    CampaignEx campaignEx = list.get(i);
                    if (campaignEx != null) {
                        C13091b.m37104a(str, campaignEx, "interstitial");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
