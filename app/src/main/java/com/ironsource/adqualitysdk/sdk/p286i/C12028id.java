package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.id */
/* JADX INFO: loaded from: classes6.dex */
public final class C12028id {

    /* JADX INFO: renamed from: ﭖ */
    private static int f29292 = 0;

    /* JADX INFO: renamed from: ﭴ */
    private static int f29293 = 1;

    /* JADX INFO: renamed from: ﭸ */
    private static char f29294;

    /* JADX INFO: renamed from: ﮐ */
    private static int f29295;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29296;

    /* JADX INFO: renamed from: ﱡ */
    private static boolean f29297;

    /* JADX INFO: renamed from: ﺙ */
    private static long f29298;

    /* JADX INFO: renamed from: ﻏ */
    private static boolean f29299;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29300;

    /* JADX INFO: renamed from: ﾒ */
    private static final byte[] f29301;

    /* JADX INFO: renamed from: ﻐ */
    private SecretKey f29302;

    /* JADX INFO: renamed from: ﻛ */
    private Cipher f29303;

    /* JADX INFO: renamed from: ｋ */
    private Cipher f29304;

    /* JADX INFO: renamed from: ﻐ */
    static void m30473() {
        f29299 = true;
        f29297 = true;
        f29295 = 144;
        f29300 = new char[]{224, 210, 213, 231, 217, 228, 216, 227, 209, 222, 212, 194, 197, 198, Typography.half, 211, 243, 255, 253, 190, 259, 252, 241, 242, 249, 254, 247, 261, 260, 223, 246, 258, 193, 268, 229, 214, 200, 202};
        f29298 = 0L;
        f29296 = 192859601;
        f29294 = (char) 0;
    }

