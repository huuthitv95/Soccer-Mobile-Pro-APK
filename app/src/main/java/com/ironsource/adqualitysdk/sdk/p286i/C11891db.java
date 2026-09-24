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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.db */
/* JADX INFO: loaded from: classes6.dex */
public final class C11891db implements InterfaceC11871ci {

    /* JADX INFO: renamed from: ﬤ */
    private static int f28482 = 1;

    /* JADX INFO: renamed from: ףּ */
    private static int f28483;

    /* JADX INFO: renamed from: ﭖ */
    private static char[] f28484;

    /* JADX INFO: renamed from: ﭴ */
    private static long f28485;

    /* JADX INFO: renamed from: ﾒ */
    private final C11887cy f28498 = new C11887cy();

    /* JADX INFO: renamed from: ｋ */
    private final C11892dc f28496 = new C11892dc();

    /* JADX INFO: renamed from: ﻐ */
    private final C11881cs f28494 = new C11881cs();

    /* JADX INFO: renamed from: ﻛ */
    private final C11890da f28495 = new C11890da();

    /* JADX INFO: renamed from: ﾇ */
    private final C11895df f28497 = new C11895df();

    /* JADX INFO: renamed from: ﮐ */
    private final C11894de f28489 = new C11894de();

    /* JADX INFO: renamed from: ﱡ */
    private final C11885cw f28491 = new C11885cw();

    /* JADX INFO: renamed from: ﱟ */
    private final C11883cu f28490 = new C11883cu();

    /* JADX INFO: renamed from: ﺙ */
    private final C11880cr f28492 = new C11880cr();

    /* JADX INFO: renamed from: ﻏ */
    private final C11888cz f28493 = new C11888cz();

    /* JADX INFO: renamed from: ﭸ */
    private final C11893dd f28486 = new C11893dd();

    /* JADX INFO: renamed from: ﮌ */
    private final C11882ct f28488 = new C11882ct();

    /* JADX INFO: renamed from: ﮉ */
    private final C11884cv f28487 = new C11884cv();

