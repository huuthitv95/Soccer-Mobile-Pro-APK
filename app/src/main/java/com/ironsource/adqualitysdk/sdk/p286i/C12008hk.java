package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hk */
/* JADX INFO: loaded from: classes6.dex */
public class C12008hk extends WebViewClient implements C11834az.b, InterfaceC11870ch {

    /* JADX INFO: renamed from: ﱡ */
    private static int f29157 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static long f29158;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f29159;

    /* JADX INFO: renamed from: ｋ */
    private static int f29160;

    /* JADX INFO: renamed from: ﾇ */
    private WebViewClient f29161;

    /* JADX INFO: renamed from: ﾒ */
    private WebViewClient f29162;

    static {
        char[] cArr = new char[1031];
        ByteBuffer.wrap("\u0000WËÈ\u00978cQ.Ýú\u0004Æy\u0091ø]\u0004)|ô§À\u0001\u008chW\u008d#\u0013ï@º¿\u0086\u000fRK\u001d£éëµC\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µB\u0080¶Lä\u0018Mã\u0089¯ö{pF\u009a\u0012üÞ4©\u0081uÉA)\f\u009fØò¤&pm;â\u00074Ói\u009eÑj\u000b6a\u0001ÛÍA\u0099cd±0\u001cü4\u001aèÑr\u008d\u0085yÅ4kàìÜÊ\u008bxGå3Õî Ú°\u0096ØM\u00039²õà >\u009c¼Hî\u0007\u001fóG¯è\u009aSVU\u0002ýù'µJaþ\\%\b{Ä\u009d³;o\u007f[\u0092\u0016>Ân¾\u009cjù!q\u001d\u009aÉé\u0084wp®,Æ\u001bx×ª\u0083Ü~F*¨æÂÝ\u000b\u0089ó\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µB\u0080¶Lä\u0018Mã\u0089¯ö{pF\u009a\u0012üÞ4©\u0081uÉA)\f\u009fØò¤&pm;â\u00074Ói\u009eÑj\u000b6a\u0001ÛÍA\u0099dd¦0\u0001ühÇ¯\u0093\u0004_P*øM\u0080\u0086\u001aÚí.\u00adc\u0003·\u0084\u008b¢Ü\u0010\u0010\u008dd½¹H\u008dØÁ°\u001aknÚ¢\u0088÷VËÔ\u001f\u0086Pw¤/ø\u0080Í;\u0001=U\u0095®Oâ\"6\u0096\u000bM_\u0013\u0093õäS8\u0017\fúAV\u0095\u0006éô=\u0091v\u0019Jò\u009e\u0081Ó\u001f'Æ{®L\u0010\u0080ÂÔ´).}Ç±½\u008a~ÞÇ\u0012\u0084gg»Ï\u008fÇÓç\u0018}D\u008a°Êýd)ã\u0015ÅBw\u008eêúÚ'4\u0013¯_ò\u0084\u0002ð§<õi\u0017U±\u0081íÎ\u0007:\u0006füS\u0012\u009fyËû0 |U¨Î\u0095:ÁZ\r\u0096z%¦g\u0092\u008b_¿\u0094%ÈÒ<\u0092q<¥»\u0099\u009dÎ/\u0002²v\u0082«l\u009f÷Óª\bZ|ÿ°\u00adåOÙé\rµB_¶^ê¤ßJ\u0013!G£¼xð\r$\u0083\u0019\u007fM\r\u0081Õöz*2\u001eÒSd\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µ^\u0080°LÇ\u0018Wã\u0084¯ö{mF\u0089\u0012êÞ)©\u0086uÒA.\f\u009f6\u008eý\u0014¡ãU£\u0018\rÌ\u008að¬§\u001ek\u0083\u001f³Â]öÆº\u009bak\u0015ÎÙ\u009c\u008c~°Ød\u0084+nßo\u0083\u0089¶}z/.\u0086ÕB\u0099=M½pI$&èè\u009fJC\bwã:Aî\u0018\u0092ÍF¯\r\u00141åå¦¨\r\\Ý\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µ^\u0080°Lß\u0018Wã\u008a¯ß{^F\u0082\u0012àÞ\u0014©\u0096uÄA$\f\u0088ØÂ¤7pu;Ý\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µ^\u0080°LÙ\u0018]ã\u0086¯÷{VF\u009a\u0012üÞ\"©¶uÒA?\f\u0095ØÕ\u000fcÄù\u0098\u000elN!àõgÉA\u009eóRn&^û°Ï+\u0083vX\u0086,#àqµ\u0093\u00895]i\u0012\u0083æ\u0082ºx\u008f\u0096Cë\u0017qì± ÙtKI¯\u001dÌÑ\u0015¦·zëN\u0002\u0003¯×ò«\u001b\u007fH4æB´\u0089.ÕÙ!\u0099l7¸°\u0084\u0096Ó$\u001f¹k\u008b¶]\u0082ØÎ\u0082\u0015Jaê\u00ad\u0080øDÄÿ\u0010®_D«\u0018÷©Â\\\u000e\tZ ¡{í\r\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µU\u0080±LÞ\u0018Hã\u0081¯ó{KF\u0089\u0012ÏÞ/©\u0080uÉA9\f\u009fØÃ¤\u001cph;Ý\u0007/Óg\u009eÇj\u001b\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µ^\u0080°LÙ\u0018]ã\u0086¯÷{VF\u009a\u0012üÞ\"© uÓA!\f¿ØÕ¤&pn;Ü\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µ^\u0080°LÙ\u0018]ã\u0086¯÷{VF\u009a\u0012üÞ\"©°uÌA$\f\u009fØÉ¤ pB;Ë\u0007)Ó|\u009eçj\u00076~\u0001ÉÍ\f\u0099ed·r·¹-åÚ\u0011\u009a\\4\u0088³´\u0095ã'/º[\u0084\u0086Q²ñþ\u0082%RQê\u009d¶È\u0002ôà ªoL\u009b\u0011ÇªòB>Yj¥\u0091yÝ2\t¨4}`\u000e¬ÝÛw\u000773Û~Kª9ÖÏ\u0002\u0096I2uÝ¡¹ì\"\u0018âD\u0089s\u001c¿þë\u0095\u0016DBç\u008e\u009cµL\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µ^\u0080°LÙ\u0018]ã\u0086¯÷{VF\u009a\u0012üÞ\"©»uÔA9\f\u008aØæ¤!pu;Æ\u0007\tÓm\u009eÄj\u00176j\u0001ÏÍ\u001d\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µB\u0080¶Lä\u0018Mã\u0089¯ö{pF\u009a\u0012üÞ4©\u0081uÉA)\f\u009fØì¤1px;ë\u0007-Óm\u009eÛj\u0016\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µ^\u0080°LÞ\u0018Vã\u008d¯ó{QF\u0088\u0012õÞ#©\u0097uëA(\f\u0083Øâ¤\"pd;À\u0007/Ö¯\u001d5AÂµ\u0082ø,,«\u0010\u008dG?\u008b¢ÿ\u0092\"|\u0016çZº\u0081Jõï9½l_Pù\u0084¥ËO?Nc´VZ\u009a2Î±5ny\u0014\u00ad°\u0090EÄ\u001b\bÍ\u007fw£-\u0097ÂÚt\u0000EËß\u0097(ch.ÆúAÆg\u0091Õ]H)xô\u0096À\r\u008cPW #\u0005ïWºµ\u0086\u0013RO\u001d¥é¤µ^\u0080°LÙ\u0018]ã\u0086¯÷{VF\u009a\u0012üÞ\"©¿uÏA*\f\u0093ØÉ¤\u0006pd;ß\u0007.Óm\u009eÆj\u0016\u0093ÇX]\u0004ªðê½DiÃUå\u0002WÎÊºúg\u0014S\u008f\u001fÒÄ\"°\u0087|Õ)7\u0015\u0091ÁÍ\u008e'z&&Ü\u00132ß[\u008bßp\u0004<uèÔÕ\u0018\u0081~M :9æVÒ»\u009f\bK`7¤ãñ¨C\u0094«°\u0012{\u0088'\u007fÓ?\u009e\u0091J\u0016v0!\u0082í\u001f\u0099/DÁpZ<\u0007ç÷\u0093R_\u0000\nâ6Dâ\u0018\u00adòYó\u0005\t0çü\u008e¨\nSÜ\u001f¡Ë\röÉ¢\u009enc\u0019ËÅ\u0094ñ\u007f¼Þh\u0083\u0014DÀ9\u008b\u0097·i\u0012ÚÙu\u0085\u0093qí<{è½ÔÃ\u0083vO°;Ìæ(Ò·\u009eÃE\"1¢ýû¨\u001a\u0094\u0083@û\u000f\u0003û\\§â\u0092\u0017\u0000gËÈ\u0097.cS.Öú6Æk\u0091Ù]>)|ô§À\u0018\u008c_W¥#\u001fïFº¾\u0086\t".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1031);
        f29159 = cArr;
        f29158 = 3278287893421345709L;
    }

