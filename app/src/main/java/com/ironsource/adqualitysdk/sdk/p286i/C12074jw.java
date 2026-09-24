package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jw */
/* JADX INFO: loaded from: classes6.dex */
public final class C12074jw {

    /* JADX INFO: renamed from: ﱟ */
    private static int f29742 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static char f29743 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static int f29744 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static JSONObject f29745;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29746;

    /* JADX INFO: renamed from: ｋ */
    private static int[] f29747;

    /* JADX INFO: renamed from: ﾇ */
    private static JSONObject f29748;

    /* JADX INFO: renamed from: ﾒ */
    private static long f29749;

    /* JADX INFO: renamed from: ﾒ */
    static void m30773() {
        f29747 = new int[]{1806462384, 382900703, 868242938, -1142661993, -1475322336, 1913652678, 2066494180, 477164239, 490369141, -957594486, 1464441310, 1834549837, 1421156357, -435009121, -289531158, -1466570317, -175883408, 762834003};
        f29749 = 5217514285152289434L;
        f29746 = 0;
        f29743 = (char) 0;
    }

    static {
        m30773();
        f29745 = null;
        int i = f29742 + 97;
        f29744 = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static String m30761() {
        int i = 2 % 2;
        int i2 = f29744 + 47;
        f29742 = i2 % 128;
        if (i2 % 2 != 0) {
            String str = Build.VERSION.RELEASE;
            throw null;
        }
        String str2 = Build.VERSION.RELEASE;
        int i3 = f29744 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29742 = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30778(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f29744 + 101;
        f29742 = i2 % 128;
        int i3 = i2 % 2;
        try {
            jSONObject.put(m30772(new int[]{-1163314758, 773504044}, 4 - Color.alpha(0)).intern(), m30768());
            int i4 = f29742 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f29744 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r5 <= m30758()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r5 <= m30758()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.p286i.C12074jw.f29744 + 61;
        com.ironsource.adqualitysdk.sdk.p286i.C12074jw.f29742 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m30771(int r4, int r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            if (r4 < 0) goto L41
            int r2 = com.ironsource.adqualitysdk.sdk.p286i.C12074jw.f29742
            int r2 = r2 + 115
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12074jw.f29744 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L3f
            if (r5 < 0) goto L41
            int r2 = m30770()
            if (r4 > r2) goto L41
            int r4 = com.ironsource.adqualitysdk.sdk.p286i.C12074jw.f29744
            int r4 = r4 + 57
            int r2 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12074jw.f29742 = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L2e
            int r4 = m30758()
            r2 = 48
            int r2 = r2 / r1
            if (r5 > r4) goto L41
            goto L34
        L2e:
            int r4 = m30758()
            if (r5 > r4) goto L41
        L34:
            int r4 = com.ironsource.adqualitysdk.sdk.p286i.C12074jw.f29744
            int r4 = r4 + 61
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12074jw.f29742 = r5
            int r4 = r4 % r0
            r4 = 1
            return r4
        L3f:
            r4 = 0
            throw r4
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12074jw.m30771(int, int):boolean");
    }

    /* JADX INFO: renamed from: ﾇ */
    private static int m30770() {
        JSONObject jSONObjectM30768;
        String strM30772;
        int i = 2 % 2;
        int i2 = f29742 + 27;
        f29744 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM30768 = m30768();
            strM30772 = m30772(new int[]{-2058965412, 523668164}, 0 / TextUtils.indexOf("", "", 0, 1));
        } else {
            jSONObjectM30768 = m30768();
            strM30772 = m30772(new int[]{-2058965412, 523668164}, TextUtils.indexOf("", "", 0, 0) + 1);
        }
        return jSONObjectM30768.optInt(strM30772.intern());
    }

    /* JADX INFO: renamed from: ﻐ */
    private static int m30758() {
        int i = 2 % 2;
        int i2 = f29744 + 87;
        f29742 = i2 % 128;
        int i3 = i2 % 2;
        int iOptInt = m30768().optInt(m30767("\uf5de", (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35933), "䊚䤇喙䡨", (ViewConfiguration.getScrollBarSize() >> 8) + 461966094, "\u0e7c褋崛\uf78c").intern());
        int i4 = f29744 + 53;
        f29742 = i4 % 128;
        int i5 = i4 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ｋ */
    private static JSONObject m30768() {
        int i = 2 % 2;
        int i2 = f29742 + 7;
        f29744 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM30816 = C12077jz.m30816(m30756());
        int i4 = f29744 + 51;
        f29742 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return jSONObjectM30816;
    }

    /* JADX INFO: renamed from: ﱡ */
    private static synchronized JSONObject m30756() {
        JSONObject jSONObject;
        int i = 2 % 2;
        int i2 = f29744 + 95;
        f29742 = i2 % 128;
        int i3 = i2 % 2;
        if (f29745 == null) {
            JSONObject jSONObject2 = new JSONObject();
            f29745 = jSONObject2;
            try {
                jSONObject2.put(m30772(new int[]{-2058965412, 523668164}, 1 - View.MeasureSpec.getMode(0)).intern(), -1);
                f29745.put(m30767("\uf5de", (char) (35933 - (ViewConfiguration.getPressedStateDuration() >> 16)), "䊚䤇喙䡨", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 461966095, "\u0e7c褋崛\uf78c").intern(), -1);
            } catch (JSONException unused) {
            }
        }
        jSONObject = f29745;
        int i4 = f29744 + 61;
        f29742 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static synchronized void m30774(Activity activity) {
        int i = 2 % 2;
        if (activity != null) {
            int i2 = f29742 + 103;
            f29744 = i2 % 128;
            if (i2 % 2 == 0) {
                m30764(activity.getApplicationContext());
                Object obj = null;
                super.hashCode();
                throw null;
            }
            m30764(activity.getApplicationContext());
            int i3 = f29744 + 31;
            f29742 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static void m30763(Application application) {
        int i = 2 % 2;
        int i2 = f29744 + 57;
        f29742 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (application != null) {
            m30764(application.getApplicationContext());
        }
        int i3 = f29742 + 95;
        f29744 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static synchronized void m30764(Context context) {
        int i = 2 % 2;
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService(m30767("谖佪繕負뚡泅", (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 3370), "䊚䤇喙䡨", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u1f16ꡡ⫫㤍").intern());
                if (windowManager != null) {
                    int i2 = f29744 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f29742 = i2 % 128;
                    int i3 = i2 % 2;
                    if (Build.VERSION.SDK_INT >= 30) {
                        try {
                            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                            if (bounds != null) {
                                m30762(bounds.height(), bounds.width());
                                return;
                            }
                        } catch (Throwable th) {
                            C12085l.m30922(m30767("쳐ᴌ姞韱ᨠ䙄봕ᵢ䋝\uf174쩞", (char) Color.alpha(0), "䊚䤇喙䡨", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 530178697, "触駢촟䊢").intern(), m30767("얻떱㙫³䳳纗\ue815봛볬릒揝敮⍱吒飋\uf2c4斈㾎㪷騶\udbc3邦ᘁ塶Ͻꈠ耲\uda86ힳ㇎㟄솧씔큡ᆼ귩ꬴ\uea21삆㌌遊祶र䏲炫礀⡻ꪓ", (char) ExpandableListView.getPackedPositionGroup(0L), "䊚䤇喙䡨", AndroidCharacter.getMirror('0') - '0', "팈\ue0c4쑌\udb2c").intern(), th);
                        }
                    }
                }
                Resources resources = context.getResources();
                if (resources != null) {
                    int i4 = f29742 + 1;
                    f29744 = i4 % 128;
                    if (i4 % 2 == 0) {
                        m30765(resources.getDisplayMetrics());
                        int i5 = 72 / 0;
                    } else {
                        m30765(resources.getDisplayMetrics());
                    }
                    int i6 = 2 % 2;
                }
            } catch (Throwable th2) {
                C12085l.m30922(m30767("쳐ᴌ姞韱ᨠ䙄봕ᵢ䋝\uf174쩞", (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "䊚䤇喙䡨", 530178698 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "触駢촟䊢").intern(), m30767("丢ꚦ㗊ຎ瞆뿫櫐ꑞ\ue869锢Ꚕ컲瞎\ue898ᚵ崒邛ዝ\ueaa4䩯喧ᤂ샼၀繖◑\uf1bd伅眻덽䃄뇪ᅃ淍⺙ൠ饽瀡焲琈ကꡋ㕿刪", (char) (35765 - (Process.myTid() >> 22)), "䊚䤇喙䡨", (-1) - Process.getGidForName(""), "ꛘ鼑떥䲋").intern(), th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: ﻛ */
    private static void m30765(DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = f29744 + 95;
        f29742 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
            if (displayMetrics != null) {
                m30762(displayMetrics.heightPixels, displayMetrics.widthPixels);
            }
        } else if (displayMetrics != null) {
            m30762(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
        int i4 = f29744 + 93;
        f29742 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m30762(int i, int i2) {
        int i3 = 2 % 2;
        if (i > 0) {
            int i4 = f29742;
            int i5 = i4 + 79;
            f29744 = i5 % 128;
            if (i5 % 2 == 0) {
                try {
                    int i6 = 76 / 0;
                    if (i2 <= 0) {
                        return;
                    }
                } catch (Throwable th) {
                    C12085l.m30922(m30767("쳐ᴌ姞韱ᨠ䙄봕ᵢ䋝\uf174쩞", (char) View.resolveSizeAndState(0, 0, 0), "䊚䤇喙䡨", 530178697 - View.MeasureSpec.getSize(0), "触駢촟䊢").intern(), m30772(new int[]{-1434806590, -1065022959, -653158062, 768487800, -780007907, -1562297622, 1029949818, 1998984300, 626444476, 2054823275, 1301134364, 677289905, 255189921, -594930555}, TextUtils.getCapsMode("", 0, 0) + 25).intern(), th);
                    return;
                }
            } else if (i2 <= 0) {
                return;
            }
            int i7 = i4 + 81;
            f29744 = i7 % 128;
            int i8 = i7 % 2;
            JSONObject jSONObjectM30756 = m30756();
            jSONObjectM30756.put(m30772(new int[]{-2058965412, 523668164}, -TextUtils.lastIndexOf("", '0', 0, 0)).intern(), i2);
            jSONObjectM30756.put(m30767("\uf5de", (char) (35932 - TextUtils.lastIndexOf("", '0', 0)), "䊚䤇喙䡨", 461966094 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0e7c褋崛\uf78c").intern(), i);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30759(Context context, JSONObject jSONObject) {
        String strIntern;
        boolean z;
        int i = 2 % 2;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(m30767("妟ᱷ亪䟬搾\uec77\uf35a욟", (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "䊚䤇喙䡨", ViewConfiguration.getDoubleTapTimeout() >> 16, "夘ꈳ\udf08睃").intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m30772(new int[]{-1137967570, 93465477}, KeyEvent.keyCodeFromString("") + 4).intern(), memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            jSONObject.put(m30772(new int[]{841014139, 1112061256}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4).intern(), memoryInfo.threshold / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            if (memoryInfo.lowMemory) {
                int i2 = f29744 + 17;
                f29742 = i2 % 128;
                if (i2 % 2 != 0) {
                    strIntern = m30772(new int[]{-1630467812, -1264792049}, 5 << View.resolveSizeAndState(0, 0, 1)).intern();
                    z = memoryInfo.lowMemory;
                } else {
                    strIntern = m30772(new int[]{-1630467812, -1264792049}, 4 - View.resolveSizeAndState(0, 0, 0)).intern();
                    z = memoryInfo.lowMemory;
                }
                jSONObject.put(strIntern, z);
            }
            int i3 = f29744 + 79;
            f29742 = i3 % 128;
            int i4 = i3 % 2;
            jSONObject.put(m30772(new int[]{1153132396, 1226153557}, 4 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Throwable th) {
            String strIntern2 = m30767("쳐ᴌ姞韱ᨠ䙄봕ᵢ䋝\uf174쩞", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), "䊚䤇喙䡨", Color.red(0) + 530178697, "触駢촟䊢").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30767("䶵⹃챉䖀鎐뇎ߢ蒧뉵짩嶒庯䏭ꑭ଼駮ꦟ祍햢\ue2eeꎄ癵\ue9c4Ｅ曫闡ℑᦗ", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29609), "䊚䤇喙䡨", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), "\udad6Ӱ\ua97e쉳").intern());
            sb.append(th.getLocalizedMessage());
            C12085l.m30929(strIntern2, sb.toString());
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30760(JSONObject jSONObject) {
        int i = 2 % 2;
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                int i2 = f29742 + 73;
                f29744 = i2 % 128;
                int i3 = i2 % 2;
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                jSONObject.put(m30772(new int[]{-263742737, -2110963826}, 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), Math.round((totalRxBytes2 - totalRxBytes) * (1000.0f / (jCurrentTimeMillis2 - jCurrentTimeMillis))));
                jSONObject.put(m30767("ᕊ耛ॺ՝", (char) (57430 - Color.green(0)), "䊚䤇喙䡨", View.resolveSizeAndState(0, 0, 0), "ᡤ繊噏峠").intern(), totalRxBytes2);
                int i4 = f29744 + 79;
                f29742 = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Throwable th) {
            C12085l.m30922(m30767("쳐ᴌ姞韱ᨠ䙄봕ᵢ䋝\uf174쩞", (char) KeyEvent.normalizeMetaState(0), "䊚䤇喙䡨", 530178696 - TextUtils.indexOf((CharSequence) "", '0', 0), "触駢촟䊢").intern(), m30772(new int[]{-1434806590, -1065022959, 175667432, -357442578, -780007907, -1562297622, -1668767910, 1714177565, -632462829, -323744180, -1688157833, 2126495203, 1974472061, -156825975, 444903708, 2033675793, 1731332364, 1041589077}, TextUtils.indexOf("", "") + 35).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public static void m30769(JSONObject jSONObject) {
        int i = 2 % 2;
        JSONObject jSONObjectM30755 = m30755();
        if (jSONObjectM30755 != null) {
            int i2 = f29744 + 105;
            f29742 = i2 % 128;
            int i3 = i2 % 2;
            C12077jz.m30802(jSONObject, jSONObjectM30755);
            if (i3 != 0) {
                throw null;
            }
            int i4 = f29742 + 109;
            f29744 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30776(Context context, JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f29744 + 91;
        f29742 = i2 % 128;
        int i3 = i2 % 2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(m30772(new int[]{1729085756, -671762454, 1138204839, -2086846082, 813401055, 1862426841}, 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(m30767("角\uf719࣮겅ᓢ", (char) (View.resolveSize(0, 0) + 14854), "䊚䤇喙䡨", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1702103095, "㝈琈٥䬺").intern());
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                jSONObject.put(m30772(new int[]{-1841947203, 1248700715}, 4 - Color.argb(0, 0, 0, 0)).intern(), networkInfo.getState());
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    int i4 = f29744 + 19;
                    f29742 = i4 % 128;
                    int i5 = i4 % 2;
                    jSONObject.put(m30772(new int[]{-341144260, -2081639361, 1776115958, 1239726447}, 5 - ExpandableListView.getPackedPositionType(0L)).intern(), networkInfo.getType());
                    jSONObject.put(m30772(new int[]{-341144260, -2081639361}, 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), networkInfo.getTypeName());
                    jSONObject.put(m30767("᳭戛车琽㑂", (char) (TextUtils.lastIndexOf("", '0', 0) + 16294), "䊚䤇喙䡨", 2043818406 - View.getDefaultSize(0, 0), "ꛀ툱ꕹ謿").intern(), networkInfo.getSubtype());
                    jSONObject.put(m30772(new int[]{-1644023077, 527635026}, 4 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), networkInfo.getSubtypeName());
                    jSONObject.put(m30772(new int[]{1376055528, 1309256071}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4).intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(m30772(new int[]{89301543, -1742654818}, 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(m30767("\ue903亯䎯陚", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 41020), "䊚䤇喙䡨", ViewConfiguration.getJumpTapTimeout() >> 16, "픈⣷㲡\uf0a0").intern(), telephonyManager.getNetworkCountryIso());
                    if (!(!z)) {
                        jSONObject.put(m30772(new int[]{-872203388, 346668273}, (Process.myPid() >> 22) + 4).intern(), telephonyManager.getSimOperator());
                        jSONObject.put(m30772(new int[]{-1983037473, -1640924459}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3).intern(), telephonyManager.getSimOperatorName());
                        int i6 = f29744 + 87;
                        f29742 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
            }
        } catch (Throwable th) {
            C12085l.m30922(m30767("쳐ᴌ姞韱ᨠ䙄봕ᵢ䋝\uf174쩞", (char) (MotionEvent.axisFromString("") + 1), "䊚䤇喙䡨", 530178697 - (ViewConfiguration.getFadingEdgeLength() >> 16), "触駢촟䊢").intern(), m30772(new int[]{-1434806590, -1065022959, -58464653, -1103471395, -522604902, 1135192606, -1996728782, -876065067, 743956673, 396549751, 717316430, -1970410305, 1156449007, -21239669, -1648594013, 401548501, 2070836615, -894649970}, 33 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x009f  */
    /* JADX INFO: renamed from: ﾒ */
    public static void m30775(Context context, JSONObject jSONObject) {
        WifiInfo connectionInfo;
        int i = 2 % 2;
        int i2 = f29744 + 35;
        f29742 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                if (C12076jy.m30799(context, m30767("䆂ѥ炏܄凭舫\udcf4⪲騔㢅ǡ᭨잳듣⨼ᾎ\udb6a㾶ꖣ봢뒉彋絭遾諃棄鋺㍥謤\ue3c0嫴ᢑ톷疌骚䫍", (char) (0 / (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "䊚䤇喙䡨", KeyEvent.keyCodeFromString(""), "\uea62\ue3fc炉렵").intern())) {
                    connectionInfo = ((WifiManager) context.getSystemService(m30772(new int[]{1535289250, 408944396}, TextUtils.getOffsetBefore("", 0) + 4).intern())).getConnectionInfo();
                    jSONObject.put(m30767("馡尊ᱮ뤷", (char) (TextUtils.getOffsetAfter("", 0) + 52819), "䊚䤇喙䡨", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "ᣑ욹匀៎").intern(), connectionInfo.getSupplicantState());
                    if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                        int i3 = f29742 + 115;
                        f29744 = i3 % 128;
                        int i4 = i3 % 2;
                        jSONObject.put(m30767("坹駴\u0d51䐲", (char) (4155 - ExpandableListView.getPackedPositionGroup(0L)), "䊚䤇喙䡨", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, "ꎌ昡㮭㔐").intern(), connectionInfo.getRssi());
                        jSONObject.put(m30767("ᄍ醜茶隣", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 51665), "䊚䤇喙䡨", TextUtils.indexOf((CharSequence) "", '0') + 1, "㆖ᡝ퀭ዉ").intern(), connectionInfo.getLinkSpeed());
                    }
                }
            } else if (C12076jy.m30799(context, m30767("䆂ѥ炏܄凭舫\udcf4⪲騔㢅ǡ᭨잳듣⨼ᾎ\udb6a㾶ꖣ봢뒉彋絭遾諃棄鋺㍥謤\ue3c0嫴ᢑ톷疌骚䫍", (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "䊚䤇喙䡨", KeyEvent.keyCodeFromString(""), "\uea62\ue3fc炉렵").intern())) {
                connectionInfo = ((WifiManager) context.getSystemService(m30772(new int[]{1535289250, 408944396}, TextUtils.getOffsetBefore("", 0) + 4).intern())).getConnectionInfo();
                jSONObject.put(m30767("馡尊ᱮ뤷", (char) (TextUtils.getOffsetAfter("", 0) + 52819), "䊚䤇喙䡨", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "ᣑ욹匀៎").intern(), connectionInfo.getSupplicantState());
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    int i5 = f29742 + 115;
                    f29744 = i5 % 128;
                    int i6 = i5 % 2;
                    jSONObject.put(m30767("坹駴\u0d51䐲", (char) (4155 - ExpandableListView.getPackedPositionGroup(0L)), "䊚䤇喙䡨", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, "ꎌ昡㮭㔐").intern(), connectionInfo.getRssi());
                    jSONObject.put(m30767("ᄍ醜茶隣", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 51665), "䊚䤇喙䡨", TextUtils.indexOf((CharSequence) "", '0') + 1, "㆖ᡝ퀭ዉ").intern(), connectionInfo.getLinkSpeed());
                }
            }
            int i7 = f29744 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f29742 = i7 % 128;
            int i8 = i7 % 2;
        } catch (Throwable th) {
            C12085l.m30922(m30767("쳐ᴌ姞韱ᨠ䙄봕ᵢ䋝\uf174쩞", (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "䊚䤇喙䡨", 530178698 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "触駢촟䊢").intern(), m30772(new int[]{-1434806590, -1065022959, -58464653, -1103471395, -522604902, 1135192606, -1989157797, 1055184433, 224688458, -1725947221, 336474445, 1073830219, -607700226, -1450961261, 950764892, -1034109820}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 31).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30777(Intent intent) {
        int intExtra;
        int intExtra2;
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            int i2 = f29744 + 115;
            f29742 = i2 % 128;
            int i3 = i2 % 2;
            try {
                int intExtra3 = -1;
                if (intent.hasExtra(m30767("ﲀᔵ剔㾿ꑇ\ue01b놊", (char) TextUtils.indexOf("", "", 0, 0), "䊚䤇喙䡨", 1235093944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "롂鸉빉춎").intern())) {
                    int i4 = f29744 + 13;
                    f29742 = i4 % 128;
                    int i5 = i4 % 2;
                    intExtra = intent.getIntExtra(m30767("ﲀᔵ剔㾿ꑇ\ue01b놊", (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "䊚䤇喙䡨", Gravity.getAbsoluteGravity(0, 0) + 1235093944, "롂鸉빉춎").intern(), -1);
                } else {
                    intExtra = -1;
                }
                jSONObject.put(m30772(new int[]{1534613709, 93719139}, 4 - TextUtils.indexOf("", "")).intern(), intExtra);
                if (intent.hasExtra(m30772(new int[]{1101889249, 2085613570, -1894231361, -1769322576}, (Process.myPid() >> 22) + 5).intern())) {
                    int i6 = f29744 + 25;
                    f29742 = i6 % 128;
                    int i7 = i6 % 2;
                    intExtra2 = intent.getIntExtra(m30772(new int[]{1101889249, 2085613570, -1894231361, -1769322576}, 5 - Color.red(0)).intern(), -1);
                    int i8 = f29744 + 97;
                    f29742 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    intExtra2 = -1;
                }
                if (intent.hasExtra(m30767("⼂ㆣ畗\ud862懞", (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 57570), "䊚䤇喙䡨", (-1799914514) - Gravity.getAbsoluteGravity(0, 0), "\uee13띻\ue294\udbe0").intern())) {
                    int i10 = f29742 + 3;
                    f29744 = i10 % 128;
                    intExtra3 = intent.getIntExtra(i10 % 2 == 0 ? m30767("⼂ㆣ畗\ud862懞", (char) (57570 >> KeyEvent.keyCodeFromString("")), "䊚䤇喙䡨", (-1799914514) >>> KeyEvent.getDeadChar(1, 0), "\uee13띻\ue294\udbe0").intern() : m30767("⼂ㆣ畗\ud862懞", (char) (57570 - KeyEvent.keyCodeFromString("")), "䊚䤇喙䡨", (-1799914514) - KeyEvent.getDeadChar(0, 0), "\uee13띻\ue294\udbe0").intern(), -1);
                }
                jSONObject.put(m30767("퓼䦨ꪲ橗", (char) (View.MeasureSpec.getMode(0) + 44912), "䊚䤇喙䡨", KeyEvent.getMaxKeyCode() >> 16, "\ue86a啝灣\u19af").intern(), Math.round((intExtra2 * 100.0f) / intExtra3));
            } catch (Throwable th) {
                String strIntern = m30767("쳐ᴌ姞韱ᨠ䙄봕ᵢ䋝\uf174쩞", (char) TextUtils.getOffsetAfter("", 0), "䊚䤇喙䡨", 530178697 - Color.green(0), "触駢촟䊢").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m30772(new int[]{-1434806590, -1065022959, -58464653, -1103471395, -522604902, 1135192606, 1578710007, -2046935855, -246734695, -783317302, -155104720, -960480151, 374028348, 1252758055, -1258636276, 466647250, 1031278322, 1822406203, 1850980895, -852875063}, View.resolveSizeAndState(0, 0, 0) + 37).intern());
                sb.append(th.getLocalizedMessage());
                C12085l.m30929(strIntern, sb.toString());
            }
        }
        m30766(jSONObject);
    }

    /* JADX INFO: renamed from: ﱟ */
    private static JSONObject m30755() {
        int i = 2 % 2;
        int i2 = f29742 + 91;
        f29744 = i2 % 128;
        if (i2 % 2 == 0) {
            C12077jz.m30816(m30757());
            Object obj = null;
            super.hashCode();
            throw null;
        }
        JSONObject jSONObjectM30816 = C12077jz.m30816(m30757());
        int i3 = f29742 + 65;
        f29744 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 83 / 0;
        }
        return jSONObjectM30816;
    }

    /* JADX INFO: renamed from: ﻏ */
    private static synchronized JSONObject m30757() {
        JSONObject jSONObject;
        int i = 2 % 2;
        int i2 = f29744;
        int i3 = i2 + 99;
        f29742 = i3 % 128;
        int i4 = i3 % 2;
        jSONObject = f29748;
        int i5 = i2 + 73;
        f29742 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static synchronized void m30766(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f29742;
        int i3 = i2 + 35;
        f29744 = i3 % 128;
        int i4 = i3 % 2;
        f29748 = jSONObject;
        int i5 = i2 + 5;
        f29744 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30772(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29747.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30767(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f29749) ^ ((long) f29746)) ^ ((long) f29743));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
