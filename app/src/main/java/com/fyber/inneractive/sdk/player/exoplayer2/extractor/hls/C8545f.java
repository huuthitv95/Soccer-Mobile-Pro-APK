package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8556a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8566k;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8722g;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8740y;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8545f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8783h f19204a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8783h f19205b;

    /* JADX INFO: renamed from: c */
    public final C8554o f19206c;

    /* JADX INFO: renamed from: d */
    public final C8556a[] f19207d;

    /* JADX INFO: renamed from: e */
    public final C8566k f19208e;

    /* JADX INFO: renamed from: f */
    public final C8740y f19209f;

    /* JADX INFO: renamed from: g */
    public final List f19210g;

    /* JADX INFO: renamed from: h */
    public boolean f19211h;

    /* JADX INFO: renamed from: i */
    public byte[] f19212i;

    /* JADX INFO: renamed from: j */
    public C8722g f19213j;

    /* JADX INFO: renamed from: k */
    public C8556a f19214k;

    /* JADX INFO: renamed from: l */
    public Uri f19215l;

    /* JADX INFO: renamed from: m */
    public byte[] f19216m;

    /* JADX INFO: renamed from: n */
    public String f19217n;

    /* JADX INFO: renamed from: o */
    public byte[] f19218o;

    /* JADX INFO: renamed from: p */
    public AbstractC8748b f19219p;

    public C8545f(C8566k c8566k, C8556a[] c8556aArr, C8541b c8541b, C8554o c8554o, List list) {
        this.f19208e = c8566k;
        this.f19207d = c8556aArr;
        this.f19206c = c8554o;
        this.f19210g = list;
        C8708o[] c8708oArr = new C8708o[c8556aArr.length];
        int[] iArr = new int[c8556aArr.length];
        for (int i = 0; i < c8556aArr.length; i++) {
            c8708oArr[i] = c8556aArr[i].f19303b;
            iArr[i] = i;
        }
        this.f19204a = c8541b.f19194a.mo20831a();
        this.f19205b = c8541b.f19194a.mo20831a();
        C8740y c8740y = new C8740y(c8708oArr);
        this.f19209f = c8740y;
        this.f19219p = new C8544e(c8740y, iArr);
    }

    /* JADX INFO: renamed from: a */
    public final void m21068a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(str.toLowerCase(Locale.getDefault()).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f19215l = uri;
        this.f19216m = bArr;
        this.f19217n = str;
        this.f19218o = bArr2;
    }
}
