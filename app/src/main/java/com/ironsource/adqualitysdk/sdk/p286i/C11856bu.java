package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.amazon.device.ads.DTBAdView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.NativeAdLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoAutomaticListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.InterstitialActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bu */
/* JADX INFO: loaded from: classes6.dex */
public final class C11856bu extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27917 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f27918 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f27919;

    /* JADX INFO: renamed from: ﾒ */
    private static long f27920;

    static {
        char[] cArr = new char[1642];
        ByteBuffer.wrap("ÐDMöëT\bÂ¦3Ã±a\u0000\u009e\u0086<ÌZx÷Î\u0015N²½Ð=M\u0099þäcIÅ÷&d\u0088\u0095í\fO·°-\u0012Háø|EÚ÷9|\u0097\u008dò\u0001P±¯ \rVkÐÆP$ã\u0083\u0003á\u008f|#Ú\u00ad8ß\u0097cÎ\u009eS\u0003õ²\u0016`¸ÐÝZ\u007fô\u0080d\"\u0006D\u008bé\"\u000b´¬RÎÅS=õñ\u0017\u0089¸7Úá\u007f]\u0081Æ\"vDÿæ\u0088\u000b\n\u00ad¸Î+PÓõS\u0017¾¸@Ú\u001d|³\u00818#ÍDAæõ\u000bd\u00ad\u001eÏ\u0098P\u0014ò§\u0017C¹ÏÚg|é\u009e\u0087#\u001bYßÄibÀ\u0081@/ J0è\u0084\u0017\bµjÓæ~]\u009cÁ;\u001bY¨Ä\fb\u0080\u0080ð/^MÐè,ÕoHòîC\r\u0091£!Æ«d\u0005\u009b\u00959÷_zòÓ\u0010E·£Õ4HÌî\u0000\fx£ÆÁ\u0010d¬\u009a79\u0087_\u000eýy\u0010û¶IÕÚK\"î¢\fO£»ÁígX\u009aØ8<_¬ý\u001c\u0010\u0090¶þÔrKÅéY\f\u0087¢4Á\u0094g\u0018\u0085t8ú^Hý´4i©Ç\u000faìûB7'\u0081\u0085,z\u0090ØÍ¾K\u0013åñkV\u00834\u000f©±\u0000c\u009dþ;OØ\u009dv-\u0013§±\tN\u0099ìû\u008av'ßÅIb¯\u00008\u009dÀ;\fÙtvÊ\u0014\u001c± O;ì\u008b\u008a\u0002(uÅ÷cE\u0000Ö\u009e.;®ÙCv±\u0014ÿ²EOßí\u0017\u008a¡(\bÅ´cå\u0001c\u009eÁ<OÙ£w/\u0014\u0095\u0000I\u009dã;MØÝv\u0017\u0013º±\u0013N\u0085ìë\u008a|'èÅZb¢\u00003\u009d\u008b;\rÙ\\vÀ\u0014K±¬O!ì\u0091\u0000c\u009dþ;OØ\u009dv-\u0013§±\tN\u0099ìû\u008av'ßÅIb¯\u00008\u009dÀ;\u0012ÙuvÅ\u0014[±¢O ì\u008c\u008a\u0019(iÅëcM\u0000Ñ\u009ee;\u0095Ù\u001fv\u0091\u0014á²sOÞí7\u008a¡(\u0007Å\u0090cÄ\u0001v\u009eÆ<WÙ¯w)\u0014 ²\u001cPwíð\u008bE(µ\u0000B\u009dð;LØÝv!\u0013§±5N\u009aìé\u008aj'ÂÅwb¥\u0000.\u009d\u009a;\u001aÙ~vÄ\u0014@\u0000I\u009dã;MØÝv\u0017\u0013º±\u0013N\u0085ìë\u008a|Z\u0001Ç´a\u001a\u0082\u0089,iIîë]\u0014Ö¶¯Ð?}¦\u009f\u00128ðZtù\u0086d3Â\u009d!\u000e\u008fîêiHÚ·Q\u0015(s¸Þ!<\u0095\u009bwùódmÂÙ ¬\u008f\u001aí\u0098Hb¶þ\u0015X\u0000D\u009dÅ;`Øòv \u0013\u0083±\u000fN\u0092ìÿ\u0000c\u009dþ;OØ\u009dv%\u0013¸±\u0007N\u008dìç\u008aw'\u0084Å_b©\u0000+\u009d\u0087;\u001cÙuv\u008f\u0014S±§O'ìË\u008a2(SÅÚch\u0000Þ\u009e\u001d;µÙ\bv\u0089r\u0083ï;I\u009bª\u0019\u0004çaJÃÅ<Y\u009e>ø\u0094U\u0004·\u009a\u0010mr÷ïSIü«¶\u0004\u001df\u0089Ãi=õ\u009eOøË6ã«[\rûîy@\u0087%*\u0087¥x9Ú^¼ÿ\u0011kóàT\u00066\u0080«2\r¤ïÖ@z\"ô\u0087\ry\u0097Ú\u0006¼°\u001eÛóCUã6{¨\u0081\r\u0001\u0006¸\u009b\u0000= Þ\"pÜ\u0015q·þHbê\u0005\u008c¿!;Ã¸dY\u0006Û\u009b~=îß\u0080p\u0003\u0012¯·SIÅê~\u008cÃ.\u0086Ã\u0018e²\u0006#\u0098Þ=\\ßðpi\u00127´½I6ëÂ\u008cB.þÃde\u0000\u0000L\u009dô;TØÖv(\u0013\u0085±\nN\u0096ìñ\u008aK'ÏÅLb\u00ad\u0000/\u009d\u008a;\u001aÙtv÷\u0014[±§O1ì\u008a\u008a:(nÅëc]\u0000ß\u009e%;¹Ù\u001f¤\u001a9¢\u009f\u0002|\u0080Ò~·Ó\u0015\\êÀH§.\u001d\u0083\u0099a\u001aÆû¤y9Ü\u009fL}\"Ò¡°\r\u0015ñëgHÜ.m\u008c0a Ç\n¤\u008d:q\u009fÆ}RÒÛ°\u00ad\u0016\u0013ë\u0089Iq.÷\u0000A\u009dõ;kØÝv\"\u0013ºÌsQË÷k\u0014éº\u0017ßº}5\u0082© ÎFhëô\tp®\u009aÌ\u0014Q´÷\u0001\u0015Kw\u001bê¥L\u0003¯\u008f\u0001gdåÆr9Æ\u009b\u0091ý-P\u0086²\u0001\u0015ìw|\u0000L\u009dô;TØÖv(\u0013\u0085±\nN\u0096ìñ\u008aW'ËÅOb¥\u0000+\u009d\u008b;>Ùtví\u0014[±°O ì\u0080\u008a\u0018(bÅêRéÏQiñ\u008as$\u008dA ã¯\u001c3¾TØñuj\u0097ú0\u0000R\u0099Ï\u001di³\u008bÐ$scæþRXä»d\u0015\u0097p\u0017Ò³-\u001e\u008fNéÊDd¦ê\u0001\u000ec»þ-X\u009cºÖ\u0015rwô\u0000N\u009dð;VØÚv2\u0013°±'N\u0093ìÞ\u008ap'ÏÅLb\u0084\u00002\u009d\u0082;\u001bÙuvÓ\u0000I\u009dÿ;VØÖv6\u0013»±\u0007N\u009bìÆ\u008ax'ÞÅRbº\u00008\u009d¯;\u001bÙ\\vÈ\u0014A±·O1ì\u008b\u008a\u0013(uFÈÛv}Ð\u009e\\0´U6÷¡\b\u0015ªOÌûaM\u0083Í$>F¾Û\u001a}°\u009fø0SRÑ÷7\t´ª\u0002Ì\u0093nä\u0000N\u009dð;VØÚv2\u0013°±'N\u0093ìÌ\u008ax'ÞÅZb\u0085\u00003\u009d\u009a;\u001aÙbvÇ\u0014S± O1\u0000N\u009dð;VØÚv2\u0013°±'N\u0093ìÁ\u008aw'ÞÅ^b¾\u0000<\u009d\u008d;\u000bÙyvÎ\u0014\\±\u008fO=ì\u0096\u008a\u0002(bÅöcL\u0000È\u0000N\u009dð;VØÚv2\u0013°±'N\u0093ìÁ\u008aw'ÞÅ^b¾\u0000;\u009d\u008f;\u001cÙu\u0000N\u009dð;VØÚv2\u0013°±'N\u0093ìÄ\u008av'ËÅ_b\u0080\u00004\u009d\u009d;\u000bÙuvÏ\u0014W±±¤L9ò\u009fT|ØÒ0·²\u0015%ê\u0091HÙ.v\u0083ÉaJÆ¦¤\u00139\u0085\u009f\u000e}fÒÆ°^\u0015¤ë$\u0099{\u0004Å¢cAïï\u0007\u008a\u0085(\u0012×¦uë\u0013E¾ú\\yû»\u0099\u0001\u0004µ¢.@@ïæ\u008dN(\u0098Ö\u0015uµ\u00131±T\\Ìú\u007f\u0099ê\u0000A\u009dõ;fØÒv0\u0013´\u0000L\u009dô;TØÖv(\u0013\u0085±\nN\u0096ìñ\u008aX'ÎÅrb¢\u0000;\u009d\u0081\u0000L\u009dô;TØÖv(\u0013\u0085±\nN\u0096ìñ\u008a['ËÅUb¢\u00008\u009d\u009c;>Ùtv÷\u0014[±¦O#6;«¦\r\u0017îÅ@i%ã\u0087WxÛÚ©¼r\u0011\u0096óMTù6`«Ò\rNï)@\u008d\"\u0003\u0087ôybÚ\u0093¼L\u001e>ó®U\u001f6\u0087¨a\rªïy@Ã\"¡\u0084\u001dy\u0085ÛJ¼ç\u001e]óÔU\u009c7.¨\u009e\n\u000fï÷Aq\"õ\u0084Af\u0000Û®½\r\u001eî¶Ë+s\u008dÓnQÀ¯¥\u0002\u0007\u008dø\u0011Zv<Ü\u0091LsÒÔ%¶¿+\u001b\u008d¹oóÀp¢Ü\u0007!ù¤Z.<\u0098\u009eóskÕË¶S(©\u008d)\"\u008b¿!\u0019\u008fú\u001fTÕ1x\u0093ÑlGÎ)¨¾\u0005)ç\u009d@}\"Ù¿C\u0019Ïû¿T\u00026\u0084p\rí¿K\u0003¨\u0092\u0006ncèÁh>Ü\u009c\u008eú8W\u0083µ\u001b\u0000B\u009dð;LØÝv!\u0013§±'N\u0093ìÚ\u008a|'ÛÅNb©\u0000.\u009d\u009a\u0000B\u009dð;LØÝv!\u0013§±'N\u0093ìÞ\u008ap'ÏÅLð\u0001m\u009cË-(ÿ\u0086SãÙAm¾á\u001c\u0093zH×¬5w\u0092ÇðMmãËs)\u0001\u0086¬ä%AÓ¿U\u001câzuØ\u00015\u0089\u0093eðºnHËÐ)a\u0086ùä\u009fBl¿\u0091\u001dAzßØh5ò\u0093\u0096ñ4n®Ì\r)Á\u0087\\äù\u0005F\u0098ô>HÝÙs%\u0016£´#K\u0097éÚ\u008ft\"ËÀHg\u0084\u00050\u0098\u0099>\u000fÜqsË\u0011S´µÆ°[\u0006ý¯\u001e/°ÏÕ_wë\u0088g*\u0005L\u0089á2\u0003®¤tÆÀ\u0000I\u009dÿ;VØÖv6\u0013¦±\u0012N\u009eìü\u008ap'ËÅWb\u008d\u00009\u009d§;\u0011ÙvvÎh õ\u0016S¿°?\u001eß{OÙû&w\u0084\u0015â\u0099O\"\u00ad¾\ndhÐõKSÿ±\u008a\u001e<|¾ÙD'Ø\u0084~\u0017æ\u008aP,ùÏya\u0099\u0004\t¦½Y1ûS\u009dß0dÒøu\"\u0017\u0096\u008a\u0013,µÎÎa{\u0003ø¦\u001fX\u008f¢!?\u0087\u0099&z¡ÔE±Â\u0013pìàNº(\u000e\u0000R\u009dô;UØÒv6\u0013±±\u0003N\u0093ìÉ\u008a}'ãÅUbª\u00002\u0000R\u009dô;UØÒv6\u0013±±\u0003N\u0093ìÉ\u008a}'æÅRb¿\u0000)\u009d\u008b;\u0011ÙuvÓ\u0000R\u009dô;UØÒv6\u0013±±\u0003N\u0093ìÉ\u008a}'øÅ^b½\u0000(\u009d\u008b;\fÙdÜèAPçð\u0004rª\u008cÏ!m®\u009220UVôû`\u0019ë¾\rÜ\u008bA9ç¯\u0005ÝªqÈÿm\u0006\u0093\u009c0\u0000V¶L&Ñ\u009ew>\u0094¼:B_ïý`\u0002ü \u009bÆ:k®\u0089%.ÃLEÑ÷wa\u0095\u0013:¿X1ýÈ\u0003R ÎÆxd!\u0089\u009b/0L¤ÒDwØ\u0095b:æ\u0000L\u009dô;TØÖv(\u0013\u0085±\nN\u0096ìñ\u008aK'ÏÅLb\u00ad\u0000/\u009d\u008a;\u001aÙtvà\u0014V\"\u0093¿+\u0019\u008bú\tT÷1Z\u0093ÕlIÎ.¨\u0094\u0005\u0010ç\u0093@r\"ð¿U\u0019Åû«T?6\u0089\u0093PmâÎI¨Ý\n½ç)A\u0093\"\u0017\u0000L\u009dô;TØÖv(\u0013\u0085±\nN\u0096ìñ\u008aK'ÏÅLb\u00ad\u0000/\u009d\u008aå\u0016x®Þ\u000e=\u008c\u0093rößTP«Ì\t«o\nÂ\u009d \u0011\u0087äåbxÇÞV<#\u0093\u0094ñ\u0006TÝªo\tËoM\u0000L\u009dô;TØÖv(\u0013\u0085±\nN\u0096ìñ\u008aP'ÇÅKb¾\u00008\u009d\u009d;\fÙyvÎ\u0014\\±\u0087O5ì\u0091\u008a\u0017(KÅñcZ\u0000Î\u009e.;²Ù\bv\u008c\u0000g\u009dô;VØãv(\u0013´±\u0005N\u0092ìå\u008a|'ÄÅOb\u0082\u0000<\u009d\u0083;\u001a\u0000g\u009dô;VØñv%\u0013»±\bN\u0092ìú\u008aU'ËÅBb£\u0000(\u009d\u009a;/Ù|vÀ\u0014Q±¦O9ì\u0080\u008a\u0018(sÅÖcH\u0000×\u009e.\u0000g\u009dô;VØúv)\u0013¥±\u0014N\u0092ìû\u008aj'ÃÅTb¢\u0000\u0019\u009d\u008f;\u000bÙqvë\u0014A±¬O:xråæCU é\u000e:k¶É\u00076\u0081\u0094èòy_Ð½G\u001a±x\nå\u009cC\u0018¡b\u000eþlHÉ£73\u0094\u0093ò\u000bPq½ù³;.½\u0088\u0006k\u0095Å{ ù\u0002fýÓ_±9\"\u0094\u0086v\u0001Ñö³}.È\u0088Xj\u001dÅ\u0089§\u000f\u0002ëüQ_Å9L\u009b:v´Ð\u000e³\u0096-p\u0017³\u008a ,\u0082Ï+aõ\u0004w¦×YOû\f\u009d¡0\u001fÒ\u0096uQ\u0017ä\u008aJ,ÙÎ¡a\u0006\u0003\u0095¦~Xïû_\u009dæ?²Ò8t\u009c\u0017$\u0089ì,gÎ×\u0019\u000b\u0084\u009f\",Á\u0095oK\nÉ¨iWñõ²\u0093\u001f>¡Ü({ï\u0019Z\u0084ô\"gÀ\u001fo¸\r+¨ÀVQõá\u0093P1\u0004Ü\u0081z7\u0019µ\u0087O\"ÓÀu\u0000r\u009dô;OØÜv2\u0013°±*N\u0092ìþ\u008a|'ÆÅkb \u0000<\u009d\u0097;6Ù}vÑ\u0014@±¦O'ì\u0096\u008a\u001f(hÅöce\u0000Ó\u009e8;¨Ù\bv\u0090\u0014ê²R\u0000s\u009dô;VØýv%\u0013¡±\u000fN\u0081ìí\u008aX'ÎÅwb¥\u0000.\u009d\u009a;\u001aÙ~vÄ\u0014@\u0000g\u009dô;VØàv!\u0013§±\u0010N\u0092ìú\u008a]'ËÅOb\u00ad".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1642);
        f27919 = cArr;
        f27920 = 3244306851544276369L;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m29260(IronSourceBannerLayout ironSourceBannerLayout) {
        int i = 2 % 2;
        int i2 = f27918 + 75;
        f27917 = i2 % 128;
        if (i2 % 2 != 0) {
            m29268(ironSourceBannerLayout);
            throw null;
        }
        String strM29268 = m29268(ironSourceBannerLayout);
        int i3 = f27917 + 47;
        f27918 = i3 % 128;
        int i4 = i3 % 2;
        return strM29268;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m29264(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f27918 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        m29266(impressionDataListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m29267(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i = 2 % 2;
        int i2 = f27917 + 109;
        f27918 = i2 % 128;
        int i3 = i2 % 2;
        m29265(levelPlayImpressionDataListener);
        int i4 = f27917 + 73;
        f27918 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m29271(AdData adData) {
        int i = 2 % 2;
        int i2 = f27918 + 21;
        f27917 = i2 % 128;
        if (i2 % 2 != 0) {
            m29261(adData);
            throw null;
        }
        String strM29261 = m29261(adData);
        int i3 = f27917 + 109;
        f27918 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
        return strM29261;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m29272(Placement placement) {
        int i = 2 % 2;
        int i2 = f27918 + 1;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        String strM29262 = m29262(placement);
        int i4 = f27917 + 19;
        f27918 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM29262;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ JSONObject m29273(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27917 + 67;
        f27918 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM29263 = m29263(impressionData);
        int i4 = f27917 + 33;
        f27918 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return jSONObjectM29263;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ JSONObject m29274(LevelPlayImpressionData levelPlayImpressionData) {
        int i = 2 % 2;
        int i2 = f27917 + 49;
        f27918 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM29277 = m29277(levelPlayImpressionData);
        int i4 = f27917 + 83;
        f27918 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectM29277;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m29275(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i = 2 % 2;
        int i2 = f27918 + 19;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        m29280(levelPlayImpressionDataListener);
        int i4 = f27918 + 97;
        f27917 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m29278(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i = 2 % 2;
        int i2 = f27918 + 45;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        m29269(levelPlayNativeAd, levelPlayNativeAdListener);
        int i4 = f27918 + 35;
        f27917 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m29279(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f27918 + 13;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        m29270(impressionDataListener);
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f27917 + 79;
        f27918 = i4 % 128;
        int i5 = i4 % 2;
    }

    public C11856bu(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:102:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:103:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:105:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:106:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:108:0x0513  */
    /* JADX WARN: Code duplicated, block: B:109:0x0517  */
    /* JADX WARN: Code duplicated, block: B:10:0x004d  */
    /* JADX WARN: Code duplicated, block: B:111:0x053e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0542  */
    /* JADX WARN: Code duplicated, block: B:114:0x0567  */
    /* JADX WARN: Code duplicated, block: B:115:0x0575  */
    /* JADX WARN: Code duplicated, block: B:117:0x0594  */
    /* JADX WARN: Code duplicated, block: B:118:0x0598  */
    /* JADX WARN: Code duplicated, block: B:120:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:121:0x05be  */
    /* JADX WARN: Code duplicated, block: B:123:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:124:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:126:0x060f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0612  */
    /* JADX WARN: Code duplicated, block: B:129:0x0639  */
    /* JADX WARN: Code duplicated, block: B:12:0x006e  */
    /* JADX WARN: Code duplicated, block: B:130:0x063d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0661  */
    /* JADX WARN: Code duplicated, block: B:133:0x0665  */
    /* JADX WARN: Code duplicated, block: B:135:0x0687  */
    /* JADX WARN: Code duplicated, block: B:136:0x068b  */
    /* JADX WARN: Code duplicated, block: B:138:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:139:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:13:0x0072  */
    /* JADX WARN: Code duplicated, block: B:141:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:144:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:145:0x070b  */
    /* JADX WARN: Code duplicated, block: B:147:0x072e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0731  */
    /* JADX WARN: Code duplicated, block: B:150:0x075a  */
    /* JADX WARN: Code duplicated, block: B:151:0x075e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0780  */
    /* JADX WARN: Code duplicated, block: B:156:0x078e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0791  */
    /* JADX WARN: Code duplicated, block: B:159:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:15:0x0093  */
    /* JADX WARN: Code duplicated, block: B:160:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:162:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:163:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:165:0x080b  */
    /* JADX WARN: Code duplicated, block: B:166:0x080f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0833  */
    /* JADX WARN: Code duplicated, block: B:169:0x0837  */
    /* JADX WARN: Code duplicated, block: B:16:0x0097  */
    /* JADX WARN: Code duplicated, block: B:171:0x085d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0861  */
    /* JADX WARN: Code duplicated, block: B:174:0x0884  */
    /* JADX WARN: Code duplicated, block: B:175:0x0888  */
    /* JADX WARN: Code duplicated, block: B:177:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:178:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:180:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:181:0x08db  */
    /* JADX WARN: Code duplicated, block: B:183:0x0902  */
    /* JADX WARN: Code duplicated, block: B:184:0x0905  */
    /* JADX WARN: Code duplicated, block: B:186:0x0929  */
    /* JADX WARN: Code duplicated, block: B:187:0x092c  */
    /* JADX WARN: Code duplicated, block: B:189:0x094d  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:190:0x0951  */
    /* JADX WARN: Code duplicated, block: B:192:0x0970  */
    /* JADX WARN: Code duplicated, block: B:193:0x0974  */
    /* JADX WARN: Code duplicated, block: B:195:0x0997  */
    /* JADX WARN: Code duplicated, block: B:196:0x099b  */
    /* JADX WARN: Code duplicated, block: B:198:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:199:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:201:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:202:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:204:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:206:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:207:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:24:0x0102  */
    /* JADX WARN: Code duplicated, block: B:25:0x0106  */
    /* JADX WARN: Code duplicated, block: B:27:0x0126  */
    /* JADX WARN: Code duplicated, block: B:28:0x012a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0152  */
    /* JADX WARN: Code duplicated, block: B:323:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0160  */
    /* JADX WARN: Code duplicated, block: B:340:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0163  */
    /* JADX WARN: Code duplicated, block: B:350:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0185  */
    /* JADX WARN: Code duplicated, block: B:370:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0189  */
    /* JADX WARN: Code duplicated, block: B:380:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x01af  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:46:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x021d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0220  */
    /* JADX WARN: Code duplicated, block: B:51:0x0243  */
    /* JADX WARN: Code duplicated, block: B:52:0x0247  */
    /* JADX WARN: Code duplicated, block: B:54:0x0269  */
    /* JADX WARN: Code duplicated, block: B:55:0x026d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0290  */
    /* JADX WARN: Code duplicated, block: B:58:0x0293  */
    /* JADX WARN: Code duplicated, block: B:60:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0300  */
    /* JADX WARN: Code duplicated, block: B:67:0x0304  */
    /* JADX WARN: Code duplicated, block: B:69:0x032b  */
    /* JADX WARN: Code duplicated, block: B:70:0x032f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0351  */
    /* JADX WARN: Code duplicated, block: B:73:0x0355  */
    /* JADX WARN: Code duplicated, block: B:75:0x0375  */
    /* JADX WARN: Code duplicated, block: B:76:0x0379  */
    /* JADX WARN: Code duplicated, block: B:78:0x0399  */
    /* JADX WARN: Code duplicated, block: B:79:0x039d  */
    /* JADX WARN: Code duplicated, block: B:81:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:82:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x040f  */
    /* JADX WARN: Code duplicated, block: B:88:0x041d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0443  */
    /* JADX WARN: Code duplicated, block: B:93:0x0469  */
    /* JADX WARN: Code duplicated, block: B:96:0x0477  */
    /* JADX WARN: Code duplicated, block: B:97:0x047b  */
    /* JADX WARN: Code duplicated, block: B:99:0x04a0  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo28808(String str) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = f27917 + 107;
        f27918 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
            switch (str.hashCode()) {
                case -2063883567:
                    if (str.equals(m29276(TextUtils.lastIndexOf("", '0', 0) + IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, (char) (21157 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.getCapsMode("", 0, 0) + 18).intern())) {
                        b = -1;
                    } else {
                        i = f27918 + 99;
                        f27917 = i % 128;
                        if (i % 2 != 0) {
                            b = Ascii.f22491EM;
                        } else {
                            b = 8;
                        }
                    }
                    break;
                case -2054763962:
                    if (str.equals(m29276((ViewConfiguration.getPressedStateDuration() >> 16) + 591, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 25 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                        b = -1;
                    } else {
                        b = 24;
                    }
                    break;
                case -2044561387:
                    if (str.equals(m29276(719 - TextUtils.indexOf("", ""), (char) View.getDefaultSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 21).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22498RS;
                    }
                    break;
                case -2012752057:
                    if (str.equals(m29276((Process.myTid() >> 22) + 1230, (char) (56484 - View.MeasureSpec.makeMeasureSpec(0, 0)), 23 - View.resolveSize(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 55;
                    }
                    break;
                case -1879025222:
                    if (str.equals(m29276(357 - Color.red(0), (char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf("", "", 0, 0) + 9).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22500SO;
                    }
                    break;
                case -1810844504:
                    if (str.equals(m29276(1076 - KeyEvent.keyCodeFromString(""), (char) (1284 - (Process.myTid() >> 22)), Gravity.getAbsoluteGravity(0, 0) + 20).intern())) {
                        b = -1;
                    } else {
                        b = 46;
                    }
                    break;
                case -1704786309:
                    if (str.equals(m29276(90 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.alpha(0) + 22934), 20 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case -1678289205:
                    if (str.equals(m29276((ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 52989), ExpandableListView.getPackedPositionChild(0L) + 49).intern())) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1555060867:
                    if (str.equals(m29276((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1302, (char) (8928 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 'K' - AndroidCharacter.getMirror('0')).intern())) {
                        b = -1;
                    } else {
                        b = 58;
                    }
                    break;
                case -1406023077:
                    if (str.equals(m29276(111 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (54540 - Color.blue(0)), View.resolveSize(0, 0) + 50).intern())) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case -1282106699:
                    if (str.equals(m29276(894 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (TextUtils.getTrimmedLength("") + 13912), TextUtils.getTrimmedLength("") + 50).intern())) {
                        b = -1;
                    } else {
                        b = 39;
                    }
                    break;
                case -1276273849:
                    if (str.equals(m29276(335 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (63951 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22490CR;
                    }
                    break;
                case -1115843213:
                    if (str.equals(m29276(321 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 23112), ImageFormat.getBitsPerPixel(0) + 15).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22492FF;
                    }
                    break;
                case -1088585376:
                    if (str.equals(m29276(943 - TextUtils.lastIndexOf("", '0', 0), (char) (46727 - View.getDefaultSize(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 29).intern())) {
                        b = -1;
                    } else {
                        b = 40;
                    }
                    break;
                case -989825485:
                    if (str.equals(m29276(634 - (Process.myPid() >> 22), (char) (25512 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0) + 19).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.SUB;
                    }
                    break;
                case -838208757:
                    if (str.equals(m29276((ViewConfiguration.getTouchSlop() >> 8) + 653, (char) View.resolveSize(0, 0), 18 - View.resolveSize(0, 0)).intern())) {
                        b = -1;
                    } else {
                        int i8 = f27917 + 59;
                        f27918 = i8 % 128;
                        int i9 = i8 % 2;
                        b = Ascii.ESC;
                    }
                    break;
                case -643050252:
                    if (str.equals(m29276(View.MeasureSpec.makeMeasureSpec(0, 0) + 175, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 45).intern())) {
                        b = -1;
                    } else {
                        i2 = f27918 + 105;
                        f27917 = i2 % 128;
                        if (i2 % 2 != 0) {
                            b = 7;
                        } else {
                            b = 35;
                        }
                    }
                    break;
                case -609786639:
                    if (str.equals(m29276((ViewConfiguration.getTapTimeout() >> 16) + 1171, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41587), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 51;
                    }
                    break;
                case -559540471:
                    if (str.equals(m29276(AndroidCharacter.getMirror('0') + 440, (char) (ViewConfiguration.getPressedStateDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 30).intern())) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case -498709917:
                    if (str.equals(m29276((ViewConfiguration.getLongPressTimeout() >> 16) + 1128, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26857), View.combineMeasuredStates(0, 0) + 22).intern())) {
                        b = -1;
                    } else {
                        int i10 = f27917 + 75;
                        f27918 = i10 % 128;
                        int i11 = i10 % 2;
                        b = 49;
                    }
                    break;
                case -498060603:
                    if (str.equals(m29276(KeyEvent.normalizeMetaState(0) + 15, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65204), Process.getGidForName("") + 10).intern())) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -393802555:
                    if (str.equals(m29276(TextUtils.indexOf("", "", 0) + 1195, (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18).intern())) {
                        b = -1;
                    } else {
                        b = 53;
                    }
                    break;
                case -284636416:
                    if (str.equals(m29276(1004 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 15).intern())) {
                        b = -1;
                    } else {
                        b = 43;
                    }
                    break;
                case -154075626:
                    if (str.equals(m29276((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 804, (char) (TextUtils.getOffsetAfter("", 0) + 41986), ExpandableListView.getPackedPositionType(0L) + 21).intern())) {
                        b = -1;
                    } else {
                        b = 34;
                    }
                    break;
                case -153002112:
                    if (!(!str.equals(m29276(1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (61538 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 45 - TextUtils.getOffsetAfter("", 0)).intern()))) {
                        b = -1;
                    } else {
                        b = 45;
                    }
                    break;
                case 30304559:
                    if (str.equals(m29276(517 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 42070), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37).intern())) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case 85893348:
                    if (str.equals(m29276(973 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8898), 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 41;
                    }
                    break;
                case 149942051:
                    if (str.equals(m29276((Process.myPid() >> 22) + 311, (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22503VT;
                    }
                    break;
                case 204617641:
                    if (str.equals(m29276(TextUtils.lastIndexOf("", '0') + 1285, (char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19).intern())) {
                        b = -1;
                    } else {
                        b = 57;
                    }
                    break;
                case 204897024:
                    if (str.equals(m29276((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1149, (char) (6064 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21).intern())) {
                        b = -1;
                    } else {
                        int i12 = f27918 + 7;
                        f27917 = i12 % 128;
                        int i13 = i12 % 2;
                        b = 50;
                    }
                    break;
                case 307677661:
                    if (str.equals(m29276(992 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 28751), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12).intern())) {
                        b = -1;
                    } else {
                        b = 42;
                    }
                    break;
                case 308060116:
                    if (str.equals(m29276(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1020, (char) KeyEvent.keyCodeFromString(""), 12 - View.combineMeasuredStates(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 44;
                    }
                    break;
                case 320151695:
                    if (str.equals(m29276(TextUtils.getCapsMode("", 0, 0) + 1096, (char) (50937 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 13 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b = -1;
                    } else {
                        b = 47;
                    }
                    break;
                case 334118616:
                    if (str.equals(m29276(397 - Gravity.getAbsoluteGravity(0, 0), (char) (29391 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 23 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 663296747:
                    if (str.equals(m29276((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, (char) (57786 - ((byte) KeyEvent.getModifierMetaStateMask())), 17 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 766880816:
                    if (str.equals(m29276(TextUtils.getOffsetAfter("", 0) + 825, (char) (39220 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 27).intern())) {
                        b = -1;
                    } else {
                        i3 = f27918 + 7;
                        f27917 = i3 % 128;
                        if (i3 % 2 != 0) {
                            b = 35;
                        } else {
                            b = 52;
                        }
                    }
                    break;
                case 779287609:
                    if (!str.equals(m29276(Process.getGidForName("") + Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (-16777194) - Color.rgb(0, 0, 0)).intern())) {
                        b = 8;
                    } else {
                        b = -1;
                    }
                    break;
                case 823061407:
                    if (str.equals(m29276((-16776449) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17).intern())) {
                        b = -1;
                    } else {
                        int i14 = f27918 + 85;
                        f27917 = i14 % 128;
                        int i15 = i14 % 2;
                        b = 32;
                    }
                    break;
                case 846220331:
                    if (!(!str.equals(m29276(View.getDefaultSize(0, 0) + 1345, (char) (Color.rgb(0, 0, 0) + 16835930), 23 - TextUtils.indexOf("", "", 0)).intern()))) {
                        b = -1;
                    } else {
                        b = 60;
                    }
                    break;
                case 894546539:
                    if (str.equals(m29276((Process.myPid() >> 22) + 671, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 24).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22493FS;
                    }
                    break;
                case 1052532031:
                    if (str.equals(m29276(1181 - View.getDefaultSize(0, 0), (char) TextUtils.getCapsMode("", 0, 0), 14 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                        b = -1;
                    } else {
                        b = 52;
                    }
                    break;
                case 1069602180:
                    if (str.equals(m29276(View.resolveSize(0, 0) + 695, (char) (18054 - View.resolveSizeAndState(0, 0, 0)), ExpandableListView.getPackedPositionType(0L) + 24).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22494GS;
                    }
                    break;
                case 1081984916:
                    if (str.equals(m29276(KeyEvent.getDeadChar(0, 0) + 784, (char) (ViewConfiguration.getEdgeSlop() >> 16), 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 1180349927:
                    if (str.equals(m29276(((Process.getThreadPriority(0) + 20) >> 6) + 242, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 51 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1226831433:
                    if (str.equals(m29276(858 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 37;
                    }
                    break;
                case 1266525324:
                    if (str.equals(m29276(873 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (Process.getGidForName("") + 1), 21 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 38;
                    }
                    break;
                case 1267145181:
                    if (str.equals(m29276(1110 - ExpandableListView.getPackedPositionGroup(0L), (char) View.getDefaultSize(0, 0), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 48;
                    }
                    break;
                case 1304950957:
                    if (str.equals(m29276(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0, 0) + 53253), 15 - View.resolveSize(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1325013503:
                    if (str.equals(m29276((Process.myPid() >> 22) + 1368, (char) KeyEvent.keyCodeFromString(""), 31 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = Base64.padSymbol;
                    }
                    break;
                case 1432059210:
                    if (str.equals(m29276((ViewConfiguration.getScrollBarSize() >> 8) + 449, (char) (1780 - (Process.myPid() >> 22)), 39 - View.resolveSize(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 1517126868:
                    if (str.equals(m29276(160 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13350), Color.blue(0) + 15).intern())) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1628896204:
                    if (str.equals(m29276(740 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 27 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22502US;
                    }
                    break;
                case 1715808775:
                    if (str.equals(m29276(1330 - ((Process.getThreadPriority(0) + 20) >> 6), (char) KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 15).intern())) {
                        b = -1;
                    } else {
                        b = 59;
                    }
                    break;
                case 1773831812:
                    if (str.equals(m29276(MotionEvent.axisFromString("") + 578, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 30549), TextUtils.getOffsetAfter("", 0) + 14).intern())) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 1870849118:
                    if (!(!str.equals(m29276(1214 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getSize(0) + 17).intern()))) {
                        b = -1;
                    } else {
                        b = 54;
                    }
                    break;
                case 1910059890:
                    if (str.equals(m29276((ViewConfiguration.getJumpTapTimeout() >> 16) + 560, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52287), (Process.myPid() >> 22) + 17).intern())) {
                        b = -1;
                    } else {
                        i4 = f27917 + 47;
                        f27918 = i4 % 128;
                        if (i4 % 2 == 0) {
                            b = 22;
                        } else {
                            b = 9;
                        }
                    }
                    break;
                case 1910219460:
                    if (str.equals(m29276((ViewConfiguration.getEdgeSlop() >> 16) + 292, (char) Color.red(0), 19 - TextUtils.getOffsetBefore("", 0)).intern())) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 1955369613:
                    if (str.equals(m29276(TextUtils.getOffsetBefore("", 0) + 852, (char) (Process.myPid() >> 22), 6 - Color.green(0)).intern())) {
                        b = -1;
                    } else {
                        b = 36;
                    }
                    break;
                case 1955530641:
                    if (str.equals(m29276(553 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                case 2019413793:
                    if (str.equals(m29276(Color.red(0) + 366, (char) (ViewConfiguration.getEdgeSlop() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 32).intern())) {
                        b = -1;
                    } else {
                        b = 15;
                    }
                    break;
                case 2019599576:
                    if (str.equals(m29276(420 - View.getDefaultSize(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 14000), AndroidCharacter.getMirror('0') - 19).intern())) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 2102577435:
                    if (str.equals(m29276(Color.blue(0) + 1253, (char) (19562 - KeyEvent.getDeadChar(0, 0)), View.MeasureSpec.getMode(0) + 31).intern())) {
                        b = -1;
                    } else {
                        b = 56;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -2063883567:
                    if (str.equals(m29276(TextUtils.lastIndexOf("", '0', 0) + IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, (char) (21157 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.getCapsMode("", 0, 0) + 18).intern())) {
                        b = -1;
                    } else {
                        i = f27918 + 99;
                        f27917 = i % 128;
                        if (i % 2 != 0) {
                            b = Ascii.f22491EM;
                        } else {
                            b = 8;
                        }
                    }
                    break;
                case -2054763962:
                    if (str.equals(m29276((ViewConfiguration.getPressedStateDuration() >> 16) + 591, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 25 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                        b = -1;
                    } else {
                        b = 24;
                    }
                    break;
                case -2044561387:
                    if (str.equals(m29276(719 - TextUtils.indexOf("", ""), (char) View.getDefaultSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 21).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22498RS;
                    }
                    break;
                case -2012752057:
                    if (str.equals(m29276((Process.myTid() >> 22) + 1230, (char) (56484 - View.MeasureSpec.makeMeasureSpec(0, 0)), 23 - View.resolveSize(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 55;
                    }
                    break;
                case -1879025222:
                    if (str.equals(m29276(357 - Color.red(0), (char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf("", "", 0, 0) + 9).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22500SO;
                    }
                    break;
                case -1810844504:
                    if (str.equals(m29276(1076 - KeyEvent.keyCodeFromString(""), (char) (1284 - (Process.myTid() >> 22)), Gravity.getAbsoluteGravity(0, 0) + 20).intern())) {
                        b = -1;
                    } else {
                        b = 46;
                    }
                    break;
                case -1704786309:
                    if (str.equals(m29276(90 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.alpha(0) + 22934), 20 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case -1678289205:
                    if (str.equals(m29276((ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 52989), ExpandableListView.getPackedPositionChild(0L) + 49).intern())) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1555060867:
                    if (str.equals(m29276((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1302, (char) (8928 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 'K' - AndroidCharacter.getMirror('0')).intern())) {
                        b = -1;
                    } else {
                        b = 58;
                    }
                    break;
                case -1406023077:
                    if (str.equals(m29276(111 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (54540 - Color.blue(0)), View.resolveSize(0, 0) + 50).intern())) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case -1282106699:
                    if (str.equals(m29276(894 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (TextUtils.getTrimmedLength("") + 13912), TextUtils.getTrimmedLength("") + 50).intern())) {
                        b = -1;
                    } else {
                        b = 39;
                    }
                    break;
                case -1276273849:
                    if (str.equals(m29276(335 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (63951 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22490CR;
                    }
                    break;
                case -1115843213:
                    if (str.equals(m29276(321 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 23112), ImageFormat.getBitsPerPixel(0) + 15).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22492FF;
                    }
                    break;
                case -1088585376:
                    if (str.equals(m29276(943 - TextUtils.lastIndexOf("", '0', 0), (char) (46727 - View.getDefaultSize(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 29).intern())) {
                        b = -1;
                    } else {
                        b = 40;
                    }
                    break;
                case -989825485:
                    if (str.equals(m29276(634 - (Process.myPid() >> 22), (char) (25512 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0) + 19).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.SUB;
                    }
                    break;
                case -838208757:
                    if (str.equals(m29276((ViewConfiguration.getTouchSlop() >> 8) + 653, (char) View.resolveSize(0, 0), 18 - View.resolveSize(0, 0)).intern())) {
                        b = -1;
                    } else {
                        int i16 = f27917 + 59;
                        f27918 = i16 % 128;
                        int i17 = i16 % 2;
                        b = Ascii.ESC;
                    }
                    break;
                case -643050252:
                    if (str.equals(m29276(View.MeasureSpec.makeMeasureSpec(0, 0) + 175, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 45).intern())) {
                        b = -1;
                    } else {
                        i2 = f27918 + 105;
                        f27917 = i2 % 128;
                        if (i2 % 2 != 0) {
                            b = 7;
                        } else {
                            b = 35;
                        }
                    }
                    break;
                case -609786639:
                    if (str.equals(m29276((ViewConfiguration.getTapTimeout() >> 16) + 1171, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41587), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 51;
                    }
                    break;
                case -559540471:
                    if (str.equals(m29276(AndroidCharacter.getMirror('0') + 440, (char) (ViewConfiguration.getPressedStateDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 30).intern())) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case -498709917:
                    if (str.equals(m29276((ViewConfiguration.getLongPressTimeout() >> 16) + 1128, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26857), View.combineMeasuredStates(0, 0) + 22).intern())) {
                        b = -1;
                    } else {
                        int i18 = f27917 + 75;
                        f27918 = i18 % 128;
                        int i19 = i18 % 2;
                        b = 49;
                    }
                    break;
                case -498060603:
                    if (str.equals(m29276(KeyEvent.normalizeMetaState(0) + 15, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65204), Process.getGidForName("") + 10).intern())) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -393802555:
                    if (str.equals(m29276(TextUtils.indexOf("", "", 0) + 1195, (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18).intern())) {
                        b = -1;
                    } else {
                        b = 53;
                    }
                    break;
                case -284636416:
                    if (str.equals(m29276(1004 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 15).intern())) {
                        b = -1;
                    } else {
                        b = 43;
                    }
                    break;
                case -154075626:
                    if (str.equals(m29276((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 804, (char) (TextUtils.getOffsetAfter("", 0) + 41986), ExpandableListView.getPackedPositionType(0L) + 21).intern())) {
                        b = -1;
                    } else {
                        b = 34;
                    }
                    break;
                case -153002112:
                    if (!(!str.equals(m29276(1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (61538 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 45 - TextUtils.getOffsetAfter("", 0)).intern()))) {
                        b = -1;
                    } else {
                        b = 45;
                    }
                    break;
                case 30304559:
                    if (str.equals(m29276(517 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 42070), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37).intern())) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case 85893348:
                    if (str.equals(m29276(973 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8898), 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 41;
                    }
                    break;
                case 149942051:
                    if (str.equals(m29276((Process.myPid() >> 22) + 311, (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22503VT;
                    }
                    break;
                case 204617641:
                    if (str.equals(m29276(TextUtils.lastIndexOf("", '0') + 1285, (char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19).intern())) {
                        b = -1;
                    } else {
                        b = 57;
                    }
                    break;
                case 204897024:
                    if (str.equals(m29276((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1149, (char) (6064 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21).intern())) {
                        b = -1;
                    } else {
                        int i110 = f27918 + 7;
                        f27917 = i110 % 128;
                        int i111 = i110 % 2;
                        b = 50;
                    }
                    break;
                case 307677661:
                    if (str.equals(m29276(992 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 28751), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12).intern())) {
                        b = -1;
                    } else {
                        b = 42;
                    }
                    break;
                case 308060116:
                    if (str.equals(m29276(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1020, (char) KeyEvent.keyCodeFromString(""), 12 - View.combineMeasuredStates(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 44;
                    }
                    break;
                case 320151695:
                    if (str.equals(m29276(TextUtils.getCapsMode("", 0, 0) + 1096, (char) (50937 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 13 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b = -1;
                    } else {
                        b = 47;
                    }
                    break;
                case 334118616:
                    if (str.equals(m29276(397 - Gravity.getAbsoluteGravity(0, 0), (char) (29391 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 23 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 663296747:
                    if (str.equals(m29276((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, (char) (57786 - ((byte) KeyEvent.getModifierMetaStateMask())), 17 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 766880816:
                    if (str.equals(m29276(TextUtils.getOffsetAfter("", 0) + 825, (char) (39220 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 27).intern())) {
                        b = -1;
                    } else {
                        i3 = f27918 + 7;
                        f27917 = i3 % 128;
                        if (i3 % 2 != 0) {
                            b = 35;
                        } else {
                            b = 52;
                        }
                    }
                    break;
                case 779287609:
                    if (!str.equals(m29276(Process.getGidForName("") + Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (-16777194) - Color.rgb(0, 0, 0)).intern())) {
                        b = 8;
                    } else {
                        b = -1;
                    }
                    break;
                case 823061407:
                    if (str.equals(m29276((-16776449) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17).intern())) {
                        b = -1;
                    } else {
                        int i112 = f27918 + 85;
                        f27917 = i112 % 128;
                        int i113 = i112 % 2;
                        b = 32;
                    }
                    break;
                case 846220331:
                    if (!(!str.equals(m29276(View.getDefaultSize(0, 0) + 1345, (char) (Color.rgb(0, 0, 0) + 16835930), 23 - TextUtils.indexOf("", "", 0)).intern()))) {
                        b = -1;
                    } else {
                        b = 60;
                    }
                    break;
                case 894546539:
                    if (str.equals(m29276((Process.myPid() >> 22) + 671, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 24).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22493FS;
                    }
                    break;
                case 1052532031:
                    if (str.equals(m29276(1181 - View.getDefaultSize(0, 0), (char) TextUtils.getCapsMode("", 0, 0), 14 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                        b = -1;
                    } else {
                        b = 52;
                    }
                    break;
                case 1069602180:
                    if (str.equals(m29276(View.resolveSize(0, 0) + 695, (char) (18054 - View.resolveSizeAndState(0, 0, 0)), ExpandableListView.getPackedPositionType(0L) + 24).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22494GS;
                    }
                    break;
                case 1081984916:
                    if (str.equals(m29276(KeyEvent.getDeadChar(0, 0) + 784, (char) (ViewConfiguration.getEdgeSlop() >> 16), 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 1180349927:
                    if (str.equals(m29276(((Process.getThreadPriority(0) + 20) >> 6) + 242, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 51 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1226831433:
                    if (str.equals(m29276(858 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 37;
                    }
                    break;
                case 1266525324:
                    if (str.equals(m29276(873 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (Process.getGidForName("") + 1), 21 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 38;
                    }
                    break;
                case 1267145181:
                    if (str.equals(m29276(1110 - ExpandableListView.getPackedPositionGroup(0L), (char) View.getDefaultSize(0, 0), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 48;
                    }
                    break;
                case 1304950957:
                    if (str.equals(m29276(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0, 0) + 53253), 15 - View.resolveSize(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1325013503:
                    if (str.equals(m29276((Process.myPid() >> 22) + 1368, (char) KeyEvent.keyCodeFromString(""), 31 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = Base64.padSymbol;
                    }
                    break;
                case 1432059210:
                    if (str.equals(m29276((ViewConfiguration.getScrollBarSize() >> 8) + 449, (char) (1780 - (Process.myPid() >> 22)), 39 - View.resolveSize(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 1517126868:
                    if (str.equals(m29276(160 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13350), Color.blue(0) + 15).intern())) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1628896204:
                    if (str.equals(m29276(740 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 27 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22502US;
                    }
                    break;
                case 1715808775:
                    if (str.equals(m29276(1330 - ((Process.getThreadPriority(0) + 20) >> 6), (char) KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 15).intern())) {
                        b = -1;
                    } else {
                        b = 59;
                    }
                    break;
                case 1773831812:
                    if (str.equals(m29276(MotionEvent.axisFromString("") + 578, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 30549), TextUtils.getOffsetAfter("", 0) + 14).intern())) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 1870849118:
                    if (!(!str.equals(m29276(1214 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getSize(0) + 17).intern()))) {
                        b = -1;
                    } else {
                        b = 54;
                    }
                    break;
                case 1910059890:
                    if (str.equals(m29276((ViewConfiguration.getJumpTapTimeout() >> 16) + 560, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52287), (Process.myPid() >> 22) + 17).intern())) {
                        b = -1;
                    } else {
                        i4 = f27917 + 47;
                        f27918 = i4 % 128;
                        if (i4 % 2 == 0) {
                            b = 22;
                        } else {
                            b = 9;
                        }
                    }
                    break;
                case 1910219460:
                    if (str.equals(m29276((ViewConfiguration.getEdgeSlop() >> 16) + 292, (char) Color.red(0), 19 - TextUtils.getOffsetBefore("", 0)).intern())) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 1955369613:
                    if (str.equals(m29276(TextUtils.getOffsetBefore("", 0) + 852, (char) (Process.myPid() >> 22), 6 - Color.green(0)).intern())) {
                        b = -1;
                    } else {
                        b = 36;
                    }
                    break;
                case 1955530641:
                    if (str.equals(m29276(553 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                case 2019413793:
                    if (str.equals(m29276(Color.red(0) + 366, (char) (ViewConfiguration.getEdgeSlop() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 32).intern())) {
                        b = -1;
                    } else {
                        b = 15;
                    }
                    break;
                case 2019599576:
                    if (str.equals(m29276(420 - View.getDefaultSize(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 14000), AndroidCharacter.getMirror('0') - 19).intern())) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 2102577435:
                    if (str.equals(m29276(Color.blue(0) + 1253, (char) (19562 - KeyEvent.getDeadChar(0, 0)), View.MeasureSpec.getMode(0) + 31).intern())) {
                        b = -1;
                    } else {
                        b = 56;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        }
        switch (b) {
            case 0:
                return AbstractAdapter.class;
            case 1:
                return Placement.class;
            case 2:
            case 3:
                return ControllerActivity.class;
            case 4:
            case 5:
                return InterstitialActivity.class;
            case 6:
            case 7:
                return OpenUrlActivity.class;
            case 8:
            case 9:
                return IronSourceBannerLayout.class;
            case 10:
                return BannerSmashListener.class;
            case 11:
                return IronSource.class;
            case 12:
                int i20 = f27918 + 45;
                f27917 = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 79 / 0;
                }
                return ImpressionData.class;
            case 13:
                return ImpressionDataListener.class;
            case 14:
            case 15:
                return DTBAdView.class;
            case 16:
                return LevelPlayBannerListener.class;
            case 17:
                return LevelPlayInterstitialListener.class;
            case 18:
                return LevelPlayRewardedVideoAutomaticListener.class;
            case 19:
                return LevelPlayRewardedVideoListener.class;
            case 20:
                return LevelPlayRewardedVideoManualListener.class;
            case 21:
                return AdInfo.class;
            case 22:
                return LevelPlayNativeAd.class;
            case 23:
                return NativeAdLayout.class;
            case 24:
                return LevelPlayNativeAdListener.class;
            case 25:
                return LevelPlayMediaView.class;
            case 26:
                return AdapterNativeAdData.class;
            case 27:
                return NativeAdViewHolder.class;
            case 28:
                return InternalNativeAdListener.class;
            case 29:
                return NativeAdAdapterInterface.class;
            case 30:
                return NativeAdDataInterface.class;
            case 31:
                return NativeAdInteractionListener.class;
            case 32:
                return NativeAdInterface.class;
            case 33:
                return NativeAdLoadListener.class;
            case 34:
                return NativeAdSmashListener.class;
            case 35:
                return NativeAdViewBinderInterface.class;
            case 36:
                return AdData.class;
            case 37:
                return LevelPlayAdInfo.class;
            case 38:
            case 39:
                return LevelPlayBannerAdView.class;
            case 40:
                return LevelPlayBannerAdViewListener.class;
            case 41:
                return IronSourceAds.AdFormat.class;
            case 42:
                return BannerAdInfo.class;
            case 43:
                return BannerAdRequest.class;
            case 44:
            case 45:
                return BannerAdView.class;
            case 46:
                return BannerAdViewListener.class;
            case 47:
                return InterstitialAd.class;
            case 48:
                return InterstitialAdInfo.class;
            case 49:
                return InterstitialAdListener.class;
            case 50:
                return InterstitialAdRequest.class;
            case 51:
                return RewardedAd.class;
            case 52:
                return RewardedAdInfo.class;
            case 53:
                return RewardedAdListener.class;
            case 54:
                return RewardedAdRequest.class;
            case 55:
                return LevelPlayInterstitialAd.class;
            case 56:
                return LevelPlayInterstitialAdListener.class;
            case 57:
                return LevelPlayRewardedAd.class;
            case 58:
                return LevelPlayRewardedAdListener.class;
            case 59:
                return LevelPlayReward.class;
            case 60:
                return LevelPlayImpressionData.class;
            case 61:
                return LevelPlayImpressionDataListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27917 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27918 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                String sdkVersion = LevelPlay.getSdkVersion();
                int i4 = f27918 + 115;
                f27917 = i4 % 128;
                int i5 = i4 % 2;
                return sdkVersion;
            } catch (Throwable unused) {
                return IronSourceUtils.getSDKVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29276(1399 - ExpandableListView.getPackedPositionType(0L), (char) Color.green(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11856bu.m29272((Placement) list.get(0));
            }
        });
        map.put(m29276(1414 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 28).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11856bu.m29260((IronSourceBannerLayout) list.get(0));
            }
        });
        map.put(m29276(Color.rgb(0, 0, 0) + 16778659, (char) View.resolveSizeAndState(0, 0, 0), Color.rgb(0, 0, 0) + 16777237).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11856bu.m29273((ImpressionData) list.get(0));
            }
        });
        map.put(m29276((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1464, (char) (TextUtils.indexOf("", "", 0, 0) + 30739), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 25).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11856bu.m29279((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m29276(1490 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45896), 28 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11856bu.m29264((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m29276(TextUtils.indexOf("", "", 0, 0) + 1517, (char) (TextUtils.lastIndexOf("", '0') + 6101), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11856bu.m29274((LevelPlayImpressionData) list.get(0));
            }
        });
        map.put(m29276((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1547, (char) (6506 - ExpandableListView.getPackedPositionType(0L)), 30 - TextUtils.indexOf("", "", 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11856bu.m29267((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m29276(1577 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.alpha(0) + 33).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11856bu.m29275((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m29276(1610 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + 19).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11856bu.m29278((LevelPlayNativeAd) list.get(0), (LevelPlayNativeAdListener) list.get(1));
                return null;
            }
        });
        map.put(m29276(KeyEvent.keyCodeFromString("") + 1629, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf("", "", 0, 0) + 13).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11856bu.m29271((AdData) list.get(0));
            }
        });
        int i2 = f27918 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f27917 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29262(Placement placement) {
        int i = 2 % 2;
        int i2 = f27917 + 93;
        int i3 = i2 % 128;
        f27918 = i3;
        int i4 = i2 % 2;
        if (placement != null) {
            return placement.getPlacementName();
        }
        int i5 = i3 + 103;
        f27917 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29268(IronSourceBannerLayout ironSourceBannerLayout) {
        int i = 2 % 2;
        int i2 = f27918 + 13;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        String placementName = ironSourceBannerLayout.getPlacementName();
        int i4 = f27918 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27917 = i4 % 128;
        if (i4 % 2 == 0) {
            return placementName;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static JSONObject m29263(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27918 + 5;
        f27917 = i2 % 128;
        if (i2 % 2 == 0) {
            return impressionData.getAllData();
        }
        impressionData.getAllData();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static void m29270(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f27918 + 35;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        IronSource.addImpressionDataListener(impressionDataListener);
        int i4 = f27918 + 113;
        f27917 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m29266(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f27917 + 87;
        f27918 = i2 % 128;
        int i3 = i2 % 2;
        IronSource.removeImpressionDataListener(impressionDataListener);
        int i4 = f27917 + 3;
        f27918 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static JSONObject m29277(LevelPlayImpressionData levelPlayImpressionData) {
        int i = 2 % 2;
        int i2 = f27917 + 89;
        f27918 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject allData = levelPlayImpressionData.getAllData();
        int i4 = f27917 + 41;
        f27918 = i4 % 128;
        int i5 = i4 % 2;
        return allData;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m29265(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i = 2 % 2;
        int i2 = f27918 + 25;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        LevelPlay.addImpressionDataListener(levelPlayImpressionDataListener);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m29280(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i = 2 % 2;
        int i2 = f27918 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        LevelPlay.removeImpressionDataListener(levelPlayImpressionDataListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static void m29269(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i = 2 % 2;
        int i2 = f27918 + 89;
        f27917 = i2 % 128;
        int i3 = i2 % 2;
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        int i4 = f27918 + 75;
        f27917 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29261(AdData adData) {
        int i = 2 % 2;
        int i2 = f27917 + 31;
        f27918 = i2 % 128;
        int i3 = i2 % 2;
        String serverData = adData.getServerData();
        int i4 = f27917 + 19;
        f27918 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return serverData;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29276(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f27919[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f27920)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
