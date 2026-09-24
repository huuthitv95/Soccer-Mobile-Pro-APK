package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C8729n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8567i[] f20369a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8568j f20370b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8567i f20371c;

    public C8729n(InterfaceC8567i[] interfaceC8567iArr, InterfaceC8568j interfaceC8568j) {
        this.f20369a = interfaceC8567iArr;
        this.f20370b = interfaceC8568j;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC8567i m21271a(C8527b c8527b) throws C8714a0 {
        InterfaceC8567i interfaceC8567i = this.f20371c;
        if (interfaceC8567i != null) {
            return interfaceC8567i;
        }
        for (InterfaceC8567i interfaceC8567i2 : this.f20369a) {
            try {
                if (interfaceC8567i2.mo21038a(c8527b)) {
                    this.f20371c = interfaceC8567i2;
                    c8527b.f19126e = 0;
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                c8527b.f19126e = 0;
                throw th;
            }
            c8527b.f19126e = 0;
        }
        InterfaceC8567i interfaceC8567i3 = this.f20371c;
        if (interfaceC8567i3 != null) {
            interfaceC8567i3.mo21037a(this.f20370b);
            return this.f20371c;
        }
        StringBuilder sb = new StringBuilder("None of the available extractors (");
        InterfaceC8567i[] interfaceC8567iArr = this.f20369a;
        int i = AbstractC8827z.f20671a;
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < interfaceC8567iArr.length; i2++) {
            sb2.append(interfaceC8567iArr[i2].getClass().getSimpleName());
            if (i2 < interfaceC8567iArr.length - 1) {
                sb2.append(", ");
            }
        }
        sb.append(sb2.toString());
        sb.append(") could read the stream.");
        throw new C8714a0(sb.toString());
    }
}
