package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.af */
/* JADX INFO: loaded from: classes6.dex */
public final class C11814af {

    /* JADX INFO: renamed from: ヮ */
    private static int f27015 = 0;

    /* JADX INFO: renamed from: ヶ */
    private static int f27016 = 1;

    /* JADX INFO: renamed from: 爫 */
    private InterfaceC12091r f27020;

    /* JADX INFO: renamed from: טּ */
    private String f27021;

    /* JADX INFO: renamed from: ﭴ */
    private C12065jn f27023;

    /* JADX INFO: renamed from: ﭸ */
    private C11816ah f27024;

    /* JADX INFO: renamed from: ﮉ */
    private InterfaceC12041iq f27025;

    /* JADX INFO: renamed from: ﮌ */
    private Context f27026;

    /* JADX INFO: renamed from: ﱟ */
    private Handler f27028;

    /* JADX INFO: renamed from: ﱡ */
    private boolean f27029;

    /* JADX INFO: renamed from: ﺙ */
    private boolean f27030;

    /* JADX INFO: renamed from: ﻐ */
    private C12049iy f27032;

    /* JADX INFO: renamed from: ﻛ */
    private C11822an f27033;

    /* JADX INFO: renamed from: ｋ */
    private C11813ae f27034;

    /* JADX INFO: renamed from: ﾇ */
    private C12052ja f27035;

    /* JADX INFO: renamed from: ﾒ */
    private boolean f27036;

    /* JADX INFO: renamed from: ףּ */
    private static char[] f27019 = {'t', 18823, 37771, 56764, 10161, 29099, 48095, 1488, 20419, 39347, 58361, 11761, 30546, 49429, 2820, 21877, 40753, 59691, 13147, 32067, 51037, 4461, 23399, 42336, 61067, 28742, 14724, 58267, 44467, 22437, 490, 52180, 30174, 16267, 59889, 37887, 24005, 1807, 45314, 31537, 9527, 61201, 39207, 17242, 3399, 46912, 24936, 11106, 54645, 40597, 18570, 54276, 40422, 18406, 2509, 62418, 59971, 41889, 31167, 14221, 52633, 39414, 53282, 2598, 17479, 48671, 59412, 8808, 40047, 54905, 'K', 31309, 46111, 61089, 22719, 37563, 52365, 1692, 28893, 43765, 58622, 24296, 35017, 49814, 15573, 30497, 41272, 6975, 21845, 36692, 'i', 18843, 37790, 56817, 10151, 29100, 48077, 1472, 20449, 39417, 39847, 53860, 2160, 17999, 48201, 59987, 8237, 40551, 54329, 543, 30723, 46621, 60668, 23286, 37042, 52937, 1238, 29406, 43171, 59131, 23731, 35468, 49305, 16031, 30057};

    /* JADX INFO: renamed from: ﬤ */
    private static long f27017 = -6541674891350291979L;

    /* JADX INFO: renamed from: סּ */
    private static int[] f27018 = {205153134, -1619650872, 101359414, -600391528, -982657135, 789495101, -904779630, 1293971289, 19596110, 658248939, -491226024, -1220130008, -1706002860, -338606110, -1116124440, -449645815, -153088415, -1575140804};

    /* JADX INFO: renamed from: ﮐ */
    private List<InterfaceC11817ai> f27027 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ */
    private List<C12056je.a> f27031 = new ArrayList();

