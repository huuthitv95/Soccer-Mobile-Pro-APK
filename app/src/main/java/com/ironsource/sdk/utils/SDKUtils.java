package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.C11455Gb;
import com.ironsource.C11720Vd;
import com.ironsource.C11744X3;
import com.ironsource.C12162e4;
import com.ironsource.C12317m4;
import com.ironsource.C12386n8;
import com.ironsource.C12601x8;
import com.ironsource.InterfaceC12582w7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class SDKUtils {

    /* JADX INFO: renamed from: a */
    private static final String f32399a = "SDKUtils";

    /* JADX INFO: renamed from: b */
    private static String f32400b = null;

    /* JADX INFO: renamed from: c */
    private static String f32401c = null;

    /* JADX INFO: renamed from: d */
    private static String f32402d = null;

    /* JADX INFO: renamed from: e */
    private static String f32403e = null;

    /* JADX INFO: renamed from: f */
    private static int f32404f = 0;

    /* JADX INFO: renamed from: g */
    private static String f32405g = null;

    /* JADX INFO: renamed from: h */
    private static Map<String, String> f32406h = null;

    /* JADX INFO: renamed from: i */
    private static String f32407i = "";

    /* JADX INFO: renamed from: j */
    private static final AtomicInteger f32408j = new AtomicInteger(1);

    /* JADX INFO: renamed from: com.ironsource.sdk.utils.SDKUtils$a */
    class DialogInterfaceOnClickListenerC12516a implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC12516a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m33648a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = f32408j;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static int convertDpToPx(int i) {
        return (int) TypedValue.applyDimension(0, i, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static boolean copyFileFromBundleToStorage(Context context, C12601x8 c12601x8) {
        int iSaveFile;
        byte[] bArrM31350a = C12162e4.m31350a(context, c12601x8.getName());
        if (bArrM31350a == null || bArrM31350a.length == 0) {
            return false;
        }
        try {
            iSaveFile = IronSourceStorageUtils.saveFile(bArrM31350a, c12601x8.getPath());
        } catch (Exception e) {
            IronLog.INTERNAL.error("exception: " + e.getMessage());
            iSaveFile = 0;
        }
        if (iSaveFile != 0) {
            return true;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c12601x8.getName());
        return false;
    }

    public static int dpToPx(long j) {
        return (int) ((j * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static byte[] encrypt(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e = e;
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            } catch (NoSuchAlgorithmException e2) {
                e = e2;
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            messageDigest = null;
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static String fetchDemandSourceId(C11720Vd c11720Vd) {
        return fetchDemandSourceId(c11720Vd.m27753a());
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e) {
                    C12317m4.m32153d().m32155a(e);
                    Logger.m33642i(f32399a, "flatMapToJsonAsStringfailed " + e.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z) {
        return z ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f32400b;
    }

    public static String getControllerConfig() {
        return f32405g;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        if (TextUtils.isEmpty(f32403e)) {
            return !TextUtils.isEmpty(f32402d) ? f32402d : "";
        }
        return f32403e;
    }

    public static int getDebugMode() {
        return f32404f;
    }

    public static String getFileName(String str) {
        String[] strArrSplit = str.split(File.separator);
        try {
            return URLEncoder.encode(strArrSplit[strArrSplit.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f32406h;
    }

    public static String getLimitAdTracking() {
        return f32401c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e) {
            C12317m4.m32153d().m32155a(e);
            throw new RuntimeException(e);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(C11744X3.d.f26224b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(C11744X3.a.f26165b);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    public static JSONObject getNetworkFeatureConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectOptJSONObject = getNetworkConfiguration().optJSONObject(C11744X3.a.f26185v);
            return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject : jSONObject;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public static JSONObject getOrientation(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(interfaceC12582w7Mo25842a.mo27869A(context)));
            return jSONObject;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    public static C12386n8.e getProductType(String str) {
        C12386n8.e eVar = C12386n8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C12386n8.e eVar2 = C12386n8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "9.3.0";
    }

    public static String getTesterParameters() {
        return f32407i;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity) || (activity instanceof InlineStoreActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        String strMo27878J = interfaceC12582w7Mo25842a.mo27878J(context);
        String strMo27894c = interfaceC12582w7Mo25842a.mo27894c(context);
        if (!TextUtils.isEmpty(strMo27878J)) {
            f32400b = strMo27878J;
        }
        if (TextUtils.isEmpty(strMo27894c)) {
            return;
        }
        f32401c = strMo27894c;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap map = new HashMap();
        if (mapArr != null) {
            for (Map<String, String> map2 : mapArr) {
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
        }
        return map;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j) {
        return (int) ((j / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f32405g = str;
        C11455Gb.m25885O().mo25782y().mo32063a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f32402d = str;
    }

    public static void setCustomControllerUrl(String str) {
        f32403e = str;
    }

    public static void setDebugMode(int i) {
        f32404f = i;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f32406h = map;
    }

    public static void setTesterParameters(String str) {
        f32407i = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new DialogInterfaceOnClickListenerC12516a()).show();
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(f32405g);
            jSONObject2.put(str, jSONObject);
            f32405g = jSONObject2.toString();
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            Logger.m33642i(f32399a, "Unable to update controllerConfigs: " + e.toString());
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C12317m4.m32153d().m32155a(e);
            Logger.m33638d(f32399a, "Failed decoding string " + e.getMessage());
            return "";
        }
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    public static String translateDeviceOrientation(int i) {
        if (i == 1) {
            return C11744X3.i.f26322D;
        }
        if (i == 2) {
            return C11744X3.i.f26320C;
        }
        return "none";
    }

    public static String translateOrientation(int i) {
        if (i == 1) {
            return C11744X3.i.f26322D;
        }
        if (i == 2) {
            return C11744X3.i.f26320C;
        }
        return "none";
    }

    public static String translateRequestedOrientation(int i) {
        if (i == 0) {
            return C11744X3.i.f26320C;
        }
        if (i == 1) {
            return C11744X3.i.f26322D;
        }
        if (i == 11) {
            return C11744X3.i.f26320C;
        }
        if (i == 12) {
            return C11744X3.i.f26322D;
        }
        switch (i) {
            case 6:
            case 8:
                return C11744X3.i.f26320C;
            case 7:
            case 9:
                return C11744X3.i.f26322D;
            default:
                return "none";
        }
    }
}