    static {
        m30473();
        f29301 = new byte[]{Ascii.DLE, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        int i = f29292 + 93;
        f29293 = i % 128;
        if (i % 2 == 0) {
            int i2 = 1 / 0;
        }
    }

    public C12028id(byte[] bArr, String str, String str2, String str3) {
        byte[] bArrDigest;
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(m30474(null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, "\u0090\u0082\u008f\u0090\u0082\u0090\u008f\u0088\u0083\u0089\u0086\u0085\u0082\u008e\u008d\u008c\u008b\u008a\u0089\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            bArrDigest = secretKeyFactory.generateSecret(new PBEKeySpec(sb.toString().toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (GeneralSecurityException unused) {
            C12033ii.m30512(m30472("聴邀ඬ㦻곗㘟㤾\udd3eົⴢ襗\uf7ca幨싱浉䏦欆撟䱊", (char) (55744 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", (-1173641294) - ExpandableListView.getPackedPositionType(0L), "눔\u0ba7솺㯙").intern(), m30472("朘挛튆簲俷虢䤛鍪\ue257坧ỻ왦猥\uf045䈪쁇쑚嚈⛸逐䯖䯤捙몣礪뱐熳፳砮덹\uef07賄ꜗ\ue880\ueffbꡭ떩峬⥹鐵咐뀆₢飁ᇏ㤔痐駖钽୨橾\uec78軉瞧騔蚭핎\ue38e魋", (char) View.MeasureSpec.makeMeasureSpec(0, 0), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0') + 878482773, "哧岕阴⭅").intern());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(m30472("ꡲ暚陥", (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9002), "\u0000\u0000\u0000\u0000", 1373919543 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "㝄\ue459⩑ꔣ").intern());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                sb2.append(str3);
                for (char c : sb2.toString().toCharArray()) {
                    messageDigest.update((byte) c);
                }
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(m30472("굧駗᪱삟盄吹퀿暦ᖱ櫜暈Х멦ᾟᨱ慻躩䀓䷩", (char) (14363 - TextUtils.indexOf("", "")), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0, 0) + 1453153656, "碈鵝᭖萸").intern(), e);
            }
        }
        this.f29302 = new SecretKeySpec(bArrDigest, m30474(null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), null, "\u0088\u0083\u0089").intern());
        m30475();
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m30475() {
        int i = 2 % 2;
        try {
            Cipher cipher = Cipher.getInstance(m30472("ₜᶩ䀩餶\ua958尿캨ѩ㋵弃r凾䘖紑쪨髗\ue793⬀뼝႞", (char) Color.alpha(0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollDefaultDelay() >> 16, "ꬌ喲农쓀").intern());
            this.f29303 = cipher;
            SecretKey secretKey = this.f29302;
            byte[] bArr = f29301;
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(m30472("ₜᶩ䀩餶\ua958尿캨ѩ㋵弃r凾䘖紑쪨髗\ue793⬀뼝႞", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", ViewConfiguration.getLongPressTimeout() >> 16, "ꬌ喲农쓀").intern());
            this.f29304 = cipher2;
            cipher2.init(2, this.f29302, new IvParameterSpec(bArr));
            int i2 = f29292 + 63;
            f29293 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(m30472("檓\ue9c4毕䳀䷿\ue982은䯍\uf2d5氙탅覒쳯법\uef38τඔḼ膆✖쳴", (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", ((byte) KeyEvent.getModifierMetaStateMask()) + 815570996, "㎔鲠ᰰ\udb66").intern(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        r1 = r9.f29303;
        r3 = new java.lang.StringBuilder();
        r3.append(m30474(null, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, null, "¢¡\u008f \u0092\u009d\u0097\u0091\u0095\u009c\u009f\u0098\u009e\u0088\u0083\u0089\u0094\u0096\u0099\u009d\u009c\u0094\u009b\u009a\u0099\u0096\u0096\u0099\u0098\u0094\u0097\u0096\u0093\u0092\u0092\u0095\u0094\u0093\u0092\u0091").intern());
        r3.append(r10);
        r10 = com.ironsource.adqualitysdk.sdk.p286i.C12030if.m30484(r1.doFinal(r3.toString().getBytes(m30474(null, android.os.Process.getGidForName("") + 128, null, "¥\u008f¤\u0086£").intern())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.p286i.C12028id.f29292 + 29;
        com.ironsource.adqualitysdk.sdk.p286i.C12028id.f29293 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if ((r1 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        m30475();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        throw new java.lang.RuntimeException(m30472("굧駗᪱삟盄吹퀿暦ᖱ櫜暈Х멦ᾟᨱ慻躩䀓䷩", (char) (14363 - android.view.View.MeasureSpec.getSize(0)), "\u0000\u0000\u0000\u0000", 1436376440 - android.graphics.Color.rgb(0, 0, 0), "碈鵝᭖萸").intern(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        m30475();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        throw new java.lang.RuntimeException(m30472("굧駗᪱삟盄吹퀿暦ᖱ櫜暈Х멦ᾟᨱ慻躩䀓䷩", (char) (android.view.View.combineMeasuredStates(0, 0) + 14363), "\u0000\u0000\u0000\u0000", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 1453153657, "碈鵝᭖萸").intern(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) != false) goto L15;
     */
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String m30477(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12028id.m30477(java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: ｋ */
    public final synchronized String m30476(String str) throws a {
        int i = 2 % 2;
        int i2 = f29292 + 1;
        f29293 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            int i4 = f29293 + 35;
            f29292 = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }
        try {
            try {
                try {
                    String str2 = new String(this.f29304.doFinal(C12030if.m30486(str)), m30474(null, 127 - View.combineMeasuredStates(0, 0), null, "¥\u008f¤\u0086£").intern());
                    if (str2.indexOf(m30474(null, 127 - TextUtils.indexOf("", ""), null, "¢¡\u008f \u0092\u009d\u0097\u0091\u0095\u009c\u009f\u0098\u009e\u0088\u0083\u0089\u0094\u0096\u0099\u009d\u009c\u0094\u009b\u009a\u0099\u0096\u0096\u0099\u0098\u0094\u0097\u0096\u0093\u0092\u0092\u0095\u0094\u0093\u0092\u0091").intern()) == 0) {
                        return str2.substring(m30474(null, 127 - KeyEvent.keyCodeFromString(""), null, "¢¡\u008f \u0092\u009d\u0097\u0091\u0095\u009c\u009f\u0098\u009e\u0088\u0083\u0089\u0094\u0096\u0099\u009d\u009c\u0094\u009b\u009a\u0099\u0096\u0096\u0099\u0098\u0094\u0097\u0096\u0093\u0092\u0092\u0095\u0094\u0093\u0092\u0091").intern().length(), str2.length());
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(m30472("턲侠唱\ud8cd\uf2d7\udce2\ud7c9䟍欄쁩躆鈰垗䌓쎉\u1f17\udac2䁻䅼윈쇍ḣ秽ች凶\ue65e楨潚냽ₗ墁\ud80c㮿钾觌禵衕\uf3f8Ꭺ", (char) (15565 - Color.blue(0)), "\u0000\u0000\u0000\u0000", 71382598 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "䛀䄶촄㰼").intern());
                    sb.append(str);
                    throw new a(sb.toString());
                } catch (IllegalBlockSizeException e) {
                    m30475();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e.getMessage());
                    sb2.append(m30474(null, MotionEvent.axisFromString("") + 128, null, "¦").intern());
                    sb2.append(str);
                    throw new a(sb2.toString());
                }
            } catch (BadPaddingException e2) {
                m30475();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e2.getMessage());
                sb3.append(m30474(null, 127 - (Process.myPid() >> 22), null, "¦").intern());
                sb3.append(str);
                throw new a(sb3.toString());
            }
        } catch (C12029ie e3) {
            m30475();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(e3.getMessage());
            sb4.append(m30474(null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, "¦").intern());
            sb4.append(str);
            throw new a(sb4.toString());
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(m30472("굧駗᪱삟盄吹퀿暦ᖱ櫜暈Х멦ᾟᨱ慻躩䀓䷩", (char) (14363 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1453153657 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "碈鵝᭖萸").intern(), e4);
        }
        throw th;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.id$a */
    public class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30474(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f29300;
            int i2 = f29295;
            if (f29297) {
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
            if (f29299) {
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

    /* JADX INFO: renamed from: ﻐ */
    private static String m30472(String str, char c, String str2, int i, String str3) {
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
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f29298) ^ ((long) f29296)) ^ ((long) f29294));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
