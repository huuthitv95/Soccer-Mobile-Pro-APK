package com.fyber.inneractive.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.C11744X3;
import com.vungle.ads.internal.protos.Sdk;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.o */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9174o {

    /* JADX INFO: renamed from: a */
    public static Application f21470a;

    /* JADX INFO: renamed from: a */
    public static int m21987a(float f) {
        return (int) (TypedValue.applyDimension(1, f, IAConfigManager.f17654M.f17689u.m20436a().getResources().getDisplayMetrics()) + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public static int m21988a(int i) {
        return Math.round(((IAConfigManager.f17654M.f17689u.m20436a().getResources().getConfiguration().densityDpi / 160.0f) * i) + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public static Context m21989a(View view) {
        return view != null ? view.getContext() : f21470a;
    }

    /* JADX INFO: renamed from: a */
    public static String m21990a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr.length <= 0) {
                return "";
            }
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(signature.toByteArray());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m21991a(ArrayList arrayList) {
        return Build.VERSION.SDK_INT >= 26 ? UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) ",", (Iterable) arrayList) : TextUtils.join(",", arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static void m21992a() {
    }

    /* JADX INFO: renamed from: a */
    public static void m21993a(Context context, byte[] bArr) {
        FileOutputStream fileOutputStreamOpenFileOutput;
        try {
            fileOutputStreamOpenFileOutput = context.openFileOutput("session_details.json", 0);
            try {
                fileOutputStreamOpenFileOutput.write(bArr);
                fileOutputStreamOpenFileOutput.flush();
            } catch (Throwable unused) {
                try {
                    IAlog.m21945a("writeFileWithContext failed writing %s", "session_details.json");
                } finally {
                    AbstractC9195v.m22028a(fileOutputStreamOpenFileOutput);
                }
            }
        } catch (Throwable unused2) {
            fileOutputStreamOpenFileOutput = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21994a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (i == 17) {
                layoutParams2.addRule(13);
            } else {
                int i2 = i & 7;
                if (i2 == 1) {
                    layoutParams2.addRule(14);
                } else if (i2 == 3) {
                    layoutParams2.addRule(9);
                } else if (i2 == 5) {
                    layoutParams2.addRule(11);
                }
                int i3 = i & 112;
                if (i3 == 16) {
                    layoutParams2.addRule(15);
                } else if (i3 == 48) {
                    layoutParams2.addRule(10);
                } else if (i3 == 80) {
                    layoutParams2.addRule(12);
                }
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public static void m21995a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21996a(String str) {
        try {
            return f21470a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m21997b() {
        return ((WindowManager) IAConfigManager.f17654M.f17689u.m20436a().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* JADX INFO: renamed from: b */
    public static int m21998b(int i) {
        return (int) (((IAConfigManager.f17654M.f17689u.m20436a().getResources().getConfiguration().densityDpi / 160.0f) * i) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static String m21999b(String str) {
        String string = (String) AbstractC9171n.f21465a.get(str);
        if (!TextUtils.isEmpty(string)) {
            IAlog.m21945a("Assets cache: returning cached assets for %s", str);
            return string;
        }
        IAlog.m21945a("Assets cache: reading file: %s", str);
        try {
            InputStream inputStreamOpen = f21470a.getAssets().open(str, 3);
            StringBuffer stringBuffer = new StringBuffer();
            byte[] bArr = new byte[4096];
            for (int i = 0; i != -1; i = inputStreamOpen.read(bArr)) {
                stringBuffer.append(new String(bArr, 0, i));
            }
            inputStreamOpen.close();
            string = stringBuffer.toString();
            IAlog.m21945a("Assets cache: success - %s", str);
        } catch (IOException e) {
            IAlog.m21945a("Assets cache: Could not read response from file", new Object[0]);
            IAlog.m21949e(AbstractC9195v.m22032b(e), new Object[0]);
        }
        if (!TextUtils.isEmpty(string)) {
            AbstractC9171n.f21465a.put(str, string);
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static int m22000c() {
        Application application = f21470a;
        int i = (application == null || application.getResources() == null || application.getResources().getConfiguration() == null) ? 1 : application.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (Throwable th) {
            IAlog.m21944a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        IAlog.m21945a("The device orientation: %s", i == 1 ? C11744X3.i.f26322D : C11744X3.i.f26320C);
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static int m22001c(int i) {
        try {
            return (int) ((i / (IAConfigManager.f17654M.f17689u.m20436a().getResources().getConfiguration().densityDpi / 160.0f)) + 0.5f);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m22002d() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        if (f21470a == null || (windowManager = (WindowManager) IAConfigManager.f17654M.f17689u.m20436a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        if (i != -1) {
            return i;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.heightPixels;
            }
        } catch (Throwable unused) {
        }
        if (i == -1) {
            return 480;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m22003d(int i) {
        return IAConfigManager.f17654M.f17689u.m20436a().getDrawable(i);
    }

    /* JADX INFO: renamed from: e */
    public static int m22004e() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        try {
            if (f21470a == null || (windowManager = (WindowManager) IAConfigManager.f17654M.f17689u.m20436a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                i = -1;
            } else {
                Point point = new Point();
                defaultDisplay.getSize(point);
                i = point.x;
            }
        } catch (Throwable unused) {
        }
        if (i != -1) {
            return i;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.widthPixels;
            }
        } catch (Throwable unused2) {
        }
        return i == -1 ? Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE : i;
    }

    /* JADX INFO: renamed from: f */
    public static void m22005f() {
    }

    /* JADX INFO: renamed from: g */
    public static void m22006g() {
    }

    /* JADX INFO: renamed from: h */
    public static String m22007h() {
        IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = IAConfigManager.f17654M;
            if (!iAConfigManager.f17692x.f21485a.get() || iAConfigManager.f17692x.f21488d.compareAndSet(true, true) || i >= 25) {
                break;
            }
            IAlog.m21945a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        return iAConfigManager.f17692x.m22016a();
    }
}
