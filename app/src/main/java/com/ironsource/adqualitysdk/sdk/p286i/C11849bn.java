package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.activity.HyprMXBaseViewController;
import com.hyprmx.android.sdk.activity.HyprMXMraidViewController;
import com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController;
import com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity;
import com.hyprmx.android.sdk.activity.HyprMXVastViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebView;
import com.hyprmx.android.sdk.activity.HyprMXWebViewClient;
import com.hyprmx.android.sdk.activity.OfferViewerHandler;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMX;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController;
import com.hyprmx.android.sdk.graphics.HyprMXSkipController;
import com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity;
import com.hyprmx.android.sdk.placement.PlacementController;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.hyprmx.android.sdk.utility.HyprMXProperties;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bn */
/* JADX INFO: loaded from: classes6.dex */
public final class C11849bn extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f27742 = null;

    /* JADX INFO: renamed from: ﻛ */
    private static long f27743 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f27744 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static int f27745 = 1;

    static {
        char[] cArr = new char[1080];
        ByteBuffer.wrap("\u0000V2$d\u0090\u0097pÉÍûª.\b`ø\u0093FÅ(÷\u0087*n#¤\u0011ÇG\\´\u0082ê\"Ø{\r\u0092C\u0000°ÙæÏÔT\tõ\u0000H2\u0018d²\u0097QÉÉû½\u0000H2\u0018d²\u0097QÉÉû½.\u0005`È\u0093fÅ\u001d÷¸*D\\à\u008e\u0081Á+óÝ\u0003²1ïgA\u0094¢Ê\u0003øj-Ác+\u0090\u009eÆßôQ)¹_\u000b\u0000A2\u0005\u0000D2\u0004d²\u0097FÉêû\u0081.#`É\u0093kÅ\u0010÷\u0082*D\\à\u008e\u0089Á+óÝ\u0000P2\u0013d§\u0097OÉëû\u0084.\"`Â\u0093lÅ?÷«*X\\ø\u008e©Á/óÛ&qg>Un\u0003Äð'®¿\u009cËI`\u0007£ô\u0011¢o\u0090ÙM/;\u008eéò¦]\u0094ª\u0000H2\u0018d²\u0097QÉÉû½.\u0011`Â\u0093jÅ?÷£*N\\û\u008eºÁ'óÛ&xX2\u008a¾½\\ïç!\u0094T4\u0086Û¹}ë7\u001d»PM\u0082Þ´\u009cç,$\u0092\u0016ÿ@^³üí\u001dßm\nÇD$·\u0094áàÓ\u0015\u000e»x\u0013ªxåÍ×1\u0002\u0088|ä®\r\u0099±Ë\u0001\u0005op\u0089¢!\u009d\u009bÏé9[t¢¦\u0004\u0090oÃÜ=`h\u0099Z\t\u0094cÇÀ1\u0018l¬^À\u0088Sû»5.grRß\u008c*ÿ«)ö\u001bJV©\u0080#òo-Í\u001f6J\u0085\u0084åöJ!¬\u0013&Mj¸Üê\u000f%\u008d\u0017ý\u0000H2\u0018d²\u0097QÉÉû½.\b`È\u0093GÅ\u000f÷¬*N\\þ\u008e\u009eÁ\u000fóÌ&dX\u0018\u008a¤½Zïà!\u008c\u0000c2\u000ed¯\u0097\rÉìû\u009c.6`Õ\u0093eÅ\u0011÷ä*J\\â\u008e\u0089Á<óÀ&yX\u0015\u008aü½@ïð!\u009eTx\u0086Ö¹{ë\r\u001d³PM\u0082õ´\u0089ç'\u0019\u0091Lh~ø°\u0092ã1\u0015éH]z(¬¨ßg\u0011ïC\u008cv.¨ÞÛ~\r/?¬rD¤øÖ\u0084\t:;Ànl!\u0010\u0013@Eê¶\tè\u0091Úå\u000fQA\u0099²6äTÖà\u000b%}½¯ÐàaÒ\u0092\u0007:yh«é\u009c\u001fÎ¥\u0000Ûug§\u009b\u00989_/mB;ãÈA\u0096 ¤Ðqz?\u0099Ì)\u009a]¨¨u\u0006\u0003®ÑÅ\u009ep¬\u008cy5\u0007YÕ°â\f°¼~Ò\u000b4Ù\u009aæ7´ABÿ\u000f\u0001Ý¹ëÅ¸kFÝ\u0013$!´ïÞ¼}J¥\u0017\u0011%eóí\u0080\u0002N \u001cÔ)Q÷\u0089\u0084$RU`æ-\u000eû\u009c\u0089ÝVkd\u00911/ÿS\u008dïZ\r\u0000H2\u0018d²\u0097QÉÉû½.\u0014`Â\u0093yÅ\u001c÷£*Y\\é\u008e\u0089Á\u0007óÁ&vX\u001e\u008a ½^ïõ!\u0081T?\u0086Ø¹vë8\u001d¹PO\u0082õ´\u008bç7\u0019ËLY\u0000c2\u000ed¯\u0097\rÉìû\u009c.6`Õ\u0093eÅ\u0011÷ä*J\\â\u008e\u0089Á<óÀ&yX\u0015\u008aü½@ïð!\u009eTx\u0086Ö¹{ë\r\u001d³PM\u0082õ´\u0089ç'\u0019\u0091Lh~ø°\u0092ã1\u0015éH]z4¬¢ßY\u0011üC\u0083v9¨ÉÛi\r'?¡rV¤þÖ\u0080\t>;Õna \u001fÒ¸\u0005V7Øi\u0099\u009c/ÎÕ\u0001k3\u0017e«\u00989\u0000H2\u0018d²\u0097QÉÉû½.\u0004`Æ\u0093{Å\f÷\u009c*B\\é\u008e\u009aÁ\róÀ&~X\u0005\u008a ½\\ïø!\u0099T3\u0086Åz(Hx\u001eÒí1³©\u0081ÝTp\u001a¦é\u001b¿}\u008düP\"&\u0089ôú»m\u0089 \\\u001e\"eðÀÇ<\u0095\u0098[ù.Sü¥\u0000H2\u0018d²\u0097QÉÉû½.\u0011`Â\u0093jÅ=÷¸*J\\ê\u008e\u008bÁ'óÌ&FX\u0018\u008a·½Dï×!\u009aT8\u0086Ã¹jë\u0016\u001d¶PW\u0082ù´\u008f\u0000O2\u0007d¤\u0097FÉöû¦.'`Ä\u0093`Å\f÷\u008f*E\\ø\u008e\u0084Á:óÖ_\u0003mP;ôÈ#\u0096¢¤Ðqt?\u0095Ì5\u009a^¨Ñu\u001d\u0003²ÑÜ\u009ey¬\u008f\u0000W2\u0004d \u0097wÉöû\u0084. `Á\u0093aÅ\n÷\u009f*y\\À\u008f]½\rë§\u0018DFÜt¨¡\u001fï×\u001c|J\u000ex±¥sÓö\u0001\u008aN>|ù©j×\n\u0005³2T`î®\u008cÛ/\tÇ6\u007fô\u0095ÆÅ\u0090oc\u008c=\u0014\u000f`ÚÖ\u0094\bg´1Ý\u0003sÞ ¨8zU5ä\u00071Ò¢¬Â~{I\u009c\u001b&ÕD çr\u000fM·\u0000H2\u0018d²\u0097QÉÉû½.\t`Á\u0093nÅ\f÷¸*|\\é\u008e\u008fÁ\u0018óÆ&uX\u0006\u008a\u0091½\\ïú!\u0081T$\u0086Ø¹të\u0015\u001d¿PI\u0000H2\u0018d²\u0097QÉÉû½.\u0011`Â\u0093jÅ?÷£*N\\û\u0000H2\u0018d²\u0097QÉÉû½.\u0011`Â\u0093jÅ?÷£*N\\û\u008e®Á\"óÆ&uX\u001f\u008a¦\u0000H2\u0018d²\u0097QÉÉû½.\t`Á\u0093nÅ\f÷¸*}\\å\u008e\u0088Á9óÊ&bX9\u008a³½]ïð!\u0099T3\u0086Å\u0000O2\u0007d¤\u0097FÉöû³./`Â\u0093\u007fÅ\f÷¸*c\\í\u008e\u0083Á*óÃ&uX\u0003\u008a\u009e½Zïç!\u0081T3\u0086Ù¹}ë\u000b®\u008d\u009cÝÊw9\u0094g\fUx\u0080ÐÎ\t=¤kÜYL\u0084\u0081ò' \\où]\u0005\u0088¹öØ$r\u0013\u0084\u0000H2\u0018d²\u0097QÉÉû½.\u0015`Ì\u0093aÅ\u0019÷\u0089*D\\â\u008e\u0099Á<óÀ&|X\u001d\u008a·½AïØ!\u009cT%\u0086Ã¹}ë\u0017\u001d¿PI¡!\u0093qÅÛ68h ZÔ\u008fmÁ¼2\u000edwVÐ\u008b'ý\u0097/Å`DR²\u0087\u0010ùn+Ò\u001c.N\u0084VOd\"2\u0083Á!\u009fÀ\u00ad°x\u001a6ùÅI\u0093=¡È|f\nÎØ¥\u0097\u0010¥ìpU\u000e9ÜÐël¹Üw²\u0002TÐôïB½0K\u0084\u0006{ÔÑâ¨±\\OÛ\u001au(Ýæ¼µ\"CÐ\u001ek,8ú\u0084\u0089sGÖ\u0015£ \u0015þÁ\u008dB[6i\u008a$jòÔ\u0080ª_\u0006\u0000g2\u0004d¶\u0097tÉáû\u0087.\u0012`Õ\u0093iÅ\u000f÷¬*B\\ï\u008e¢Á,óÅ&uX\u0012\u008a¦½fïæ!\u0099T%qPC3\u0015\u0081æ[¸Õ\u008a´_\u0014\u0011ââ|´?\u0086\u009e[t-Þÿ\u0099°\u0015\u0082ñWD)-û±Ìl\u009eÑP\u00ad%\u0014÷çÈG\u009a\u001bl\u009f!`wÐE³\u0013\u0001àÕ¾W\u008c\u0006Y\u0088\u0017`äÚDçv\u0084 6Óó\u008dh¿\u0004j¥$B×å\u0081\u008c³$nß\u0018XÊ\u0014\u0085¾·JbÕ\u001c\u009fÎ'ùÞð2ÂQ\u0094ãg29´\u000bÀÞv\u0090\u009cc95Y\u0007ñÚ\u001d¬ ~ð1t\u0003\u0096Ö!¨AzõM/\u001f¯ÑÓ¤wv\u0083I#\u001bOíê\u0000g2\u0004d¶\u0097gÉíû\u0096.2`Õ\u0093aÅ\u000b÷¿*_\\ã\u008e\u009fÁ\u0007óË\u0000g2\u0004d¶\u0097sÉèû\u0084.%`Â\u0093eÅ\f÷¤*_\\Ï\u008e\u0082Á óÛ&bX\u001e\u008a¾½_ïñ!\u0087\u0000g2\u0004d¶\u0097sÉöû\u0080.*`È\u0093iÅ\r÷¯*O\\È\u008e\u008cÁ:óÎ\u0000g2\u0004d¶\u0097sÉåû\u0097.'`Ê\u0093mÅ\u001d÷¯*Y\\ÿ\u0000R2$d\u0095\u0097bÉÖû¡.\u0003`ã\u000f÷=\u0091k(\u0098ØÆhô\b!¬oP\u009câÊ\u009eø5%Ù{ìI\u008a\u001f1ìÇ²m\u0080\tU§\u0093\u001f¡\u007f÷Ç\u0004-Z\u009chú½^ó¢\u0000\u0010Vyd×¹3Ï\u0087\u001dùR[".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1080);
        f27742 = cArr;
        f27743 = -3283540247841000863L;
    }

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ DependencyHolder m29012() {
        int i = 2 % 2;
        int i2 = f27745 + 97;
        f27744 = i2 % 128;
        int i3 = i2 % 2;
        DependencyHolder dependencyHolderM29014 = m29014();
        int i4 = f27745 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27744 = i4 % 128;
        int i5 = i4 % 2;
        return dependencyHolderM29014;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29017(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f27744 + 43;
        f27745 = i2 % 128;
        if (i2 % 2 == 0) {
            m29016(dependencyHolder);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM29016 = m29016(dependencyHolder);
        int i3 = f27745 + 19;
        f27744 = i3 % 128;
        int i4 = i3 % 2;
        return strM29016;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ JSONObject m29018(PreloadedVastData preloadedVastData) {
        int i = 2 % 2;
        int i2 = f27744 + 17;
        f27745 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM29030 = m29030(preloadedVastData);
        int i4 = f27745 + 71;
        f27744 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return jSONObjectM29030;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ PreloadedVastData m29019(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f27744 + 47;
        f27745 = i2 % 128;
        int i3 = i2 % 2;
        PreloadedVastData preloadedVastDataM29025 = m29025(dependencyHolder);
        int i4 = f27745 + 93;
        f27744 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return preloadedVastDataM29025;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29022(OfferCacheEntity offerCacheEntity) {
        int i = 2 % 2;
        int i2 = f27745 + 37;
        f27744 = i2 % 128;
        if (i2 % 2 != 0) {
            m29023(offerCacheEntity);
            throw null;
        }
        String strM29023 = m29023(offerCacheEntity);
        int i3 = f27745 + 31;
        f27744 = i3 % 128;
        int i4 = i3 % 2;
        return strM29023;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ PlacementController m29026(HyprMXController hyprMXController) {
        int i = 2 % 2;
        int i2 = f27744 + 21;
        f27745 = i2 % 128;
        int i3 = i2 % 2;
        PlacementController placementControllerM29015 = m29015(hyprMXController);
        int i4 = f27744 + 35;
        f27745 = i4 % 128;
        if (i4 % 2 != 0) {
            return placementControllerM29015;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ Object m29027(String str) {
        int i = 2 % 2;
        int i2 = f27744 + 111;
        f27745 = i2 % 128;
        if (i2 % 2 == 0) {
            m29013(str);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Object objM29013 = m29013(str);
        int i3 = f27745 + 61;
        f27744 = i3 % 128;
        int i4 = i3 % 2;
        return objM29013;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29028(Ad ad) {
        int i = 2 % 2;
        int i2 = f27745 + 1;
        f27744 = i2 % 128;
        int i3 = i2 % 2;
        String strM29021 = m29021(ad);
        int i4 = f27744 + 23;
        f27745 = i4 % 128;
        int i5 = i4 % 2;
        return strM29021;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ List m29029(WebTrafficObject webTrafficObject) {
        int i = 2 % 2;
        int i2 = f27745 + 41;
        f27744 = i2 % 128;
        int i3 = i2 % 2;
        List<WebTrafficObject.WebTrafficURL> listM29024 = m29024(webTrafficObject);
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return listM29024;
    }

    public C11849bn(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27745 + 85;
        f27744 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                String str = (String) BuildConfig.class.getDeclaredField(m29020((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11).intern()).get(null);
                int i4 = f27744 + 19;
                f27745 = i4 % 128;
                int i5 = i4 % 2;
                return str;
            } catch (Exception unused) {
                return C12019hv.m30362().m30363().m30451(BuildConfig.class, m29020((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, (char) (9210 - (ViewConfiguration.getLongPressTimeout() >> 16)), 12 - Color.red(0)).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x012d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0204  */
    /* JADX WARN: Code duplicated, block: B:76:0x039e  */
    /* JADX WARN: Code duplicated, block: B:79:0x03c7  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2118473762:
                b = !str.equals(m29020(25 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 6).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -2115661176:
                if (!str.equals(m29020(ImageFormat.getBitsPerPixel(0) + 509, (char) TextUtils.getCapsMode("", 0, 0), KeyEvent.getDeadChar(0, 0) + 30).intern())) {
                    b = -1;
                } else {
                    int i2 = f27744 + 71;
                    f27745 = i2 % 128;
                    b = i2 % 2 != 0 ? (byte) 17 : (byte) 3;
                }
                break;
            case -2082076211:
                if (!str.equals(m29020(ExpandableListView.getPackedPositionGroup(0L) + 763, (char) Gravity.getAbsoluteGravity(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.f22494GS).intern())) {
                    b = -1;
                } else {
                    int i3 = f27744 + 21;
                    f27745 = i3 % 128;
                    if (i3 % 2 != 0) {
                        b = 29;
                    } else {
                        b = Ascii.ESC;
                    }
                }
                break;
            case -2060981001:
                b = !str.equals(m29020(61 - View.resolveSizeAndState(0, 0, 0), (char) Gravity.getAbsoluteGravity(0, 0), Color.red(0) + 16).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1783324338:
                b = !str.equals(m29020((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 54 - TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1711062568:
                b = !str.equals(m29020(TextUtils.lastIndexOf("", '0', 0, 0) + 111, (char) KeyEvent.keyCodeFromString(""), 30 - TextUtils.indexOf((CharSequence) "", '0')).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -1632261541:
                if (!str.equals(m29020(661 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), MotionEvent.axisFromString("") + 14).intern())) {
                    b = -1;
                } else {
                    int i4 = f27745 + 45;
                    f27744 = i4 % 128;
                    if (i4 % 2 == 0) {
                        b = 24;
                    } else {
                        b = 13;
                    }
                }
                break;
            case -1625751435:
                b = !str.equals(m29020(395 - TextUtils.indexOf("", ""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 64 - ExpandableListView.getPackedPositionChild(0L)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1429076201:
                b = !str.equals(m29020(633 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 28).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case -1345825871:
                b = !str.equals(m29020(93 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26486), TextUtils.indexOf((CharSequence) "", '0', 0) + 17).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1289932600:
                if (!str.equals(m29020(554 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24405), (ViewConfiguration.getWindowTouchSlop() >> 8) + 16).intern())) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case -1102538544:
                if (!str.equals(m29020((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 717, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 26 - Color.alpha(0)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.ESC;
                }
                break;
            case -1056910325:
                b = !str.equals(m29020(140 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 9457), Drawable.resolveOpacity(0, 0) + 63).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -793729563:
                if (!str.equals(m29020(204 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 22 - View.resolveSize(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i5 = f27745 + 69;
                    f27744 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 9;
                }
                break;
            case -684201479:
                b = !str.equals(m29020(742 - Process.getGidForName(""), (char) (44741 - KeyEvent.keyCodeFromString("")), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19).intern()) ? (byte) -1 : Ascii.f22493FS;
                break;
            case -411143178:
                b = !str.equals(m29020(305 - KeyEvent.keyCodeFromString(""), (char) (24396 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Color.alpha(0) + 57).intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case -352824194:
                b = !str.equals(m29020(77 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8), 17 - View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -58290677:
                b = !str.equals(m29020((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 484, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31328), 23 - TextUtils.lastIndexOf("", '0', 0)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -52302939:
                b = !str.equals(m29020(KeyEvent.normalizeMetaState(0) + 812, (char) (22059 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 52).intern()) ? (byte) -1 : Ascii.f22502US;
                break;
            case -48720897:
                if (!str.equals(m29020(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.f22491EM, (char) (8537 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                    b = -1;
                } else {
                    int i7 = f27744 + 105;
                    f27745 = i7 % 128;
                    int i8 = i7 % 2;
                    b = Ascii.f22503VT;
                }
                break;
            case 2115:
                b = !str.equals(m29020((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 2 - View.getDefaultSize(0, 0)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 5206681:
                if (!str.equals(m29020(792 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (41321 - TextUtils.getOffsetBefore("", 0)), 21 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i9 = f27745 + 71;
                    f27744 = i9 % 128;
                    if (i9 % 2 == 0) {
                        b = 30;
                    } else {
                        b = 26;
                    }
                }
                break;
            case 99044255:
                if (!str.equals(m29020(45 - ExpandableListView.getPackedPositionChild(0L), (char) (994 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 13 - Color.blue(0)).intern())) {
                    b = -1;
                } else {
                    int i10 = f27744 + 63;
                    f27745 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 2;
                }
                break;
            case 217655834:
                b = !str.equals(m29020(30 - (ViewConfiguration.getScrollBarSize() >> 8), (char) Color.alpha(0), (ViewConfiguration.getTapTimeout() >> 16) + 16).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 748493318:
                b = !str.equals(m29020((ViewConfiguration.getScrollDefaultDelay() >> 16) + 674, (char) (TextUtils.lastIndexOf("", '0') + 1), 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 902272186:
                b = !str.equals(m29020(609 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (62685 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 24 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? (byte) -1 : Ascii.SYN;
                break;
            case 1056638846:
                if (!str.equals(m29020(362 - Color.alpha(0), (char) Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionType(0L) + 33).intern())) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case 1527993897:
                if (!str.equals(m29020(538 - Color.blue(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), View.resolveSize(0, 0) + 16).intern())) {
                    b = -1;
                } else {
                    int i12 = f27744 + 15;
                    f27745 = i12 % 128;
                    if (i12 % 2 != 0) {
                        b = Ascii.DC2;
                    } else {
                        b = 19;
                    }
                }
                break;
            case 1564846544:
                b = str.equals(m29020(460 - Color.red(0), (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 24).intern()) ? Ascii.f22499SI : (byte) -1;
                break;
            case 1575934042:
                if (!str.equals(m29020((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 693, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i13 = f27744 + 75;
                    f27745 = i13 % 128;
                    if (i13 % 2 != 0) {
                        b = 26;
                    } else {
                        b = 72;
                    }
                }
                break;
            case 1775126662:
                b = !str.equals(m29020(570 - Color.alpha(0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.green(0) + 13).intern()) ? (byte) -1 : Ascii.DC4;
                break;
            case 1872662391:
                b = !str.equals(m29020((ViewConfiguration.getTapTimeout() >> 16) + 583, (char) (36629 - (KeyEvent.getMaxKeyCode() >> 16)), 25 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 21;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return HyprMX.class;
            case 1:
                int i14 = f27745 + 75;
                f27744 = i14 % 128;
                int i15 = i14 % 2;
                return HyprMXController.class;
            case 2:
                return PlacementType.class;
            case 3:
                return Ad.class;
            case 4:
                return DependencyHolder.class;
            case 5:
                return PreloadedVastData.class;
            case 6:
                return HyprMXProperties.class;
            case 7:
            case 8:
                return HyprMXWebViewWithClosableNavBar.class;
            case 9:
            case 10:
                return HyprMXNoOffersActivity.class;
            case 11:
            case 12:
                return HyprMXOfferViewerActivity.class;
            case 13:
            case 14:
                return HyprMXRequiredInformationActivity.class;
            case 15:
                return HyprMXBaseViewController.class;
            case 16:
                return HyprMXVastViewController.class;
            case 17:
                return HyprMXWebTrafficViewController.class;
            case 18:
                return OfferCacheEntity.class;
            case 19:
                return WebTrafficObject.class;
            case 20:
                return WebTrafficObject.WebTrafficURL.class;
            case 21:
                return HyprMXLearnMoreController.class;
            case 22:
                return HyprMXMraidViewController.class;
            case 23:
                return HyprMXOfferWebViewController.class;
            case 24:
                return HyprMXWebView.class;
            case 25:
                return HyprMXWebViewClient.class;
            case 26:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return HyprMXSkipController.class;
            case 29:
                return HyprMXSkipController.Listener.class;
            case 30:
            case 31:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29020((ViewConfiguration.getKeyRepeatDelay() >> 16) + 864, (char) ((-1) - Process.getGidForName("")), TextUtils.getCapsMode("", 0, 0) + 23).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11849bn.m29029((WebTrafficObject) list.get(0));
            }
        });
        map.put(m29020(886 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (28983 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 28).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11849bn.m29022((OfferCacheEntity) list.get(0));
            }
        });
        map.put(m29020(View.resolveSize(0, 0) + 915, (char) (30647 - TextUtils.getCapsMode("", 0, 0)), 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11849bn.m29028((Ad) list.get(0));
            }
        });
        map.put(m29020(924 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 17536), View.MeasureSpec.getMode(0) + 20).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11849bn.m29027((String) list.get(0));
            }
        });
        map.put(m29020(944 - ExpandableListView.getPackedPositionType(0L), (char) (61525 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 26 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11849bn.m29012();
            }
        });
        map.put(m29020((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 970, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11849bn.m29017((DependencyHolder) list.get(0));
            }
        });
        map.put(m29020(987 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), 21 - TextUtils.indexOf((CharSequence) "", '0')).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11849bn.m29026((HyprMXController) list.get(0));
            }
        });
        map.put(m29020((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1009, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11849bn.m29019((DependencyHolder) list.get(0));
            }
        });
        map.put(m29020(1025 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (Process.myPid() >> 22), View.getDefaultSize(0, 0) + 13).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11849bn.m29018((PreloadedVastData) list.get(0));
            }
        });
        int i2 = f27745 + 51;
        f27744 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static List<WebTrafficObject.WebTrafficURL> m29024(WebTrafficObject webTrafficObject) {
        int i = 2 % 2;
        int i2 = f27745 + 57;
        f27744 = i2 % 128;
        int i3 = i2 % 2;
        List<WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        int i4 = f27744 + 115;
        f27745 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29023(OfferCacheEntity offerCacheEntity) {
        int i = 2 % 2;
        int i2 = f27745 + 63;
        f27744 = i2 % 128;
        int i3 = i2 % 2;
        String str = offerCacheEntity.clickThroughUrl;
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f27744 + 87;
        f27745 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static PreloadedVastData m29025(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f27744 + 101;
        f27745 = i2 % 128;
        int i3 = i2 % 2;
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        int i4 = f27744 + 23;
        f27745 = i4 % 128;
        if (i4 % 2 != 0) {
            return preloadedData;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static JSONObject m29030(PreloadedVastData preloadedVastData) {
        int i = 2 % 2;
        int i2 = f27745 + 3;
        f27744 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject parameters = preloadedVastData.getParameters();
        int i4 = f27744 + 63;
        f27745 = i4 % 128;
        int i5 = i4 % 2;
        return parameters;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29021(Ad ad) {
        int i = 2 % 2;
        int i2 = f27744 + 107;
        f27745 = i2 % 128;
        int i3 = i2 % 2;
        String str = ad.type;
        int i4 = f27745 + 9;
        f27744 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﮐ */
    private static Object m29013(String str) {
        int i = 2 % 2;
        byte b = -1;
        switch (str.hashCode()) {
            case -1617199657:
                if (str.equals(m29020(1057 - TextUtils.lastIndexOf("", '0'), (char) (MotionEvent.axisFromString("") + 31654), 7 - Color.blue(0)).intern())) {
                    b = 2;
                }
                break;
            case -1372958932:
                if (str.equals(m29020(1046 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (4029 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 12 - View.MeasureSpec.getSize(0)).intern())) {
                    int i2 = f27745 + 55;
                    f27744 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 1;
                }
                break;
            case -65580248:
                if (str.equals(m29020(ExpandableListView.getPackedPositionType(0L) + 1065, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37713), 15 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    b = 3;
                }
                break;
            case 543046670:
                if (!(!str.equals(m29020((ViewConfiguration.getScrollBarSize() >> 8) + IronSourceError.ERROR_RV_SHOW_EXCEPTION, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 8 - KeyEvent.keyCodeFromString("")).intern()))) {
                    b = 0;
                }
                break;
        }
        if (b == 0) {
            return PlacementType.REWARDED;
        }
        Object obj = null;
        if (b != 1) {
            if (b == 2) {
                return PlacementType.INVALID;
            }
            if (b != 3) {
                return null;
            }
            return PlacementType.NOT_INITIALIZED;
        }
        PlacementType placementType = PlacementType.INTERSTITIAL;
        int i4 = f27745 + 45;
        f27744 = i4 % 128;
        if (i4 % 2 == 0) {
            return placementType;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static DependencyHolder m29014() {
        int i = 2 % 2;
        int i2 = f27744 + 33;
        f27745 = i2 % 128;
        int i3 = i2 % 2;
        DependencyHolder dependencyHolder = DependencyHolder.INSTANCE;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return dependencyHolder;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29016(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f27745 + 27;
        f27744 = i2 % 128;
        int i3 = i2 % 2;
        String distributorId = dependencyHolder.getDistributorId();
        int i4 = f27745 + 95;
        f27744 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return distributorId;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static PlacementController m29015(HyprMXController hyprMXController) {
        int i = 2 % 2;
        int i2 = f27745 + 11;
        f27744 = i2 % 128;
        if (i2 % 2 != 0) {
            hyprMXController.getPlacementController();
            throw null;
        }
        PlacementController placementController = hyprMXController.getPlacementController();
        int i3 = f27744 + 63;
        f27745 = i3 % 128;
        if (i3 % 2 != 0) {
            return placementController;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29020(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f27742[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f27743)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
