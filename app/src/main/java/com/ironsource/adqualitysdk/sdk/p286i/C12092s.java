package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.ironsource.C11341A5;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s */
/* JADX INFO: loaded from: classes6.dex */
public class C12092s extends IronSourceAdQuality {

    /* JADX INFO: renamed from: リ */
    private static int f29846 = 0;

    /* JADX INFO: renamed from: ヶ */
    private static int f29847 = 1;

    /* JADX INFO: renamed from: 丫 */
    private static char[] f29848;

    /* JADX INFO: renamed from: 乁 */
    private static long f29849;

    /* JADX INFO: renamed from: ﻛ */
    private static C12092s f29850;

    /* JADX INFO: renamed from: 爫 */
    private C12050iz f29851;

    /* JADX INFO: renamed from: ﬤ */
    private C11818aj f29852;

    /* JADX INFO: renamed from: טּ */
    private C12056je f29853;

    /* JADX INFO: renamed from: סּ */
    private C11820al f29854;

    /* JADX INFO: renamed from: ﭖ */
    private ISAdQualityAdListener f29856;

    /* JADX INFO: renamed from: ﭴ */
    private C11831aw f29857;

    /* JADX INFO: renamed from: ﮉ */
    private C11814af f29859;

    /* JADX INFO: renamed from: ﮌ */
    private C12049iy f29860;

    /* JADX INFO: renamed from: ﺙ */
    private Context f29864;

    /* JADX INFO: renamed from: ﾒ */
    private ISAdQualityConfig f29869;

    /* JADX INFO: renamed from: ﾇ */
    private final C11827as f29868 = new C11827as();

    /* JADX INFO: renamed from: ﻐ */
    private boolean f29866 = false;

    /* JADX INFO: renamed from: ｋ */
    private boolean f29867 = false;

    /* JADX INFO: renamed from: ﱟ */
    private boolean f29862 = false;

    /* JADX INFO: renamed from: ﻏ */
    private boolean f29865 = false;

    /* JADX INFO: renamed from: ﮐ */
    private boolean f29861 = false;

    /* JADX INFO: renamed from: ﱡ */
    private ISAdQualityLogLevel f29863 = ISAdQualityLogLevel.INFO;

    /* JADX INFO: renamed from: ףּ */
    private final Set<ISAdQualityInitListener> f29855 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ﭸ */
    private final C11822an f29858 = new C11822an();