    /* JADX INFO: renamed from: ﭖ */
    private Thread.UncaughtExceptionHandler f27022 = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: טּ */
    static /* synthetic */ C12049iy m28329(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27015 + 59;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        C12049iy c12049iy = c11814af.f27032;
        if (i3 != 0) {
            return c12049iy;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ */
    static /* synthetic */ String m28331(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27015 + 39;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        String strM28330 = c11814af.m28330();
        int i4 = f27015 + 3;
        f27016 = i4 % 128;
        int i5 = i4 % 2;
        return strM28330;
    }

    /* JADX INFO: renamed from: ﭴ */
    static /* synthetic */ List m28334(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27016 + 45;
        int i3 = i2 % 128;
        f27015 = i3;
        int i4 = i2 % 2;
        List<C12056je.a> list = c11814af.f27031;
        int i5 = i3 + 73;
        f27016 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ */
    static /* synthetic */ C12052ja m28335(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27016;
        int i3 = i2 + 33;
        f27015 = i3 % 128;
        int i4 = i3 % 2;
        C12052ja c12052ja = c11814af.f27035;
        int i5 = i2 + 25;
        f27015 = i5 % 128;
        int i6 = i5 % 2;
        return c12052ja;
    }

    /* JADX INFO: renamed from: ﮉ */
    static /* synthetic */ C11813ae m28337(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27016 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i3 = i2 % 128;
        f27015 = i3;
        int i4 = i2 % 2;
        C11813ae c11813ae = c11814af.f27034;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 99;
        f27016 = i5 % 128;
        int i6 = i5 % 2;
        return c11813ae;
    }

    /* JADX INFO: renamed from: ﮌ */
    static /* synthetic */ C11822an m28339(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27015 + 89;
        int i3 = i2 % 128;
        f27016 = i3;
        int i4 = i2 % 2;
        C11822an c11822an = c11814af.f27033;
        int i5 = i3 + 59;
        f27015 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return c11822an;
    }

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ void m28341(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27015 + 13;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        c11814af.m28336();
        int i4 = f27016 + 85;
        f27015 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﱟ */
    static /* synthetic */ int m28342(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27015 + 105;
        f27016 = i2 % 128;
        if (i2 % 2 != 0) {
            return c11814af.m28328();
        }
        c11814af.m28328();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ */
    static /* synthetic */ void m28345(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27015 + 71;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        c11814af.m28354(true);
        int i4 = f27016 + 45;
        f27015 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ void m28347(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27015 + 23;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        c11814af.m28366(false);
        int i4 = f27015 + 75;
        f27016 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻏ */
    static /* synthetic */ void m28349(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27016 + 83;
        f27015 = i2 % 128;
        int i3 = i2 % 2;
        c11814af.m28348();
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = f27015 + 85;
        f27016 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ C11816ah m28351(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27016 + 115;
        f27015 = i2 % 128;
        int i3 = i2 % 2;
        C11816ah c11816ah = c11814af.f27024;
        if (i3 == 0) {
            return c11816ah;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m28352(C11814af c11814af, int i) {
        int i2 = 2 % 2;
        int i3 = f27015 + 51;
        f27016 = i3 % 128;
        int i4 = i3 % 2;
        c11814af.m28365(i);
        int i5 = f27016 + 33;
        f27015 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ InterfaceC12091r m28357(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27015 + 45;
        int i3 = i2 % 128;
        f27016 = i3;
        int i4 = i2 % 2;
        InterfaceC12091r interfaceC12091r = c11814af.f27020;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 57;
        f27015 = i5 % 128;
        if (i5 % 2 == 0) {
            return interfaceC12091r;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ boolean m28363(C11814af c11814af, int i) {
        int i2 = 2 % 2;
        int i3 = f27015 + 77;
        f27016 = i3 % 128;
        int i4 = i3 % 2;
        boolean zM28355 = c11814af.m28355(i);
        int i5 = f27015 + 67;
        f27016 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return zM28355;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ Thread.UncaughtExceptionHandler m28364(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27016 + 115;
        f27015 = i2 % 128;
        int i3 = i2 % 2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c11814af.f27022;
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m28368(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27016 + 15;
        f27015 = i2 % 128;
        int i3 = i2 % 2;
        c11814af.m28344();
        int i4 = f27016 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27015 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m28369(C11814af c11814af, JSONObject jSONObject, AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f27015 + 41;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        c11814af.m28375(jSONObject, abstractRunnableC12044it);
        int i4 = f27015 + 75;
        f27016 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ boolean m28372(C11814af c11814af, C11815ag c11815ag) {
        int i = 2 % 2;
        int i2 = f27016 + 43;
        f27015 = i2 % 128;
        if (i2 % 2 != 0) {
            c11814af.m28356(c11815ag);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean zM28356 = c11814af.m28356(c11815ag);
        int i3 = f27015 + 43;
        f27016 = i3 % 128;
        int i4 = i3 % 2;
        return zM28356;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m28373(C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f27016 + 63;
        f27015 = i2 % 128;
        c11814af.m28362(i2 % 2 != 0);
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m28374(C11814af c11814af, List list, InterfaceC12046iv interfaceC12046iv) {
        int i = 2 % 2;
        int i2 = f27016 + 61;
        f27015 = i2 % 128;
        int i3 = i2 % 2;
        c11814af.m28371((List<C11815ag>) list, interfaceC12046iv);
        int i4 = f27016 + 115;
        f27015 = i4 % 128;
        int i5 = i4 % 2;
    }

    public C11814af(Context context, C11827as c11827as, C11822an c11822an, boolean z, String str, InterfaceC12091r interfaceC12091r) {
        this.f27020 = interfaceC12091r;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.af.5

            /* JADX INFO: renamed from: ﻐ */
            private static int f27089 = 0;

            /* JADX INFO: renamed from: ﾇ */
            private static int f27090 = 1;

            /* JADX INFO: renamed from: ﾒ */
            private static long f27091 = -1631276058012243647L;

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                int i = 2 % 2;
                int i2 = f27089 + 43;
                f27090 = i2 % 128;
                int i3 = i2 % 2;
                C12080kb.m30843(m28403("\u2d78ⴹ\ue457\ue221鸆蠅䵸͉냂䜭씍斩會", 1 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m28403("娪婿贇喒ᖿ｛\u2428樊ݳ\uf09d亮\uee1dဂ휄鮁ꮵ땃박䚉һ칕ᤗ", 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m28403("ᬮ᭺쬹麈䡋빏戊Ⱝ챫㮌ፏ돫免", 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), th);
                C11814af.this.m28381();
                C11814af.m28364(C11814af.this).uncaughtException(thread, th);
                int i4 = f27090 + 29;
                f27089 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾇ */
            private static String m28403(String str2, int i) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11943f.f28848) {
                    char[] cArrM30189 = C11943f.m30189(f27091, cArr, i);
                    C11943f.f28846 = 4;
                    while (C11943f.f28846 < cArrM30189.length) {
                        C11943f.f28847 = C11943f.f28846 - 4;
                        cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27091));
                        C11943f.f28846++;
                    }
                    str3 = new String(cArrM30189, 4, cArrM30189.length - 4);
                }
                return str3;
            }
        });
        this.f27033 = c11822an;
        this.f27026 = context;
        C12056je c12056je = new C12056je(context, m28358(25 - (Process.myPid() >> 22), ViewConfiguration.getTouchSlop() >> 8, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m28359(new int[]{-1480173936, 1347614089, -1879907618, 584375000, -527808885, 1618778924, -1429810159, 1187444909, 1525877895, 11600001, -248464131, -322558684}, View.MeasureSpec.makeMeasureSpec(0, 0) + 24).intern());
        this.f27035 = new C12052ja(m28359(new int[]{-7690565, -407405811, -174970787, 2076444262}, 7 - ExpandableListView.getPackedPositionChild(0L)).intern(), m28359(new int[]{-9835891, 1484695397, -1217661229, 651291369}, TextUtils.indexOf("", "") + 6).intern(), c12056je);
        int iM28350 = m28350(c12056je);
        this.f27034 = new C11813ae(context, c11827as, iM28350, m28367(c12056je), AbstractC11823ao.m28472().mo28476());
        this.f27032 = new C12049iy(context);
        this.f27036 = false;
        HandlerThread handlerThread = new HandlerThread(m28359(new int[]{199674706, -1634966901, -588991850, 1254864541, 1614916446, -2052474655, -1917348091, 571524966}, 14 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
        handlerThread.start();
        this.f27028 = new Handler(handlerThread.getLooper());
        this.f27024 = new C11816ah(iM28350);
        this.f27030 = !z;
        this.f27021 = str;
        m28362(true);
        m28346();
    }

    /* JADX INFO: renamed from: ﾇ */
    public final synchronized void m28382() {
        int i = 2 % 2;
        int i2 = f27016 + 1;
        int i3 = i2 % 128;
        f27015 = i3;
        if (i2 % 2 != 0) {
            this.f27036 = false;
            if (this.f27028 != null) {
                int i4 = i3 + 113;
                f27016 = i4 % 128;
                int i5 = i4 % 2;
                this.f27028.removeCallbacksAndMessages(null);
                int i6 = 2 % 2;
            }
        } else {
            this.f27036 = false;
            if (this.f27028 != null) {
                int i7 = i3 + 113;
                f27016 = i7 % 128;
                int i8 = i7 % 2;
                this.f27028.removeCallbacksAndMessages(null);
                int i9 = 2 % 2;
            }
        }
        this.f27032.m30565();
        m28343();
    }

    /* JADX INFO: renamed from: ﻐ */
    private synchronized void m28354(boolean z) {
        int i = 2 % 2;
        int i2 = f27016 + 77;
        f27015 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f27036 = true;
            m28362(false);
        } else {
            this.f27036 = true;
            m28362(true);
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public final synchronized void m28383(InterfaceC11817ai interfaceC11817ai) {
        int i = 2 % 2;
        int i2 = f27015 + 75;
        f27016 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f27027.add(interfaceC11817ai);
            throw null;
        }
        this.f27027.add(interfaceC11817ai);
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized void m28380(C12056je.a aVar) {
        int i = 2 % 2;
        int i2 = f27015 + 69;
        f27016 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f27031.add(aVar);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f27031.add(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: ﻏ */
    private void m28348() {
        int i = 2 % 2;
        int i2 = f27016 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        int i3 = i2 % 128;
        f27015 = i3;
        if (i2 % 2 != 0) {
            int i4 = 96 / 0;
            if (this.f27030) {
                int i5 = i3 + 81;
                f27016 = i5 % 128;
                int i6 = i5 % 2;
                m28384();
            }
        } else if (this.f27030) {
            int i7 = i3 + 81;
            f27016 = i7 % 128;
            int i8 = i7 % 2;
            m28384();
        }
        this.f27030 = false;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m28379() {
        int i = 2 % 2;
        C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.6

            /* JADX INFO: renamed from: ﱟ */
            private static int f27093 = 0;

            /* JADX INFO: renamed from: ﱡ */
            private static int f27094 = 1;

            /* JADX INFO: renamed from: ﻐ */
            private static char f27095 = 10045;

            /* JADX INFO: renamed from: ﻛ */
            private static char f27096 = 49800;

            /* JADX INFO: renamed from: ｋ */
            private static char f27097 = 30273;

            /* JADX INFO: renamed from: ﾒ */
            private static char f27098 = 40936;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                int i2 = 2 % 2;
                C11814af.m28357(C11814af.this).onEvent(m28404("嗿䁌\ue10eᑂ燥䚾ᒹ䶻\uddfe뗅瑊\udd62", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern());
                C11814af.this.m28385(m28404("嗿䁌\ue10eᑂ燥䚾ᒹ䶻\uddfe뗅瑊\udd62", (ViewConfiguration.getTapTimeout() >> 16) + 11).intern(), new JSONObject());
                int i3 = f27094 + 89;
                f27093 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* JADX INFO: renamed from: ｋ */
            private static String m28404(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C12078k.f29776) {
                    char[] cArr2 = new char[cArr.length];
                    C12078k.f29775 = 0;
                    char[] cArr3 = new char[2];
                    while (C12078k.f29775 < cArr.length) {
                        cArr3[0] = cArr[C12078k.f29775];
                        cArr3[1] = cArr[C12078k.f29775 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f27097)) ^ ((c2 >>> 5) + f27096)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f27095) ^ ((c3 + i3) ^ ((c3 << 4) + f27098))));
                            i3 -= 40503;
                        }
                        cArr2[C12078k.f29775] = cArr3[0];
                        cArr2[C12078k.f29775 + 1] = cArr3[1];
                        C12078k.f29775 += 2;
                    }
                    str2 = new String(cArr2, 0, i2);
                }
                return str2;
            }
        });
        int i2 = f27015 + 51;
        f27016 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m28384() {
        int i = 2 % 2;
        C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.9

            /* JADX INFO: renamed from: ﺙ */
            private static int f27109 = 1;

            /* JADX INFO: renamed from: ﻐ */
            private static int f27110 = 0;

            /* JADX INFO: renamed from: ﻛ */
            private static long f27111 = -6267055015534225905L;

            /* JADX INFO: renamed from: ﾇ */
            private static char f27112;

            /* JADX INFO: renamed from: ﾒ */
            private static int f27113;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                int i2 = 2 % 2;
                C11814af.m28357(C11814af.this).onEvent(m28407("鎫둅\ud8c1롚᪾잲니穏폙묂雅貣번", (char) (38998 - View.getDefaultSize(0, 0)), "阏\ueb40\uf2aa꤆", 1167850082 - TextUtils.getOffsetAfter("", 0), "戅鯺噅隘").intern());
                C11814af.this.m28385(m28407("鎫둅\ud8c1롚᪾잲니穏폙묂雅貣번", (char) (38997 - TextUtils.lastIndexOf("", '0', 0, 0)), "阏\ueb40\uf2aa꤆", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1167850081, "戅鯺噅隘").intern(), new JSONObject());
                int i3 = f27113 + 89;
                f27109 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 17 / 0;
                }
            }

            /* JADX INFO: renamed from: ﾒ */
            private static String m28407(String str, char c, String str2, int i2, String str3) {
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
                    cArr5[2] = (char) (cArr5[2] + ((char) i2));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    C12051j.f29511 = 0;
                    while (C12051j.f29511 < length) {
                        int i3 = (C12051j.f29511 + 2) % 4;
                        int i4 = (C12051j.f29511 + 3) % 4;
                        C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i3]) % 65535);
                        cArr5[i4] = (char) (((cArr4[i4] * 32718) + cArr5[i3]) / 65535);
                        cArr4[i4] = C12051j.f29509;
                        cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i4] ^ cArr3[C12051j.f29511])) ^ f27111) ^ ((long) f27110)) ^ ((long) f27112));
                        C12051j.f29511++;
                    }
                    str4 = new String(cArr6);
                }
                return str4;
            }
        });
        int i2 = f27016 + 21;
        f27015 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m28381() {
        int i = 2 % 2;
        int i2 = f27016 + 65;
        f27015 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f27030 = true;
            m28379();
            m28377();
            int i4 = f27015 + 43;
            f27016 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Exception e) {
            C12080kb.m30845(m28359(new int[]{1893172733, -1766012382, -1070354512, 1151713783, 1834144881, -98241182}, 9 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m28358((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, View.MeasureSpec.makeMeasureSpec(0, 0) + 25, (char) (28675 - TextUtils.indexOf("", "", 0))).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m28377() {
        synchronized (this) {
            Handler handler = this.f27028;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            m28362(true);
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static JSONObject m28360(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        int i = 2 % 2;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(m28359(new int[]{357542369, 429199774, 1094576681, 508001452}, (ViewConfiguration.getPressedStateDuration() >> 16) + 5).intern(), str);
            jSONObject2.put(m28358(5 - (ViewConfiguration.getLongPressTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 51, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54368)).intern(), str2);
            jSONObject2.put(m28359(new int[]{-1463634860, 1354663342, -702773562, -1274464840}, TextUtils.getTrimmedLength("") + 6).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject2.put(m28358(TextUtils.indexOf("", "", 0) + 5, 57 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (View.resolveSize(0, 0) + 59942)).intern(), str4);
                int i2 = f27015 + 47;
                f27016 = i2 % 128;
                int i3 = i2 % 2;
            }
            if (jSONObject != null) {
                int i4 = f27016 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f27015 = i4 % 128;
                int i5 = i4 % 2;
                C12077jz.m30802(jSONObject2, jSONObject);
            }
            int i6 = f27015 + 101;
            f27016 = i6 % 128;
            int i7 = i6 % 2;
        } catch (JSONException e) {
            C12085l.m30922(m28359(new int[]{1893172733, -1766012382, -1070354512, 1151713783, 1834144881, -98241182}, 9 - TextUtils.getCapsMode("", 0, 0)).intern(), m28359(new int[]{110302271, -734560223, 136630837, -656790242, 506864246, 1520496480, 582190321, -1911044892, -1470282767, -948757357, -1877748196, -17257132, -351710885, -969716538}, AndroidCharacter.getMirror('0') - 22).intern(), e);
        }
        int i8 = f27016 + 3;
        f27015 = i8 % 128;
        if (i8 % 2 == 0) {
            return jSONObject2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m28385(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27015 + 73;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        m28370(str, jSONObject, (JSONObject) null);
        int i4 = f27015 + 11;
        f27016 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m28370(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i = 2 % 2;
        int i2 = f27015 + 7;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        m28378(str, jSONObject, jSONObject2, null);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m28378(String str, JSONObject jSONObject, JSONObject jSONObject2, final AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        String strIntern = m28359(new int[]{1893172733, -1766012382, -1070354512, 1151713783, 1834144881, -98241182}, View.resolveSize(0, 0) + 9).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(m28359(new int[]{843139106, 1745518663, 824882496, 245707615, 515585509, 423090059, -1609044386, 1016818439, 1661247719, 1846575810, -512773871, 24245112}, (ViewConfiguration.getTapTimeout() >> 16) + 22).intern());
        sb.append(str);
        sb.append(m28359(new int[]{-1756190193, -54234986, 1554715151, 674689134, -612420001, -1776316502, -468499815, -706542101, -922461193, -1897952406}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17).intern());
        C12085l.m30913(strIntern, sb.toString(), jSONObject);
        try {
            if (m28333().m28551().contains(str)) {
                String strIntern2 = m28359(new int[]{1893172733, -1766012382, -1070354512, 1151713783, 1834144881, -98241182}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m28358((ViewConfiguration.getScrollBarSize() >> 8) + 29, Color.green(0) + 61, (char) (39352 - Color.alpha(0))).intern());
                sb2.append(str);
                sb2.append(m28359(new int[]{-643152234, -235522998, -1850979393, -1207512256, -1043148012, -775625527, 126983026, -385287303, -1604886764, -1416385242, 1639078857, -657158124}, 21 - View.resolveSizeAndState(0, 0, 0)).intern());
                C12085l.m30917(strIntern2, sb2.toString());
                int i2 = f27016 + 43;
                f27015 = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            String strIntern3 = m28359(new int[]{1893172733, -1766012382, -1070354512, 1151713783, 1834144881, -98241182}, (ViewConfiguration.getTouchSlop() >> 8) + 9).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m28359(new int[]{843139106, 1745518663, 824882496, 245707615, 515585509, 423090059, -1609044386, 1016818439, 1661247719, 1846575810, -1756190193, -54234986, -586287732, -1174374758, 97497263, -1195455839}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 32).intern());
            sb3.append(str);
            C12085l.m30917(strIntern3, sb3.toString());
            this.f27034.m28323(str, jSONObject, jSONObject2, this.f27032.m30564().m30541(), new C11813ae.b() { // from class: com.ironsource.adqualitysdk.sdk.i.af.7
                @Override // com.ironsource.adqualitysdk.sdk.p286i.C11813ae.b
                public void onEventGenerated(JSONObject jSONObject3) {
                    C11814af.m28351(C11814af.this).m28435(jSONObject3);
                    C11814af.m28369(C11814af.this, jSONObject3, new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.7.4

                        /* JADX INFO: renamed from: ﱡ */
                        private static int f27102 = 1;

                        /* JADX INFO: renamed from: ﻐ */
                        private static long f27103 = 0;

                        /* JADX INFO: renamed from: ﻛ */
                        private static int f27104 = 0;

                        /* JADX INFO: renamed from: ｋ */
                        private static char f27105 = 60298;

                        /* JADX INFO: renamed from: ﾒ */
                        private static int f27106;

                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            int i4 = 2 % 2;
                            int i5 = f27106 + 23;
                            f27102 = i5 % 128;
                            int i6 = i5 % 2;
                            C11814af.m28373(C11814af.this);
                            if (abstractRunnableC12044it != null) {
                                int i7 = f27106 + 65;
                                f27102 = i7 % 128;
                                int i8 = i7 % 2;
                                try {
                                    abstractRunnableC12044it.mo28224();
                                    return;
                                } catch (Exception e) {
                                    C12080kb.m30846(m28405("壘𢡊\uf196퐽팤臵쑎摲\uf555", (char) (AndroidCharacter.getMirror('0') - '0'), "\u0000\u0000\u0000\u0000", 1588060536 - KeyEvent.normalizeMetaState(0), "碋\ua7e1ᕞພ").intern(), m28405("⫦ᢤΩ斱﮷ἲῆ❖ა뤴\u0e66㉿\u0893炭繏ḯ諶ᒦ⍳渄\uf11e㕾䷲䝈\udc2c茕恫\ue2dd怔琟蛓\udc35", (char) (52284 - Process.getGidForName("")), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "敤퀞㶩拌").intern(), e, false, false, true);
                                }
                            }
                            int i9 = f27102 + 71;
                            f27106 = i9 % 128;
                            if (i9 % 2 != 0) {
                                int i10 = 32 / 0;
                            }
                        }

                        /* JADX INFO: renamed from: ﻐ */
                        private static String m28405(String str2, char c, String str3, int i4, String str4) {
                            String str5;
                            Object charArray = str4;
                            if (str4 != null) {
                                charArray = str4.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            Object charArray2 = str3;
                            if (str3 != null) {
                                charArray2 = str3.toCharArray();
                            }
                            char[] cArr2 = (char[]) charArray2;
                            Object charArray3 = str2;
                            if (str2 != null) {
                                charArray3 = str2.toCharArray();
                            }
                            char[] cArr3 = (char[]) charArray3;
                            synchronized (C12051j.f29510) {
                                char[] cArr4 = (char[]) cArr.clone();
                                char[] cArr5 = (char[]) cArr2.clone();
                                cArr4[0] = (char) (c ^ cArr4[0]);
                                cArr5[2] = (char) (cArr5[2] + ((char) i4));
                                int length = cArr3.length;
                                char[] cArr6 = new char[length];
                                C12051j.f29511 = 0;
                                while (C12051j.f29511 < length) {
                                    int i5 = (C12051j.f29511 + 2) % 4;
                                    int i6 = (C12051j.f29511 + 3) % 4;
                                    C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i5]) % 65535);
                                    cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
                                    cArr4[i6] = C12051j.f29509;
                                    cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i6] ^ cArr3[C12051j.f29511])) ^ f27103) ^ ((long) f27104)) ^ ((long) f27105));
                                    C12051j.f29511++;
                                }
                                str5 = new String(cArr6);
                            }
                            return str5;
                        }
                    });
                }
            });
        } catch (Exception e) {
            C12080kb.m30846(m28359(new int[]{1893172733, -1766012382, -1070354512, 1151713783, 1834144881, -98241182}, 9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m28359(new int[]{110302271, -734560223, 1967803862, 1384342085, -1257335629, 578744229, 2064506141, -14678194, -421386083, -380025330}, 18 - KeyEvent.keyCodeFromString("")).intern(), e, false, false, true);
        }
    }

    /* JADX INFO: renamed from: ﱡ */
    private void m28344() {
        int i = 2 % 2;
        int i2 = f27015 + 19;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        m28362(false);
        int i4 = f27016 + 53;
        f27015 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﺙ */
    private void m28346() {
        int i = 2 % 2;
        this.f27025 = new InterfaceC12041iq() { // from class: com.ironsource.adqualitysdk.sdk.i.af.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12041iq
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28406() {
                C11814af.m28368(C11814af.this);
            }
        };
        this.f27032.m30564().m30540(this.f27025);
        this.f27023 = new C12065jn(new InterfaceC12066jo() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10

            /* JADX INFO: renamed from: ﻐ */
            private static long f27039 = 7967641974981648715L;

            /* JADX INFO: renamed from: ﾇ */
            private static int f27040 = 1;

            /* JADX INFO: renamed from: ﾒ */
            private static int f27041;

            /* JADX INFO: renamed from: ｋ */
            static /* synthetic */ JSONObject m28387(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f27041 + 79;
                f27040 = i3 % 128;
                int i4 = i3 % 2;
                JSONObject jSONObjectM28388 = m28388(activity);
                int i5 = f27040 + 23;
                f27041 = i5 % 128;
                int i6 = i5 % 2;
                return jSONObjectM28388;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12066jo
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28389(final Activity activity) {
                int i2 = 2 % 2;
                C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10.3

                    /* JADX INFO: renamed from: ｋ */
                    private static int f27049 = 0;

                    /* JADX INFO: renamed from: ﾇ */
                    private static int f27050 = 1;

                    /* JADX INFO: renamed from: ﾒ */
                    private static long f27051 = 1327653029420734818L;

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        int i3 = 2 % 2;
                        int i4 = f27050 + 59;
                        f27049 = i4 % 128;
                        int i5 = i4 % 2;
                        C11814af.m28357(C11814af.this).onEvent(m28392("둹됟ु苷\uf86f၌끐됼톂矴\u1ad7䦮缚\ued47", (-1) - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                        C11814af.this.m28385(m28392("둹됟ु苷\uf86f၌끐됼톂矴\u1ad7䦮缚\ued47", TextUtils.getOffsetAfter("", 0)).intern(), AnonymousClass10.m28387(activity));
                        int i6 = f27050 + 23;
                        f27049 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }

                    /* JADX INFO: renamed from: ｋ */
                    private static String m28392(String str, int i3) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (C11943f.f28848) {
                            char[] cArrM30189 = C11943f.m30189(f27051, cArr, i3);
                            C11943f.f28846 = 4;
                            while (C11943f.f28846 < cArrM30189.length) {
                                C11943f.f28847 = C11943f.f28846 - 4;
                                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27051));
                                C11943f.f28846++;
                            }
                            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
                        }
                        return str2;
                    }
                });
                int i3 = f27041 + 109;
                f27040 = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12066jo
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28390(final Activity activity) {
                int i2 = 2 % 2;
                C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10.2

                    /* JADX INFO: renamed from: ﱟ */
                    private static int f27043 = 1;

                    /* JADX INFO: renamed from: ﻐ */
                    private static char[] f27044 = {'f', 'o', 'c', AbstractJsonLexerKt.UNICODE_ESC, 's', '_', 'r', 'e', 't', 'd', 'g', 'h', 'i', 'j', 'k', 'l'};

                    /* JADX INFO: renamed from: ｋ */
                    private static char f27045 = 4;

                    /* JADX INFO: renamed from: ﾒ */
                    private static int f27046;

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        int i3 = 2 % 2;
                        int i4 = f27046 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                        f27043 = i4 % 128;
                        int i5 = i4 % 2;
                        C11814af.m28357(C11814af.this).onEvent(m28391("\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\b\f\u0002\u0005\u0005\u000b", View.combineMeasuredStates(0, 0) + 14, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49)).intern());
                        C11814af.this.m28385(m28391("\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\b\f\u0002\u0005\u0005\u000b", 14 - TextUtils.getOffsetAfter("", 0), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 48)).intern(), AnonymousClass10.m28387(activity));
                        int i6 = f27043 + 21;
                        f27046 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }

                    /* JADX INFO: renamed from: ﻛ */
                    private static String m28391(String str, int i3, byte b) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (C11970g.f28961) {
                            char[] cArr2 = f27044;
                            char c = f27045;
                            char[] cArr3 = new char[i3];
                            if (i3 % 2 != 0) {
                                i3--;
                                cArr3[i3] = (char) (cArr[i3] - b);
                            }
                            if (i3 > 1) {
                                C11970g.f28962 = 0;
                                while (C11970g.f28962 < i3) {
                                    C11970g.f28964 = cArr[C11970g.f28962];
                                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                                    if (C11970g.f28964 == C11970g.f28965) {
                                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                                    } else {
                                        C11970g.f28963 = C11970g.f28964 / c;
                                        C11970g.f28959 = C11970g.f28964 % c;
                                        C11970g.f28966 = C11970g.f28965 / c;
                                        C11970g.f28960 = C11970g.f28965 % c;
                                        if (C11970g.f28959 == C11970g.f28960) {
                                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                                            int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                                            int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                                            cArr3[C11970g.f28962] = cArr2[i4];
                                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                                        } else if (C11970g.f28963 == C11970g.f28966) {
                                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                                            int i6 = (C11970g.f28963 * c) + C11970g.f28959;
                                            int i7 = (C11970g.f28966 * c) + C11970g.f28960;
                                            cArr3[C11970g.f28962] = cArr2[i6];
                                            cArr3[C11970g.f28962 + 1] = cArr2[i7];
                                        } else {
                                            int i8 = (C11970g.f28963 * c) + C11970g.f28960;
                                            int i9 = (C11970g.f28966 * c) + C11970g.f28959;
                                            cArr3[C11970g.f28962] = cArr2[i8];
                                            cArr3[C11970g.f28962 + 1] = cArr2[i9];
                                        }
                                    }
                                    C11970g.f28962 += 2;
                                }
                            }
                            str2 = new String(cArr3);
                        }
                        return str2;
                    }
                });
                int i3 = f27041 + 103;
                f27040 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ */
            private static JSONObject m28388(Activity activity) {
                int i2 = 2 % 2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(m28386("\ue12a뎻䐙ᚼꭦ緹\u0e5c", TextUtils.getOffsetAfter("", 0) + 21139).intern(), activity.getClass().getName());
                } catch (JSONException unused) {
                    C12085l.m30929(m28386("\ue10a㈎䝼颦궞ﻨሠ✅硠", 54059 - TextUtils.getOffsetBefore("", 0)).intern(), m28386("\ue10e훰身䙿㸝\uf786꾜材彧ᜳ쳿蒏簇㐟\uedd6ꗸ鶲啤ഀ싔몆爖⩣\ue225\udbfe鎏", TextUtils.lastIndexOf("", '0', 0, 0) + 14282).intern());
                }
                int i3 = f27040 + 27;
                f27041 = i3 % 128;
                int i4 = i3 % 2;
                return jSONObject;
            }

            /* JADX INFO: renamed from: ﻐ */
            private static String m28386(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11997h.f29102) {
                    C11997h.f29101 = i2;
                    char[] cArr2 = new char[cArr.length];
                    C11997h.f29103 = 0;
                    while (C11997h.f29103 < cArr.length) {
                        cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f27039);
                        C11997h.f29103++;
                    }
                    str2 = new String(cArr2);
                }
                return str2;
            }
        });
        AbstractC12058jg.m30663().m30665(new AbstractC12059jh() { // from class: com.ironsource.adqualitysdk.sdk.i.af.15
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12061jj
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28395(Activity activity) {
                C11814af.this.m28381();
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12061jj
            /* JADX INFO: renamed from: ｋ */
            public final void mo28396(Activity activity) {
                C11814af.m28349(C11814af.this);
            }
        });
        AbstractC11823ao.m28472().mo28502(new InterfaceC11828at() { // from class: com.ironsource.adqualitysdk.sdk.i.af.12
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11828at
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28394() {
                C11814af.m28345(C11814af.this);
            }
        });
        int i2 = f27016 + 87;
        f27015 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    private void m28343() {
        int i = 2 % 2;
        if (this.f27025 != null) {
            int i2 = f27015 + 57;
            f27016 = i2 % 128;
            int i3 = i2 % 2;
            this.f27032.m30564().m30544(this.f27025);
        }
        this.f27023.m30714();
        this.f27023 = null;
        int i4 = f27016 + 103;
        f27015 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static int m28350(C12056je c12056je) {
        int i;
        int i2 = 2 % 2;
        int i3 = f27016 + 35;
        f27015 = i3 % 128;
        int i4 = i3 % 2;
        String strM30642 = c12056je.m30642(m28358(((Process.getThreadPriority(0) + 20) >> 6) + 10, Color.argb(0, 0, 0, 0) + 90, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        if (TextUtils.isEmpty(strM30642)) {
            i = 1;
        } else {
            int i5 = f27015 + 1;
            f27016 = i5 % 128;
            int i6 = i5 % 2;
            i = Integer.parseInt(strM30642) + 1;
        }
        c12056je.m30648(m28358(10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 90, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), String.valueOf(i));
        return i;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final String m28376() {
        int i = 2 % 2;
        String strM28367 = m28367(new C12056je(this.f27026, m28358(25 - Color.green(0), TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) Gravity.getAbsoluteGravity(0, 0)).intern(), m28359(new int[]{-1480173936, 1347614089, -1879907618, 584375000, -527808885, 1618778924, -1429810159, 1187444909, 1525877895, 11600001, -248464131, -322558684}, 24 - KeyEvent.normalizeMetaState(0)).intern()));
        int i2 = f27016 + 49;
        f27015 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
        return strM28367;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28367(C12056je c12056je) {
        String string;
        String strM28359;
        int i = 2 % 2;
        int i2 = f27016 + 47;
        f27015 = i2 % 128;
        int i3 = i2 % 2;
        String strM30642 = c12056je.m30642(m28359(new int[]{-422248797, -1587244602, 200184531, 632063335, 660437009, -1622406723, -1815122758, -1730823809}, View.MeasureSpec.getMode(0) + 16).intern());
        if (!TextUtils.isEmpty(strM30642)) {
            return strM30642;
        }
        int i4 = f27016 + 77;
        f27015 = i4 % 128;
        if (i4 % 2 != 0) {
            string = UUID.randomUUID().toString();
            strM28359 = m28359(new int[]{-422248797, -1587244602, 200184531, 632063335, 660437009, -1622406723, -1815122758, -1730823809}, 115 << (KeyEvent.getMaxKeyCode() / 106));
        } else {
            string = UUID.randomUUID().toString();
            strM28359 = m28359(new int[]{-422248797, -1587244602, 200184531, 632063335, 660437009, -1622406723, -1815122758, -1730823809}, (KeyEvent.getMaxKeyCode() >> 16) + 16);
        }
        c12056je.m30648(strM28359.intern(), string);
        return string;
    }

    /* JADX INFO: renamed from: ﮉ */
    private synchronized boolean m28338() {
        boolean z;
        int i = 2 % 2;
        int i2 = f27015;
        int i3 = i2 + 37;
        f27016 = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.f27029;
            int i4 = 60 / 0;
        } else {
            z = this.f27029;
        }
        int i5 = i2 + 33;
        f27016 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ｋ */
    private synchronized void m28366(boolean z) {
        int i = 2 % 2;
        int i2 = f27015;
        int i3 = i2 + 89;
        f27016 = i3 % 128;
        int i4 = i3 % 2;
        this.f27029 = z;
        int i5 = i2 + 69;
        f27016 = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭴ */
    private synchronized C11824ap m28333() {
        C11824ap c11824apMo28484;
        int i = 2 % 2;
        int i2 = f27015 + 79;
        f27016 = i2 % 128;
        if (i2 % 2 == 0) {
            c11824apMo28484 = AbstractC11823ao.m28472().mo28484();
            int i3 = 42 / 0;
        } else {
            c11824apMo28484 = AbstractC11823ao.m28472().mo28484();
        }
        return c11824apMo28484;
    }

    /* JADX INFO: renamed from: ﮌ */
    private synchronized boolean m28340() {
        boolean z;
        int i = 2 % 2;
        int i2 = f27016;
        int i3 = i2 + 1;
        f27015 = i3 % 128;
        int i4 = i3 % 2;
        z = this.f27036;
        int i5 = i2 + 39;
        f27015 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﻛ */
    private synchronized void m28362(boolean z) {
        int i = 2 % 2;
        if (!z) {
            this.f27035.m30599(new C12052ja.c() { // from class: com.ironsource.adqualitysdk.sdk.i.af.11
                @Override // com.ironsource.adqualitysdk.sdk.p286i.C12052ja.c
                /* JADX INFO: renamed from: ｋ */
                public final void mo28393(int i2) {
                    C11814af.m28352(C11814af.this, C11814af.m28363(C11814af.this, i2) ? 0 : C11814af.m28342(C11814af.this));
                }
            });
            int i2 = f27016 + 5;
            f27015 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 93 / 0;
                return;
            }
            return;
        }
        int i4 = f27016 + 21;
        f27015 = i4 % 128;
        if (i4 % 2 == 0) {
            m28332();
            return;
        }
        m28332();
        Object obj = null;
        super.hashCode();
        throw null;
        throw th;
    }

    /* JADX INFO: renamed from: ﭖ */
    private void m28332() {
        int i = 2 % 2;
        int i2 = f27016 + 113;
        f27015 = i2 % 128;
        int i3 = i2 % 2;
        m28365(0);
        int i4 = f27015 + 113;
        f27016 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private void m28365(int i) {
        int i2 = 2 % 2;
        Object obj = null;
        this.f27028.removeCallbacksAndMessages(null);
        this.f27028.postDelayed(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.4

            /* JADX INFO: renamed from: ﱟ */
            private static short[] f27081 = null;

            /* JADX INFO: renamed from: ﺙ */
            private static int f27082 = 0;

            /* JADX INFO: renamed from: ﻏ */
            private static int f27083 = 1;

            /* JADX INFO: renamed from: ﻐ */
            private static int f27084 = 99;

            /* JADX INFO: renamed from: ﻛ */
            private static byte[] f27085 = {50, Ascii.f22493FS, Ascii.ETB, Ascii.f22494GS, 47, 45, Ascii.NAK, 79, -75, -67, -70, -74, -5, 107, -74, -75, -60, -2, 101, -73, -66, -63, -89, -55, -3, 113, -79, -67, -67, -82, -63, -86, Ascii.f22503VT, 102, -69, -75, -72, -27, 0, 0};

            /* JADX INFO: renamed from: ｋ */
            private static int f27086 = -1379652356;

            /* JADX INFO: renamed from: ﾇ */
            private static int f27087 = -745182829;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                int i3 = 2 % 2;
                int i4 = f27082 + 109;
                f27083 = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        C11814af.m28341(C11814af.this);
                    } else {
                        C11814af.m28341(C11814af.this);
                        throw null;
                    }
                } catch (Throwable th) {
                    C12085l.m30914(m28402((short) ((-35) - ((byte) KeyEvent.getModifierMetaStateMask())), (-91) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 745182829, Gravity.getAbsoluteGravity(0, 0) + 1379652421).intern(), m28402((short) (73 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) - 68, (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), Process.getGidForName("") + 745182838, TextUtils.indexOf((CharSequence) "", '0', 0) + 1379652426).intern(), th);
                    C11814af.m28347(C11814af.this);
                }
            }

            /* JADX INFO: renamed from: ﻛ */
            private static String m28402(short s, int i3, byte b, int i4, int i5) {
                String string;
                synchronized (C12086m.f29832) {
                    StringBuilder sb = new StringBuilder();
                    int i6 = f27084;
                    int i7 = i3 + i6;
                    int i8 = i7 == -1 ? 1 : 0;
                    if (i8 != 0) {
                        byte[] bArr = f27085;
                        if (bArr != null) {
                            i7 = (byte) (bArr[f27087 + i4] + i6);
                        } else {
                            i7 = (short) (f27081[f27087 + i4] + i6);
                        }
                    }
                    if (i7 > 0) {
                        C12086m.f29836 = ((i4 + i7) - 2) + f27087 + i8;
                        C12086m.f29833 = b;
                        C12086m.f29837 = (char) (i5 + f27086);
                        sb.append(C12086m.f29837);
                        C12086m.f29834 = C12086m.f29837;
                        C12086m.f29835 = 1;
                        while (C12086m.f29835 < i7) {
                            byte[] bArr2 = f27085;
                            if (bArr2 != null) {
                                int i9 = C12086m.f29836;
                                C12086m.f29836 = i9 - 1;
                                C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i9] + s)) ^ C12086m.f29833));
                            } else {
                                short[] sArr = f27081;
                                int i10 = C12086m.f29836;
                                C12086m.f29836 = i10 - 1;
                                C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i10] + s)) ^ C12086m.f29833));
                            }
                            sb.append(C12086m.f29837);
                            C12086m.f29834 = C12086m.f29837;
                            C12086m.f29835++;
                        }
                    }
                    string = sb.toString();
                }
                return string;
            }
        }, i);
        int i3 = f27015 + 97;
        f27016 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private boolean m28355(int i) {
        int i2 = 2 % 2;
        int i3 = f27015 + 29;
        f27016 = i3 % 128;
        if (i3 % 2 == 0) {
            m28333().m28550();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (i < m28333().m28550()) {
            return false;
        }
        int i4 = f27016 + 51;
        f27015 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.af$3, reason: invalid class name */
    final class AnonymousClass3 implements InterfaceC12046iv, C12052ja.b {
        AnonymousClass3() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.C12052ja.b
        /* JADX INFO: renamed from: ﾇ */
        public final void mo28401(List<C12054jc> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<C12054jc> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new C11815ag(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (C11815ag c11815ag = (C11815ag) priorityQueue.poll(); c11815ag != null; c11815ag = (C11815ag) priorityQueue.poll()) {
                            if (C11814af.m28372(C11814af.this, c11815ag)) {
                                if (TextUtils.isEmpty(c11815ag.m28418())) {
                                    c11815ag.m28420(C11814af.m28337(C11814af.this).m30732().m28576());
                                }
                                arrayList.add(c11815ag);
                            } else {
                                C11814af.m28335(C11814af.this).m30600(c11815ag.m28415());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        C11814af.m28374(C11814af.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    C11814af.m28347(C11814af.this);
                    return;
                }
            }
            C11814af.m28347(C11814af.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12046iv
        /* JADX INFO: renamed from: ﻐ */
        public final void mo28398(C12045iu c12045iu) {
            C11814af.m28347(C11814af.this);
            C11814af.m28373(C11814af.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12046iv
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28399(C12045iu c12045iu, String str) {
            C11814af.m28347(C11814af.this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a8 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x00a8, please report this as an issue */
    /* JADX INFO: renamed from: ﭸ */
    private synchronized void m28336() {
        int i;
        int i2 = 2 % 2;
        int i3 = f27015 + 105;
        f27016 = i3 % 128;
        int i4 = i3 % 2;
        if (!(!m28340())) {
            int i5 = f27016 + 35;
            f27015 = i5 % 128;
            if (i5 % 2 != 0) {
                TextUtils.isEmpty(this.f27034.m30732().m28576());
                throw null;
            }
            if (!TextUtils.isEmpty(this.f27034.m30732().m28576()) && !m28338()) {
                m28366(true);
                C12085l.m30917(m28359(new int[]{1893172733, -1766012382, -1070354512, 1151713783, 1834144881, -98241182}, 9 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m28358(26 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 99 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 39925)).intern());
                this.f27035.m30598(m28333().m28550(), new AnonymousClass3());
            }
            i = f27016 + 43;
            f27015 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } else {
            i = f27016 + 43;
            f27015 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﻐ */
    private boolean m28356(C11815ag c11815ag) {
        int i = 2 % 2;
        int i2 = f27015 + 113;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        AbstractC11823ao abstractC11823aoM28472 = AbstractC11823ao.m28472();
        String strM28419 = c11815ag.m28419();
        if (i3 != 0) {
            return abstractC11823aoM28472.mo28501(strM28419, this.f27021);
        }
        boolean zMo28501 = abstractC11823aoM28472.mo28501(strM28419, this.f27021);
        int i4 = 71 / 0;
        return zMo28501;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.af$2, reason: invalid class name */
    class AnonymousClass2 implements C11813ae.b {

        /* JADX INFO: renamed from: ﻐ */
        final /* synthetic */ JSONArray f27057;

        /* JADX INFO: renamed from: ﻛ */
        final /* synthetic */ List f27058;

        /* JADX INFO: renamed from: ｋ */
        final /* synthetic */ InterfaceC12046iv f27059;

        AnonymousClass2(JSONArray jSONArray, List list, InterfaceC12046iv interfaceC12046iv) {
            this.f27057 = jSONArray;
            this.f27058 = list;
            this.f27059 = interfaceC12046iv;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.C11813ae.b
        public void onEventGenerated(JSONObject jSONObject) {
            C11814af.m28351(C11814af.this).m28435(jSONObject);
            C11814af.m28329(C11814af.this).m30566(C11814af.m28339(C11814af.this).m28471(C11814af.m28331(C11814af.this)), jSONObject, new InterfaceC12046iv() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2.5

                /* JADX INFO: renamed from: ﻐ */
                private static int f27061 = 1;

                /* JADX INFO: renamed from: ｋ */
                private static int f27063;

                /* JADX INFO: renamed from: ﻛ */
                private static char[] f27062 = {'A', 52741, 40119, 27437, 14805, 2147, 55019, 42126, 29483, 'G', 52740, 40098, 27489, 14797, 2103, 55025, 42136, 29499, 16800, 4171, 57066, 44407, 31567, 18856, 6176, 59075, 46443, 33769, 20895, 8239, 61090, 48402, 35835, 23143, 10241, 63230, 50490, 37841, 25201, 12526, 65200, 52502, 39854, 27224, 14549, 1837, 17932, 34907, 56036, 11643, 32647, 20000, 37044, 58076, 13664, 1980, 22022, 39075, 60213, 15684, 4005, 24173, 41117, 62251, 50615, 6089, 26147, 43247, 64260, 52662, 7231, 28172, 45298, 33651, 54661, 9252, 30352, 47324, 35674, 56826, 11293, 32464, 16755, 37743, 58834, 13414, 1735, 18702, 39860, 60885, 15435, 3839, 20747, 41865, 61994, 50206, 5785, ' '};

                /* JADX INFO: renamed from: ﾒ */
                private static long f27064 = -8070388211069038997L;

                @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12046iv
                /* JADX INFO: renamed from: ﻐ */
                public final void mo28398(final C12045iu c12045iu) {
                    final int iM30528 = c12045iu.m30525().m30528();
                    final String strM30529 = c12045iu.m30525().m30529();
                    if (iM30528 >= 200 && iM30528 <= 299) {
                        C12085l.m30913(m28397(9 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), m28397(37 - View.getDefaultSize(0, 0), Color.alpha(0) + 9, (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern(), AnonymousClass2.this.f27057);
                        Iterator it = AnonymousClass2.this.f27058.iterator();
                        while (it.hasNext()) {
                            C11814af.m28335(C11814af.this).m30600(((C11815ag) it.next()).m28415());
                        }
                        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2.5.3
                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo28224() {
                                AnonymousClass2.this.f27059.mo28398(c12045iu);
                            }
                        });
                        return;
                    }
                    if (iM30528 == 403) {
                        synchronized (C11814af.this) {
                            for (final C12056je.a aVar : C11814af.m28334(C11814af.this)) {
                                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2.5.5
                                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                    /* JADX INFO: renamed from: ﻛ */
                                    public final void mo28224() {
                                        aVar.mo30652();
                                    }
                                });
                            }
                        }
                    } else {
                        String strIntern = m28397(9 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getCapsMode("", 0, 0), (char) View.getDefaultSize(0, 0)).intern();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m28397(50 - TextUtils.lastIndexOf("", '0'), MotionEvent.axisFromString("") + 47, (char) (18015 - (ViewConfiguration.getTouchSlop() >> 8))).intern());
                        sb.append(iM30528);
                        sb.append(m28397(KeyEvent.getDeadChar(0, 0) + 1, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 96, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern());
                        sb.append(strM30529);
                        C12085l.m30917(strIntern, sb.toString());
                    }
                    C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2.5.1

                        /* JADX INFO: renamed from: ﱟ */
                        private static int f27067 = 1;

                        /* JADX INFO: renamed from: ﺙ */
                        private static int f27068;

                        /* JADX INFO: renamed from: ﾒ */
                        private static char[] f27069 = {'S', 13824, 27827, 41768, 55752, 4163, 18163, 32103, 45855, 59847, Typography.doubleDagger, 22176, 36186, 50135, 64050, 12534, 26242, 40240, 54176, 2650, 16524, 30572, 44515, 58253, 6656, 20727, 34613, 48592, 62538, 10999, 24903, 38663, 52613, 1057, 15050, 28931, 42940, 56908, 5141, 19101, 33144, 47029, 61011, 9430, 23396, 37356, 51100, 65042, 13493, 27397, 41358, ' '};

                        /* JADX INFO: renamed from: ﮐ */
                        private static long f27066 = 2105381007936730735L;

                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            int i = 2 % 2;
                            InterfaceC12046iv interfaceC12046iv = AnonymousClass2.this.f27059;
                            C12045iu c12045iu2 = c12045iu;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m28400(TextUtils.indexOf("", "", 0) + 51, ExpandableListView.getPackedPositionType(0L), (char) TextUtils.getOffsetAfter("", 0)).intern());
                            sb2.append(iM30528);
                            sb2.append(m28400((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 51 - View.MeasureSpec.getSize(0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern());
                            sb2.append(strM30529);
                            interfaceC12046iv.mo28399(c12045iu2, sb2.toString());
                            int i2 = f27067 + 89;
                            f27068 = i2 % 128;
                            if (i2 % 2 == 0) {
                                return;
                            }
                            Object obj = null;
                            super.hashCode();
                            throw null;
                        }

                        /* JADX INFO: renamed from: ﾒ */
                        private static String m28400(int i, int i2, char c) {
                            String str;
                            synchronized (C11862c.f28047) {
                                char[] cArr = new char[i];
                                C11862c.f28048 = 0;
                                while (C11862c.f28048 < i) {
                                    cArr[C11862c.f28048] = (char) ((((long) f27069[C11862c.f28048 + i2]) ^ (((long) C11862c.f28048) * f27066)) ^ ((long) c));
                                    C11862c.f28048++;
                                }
                                str = new String(cArr);
                            }
                            return str;
                        }
                    });
                }

                @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12046iv
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28399(final C12045iu c12045iu, final String str) {
                    int i = 2 % 2;
                    C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2.5.4
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            AnonymousClass2.this.f27059.mo28399(c12045iu, str);
                        }
                    });
                    int i2 = f27061 + 103;
                    f27063 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }

                /* JADX INFO: renamed from: ﻐ */
                private static String m28397(int i, int i2, char c) {
                    String str;
                    synchronized (C11862c.f28047) {
                        char[] cArr = new char[i];
                        C11862c.f28048 = 0;
                        while (C11862c.f28048 < i) {
                            cArr[C11862c.f28048] = (char) ((((long) f27062[C11862c.f28048 + i2]) ^ (((long) C11862c.f28048) * f27064)) ^ ((long) c));
                            C11862c.f28048++;
                        }
                        str = new String(cArr);
                    }
                    return str;
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ﾇ */
    private void m28371(List<C11815ag> list, InterfaceC12046iv interfaceC12046iv) {
        int i = 2 % 2;
        JSONArray jSONArray = new JSONArray();
        for (C11815ag c11815ag : list) {
            int i2 = f27016 + 95;
            f27015 = i2 % 128;
            int i3 = i2 % 2;
            JSONObject jSONObjectM28416 = c11815ag.m28416();
            if (!jSONObjectM28416.has(m28359(new int[]{-156330497, -548739218}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 3).intern())) {
                int i4 = f27015 + 9;
                f27016 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    jSONObjectM28416.put(m28359(new int[]{-156330497, -548739218}, 2 - MotionEvent.axisFromString("")).intern(), jSONObjectM28416.optLong(C12035ik.f29407));
                } catch (JSONException unused) {
                }
            }
            if (this.f27024.m28435(jSONObjectM28416)) {
                int i6 = f27015 + 77;
                f27016 = i6 % 128;
                if (i6 % 2 == 0) {
                    this.f27035.m30601(c11815ag.m28415(), (AbstractRunnableC12044it) null);
                    throw null;
                }
                this.f27035.m30601(c11815ag.m28415(), (AbstractRunnableC12044it) null);
            }
            jSONArray.put(jSONObjectM28416);
            int i7 = f27015 + 63;
            f27016 = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f27034.m28324(jSONArray, this.f27032.m30564().m30541(), new AnonymousClass2(jSONArray, list, interfaceC12046iv));
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m28375(JSONObject jSONObject, AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        m28361(jSONObject);
        C11815ag c11815ag = new C11815ag(C12052ja.m30595(jSONObject));
        c11815ag.m28417(m28333().m28549());
        this.f27035.m30601(c11815ag.m28415(), abstractRunnableC12044it);
        m28353(c11815ag.m28416());
        C12089p.m30938(abstractRunnableC12044it);
        int i2 = f27016 + 105;
        f27015 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28353(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (C12092s.m30994().m31001()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f27027);
            }
            C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.af.1
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC11817ai) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m28361(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27015 + 99;
        f27016 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<String> it = m28333().m28553().iterator();
        while (it.hasNext()) {
            int i4 = f27016 + 31;
            f27015 = i4 % 128;
            int i5 = i4 % 2;
            jSONObject.remove(it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX INFO: renamed from: ﬤ */
    private int m28328() {
        int i = 2 % 2;
        int i2 = f27016 + 101;
        f27015 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
            if (m28333() != null) {
                if (!AbstractC11823ao.m28472().mo28491()) {
                    int i4 = f27016 + 69;
                    f27015 = i4 % 128;
                    int i5 = i4 % 2;
                    return m28333().m28552();
                }
            }
        } else if (m28333() != null) {
            if (!AbstractC11823ao.m28472().mo28491()) {
                int i6 = f27016 + 69;
                f27015 = i6 % 128;
                int i7 = i6 % 2;
                return m28333().m28552();
            }
        }
        int i8 = f27016 + 35;
        f27015 = i8 % 128;
        int i9 = i8 % 2;
        return 100;
    }

    /* JADX INFO: renamed from: ףּ */
    private String m28330() {
        int i = 2 % 2;
        if (AbstractC11823ao.m28472().mo28491()) {
            String strM28546 = m28333().m28546();
            int i2 = f27015 + 45;
            f27016 = i2 % 128;
            int i3 = i2 % 2;
            return strM28546;
        }
        int i4 = f27016 + 109;
        f27015 = i4 % 128;
        int i5 = i4 % 2;
        String strM28547 = m28333().m28547();
        int i6 = f27016 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27015 = i6 % 128;
        if (i6 % 2 == 0) {
            return strM28547;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28358(int i, int i2, char c) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i) {
                cArr[C11862c.f28048] = (char) ((((long) f27019[C11862c.f28048 + i2]) ^ (((long) C11862c.f28048) * f27017)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28359(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f27018.clone();
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
}
