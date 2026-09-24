package com.digitalturbine.ignite.encryption;

import android.util.Pair;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.encryption.generator.C4271a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.digitalturbine.ignite.encryption.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4269c {

    /* JADX INFO: renamed from: b */
    public C4270d f17354b;

    /* JADX INFO: renamed from: c */
    public C4268b f17355c;

    /* JADX INFO: renamed from: a */
    public SecretKey f17353a = null;

    /* JADX INFO: renamed from: d */
    public final AlgorithmParameterSpec f17356d = new C4271a().m20319a();

    /* JADX INFO: renamed from: a */
    public final Pair m20315a(String str) {
        if (this.f17354b != null) {
            return C4270d.m20318a(this.f17353a, str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m20316a(String str, byte[] bArr) {
        C4268b c4268b = this.f17355c;
        if (c4268b == null) {
            return null;
        }
        SecretKey secretKey = this.f17353a;
        c4268b.getClass();
        return AbstractC4267a.m20313a(AbstractC4267a.m20314a(2, bArr, secretKey), str);
    }

    /* JADX INFO: renamed from: a */
    public final void m20317a() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        C4259a.m20308a("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(this.f17356d);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.f17353a = (SecretKey) key;
            this.f17354b = new C4270d();
            this.f17355c = new C4268b();
        }
    }
}