    /* JADX INFO: renamed from: ﱡ */
    static void m30957() {
        char[] cArr = new char[1654];
        ByteBuffer.wrap("\u0000I»Àwg2Ýî\u001d©ªe\u0013!iÜñ\u0098_SÇ\u000f\u0002Ê \u0086<B$ýô¹^tª0\"ë\u0080§\u001dcc\u001eËÚO\u0095\u00adQ{\f\u008dÈî\u0084z?Óû_¶µr\u0014-Óéç¥k`Ë\u001c\u001f×¿\u0093\u0010N\u008b\nÿÆ>\u0081Ó=!ø÷´\u0005o\u009b+°çW¢Ï^9\u0019¹ÕO\u0091CLö\b\\ÃÒ\u007f8:\u0088ö\u0000²~mµ)lä° #[\u008a\u0017\u0010Óo\u008eþJF\u0005¬Á7|\u0085\u0000A»÷ww2Ìî-©³e\u001b!qÜá\u0098xSú\u000f\u001a\u0000C»òwH2\u009eî8©ÿe\u001b!kÜñ\u0098_S×\u000f0Ê\u0088\u0086\u001eBpýø¹\u0010tî0vë§§\u0013c/\u001eÃÚQ\u0095èQ5\f\u008bÈõ\u0084c?ÈûH¶¦r\u0013-ÓéÕ¥]`ç\u001cL×ò\u0093\u0015N\u008a\nîÆm\u0081Ô=*ø£´Jo\u0094+þç\u0003¢Â^!\u0019¹ÕO\u0091cLå\bX\u0000I»Àwg2Ýî\u001d©ªe\u0013!iÜñ\u0098_SÇ\u000f\u0002Ê \u0086<B$ýô¹^tª0\"ë\u0080§\u001dcc\u001eËÚO\u0095\u00adQ{\f\u008fÈí\u0084f?Âû[¶©r\u0019-Óéå¥x`À\u001cS×·\u0093\u0001zÌÁE\râHX\u0094\u0098Ó/\u001f\u0096[ì¦tâÚ)Buô°2ü¶8Ä\u00878ÃÜ\u000e(Jº\u0091\u0018Ý\u0090\u0019ëdK Ùï7+»vK²iþôEV\u0081×Ì'\b\u0081WV\u0093`ßý\u001aGf\u009a\u00ad5é\u00854]pk¼ãûQG¢\u0082'Î\u009b\u0015\u001dQq\u009d\u0086Ø\\$¢c5¯\u0093ë§6\u007frÃ¹]\u0005®A»ú\n6°sf¯Àè\u0007$ã`\u0093\u009d\tÙ§\u0012/NÈ\u008bpÇæ\u0003\u0088¼\u0000øè5\u0016q\u008eªXæ×\"¶_>\u009b\u009cÔE\u0010ÂMz\u0089\u0010Å\u0098~&ºâ÷f3Ül@¨^ä\u0096!5]´\u0096\nÒî\u000fhK\u0006\u0087\u0092À-|Ó¹Xõü.+ÕpnÁ¢{ç\u00ad;\u000b|Ì°(ôX\tÂMl\u0086äÚ\u0003\u001f»S-\u0097C(Ël#¡¹å6>\u009br+¶mËä\u000fg@\u0097\u0084\u0001Ù©\u001dËQ\u0007êÇ.Mcµ§sø·<Üp^µ÷É,\u0002\u008fF#\u009b§ßÔ\u0013\rTíè\u0005-Äa<º£þÓ2dwü\u008bZÌ\u009a\u0000/DT\u0099ÔÝ;\u0016áª\u0019ïüù\u008dB<\u008e\u0086ËP\u0017öP1\u009cÕØ¥%?a\u0091ª\u0019öþ3F\u007fÐ»¾\u00046@Þ\u008d É¸\u0012F^Â\u009a±ç'#\u009el\u007f¨µõC1.}´ÆN\u0002\u0080O#\u008bÌÔX\u0010h\\¹\u0099\u0017å\u009d.pj\u008b·Yó7?ðx\u001aÄç\u0001iMÐ\u0096JÒp\u0000I»Àwg2Ýî\u001d©ªe\u0013!iÜñ\u0098_SÇ\u000f\u0002Ê \u0086<B*ýê¹Qt°0vë\u0088§\u0010c}\u001eÇÚT\u0095¬Q\"\fÎÈò\u0084|?ÒûN¶©r\u000f-\u0084éè¥7Õ´n=¢\u009aç ;à|W°îô\u0094\t\fM¢\u0086:Úÿ\u001f]SÁ\u0097×(\u0017l¬¡Må\u008b>zrä¶\u0084Ë:\u000fº@\u0015\u0084ÏÙ}\u001d\u0015Q\u009dê3.¦c\\§ôøt<\u001ep\u0080µqÉï\u0002\u000fFö\u009bjßV\u0013\u008dT)èÜ-Na·ºtþ\u00022þw8\u008bÜÌT\u0000æD\u009b\u0099\u0007Ý¢\u0016(ª\u009d\u0000I»Àwg2Ýî\u001d©ªe\u0013!iÜñ\u0098_SÇ\u000fqÊ·\u00863BAý½¹Gt¢0%ëÉ§\u000fcg\u001e×ÚA\u0095¬Q4\f\u0099Èï£ì\u00189Ô\u0098\u0091\u001aMí\n3Æÿ\u0082\u00ad\u007f\u0005;\u0092ð\u0013¬ñiA%Ïá¿^q\u001a\u008c×c\u0093ûHQ\u0004ÖÀ¬½\u001cy\u0094\u0000s»öwT2Ïî)©\u00adòuIñ\u0085KGÄ\u0000t»ãwy2Íî?\u0000s»üwI2Ôî ©¾9L\u0082\u0088N#\u000b¡×H\u0090\u0093\\l\u0018\få\u0095¡4j½6Só²¿;B9ù\u009d5(pª¬Bë\u0083'}c\u0011\u009e\u0091Ú#\u0011¶MD\u0088öÄl\u0000V¿\u0085û#6ÈrD\u0000E»áwT2Öî>©ÿe\u0001!`Üì\u0098_S×\u000f?Ê\u0083\u0086WB\u007fýî¹Ut±0\u001fë\u008d§\\\u0000C»òwH2\u009eî8©ÿe\u0011!mÜù\u0098ESÙ\u000f4ÊÄ\u0086\u0002Byýø¹Btã0?ë\u008d§\\c\"\u001e\u0082Ú|\u0095\u009bQ\u001a\f\u008aÈÐ\u0084a?ÆûV¶¤r\u0014-\u008aé¦¥J`è\u001ct×ò\u0093\u0012N\u0099\nøÆ>\u0081Â=,ø¢´\u001eo\u0099+ÿçT¢Ø^g\u0000Y»üwS2\u0099î!©ªe\u0001!qÜ¸\u0098BSÐ\u000f8Ê\u0090\u0086\u001eBkýñ¹Yt¹03ëÉ§5c\\\u001eãÚQ\u0095\u0099Q.\f\u008fÈí\u0084}?ÓûC¶ír3-·éÍ¥9`Î\u001cZ×´\u0093\nN\u008a\nîÆ>\u0081Ò=%ø»´\u0006o\u0094+þçD¢\u0096^n\u0019¿Õ\u0007\u0091cLû\bOÃÞ\u007f\u001b:\u0092ö\u0011²umÓ)Iäç¤t\u001fÌÓk\u0096£J\u0003\r\u0096Á-\u0085Mx\u0082<x÷à«Kn½\",æ^Y\u0080\u001d~ÐÙ\u0094\u000eO¶\u0003fÇ[ºí~c1\u009eõA¨»lÉ \u000e\u009bø_m\u0012\u0087Ö.\u0089°ü·G3\u008b\u0086Î\u0004\u0012ìU\f\u0099 Ý\u0082 \u0019d¼¯>ó\u00836_zÁ¾Ø\u0001\u0006E±\u0088\u0011ÌÊ\u0017n[â\u009f\u0091â~&çij\u00adÅðy4\u0012x\u0095Ã0\u0007èJR\u008eóÑj\u0015\u0011YË\u009c-à¸+Roò²*ö\r:\u0083}cÁÆ\u0004DHë\u0093|×B\u001b°^d¢ÍåO)ñm\u0099°\u0003ôú?'\u0083ÓÆ}\n«N\u009b\u0091\u001dÕ³\u0018^\\\u0081§aëø/\u009br\u001f¶àù~=î\u00809Äø\b\u008cSv\u0097\u008cÚk\u001eîaf¥ é\u0091,:p¢»TÿäB~\u0086ZÊº\r\u0018Qø\u0094\b\u0000a»ýw_2Íî$©¶e\u001c!bÜµ\u0098RSÑ\u000f$ÊÉ\u0086\u0000Bkýó¹D\u0085ê>nòÛ·Yk±,Qàý¤óYX\u001dñÖ6\u008a\u008cO.\u0003øÇÐxA<öñ\u0002µ\u009enf\"§æÈ\u009bh_º\u0010\u0003Ô\u0091\u0089'MO\u0001Îºd~á3B÷º¨/lL Äå#\u0099ÙR9\u0016ê\u0000.»³wv2Õî)©¾e\u0001!`Ü¸\u0098FSß\u000f:Ê\u0081\u0086WByýè¹Bt¦0vë\u009d§\u0013c/\u001eÒÚT\u0095»Q(\fÎÈà\u00844?ÒûT¶¤r\u0011-\u0086éã¥9`Ù\u001cL×·\u0093\u0017NØ\nÂÆZ\u0081\u0091=\"ø¸´\u0018oÝ+õçB¢Õ^!\u0019üÕ\u001a\u0091qLð\bZÃ\u009b\u007f::\u008eöT²NmÉ)lä¤ \u0002[\u0093\u0017\u0018Ó`\u008eöJF\u0005¼Áx|¸8:ôZ¯\u008a\tø²]~ò;jçÍ 7l\u0080(åÕ]\u0091ÛZj\u0006\u0091Ã)\u008f¿KßôE°±}19³â\u0003®ýjÛ\u0017pÓñ\u009c\u001bXÚ\u0005\u0006Ád\u008d\u00956oòè¿V{á\u0000a»÷wW2æî%©±e\u001b!qÜÇ\u0098ISÒ\u000f>Ê\u0086\u0000i»ýwR2\u0097î?©ºe\u0001!vÜÑ\u0098O\u0000t»áwG2Úî)©½e\u0013!fÜó\u0098\u0005SÕ\u000f'ÊÊ\u0086\u0013Bhý³¹Qt\u00ad07ë\u0085§\u0005c{\u001eËÚV\u0095»\u008b´0;ü\u008e¹\u0013eç\"yî\u0098ª±W:\u0013\u008fØ\u000b\u0084óAW\r\u009dÉùv;2\u0099ÿe»ý`W,Ïè¡\u0095\u0006Q\u00812\u0090\u0089!E\u009b\u0000MÜë\u009b,WÒ\u0013³î?ªØa\u0004=ìøC´Áp«Ï \u008b\u0082F|\u0002¥ÙN\u0095ÊQ¯,\u0005èÆ§vcç>Yú7¶ç\rYÉÉ\u0084W@à\u001faÛ1\u0097\u009bR\n.\u008dåm¡ß|_8!ôí³1\u000fÓÊO\u0086\u0099]Y\u0019\"Õ\u0083\u0090Elé+gçÉ£¥~\":\u0094ñ\u001fMó\b\u001c\u0000M»æwU2Íîl©¬e\u0017!qÜ¸\u0098BSÐ\u000f%Ê\u0081\u0086\u0005Bdýü¹\\tã0\"ë\u008c§\u000fc{\u001e\u0082ÚX\u0095§Q?\f\u008bÈ¡\u0084v?Âû\\¶¢r\u0012-\u0096é¦¥p`Â\u001cV×¦\u0093\fN\u0099\nçÆw\u0081Ë=-ø¹´\roÜuæÎz\u0002ÅGL\u009b¤Ü1\u0010\u0091T¬©víÂ&Mz³¿\ró\u00847£\u0088{ÌÔ\u00010E¸\u009e\u0001Ò\u0095\u0016¦kg¯óà\u001b$\u0088y,½TñÊJ\u007f\u008eþÃ\u0002\u0007¦X:\u009cFÐÛ\u0015o\u0000F»òwO2Õî)©»eR!qÜ÷\u0098\u000bSÌ\u000f4Ê\u0083\u0086\u001eByýé¹Ut±0vë\u008b§\u001dc{\u001eÖÚP\u0095ºQ\"\fÎÈó\u0084q?Äû_¶¤r\u0016-\u0096éô\u0000C»òwH2\u009eî8©ÿe\u0001!`Üì\u0098\u000bSß\u000f5ÊÄ\u0086\u001bBcýî¹Dt¦08ë\u008c§\u000ec/\u001e\u008fÚ\u0015\u0095\u0081Q\b\f¯Èå\u0084E?Òû[¶¡r\t-\u0087éÿ¥9`ÿ\u001c{×\u0099\u0093EN\u008f\nêÆm\u0081\u0091=7ø¿´\u001fo\u0089+ôçL¢Á^'\u0019ò¸&\u0003\u0097Ï-\u008aûV]\u0011\u009aÝd\u0099\u0005d\u0093 *ëû·Wrô>aú\u001bE\u0097\u00018Ì\u0086\u0088^Sé\u001f}Û\u0003¦¦b$-ÄéQ´åpÄ<\u0003\u0087§C)\u000eÍÊk\u0095ãQ\u0086\u001d\\Øä¤zoþ+SöÜ²\u008a~*9¡\u0085@@Þ\ff×ì\u0093\u008c_f\u001a\u0080æh¡òm*)\u0010ô\u0091°>{þÇX\u0082ìNd\n\u0016Õ\u009b\u0091'\\Ò\u0018Xã\u00ad\u0000C»òwH2\u009eî8©ÿe\u0001!`Üö\u0098OS\u009e\u000f2Ê\u0091\u0086\u0004B~ýò¹]tã0;ë\u008c§\u0018cf\u001eÃÚA\u0095¡Q4\f\u0080È¡\u0084f?ÂûL¶¨r\u000e-\u0086éã¥9`\u0081\u001c\u001f×\u009b\u00936N¹\nïÆO\u0081Ä=%ø»´\u0003o\u0089+éç\u0003¢å^\r\u0019\u0097ÕO\u0091kLæ\b\bÃÕ\u007f!:\u0095öT²nmô)Dä´ :[\u0087\u0017\u0015Óe\u008eåJW\u0005¡Áv\u0000C»òwH2\u009eî8©ÿe\u0001!`Üì\u0098\u000bSÍ\u000f4Ê\u0083\u0086\u001aBoýó¹Dtã0{ëÉ§5c\\\u001eãÚQ\u0095\u0099Q.\f\u008fÈí\u0084}?ÓûC¶ír3-·éÍ¥9`Û\u001c^×¡\u0093EN\u008b\nãÆk\u0081Å= ø¸´\u001do\u0093+¾Õ°n\u0001¢»çm;Ë|\f°òô\u0093\t\u001fMø\u0086.ÚÍ\u001fySâ\u0097\u0090(\tlã¡\u001då\u0085>SrÜ¶½Ë5\u000f\u0097@N\u0084ÉÙq\u001d\u001bQ\u0093ê-.écm§×øK<Up\u009dµ>É¿\u0002\u0001Få\u009bcß\r\u0013\u0099T&èØ-Sa÷º 5e\u008eÔBn\u0007¸Û\u001e\u009cÙP'\u0014FéÊ\u00ad-fû:\u0018ÿ¬³7wEÈÜ\u008c6AÈ\u0005PÞ\u0086\u0092\tVh+àïB \u009bd\u001c9¤ýÎ±F\nøÎ<\u0083¸G\u0002\u0018\u009eÜ\u0080\u0090VUù)9â\u0095¦/{¬?ÈóY´ó\b\u001bÍÑ\u0081%Zµ\u001eßÒq\u0097ùk\u000e,\u0096à ¤^yÖ=jö³Ç\u0005|\u0098°$õº)RnÖ¢Aæ\u0019\u001b\u0086_\"\u0094\u008dÈT\ræAr\u0085\u0012:®~?³À÷T,ã`y¤\u0004".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1654);
        f29848 = cArr;
        f29849 = -4907456382200464493L;
    }

