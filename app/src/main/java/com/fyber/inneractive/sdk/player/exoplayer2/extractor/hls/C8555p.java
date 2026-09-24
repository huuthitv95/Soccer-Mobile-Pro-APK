package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8627p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.text.C8743a;
import com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.AbstractC8745a;
import com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.AbstractC8746b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8555p implements InterfaceC8567i {

    /* JADX INFO: renamed from: g */
    public static final Pattern f19294g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h */
    public static final Pattern f19295h = Pattern.compile("MPEGTS:(\\d+)");

    /* JADX INFO: renamed from: a */
    public final String f19296a;

    /* JADX INFO: renamed from: b */
    public final C8823v f19297b;

    /* JADX INFO: renamed from: d */
    public InterfaceC8568j f19299d;

    /* JADX INFO: renamed from: f */
    public int f19301f;

    /* JADX INFO: renamed from: c */
    public final C8815n f19298c = new C8815n();

    /* JADX INFO: renamed from: e */
    public byte[] f19300e = new byte[1024];

    public C8555p(String str, C8823v c8823v) {
        this.f19296a = str;
        this.f19297b = c8823v;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, C8711r, EOFException {
        int iMin;
        Matcher matcher;
        String strM21342c;
        int i = (int) c8527b.f19123b;
        int i2 = this.f19301f;
        byte[] bArr = this.f19300e;
        if (i2 == bArr.length) {
            this.f19300e = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f19300e;
        int i3 = this.f19301f;
        int length = bArr2.length - i3;
        int i4 = c8527b.f19127f;
        if (i4 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i4, length);
            System.arraycopy(c8527b.f19125d, 0, bArr2, i3, iMin);
            c8527b.m21026b(iMin);
        }
        if (iMin == 0) {
            iMin = c8527b.m21022a(bArr2, i3, length, 0, true);
        }
        if (iMin != -1) {
            c8527b.f19124c += (long) iMin;
        }
        if (iMin != -1) {
            int i5 = this.f19301f + iMin;
            this.f19301f = i5;
            if (i == -1 || i5 != i) {
                return 0;
            }
        }
        C8815n c8815n = new C8815n(this.f19300e);
        try {
            Pattern pattern = AbstractC8746b.f20432a;
            String strM21342c2 = c8815n.m21342c();
            if (strM21342c2 == null || !AbstractC8746b.f20433b.matcher(strM21342c2).matches()) {
                throw new C8743a("Expected WEBVTT. Got " + strM21342c2);
            }
            long j = 0;
            long j2 = 0;
            while (true) {
                String strM21342c3 = c8815n.m21342c();
                if (TextUtils.isEmpty(strM21342c3)) {
                    while (true) {
                        String strM21342c4 = c8815n.m21342c();
                        if (strM21342c4 == null) {
                            matcher = null;
                            break;
                        }
                        if (AbstractC8746b.f20432a.matcher(strM21342c4).matches()) {
                            do {
                                strM21342c = c8815n.m21342c();
                                if (strM21342c == null) {
                                    break;
                                }
                            } while (!strM21342c.isEmpty());
                        } else {
                            matcher = AbstractC8745a.f20431a.matcher(strM21342c4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        this.f19299d.mo21092a(0, 3).mo21053a(C8708o.m21265a(null, "text/vtt", 0, this.f19296a, -1, null, 0L, Collections.EMPTY_LIST));
                        this.f19299d.mo21096b();
                    } else {
                        long jM21281a = AbstractC8746b.m21281a(matcher.group(1));
                        long jM21370a = this.f19297b.m21370a((j2 + jM21281a) - j);
                        C8538g c8538gMo21092a = this.f19299d.mo21092a(0, 3);
                        c8538gMo21092a.mo21053a(C8708o.m21265a(null, "text/vtt", 0, this.f19296a, -1, null, jM21370a - jM21281a, Collections.EMPTY_LIST));
                        this.f19299d.mo21096b();
                        C8815n c8815n2 = this.f19298c;
                        byte[] bArr3 = this.f19300e;
                        int i6 = this.f19301f;
                        c8815n2.f20643a = bArr3;
                        c8815n2.f20645c = i6;
                        c8815n2.f20644b = 0;
                        c8538gMo21092a.mo21049a(i6, c8815n2);
                        c8538gMo21092a.mo21051a(jM21370a, 1, this.f19301f, 0, (byte[]) null);
                    }
                    return -1;
                }
                if (strM21342c3.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f19294g.matcher(strM21342c3);
                    if (!matcher2.find()) {
                        throw new C8711r("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM21342c3));
                    }
                    Matcher matcher3 = f19295h.matcher(strM21342c3);
                    if (!matcher3.find()) {
                        throw new C8711r("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM21342c3));
                    }
                    long jM21281a2 = AbstractC8746b.m21281a(matcher2.group(1));
                    j2 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                    j = jM21281a2;
                }
            }
        } catch (C8743a e) {
            throw new C8711r(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        this.f19299d = interfaceC8568j;
        interfaceC8568j.mo21093a(new C8627p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) {
        throw new IllegalStateException();
    }
}
