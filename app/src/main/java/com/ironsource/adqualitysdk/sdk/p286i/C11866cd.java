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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdvertisementPresentationFactory;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.VungleWebViewActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.ui.view.WebViewAPI;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11866cd extends AbstractC11840be {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28077 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static char f28078 = 6;

    /* JADX INFO: renamed from: ﻏ */
    private static int f28079 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f28080 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static long f28081 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f28082 = {'V', AbstractJsonLexerKt.UNICODE_ESC, 'n', 'g', 'l', 'e', 'A', 'm', 'a', 'z', 'o', 'c', 't', 'i', 'v', 'y', 'd', 'r', 's', 'R', 'p', 'L', 'w', 'P', 'C', '_', 'F', 'W', 'b', 'I', 'M', 'D', 'E', '.', 'B', 'k'};

    /* JADX INFO: renamed from: ﾒ */
    private static char f28083 = 58651;

    /* JADX INFO: renamed from: ﻛ */
    private String f28084;

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m29488(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f28077 + 73;
        f28079 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29490(advertisement);
        }
        m29490(advertisement);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ Placement m29489(Repository repository, String str) {
        int i = 2 % 2;
        int i2 = f28077 + 107;
        f28079 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29496(repository, str);
        }
        m29496(repository, str);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29493(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f28077 + 107;
        f28079 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29495(advertisement);
        }
        m29495(advertisement);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ boolean m29494(Placement placement) {
        int i = 2 % 2;
        int i2 = f28079 + 47;
        f28077 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM29492 = m29492(placement);
        int i4 = f28077 + 101;
        f28079 = i4 % 128;
        if (i4 % 2 != 0) {
            return zM29492;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ Map m29498(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f28077 + 1;
        f28079 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapM29486 = m29486(advertisement);
        int i4 = f28077 + 61;
        f28079 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return mapM29486;
    }

    public C11866cd(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f28079 + 71;
        f28077 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strMo28831 = mo28831();
            if (strMo28831 == null) {
                int i3 = f28079 + 97;
                f28077 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 66 / 0;
                }
                return null;
            }
            return strMo28831.split(m29497("뫲", (char) (26067 - Color.blue(0)), "\u0000\u0000\u0000\u0000", 529874210 - (ViewConfiguration.getPressedStateDuration() >> 16), "≧锽팟ꍥ").intern())[1];
        }
        mo28831();
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo28831() {
        int i = 2 % 2;
        int i2 = f28077 + 67;
        f28079 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (this.f28084 == null) {
            String strM29485 = m29485();
            this.f28084 = strM29485;
            m28832(strM29485);
            int i3 = f28079 + 3;
            f28077 = i3 % 128;
            int i4 = i3 % 2;
        }
        String str = this.f28084;
        int i5 = f28079 + 71;
        f28077 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﮐ */
    private static String m29485() {
        int i = 2 % 2;
        int i2 = f28079 + 29;
        f28077 = i2 % 128;
        int i3 = i2 % 2;
        Class clsM29487 = m29487();
        C12019hv.m30362().m30364();
        try {
            Iterator<Field> it = C12019hv.m30362().m30364().m30309(clsM29487, C12014hq.m30306().m30291(String.class).m30292(8).m30290(16).m30293()).iterator();
            int i4 = f28079 + 41;
            f28077 = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                String str = (String) it.next().get(null);
                if (str.startsWith(m29491("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\b\u0004", 12 - (Process.myTid() >> 22), (byte) (65 - TextUtils.indexOf("", ""))).intern()) || str.startsWith(m29497("㠆ፘ\udfff\u0dbe騾料鱤\ue5edz\uabfeᆬ", (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", (-379189938) - (ViewConfiguration.getPressedStateDuration() >> 16), "乢昅㗩悪").intern())) {
                    return str.split(m29497("쵶", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 34586), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionGroup(0L) - 1888353581, "펉爂\u1a8f\ue087").intern())[0];
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2075872274:
                b = !str.equals(m29497("龴槃竐妩ࠊ腑\ude02ໃ捌邻䎐䠏쪝\u1c8b퐮\uea9f", (char) (AndroidCharacter.getMirror('0') + 20484), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollBarFadeDuration() >> 16, "Ⰽ\ufff0㑕ፐ").intern()) ? (byte) -1 : (byte) 17;
                break;
            case -2012803321:
                b = !str.equals(m29497("Ӽ⪰힝≮꼅ﵲ븎匽彯ᆵꭡ풏惷틲놡ㅃ㴑㣚璠랡\ue521\udffaྂꆓ끷睁값旯㖫鿬ᕥ⓵桢᧦뗅䳮洨䣯土ꮡꁼⱦ", (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2798), "\u0000\u0000\u0000\u0000", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "蚮앧\uee48\uf70a").intern()) ? (byte) -1 : (byte) 32;
                break;
            case -1853707364:
                if (!str.equals(m29497("㞙\u218f㝥Ｌ堅꼝㌉ⱜ싋\u0015ꑡ奞浶面\uebd3㝎㗈过焐쿔帺哑ጰ篩刢婅쬧\uec57꾕蒇\uf27b禳眧嗰멝嵲츉\u07ba\ua7e8ꊄ᪙埒", (char) (43432 - (Process.myPid() >> 22)), "\u0000\u0000\u0000\u0000", Color.alpha(0), "憭쇒ꡰ纩").intern())) {
                    b = -1;
                } else {
                    int i2 = f28079 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f28077 = i2 % 128;
                    b = i2 % 2 == 0 ? (byte) 30 : (byte) 72;
                }
                break;
            case -1850654380:
                if (!str.equals(m29491("\u0017\u0001\u0016\b\f\r", 5 - Process.getGidForName(""), (byte) (123 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern())) {
                    b = -1;
                } else {
                    int i3 = f28077 + 75;
                    f28079 = i3 % 128;
                    int i4 = i3 % 2;
                    b = 8;
                }
                break;
            case -1836618638:
                b = !str.equals(m29491("\n\f\u0007\u0006\r\u000e\u000f\u000e\r\u0010", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (29 - TextUtils.getOffsetBefore("", 0))).intern()) ? (byte) -1 : Ascii.SUB;
                break;
            case -1740904301:
                b = !str.equals(m29497("혮꾖鿿篤ښഥ鳉俦㼆౿ᚌ", (char) (ViewConfiguration.getTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", (-1473958834) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "䵮┬붨\uf635").intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1721428911:
                if (!str.equals(m29497("ꐴ\udd10⼀㵜\ude95龖", (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 11856), "\u0000\u0000\u0000\u0000", Process.myTid() >> 22, "\ue4a5ȧ傴䘮").intern())) {
                    b = -1;
                } else {
                    int i5 = f28079 + 69;
                    f28077 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 0;
                }
                break;
            case -1057659822:
                b = !str.equals(m29491("\n\f\u0011\u0002\f\r\f\u0013\u0001\u000b\u0000\u0003\u0011\u0012\u0017\u000b\u0017\u0000\u0000\u000e\u000b\u0017\u001a\u001f\u0011\u0002\u0000\u000e\u0013\u000f\u0018\u0012\u0000\u0003\u000b\u0017", 35 - TextUtils.indexOf((CharSequence) "", '0'), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 58)).intern()) ? (byte) -1 : Ascii.f22491EM;
                break;
            case -965507231:
                if (!str.equals(m29491("\u001d\u0003\u0018\u0004\u0011\u0001\u0012\n\u001d#", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9, (byte) ((Process.myPid() >> 22) + 49)).intern())) {
                    b = -1;
                } else {
                    int i7 = f28077 + 51;
                    f28079 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 22;
                }
                break;
            case -899612152:
                if (!str.equals(m29497("䷤郿Ｏ期㐡府\uea02熰\u0cfcྉ絳멆븣\ue79b\uebf4읁磃㼉ܬ洉㭦殀汿ᛈ수譭䍮䏜쫭ለ\ue4b2窀ῠ톝歄渹癙\ue744䠬⪗㵼갩", (char) (View.MeasureSpec.getSize(0) + 35863), "\u0000\u0000\u0000\u0000", KeyEvent.getDeadChar(0, 0), "\uddfa㤀ទ\uf68c").intern())) {
                    b = -1;
                } else {
                    int i9 = f28077 + 89;
                    f28079 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 4;
                }
                break;
            case -828205665:
                b = !str.equals(m29497("\ue308輍늮\u0017濌\ue434蕶Ԭ컃혡\uf8a5", (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", Process.getGidForName("") - 1371471525, "婧䄁ⶮ\uf865").intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case -747599243:
                if (!str.equals(m29497("\uef64椝훇ꇨ᭓治\ue4b7၀黟윛", (char) TextUtils.getOffsetAfter("", 0), "\u0000\u0000\u0000\u0000", '0' - AndroidCharacter.getMirror('0'), "괋罨䚅幔").intern())) {
                    b = -1;
                } else {
                    int i11 = f28079 + 19;
                    f28077 = i11 % 128;
                    int i12 = i11 % 2;
                    b = 11;
                }
                break;
            case -498060603:
                b = !str.equals(m29497("偫␜爋뭅\udf62璀䋌\uea53Ⴑ", (char) TextUtils.getOffsetAfter("", 0), "\u0000\u0000\u0000\u0000", (-20418735) - View.MeasureSpec.getMode(0), "兖졯䃾ؔ").intern()) ? (byte) -1 : (byte) 6;
                break;
            case -350701718:
                b = !str.equals(m29497("쁱\uef4c待굦詽࠙\uf0e1蟙廵\ue91e", (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTouchSlop() >> 8, "헟\uf53a쿕\uea8c").intern()) ? (byte) -1 : (byte) 10;
                break;
            case -92732536:
                b = !str.equals(m29491("\u0006\u000b\t\u001f\r\u0002\u0003\u0004\u0005\u0000\"\u0015\u000b\u000e\u0017\u000b\u0003 \u0001\u0002\u0003\u0004\u0005\u0000 \n\u008b\u008b\u000b\u0017", View.MeasureSpec.getSize(0) + 30, (byte) (29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 28;
                break;
            case 156342925:
                b = !str.equals(m29497("\ue264ಗ\uec2a揉些囌\u0de0⌐慝㏚\u197dĖФ懄ꖜ芲", (char) (35794 - TextUtils.lastIndexOf("", '0', 0, 0)), "\u0000\u0000\u0000\u0000", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "皗튙폑䖋").intern()) ? (byte) -1 : Ascii.f22502US;
                break;
            case 315438882:
                if (!str.equals(m29491("\u0001\u0002\u0003\u0004\u0005\u0000 \n\u0096\u0096\u000b\u0017\u0001\f\u0004\u0017", (ViewConfiguration.getScrollBarSize() >> 8) + 16, (byte) (40 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern())) {
                    b = -1;
                } else {
                    int i13 = f28077 + 61;
                    f28079 = i13 % 128;
                    int i14 = i13 % 2;
                    b = 29;
                }
                break;
            case 332396988:
                b = !str.equals(m29497("➀驋﮿欇膆袼\udd19\uec5a憈", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 91363252, "됣爗ﰅᶈ").intern()) ? (byte) -1 : Ascii.DC4;
                break;
            case 505165239:
                b = !str.equals(m29497("䝇՜ᇠ圧㪝悘陾쭏醁쳄ㄤ縉橥컁恣꓆멮\ueffa۸㬙燱", (char) ((-1) - TextUtils.lastIndexOf("", '0')), "\u0000\u0000\u0000\u0000", (Process.myTid() >> 22) - 1341203546, "ꚨ\u0edb现罍").intern()) ? (byte) -1 : (byte) 3;
                break;
            case 670892517:
                if (!str.equals(m29491("\n\f\u0011\u0002\f\r\f\u0013\u0001\u000b\u0000\u0003À", 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (AndroidCharacter.getMirror('0') + 28)).intern())) {
                    b = -1;
                } else {
                    int i15 = f28077 + 83;
                    f28079 = i15 % 128;
                    int i16 = i15 % 2;
                    b = 5;
                }
                break;
            case 746354589:
                b = !str.equals(m29491("\u0016\t\u0006\t\u0005\u0016\u0017\u000b\u0017\u0000\u0000\u000e\u000b\u0017", Color.alpha(0) + 14, (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : Ascii.f22499SI;
                break;
            case 798818448:
                b = !str.equals(m29491("\u0016\t\u0006\t\u0005\u0001\u0011\u0001×", TextUtils.lastIndexOf("", '0') + 10, (byte) (ImageFormat.getBitsPerPixel(0) + 97)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case 1033471823:
                if (!str.equals(m29497("滰喝⠻냆胣\uf670\udcb0☊鷯扮\udb21⸷ꚙ\ude22鑇鯲謏\uda5c䀁㺦饦彝碑ⴇ雿푓翌鶬۪땍冭ꤹ墲ᴴ胖", (char) (ExpandableListView.getPackedPositionChild(0L) + 1), "\u0000\u0000\u0000\u0000", (-1834879918) - TextUtils.indexOf("", "", 0, 0), "則ꇴ㖒ͮ").intern())) {
                    b = -1;
                } else {
                    int i17 = f28077 + 1;
                    f28079 = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = 4 % 5;
                    }
                    b = 2;
                }
                break;
            case 1110462460:
                b = !str.equals(m29491("\u001f\u0012\u000b\u0018\u0087\u0087\u0000\u0005\u0000\u0004\u0006\u000e¨", TextUtils.indexOf((CharSequence) "", '0') + 14, (byte) (67 - Color.red(0))).intern()) ? (byte) -1 : Ascii.CAN;
                break;
            case 1205766784:
                b = !str.equals(m29491("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0006\r\u000e\u000f\u000e\r\u0010", 13 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (46 - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 1208038126:
                b = !str.equals(m29497("綡ᘩ㛯煆穰蒖㕬쳕뻨\uf455䜿혾궸⧟\uf828", (char) (ExpandableListView.getPackedPositionType(0L) + 24659), "\u0000\u0000\u0000\u0000", 55316897 - Color.blue(0), "ꆙ䰑匃兠").intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1230133745:
                b = !str.equals(m29491("\u001d\u0003\u0018\n\u0011\u0016\u0017\u000b\u0017\u0000\u0000\u000e\u000b\u0017", 14 - ExpandableListView.getPackedPositionGroup(0L), (byte) (71 - Color.blue(0))).intern()) ? (byte) -1 : Ascii.NAK;
                break;
            case 1461477995:
                b = !str.equals(m29491("\n\f\u0011\u0002\f\r\f\u0013\u0001\u000b\u0000\u0003\u0011\u0012\u0017\u000b\u0017\u0000\u0000\u000e\u0006\u000e\u0010\u0007\b \t\u0006\u0010\u0006\f\u0010", 33 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (View.MeasureSpec.getSize(0) + 116)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1611471226:
                b = !str.equals(m29497("妚掆ᝥ鞇\uef7d\ue822戢报篘봓孱\uf142係\ue82fꟹ㤊", (char) (580 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0), "⼒\ue9e5䏸舂").intern()) ? (byte) -1 : (byte) 16;
                break;
            case 1731532800:
                b = !str.equals(m29497("鈙셍锪谏⚯曅좞볱ꐺ\ue7c9踘錬䀒㱺䞁", (char) (7050 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", 16163621 - TextUtils.getOffsetBefore("", 0), "╸\uf6a3言ꨛ").intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case 1766407901:
                b = !str.equals(m29497("炌ࢼ鹒᭷셉῞㈰\ude02\uedc1๕ᠡ姒", (char) (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", Color.rgb(0, 0, 0) + 16777216, "⣯\ue64e䄨\uec84").intern()) ? (byte) -1 : Ascii.ESC;
                break;
            case 1777696764:
                b = !str.equals(m29497("き扬ʆ폝㷌殌젢矜ቋ䑶॑괐䈝㓴", (char) (7665 - View.resolveSizeAndState(0, 0, 0)), "\u0000\u0000\u0000\u0000", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, "ࡿ콳\uf12f䠝").intern()) ? (byte) -1 : (byte) 9;
                break;
            case 1861686093:
                b = !str.equals(m29491("\n\f\u001c\u0006\u0000\u000e\u000e\u000b\u0006\u0011\u0018\u0007\u0011\u000f\u000b\u0017\r\u000e\u0017\u0000\u000b\u0001\u0000\u000e\u001d\u0017\u0000\u0017\u0000\u0003\u0011\u0000\u0093", Color.alpha(0) + 33, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 34)).intern()) ? (byte) -1 : Ascii.DC2;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return Vungle.class;
            case 1:
            case 2:
                return VungleActivity.class;
            case 3:
            case 4:
                return VungleWebViewActivity.class;
            case 5:
                return Advertisement.class;
            case 6:
                return Placement.class;
            case 7:
                return VungleWebClient.class;
            case 8:
                return Report.class;
            case 9:
                return PlayAdCallback.class;
            case 10:
                return Repository.class;
            case 11:
                return AdContract.class;
            case 12:
                return LocalAdContract.class;
            case 13:
                return LocalAdView.class;
            case 14:
                return LocalAdContract.LocalView.class;
            case 15:
                return LocalAdContract.LocalPresenter.class;
            case 16:
                return LocalAdPresenter.class;
            case 17:
                return MRAIDAdPresenter.class;
            case 18:
                return AdContract.AdvertisementPresenter.class;
            case 19:
                return AdvertisementPresentationFactory.class;
            case 20:
                return WebAdContract.WebAdView.class;
            case 21:
                return WebAdContract.WebAdPresenter.class;
            case 22:
                return WebViewAPI.class;
            case 23:
                return MRAIDAdView.class;
            case 24:
                return WebViewAPI.MRAIDDelegate.class;
            case 25:
                return AdContract.AdvertisementPresenter.EventListener.class;
            case 26:
                return AdActivity.class;
            case 27:
            case 28:
                return VungleBanner.class;
            case 29:
            case 30:
                return VungleBannerView.class;
            case 31:
            case 32:
                return VungleNativeView.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29491("\u0004\u0000\u0011\u0012\u0002\n\u0011\u000b\u000b\u0001\u0000\u000e", 12 - TextUtils.indexOf("", "", 0), (byte) (87 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11866cd.m29489((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m29497("␈蕲鐈ዕ鯷郤\uab2f\udab7嬰\ufdd4ܗ롗㵪ﴶ", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 48423), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTouchSlop() >> 8, "ꂒ숅❢좽").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Boolean.valueOf(C11866cd.m29494((Placement) list.get(0)));
            }
        });
        map.put(m29491("\u0004\u0000\u0012\f\f\"\u000b\u000e\u0005\u000b\u0011\u0018Ú", KeyEvent.keyCodeFromString("") + 13, (byte) (118 - Color.alpha(0))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11866cd.m29488((Advertisement) list.get(0));
            }
        });
        map.put(m29497("瘆⣼韪溓璒䆤㯖\ue7ce艽剝⤏", (char) (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0') - 1558180900, "\udba4\u200b鶣ﾵ").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11866cd.m29493((Advertisement) list.get(0));
            }
        });
        map.put(m29497("鸎얕\uf396ꮕ췭ꤛㄥ咭㬷\ue3d9✝થ甼㶪쓽ộ\uedb5ꡛꌉ", (char) (64525 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString("") + 643497245, "ᴌ嫽ద燼").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11866cd.m29498((Advertisement) list.get(0));
            }
        });
        int i2 = f28079 + 69;
        f28077 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static boolean m29492(Placement placement) {
        int i = 2 % 2;
        int i2 = f28079 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28077 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsIncentivized = placement.isIncentivized();
        int i4 = f28079 + 1;
        f28077 = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsIncentivized;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29490(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f28079 + 115;
        f28077 = i2 % 128;
        if (i2 % 2 != 0) {
            advertisement.getAdMarketId();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String adMarketId = advertisement.getAdMarketId();
        int i3 = f28079 + 103;
        f28077 = i3 % 128;
        int i4 = i3 % 2;
        return adMarketId;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29495(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f28077 + 61;
        f28079 = i2 % 128;
        if (i2 % 2 == 0) {
            advertisement.getCampaign();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String campaign = advertisement.getCampaign();
        int i3 = f28079 + 75;
        f28077 = i3 % 128;
        int i4 = i3 % 2;
        return campaign;
    }

    /* JADX INFO: renamed from: ﱡ */
    private static Map<String, String> m29486(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f28079 + 115;
        f28077 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> downloadableUrls = advertisement.getDownloadableUrls();
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return downloadableUrls;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static Class m29487() {
        int i = 2 % 2;
        int i2 = f28077 + 39;
        f28079 = i2 % 128;
        if (i2 % 2 != 0) {
            return VungleApiClient.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static Placement m29496(Repository repository, String str) {
        int i = 2 % 2;
        int i2 = f28079 + 45;
        f28077 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Placement placement = (Placement) repository.load(str, Placement.class).get();
        int i3 = f28077 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28079 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
        return placement;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29497(String str, char c, String str2, int i, String str3) {
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
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28081) ^ ((long) f28080)) ^ ((long) f28083));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29491(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f28082;
            char c = f28078;
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
