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
import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.ironsource.mediationsdk.demandOnly.InterfaceC12339e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bl */
/* JADX INFO: loaded from: classes6.dex */
public final class C11847bl extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27695 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static long f27696 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27697 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f27698;

    static {
        char[] cArr = new char[1179];
        ByteBuffer.wrap("\u0000^\u009eõ=6Û zø\u0019)·ØVÂõc\u0093\u00ad2þÑg\u0000A\u009eÍ=\u0011Û\u0094zÊ\u00199·\u0093Vñõ<\u0093¥2ãÑ3o\u0089\u0000A\u009eÍ=\u0016Û\u0092z×\u0019=·\u009aVþõ1i\u009a÷\u0016Tß²I\u0013\u001bpóÞBûEeÉÆ\u0010 \u008a\u0081Ìâ%L¡\u00adø\u000e>h\u0090Éû*)\u0094¤õøVI°\u0097\u0011ñrSÜ\u0083=ý\u0000A\u009eÍ=\u001eÛ\u0092z×\u00199·\u0093Vñõ-\u0093\u0083\u0000A\u009eÍ=\u0000Û\u009ezÕ\u00198·\u0093Vìõ<º%$©\u0087daúÀ±£\\\r÷ì\u0088OX)Å\u0088\u009fkUÕé´\u009c\u0017?ñ÷P\u00913/\u009dõ\u0000A\u009eÍ=!Û¯zÝ\u0019=·\u0093S\u0004Í\u0088nA\u0088×)\u0084J\u007f\u0000B\u009eÈ=<Û\u0095zÁ\u0019?·ºVöõ;\u0093\u00852ÿÑ-o\u0089\u000eç\u0000B\u009eÈ=<Û\u0095zÁ\u0019?· Vöõ-\u0093\u0086\u0000i\u009eÆ=|Û\u0099zÍ\u0019)·\u009bVþõ+\u0093\u00992óÑ-o\u0089\u000e»\u00ad\\K\u0086êþ\u0089W'\u0087Æùe\u001a\u0003\u009f¢çAAß¶~ä\u001dX»\u0085Z\u0015ù@\u0097¹\u0000B\u009eÀ=6Û¶zÅ\u0019.·\u009eVöõ&\u0093\u0094\"×¼U\u001f£ù#XP;»\u0095\u000btc×³±\u0001\u0010Nó²\u0092ü\fd¯\u0088I%èo\u008b\u009b%?ÄEg±\u0001! WC\u0091ý2\u009c^±5/¸\u008cOjàË½¨u\u0006ëç\u0097DU\u0000I\u009eÇ=&Û\u009ezÖ\u0019>·\u0082Vöõ<\u0093\u00982ûÑ/o\u00ad\u000eñ\u0000I\u009eÇ=&Û\u009ezÖ\u0019>·\u0082Vöõ<\u0093\u00982ûÑ/o \u000eü\u00adMK\u0093êõ\u0089W'\u0087ÆùÇ¡Y;úÙ\u001cp½\u0010ÞÉpc\u0091\u001d2ÊTxõ<\u0016À\u0000M\u009eÌ=6Û\u0092zÅ\u0019\f·\u0085Vìõ-\u0093\u00852ÎÑ:o\u009c\u000eð\u0090Þ\u000e_\u00ad¥K\u0001êV\u0089\u0088'\fÆie¬\u0000i\u009eÆ=|Û\u0099zÍ\u0019)·\u009bVþõ+\u0093\u00992óÑ-o\u0089\u000e»\u00adPK\u0086êä\u0089P'\u0094ÆîeU\u0003¹¢¨AYß±~ä\u001d]»ýZ1ù@\u0097ª6\u001eÕAs\u009f\u0012\u001b±~O³\u0000N\u009eÈ=&Û\u0092zÒ\u0019(··Vû\u0000N\u009eÈ=&Û\u0092zÒ\u0019(·ºVöõ;\u0093\u00852ÿÑ-o\u0089\u000eç\u0000N\u009eÈ=&Û\u0092zÒ\u0019(·»Vúõ,\u0093\u00982ûÑ\u0015o\u0085\u000eð\u00adIjÇôYW°±\u000f\u0010Cs¼Ý\u0006<n\u009f\u009cù\u0000\u0000R\u009eÌ=%Û\u009azÖ\u0019)·\u0093Vûõ\u0004\u0093\u00982éÑ7o\u0089\u000eû\u00ad[K\u0095\u0018\u0017\u0086\u0085%tÃÖb¬\u0001m¯×N³íl\u008bø*¶ÉuwÝ\u0016µµ\u0015SÇò§\u0000R\u009eÀ=1Û\u0093zé\u0019(·\u0092Vöõ)\u0093§2óÑ&o\u009bª\u00104¿\u0097\u0005qàÐ´³P\u001dâü\u0087_R9à\u0098\u008a{TÅð¤Â\u00075á÷@\u008a#(\u008döl\u0097Ï)©Í\b\u009eëxuóÔ\u0091·0\u0011ÂðHS9=Ó\u009cg\u007f8Ùæ¸b\u001b\u0007åÊàº~,ÝÚ;r\u009a'ùñWv¶\u0012\u0015ÝsxÒ\u00041î\u008fcî\rM»«}\n\u0015i¡Çw\u0000i\u009eÆ=|Û\u0099zÍ\u0019)·\u009bVþõ+\u0093\u00992óÑ-o\u0089\u000e»\u00adPK\u0086êä\u0089P'\u0094ÆîeU\u0003¹¢¨AYß±~ä\u001d]»ýZ*ùL\u0097ª6\u0012ÕOs\u0099\u0012\u001e±zO½î\b\u008dd+þÊ\u000bie\u0007Ó¦\u0015EeãÁ\u0082'\u0000A\u009eÍ#Z½Ì\u001e$ø\u0085Y×:\u001b\u0094\u0082uüÖ6°\u0090\u0011äò L\u0082xPæõE\f£æ\u0002òa\u0006Ïµ.À\u008d\u0014ë°JÌ©\u0003\u0017«vÇÕn3¿\u0092\u008dñc_°¾Ú\u001d){\u0083ÚÇ9}§\u0082\u0006Öe7Ã\u00ad\"=\u0081wï\u0094N \u00adR\u000b\u0099j5ÉA7\u0081\u00967õQSõÍÃSUð½\u0016\u001c·NÔ\u0087z\u0011\u009bp8ª^\u0010ÿs\u001c\u008c¢\u0001Ão`Ù\u0086\u001f'wDÃê\u0015u?ë\u009aHc®\u0089\u000f\u009dliÂÚ#¯\u0080{æßG£¤l\u001aÄ{¨Ø\u0001>Ð\u009fâü\fRß³µ\u0010Fvì×¨4\u0012ªí\u000b¹hXÎÂ/R\u008c\u0018âûCO 8\u0006ügOÄ+:÷\u009bVø\u000b^\u0080¿@\u001c$r\u0090ÓV0$\u0096\u0090V`Èök\u001e\u008d¿,íO)áµ\u0000Æ£\u0000Å®dÄ\u0087\u001a9¨XÌûz\u001d«¼Ñ\u0000M\u009eÛ=3Û\u0092zÀ\u0019\u0004·\u0098Vëõ-\u0093\u00832éÑ7o\u0085\u000eá\u00adWK\u0086êü\u0089u'\u008bÆøe@\u0003¸¢èAJßª\u0081\u0094\u001f\u0002¼êZKû\u0019\u0098Â6F×#tæ\u0000c\u009eÆ=?ÛÕzÁ\u00195·\u0086Vóõ'\u0093\u00832ÿÑ0o\u0098\u000eô\u00ad]K\u008cê¾\u0089P'\u0083Æée\u001a\u0003°¢ôANß±~å\u001d\u0004»\u009eZ\u000eùD\u0097§6\u0013Õvs \u0012\u0017±l\u0093Á\rW®¿H\u001eéL\u008a\u0097$\u0013Åvf³\u00001¡\u007fB¼ü\u0014\u009d|>ÜØ\u000eyn\u0000V\u009eÈ=!Û\u008fzå\u0019.·\u0082Vöõ>\u0093\u00982îÑ:\u008dF\u0013ã°\u001aVð÷ä\u0094\u0010:£ÛÖx\u0002\u001e¦¿Ú\\\u0015â½\u0083Ñ xÆ©g\u009b\u0004uª¦KÌè?\u008e\u008e/ÂÌyR\u0089ó\u008a\u0090n6\u0095×-ti\u001a\u009d»;Xqþ\u0095\u009fy<hÂ\u0080c;\u0000G¦ÛG.ä@\u008aö+0È@nä\u000f\u0002L°Ò.qÇ\u0097i6\u0014UÂûu\u001a\u000e\u0000c\u009eÆ=?ÛÕzÁ\u00195·\u0086Vóõ'\u0093\u00832ÿÑ0o\u0098\u000eô\u00ad]K\u008cê¾\u0089P'\u0083Æée\u001a\u0003«¢çA\\ß¬~¯\u001dK»°Z\bùL\u0097¸6\u001eÕTs°\u0012\\±MO¥î\u001e\u008db+éÊ\u0001it\u0007Í\u0000M\u009eÛ=3Û\u0092zÀ\u0019\f·\u0092VÉõ!\u0093\u00942íª\u00804%\u0097Üq6Ð\"³Ö\u001deü\u0010_Ä9`\u0098\u001c{ÓÅ{¤\u0017\u0007¾áo@]#³\u008d`l\nÏù©S\b\u0017ë\u00aduRÔ\u0006·ç\u0011}ðíS§=D\u009cð\u007f\u0082ÙN¸Ç\u001b\u0091åBDù/\"±¼\u0012UôûU\u00866P\u0098çy\u009cÚp¼ì\u001d\u009dþC@ý!\u008f\u0082/dá\u0015d\u008bú(\u0015Î¸o÷\f\b¢´Cìà\u0006\u0086³'ÉÄ\u001bz©\u001bÊ¸g^¿ü\u0001bªÁ@'Ù\u0086«åXKàª\u0095\tOoîÎ½-A\u0093ç\u0000g\u009eÌ=&Û\u00adzÍ\u0019)·\u0093Vðõ\t\u0093\u00952÷\u0098?\u0006\u0094¥~Cáâ\u0089\u0081{/ÊÎ«mu\u0000g\u009eÌ=&Û¿zÍ\u0019>·\u0086Vóõ)\u0093\u0088\u0000g\u009eÌ=&Û¿zÍ\u0019>·\u0086Vóõ)\u0093\u00882ØÑ\"o\u0082\u000eû\u00ad[K\u0095\u0000g\u009eÌ=&Û¹zÅ\u0019#·\u0098Vúõ:\u0093´2âÑ7o¼\u000eç\u00adQK\u0093êÿ\u0089u'\u008bÆøe@!\u001a¿±\u001c[úÐ[°8T\u0096îw\u008d\u0000g\u009eÌ=&ÛºzÀ\u0019\"·\u009bVþõ!\u0093\u009f\u0000g\u009eÌ=&Û¸zÖ\u0019(·\u0097Vëõ!\u0093\u00872ÿÑ\no\u0088añÿZ\\°º=\u001b^xºÖ\u00037l\u0094³ò\u0002Sb°¡\u000e3og^ÆÀmc\u0087\u0085\u001b$aG¸é.\bN«\u008c ý¾V\u001d¼û2Z[9»\u0097\u0000v`Õ ³\"\u0012d\u0097<\t\u0083ªiLýí\u0085\u008ev ÜÁ¢bt\u0004Ê¥¼FxøÊ\u0099»:\u001dÜä}¶\u001e\u0005°ÙQ¡ò\u0015\u0094÷5»\u0000s\u009eÌ=&Û©zÁ\u0019:·\u0097Víõ,\u0093\u00942þÑ\u000fo\u0085\u000eæ\u00adJK\u0082êþ\u0089\\'\u0090\u0000s\u009eÌ=&Û¹zÅ\u0019#·\u0098Vúõ:\u0093½2óÑ0o\u0098\u000eð\u00adPK\u0082êâ\u0000g\u009eÌ=&Û¾zÜ\u00199·¦Víõ'\u0093\u00852õÑ\u000fo\u0085\u000eæ\u00adJÄÂZiù\u0083\u001f\u001c¾xÝ\u009cs6\u0092i1\u0099W&öV\u0015\u0088«.Ï@Qòò\u0004\u0014¼µÕÖ\u001bx¦\u0099Ô:\u0004\\´ýì\u001e\u000e \u009dÁÃbn\u0084¬%ÜF|".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1179);
        f27698 = cArr;
        f27696 = -2464679664084607319L;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ Ad.Video m28957(Ad ad) {
        int i = 2 % 2;
        int i2 = f27697 + 55;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Video videoM28953 = m28953(ad);
        int i4 = f27695 + 81;
        f27697 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoM28953;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m28960(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f27695 + 41;
        f27697 = i3 % 128;
        int i4 = i3 % 2;
        String strM28979 = m28979(ad, i);
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        int i6 = f27697 + 1;
        f27695 = i6 % 128;
        int i7 = i6 % 2;
        return strM28979;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m28961(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f27695 + 31;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        String strM28980 = m28980(adRequestParameters);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return strM28980;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m28962(RequestExtension requestExtension) {
        int i = 2 % 2;
        int i2 = f27697 + 25;
        f27695 = i2 % 128;
        if (i2 % 2 != 0) {
            m28972(requestExtension);
            throw null;
        }
        String strM28972 = m28972(requestExtension);
        int i3 = f27695 + 15;
        f27697 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return strM28972;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ List m28963(Ad.Display.Banner banner) {
        int i = 2 % 2;
        int i2 = f27695 + 69;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> listM28973 = m28973(banner);
        int i4 = f27697 + 13;
        f27695 = i4 % 128;
        if (i4 % 2 == 0) {
            return listM28973;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m28964(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f27695 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        m28989(rewardedAd, rewardedListener);
        int i4 = f27695 + 71;
        f27697 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m28966(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f27697 + 79;
        f27695 = i3 % 128;
        int i4 = i3 % 2;
        String strM28985 = m28985(ad, i);
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
        return strM28985;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ List m28967(Ad ad) {
        int i = 2 % 2;
        int i2 = f27695 + 5;
        f27697 = i2 % 128;
        if (i2 % 2 == 0) {
            m28955(ad);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        List<Any> listM28955 = m28955(ad);
        int i3 = f27697 + 47;
        f27695 = i3 % 128;
        int i4 = i3 % 2;
        return listM28955;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ Ad.Display.Banner m28968(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f27697 + 59;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display.Banner bannerM28976 = m28976(display);
        int i4 = f27697 + 89;
        f27695 = i4 % 128;
        int i5 = i4 % 2;
        return bannerM28976;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ Ad.Display m28969(Ad ad) {
        int i = 2 % 2;
        int i2 = f27695 + 59;
        f27697 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28982(ad);
        }
        m28982(ad);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m28970(ByteString byteString) {
        int i = 2 % 2;
        int i2 = f27697 + 81;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        String strM28977 = m28977(byteString);
        int i4 = f27695 + 95;
        f27697 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return strM28977;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m28974(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f27695 + 19;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        m28988(interstitialAd, interstitialListener);
        int i4 = f27697 + 45;
        f27695 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ ByteString m28975(Any any) {
        int i = 2 % 2;
        int i2 = f27695 + 5;
        f27697 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m28956(any);
            super.hashCode();
            throw null;
        }
        ByteString byteStringM28956 = m28956(any);
        int i3 = f27695 + 35;
        f27697 = i3 % 128;
        if (i3 % 2 != 0) {
            return byteStringM28956;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m28978(Ad ad) {
        int i = 2 % 2;
        int i2 = f27697 + 21;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        String strM28954 = m28954(ad);
        int i4 = f27697 + 79;
        f27695 = i4 % 128;
        int i5 = i4 % 2;
        return strM28954;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m28983(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f27695 + 107;
        f27697 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28958(display);
        }
        m28958(display);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m28984(Ad.Video video) {
        int i = 2 % 2;
        int i2 = f27695 + 59;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        String strM28959 = m28959(video);
        int i4 = f27697 + 55;
        f27695 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return strM28959;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m28986(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f27697 + 95;
        f27695 = i2 % 128;
        if (i2 % 2 == 0) {
            return m28971(adRequestParameters);
        }
        m28971(adRequestParameters);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m28987(BannerView bannerView, BannerListener bannerListener) {
        int i = 2 % 2;
        int i2 = f27697 + 7;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        m28981(bannerView, bannerListener);
        int i4 = f27697 + 109;
        f27695 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public C11847bl(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27697 + 57;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            String strM30451 = C12019hv.m30362().m30363().m30451(BidMachine.class, m28965(ViewConfiguration.getLongPressTimeout() >> 16, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.getTrimmedLength("") + 12).intern());
            int i4 = f27697 + 85;
            f27695 = i4 % 128;
            if (i4 % 2 == 0) {
                return strM30451;
            }
            super.hashCode();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0799  */
    /* JADX WARN: Code duplicated, block: B:50:0x0262  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i = 2 % 2;
        byte b = 48;
        switch (str.hashCode()) {
            case -2127904484:
                b = !str.equals(m28965(381 - KeyEvent.normalizeMetaState(0), (char) (6213 - Drawable.resolveOpacity(0, 0)), 17 - (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : Ascii.ESC;
                break;
            case -2032115546:
                b = !str.equals(m28965((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 188, (char) (37566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 14).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1921270373:
                b = !str.equals(m28965(TextUtils.indexOf("", "") + 738, (char) View.combineMeasuredStates(0, 0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? (byte) -1 : (byte) 42;
                break;
            case -1798479256:
                b = !str.equals(m28965(Color.red(0) + UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, (char) (36133 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), ImageFormat.getBitsPerPixel(0) + 48).intern()) ? (byte) -1 : (byte) 43;
                break;
            case -1683121555:
                if (!str.equals(m28965(ExpandableListView.getPackedPositionChild(0L) + 178, (char) (Color.green(0) + 8853), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22490CR;
                }
                break;
            case -1628534628:
                if (!str.equals(m28965(((Process.getThreadPriority(0) + 20) >> 6) + 676, (char) (33241 - Color.green(0)), 9 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i2 = f27697 + 73;
                    f27695 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 39;
                }
                break;
            case -1627944928:
                if (str.equals(m28965(112 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (Color.rgb(0, 0, 0) + 16777216), 14 - TextUtils.getTrimmedLength("")).intern())) {
                    int i4 = f27697 + 49;
                    f27695 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -1518365947:
                if (!str.equals(m28965((ViewConfiguration.getKeyRepeatDelay() >> 16) + 897, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12147), ExpandableListView.getPackedPositionType(0L) + 16).intern())) {
                    b = -1;
                }
                break;
            case -1507727624:
                b = !str.equals(m28965(281 - View.resolveSizeAndState(0, 0, 0), (char) Color.green(0), 37 - TextUtils.getOffsetAfter("", 0)).intern()) ? (byte) -1 : Ascii.NAK;
                break;
            case -1371195010:
                if (!str.equals(m28965(Color.rgb(0, 0, 0) + 16777462, (char) (Gravity.getAbsoluteGravity(0, 0) + 51175), KeyEvent.getDeadChar(0, 0) + 12).intern())) {
                    b = -1;
                } else {
                    int i6 = f27695 + 19;
                    f27697 = i6 % 128;
                    int i7 = i6 % 2;
                    b = Ascii.DC2;
                }
                break;
            case -1246480821:
                if (!str.equals(m28965(448 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (57580 - View.MeasureSpec.getMode(0)), Color.red(0) + 19).intern())) {
                    b = -1;
                } else {
                    int i8 = f27695 + 115;
                    f27697 = i8 % 128;
                    int i9 = i8 % 2;
                    b = Ascii.f22498RS;
                }
                break;
            case -1146475727:
                b = !str.equals(m28965(796 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TextUtils.indexOf("", "", 0) + 19686), 8 - ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 44;
                break;
            case -1087582685:
                b = !str.equals(m28965(634 - View.MeasureSpec.getMode(0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22060), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17).intern()) ? (byte) -1 : (byte) 37;
                break;
            case -1011229113:
                b = !str.equals(m28965(588 - View.combineMeasuredStates(0, 0), (char) (Color.green(0) + 30044), 46 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 36;
                break;
            case -838844802:
                b = !str.equals(m28965(Gravity.getAbsoluteGravity(0, 0) + 805, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 43 - (ViewConfiguration.getScrollBarSize() >> 8)).intern()) ? (byte) -1 : (byte) 45;
                break;
            case -642689680:
                b = !str.equals(m28965((ViewConfiguration.getScrollDefaultDelay() >> 16) + 721, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37772), 16 - ExpandableListView.getPackedPositionChild(0L)).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -609786639:
                b = !str.equals(m28965((ViewConfiguration.getDoubleTapTimeout() >> 16) + 355, (char) (27285 - TextUtils.indexOf("", "", 0, 0)), 10 - Color.green(0)).intern()) ? (byte) -1 : Ascii.f22491EM;
                break;
            case -589219056:
                b = !str.equals(m28965(View.resolveSize(0, 0) + 12, (char) (ImageFormat.getBitsPerPixel(0) + 1), Color.rgb(0, 0, 0) + 16777229).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -572702516:
                b = !str.equals(m28965(70 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -475472046:
                b = !str.equals(m28965(41 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (Color.red(0) + 64260), 21 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -211807062:
                b = !str.equals(m28965((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 168, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10 - (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 12;
                break;
            case -150492023:
                if (!str.equals(m28965((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 272, (char) (37011 - KeyEvent.getDeadChar(0, 0)), TextUtils.lastIndexOf("", '0') + 10).intern())) {
                    b = -1;
                } else {
                    int i10 = f27695 + 59;
                    f27697 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 20;
                }
                break;
            case 2115:
                b = !str.equals(m28965(514 - (ViewConfiguration.getScrollBarSize() >> 8), (char) Drawable.resolveOpacity(0, 0), 2 - ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 32;
                break;
            case 1282165:
                b = !str.equals(m28965((ViewConfiguration.getKeyRepeatDelay() >> 16) + 685, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? (byte) -1 : (byte) 40;
                break;
            case 3368703:
                if (!str.equals(m28965(25 - Color.red(0), (char) (KeyEvent.getMaxKeyCode() >> 16), 9 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    b = -1;
                } else {
                    int i12 = f27697 + 109;
                    f27695 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 1;
                }
                break;
            case 141091039:
                b = !str.equals(m28965(529 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (30770 - MotionEvent.axisFromString("")), 40 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 320151695:
                b = !str.equals(m28965(211 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) Color.green(0), 14 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 503762424:
                b = !str.equals(m28965(33 - TextUtils.lastIndexOf("", '0', 0), (char) (View.MeasureSpec.getMode(0) + 27099), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 529939434:
                b = !str.equals(m28965((ViewConfiguration.getJumpTapTimeout() >> 16) + 99, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 625873720:
                if (!str.equals(m28965(859 - Color.argb(0, 0, 0, 0), (char) (KeyEvent.normalizeMetaState(0) + 43747), View.MeasureSpec.makeMeasureSpec(0, 0) + 38).intern())) {
                    b = -1;
                } else {
                    int i14 = f27695 + 91;
                    f27697 = i14 % 128;
                    if (i14 % 2 != 0) {
                        b = 47;
                    } else {
                        b = Ascii.f22490CR;
                    }
                }
                break;
            case 713768498:
                b = !str.equals(m28965(TextUtils.getTrimmedLength("") + 340, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 15).intern()) ? (byte) -1 : (byte) 24;
                break;
            case 737636858:
                b = !str.equals(m28965(Gravity.getAbsoluteGravity(0, 0) + 467, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 48).intern()) ? (byte) -1 : Ascii.f22502US;
                break;
            case 742497451:
                b = !str.equals(m28965(410 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 43641), TextUtils.getTrimmedLength("") + 37).intern()) ? (byte) -1 : Ascii.f22494GS;
                break;
            case 745946635:
                b = !str.equals(m28965(Color.blue(0) + 326, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case 961844241:
                if (!str.equals(m28965((KeyEvent.getMaxKeyCode() >> 16) + 126, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), View.getDefaultSize(0, 0) + 10).intern())) {
                    b = -1;
                } else {
                    int i15 = f27695 + 57;
                    f27697 = i15 % 128;
                    b = i15 % 2 != 0 ? (byte) 10 : (byte) 53;
                }
                break;
            case 1125320581:
                b = !str.equals(m28965(203 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (View.combineMeasuredStates(0, 0) + 45436), 9 - Color.red(0)).intern()) ? (byte) -1 : Ascii.f22499SI;
                break;
            case 1165508119:
                if (!str.equals(m28965(61 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "", 0, 0) + 10).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1212533506:
                b = !str.equals(m28965(TextUtils.getOffsetBefore("", 0) + 365, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTouchSlop() >> 8) + 16).intern()) ? (byte) -1 : Ascii.SUB;
                break;
            case 1297340448:
                if (!str.equals(m28965(226 - Color.red(0), (char) (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19).intern())) {
                    b = -1;
                } else {
                    int i16 = f27695 + 73;
                    f27697 = i16 % 128;
                    int i17 = i16 % 2;
                    b = 17;
                }
                break;
            case 1387614166:
                b = !str.equals(m28965((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 80, (char) (TextUtils.getCapsMode("", 0, 0) + 47716), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1395486086:
                b = !str.equals(m28965(517 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8984), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 1444286894:
                b = !str.equals(m28965(TextUtils.indexOf("", "", 0, 0) + 569, (char) (Color.blue(0) + 52622), TextUtils.indexOf((CharSequence) "", '0') + 20).intern()) ? (byte) -1 : (byte) 35;
                break;
            case 1461955341:
                b = !str.equals(m28965(398 - TextUtils.getTrimmedLength(""), (char) KeyEvent.getDeadChar(0, 0), 12 - Process.getGidForName("")).intern()) ? (byte) -1 : Ascii.f22493FS;
                break;
            case 1494941328:
                b = !str.equals(m28965(914 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (5430 - View.getDefaultSize(0, 0)), Color.blue(0) + 16).intern()) ? (byte) -1 : (byte) 49;
                break;
            case 1917129446:
                b = !str.equals(m28965((Process.myTid() >> 22) + 258, (char) KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionGroup(0L) + 14).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1955913096:
                b = !str.equals(m28965(106 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 21317), Process.getGidForName("") + 7).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 2034998687:
                b = !str.equals(m28965(848 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 46;
                break;
            case 2110329530:
                if (!str.equals(m28965(318 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8).intern())) {
                    b = -1;
                } else {
                    int i18 = f27697 + 71;
                    f27695 = i18 % 128;
                    if (i18 % 2 == 0) {
                        b = Ascii.SYN;
                    } else {
                        b = 4;
                    }
                }
                break;
            case 2112955383:
                b = !str.equals(m28965(651 - Color.alpha(0), (char) View.MeasureSpec.getMode(0), 25 - ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 2136410007:
                b = !str.equals(m28965(((Process.getThreadPriority(0) + 20) >> 6) + 136, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 31 - TextUtils.indexOf("", "")).intern()) ? (byte) -1 : (byte) 11;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return AdContentType.class;
            case 1:
                return Ad.Display.class;
            case 2:
                return Ad.Video.class;
            case 3:
                return AdFullScreenListener.class;
            case 4:
                return AdListener.class;
            case 5:
                return AdRequest.class;
            case 6:
                return AdRequestParameters.class;
            case 7:
                return AdsType.class;
            case 8:
                return AdView.class;
            case 9:
                return BannerListener.class;
            case 10:
            case 11:
                return BannerView.class;
            case 12:
                return BidMachine.class;
            case 13:
                return BidMachineAd.class;
            case 14:
                return CreativeFormat.class;
            case 15:
                return ImageData.class;
            case 16:
                return InterstitialAd.class;
            case 17:
                return InterstitialListener.class;
            case 18:
                return FullScreenAd.class;
            case 19:
                return MediaAssetType.class;
            case 20:
            case 21:
                return MediaView.class;
            case 22:
                return NativeAd.class;
            case 23:
                return NativeListener.class;
            case 24:
                return NativeMediaView.class;
            case 25:
                return RewardedAd.class;
            case 26:
                return RewardedListener.class;
            case 27:
                return RichMediaListener.class;
            case 28:
            case 29:
                return RichMediaView.class;
            case 30:
            case 31:
                return VideoPlayerActivity.class;
            case 32:
                return Ad.class;
            case 33:
            case 34:
                return MraidActivity.class;
            case 35:
            case 36:
                return MraidDialogActivity.class;
            case 37:
                return MraidInterstitial.class;
            case 38:
                return MraidInterstitialListener.class;
            case 39:
            case 40:
                return MraidView.class;
            case 41:
                return MraidViewListener.class;
            case 42:
            case 43:
                return VastActivity.class;
            case 44:
            case 45:
                return VastView.class;
            case 46:
            case 47:
                return MraidAdView.class;
            case 48:
                return VastViewListener.class;
            case 49:
                return RequestExtension.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m28965(929 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 64614), (KeyEvent.getMaxKeyCode() >> 16) + 13).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28983((Ad.Display) list.get(0));
            }
        });
        map.put(m28965(View.combineMeasuredStates(0, 0) + 942, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 11 - TextUtils.indexOf("", "", 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28984((Ad.Video) list.get(0));
            }
        });
        map.put(m28965(954 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38999), Drawable.resolveOpacity(0, 0) + 9).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28960((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m28965((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 962, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28969((Ad) list.get(0));
            }
        });
        map.put(m28965(Color.red(0) + 972, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.indexOf("", "", 0, 0) + 16).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28968((Ad.Display) list.get(0));
            }
        });
        map.put(m28965(ExpandableListView.getPackedPositionGroup(0L) + 988, (char) View.MeasureSpec.getSize(0), 21 - Color.blue(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28963((Ad.Display.Banner) list.get(0));
            }
        });
        map.put(m28965((ViewConfiguration.getFadingEdgeLength() >> 16) + 1009, (char) (8573 - Color.green(0)), View.resolveSizeAndState(0, 0, 0) + 8).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.19
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28957((Ad) list.get(0));
            }
        });
        map.put(m28965(1017 - View.MeasureSpec.getSize(0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.16
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28966((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m28965(1027 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.keyCodeFromString("") + 13).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.20
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28978((Ad) list.get(0));
            }
        });
        map.put(m28965((ViewConfiguration.getDoubleTapTimeout() >> 16) + IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 24982), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28986((AdRequestParameters) list.get(0));
            }
        });
        map.put(m28965((ViewConfiguration.getJumpTapTimeout() >> 16) + IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, (char) (24225 - (Process.myTid() >> 22)), (ViewConfiguration.getTapTimeout() >> 16) + 9).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28961((AdRequestParameters) list.get(0));
            }
        });
        map.put(m28965(1063 - ExpandableListView.getPackedPositionGroup(0L), (char) (8346 - TextUtils.indexOf("", "", 0)), 11 - Color.argb(0, 0, 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28962((RequestExtension) list.get(0));
            }
        });
        map.put(m28965(1074 - (Process.myPid() >> 22), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 38735), TextUtils.indexOf((CharSequence) "", '0') + 24).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11847bl.m28974((InterstitialAd) list.get(0), (InterstitialListener) list.get(1));
                return null;
            }
        });
        map.put(m28965((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1097, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Color.blue(0) + 19).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11847bl.m28964((RewardedAd) list.get(0), (RewardedListener) list.get(1));
                return null;
            }
        });
        map.put(m28965((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1116, (char) (Process.myPid() >> 22), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11847bl.m28987((BannerView) list.get(0), (BannerListener) list.get(1));
                return null;
            }
        });
        map.put(m28965(Drawable.resolveOpacity(0, 0) + 1133, (char) Color.blue(0), 15 - Color.red(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28967((Ad) list.get(0));
            }
        });
        map.put(m28965(1149 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (Color.argb(0, 0, 0, 0) + 50341), 13 - TextUtils.getCapsMode("", 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28975((Any) list.get(0));
            }
        });
        map.put(m28965(Process.getGidForName("") + InterfaceC12339e.a.f31140i, (char) (53027 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11847bl.m28970((ByteString) list.get(0));
            }
        });
        int i2 = f27695 + 73;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m28958(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f27695 + 11;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        String adm = display.getAdm();
        int i4 = f27697 + 61;
        f27695 = i4 % 128;
        if (i4 % 2 == 0) {
            return adm;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m28959(Ad.Video video) {
        int i = 2 % 2;
        int i2 = f27697 + 29;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        String adm = video.getAdm();
        int i4 = f27697 + 37;
        f27695 = i4 % 128;
        if (i4 % 2 == 0) {
            return adm;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28979(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f27695 + 45;
        f27697 = i3 % 128;
        int i4 = i3 % 2;
        String bundle = ad.getBundle(i);
        int i5 = f27697 + 115;
        f27695 = i5 % 128;
        int i6 = i5 % 2;
        return bundle;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static Ad.Display m28982(Ad ad) {
        int i = 2 % 2;
        int i2 = f27697 + 29;
        f27695 = i2 % 128;
        if (i2 % 2 == 0) {
            return ad.getDisplay();
        }
        ad.getDisplay();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static Ad.Display.Banner m28976(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f27697 + 7;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display.Banner banner = display.getBanner();
        int i4 = f27695 + 73;
        f27697 = i4 % 128;
        int i5 = i4 % 2;
        return banner;
    }

    /* JADX INFO: renamed from: ｋ */
    private static List<Any> m28973(Ad.Display.Banner banner) {
        int i = 2 % 2;
        int i2 = f27697 + 109;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> extProtoList = banner.getExtProtoList();
        int i4 = f27695 + 63;
        f27697 = i4 % 128;
        int i5 = i4 % 2;
        return extProtoList;
    }

    /* JADX INFO: renamed from: ﱟ */
    private static Ad.Video m28953(Ad ad) {
        int i = 2 % 2;
        int i2 = f27695 + 63;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Video video = ad.getVideo();
        int i4 = f27695 + 13;
        f27697 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return video;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static List<Any> m28955(Ad ad) {
        int i = 2 % 2;
        int i2 = f27695 + 41;
        f27697 = i2 % 128;
        if (i2 % 2 != 0) {
            return ad.getExtProtoList();
        }
        ad.getExtProtoList();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static ByteString m28956(Any any) {
        int i = 2 % 2;
        int i2 = f27697 + 97;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        ByteString value = any.getValue();
        int i4 = f27697 + 61;
        f27695 = i4 % 128;
        if (i4 % 2 == 0) {
            return value;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28977(ByteString byteString) {
        int i = 2 % 2;
        int i2 = f27697 + 63;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        String stringUtf8 = byteString.toStringUtf8();
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = f27695 + 99;
        f27697 = i5 % 128;
        int i6 = i5 % 2;
        return stringUtf8;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28985(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f27697 + 23;
        f27695 = i3 % 128;
        if (i3 % 2 != 0) {
            ad.getAdomain(i);
            throw null;
        }
        String adomain = ad.getAdomain(i);
        int i4 = f27697 + 115;
        f27695 = i4 % 128;
        if (i4 % 2 == 0) {
            return adomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ */
    private static String m28954(Ad ad) {
        int i = 2 % 2;
        int i2 = f27697 + 33;
        f27695 = i2 % 128;
        if (i2 % 2 != 0) {
            ad.getId();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String id = ad.getId();
        int i3 = f27697 + 103;
        f27695 = i3 % 128;
        int i4 = i3 % 2;
        return id;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28971(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f27695 + 33;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = adRequestParameters.getPlacementId();
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28980(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f27695 + 9;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        String name = adRequestParameters.getAdsType().getName();
        int i4 = f27695 + 29;
        f27697 = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28972(RequestExtension requestExtension) {
        int i = 2 % 2;
        int i2 = f27697 + 57;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        String sellerId = requestExtension.getSellerId();
        int i4 = f27695 + 23;
        f27697 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return sellerId;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m28988(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f27697 + 99;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setListener(interstitialListener);
        int i4 = f27695 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27697 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m28989(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f27695 + 55;
        f27697 = i2 % 128;
        int i3 = i2 % 2;
        rewardedAd.setListener(rewardedListener);
        int i4 = f27695 + 29;
        f27697 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m28981(BannerView bannerView, BannerListener bannerListener) {
        int i = 2 % 2;
        int i2 = f27697 + 11;
        f27695 = i2 % 128;
        int i3 = i2 % 2;
        bannerView.setListener(bannerListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28965(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f27698[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f27696)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
