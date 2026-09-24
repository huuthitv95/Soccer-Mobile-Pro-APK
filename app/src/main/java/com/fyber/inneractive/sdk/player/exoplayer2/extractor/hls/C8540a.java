package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8785j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8540a implements InterfaceC8783h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8783h f19190a;

    /* JADX INFO: renamed from: b */
    public final byte[] f19191b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19192c;

    /* JADX INFO: renamed from: d */
    public CipherInputStream f19193d;

    public C8540a(InterfaceC8783h interfaceC8783h, byte[] bArr, byte[] bArr2) {
        this.f19190a = interfaceC8783h;
        this.f19191b = bArr;
        this.f19192c = bArr2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final long mo20829a(C8786k c8786k) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f19191b, "AES"), new IvParameterSpec(this.f19192c));
                this.f19193d = new CipherInputStream(new C8785j(this.f19190a, c8786k), cipher);
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final Uri mo20830a() {
        return this.f19190a.mo20830a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final void close() {
        this.f19193d = null;
        this.f19190a.close();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        CipherInputStream cipherInputStream = this.f19193d;
        if (cipherInputStream == null) {
            throw new IllegalStateException();
        }
        int i3 = cipherInputStream.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
