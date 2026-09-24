package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
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
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hh */
/* JADX INFO: loaded from: classes6.dex */
public class C12005hh extends WebChromeClient implements C11834az.b, InterfaceC11870ch {

    /* JADX INFO: renamed from: ﺙ */
    private static int f29140 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f29141;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29142;

    /* JADX INFO: renamed from: ﾒ */
    private static long f29143;

    /* JADX INFO: renamed from: ｋ */
    private WebChromeClient f29144;

    /* JADX INFO: renamed from: ﾇ */
    private WebChromeClient f29145;

    static {
        char[] cArr = new char[ErrorCodes.THROWABLE];
        ByteBuffer.wrap("\u0088\u0084ïdG\u0015¿æ\u0017ó\u008f»æP^\u0000¶&.ò\u0086\u008bþ¼UnÍ\u0017%Û\u009dÙõ\u0096lBÄx<7\u0094Ú\f\u009dd°Û\u007f\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u008e»Â#í\u008b3óTZ\u009dÂ¹*ï\u0092-ú(bsÉ\u008a1Ñ\u0099í\u0001>d¨\u0003M«;Sôû×c×\nh²=Z]Ââj\u008d\u0012\u0089¹y!.Éâq×\u0019¨\u0080q(LÐ\tx¥à¸\u0088\u008f7aß8G\fïÜ\u0097¢>c¦BN\u0015ö×\u009eÄ\u0006\u008b\u00adeU>\u009céû\fSz«µ\u0003\u0096\u009b\u0096ò)J|¢\u001c:£\u0092ÌêÈA8Ùo1£\u0089\u0096áéx0Ð\r(H\u0080ä\u0018ùpÎÏ 'y¿M\u0017\u009doãÆ\"^\u0003¶T\u000e\u008bf\u008fþÑU&\u0014\u0083sfÛ\u0010#ß\u008bü\u0013üzCÂ\u0016*v²É\u001a¦b¢ÉRQ\u0005¹É\u0001üi\u0083ðZXg \"\b\u008e\u0090\u0093ø¤GJ¯\u00137'\u009f÷ç\u0089NHÖi>>\u0086üîév¡ÝA%\u0018\u008d\u0007\u0015ÿ}\u0085ÄV,C´\u0016\u001cÞ\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u008d»Ø#í\u008b#óeZ\u008dÂ¹*è\u0092\u0001ú-bDÉ\u008d1Ó\u0099ÿ\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u0096»Ù#æ\u008b1óeZ\u008dÂ¹*è\u0092\u0001ú-bDÉ\u008d1Ó\u0099ÿjª\rO¥9]öõÕmÕ\u0004j¼?T_Ìàd\u008f\u001c\u008b·{/,Çà\u007fÕ\u0017ª\u008es&NÞ\u000bv§îº\u0086\u008d9rÑ-I\báÚ\u0099½0r¨r@\u001aøï\u0090Ë\b\u0092£|\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u008c»Õ#ó\u008b!óCZ\u008bÂ¾*Ú\u0092\u0001ú#bgÉ\u0097\u0085\u001dâøJ\u008e²A\u001ab\u0082bëÝS\u0088»è#W\u008b8ó<XÌÀ\u009b(W\u0090bø\u001daÄÉù1¼\u0099\u0010\u0001\ri:ÖÅ>\u0084¦µ\u000e\u007fv\u001bß÷Gû¯ª\u0017R\u007fwç=\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u0094»Ã#Ã\u008b8óCZ\u008aÂ¾\u0002$eÁÍ·5x\u009d[\u0005[läÔ±<Ñ¤n\f\u0001t\u0005ßõG¢¯n\u0017[\u007f$æýNÀ¶\u0085\u001e)\u00864î\u0003Qõ¹¢! \u0089Zñ)XÿÀÂ(\u008f\u0090b\u008eqé\u0094Aâ¹-\u0011\u000e\u0089\u000eà±Xä°\u0084(;\u0080TøPS Ë÷#;\u009b\u000eóqj¨Â\u0095:Ð\u0092|\nabVÝ 5÷\u00adæ\u0005\u0012}}Ô¡L\u008e¤Ü\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u0094»Ã#À\u008b1ó@Z\u0097Â¸*ù\u0092;ú.b~É\u008b1×\u0099ì\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u009b»È#á\u008b1óCZ\u009cÂ¯*ø\u0092*ú!bfÉ\u00851Ô\u0099é\u0001)iIÐ¯8¥ Í\b\u0000p'\u0082¦åCM5µú\u001dÙ\u0085ÙìfT3¼S$ì\u008c\u0083ô\u0087_wÇ /ì\u0097Ùÿ¦f\u007fÎB6\u0007\u009e«\u0006¶n\u0081Ñz96¡\u000e\tÛqªØx@H¨\u000b\u0010äxÌà\u009fKW³0\u001b\u0019\u0083Ôë¦Rnº@\"(\u008aøòËZ\u0088½Z%7\u008d\u0002õô]\u0081Å\u0095,Z\u0094&üédÛé/\u008eÊ&¼ÞsvPîP\u0087ï?º×ÚOeç\n\u009f\u000e4þ¬©DeüP\u0094/\rö¥Ë]\u008eõ\"m?\u0005\bºóR¿Ê\u0087bR\u001a#³ñ+ÁÃ\u0082{m\u0013E\u008b\u0016 ÞØ¹p\u0090è]\u0080/9çÑÉI¡áq\u0099B1\u0001ÖÈN¿æ\u0080\u009eo6\b®\u001cGÓÿ¯\u0097`\u000fR\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u008e»Õ#ð\u008b9óOZ\u008bÂ¹*õ\u0092\u0001ú.b@É\u00811Ç\u0099ý\u0001?i_Ð\u008a\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u0001\u000eUvjÝ´EÃ\u00ad\u0012\u0015)}\u0000ä\u009dL¶´ÿ\u001c\u000f\u0084SìbSþ»ß#ì\u008b\u0004óCZ\u008aÂ§*õ\u0092\u001dú3b{É\u008b1Ø\u0099Ú\u0001?i]Ð\u008b8µ Ñ\b\u0000\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u008e»Õ#ð\u008b9óOZ\u008bÂ¹*õ\u0092\u0001ú.b@É\u00811Ç\u0099ý\u0001?i_Ð\u008a8\u0093 Ã\b\u001ap%Ø}?\u0086§Ù\u000fê\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u0001\u000eUvjÝ´EÃ\u00ad\u0012\u0015)}\u0000ä\u009dL¶´ÿ\u001c\u000f\u0084SìbSþ»ß#ì\u008b\u0004óCZ\u008aÂ§*õ\u0092\u001dú3b{É\u008b1Ø\u0099Ú\u0001?i]Ð\u008b8µ Ñ\b\u0000p\u0005Øy?\u0084§ß\u000fëw\fßWG`\u0000Eg ÏÖ7\u0019\u009f:\u0007:n\u0085ÖÐ>°¦\u000f\u000e`vdÝ\u0094EÃ\u00ad\u000f\u0015:}Eä\u009cL¡´ä\u001cH\u0084UìbS\u0094»Ã#Ö\u008b=óKZ\u009dÂ¥*é\u0092\u001aDX#½\u008bËs\u0004Û'C'*\u0098\u0092Íz\u00adâ\u0012J}2y\u0099\u0089\u0001Þé\u0012Q'9X \u0081\b¼ðùXUÀH¨\u007f\u0017\u0080ÿÂgñÏ:·T\u001e\u0089\u0086²nÌÖ\u0016¾.&|\u008d\u0098uÌÝðýS\u009a¶2ÀÊ\u000fb,ú,\u0093\u0093+ÆÃ¦[\u0019óv\u008br \u0082¸ÕP\u0019è,\u0080S\u0019\u008a±·Iòá^yK\u0011\u007f®¼FâÞñv$\u000eQ§\u009b?°×þo.\u0007?\u009f`4\u0097ÌÏdÎü#\u0094I-\u009cÅ£]Æ»´ÜQt'\u008cè$Ë¼ËÕtm!\u0085A\u001dþµ\u0091Í\u0095feþ2\u0016þ®ËÆ´_m÷P\u000f\u0015§¹?¬W\u0098è[\u0000\u0017\u0098\u001a0ÁH²áfyw\u0091\u0002)þAÕÙ\u008ar{\u008a \")ºÙÒ²kh\u0083S\u001b6³öËÄc¿\u0084r\u001c(´\b'$@Áè·\u0010x¸[ [Iäñ±\u0019Ñ\u0081n)\u0001Q\u0005úõb¢\u008an2[Z$ÃýkÀ\u0093\u0085;)£<Ë\btË\u009c\u0087\u0004\u008a¬FÔ.}íåÎ\r\u0099µGÝHE\u0000îñ\u0016¸¾\u009b&BLè+\r\u0083{{´Ó\u0097K\u0097\"(\u009a}r\u001dê¢BÍ:É\u00919\tná¢Y\u00971è¨1\u0000\føIPåÈø Ï\u001f ÷uo@Ç\u008e¿Í\u0016<\u008e\u000bfTÞ\u0080¶\u0085.Ð\u0085&}hÕ@M\u0085\u0000gg·ÏÐ7!\u009f:\u0007{n\u009cÖÎ>õ¦\u0006\u000ecvcÝºEé\u00ad\u0014\u0015<}Oä\u009fL¡´Õ\u001c\u0004\u0084SìiS°»Ä\u0000gg·ÏÐ7\"\u009f*\u0007Mn\u0089ÖÜ>Ó¦\n\u000eFviÝµEÏ\u00ad?\u0015\"}Iä\u0097Lª´â".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, ErrorCodes.THROWABLE);
        f29141 = cArr;
        f29143 = 4285867184272140242L;
    }

