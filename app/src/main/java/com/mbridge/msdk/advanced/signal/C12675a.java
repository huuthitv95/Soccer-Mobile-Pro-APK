package com.mbridge.msdk.advanced.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.C13079m;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13023m;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.mbsignalcommon.communication.C13374d;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.signal.a */
/* JADX INFO: compiled from: NativeAdvancedJsUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12675a {

    /* JADX INFO: renamed from: a */
    private static String f33577a = "NativeAdvancedJsUtils";

    /* JADX INFO: renamed from: a */
    public static void m34573a(WebView webView) {
        C13219q0.m37816b(f33577a, "fireOnJSBridgeConnected");
        C13392f.m38726a().m38727a(webView);
    }

    /* JADX INFO: renamed from: a */
    public static void m34574a(WebView webView, String str, String str2) {
        C13392f.m38726a().m38728a(webView, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m34575a(WebView webView, String str, String str2, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sq", 1);
            jSONObject.put("action", str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str2, obj);
                jSONObject.put("params", jSONObject2);
            }
            if (TextUtils.isEmpty(str2) && obj != null) {
                jSONObject.put("params", obj);
            }
            C13392f.m38726a().m38728a(webView, "thirdPartyCalled", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            C13219q0.m37816b(f33577a, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m34576a(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, C13374d.f37111b);
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C13219q0.m37813a(f33577a, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m34577a(Object obj, JSONObject jSONObject) {
        JSONArray jSONArray;
        boolean z;
        String str;
        String str2 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("message", "params is null");
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e) {
                C13219q0.m37813a(f33577a, e.getMessage());
                return;
            }
        }
        try {
            try {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
                jSONObject2.put("message", "");
                JSONArray jSONArray2 = jSONObject.getJSONArray("resource");
                if (jSONArray2 == null || jSONArray2.length() <= 0) {
                    try {
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                        jSONObject2.put("message", "resource is null");
                        C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    } catch (JSONException e2) {
                        C13219q0.m37813a(f33577a, e2.getMessage());
                        return;
                    }
                }
                JSONArray jSONArray3 = new JSONArray();
                int length = jSONArray2.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    String strOptString = jSONObject3.optString("ref", str2);
                    int i3 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i3 != i || TextUtils.isEmpty(strOptString)) {
                        str2 = str2;
                        jSONArray = jSONArray2;
                        length = length;
                        z = false;
                        if (i3 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put("path", H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? str2 : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                            jSONObject4.put(strOptString, jSONObject5);
                            jSONArray3.put(jSONObject4);
                        } else if (i3 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                File file = new File(strOptString);
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    C13219q0.m37813a(f33577a, "getFileInfo Mraid file " + strOptString);
                                    str = "file:////" + strOptString;
                                } else {
                                    str = str2;
                                }
                            } catch (Throwable th) {
                                C13219q0.m37816b(f33577a, th.getMessage());
                            }
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 3);
                            jSONObject6.put("path", str);
                            jSONObject4.put(strOptString, jSONObject6);
                            jSONArray3.put(jSONObject4);
                        } else if (i3 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put("path", C13227u0.m37853a(strOptString) == null ? str2 : C13227u0.m37853a(strOptString));
                            jSONObject4.put(strOptString, jSONObject7);
                            jSONArray3.put(jSONObject4);
                        }
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        C13079m c13079mM36727b = C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36727b(strOptString);
                        if (c13079mM36727b != null) {
                            jSONArray = jSONArray2;
                            C13219q0.m37813a(f33577a, "VideoBean not null");
                            jSONObject8.put("type", 1);
                            jSONObject8.put("videoDataLength", c13079mM36727b.m36948d());
                            String strM36949e = c13079mM36727b.m36949e();
                            if (TextUtils.isEmpty(strM36949e)) {
                                C13219q0.m37813a(f33577a, "VideoPath null");
                                jSONObject8.put("path", str2);
                                jSONObject8.put("path4Web", str2);
                            } else {
                                C13219q0.m37813a(f33577a, "VideoPath not null");
                                jSONObject8.put("path", strM36949e);
                                jSONObject8.put("path4Web", strM36949e);
                            }
                            if (c13079mM36727b.m36943b() == 5) {
                                jSONObject8.put("downloaded", 1);
                                z = false;
                            } else {
                                z = false;
                                jSONObject8.put("downloaded", 0);
                            }
                            jSONObject4.put(strOptString, jSONObject8);
                            jSONArray3.put(jSONObject4);
                        } else {
                            str2 = str2;
                            jSONArray = jSONArray2;
                            length = length;
                            z = false;
                            C13219q0.m37813a(f33577a, "VideoBean null");
                        }
                    }
                    i2++;
                    jSONArray2 = jSONArray;
                    length = length;
                    str2 = str2;
                    i = 1;
                }
                jSONObject2.put("resource", jSONArray3);
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (Throwable th2) {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("message", th2.getLocalizedMessage());
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
            jSONObject2.put("message", th2.getLocalizedMessage());
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (JSONException e3) {
            C13219q0.m37813a(f33577a, e3.getMessage());
            return;
        }
    }
}
