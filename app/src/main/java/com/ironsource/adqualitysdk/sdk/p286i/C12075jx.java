package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.VideoView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jx */
/* JADX INFO: loaded from: classes6.dex */
public final class C12075jx {

    /* JADX INFO: renamed from: ﭖ */
    private static int f29750 = 1;

    /* JADX INFO: renamed from: ﭸ */
    private static int f29752 = 0;

    /* JADX INFO: renamed from: ﮉ */
    private static short[] f29753 = null;

    /* JADX INFO: renamed from: ﮐ */
    private static Field f29754 = null;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29755 = -348523386;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29757 = 94;

    /* JADX INFO: renamed from: ﻏ */
    private static int f29758 = 453434635;

    /* JADX INFO: renamed from: ﻐ */
    private static Field f29759;

    /* JADX INFO: renamed from: ﻛ */
    private static Object f29760;

    /* JADX INFO: renamed from: ｋ */
    private static Field f29761;

    /* JADX INFO: renamed from: ﾇ */
    private static Class f29762;

    /* JADX INFO: renamed from: ﾒ */
    private static Field f29763;

    /* JADX INFO: renamed from: ﱡ */
    private static byte[] f29756 = {-73, -56, -17, -100, -58, -75, -51, -72, -58, -33, -99, -61, -64, -67, -50, -39, -30, 124, -39, -73, -72, 3, -127, -80, -79, -74, -59, -67, -58, 76, 109, 57, 84, Base64.padSymbol, 110, 89, 68, 94, 57, 97, -85, -54, -74, -45, -70, -55, -42, -93, -39, -74, -9, -87, -40, 97, Ascii.f22492FF, -93, 103, 8, -99, -37, -98, -85, 62, 84, 58, 82, 66, 55, 46, 107, 76, 67, 86, 60, 74, 77, SignedBytes.MAX_POWER_OF_TWO, 75, Ascii.f22494GS, 95, 73, 70, 76, 41, 108, 44, 87, 63, 63, 86, 77, 56, 80, -17, -113, 70, -6, -101, SignedBytes.MAX_POWER_OF_TWO, 78, 65, 62, -118, -76, -114, -74, -122, -113, -102, -83, -68, -72, -106, -74, -112, -72, 103, -89, -100, -89, -43, 95, -47, 89, -55, -44, -59, 114, 103, 91, -71, 89, -45, 91, -84, 119, 98, -51, 103, -62, -121, -57, 116, -52, -52, 93, 102, -45, 91, -4, Ascii.f22493FS, -51, 17, 56, -53, 101, -54, -43, 63, Ascii.f22500SO, 99, -15, 59, 17, 63, Ascii.ETB, 71, 60, 43, -23, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﭴ */
    private static long f29751 = -6032398028542961781L;

    /* JADX INFO: renamed from: ﻐ */
    public static List<View> m30780() {
        int i = 2 % 2;
        int i2 = f29750 + 1;
        f29752 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (f29762 == null || f29760 == null) {
                Class<?> cls = Class.forName(m30786("\u17ea顜࢝룒⤀\ud97f䦹寧樵ᩣ諔㬏ꬉ容쯼簲\uec7f鲭\u0cfe뵽\u2d9e\uddc8丌ﹳ溶Ứ輆㽤꿘倜쁄炀", 36793 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
                f29762 = cls;
                f29760 = cls.getMethod(m30786("\u17ecә㆑\u2e67嬹矫撵酫蹝묇\ud7c8", TextUtils.getTrimmedLength("") + 4919).intern(), null).invoke(null, null);
            }
            return m30790(f29762, f29760);
        } catch (Throwable th) {
            String strIntern = m30786("៊韦៩韰៨韭\u17fd韋៧韹៹韙", View.MeasureSpec.getMode(0) + 32771).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30786("៎㰞䀷鑑롥차ႆⒿ䣇鳠ꃤ\uf508ᤸⴐ煾蕫ꦕﶸǚ嗙秊踙툿\ue62b\u0a44幡抏뛶\udab9\ueec9㋼䜅欘뽶쌅", 11239 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            sb.append(th.getLocalizedMessage());
            C12085l.m30909(strIntern, sb.toString());
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static View.OnClickListener m30791(View view) {
        try {
            Object objM30787 = m30787(view);
            if (objM30787 == null) {
                return null;
            }
            Class<?> cls = objM30787.getClass();
            synchronized (C12072ju.class) {
                if (f29759 == null) {
                    f29759 = m30789((Class) cls, m30786("៦\uab6f溳⇉\ue54b뢵篪㽍\uf29f뗡䥖ದ쿪荊䚴᧼", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 48299).intern());
                }
            }
            return (View.OnClickListener) f29759.get(objM30787);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30793(View view, ViewOnClickListenerC12002he.c cVar) {
        int i = 2 % 2;
        int i2 = f29752 + 37;
        f29750 = i2 % 128;
        int i3 = i2 % 2;
        View.OnClickListener onClickListenerM30791 = m30791(view);
        if (onClickListenerM30791 instanceof ViewOnClickListenerC12002he) {
            return;
        }
        view.setOnClickListener(new ViewOnClickListenerC12002he(onClickListenerM30791, cVar));
        int i4 = f29750 + 29;
        f29752 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    public static View.OnTouchListener m30785(View view) {
        try {
            Object objM30787 = m30787(view);
            if (objM30787 == null) {
                return null;
            }
            Class<?> cls = objM30787.getClass();
            synchronized (C12072ju.class) {
                if (f29754 == null) {
                    f29754 = m30789((Class) cls, m30786("៦쉱벏雀䄰㭷ᗖ쀐멯钿仪㤸᎒췔레鉢", 54710 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
                }
            }
            return (View.OnTouchListener) f29754.get(objM30787);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static MediaPlayer m30779(VideoView videoView) {
        int i = 2 % 2;
        try {
            Field fieldM30789 = m30789(VideoView.class, m30788(TextUtils.lastIndexOf("", '0') - 453434605, (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 348523494, (byte) (TextUtils.getOffsetAfter("", 0) + 113), (-82) - View.combineMeasuredStates(0, 0)).intern());
            if (fieldM30789 != null) {
                int i2 = f29752 + 91;
                f29750 = i2 % 128;
                if (i2 % 2 != 0) {
                    return (MediaPlayer) fieldM30789.get(videoView);
                }
                throw null;
            }
        } catch (Exception e) {
            C12080kb.m30845(m30786("៊韦៩韰៨韭\u17fd韋៧韹៹韙", 32771 - TextUtils.indexOf("", "")).intern(), m30788((-453434595) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (Color.alpha(0) - 60), TextUtils.indexOf("", "", 0, 0) + 348523487, (byte) (View.combineMeasuredStates(0, 0) + 98), (ViewConfiguration.getTapTimeout() >> 16) - 71).intern(), (Throwable) e, false);
        }
        int i3 = f29750 + 87;
        f29752 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30782(MediaPlayer mediaPlayer, C12004hg.d dVar) {
        int i = 2 % 2;
        int i2 = f29752 + 91;
        f29750 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field fieldM30789 = m30789(MediaPlayer.class, m30786("៦鷝ϗ覉㾁ꖐ⭲텨䜪촙猅\uf8fd滉ᒫ骧", ImageFormat.getBitsPerPixel(0) + 35354).intern());
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) fieldM30789.get(mediaPlayer);
            if (!(onInfoListener instanceof C12004hg)) {
                fieldM30789.set(mediaPlayer, new C12004hg(onInfoListener, dVar));
            }
            int i4 = f29752 + 7;
            f29750 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            C12080kb.m30845(m30786("៊韦៩韰៨韭\u17fd韋៧韹៹韙", TextUtils.lastIndexOf("", '0', 0) + 32772).intern(), m30786("\u17eeᒔᄣᶣᩍڊͬ\u001eೃब㖬㉔㻻㭣㠞⒍℔ⷘ⩬囹卫倓岴変䗝䉈件䮸䠎璡焹緝穅曣掃", 877 - TextUtils.getCapsMode("", 0, 0)).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30781(MediaPlayer mediaPlayer, C12001hd.e eVar) {
        int i = 2 % 2;
        int i2 = f29752 + 59;
        f29750 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field fieldM30789 = m30789(MediaPlayer.class, m30786("៦ꁕ磇ㅻ즠舳媝ጐꭦ揦㱈\uf4df贩䖚Ḍ횇滯❏ￗ蠭䂭", 46993 - View.MeasureSpec.getSize(0)).intern());
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM30789.get(mediaPlayer);
            if (onCompletionListener instanceof C12001hd) {
                return;
            }
            fieldM30789.set(mediaPlayer, new C12001hd(onCompletionListener, eVar));
            int i4 = f29752 + 79;
            f29750 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            C12080kb.m30845(m30786("៊韦៩韰៨韭\u17fd韋៧韹៹韙", 32771 - KeyEvent.getDeadChar(0, 0)).intern(), m30788(Color.argb(0, 0, 0, 0) - 453434573, (short) ((-72) - TextUtils.indexOf((CharSequence) "", '0', 0)), 348523486 - ExpandableListView.getPackedPositionChild(0L), (byte) (View.MeasureSpec.getSize(0) - 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 53).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30792(MediaPlayer mediaPlayer, C12000hc.c cVar) {
        int i = 2 % 2;
        int i2 = f29752 + 67;
        f29750 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field fieldM30789 = m30789(MediaPlayer.class, m30788((-453434533) - (ViewConfiguration.getScrollBarSize() >> 8), (short) (96 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 348523495 - Color.blue(0), (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 28), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 76).intern());
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM30789.get(mediaPlayer);
            if (!(onPreparedListener instanceof C12000hc)) {
                fieldM30789.set(mediaPlayer, new C12000hc(onPreparedListener, cVar));
            }
            int i4 = f29750 + 41;
            f29752 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            C12080kb.m30845(m30786("៊韦៩韰៨韭\u17fd韋៧韹៹韙", (ViewConfiguration.getLongPressTimeout() >> 16) + 32771).intern(), m30788((-453434514) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (102 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 348523488, (byte) (TextUtils.getOffsetBefore("", 0) + 49), Color.blue(0) - 55).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30783(MediaPlayer mediaPlayer, C12006hi.d dVar) {
        int i = 2 % 2;
        int i2 = f29750 + 89;
        f29752 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field fieldM30789 = m30789(MediaPlayer.class, m30786("៦䶉ꍿ\u193f绚푯ਮ濓얌㭓郹\uf6a8Ⱳ舖\ue7d8嵄댲\ue8e5井ꑙ᧡羿핧", 23117 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM30789.get(mediaPlayer);
            if (!(onSeekCompleteListener instanceof C12006hi)) {
                fieldM30789.set(mediaPlayer, new C12006hi(onSeekCompleteListener, dVar));
            }
            int i4 = f29750 + 31;
            f29752 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            C12080kb.m30845(m30786("៊韦៩韰៨韭\u17fd韋៧韹៹韙", ExpandableListView.getPackedPositionGroup(0L) + 32771).intern(), m30786("\u17eeᏠΉᮯޝϖུ\u0b4a㝣㌘㼔㫨⛋⊯⺶⪙噔剌帚娵䘚䇭䷮䧛疾熊絭祍敃愻洩棥铘郆鲼颎葪聤", (Process.myTid() >> 22) + 1049).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static List<View> m30790(Class cls, Object obj) throws Exception {
        int i = 2 % 2;
        if (f29761 == null) {
            int i2 = f29750 + 79;
            f29752 = i2 % 128;
            Field declaredField = cls.getDeclaredField((i2 % 2 != 0 ? m30786("៦죮ꦄ詷欰䰇", 57139 >>> (ViewConfiguration.getKeyRepeatDelay() / 52)) : m30786("៦죮ꦄ詷欰䰇", 57139 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern());
            f29761 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f29761.get(obj);
        if (obj2 instanceof List) {
            int i3 = f29750 + 75;
            f29752 = i3 % 128;
            if (i3 % 2 == 0) {
                return (List) f29761.get(obj);
            }
            throw null;
        }
        if (obj2 instanceof View[]) {
            int i4 = f29752 + 81;
            f29750 = i4 % 128;
            int i5 = i4 % 2;
            return Arrays.asList((View[]) f29761.get(obj));
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ﾇ */
    private static Object m30787(View view) {
        try {
            synchronized (C12072ju.class) {
                if (f29763 == null) {
                    f29763 = m30789(View.class, m30788((-453434477) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 89), (ViewConfiguration.getLongPressTimeout() >> 16) + 348523495, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 98), (-81) - (Process.myTid() >> 22)).intern());
                }
            }
            return f29763.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static Field m30789(Class cls, String str) {
        int i = 2 % 2;
        int i2 = f29752 + 31;
        f29750 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            int i4 = f29750 + 29;
            f29752 = i4 % 128;
            int i5 = i4 % 2;
            return declaredField;
        } catch (Exception e) {
            C12080kb.m30845(m30786("៊韦៩韰៨韭\u17fd韋៧韹៹韙", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32771).intern(), m30786("\u17ee伈ꘛᴷ琽\uab1eɄ祲퀣㞕溄얤㲃鏓쫆⇸飺\ufff8圜踌\ue519尧던\uea40䅷", 22769 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), (Throwable) e, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static void m30784(View view, ViewOnTouchListenerC12007hj.a aVar) {
        int i = 2 % 2;
        int i2 = f29752 + 13;
        f29750 = i2 % 128;
        int i3 = i2 % 2;
        View.OnTouchListener onTouchListenerM30785 = m30785(view);
        if (!(onTouchListenerM30785 instanceof ViewOnTouchListenerC12007hj)) {
            view.setOnTouchListener(new ViewOnTouchListenerC12007hj(onTouchListenerM30785, aVar));
            int i4 = f29752 + 59;
            f29750 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 4;
            }
        }
        int i6 = f29750 + 93;
        f29752 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30788(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f29757;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f29756;
                if (bArr != null) {
                    i5 = (byte) (bArr[f29758 + i] + i4);
                } else {
                    i5 = (short) (f29753[f29758 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f29758 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f29755);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f29756;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f29753;
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

    /* JADX INFO: renamed from: ｋ */
    private static String m30786(String str, int i) {
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
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29751);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