    public C12005hh(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f29145 = webChromeClient;
        this.f29144 = webChromeClient2;
    }

    /* JADX INFO: renamed from: ｋ */
    private WebChromeClient m30260() {
        int i = 2 % 2;
        int i2 = f29140 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29142 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f29145;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private Object m30261() {
        int i = 2 % 2;
        int i2 = f29142 + 93;
        int i3 = i2 % 128;
        f29140 = i3;
        int i4 = i2 % 2;
        WebChromeClient webChromeClient = this.f29144;
        int i5 = i3 + 109;
        f29142 = i5 % 128;
        int i6 = i5 % 2;
        return webChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        int i2 = 2 % 2;
        int i3 = f29140 + 59;
        f29142 = i3 % 128;
        int i4 = i3 % 2;
        try {
            this.f29144.onProgressChanged(webView, i);
            int i5 = f29140 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f29142 = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 35027), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m30259((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (char) KeyEvent.normalizeMetaState(0), 38 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient != null) {
            webChromeClient.onProgressChanged(webView, i);
        } else {
            super.onProgressChanged(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f29140 + 7;
        f29142 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                this.f29144.onReceivedTitle(webView, str);
                throw null;
            }
            this.f29144.onReceivedTitle(webView, str);
            WebChromeClient webChromeClient = this.f29145;
            if (webChromeClient != null) {
                int i3 = f29140 + 29;
                f29142 = i3 % 128;
                if (i3 % 2 == 0) {
                    webChromeClient.onReceivedTitle(webView, str);
                    return;
                } else {
                    webChromeClient.onReceivedTitle(webView, str);
                    super.hashCode();
                    throw null;
                }
            }
            super.onReceivedTitle(webView, str);
        } catch (Throwable th) {
            C12080kb.m30845(m30259((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (char) (TextUtils.lastIndexOf("", '0') + 35028), (ViewConfiguration.getTouchSlop() >> 8) + 24).intern(), m30259((ViewConfiguration.getScrollBarSize() >> 8) + 62, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 25838), (ViewConfiguration.getJumpTapTimeout() >> 16) + 36).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        int i = 2 % 2;
        try {
            this.f29144.onReceivedIcon(webView, bitmap);
            int i2 = f29140 + 13;
            f29142 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30259(KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 35027), 24 - TextUtils.getOffsetBefore("", 0)).intern(), m30259((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 97, (char) (ImageFormat.getBitsPerPixel(0) + 40109), 35 - Gravity.getAbsoluteGravity(0, 0)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient == null) {
            super.onReceivedIcon(webView, bitmap);
            return;
        }
        int i4 = f29140 + 79;
        f29142 = i4 % 128;
        int i5 = i4 % 2;
        webChromeClient.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        int i = 2 % 2;
        try {
            this.f29144.onReceivedTouchIconUrl(webView, str, z);
            int i2 = f29140 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f29142 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 5;
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ExpandableListView.getPackedPositionGroup(0L), (char) (AndroidCharacter.getMirror('0') + 34979), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23).intern(), m30259(133 - TextUtils.getCapsMode("", 0, 0), (char) (5318 - Drawable.resolveOpacity(0, 0)), 43 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient == null) {
            super.onReceivedTouchIconUrl(webView, str, z);
            return;
        }
        webChromeClient.onReceivedTouchIconUrl(webView, str, z);
        int i4 = f29142 + 15;
        f29140 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        int i = 2 % 2;
        try {
            this.f29144.onShowCustomView(view, customViewCallback);
            int i2 = f29142 + 93;
            f29140 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 3;
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (TextUtils.getCapsMode("", 0, 0) + 35027), 24 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m30259(View.MeasureSpec.getSize(0) + 176, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), View.resolveSizeAndState(0, 0, 0) + 37).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient == null) {
            super.onShowCustomView(view, customViewCallback);
            return;
        }
        int i4 = f29140 + 33;
        f29142 = i4 % 128;
        if (i4 % 2 != 0) {
            webChromeClient.onShowCustomView(view, customViewCallback);
            int i5 = 97 / 0;
        } else {
            webChromeClient.onShowCustomView(view, customViewCallback);
        }
        int i6 = f29140 + 103;
        f29142 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        int i2 = 2 % 2;
        int i3 = f29140 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29142 = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                this.f29144.onShowCustomView(view, i, customViewCallback);
                super.hashCode();
                throw null;
            }
            this.f29144.onShowCustomView(view, i, customViewCallback);
            WebChromeClient webChromeClient = this.f29145;
            if (webChromeClient != null) {
                int i4 = f29140 + 105;
                f29142 = i4 % 128;
                if (i4 % 2 == 0) {
                    webChromeClient.onShowCustomView(view, i, customViewCallback);
                    return;
                } else {
                    webChromeClient.onShowCustomView(view, i, customViewCallback);
                    throw null;
                }
            }
            super.onShowCustomView(view, i, customViewCallback);
            int i5 = f29142 + 11;
            f29140 = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30259((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35027), Color.rgb(0, 0, 0) + 16777240).intern(), m30259(176 - TextUtils.getOffsetAfter("", 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 37 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i = 2 % 2;
        int i2 = f29142 + 19;
        f29140 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29144.onHideCustomView();
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ViewConfiguration.getLongPressTimeout() >> 16, (char) (35027 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24).intern(), m30259(213 - TextUtils.getOffsetBefore("", 0), (char) KeyEvent.getDeadChar(0, 0), 37 - View.MeasureSpec.getMode(0)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
            return;
        }
        super.onHideCustomView();
        int i4 = f29140 + 83;
        f29142 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        int i = 2 % 2;
        try {
            this.f29144.onCreateWindow(webView, z, z2, message);
            int i2 = f29142 + 7;
            f29140 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 2;
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30259((Process.getThreadPriority(0) + 20) >> 6, (char) (ExpandableListView.getPackedPositionGroup(0L) + 35027), 24 - View.resolveSize(0, 0)).intern(), m30259((-16776966) - Color.rgb(0, 0, 0), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27375), Color.alpha(0) + 35).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient == null) {
            boolean zOnCreateWindow = super.onCreateWindow(webView, z, z2, message);
            int i4 = f29140 + 45;
            f29142 = i4 % 128;
            int i5 = i4 % 2;
            return zOnCreateWindow;
        }
        int i6 = f29140 + 101;
        f29142 = i6 % 128;
        if (i6 % 2 == 0) {
            return webChromeClient.onCreateWindow(webView, z, z2, message);
        }
        boolean zOnCreateWindow2 = webChromeClient.onCreateWindow(webView, z, z2, message);
        int i7 = 60 / 0;
        return zOnCreateWindow2;
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        int i = 2 % 2;
        int i2 = f29142 + 7;
        f29140 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                this.f29144.onRequestFocus(webView);
                int i3 = f29140 + 21;
                f29142 = i3 % 128;
                int i4 = i3 % 2;
                WebChromeClient webChromeClient = this.f29145;
                if (webChromeClient == null) {
                    super.onRequestFocus(webView);
                    return;
                }
                webChromeClient.onRequestFocus(webView);
                int i5 = f29142 + 9;
                f29140 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }
            this.f29144.onRequestFocus(webView);
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            C12080kb.m30845(m30259(View.resolveSize(0, 0), (char) (35026 - TextUtils.lastIndexOf("", '0', 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24).intern(), m30259(285 - View.MeasureSpec.getSize(0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 35 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        int i = 2 % 2;
        try {
            this.f29144.onCloseWindow(webView);
            int i2 = f29142 + 15;
            f29140 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30259(Process.myPid() >> 22, (char) (35026 - TextUtils.lastIndexOf("", '0', 0, 0)), 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m30259(320 - Color.alpha(0), (char) (34135 - ((byte) KeyEvent.getModifierMetaStateMask())), 34 - KeyEvent.getDeadChar(0, 0)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient != null) {
            int i4 = f29140 + 111;
            f29142 = i4 % 128;
            int i5 = i4 % 2;
            webChromeClient.onCloseWindow(webView);
            return;
        }
        super.onCloseWindow(webView);
        int i6 = f29142 + 29;
        f29140 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f29140 + 35;
        f29142 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29144.onJsAlert(webView, str, str2, jsResult);
        } catch (Throwable th) {
            C12080kb.m30845(m30259((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (35027 - TextUtils.indexOf("", "")), 24 - Drawable.resolveOpacity(0, 0)).intern(), m30259(354 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", "", 0, 0), 30 - KeyEvent.keyCodeFromString("")).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient != null) {
            int i4 = f29142 + 87;
            f29140 = i4 % 128;
            if (i4 % 2 != 0) {
                return webChromeClient.onJsAlert(webView, str, str2, jsResult);
            }
            webChromeClient.onJsAlert(webView, str, str2, jsResult);
            throw null;
        }
        boolean zOnJsAlert = super.onJsAlert(webView, str, str2, jsResult);
        int i5 = f29142 + 43;
        f29140 = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnJsAlert;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f29142 + 21;
        f29140 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29144.onJsConfirm(webView, str, str2, jsResult);
        } catch (Throwable th) {
            C12080kb.m30845(m30259(KeyEvent.getMaxKeyCode() >> 16, (char) (35027 - ((Process.getThreadPriority(0) + 20) >> 6)), Drawable.resolveOpacity(0, 0) + 24).intern(), m30259(384 - KeyEvent.keyCodeFromString(""), (char) (609 - (ViewConfiguration.getTapTimeout() >> 16)), 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient == null) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        boolean zOnJsConfirm = webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        int i4 = f29140 + 53;
        f29142 = i4 % 128;
        int i5 = i4 % 2;
        return zOnJsConfirm;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        int i = 2 % 2;
        try {
            try {
                this.f29144.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                webView = webView;
                str = str;
                str2 = str2;
                str3 = str3;
                jsPromptResult = jsPromptResult;
            } catch (Throwable th) {
                th = th;
                webView = webView;
                str = str;
                str2 = str2;
                str3 = str3;
                jsPromptResult = jsPromptResult;
                C12080kb.m30845(m30259(Color.rgb(0, 0, 0) + 16777216, (char) (35027 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m30259(416 - View.MeasureSpec.getMode(0), (char) (36404 - Gravity.getAbsoluteGravity(0, 0)), 31 - View.MeasureSpec.getMode(0)).intern(), th, false);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient == null) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        int i2 = f29140 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29142 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnJsPrompt = webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        int i4 = f29142 + 11;
        f29140 = i4 % 128;
        int i5 = i4 % 2;
        return zOnJsPrompt;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 2 % 2;
        try {
            this.f29144.onJsBeforeUnload(webView, str, str2, jsResult);
        } catch (Throwable th) {
            C12080kb.m30845(m30259(View.resolveSizeAndState(0, 0, 0), (char) (View.resolveSize(0, 0) + 35027), 24 - TextUtils.getTrimmedLength("")).intern(), m30259(446 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 37 - TextUtils.indexOf("", "", 0)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        Object obj = null;
        if (webChromeClient != null) {
            int i2 = f29140 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f29142 = i2 % 128;
            if (i2 % 2 == 0) {
                return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
            }
            webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
            super.hashCode();
            throw null;
        }
        boolean zOnJsBeforeUnload = super.onJsBeforeUnload(webView, str, str2, jsResult);
        int i3 = f29140 + 89;
        f29142 = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnJsBeforeUnload;
        }
        super.hashCode();
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        int i = 2 % 2;
        int i2 = f29140 + 37;
        f29142 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29144.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } catch (Throwable th) {
            C12080kb.m30845(m30259(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 35028), Color.alpha(0) + 24).intern(), m30259(484 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16777216), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient != null) {
            int i4 = f29140 + 105;
            f29142 = i4 % 128;
            if (i4 % 2 == 0) {
                webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                return;
            } else {
                webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                throw null;
            }
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        int i5 = f29142 + 73;
        f29140 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        int i = 2 % 2;
        int i2 = f29142 + 19;
        f29140 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f29144.onGeolocationPermissionsShowPrompt(str, callback);
                int i3 = 99 / 0;
            } else {
                this.f29144.onGeolocationPermissionsShowPrompt(str, callback);
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30259(TextUtils.getOffsetAfter("", 0), (char) (35027 - (ViewConfiguration.getLongPressTimeout() >> 16)), Process.getGidForName("") + 25).intern(), m30259(528 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (33507 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 55).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient != null) {
            int i4 = f29142 + 89;
            f29140 = i4 % 128;
            int i5 = i4 % 2;
            webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
            return;
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        int i = 2 % 2;
        int i2 = f29142 + 37;
        f29140 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f29144.onGeolocationPermissionsHidePrompt();
                throw null;
            }
            this.f29144.onGeolocationPermissionsHidePrompt();
            WebChromeClient webChromeClient = this.f29145;
            if (webChromeClient != null) {
                webChromeClient.onGeolocationPermissionsHidePrompt();
                int i3 = f29140 + 93;
                f29142 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            super.onGeolocationPermissionsHidePrompt();
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ViewConfiguration.getPressedStateDuration() >> 16, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 35027), View.MeasureSpec.getMode(0) + 24).intern(), m30259(583 - Color.red(0), (char) (59754 - KeyEvent.getDeadChar(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 55).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        int i = 2 % 2;
        try {
            this.f29144.onPermissionRequest(permissionRequest);
            int i2 = f29140 + 13;
            f29142 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30259((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (35028 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 25).intern(), m30259(637 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 41).intern(), th, false);
        }
        try {
            if (this.f29145 == null) {
                super.onPermissionRequest(permissionRequest);
                return;
            }
            int i4 = f29142 + 81;
            f29140 = i4 % 128;
            int i5 = i4 % 2;
            this.f29145.onPermissionRequest(permissionRequest);
        } catch (Throwable th2) {
            C12080kb.m30845(m30259(ViewConfiguration.getEdgeSlop() >> 16, (char) (35027 - TextUtils.getOffsetAfter("", 0)), 23 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m30259(679 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 42 - TextUtils.lastIndexOf("", '0')).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        int i = 2 % 2;
        int i2 = f29142 + 107;
        f29140 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29144.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 35027), 23 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), m30259((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 720, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48).intern(), th, false);
        }
        try {
            if (this.f29145 != null) {
                int i4 = f29142 + 109;
                f29140 = i4 % 128;
                if (i4 % 2 != 0 || Build.VERSION.SDK_INT >= 71) {
                    int i5 = f29142 + 63;
                    f29140 = i5 % 128;
                    if (i5 % 2 != 0) {
                        this.f29145.onPermissionRequestCanceled(permissionRequest);
                        return;
                    } else {
                        this.f29145.onPermissionRequestCanceled(permissionRequest);
                        throw null;
                    }
                }
                return;
            }
            super.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th2) {
            C12080kb.m30845(m30259(View.MeasureSpec.getMode(0), (char) (KeyEvent.normalizeMetaState(0) + 35027), 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), m30259(770 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), (Process.myPid() >> 22) + 51).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        boolean zOnJsTimeout;
        int i = 2 % 2;
        int i2 = f29140 + 17;
        f29142 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f29144.onJsTimeout();
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ViewConfiguration.getScrollBarSize() >> 8, (char) (35027 - TextUtils.indexOf("", "", 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 24).intern(), m30259((ViewConfiguration.getPressedStateDuration() >> 16) + 820, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getCapsMode("", 0, 0) + 32).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient == null) {
            return super.onJsTimeout();
        }
        int i4 = f29142 + 109;
        f29140 = i4 % 128;
        if (i4 % 2 == 0) {
            zOnJsTimeout = webChromeClient.onJsTimeout();
            int i5 = 79 / 0;
        } else {
            zOnJsTimeout = webChromeClient.onJsTimeout();
        }
        int i6 = f29142 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29140 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
        return zOnJsTimeout;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = f29140 + 113;
        f29142 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.f29144.onConsoleMessage(str, i, str2);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            this.f29144.onConsoleMessage(str, i, str2);
            WebChromeClient webChromeClient = this.f29145;
            if (webChromeClient != null) {
                int i4 = f29140 + 23;
                f29142 = i4 % 128;
                if (i4 % 2 == 0) {
                    webChromeClient.onConsoleMessage(str, i, str2);
                    return;
                } else {
                    webChromeClient.onConsoleMessage(str, i, str2);
                    int i5 = 55 / 0;
                    return;
                }
            }
            super.onConsoleMessage(str, i, str2);
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (35027 - (ViewConfiguration.getLongPressTimeout() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 24).intern(), m30259(851 - Process.getGidForName(""), (char) (17436 - TextUtils.lastIndexOf("", '0', 0)), (Process.myPid() >> 22) + 37).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        int i = 2 % 2;
        int i2 = f29142 + 53;
        f29140 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f29144.onConsoleMessage(consoleMessage);
                throw null;
            }
            this.f29144.onConsoleMessage(consoleMessage);
            WebChromeClient webChromeClient = this.f29145;
            if (webChromeClient != null) {
                int i3 = f29140 + 57;
                f29142 = i3 % 128;
                int i4 = i3 % 2;
                return webChromeClient.onConsoleMessage(consoleMessage);
            }
            return super.onConsoleMessage(consoleMessage);
        } catch (Throwable th) {
            C12080kb.m30845(m30259(View.MeasureSpec.makeMeasureSpec(0, 0), (char) (35027 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (Process.myPid() >> 22) + 24).intern(), m30259(852 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (17437 - KeyEvent.keyCodeFromString("")), View.resolveSize(0, 0) + 37).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        int i = 2 % 2;
        int i2 = f29140 + 9;
        f29142 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f29144.getDefaultVideoPoster();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            this.f29144.getDefaultVideoPoster();
            WebChromeClient webChromeClient = this.f29145;
            if (webChromeClient != null) {
                int i3 = f29140 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f29142 = i3 % 128;
                int i4 = i3 % 2;
                return webChromeClient.getDefaultVideoPoster();
            }
            return super.getDefaultVideoPoster();
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ViewConfiguration.getPressedStateDuration() >> 16, (char) (35027 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 23 - Process.getGidForName("")).intern(), m30259(AndroidCharacter.getMirror('0') + 841, (char) (64790 - ExpandableListView.getPackedPositionGroup(0L)), ExpandableListView.getPackedPositionType(0L) + 42).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        int i = 2 % 2;
        try {
            this.f29144.getVideoLoadingProgressView();
        } catch (Throwable th) {
            C12080kb.m30845(m30259(Color.green(0), (char) (35027 - (ViewConfiguration.getTapTimeout() >> 16)), 23 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), m30259((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 931, (char) (48113 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f29145;
        if (webChromeClient != null) {
            View videoLoadingProgressView = webChromeClient.getVideoLoadingProgressView();
            int i2 = f29142 + 113;
            f29140 = i2 % 128;
            int i3 = i2 % 2;
            return videoLoadingProgressView;
        }
        View videoLoadingProgressView2 = super.getVideoLoadingProgressView();
        int i4 = f29140 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29142 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return videoLoadingProgressView2;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        int i = 2 % 2;
        int i2 = f29140 + 81;
        f29142 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                this.f29144.getVisitedHistory(valueCallback);
                super.hashCode();
                throw null;
            }
            this.f29144.getVisitedHistory(valueCallback);
            int i3 = f29142 + 1;
            f29140 = i3 % 128;
            int i4 = i3 % 2;
            WebChromeClient webChromeClient = this.f29145;
            if (webChromeClient == null) {
                super.getVisitedHistory(valueCallback);
                return;
            }
            int i5 = f29140 + 43;
            f29142 = i5 % 128;
            if (i5 % 2 == 0) {
                webChromeClient.getVisitedHistory(valueCallback);
            } else {
                webChromeClient.getVisitedHistory(valueCallback);
                throw null;
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30259(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (35028 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 24).intern(), m30259(979 - KeyEvent.normalizeMetaState(0), (char) (10081 - View.MeasureSpec.getSize(0)), AndroidCharacter.getMirror('0') - '\n').intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int i = 2 % 2;
        try {
            this.f29144.onShowFileChooser(webView, valueCallback, fileChooserParams);
        } catch (Throwable th) {
            C12080kb.m30845(m30259(1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (35026 - TextUtils.indexOf((CharSequence) "", '0')), 24 - View.resolveSize(0, 0)).intern(), m30259(TextUtils.indexOf("", "") + 1017, (char) (View.resolveSizeAndState(0, 0, 0) + 19629), 37 - ImageFormat.getBitsPerPixel(0)).intern(), th, false);
        }
        if (this.f29145 == null) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        int i2 = f29142 + 75;
        f29140 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnShowFileChooser = this.f29145.onShowFileChooser(webView, valueCallback, fileChooserParams);
        int i4 = f29142 + 85;
        f29140 = i4 % 128;
        int i5 = i4 % 2;
        return zOnShowFileChooser;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0075  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        int i2 = f29142 + 53;
        f29140 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        byte b = 0;
        if (iHashCode != 1395849045) {
            if (iHashCode != 1442029578 || (!str.equals(m30259(View.getDefaultSize(0, 0) + 1055, (char) View.MeasureSpec.getMode(0), AndroidCharacter.getMirror('0') - 23).intern()))) {
                b = -1;
            }
        } else if (str.equals(m30259(ImageFormat.getBitsPerPixel(0) + 1081, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 20 - (Process.myTid() >> 22)).intern())) {
            int i4 = f29142;
            int i5 = i4 + 3;
            f29140 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 47;
            f29140 = i7 % 128;
            int i8 = i7 % 2;
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            return m30260();
        }
        if (b != 1) {
            return null;
        }
        return m30261();
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30259(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f29141[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29143)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