    public C12008hk(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f29161 = webViewClient;
        this.f29162 = webViewClient2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private WebViewClient m30265() {
        int i = 2 % 2;
        int i2 = f29157 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        int i3 = i2 % 128;
        f29160 = i3;
        int i4 = i2 % 2;
        WebViewClient webViewClient = this.f29161;
        int i5 = i3 + 65;
        f29157 = i5 % 128;
        int i6 = i5 % 2;
        return webViewClient;
    }

    /* JADX INFO: renamed from: ﻐ */
    private Object m30264() {
        int i = 2 % 2;
        int i2 = f29157 + 1;
        int i3 = i2 % 128;
        f29160 = i3;
        int i4 = i2 % 2;
        WebViewClient webViewClient = this.f29162;
        int i5 = i3 + 85;
        f29157 = i5 % 128;
        if (i5 % 2 != 0) {
            return webViewClient;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private boolean m30268() {
        int i = 2 % 2;
        int i2 = f29160 + 101;
        f29157 = i2 % 128;
        int i3 = i2 % 2;
        WebViewClient webViewClient = this.f29161;
        if (webViewClient == null || webViewClient.getClass().equals(WebViewClient.class)) {
            return false;
        }
        int i4 = f29157 + 7;
        int i5 = i4 % 128;
        f29160 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 23;
        f29157 = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f29160 + 37;
        f29157 = i2 % 128;
        int i3 = i2 % 2;
        return m30269(webView, str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r12 != false) goto L11;
     */
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m30269(android.webkit.WebView r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12008hk.m30269(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        int i = 2 % 2;
        int i2 = f29157 + 3;
        f29160 = i2 % 128;
        boolean zM30266 = m30266(webView, webResourceRequest, i2 % 2 != 0);
        int i3 = f29157 + 107;
        f29160 = i3 % 128;
        if (i3 % 2 == 0) {
            return zM30266;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r13 == false) goto L18;
     */
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m30266(android.webkit.WebView r11, android.webkit.WebResourceRequest r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12008hk.m30266(android.webkit.WebView, android.webkit.WebResourceRequest, boolean):boolean");
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = f29157 + 47;
        f29160 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29162.onPageStarted(webView, str, bitmap);
        } catch (Throwable th) {
            C12080kb.m30845(m30267((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 22).intern(), m30267(Process.getGidForName("") + 235, (char) (54177 - ExpandableListView.getPackedPositionChild(0L)), 33 - ExpandableListView.getPackedPositionChild(0L)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient != null) {
            int i4 = f29157 + 45;
            f29160 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onPageStarted(webView, str, bitmap);
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        int i6 = f29160 + 35;
        f29157 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f29157 + 81;
        f29160 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f29162.onPageFinished(webView, str);
                int i3 = 74 / 0;
            } else {
                this.f29162.onPageFinished(webView, str);
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30267(Color.blue(0), (char) (Process.myPid() >> 22), 22 - Color.blue(0)).intern(), m30267(268 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (24570 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 35 - KeyEvent.normalizeMetaState(0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient != null) {
            int i4 = f29157 + 113;
            f29160 = i4 % 128;
            if (i4 % 2 == 0) {
                webViewClient.onPageFinished(webView, str);
                return;
            } else {
                webViewClient.onPageFinished(webView, str);
                int i5 = 49 / 0;
                return;
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f29160 + 19;
        f29157 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f29162.onLoadResource(webView, str);
                int i3 = 33 / 0;
            } else {
                this.f29162.onLoadResource(webView, str);
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30267(Color.blue(0), (char) ExpandableListView.getPackedPositionGroup(0L), 21 - TextUtils.indexOf((CharSequence) "", '0')).intern(), m30267((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 302, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 35 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient == null) {
            super.onLoadResource(webView, str);
            return;
        }
        int i4 = f29160 + 65;
        f29157 = i4 % 128;
        int i5 = i4 % 2;
        webViewClient.onLoadResource(webView, str);
        int i6 = f29160 + 85;
        f29157 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        int i = 2 % 2;
        try {
            this.f29162.shouldInterceptRequest(webView, str);
            int i2 = f29160 + 23;
            f29157 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30267(View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), (-16777194) - Color.rgb(0, 0, 0)).intern(), m30267((Process.myTid() >> 22) + 338, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 14027), 43 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        int i4 = f29157 + 11;
        f29160 = i4 % 128;
        int i5 = i4 % 2;
        return webViewClient.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int i = 2 % 2;
        int i2 = f29160 + 109;
        f29157 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29162.shouldInterceptRequest(webView, webResourceRequest);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(ViewConfiguration.getScrollBarSize() >> 8, (char) View.getDefaultSize(0, 0), 22 - View.resolveSize(0, 0)).intern(), m30267(337 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (14028 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 44).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient != null) {
            int i4 = f29160 + 57;
            f29157 = i4 % 128;
            if (i4 % 2 != 0) {
                return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            }
            WebResourceResponse webResourceResponseShouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            int i5 = 98 / 0;
            return webResourceResponseShouldInterceptRequest;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        int i = 2 % 2;
        try {
            this.f29162.onTooManyRedirects(webView, message, message2);
            int i2 = f29157 + 55;
            f29160 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30267((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 22).intern(), m30267(381 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getTapTimeout() >> 16), 39 - TextUtils.indexOf("", "")).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient == null) {
            super.onTooManyRedirects(webView, message, message2);
            return;
        }
        int i4 = f29160 + 115;
        f29157 = i4 % 128;
        if (i4 % 2 == 0) {
            webViewClient.onTooManyRedirects(webView, message, message2);
            int i5 = 51 / 0;
        } else {
            webViewClient.onTooManyRedirects(webView, message, message2);
        }
        int i6 = f29157 + 87;
        f29160 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2 = 2 % 2;
        try {
            this.f29162.onReceivedError(webView, i, str, str2);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(ViewConfiguration.getEdgeSlop() >> 16, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m30267(420 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 36).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient == null) {
            super.onReceivedError(webView, i, str, str2);
            return;
        }
        int i3 = f29157 + 51;
        f29160 = i3 % 128;
        int i4 = i3 % 2;
        webViewClient.onReceivedError(webView, i, str, str2);
        int i5 = f29160 + 101;
        f29157 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        int i = 2 % 2;
        int i2 = f29157 + 49;
        f29160 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29162.onFormResubmission(webView, message, message2);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(View.resolveSizeAndState(0, 0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 22 - ExpandableListView.getPackedPositionGroup(0L)).intern(), m30267(456 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (3878 - TextUtils.getOffsetAfter("", 0)), TextUtils.indexOf("", "", 0) + 39).intern(), th, false);
        }
        try {
            WebViewClient webViewClient = this.f29161;
            if (webViewClient == null) {
                super.onFormResubmission(webView, message, message2);
                return;
            }
            int i4 = f29157 + 35;
            f29160 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onFormResubmission(webView, message, message2);
            int i6 = f29160 + 107;
            f29157 = i6 % 128;
            int i7 = i6 % 2;
        } catch (Error e) {
            C12080kb.m30845(m30267(View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 22 - Color.green(0)).intern(), m30267((ViewConfiguration.getJumpTapTimeout() >> 16) + 495, (char) (TextUtils.indexOf("", "", 0, 0) + 17137), 27 - KeyEvent.normalizeMetaState(0)).intern(), (Throwable) e, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        int i = 2 % 2;
        try {
            this.f29162.doUpdateVisitedHistory(webView, str, z);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(ExpandableListView.getPackedPositionGroup(0L), (char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 22).intern(), m30267(521 - Process.getGidForName(""), (char) TextUtils.getCapsMode("", 0, 0), 43 - KeyEvent.normalizeMetaState(0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient != null) {
            int i2 = f29160 + 43;
            f29157 = i2 % 128;
            int i3 = i2 % 2;
            webViewClient.doUpdateVisitedHistory(webView, str, z);
            int i4 = f29157 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f29160 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
        int i6 = f29157 + 11;
        f29160 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i = 2 % 2;
        int i2 = f29160 + 37;
        f29157 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29162.onReceivedSslError(webView, sslErrorHandler, sslError);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(Color.red(0), (char) ('0' - AndroidCharacter.getMirror('0')), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22).intern(), m30267(ExpandableListView.getPackedPositionChild(0L) + 566, (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.blue(0) + 39).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient != null) {
            int i4 = f29160 + 109;
            f29157 = i4 % 128;
            if (i4 % 2 != 0) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            }
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        int i = 2 % 2;
        int i2 = f29157 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29160 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29162.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), (char) KeyEvent.getDeadChar(0, 0), 22 - (Process.myTid() >> 22)).intern(), m30267((ViewConfiguration.getScrollBarSize() >> 8) + 604, (char) (Process.myTid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 48).intern(), th, false);
        }
        try {
            WebViewClient webViewClient = this.f29161;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
                return;
            }
            super.onReceivedClientCertRequest(webView, clientCertRequest);
            int i4 = f29157 + 53;
            f29160 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th2) {
            C12080kb.m30845(m30267(ViewConfiguration.getScrollBarSize() >> 8, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m30267((ViewConfiguration.getDoubleTapTimeout() >> 16) + 652, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29425), (KeyEvent.getMaxKeyCode() >> 16) + 51).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        int i = 2 % 2;
        int i2 = f29157 + 105;
        f29160 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f29162.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                int i3 = 29 / 0;
            } else {
                this.f29162.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30267((-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) (Process.myTid() >> 22), 22 - View.MeasureSpec.getSize(0)).intern(), m30267(704 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), AndroidCharacter.getMirror('0') - 2).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient != null) {
            int i4 = f29157 + 39;
            f29160 = i4 % 128;
            if (i4 % 2 == 0) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                return;
            } else {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                throw null;
            }
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = f29157 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29160 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29162.shouldOverrideKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(ViewConfiguration.getPressedStateDuration() >> 16, (char) (KeyEvent.getMaxKeyCode() >> 16), 21 - ImageFormat.getBitsPerPixel(0)).intern(), m30267((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 749, (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 43).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        }
        boolean zShouldOverrideKeyEvent = super.shouldOverrideKeyEvent(webView, keyEvent);
        int i4 = f29160 + 69;
        f29157 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return zShouldOverrideKeyEvent;
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = f29160 + 101;
        f29157 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f29162.onUnhandledKeyEvent(webView, keyEvent);
                int i3 = 36 / 0;
            } else {
                this.f29162.onUnhandledKeyEvent(webView, keyEvent);
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30267((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 21 - ImageFormat.getBitsPerPixel(0)).intern(), m30267(792 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 40).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient != null) {
            int i4 = f29157 + 91;
            f29160 = i4 % 128;
            if (i4 % 2 == 0) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
                return;
            } else {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
                int i5 = 64 / 0;
                return;
            }
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        int i = 2 % 2;
        try {
            this.f29162.onScaleChanged(webView, f, f2);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(TextUtils.indexOf((CharSequence) "", '0', 0) + 1, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 21 - TextUtils.lastIndexOf("", '0', 0)).intern(), m30267((ViewConfiguration.getEdgeSlop() >> 16) + 832, (char) (55018 - KeyEvent.normalizeMetaState(0)), 35 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient == null) {
            super.onScaleChanged(webView, f, f2);
            return;
        }
        int i2 = f29157 + 37;
        f29160 = i2 % 128;
        if (i2 % 2 != 0) {
            webViewClient.onScaleChanged(webView, f, f2);
            throw null;
        }
        webViewClient.onScaleChanged(webView, f, f2);
        int i3 = f29160 + 33;
        f29157 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = f29160 + 73;
        f29157 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f29162.onReceivedLoginRequest(webView, str, str2, str3);
                throw null;
            }
            this.f29162.onReceivedLoginRequest(webView, str, str2, str3);
            WebViewClient webViewClient = this.f29161;
            if (webViewClient != null) {
                int i3 = f29160 + 61;
                f29157 = i3 % 128;
                if (i3 % 2 != 0) {
                    webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
                    return;
                } else {
                    webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
                    int i4 = 26 / 0;
                    return;
                }
            }
            super.onReceivedLoginRequest(webView, str, str2, str3);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(ViewConfiguration.getTapTimeout() >> 16, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Gravity.getAbsoluteGravity(0, 0) + 22).intern(), m30267(867 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getOffsetBefore("", 0) + 43).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f29160 + 7;
        f29157 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29162.onPageCommitVisible(webView, str);
        } catch (Throwable th) {
            C12080kb.m30845(m30267(View.resolveSize(0, 0), (char) View.MeasureSpec.getSize(0), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m30267(234 - KeyEvent.normalizeMetaState(0), (char) (54178 - TextUtils.indexOf("", "")), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        Object obj = null;
        if (webViewClient == null) {
            super.onPageCommitVisible(webView, str);
            int i4 = f29157 + 53;
            f29160 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i5 = f29157 + 99;
        f29160 = i5 % 128;
        int i6 = i5 % 2;
        webViewClient.onPageCommitVisible(webView, str);
        int i7 = f29160 + 9;
        f29157 = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i = 2 % 2;
        try {
            this.f29162.onReceivedError(webView, webResourceRequest, webResourceError);
            int i2 = f29160 + 51;
            f29157 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30267((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) View.getDefaultSize(0, 0), 22 - Color.red(0)).intern(), m30267(420 - KeyEvent.keyCodeFromString(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 36 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient == null) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        int i4 = f29157 + 113;
        f29160 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i = 2 % 2;
        try {
            this.f29162.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            int i2 = f29160 + 11;
            f29157 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30267((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0) + 23).intern(), m30267(Color.rgb(0, 0, 0) + 16778126, (char) (TextUtils.indexOf("", "", 0) + 37762), Color.rgb(0, 0, 0) + 16777256).intern(), th, false);
        }
        WebViewClient webViewClient = this.f29161;
        if (webViewClient == null) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            return;
        }
        int i4 = f29157 + 115;
        f29160 = i4 % 128;
        int i5 = i4 % 2;
        webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = 2 % 2;
        int i2 = f29157 + 89;
        f29160 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                this.f29162.onRenderProcessGone(webView, renderProcessGoneDetail);
                super.hashCode();
                throw null;
            }
            this.f29162.onRenderProcessGone(webView, renderProcessGoneDetail);
            WebViewClient webViewClient = this.f29161;
            if (webViewClient == null) {
                return true;
            }
            int i3 = f29160 + 109;
            f29157 = i3 % 128;
            if (i3 % 2 != 0) {
                return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            C12080kb.m30845(m30267(KeyEvent.getDeadChar(0, 0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 22 - Color.blue(0)).intern(), m30267((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 949, (char) (45143 - ((Process.getThreadPriority(0) + 20) >> 6)), (Process.myPid() >> 22) + 40).intern(), th, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        int i2 = f29157 + 91;
        f29160 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        byte b = 0;
        if (iHashCode != 368095040) {
            if (iHashCode != 381550901 || !str.equals(m30267(989 - ExpandableListView.getPackedPositionChild(0L), (char) (4796 - ImageFormat.getBitsPerPixel(0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 23).intern())) {
                b = -1;
            }
        } else if (str.equals(m30267(Gravity.getAbsoluteGravity(0, 0) + 1013, (char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17).intern())) {
            int i4 = f29157 + 95;
            f29160 = i4 % 128;
            if (i4 % 2 == 0) {
                b = 1;
            }
        } else {
            b = -1;
        }
        if (b == 0) {
            return m30265();
        }
        Object obj = null;
        if (b != 1) {
            return null;
        }
        Object objM30264 = m30264();
        int i5 = f29157 + 39;
        f29160 = i5 % 128;
        if (i5 % 2 == 0) {
            return objM30264;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30267(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f29159[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29158)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
