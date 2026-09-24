package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.ironsource.C11683Ta;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.89 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Exo version is final but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
public final class C479489 implements InterfaceC7127kS {
    public static byte[] A03;
    public static String[] A04 = {"jtWHdC1JS00IQCACyTEvOJEMPrvoo3Ob", "eCCt1HwS4IToKXyi1WzLFL1R4PlgsDM4", "yXgy4dLxj37Ni2Ba12KifyhgeRBIXCXp", "5p7nRT0g4n3u8StY", "28aCkGMBHBRgMUJ0i4knnGO", "XAmyqmpuCXa4X38XkweYk7F1knbiAlXr", "krkFdswQPRExlipS29WIEjh8hbH7SBjj", C11683Ta.f25808u};

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public long A00;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final long A01;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final TreeSet<C5666MZ> A02 = new TreeSet<>(new Comparator() { // from class: com.facebook.ads.redexgen.X.Mn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C479489.A00((C5666MZ) obj, (C5666MZ) obj2);
        }
    });

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{46, Base64.padSymbol, 34, 40, 63, 8, 42, 40, 35, 46};
    }

    static {
        A02();
    }

    public C479489(long j) {
        this.A01 = j;
    }

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public static int A00(C5666MZ c5666mz, C5666MZ c5666mz2) {
        if (c5666mz.A00 - c5666mz2.A00 == 0) {
            return c5666mz.compareTo(c5666mz2);
        }
        return c5666mz.A00 < c5666mz2.A00 ? -1 : 1;
    }

    private void A03(InterfaceC5656MP interfaceC5656MP, long j) {
        AbstractC460354.A02(A01(0, 10, 87));
        while (this.A00 + j > this.A01 && !this.A02.isEmpty()) {
            C5666MZ c5666mzFirst = this.A02.first();
            if (A04[1].charAt(10) != 'T') {
                throw new RuntimeException();
            }
            A04[4] = "DjrmhsDHxGC2SVigK1e7Rl2";
            interfaceC5656MP.AIV(c5666mzFirst);
        }
        AbstractC460354.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5655MO
    public final void AG2(InterfaceC5656MP interfaceC5656MP, C5666MZ c5666mz) {
        this.A02.add(c5666mz);
        this.A00 += c5666mz.A01;
        A03(interfaceC5656MP, 0L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5655MO
    public final void AG3(InterfaceC5656MP interfaceC5656MP, C5666MZ c5666mz) {
        this.A02.remove(c5666mz);
        this.A00 -= c5666mz.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5655MO
    public final void AG4(InterfaceC5656MP interfaceC5656MP, C5666MZ c5666mz, C5666MZ c5666mz2) {
        AG3(interfaceC5656MP, c5666mz);
        AG2(interfaceC5656MP, c5666mz2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7127kS
    public final void AG5(InterfaceC5656MP interfaceC5656MP, String str, long j, long j2) {
        if (j2 != -1) {
            A03(interfaceC5656MP, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7127kS
    public final boolean AIj() {
        return true;
    }
}
