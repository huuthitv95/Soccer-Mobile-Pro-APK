package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7121kM implements InterfaceC5656MP {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public C5653MM A02;
    public boolean A03;
    public final InterfaceC7127kS A04;
    public final C5662MV A05;
    public final C5675Mi A06;
    public final File A07;
    public final HashMap<String, ArrayList<InterfaceC5655MO>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 43);
            i4++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, 41, 36, 99, 76, 77, 86, 74, 71, 80, 2, 113, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, Ascii.CAN, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, Ascii.f22490CR, 100, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, Ascii.f22492FF, 9, 0, 1, 69, 17, 10, 69, 6, Ascii.ETB, 0, 4, 17, 0, 69, 48, 44, 33, 69, 3, Ascii.f22492FF, 9, 0, 95, 69, Ascii.f22502US, 56, 48, 53, 60, Base64.padSymbol, 121, 45, 54, 121, 58, 43, 60, 56, 45, 60, 121, 58, 56, 58, 49, 60, 121, Ascii.f22492FF, Ascii.DLE, Ascii.f22494GS, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, Ascii.DLE, 10, 112, 87, 95, 90, 83, 82, Ascii.SYN, 66, 89, Ascii.SYN, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, Ascii.SYN, 85, 87, 85, 94, 83, Ascii.SYN, 95, 88, 82, 95, 85, 83, 69, Ascii.f22492FF, Ascii.SYN, 43, Ascii.f22492FF, 4, 1, 8, 9, 77, Ascii.f22491EM, 2, 77, 1, 4, Ascii.f22498RS, Ascii.f22491EM, 77, Ascii.f22500SO, Ascii.f22492FF, Ascii.f22500SO, 5, 8, 77, 9, 4, Ascii.f22502US, 8, Ascii.f22500SO, Ascii.f22491EM, 2, Ascii.f22502US, Ascii.DC4, 77, Ascii.f22503VT, 4, 1, 8, Ascii.f22498RS, 87, 77, 48, Ascii.ETB, Ascii.f22502US, Ascii.SUB, 19, Ascii.DC2, 86, 2, Ascii.f22491EM, 86, 4, 19, Ascii.ESC, Ascii.f22491EM, 0, 19, 86, Ascii.DLE, Ascii.f22502US, Ascii.SUB, 19, 86, Ascii.f22502US, Ascii.CAN, Ascii.DC2, 19, Ascii.f22500SO, 86, 19, Ascii.CAN, 2, 4, Ascii.f22499SI, 86, Ascii.DLE, Ascii.f22491EM, 4, 76, 86, 56, Ascii.DC4, Ascii.f22491EM, 19, Ascii.SUB, 7, Ascii.CAN, Ascii.DLE, 17, 85, 32, 60, 49, 85, 19, Ascii.f22493FS, Ascii.f22491EM, Ascii.DLE, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, SignedBytes.MAX_POWER_OF_TWO, 91, 92, 85, Ascii.DC2, 91, 92, 86, 87, 74, Ascii.DC2, 84, 91, 94, 87, Ascii.DC2, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0G(File file, boolean z, File[] fileArr, Map<String, C5661MU> map) {
        long j;
        long j2;
        C5661MU c5661muRemove;
        C7120kL c7120kLA01;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else if (z) {
                    boolean zA0A = C5675Mi.A0A(name);
                    if (A0C[0].length() != 2) {
                        String[] strArr2 = A0C;
                        strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                        strArr2[4] = "SAWP83LvD";
                        if (!zA0A && !name.endsWith(A04(0, 4, 107))) {
                            j = -1;
                            j2 = -9223372036854775807L;
                            if (map != null) {
                                c5661muRemove = map.remove(name);
                            } else {
                                c5661muRemove = null;
                            }
                            if (c5661muRemove != null) {
                                j = c5661muRemove.A01;
                                j2 = c5661muRemove.A00;
                            }
                            c7120kLA01 = C7120kL.A01(file2, j, j2, this.A06);
                            if (c7120kLA01 != null) {
                                A0C(c7120kLA01);
                            } else {
                                file2.delete();
                            }
                        }
                    }
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                    if (map != null) {
                        c5661muRemove = map.remove(name);
                    } else {
                        c5661muRemove = null;
                    }
                    if (c5661muRemove != null) {
                        j = c5661muRemove.A01;
                        j2 = c5661muRemove.A00;
                    }
                    c7120kLA01 = C7120kL.A01(file2, j, j2, this.A06);
                    if (c7120kLA01 != null) {
                        A0C(c7120kLA01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<C5666MZ> A0I(String str) {
        C5673Mg c5673MgA0C;
        AbstractC45353y.A08(!this.A03);
        c5673MgA0C = this.A06.A0C(str);
        return (c5673MgA0C == null || c5673MgA0C.A09()) ? new TreeSet() : new TreeSet((Collection) c5673MgA0C.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized long A7B(String str, long j, long j2) {
        long j3;
        long j4 = j;
        synchronized (this) {
            long j5 = j2 == -1 ? Long.MAX_VALUE : j4 + j2;
            if (j5 < 0) {
                j5 = Long.MAX_VALUE;
            }
            j3 = 0;
            while (j4 < j5) {
                long jA7C = A7C(str, j4, j5 - j4);
                if (jA7C > 0) {
                    j3 += jA7C;
                } else {
                    jA7C = -jA7C;
                }
                j4 += jA7C;
            }
        }
        return j3;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C7121kM(File file, InterfaceC7127kS interfaceC7127kS) {
        this(file, interfaceC7127kS, (byte[]) null, false);
    }

    public C7121kM(File file, InterfaceC7127kS interfaceC7127kS, InterfaceC46235O interfaceC46235O, byte[] bArr, boolean z, boolean z2) {
        C5662MV c5662mv;
        C5675Mi c5675Mi = new C5675Mi(interfaceC46235O, file, bArr, z, z2);
        if (interfaceC46235O != null && !z2) {
            c5662mv = new C5662MV(interfaceC46235O);
        } else {
            c5662mv = null;
        }
        this(file, interfaceC7127kS, c5675Mi, c5662mv);
    }

    public C7121kM(File file, InterfaceC7127kS interfaceC7127kS, C5675Mi c5675Mi, C5662MV c5662mv) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC7127kS;
            this.A06 = c5675Mi;
            this.A05 = c5662mv;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC7127kS.AIj();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C5682Mp(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C7121kM(File file, InterfaceC7127kS interfaceC7127kS, byte[] bArr, boolean z) {
        this(file, interfaceC7127kS, null, bArr, z, true);
    }

    public static long A00(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AbstractC45794g.A05(A04(297, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C7120kL A03(String str, long j, long j2) {
        C7120kL c7120kLA04;
        C5673Mg c5673MgA0C = this.A06.A0C(str);
        if (c5673MgA0C == null) {
            return C7120kL.A04(str, j, j2);
        }
        while (true) {
            c7120kLA04 = c5673MgA0C.A04(j, j2);
            if (!c7120kLA04.A05 || c7120kLA04.A03.length() == c7120kLA04.A01) {
                break;
            }
            A06();
        }
        return c7120kLA04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (C5653MM e) {
                this.A02 = e;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] fileArrListFiles = file.listFiles();
        String strA04 = A04(297, 11, 30);
        if (fileArrListFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AbstractC45794g.A05(strA04, str);
            this.A02 = new C5653MM(str);
            return;
        }
        this.A01 = A02(fileArrListFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e2) {
                String str2 = A04(102, 28, 114) + this.A07;
                AbstractC45794g.A08(strA04, str2, e2);
                this.A02 = new C5653MM(str2, e2);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, C5661MU> mapA05 = this.A05.A05();
                A0G(this.A07, true, fileArrListFiles, mapA05);
                this.A05.A09(mapA05.keySet());
            } else {
                A0G(this.A07, true, fileArrListFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e3) {
                AbstractC45794g.A08(strA04, A04(308, 25, 25), e3);
            }
        } catch (IOException e4) {
            String str3 = A04(164, 36, 29) + this.A07;
            AbstractC45794g.A08(strA04, str3, e4);
            this.A02 = new C5653MM(str3, e4);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        Iterator<C5673Mg> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            for (C7120kL c7120kL : it.next().A06()) {
                if (c7120kL.A03.length() != c7120kL.A01) {
                    arrayList.add(c7120kL);
                }
            }
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i2 = str.charAt(29);
            if (i2 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i < size) {
                A0A((C5666MZ) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws C5653MM {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(C5666MZ c5666mz) {
        ArrayList<InterfaceC5655MO> arrayList = this.A08.get(c5666mz.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AG3(this, c5666mz);
            }
        }
        this.A04.AG3(this, c5666mz);
    }

    private void A0A(C5666MZ c5666mz) {
        C5673Mg c5673MgA0C = this.A06.A0C(c5666mz.A04);
        if (c5673MgA0C == null || !c5673MgA0C.A0D(c5666mz)) {
            return;
        }
        this.A00 -= c5666mz.A01;
        if (this.A05 != null) {
            String name = c5666mz.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AbstractC45794g.A07(A04(297, 11, 30), A04(238, 39, 93) + name);
            }
        }
        this.A06.A0K(c5673MgA0C.A02);
        A09(c5666mz);
    }

    private void A0C(C7120kL c7120kL) {
        this.A06.A0D(c7120kL.A04).A08(c7120kL);
        this.A00 += c7120kL.A01;
        A0D(c7120kL);
    }

    private void A0D(C7120kL c7120kL) {
        ArrayList<InterfaceC5655MO> arrayList = this.A08.get(c7120kL.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC5655MO interfaceC5655MO = arrayList.get(size);
                int i = A0C[0].length();
                if (i == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                interfaceC5655MO.AG2(this, c7120kL);
            }
        }
        this.A04.AG2(this, c7120kL);
    }

    private void A0E(C7120kL c7120kL, C5666MZ c5666mz) {
        ArrayList<InterfaceC5655MO> arrayList = this.A08.get(c7120kL.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AG4(this, c7120kL, c5666mz);
            }
        }
        this.A04.AG4(this, c7120kL, c5666mz);
    }

    public static void A0F(File file) throws C5653MM {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(130, 34, 1) + file;
        String message = A04(297, 11, 30);
        AbstractC45794g.A05(message, str);
        throw new C5653MM(str);
    }

    public static synchronized boolean A0H(File file) {
        return A0D.add(file.getAbsoluteFile());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized void A4E(String str, C5678Ml c5678Ml) throws C5653MM {
        AbstractC45353y.A08(!this.A03);
        A08();
        this.A06.A0L(str, c5678Ml);
        try {
            this.A06.A0I();
        } catch (IOException e) {
            throw new C5653MM(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized void A55(File file, long j) throws C5653MM {
        AbstractC45353y.A08(!this.A03);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C7120kL c7120kL = (C7120kL) AbstractC45353y.A01(C7120kL.A02(file, j, this.A06));
            C5673Mg c5673Mg = (C5673Mg) AbstractC45353y.A01(this.A06.A0C(c7120kL.A04));
            AbstractC45353y.A08(c5673Mg.A0B(c7120kL.A02, c7120kL.A01));
            long jA00 = AbstractC5676Mj.A00(c5673Mg.A03());
            if (jA00 != -1) {
                AbstractC45353y.A08(c7120kL.A02 + c7120kL.A01 <= jA00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c7120kL.A01, c7120kL.A00);
                    A0C(c7120kL);
                    try {
                        this.A06.A0I();
                        notifyAll();
                        return;
                    } catch (IOException e) {
                        throw new C5653MM(e);
                    }
                } catch (IOException e2) {
                    throw new C5653MM(e2);
                }
            }
            A0C(c7120kL);
            this.A06.A0I();
            notifyAll();
            return;
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized long A7A() {
        AbstractC45353y.A08(!this.A03);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    @MetaExoPlayerCustomization
    public final synchronized long A7C(String str, long j, long j2) {
        C5673Mg cachedContent;
        AbstractC45353y.A08(!this.A03);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized InterfaceC5677Mk A7S(String str) {
        AbstractC45353y.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized void AHg(C5666MZ c5666mz) {
        AbstractC45353y.A08(!this.A03);
        C5673Mg c5673Mg = (C5673Mg) AbstractC45353y.A01(this.A06.A0C(c5666mz.A04));
        c5673Mg.A07(c5666mz.A02);
        this.A06.A0K(c5673Mg.A02);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized void AIU(String str) {
        AbstractC45353y.A08(!this.A03);
        Iterator<C5666MZ> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized void AIV(C5666MZ c5666mz) {
        AbstractC45353y.A08(!this.A03);
        A0A(c5666mz);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized File AK8(String str, long lastTouchTimestamp, long j) throws C5653MM {
        C5673Mg c5673MgA0C;
        File file;
        AbstractC45353y.A08(!this.A03);
        A08();
        c5673MgA0C = this.A06.A0C(str);
        AbstractC45353y.A01(c5673MgA0C);
        AbstractC45353y.A08(c5673MgA0C.A0B(lastTouchTimestamp, j));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AG5(this, str, lastTouchTimestamp, j);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C7120kL.A05(file, c5673MgA0C.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized C5666MZ AKA(String str, long j, long j2, EnumC5654MN enumC5654MN) throws InterruptedException, C5653MM {
        C5666MZ span;
        AbstractC45353y.A08(!this.A03);
        A08();
        while (true) {
            span = AKB(str, j, j2, enumC5654MN);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5656MP
    public final synchronized C7120kL AKB(String str, long j, long j2, EnumC5654MN enumC5654MN) throws C5653MM {
        AbstractC45353y.A08(!this.A03);
        A08();
        C7120kL c7120kLA03 = A03(str, j, j2);
        if (c7120kLA03.A05) {
            C7120kL span = this.A06.A0C(str).A05(c7120kLA03, c7120kLA03.A00, false);
            A0E(c7120kLA03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j, c7120kLA03.A01)) {
            return c7120kLA03;
        }
        return null;
    }
}
