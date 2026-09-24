package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.p300io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ao */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11823ao extends AnonymousClass3 {

    /* JADX INFO: renamed from: ﾇ */
    private static AbstractC11823ao f27182;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ao$a */
    public interface a {
        /* JADX INFO: renamed from: ﻛ */
        void mo28510();

        /* JADX INFO: renamed from: ｋ */
        void mo28511();
    }

    /* JADX INFO: renamed from: リ */
    public abstract int mo28473();

    /* JADX INFO: renamed from: ヮ */
    public abstract boolean mo28474();

    /* JADX INFO: renamed from: ヶ */
    public abstract boolean mo28475();

    /* JADX INFO: renamed from: 丫 */
    public abstract long mo28476();

    /* JADX INFO: renamed from: 乁 */
    public abstract List mo28477();

    /* JADX INFO: renamed from: 爫 */
    public abstract void mo28478();

    /* JADX INFO: renamed from: ﬤ */
    public abstract int mo28479();

    /* JADX INFO: renamed from: טּ */
    public abstract JSONObject mo28480();

    /* JADX INFO: renamed from: סּ */
    public abstract int mo28481();

    /* JADX INFO: renamed from: ףּ */
    public abstract String mo28482();

    /* JADX INFO: renamed from: ﭖ */
    public abstract String mo28483();

    /* JADX INFO: renamed from: ﭴ */
    public abstract C11824ap mo28484();

    /* JADX INFO: renamed from: ﭸ */
    public abstract C11830av mo28485();

    /* JADX INFO: renamed from: ﮉ */
    public abstract C11825aq mo28486();

    /* JADX INFO: renamed from: ﮌ */
    public abstract C11826ar mo28487();

    /* JADX INFO: renamed from: ﮐ */
    public abstract int mo28488();

    /* JADX INFO: renamed from: ﱟ */
    public abstract double mo28489();

    /* JADX INFO: renamed from: ﱡ */
    public abstract double mo28490();

    /* JADX INFO: renamed from: ﺙ */
    public abstract boolean mo28491();

    /* JADX INFO: renamed from: ﻏ */
    public abstract boolean mo28492();

    /* JADX INFO: renamed from: ﻐ */
    public abstract Map<String, C11832ax> mo28493();

    /* JADX INFO: renamed from: ﻐ */
    public abstract void mo28494(Context context, C11827as c11827as, boolean z);

    /* JADX INFO: renamed from: ﻐ */
    public abstract void mo28495(InterfaceC11828at interfaceC11828at);

    /* JADX INFO: renamed from: ﻐ */
    public abstract void mo28496(C12050iz c12050iz);

    /* JADX INFO: renamed from: ﻛ */
    public abstract String mo28497(String str);

    /* JADX INFO: renamed from: ﻛ */
    public abstract void mo28498(InterfaceC11828at interfaceC11828at);

    /* JADX INFO: renamed from: ﻛ */
    public abstract void mo28499(JSONObject jSONObject);

    /* JADX INFO: renamed from: ﻛ */
    public abstract boolean mo28500();

    /* JADX INFO: renamed from: ﻛ */
    public abstract boolean mo28501(String str, String str2);

    /* JADX INFO: renamed from: ｋ */
    public abstract void mo28502(InterfaceC11828at interfaceC11828at);

    /* JADX INFO: renamed from: ｋ */
    public abstract boolean mo28503();

    /* JADX INFO: renamed from: ﾇ */
    public abstract void mo28504(Context context, C12049iy c12049iy, C11822an c11822an, a aVar, boolean z);

    /* JADX INFO: renamed from: ﾇ */
    public abstract boolean mo28505();

    /* synthetic */ AbstractC11823ao(byte b) {
        this();
    }

    /* JADX INFO: renamed from: ﾒ */
    public static synchronized AbstractC11823ao m28472() {
        if (f27182 == null) {
            f27182 = new c();
        }
        return f27182;
    }

    private AbstractC11823ao() {
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ao$c */
    static class c extends AbstractC11823ao {

        /* JADX INFO: renamed from: Ⅽ */
        private static int f27185 = 1;

        /* JADX INFO: renamed from: く */
        private static int f27186 = -1862764672;

        /* JADX INFO: renamed from: っ */
        private static short[] f27187 = null;

        /* JADX INFO: renamed from: へ */
        private static int f27188 = 75;

        /* JADX INFO: renamed from: ゥ */
        private static byte[] f27189 = {36, Ascii.NAK, 44, 96, 81, 80, 114, -124, -105, -120, -106, 116, 120, 125, 114, 121, -122, 120, 107, 127, 124, -126, 109, -66, 70, 120, -80, 50, -123, -73, Base64.padSymbol, -126, 124, 121, 119, 124, 124, 105, 120, -30, -23, -10, -37, 40, -15, -93, -7, -35, -7, -24, -36, 48, -74, -33, -23, -24, -22, -26, -29, -21, -24, -28, Ascii.ESC, -83, -28, -23, -34, -27, -14, -41, 126, -127, 103, -119, -67, 51, 106, -118, 119, -70, 49, 113, 125, 109, -117, 116, 107, -121, -69, 38, 123, 117, 120, -91, -41, -57, -47, -100, -115, -50, -37, 83, 86, 67, -77, -94, -65, -48, -57, -76, -48, -21, -101, -31, -89, -57, -55, -63, -41, -60, -67, -58, -59, -14, -107, -43, -60, Ascii.f22490CR, 120, -53, Ascii.f22499SI, 116, -55, -61, -58, -13, 51, 60, Ascii.f22494GS, 49, 62, 40, 52, 69, Ascii.f22502US, 33, 67, 45, 36, 75, 19, 51, 43, 65, 46, 39, 48, 47, 92, -1, 49, 66, 37, 110, -19, Base64.padSymbol, 51, 99, -9, 41, 47, 51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        /* JADX INFO: renamed from: ト */
        private static int f27190 = 0;

        /* JADX INFO: renamed from: リ */
        private static char f27191 = 55477;

        /* JADX INFO: renamed from: ヮ */
        private static int f27192 = 202881931;

        /* JADX INFO: renamed from: ヶ */
        private static int f27193;

        /* JADX INFO: renamed from: 丫 */
        private static long f27194;

        /* JADX INFO: renamed from: 乁 */
        private boolean f27195;

        /* JADX INFO: renamed from: 爫 */
        private int f27196;

        /* JADX INFO: renamed from: ﬤ */
        private boolean f27197;

        /* JADX INFO: renamed from: טּ */
        private boolean f27198;

        /* JADX INFO: renamed from: סּ */
        private List f27199;

        /* JADX INFO: renamed from: ףּ */
        private C11822an f27200;

        /* JADX INFO: renamed from: ﭖ */
        private a f27201;

        /* JADX INFO: renamed from: ﭴ */
        private List<InterfaceC11828at> f27202;

        /* JADX INFO: renamed from: ﭸ */
        private InterfaceC11828at f27203;

        /* JADX INFO: renamed from: ﮉ */
        private List<InterfaceC11828at> f27204;

        /* JADX INFO: renamed from: ﮌ */
        private C11825aq f27205;

        /* JADX INFO: renamed from: ﮐ */
        private C12049iy f27206;

        /* JADX INFO: renamed from: ﱟ */
        private C11824ap f27207;

        /* JADX INFO: renamed from: ﱡ */
        private Handler f27208;

        /* JADX INFO: renamed from: ﺙ */
        private C11830av f27209;

        /* JADX INFO: renamed from: ﻏ */
        private C11826ar f27210;

        /* JADX INFO: renamed from: ﻐ */
        private final int f27211;

        /* JADX INFO: renamed from: ﻛ */
        private final int f27212;

        /* JADX INFO: renamed from: ｋ */
        private final int f27213;

        /* JADX INFO: renamed from: ﾇ */
        private final int f27214;

        /* JADX INFO: renamed from: ﾒ */
        private C12056je f27215;

        /* JADX INFO: renamed from: ﮐ */
        static /* synthetic */ int m28515(c cVar) {
            int i = 2 % 2;
            int i2 = f27190;
            int i3 = i2 + 11;
            f27185 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = cVar.f27196;
            cVar.f27196 = i5 + 1;
            int i6 = i2 + 79;
            f27185 = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        /* JADX INFO: renamed from: ﱟ */
        static /* synthetic */ InterfaceC11828at m28516(c cVar) {
            int i = 2 % 2;
            int i2 = f27190;
            int i3 = i2 + 7;
            f27185 = i3 % 128;
            int i4 = i3 % 2;
            InterfaceC11828at interfaceC11828at = cVar.f27203;
            int i5 = i2 + 115;
            f27185 = i5 % 128;
            int i6 = i5 % 2;
            return interfaceC11828at;
        }

        /* JADX INFO: renamed from: ﱡ */
        static /* synthetic */ Handler m28517(c cVar) {
            int i = 2 % 2;
            int i2 = f27190 + 81;
            f27185 = i2 % 128;
            int i3 = i2 % 2;
            Handler handler = cVar.f27208;
            if (i3 != 0) {
                return handler;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﺙ */
        static /* synthetic */ int m28518(c cVar) {
            int i = 2 % 2;
            int i2 = f27185 + 45;
            f27190 = i2 % 128;
            if (i2 % 2 != 0) {
                cVar.m28512();
                throw null;
            }
            int iM28512 = cVar.m28512();
            int i3 = f27185 + 15;
            f27190 = i3 % 128;
            int i4 = i3 % 2;
            return iM28512;
        }

        /* JADX INFO: renamed from: ﻐ */
        static /* synthetic */ List m28520(c cVar) {
            int i = 2 % 2;
            int i2 = f27190 + 47;
            f27185 = i2 % 128;
            int i3 = i2 % 2;
            List<InterfaceC11828at> list = cVar.f27202;
            if (i3 != 0) {
                return list;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ */
        static /* synthetic */ a m28522(c cVar) {
            int i = 2 % 2;
            int i2 = f27190 + 13;
            int i3 = i2 % 128;
            f27185 = i3;
            int i4 = i2 % 2;
            a aVar = cVar.f27201;
            int i5 = i3 + 77;
            f27190 = i5 % 128;
            int i6 = i5 % 2;
            return aVar;
        }

        /* JADX INFO: renamed from: ｋ */
        static /* synthetic */ void m28523(c cVar) {
            int i = 2 % 2;
            int i2 = f27185 + 35;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            cVar.m28513();
            int i4 = f27190 + 9;
            f27185 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        static /* synthetic */ void m28524(JSONObject jSONObject, long j) {
            int i = 2 % 2;
            int i2 = f27185 + 115;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            m28527(jSONObject, j);
            int i4 = f27185 + 43;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX INFO: renamed from: ﾇ */
        static /* synthetic */ C12056je m28526(c cVar) {
            int i = 2 % 2;
            int i2 = f27185 + 33;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            C12056je c12056je = cVar.f27215;
            if (i3 == 0) {
                return c12056je;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ */
        static /* synthetic */ InterfaceC11828at m28529(c cVar, InterfaceC11828at interfaceC11828at) {
            int i = 2 % 2;
            int i2 = f27185;
            int i3 = i2 + 57;
            f27190 = i3 % 128;
            int i4 = i3 % 2;
            cVar.f27203 = interfaceC11828at;
            int i5 = i2 + 63;
            f27190 = i5 % 128;
            if (i5 % 2 == 0) {
                return interfaceC11828at;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ */
        static /* synthetic */ List m28531(c cVar) {
            int i = 2 % 2;
            int i2 = f27185 + 51;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            List<InterfaceC11828at> list = cVar.f27204;
            if (i3 != 0) {
                int i4 = 16 / 0;
            }
            return list;
        }

        public c() {
            super((byte) 0);
            m28519("툔\u1c38羟", (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4569), "\u0000\u0000\u0000\u0000", 938960735 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "庫\uf767\ud937㜑").intern();
            m28519("\uf562击ﵰ", (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26311), "\u0000\u0000\u0000\u0000", (Process.myPid() >> 22) + 453140424, "좋ɟ젛ﵦ").intern();
            m28519("⸪髅㣃矃", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5229), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollDefaultDelay() >> 16, "鵕\ue22f溢ﴔ").intern();
            m28530((-202881931) - KeyEvent.keyCodeFromString(""), (short) ((-29) - TextUtils.lastIndexOf("", '0', 0)), 1862764771 - (ViewConfiguration.getTapTimeout() >> 16), (byte) View.getDefaultSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 72).intern();
            m28530((-202881927) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((-84) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 1862764782, (byte) Color.blue(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 72).intern();
            m28530((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 202881926, (short) (123 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1862764769, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0, 0) - 71).intern();
            m28519("ᱚ쏸ﾉ鍮", (char) (44282 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "謇騫\ufa6f햬").intern();
            m28519("\ud84e캆\uf0c3", (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5360), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 905167905, "⇥\uf3c4\uf035爔").intern();
            m28530((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 202881922, (short) (ImageFormat.getBitsPerPixel(0) + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), (ViewConfiguration.getEdgeSlop() >> 16) + 1862764787, (byte) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) - 71).intern();
            TimeUnit.HOURS.toMillis(24L);
            this.f27211 = (int) TimeUnit.SECONDS.toMillis(5L);
            this.f27212 = (int) TimeUnit.HOURS.toMillis(12L);
            this.f27214 = (int) TimeUnit.SECONDS.toMillis(3L);
            this.f27213 = (int) TimeUnit.SECONDS.toMillis(10L);
            this.f27196 = 0;
            this.f27199 = null;
            this.f27195 = false;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﾇ */
        public final void mo28504(Context context, C12049iy c12049iy, C11822an c11822an, a aVar, boolean z) {
            int i = 2 % 2;
            this.f27215 = new C12056je(context, m28530((-202881919) - View.getDefaultSize(0, 0), (short) ((ViewConfiguration.getScrollBarSize() >> 8) - 122), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1862764787, (byte) ((Process.getThreadPriority(0) + 20) >> 6), (-47) - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m28530((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 202881892, (short) (23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1862764786 - TextUtils.lastIndexOf("", '0', 0), (byte) ExpandableListView.getPackedPositionType(0L), View.resolveSize(0, 0) - 55).intern());
            this.f27206 = c12049iy;
            this.f27198 = false;
            this.f27197 = z;
            this.f27200 = c11822an;
            this.f27208 = new Handler(Looper.getMainLooper());
            C11829au c11829au = new C11829au();
            this.f27209 = new C11830av(c11829au);
            this.f27207 = new C11824ap(c11829au);
            this.f27210 = new C11826ar(c11829au);
            this.f27205 = new C11825aq();
            mo28509(m28514());
            m28508(c11829au);
            this.f27201 = aVar;
            this.f27204 = new ArrayList();
            this.f27202 = new ArrayList();
            int i2 = f27185 + 37;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﭸ */
        public final C11830av mo28485() {
            int i = 2 % 2;
            int i2 = f27185 + 59;
            int i3 = i2 % 128;
            f27190 = i3;
            int i4 = i2 % 2;
            C11830av c11830av = this.f27209;
            int i5 = i3 + 89;
            f27185 = i5 % 128;
            int i6 = i5 % 2;
            return c11830av;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﭴ */
        public final C11824ap mo28484() {
            int i = 2 % 2;
            int i2 = f27185 + 101;
            int i3 = i2 % 128;
            f27190 = i3;
            int i4 = i2 % 2;
            C11824ap c11824ap = this.f27207;
            int i5 = i3 + 15;
            f27185 = i5 % 128;
            int i6 = i5 % 2;
            return c11824ap;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﮌ */
        public final C11826ar mo28487() {
            int i = 2 % 2;
            int i2 = f27190;
            int i3 = i2 + 7;
            f27185 = i3 % 128;
            int i4 = i3 % 2;
            C11826ar c11826ar = this.f27210;
            int i5 = i2 + 71;
            f27185 = i5 % 128;
            if (i5 % 2 != 0) {
                return c11826ar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﮉ */
        public final C11825aq mo28486() {
            int i = 2 % 2;
            int i2 = f27190 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f27185 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.f27205;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﺙ */
        public final boolean mo28491() {
            int i = 2 % 2;
            int i2 = f27185 + 37;
            int i3 = i2 % 128;
            f27190 = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            boolean z = this.f27197;
            int i4 = i3 + 71;
            f27185 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 31 / 0;
            }
            return z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: 爫 */
        public final synchronized void mo28478() {
            int i = 2 % 2;
            Object obj = null;
            this.f27208.removeCallbacksAndMessages(null);
            this.f27208 = null;
            C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.2
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    c.m28531(c.this).clear();
                    c.m28520(c.this).clear();
                    c.m28529(c.this, null);
                }
            });
            int i2 = f27190 + 33;
            f27185 = i2 % 128;
            if (i2 % 2 == 0) {
                super.hashCode();
                throw null;
            }
        }

        /* JADX INFO: renamed from: ト */
        public final synchronized C12049iy m28534() {
            int i = 2 % 2;
            int i2 = f27185 + 33;
            int i3 = i2 % 128;
            f27190 = i3;
            int i4 = i2 % 2;
            C12049iy c12049iy = this.f27206;
            int i5 = i3 + 43;
            f27185 = i5 % 128;
            if (i5 % 2 != 0) {
                return c12049iy;
            }
            int i6 = 1 / 0;
            return c12049iy;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0049 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:26:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:16:0x0049, please report this as an issue */
        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao.AnonymousClass3
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo28509(JSONObject jSONObject) {
            int i;
            int i2 = 2 % 2;
            Object obj = null;
            if (!(!m28528(jSONObject))) {
                int i3 = f27190 + 21;
                f27185 = i3 % 128;
                if (i3 % 2 == 0) {
                    m28521(jSONObject);
                    super.hashCode();
                    throw null;
                }
                m28521(jSONObject);
                int i4 = 2 % 2;
                super.mo28509(jSONObject);
                this.f27209.mo28509(jSONObject);
                this.f27207.mo28509(jSONObject);
                this.f27210.mo28509(jSONObject);
                this.f27205.mo28509(jSONObject);
                i = f27185 + 107;
                f27190 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            } else {
                super.mo28509(jSONObject);
                this.f27209.mo28509(jSONObject);
                this.f27207.mo28509(jSONObject);
                this.f27210.mo28509(jSONObject);
                this.f27205.mo28509(jSONObject);
                i = f27185 + 107;
                f27190 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }
            throw th;
        }

        /* JADX INFO: renamed from: ﻐ */
        public final synchronized void m28535(boolean z) {
            int i = 2 % 2;
            int i2 = f27185 + 109;
            f27190 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f27198 = z;
                Object obj = null;
                super.hashCode();
                throw null;
            }
            this.f27198 = z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻏ */
        public final synchronized boolean mo28492() {
            boolean z;
            int i = 2 % 2;
            int i2 = f27185 + 89;
            int i3 = i2 % 128;
            f27190 = i3;
            int i4 = i2 % 2;
            z = this.f27198;
            int i5 = i3 + 19;
            f27185 = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            return z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻐ */
        public final void mo28496(C12050iz c12050iz) {
            int i = 2 % 2;
            int i2 = f27185 + 53;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            m28506().m28589(c12050iz);
            int i4 = f27190 + 87;
            f27185 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX INFO: renamed from: Ⅽ */
        private JSONObject m28514() {
            int i = 2 % 2;
            int i2 = f27185 + 85;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            String strM30642 = this.f27215.m30642(m28530((ViewConfiguration.getFadingEdgeLength() >> 16) - 202881873, (short) (View.resolveSizeAndState(0, 0, 0) + 26), 1862764786 - Drawable.resolveOpacity(0, 0), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-63) - ImageFormat.getBitsPerPixel(0)).intern());
            if (strM30642 != null) {
                try {
                    return new JSONObject(strM30642);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObject = new JSONObject();
            int i4 = f27185 + 105;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
            return jSONObject;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻐ */
        public final void mo28494(final Context context, final C11827as c11827as, boolean z) {
            int i = 2 % 2;
            int i2 = f27190 + 11;
            f27185 = i2 % 128;
            int i3 = i2 % 2;
            if (z) {
                C12089p.m30939(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.5
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        if (!c.this.m28534().m30564().m30541()) {
                            c.m28522(c.this).mo28511();
                        } else {
                            if (c.this.mo28492()) {
                                return;
                            }
                            c.m28522(c.this).mo28510();
                        }
                    }
                }, AbstractC11823ao.m28472().mo28481());
                int i4 = f27185 + 101;
                f27190 = i4 % 128;
                int i5 = i4 % 2;
            }
            m28535(false);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new C12069jr(context, c11827as, mo28476()).mo28325(new JSONObject(), m28534().m30564().m30541(), true, false);
            } catch (JSONException e) {
                C12085l.m30922(m28519("⬧凑䊻詎鹀잿鑎\uf3ce䷦镃掖ሶ", (char) Color.green(0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getFadingEdgeLength() >> 16, "Ჱ\ue921裎㨷").intern(), m28530((ViewConfiguration.getLongPressTimeout() >> 16) - 202881861, (short) ((-120) - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1862764741, (byte) ExpandableListView.getPackedPositionType(0L), (-50) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), e);
            }
            m28534().m30566(this.f27200.m28470(m28530((-202881837) - View.resolveSize(0, 0), (short) (52 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1862764777 - TextUtils.getOffsetBefore("", 0), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), (-71) - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()), jSONObject, new InterfaceC12046iv() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.4

                /* JADX INFO: renamed from: ﱟ */
                private static int f27221 = 0;

                /* JADX INFO: renamed from: ﱡ */
                private static int f27222 = 1;

                /* JADX INFO: renamed from: ﾇ */
                private static char[] f27223 = {132, 260, 263, 166, 187, Typography.half, 186, 194, 195, 151, 185, 200, 195, 193, 185, Typography.greater, 't', 'p', 'x', '4', 'e', 'b', 'b', 'H', 'J', 'h', 'g', 'j', 'n', 'i', 'j', 'k', '9', 'k', 'i', 'n', 'q', 'l', 'B', 'A', 'i', 'n', 'j', 'g', 'h', 'C', 'E', 'n', 'q', 'n', 'Y', AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'H', 'h', 'i', 'r', 'n', 'k', 'j', 'C'};

                /* JADX INFO: renamed from: ﾒ */
                private static char[] f27224 = {62719, 15850, 26281, 44886, 53253, 6432, 17389, 29871, 48449, 58891, 12094, 20964, 39656, 49993, 62467, 15666, 26617, 43174, 53580, 6656, 17204, 30115, 48813, 59222, 10250, 20785, 39915, 52394, 62722, 25039, 43259, 62377, 3039, 49899, 11550, 58412, 25886, 44058, 63311, 16045, 16869, 34948, 53774, 58715, 11447, 30692, 48844, 49156, 2904, 21228, 26098, 44233, 62981, 14686, 16548, 35829, 53895, 58386, 12107, 30369, 47614, 49280, 2566, 23903, 25789, 45034, 63172, 14340, 17153, 35560};

                /* JADX INFO: renamed from: ﮐ */
                private static long f27220 = 1788524011777804595L;

                @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12046iv
                /* JADX INFO: renamed from: ﻐ */
                public final void mo28398(C12045iu c12045iu) {
                    int i6;
                    int i7;
                    int i8 = 2 % 2;
                    try {
                        int iM30528 = c12045iu.m30525().m30528();
                        String strM30529 = c12045iu.m30525().m30529();
                        try {
                            if (iM30528 >= 200) {
                                int i9 = f27221 + 45;
                                f27222 = i9 % 128;
                                if (i9 % 2 != 0 ? iM30528 <= 299 : iM30528 <= 23989) {
                                    JSONObject jSONObjectM30527 = c12045iu.m30527();
                                    if (!(!jSONObjectM30527.optBoolean(m28539(new int[]{0, 3, 156, 0}, "\u0000\u0000\u0001", true).intern()))) {
                                        int i10 = f27221 + 65;
                                        f27222 = i10 % 128;
                                        int i11 = i10 % 2;
                                        try {
                                            C12092s.m30994().m31002();
                                        } catch (Exception e2) {
                                            e = e2;
                                            i7 = 84;
                                            i6 = 32;
                                            int i12 = i6;
                                            C12080kb.m30841(m28539(new int[]{3, 12, i7, 1}, null, true).intern(), m28539(new int[]{i12, i12, 0, 18}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false).intern(), e, false, true);
                                        }
                                    }
                                    C12085l.m30913(m28539(new int[]{3, 12, 84, 1}, null, true).intern(), m28538(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16839852), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), jSONObjectM30527);
                                    JSONObject jSONObjectM30816 = C12077jz.m30816(jSONObjectM30527);
                                    c.this.m28536(jSONObjectM30816.optLong(m28539(new int[]{15, 4, 9, 3}, "\u0001\u0001\u0001\u0001", true).intern(), 0L));
                                    jSONObjectM30816.remove(m28538(29 - ExpandableListView.getPackedPositionGroup(0L), (char) (25020 - KeyEvent.keyCodeFromString("")), 3 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
                                    c.m28526(c.this).m30645(m28539(new int[]{19, 13, 0, 12}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true).intern(), jSONObjectM30816.toString(), null);
                                    jSONObjectM30527.put(m28538(View.resolveSize(0, 0) + 32, (char) (2987 - (KeyEvent.getMaxKeyCode() >> 16)), 2 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), C12072ju.m30752());
                                    jSONObjectM30527.put(m28538((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, (char) (11627 - KeyEvent.keyCodeFromString("")), 2 - TextUtils.indexOf("", "", 0, 0)).intern(), C12072ju.m30750());
                                    c.m28524(jSONObjectM30527, c12045iu.m30524());
                                    c.this.mo28509(jSONObjectM30527);
                                    c.m28523(c.this);
                                    m28540(c.this.m28532());
                                    return;
                                }
                                i7 = 84;
                                int i13 = i6;
                                C12080kb.m30841(m28539(new int[]{3, 12, i7, 1}, null, true).intern(), m28539(new int[]{i13, i13, 0, 18}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false).intern(), e, false, true);
                                c.m28523(c.this);
                                m28540(c.this.m28532());
                                return;
                            }
                            mo28399(c12045iu, strM30529);
                        } catch (Exception e3) {
                            e = e3;
                            i7 = 84;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i6 = 32;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0021  */
                /* JADX WARN: Code duplicated, block: B:11:0x002a  */
                /* JADX WARN: Code duplicated, block: B:13:0x0032  */
                /* JADX WARN: Code duplicated, block: B:8:0x0018  */
                @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12046iv
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28399(C12045iu c12045iu, String str) {
                    int i6;
                    int iM30528;
                    int i7 = 2 % 2;
                    int i8 = f27222 + 91;
                    int i9 = i8 % 128;
                    f27221 = i9;
                    if (i8 % 2 != 0) {
                        int i10 = 52 / 0;
                        if (c12045iu != null) {
                            i6 = i9 + 65;
                            f27222 = i6 % 128;
                            if (i6 % 2 != 0) {
                                c12045iu.m30525().m30528();
                                throw null;
                            }
                            iM30528 = c12045iu.m30525().m30528();
                        } else {
                            iM30528 = -1;
                        }
                    } else if (c12045iu != null) {
                        i6 = i9 + 65;
                        f27222 = i6 % 128;
                        if (i6 % 2 != 0) {
                            c12045iu.m30525().m30528();
                            throw null;
                        }
                        iM30528 = c12045iu.m30525().m30528();
                    } else {
                        iM30528 = -1;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(m28538(TextUtils.getTrimmedLength("") + 36, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25946), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34).intern());
                    sb.append(iM30528);
                    C12085l.m30912(m28539(new int[]{3, 12, 84, 1}, null, true).intern(), sb.toString());
                    if (iM30528 == 403 || c.m28515(c.this) >= c.m28518(c.this)) {
                        return;
                    }
                    int i11 = f27222 + 87;
                    f27221 = i11 % 128;
                    int i12 = i11 % 2;
                    m28540(c.this.m28533());
                }

                /* JADX INFO: renamed from: ｋ */
                private void m28540(int i6) {
                    synchronized (c.this) {
                        if (c.m28517(c.this) != null) {
                            C12089p.m30934(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.4.4
                                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                /* JADX INFO: renamed from: ﻛ */
                                public final void mo28224() {
                                    c.this.mo28494(context, c11827as, false);
                                }
                            }, i6);
                        }
                    }
                }

                /* JADX INFO: renamed from: ｋ */
                private static String m28539(int[] iArr, String str, boolean z2) throws UnsupportedEncodingException {
                    String str2;
                    Object bytes = str;
                    if (str != null) {
                        bytes = str.getBytes(C9415C.ISO88591_NAME);
                    }
                    byte[] bArr = (byte[]) bytes;
                    synchronized (C12024i.f29270) {
                        int i6 = iArr[0];
                        int i7 = iArr[1];
                        int i8 = iArr[2];
                        int i9 = iArr[3];
                        char[] cArr = new char[i7];
                        System.arraycopy(f27223, i6, cArr, 0, i7);
                        if (bArr != null) {
                            char[] cArr2 = new char[i7];
                            C12024i.f29269 = 0;
                            char c = 0;
                            while (C12024i.f29269 < i7) {
                                if (bArr[C12024i.f29269] == 1) {
                                    cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                                } else {
                                    cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                                }
                                c = cArr2[C12024i.f29269];
                                C12024i.f29269++;
                            }
                            cArr = cArr2;
                        }
                        if (i9 > 0) {
                            char[] cArr3 = new char[i7];
                            System.arraycopy(cArr, 0, cArr3, 0, i7);
                            int i10 = i7 - i9;
                            System.arraycopy(cArr3, 0, cArr, i10, i9);
                            System.arraycopy(cArr3, i9, cArr, 0, i10);
                        }
                        if (z2) {
                            char[] cArr4 = new char[i7];
                            C12024i.f29269 = 0;
                            while (C12024i.f29269 < i7) {
                                cArr4[C12024i.f29269] = cArr[(i7 - C12024i.f29269) - 1];
                                C12024i.f29269++;
                            }
                            cArr = cArr4;
                        }
                        if (i8 > 0) {
                            C12024i.f29269 = 0;
                            while (C12024i.f29269 < i7) {
                                cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                                C12024i.f29269++;
                            }
                        }
                        str2 = new String(cArr);
                    }
                    return str2;
                }

                /* JADX INFO: renamed from: ﻛ */
                private static String m28538(int i6, char c, int i7) {
                    String str;
                    synchronized (C11862c.f28047) {
                        char[] cArr = new char[i7];
                        C11862c.f28048 = 0;
                        while (C11862c.f28048 < i7) {
                            cArr[C11862c.f28048] = (char) ((((long) f27224[C11862c.f28048 + i6]) ^ (((long) C11862c.f28048) * f27220)) ^ ((long) c));
                            C11862c.f28048++;
                        }
                        str = new String(cArr);
                    }
                    return str;
                }
            });
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28499(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = f27185 + 47;
            f27190 = i2 % 128;
            if (i2 % 2 == 0) {
                mo28509(jSONObject);
                m28513();
            } else {
                mo28509(jSONObject);
                m28513();
                throw null;
            }
        }

        /* JADX INFO: renamed from: K */
        private synchronized void m28513() {
            int i = 2 % 2;
            int i2 = f27190 + 77;
            f27185 = i2 % 128;
            int i3 = i2 % 2;
            Handler handler = this.f27208;
            if (handler != null) {
                handler.post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.1
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        c.this.m28535(true);
                        if (c.m28516(c.this) != null) {
                            c.m28516(c.this).mo28394();
                        }
                        Iterator it = new ArrayList(c.m28531(c.this)).iterator();
                        while (it.hasNext()) {
                            ((InterfaceC11828at) it.next()).mo28394();
                        }
                        c.m28531(c.this).clear();
                        Iterator it2 = new ArrayList(c.m28520(c.this)).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC11828at) it2.next()).mo28394();
                        }
                    }
                });
                int i4 = f27190 + 35;
                f27185 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            int i6 = f27190 + 87;
            f27185 = i6 % 128;
            if (i6 % 2 == 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ｋ */
        public final void mo28502(final InterfaceC11828at interfaceC11828at) {
            int i = 2 % 2;
            int i2 = f27185 + 43;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            Handler handler = this.f27208;
            if (handler != null) {
                handler.post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.3
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        c.m28520(c.this).add(interfaceC11828at);
                        if (c.this.mo28492()) {
                            interfaceC11828at.mo28394();
                        }
                    }
                });
            }
            int i4 = f27185 + 29;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28498(final InterfaceC11828at interfaceC11828at) {
            int i = 2 % 2;
            int i2 = f27185 + 65;
            f27190 = i2 % 128;
            if (i2 % 2 == 0) {
                Handler handler = this.f27208;
                if (handler != null) {
                    handler.post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.9
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            if (c.this.mo28492()) {
                                interfaceC11828at.mo28394();
                            } else {
                                c.m28531(c.this).add(interfaceC11828at);
                            }
                        }
                    });
                }
                int i3 = f27185 + 5;
                f27190 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻐ */
        public final void mo28495(final InterfaceC11828at interfaceC11828at) {
            int i = 2 % 2;
            int i2 = f27190 + 47;
            f27185 = i2 % 128;
            if (i2 % 2 != 0) {
                Handler handler = this.f27208;
                if (handler != null) {
                    handler.post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.8
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            c.m28529(c.this, interfaceC11828at);
                            if (c.this.mo28492()) {
                                interfaceC11828at.mo28394();
                            }
                        }
                    });
                    int i3 = f27190 + 59;
                    f27185 = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                return;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo28505() {
            JSONObject jSONObjectM28507;
            char scrollDefaultDelay;
            int maximumDrawingCacheSize;
            int i = 2 % 2;
            int i2 = f27185 + 11;
            f27190 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM28507 = m28507();
                scrollDefaultDelay = (char) (27906 >> (ViewConfiguration.getScrollDefaultDelay() * 4));
                maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 109;
            } else {
                jSONObjectM28507 = m28507();
                scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24558);
                maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
            }
            boolean zOptBoolean = jSONObjectM28507.optBoolean(m28519("鋥䃐鱗", scrollDefaultDelay, "\u0000\u0000\u0000\u0000", maximumDrawingCacheSize - 324106576, "냰꺆\ueeec깟").intern(), false);
            int i3 = f27185 + 73;
            f27190 = i3 % 128;
            int i4 = i3 % 2;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﱡ */
        public final double mo28490() {
            JSONObject jSONObjectM28507;
            String strM28519;
            int i = 2 % 2;
            int i2 = f27190 + 97;
            f27185 = i2 % 128;
            if (i2 % 2 == 0) {
                jSONObjectM28507 = m28507();
                strM28519 = m28519("\ue7f4ᅞ灻", (char) (2265 - View.MeasureSpec.getSize(1)), "\u0000\u0000\u0000\u0000", 1254795260 >> (ViewConfiguration.getScrollBarFadeDuration() << 13), "ﱌ쪧㱊\uf25e");
            } else {
                jSONObjectM28507 = m28507();
                strM28519 = m28519("\ue7f4ᅞ灻", (char) (View.MeasureSpec.getSize(0) + 24124), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1254795260, "ﱌ쪧㱊\uf25e");
            }
            double dOptDouble = jSONObjectM28507.optDouble(strM28519.intern(), 5.0d);
            int i3 = f27190 + 29;
            f27185 = i3 % 128;
            int i4 = i3 % 2;
            return dOptDouble;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﱟ */
        public final double mo28489() {
            int i = 2 % 2;
            int i2 = f27185 + 107;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            double dOptDouble = m28507().optDouble(m28530((-202881928) - View.getDefaultSize(0, 0), (short) ((-85) - View.getDefaultSize(0, 0)), 1862764782 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) View.getDefaultSize(0, 0), View.resolveSize(0, 0) - 71).intern(), 1.0d);
            int i4 = f27185 + 63;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
            return dOptDouble;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﮐ */
        public final int mo28488() {
            C11829au c11829auM28506;
            int i = 2 % 2;
            int i2 = f27185 + 87;
            f27190 = i2 % 128;
            if (i2 % 2 != 0) {
                c11829auM28506 = m28506();
                if (c11829auM28506 == null) {
                    return 25555;
                }
            } else {
                c11829auM28506 = m28506();
                if (c11829auM28506 == null) {
                    return 3000;
                }
            }
            int iM28586 = c11829auM28506.m28586();
            int i3 = f27190 + 35;
            f27185 = i3 % 128;
            int i4 = i3 % 2;
            return iM28586;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: סּ */
        public final int mo28481() {
            JSONObject jSONObjectM28507;
            char keyRepeatDelay;
            int i = 2 % 2;
            int i2 = f27190 + 31;
            f27185 = i2 % 128;
            int i3 = 0;
            if (i2 % 2 == 0) {
                jSONObjectM28507 = m28507();
                keyRepeatDelay = (char) (21894 >>> (ViewConfiguration.getKeyRepeatDelay() * 71));
                ExpandableListView.getPackedPositionForChild(0, 0);
            } else {
                jSONObjectM28507 = m28507();
                keyRepeatDelay = (char) (5230 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1;
            }
            int iOptInt = jSONObjectM28507.optInt(m28519("⸪髅㣃矃", keyRepeatDelay, "\u0000\u0000\u0000\u0000", i3, "鵕\ue22f溢ﴔ").intern(), this.f27214);
            int i4 = f27185 + 7;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﬤ */
        public final int mo28479() {
            int i = 2 % 2;
            int i2 = f27185 + 63;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            int iOptInt = m28507().optInt(m28530((-202881932) - ImageFormat.getBitsPerPixel(0), (short) ((-29) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1862764771 - View.MeasureSpec.getSize(0), (byte) Gravity.getAbsoluteGravity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) - 71).intern(), this.f27213);
            int i4 = f27185 + 69;
            f27190 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ｋ */
        public final boolean mo28503() {
            int i = 2 % 2;
            int i2 = f27185 + 33;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            boolean zOptBoolean = m28507().optBoolean(m28530((-202881833) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 101), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1862764785, (byte) View.resolveSizeAndState(0, 0, 0), Color.argb(0, 0, 0, 0) - 72).intern(), true);
            int i4 = f27185 + 89;
            f27190 = i4 % 128;
            if (i4 % 2 == 0) {
                return zOptBoolean;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻛ */
        public final boolean mo28500() {
            int i = 2 % 2;
            int i2 = f27190 + 97;
            f27185 = i2 % 128;
            return i2 % 2 == 0 ? m28507().optBoolean(m28519("ᅩⵛ藰\ue8d3", (char) (17041 - Color.red(0)), "\u0000\u0000\u0000\u0000", 1 << TextUtils.indexOf((CharSequence) "", (char) 11, 0, 1), "ᩧ廌쬱鑔").intern(), false) : m28507().optBoolean(m28519("ᅩⵛ藰\ue8d3", (char) (Color.red(0) + 21707), "\u0000\u0000\u0000\u0000", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, "ᩧ廌쬱鑔").intern(), true);
        }

        /* JADX INFO: renamed from: へ */
        public final int m28533() {
            int i = 2 % 2;
            int i2 = f27190 + 37;
            f27185 = i2 % 128;
            int i3 = i2 % 2;
            int iOptInt = m28507().optInt(m28530(TextUtils.getCapsMode("", 0, 0) - 202881832, (short) ((ViewConfiguration.getTapTimeout() >> 16) + 52), ((byte) KeyEvent.getModifierMetaStateMask()) + 1862764772, (byte) View.combineMeasuredStates(0, 0), (-72) - TextUtils.getCapsMode("", 0, 0)).intern(), this.f27211);
            int i4 = f27185 + 65;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
            return iOptInt;
        }

        /* JADX INFO: renamed from: く */
        public final int m28532() {
            int i = 2 % 2;
            int i2 = f27190 + 49;
            f27185 = i2 % 128;
            int i3 = i2 % 2;
            int iOptInt = m28507().optInt(m28519("\ue862꘤Ŧ", (char) (ExpandableListView.getPackedPositionType(0L) + 39165), "\u0000\u0000\u0000\u0000", 837597190 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "ԟ\uecb8ﴱ覘").intern(), this.f27212);
            int i4 = f27185 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
            return iOptInt;
        }

        /* JADX INFO: renamed from: Ύ */
        private int m28512() {
            int i = 2 % 2;
            int i2 = f27185 + 47;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            int iOptInt = m28507().optInt(m28530((-202881831) - TextUtils.lastIndexOf("", '0', 0), (short) (Gravity.getAbsoluteGravity(0, 0) - 77), 1862764781 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) View.getDefaultSize(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 72).intern(), 3);
            int i4 = f27185 + 63;
            f27190 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 25 / 0;
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻐ */
        public final Map<String, C11832ax> mo28493() {
            int i = 2 % 2;
            Map<String, C11832ax> map = new HashMap<>();
            try {
                String strOptString = m28507().optString(m28530((-202881827) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (93 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1862764772 - (Process.myPid() >> 22), (byte) View.resolveSize(0, 0), (-72) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    map = C12077jz.m30810(new JSONObject(strOptString), new C12077jz.c<C11832ax>() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.6
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.c
                        /* JADX INFO: renamed from: ﾒ */
                        public final /* synthetic */ C11832ax mo28541(JSONObject jSONObject, String str) {
                            return new C11832ax(jSONObject.optJSONObject(str));
                        }
                    });
                }
            } catch (JSONException e) {
                C12080kb.m30845(m28519("⬧凑䊻詎鹀잿鑎\uf3ce䷦镃掖ሶ", (char) (Process.myPid() >> 22), "\u0000\u0000\u0000\u0000", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), "Ჱ\ue921裎㨷").intern(), m28530((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 202881825, (short) (58 - TextUtils.indexOf("", "")), 1862764741 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (-44) - Color.argb(0, 0, 0, 0)).intern(), (Throwable) e, false);
            }
            int i2 = f27190 + 109;
            f27185 = i2 % 128;
            if (i2 % 2 != 0) {
                return map;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻛ */
        public final boolean mo28501(String str, String str2) {
            int i = 2 % 2;
            int i2 = f27185 + 83;
            f27190 = i2 % 128;
            if (i2 % 2 == 0) {
                C11832ax c11832axM28525 = m28525(str);
                if (c11832axM28525 == null) {
                    return true;
                }
                int i3 = f27185 + 23;
                f27190 = i3 % 128;
                if (i3 % 2 != 0) {
                    c11832axM28525.m28686(str2);
                    throw null;
                }
                if (!c11832axM28525.m28686(str2)) {
                    return true;
                }
                int i4 = f27190 + 37;
                f27185 = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            m28525(str);
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﻛ */
        public final String mo28497(String str) {
            int i = 2 % 2;
            int i2 = f27185 + 61;
            f27190 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                C11832ax c11832axM28525 = m28525(str);
                if (c11832axM28525 == null) {
                    return null;
                }
                String strM28687 = c11832axM28525.m28687();
                int i3 = f27185 + 15;
                f27190 = i3 % 128;
                if (i3 % 2 == 0) {
                    return strM28687;
                }
                super.hashCode();
                throw null;
            }
            m28525(str);
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ */
        private static void m28527(JSONObject jSONObject, long j) {
            int i = 2 % 2;
            int i2 = f27190 + 7;
            f27185 = i2 % 128;
            int i3 = i2 % 2;
            if (jSONObject.has(m28519("⠂똓砍", (char) (31865 - TextUtils.indexOf((CharSequence) "", '0', 0)), "\u0000\u0000\u0000\u0000", (-2075297569) - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\udf68䵸窄퍼").intern())) {
                try {
                    jSONObject.put(m28519("⠂똓砍", (char) (31867 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 2075297570, "\udf68䵸窄퍼").intern(), jSONObject.optLong(m28519("⠂똓砍", (char) (31865 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", (-2075297570) - Process.getGidForName(""), "\udf68䵸窄퍼").intern()) + (j / 2));
                    return;
                } catch (JSONException unused) {
                }
            }
            int i4 = f27190 + 97;
            f27185 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ﭖ */
        public final String mo28483() {
            JSONObject jSONObjectM28507;
            String strM28519;
            int i = 2 % 2;
            int i2 = f27190 + 43;
            f27185 = i2 % 128;
            if (i2 % 2 == 0) {
                jSONObjectM28507 = m28507();
                strM28519 = m28519("툔\u1c38羟", (char) ((ViewConfiguration.getScrollDefaultDelay() / 70) * 17236), "\u0000\u0000\u0000\u0000", 938960734 >>> TextUtils.getTrimmedLength(""), "庫\uf767\ud937㜑");
            } else {
                jSONObjectM28507 = m28507();
                strM28519 = m28519("툔\u1c38羟", (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4569), "\u0000\u0000\u0000\u0000", 938960734 - TextUtils.getTrimmedLength(""), "庫\uf767\ud937㜑");
            }
            return jSONObjectM28507.optString(strM28519.intern());
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: 乁 */
        public final List mo28477() {
            int i = 2 % 2;
            int i2 = f27190 + 85;
            f27185 = i2 % 128;
            int i3 = i2 % 2;
            if (this.f27199 == null) {
                this.f27199 = C12077jz.m30805(m28507().optJSONArray(m28530((-202881926) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (124 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1862764769 - Color.alpha(0), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') - 70).intern()), new C12077jz.a<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.ao.c.10
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.a
                    /* JADX INFO: renamed from: ﾒ */
                    public final /* synthetic */ ISAdQualityAdType mo28537(JSONArray jSONArray, int i4) {
                        return ISAdQualityAdType.fromInt(jSONArray.optInt(i4));
                    }
                });
            }
            List list = this.f27199;
            int i4 = f27185 + 51;
            f27190 = i4 % 128;
            if (i4 % 2 == 0) {
                return list;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ヮ */
        public final boolean mo28474() {
            JSONObject jSONObjectM28507;
            char cResolveOpacity;
            int jumpTapTimeout;
            int i = 2 % 2;
            int i2 = f27185 + 29;
            f27190 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM28507 = m28507();
                cResolveOpacity = (char) (44282 >>> Drawable.resolveOpacity(1, 1));
                jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >>> 10;
            } else {
                jSONObjectM28507 = m28507();
                cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 44282);
                jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
            }
            return jSONObjectM28507.optBoolean(m28519("ᱚ쏸ﾉ鍮", cResolveOpacity, "\u0000\u0000\u0000\u0000", jumpTapTimeout, "謇騫\ufa6f햬").intern());
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: リ */
        public final int mo28473() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m28507().optInt(m28519("\ud84e캆\uf0c3", (char) (View.resolveSize(0, 0) + 5360), "\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0) + 905167905, "⇥\uf3c4\uf035爔").intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ףּ */
        public final String mo28482() {
            int i = 2 % 2;
            int i2 = f27185 + 15;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            if (m28507() == null) {
                return null;
            }
            int i4 = f27190 + 1;
            f27185 = i4 % 128;
            int i5 = i4 % 2;
            String strOptString = m28507().optString(m28519("㲆鳽\udc6e띋", (char) (15322 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, "㣾ⴥ\udbbb︻").intern());
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            int i6 = f27185 + 11;
            f27190 = i6 % 128;
            int i7 = i6 % 2;
            return m28506().m28587();
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: טּ */
        public final JSONObject mo28480() {
            int i = 2 % 2;
            int i2 = f27185 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f27190 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (m28506() == null) {
                    return null;
                }
                int i3 = f27190 + 79;
                f27185 = i3 % 128;
                if (i3 % 2 != 0) {
                    JSONObject jSONObjectM28584 = m28506().m28584();
                    int i4 = f27190 + 23;
                    f27185 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return jSONObjectM28584;
                    }
                    super.hashCode();
                    throw null;
                }
                m28506().m28584();
                super.hashCode();
                throw null;
            }
            m28506();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: 丫 */
        public final long mo28476() {
            long j;
            int i = 2 % 2;
            String strM30642 = this.f27215.m30642(m28530((-202881795) - (Process.myTid() >> 22), (short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 48), 1862764780 - TextUtils.indexOf("", "", 0), (byte) (Process.getGidForName("") + 1), (-38) - KeyEvent.getDeadChar(0, 0)).intern());
            if (TextUtils.isEmpty(strM30642)) {
                j = 0;
            } else {
                int i2 = f27185 + 109;
                f27190 = i2 % 128;
                int i3 = i2 % 2;
                j = Long.parseLong(strM30642);
            }
            int i4 = f27185 + 17;
            f27190 = i4 % 128;
            if (i4 % 2 == 0) {
                return j;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao
        /* JADX INFO: renamed from: ヶ */
        public final boolean mo28475() {
            int i = 2 % 2;
            int i2 = f27185 + 47;
            f27190 = i2 % 128;
            int i3 = i2 % 2;
            boolean zOptBoolean = m28507().optBoolean(m28530((-202881922) - View.MeasureSpec.getSize(0), (short) (121 - Process.getGidForName("")), Color.green(0) + 1862764787, (byte) View.resolveSize(0, 0), (-71) - Gravity.getAbsoluteGravity(0, 0)).intern());
            int i4 = f27185 + 91;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
            return zOptBoolean;
        }

        /* JADX INFO: renamed from: ﾇ */
        public final void m28536(long j) {
            int i = 2 % 2;
            if (!this.f27195) {
                int i2 = f27190 + 73;
                f27185 = i2 % 128;
                int i3 = i2 % 2;
                this.f27215.m30644(m28530(((byte) KeyEvent.getModifierMetaStateMask()) - 202881794, (short) ((-48) - Color.blue(0)), TextUtils.indexOf((CharSequence) "", '0') + 1862764781, (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 38).intern(), String.valueOf(j));
                this.f27195 = true;
            }
            int i4 = f27185 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX INFO: renamed from: ﾇ */
        private static boolean m28528(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = f27190 + 65;
            f27185 = i2 % 128;
            boolean zHas = jSONObject.has(m28519("伏Ȳ㓫⿊陝얫", (char) (i2 % 2 == 0 ? 25527 / TextUtils.indexOf("", "") : 14154 - TextUtils.indexOf("", "")), "\u0000\u0000\u0000\u0000", KeyEvent.getDeadChar(0, 0), "ꢝꍒ䩪\udf37").intern());
            int i3 = f27185 + 67;
            f27190 = i3 % 128;
            int i4 = i3 % 2;
            return zHas;
        }

        /* JADX INFO: renamed from: ﻐ */
        private static void m28521(JSONObject jSONObject) {
            char maximumDrawingCacheSize;
            int packedPositionChild;
            int i = 2 % 2;
            int i2 = f27185 + 85;
            f27190 = i2 % 128;
            if (i2 % 2 != 0) {
                maximumDrawingCacheSize = (char) (8675 << (ViewConfiguration.getMaximumDrawingCacheSize() + 20));
                packedPositionChild = ExpandableListView.getPackedPositionChild(1L) - 1;
            } else {
                maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14154);
                packedPositionChild = (-1) - ExpandableListView.getPackedPositionChild(0L);
            }
            C12077jz.m30802(jSONObject, jSONObject.optJSONObject(m28519("伏Ȳ㓫⿊陝얫", maximumDrawingCacheSize, "\u0000\u0000\u0000\u0000", packedPositionChild, "ꢝꍒ䩪\udf37").intern()));
            int i3 = f27185 + 11;
            f27190 = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX INFO: renamed from: ﾇ */
        private C11832ax m28525(String str) {
            int i = 2 % 2;
            int i2 = f27185;
            int i3 = i2 + 51;
            f27190 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                super.hashCode();
                throw null;
            }
            if (str == null) {
                return null;
            }
            int i4 = i2 + 57;
            f27190 = i4 % 128;
            int i5 = i4 % 2;
            C11832ax c11832ax = mo28493().get(str);
            int i6 = f27190 + 21;
            f27185 = i6 % 128;
            int i7 = i6 % 2;
            return c11832ax;
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m28519(String str, char c, String str2, int i, String str3) {
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
                    cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f27194) ^ ((long) f27193)) ^ ((long) f27191));
                    C12051j.f29511++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m28530(int i, short s, int i2, byte b, int i3) {
            String string;
            synchronized (C12086m.f29832) {
                StringBuilder sb = new StringBuilder();
                int i4 = f27188;
                int i5 = i3 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f27189;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f27192 + i] + i4);
                    } else {
                        i5 = (short) (f27187[f27192 + i] + i4);
                    }
                }
                if (i5 > 0) {
                    C12086m.f29836 = ((i + i5) - 2) + f27192 + i6;
                    C12086m.f29833 = b;
                    C12086m.f29837 = (char) (i2 + f27186);
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835 = 1;
                    while (C12086m.f29835 < i5) {
                        byte[] bArr2 = f27189;
                        if (bArr2 != null) {
                            int i7 = C12086m.f29836;
                            C12086m.f29836 = i7 - 1;
                            C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                        } else {
                            short[] sArr = f27187;
                            int i8 = C12086m.f29836;
                            C12086m.f29836 = i8 - 1;
                            C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
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
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ao$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: ﻛ */
        private C11829au f27183;

        /* JADX INFO: renamed from: ｋ */
        private JSONObject f27184;

        /* JADX INFO: renamed from: ﾒ */
        public synchronized void mo28509(JSONObject jSONObject) {
            this.f27184 = jSONObject;
        }

        /* JADX INFO: renamed from: ゥ */
        public final synchronized JSONObject m28507() {
            return this.f27184;
        }

        /* JADX INFO: renamed from: っ */
        public final C11829au m28506() {
            return this.f27183;
        }

        /* JADX INFO: renamed from: ﾒ */
        public final void m28508(C11829au c11829au) {
            this.f27183 = c11829au;
        }
    }
}
