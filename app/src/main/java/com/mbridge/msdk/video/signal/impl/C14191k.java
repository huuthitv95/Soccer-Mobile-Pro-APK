package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.C11744X3;
import com.ironsource.C11794a2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13026n;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.video.signal.InterfaceC14078a;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.k */
/* JADX INFO: compiled from: JSCommon.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14191k extends C14192l {

    /* JADX INFO: renamed from: t */
    private Activity f40936t;

    /* JADX INFO: renamed from: u */
    private String f40937u;

    /* JADX INFO: renamed from: v */
    private String f40938v;

    /* JADX INFO: renamed from: x */
    private CampaignEx f40940x;

    /* JADX INFO: renamed from: y */
    private List<CampaignEx> f40941y;

    /* JADX INFO: renamed from: z */
    private int f40942z;

    /* JADX INFO: renamed from: w */
    private int f40939w = 0;

    /* JADX INFO: renamed from: A */
    private String f40932A = "";

    /* JADX INFO: renamed from: B */
    private String f40933B = "";

    /* JADX INFO: renamed from: C */
    private boolean f40934C = false;

    /* JADX INFO: renamed from: D */
    private boolean f40935D = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.k$a */
    /* JADX INFO: compiled from: JSCommon.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f40943a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40944b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f40945c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f40946d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f40947e;

        a(String str, String str2, String str3, String str4, int i) {
            this.f40943a = str;
            this.f40944b = str2;
            this.f40945c = str3;
            this.f40946d = str4;
            this.f40947e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13026n.m36744a(C13017g.m36693a(C14191k.this.f40936t.getApplication())).m36745a(new C13080n("2000039", this.f40943a, this.f40944b, this.f40945c, this.f40946d, C14191k.this.f40940x.getId(), this.f40947e, C13211m0.m37732a(C14191k.this.f40936t.getApplication(), this.f40947e)));
        }
    }

    public C14191k(Activity activity, CampaignEx campaignEx) {
        this.f40936t = activity;
        this.f40940x = campaignEx;
    }

    public C14191k(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.f40936t = activity;
        this.f40940x = campaignEx;
        this.f40941y = list;
    }

    /* JADX INFO: renamed from: A */
    private String m42358A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f40916j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.f40932A);
            jSONObject2.put("rootViewInstanceId", this.f40933B);
            jSONObject2.put("isRootTemplateWebView", this.f40934C);
            jSONObject.put("sdk_info", "MAL_17.0.91,3.0.1");
            jSONObject2.put("playVideoMute", this.f40920n);
            jSONObject.put("sdkSetting", jSONObject2);
            m42387a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<CampaignEx> list = this.f40941y;
            if (list == null || list.size() <= 0) {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.f40940x));
            } else {
                for (CampaignEx campaignEx : this.f40941y) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), m42366b(campaignEx)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m42372x());
            String strM39721e = C13636h.m39706b().m39721e(C13008c.m36588n().m36533b());
            if (!TextUtils.isEmpty(strM39721e)) {
                JSONObject jSONObject3 = new JSONObject(strM39721e);
                m42367c(jSONObject3);
                String strM39717c = C13636h.m39706b().m39717c(this.f40916j);
                if (!TextUtils.isEmpty(strM39717c)) {
                    jSONObject3.put("ivreward", new JSONObject(strM39717c));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", m42371w());
            if (!TextUtils.isEmpty(this.f40916j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f40916j);
            }
            jSONObject.put("rw_plus", this.f40935D ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: B */
    private JSONObject m42359B() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f40916j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f40916j);
                return jSONObject;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: C */
    private JSONObject m42360C() {
        JSONObject jSONObject = new JSONObject();
        try {
            C14223c c14223c = this.f40917k;
            if (c14223c != null) {
                jSONObject.put("unitSetting", c14223c.m42696H());
                return jSONObject;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private CampaignEx m42362a(String str, CampaignEx campaignEx) {
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (str.contains("notice")) {
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                JSONObject jSONObject = new JSONObject(str);
                m42388b(jSONObject);
                try {
                    if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                        jSONObjectCampaignToJsonObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                    }
                } catch (Exception unused) {
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectCampaignToJsonObject.put(next, jSONObject.getString(next));
                }
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                m42376a(jSONObjectCampaignToJsonObject, campaignWithBackData);
                return campaignWithBackData;
            } catch (JSONException e) {
                e.printStackTrace();
                return campaignEx;
            }
        }
        try {
            JSONObject jSONObjectCampaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            CampaignEx campaignWithBackData2 = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject2);
            if (campaignWithBackData2 == null) {
                campaignWithBackData2 = campaignEx;
            }
            if (!TextUtils.isEmpty(str)) {
                m42376a(jSONObjectCampaignToJsonObject2, campaignWithBackData2);
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(C13088a.f35868j);
                if (jSONObjectOptJSONObject != null) {
                    strValueOf = String.valueOf(C13229v0.m37876a(this.f40936t, Integer.valueOf(jSONObjectOptJSONObject.getString(C13088a.f35866h)).intValue()));
                    strValueOf2 = String.valueOf(C13229v0.m37876a(this.f40936t, Integer.valueOf(jSONObjectOptJSONObject.getString(C13088a.f35867i)).intValue()));
                } else {
                    strValueOf = "-999";
                    strValueOf2 = "-999";
                }
                campaignWithBackData2.setClickURL(C12684c.m34652a(campaignWithBackData2.getClickURL(), strValueOf, strValueOf2));
                String noticeUrl = campaignWithBackData2.getNoticeUrl();
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    StringBuilder sb = new StringBuilder();
                    while (itKeys2.hasNext()) {
                        sb.append(C11744X3.j.f26436c);
                        String next2 = itKeys2.next();
                        String strOptString = jSONObjectOptJSONObject.optString(next2);
                        if (C13088a.f35866h.equals(next2) || C13088a.f35867i.equals(next2)) {
                            strOptString = String.valueOf(C13229v0.m37876a(this.f40936t, Integer.valueOf(strOptString).intValue()));
                        }
                        sb.append(next2);
                        sb.append(C11744X3.j.f26434b);
                        sb.append(strOptString);
                    }
                    campaignWithBackData2.setNoticeUrl(noticeUrl + ((Object) sb));
                }
            }
            return campaignWithBackData2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return campaignEx;
        } catch (Throwable th) {
            th.printStackTrace();
            return campaignEx;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m42363a(CampaignEx campaignEx) {
        try {
            int i = this.f40939w;
            if (i == 3) {
                campaignEx.setClickTempSource(2);
                if (campaignEx.getTriggerClickSource() == 0) {
                    campaignEx.setTriggerClickSource(2);
                    return;
                }
                return;
            }
            if (i != 1 || campaignEx.getClickTempSource() == 2) {
                return;
            }
            campaignEx.setClickTempSource(1);
        } catch (Exception e) {
            C13219q0.m37816b("DefaultJSCommon", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m42365b(String str) {
        List<CampaignEx> list;
        if (this.f40940x == null || (list = this.f40941y) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f40940x = this.f40941y.get(jSONObject.getInt("camp_position"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m42366b(CampaignEx campaignEx) {
        C13635g c13635gM39718d;
        try {
            String strM36533b = C13008c.m36588n().m36533b();
            long jM39486c0 = (TextUtils.isEmpty(strM36533b) || (c13635gM39718d = C13636h.m39706b().m39718d(strM36533b)) == null) ? 0L : c13635gM39718d.m39486c0() * 1000;
            C14221a c14221aM42670c = C14222b.m42658b().m42670c();
            long jM42647e = c14221aM42670c != null ? c14221aM42670c.m42647e() : 0L;
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(jM42647e, jM39486c0);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m42367c(JSONObject jSONObject) {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            String string = C13235y0.m37956a(contextM36542d, "MBridge_ConfirmTitle" + this.f40916j, "").toString();
            String string2 = C13235y0.m37956a(contextM36542d, "MBridge_ConfirmContent" + this.f40916j, "").toString();
            String string3 = C13235y0.m37956a(contextM36542d, "MBridge_CancelText" + this.f40916j, "").toString();
            String string4 = C13235y0.m37956a(contextM36542d, "MBridge_ConfirmText" + this.f40916j, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("confirm_c_play", string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: s */
    private JSONObject m42368s() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strM39721e = C13636h.m39706b().m39721e(C13008c.m36588n().m36533b());
            if (!TextUtils.isEmpty(strM39721e)) {
                jSONObject.put("appSetting", new JSONObject(strM39721e));
                return jSONObject;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: t */
    private JSONObject m42369t() {
        JSONObject jSONObject = new JSONObject();
        m42387a(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f40920n);
            jSONObject.put("sdkSetting", jSONObject2);
            m42387a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.f40940x));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m42372x());
            String strM39721e = C13636h.m39706b().m39721e(C13008c.m36588n().m36533b());
            if (!TextUtils.isEmpty(strM39721e)) {
                JSONObject jSONObject3 = new JSONObject(strM39721e);
                m42367c(jSONObject3);
                String strM39717c = C13636h.m39706b().m39717c(this.f40916j);
                if (!TextUtils.isEmpty(strM39717c)) {
                    jSONObject3.put("ivreward", strM39717c);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", m42371w());
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: u */
    private JSONObject m42370u() {
        JSONObject jSONObject = new JSONObject();
        try {
            m42387a(jSONObject);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: w */
    private JSONObject m42371w() {
        JSONObject jSONObject = new JSONObject();
        C14221a c14221aM42670c = C14222b.m42658b().m42670c();
        return c14221aM42670c != null ? c14221aM42670c.m42655k() : jSONObject;
    }

    /* JADX INFO: renamed from: x */
    private JSONObject m42372x() {
        JSONObject jSONObject = new JSONObject();
        C14223c c14223c = this.f40917k;
        return c14223c != null ? c14223c.m42696H() : jSONObject;
    }

    /* JADX INFO: renamed from: y */
    private JSONObject m42373y() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_17.0.91,3.0.1");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: z */
    private JSONObject m42374z() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f40920n);
            jSONObject2.put("instanceId", this.f40932A);
            jSONObject.put("sdkSetting", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: a */
    public void mo42208a(int i, String str) {
        super.mo42208a(i, str);
        if (i != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT), jSONObject.optString("template", C11794a2.f26725f), jSONObject.optString("layout", C11794a2.f26725f), jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f40916j), C13211m0.m37770s(this.f40936t.getApplication()));
            if (C13009d.m36589a().m36605e()) {
                C13167a.m37543b().execute(aVar);
            } else {
                aVar.run();
            }
        } catch (Throwable th) {
            C13219q0.m37817b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: a */
    public void mo42210a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f40938v = str;
    }

    /* JADX INFO: renamed from: a */
    public void m42375a(List<CampaignEx> list) {
        this.f40941y = list;
    }

    /* JADX INFO: renamed from: a */
    public void m42376a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String strOptString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            campaignEx.setCampaignUnitId(strOptString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: c */
    public String mo42216c() {
        this.f40919m.onInitSuccess();
        this.f40907a = true;
        if (TextUtils.isEmpty(this.f40937u)) {
            this.f40937u = m42358A();
        } else {
            this.f40937u = C13229v0.m37906b(this.f40937u, "tun", C13211m0.m37715A() + "");
        }
        return this.f40937u;
    }

    /* JADX INFO: renamed from: c */
    public void m42377c(CampaignEx campaignEx) {
        this.f40940x = campaignEx;
    }

    /* JADX INFO: renamed from: c */
    public void m42378c(String str) {
        this.f40932A = str;
    }

    /* JADX INFO: renamed from: c */
    public void m42379c(boolean z) {
        this.f40934C = z;
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14174e
    public void click(int i, String str) {
        AppletsModel appletsModel;
        List<CampaignEx> list;
        int iM42728i;
        super.click(i, str);
        CampaignEx campaignEx = this.f40940x;
        if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
            m42365b(str);
        }
        try {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.f40919m.mo41603a(true);
                    return;
                }
                CampaignEx campaignEx2 = this.f40940x;
                if (campaignEx2 == null || campaignEx2.getCbd() <= -2) {
                    C14223c c14223c = this.f40917k;
                    iM42728i = c14223c != null ? c14223c.m42728i() : 1;
                } else {
                    iM42728i = this.f40940x.getCbd();
                }
                if (iM42728i == -1) {
                    mo42209a(new AbstractC14181a.b(this, this.f40919m));
                }
                this.f40939w = i;
                click(1, str);
                return;
            }
            if (this.f40940x == null && (list = this.f40941y) != null && list.size() > 0) {
                this.f40940x = this.f40941y.get(0);
            }
            CampaignEx campaignEx3 = this.f40940x;
            if (campaignEx3 == null) {
                return;
            }
            CampaignEx campaignExM42362a = m42362a(str, campaignEx3);
            if (this.f40939w != 3) {
                this.f40939w = i;
            }
            m42363a(campaignExM42362a);
            if (campaignExM42362a != null && (appletsModel = AppletModelManager.getInstance().get(campaignExM42362a)) != null) {
                appletsModel.setUserClick(true);
                AppletModelManager.getInstance().replace(appletsModel, campaignExM42362a);
            }
            m42386a(campaignExM42362a, this.f40936t);
        } catch (Throwable th) {
            C13219q0.m37817b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m42380d(String str) {
        this.f40933B = str;
    }

    /* JADX INFO: renamed from: d */
    public void m42381d(boolean z) {
        this.f40935D = z;
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: e */
    public String mo42220e() {
        C13219q0.m37813a("DefaultJSCommon", "getNotchArea");
        return this.f40938v;
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: f */
    public String mo42222f(int i) {
        switch (i) {
            case 1:
                return m42373y().toString();
            case 2:
                return m42359B().toString();
            case 3:
                return m42368s().toString();
            case 4:
                return m42360C().toString();
            case 5:
                return m42370u().toString();
            case 6:
                return m42374z().toString();
            default:
                return m42369t().toString();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: f */
    public void mo42223f() {
        super.mo42223f();
        try {
            Activity activity = this.f40936t;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            C13219q0.m37817b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: g */
    public String mo42224g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playVideoMute", this.f40920n);
            jSONObject.put("userVideoMute", this.f40921o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: h */
    public void mo42226h() {
        super.mo42226h();
        InterfaceC14078a.a aVar = this.f40919m;
        if (aVar != null) {
            aVar.mo41601a();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m42382h(int i) {
        this.f40942z = i;
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14174e
    public void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.f40919m.mo41602a(i, str);
        } catch (Throwable th) {
            C13219q0.m37817b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m42383r() {
        this.f40937u = "";
    }

    @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a, com.mbridge.msdk.video.signal.InterfaceC14078a
    public void setActivity(Activity activity) {
        this.f40936t = activity;
    }

    /* JADX INFO: renamed from: v */
    public int m42384v() {
        return this.f40942z;
    }
}
