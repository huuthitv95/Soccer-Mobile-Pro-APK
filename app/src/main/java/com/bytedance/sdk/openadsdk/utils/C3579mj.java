package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3215ik;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.ironsource.C11540L6;
import com.ironsource.mediationsdk.metadata.C12364a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.fid.Constants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3579mj {

    /* JADX INFO: renamed from: ri */
    private static final AtomicReference<Boolean> f13199ri = new AtomicReference<>(null);

    /* JADX INFO: renamed from: lr */
    private static final AtomicReference<String> f13198lr = new AtomicReference<>(null);

    /* JADX INFO: renamed from: di */
    public static PackageInfo m16538di(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : m16556sf(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: di */
    private static boolean m16539di() {
        if (xha()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 7; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (m16548lr()) {
                    String strM16542ik = m16542ik();
                    if (TextUtils.isEmpty(strM16542ik)) {
                        return false;
                    }
                    for (String str : strM16542ik.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: fi */
    public static String m16540fi(Context context) {
        try {
            AtomicReference<String> atomicReference = f13198lr;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoM16538di = m16538di(context);
            String str2 = packageInfoM16538di != null ? packageInfoM16538di.versionName : "";
            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(atomicReference, null, str2);
            return str2;
        } catch (Throwable unused) {
            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(f13198lr, null, "");
            return "";
        }
    }

    /* JADX INFO: renamed from: fi */
    private static boolean m16541fi() {
        if (m16549mj()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 6; i++) {
                    if (lowerCase.contains(strArr[i])) {
                        return true;
                    }
                }
                if (m16548lr()) {
                    String strM16542ik = m16542ik();
                    if (TextUtils.isEmpty(strM16542ik)) {
                        return false;
                    }
                    for (String str : strM16542ik.split(",")) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ik */
    public static String m16542ik() {
        return C3606fi.m16708ri("fold_config", "fold_default", "");
    }

    /* JADX INFO: renamed from: ik */
    public static String m16543ik(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean jbs() {
        if (m16551qt()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 9; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (m16548lr()) {
                    String strM16542ik = m16542ik();
                    if (TextUtils.isEmpty(strM16542ik)) {
                        return false;
                    }
                    for (String str : strM16542ik.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean jbs(Context context) {
        try {
            return Class.forName("io.flutter.embedding.android.FlutterActivity") != null;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    public static int m16544ka(Context context) {
        try {
            return Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager") != null ? 1 : 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ka */
    private static boolean m16545ka() {
        if (m16557sf()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 12; i++) {
                    if (lowerCase.contains(strArr2[i])) {
                        return true;
                    }
                }
            }
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (TextUtils.isEmpty(lowerCase2)) {
                return false;
            }
            for (int i2 = 0; i2 < 12; i2++) {
                if (lowerCase2.contains(strArr[i2])) {
                    return true;
                }
            }
            if (m16548lr()) {
                String strM16708ri = C3606fi.m16708ri("fold_config", "fold_samung", "");
                if (TextUtils.isEmpty(strM16708ri)) {
                    return false;
                }
                for (String str : strM16708ri.split(",")) {
                    if (lowerCase2.contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: lr */
    public static int m16546lr(Context context) {
        if (m16550mj(context)) {
            return 1;
        }
        if (jbs(context)) {
            return 2;
        }
        return m16552qt(context) ? 3 : 4;
    }

    /* JADX INFO: renamed from: lr */
    public static void m16547lr(JSONObject jSONObject, Context context) {
        try {
            if (m16548lr()) {
                String strM13508lr = C3215ik.m13505ri().m13508lr("w_ver", m16540fi(context));
                if (TextUtils.isEmpty(strM13508lr)) {
                    return;
                }
                jSONObject.put("w_ver", strM13508lr);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m16548lr() {
        return C3606fi.m16704ri("fold_config", C12364a.f31324j, 0) == 1;
    }

    /* JADX INFO: renamed from: mj */
    private static boolean m16549mj() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            C2707ac.m10196ik("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: mj */
    private static boolean m16550mj(Context context) {
        try {
            return Class.forName("com.unity3d.player.UnityPlayerActivity") != null;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: qt */
    private static boolean m16551qt() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException e) {
            e = e;
            C2707ac.m10196ik("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (IllegalAccessException e2) {
            e = e2;
            C2707ac.m10196ik("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (NoSuchMethodException e3) {
            e = e3;
            C2707ac.m10196ik("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (InvocationTargetException e4) {
            e = e4;
            C2707ac.m10196ik("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: qt */
    private static boolean m16552qt(Context context) {
        try {
            return Class.forName("com.facebook.react.ReactActivity") != null;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m16553ri() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16554ri(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (m16548lr()) {
                C3215ik c3215ikM13505ri = C3215ik.m13505ri();
                c3215ikM13505ri.m13512ri("w_ver", m16540fi(context));
                c3215ikM13505ri.m13510ri("bp", m16546lr(context));
                c3215ikM13505ri.m13510ri("is_fold", xha(context) ? 1 : 0);
                c3215ikM13505ri.m13512ri("abi", m16553ri());
                c3215ikM13505ri.m13512ri("t_ver", m16543ik(context));
                c3215ikM13505ri.m13510ri(CampaignEx.JSON_KEY_AAB, m16544ka(context));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16555ri(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (m16548lr()) {
                C3215ik c3215ikM13505ri = C3215ik.m13505ri();
                String strM13508lr = c3215ikM13505ri.m13508lr(C11540L6.f25016u, C3304qt.m14669lr().xha());
                if (!TextUtils.isEmpty(strM13508lr)) {
                    jSONObject.put(C11540L6.f25016u, strM13508lr);
                }
                int iM13506lr = c3215ikM13505ri.m13506lr("bp", m16546lr(context));
                if (iM13506lr != 4) {
                    jSONObject.put("bp", iM13506lr);
                }
                String strM13508lr2 = c3215ikM13505ri.m13508lr("t_ver", m16543ik(context));
                if (!TextUtils.isEmpty(strM13508lr2)) {
                    jSONObject.put("t_ver", strM13508lr2);
                }
                jSONObject.put("is_fold", c3215ikM13505ri.m13506lr("is_fold", xha(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, c3215ikM13505ri.m13506lr(CampaignEx.JSON_KEY_AAB, m16544ka(context)));
                String strM13508lr3 = c3215ikM13505ri.m13508lr("abi", m16553ri());
                if (TextUtils.isEmpty(strM13508lr3)) {
                    return;
                }
                jSONObject.put("abi", strM13508lr3);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: sf */
    private static PackageInfo m16556sf(Context context) {
        try {
            String str = Build.VERSION.SDK_INT <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", null).invoke(null, null) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: sf */
    private static boolean m16557sf() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD")) || "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C2707ac.m10196ik("PAG_BANNER", "get ss fold device error: " + e.getMessage());
            return false;
        }
    }

    private static boolean xha() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th) {
            C2707ac.m10196ik("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean xha(Context context) {
        boolean zJbs;
        boolean z;
        byte b;
        try {
            AtomicReference<Boolean> atomicReference = f13199ri;
            Boolean bool = atomicReference.get();
            if (bool != null) {
                return bool.booleanValue();
            }
            String lowerCase = Build.BRAND;
            if (!TextUtils.isEmpty(lowerCase)) {
                lowerCase = lowerCase.toLowerCase();
            }
            String lowerCase2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(lowerCase2)) {
                lowerCase2 = lowerCase2.toLowerCase();
            }
            if (TextUtils.isEmpty(lowerCase) && TextUtils.isEmpty(lowerCase2)) {
                LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(atomicReference, null, Boolean.FALSE);
                return false;
            }
            byte b2 = -1;
            if (TextUtils.isEmpty(lowerCase)) {
                zJbs = false;
                z = false;
            } else {
                switch (lowerCase.hashCode()) {
                    case -759499589:
                        if (!lowerCase.equals(com.adjust.sdk.Constants.REFERRER_API_XIAOMI)) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 3418016:
                        if (!lowerCase.equals("oppo")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case 3620012:
                        if (!lowerCase.equals(com.adjust.sdk.Constants.REFERRER_API_VIVO)) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase.equals(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG)) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    zJbs = jbs();
                } else if (b == 1) {
                    zJbs = m16539di();
                } else if (b == 2) {
                    zJbs = m16541fi();
                } else if (b != 3) {
                    zJbs = false;
                    z = true;
                } else {
                    zJbs = m16545ka();
                }
                z = false;
            }
            if (z && !TextUtils.isEmpty(lowerCase2)) {
                switch (lowerCase2.hashCode()) {
                    case -759499589:
                        if (lowerCase2.equals(com.adjust.sdk.Constants.REFERRER_API_XIAOMI)) {
                            b2 = 2;
                        }
                        break;
                    case 3418016:
                        if (lowerCase2.equals("oppo")) {
                            b2 = 0;
                        }
                        break;
                    case 3620012:
                        if (lowerCase2.equals(com.adjust.sdk.Constants.REFERRER_API_VIVO)) {
                            b2 = 1;
                        }
                        break;
                    case 1864941562:
                        if (lowerCase2.equals(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG)) {
                            b2 = 3;
                        }
                        break;
                }
                if (b2 == 0) {
                    zJbs = jbs();
                } else if (b2 == 1) {
                    zJbs = m16539di();
                } else if (b2 != 2) {
                    zJbs = b2 != 3 ? false : m16545ka();
                } else {
                    zJbs = m16541fi();
                }
            }
            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(atomicReference, null, Boolean.valueOf(zJbs));
            return zJbs;
        } catch (Throwable unused) {
            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(f13199ri, null, Boolean.FALSE);
            return false;
        }
    }
}