    static {
        char[] cArr = new char[IronSourceError.ERROR_LEGACY_INIT_POST_FAILED];
        ByteBuffer.wrap("wí\u0093\u0095¿\u0016Ú«æ\u0014\u0001¹-YHÌTk\u007fô\u009br§\u0000Â\u0097î\u000f\t¥\u008bXo C£&\u001e\u001a¡ý\fÑì´y¨Ô\u0083MgÙ[¢>(\u0012«\u0084ã`\u0095L\u0018)\u009b\u0015!ò²ÞN»Í§J\u008cähFT\u000b1\u009b\u001d\u000e©kM\ta\u0084\u0004\u00078½ß.óÒ\u0096Q\u008aÖ¡xEÚy\u0097\u001c\u00070\u0092\u008aÏn¹B4'µ\u001b\u001cü»Ðuµæ©^\u0082ÕfEZ#?\u009e\u0013>ô\u009fè\tÍ©¡\u007f\u009aô~]SÎ7E+$\f½}»\u0099ÕµlÐçìg\u000bá'<B\u0097^\u0001u¯\u00918\u00adBÈÇ¤Ï@¹l4\t¢5\u0011Ò\u0089þgS*·\\\u009bÑþRÂò%g\t\u0081l\u0004p\u0083[-¿\u0093\u0083ØæXÊÞ\u0000gä\u0011È\u009c\u00ad\u001a\u0091¹v!ZÔ?H\u0000gä\u0011È\u009c\u00ad\u001a\u0091¹v!ZÔ?H#Ó\u0000gä\u0011È\u009c\u00ad\u001a\u0091¹v6ZË?X#æ\b}ìíÐ\u0090µ\u0014\u0099«~>b\u0098G9+Ä\u0010M?ðÛ\u0086÷\u000b\u0092\u008d®.I¡e\\\u0000Ï\u001cq7êÓzï\u0007\u008a\u0083¦$A¦]/x¿\u0014s/ÍËnæá\u0082z\u009e\u0017^kº\u000e\u0096\u0085ó5Ï¬()\u0004öaM}ÍVp²ä\u008e°ë\u001dÇ\u008a \u0012<±\u0019!uÐNDªñ\u0087j\u0000gä\u0011È\u009c\u00ad\u0011\u0091µv0ZÐ?C#Ä\u0000gä\u0011È\u009c\u00ad\u0011\u0091µv0ZÐ?C#Ä\bgÀ\u007f$\u001a\b\u0091m!Q¸¶=\u009aéÿUãÈÈ`,û\u0010\u0084u(Y\u009d¾\"¢\u0092\u0087)ëÁÐX4ä\u0019i}ê\u0000gä\u0011È\u009c\u00ad\u001a\u0091¹v6ZË?X#ó\b`ìúÐ\u0095µ\u001e\u0099\u0083\u0000cä\u0006È\u008d\u00ad=\u0091¤v!Zë?I#Á\bfìëÐ\u0094µ4\u0099\u0081~>b\u008eG5+Ý\u0010DôøÙu½ö\u0000gä\u0011È\u009c\u00ad\u0013\u0091²v.ZÝ?O#Ô\u0000gä\u0011È\u009c\u00ad\u0013\u0091²v.ZÝ?O#Ô\bgÙm=\u001b\u0011\u0096t\u0019H¸¯$\u0083×æEúÞÑX5ë\t\u0093l\u0016@\u008añR\u0015$9©\\&`\u0087\u0087\u001b«èÎzÒáùw\u001dÜ!¥D0h´\u00893mEAÈ$G\u0018æÿzÓ\u0089¶\u001bª\u0080\u0081\u0006eµYÍ<H\u0010Ô÷\u007f\u0000gä\u0011È\u009c\u00ad\u0013\u0091²v.ZÝ?O#Ô\bBìéÐ\u0090µ\u0005\u0099\u0081~+\u0000vä\u0011È\u009a\u00ad/\u0091¹v+ZÖ?o#Ï\byìøÐ\u009dµ\u0002\u0099\u0081\u0000gä\u0011È\u009c\u00ad\u001d\u0091¼v(Zë?X#Ò\b}ìæÐ\u009bµ\u0003\u009d\u008byýUp0ñ\fPëÄÇ\u0006¢¥¾+\u0095\u009dq\u001cM](ý\u0004|ã×ÿHÚÉ¶+\u0000gä\u0011È\u009c\u00ad\u001a\u0091¹v6ZË?X#ò\bqìïÐ\u0099µ\b\u0099©~9b¸G#+Ü\u0010\u0088ôæØN½ç\u0081XfÕJ\u001a/¢3,\u0018\u0085ü\u001bÀx¥â\u0089vnÜrIWò;!\u0000»ä\u0014É\u009f\u00ad\u0002<\u001cØiôó\u0091K\u00adÅJLf²\u00031\u001f«4\u001fÐ·ìÞ\u0089a¥ìBs^À{J\u0017¥,>È\u0083\u0095pq\u0015]\u009e8.\u0004·ã2ÏíªM¶Ò\u009djyþE£ \n\f\u0084ë?÷ºÒ=¾Â\u0085ID\u00ad Ï\u008cBé÷Õ~2Ü\u001e\u0014{\u0093g\u0013L¯¨\u001a\u0094KñÝÝN:ã&|\u0003ûo\u0018\u0000rä\u0011È\u0085\u00ad3\u0091¦v!Zþ?^#Á\byìíÐ°µ\u0019\u0099\u0097~,b©G.+Ñ\u0010ZG'£D\u008fÍêeÖä1r\u001d\u0088x6d\u009bO\u0002«±\u0097ÀòFÞÚ9A%ð\u0000fl\u0095W\u0018³§\u009e ú£\u0000cä\u0006È\u008d\u00ad=\u0091¤v!Zî?E#Å\bcìÇÐ\u0092µ3\u0099\u0088~1b¯G++ø\u0010AôïÙd½á¡\u0096\u0086\tj\u0092\u00adGI$e\u00ad\u0000\u0005<\u0084Û\u0012÷è\u0092V\u008eû¥uAÒ}¼\u0018&4¹Ó!Ï\u0090ê\u0006\u0086õ½xYÇt@\u0010Ãù\"\u001dG1ÌT|hå\u008f`£¯Æ\u0004Ú\u0084ñ\"\u0015\u0086)ÓLe`Ê\u0087l\u009bî¾iÒ¹é\u0000\r® %D X×\u007fH\u0093Ó\u0085\u0015acMî(a\u0014Ìóuß¦º7¦±\u008d\ri¶Uç0q\u001câûOçÐÂW®´\u0000gä\u0011È\u009c\u00ad\u0013\u0091¾v\u0010Z×?Y#Ã\b|ìÄÐ\u0095µ\u0003\u0099\u0090~=b¢G%+Æ³>W[{Ð\u001e`\"ùÅ|é¨\u008c\u0014\u0090\u0099» _´cñ\u0006A*ØÍ|Ñôôo\u0098¦£\u001bG\u0091j?\u000e¼\u0012Õ5PÙÏül\u0080ñ«-O\u0084R\nv±\u00194=³ÁÌäGâø\u0006\u009d*\u0016O¦s?\u0094º¸nÝÒÁ_êæ\u000er27W\u0087{\u001e\u009cº\u00802¥©É`òÝ\u0016N;å_yC\fd»\u0088\u0012\u00ad¼Ñ'úÂ\u001eE\u0003Ú'q\u0000cä\u0006È\u008d\u00ad=\u0091¤v!Zõ?I#Ä\b}ìéÐ¬µ\u001c\u0099\u0085~!b©G2+û\u0010FôßÙ\u007f½é¡\u0088\u0086\u0000j\u0085O 3¡\u0018SüÞáhÅñª\u007f\u008eôr\u0091W\u0006;¹ \"\u0000cä\u0006È\u008d\u00ad=\u0091¤v!Zõ?I#Ä\b}ìéÐ¬µ\u001c\u0099\u0085~!b©G2+û\u0010FôÏÙu½á¡\u0093\u0086/j\u008fO93¸\u0018PüÕáPÅýª@\u008eér\u0087W\u001c;¹ >\u0004¡éJ\u0000cä\u0006È\u008d\u00ad=\u0091¤v!Z÷?B#ì\buìñÐ\u0093µ\u0005\u0099\u0090~\u001bb¤G!+Ú\u0010OôùÙ\\½í¡\u008b\u0086\u0018j\u0085O:3\u00ad\u0018Në\u0084\u000fá#jFÚzC\u009dÆ±\u0010Ô¥È\u0006ã\u0087\u0007\u001b;z^ôrk\u0095ì\u0089_¬ÆÀ'ûª\u001f82\u009fV\u0002Jqmì\u0081b¤ÿØFó¨\u0017#\n¦.\u0011A\u008ee\u0015\u0000rä\u0011È\u0098\u00ad0\u0091±v'ZÝ?c#Î\bGìíÐ\u0099µ\u001b\u0099§~7b¡G0+Ø\u0010MôèÙu½È¡\u0091\u0086\u001fj\u0094O13¦\u0018YüÂ\u0000rä\u0011È\u0098\u00ad0\u0091±v'ZÝ?c#Î\bYìíÐ\u0098µ\u0019\u0099\u0085~\bb¾G%+Ä\u0010IôîÙu½à¡´\u0086\u0005j\u0093O 3\u00ad\u0018RüÕáV\u0000rä\u0011È\u0098\u00ad0\u0091±v'ZÝ?c#Î\bYìíÐ\u0098µ\u0019\u0099\u0085~\u0011b¢G&+Û\u0010dôõÙc½ð¡\u009d\u0086\u0002j\u0085O&()ÌJàÃ\u0085k¹ê^|r\u0086\u00178\u000b\u0095 \u0002Ä¶øÃ\u009dB±ÞV@Jøov\u0003\u009f8\u001fÜ¢ñ?\u0095¶\u0089Ì®YB÷gf\u001bà0\u0013Ô\u008eÉ\u0011í¦\u0082%-QÉ'åª\u0080.¼\u0083[\u0011wá\u0012h\u000e÷%VÁÛý®\u0098\u0005´³S\u0002O\u0096j\u0014\u0006ã=}ÙÁÔZ0?\u001c´y\u0004E\u009d¢\u0018\u008eÃëg÷öÜL8Õ\u0004¦a(M®ª\u0015¶§\u0093\u001cÿîÄt Ì\r_iØu³\u0000cä\u0006È\u008d\u00ad=\u0091¤v!Zì?n#ì\b}ìûÐ\u0088µ\u0015\u0099\u008a~=b¾\u0002½æÓÊ}¯ì\u0093UtåX\r=\u0094!\u001d\n´î%Òx·Ö\u009b_|ô`aEØ)\t\u0012\u008fö<Û¡¿>£I\u0084ÊÄÛ ¾\f5i\u0085U\u001c²\u0099\u009eWûñçzÌú(Y\u0014!q¿]\u0010º\u0089¦\u0007\u0083\u008cïiÔþ0A\u001dÚ\u0000sä\u0011È\u009c\u00ad\u000b\u0091µv&Zî?E#Å\bcìËÐ\u0090µ\u0019\u0099\u0081~6b¸vâ\u0092\u0080¾\rÛ\u009aç$\u0000·,jIÕUC~ê\u009at¦\bÃ¢ï\u0019\b \u001481¿]Q\u0000gä\u0011È\u009c\u00ad\u000b\u0091µv&Zî?E#Å\bcìËÐ\u0090µ\u0019\u0099\u0081~6b¸ù\n\u001d|1ñTfhØ\u008fK£\u0096Æ)Ú¿ñ\u0016\u0015\u0088)ôL^`å\u0087\\\u009bÄ¾CÒ\u00adÜ\n8h\u0014ÿqAMìªO\u0086³ã:ÿ«\u0000sä\u0011È\u0086\u00ad8\u0091\u009av7Z×?B#å\bbìíÐ\u0092µ\u0004Çv#\u0007\u000f\u009bj\u000eV±±6\u009dÁøOäòÏ{+ï\u0017\u008ar\t^\u0097¹*¥©\u0000gä\u0011È\u009c\u00ad\u001f\u0091¿v*ZÖ?I#Ã\b`ìçÐ\u008eðä\u0014\u00928\u001f]\u009ca<\u0086©ªOÏÊÓ[øã\u0000gä\u0011È\u009c\u00ad\b\u0091¹v)ZÝ\u0000gä\u0011È\u009c\u00ad\u0010\u0091±v7ZÌ?x#Ï\baìëÐ\u0094\u0000gä\u0011È\u009c\u00ad\u0010\u0091±v7ZÌ?x#Ï\baìëÐ\u0094µ$\u0099\u008d~5b©Ä\u0084 ò\f\u007fiüUF²Õ\u009e)ûªç-Ì\u0083(*\u0014|qç]nºÍ¦F\u0083×ï.u\u0095\u0091ð½{ØËäR\u0003×/\rJ¨V3}\u0083\u0099\n¥cÀðìw\u000bç\u0017T2Ð^-\u0000cä\u0006È\u008d\u00ad=\u0091¤v!Zù?H#Ö\bqìúÐ\u0088µ\u0019\u0099\u0097~=b¾G\t+Ú\u0010Nôój\u0001\u008ed¢ïÇ_ûÆ\u001cC0\u0099U<I§b\u0017\u0086\u009eº÷ßdóã\u0014s\bÊ-QÌ\u009e(û\u0004paÀ]YºÜ\u0096\bó´ï9Ä\u0080 \u0014\u001cuyäUv²Ë®u\u008bÜç=Ü´\u0000gä\u0011È\u009c\u00ad\u000f\u0091´v/Zî?I#Ò\bgìáÐ\u0093µ\u001eÆO\"9\u000e´k2W\u008d°\u0000\u009cüùWåìÎW*ö\u0016±s*_¿¸\u0019¤\u008b\u0081\u0006\u001cúø\u008cÔ\u0001±\u0092\u008d\"j¶FH#Ý?\\\u0014ÚðqÌ\n©»\u0085\u001cb·~\"[´7F\fÛ\u0000gä\u0011È\u009c\u00ad\u001d\u0091·v!ZÖ?X#ò\bqìåÐ\u0093µ\u0004\u0099\u0081~\u001bb£G.+Ò\u0010Aôû\u0000cä\u0006È\u008d\u00ad=\u0091¤v!Zü?I#Æ\buìýÐ\u0090µ\u0004\u0099¡~.b©G.+À\u0010bôïÙ\u007f½êG´£Â\u008fOêÌÖl1ù\u001d\u0005x\u009ad\u0010O³«4\u0097]òõÞR9ù%l\u0000úl\bW\u0095\u0000lä\u001bÈ\u008f\u00ad\u0019\u0091¦v!ZÖ?X\u0000iä\u0007È»\u00ad8\u0091»v\rZÖ?x#Å\bgìüÐ±µ\u001f\u0099\u0080~=Ö 2Ö\u001e[{ÚGs ×\u008c\u0006é\u009bõ\u0002Þ\u0097:*\u0006HcÔOQ¨ö´{\u0091óý\u001aÆ\u0080\"5\u0000gä\u0011È\u009c\u00ad\u001f\u0091¥v6ZÊ?I#Î\b`ìËÐ\u0093µ\u001e\u0099\u008a~=b¯G4+Û\u0010ZôÒÙq½é¡\u009d\u0011Põ&Ù«¼(\u0080\u0092g\u0001Ký.~2ù\u0019WýóÁ¢¤4\u0088§o\ns\u0095V\u0012:ñ\u0001QåÊÈJ¬ÖÊú.\u0094\u00028g [-¼±\u0090BõØéuÂè&i\u001a\f\u007f\u0086S$´®¨1\u008d·ábÚÕ>n\u0013áw{k\u000eL\u009b\u0000gä\u0011È\u009c\u00ad\u001f\u0091¿v*ZÞ?E#Ç\bZìçÐµµ\u001d\u0099\u0094~\u001db´G4+Æ\u0010IôÙÙf½á¡\u0096\u0086\u0018j°O13º\u0018_üÕáJÅì\u0000bä\u0006È\u0087\u00ad=\u0091´v'ZÙ?_#Ô\bQìþÐ\u0099µ\u001e\u0099\u0090ø\u008b\u001cý0pUõiD\u008eØ¢1Ç²Û%ð\u0095\u0014\u0001(~MèaK\u0086Û\u009aN¿ÊÓ1è£/!ËWçÚ\u0082_¾îYru\u009b\u0010\u0018\f\u008f'?Ã«ÿÔ\u009aB¶÷QmMïht\u0004¦?\u0001Û±ö3\u0092¬\u0000gä\u0011È\u009c\u00ad\u0019\u0091¨v4ZÝ?^#É\byìíÐ\u0092µ\u0004\u0099°~*b\u00adG)+À\u0010[2lÖ\u001aú\u0097\u009f\u0012££D?hÖ\rU\u0011Â:rÞæâ\u0099\u0087\u000f«»L!P¦u\"\u0019Ë\u0000nä\u0011È\u009f\u0000cä\u001cÈ\u0089\u00ad.cÂ\u0087¥«9Î\u009eò\n\u0015³9b\\ÿ@f\u0000oä\u0016È\u0082\u00ad9\u0091³v0Zð?M#Ó\bYìíÐ\u0088µ\u0018\u0099\u008b~<j\n\u008eo¢äÇTûÍ\u001cH0\u0083U0I§b\u0013\u0086\u0080º÷ßuóè\u0000rä\u0001È\u0086\u00ad\u0013\u0091¾v\tZÙ?E#Î\b@ìàÐ\u008eµ\u0015\u0099\u0085~<\u0000pä\u001bÈ\u009b\u00ad(\u0091\u009fv*Zõ?M#É\bzìÜÐ\u0094µ\u0002\u0099\u0081~9b¨\u0000pä\u001bÈ\u009b\u00ad(\u0091\u0094v!ZÔ?M#Ù\bqììÐ³µ\u001e\u0099©~9b¥G.+à\u0010@ôîÙu½å¡\u009c\u0005wá\u0004Í\u0083¨\u0016\u0094»s\u0002_Ò:G&Ë\rtéîÕ\u008d°\u001a\u009c\u0093{\tg¡B7.Ô\u0015LñýY\u008b½à\u0091`ôÓÈd/Ñ\u0003\u0000f¸z5Q\u0081µ\u0016\u0089dìÿÀp'Ñ;c\u001eÓr=I¶\u00ad\u0006\u0080\u008f\u0000pä\u001bÈ\u009b\u00ad(\u0091\u0094v!ZÔ?M#Ù\bqììÐ³µ\u001e\u0099§~7b¢G.+Ñ\u0010KôèÙ\u007f½ö¡¬\u0086\u0004j\u0092O13©\u0018X\u008c\u009ehèDe!é\u001dFúÞÖ ³¹¯\u001b\u0084\u009f`\u001e\\d9í\u0015~òÀîFËÍ§\u0000\u009c°x\u000bU\u00881\u001a-d\nçæPÃÃ¿B\u0094±p(m³I\u0002&\u0090\u0000rä\u0011È\u008f\u00ad5\u0091£v0ZÝ?^#â\bfìçÐ\u009dµ\u0014\u0099\u0087~9b¿G4+æ\u0010MôÿÙu½í¡\u008e\u0086\tj\u0092\u0000uä\u001aÈ\u009a\u00ad9\u0091·v-ZË?X#Å\bfìÊÐ\u008eµ\u001f\u0099\u0085~<b¯G!+Ç\u0010\\ôÎÙu½ç¡\u009d\u0086\u0005j\u0096O13º\r\u0017éaÅì |\u009cÁ{]Wº2\u001a.¹\u0005\u0016á\u008bÝø¸O\u0094ösBoÙJS&°\u0000gä\u0011È\u009c\u00ad\f\u0091±v-ZÊ?\u007f#Å\bwìçÐ\u0092µ\u0014\u0099«~:b¦G%+×\u0010\\\u0000gä\u0011È\u009c\u00ad\u0011\u0091µv ZÑ?M#ð\bxìéÐ\u0085µ\u0015\u0099\u0096\u0000gä\u0011È\u009c\u00ad\u0018\u0091µv2ZÑ?O#Å\bAìøÐ¨µ\u0019\u0099\u0089~=b\u0085G.+ù\u0010AôðÙy½÷Ü\u00108h\u0014å\u0000fä\u001bÈ\u009a\u00ad\u0019\u0091±v'ZÐ\u0000\u008aäñÈh\u00adÄ\u0091YvÚ\u0000Eä\u0006È\u009a\u00ad3\u0091¢vdZÝ?T#Å\bwìýÐ\u0088µ\u0019\u0099\u008a~?bìG-+Ñ\u0010\\ôôÙ\u007f½à¡Ø\u0000:äTÈ\u0085\u00ad9\u0091¤v,Z×?H#\u0080\bzìçÐ\u0088µP\u0099\u0097~-b¼G0+Û\u0010ZôèÙu½à".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, IronSourceError.ERROR_LEGACY_INIT_POST_FAILED);
        f28484 = cArr;
        f28485 = -8007503540314446732L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:188:0x0973  */
    /* JADX WARN: Code duplicated, block: B:301:0x0ef1  */
    /* JADX WARN: Code duplicated, block: B:30:0x0174  */
    /* JADX WARN: Code duplicated, block: B:356:0x11b4  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11871ci
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo29560(C11877co c11877co, String str, List<Object> list, C11907dr c11907dr) {
        long j;
        int i = 2 % 2;
        try {
            int iHashCode = str.hashCode();
            byte b = Ascii.f22491EM;
            j = 0;
            try {
                switch (iHashCode) {
                    case -2004702861:
                        if (!str.equals(m29867(580 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63808), 25 - Color.blue(0)).intern())) {
                            b = -1;
                        } else {
                            b = 36;
                        }
                        break;
                    case -2004586504:
                        if (!str.equals(m29867(TextUtils.lastIndexOf("", '0', 0) + 844, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28).intern())) {
                            b = -1;
                        } else {
                            b = 45;
                        }
                        break;
                    case -1940880443:
                        if (!str.equals(m29867((ViewConfiguration.getScrollDefaultDelay() >> 16) + 291, (char) (55562 - TextUtils.indexOf("", "", 0, 0)), TextUtils.getCapsMode("", 0, 0) + 14).intern())) {
                            b = -1;
                        } else {
                            b = 20;
                        }
                        break;
                    case -1935452010:
                        if (!str.equals(m29867(412 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (4321 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 22 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.f22493FS;
                        }
                        break;
                    case -1926335428:
                        if (!str.equals(m29867(ImageFormat.getBitsPerPixel(0) + 306, (char) (61749 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 14).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.NAK;
                        }
                        break;
                    case -1862527602:
                        if (!str.equals(m29867((Process.myTid() >> 22) + 1098, (char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.normalizeMetaState(0) + 16).intern())) {
                            b = -1;
                        } else {
                            b = 56;
                        }
                        break;
                    case -1811057601:
                        if (!str.equals(m29867(TextUtils.indexOf((CharSequence) "", '0', 0) + 44, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43288), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14).intern())) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case -1784213698:
                        if (!str.equals(m29867(622 - (ViewConfiguration.getScrollBarSize() >> 8), (char) Color.argb(0, 0, 0, 0), 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 38;
                        }
                        break;
                    case -1759122910:
                        if (!str.equals(m29867((ViewConfiguration.getTapTimeout() >> 16) + 872, (char) (Process.myTid() >> 22), ExpandableListView.getPackedPositionGroup(0L) + 30).intern())) {
                            b = -1;
                        } else {
                            b = 46;
                        }
                        break;
                    case -1673354837:
                        if (!str.equals(m29867(236 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14).intern())) {
                            b = -1;
                        } else {
                            b = 16;
                        }
                        break;
                    case -1654145783:
                        if (!str.equals(m29867((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1452, (char) (54982 - MotionEvent.axisFromString("")), View.MeasureSpec.getSize(0) + 20).intern())) {
                            b = -1;
                        } else {
                            b = 79;
                        }
                        break;
                    case -1475737971:
                        if (!str.equals(m29867((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1708, (char) (TextUtils.lastIndexOf("", '0') + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14).intern())) {
                            b = -1;
                        } else {
                            b = 94;
                        }
                        break;
                    case -1424907981:
                        if (!str.equals(m29867((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1670, (char) (25506 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8).intern())) {
                            b = -1;
                        } else {
                            b = 91;
                        }
                        break;
                    case -1412269250:
                        if (!str.equals(m29867(((Process.getThreadPriority(0) + 20) >> 6) + 1003, (char) ((-1) - TextUtils.lastIndexOf("", '0')), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16).intern())) {
                            b = -1;
                        } else {
                            int i2 = f28482 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            f28483 = i2 % 128;
                            int i3 = i2 % 2;
                            b = 51;
                        }
                        break;
                    case -1296960936:
                        if (!str.equals(m29867((ViewConfiguration.getScrollDefaultDelay() >> 16) + 394, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myTid() >> 22) + 18).intern())) {
                            b = -1;
                        } else {
                            int i4 = f28482 + 61;
                            f28483 = i4 % 128;
                            int i5 = i4 % 2;
                            b = Ascii.ESC;
                        }
                        break;
                    case -1296887564:
                        if (!str.equals(m29867((ViewConfiguration.getFadingEdgeLength() >> 16) + 1889, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 27 - Color.blue(0)).intern())) {
                            b = -1;
                        } else {
                            b = 102;
                        }
                        break;
                    case -1274492040:
                        if (!str.equals(m29867(1999 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (235 - TextUtils.lastIndexOf("", '0')), 6 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                            b = -1;
                        } else {
                            b = 109;
                        }
                        break;
                    case -1253789331:
                        if (!str.equals(m29867(1863 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SUB).intern())) {
                            b = -1;
                        } else {
                            int i6 = f28482 + 37;
                            f28483 = i6 % 128;
                            if (i6 % 2 == 0) {
                                b = 101;
                            } else {
                                b = 19;
                            }
                        }
                        break;
                    case -1242814655:
                        if (!str.equals(m29867((Process.myPid() >> 22) + 1410, (char) (18386 - TextUtils.lastIndexOf("", '0')), Color.alpha(0) + 19).intern())) {
                            b = -1;
                        } else {
                            b = 76;
                        }
                        break;
                    case -1214823651:
                        if (!str.equals(m29867(491 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ImageFormat.getBitsPerPixel(0) + 1), 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 32;
                        }
                        break;
                    case -1198560170:
                        if (!str.equals(m29867(1804 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 28 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                            b = -1;
                        } else {
                            b = 99;
                        }
                        break;
                    case -1145074375:
                        if (!str.equals(m29867((ViewConfiguration.getTapTimeout() >> 16) + 640, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45916), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35).intern())) {
                            b = -1;
                        } else {
                            b = 39;
                        }
                        break;
                    case -1124602405:
                        if (!str.equals(m29867(1645 - TextUtils.lastIndexOf("", '0'), (char) (Color.red(0) + 12811), (ViewConfiguration.getEdgeSlop() >> 16) + 18).intern())) {
                            b = -1;
                        } else {
                            b = 88;
                        }
                        break;
                    case -1071201617:
                        if (!str.equals(m29867(1953 - View.combineMeasuredStates(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 14).intern())) {
                            b = -1;
                        } else {
                            b = 105;
                        }
                        break;
                    case -1029444991:
                        if (!str.equals(m29867(928 - (Process.myTid() >> 22), (char) (10331 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 31).intern())) {
                            b = -1;
                        } else {
                            b = 48;
                        }
                        break;
                    case -1029356152:
                        if (!str.equals(m29867(101 - (ViewConfiguration.getTouchSlop() >> 8), (char) (21325 - (ViewConfiguration.getTapTimeout() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 14).intern())) {
                            b = -1;
                        } else {
                            b = 7;
                        }
                        break;
                    case -1013936139:
                        if (!str.equals(m29867(1472 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getTouchSlop() >> 8), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 80;
                        }
                        break;
                    case -997695964:
                        if (!str.equals(m29867(1740 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Process.getGidForName("") + 24).intern())) {
                            b = -1;
                        } else {
                            b = 96;
                        }
                        break;
                    case -992018155:
                        if (!str.equals(m29867(1586 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (63724 - Color.alpha(0)), 19 - (Process.myPid() >> 22)).intern())) {
                            b = -1;
                        } else {
                            int i7 = f28483 + 33;
                            f28482 = i7 % 128;
                            b = i7 % 2 != 0 ? (byte) 85 : (byte) 67;
                        }
                        break;
                    case -952854909:
                        if (!str.equals(m29867((KeyEvent.getMaxKeyCode() >> 16) + 81, (char) (32210 - Color.argb(0, 0, 0, 0)), 12 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                            b = -1;
                        } else {
                            b = 5;
                        }
                        break;
                    case -924373867:
                        if (!str.equals(m29867(1263 - TextUtils.getTrimmedLength(""), (char) (Process.getGidForName("") + 1), TextUtils.getTrimmedLength("") + 20).intern())) {
                            b = -1;
                        } else {
                            b = 68;
                        }
                        break;
                    case -899502102:
                        if (!str.equals(m29867(View.getDefaultSize(0, 0) + 1141, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12).intern())) {
                            b = -1;
                        } else {
                            b = 59;
                        }
                        break;
                    case -834290483:
                        if (!str.equals(m29867(743 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 39 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 42;
                        }
                        break;
                    case -788426345:
                        if (!str.equals(m29867(363 - View.resolveSizeAndState(0, 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 13 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                            b = -1;
                        }
                        break;
                    case -764989270:
                        if (!str.equals(m29867(675 - ExpandableListView.getPackedPositionType(0L), (char) (58011 - View.MeasureSpec.makeMeasureSpec(0, 0)), 31 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 40;
                        }
                        break;
                    case -678635926:
                        if (!str.equals(m29867(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1993, (char) TextUtils.indexOf("", ""), 8 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 108;
                        }
                        break;
                    case -633198692:
                        if (!str.equals(m29867(TextUtils.indexOf("", "", 0) + 1680, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 92;
                        }
                        break;
                    case -622788386:
                        if (!str.equals(m29867((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 280, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 9 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                            b = -1;
                        } else {
                            int i8 = f28483 + 13;
                            f28482 = i8 % 128;
                            if (i8 % 2 != 0) {
                                b = 19;
                            } else {
                                b = 43;
                            }
                        }
                        break;
                    case -588814953:
                        if (!str.equals(m29867((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1169, (char) (ViewConfiguration.getTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.f22490CR).intern())) {
                            b = -1;
                        } else {
                            b = Base64.padSymbol;
                        }
                        break;
                    case -525192167:
                        if (!str.equals(m29867(ExpandableListView.getPackedPositionType(0L) + 1245, (char) (30198 - View.getDefaultSize(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19).intern())) {
                            b = -1;
                        }
                        break;
                    case -502936072:
                        if (!str.equals(m29867(View.resolveSize(0, 0) + 1627, (char) (ViewConfiguration.getTapTimeout() >> 16), 19 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 87;
                        }
                        break;
                    case -429121350:
                        if (!str.equals(m29867(View.getDefaultSize(0, 0) + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, (char) View.resolveSize(0, 0), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 17;
                        }
                        break;
                    case -264400535:
                        if (!str.equals(m29867(510 - Gravity.getAbsoluteGravity(0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 18261), View.resolveSizeAndState(0, 0, 0) + 22).intern())) {
                            b = -1;
                        } else {
                            b = 33;
                        }
                        break;
                    case -100132040:
                        if (!str.equals(m29867(Color.blue(0) + 151, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 16279), 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.f22503VT;
                        }
                        break;
                    case -75121853:
                        if (!str.equals(m29867(TextUtils.getTrimmedLength("") + 1192, (char) Color.alpha(0), 7 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 63;
                        }
                        break;
                    case -75062501:
                        if (!str.equals(m29867((KeyEvent.getMaxKeyCode() >> 16) + 94, (char) (42151 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 7).intern())) {
                            b = -1;
                        } else {
                            int i9 = f28482 + 45;
                            f28483 = i9 % 128;
                            int i10 = i9 % 2;
                            b = 6;
                        }
                        break;
                    case -39321397:
                        if (!str.equals(m29867(29 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 33924), 13 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case -37751474:
                        if (!str.equals(m29867((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 318, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35155), 15 - Color.blue(0)).intern())) {
                            b = -1;
                        } else {
                            int i11 = f28482 + 31;
                            f28483 = i11 % 128;
                            if (i11 % 2 == 0) {
                                b = 22;
                            } else {
                                b = 53;
                            }
                        }
                        break;
                    case -20195056:
                        if (!str.equals(m29867(TextUtils.lastIndexOf("", '0', 0, 0) + 1020, (char) (724 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0') + 25).intern())) {
                            b = -1;
                        } else {
                            b = 52;
                        }
                        break;
                    case 107868:
                        if (!str.equals(m29867((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1989, (char) (56444 - MotionEvent.axisFromString("")), 4 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 107;
                        }
                        break;
                    case 108960:
                        if (!str.equals(m29867((Process.myTid() >> 22) + 1664, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3).intern())) {
                            b = -1;
                        } else {
                            b = 89;
                        }
                        break;
                    case 1820707:
                        if (!str.equals(m29867(1332 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50727), (ViewConfiguration.getTapTimeout() >> 16) + 17).intern())) {
                            b = -1;
                        } else {
                            b = 72;
                        }
                        break;
                    case 2656096:
                        if (!str.equals(m29867(1133 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 56441), (ViewConfiguration.getEdgeSlop() >> 16) + 9).intern())) {
                            b = -1;
                        } else {
                            b = 58;
                        }
                        break;
                    case 3052374:
                        if (!str.equals(m29867(1667 - (Process.myTid() >> 22), (char) ((-1) - Process.getGidForName("")), Gravity.getAbsoluteGravity(0, 0) + 4).intern())) {
                            b = -1;
                        } else {
                            b = 90;
                        }
                        break;
                    case 15484010:
                        if (!str.equals(m29867(1437 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) TextUtils.getOffsetAfter("", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14).intern())) {
                            b = -1;
                        } else {
                            b = 78;
                        }
                        break;
                    case 134176114:
                        if (!str.equals(m29867(ExpandableListView.getPackedPositionChild(0L) + 1228, (char) (Color.argb(0, 0, 0, 0) + 50403), 18 - Color.green(0)).intern())) {
                            b = -1;
                        } else {
                            b = 66;
                        }
                        break;
                    case 151150886:
                        if (!str.equals(m29867(1300 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (Color.argb(0, 0, 0, 0) + 52477), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19).intern())) {
                            b = -1;
                        } else {
                            b = 70;
                        }
                        break;
                    case 171861489:
                        if (!str.equals(m29867(132 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.argb(0, 0, 0, 0) + 19).intern())) {
                            b = -1;
                        } else {
                            b = 10;
                        }
                        break;
                    case 186649624:
                        if (!str.equals(m29867(ImageFormat.getBitsPerPixel(0) + 1784, (char) (23083 - AndroidCharacter.getMirror('0')), 21 - TextUtils.getOffsetBefore("", 0)).intern())) {
                            b = -1;
                        } else {
                            b = 98;
                        }
                        break;
                    case 190032796:
                        if (!str.equals(m29867((ViewConfiguration.getWindowTouchSlop() >> 8) + 15, (char) (35642 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15).intern())) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 317728381:
                        if (!str.equals(m29867(TextUtils.getOffsetBefore("", 0) + 1388, (char) TextUtils.indexOf("", "", 0), 22 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                            b = -1;
                        } else {
                            b = 75;
                        }
                        break;
                    case 370758723:
                        if (!str.equals(m29867(1934 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 19 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 104;
                        }
                        break;
                    case 383897184:
                        if (!str.equals(m29867(Color.red(0) + 1154, (char) (ExpandableListView.getPackedPositionGroup(0L) + 50967), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16).intern())) {
                            b = -1;
                        } else {
                            int i12 = f28483 + 113;
                            f28482 = i12 % 128;
                            if (i12 % 2 != 0) {
                                b = 60;
                            } else {
                                b = 72;
                            }
                        }
                        break;
                    case 386145701:
                        if (!str.equals(m29867(454 - (Process.myTid() >> 22), (char) (38162 - Process.getGidForName("")), 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.f22498RS;
                        }
                        break;
                    case 398700013:
                        if (!str.equals(m29867(TextUtils.indexOf("", "") + 1283, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27234), 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 69;
                        }
                        break;
                    case 404330675:
                        if (!str.equals(m29867(Gravity.getAbsoluteGravity(0, 0) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 49180), 22 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 15;
                        }
                        break;
                    case 413143991:
                        if (!str.equals(m29867((ViewConfiguration.getDoubleTapTimeout() >> 16) + 334, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 15 - Drawable.resolveOpacity(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.ETB;
                        }
                        break;
                    case 421306799:
                        if (!str.equals(m29867(TextUtils.indexOf("", "") + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), ExpandableListView.getPackedPositionType(0L) + 9).intern())) {
                            b = -1;
                        } else {
                            b = 9;
                        }
                        break;
                    case 449440345:
                        if (!str.equals(m29867(1572 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 14).intern())) {
                            b = -1;
                        } else {
                            b = 84;
                        }
                        break;
                    case 451302467:
                        if (!str.equals(m29867(1349 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (7325 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 73;
                        }
                        break;
                    case 468780064:
                        if (!str.equals(m29867((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 557, (char) (MotionEvent.axisFromString("") + 44342), (ViewConfiguration.getEdgeSlop() >> 16) + 22).intern())) {
                            b = -1;
                        } else {
                            b = 35;
                        }
                        break;
                    case 496987426:
                        if (!str.equals(m29867(TextUtils.getCapsMode("", 0, 0) + IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 16).intern())) {
                            b = -1;
                        } else {
                            b = 95;
                        }
                        break;
                    case 502192375:
                        if (!str.equals(m29867((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 376, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 40429), 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.SUB;
                        }
                        break;
                    case 518569412:
                        if (!str.equals(m29867(473 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 17630), 18 - TextUtils.getOffsetAfter("", 0)).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.f22502US;
                        }
                        break;
                    case 526577620:
                        if (!str.equals(m29867(222 - AndroidCharacter.getMirror('0'), (char) (KeyEvent.keyCodeFromString("") + 24072), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.f22492FF;
                        }
                        break;
                    case 600996866:
                        if (!str.equals(m29867(1064 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), 16 - View.MeasureSpec.getSize(0)).intern())) {
                            b = -1;
                        } else {
                            b = 54;
                        }
                        break;
                    case 618460119:
                        if (!str.equals(m29867((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 194, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 9).intern())) {
                            b = -1;
                        } else {
                            b = 13;
                        }
                        break;
                    case 622025239:
                        if (!str.equals(m29867((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1368, (char) Color.green(0), 20 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                            b = -1;
                        } else {
                            b = 74;
                        }
                        break;
                    case 660677592:
                        if (!str.equals(m29867(706 - View.MeasureSpec.getMode(0), (char) TextUtils.getOffsetBefore("", 0), 36 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 41;
                        }
                        break;
                    case 672646709:
                        if (!str.equals(m29867(Process.getGidForName("") + 273, (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 9).intern())) {
                            b = -1;
                        } else {
                            b = 18;
                        }
                        break;
                    case 675563679:
                        if (!str.equals(m29867(KeyEvent.getDeadChar(0, 0) + 1916, (char) (3440 - View.resolveSizeAndState(0, 0, 0)), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 103;
                        }
                        break;
                    case 759503924:
                        if (!str.equals(m29867(KeyEvent.normalizeMetaState(0) + 980, (char) (ExpandableListView.getPackedPositionChild(0L) + 54330), 22 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                            b = -1;
                        } else {
                            b = 50;
                        }
                        break;
                    case 776628755:
                        if (!str.equals(m29867((ViewConfiguration.getScrollBarFadeDuration() >> 16) + TypedValues.Custom.TYPE_COLOR, (char) (Process.myPid() >> 22), 26 - Color.green(0)).intern())) {
                            b = -1;
                        } else {
                            b = 47;
                        }
                        break;
                    case 791624502:
                        if (!str.equals(m29867((ViewConfiguration.getTouchSlop() >> 8) + 1832, (char) (Color.alpha(0) + 36089), (Process.myTid() >> 22) + 32).intern())) {
                            b = -1;
                        } else {
                            b = 100;
                        }
                        break;
                    case 861400366:
                        if (!str.equals(m29867(TextUtils.getCapsMode("", 0, 0) + 434, (char) (15480 - (ViewConfiguration.getScrollBarSize() >> 8)), (Process.myPid() >> 22) + 20).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.f22494GS;
                        }
                        break;
                    case 956170787:
                        if (!str.equals(m29867(Color.argb(0, 0, 0, 0) + 1114, (char) (TextUtils.getOffsetBefore("", 0) + 63853), TextUtils.indexOf((CharSequence) "", '0', 0) + 19).intern())) {
                            b = -1;
                        } else {
                            b = 57;
                        }
                        break;
                    case 1057201549:
                        if (!str.equals(m29867((ViewConfiguration.getTapTimeout() >> 16) + 1763, (char) (1286 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 20).intern())) {
                            b = -1;
                        } else {
                            int i13 = f28482 + 65;
                            f28483 = i13 % 128;
                            int i14 = i13 % 2;
                            b = 97;
                        }
                        break;
                    case 1076958445:
                        if (!str.equals(m29867(349 - Drawable.resolveOpacity(0, 0), (char) View.getDefaultSize(0, 0), '>' - AndroidCharacter.getMirror('0')).intern())) {
                            b = -1;
                        } else {
                            b = 24;
                        }
                        break;
                    case 1107904233:
                        if (!str.equals(m29867(782 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28).intern())) {
                            b = -1;
                        } else {
                            b = 43;
                        }
                        break;
                    case 1125810632:
                        if (!str.equals(m29867(View.combineMeasuredStates(0, 0) + 1541, (char) (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32).intern())) {
                            b = -1;
                        } else {
                            b = 83;
                        }
                        break;
                    case 1414080697:
                        if (!str.equals(m29867(57 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((Process.myPid() >> 22) + 35496), 24 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case 1444942133:
                        if (!str.equals(m29867(811 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 60391), (Process.myTid() >> 22) + 33).intern())) {
                            b = -1;
                        } else {
                            b = 44;
                        }
                        break;
                    case 1521072706:
                        if (!str.equals(m29867(1496 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Gravity.getAbsoluteGravity(0, 0) + 4407), 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                            b = -1;
                        } else {
                            b = 81;
                        }
                        break;
                    case 1525623361:
                        if (!str.equals(m29867(Color.argb(0, 0, 0, 0) + 1967, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 22 - (Process.myPid() >> 22)).intern())) {
                            b = -1;
                        } else {
                            b = 106;
                        }
                        break;
                    case 1546196954:
                        if (!str.equals(m29867(1517 - Color.argb(0, 0, 0, 0), (char) (51860 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 24 - View.MeasureSpec.getSize(0)).intern())) {
                            b = -1;
                        } else {
                            b = 82;
                        }
                        break;
                    case 1557083836:
                        if (!str.equals(m29867(532 - KeyEvent.keyCodeFromString(""), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 25).intern())) {
                            b = -1;
                        } else {
                            b = 34;
                        }
                        break;
                    case 1590874683:
                        if (!str.equals(m29867(1605 - Color.blue(0), (char) (Gravity.getAbsoluteGravity(0, 0) + 12102), (ViewConfiguration.getTouchSlop() >> 8) + 22).intern())) {
                            b = -1;
                        } else {
                            b = 86;
                        }
                        break;
                    case 1622498214:
                        if (!str.equals(m29867(960 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((Process.myPid() >> 22) + 11574), (Process.myTid() >> 22) + 20).intern())) {
                            b = -1;
                        } else {
                            b = 49;
                        }
                        break;
                    case 1664124883:
                        if (!str.equals(m29867(ExpandableListView.getPackedPositionGroup(0L), (char) ((-16746610) - Color.rgb(0, 0, 0)), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case 1746583808:
                        if (!str.equals(m29867(1210 - TextUtils.lastIndexOf("", '0', 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 15 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                            b = -1;
                        } else {
                            b = 65;
                        }
                        break;
                    case 1751981113:
                        if (!str.equals(m29867(1694 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TextUtils.indexOf("", "", 0, 0) + 27241), 14 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 93;
                        }
                        break;
                    case 1777572999:
                        if (!str.equals(m29867(TextUtils.lastIndexOf("", '0', 0, 0) + 605, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 34162), (ViewConfiguration.getFadingEdgeLength() >> 16) + 18).intern())) {
                            b = -1;
                        } else {
                            b = 37;
                        }
                        break;
                    case 1825714001:
                        if (!str.equals(m29867(((Process.getThreadPriority(0) + 20) >> 6) + IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED, (char) (50361 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 53;
                        }
                        break;
                    case 1876204439:
                        if (!str.equals(m29867(1080 - TextUtils.getOffsetAfter("", 0), (char) (30353 - View.getDefaultSize(0, 0)), TextUtils.getOffsetBefore("", 0) + 18).intern())) {
                            b = -1;
                        } else {
                            b = 55;
                        }
                        break;
                    case 1953253188:
                        if (!str.equals(m29867(114 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), Color.green(0) + 8).intern())) {
                            b = -1;
                        } else {
                            b = 8;
                        }
                        break;
                    case 1988391289:
                        if (!str.equals(m29867(1182 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.blue(0) + 61571), 10 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                            b = -1;
                        } else {
                            b = 62;
                        }
                        break;
                    case 1989757366:
                        if (!str.equals(m29867(1428 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myTid() >> 22) + 8).intern())) {
                            b = -1;
                        } else {
                            b = 77;
                        }
                        break;
                    case 1992394620:
                        if (!str.equals(m29867(204 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 9 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                            b = -1;
                        } else {
                            b = 14;
                        }
                        break;
                    case 1993407379:
                        if (!str.equals(m29867(1199 - (ViewConfiguration.getScrollBarSize() >> 8), (char) View.MeasureSpec.getMode(0), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = SignedBytes.MAX_POWER_OF_TWO;
                        }
                        break;
                    case 2034588468:
                        if (!str.equals(m29867((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1319, (char) View.MeasureSpec.getMode(0), 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 71;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        return C11887cy.m29855(list);
                    case 1:
                        return C11887cy.m29858(list);
                    case 2:
                        return C11887cy.m29857(c11877co);
                    case 3:
                        return C11887cy.m29856(c11877co, list);
                    case 4:
                        return C11892dc.m29868(list);
                    case 5:
                        return Boolean.valueOf(C11892dc.m29870(list));
                    case 6:
                        return C11892dc.m29871(list);
                    case 7:
                        return C11892dc.m29869(list);
                    case 8:
                        return C11881cs.m29787(list);
                    case 9:
                        return C11881cs.m29789(list);
                    case 10:
                        return C11881cs.m29790(list);
                    case 11:
                        return C11881cs.m29791(list);
                    case 12:
                        return C11881cs.m29788();
                    case 13:
                        return C11890da.m29865(list);
                    case 14:
                        return C11890da.m29864(list);
                    case 15:
                        return C11890da.m29866();
                    case 16:
                        return C11895df.m29888(list);
                    case 17:
                        return C11895df.m29890(list);
                    case 18:
                        return C11895df.m29887(list);
                    case 19:
                        return C11895df.m29889(list);
                    case 20:
                        return this.f28497.m29892(c11907dr, c11877co, list);
                    case 21:
                        return this.f28497.m29891(c11907dr, c11877co, list);
                    case 22:
                        return this.f28497.m29893(c11907dr, c11877co, list);
                    case 23:
                        List<Object> listM29894 = this.f28497.m29894(c11907dr, c11877co, list);
                        int i15 = f28482 + 63;
                        f28483 = i15 % 128;
                        int i16 = i15 % 2;
                        return listM29894;
                    case 24:
                        return Integer.valueOf(C11894de.m29886(list));
                    case 25:
                        return C11894de.m29882(list);
                    case 26:
                        return C11894de.m29885(list);
                    case 27:
                        return C11894de.m29884(list);
                    case 28:
                        return Boolean.valueOf(C11894de.m29883(list));
                    case 29:
                        return C11894de.m29881(list);
                    case 30:
                        return this.f28491.m29832(c11877co, list, c11907dr);
                    case 31:
                        return C11885cw.m29814(list);
                    case 32:
                        return C11885cw.m29819(list);
                    case 33:
                        return this.f28491.m29831(list);
                    case 34:
                        return this.f28491.m29830(c11877co, list, c11907dr);
                    case 35:
                        return this.f28491.m29835(list);
                    case 36:
                        return this.f28491.m29837(c11877co, list, c11907dr);
                    case 37:
                        return C11885cw.m29817(list);
                    case 38:
                        return C11885cw.m29812(list);
                    case 39:
                        return this.f28491.m29836(c11877co, list, c11907dr);
                    case 40:
                        return this.f28491.m29834(c11877co, list, c11907dr);
                    case 41:
                        return this.f28491.m29827(c11877co, list, c11907dr);
                    case 42:
                        return this.f28491.m29823(c11877co, list, c11907dr);
                    case 43:
                        return this.f28491.m29821(c11877co, list, c11907dr);
                    case 44:
                        return this.f28491.m29829(c11877co, list, c11907dr);
                    case 45:
                        return this.f28491.m29826(list);
                    case 46:
                        return this.f28491.m29828(list);
                    case 47:
                        return this.f28491.m29824(list);
                    case 48:
                        return this.f28491.m29822(list);
                    case 49:
                        return C11885cw.m29808(list);
                    case 50:
                        return this.f28491.m29825(c11877co, list, c11907dr);
                    case 51:
                        return this.f28491.m29833(c11877co, list);
                    case 52:
                        return Boolean.valueOf(C11885cw.m29809(list));
                    case 53:
                        return C11885cw.m29810(list);
                    case 54:
                        return C11885cw.m29811(list);
                    case 55:
                        return C11885cw.m29807(list);
                    case 56:
                        return C11885cw.m29805(list);
                    case 57:
                        return C11885cw.m29806(list);
                    case 58:
                        return C11883cu.m29799(c11877co, list);
                    case 59:
                        return C11880cr.m29771(c11877co, list);
                    case 60:
                        return this.f28492.m29786(c11877co, list, c11907dr);
                    case 61:
                        return C11880cr.m29783(c11877co);
                    case 62:
                        return C11880cr.m29780(c11877co);
                    case 63:
                        return Long.valueOf(C11880cr.m29782());
                    case 64:
                        return C11880cr.m29778();
                    case 65:
                        return Long.valueOf(C11880cr.m29779());
                    case 66:
                        return C11880cr.m29773();
                    case 67:
                        return C11880cr.m29770();
                    case 68:
                        return C11880cr.m29762();
                    case 69:
                        return C11880cr.m29768();
                    case 70:
                        return C11880cr.m29766();
                    case 71:
                        return C11880cr.m29776(c11877co);
                    case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                        return C11880cr.m29772(c11877co);
                    case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                        return C11880cr.m29765();
                    case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                        return C11880cr.m29764();
                    case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                        return C11880cr.m29775(c11877co);
                    case 76:
                        return C11880cr.m29769(c11877co);
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        return C11880cr.m29774(list);
                    case 78:
                        return Boolean.valueOf(C11880cr.m29759());
                    case 79:
                        return C11880cr.m29781(list);
                    case 80:
                        return C11880cr.m29763(c11877co);
                    case 81:
                        return C11880cr.m29767(c11877co);
                    case 82:
                        return Boolean.valueOf(C11880cr.m29758());
                    case 83:
                        return Double.valueOf(C11880cr.m29757());
                    case 84:
                        return this.f28492.m29785(list);
                    case 85:
                        return C11880cr.m29760();
                    case 86:
                        return C11880cr.m29761();
                    case 87:
                        return C11880cr.m29756();
                    case 88:
                        return C11880cr.m29784(list);
                    case 89:
                        return C11888cz.m29860(c11877co, list);
                    case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                        return Character.valueOf(C11888cz.m29859(list));
                    case 91:
                        return C11888cz.m29863(list);
                    case 92:
                        return Boolean.valueOf(C11888cz.m29861(list));
                    case 93:
                        return this.f28486.m29879(c11877co, list, c11907dr);
                    case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                        return this.f28486.m29876(c11877co, list, c11907dr);
                    case 95:
                        return this.f28486.m29877(c11877co, list, c11907dr);
                    case 96:
                        return this.f28486.m29878(c11877co, list, c11907dr);
                    case 97:
                        return this.f28486.m29880(c11877co, list, c11907dr);
                    case 98:
                        return this.f28486.m29875(c11877co, list, c11907dr);
                    case 99:
                        return this.f28486.m29874(c11877co, list, c11907dr);
                    case 100:
                        return C11882ct.m29793(list);
                    case 101:
                        return C11882ct.m29796(list);
                    case 102:
                        return C11882ct.m29798(list);
                    case 103:
                        return C11882ct.m29795(list);
                    case 104:
                        return C11882ct.m29794(list);
                    case 105:
                        return C11882ct.m29792(list);
                    case 106:
                        return Long.valueOf(C11882ct.m29797());
                    case 107:
                        return this.f28487.m29802(c11877co, list);
                    case 108:
                        return this.f28487.m29804(c11877co, list);
                    case 109:
                        return this.f28487.m29803(c11877co, list);
                    default:
                        String strM29666 = c11877co.m29666();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m29867(2005 - View.MeasureSpec.getSize(0), (char) ExpandableListView.getPackedPositionGroup(0L), 23 - KeyEvent.keyCodeFromString("")).intern());
                        sb.append(str);
                        sb.append(m29867((Process.myPid() >> 22) + 2028, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 22).intern());
                        C11875cm.m29607(strM29666, sb.toString(), null);
                        return null;
                }
            } catch (Exception e) {
                e = e;
                String strM29667 = c11877co.m29666();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m29867(ExpandableListView.getPackedPositionGroup(j) + 2005, (char) TextUtils.indexOf("", ""), 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))).intern());
                sb2.append(str);
                C11875cm.m29607(strM29667, sb2.toString(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29867(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f28484[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28485)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
