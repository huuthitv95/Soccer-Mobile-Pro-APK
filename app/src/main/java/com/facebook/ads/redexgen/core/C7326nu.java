package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7326nu implements InterfaceC5088DD {
    public static byte[] A03;
    public static String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public InterfaceC5331H9 A00;
    public InterfaceC7263ms A01;
    public final InterfaceC5335HD A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, Ascii.SUB, Ascii.SYN, Ascii.f22492FF, Ascii.NAK, Ascii.f22494GS, 89, Ascii.f22503VT, Ascii.f22493FS, Ascii.CAN, Ascii.f22494GS, 89, Ascii.f22490CR, 17, Ascii.f22493FS, 89, 10, Ascii.f22490CR, Ascii.f22503VT, Ascii.f22493FS, Ascii.CAN, Ascii.DC4, 87, 2, 35, 34, 41, 108, 35, 42, 108, 56, 36, 41, 108, 45, 58, 45, 37, 32, 45, 46, 32, 41, 108, 41, 52, 56, 62, 45, 47, 56, 35, 62, 63, 108, 100};
    }

    static {
        A01();
    }

    public C7326nu(InterfaceC5335HD interfaceC5335HD) {
        this.A02 = interfaceC5335HD;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5088DD
    @MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5y() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5088DD
    public final long A7a() {
        if (this.A01 != null) {
            return this.A01.A8n();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5088DD
    public final void AAB(@MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") InterfaceC7408pF interfaceC7408pF, Uri uri, Map<String, List<String>> map, long j, long j2, InterfaceC5332HA interfaceC5332HA) throws IOException {
        C48719f c48719f = new C48719f(interfaceC7408pF, j, j2);
        this.A01 = c48719f;
        if (this.A00 != null) {
            return;
        }
        InterfaceC5331H9[] extractors = this.A02.A5O(uri, map);
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            for (InterfaceC5331H9 interfaceC5331H9 : extractors) {
                try {
                    if (interfaceC5331H9.AK5(c48719f)) {
                        this.A00 = interfaceC5331H9;
                        AbstractC45353y.A08(this.A00 != null || c48719f.A8n() == j);
                        c48719f.AIl();
                        break;
                    } else {
                        boolean z = this.A00 != null || c48719f.A8n() == j;
                        AbstractC45353y.A08(z);
                        c48719f.AIl();
                    }
                } catch (EOFException unused) {
                    if (this.A00 != null || c48719f.A8n() == j) {
                    }
                } catch (Throwable th) {
                    AbstractC45353y.A08(this.A00 != null || c48719f.A8n() == j);
                    c48719f.AIl();
                    throw th;
                }
                AbstractC45353y.A08(z);
                c48719f.AIl();
            }
            if (this.A00 == null) {
                throw new C7301nV(A00(24, 34, 2) + AbstractC46115C.A0s(extractors) + A00(0, 24, 55), (Uri) AbstractC45353y.A01(uri));
            }
        }
        InterfaceC5331H9 interfaceC5331H10 = this.A00;
        String[] strArr = A04;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "617axDRVtVCpohDeNzS2wwDVGnqnMQm6";
        strArr2[3] = "irS2jSLrtgJgNTyuX8VyAPoURNJ9oGo8";
        interfaceC5331H10.AAC(interfaceC5332HA);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5088DD
    public final int AHM(C5353HV c5353hv) throws IOException {
        return ((InterfaceC5331H9) AbstractC45353y.A01(this.A00)).AHL((InterfaceC7263ms) AbstractC45353y.A01(this.A01), c5353hv);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5088DD
    public final void AHb() {
        if (this.A00 != null) {
            this.A00.AHb();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5088DD
    public final void AJ6(long j, long j2) {
        ((InterfaceC5331H9) AbstractC45353y.A01(this.A00)).AJ6(j, j2);
    }
}
