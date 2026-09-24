package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11341A5;
import com.ironsource.C11676T3;
import com.ironsource.C11744X3;
import com.ironsource.C11794a2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.entity.C13069c;
import com.mbridge.msdk.foundation.entity.C13072f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13019i;
import com.mbridge.msdk.foundation.p289db.middle.C13024a;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.v0 */
/* JADX INFO: compiled from: SameTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13229v0 extends C13234y {

    /* JADX INFO: renamed from: a */
    private static int f36394a = 1;

    /* JADX INFO: renamed from: b */
    private static volatile Boolean f36395b;

    /* JADX INFO: renamed from: c */
    private static final Pattern f36396c = Pattern.compile("[一-龥]");

    /* JADX INFO: renamed from: d */
    private static Map<String, String> f36397d;

    /* JADX INFO: renamed from: e */
    private static Map<String, String> f36398e;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.v0$a */
    /* JADX INFO: compiled from: SameTool.java */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ImageView f36399a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36400b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC13083a f36401c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f36402d;

        a(ImageView imageView, CampaignEx campaignEx, InterfaceC13083a interfaceC13083a, int i) {
            this.f36399a = imageView;
            this.f36400b = campaignEx;
            this.f36401c = interfaceC13083a;
            this.f36402d = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                C13229v0.m37895a(this.f36400b, this.f36401c, this.f36402d, (String) this.f36399a.getTag());
            } catch (Exception e) {
                C13219q0.m37816b("SameTools", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.v0$b */
    /* JADX INFO: compiled from: SameTool.java */
    class b implements IDatabaseOpenHelper {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
        public SQLiteDatabase getReadableDatabase() {
            return C13017g.m36693a(C13008c.m36588n().m36542d()).m36691c();
        }

        @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            return C13017g.m36693a(C13008c.m36588n().m36542d()).m36692d();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.v0$c */
    /* JADX INFO: compiled from: SameTool.java */
    class c implements ILogger {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.download.utils.ILogger
        public void log(String str, String str2) {
            C13219q0.m37813a(str, str2);
        }

        @Override // com.mbridge.msdk.foundation.download.utils.ILogger
        public void log(String str, Exception exc) {
            C13219q0.m37813a(str, exc.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m37875a(int i) {
        if ((i > 100 && i < 199) || i == 2) {
            return 1;
        }
        if ((i <= 200 || i >= 299) && i != 4) {
            return (i <= 500 || i >= 599) ? -1 : 5;
        }
        return 2;
    }

    /* JADX INFO: renamed from: a */
    public static String m37887a(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                HashMap map = new HashMap();
                map.put(str2, str3);
                return m37888a(str, map);
            }
            return str;
        } catch (Exception e) {
            C13219q0.m37816b("SameTools", e.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m37901b(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            PackageInfo currentWebViewPackage = Build.VERSION.SDK_INT >= 26 ? WebView.getCurrentWebViewPackage() : context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            if (currentWebViewPackage == null || TextUtils.isEmpty(currentWebViewPackage.versionName) || !currentWebViewPackage.versionName.equals("77.0.3865.92")) {
                return c13635gM39718d.m39400D0();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m37911c(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static float m37918d(Context context) {
        if (context != null) {
            try {
                float f = context.getResources().getDisplayMetrics().density;
                if (f == 0.0f) {
                    return 2.5f;
                }
                return f;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 2.5f;
    }

    /* JADX INFO: renamed from: e */
    public static DisplayMetrics m37925e(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m37927f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m37925e(context).heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m37930g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m37925e(context).widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m37933h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m37936i(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public static float m37939j(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: k */
    public static int m37942k(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m37944l(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m37947m(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("SameTools", "isNetworkAvailable", e);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m37949n(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && C11676T3.f25719b.equals(activeNetworkInfo.getTypeName().toLowerCase(Locale.US));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static <T extends String> boolean m37941j(T t) {
        return t != null && t.length() > 0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m37940j() {
        try {
            if (C13008c.m36588n().m36542d() == null) {
                return false;
            }
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = C11794a2.f26725f;
            }
            int i = Integer.parseInt(property2);
            C13219q0.m37813a("address = ", property + "~");
            C13219q0.m37813a("port = ", i + "~");
            return (TextUtils.isEmpty(property) || i == -1) ? false : true;
        } catch (Throwable th) {
            C13219q0.m37816b("SameTools", th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m37928f(String str) {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", null).invoke(C13211m0.m37739d(str), null)).intValue();
        } catch (Throwable th) {
            C13219q0.m37816b("SameTools", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m37931g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, C13008c.m36588n().m36542d(), str);
        } catch (ClassNotFoundException e) {
            C13219q0.m37816b("SameTools", e.getMessage());
            return null;
        } catch (IllegalAccessException e2) {
            C13219q0.m37816b("SameTools", e2.getMessage());
            return null;
        } catch (NoSuchMethodException e3) {
            C13219q0.m37816b("SameTools", e3.getMessage());
            return null;
        } catch (InvocationTargetException e4) {
            C13219q0.m37816b("SameTools", e4.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m37935h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_CAN_ANIM);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter.equals("1");
                }
            }
            return false;
        } catch (Exception e) {
            C13219q0.m37816b("SameTools", e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX INFO: renamed from: i */
    public static boolean m37938i(String str) {
        int i;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        try {
            if (zIsEmpty) {
                return false;
            }
            try {
                try {
                    Uri uri = Uri.parse(str);
                    if (uri == null) {
                        return false;
                    }
                    String queryParameter = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW);
                    if (TextUtils.isEmpty(queryParameter)) {
                        zIsEmpty = false;
                    } else {
                        try {
                            i = Integer.parseInt(queryParameter);
                        } catch (Exception unused) {
                            i = -1;
                        }
                        if (i % 2 == 0) {
                            zIsEmpty = true;
                        } else {
                            zIsEmpty = false;
                        }
                    }
                    try {
                        if (TextUtils.isEmpty(uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP))) {
                            return zIsEmpty;
                        }
                        return true;
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    zIsEmpty = false;
                }
            } catch (Throwable unused2) {
                return false;
            }
            C13219q0.m37816b("SameTools", e.getMessage());
            return false;
        } catch (Throwable unused3) {
            return zIsEmpty;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m37945l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(MBridgeConstans.ENDCARD_URL_IS_PLAYABLE);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter.equals("0");
                }
            }
            return false;
        } catch (Exception e) {
            C13219q0.m37816b("SameTools", e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static double m37946m(String str) {
        try {
            return !TextUtils.isEmpty(str) ? Double.parseDouble(str) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } catch (Exception e) {
            e.printStackTrace();
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m37921d(String str) {
        String str2 = C13008c.m36588n().m36533b() + "_" + str;
        Map<String, String> map = f36398e;
        if (map == null || !map.containsKey(str2)) {
            return null;
        }
        return f36398e.get(str2);
    }

    /* JADX INFO: renamed from: k */
    public static <T extends String> boolean m37943k(T t) {
        return t == null || t.length() == 0;
    }

    /* JADX INFO: renamed from: a */
    public static String m37888a(String str, Map<String, String> map) {
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                StringBuilder sb = new StringBuilder(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        String value = entry.getValue();
                        if (str.contains(entry.getKey())) {
                            if (value.equals("0")) {
                                sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", ""));
                            } else {
                                sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", entry.getKey() + entry.getValue()));
                            }
                        } else if (!value.equals("0")) {
                            sb.append(entry.getKey() + entry.getValue());
                        }
                    }
                }
                return sb.toString();
            }
            return str;
        } catch (Exception e) {
            C13219q0.m37816b("SameTools", e.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m37914c(String str) {
        ConcurrentHashMap<String, C13069c> concurrentHashMapM37110c;
        List<String> listM36794c;
        if (TextUtils.isEmpty(str) || (concurrentHashMapM37110c = C13091b.m37110c(str)) == null || concurrentHashMapM37110c.size() <= 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (C13069c c13069c : concurrentHashMapM37110c.values()) {
            if (c13069c != null && m37897a(c13069c.m36799e(), c13069c.m36800f()) && (listM36794c = c13069c.m36794c()) != null && listM36794c.size() > 0) {
                arrayList.addAll(listM36794c);
            }
        }
        if (arrayList.size() <= 0) {
            return "";
        }
        HashSet hashSet = new HashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        return arrayList.toString();
    }

    /* JADX INFO: renamed from: n */
    public static BitmapDrawable m37948n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapDecodeByteArray);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                return bitmapDrawable;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m37920d() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th) {
            th.printStackTrace();
            str = "";
        }
        if (!C13182a1.m37596a(str)) {
            return str;
        }
        return System.currentTimeMillis() + "";
    }

    /* JADX INFO: renamed from: f */
    public static void m37929f() {
        try {
            HandlerThread handlerThread = new HandlerThread("mb_db_thread");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            MBDownloadConfig.Builder builder = new MBDownloadConfig.Builder();
            builder.setDatabaseHandler(handler);
            builder.setDatabaseOpenHelper(new b());
            builder.setLogger(new c());
            MBDownloadManager.getInstance().initialize(C13008c.m36588n().m36542d(), builder.build(), new ResourceConfig.Builder().setMaxStorageSpace(100L).setMaxStorageTime(259200000L).build());
        } catch (Throwable th) {
            C13219q0.m37816b("SameTools", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final synchronized String m37926e(String str) {
        boolean zM39403E0;
        int iMax;
        boolean zM39424L0;
        JSONObject jSONObject;
        Map<String, String> map;
        try {
            String str2 = C13008c.m36588n().m36533b() + "_" + str;
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d != null) {
                zM39403E0 = c13635gM39718d.m39403E0();
                zM39424L0 = c13635gM39718d.m39424L0();
                iMax = Math.max(0, c13635gM39718d.m39505f0());
            } else {
                zM39403E0 = true;
                iMax = 3;
                zM39424L0 = false;
            }
            if (zM39424L0 && iMax != 0) {
                if (zM39403E0 && (map = f36397d) != null && map.containsKey(str2)) {
                    return f36397d.get(str2);
                }
                StringBuilder sb = new StringBuilder("");
                StackTraceElement[] stackTrace = new Exception().getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    List<String> listM37891a = m37891a(stackTrace);
                    Collections.reverse(listM37891a);
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : listM37891a) {
                        if (!str3.startsWith(MBridgeConstans.APPLICATION_STACK_COM_ANDROID) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_OS) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_APP) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_REFLECT_METHOD) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_VIEW) && !arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                    int iMin = Math.min(arrayList.size(), iMax);
                    if (iMin > 0) {
                        for (int i = 0; i < iMin; i++) {
                            sb.append((String) arrayList.get(i));
                            if (i < iMin - 1) {
                                sb.append("|");
                            }
                        }
                    }
                    if (TextUtils.isEmpty(sb.toString())) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject();
                        jSONObject.put("1", sb.toString());
                    }
                    if (jSONObject != null && jSONObject.length() > 0) {
                        String strM37593b = C13180a.m37593b(jSONObject.toString());
                        if (zM39403E0 && !TextUtils.isEmpty(strM37593b)) {
                            if (f36397d == null) {
                                f36397d = new HashMap();
                            }
                            f36397d.put(str2, strM37593b);
                        }
                        return strM37593b;
                    }
                    return "";
                }
                return "";
            }
            return "";
        } catch (Exception e) {
            C13219q0.m37816b("SameTools", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m37903b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW);
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = uri.getQueryParameter("view");
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        return Integer.parseInt(queryParameter);
                    } catch (Exception unused) {
                    }
                }
            }
            return -1;
        } catch (Exception e) {
            C13219q0.m37816b("SameTools", e.getMessage());
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0014 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    /* JADX WARN: Code duplicated, block: B:14:0x0018 A[Catch: all -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x000b, B:14:0x0018), top: B:24:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: d */
    public static synchronized int m37919d(Context context, String str) {
        ?? M37898a;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    M37898a = m37898a(str, context);
                } catch (Exception unused) {
                    M37898a = 3;
                }
            } else if (context == null) {
                M37898a = 5;
            } else if (TextUtils.isEmpty(str)) {
                M37898a = 2;
            } else {
                M37898a = 4;
            }
        } else if (context == null) {
            M37898a = 5;
        } else if (TextUtils.isEmpty(str)) {
            M37898a = 2;
        } else {
            M37898a = 4;
        }
        throw th;
        return M37898a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m37934h() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m37932g() {
        if (TextUtils.isEmpty(C13008c.m36588n().m36551j())) {
            return false;
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
            return true;
        } catch (ClassNotFoundException e) {
            C13219q0.m37816b("SameTools", e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m37922d(String str, String str2) {
        if (f36398e == null) {
            f36398e = new HashMap();
        }
        f36398e.put(C13008c.m36588n().m36533b() + "_" + str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static final String m37913c() {
        return MIMManager.m37565b().m37584d();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized boolean m37915c(Context context, String str) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                return m37898a(str, context);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m37917c(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                try {
                    Uri uri = Uri.parse(str2);
                    if (uri != null && !TextUtils.isEmpty(uri.getQueryParameter(str))) {
                        return true;
                    }
                } catch (Exception e) {
                    C13219q0.m37816b("SameTools", e.getMessage());
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m37937i() {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager connectivityManagerM37705a = C13201h0.m37705a();
            if (connectivityManagerM37705a == null || (networkInfo = connectivityManagerM37705a.getNetworkInfo(17)) == null) {
                return false;
            }
            return networkInfo.isConnected();
        } catch (Exception e) {
            C13219q0.m37816b("SameTools", e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m37884a(String str) {
        try {
            if (C13182a1.m37597b(str)) {
                return URLEncoder.encode(str, C11341A5.f23802O);
            }
            return "";
        } catch (Throwable th) {
            C13219q0.m37817b("SameTools", th.getMessage(), th);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37894a(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        try {
            imageView.setImageResource(0);
            imageView.setImageDrawable(null);
            imageView.setImageURI(null);
            imageView.setImageBitmap(null);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m37904b(int i) {
        String[] strArrM36736a;
        try {
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            JSONArray jSONArray = new JSONArray();
            if (c13635gM39718d != null && c13635gM39718d.m39535m() == 1 && (strArrM36736a = C13024a.m36730b().m36736a()) != null) {
                int length = strArrM36736a.length;
                for (int i2 = (length <= i || i == 0) ? 0 : length - i; i2 < length; i2++) {
                    jSONArray.put(strArrM36736a[i2]);
                }
            }
            return jSONArray.length() > 0 ? m37889a(jSONArray) : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m37916c(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                return campaignEx.getRetarget_offer() == 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static final void m37892a(int i, ImageView imageView, CampaignEx campaignEx, Context context, boolean z, InterfaceC13083a interfaceC13083a) {
        if (imageView == null || campaignEx == null) {
            return;
        }
        C13219q0.m37813a("configPrivacyButton", "configPrivacyButton");
        boolean z2 = campaignEx.getPrivacyButtonTemplateVisibility() == 0;
        C13219q0.m37813a("configPrivacyButton", "privacyButtonVisibilityGone: " + z2 + " isIgnoreCampaignPrivacyConfig: " + z);
        if (!z && z2) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e) {
                C13219q0.m37816b("SameTools", e.getMessage());
                return;
            }
        }
        if (TextUtils.isEmpty(m37883a(campaignEx))) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e2) {
                C13219q0.m37816b("SameTools", e2.getMessage());
                return;
            }
        }
        try {
            imageView.setVisibility(0);
        } catch (Exception e3) {
            C13219q0.m37816b("SameTools", e3.getMessage());
        }
        imageView.setOnClickListener(new a(imageView, campaignEx, interfaceC13083a, i));
    }

    /* JADX INFO: renamed from: c */
    public static int m37912c(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m37908b(Context context, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            if (c13635gM39718d != null && c13635gM39718d.m39535m() == 1) {
                C13219q0.m37818c("SameTools", "fqci cfc:" + c13635gM39718d.m39535m());
                String[] strArrM36736a = C13024a.m36730b().m36736a();
                if (strArrM36736a != null) {
                    for (String str2 : strArrM36736a) {
                        C13219q0.m37818c("SameTools", "cfc campaignIds:" + strArrM36736a);
                        jSONArray.put(str2);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static String m37883a(CampaignEx campaignEx) {
        C13635g c13635gM39718d;
        CampaignEx.C13064a adchoice;
        String privacyUrl = "";
        if (campaignEx != null) {
            try {
                privacyUrl = campaignEx.getPrivacyUrl();
            } catch (Exception e) {
                C13219q0.m37816b("SameTools", e.getMessage());
                return privacyUrl;
            }
        }
        if (TextUtils.isEmpty(privacyUrl) && campaignEx != null && (adchoice = campaignEx.getAdchoice()) != null) {
            privacyUrl = adchoice.m36760h();
        }
        if (TextUtils.isEmpty(privacyUrl) && (c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b())) != null) {
            privacyUrl = c13635gM39718d.m39479c();
        }
        return TextUtils.isEmpty(privacyUrl) ? C13121d.m37226h().f36030g : privacyUrl;
    }

    /* JADX INFO: renamed from: b */
    public static int m37900b() {
        int i = f36394a;
        f36394a = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m37909b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return !TextUtils.isEmpty(campaignEx.getDeepLinkURL());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m37910b(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m37907b(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String strOptString = jSONArray.optString(i);
                        if (C13182a1.m37597b(strOptString)) {
                            arrayList.add(strOptString);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable th) {
                C13219q0.m37817b("SameTools", th.getMessage(), th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m37895a(CampaignEx campaignEx, InterfaceC13083a interfaceC13083a, int i, String str) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str2 = campaignEx.getCampaignUnitId() + "_" + i;
            C13084b.m37036b().m37054d(str2);
            C13084b.m37036b().m37046a(str2, campaignEx);
            C13084b.m37036b().m37047a(str2, interfaceC13083a);
            C13084b.m37036b().m37040a(str2, i);
            C13084b.m37036b().m37049a(str2, str);
            C13084b.m37036b().m37052b(str2).m37090p();
        } catch (Throwable th) {
            C13219q0.m37817b("SameTools", "feedback error", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m37902b(Context context, float f) {
        float f2 = 2.5f;
        if (context != null) {
            try {
                float f3 = context.getResources().getDisplayMetrics().density;
                if (f3 != 0.0f) {
                    f2 = f3;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static String m37906b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject(C11744X3.i.f26328G);
                if (jSONObject2 != null) {
                    if (jSONObject2.has(str2)) {
                        if (str3.equals("0")) {
                            jSONObject2.remove(str2);
                        } else {
                            jSONObject2.put(str2, str3);
                        }
                    } else if (!str3.equals("0")) {
                        jSONObject2.put(str2, str3);
                    }
                    return jSONObject.toString();
                }
            } catch (Exception e) {
                C13219q0.m37816b("SameTools", e.getMessage());
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static int m37923e() {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable th) {
            C13219q0.m37816b("SameTools", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m37876a(Context context, float f) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: e */
    public static int m37924e(String str, String str2) {
        return m37878a(str, str2, 0);
    }

    /* JADX INFO: renamed from: a */
    public static double m37873a(Double d) {
        try {
            String str = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d);
            return C13182a1.m37597b(str) ? Double.parseDouble(str) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } catch (Exception e) {
            e.printStackTrace();
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m37905b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                byte[] bArr = new byte[32];
                byte[] bArr2 = new byte[12];
                byte[] bArrDigest = MessageDigest.getInstance("SHA-384").digest(str2.getBytes("UTF-8"));
                System.arraycopy(bArrDigest, 0, bArr, 0, 32);
                System.arraycopy(bArrDigest, 32, bArr2, 0, 12);
                return C13183b.m37600b(str, bArr, bArr2);
            } catch (Exception e) {
                C13219q0.m37817b("SameTools", "AES 加密失败: " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static long m37879a(File file) throws Exception {
        long jAvailable = 0;
        FileInputStream fileInputStream = null;
        try {
            if (file.exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    jAvailable = fileInputStream2.available();
                    fileInputStream = fileInputStream2;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                    }
                    return jAvailable;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } else {
                file.createNewFile();
            }
            if (fileInputStream == null) {
                return jAvailable;
            }
        } catch (Exception unused3) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileInputStream.close();
        } catch (Exception unused4) {
        }
        return jAvailable;
    }

    /* JADX INFO: renamed from: a */
    public static String m37889a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        int iM39450X = c13635gM39718d.m39450X();
        if (jSONArray.length() > iM39450X) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < iM39450X; i++) {
                try {
                    jSONArray2.put(jSONArray.get(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return jSONArray2.toString();
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m37881a(Context context, String str) {
        String strM37889a = "";
        try {
            JSONArray jSONArrayM37908b = m37908b(context, str);
            if (jSONArrayM37908b.length() > 0) {
                strM37889a = m37889a(jSONArrayM37908b);
            }
            C13219q0.m37818c("SameTools", "get excludes:" + strM37889a);
            return strM37889a;
        } catch (Exception e) {
            e.printStackTrace();
            return strM37889a;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m37897a(long j, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > 0) {
            return j2 + (j * 1000) >= jCurrentTimeMillis;
        }
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        return j2 + (c13635gM39718d.m39486c0() * 1000) >= jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: a */
    public static final int m37874a() {
        if (f36395b == null) {
            try {
                f36395b = MIMManager.m37565b().m37585e();
            } catch (Exception e) {
                C13219q0.m37816b("SameTools", e.getMessage());
            }
        }
        if (f36395b != null) {
            return f36395b.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m37882a(Context context, String str, String str2) {
        StringBuilder sb;
        sb = new StringBuilder(str2);
        try {
            sb.append(m37885a(str2, context, str));
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0025
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: a */
    private static synchronized java.lang.String m37885a(java.lang.String r2, android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.v0> r0 = com.mbridge.msdk.foundation.tools.C13229v0.class
            monitor-enter(r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.util.Set r2 = r2.getQueryParameterNames()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r2 == 0) goto L1b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r2 <= 0) goto L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L2c
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.lang.String r1 = "?rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L2c
        L23:
            r2 = move-exception
            goto L46
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23
        L2c:
            boolean r3 = m37898a(r4, r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L3c
            if (r3 == 0) goto L37
            r3 = 1
            r2.append(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L3c
            goto L40
        L37:
            r3 = 2
            r2.append(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L3c
            goto L40
        L3c:
            r3 = 0
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
        L40:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return r2
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C13229v0.m37885a(java.lang.String, android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    static boolean m37898a(String str, Context context) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && packageManager.getPackageInfo(str, 1) != null) {
                    return true;
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37813a("SameTools", th.getMessage());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m37891a(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                arrayList.add(stackTraceElement.getClassName());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static ImageView m37880a(ImageView imageView, BitmapDrawable bitmapDrawable, DisplayMetrics displayMetrics) {
        try {
            bitmapDrawable.setTargetDensity(displayMetrics);
            imageView.setBackground(bitmapDrawable);
            imageView.setClickable(false);
            imageView.setFocusable(false);
            return imageView;
        } catch (Exception e) {
            e.printStackTrace();
            return imageView;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37893a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37896a(String str, CampaignEx campaignEx, int i) {
        try {
            if (TextUtils.isEmpty(str) || campaignEx == null || C13008c.m36588n().m36542d() == null) {
                return;
            }
            C13019i c13019iM36701a = C13019i.m36701a(C13017g.m36693a(C13008c.m36588n().m36542d()));
            C13072f c13072f = new C13072f();
            c13072f.m36850a(System.currentTimeMillis());
            c13072f.m36853b(str);
            c13072f.m36851a(campaignEx.getId());
            c13072f.m36849a(i);
            c13019iM36701a.m36703a(c13072f);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("SameTools", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37899a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0 || jSONObject.optInt("v", -1) != -1) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static int m37877a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            C13219q0.m37817b("SameTools", th.getMessage(), th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m37878a(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri uri = Uri.parse(str);
                if (uri != null) {
                    String queryParameter = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        return (int) Math.round(Double.valueOf(String.valueOf(queryParameter)).doubleValue());
                    }
                }
            } catch (Exception e) {
                C13219q0.m37816b("SameTools", e.getMessage());
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static String m37886a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                byte[] bArr = new byte[32];
                byte[] bArr2 = new byte[12];
                byte[] bArrDigest = MessageDigest.getInstance("SHA-384").digest(str2.getBytes("UTF-8"));
                System.arraycopy(bArrDigest, 0, bArr, 0, 32);
                System.arraycopy(bArrDigest, 32, bArr2, 0, 12);
                return C13183b.m37598a(str, bArr, bArr2);
            } catch (Exception e) {
                C13219q0.m37817b("SameTools", "AES 加密失败: " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m37890a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2, 0, 1024);
            if (i > 0) {
                byteArrayOutputStream.write(bArr2, 0, i);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
