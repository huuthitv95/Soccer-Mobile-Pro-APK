package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.google.protobuf.ByteString;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.InterfaceC11669Sd;
import com.ironsource.mediationsdk.demandOnly.InterfaceC12339e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsBaseOptions;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerHide;
import com.unity3d.services.banners.BannerShow;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.UnityBanners;
import com.unity3d.services.banners.api.Banner;
import com.unity3d.services.banners.api.BannerListener;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.banners.properties.BannerProperties;
import com.unity3d.services.banners.view.BannerEvent;
import com.unity3d.services.banners.view.BannerPosition;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.monetization.UnityMonetization;
import com.unity3d.services.monetization.placementcontent.ads.ShowAdListenerAdapter;
import com.unity3d.services.monetization.placementcontent.core.CustomEvent;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.p299v1.DiagnosticEventRequestOuterClass;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ce */
/* JADX INFO: loaded from: classes6.dex */
public final class C11867ce extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻛ */
    private static long f28090 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f28091 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28092 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f28093;

    static {
        char[] cArr = new char[1265];
        ByteBuffer.wrap("\u0000-èAùÒË-Ü\u0098®Í°\u001d\u0081\u0080\u0093ÿe\u0001v\u0092Xí*X;\u008d\rÝ\u001f@à¿\u001a\u000f\u000b\u009c9c.Ö\\\u0083BSsÎa±\u0097S\u0084çª¤Ø\u000bÉÎÿ«í+\u0012æ\u0000©6>'ãUQ{\u000eh÷\u009eD\u008c'½èpHaÛS$D\u00916Ä(\u0014\u0019\u0089\u000böý\u0014î Àã²L£\u0089\u0095ì\u0087lx¡jî\\pMµ?\u0011\u0011X\u0002»ô\tæ`×¹É9»d¬Ö\u009e\tppaÃS EoXJIÙ{&l\u0093\u001eÆ\u0000\u00161\u008b#ôÕ\bÆ\u0092èí\u009aq\u008b\u0096½ò¯XP\u0086BïtGH$Y\u009akw|í\u000e²\u0010n!é3\u008dÅGÖÙø\u0090\u008a8\u0000W\u0011Í#24ªFÅX9i\u0085{ý\u008d3\u009e\u009c°ÕÂNÓ\u0085åæ÷D\u0000W\u0011Í#24®FÉX-i\u0087{Ý\u008d6\u009e\u008d°þÂLÓ£åé÷D\b½\u001aç,G=¢O\u0001\u0000U\u0011Æ#94\u008cFÙX\u0005i\u009f{ö\u008d%\u009e\u009c°ùÂBÓ\u0081åü÷Y\b·\u001aîeNtÝF\"Q\u0092#ü=1\f¡\u001eìè.û\u0081Õè§K¶\u0098\u0080ç\u0092lm¡\u007füIEX¹*\u0000\u0004O2\u0084#\u001a\u0011ä\u0006Kt\bjâ[rI)¿â¬A\u0082#\u0000U\u0011Æ#94\u008cFÙX\ti\u0094{ë\u008d\u0017\u009e\u008d°òÂnÓ\u0089åí÷GøwéíÛ\u0012Ì\u008a¾å \u0019\u0091¥\u0083Ýu\u0013f¼ö\u0082ç\u000fÕÆÂU°\n®ÿ\u009fr\u008d8{÷hBF%4\u0092%W\u00132ÒýÃvñ\u0081æ)\u0094z\u008a\u0085\b\u008b\u0019\u0018+ç<RN\u0007PÔaOs(\u0085ð\u0096S¸<Ê\u0095\u009b8\u008a«¸T¯áÝ´Ãgòüà\u009b\u0016C\u0005à+\u008fY\u0006Hä~\u009fl8\u0000B\u0011É#>4\u0096FÅX:i£{ð\u008d/\u009e\u009f]ÖL]~ªi\u0002\u001bQ\u0005®4,&eÐ°Ã\u0019\u0000B\u0011É#>4\u0096FÅX:iµ{î\u008d%\u009e\u0086°äLå]no\u0099x1\nb\u0014\u009d%\u001b7VÁ\u0094Ò;üR\u008eñ\u009f\"©]\u0000B\u0011É#>4\u0096FÅX:i\u0083{Õ\u008d/\u009e\u008c°åÂTÓ\u0085åË÷_\b¶\u001aæ,A=·O\raRr©\u0084\u0004\u0096q§¯¹\u0006\u00942\u0085¹·N æÒµÌJýÐï\u009a\u0019_\nè$\u0085V:Gäq\u0091c%\u009cÛ\u0000B\u0011É#>4\u0096FÅX:i {÷\u008d3\u009e\u0081°äÂQÓ\u008fåæ\u0000B\u0011É#>4\u0096FÅX:i§{ý\u008d\"\u009e¸°üÂYÓ\u0099åí÷B\b\u009b\u001aï,F=¤O\u0019aIr¦\u0084\u0015\u0096j\u0000B\u0011É#>4\u0096FÅX:iµ{ê\u008d2\u009e\u0087°âÂ{Ó\u008fåì÷U\u0000B\u0011É#>4\u0096FÅX:iµ{ê\u008d2\u009e\u0087°âÂqÓ\u008eåî÷_\u0000B\u0011É#>4\u0096FÅX:i¦{ñ\u008d%\u009e\u009f\u0000c\u0011Ç#=4ÖFÕX&i\u0099{ì\u008d9\u009eÛ°ôÂ\u0016Ó\u0093åí÷B\b®\u001aé,K=µO\u000ba\u000erª\u0084\u0011\u0096v§®¹\rËbÜËîN\u0000J\u0011Ñ#65nFÍX\"i®{É\u008d-\u009e\u0087\u0018-\t¦;Q,ù^ª@UqÉc\u009e\u0095J\u0086ð¨¼Ú6Ëìý\u008fï:\u0000I\u0011ý#>4\u0091FÔX1i²{ù\u008d.\u009e\u0086°õÂJÓ¬åá÷C\b¬\u001aå,F=µO\n¿\u0084®\u000f\u009cø\u008bPù\u0003çüÖ`Ä72ã!Y\u000f\u001f}²lOZ=H\u0082·{¥(\u0093\u008b\u0082d§{¶ð\u0084\u0007\u0093¯áüÿ\u0003Î\u009fÜÈ*\u001c9¦\u0017åehtªBÅPl¯\u008f½Ü\u008bc¨\u0013¹\u0098\u008bo\u009cÇî\u0094ðkÁ÷Ó %t6Î\u0018\u008ej\u0005{ÕS\u000eBªpPg»\u0015¸\u000bK:ô(\u0081ÞTÍ¶ã\u0099\u0091{\u0080þ¶\u0080¤/[ÃI\u0084\u007f&nØ\u001cf2c!Ç×|Å\u001bôÃê`\u0098\u000f\u008f¦½#S\u0013B´pPf\u001a\u0015ë\u000b\u007f:ô(£ÞKÍøã\u0087\u0091{\u0080ì¶\u0098¤\"\u0085·\u0094,¦Í±eÃ\"ÝÚìsþ\f\bÔ\u001bw56G¬Vs`/r¨\u008dL\u009f\u0006©\u009d¸HÊúä¡÷U\u0001à\u0013\u0090\u0000c\u0011Ç#=4ÖFÕX&i\u0099{ì\u008d9\u009eÛ°ôÂ\u0016Ó\u0081åì÷C\bö\u001aá,L= O\u0014aAr±\u0084\u0015\u0096j§î¹.ËeÜÔî\f\u0000[\u0011Ó#*5eFÍX>i¯{Å\u008d*\u009e¦°ñÂ%Ó\u009fåÔ÷Q\b\u0093\u001aø,\\=¹Où\u0000A\u0011Ì#\u001f4\u009aFÊX-i\u0093{ìçÚö]Ä¯Ó\u0011¡T¿º\u008e\u000f\u009cEj®y\u001fWg%Ð4\u0018\u0002a\u0010Îï&ýuËäÚ.¨\u0081\u0086í\u0095:c\u008eqô@\u001a^\u0097,Û;O\t\u009açêöNÄ±©\u0086¸\u0015\u008aê\u009d_ï\nñÚÀGÒ8$ß7T\u0019\"k\u008fz|L+^\u0097¡b³<\u0085\u0095\u0094p^²O!}Þjk\u0018>\u0006î7s%\fÓåÀnî\u0004\u009cº\u008dH»\u001f©£VVD\br¡cD-Ó<^\u000e\u0084\u0019\u0005k@u·D\u0003V~\u0000C\u0011Ä#94\u009dFÎX<i {ê\u008d/\u009e\u0098°õÂJÓ\u0094åá÷U\b«;L*É\u00189\u000f\u0097}Æc/R\u008b@ä¶!¥\u0083\u008bÝùFè\u008dÞîÌL¶N§ú\u00959\u0082\u0096ðÓî6ß¶Íû;4(¼\u0006ÿtPe\u0090SÃA^¾¬¬ó\u009aJ\u008b¹ù\u001a×U\u0004É\u0015c'\u008a0\u0015B{\\\u0094m,\u007fS\u0089\u0080\u009a2´iÆó×,ápó÷\f\u0013\u001eY(Ç9\u000eK¦\u0000c\u0011Ú#54\u0099FÔX-i¤{Ú\u008d\u0017\u009e\u008d°òÂnÓ\u0089åí÷G\b\u0099\u001að,X\u0000s\u0011Í#$4»FÕX:i\u0082{ý\u008d.\u009e\u009c°ÇÂ]Ó\u0082åÞ÷Y\b½\u001a÷,i= O\b\u0000g\u0011Í#$4¿FÁX%i\u0095{Ñ\u008d$¨s¹Ù\u008b0\u009c¹îÚð5Á\u0090Óõ%\u00156\u0098\u0018÷j`{\u009dMï_P ©²ú\u0084Y\u0095¶9\u009e( \u001aÉ\r@\u007f#aÌPiB\f´ì§a\u0089\u000eû\u0099êdÜ\u0016Î©1P#\u0003\u0015 \u0004O¯R¾ÿ\u008c\u0007\u009b\u009eéý÷\u0012Æ·ÔÒ\"21¿\u001fÐmG|ºJÈXw§\u008eµÝ\u0083~\u0092\u0091\u0000r\u0011Í#=4\u0097FÖX-i¥{ö\u008d)\u009e\u009c°éÂyÓ\u0084åû÷|\b±\u001aó,\\=µO\u0016aErº\u0000g\u0011Í#$4¯FÅX*i¦{ñ\u008d%\u009e\u009f°ÕÂNÓ\u0085åæ÷D\b\u009b\u001aá,\\=µO\u001faOrº\u0084\t\u0001û\u0010Q\"¸53GYY¶h>za\u008c\u00ad\u009f\u0001±iÃ×Ò\bäQöÚ\t!\u001br-À\u0000g\u0011Í#$4¨FÌX)i\u0093{ý\u008d-\u009e\u008d°þÂLÓ©åì\u0000g\u0011Í#$4ºFÁX&i\u009e{ý\u008d2\u009e¤°ùÂKÓ\u0094åí÷^\b½\u001aò$÷5I\u0007 \u0010>bE|¢M\u001a_y©¶º \u0094}æÏ÷\u0010ÁiÓÚ,9>v\u0007Í\u0016g$\u008e3\u001dAz_\u0092n5|@\u008a\u009e\u00997·TÅûÔ>â[ðÓ\u000f\u0016\b?\u0019\u0095+|<ðN\u0094PqaËs¥\u0085u\u0096Õ¸¦Ê\u0014Ûñí´ÿ.\u0000ò\u0012·$\u001d5ÉGDi7zò\u008cB\u009e%¯û±D\u0000g\u0011Í#$4´FÏX)i\u0094{×\u008d0\u009e\u009c°ùÂWÓ\u008eåûJ¨[\u0002ië~s\f\u000e\u0012ó#^\u0000g\u0011Í#$4¿FÁX%i\u0095{Ñ\u008d$\u009e®°âÂWÓ\u008dåË÷\\\b±\u001aå,F=¤O(aRr§\u0084\u0000\u0096}§²¹\u001cËyÜÝî\u0013\u0000g\u0011Í#$4¨FÌX)i\u0093{ý\u008d-\u009e\u008d°þÂLÓ©åì÷v\bª\u001aï,E=\u0094O\u0011aAr¯\u0084\u001e\u0096w§³¹\u001cËyÜÛî%\u0000~\u0011Õ#65t\u0000g\u0011Í#$4«FÔX:i\u0099{ö\u008d'\u009e¼°ñÂ_Ó\u0093\u0099Ö\u0088{º\u0092\u00ad!ß~Á\u008bE§T\u0010fåqL\u0003\u001e\u001dé,M>(ÈèÛ\\õ3É=Ø\u0082ênýÂ\u008f\u008a\u0091t Ëz±k\u000eYàNT<\u000f\"ý\u0013V\u0000C\u0011é#\u00134°Fåx\u0096i2[ËLc>0 Þ\u0011q\u0003\u0004õÃætÈ\u0011º´N\u0011_¾m]zè\b£\u0016M'÷\u0000B\u0011ú#\u001f4¹FäX\u000bi±{Ë\u008d\u0014\u0000L\u0011á#\u00164½FãX\u0011i³{Ô\u008d\u0005\u0000C\u0011ç#\u001d4¨FìX\ri¤{Ýn\u0091\u007f>MÎZc(26Û".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1265);
        f28093 = cArr;
        f28090 = -5447189470077644376L;
    }

    /* JADX INFO: renamed from: ﭴ */
    static /* synthetic */ String m29499() {
        int i = 2 % 2;
        int i2 = f28091 + 67;
        f28092 = i2 % 128;
        if (i2 % 2 == 0) {
            m29502();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM29502 = m29502();
        int i3 = f28091 + 9;
        f28092 = i3 % 128;
        int i4 = i3 % 2;
        return strM29502;
    }

    /* JADX INFO: renamed from: ﮉ */
    static /* synthetic */ Object m29501() {
        int i = 2 % 2;
        int i2 = f28092 + 5;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        Object objM29500 = m29500();
        int i4 = f28092 + 7;
        f28091 = i4 % 128;
        if (i4 % 2 == 0) {
            return objM29500;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m29510(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f28091 + 107;
        f28092 = i2 % 128;
        int i3 = i2 % 2;
        m29505(iUnityAdsListener);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = f28092 + 19;
        f28091 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m29511(BannerView bannerView, BannerView.IListener iListener) {
        int i = 2 % 2;
        int i2 = f28091 + 39;
        f28092 = i2 % 128;
        int i3 = i2 % 2;
        m29526(bannerView, iListener);
        int i4 = f28092 + 75;
        f28091 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ ByteString m29513(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f28092 + 65;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        ByteString byteStringM29521 = m29521(adObject);
        int i4 = f28091 + 89;
        f28092 = i4 % 128;
        if (i4 % 2 != 0) {
            return byteStringM29521;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29514(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f28091 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28092 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29519(bannerView);
        }
        m29519(bannerView);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ Map m29515(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f28091 + 15;
        f28092 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29509(diagnosticEvent);
        }
        m29509(diagnosticEvent);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ JSONObject m29516(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i = 2 % 2;
        int i2 = f28091 + 11;
        f28092 = i2 % 128;
        if (i2 % 2 == 0) {
            m29524(unityAdsLoadOptions);
            throw null;
        }
        JSONObject jSONObjectM29524 = m29524(unityAdsLoadOptions);
        int i3 = f28092 + 65;
        f28091 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
        return jSONObjectM29524;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ UnityAdsLoadOptions m29518(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f28092 + 75;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        UnityAdsLoadOptions unityAdsLoadOptionsM29507 = m29507(adObject);
        int i4 = f28092 + 63;
        f28091 = i4 % 128;
        if (i4 % 2 == 0) {
            return unityAdsLoadOptionsM29507;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m29525(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f28091 + 67;
        f28092 = i2 % 128;
        int i3 = i2 % 2;
        m29517(iUnityAdsListener);
        int i4 = f28091 + 73;
        f28092 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ BannerView.IListener m29527(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f28091 + 113;
        f28092 = i2 % 128;
        int i3 = i2 % 2;
        BannerView.IListener iListenerM29522 = m29522(bannerView);
        int i4 = f28092 + 31;
        f28091 = i4 % 128;
        int i5 = i4 % 2;
        return iListenerM29522;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29530(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f28092 + 21;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        String strM29508 = m29508(adObject);
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return strM29508;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29531(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f28091 + 45;
        f28092 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29523(diagnosticEvent);
        }
        m29523(diagnosticEvent);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m29532(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f28092 + 77;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        m29520(iUnityAdsListener);
        int i4 = f28092 + 93;
        f28091 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public C11867ce(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        String version = UnityAds.getVersion();
        if (version == null) {
            int i2 = f28092 + 97;
            f28091 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f28092 + 97;
        f28091 = i4 % 128;
        int i5 = i4 % 2;
        String str = version.split(m29529(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern())[0];
        int i6 = f28092 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f28091 = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x050c  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0496  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo28808(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2043984616:
                b = !str.equals(m29529(410 - AndroidCharacter.getMirror('0'), (char) Gravity.getAbsoluteGravity(0, 0), 24 - View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case -2015334886:
                b = !str.equals(m29529(744 - ExpandableListView.getPackedPositionChild(0L), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11666), 8 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 40;
                break;
            case -1797664962:
                if (!str.equals(m29529((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 140, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i2 = f28092 + 113;
                    f28091 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b = 7;
                    } else {
                        b = 6;
                    }
                }
                break;
            case -1769924254:
                b = !str.equals(m29529(666 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 7 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()) ? (byte) -1 : (byte) 36;
                break;
            case -1719935914:
                b = !str.equals(m29529(537 - (Process.myTid() >> 22), (char) (43088 - TextUtils.indexOf((CharSequence) "", '0', 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13).intern()) ? (byte) -1 : (byte) 32;
                break;
            case -1673897431:
                b = !str.equals(m29529(386 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 15).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -1673719574:
                b = !str.equals(m29529((ViewConfiguration.getKeyRepeatDelay() >> 16) + 401, (char) TextUtils.indexOf("", ""), 15 - TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : Ascii.f22491EM;
                break;
            case -1627944928:
                if (!str.equals(m29529(TextUtils.getTrimmedLength("") + 292, (char) ((-16757593) - Color.rgb(0, 0, 0)), KeyEvent.keyCodeFromString("") + 14).intern())) {
                    b = -1;
                } else {
                    int i3 = f28091 + 111;
                    f28092 = i3 % 128;
                    int i4 = i3 % 2;
                    b = 19;
                }
                break;
            case -1543737546:
                b = !str.equals(m29529(-MotionEvent.axisFromString(""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.NAK), 16 - TextUtils.getCapsMode("", 0, 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1347165098:
                b = !str.equals(m29529(93 - Drawable.resolveOpacity(0, 0), (char) (18543 - TextUtils.lastIndexOf("", '0')), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1258512514:
                if (!str.equals(m29529(ExpandableListView.getPackedPositionGroup(0L) + 753, (char) TextUtils.getOffsetAfter("", 0), 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i5 = f28092 + 73;
                    f28091 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 41;
                }
                break;
            case -1251710408:
                if (!str.equals(m29529(Color.rgb(0, 0, 0) + 16777766, (char) (21356 - Process.getGidForName("")), 44 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i7 = f28091 + 81;
                    f28092 = i7 % 128;
                    if (i7 % 2 != 0) {
                        b = 33;
                    } else {
                        b = 10;
                    }
                }
                break;
            case -858834302:
                b = !str.equals(m29529((Process.myPid() >> 22) + 246, (char) (39790 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 14 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case -800280637:
                if (!str.equals(m29529(305 - TextUtils.lastIndexOf("", '0', 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.indexOf("", "") + 26).intern())) {
                    b = -1;
                } else {
                    int i8 = f28091 + 51;
                    f28092 = i8 % 128;
                    if (i8 % 2 != 0) {
                        b = 20;
                    } else {
                        b = 26;
                    }
                }
                break;
            case -618035586:
                if (!str.equals(m29529((ViewConfiguration.getJumpTapTimeout() >> 16) + 189, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15).intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -598903877:
                b = !str.equals(m29529(Drawable.resolveOpacity(0, 0) + 157, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25886), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -553681069:
                b = !str.equals(m29529(ExpandableListView.getPackedPositionChild(0L) + 676, (char) (Color.rgb(0, 0, 0) + 16836507), Color.green(0) + 32).intern()) ? (byte) -1 : (byte) 37;
                break;
            case -327500225:
                if (!str.equals(m29529(View.MeasureSpec.getMode(0) + 120, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 20 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -324825325:
                b = !str.equals(m29529((ViewConfiguration.getLongPressTimeout() >> 16) + 769, (char) (Color.alpha(0) + 15112), 15 - Color.red(0)).intern()) ? (byte) -1 : (byte) 42;
                break;
            case -324012869:
                b = !str.equals(m29529((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 203, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 63520), 9 - ImageFormat.getBitsPerPixel(0)).intern()) ? (byte) -1 : Ascii.f22503VT;
                break;
            case -262912338:
                if (!str.equals(m29529(281 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) View.resolveSize(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12).intern())) {
                    b = -1;
                } else {
                    int i9 = f28092 + 55;
                    f28091 = i9 % 128;
                    b = i9 % 2 == 0 ? (byte) 18 : (byte) 119;
                }
                break;
            case -249507173:
                if (!str.equals(m29529(KeyEvent.keyCodeFromString("") + 618, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 49 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b = -1;
                } else {
                    int i10 = f28092 + 77;
                    f28091 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 5 / 3;
                    }
                    b = 35;
                }
                break;
            case -133620343:
                b = !str.equals(m29529(ExpandableListView.getPackedPositionType(0L) + 178, (char) (12999 - TextUtils.indexOf("", "")), (KeyEvent.getMaxKeyCode() >> 16) + 11).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -30759555:
                b = !str.equals(m29529((ViewConfiguration.getTapTimeout() >> 16) + 17, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6746), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SUB).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 29694293:
                b = !str.equals(m29529((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 784, (char) (46599 - (KeyEvent.getMaxKeyCode() >> 16)), 20 - TextUtils.lastIndexOf("", '0', 0)).intern()) ? (byte) -1 : (byte) 43;
                break;
            case 67119908:
                b = !str.equals(m29529(594 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 34288), (ViewConfiguration.getTouchSlop() >> 8) + 24).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 252148886:
                b = str.equals(m29529(View.resolveSizeAndState(0, 0, 0) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63170), View.MeasureSpec.getMode(0) + 14).intern()) ? Ascii.f22492FF : (byte) -1;
                break;
            case 539301490:
                b = !str.equals(m29529((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 726, (char) (24294 - ExpandableListView.getPackedPositionChild(0L)), Process.getGidForName("") + 20).intern()) ? (byte) -1 : (byte) 39;
                break;
            case 626721475:
                b = !str.equals(m29529((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 75, (char) (TextUtils.getOffsetBefore("", 0) + 22559), TextUtils.getCapsMode("", 0, 0) + 18).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 692588017:
                if (!str.equals(m29529(465 - KeyEvent.getDeadChar(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 6256), 15 - KeyEvent.keyCodeFromString("")).intern())) {
                    b = -1;
                } else {
                    int i12 = f28091 + 13;
                    f28092 = i12 % 128;
                    int i13 = i12 % 2;
                    b = Ascii.f22493FS;
                }
                break;
            case 819533772:
                b = !str.equals(m29529(View.MeasureSpec.getMode(0) + 480, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 20).intern()) ? (byte) -1 : Ascii.f22494GS;
                break;
            case 961427118:
                b = !str.equals(m29529((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 271, (char) (KeyEvent.normalizeMetaState(0) + 23956), Color.green(0) + 10).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 961754217:
                b = !str.equals(m29529((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 260, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 10).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 961844241:
                if (!str.equals(m29529(416 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 26;
                }
                break;
            case 1067215379:
                b = !str.equals(m29529(((Process.getThreadPriority(0) + 20) >> 6) + 426, (char) (Process.getGidForName("") + 1), 39 - Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : Ascii.ESC;
                break;
            case 1246120607:
                if (str.equals(m29529(105 - (ViewConfiguration.getTapTimeout() >> 16), (char) View.resolveSize(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15).intern())) {
                    int i14 = f28091 + 23;
                    f28092 = i14 % 128;
                    int i15 = i14 % 2;
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case 1326268204:
                b = !str.equals(m29529(TextUtils.indexOf((CharSequence) "", '0') + 501, (char) (49094 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.getOffsetBefore("", 0) + 19).intern()) ? (byte) -1 : Ascii.f22498RS;
                break;
            case 1374920114:
                b = !str.equals(m29529(234 - KeyEvent.normalizeMetaState(0), (char) (2271 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 12 - Drawable.resolveOpacity(0, 0)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case 1407526303:
                b = !str.equals(m29529(332 - TextUtils.getTrimmedLength(""), (char) (38000 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17).intern()) ? (byte) -1 : Ascii.NAK;
                break;
            case 1646468069:
                if (!str.equals(m29529(TextUtils.getCapsMode("", 0, 0) + 519, (char) (Color.green(0) + 42809), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18).intern())) {
                    b = -1;
                } else {
                    int i16 = f28091 + 105;
                    f28092 = i16 % 128;
                    int i17 = i16 % 2;
                    b = Ascii.f22502US;
                }
                break;
            case 1658279126:
                b = !str.equals(m29529(TextUtils.lastIndexOf("", '0') + 43, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28701), 32 - TextUtils.lastIndexOf("", '0')).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 1982491468:
                b = !str.equals(m29529(227 - TextUtils.lastIndexOf("", '0', 0), (char) (53951 - Color.blue(0)), View.combineMeasuredStates(0, 0) + 6).intern()) ? (byte) -1 : (byte) 13;
                break;
            case 2020034237:
                b = !str.equals(m29529(755 - AndroidCharacter.getMirror('0'), (char) (AndroidCharacter.getMirror('0') + 43427), 19 - KeyEvent.keyCodeFromString("")).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 2068667541:
                b = !str.equals(m29529(349 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 22;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return UnityAds.class;
            case 1:
                return IUnityAdsListener.class;
            case 2:
                return IUnityAdsExtendedListener.class;
            case 3:
                return WebViewApp.class;
            case 4:
                return d.class;
            case 5:
                return WebRequestEvent.class;
            case 6:
                return WebViewEventCategory.class;
            case 7:
                return UnityMonetization.class;
            case 8:
                return ShowAdListenerAdapter.class;
            case 9:
                return CustomEvent.class;
            case 10:
                return WebView.class;
            case 11:
                return WebRequest.class;
            case 12:
                return AdUnitActivity.class;
            case 13:
                return Banner.class;
            case 14:
                return UnityBanners.class;
            case 15:
                return UnityBannerSize.class;
            case 16:
                return BannerShow.class;
            case 17:
                return BannerHide.class;
            case 18:
                return BannerEvent.class;
            case 19:
                return BannerListener.class;
            case 20:
                return BannersModuleConfiguration.class;
            case 21:
                return BannerProperties.class;
            case 22:
                return BannerPosition.class;
            case 23:
                return BannerWebPlayerContainer.class;
            case 24:
                return BannerErrorCode.class;
            case 25:
                return BannerErrorInfo.class;
            case 26:
            case 27:
                return BannerView.class;
            case 28:
                return BannerViewCache.class;
            case 29:
                return IUnityBannerListener.class;
            case 30:
                return BannerView.IListener.class;
            case 31:
                return BannerView.Listener.class;
            case 32:
            case 33:
                return com.unity3d.services.banners.view.BannerView.class;
            case 34:
            case 35:
                return FullScreenWebViewDisplay.class;
            case 36:
                return AdObject.class;
            case 37:
                return AndroidFullscreenWebViewAdPlayer.class;
            case 38:
                return UnityAdsLoadOptions.class;
            case 39:
                return UnityAdsBaseOptions.class;
            case 40:
                return AdFormat.class;
            case 41:
                return ClientProperties.class;
            case 42:
                return DiagnosticEventRequestOuterClass.DiagnosticEvent.class;
            case 43:
                return IUnityAdsShowListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29529(805 - Color.blue(0), (char) (1199 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new AbstractC11840be.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29506();
            }
        });
        map.put(m29529(826 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) Color.blue(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 18).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.15
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.this.m29533(list.get(0), interfaceC11874cl);
            }
        });
        map.put(m29529(844 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20).intern(), new AbstractC11840be.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.13
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11867ce.m29512(list.get(0));
                return null;
            }
        });
        map.put(m29529(Color.rgb(0, 0, 0) + 16778079, (char) TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.getMode(0) + 9).intern(), new AbstractC11840be.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.12
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29504();
            }
        });
        map.put(m29529(871 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43029), 18 - TextUtils.lastIndexOf("", '0')).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.17
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29501();
            }
        });
        map.put(m29529((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 891, (char) (14829 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 19 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.16
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11867ce.m29525((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m29529(910 - Gravity.getAbsoluteGravity(0, 0), (char) (View.MeasureSpec.getMode(0) + 44851), 19 - View.resolveSizeAndState(0, 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.20
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11867ce.m29532((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m29529(Drawable.resolveOpacity(0, 0) + PDF417Common.NUMBER_OF_CODEWORDS, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.18
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11867ce.m29510((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m29529((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 951, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + 23).intern(), new AbstractC11840be.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.19
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29528((String) list.get(0));
            }
        });
        map.put(m29529(View.combineMeasuredStates(0, 0) + 974, (char) ((Process.myPid() >> 22) + 412), 18 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new AbstractC11840be.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29503((String) list.get(0));
            }
        });
        map.put(m29529(991 - TextUtils.lastIndexOf("", '0', 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 15).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29514((BannerView) list.get(0));
            }
        });
        map.put(m29529(View.MeasureSpec.getMode(0) + 1006, (char) Color.argb(0, 0, 0, 0), 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29527((BannerView) list.get(0));
            }
        });
        map.put(m29529(1023 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (Color.blue(0) + 9348), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11867ce.m29511((BannerView) list.get(0), (BannerView.IListener) list.get(1));
                return null;
            }
        });
        map.put(m29529(1039 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1961), 16 - Color.green(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29513((AdObject) list.get(0));
            }
        });
        map.put(m29529((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, (char) (2136 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29530((AdObject) list.get(0));
            }
        });
        map.put(m29529((ViewConfiguration.getPressedStateDuration() >> 16) + 1082, (char) TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "", 0, 0) + 14).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29518((AdObject) list.get(0));
            }
        });
        map.put(m29529((-16776120) - Color.rgb(0, 0, 0), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19151), (ViewConfiguration.getTapTimeout() >> 16) + 7).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29516((UnityAdsLoadOptions) list.get(0));
            }
        });
        map.put(m29529(1104 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getTouchSlop() >> 8) + 29).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29499();
            }
        });
        map.put(m29529(1131 - TextUtils.lastIndexOf("", '0', 0), (char) Color.green(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.14
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29531((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        map.put(m29529((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + InterfaceC12339e.a.f31141j, (char) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 14).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.11
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11867ce.m29515((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        int i2 = f28092 + 95;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﭸ */
    private static Object m29500() {
        int i = 2 % 2;
        int i2 = f28091 + 37;
        f28092 = i2 % 128;
        int i3 = i2 % 2;
        IUnityAdsListener listener = UnityAds.getListener();
        int i4 = f28091 + 3;
        f28092 = i4 % 128;
        int i5 = i4 % 2;
        return listener;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m29517(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f28092 + 99;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.setListener(iUnityAdsListener);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static void m29520(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f28092 + 95;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.addListener(iUnityAdsListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱟ */
    private static void m29505(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f28092 + 69;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.removeListener(iUnityAdsListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    public static Object m29506() {
        int i = 2 % 2;
        int i2 = f28092 + 83;
        f28091 = i2 % 128;
        if (i2 % 2 != 0) {
            WebViewApp.getCurrentApp();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        int i3 = f28091 + 105;
        f28092 = i3 % 128;
        int i4 = i3 % 2;
        return currentApp;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final Object m29533(Object obj, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        d dVar = new d((WebViewApp) obj, interfaceC11874cl);
        int i2 = f28092 + 73;
        f28091 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
        return dVar;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m29512(Object obj) {
        int i = 2 % 2;
        int i2 = f28091 + 61;
        f28092 = i2 % 128;
        int i3 = i2 % 2;
        WebViewApp.setCurrentApp((d) obj);
        if (i3 == 0) {
            Object obj2 = null;
            super.hashCode();
            throw null;
        }
        int i4 = f28092 + 23;
        f28091 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ */
    public static String m29504() {
        int i = 2 % 2;
        int i2 = f28092 + 31;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        String gameId = ClientProperties.getGameId();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return gameId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x01b6  */
    /* JADX INFO: renamed from: ﾒ */
    public static Enum m29528(String str) {
        byte b = 2;
        int i = 2 % 2;
        int i2 = f28092 + 95;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        switch (str.hashCode()) {
            case -1810696374:
                if (!str.equals(m29529((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1241, (char) View.MeasureSpec.getMode(0), (Process.myPid() >> 22) + 9).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1166291365:
                if (!str.equals(m29529((Process.myTid() >> 22) + 1226, (char) (20034 - Drawable.resolveOpacity(0, 0)), 6 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i4 = f28092;
                    int i5 = i4 + 61;
                    f28091 = i5 % 128;
                    byte b2 = i5 % 2 != 0 ? (byte) 88 : (byte) 6;
                    int i6 = i4 + 73;
                    f28091 = i6 % 128;
                    int i7 = i6 % 2;
                    b = b2;
                }
                break;
            case -276710660:
                if (!str.equals(m29529(1183 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (17905 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern())) {
                    b = -1;
                } else {
                    int i8 = f28092 + 5;
                    f28091 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 1;
                }
                break;
            case -54373961:
                if (!str.equals(m29529(1214 - (Process.myTid() >> 22), (char) (30933 - (ViewConfiguration.getJumpTapTimeout() >> 16)), TextUtils.getOffsetBefore("", 0) + 12).intern())) {
                    b = -1;
                } else {
                    int i10 = f28092 + 19;
                    f28091 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 5;
                }
                break;
            case 63879010:
                if (!str.equals(m29529((ViewConfiguration.getTapTimeout() >> 16) + 1209, (char) View.MeasureSpec.getSize(0), 5 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1167718561:
                if (!str.equals(m29529(1232 - ExpandableListView.getPackedPositionChild(0L), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 9 - View.getDefaultSize(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1813675631:
                if (!str.equals(m29529(ImageFormat.getBitsPerPixel(0) + 1196, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 51567), Color.rgb(0, 0, 0) + 16777223).intern())) {
                    b = -1;
                }
                break;
            case 1815350732:
                if (!str.equals(m29529((ViewConfiguration.getMinimumFlingVelocity() >> 16) + InterfaceC11669Sd.a.f25673c, (char) (31458 - ExpandableListView.getPackedPositionChild(0L)), 7 - View.resolveSize(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i12 = f28092 + 101;
                    int i13 = i12 % 128;
                    f28091 = i13;
                    int i14 = i12 % 2;
                    int i15 = i13 + 97;
                    f28092 = i15 % 128;
                    int i16 = i15 % 2;
                    b = 3;
                }
                break;
            case 1926303783:
                if (!str.equals(m29529(1178 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.getCapsMode("", 0, 0) + 39319), 6 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    b = -1;
                } else {
                    int i17 = f28092 + 43;
                    f28091 = i17 % 128;
                    int i18 = i17 % 2;
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return WebViewEventCategory.ADUNIT;
            case 1:
                return WebViewEventCategory.VIDEOPLAYER;
            case 2:
                return WebViewEventCategory.REQUEST;
            case 3:
                return WebViewEventCategory.RESOLVE;
            case 4:
                return WebViewEventCategory.CACHE;
            case 5:
                return WebViewEventCategory.CONNECTIVITY;
            case 6:
                return WebViewEventCategory.STORAGE;
            case 7:
                return WebViewEventCategory.BROADCAST;
            case 8:
                return WebViewEventCategory.LIFECYCLE;
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007c  */
    /* JADX INFO: renamed from: ﮐ */
    public static Enum m29503(String str) {
        byte b;
        int i = 2 % 2;
        int i2 = f28092 + 27;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        if (iHashCode == 183181625) {
            b = 0;
            if (str.equals(m29529((ViewConfiguration.getWindowTouchSlop() >> 8) + 1251, (char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8).intern())) {
                int i4 = f28092 + 115;
                f28091 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                b = -1;
            }
        } else if (iHashCode == 2066319421 && str.equals(m29529((ViewConfiguration.getEdgeSlop() >> 16) + 1259, (char) (28375 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 6 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
            int i6 = f28092 + 5;
            f28091 = i6 % 128;
            int i7 = i6 % 2;
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            if (b != 1) {
                return null;
            }
            return WebRequestEvent.FAILED;
        }
        WebRequestEvent webRequestEvent = WebRequestEvent.COMPLETE;
        int i8 = f28092 + 111;
        f28091 = i8 % 128;
        int i9 = i8 % 2;
        return webRequestEvent;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29519(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f28092 + 47;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = bannerView.getPlacementId();
        int i4 = f28091 + 23;
        f28092 = i4 % 128;
        int i5 = i4 % 2;
        return placementId;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static BannerView.IListener m29522(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f28092 + 77;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        BannerView.IListener listener = bannerView.getListener();
        int i4 = f28091 + 23;
        f28092 = i4 % 128;
        int i5 = i4 % 2;
        return listener;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m29526(BannerView bannerView, BannerView.IListener iListener) {
        int i = 2 % 2;
        int i2 = f28091 + 25;
        f28092 = i2 % 128;
        int i3 = i2 % 2;
        bannerView.setListener(iListener);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        int i5 = f28092 + 109;
        f28091 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static ByteString m29521(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f28092 + 89;
        f28091 = i2 % 128;
        int i3 = i2 % 2;
        ByteString opportunityId = adObject.getOpportunityId();
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return opportunityId;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29508(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f28091 + 25;
        f28092 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = adObject.getPlacementId();
        int i4 = f28092 + 11;
        f28091 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﻏ */
    private static UnityAdsLoadOptions m29507(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f28091 + 7;
        f28092 = i2 % 128;
        if (i2 % 2 != 0) {
            return adObject.getLoadOptions();
        }
        adObject.getLoadOptions();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static JSONObject m29524(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i = 2 % 2;
        int i2 = f28092 + 53;
        f28091 = i2 % 128;
        if (i2 % 2 == 0) {
            return unityAdsLoadOptions.getData();
        }
        unityAdsLoadOptions.getData();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ */
    private static String m29502() {
        int i = 2 % 2;
        int i2 = f28091 + 5;
        f28092 = i2 % 128;
        if (i2 % 2 == 0) {
            ClientProperties.getGameId();
            throw null;
        }
        String gameId = ClientProperties.getGameId();
        int i3 = f28091 + 9;
        f28092 = i3 % 128;
        int i4 = i3 % 2;
        return gameId;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29523(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f28092 + 5;
        f28091 = i2 % 128;
        if (i2 % 2 != 0) {
            diagnosticEvent.getPlacementId();
            throw null;
        }
        String placementId = diagnosticEvent.getPlacementId();
        int i3 = f28091 + 85;
        f28092 = i3 % 128;
        int i4 = i3 % 2;
        return placementId;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static Map m29509(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f28091 + 15;
        f28092 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> stringTagsMap = diagnosticEvent.getStringTagsMap();
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = f28092 + 113;
        f28091 = i5 % 128;
        if (i5 % 2 == 0) {
            return stringTagsMap;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ce$d */
    class d extends WebViewApp implements InterfaceC12003hf<WebViewApp> {

        /* JADX INFO: renamed from: ﱟ */
        private static int f28113 = 0;

        /* JADX INFO: renamed from: ﻏ */
        private static int f28116 = 1;

        /* JADX INFO: renamed from: ﻛ */
        private InterfaceC11874cl f28119;

        /* JADX INFO: renamed from: ﾇ */
        private WebViewApp f28120;

        /* JADX INFO: renamed from: ﻐ */
        private static char[] f28117 = {'W', 39795, 13902, 53524, 27697, 1803, 41715, 15835, 55488, 29622, 3826, 43393, 17773, 57450, 31587, 5679, 45314, 19511, 59388, 33490, 7668, 47265, 21381, 61086, 35445, 9538, 'W', 39795, 13902, 53524, 27697, 1803, 41715, 15835, 55488, 29622, 3826, 43393, 17773, 57450, 31587, 5679, 45314, 19511, 59388, 33490, 7678, 47279, 21389, 61078, 35429, 9556, 49241, 23327, 62989, 37133, 11495, 51147, 25255, 64947, 'W', 39795, 13902, 53524, 27697, 1803, 41715, 15835, 55488, 29622, 3826, 43413, 17773, 57450, 31587, 5679, 45314, 19511, 59388, 33490, 7678, 47279, 21389, 61078, 35429, 9556, 49241, 23313, 62983, 37146, 11505, 13775, 44779, 982, 58508, 22953, 12947, 38763, 2115, 60760, 17966, 15210, 39961, 28917, 54770, 20219, 9143, 33946, 31151, 53860, 46922, 10345, 36152, 26133, 56086, 49121, 4319, 62920, 28323, 50058, 42115, 6504, 'W', 39795, 13902, 53524, 27697, 1803, 41715, 15835, 55488, 29622, 3826, 43392, 17773, 57453, 31569, 5694, 45367, 19475, 59374, 33524, 7633, 47275, 21395, 61115, 35424, 9558, 49269, 23356, 62977, 37130, 11517, 51147, 25260, 64959, 39062, 13411, 53100, 27207, 1323, 41012, 20496, 52020, 26121, 33107, 15478, 22348, 62132, 28060, 34951, 9201, 24245, 63954, 5418, 45101, 11044, 18024, 57669, 7271, 47010, 53888, 19848, 62744, 28220, 49921, 9307, 39294, 62020, 22460, 51348, 11663, 34553, 64445, 23758, 45090, 5413, 36408, 58218, 17473, 47455, 4778, 30602, 59522, 19955, 42698, 7105, 32566, 53254, 13597, 'W', 39795, 13902, 53524, 27697, 1803, 41715, 15835, 55488, 29622, 3826, 43393, 17773, 57456, 31568, 5647, 45334, 19475, 59362, 33494, 39822, 170, 44439, 19149, 63464, 40146, 14634, 42498, 17177, 59503, 38187, 12866, 57023, 31665, 57474, 36344, 10972, 55276, 31796, 6423, 34317, 9077, 51292, 30016, 4514};

        /* JADX INFO: renamed from: ｋ */
        private static long f28118 = -9165835983167775978L;

        /* JADX INFO: renamed from: ﮐ */
        private static long f28112 = 0;

        /* JADX INFO: renamed from: ﺙ */
        private static int f28115 = 0;

        /* JADX INFO: renamed from: ﱡ */
        private static char f28114 = 16075;

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12003hf
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ WebViewApp mo28813() {
            int i = 2 % 2;
            int i2 = f28113 + 29;
            f28116 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                m29537();
                super.hashCode();
                throw null;
            }
            WebViewApp webViewAppM29537 = m29537();
            int i3 = f28116 + 69;
            f28113 = i3 % 128;
            if (i3 % 2 == 0) {
                return webViewAppM29537;
            }
            super.hashCode();
            throw null;
        }

        d(WebViewApp webViewApp, InterfaceC11874cl interfaceC11874cl) {
            this.f28120 = webViewApp;
            this.f28119 = interfaceC11874cl;
        }

        /* JADX INFO: renamed from: ﾇ */
        private WebViewApp m29537() {
            int i = 2 % 2;
            int i2 = f28113;
            int i3 = i2 + 3;
            f28116 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                super.hashCode();
                throw null;
            }
            WebViewApp webViewApp = this.f28120;
            int i4 = i2 + 47;
            f28116 = i4 % 128;
            if (i4 % 2 != 0) {
                return webViewApp;
            }
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppLoaded(boolean z) {
            int i = 2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29536((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 26).intern(), Boolean.valueOf(z));
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                int i2 = f28116 + 47;
                f28113 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.setWebAppLoaded(z);
                if (i3 != 0) {
                    int i4 = 17 / 0;
                }
                int i5 = f28113 + 71;
                f28116 = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppLoaded() {
            boolean zIsWebAppLoaded;
            int i = 2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("ᰵ䂵⠬㴷挃࠼뜩一䨵⫯暜薆睕ꀥ\ue425幠ሃ屦⛶渒갧\uddf9⋓ञ贮", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "\u0000\u0000\u0000\u0000", 393144246 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "뙧滧耗\ue00c").intern(), new Object[0]);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp == null) {
                int i2 = f28116 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f28113 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = f28116 + 95;
            f28113 = i4 % 128;
            if (i4 % 2 != 0) {
                zIsWebAppLoaded = webViewApp.isWebAppLoaded();
                int i5 = 33 / 0;
            } else {
                zIsWebAppLoaded = webViewApp.isWebAppLoaded();
            }
            int i6 = f28116 + 103;
            f28113 = i6 % 128;
            int i7 = i6 % 2;
            return zIsWebAppLoaded;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureMessage(String str) {
            int i = 2 % 2;
            int i2 = f28113 + 11;
            f28116 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29536(25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 34 - TextUtils.getOffsetBefore("", 0)).intern(), str);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                int i4 = f28113 + 23;
                f28116 = i4 % 128;
                int i5 = i4 % 2;
                webViewApp.setWebAppFailureMessage(str);
                if (i5 == 0) {
                    throw null;
                }
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureCode(int i) {
            int i2 = 2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("ᓴ㐴\uf215\ud84b丒䀄封ꊒ쯽鸘⺟着胤瑦堍ɨ噶㝩宲劺詽ᖠ鰊ୂ\uddcd\ud800ᜅ\ue8c3썑\udc5b봨", (char) (TextUtils.getOffsetAfter("", 0) + 15611), "\u0000\u0000\u0000\u0000", KeyEvent.normalizeMetaState(0) + 1412696823, "\uf75e㐊ﭔ㔼").intern(), Integer.valueOf(i));
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                int i3 = f28116 + 21;
                f28113 = i3 % 128;
                int i4 = i3 % 2;
                webViewApp.setWebAppFailureCode(i);
                int i5 = f28113 + 7;
                f28116 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 5;
                }
            }
            int i7 = f28113 + 77;
            f28116 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public String getWebAppFailureMessage() {
            int i = 2 % 2;
            int i2 = f28116 + 63;
            f28113 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("\udde3嚊㝠閏⯅㎚⅞忹省\udece逢啎睵⚗굛뇵뒲⽂\ued61⯈\ue9ef炉嶽婢偟﹌蟿繣곆\udcb5檹㏧퐚둻", (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), "\u0000\u0000\u0000\u0000", KeyEvent.getDeadChar(0, 0), "쳛傺焏࡛").intern(), new Object[0]);
            WebViewApp webViewApp = this.f28120;
            Object obj = null;
            if (webViewApp == null) {
                return null;
            }
            String webAppFailureMessage = webViewApp.getWebAppFailureMessage();
            int i4 = f28116 + 95;
            f28113 = i4 % 128;
            if (i4 % 2 == 0) {
                return webAppFailureMessage;
            }
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public int getWebAppFailureCode() {
            int i = 2 % 2;
            int i2 = f28116 + 105;
            f28113 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29536(60 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp == null) {
                return 0;
            }
            int i4 = f28116 + 93;
            f28113 = i4 % 128;
            if (i4 % 2 == 0) {
                return webViewApp.getWebAppFailureCode();
            }
            int webAppFailureCode = webViewApp.getWebAppFailureCode();
            int i5 = 37 / 0;
            return webAppFailureCode;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppInitialized(boolean z) {
            int i = 2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29536(91 - Color.argb(0, 0, 0, 0), (char) (Color.alpha(0) + 13720), View.resolveSizeAndState(0, 0, 0) + 31).intern(), Boolean.valueOf(z));
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                webViewApp.setWebAppInitialized(z);
                int i2 = f28113 + 47;
                f28116 = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = f28116 + 113;
            f28113 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void resetWebViewAppInitialization() {
            int i = 2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29536(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                int i2 = f28113 + 25;
                f28116 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.resetWebViewAppInitialization();
            }
            int i4 = f28116 + 43;
            f28113 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppInitialized() {
            int i = 2 % 2;
            int i2 = f28116 + 81;
            f28113 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("幯\u1317禦쎍슁챜ᚶ\udc09뫦腑ሯ악殉ꙡᓛ⏻嘳䩛龻毚䮙Ⰻ蝻鮒\u3040灚⛋䓍닓\uf1b0", (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20135), "\u0000\u0000\u0000\u0000", ViewConfiguration.getFadingEdgeLength() >> 16, "罥硰ꜥ\uef4e").intern(), new Object[0]);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                boolean zIsWebAppInitialized = webViewApp.isWebAppInitialized();
                int i4 = f28113 + 31;
                f28116 = i4 % 128;
                int i5 = i4 % 2;
                return zIsWebAppInitialized;
            }
            int i6 = f28116 + 79;
            f28113 = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public WebView getWebView() {
            int i = 2 % 2;
            int i2 = f28116 + 29;
            f28113 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29536(162 - Color.red(0), (char) (20551 - View.MeasureSpec.makeMeasureSpec(0, 0)), 21 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                int i4 = f28113 + 51;
                f28116 = i4 % 128;
                int i5 = i4 % 2;
                return webViewApp.getWebView();
            }
            int i6 = f28116 + 13;
            f28113 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 86 / 0;
            }
            return null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebView(WebView webView) {
            int i = 2 % 2;
            int i2 = f28113 + 113;
            f28116 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("鰵世漁䔇噟릇潛敎ꖖ\ue094믧餩褠ꯄ뛞\ufae0틫㱛毇ꮻ\ue60b", (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", 2011112813 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "沩\udf25楷\u2d29").intern(), webView);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                int i4 = f28116 + 35;
                f28113 = i4 % 128;
                int i5 = i4 % 2;
                webViewApp.setWebView(webView);
                if (i5 != 0) {
                    throw null;
                }
            }
            int i6 = f28116 + 3;
            f28113 = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public Configuration getConfiguration() {
            int i = 2 % 2;
            int i2 = f28113 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f28116 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("禛河ʕ\ue5b8\ue067䍾瞐둅✣瞜\ud94b༳麝绊㊵윊Ჿ䲁\ue67a傢垰ᶡ쾞╆卥긑ᙿ", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18814), "\u0000\u0000\u0000\u0000", 321793748 - (ViewConfiguration.getTouchSlop() >> 8), "푀⸮缓聉").intern(), new Object[0]);
            WebViewApp webViewApp = this.f28120;
            Object obj = null;
            if (webViewApp != null) {
                int i4 = f28113 + 95;
                f28116 = i4 % 128;
                if (i4 % 2 != 0) {
                    return webViewApp.getConfiguration();
                }
                webViewApp.getConfiguration();
                super.hashCode();
                throw null;
            }
            int i5 = f28116 + 21;
            f28113 = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setConfiguration(Configuration configuration) {
            int i = 2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29536(183 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (62798 - TextUtils.lastIndexOf("", '0', 0)), 27 - ExpandableListView.getPackedPositionType(0L)).intern(), configuration);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                int i2 = f28116 + 33;
                f28113 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.setConfiguration(configuration);
                int i4 = f28113 + 15;
                f28116 = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = f28113 + 17;
            f28116 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 63 / 0;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean sendEvent(Enum r11, Enum r12, Object... objArr) {
            int i = 2 % 2;
            int i2 = f28113 + 21;
            f28116 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29536(210 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Color.blue(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 21).intern(), r11, r12, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f28120;
            if (webViewApp == null) {
                int i4 = f28113 + 47;
                f28116 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = f28113 + 79;
            f28116 = i6 % 128;
            if (i6 % 2 != 0) {
                return webViewApp.sendEvent(r11, r12, objArr);
            }
            webViewApp.sendEvent(r11, r12, objArr);
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
        public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
            int i = 2 % 2;
            int i2 = f28116 + 23;
            f28113 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("嫲節冒\udf34覩\u0e8b㻬汎鿃畑⧶臨䔦擖ꖥ霸奯臭岱菃竽萞耇", (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0000\u0000\u0000\u0000", (-660979545) - Color.alpha(0), "ꝛ驀䟘\u31ec").intern(), str, str2, method, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f28120;
            if (webViewApp == null) {
                return false;
            }
            int i4 = f28116 + 81;
            f28113 = i4 % 128;
            int i5 = i4 % 2;
            return webViewApp.invokeMethod(str, str2, method, objArr);
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean invokeCallback(Invocation invocation) {
            int i = 2 % 2;
            int i2 = f28116 + 25;
            f28113 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29536(229 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (Color.argb(0, 0, 0, 0) + 39897), 25 - View.MeasureSpec.getSize(0)).intern(), invocation);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp == null) {
                return false;
            }
            int i4 = f28113 + 53;
            f28116 = i4 % 128;
            if (i4 % 2 != 0) {
                boolean zInvokeCallback = webViewApp.invokeCallback(invocation);
                int i5 = f28116 + 43;
                f28113 = i5 % 128;
                int i6 = i5 % 2;
                return zInvokeCallback;
            }
            webViewApp.invokeCallback(invocation);
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void addCallback(NativeCallback nativeCallback) {
            int i = 2 % 2;
            int i2 = f28116 + 53;
            f28113 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("\ua63f懣鑡疏껍磉锶\ud93a㘹≰梔軔峊\uf3fb퍗騦骐賵꯹୕\ue980䱇", (char) TextUtils.getOffsetBefore("", 0), "\u0000\u0000\u0000\u0000", (-1) - Process.getGidForName(""), "\udb4c鶥ﰬ뗮").intern(), nativeCallback);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                int i4 = f28113 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f28116 = i4 % 128;
                int i5 = i4 % 2;
                webViewApp.addCallback(nativeCallback);
                int i6 = f28116 + 93;
                f28113 = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void removeCallback(NativeCallback nativeCallback) {
            int i = 2 % 2;
            int i2 = f28113 + 99;
            f28116 = i2 % 128;
            int i3 = i2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("\ud991ᩥ舝\uedea鑌죉逎澅竃덲火❏͑켏缗铠\uec37푁㤣횩冥䪌ꣿ뉢䀼", (char) TextUtils.getTrimmedLength(""), "\u0000\u0000\u0000\u0000", (-1526640023) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "榚Œ邥첛").intern(), nativeCallback);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp != null) {
                webViewApp.removeCallback(nativeCallback);
            }
            int i4 = f28116 + 107;
            f28113 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public NativeCallback getCallback(String str) {
            int i = 2 % 2;
            C11867ce.this.m28837(this, this.f28119, m29535("躑햞\ue793\uf061캭榭儴뿔⪊\ud84c᥎\uee9c⤉\ue0c4བ㹕\udc5c姿荪讚㩏Ř", (char) (TextUtils.lastIndexOf("", '0') + 1), "\u0000\u0000\u0000\u0000", View.MeasureSpec.getSize(0), "팑뎉푝䒽").intern(), str);
            WebViewApp webViewApp = this.f28120;
            if (webViewApp == null) {
                int i2 = f28116 + 1;
                f28113 = i2 % 128;
                int i3 = i2 % 2;
                return null;
            }
            int i4 = f28113 + 111;
            f28116 = i4 % 128;
            if (i4 % 2 != 0) {
                return webViewApp.getCallback(str);
            }
            webViewApp.getCallback(str);
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public ErrorState getErrorStateFromWebAppCode() {
            int i = 2 % 2;
            int i2 = f28116 + 91;
            f28113 = i2 % 128;
            if (i2 % 2 != 0) {
                C11867ce.this.m28837(this, this.f28119, m29535("ળ씅ሕ䬱ध䴄艷\ue498\ue3f2ⓩㇼ⫕歑㶝ꤴ\ud810冝\ueafd\ud90c\uf0ab\udd76흥㑀횊辳\uefde꼳腻䣎輀\uf183夷㨹ደ\uf71c뛭ᷮ㥕", (char) TextUtils.indexOf("", ""), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollBarFadeDuration() >>> 12, "돴ᦥ싙\ue289").intern(), new Object[0]);
                if (this.f28120 == null) {
                    return null;
                }
            } else {
                C11867ce.this.m28837(this, this.f28119, m29535("ળ씅ሕ䬱ध䴄艷\ue498\ue3f2ⓩㇼ⫕歑㶝ꤴ\ud810冝\ueafd\ud90c\uf0ab\udd76흥㑀횊辳\uefde꼳腻䣎輀\uf183夷㨹ደ\uf71c뛭ᷮ㥕", (char) TextUtils.indexOf("", ""), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollBarFadeDuration() >> 16, "돴ᦥ싙\ue289").intern(), new Object[0]);
                if (this.f28120 == null) {
                    return null;
                }
            }
            ErrorState errorStateFromWebAppCode = this.f28120.getErrorStateFromWebAppCode();
            int i3 = f28113 + 43;
            f28116 = i3 % 128;
            int i4 = i3 % 2;
            return errorStateFromWebAppCode;
        }

        /* JADX INFO: renamed from: ｋ */
        private static String m29536(int i, char c, int i2) {
            String str;
            synchronized (C11862c.f28047) {
                char[] cArr = new char[i2];
                C11862c.f28048 = 0;
                while (C11862c.f28048 < i2) {
                    cArr[C11862c.f28048] = (char) ((((long) f28117[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28118)) ^ ((long) c));
                    C11862c.f28048++;
                }
                str = new String(cArr);
            }
            return str;
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m29535(String str, char c, String str2, int i, String str3) {
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
                    cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28112) ^ ((long) f28115)) ^ ((long) f28114));
                    C12051j.f29511++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ce$a */
    public static class a extends AbstractC11840be {

        /* JADX INFO: renamed from: ﻛ */
        private static int f28109 = 1;

        /* JADX INFO: renamed from: ﾇ */
        private static int f28110 = 0;

        /* JADX INFO: renamed from: ﾒ */
        private static long f28111 = 4566127671473153155L;

        public a(String str) {
            super(str);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
        /* JADX INFO: renamed from: ﾇ */
        public final String mo28809() {
            int i = 2 % 2;
            String version = UnityAds.getVersion();
            if (version != null) {
                int i2 = f28109 + 7;
                f28110 = i2 % 128;
                int i3 = i2 % 2;
                return version.split(m29534("⒮", 39929 - Color.green(0)).intern())[0];
            }
            int i4 = f28110 + 73;
            f28109 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:20:0x008d  */
        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo28808(String str) {
            int i = 2 % 2;
            int i2 = f28110 + 9;
            f28109 = i2 % 128;
            int i3 = i2 % 2;
            byte b = 0;
            switch (str.hashCode()) {
                case 252148886:
                    if (!str.equals(m29534("Ⓜᜬ䍀뾌\uebc6☀ሀ乭몯\uf6c9ℛᵓ䥳薵", 13258 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b = -1;
                    }
                    break;
                case 961844241:
                    if (!str.equals(m29534("Ⓛ縱酋㒔侪\ue2eeЧ弯\uf27eᖟ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23251).intern())) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 1067215379:
                    if (!str.equals(m29534("ⓠ⬽㭌\u0bde᮲毸稌䩀婲ꫩ뫍襖餼\ue97b烈짊\ud9fa⠁㡔ࡳ\u18f9棄缔伪彵꾏뿋迻鹱\uee6cﺜ캢\udecdⴗ㴳െᶎ淓緲", 4097 - AndroidCharacter.getMirror('0')).intern())) {
                        b = -1;
                    } else {
                        int i4 = f28109 + 97;
                        f28110 = i4 % 128;
                        b = i4 % 2 == 0 ? (byte) 3 : (byte) 5;
                    }
                    break;
                case 1531208100:
                    if (!str.equals(m29534("ⓠ驅妼ὖ\ude52鶠匜ቨ톲靁噽ᗮ쬜詳䧏༒칺跙䌄ɻ솙蜿䙡ןﭵ멣种㼥ﺑ뷏猹㋚\uf1e2뜮皤㗶\ueb2eꪚ槔⽟\uee9f귻捏⊉\ue1fbꝏ", 48809 - Color.red(0)).intern())) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0 || b == 1) {
                return AdUnitActivity.class;
            }
            if (b == 2 || b == 3) {
                return BannerView.class;
            }
            int i5 = f28110 + 109;
            f28109 = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
        /* JADX INFO: renamed from: ｋ */
        final Map<String, AbstractC11840be.b> mo28807() {
            int i = 2 % 2;
            HashMap map = new HashMap();
            int i2 = f28110 + 21;
            f28109 = i2 % 128;
            if (i2 % 2 != 0) {
                return map;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ */
        private static String m29534(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11997h.f29102) {
                C11997h.f29101 = i;
                char[] cArr2 = new char[cArr.length];
                C11997h.f29103 = 0;
                while (C11997h.f29103 < cArr.length) {
                    cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f28111);
                    C11997h.f29103++;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29529(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f28093[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28090)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
