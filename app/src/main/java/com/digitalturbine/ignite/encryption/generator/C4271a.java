package com.digitalturbine.ignite.encryption.generator;

import android.security.keystore.KeyGenParameterSpec;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.google.android.gms.stats.CodePackage;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: com.digitalturbine.ignite.encryption.generator.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4271a {
    /* JADX INFO: renamed from: a */
    public final AlgorithmParameterSpec m20319a() {
        C4259a.m20308a("%s : create specs", "KeyGeneratorSpecCreator");
        return new KeyGenParameterSpec.Builder("dtx_ignite_service_storage", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build();
    }
}