    /* JADX INFO: renamed from: טּ */
    static /* synthetic */ C11818aj m30944(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29846 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        int i3 = i2 % 128;
        f29847 = i3;
        int i4 = i2 % 2;
        C11818aj c11818aj = c12092s.f29852;
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        int i6 = i3 + 1;
        f29846 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 17 / 0;
        }
        return c11818aj;
    }

    /* JADX INFO: renamed from: סּ */
    static /* synthetic */ Set m30945(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29846 + 89;
        int i3 = i2 % 128;
        f29847 = i3;
        int i4 = i2 % 2;
        Set<ISAdQualityInitListener> set = c12092s.f29855;
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        int i6 = i3 + 85;
        f29846 = i6 % 128;
        if (i6 % 2 == 0) {
            return set;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ */
    static /* synthetic */ C12056je m30946(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29846 + 55;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        C12056je c12056je = c12092s.f29853;
        if (i3 != 0) {
            return c12056je;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ */
    static /* synthetic */ boolean m30949(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29846 + 97;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM30948 = c12092s.m30948();
        int i4 = f29846 + 99;
        f29847 = i4 % 128;
        int i5 = i4 % 2;
        return zM30948;
    }

    /* JADX INFO: renamed from: ﭸ */
    static /* synthetic */ void m30950(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29846 + 105;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.m30975(true);
        int i4 = f29847 + 93;
        f29846 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﮉ */
    static /* synthetic */ ISAdQualityAdListener m30951(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29847 + 115;
        int i3 = i2 % 128;
        f29846 = i3;
        int i4 = i2 % 2;
        ISAdQualityAdListener iSAdQualityAdListener = c12092s.f29856;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 51;
        f29847 = i5 % 128;
        if (i5 % 2 != 0) {
            return iSAdQualityAdListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ */
    static /* synthetic */ void m30953(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29847 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.m30967(false);
        int i4 = f29846 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29847 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ Context m30954(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29847 + 31;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        Context context = c12092s.f29864;
        if (i3 == 0) {
            return context;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    static /* synthetic */ C12050iz m30956(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29847 + 5;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        C12050iz c12050iz = c12092s.f29851;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return c12050iz;
    }

    /* JADX INFO: renamed from: ﱡ */
    static /* synthetic */ void m30958(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29846 + 69;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.m30952();
        int i4 = f29846 + 95;
        f29847 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ C11831aw m30960(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29846;
        int i3 = i2 + 13;
        f29847 = i3 % 128;
        int i4 = i3 % 2;
        C11831aw c11831aw = c12092s.f29857;
        int i5 = i2 + 81;
        f29847 = i5 % 128;
        int i6 = i5 % 2;
        return c11831aw;
    }

    /* JADX INFO: renamed from: ﻏ */
    static /* synthetic */ C11814af m30961(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29847;
        int i3 = i2 + 107;
        f29846 = i3 % 128;
        int i4 = i3 % 2;
        C11814af c11814af = c12092s.f29859;
        if (i4 != 0) {
            int i5 = 60 / 0;
        }
        int i6 = i2 + 97;
        f29846 = i6 % 128;
        int i7 = i6 % 2;
        return c11814af;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ C11814af m30963(C12092s c12092s, C11814af c11814af) {
        int i = 2 % 2;
        int i2 = f29846;
        int i3 = i2 + 69;
        f29847 = i3 % 128;
        int i4 = i3 % 2;
        c12092s.f29859 = c11814af;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 93;
        f29847 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return c11814af;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ C12050iz m30964(C12092s c12092s, C12050iz c12050iz) {
        int i = 2 % 2;
        int i2 = f29847 + 63;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.f29851 = c12050iz;
        if (i3 == 0) {
            return c12050iz;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m30965(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29847 + 43;
        f29846 = i2 % 128;
        c12092s.m30998(i2 % 2 == 0);
        int i3 = f29847 + 95;
        f29846 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ Context m30968(C12092s c12092s, Context context) {
        int i = 2 % 2;
        int i2 = f29847;
        int i3 = i2 + 79;
        f29846 = i3 % 128;
        int i4 = i3 % 2;
        c12092s.f29864 = context;
        int i5 = i2 + 75;
        f29846 = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ C11818aj m30969(C12092s c12092s, C11818aj c11818aj) {
        int i = 2 % 2;
        int i2 = f29846 + 35;
        int i3 = i2 % 128;
        f29847 = i3;
        int i4 = i2 % 2;
        c12092s.f29852 = c11818aj;
        int i5 = i3 + 21;
        f29846 = i5 % 128;
        if (i5 % 2 == 0) {
            return c11818aj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ C11827as m30970(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29846 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        C11827as c11827asM30959 = c12092s.m30959();
        int i4 = f29847 + 73;
        f29846 = i4 % 128;
        if (i4 % 2 == 0) {
            return c11827asM30959;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m30973(C12092s c12092s, Context context, String str) {
        int i = 2 % 2;
        int i2 = f29847 + 5;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.m30989(context, str, true, false, true);
        int i4 = f29846 + 19;
        f29847 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m30974(C12092s c12092s, boolean z) {
        int i = 2 % 2;
        int i2 = f29846 + 23;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.m30981(z);
        int i4 = f29847 + 65;
        f29846 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ C12056je m30976(C12092s c12092s, C12056je c12056je) {
        int i = 2 % 2;
        int i2 = f29846 + 113;
        int i3 = i2 % 128;
        f29847 = i3;
        int i4 = i2 % 2;
        c12092s.f29853 = c12056je;
        if (i4 == 0) {
            int i5 = 61 / 0;
        }
        int i6 = i3 + 65;
        f29846 = i6 % 128;
        int i7 = i6 % 2;
        return c12056je;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m30979(C12092s c12092s, Context context) {
        int i = 2 % 2;
        int i2 = f29846 + 95;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.m30988(context);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = f29847 + 75;
        f29846 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m30980(C12092s c12092s, ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = 2 % 2;
        int i2 = f29847 + 49;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.m30978(iSAdQualityLogLevel);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ boolean m30983(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29847 + 11;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM30962 = c12092s.m30962();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return zM30962;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ C11820al m30984(C12092s c12092s, C11820al c11820al) {
        int i = 2 % 2;
        int i2 = f29846 + 107;
        int i3 = i2 % 128;
        f29847 = i3;
        int i4 = i2 % 2;
        c12092s.f29854 = c11820al;
        int i5 = i3 + 73;
        f29846 = i5 % 128;
        if (i5 % 2 == 0) {
            return c11820al;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ C12049iy m30985(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29847 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i3 = i2 % 128;
        f29846 = i3;
        int i4 = i2 % 2;
        C12049iy c12049iy = c12092s.f29860;
        int i5 = i3 + 61;
        f29847 = i5 % 128;
        if (i5 % 2 != 0) {
            return c12049iy;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ C12049iy m30986(C12092s c12092s, C12049iy c12049iy) {
        int i = 2 % 2;
        int i2 = f29847;
        int i3 = i2 + 47;
        f29846 = i3 % 128;
        int i4 = i3 % 2;
        c12092s.f29860 = c12049iy;
        int i5 = i2 + 75;
        f29846 = i5 % 128;
        if (i5 % 2 == 0) {
            return c12049iy;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m30990(C12092s c12092s, ISAdQualityInitError iSAdQualityInitError, String str) {
        int i = 2 % 2;
        int i2 = f29847 + 83;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.m30996(iSAdQualityInitError, str);
        int i4 = f29847 + 59;
        f29846 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ C11822an m30992(C12092s c12092s) {
        int i = 2 % 2;
        int i2 = f29846;
        int i3 = i2 + 29;
        f29847 = i3 % 128;
        int i4 = i3 % 2;
        C11822an c11822an = c12092s.f29858;
        int i5 = i2 + 71;
        f29847 = i5 % 128;
        int i6 = i5 % 2;
        return c11822an;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ C11831aw m30993(C12092s c12092s, C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f29847 + 15;
        int i3 = i2 % 128;
        f29846 = i3;
        int i4 = i2 % 2;
        c12092s.f29857 = c11831aw;
        if (i4 != 0) {
            int i5 = 75 / 0;
        }
        int i6 = i3 + 107;
        f29847 = i6 % 128;
        if (i6 % 2 != 0) {
            return c11831aw;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m30997(C12092s c12092s, Context context) {
        int i = 2 % 2;
        int i2 = f29846 + 3;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        c12092s.m30972(context);
        int i4 = f29847 + 3;
        f29846 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        m30957();
        Object obj = null;
        f29850 = null;
        int i = f29846 + 95;
        f29847 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static C12092s m30994() {
        synchronized (C12092s.class) {
            if (f29850 == null) {
                f29850 = new C12092s();
            }
        }
        return f29850;
    }

    private C12092s() {
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) {
        int i = 2 % 2;
        int i2 = f29846 + 111;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        initialize(context, str, null);
        int i4 = f29847 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29846 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        if (!(context instanceof Application)) {
            if (context != null && (context.getApplicationContext() instanceof Application)) {
                int i2 = f29846 + 103;
                f29847 = i2 % 128;
                if (i2 % 2 != 0) {
                    m30971((Application) context.getApplicationContext(), str, iSAdQualityConfig);
                    return;
                } else {
                    m30971((Application) context.getApplicationContext(), str, iSAdQualityConfig);
                    throw null;
                }
            }
            if (context instanceof Activity) {
                m30977((Activity) context, str, iSAdQualityConfig);
                return;
            }
            String strIntern = m30987((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 74, 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern();
            C12085l.m30912(m30987((char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 12, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 74).intern(), strIntern);
            m30966(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
            return;
        }
        int i3 = f29846 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29847 = i3 % 128;
        if (i3 % 2 != 0) {
            m30971((Application) context, str, iSAdQualityConfig);
        } else {
            m30971((Application) context, str, iSAdQualityConfig);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m30971(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f29847 + 21;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m30995(application, null, str, iSAdQualityConfig);
        int i4 = f29847 + 9;
        f29846 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m30977(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f29846 + 77;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        m30995(activity.getApplication(), activity, str, iSAdQualityConfig);
        int i4 = f29847 + 93;
        f29846 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1, reason: invalid class name */
    final class AnonymousClass1 extends AbstractRunnableC12044it {

        /* JADX INFO: renamed from: ﮐ */
        private static char[] f29870 = {'A', 'd', 'Q', AbstractJsonLexerKt.UNICODE_ESC, 'a', 'l', 'i', 't', 'y', 'S', 'D', 'K', 'I', 'n', 'z', 'g', ' ', 'w', 'h', 'p', 'k', 'e', 'W', 'R', 'N', 'G', '!', 'o', 'v', 's', 'M', C11341A5.f23808U, 'r', 'E', 'b', 'c', '.', 'T', 'f', AbstractJsonLexerKt.COLON, 'B', 'C', 'F', 'H', 'J', 'L', 'O', 'P', 'U'};

        /* JADX INFO: renamed from: ﱡ */
        private static char f29871 = 7;

        /* JADX INFO: renamed from: ﻐ */
        private /* synthetic */ ISAdQualityConfig f29872;

        /* JADX INFO: renamed from: ﻛ */
        private /* synthetic */ String f29873;

        /* JADX INFO: renamed from: ﾇ */
        private /* synthetic */ Application f29875;

        /* JADX INFO: renamed from: ﾒ */
        private /* synthetic */ Activity f29876;

        AnonymousClass1(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f29872 = iSAdQualityConfig;
            this.f29873 = str;
            this.f29875 = application;
            this.f29876 = activity;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28224() {
            try {
                String userId = this.f29872.getUserId();
                C12092s.m30980(C12092s.this, this.f29872.getLogLevel());
                String strIntern = m31004(TextUtils.indexOf((CharSequence) "", '0', 0) + 13, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), "\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\u000b\f").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m31004(26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 52), "\r\u0007\u0000\r\u0000\u0005\u0006\u0000\u0014\u0000\b\u0014\u0011\u0012\u0000\r\u0013\u0011\u0005\u0012\u0014\u0011\u000e\u001b\t\u000f").intern());
                sb.append(this.f29873);
                C12085l.m30923(strIntern, sb.toString());
                C12031ig.m30493(this.f29875.getApplicationContext()).m30496();
                C12092s.m30974(C12092s.this, this.f29872.isTestMode());
                if (this.f29872.isTestMode()) {
                    C12085l.m30912(m31004(11 - MotionEvent.axisFromString(""), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), "\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\u000b\f").intern(), m31004(94 - Color.red(0), (byte) (40 - Color.green(0)), "\u0015\u0001\u0018\u0019\n\u001a\u001a\u001bII\u0011\t\u0017\u0014\u0014\"\t\u000e\u0014\u0016\u0013\u0002\u0000\"\u0017\u000e\u0014\u0003\u000b\u000e\u000e\t\u0016\u001c\t\u001c\u0016\u0006\u0018\u001c\u000b\u001c\u0000\u0018II\u0017\u0013\"\u001d\u001b\u0007\b\u001c\u0011\u0012\u0000\r\u0013\u0011\u000e\u001c\u001c\b\"\u0017\u0000\u0016\u001c\n\u001f\u0004\u0017\u000e\u0014\u0003\u0094\u0094\u0014\u001e\u0017\u000e\u0002\u0000\u001c$\u000b'\u0000\u0016\u0005\u0016II").intern());
                }
                try {
                    Class.forName(m31004(20 - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (122 - TextUtils.getOffsetAfter("", 0)), "\u0006\u000b\u0004\u001d\"\r\b+\u0016\"#\u0001$\u000f\u0007)'\u0002\"\u000f").intern());
                } catch (Throwable unused) {
                }
                Activity activity = this.f29876;
                if (activity != null) {
                    C12074jw.m30774(activity);
                } else {
                    C12074jw.m30763(this.f29875);
                }
                C12092s.m30970(C12092s.this).m28570(this.f29873);
                C12092s.m30970(C12092s.this).m28577(this.f29872.getInitializationSource());
                C12092s.m30970(C12092s.this).m28574(this.f29872.getCoppa());
                C12092s.m30970(C12092s.this).m28571(this.f29872.getDeviceIdType());
                C12092s.m30970(C12092s.this).m28573(this.f29872.getMetaData());
                Context applicationContext = this.f29875.getApplicationContext();
                C12092s.m30968(C12092s.this, applicationContext);
                C12092s.m30986(C12092s.this, new C12049iy(applicationContext));
                C12092s c12092s = C12092s.this;
                C12092s.m30992(C12092s.this);
                C12092s.m30976(c12092s, new C12056je(applicationContext, C11822an.m28467(), "B0r1sW@sH3re"));
                AbstractC11823ao.m28472().mo28504(applicationContext, C12092s.m30985(C12092s.this), C12092s.m30992(C12092s.this), new AbstractC11823ao.a() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.2

                    /* JADX INFO: renamed from: ﻐ */
                    private static int f29879 = 1;

                    /* JADX INFO: renamed from: ｋ */
                    private static int f29880 = 0;

                    /* JADX INFO: renamed from: ﾒ */
                    private static int f29881 = 128;

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao.a
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28510() {
                        int i = 2 % 2;
                        int i2 = f29879 + 59;
                        f29880 = i2 % 128;
                        int i3 = i2 % 2;
                        C12092s.m30990(C12092s.this, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, m31005(false, 30 - TextUtils.indexOf("", "", 0), "\u0019\u0005\u0010\r\u0018\u001dￄ\ufff7￨\uffefￄ\u0007\u0013\u0012\n\r\u000bￄ\u0010\u0013\u0005\bￄ\u0018\r\u0011\t\u0013\u0019\u0018￭\ufff7￥\b\ufff5", 35 - ((Process.getThreadPriority(0) + 20) >> 6), 219 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                        int i4 = f29880 + 35;
                        f29879 = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11823ao.a
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo28511() {
                        int i = 2 % 2;
                        int i2 = f29879 + 55;
                        f29880 = i2 % 128;
                        int i3 = i2 % 2;
                        C12092s.m30990(C12092s.this, ISAdQualityInitError.NO_NETWORK_CONNECTION, m31005(true, 7 - Color.green(0), "\u0013\u0010\u0001\nﾼ\u000b￪\n\u000b\u0005\u0010\uffff\u0001\n\n\u000b\uffffﾼ\u0007\u000e\u000b", (ViewConfiguration.getTapTimeout() >> 16) + 21, 228 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                        int i4 = f29880 + 105;
                        f29879 = i4 % 128;
                        if (i4 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }

                    /* JADX INFO: renamed from: ﻐ */
                    private static String m31005(boolean z, int i, String str, int i2, int i3) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (C11889d.f28479) {
                            char[] cArr2 = new char[i2];
                            C11889d.f28481 = 0;
                            while (C11889d.f28481 < i2) {
                                C11889d.f28480 = cArr[C11889d.f28481];
                                cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                                int i4 = C11889d.f28481;
                                cArr2[i4] = (char) (cArr2[i4] - f29881);
                                C11889d.f28481++;
                            }
                            if (i > 0) {
                                C11889d.f28478 = i;
                                char[] cArr3 = new char[i2];
                                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                                System.arraycopy(cArr3, 0, cArr2, i2 - C11889d.f28478, C11889d.f28478);
                                System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i2 - C11889d.f28478);
                            }
                            if (z) {
                                char[] cArr4 = new char[i2];
                                C11889d.f28481 = 0;
                                while (C11889d.f28481 < i2) {
                                    cArr4[C11889d.f28481] = cArr2[(i2 - C11889d.f28481) - 1];
                                    C11889d.f28481++;
                                }
                                cArr2 = cArr4;
                            }
                            str2 = new String(cArr2);
                        }
                        return str2;
                    }
                }, C12092s.m30983(C12092s.this));
                C12092s.m30964(C12092s.this, new C12050iz(applicationContext, C12092s.m30985(C12092s.this), C12092s.m30992(C12092s.this).m28468()));
                final String strM30795 = C12076jy.m30795(applicationContext);
                AbstractC11823ao.m28472().mo28495(new InterfaceC11828at() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.3

                    /* JADX INFO: renamed from: ﻐ */
                    private static int f29883 = 95;

                    /* JADX INFO: renamed from: ｋ */
                    private static int f29884 = 1;

                    /* JADX INFO: renamed from: ﾇ */
                    private static int f29885;

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11828at
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo28394() {
                        int i = 2 % 2;
                        int i2 = f29885 + 15;
                        f29884 = i2 % 128;
                        if (i2 % 2 == 0) {
                            if (AbstractC11823ao.m28472().mo28501(m31006(true, ViewConfiguration.getTouchSlop() + 91, "\u0000\ufff5\u0007\u0003\u0003\u0001", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3, 12695 << MotionEvent.axisFromString("")).intern(), strM30795)) {
                                return;
                            }
                        } else if (AbstractC11823ao.m28472().mo28501(m31006(false, (ViewConfiguration.getTouchSlop() >> 8) + 2, "\u0000\ufff5\u0007\u0003\u0003\u0001", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, 202 - MotionEvent.axisFromString("")).intern(), strM30795)) {
                            return;
                        }
                        int i3 = f29884 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                        f29885 = i3 % 128;
                        int i4 = i3 % 2;
                        C12092s.m30965(C12092s.this);
                        if (i4 != 0) {
                            throw null;
                        }
                    }

                    /* JADX INFO: renamed from: ﻛ */
                    private static String m31006(boolean z, int i, String str, int i2, int i3) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (C11889d.f28479) {
                            char[] cArr2 = new char[i2];
                            C11889d.f28481 = 0;
                            while (C11889d.f28481 < i2) {
                                C11889d.f28480 = cArr[C11889d.f28481];
                                cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                                int i4 = C11889d.f28481;
                                cArr2[i4] = (char) (cArr2[i4] - f29883);
                                C11889d.f28481++;
                            }
                            if (i > 0) {
                                C11889d.f28478 = i;
                                char[] cArr3 = new char[i2];
                                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                                System.arraycopy(cArr3, 0, cArr2, i2 - C11889d.f28478, C11889d.f28478);
                                System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i2 - C11889d.f28478);
                            }
                            if (z) {
                                char[] cArr4 = new char[i2];
                                C11889d.f28481 = 0;
                                while (C11889d.f28481 < i2) {
                                    cArr4[C11889d.f28481] = cArr2[(i2 - C11889d.f28481) - 1];
                                    C11889d.f28481++;
                                }
                                cArr2 = cArr4;
                            }
                            str2 = new String(cArr2);
                        }
                        return str2;
                    }
                });
                AbstractC11823ao.m28472().mo28498(new InterfaceC11828at() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.5
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11828at
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo28394() {
                        AbstractC11823ao.m28472().mo28496(C12092s.m30956(C12092s.this));
                    }
                });
                C12092s.m30997(C12092s.this, applicationContext);
                C12092s.m30963(C12092s.this, new C11814af(applicationContext, C12092s.m30970(C12092s.this), C12092s.m30992(C12092s.this), this.f29876 != null, strM30795, new InterfaceC12091r() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.4
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12091r
                    public void onEvent(final String str) {
                        C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.4.1

                            /* JADX INFO: renamed from: ﮐ */
                            private static char f29889 = 12925;

                            /* JADX INFO: renamed from: ﱟ */
                            private static int f29890 = 1;

                            /* JADX INFO: renamed from: ﺙ */
                            private static int f29891 = 0;

                            /* JADX INFO: renamed from: ﻐ */
                            private static char f29892 = 10327;

                            /* JADX INFO: renamed from: ｋ */
                            private static char f29893 = 34484;

                            /* JADX INFO: renamed from: ﾇ */
                            private static char f29894 = 26571;

                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo28224() {
                                C11831aw c11831awM30960;
                                int edgeSlop;
                                int i = 2 % 2;
                                int i2 = f29891 + 101;
                                f29890 = i2 % 128;
                                if (i2 % 2 == 0) {
                                    c11831awM30960 = C12092s.m30960(C12092s.this);
                                    edgeSlop = 113 >>> (ViewConfiguration.getEdgeSlop() >>> 11);
                                } else {
                                    c11831awM30960 = C12092s.m30960(C12092s.this);
                                    edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                                }
                                c11831awM30960.m28664(m31007("牱ą䨗ᗸ挐ҿ䨗ᗸ㒯옦퍲㠥쬴꿱㑰๎鷊䛱\ue0c6섖⪹䵋\u0e77燰", edgeSlop).intern(), Collections.singletonList(str));
                                int i3 = f29890 + 69;
                                f29891 = i3 % 128;
                                int i4 = i3 % 2;
                            }

                            /* JADX INFO: renamed from: ｋ */
                            private static String m31007(String str2, int i) {
                                String str3;
                                Object charArray = str2;
                                if (str2 != null) {
                                    charArray = str2.toCharArray();
                                }
                                char[] cArr = (char[]) charArray;
                                synchronized (C12078k.f29776) {
                                    char[] cArr2 = new char[cArr.length];
                                    C12078k.f29775 = 0;
                                    char[] cArr3 = new char[2];
                                    while (C12078k.f29775 < cArr.length) {
                                        cArr3[0] = cArr[C12078k.f29775];
                                        cArr3[1] = cArr[C12078k.f29775 + 1];
                                        int i2 = 58224;
                                        for (int i3 = 0; i3 < 16; i3++) {
                                            char c = cArr3[1];
                                            char c2 = cArr3[0];
                                            char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29894)) ^ ((c2 >>> 5) + f29889)));
                                            cArr3[1] = c3;
                                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29893) ^ ((c3 + i2) ^ ((c3 << 4) + f29892))));
                                            i2 -= 40503;
                                        }
                                        cArr2[C12078k.f29775] = cArr3[0];
                                        cArr2[C12078k.f29775 + 1] = cArr3[1];
                                        C12078k.f29775 += 2;
                                    }
                                    str3 = new String(cArr2, 0, i);
                                }
                                return str3;
                            }
                        });
                    }
                }));
                if (!this.f29872.isUserIdSet()) {
                    C12092s.m30970(C12092s.this).m28567();
                    userId = C12092s.m30961(C12092s.this).m28376();
                }
                if (C12092s.this.m31001()) {
                    C12092s.m30961(C12092s.this).m28383(new InterfaceC11817ai() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.1
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11817ai
                        public void onEventReceived(JSONObject jSONObject) {
                            C12037im.m30522(C12092s.m30954(C12092s.this), C12035ik.f29379, jSONObject, new Object[0]);
                        }
                    });
                }
                C12092s.m30961(C12092s.this).m28380(new C12056je.a() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.10
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.C12056je.a
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo30652() {
                        C12092s.m30965(C12092s.this);
                    }
                });
                C12092s.m30993(C12092s.this, new C11831aw(C12092s.m30956(C12092s.this), C12092s.m30961(C12092s.this), strM30795, new C11834az(), new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.9
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitSuccess() {
                        C12092s.m30958(C12092s.this);
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                        C12092s.m30990(C12092s.this, iSAdQualityInitError, str);
                    }
                }));
                C12092s.m30960(C12092s.this).m28667(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.7
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (C12092s.m30951(C12092s.this) != null) {
                            C12092s.m30951(C12092s.this).adDisplayed(str, iSAdQualityAdType);
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (C12092s.m30951(C12092s.this) != null) {
                            C12092s.m30951(C12092s.this).adClosed(str, iSAdQualityAdType);
                        }
                    }
                });
                C12092s.m30984(C12092s.this, new C11820al(C12092s.m30960(C12092s.this)));
                C12092s.m30969(C12092s.this, new C11818aj(C12092s.m30961(C12092s.this)));
                String strIntern2 = m31004(((Process.getThreadPriority(0) + 20) >> 6) + 12, (byte) (119 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\u000b\f").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m31004(33 - TextUtils.indexOf("", ""), (byte) (23 - ((Process.getThreadPriority(0) + 20) >> 6)), "\r\n\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\u000b\f\u000f\u001e\u000b\u0000\u001c\u000b\r\u0014\u0010\u0011)\u0018\u001e\u0012\u0004\u001f\u0004(7").intern());
                sb2.append(C12092s.m30992(C12092s.this).m28469());
                C12085l.m30917(strIntern2, sb2.toString());
                C12092s c12092s2 = C12092s.this;
                Context context = this.f29876;
                if (context == null) {
                    context = applicationContext;
                }
                C12092s.m30973(c12092s2, context, userId);
                C12092s.m30979(C12092s.this, applicationContext);
                C12092s.m30950(C12092s.this);
                C12092s.m30953(C12092s.this);
            } catch (Throwable th) {
                String strIntern3 = m31004(35 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 57), "\"!\"\u0019\u001e\u0012\r\u0014\u0000\r\u0000\u0005\u0006\u0000\u0014\u0000\b\u0014\u0013\t\u0007\u0002\u0002\u0003\u0004\u0005\u0006\u0000\b\t\u0017\u0010\u000b\f").intern();
                C12080kb.m30846(m31004(TextUtils.indexOf("", "", 0) + 12, (byte) (119 - ExpandableListView.getPackedPositionGroup(0L)), "\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\u000b\f").intern(), strIntern3, th, true, false, true);
                C12092s.m30990(C12092s.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern3);
            }
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m31004(int i, byte b, String str) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11970g.f28961) {
                char[] cArr2 = f29870;
                char c = f29871;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C11970g.f28962 = 0;
                    while (C11970g.f28962 < i) {
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
                                int i2 = (C11970g.f28963 * c) + C11970g.f28959;
                                int i3 = (C11970g.f28966 * c) + C11970g.f28960;
                                cArr3[C11970g.f28962] = cArr2[i2];
                                cArr3[C11970g.f28962 + 1] = cArr2[i3];
                            } else if (C11970g.f28963 == C11970g.f28966) {
                                C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                                C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                                int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                                int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                                cArr3[C11970g.f28962] = cArr2[i4];
                                cArr3[C11970g.f28962 + 1] = cArr2[i5];
                            } else {
                                int i6 = (C11970g.f28963 * c) + C11970g.f28960;
                                int i7 = (C11970g.f28966 * c) + C11970g.f28959;
                                cArr3[C11970g.f28962] = cArr2[i6];
                                cArr3[C11970g.f28962 + 1] = cArr2[i7];
                            }
                        }
                        C11970g.f28962 += 2;
                    }
                }
                str2 = new String(cArr3);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m30995(Application application, Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        String strIntern = m30987((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12 - View.MeasureSpec.makeMeasureSpec(0, 0), View.resolveSizeAndState(0, 0, 0) + 74).intern();
        if (iSAdQualityConfig == null) {
            iSAdQualityConfig = new ISAdQualityConfig.Builder().build();
        }
        if (C11836ba.m28727().isEmpty()) {
            int i2 = f29846 + 63;
            f29847 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern2 = m30987((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.green(0) + 57, TextUtils.lastIndexOf("", '0') + 87).intern();
            C12085l.m30917(strIntern, strIntern2);
            m30966(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.NO_AD_NETWORKS, strIntern2);
            int i4 = f29846 + 23;
            f29847 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (!m30982(iSAdQualityConfig)) {
            int i6 = f29846 + 1;
            f29847 = i6 % 128;
            if (i6 % 2 == 0) {
                ISAdQualityConfig.merge(this.f29869, iSAdQualityConfig);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            iSAdQualityConfig = ISAdQualityConfig.merge(this.f29869, iSAdQualityConfig);
        }
        if (m30947()) {
            int i7 = f29846 + 67;
            f29847 = i7 % 128;
            int i8 = i7 % 2;
            String strIntern3 = m30987((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, 143 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
            C12085l.m30917(strIntern, strIntern3);
            m30966(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern3);
            return;
        }
        if (m30948()) {
            String strIntern4 = m30987((char) (31365 - TextUtils.getOffsetBefore("", 0)), 59 - View.resolveSize(0, 0), (-16777033) - Color.rgb(0, 0, 0)).intern();
            C12085l.m30917(strIntern, strIntern4);
            m30966(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern4);
            return;
        }
        if (m31000()) {
            String strIntern5 = m30987((char) ((-16760328) - Color.rgb(0, 0, 0)), View.combineMeasuredStates(0, 0) + 48, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 242).intern();
            C12085l.m30912(strIntern, strIntern5);
            m30966(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern5);
            return;
        }
        if (TextUtils.isEmpty(iSAdQualityConfig.getUserId()) && iSAdQualityConfig.isUserIdSet()) {
            String strIntern6 = m30987((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 54580), 60 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 290).intern();
            C12085l.m30912(strIntern, strIntern6);
            m30966(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, strIntern6);
        } else {
            if (TextUtils.isEmpty(str)) {
                int i9 = f29847 + 13;
                f29846 = i9 % 128;
                int i10 = i9 % 2;
                String strIntern7 = m30987((char) (63950 - TextUtils.getOffsetAfter("", 0)), 49 - View.MeasureSpec.makeMeasureSpec(0, 0), Color.argb(0, 0, 0, 0) + 350).intern();
                C12085l.m30912(strIntern, strIntern7);
                m30966(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, strIntern7);
                return;
            }
            this.f29855.addAll(iSAdQualityConfig.getAdQualityInitListeners());
            m30967(true);
            AbstractC12058jg.m30663().mo30667(application, activity);
            C12055jd.m30631().m30634();
            C12060ji.m30687().m30693();
            C12089p.m30933(new AnonymousClass1(iSAdQualityConfig, str, application, activity));
        }
    }

    /* JADX INFO: renamed from: ﺙ */
    private synchronized C11827as m30959() {
        C11827as c11827as;
        int i = 2 % 2;
        int i2 = f29846 + 41;
        int i3 = i2 % 128;
        f29847 = i3;
        int i4 = i2 % 2;
        c11827as = this.f29868;
        int i5 = i3 + 31;
        f29846 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        return c11827as;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        int i = 2 % 2;
        int i2 = f29847 + 69;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        m30998(false);
        int i4 = f29846 + 85;
        f29847 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z) {
        int i = 2 % 2;
        int i2 = f29847 + 27;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        m30959().m28579(z);
        int i4 = f29847 + 99;
        f29846 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private synchronized void m30998(boolean z) {
        String strIntern;
        int i = 2 % 2;
        try {
            if (m31000()) {
                int i2 = f29847 + 1;
                f29846 = i2 % 128;
                int i3 = i2 % 2;
                C12085l.m30912(m30987((char) (ViewConfiguration.getEdgeSlop() >> 16), 12 - View.MeasureSpec.getMode(0), 74 - TextUtils.indexOf("", "")).intern(), m30987((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 398 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                return;
            }
            if (!m30948()) {
                C12085l.m30912(m30987((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), ExpandableListView.getPackedPositionType(0L) + 12, TextUtils.indexOf((CharSequence) "", '0', 0) + 75).intern(), m30987((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54780), View.MeasureSpec.getMode(0) + 59, 436 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                return;
            }
            String strIntern2 = m30987((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 28 - Color.red(0), 494 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(strIntern2);
                sb.append(m30987((char) (41932 - ((Process.getThreadPriority(0) + 20) >> 6)), 23 - TextUtils.indexOf((CharSequence) "", '0'), 522 - Drawable.resolveOpacity(0, 0)).intern());
                strIntern2 = sb.toString();
                int i4 = 2 % 2;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                strIntern = m30987((char) (ImageFormat.getBitsPerPixel(0) + 1), 6 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 547).intern();
                int i5 = f29846 + 101;
                f29847 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } else {
                strIntern = m30987((char) (61959 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 4, ExpandableListView.getPackedPositionGroup(0L) + 552).intern();
            }
            try {
                jSONObject.put(m30987((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18358), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, ((Process.getThreadPriority(0) + 20) >> 6) + 555).intern(), strIntern);
            } catch (JSONException unused) {
            }
            this.f29859.m28385(m30987((char) View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionType(0L) + 5, TextUtils.indexOf("", "", 0) + 556).intern(), jSONObject);
            String strMo28497 = AbstractC11823ao.m28472().mo28497(m30987((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 6, TextUtils.getOffsetBefore("", 0) + 561).intern());
            if (!TextUtils.isEmpty(strMo28497)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strIntern2);
                sb2.append(m30987((char) (14700 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.getOffsetBefore("", 0) + 14, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 567).intern());
                sb2.append(strMo28497);
                strIntern2 = sb2.toString();
                int i7 = f29846 + 111;
                f29847 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            }
            C12085l.m30917(m30987((char) Color.green(0), Color.green(0) + 12, (ViewConfiguration.getPressedStateDuration() >> 16) + 74).intern(), strIntern2);
            m30996(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern2);
            this.f29862 = true;
            AbstractC11823ao.m28472().mo28478();
            C12031ig.m30493(this.f29864).m30498();
            this.f29857.m28668();
            this.f29860.m30565();
            this.f29859.m28382();
            C12019hv.m30361();
        } catch (Exception e) {
            C12080kb.m30846(m30987((char) View.MeasureSpec.makeMeasureSpec(0, 0), 12 - ExpandableListView.getPackedPositionGroup(0L), 74 - View.MeasureSpec.getMode(0)).intern(), m30987((char) (17020 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, 581 - TextUtils.indexOf("", "", 0, 0)).intern(), e, true, false, true);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final synchronized boolean m31000() {
        int i = 2 % 2;
        int i2 = f29846 + 29;
        f29847 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        return this.f29862;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        String str2;
        int i = 2 % 2;
        int i2 = f29847 + 97;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (m30991(str)) {
                boolean zEquals = str.equals(m30959().m28576());
                boolean z = !zEquals;
                boolean zMo30669 = AbstractC12058jg.m30663().mo30669();
                if (!zEquals) {
                    int i4 = f29846 + 11;
                    int i5 = i4 % 128;
                    f29847 = i5;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    if (!(!zMo30669)) {
                        int i6 = i5 + 35;
                        f29846 = i6 % 128;
                        int i7 = i6 % 2;
                        this.f29859.m28379();
                    }
                }
                str2 = str;
                try {
                    m30989(this.f29864, str2, z, true, zMo30669);
                } catch (Exception e) {
                    e = e;
                    String strIntern = m30987((char) View.combineMeasuredStates(0, 0), 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 74 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m30987((char) (ViewConfiguration.getEdgeSlop() >> 16), 22 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 600).intern());
                    sb.append(str2);
                    C12080kb.m30846(strIntern, sb.toString(), e, true, false, true);
                }
            }
        } catch (Exception e2) {
            e = e2;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private boolean m30991(String str) {
        int i = 2 % 2;
        int i2 = f29846 + 61;
        f29847 = i2 % 128;
        int i3 = i2 % 2;
        if (m31000()) {
            C12085l.m30912(m30987((char) Color.blue(0), (-16777204) - Color.rgb(0, 0, 0), 74 - (Process.myTid() >> 22)).intern(), m30987((char) (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionChild(0L) + 53, 621 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            return false;
        }
        if (m30948()) {
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
            C12085l.m30912(m30987((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 74).intern(), m30987((char) (TextUtils.getOffsetBefore("", 0) + 42042), TextUtils.lastIndexOf("", '0', 0, 0) + 35, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 738).intern());
            return false;
        }
        int i4 = f29847 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29846 = i4 % 128;
        int i5 = i4 % 2;
        C12085l.m30912(m30987((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.lastIndexOf("", '0', 0) + 13, 74 - ExpandableListView.getPackedPositionType(0L)).intern(), m30987((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 65, Color.rgb(0, 0, 0) + 16777889).intern());
        int i6 = f29847 + 109;
        f29846 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 21 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$5, reason: invalid class name */
    final class AnonymousClass5 implements InterfaceC11828at {

        /* JADX INFO: renamed from: ﻐ */
        final /* synthetic */ String f29907;

        /* JADX INFO: renamed from: ﻛ */
        final /* synthetic */ boolean f29908;

        /* JADX INFO: renamed from: ｋ */
        final /* synthetic */ boolean f29909;

        /* JADX INFO: renamed from: ﾇ */
        final /* synthetic */ Context f29910;

        /* JADX INFO: renamed from: ﾒ */
        final /* synthetic */ boolean f29911;

        AnonymousClass5(boolean z, Context context, boolean z2, String str, boolean z3) {
            this.f29908 = z;
            this.f29910 = context;
            this.f29911 = z2;
            this.f29907 = str;
            this.f29909 = z3;
        }

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$5$2, reason: invalid class name */
        final class AnonymousClass2 extends AbstractRunnableC12044it {
            AnonymousClass2() {
            }

            /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$5$2$5, reason: invalid class name and collision with other inner class name */
            final class C155345 extends AbstractRunnableC12044it {

                /* JADX INFO: renamed from: ﱡ */
                private static int f29913 = 0;

                /* JADX INFO: renamed from: ﺙ */
                private static int f29914 = 1;

                /* JADX INFO: renamed from: ﻐ */
                private static boolean f29915 = true;

                /* JADX INFO: renamed from: ﻛ */
                private static char[] f29916 = {'y', Ascii.MAX, 't', 'z', 'A', '|', 133, 134, 135, 'f', 'x', 129};

                /* JADX INFO: renamed from: ﾇ */
                private static boolean f29917 = true;

                /* JADX INFO: renamed from: ﾒ */
                private static int f29918 = 19;

                C155345() {
                }

                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    int i = 2 % 2;
                    C12092s.m30946(C12092s.this).m30647(m31009(null, ExpandableListView.getPackedPositionGroup(0L) + 127, null, "\u008c\u008b\u008b\u008a\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern(), new C12056je.d() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.2.5.1

                        /* JADX INFO: renamed from: ﻐ */
                        private static int f29920 = 0;

                        /* JADX INFO: renamed from: ｋ */
                        private static int f29922 = 1;

                        /* JADX INFO: renamed from: ﾇ */
                        private static char[] f29923 = {'f', 6706, 13533, 20349, 26966, 33712, 40541, 47328, 53891, 60730, 2047, 8815, 15373, 22184, 24643, 31258, 21749, 12108, 2360};

                        /* JADX INFO: renamed from: ﻛ */
                        private static long f29921 = -8549273135877449122L;

                        @Override // com.ironsource.adqualitysdk.sdk.p286i.C12056je.d
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo30653(String str) {
                            int i2 = 2 % 2;
                            final boolean zIsEmpty = TextUtils.isEmpty(str);
                            if (zIsEmpty) {
                                int i3 = f29920 + 51;
                                f29922 = i3 % 128;
                                int i4 = i3 % 2;
                                C12092s.m30946(C12092s.this).m30649(m31010((char) KeyEvent.normalizeMetaState(0), Color.blue(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 14).intern(), m31010((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 24612), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, 5 - View.getDefaultSize(0, 0)).intern(), null);
                                int i5 = f29920 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                f29922 = i5 % 128;
                                if (i5 % 2 == 0) {
                                    int i6 = 5 % 4;
                                }
                            }
                            C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.2.5.1.2

                                /* JADX INFO: renamed from: ｋ */
                                private static int f29925 = 0;

                                /* JADX INFO: renamed from: ﾇ */
                                private static long f29926 = -35154862757246508L;

                                /* JADX INFO: renamed from: ﾒ */
                                private static int f29927 = 1;

                                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                /* JADX INFO: renamed from: ﻛ */
                                public final void mo28224() {
                                    int i7 = 2 % 2;
                                    int i8 = f29925 + 11;
                                    f29927 = i8 % 128;
                                    int i9 = i8 % 2;
                                    C11814af c11814afM30961 = C12092s.m30961(C12092s.this);
                                    String strIntern = m31011("벬怰볘़榔\u0c5b᫋ᅎ鮒兽㎰", (Process.getThreadPriority(0) + 20) >> 6).intern();
                                    String strIntern2 = null;
                                    if (AnonymousClass5.this.f29911) {
                                        if (AnonymousClass5.this.f29907 != null) {
                                            int i10 = f29925 + 83;
                                            f29927 = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                String str2 = AnonymousClass5.this.f29907;
                                                throw null;
                                            }
                                            strIntern2 = AnonymousClass5.this.f29907;
                                        } else {
                                            strIntern2 = m31011("㑥㣿㐋긋ㅞ\uddb8뷏삨", View.combineMeasuredStates(0, 0)).intern();
                                        }
                                    }
                                    C11831aw c11831awM30960 = C12092s.m30960(C12092s.this);
                                    new C11985go(C12092s.m30954(C12092s.this));
                                    C12092s.m30954(C12092s.this);
                                    c11814afM30961.m28385(strIntern, C12071jt.m30745(strIntern2, c11831awM30960, zIsEmpty, C12092s.m30970(C12092s.this)));
                                    if (!AnonymousClass5.this.f29909) {
                                        return;
                                    }
                                    int i11 = f29927 + 19;
                                    f29925 = i11 % 128;
                                    int i12 = i11 % 2;
                                    C12092s.m30961(C12092s.this).m28384();
                                    if (i12 != 0) {
                                        int i13 = 90 / 0;
                                    }
                                }

                                /* JADX INFO: renamed from: ﻛ */
                                private static String m31011(String str2, int i7) {
                                    String str3;
                                    Object charArray = str2;
                                    if (str2 != null) {
                                        charArray = str2.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (C11943f.f28848) {
                                        char[] cArrM30189 = C11943f.m30189(f29926, cArr, i7);
                                        C11943f.f28846 = 4;
                                        while (C11943f.f28846 < cArrM30189.length) {
                                            C11943f.f28847 = C11943f.f28846 - 4;
                                            cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29926));
                                            C11943f.f28846++;
                                        }
                                        str3 = new String(cArrM30189, 4, cArrM30189.length - 4);
                                    }
                                    return str3;
                                }
                            });
                        }

                        /* JADX INFO: renamed from: ﻛ */
                        private static String m31010(char c, int i2, int i3) {
                            String str;
                            synchronized (C11862c.f28047) {
                                char[] cArr = new char[i3];
                                C11862c.f28048 = 0;
                                while (C11862c.f28048 < i3) {
                                    cArr[C11862c.f28048] = (char) ((((long) f29923[C11862c.f28048 + i2]) ^ (((long) C11862c.f28048) * f29921)) ^ ((long) c));
                                    C11862c.f28048++;
                                }
                                str = new String(cArr);
                            }
                            return str;
                        }
                    });
                    int i2 = f29914 + 99;
                    f29913 = i2 % 128;
                    int i3 = i2 % 2;
                }

                /* JADX INFO: renamed from: ﻐ */
                private static String m31009(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
                    Object bytes = str2;
                    if (str2 != null) {
                        bytes = str2.getBytes(C9415C.ISO88591_NAME);
                    }
                    byte[] bArr = (byte[]) bytes;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (C12088o.f29838) {
                        char[] cArr2 = f29916;
                        int i2 = f29918;
                        if (f29915) {
                            int length = bArr.length;
                            C12088o.f29839 = length;
                            char[] cArr3 = new char[length];
                            C12088o.f29840 = 0;
                            while (C12088o.f29840 < C12088o.f29839) {
                                cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                                C12088o.f29840++;
                            }
                            return new String(cArr3);
                        }
                        if (f29917) {
                            int length2 = cArr.length;
                            C12088o.f29839 = length2;
                            char[] cArr4 = new char[length2];
                            C12088o.f29840 = 0;
                            while (C12088o.f29840 < C12088o.f29839) {
                                cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                                C12088o.f29840++;
                            }
                            return new String(cArr4);
                        }
                        int length3 = iArr.length;
                        C12088o.f29839 = length3;
                        char[] cArr5 = new char[length3];
                        C12088o.f29840 = 0;
                        while (C12088o.f29840 < C12088o.f29839) {
                            cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                            C12088o.f29840++;
                        }
                        return new String(cArr5);
                    }
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (AnonymousClass5.this.f29908) {
                    C12092s.m30960(C12092s.this).m28666(AnonymousClass5.this.f29910, new C155345());
                }
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11828at
        /* JADX INFO: renamed from: ﻐ */
        public final void mo28394() {
            C12089p.m30933(new AnonymousClass2());
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m30989(Context context, String str, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = f29846 + 5;
        f29847 = i2 % 128;
        if (i2 % 2 != 0) {
            String strM28576 = m30959().m28576();
            m30959().m28572(str);
            if (str == null) {
                C12085l.m30912(m30987((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 12, 74 - Color.green(0)).intern(), m30987((char) (View.getDefaultSize(0, 0) + 64754), Color.red(0) + 93, View.MeasureSpec.getSize(0) + 772).intern());
            } else if (str.equals(m30987((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.lastIndexOf("", '0', 0) + 18, 865 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                String strIntern = m30987((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 11 - ExpandableListView.getPackedPositionChild(0L), Color.red(0) + 74).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m30987((char) (34223 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41, 881 - MotionEvent.axisFromString("")).intern());
                sb.append(str);
                sb.append(m30987((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 77 - (KeyEvent.getMaxKeyCode() >> 16), 922 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
                C12085l.m30912(strIntern, sb.toString());
            } else {
                String strIntern2 = m30987((char) View.MeasureSpec.makeMeasureSpec(0, 0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 74 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m30987((char) (2465 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.getTrimmedLength("") + 33, 1000 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                sb2.append(str);
                C12085l.m30923(strIntern2, sb2.toString());
                int i3 = f29846 + 75;
                f29847 = i3 % 128;
                int i4 = i3 % 2;
            }
            AbstractC11823ao.m28472().mo28502(new AnonymousClass5(z, context, z2, strM28576, z3));
            JSONObject jSONObjectM30955 = m30955();
            if (jSONObjectM30955 != null) {
                int i5 = f29846 + 71;
                f29847 = i5 % 128;
                if (i5 % 2 != 0) {
                    AbstractC11823ao.m28472().mo28499(jSONObjectM30955);
                    return;
                } else {
                    AbstractC11823ao.m28472().mo28499(jSONObjectM30955);
                    int i6 = 16 / 0;
                    return;
                }
            }
            AbstractC11823ao.m28472().mo28494(context, m30959(), true);
            return;
        }
        m30959().m28576();
        m30959().m28572(str);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ */
    private JSONObject m30955() {
        int i = 2 % 2;
        int i2 = f29847 + 47;
        f29846 = i2 % 128;
        if (i2 % 2 == 0) {
            Map<String, String> mapM28566 = m30959().m28566();
            if (mapM28566 != null) {
                int i3 = f29847 + 13;
                f29846 = i3 % 128;
                int i4 = i3 % 2;
                if (mapM28566.containsKey(m30987((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 13 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1031).intern())) {
                    try {
                        return new JSONObject(mapM28566.get(m30987((char) Color.green(0), 13 - View.MeasureSpec.getSize(0), KeyEvent.keyCodeFromString("") + 1032).intern()));
                    } catch (JSONException unused) {
                    }
                }
            }
            int i5 = f29846 + 81;
            f29847 = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        m30959().m28566();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m30972(Context context) {
        int i = 2 % 2;
        int i2 = f29847 + 53;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        String strM30642 = this.f29853.m30642(m30987((char) (Process.myTid() >> 22), Drawable.resolveOpacity(0, 0) + 10, 1046 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        if (!TextUtils.isEmpty(strM30642)) {
            new C12056je(context, m30987((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 25 - View.resolveSizeAndState(0, 0, 0), 1054 - TextUtils.lastIndexOf("", '0')).intern(), m30987((char) (35783 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 24 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 1080).intern()).m30648(m30987((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES).intern(), strM30642);
            this.f29853.m30646(m30987((char) (Process.myTid() >> 22), AndroidCharacter.getMirror('0') - '&', TextUtils.getOffsetBefore("", 0) + IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES).intern());
        }
        int i4 = f29847 + 95;
        f29846 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    public final synchronized void m31002() {
        int i = 2 % 2;
        int i2 = f29847 + 37;
        f29846 = i2 % 128;
        if (i2 % 2 != 0) {
            m31000();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (m31000()) {
            C12085l.m30912(m30987((char) View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 12, 73 - Process.getGidForName("")).intern(), m30987((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13011), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 60, 1104 - View.MeasureSpec.getSize(0)).intern());
            return;
        }
        if (m30948()) {
            C12085l.m30912(m30987((char) (ViewConfiguration.getScrollBarSize() >> 8), (-16777204) - Color.rgb(0, 0, 0), 73 - ImageFormat.getBitsPerPixel(0)).intern(), m30987((char) Drawable.resolveOpacity(0, 0), 48 - View.getDefaultSize(0, 0), 1165 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
            return;
        }
        this.f29861 = true;
        int i3 = f29847 + 55;
        f29846 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized boolean m31001() {
        int i = 2 % 2;
        int i2 = f29846;
        int i3 = i2 + 73;
        f29847 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.f29861;
        int i4 = i2 + 83;
        f29847 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        int i5 = 0 / 0;
        return z;
        throw th;
    }

    /* JADX INFO: renamed from: ｋ */
    private synchronized void m30981(boolean z) {
        int i = 2 % 2;
        int i2 = f29846;
        int i3 = i2 + 69;
        f29847 = i3 % 128;
        int i4 = i3 % 2;
        this.f29865 = z;
        int i5 = i2 + 51;
        f29847 = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public final synchronized ISAdQualityLogLevel m31003() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        int i = 2 % 2;
        int i2 = f29846 + 65;
        int i3 = i2 % 128;
        f29847 = i3;
        int i4 = i2 % 2;
        iSAdQualityLogLevel = this.f29863;
        int i5 = i3 + 59;
        f29846 = i5 % 128;
        int i6 = i5 % 2;
        return iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ｋ */
    private synchronized void m30978(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = 2 % 2;
        int i2 = f29847 + 93;
        int i3 = i2 % 128;
        f29846 = i3;
        int i4 = i2 % 2;
        this.f29863 = iSAdQualityLogLevel;
        int i5 = i3 + 113;
        f29847 = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ */
    private synchronized boolean m30962() {
        boolean z;
        int i = 2 % 2;
        int i2 = f29847;
        int i3 = i2 + 13;
        f29846 = i3 % 128;
        int i4 = i3 % 2;
        z = this.f29865;
        int i5 = i2 + 105;
        f29846 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final synchronized C11831aw m30999() {
        C11831aw c11831aw;
        int i = 2 % 2;
        int i2 = f29846 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        int i3 = i2 % 128;
        f29847 = i3;
        int i4 = i2 % 2;
        c11831aw = this.f29857;
        int i5 = i3 + 35;
        f29846 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        return c11831aw;
    }

    /* JADX INFO: renamed from: ﭴ */
    private synchronized boolean m30948() {
        boolean z;
        int i = 2 % 2;
        int i2 = f29847 + 61;
        f29846 = i2 % 128;
        if (i2 % 2 != 0) {
            z = this.f29866;
            int i3 = 15 / 0;
        } else {
            z = this.f29866;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﻛ */
    private synchronized void m30975(boolean z) {
        int i = 2 % 2;
        int i2 = f29847 + 85;
        int i3 = i2 % 128;
        f29846 = i3;
        int i4 = i2 % 2;
        this.f29866 = true;
        int i5 = i3 + 99;
        f29847 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﭖ */
    private synchronized boolean m30947() {
        boolean z;
        int i = 2 % 2;
        int i2 = f29846 + 85;
        int i3 = i2 % 128;
        f29847 = i3;
        if (i2 % 2 == 0) {
            z = this.f29867;
            int i4 = 62 / 0;
        } else {
            z = this.f29867;
        }
        int i5 = i3 + 51;
        f29846 = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﻐ */
    private synchronized void m30967(boolean z) {
        int i = 2 % 2;
        int i2 = f29847;
        int i3 = i2 + 107;
        f29846 = i3 % 128;
        int i4 = i3 % 2;
        this.f29867 = z;
        int i5 = i2 + 93;
        f29846 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m30988(Context context) {
        int i = 2 % 2;
        try {
            Object obj = null;
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    C12074jw.m30777(intent);
                }
            }, new IntentFilter(m30987((char) (30087 - (ViewConfiguration.getLongPressTimeout() >> 16)), ImageFormat.getBitsPerPixel(0) + 38, 1213 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()), null, C12089p.m30942());
            int i2 = f29847 + 79;
            f29846 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            C12085l.m30914(m30987((char) ExpandableListView.getPackedPositionGroup(0L), AndroidCharacter.getMirror('0') - '$', (ViewConfiguration.getFadingEdgeLength() >> 16) + 74).intern(), m30987((char) ((-1) - TextUtils.lastIndexOf("", '0')), 34 - ((byte) KeyEvent.getModifierMetaStateMask()), 1248 - TextUtils.lastIndexOf("", '0')).intern(), th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        com.ironsource.adqualitysdk.sdk.p286i.C12085l.m30912(m30987((char) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 1), android.text.TextUtils.getOffsetAfter("", 0) + 12, 74 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)).intern(), m30987((char) android.graphics.Color.red(0), 53 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 1284 - android.view.View.resolveSize(0, 0)).intern());
        r8 = com.ironsource.adqualitysdk.sdk.p286i.C12092s.f29846 + 85;
        com.ironsource.adqualitysdk.sdk.p286i.C12092s.f29847 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (m31000() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (m31000() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r7.f29856 = r8;
     */
    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAdListener(com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C12092s.f29846
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12092s.f29847 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            boolean r1 = r7.m31000()
            r3 = 97
            int r3 = r3 / r2
            if (r1 == 0) goto L1f
            goto L22
        L19:
            boolean r1 = r7.m31000()
            if (r1 != 0) goto L22
        L1f:
            r7.f29856 = r8
            return
        L22:
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r8 = r8 + (-1)
            char r8 = (char) r8
            java.lang.String r1 = ""
            int r1 = android.text.TextUtils.getOffsetAfter(r1, r2)
            int r1 = r1 + 12
            int r3 = android.view.ViewConfiguration.getScrollBarSize()
            int r3 = r3 >> 8
            int r3 = 74 - r3
            java.lang.String r8 = m30987(r8, r1, r3)
            java.lang.String r8 = r8.intern()
            int r1 = android.graphics.Color.red(r2)
            char r1 = (char) r1
            int r3 = android.view.ViewConfiguration.getLongPressTimeout()
            int r3 = r3 >> 16
            int r3 = 53 - r3
            int r2 = android.view.View.resolveSize(r2, r2)
            int r2 = 1284 - r2
            java.lang.String r1 = m30987(r1, r3, r2)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.p286i.C12085l.m30912(r8, r1)
            int r8 = com.ironsource.adqualitysdk.sdk.p286i.C12092s.f29846
            int r8 = r8 + 85
            int r1 = r8 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12092s.f29847 = r1
            int r8 = r8 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12092s.setAdListener(com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener):void");
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        int i2 = f29847 + 53;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        if (m31000()) {
            C12085l.m30912(m30987((char) View.MeasureSpec.getSize(0), 12 - View.MeasureSpec.getMode(0), TextUtils.indexOf("", "", 0) + 74).intern(), m30987((char) (47204 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 68 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1337 - Color.argb(0, 0, 0, 0)).intern());
            return;
        }
        if (!m30948()) {
            int i4 = f29846 + 41;
            f29847 = i4 % 128;
            int i5 = i4 % 2;
            C12085l.m30912(m30987((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0) + 75).intern(), m30987((char) Color.alpha(0), 73 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1404 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
            return;
        }
        this.f29854.m28456(iSAdQualityCustomMediationRevenue);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(final ISAdQualitySegment iSAdQualitySegment) {
        int i = 2 % 2;
        int i2 = f29847 + 65;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        if (!m31000()) {
            C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.s.3

                /* JADX INFO: renamed from: ﻐ */
                private static int f29900 = 10;

                /* JADX INFO: renamed from: ﾇ */
                private static int f29901 = 0;

                /* JADX INFO: renamed from: ﾒ */
                private static int f29902 = 1;

                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    int i4 = 2 % 2;
                    int i5 = f29901 + 35;
                    f29902 = i5 % 128;
                    if (i5 % 2 == 0) {
                        C12092s.m30949(C12092s.this);
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }
                    if (C12092s.m30949(C12092s.this)) {
                        if (C12092s.m30944(C12092s.this) != null) {
                            C12092s.m30944(C12092s.this).m28439(iSAdQualitySegment);
                            return;
                        }
                        return;
                    }
                    int i6 = f29901 + 9;
                    f29902 = i6 % 128;
                    int i7 = i6 % 2;
                    C12085l.m30912(m31008(103 - TextUtils.indexOf((CharSequence) "", '0', 0), false, 2 - (Process.myPid() >> 22), "￦￭￣\u0006\ufff3\u0017\u0003\u000e\u000b\u0016\u001b\ufff5", Color.rgb(0, 0, 0) + 16777228).intern(), m31008((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 97, true, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.f22500SO, "\u000f\r\u001b\uffc8\u001c\r\u001b\uffc8\u001cￏ\u0016\t￫ￖ\f\r\"\u0011\u0014\t\u0011\u001c\u0011\u0016\u0011\uffc8\u001c\u0017\u0016\uffc8\u001b\u0011\uffc8\ufff3￬\ufffb\uffc8!\u001c\u0011\u0014\t\u001d\ufff9\f￩\ufffb\ufff1\uffc8ￕ\uffc8\u001c\u0016\r\u0015", 'g' - AndroidCharacter.getMirror('0')).intern());
                    int i8 = f29902 + 13;
                    f29901 = i8 % 128;
                    int i9 = i8 % 2;
                }

                /* JADX INFO: renamed from: ﾇ */
                private static String m31008(int i4, boolean z, int i5, String str, int i6) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (C11889d.f28479) {
                        char[] cArr2 = new char[i6];
                        C11889d.f28481 = 0;
                        while (C11889d.f28481 < i6) {
                            C11889d.f28480 = cArr[C11889d.f28481];
                            cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i4);
                            int i7 = C11889d.f28481;
                            cArr2[i7] = (char) (cArr2[i7] - f29900);
                            C11889d.f28481++;
                        }
                        if (i5 > 0) {
                            C11889d.f28478 = i5;
                            char[] cArr3 = new char[i6];
                            System.arraycopy(cArr2, 0, cArr3, 0, i6);
                            System.arraycopy(cArr3, 0, cArr2, i6 - C11889d.f28478, C11889d.f28478);
                            System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i6 - C11889d.f28478);
                        }
                        if (z) {
                            char[] cArr4 = new char[i6];
                            C11889d.f28481 = 0;
                            while (C11889d.f28481 < i6) {
                                cArr4[C11889d.f28481] = cArr2[(i6 - C11889d.f28481) - 1];
                                C11889d.f28481++;
                            }
                            cArr2 = cArr4;
                        }
                        str2 = new String(cArr2);
                    }
                    return str2;
                }
            });
            return;
        }
        C12085l.m30912(m30987((char) TextUtils.indexOf("", "", 0, 0), 11 - Process.getGidForName(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 73).intern(), m30987((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49, 1477 - View.resolveSizeAndState(0, 0, 0)).intern());
        int i4 = f29846 + 101;
        f29847 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f29847 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
        if (m31000()) {
            int i4 = f29847 + 21;
            f29846 = i4 % 128;
            int i5 = i4 % 2;
            C12085l.m30912(m30987((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, View.getDefaultSize(0, 0) + 74).intern(), m30987((char) (TextUtils.lastIndexOf("", '0') + 54772), (ViewConfiguration.getTouchSlop() >> 8) + 48, 1526 - Color.blue(0)).intern());
            return;
        }
        if (!m30947()) {
            this.f29869 = iSAdQualityConfig;
            return;
        }
        int i6 = f29847 + 57;
        f29846 = i6 % 128;
        int i7 = i6 % 2;
        C12085l.m30912(m30987((char) (MotionEvent.axisFromString("") + 1), 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 74).intern(), m30987((char) (Process.getGidForName("") + 13607), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 57, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1575).intern());
        int i8 = f29846 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29847 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ */
    private void m30952() {
        int i = 2 % 2;
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.s.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                for (ISAdQualityInitListener iSAdQualityInitListener : C12092s.m30945(C12092s.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                C12092s.m30945(C12092s.this).clear();
            }
        });
        int i2 = f29847 + 47;
        f29846 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m30996(ISAdQualityInitError iSAdQualityInitError, String str) {
        int i = 2 % 2;
        int i2 = f29846 + 79;
        f29847 = i2 % 128;
        if (i2 % 2 == 0) {
            m30966(this.f29855, iSAdQualityInitError, str);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        m30966(this.f29855, iSAdQualityInitError, str);
        int i3 = f29846 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29847 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m30966(final Set<ISAdQualityInitListener> set, final ISAdQualityInitError iSAdQualityInitError, final String str) {
        int i = 2 % 2;
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.s.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                    }
                }
                set.clear();
            }
        });
        int i2 = f29846 + 105;
        f29847 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private boolean m30982(ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        if (this.f29869 != null) {
            try {
                String str = iSAdQualityConfig.getMetaData().get(m30987((char) KeyEvent.getDeadChar(0, 0), (Process.myTid() >> 22) + 13, (Process.myPid() >> 22) + 1032).intern());
                if (!TextUtils.isEmpty(str)) {
                    boolean zOptBoolean = new JSONObject(str).optBoolean(m30987((char) (Color.alpha(0) + 51052), 22 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1633).intern());
                    int i2 = f29847 + 89;
                    f29846 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 63 / 0;
                    }
                    return zOptBoolean;
                }
            } catch (Throwable unused) {
            }
            return false;
        }
        int i4 = f29846 + 29;
        f29847 = i4 % 128;
        return i4 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30987(char c, int i, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i) {
                cArr[C11862c.f28048] = (char) ((((long) f29848[C11862c.f28048 + i2]) ^ (((long) C11862c.f28048) * f29849)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
