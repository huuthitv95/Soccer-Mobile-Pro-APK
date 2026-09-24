package com.mbridge.msdk.scheme.applet;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.scheme.report.AppletsReport;
import com.mbridge.msdk.scheme.request.AppletSchemeRequest;
import com.mbridge.msdk.scheme.response.AppletSchemeResponse;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class AppletsModel implements Serializable {
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_0 = "0";
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_1 = "1";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK = "event_callback";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK = "install_callback";
    public static final int REQUEST_TYPE_CLICK = 1;
    public static final int REQUEST_TYPE_SHOW = 0;
    private static String TAG = "AppletsModel";
    private static final String URL_ENCODE_UTF_8 = "UTF-8";
    private static final String WX_MINIPROGRAM = "wx_miniprogram";
    private static final int WX_SCHEME_REQUEST_ERROR_CODE_44993 = 44993;
    private volatile IAppletSchemeCallBack appletSchemeCallBack;
    private final CampaignEx campaignEx;
    private String deepLink = "";
    private volatile boolean isRequestSuccess = false;
    private boolean isRequestTimesMaxPerDay = false;
    private volatile boolean isRequesting = false;
    private boolean isSupportWxScheme = false;
    private boolean isUserClick = false;
    private int lastRequestType = -1;
    private Map<String, String> params;
    private String reBuildClickUrl;
    private final String requestId;
    private final String unitID;

    private static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
        public void onError(C13113a c13113a) {
            super.onError(c13113a);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            this.appletsModel.handlerSchemeRequestNetworkError(c13113a);
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
        public void onSuccess(C13112e<JSONObject> c13112e) {
            super.onSuccess(c13112e);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            if (c13112e == null || c13112e.f35958c == null) {
                this.appletsModel.handlerRequestNetworkError();
                return;
            }
            try {
                this.appletsModel.handlerSchemeRequestResult(c13112e);
            } catch (SchemeRequestException e) {
                this.appletsModel.handlerSchemeRequestFailed(-2, e.getMessage());
            }
        }
    }

    private static final class SchemeRequestException extends Exception {
        public SchemeRequestException(String str) {
            super(str);
        }
    }

    public AppletsModel(CampaignEx campaignEx, String str, String str2) {
        this.campaignEx = campaignEx;
        this.unitID = str;
        this.requestId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeRequestingState(boolean z) {
        this.isRequesting = z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[Catch: Exception -> 0x019f, TRY_LEAVE, TryCatch #0 {Exception -> 0x019f, blocks: (B:5:0x0017, B:7:0x0021, B:10:0x0028, B:11:0x0037, B:14:0x0045, B:16:0x0054, B:21:0x0063, B:23:0x006b, B:31:0x00a0, B:33:0x00b3, B:28:0x007d, B:30:0x0081, B:47:0x00de, B:57:0x00f6, B:67:0x010e, B:68:0x0111, B:77:0x012c, B:79:0x013a, B:80:0x0150, B:73:0x0120, B:75:0x0124, B:63:0x0103, B:65:0x0107, B:53:0x00eb, B:55:0x00ef, B:43:0x00d3, B:45:0x00d7, B:25:0x0073, B:48:0x00e1, B:58:0x00f9, B:38:0x00c9), top: B:93:0x0017, inners: #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:4:0x0013  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a6  */
    private Map<String, String> getAppletsParamsAndBuildRequest(CampaignEx campaignEx) {
        String str;
        String str2;
        String str3;
        String strEncode;
        String str4 = MBridgeConstans.DYNAMIC_VIEW_WX_IS_REDIRECT;
        String str5 = "query";
        HashMap map = new HashMap();
        if (campaignEx != null) {
            try {
                Uri uri = Uri.parse(campaignEx.getClickURL());
                if (uri != null && uri.getQueryParameterNames() != null) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = uri.getQueryParameterNames().iterator();
                    int i = 0;
                    while (true) {
                        String queryParameter = "";
                        if (!it.hasNext()) {
                            break;
                        }
                        Iterator<String> it2 = it;
                        String next = it.next();
                        if (TextUtils.isEmpty(next) || TextUtils.equals(next, "wx_miniprogram")) {
                            str4 = str4;
                            str5 = str5;
                        } else {
                            try {
                                queryParameter = uri.getQueryParameter(next);
                            } catch (Exception unused) {
                            }
                            String strEncode2 = queryParameter;
                            if (TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK) || TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK)) {
                                try {
                                    strEncode2 = URLEncoder.encode(strEncode2, "UTF-8");
                                } catch (Exception e) {
                                    if (MBridgeConstans.DEBUG) {
                                        C13219q0.m37817b(TAG, "encode url for " + strEncode2 + " failed", e);
                                    }
                                    sb.append(next);
                                    sb.append(C11744X3.j.f26434b);
                                    sb.append(strEncode2);
                                    if (i < uri.getQueryParameterNames().size()) {
                                        sb.append(C11744X3.j.f26436c);
                                    }
                                    i++;
                                    it = it2;
                                    str4 = str4;
                                    str5 = str5;
                                }
                            }
                            sb.append(next);
                            sb.append(C11744X3.j.f26434b);
                            sb.append(strEncode2);
                            if (i < uri.getQueryParameterNames().size()) {
                                sb.append(C11744X3.j.f26436c);
                            }
                            i++;
                        }
                        it = it2;
                        str4 = str4;
                        str5 = str5;
                        e = e;
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37817b(TAG, "create wechat app request param failed ", e);
                        }
                    }
                    String str6 = str4;
                    String str7 = str5;
                    try {
                        String queryParameter2 = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                        str = queryParameter2 == null ? "" : queryParameter2;
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37817b(TAG, "create wechat app request param failed ", e2);
                        }
                    }
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, str);
                    try {
                        String queryParameter3 = uri.getQueryParameter("path");
                        str2 = queryParameter3 == null ? "" : queryParameter3;
                    } catch (Exception e3) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37817b(TAG, "create wechat app request param failed ", e3);
                        }
                    }
                    map.put("path", str2);
                    try {
                        String queryParameter4 = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
                        str3 = queryParameter4 == null ? "" : queryParameter4;
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37817b(TAG, "create wechat app request param failed ", e4);
                        }
                    }
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                    try {
                        strEncode = URLEncoder.encode(sb.toString(), "UTF-8");
                        if (strEncode == null) {
                            strEncode = "";
                        }
                    } catch (UnsupportedEncodingException e5) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37817b(TAG, "create wechat app request param failed ", e5);
                        }
                    }
                    map.put(str7, strEncode);
                    map.put(str6, "0");
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37813a(TAG, "query: " + strEncode);
                    }
                    try {
                        this.reBuildClickUrl = reCreateClickUrl(MBridgeConstans.DYNAMIC_VIEW_WX_APP + C11744X3.j.f26434b + str + C11744X3.j.f26436c + "path" + C11744X3.j.f26434b + str2 + C11744X3.j.f26436c + str7 + C11744X3.j.f26434b + strEncode + C11744X3.j.f26436c + MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID + C11744X3.j.f26434b + str3 + C11744X3.j.f26436c + str6 + C11744X3.j.f26434b + "1");
                    } catch (Exception e6) {
                        e = e6;
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37817b(TAG, "create wechat app request param failed ", e);
                        }
                    }
                }
            } catch (Exception e7) {
                e = e7;
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerRequestNetworkError() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37813a(TAG, "handlerRequestNetworkError response or result is null");
        }
        try {
            this.appletSchemeCallBack.onNetworkError(1, "response or result is null", this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b(TAG, "handler request network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(C13008c.m36588n().m36542d(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37813a(TAG, String.format("handlerSchemeRequestFailed network error by code %s and %s", String.valueOf(i), str));
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i, str, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b(TAG, "handler wx scheme failed exception  ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(C13008c.m36588n().m36542d(), String.format("network error by code %s and %s", String.valueOf(i), str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(C13113a c13113a) {
        int i;
        String message;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (c13113a != null) {
            i = c13113a.f35959a;
            message = c13113a.getMessage();
            if (i == 10) {
                message = "request timeout";
            }
        } else {
            i = -1;
            message = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37813a(TAG, String.format("handlerSchemeRequestNetworkError network error by code %s and %s", String.valueOf(i), message));
        }
        try {
            this.appletSchemeCallBack.onNetworkError(i, "network error: " + message, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b(TAG, "handler wx scheme network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(C13008c.m36588n().m36542d(), String.format("network error by code %s and %s", String.valueOf(i), message), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(C13112e<JSONObject> c13112e) throws SchemeRequestException {
        JSONObject jSONObject = c13112e.f35958c;
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37813a("AppletsModel", "result: " + jSONObject.toString());
        }
        if (jSONObject.has("wx_scheme")) {
            String strOptString = jSONObject.optString("wx_scheme", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new SchemeRequestException("wx_scheme value is null");
            }
            this.isRequestSuccess = true;
            handlerSchemeRequestSuccess(strOptString);
            return;
        }
        int iOptInt = jSONObject.optInt("error_code", -1);
        String strOptString2 = jSONObject.optString("error_msg", "");
        if (iOptInt == WX_SCHEME_REQUEST_ERROR_CODE_44993) {
            this.isRequestTimesMaxPerDay = true;
        }
        handlerSchemeRequestFailed(iOptInt, strOptString2);
    }

    private void handlerSchemeRequestStart() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestStart();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b(TAG, "handler wx scheme start exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(C13008c.m36588n().m36542d(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37813a(TAG, "handlerSchemeRequestSuccess: " + str);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b(TAG, "handler wx scheme success exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(C13008c.m36588n().m36542d(), "request wx scheme success", this.unitID, this.requestId);
    }

    private boolean isCanRequestByClickUrl(String str) {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return false;
            }
            String clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
                return false;
            }
            return TextUtils.equals(C13188c1.m37645a(clickURL, "wx_miniprogram"), str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b(TAG, "query wx_miniprogram from click url exception ", e);
            }
            return false;
        }
    }

    private boolean isCanRequestByLinkType() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return false;
        }
        int linkType = campaignEx.getLinkType();
        return linkType == 8 || linkType == 9;
    }

    private boolean isCanRequestByTemplateUrl(String str) {
        CampaignEx.C13066c rewardTemplateMode;
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null && !TextUtils.isEmpty(rewardTemplateMode.m36781j())) {
                return TextUtils.equals(C13188c1.m37645a(rewardTemplateMode.m36781j(), MBridgeConstans.DYNAMIC_VIEW_REQ_WX_URL), str);
            }
            return false;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b(TAG, "query reqwxurl from template url exception ", e);
            }
            return false;
        }
    }

    private String reCreateClickUrl(String str) {
        return C13121d.m37226h().f36020b + "?" + str;
    }

    public boolean can(int i) {
        if (isRequesting() || !canRequestWxScheme(i)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i2 = this.lastRequestType;
        return (i2 == 0 && i == 1) || (i2 == 1 && i == 1 && this.isUserClick);
    }

    public boolean canRequestWxScheme(int i) {
        if (!isSupportWxScheme()) {
            return false;
        }
        if (i != 0) {
            return i == 1;
        }
        return isCanRequestByTemplateUrl("2");
    }

    public void clearRequestState() {
        this.isRequestSuccess = false;
        this.isRequesting = false;
        this.appletSchemeCallBack = null;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getReBuildClickUrl() {
        return this.reBuildClickUrl;
    }

    public boolean isRequestSuccess() {
        return this.isRequestSuccess;
    }

    public boolean isRequestTimesMaxPerDay() {
        return this.isRequestTimesMaxPerDay;
    }

    public boolean isRequesting() {
        return this.isRequesting;
    }

    public boolean isSupportWxScheme() {
        if (!this.isSupportWxScheme) {
            this.isSupportWxScheme = isCanRequestByClickUrl("1") && isCanRequestByLinkType();
        }
        return this.isSupportWxScheme;
    }

    public void requestWxAppletsScheme(int i, IAppletSchemeCallBack iAppletSchemeCallBack) {
        if (this.campaignEx == null || TextUtils.isEmpty(this.unitID)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37816b(TAG, "start request wx scheme");
        }
        this.isRequesting = true;
        if (iAppletSchemeCallBack != null) {
            this.appletSchemeCallBack = iAppletSchemeCallBack;
        }
        handlerSchemeRequestStart();
        AppletSchemeRequest appletSchemeRequest = new AppletSchemeRequest(C13008c.m36588n().m36542d());
        if (this.params == null) {
            this.params = getAppletsParamsAndBuildRequest(this.campaignEx);
        }
        if (this.params == null) {
            return;
        }
        if (isRequestTimesMaxPerDay()) {
            handlerSchemeRequestFailed(WX_SCHEME_REQUEST_ERROR_CODE_44993, "get wxscheme failed : request times is max");
        } else {
            this.lastRequestType = i;
            appletSchemeRequest.get(1, C13121d.m37226h().f36020b, this.params, new DefaultAppletSchemeResponse(this), "applets_model", 60000L);
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public void setUserClick(boolean z) {
        this.isUserClick = z;
    }
}
