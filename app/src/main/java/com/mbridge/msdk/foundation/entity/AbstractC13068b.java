package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.p289db.middle.C13025b;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.tools.C13199g0;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.out.Frame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.entity.b */
/* JADX INFO: compiled from: BaseCampaignUnit.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13068b {
    public static final String JSON_KEY_ADS = "ads";
    public static final String JSON_KEY_AD_HTML = "cam_html";
    public static final String JSON_KEY_AD_TYPE = "ad_type";
    public static final String JSON_KEY_AD_ZIP = "cam_tpl_url";
    public static final String JSON_KEY_BANNER_HTML = "cam_html";
    public static final String JSON_KEY_BANNER_URL = "cam_tpl_url";
    public static final String JSON_KEY_CSP = "csp";
    public static final String JSON_KEY_C_I = "c_i";
    public static final String JSON_KEY_DO = "do";
    public static final String JSON_KEY_ENCRYPT_PRICE = "encrypt_p";
    public static final String JSON_KEY_END_SCREEN_URL = "end_screen_url";
    public static final String JSON_KEY_FRAME_ADS = "frames";
    public static final String JSON_KEY_HTML_URL = "html_url";
    public static final String JSON_KEY_IA_EXT1 = "ia_all_ext1";
    public static final String JSON_KEY_IA_EXT2 = "ia_all_ext2";
    public static final String JSON_KEY_IA_ICON = "ia_icon";
    public static final String JSON_KEY_IA_ORI = "ia_ori";
    public static final String JSON_KEY_IA_RST = "ia_rst";
    public static final String JSON_KEY_IA_URL = "ia_url";
    public static final String JSON_KEY_JM_DO = "jm_do";
    public static final String JSON_KEY_MOF_TEMPLATE_URL = "mof_template_url";
    public static final String JSON_KEY_MOF_TPLID = "mof_tplid";
    public static final String JSON_KEY_NSCPT = "nscpt";
    public static final String JSON_KEY_ONLY_IMPRESSION_URL = "only_impression_url";
    public static final String JSON_KEY_PARENT_SESSION_ID = "parent_session_id";
    public static final String JSON_KEY_PV_URLS = "pv_urls";
    public static final String JSON_KEY_REPLACE_TMP = "replace_tmp";
    public static final String JSON_KEY_REQ_EXT_DATA = "req_ext_data";
    public static final String JSON_KEY_RKS = "rks";
    public static final String JSON_KEY_SECOND_REQUEST_INDEX = "r_index";
    public static final String JSON_KEY_SECOND_SHOW_INDEX = "s_show_index";
    public static final String JSON_KEY_SESSION_ID = "a";
    public static final String JSON_KEY_SH = "sh";
    public static final String JSON_KEY_TEMPLATE = "template";
    public static final String JSON_KEY_TK_TCP_PORT = "tk_tcp_port";
    public static final String JSON_KEY_TOKEN_RULE = "token_r";
    public static final String JSON_KEY_UNIT_SIZE = "unit_size";
    public static final String JSON_KEY_VCN = "vcn";
    public static final String KEY_IRLFA = "irlfa";
    private static final String TAG = "b";
    private String adHtml;
    private int adType;
    private String adZip;
    public ArrayList<CampaignEx> ads;
    private String bannerHtml;
    private String bannerUrl;
    private String csp;
    private String domain;
    private double ecppv;
    private HashMap<String, String> epMap;
    private String htmlUrl;
    private String ia_all_ext1;
    private String ia_all_ext2;
    private String ia_icon;
    private int ia_ori;
    private int ia_rst;
    private String ia_url;
    private int jmDo;
    private List<Frame> listFrames;
    private String localRequestId;
    private C13154c metricsData;
    private String onlyImpressionUrl;
    private String parentSessionId;
    private String requestId;
    private HashMap<String, String> rks;
    private String sessionId;

    /* JADX INFO: renamed from: sh */
    private String f35644sh;
    private int template;
    private int tokenRule;
    private String unitSize;
    private int vcn;
    protected StringBuffer cParams = new StringBuffer();
    private String encryptPrice = "";
    private String msg = "";
    private int activitySwitch = 1;
    private int secondRequestIndex = 0;
    private int secondShowIndex = 0;

    private static void getSysIDAndBKUPID(JSONObject jSONObject) {
        FastKV fastKVBuild = null;
        if (C13009d.m36589a().m36605e()) {
            try {
                fastKVBuild = new FastKV.Builder(C13098e.m37149b(EnumC13096c.MBRIDGE_700_CONFIG), C13207k0.m37712a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (fastKVBuild != null) {
            try {
                Context contextM36542d = C13008c.m36588n().m36542d();
                if (jSONObject == null || contextM36542d == null) {
                    return;
                }
                String strOptString = jSONObject.optString("b");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(C13088a.f35856V, strOptString)) {
                    C13088a.f35856V = strOptString;
                    C12998a.m36460b().m36464a("b", C13088a.f35856V);
                    try {
                        fastKVBuild.putString(C13207k0.m37712a("H+tU+bfPhM=="), C13088a.f35856V);
                    } catch (Exception unused2) {
                    }
                }
                String strOptString2 = jSONObject.optString("c");
                if (TextUtils.isEmpty(strOptString2) || TextUtils.equals(C13088a.f35865g, strOptString2)) {
                    return;
                }
                C13088a.f35865g = strOptString2;
                C12998a.m36460b().m36464a("c", C13088a.f35865g);
                try {
                    fastKVBuild.putString(C13207k0.m37712a("H+tU+Fz8"), C13088a.f35865g);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            Context contextM36542d2 = C13008c.m36588n().m36542d();
            if (jSONObject == null || contextM36542d2 == null) {
                return;
            }
            String strOptString3 = jSONObject.optString("b");
            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.equals(C13088a.f35856V, strOptString3)) {
                C13088a.f35856V = strOptString3;
                C12998a.m36460b().m36464a("b", C13088a.f35856V);
                SharedPreferences sharedPreferences = contextM36542d2.getSharedPreferences(C13207k0.m37712a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(C13207k0.m37712a("H+tU+bfPhM=="), C13088a.f35856V);
                    editorEdit.apply();
                }
            }
            String strOptString4 = jSONObject.optString("c");
            if (TextUtils.isEmpty(strOptString4) || TextUtils.equals(C13088a.f35865g, strOptString4)) {
                return;
            }
            C13088a.f35865g = strOptString4;
            C12998a.m36460b().m36464a("c", C13088a.f35865g);
            SharedPreferences sharedPreferences2 = contextM36542d2.getSharedPreferences(C13207k0.m37712a("H+tU+FeXHM=="), 0);
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putString(C13207k0.m37712a("H+tU+Fz8"), C13088a.f35865g);
                editorEdit2.apply();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject) {
        return parseCampaignUnit(jSONObject, "");
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject) {
        return parseV5CampaignUnit(jSONObject, "");
    }

    public abstract String assembCParams();

    public int getActivitySwitch() {
        return this.activitySwitch;
    }

    public String getAdHtml() {
        return this.adHtml;
    }

    public int getAdType() {
        return this.adType;
    }

    public String getAdZip() {
        return this.adZip;
    }

    public ArrayList<CampaignEx> getAds() {
        return this.ads;
    }

    public String getBannerHtml() {
        return this.bannerHtml;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public String getCsp() {
        return this.csp;
    }

    public String getDomain() {
        return this.domain;
    }

    public double getEcppv() {
        return this.ecppv;
    }

    public String getEncryptPrice() {
        return this.encryptPrice;
    }

    public HashMap<String, String> getEpMap() {
        return this.epMap;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public String getIa_all_ext1() {
        return this.ia_all_ext1;
    }

    public String getIa_all_ext2() {
        return this.ia_all_ext2;
    }

    public String getIa_icon() {
        return this.ia_icon;
    }

    public int getIa_ori() {
        return this.ia_ori;
    }

    public int getIa_rst() {
        return this.ia_rst;
    }

    public String getIa_url() {
        return this.ia_url;
    }

    public int getJmDo() {
        return this.jmDo;
    }

    public List<Frame> getListFrames() {
        return this.listFrames;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public C13154c getMetricsData() {
        return this.metricsData;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getOnlyImpressionUrl() {
        return this.onlyImpressionUrl;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public String getRequestId() {
        try {
            if (!TextUtils.isEmpty(this.requestId)) {
                return this.requestId;
            }
            if (TextUtils.isEmpty(this.onlyImpressionUrl)) {
                return "";
            }
            Uri uri = Uri.parse(this.onlyImpressionUrl);
            if (uri != null) {
                this.requestId = uri.getQueryParameter(CampaignEx.JSON_KEY_AD_K);
            }
            return this.requestId;
        } catch (Exception unused) {
            return "";
        }
    }

    public HashMap<String, String> getRks() {
        return this.rks;
    }

    public int getSecondRequestIndex() {
        return this.secondRequestIndex;
    }

    public int getSecondShowIndex() {
        return this.secondShowIndex;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSh() {
        return this.f35644sh;
    }

    public int getTemplate() {
        return this.template;
    }

    public int getTokenRule() {
        int i = this.tokenRule;
        if (i == 1) {
            return i;
        }
        return 0;
    }

    public String getUnitSize() {
        return this.unitSize;
    }

    public int getVcn() {
        int i = this.vcn;
        if (i > 1) {
            return i;
        }
        return 1;
    }

    protected Object nullToEmpty(Object obj) {
        return obj == null ? "" : obj;
    }

    public void setActivitySwitch(int i) {
        this.activitySwitch = i;
    }

    public void setAdHtml(String str) {
        this.adHtml = str;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public void setAdZip(String str) {
        this.adZip = str;
    }

    public void setAds(ArrayList<CampaignEx> arrayList) {
        this.ads = arrayList;
    }

    public void setBannerHtml(String str) {
        this.bannerHtml = str;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }

    public void setCsp(String str) {
        this.csp = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setEcppv(double d) {
        this.ecppv = d;
    }

    public void setEncryptPrice(String str) {
        this.encryptPrice = str;
    }

    public void setEpMap(HashMap<String, String> map) {
        this.epMap = map;
    }

    public void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public void setIa_all_ext1(String str) {
        this.ia_all_ext1 = str;
    }

    public void setIa_all_ext2(String str) {
        this.ia_all_ext2 = str;
    }

    public void setIa_icon(String str) {
        this.ia_icon = str;
    }

    public void setIa_ori(int i) {
        this.ia_ori = i;
    }

    public void setIa_rst(int i) {
        this.ia_rst = i;
    }

    public void setIa_url(String str) {
        this.ia_url = str;
    }

    public void setJmDo(int i) {
        this.jmDo = i;
    }

    public void setListFrames(List<Frame> list) {
        this.listFrames = list;
    }

    public void setLocalRequestId(String str) {
        this.localRequestId = str;
        Iterator<CampaignEx> it = getAds().iterator();
        while (it.hasNext()) {
            it.next().setLocalRequestId(str);
        }
    }

    public void setMetricsData(C13154c c13154c) {
        this.metricsData = c13154c;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setOnlyImpressionUrl(String str) {
        this.onlyImpressionUrl = str;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public void setRks(HashMap<String, String> map) {
        this.rks = map;
    }

    public void setSecondRequestIndex(int i) {
        this.secondRequestIndex = i;
    }

    public void setSecondShowIndex(int i) {
        this.secondShowIndex = i;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSh(String str) {
        this.f35644sh = str;
    }

    public void setTemplate(int i) {
        this.template = i;
    }

    public void setTokenRule(int i) {
        this.tokenRule = i;
    }

    public void setUnitSize(String str) {
        this.unitSize = str;
    }

    public void setVcn(int i) {
        this.vcn = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.mbridge.msdk.foundation.entity.CampaignUnit] */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39, types: [com.mbridge.msdk.foundation.entity.b] */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v42, types: [com.mbridge.msdk.foundation.entity.b] */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45, types: [com.mbridge.msdk.foundation.entity.b] */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.mbridge.msdk.foundation.tools.g0] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.mbridge.msdk.foundation.entity.CampaignUnit] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject, String str) {
        ?? OptString;
        ArrayList arrayList;
        String str2;
        int i;
        String str3 = JSON_KEY_ADS;
        String str4 = "a";
        String str5 = CampaignEx.JSON_KEY_ECPPV;
        String str6 = JSON_KEY_ONLY_IMPRESSION_URL;
        String str7 = JSON_KEY_HTML_URL;
        if (jSONObject != null) {
            try {
                CampaignUnit campaignUnit = new CampaignUnit();
                try {
                    String strOptString = jSONObject.optString(JSON_KEY_RKS);
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject2 = new JSONObject(strOptString);
                        Iterator<String> itKeys = jSONObject2.keys();
                        HashMap<String, String> map = new HashMap<>();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObject2.optString(next));
                        }
                        campaignUnit.setRks(map);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put("encrypt_p", "");
                        map2.put(KEY_IRLFA, "");
                        campaignUnit.setEpMap(map2);
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JSON_KEY_REQ_EXT_DATA);
                    int iOptInt = jSONObject.optInt(JSON_KEY_NSCPT, 1);
                    String strOptString2 = jSONObject.optString(JSON_KEY_MOF_TEMPLATE_URL, "");
                    int iOptInt2 = jSONObject.optInt(JSON_KEY_MOF_TPLID, 0);
                    String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
                    new JSONArray();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pv_urls");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(jSONArrayOptJSONArray.length());
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            arrayList2.add(jSONArrayOptJSONArray.getString(i2));
                        }
                        arrayList = arrayList2;
                    }
                    C13025b.m36738a().m36741a(jSONObject.optJSONObject(JSON_KEY_REPLACE_TMP), true);
                    getSysIDAndBKUPID(jSONObject);
                    campaignUnit.setSessionId(jSONObject.optString("a"));
                    campaignUnit.setParentSessionId(jSONObject.optString(JSON_KEY_PARENT_SESSION_ID));
                    campaignUnit.setAdType(jSONObject.optInt("ad_type"));
                    campaignUnit.setUnitSize(jSONObject.optString(JSON_KEY_UNIT_SIZE));
                    campaignUnit.setHtmlUrl(jSONObject.optString(JSON_KEY_HTML_URL));
                    campaignUnit.setOnlyImpressionUrl(jSONObject.optString(JSON_KEY_ONLY_IMPRESSION_URL));
                    campaignUnit.setActivitySwitch(jSONObject.optInt(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH));
                    campaignUnit.setEcppv(jSONObject.optDouble(CampaignEx.JSON_KEY_ECPPV));
                    campaignUnit.setTemplate(jSONObject.optInt("template"));
                    campaignUnit.setJmDo(jSONObject.optInt(JSON_KEY_JM_DO));
                    campaignUnit.setIa_icon(jSONObject.optString("ia_icon"));
                    campaignUnit.setIa_rst(jSONObject.optInt("ia_rst"));
                    campaignUnit.setIa_url(jSONObject.optString("ia_url"));
                    campaignUnit.setIa_ori(jSONObject.optInt("ia_ori"));
                    campaignUnit.setIa_all_ext1(jSONObject.optString(JSON_KEY_IA_EXT1));
                    campaignUnit.setIa_all_ext2(jSONObject.optString(JSON_KEY_IA_EXT2));
                    campaignUnit.setVcn(jSONObject.optInt("vcn"));
                    campaignUnit.setTokenRule(jSONObject.optInt("token_r"));
                    campaignUnit.setEncryptPrice(jSONObject.optString("encrypt_p"));
                    campaignUnit.setSecondRequestIndex(jSONObject.optInt("r_index", 0));
                    campaignUnit.setSecondShowIndex(jSONObject.optInt("s_show_index", 0));
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(JSON_KEY_ADS);
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(JSON_KEY_FRAME_ADS);
                    OptString = jSONObject.optString(JSON_KEY_C_I, "");
                    C13199g0.m37691a().m37692a(OptString);
                    String str8 = "web env is not support";
                    String str9 = JSON_KEY_END_SCREEN_URL;
                    try {
                        try {
                            if (jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray3.length() <= 0) {
                                String str10 = CampaignEx.JSON_KEY_ECPPV;
                                String str11 = JSON_KEY_ONLY_IMPRESSION_URL;
                                String str12 = JSON_KEY_HTML_URL;
                                String str13 = JSON_KEY_END_SCREEN_URL;
                                String str14 = string;
                                int i3 = iOptInt2;
                                OptString = campaignUnit;
                                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i4 = 0;
                                    OptString = OptString;
                                    while (i4 < jSONArrayOptJSONArray2.length()) {
                                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i4);
                                        JSONArray jSONArray = jSONArrayOptJSONArray2;
                                        String str15 = str11;
                                        String strOptString3 = jSONObject.optString(str15);
                                        ?? r17 = OptString;
                                        String str16 = str14;
                                        String str17 = str12;
                                        try {
                                            String strOptString4 = jSONObject.optString(str17);
                                            int i5 = i3;
                                            str12 = str17;
                                            String str18 = str13;
                                            String strOptString5 = jSONObject.optString(str18);
                                            String str19 = str10;
                                            str10 = str19;
                                            int i6 = i4;
                                            ?? campaign = CampaignEx.parseCampaign(jSONObjectOptJSONObject2, strOptString3, strOptString4, strOptString5, false, r17, str, jSONObject.optString(str19));
                                            ?? r13 = r17;
                                            if (campaign != 0) {
                                                campaign.setNetAddress(OptString);
                                                campaign.setMof_tplid(i5);
                                                campaign.setMof_template_url(strOptString2);
                                                campaign.setNscpt(iOptInt);
                                                campaign.setPv_urls(arrayList);
                                                campaign.setReq_ext_data(str16);
                                                campaign.setVcn(r13.getVcn());
                                                campaign.setTokenRule(r13.getTokenRule());
                                                campaign.setEncryptPrice(r13.getEncryptPrice());
                                                campaign.setAc_s(jSONObject.optInt(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, 1));
                                                arrayList3.add(campaign);
                                            } else {
                                                r13.setMsg(str8);
                                            }
                                            str14 = str16;
                                            str11 = str15;
                                            i3 = i5;
                                            i4 = i6 + 1;
                                            jSONArrayOptJSONArray2 = jSONArray;
                                            str13 = str18;
                                            OptString = r13;
                                        } catch (Exception unused) {
                                            OptString = r17;
                                        }
                                    }
                                    OptString.setAds(arrayList3);
                                }
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                String str20 = "template";
                                CampaignUnit campaignUnit2 = campaignUnit;
                                int i7 = 0;
                                ?? r14 = OptString;
                                while (i7 < jSONArrayOptJSONArray3.length()) {
                                    try {
                                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray3.optJSONObject(i7);
                                        int i8 = i7;
                                        JSONArray jSONArray2 = jSONObjectOptJSONObject3.getJSONArray(str3);
                                        String str21 = str3;
                                        ArrayList arrayList5 = new ArrayList();
                                        String str22 = str4;
                                        JSONObject jSONObject3 = jSONObjectOptJSONObject3;
                                        int i9 = 0;
                                        ?? r15 = r14;
                                        while (i9 < jSONArray2.length()) {
                                            JSONObject jSONObjectOptJSONObject4 = jSONArray2.optJSONObject(i9);
                                            ArrayList arrayList6 = arrayList4;
                                            String strOptString6 = jSONObject.optString(str6);
                                            ?? r30 = r15;
                                            String strOptString7 = jSONObject.optString(str7);
                                            JSONArray jSONArray3 = jSONArrayOptJSONArray3;
                                            String str23 = str9;
                                            String str24 = strOptString2;
                                            JSONArray jSONArray4 = jSONArray2;
                                            int i10 = iOptInt;
                                            int i11 = i9;
                                            JSONObject jSONObject4 = jSONObject3;
                                            String str25 = str7;
                                            String str26 = str8;
                                            CampaignUnit campaignUnit3 = campaignUnit2;
                                            String str27 = str5;
                                            String str28 = str6;
                                            ?? campaign2 = CampaignEx.parseCampaign(jSONObjectOptJSONObject4, strOptString6, strOptString7, jSONObject.optString(str9), false, campaignUnit3, str, jSONObject.optString(str5));
                                            if (campaign2 != 0) {
                                                campaign2.setNetAddress(r30);
                                                campaign2.setKeyIaUrl(campaignUnit3.getIa_url());
                                                campaign2.setKeyIaOri(campaignUnit3.getIa_ori());
                                                campaign2.setKeyIaRst(campaignUnit3.getIa_rst());
                                                campaign2.setKeyIaIcon(campaignUnit3.getIa_icon());
                                                campaign2.setAdType(jSONObject.optInt("ad_type"));
                                                campaign2.setIa_ext1(jSONObject.optString(CampaignEx.KEY_IA_EXT1));
                                                campaign2.setIa_ext2(jSONObject.optString(CampaignEx.KEY_IA_EXT2));
                                                campaign2.setAc_s(jSONObject.optInt(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, 1));
                                                campaign2.setVcn(campaignUnit3.getVcn());
                                                campaign2.setTokenRule(campaignUnit3.getTokenRule());
                                                campaign2.setEncryptPrice(campaignUnit3.getEncryptPrice());
                                                i = iOptInt2;
                                                campaign2.setMof_tplid(i);
                                                campaign2.setMof_template_url(str24);
                                                campaign2.setNscpt(i10);
                                                campaign2.setPv_urls(arrayList);
                                                str2 = string;
                                                campaign2.setReq_ext_data(str2);
                                                arrayList5.add(campaign2);
                                            } else {
                                                str2 = string;
                                                i = iOptInt2;
                                                campaignUnit3.setMsg(str26);
                                            }
                                            int i12 = i11 + 1;
                                            r15 = r30;
                                            str5 = str27;
                                            campaignUnit2 = campaignUnit3;
                                            iOptInt = i10;
                                            str8 = str26;
                                            iOptInt2 = i;
                                            string = str2;
                                            jSONArray2 = jSONArray4;
                                            str7 = str25;
                                            str6 = str28;
                                            arrayList4 = arrayList6;
                                            jSONArrayOptJSONArray3 = jSONArray3;
                                            jSONObject3 = jSONObject4;
                                            str9 = str23;
                                            strOptString2 = str24;
                                            i9 = i12;
                                        }
                                        String str29 = str6;
                                        ArrayList arrayList7 = arrayList4;
                                        Frame frame = new Frame();
                                        frame.setParentSessionId(jSONObject.optString(JSON_KEY_PARENT_SESSION_ID));
                                        frame.setSessionId(jSONObject.optString(str22));
                                        frame.setCampaigns(arrayList5);
                                        String str30 = str20;
                                        frame.setTemplate(jSONObject3.optInt(str30));
                                        arrayList7.add(frame);
                                        r14 = r15;
                                        str5 = str5;
                                        campaignUnit2 = campaignUnit2;
                                        iOptInt = iOptInt;
                                        strOptString2 = strOptString2;
                                        str20 = str30;
                                        str8 = str8;
                                        i7 = i8 + 1;
                                        str4 = str22;
                                        iOptInt2 = iOptInt2;
                                        string = string;
                                        str7 = str7;
                                        str6 = str29;
                                        jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                                        str9 = str9;
                                        arrayList4 = arrayList7;
                                        str3 = str21;
                                    } catch (Exception unused2) {
                                        OptString = campaignUnit2;
                                    }
                                }
                                OptString = campaignUnit2;
                                OptString.setListFrames(arrayList4);
                            }
                        } catch (Exception unused3) {
                            OptString = str8;
                        }
                    } catch (Exception unused4) {
                    }
                } catch (Exception unused5) {
                    OptString = campaignUnit;
                }
                return OptString;
            } catch (Exception unused6) {
            }
        }
        return null;
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject, String str) {
        return parseCampaignUnit(jSONObject, str);
    }
}
