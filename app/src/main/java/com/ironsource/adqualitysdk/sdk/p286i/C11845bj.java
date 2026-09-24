package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bj */
/* JADX INFO: loaded from: classes6.dex */
public final class C11845bj extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27629 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27630 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f27631;

    /* JADX INFO: renamed from: ﾒ */
    private static long f27632;

    static {
        char[] cArr = new char[1191];
        ByteBuffer.wrap("\u0000.û`ö¹ñöísè.ãØß(Ú\rÕ±ÐÍÌ\u0000ÇR\u0000Aû.öÆñ»íOè\u001bãÏßrÚ\"ÕûÐ\u0090ÌGÇ\u0017Â¬r\u0092\u0089È\u0084\u0000\u0083I\u009f\u009d\u009aÐ\u0091\u0003\u00ad¦¨ï§8¢K\"\"ÙdÔ¸Ó±Ï\bÊ^Á\u009cý=ø~÷µò\u008bî\u000bå\\àõ\u009c$\u009bt\u0096\u0084\u008d\u0085\u0089\u0014\u0084[\u0083ú¿}ºY±³¬ó¨:§¦¢û^0UUP\u0084OÃKx\u0000Dû\u001eöÖñ\u0097íFè\u0006ãÙßtÚ#ÕîÐ\u008dÌZÇ\u0011Â£¾`¹\u0017´Ã¯\u009e«]¦\b¡¡\u009df\u0098%\u0000cû%öùñðíIè\u001fãÝß|Ú?ÕôÐÊÌJÇ\u001dÂ´¾e¹5´Å¯Ä«U¦\u001a¡»\u009d<\u0098\u0018\u0093ò\u008e²\u008as\u0085ê\u0080º|}w\u0010rßm\u0082i)dþ_½[\u007fV\u0004QóL\u009fH2Cù>¬:M5\u001a0Áv©\u008dó\u0080;\u0087r\u009b¡\u009eÞ\u00952©\u009f¬Ô£\u0001¦`º·±ì!\u0089ÚÏ×\u0013Ð\u001aÌ£ÉõÂ7þ\u0096ûÕô\u001eñ í æ÷ã^\u009f\u008f\u0098ß\u0095/\u008e.\u008a¿\u0087ð\u0080Q¼Ö¹ò²\u0018¯X«\u0091¤\n¡e]\u0091VüS/LjHÃE\u0014~GW^¬\u0004¡Ì¦\u0085ºV¿!´È\u0088h\u008d/\u0082ò\u0087\u008d\u009b@\u0090\u000b\u0095¬é\u007fî-ãÖ\u0000Dû\u001eöÖñ\u009fíLè>ãÓßgÚ4ÕÿÐ\u0096ß\u0094$Î)\u0006.O2\u009c7ð<\t\u0000§\u0005õ\n/\u000fG\u0013\u008a\u0000Dû\u001eöÖñ\u009fíLè ãÙßuÚ ÕõÐ\u008aÌ]Ç\u001d\u0091Hj\u0012gÚ`\u0093|@y(rÙNoK+¿åD£I\u007fNvRÏW\u0099\\[`úe¹jroLsÌx\u009b}2\u0001ã\u0006³\u000bC\u0010B\u0014Ó\u0019\u009c\u001e=\"º'\u009e,t145ý:f?\u001eÃ÷È\u0081Í]\u0000Dû\u001eöÖñ\u009fíLè!ãÕß|Ú5\u0000Dû\u001eöÖñ\u009fíLè$ãÕßcÚ'ÕÉÐ\u0091Ì^Ç\bÂ\u00ad¾~¹\"´ã¯\u0086«]¦\u001b¡¦\u009df\u0000Dû\u001eöÖñ\u0098íMè\u0006ãßßnÚ\u0016ÕûÐ\u0087ÌZÇ\u0017Â°¾uJ´±î¼&»h§½¢ö©/\u0095\u009e\u0090í\u009f\u000b\u009az\u0086¿\u008dï\u0088Wô\u008e\u0000Dû\u001eöÖñ\u008cíMè\u001cãØßcÚ\"ÕÿÐ\u0096\u0000Dû\u001eöÖñ\u009fíLè0ãÝßhÚ>ÕÿÐ\u0096ÌbÇ\u0011Â±¾x¹3´Î¯\u008f«F\u0000Dû\u001eöÖñ\u009fíLè0ãÝßuÚ5ÕØÐ\u0085Ì@Ç\u0016Â§¾~¹\u001a´É¯\u0099«@¦\u001b¡¦\u009dw\u0098.\u0000Dû\u001eöÖñ\u009fíLè0ãÝßuÚ5ÕÓÐ\u008aÌZÇ\u001dÂ°¾\u007f¹\"´É¯\u009e«]¦\u001f¡¤\u009d^\u00985\u0093Õ\u008e\u0084\u008a_\u0085ê\u0080«|j\u0000Dû\u001eöÖñ\u009fíLè1ãÝßjÚ<ÕøÐ\u0085ÌMÇ\u0013\u0000Dû\u001eöÖñ\u009fíLè7ãÄßvÚ1ÕôÐ\u0080ÌKÇ\u001cÂ\u008e¾e¹%´Ô¯\u008f«Z¦\u001b¡º\u0000Dû\u001eöÖñ\u009fíLè;ãÒßrÚ5ÕèÐ\u0097ÌZÇ\u0011Â¶¾e¹7´Ì¯¦«]¦\r¡¼\u009dw\u00982\u0093Ã\u008e\u0082Ô\u0095/Ï\"\u0007%N9\u009d<ï7\u0004\u000b¤\u000eõ\u0001.\u0004[\u0018\u009a\u0013Û\u0000Tû\böÙñ¿íFè\u0013ãÛßcÚ\"ÕÒÐ\u0085Ì]Ç\u0010Â\u008f¾m¹&ýf\u0006:\u000bã\f\u0094\u0010\u007f\u0015#\u001eû\"@'\r(Ú-\u00851y:8?\u0086CWD\u0007I÷\u0000Aû:öçñ\u0097íFè\u0006ãÙßtÚ#ÕîÐ\u008dÌZÇ\u0011Â£¾`¹\u0017´Ã¯\u009e«]¦\b¡¡\u009df\u0098%\\:§|ª \u00ad©±\u0010´F¿\u0084\u0083%\u0086f\u0089\u00ad\u008c\u0093\u0090\u0016\u009bQ\u009eèâ{ånè\u009dóÀ÷CúFýòÁ?ÄlÏ\u0089ÒÀÖ\u0017Ù¤Ü¹ \u0000+K.\u00861æ5w8§\u0003è\u00075\nB\r\u009f\u0010Ì\u0014k\u001f bâf\u0011ivl\u0082p/{|~¹AÐE\u0007HTL\u0080·ûº&½^¡\u008d¤ò¯\u001e\u0093³\u0096ø\u0099-\u009cL\u0080\u009b\u008bÀ\u00908k~f¢a«}\u0012xDs\u0086O'JdE¯@\u0091\\\u0014WSRê.y)l$\u009f?Â;A6D1ð\r=\bn\u0003\u008b\u001eÂ\u001a\u0015\u0015¦\u0010»ì\u0002çIâ\u0084ýìù\u007fô\u0090ÏìË1ÆZÁ\u009fÜÎØiÓ²\u0000Aû:öçñ\u009fíLè$ãÕßcÚ'\u0000Aû:öçt¬\u008f×\u0082\n\u0085r\u0099¡P\u001b«`¦½¡Å½\u0016¸k³\u0089\u008f2\u008a~\u0085²\u0080Ñ\u009c\u0018\u0097N\u0092ýî$\u0000Aû:öçñ\u009fíLè>ãÕßuÚ$ÕÿÐ\u008aÌKÇ\n¿/DTI\u0089NñR\"WN\\·`\u0019eKj\u0091oùs4xZ}Å\u0001\u0011\u0006L\u000b«\u0010ê\u0014?\u0019b\u0000Aû:öçñ\u009fíLè4ãÓßtÚ=ÕûÐ\u0090\u0000Aû:öçñ\u009fíLè&ãÅßvÚ5\u0000Aû:öçñ\u009fíLè ãÙßwÚ%ÕÿÐ\u0097ÌZ\u0000gû/öàñ\u009fíXè\u0002ã÷ßcÚ)\u0000gû/öàñ\u0098íMè\u0006ãßßnÚ\u0016ÕûÐ\u0087ÌZÇ\u0017Â°¾u¹\u001f´Î¯\u0099«@¦\u001f¡¦\u009dq\u00989\u0000gû/öàñ\u009fíLè ãÙßuÚ ÕõÐ\u008aÌ]Ç\u001dÂ\u0080¾e¹2´é¯\u008e\u0000gû/öàñ\u009fíLè ãÙßuÚ ÕõÐ\u008aÌ]Ç\u001dÂ\u0081¾~¹3´Á¯\u009e«]¦\b¡\u00ad\u009d[\u00988\u0000gû/öàñ\u009fíLè ãÙßuÚ ÕõÐ\u008aÌ]Ç\u001dÂ\u008b¾a¹&´Ò¯\u008f«G¦\r¡¡\u009d}\u00982\u0093ó\u008e\u0082\u008aV\u0000gû/öàñ\u009fíLè ãÙßuÚ ÕõÐ\u008aÌ]Ç\u001dÂ\u0090¾i¹8´Ä¯\u008f«F¦\u0017¡¦\u009du\u0098\u0011\u0093Ç\u008e\u0080\u0000gû/öàñ\u009fíLè ãÙßuÚ ÕõÐ\u008aÌ]Ç\u001dÂ\u0090¾i¹8´Ä¯\u008f«F¦\u0017¡¦\u009du\u0098\u001e\u0093Ó\u008e\u009e\u008a^\u0085è\u0080«\u0000gû/öàñ\u009aíMè\u0014ãÝßsÚ<ÕîÐ²ÌGÇ\u001cÂ§¾c¹\u0017´Ä¯\u0099«f¦\u001b¡¹\u009dg\u00989\u0093Õ\u008e\u0084\u008ay\u0085ñ\u0080½|lw\rrÁm¦i!dø_µ[sV\u001b\u0000gû/öàñ\u009fíLè ãÙßuÚ ÕõÐ\u008aÌ]Ç\u001dÂ\u0083¾h¹%\u0000gû/öàñ\u009fíLè ãÙßuÚ ÕõÐ\u008aÌ]Ç\u001dÂ\u0092¾~¹?´Ã¯\u008f«d¦\u0011¡¡\u009d|\u0098(\u0000gû/öàñ\u009fíLè!ãÕß|Ú5ÕÉÐ\u0088ÌAÇ\fÂ\u0097¾Y¹\u001f´ä\u0000gû/öàñ\u009fíLè!ãÕß|Ú5ÕÛÐ\u0080ÌzÇ\u0001Â²¾i\u0000gû/öàñ\u009fíLè!ãÕß|Ú5ÕÊÐ\u0091ÌLÇ+Â§¾x¹\"´É¯\u0084«S¦\r\u0000iû9öÕñºí{è\u001bãÆßcÚ\u0019ÕôÐ\u0090ÌKÇ\nÂ±¾x¹?´Ô¯\u0083«U¦\u0012¡\u0089\u009dv\u0000cû8öññ¿í\\è\u0017ãèßDÚ\u0016ÕÿÐ\u0090ÌMÇ\u0010Â\u0084¾m¹5´Ô¯\u0085«F¦\u0007¡\u0085\u009ds\u00982\u0093Ç\u008e\u0097\u008a_\u0085ö\u0080\u0083|yw\u0012Qmª6§ÿ ±¼R¹\u0019²æ\u008eJ\u008b\u001b\u0084ì\u0081\u008f\u009dC\u0096\u0003\u0093¸ïmè*åýþ\u0081úH÷\u0006ð¯Ì\u007fÉ7bº\u0099ò\u0094=\u0093B\u008f\u0085\u008aÜ\u0081 ½¿¸ß·\"²H®\u0086¥À lÜ¥\u0000gû/öàñ\u009cíAè\u0016ãõßhÚ6Õõ\u0096\u0089mÁ`\u000eg`{´~õu1I\u008dLîC\u001bFcZ®QâYÑ¢\u0099¯V¨;´ò±«º~\u0086å\u0083\u0093\u008cE\u00896\u0000gû/öàñ\u009fíXè\u0001ãýßbÚ\u0016ÕõÐ\u0096ÌCÇ\u0019Â¶\u001eUå\u001dèÒï\u00adó~ö\fýáÁUÄ\u0006ËÍÎ¤\u0000gû/öàñ\u009fíLè$ãÕßcÚ'".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1191);
        f27631 = cArr;
        f27632 = -3494804637120791734L;
    }

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ DTBAdView m28870(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27629 + 43;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        DTBAdView dTBAdViewM28860 = m28860(apsAd);
        int i4 = f27629 + 105;
        f27630 = i4 % 128;
        int i5 = i4 % 2;
        return dTBAdViewM28860;
    }

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ DTBFetchFactory m28871() {
        int i = 2 % 2;
        int i2 = f27629 + 7;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        DTBFetchFactory dTBFetchFactoryM28861 = m28861();
        int i4 = f27630 + 63;
        f27629 = i4 % 128;
        int i5 = i4 % 2;
        return dTBFetchFactoryM28861;
    }

    /* JADX INFO: renamed from: ﱡ */
    static /* synthetic */ List m28877(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 97;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        List<DTBAdSize> listM28864 = m28864(dTBAdResponse);
        int i4 = f27629 + 41;
        f27630 = i4 % 128;
        if (i4 % 2 != 0) {
            return listM28864;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ String m28878() {
        int i = 2 % 2;
        int i2 = f27630 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27629 = i2 % 128;
        if (i2 % 2 != 0) {
            m28869();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM28869 = m28869();
        int i3 = f27630 + 115;
        f27629 = i3 % 128;
        int i4 = i3 % 2;
        return strM28869;
    }

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ Map m28880(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27629 + 17;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapM28867 = m28867(dTBAdResponse);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return mapM28867;
    }

    /* JADX INFO: renamed from: ﻏ */
    static /* synthetic */ ApsAdRequest m28882(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27629 + 87;
        f27630 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28866(apsAd);
        }
        m28866(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ ApsAdFormat m28885(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27629 + 27;
        f27630 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28868(apsAd);
        }
        m28868(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ AdType m28886(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27630 + 13;
        f27629 = i2 % 128;
        if (i2 % 2 != 0) {
            m28883(dTBAdSize);
            throw null;
        }
        AdType adTypeM28883 = m28883(dTBAdSize);
        int i3 = f27629 + 5;
        f27630 = i3 % 128;
        if (i3 % 2 != 0) {
            return adTypeM28883;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ HashMap m28887(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27629 + 79;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, Object> mapM28862 = m28862(dTBAdResponse);
        int i4 = f27629 + 5;
        f27630 = i4 % 128;
        int i5 = i4 % 2;
        return mapM28862;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ d m28888(C11845bj c11845bj, ThreadPoolExecutor threadPoolExecutor, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        int i2 = f27629 + 111;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        d dVarM28889 = c11845bj.m28889(threadPoolExecutor, interfaceC11874cl);
        int i4 = f27630 + 105;
        f27629 = i4 % 128;
        if (i4 % 2 == 0) {
            return dVarM28889;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m28890(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27629 + 91;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        String strM28879 = m28879(apsAd);
        int i4 = f27629 + 89;
        f27630 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return strM28879;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m28891(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 59;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        String strM28874 = m28874(dTBAdResponse);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return strM28874;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ JSONObject m28892(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27630 + 11;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM28881 = m28881(dTBAdSize);
        int i4 = f27630 + 113;
        f27629 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectM28881;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ ApsAdRequest m28893(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27630 + 57;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdRequest apsAdRequestM28876 = m28876(apsAd);
        int i4 = f27630 + 43;
        f27629 = i4 % 128;
        int i5 = i4 % 2;
        return apsAdRequestM28876;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m28894(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 105;
        f27629 = i2 % 128;
        if (i2 % 2 == 0) {
            return m28884(dTBAdResponse);
        }
        m28884(dTBAdResponse);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m28896(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27630 + 107;
        f27629 = i2 % 128;
        if (i2 % 2 == 0) {
            return m28900(dTBAdSize);
        }
        m28900(dTBAdSize);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m28897(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27630 + 57;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        String strM28873 = m28873(apsAd);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = f27629 + 87;
        f27630 = i5 % 128;
        int i6 = i5 % 2;
        return strM28873;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m28898(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27629 + 33;
        f27630 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28872(dTBAdResponse);
        }
        m28872(dTBAdResponse);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m28899(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27630 + 73;
        f27629 = i2 % 128;
        if (i2 % 2 == 0) {
            return m28895(dTBAdResponse, dTBAdSize);
        }
        m28895(dTBAdResponse, dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ Bundle m28901(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 49;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleM28865 = m28865(dTBAdResponse);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = f27629 + 3;
        f27630 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return bundleM28865;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ e m28902(C11845bj c11845bj, HashMap map, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        int i2 = f27629 + 75;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        e eVarM28903 = c11845bj.m28903((HashMap<String, DTBFetchManager>) map, interfaceC11874cl);
        int i4 = f27629 + 93;
        f27630 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return eVarM28903;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m28905(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27630 + 61;
        f27629 = i2 % 128;
        if (i2 % 2 != 0) {
            m28863(apsAd);
            throw null;
        }
        String strM28863 = m28863(apsAd);
        int i3 = f27630 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27629 = i3 % 128;
        int i4 = i3 % 2;
        return strM28863;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ boolean m28906(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27630 + 39;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM28875 = m28875(dTBAdSize);
        int i4 = f27630 + 61;
        f27629 = i4 % 128;
        if (i4 % 2 == 0) {
            return zM28875;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public C11845bj(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27629 + 23;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        Matcher matcher = Pattern.compile(m28904(ImageFormat.getBitsPerPixel(0) + 1, (char) View.MeasureSpec.getMode(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12).intern()).matcher(mo28831());
        if (!matcher.matches()) {
            return null;
        }
        int i4 = f27630 + 39;
        f27629 = i4 % 128;
        return i4 % 2 != 0 ? matcher.group(1) : matcher.group(1);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo28831() {
        int i = 2 % 2;
        int i2 = f27629 + 17;
        f27630 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AdRegistration.getVersion();
            super.hashCode();
            throw null;
        }
        String version = AdRegistration.getVersion();
        int i3 = f27630 + 27;
        f27629 = i3 % 128;
        if (i3 % 2 == 0) {
            return version;
        }
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:102:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:104:0x04da  */
    /* JADX WARN: Code duplicated, block: B:105:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:107:0x0500  */
    /* JADX WARN: Code duplicated, block: B:109:0x050c  */
    /* JADX WARN: Code duplicated, block: B:10:0x004e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0510  */
    /* JADX WARN: Code duplicated, block: B:111:0x0514  */
    /* JADX WARN: Code duplicated, block: B:113:0x0535  */
    /* JADX WARN: Code duplicated, block: B:114:0x0542  */
    /* JADX WARN: Code duplicated, block: B:116:0x0562  */
    /* JADX WARN: Code duplicated, block: B:117:0x0565  */
    /* JADX WARN: Code duplicated, block: B:119:0x0588  */
    /* JADX WARN: Code duplicated, block: B:120:0x0595  */
    /* JADX WARN: Code duplicated, block: B:122:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:123:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:125:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:126:0x05df  */
    /* JADX WARN: Code duplicated, block: B:128:0x0608  */
    /* JADX WARN: Code duplicated, block: B:129:0x060b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0073  */
    /* JADX WARN: Code duplicated, block: B:131:0x0629  */
    /* JADX WARN: Code duplicated, block: B:132:0x062c  */
    /* JADX WARN: Code duplicated, block: B:134:0x064e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0650  */
    /* JADX WARN: Code duplicated, block: B:137:0x0674  */
    /* JADX WARN: Code duplicated, block: B:138:0x0677  */
    /* JADX WARN: Code duplicated, block: B:13:0x0081  */
    /* JADX WARN: Code duplicated, block: B:140:0x069a  */
    /* JADX WARN: Code duplicated, block: B:141:0x069d  */
    /* JADX WARN: Code duplicated, block: B:143:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:15:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:215:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:220:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:230:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0108  */
    /* JADX WARN: Code duplicated, block: B:250:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0113  */
    /* JADX WARN: Code duplicated, block: B:27:0x0117  */
    /* JADX WARN: Code duplicated, block: B:28:0x011b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0140  */
    /* JADX WARN: Code duplicated, block: B:31:0x0144  */
    /* JADX WARN: Code duplicated, block: B:33:0x0167  */
    /* JADX WARN: Code duplicated, block: B:34:0x016b  */
    /* JADX WARN: Code duplicated, block: B:36:0x018c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0190  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x01db  */
    /* JADX WARN: Code duplicated, block: B:43:0x01de  */
    /* JADX WARN: Code duplicated, block: B:45:0x0203  */
    /* JADX WARN: Code duplicated, block: B:46:0x0207  */
    /* JADX WARN: Code duplicated, block: B:48:0x0229  */
    /* JADX WARN: Code duplicated, block: B:49:0x0236  */
    /* JADX WARN: Code duplicated, block: B:51:0x0258  */
    /* JADX WARN: Code duplicated, block: B:52:0x025c  */
    /* JADX WARN: Code duplicated, block: B:54:0x027e  */
    /* JADX WARN: Code duplicated, block: B:56:0x028a  */
    /* JADX WARN: Code duplicated, block: B:57:0x028d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0291  */
    /* JADX WARN: Code duplicated, block: B:60:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0300  */
    /* JADX WARN: Code duplicated, block: B:67:0x0304  */
    /* JADX WARN: Code duplicated, block: B:69:0x0327  */
    /* JADX WARN: Code duplicated, block: B:70:0x032b  */
    /* JADX WARN: Code duplicated, block: B:72:0x034c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0350  */
    /* JADX WARN: Code duplicated, block: B:75:0x0374  */
    /* JADX WARN: Code duplicated, block: B:76:0x0378  */
    /* JADX WARN: Code duplicated, block: B:78:0x039c  */
    /* JADX WARN: Code duplicated, block: B:79:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:85:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x0410  */
    /* JADX WARN: Code duplicated, block: B:89:0x0413  */
    /* JADX WARN: Code duplicated, block: B:92:0x0437  */
    /* JADX WARN: Code duplicated, block: B:93:0x043b  */
    /* JADX WARN: Code duplicated, block: B:95:0x045e  */
    /* JADX WARN: Code duplicated, block: B:96:0x046a  */
    /* JADX WARN: Code duplicated, block: B:98:0x048a  */
    /* JADX WARN: Code duplicated, block: B:99:0x048e  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = f27630 + 75;
        f27629 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 62 / 0;
            switch (str.hashCode()) {
                case -2137858584:
                    if (str.equals(m28904(204 - (ViewConfiguration.getScrollBarSize() >> 8), (char) Color.green(0), Color.blue(0) + 11).intern())) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case -2133119933:
                    if (str.equals(m28904(672 - ExpandableListView.getPackedPositionChild(0L), (char) (20570 - TextUtils.getTrimmedLength("")), 15 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        b = -1;
                    } else {
                        b = 34;
                    }
                    break;
                case -1987686071:
                    if (str.equals(m28904(481 - ImageFormat.getBitsPerPixel(0), (char) (MotionEvent.axisFromString("") + 54482), 13 - (Process.myPid() >> 22)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.CAN;
                    }
                    break;
                case -1885106463:
                    if (str.equals(m28904((ViewConfiguration.getLongPressTimeout() >> 16) + 27, (char) (29446 - AndroidCharacter.getMirror('0')), 11 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1879113962:
                    if (str.equals(m28904(280 - ExpandableListView.getPackedPositionType(0L), (char) Color.blue(0), View.MeasureSpec.getMode(0) + 9).intern())) {
                        b = -1;
                    } else {
                        b = 13;
                    }
                    break;
                case -1879025222:
                    if (!(!str.equals(m28904(240 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (37132 - (Process.myPid() >> 22)), (ViewConfiguration.getLongPressTimeout() >> 16) + 9).intern()))) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case -1554728876:
                    if (str.equals(m28904((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 94, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 45 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case -1464660218:
                    if (str.equals(m28904(TextUtils.getOffsetAfter("", 0) + 394, (char) TextUtils.getCapsMode("", 0, 0), 29 - KeyEvent.keyCodeFromString("")).intern())) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case -1358954558:
                    if (str.equals(m28904((ViewConfiguration.getScrollDefaultDelay() >> 16) + 311, (char) KeyEvent.keyCodeFromString(""), (-16777201) - Color.rgb(0, 0, 0)).intern())) {
                        b = -1;
                    } else {
                        int i8 = f27630 + 85;
                        f27629 = i8 % 128;
                        int i9 = i8 % 2;
                        b = 15;
                    }
                    break;
                case -1293925587:
                    if (str.equals(m28904(70 - TextUtils.indexOf((CharSequence) "", '0'), (char) Color.red(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23).intern())) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1291566264:
                    if (str.equals(m28904(Color.red(0) + 741, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Gravity.getAbsoluteGravity(0, 0) + 12).intern())) {
                        b = -1;
                    } else {
                        int i10 = f27629 + 13;
                        f27630 = i10 % 128;
                        int i11 = i10 % 2;
                        b = 39;
                    }
                    break;
                case -1092884085:
                    if (str.equals(m28904(152 - Color.argb(0, 0, 0, 0), (char) (8682 - (ViewConfiguration.getEdgeSlop() >> 16)), 35 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b = -1;
                    } else {
                        i = f27629 + 101;
                        f27630 = i % 128;
                        if (i % 2 == 0) {
                            b = 6;
                        } else {
                            b = 76;
                        }
                    }
                    break;
                case -1090060454:
                    if (str.equals(m28904(215 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 57296), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11).intern())) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case -832298225:
                    if (str.equals(m28904(495 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 17).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22491EM;
                    }
                    break;
                case -791598050:
                    if (str.equals(m28904(Drawable.resolveOpacity(0, 0) + 721, (char) Color.blue(0), 11 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 37;
                    }
                    break;
                case -723985259:
                    if (str.equals(m28904((ViewConfiguration.getScrollDefaultDelay() >> 16) + FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 10 - Process.getGidForName("")).intern())) {
                        b = -1;
                    } else {
                        int i12 = f27630 + 79;
                        f27629 = i12 % 128;
                        int i13 = i12 % 2;
                        b = 17;
                    }
                    break;
                case -696695160:
                    if (!str.equals(m28904(38 - TextUtils.indexOf("", ""), (char) (8769 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 33 - Drawable.resolveOpacity(0, 0)).intern())) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -694845532:
                    if (str.equals(m28904(TextUtils.getCapsMode("", 0, 0) + TsExtractor.TS_STREAM_TYPE_DTS_UHD, (char) (ImageFormat.getBitsPerPixel(0) + 30446), (ViewConfiguration.getJumpTapTimeout() >> 16) + 13).intern())) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case -466918522:
                    if (str.equals(m28904(371 - TextUtils.getTrimmedLength(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22).intern())) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case -341719851:
                    if (str.equals(m28904(352 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getMode(0), 19 - Color.red(0)).intern())) {
                        b = Ascii.DC2;
                    } else {
                        b = -1;
                    }
                    break;
                case -300800492:
                    if (str.equals(m28904(View.getDefaultSize(0, 0) + FrameMetricsAggregator.EVERY_DURATION, (char) (64818 - View.combineMeasuredStates(0, 0)), (Process.myTid() >> 22) + 17).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.SUB;
                    }
                    break;
                case -197992833:
                    if (str.equals(m28904(528 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.ESC;
                    }
                    break;
                case -27446238:
                    if (str.equals(m28904(436 - View.resolveSize(0, 0), (char) ((-1) - Process.getGidForName("")), 20 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b = -1;
                    } else {
                        b = 22;
                    }
                    break;
                case 66052:
                    if (str.equals(m28904(Drawable.resolveOpacity(0, 0) + 665, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 32;
                    }
                    break;
                case 63478087:
                    if (str.equals(m28904(667 - Process.getGidForName(""), (char) (29933 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 5).intern())) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 355568411:
                    if (str.equals(m28904(AndroidCharacter.getMirror('0') + 640, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 13 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 35;
                    }
                    break;
                case 568188517:
                    if (str.equals(m28904((ViewConfiguration.getLongPressTimeout() >> 16) + 326, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 19185), View.resolveSize(0, 0) + 15).intern())) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 620798166:
                    if (str.equals(m28904(227 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 12 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b = -1;
                    } else {
                        i2 = f27630 + 57;
                        f27629 = i2 % 128;
                        if (i2 % 2 != 0) {
                            b = 10;
                        } else {
                            b = 17;
                        }
                    }
                    break;
                case 788901082:
                    if (str.equals(m28904(Color.blue(0) + TypedValues.CycleType.TYPE_WAVE_PERIOD, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 12 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.NAK;
                    }
                    break;
                case 1036908700:
                    if (str.equals(m28904((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, (char) View.combineMeasuredStates(0, 0), 14 - (Process.myTid() >> 22)).intern())) {
                        b = -1;
                    } else {
                        int i14 = f27629 + 51;
                        f27630 = i14 % 128;
                        int i15 = i14 % 2;
                        b = 0;
                    }
                    break;
                case 1251356764:
                    if (str.equals(m28904(View.MeasureSpec.getSize(0) + IronSourceError.ERROR_BN_LOAD_NO_CONFIG, (char) (Color.red(0) + 36955), 41 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22498RS;
                    }
                    break;
                case 1306698049:
                    if (str.equals(m28904(TextUtils.indexOf("", "") + 187, (char) (22298 - (ViewConfiguration.getLongPressTimeout() >> 16)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16).intern())) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1328085269:
                    if (str.equals(m28904(457 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) TextUtils.indexOf("", ""), 25 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 1340383521:
                    if (str.equals(m28904(732 - KeyEvent.normalizeMetaState(0), (char) TextUtils.indexOf("", ""), 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 38;
                    }
                    break;
                case 1340427404:
                    if (str.equals(m28904(TextUtils.indexOf("", "", 0) + 656, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 9 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22502US;
                    }
                    break;
                case 1600627740:
                    if (str.equals(m28904((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 701, (char) (KeyEvent.getDeadChar(0, 0) + 49006), TextUtils.lastIndexOf("", '0') + 21).intern())) {
                        b = -1;
                    } else {
                        b = 36;
                    }
                    break;
                case 1648408950:
                    if (str.equals(m28904(602 - TextUtils.getOffsetAfter("", 0), (char) (19649 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern())) {
                        b = -1;
                    } else {
                        i3 = f27629 + 23;
                        f27630 = i3 % 128;
                        if (i3 % 2 == 0) {
                            b = Ascii.f22494GS;
                        } else {
                            b = 124;
                        }
                    }
                    break;
                case 1713728997:
                    if (str.equals(m28904(TextUtils.getTrimmedLength("") + 551, (char) ((-16753575) - Color.rgb(0, 0, 0)), 51 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22493FS;
                    }
                    break;
                case 2019413793:
                    if (!(!str.equals(m28904(249 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (49030 - (Process.myPid() >> 22)), 30 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()))) {
                        b = -1;
                    } else {
                        i4 = f27629 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                        f27630 = i4 % 128;
                        if (i4 % 2 == 0) {
                            b = 12;
                        } else {
                            b = 111;
                        }
                    }
                    break;
                case 2144664800:
                    if (str.equals(m28904(Color.rgb(0, 0, 0) + 16777505, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22).intern())) {
                        b = -1;
                    } else {
                        int i16 = f27629 + 7;
                        f27630 = i16 % 128;
                        int i17 = i16 % 2;
                        b = Ascii.f22500SO;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -2137858584:
                    if (str.equals(m28904(204 - (ViewConfiguration.getScrollBarSize() >> 8), (char) Color.green(0), Color.blue(0) + 11).intern())) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case -2133119933:
                    if (str.equals(m28904(672 - ExpandableListView.getPackedPositionChild(0L), (char) (20570 - TextUtils.getTrimmedLength("")), 15 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        b = -1;
                    } else {
                        b = 34;
                    }
                    break;
                case -1987686071:
                    if (str.equals(m28904(481 - ImageFormat.getBitsPerPixel(0), (char) (MotionEvent.axisFromString("") + 54482), 13 - (Process.myPid() >> 22)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.CAN;
                    }
                    break;
                case -1885106463:
                    if (str.equals(m28904((ViewConfiguration.getLongPressTimeout() >> 16) + 27, (char) (29446 - AndroidCharacter.getMirror('0')), 11 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1879113962:
                    if (str.equals(m28904(280 - ExpandableListView.getPackedPositionType(0L), (char) Color.blue(0), View.MeasureSpec.getMode(0) + 9).intern())) {
                        b = -1;
                    } else {
                        b = 13;
                    }
                    break;
                case -1879025222:
                    if (!(!str.equals(m28904(240 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (37132 - (Process.myPid() >> 22)), (ViewConfiguration.getLongPressTimeout() >> 16) + 9).intern()))) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case -1554728876:
                    if (str.equals(m28904((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 94, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 45 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case -1464660218:
                    if (str.equals(m28904(TextUtils.getOffsetAfter("", 0) + 394, (char) TextUtils.getCapsMode("", 0, 0), 29 - KeyEvent.keyCodeFromString("")).intern())) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case -1358954558:
                    if (str.equals(m28904((ViewConfiguration.getScrollDefaultDelay() >> 16) + 311, (char) KeyEvent.keyCodeFromString(""), (-16777201) - Color.rgb(0, 0, 0)).intern())) {
                        b = -1;
                    } else {
                        int i18 = f27630 + 85;
                        f27629 = i18 % 128;
                        int i19 = i18 % 2;
                        b = 15;
                    }
                    break;
                case -1293925587:
                    if (str.equals(m28904(70 - TextUtils.indexOf((CharSequence) "", '0'), (char) Color.red(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23).intern())) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1291566264:
                    if (str.equals(m28904(Color.red(0) + 741, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Gravity.getAbsoluteGravity(0, 0) + 12).intern())) {
                        b = -1;
                    } else {
                        int i110 = f27629 + 13;
                        f27630 = i110 % 128;
                        int i111 = i110 % 2;
                        b = 39;
                    }
                    break;
                case -1092884085:
                    if (str.equals(m28904(152 - Color.argb(0, 0, 0, 0), (char) (8682 - (ViewConfiguration.getEdgeSlop() >> 16)), 35 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b = -1;
                    } else {
                        i = f27629 + 101;
                        f27630 = i % 128;
                        if (i % 2 == 0) {
                            b = 6;
                        } else {
                            b = 76;
                        }
                    }
                    break;
                case -1090060454:
                    if (str.equals(m28904(215 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 57296), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11).intern())) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case -832298225:
                    if (str.equals(m28904(495 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 17).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22491EM;
                    }
                    break;
                case -791598050:
                    if (str.equals(m28904(Drawable.resolveOpacity(0, 0) + 721, (char) Color.blue(0), 11 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 37;
                    }
                    break;
                case -723985259:
                    if (str.equals(m28904((ViewConfiguration.getScrollDefaultDelay() >> 16) + FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 10 - Process.getGidForName("")).intern())) {
                        b = -1;
                    } else {
                        int i112 = f27630 + 79;
                        f27629 = i112 % 128;
                        int i113 = i112 % 2;
                        b = 17;
                    }
                    break;
                case -696695160:
                    if (!str.equals(m28904(38 - TextUtils.indexOf("", ""), (char) (8769 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 33 - Drawable.resolveOpacity(0, 0)).intern())) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -694845532:
                    if (str.equals(m28904(TextUtils.getCapsMode("", 0, 0) + TsExtractor.TS_STREAM_TYPE_DTS_UHD, (char) (ImageFormat.getBitsPerPixel(0) + 30446), (ViewConfiguration.getJumpTapTimeout() >> 16) + 13).intern())) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case -466918522:
                    if (str.equals(m28904(371 - TextUtils.getTrimmedLength(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22).intern())) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case -341719851:
                    if (str.equals(m28904(352 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getMode(0), 19 - Color.red(0)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.DC2;
                    }
                    break;
                case -300800492:
                    if (str.equals(m28904(View.getDefaultSize(0, 0) + FrameMetricsAggregator.EVERY_DURATION, (char) (64818 - View.combineMeasuredStates(0, 0)), (Process.myTid() >> 22) + 17).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.SUB;
                    }
                    break;
                case -197992833:
                    if (str.equals(m28904(528 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.ESC;
                    }
                    break;
                case -27446238:
                    if (str.equals(m28904(436 - View.resolveSize(0, 0), (char) ((-1) - Process.getGidForName("")), 20 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b = -1;
                    } else {
                        b = 22;
                    }
                    break;
                case 66052:
                    if (str.equals(m28904(Drawable.resolveOpacity(0, 0) + 665, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 32;
                    }
                    break;
                case 63478087:
                    if (str.equals(m28904(667 - Process.getGidForName(""), (char) (29933 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 5).intern())) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 355568411:
                    if (str.equals(m28904(AndroidCharacter.getMirror('0') + 640, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 13 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 35;
                    }
                    break;
                case 568188517:
                    if (str.equals(m28904((ViewConfiguration.getLongPressTimeout() >> 16) + 326, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 19185), View.resolveSize(0, 0) + 15).intern())) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 620798166:
                    if (str.equals(m28904(227 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 12 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b = -1;
                    } else {
                        i2 = f27630 + 57;
                        f27629 = i2 % 128;
                        if (i2 % 2 != 0) {
                            b = 10;
                        } else {
                            b = 17;
                        }
                    }
                    break;
                case 788901082:
                    if (str.equals(m28904(Color.blue(0) + TypedValues.CycleType.TYPE_WAVE_PERIOD, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 12 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.NAK;
                    }
                    break;
                case 1036908700:
                    if (str.equals(m28904((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, (char) View.combineMeasuredStates(0, 0), 14 - (Process.myTid() >> 22)).intern())) {
                        b = -1;
                    } else {
                        int i114 = f27629 + 51;
                        f27630 = i114 % 128;
                        int i115 = i114 % 2;
                        b = 0;
                    }
                    break;
                case 1251356764:
                    if (str.equals(m28904(View.MeasureSpec.getSize(0) + IronSourceError.ERROR_BN_LOAD_NO_CONFIG, (char) (Color.red(0) + 36955), 41 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22498RS;
                    }
                    break;
                case 1306698049:
                    if (str.equals(m28904(TextUtils.indexOf("", "") + 187, (char) (22298 - (ViewConfiguration.getLongPressTimeout() >> 16)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16).intern())) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1328085269:
                    if (str.equals(m28904(457 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) TextUtils.indexOf("", ""), 25 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 1340383521:
                    if (str.equals(m28904(732 - KeyEvent.normalizeMetaState(0), (char) TextUtils.indexOf("", ""), 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 38;
                    }
                    break;
                case 1340427404:
                    if (str.equals(m28904(TextUtils.indexOf("", "", 0) + 656, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 9 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22502US;
                    }
                    break;
                case 1600627740:
                    if (str.equals(m28904((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 701, (char) (KeyEvent.getDeadChar(0, 0) + 49006), TextUtils.lastIndexOf("", '0') + 21).intern())) {
                        b = -1;
                    } else {
                        b = 36;
                    }
                    break;
                case 1648408950:
                    if (str.equals(m28904(602 - TextUtils.getOffsetAfter("", 0), (char) (19649 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern())) {
                        b = -1;
                    } else {
                        i3 = f27629 + 23;
                        f27630 = i3 % 128;
                        if (i3 % 2 == 0) {
                            b = Ascii.f22494GS;
                        } else {
                            b = 124;
                        }
                    }
                    break;
                case 1713728997:
                    if (str.equals(m28904(TextUtils.getTrimmedLength("") + 551, (char) ((-16753575) - Color.rgb(0, 0, 0)), 51 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22493FS;
                    }
                    break;
                case 2019413793:
                    if (!(!str.equals(m28904(249 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (49030 - (Process.myPid() >> 22)), 30 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()))) {
                        b = -1;
                    } else {
                        i4 = f27629 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                        f27630 = i4 % 128;
                        if (i4 % 2 == 0) {
                            b = 12;
                        } else {
                            b = 111;
                        }
                    }
                    break;
                case 2144664800:
                    if (str.equals(m28904(Color.rgb(0, 0, 0) + 16777505, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22).intern())) {
                        b = -1;
                    } else {
                        int i116 = f27629 + 7;
                        f27630 = i116 % 128;
                        int i117 = i116 % 2;
                        b = Ascii.f22500SO;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        }
        switch (b) {
            case 0:
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case 8:
                return DTBAdLoader.class;
            case 9:
                return DTBAdRequest.class;
            case 10:
                return DTBAdResponse.class;
            case 11:
            case 12:
                return DTBAdView.class;
            case 13:
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return e.class;
            case 26:
                return d.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case 32:
                return Aps.class;
            case 33:
                return ApsAd.class;
            case 34:
                return ApsAdController.class;
            case 35:
                return ApsAdListener.class;
            case 36:
                return ApsAdRequestListener.class;
            case 37:
                return ApsAdFormat.class;
            case 38:
                return ApsAdType.class;
            case 39:
                return ApsAdRequest.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m28904((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 754, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Process.getGidForName("") + 10).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28878();
            }
        });
        map.put(m28904(763 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 23 - View.getDefaultSize(0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.11
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28871();
            }
        });
        map.put(m28904(785 - Color.red(0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (-16777198) - Color.rgb(0, 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.18
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28894((DTBAdResponse) list.get(0));
            }
        });
        map.put(m28904(803 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 'G' - AndroidCharacter.getMirror('0')).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.17
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28898((DTBAdResponse) list.get(0));
            }
        });
        map.put(m28904(826 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.20
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28891((DTBAdResponse) list.get(0));
            }
        });
        map.put(m28904(852 - View.getDefaultSize(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 25 - Color.argb(0, 0, 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.16
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28887((DTBAdResponse) list.get(0));
            }
        });
        map.put(m28904(877 - TextUtils.getOffsetAfter("", 0), (char) (Process.myTid() >> 22), 28 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.21
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28901((DTBAdResponse) list.get(0));
            }
        });
        map.put(m28904((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + TypedValues.Custom.TYPE_DIMENSION, (char) (ImageFormat.getBitsPerPixel(0) + 1), 37 - View.combineMeasuredStates(0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.25
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28880((DTBAdResponse) list.get(0));
            }
        });
        map.put(m28904(View.MeasureSpec.makeMeasureSpec(0, 0) + 942, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 16).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.22
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28877((DTBAdResponse) list.get(0));
            }
        });
        map.put(m28904(958 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28899((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        map.put(m28904(981 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ExpandableListView.getPackedPositionType(0L), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28896((DTBAdSize) list.get(0));
            }
        });
        map.put(m28904(Color.rgb(0, 0, 0) + 16778214, (char) View.combineMeasuredStates(0, 0), 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28886((DTBAdSize) list.get(0));
            }
        });
        map.put(m28904(AndroidCharacter.getMirror('0') + 965, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 21 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28892((DTBAdSize) list.get(0));
            }
        });
        map.put(m28904(TextUtils.getOffsetAfter("", 0) + IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Boolean.valueOf(C11845bj.m28906((DTBAdSize) list.get(0)));
            }
        });
        map.put(m28904((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1055, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.rgb(0, 0, 0) + 16777246).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28902(C11845bj.this, (HashMap) list.get(0), interfaceC11874cl);
            }
        });
        map.put(m28904(1085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20749), Gravity.getAbsoluteGravity(0, 0) + 23).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28888(C11845bj.this, (ThreadPoolExecutor) list.get(0), interfaceC11874cl);
            }
        });
        map.put(m28904((ViewConfiguration.getWindowTouchSlop() >> 8) + 1108, (char) (25308 - TextUtils.indexOf((CharSequence) "", '0')), 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28893((ApsAd) list.get(0));
            }
        });
        map.put(m28904((KeyEvent.getMaxKeyCode() >> 16) + 1123, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 10 - Color.alpha(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28890((ApsAd) list.get(0));
            }
        });
        map.put(m28904(1132 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (KeyEvent.normalizeMetaState(0) + 38638), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.15
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28897((ApsAd) list.get(0));
            }
        });
        map.put(m28904(TextUtils.indexOf("", "") + 1146, (char) (22966 - Color.argb(0, 0, 0, 0)), 11 - Color.red(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.13
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28905((ApsAd) list.get(0));
            }
        });
        map.put(m28904(1157 - (Process.myTid() >> 22), (char) View.getDefaultSize(0, 0), 13 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.14
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28885((ApsAd) list.get(0));
            }
        });
        map.put(m28904(1171 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7730), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.12
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28882((ApsAd) list.get(0));
            }
        });
        map.put(m28904(ExpandableListView.getPackedPositionType(0L) + 1182, (char) (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 10).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.19
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11845bj.m28870((ApsAd) list.get(0));
            }
        });
        int i2 = f27630 + 57;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﮌ */
    private static String m28869() {
        int i = 2 % 2;
        int i2 = f27629 + 29;
        f27630 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AdRegistration.getAppKey();
            throw null;
        }
        String appKey = AdRegistration.getAppKey();
        int i3 = f27630 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27629 = i3 % 128;
        if (i3 % 2 == 0) {
            return appKey;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ */
    private static DTBFetchFactory m28861() {
        int i = 2 % 2;
        int i2 = f27629 + 61;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        DTBFetchFactory dTBFetchFactory = DTBFetchFactory.getInstance();
        int i4 = f27629 + 109;
        f27630 = i4 % 128;
        int i5 = i4 % 2;
        return dTBFetchFactory;
    }

    /* JADX INFO: renamed from: ﻏ */
    private static String m28884(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27629 + 47;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        String bidId = dTBAdResponse.getBidId();
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return bidId;
    }

    /* JADX INFO: renamed from: ﮐ */
    private static String m28872(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 111;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        String crid = dTBAdResponse.getCrid();
        int i4 = f27630 + 23;
        f27629 = i4 % 128;
        int i5 = i4 % 2;
        return crid;
    }

    /* JADX INFO: renamed from: ﱟ */
    private static String m28874(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 19;
        f27629 = i2 % 128;
        if (i2 % 2 == 0) {
            return dTBAdResponse.getImpressionUrl();
        }
        dTBAdResponse.getImpressionUrl();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ */
    private static HashMap<String, Object> m28862(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 27;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, Object> renderingMap = dTBAdResponse.getRenderingMap();
        int i4 = f27629 + 27;
        f27630 = i4 % 128;
        int i5 = i4 % 2;
        return renderingMap;
    }

    /* JADX INFO: renamed from: ﭸ */
    private static Bundle m28865(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 49;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        Bundle renderingBundle = dTBAdResponse.getRenderingBundle();
        int i4 = f27630 + 13;
        f27629 = i4 % 128;
        int i5 = i4 % 2;
        return renderingBundle;
    }

    /* JADX INFO: renamed from: ﮉ */
    private static Map<String, String> m28867(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 93;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return defaultVideoAdsRequestCustomParams;
    }

    /* JADX INFO: renamed from: ﭴ */
    private static List<DTBAdSize> m28864(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f27630 + 43;
        f27629 = i2 % 128;
        if (i2 % 2 == 0) {
            return dTBAdResponse.getDTBAds();
        }
        dTBAdResponse.getDTBAds();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28895(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27630 + 25;
        f27629 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            dTBAdResponse.getPricePoints(dTBAdSize);
            super.hashCode();
            throw null;
        }
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        int i3 = f27630 + 25;
        f27629 = i3 % 128;
        if (i3 % 2 == 0) {
            return pricePoints;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28900(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27629 + 65;
        f27630 = i2 % 128;
        if (i2 % 2 != 0) {
            return dTBAdSize.getSlotUUID();
        }
        dTBAdSize.getSlotUUID();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ */
    private static AdType m28883(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27629 + 11;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i4 = f27629 + 99;
        f27630 = i4 % 128;
        int i5 = i4 % 2;
        return dTBAdType;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static JSONObject m28881(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27630 + 5;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        int i4 = f27630 + 37;
        f27629 = i4 % 128;
        int i5 = i4 % 2;
        return pubSettings;
    }

    /* JADX INFO: renamed from: ﱟ */
    private static boolean m28875(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f27630 + 95;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsInterstitialAd = dTBAdSize.isInterstitialAd();
        int i4 = f27629 + 103;
        f27630 = i4 % 128;
        int i5 = i4 % 2;
        return zIsInterstitialAd;
    }

    /* JADX INFO: renamed from: ﱡ */
    private static ApsAdRequest m28876(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27629 + 75;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        int i4 = f27630 + 111;
        f27629 = i4 % 128;
        int i5 = i4 % 2;
        return apsAdRequest;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static String m28879(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27629 + 101;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        String bidInfo = apsAd.getBidInfo();
        int i4 = f27630 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f27629 = i4 % 128;
        int i5 = i4 % 2;
        return bidInfo;
    }

    /* JADX INFO: renamed from: ﱟ */
    private static String m28873(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27630 + 65;
        f27629 = i2 % 128;
        if (i2 % 2 != 0) {
            apsAd.getPricePoint();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String pricePoint = apsAd.getPricePoint();
        int i3 = f27630 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27629 = i3 % 128;
        int i4 = i3 % 2;
        return pricePoint;
    }

    /* JADX INFO: renamed from: ﭴ */
    private static String m28863(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27629 + 23;
        f27630 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            apsAd.getSlotUuid();
            super.hashCode();
            throw null;
        }
        String slotUuid = apsAd.getSlotUuid();
        int i3 = f27629 + 9;
        f27630 = i3 % 128;
        if (i3 % 2 != 0) {
            return slotUuid;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ */
    private static ApsAdFormat m28868(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27629 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        int i4 = f27629 + 17;
        f27630 = i4 % 128;
        int i5 = i4 % 2;
        return apsAdFormat;
    }

    /* JADX INFO: renamed from: ﭸ */
    private static ApsAdRequest m28866(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27629 + 81;
        f27630 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        int i4 = f27629 + 15;
        f27630 = i4 % 128;
        if (i4 % 2 != 0) {
            return adLoader;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ */
    private static DTBAdView m28860(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f27630 + 3;
        f27629 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            apsAd.getAdView();
            throw null;
        }
        DTBAdView adView = apsAd.getAdView();
        int i3 = f27630 + 97;
        f27629 = i3 % 128;
        if (i3 % 2 == 0) {
            return adView;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private e m28903(HashMap<String, DTBFetchManager> map, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        e eVar = new e(map, interfaceC11874cl);
        int i2 = f27630 + 29;
        f27629 = i2 % 128;
        if (i2 % 2 == 0) {
            return eVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private d m28889(ThreadPoolExecutor threadPoolExecutor, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        d dVar = new d(threadPoolExecutor, interfaceC11874cl);
        int i2 = f27630 + 13;
        f27629 = i2 % 128;
        int i3 = i2 % 2;
        return dVar;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bj$e */
    class e extends HashMap<String, DTBFetchManager> implements InterfaceC12003hf<HashMap<String, DTBFetchManager>> {

        /* JADX INFO: renamed from: ﻛ */
        private static int f27665 = 0;

        /* JADX INFO: renamed from: ｋ */
        private static long f27666 = -3112591810241338939L;

        /* JADX INFO: renamed from: ﾒ */
        private static int f27667 = 1;

        /* JADX INFO: renamed from: ﻐ */
        private InterfaceC11874cl f27668;

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = f27667 + 109;
            f27665 = i2 % 128;
            int i3 = i2 % 2;
            DTBFetchManager dTBFetchManagerM28909 = m28909((String) obj, (DTBFetchManager) obj2);
            int i4 = f27665 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f27667 = i4 % 128;
            int i5 = i4 % 2;
            return dTBFetchManagerM28909;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12003hf
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo28813() {
            int i = 2 % 2;
            int i2 = f27665 + 71;
            f27667 = i2 % 128;
            int i3 = i2 % 2;
            HashMap<String, DTBFetchManager> mapM28910 = m28910();
            int i4 = f27665 + 105;
            f27667 = i4 % 128;
            int i5 = i4 % 2;
            return mapM28910;
        }

        public e(HashMap<String, DTBFetchManager> map, InterfaceC11874cl interfaceC11874cl) {
            super(map);
            this.f27668 = interfaceC11874cl;
        }

        /* JADX INFO: renamed from: ﾇ */
        private DTBFetchManager m28909(String str, DTBFetchManager dTBFetchManager) {
            int i = 2 % 2;
            int i2 = f27667 + 113;
            f27665 = i2 % 128;
            if (i2 % 2 != 0) {
                C11845bj c11845bj = C11845bj.this;
                InterfaceC11874cl interfaceC11874cl = this.f27668;
                String strIntern = m28911("्उ麬］\uec8c﬩⽄\ude20踼瘁方爫ܨ\uf120ﺘ\ued36鰖槈矰擀ᕕ\ue0d8\uf0ed鿗ꩤ鯤䧚ᚽ⍅ዤ섲", (AudioTrack.getMaxVolume() > 2.0f ? 1 : (AudioTrack.getMaxVolume() == 2.0f ? 0 : -1))).intern();
                Object[] objArr = new Object[5];
                objArr[1] = str;
                objArr[0] = dTBFetchManager;
                c11845bj.m28837(this, interfaceC11874cl, strIntern, objArr);
            } else {
                C11845bj.this.m28837(this, this.f27668, m28911("्उ麬］\uec8c﬩⽄\ude20踼瘁方爫ܨ\uf120ﺘ\ued36鰖槈矰擀ᕕ\ue0d8\uf0ed鿗ꩤ鯤䧚ᚽ⍅ዤ섲", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), str, dTBFetchManager);
            }
            return (DTBFetchManager) super.put(str, dTBFetchManager);
        }

        /* JADX INFO: renamed from: ﾇ */
        private HashMap<String, DTBFetchManager> m28910() {
            int i = 2 % 2;
            int i2 = f27667;
            int i3 = i2 + 115;
            f27665 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            int i4 = i2 + 85;
            f27665 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m28911(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11943f.f28848) {
                char[] cArrM30189 = C11943f.m30189(f27666, cArr, i);
                C11943f.f28846 = 4;
                while (C11943f.f28846 < cArrM30189.length) {
                    C11943f.f28847 = C11943f.f28846 - 4;
                    cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27666));
                    C11943f.f28846++;
                }
                str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bj$d */
    class d extends ThreadPoolExecutor implements InterfaceC12003hf<ThreadPoolExecutor> {

        /* JADX INFO: renamed from: ﮐ */
        private static byte[] f27656 = {-82, -88, -51, -87, -102, -52, -16, 118, -67, -91, -84, -61, -70, -51, -98, -68, -92, -88, -51, -87, -102, -20, -68, -103, 0};

        /* JADX INFO: renamed from: ﱡ */
        private static int f27657 = 0;

        /* JADX INFO: renamed from: ﺙ */
        private static int f27658 = 1;

        /* JADX INFO: renamed from: ﻏ */
        private static short[] f27659 = null;

        /* JADX INFO: renamed from: ﻐ */
        private static int f27660 = 44;

        /* JADX INFO: renamed from: ｋ */
        private static int f27661 = 718844458;

        /* JADX INFO: renamed from: ﾇ */
        private static int f27662 = -1778251734;

        /* JADX INFO: renamed from: ﾒ */
        private InterfaceC11874cl f27664;

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12003hf
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ ThreadPoolExecutor mo28813() {
            int i = 2 % 2;
            int i2 = f27657 + 15;
            f27658 = i2 % 128;
            int i3 = i2 % 2;
            ThreadPoolExecutor threadPoolExecutorM28908 = m28908();
            int i4 = f27658 + 35;
            f27657 = i4 % 128;
            if (i4 % 2 == 0) {
                return threadPoolExecutorM28908;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public d(ThreadPoolExecutor threadPoolExecutor, InterfaceC11874cl interfaceC11874cl) {
            super(threadPoolExecutor.getCorePoolSize(), threadPoolExecutor.getMaximumPoolSize(), threadPoolExecutor.getKeepAliveTime(TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS, threadPoolExecutor.getQueue());
            this.f27664 = interfaceC11874cl;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            int i = 2 % 2;
            int i2 = f27657 + 83;
            f27658 = i2 % 128;
            int i3 = i2 % 2;
            C11845bj.this.m28837(this, this.f27664, m28907(1778251734 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) (76 - ExpandableListView.getPackedPositionType(0L)), (-735621590) - Color.rgb(0, 0, 0), (byte) (10 - TextUtils.indexOf((CharSequence) "", '0', 0)), (-19) - View.resolveSizeAndState(0, 0, 0)).intern(), runnable);
            super.execute(runnable);
            int i4 = f27658 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f27657 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾇ */
        private ThreadPoolExecutor m28908() {
            int i = 2 % 2;
            int i2 = f27657 + 49;
            int i3 = i2 % 128;
            f27658 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 25;
            f27657 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m28907(int i, short s, int i2, byte b, int i3) {
            String string;
            synchronized (C12086m.f29832) {
                StringBuilder sb = new StringBuilder();
                int i4 = f27660;
                int i5 = i3 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f27656;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f27662 + i] + i4);
                    } else {
                        i5 = (short) (f27659[f27662 + i] + i4);
                    }
                }
                if (i5 > 0) {
                    C12086m.f29836 = ((i + i5) - 2) + f27662 + i6;
                    C12086m.f29833 = b;
                    C12086m.f29837 = (char) (i2 + f27661);
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835 = 1;
                    while (C12086m.f29835 < i5) {
                        byte[] bArr2 = f27656;
                        if (bArr2 != null) {
                            int i7 = C12086m.f29836;
                            C12086m.f29836 = i7 - 1;
                            C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                        } else {
                            short[] sArr = f27659;
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

    /* JADX INFO: renamed from: ﾒ */
    private static String m28904(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f27631[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f27632)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
