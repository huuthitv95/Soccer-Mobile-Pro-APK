package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import com.gadsme.nativeplugin.BuildConfig;
import com.iab.omid.library.vungle.utils.C11313d;
import com.tiktok.util.UrlConst;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.attestation.i */
/* JADX INFO: loaded from: classes6.dex */
public class C11280i implements InterfaceC11273b {

    /* JADX INFO: renamed from: a */
    private final Context f23636a;

    /* JADX INFO: renamed from: b */
    private final C11281j f23637b;

    C11280i(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.f23636a = context;
        this.f23637b = C11281j.m24964a(context);
    }

    /* JADX INFO: renamed from: a */
    private String m24962a(String str) {
        return (str == null || str.trim().isEmpty()) ? BuildConfig.VERSION_NAME : str;
    }

    /* JADX INFO: renamed from: b */
    private boolean m24963b(String str) {
        try {
            new URL(str);
            return str.startsWith(UrlConst.HTTPS) || str.startsWith("http://");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.iab.omid.library.vungle.attestation.InterfaceC11273b
    /* JADX INFO: renamed from: a */
    public String mo24947a() {
        return "FireTVFOSDAT";
    }

    @Override // com.iab.omid.library.vungle.attestation.InterfaceC11273b
    /* JADX INFO: renamed from: a */
    public void mo24948a(C11272a c11272a) {
        String str;
        String str2;
        if (!this.f23637b.m24966b()) {
            str = "Attestation failed: Full attestation capability not available";
        } else if (c11272a == null) {
            str = "Attestation failed: AttestationArgs is null";
        } else if (c11272a.m24946a() == null) {
            str = "Attestation failed: attestationData is null";
        } else {
            String str3 = c11272a.m24946a().get("verifierurl");
            String strM24962a = m24962a(c11272a.m24946a().get("version"));
            if (str3 == null || str3.trim().isEmpty()) {
                str = "Attestation failed: verifier URL is null or empty";
            } else {
                if (m24963b(str3)) {
                    C11313d.m25146a("Starting FireTV's FOS device attestation with verifier URL: " + str3);
                    try {
                        if (this.f23636a == null) {
                            C11313d.m25148b("Attestation failed: application context is null");
                            return;
                        } else {
                            PrivacyPass.getInstance(this.f23636a).attest(new VerificationContext(Collections.singletonList(str3)), (AttestAPICallback) null, strM24962a);
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str2 = "Attestation failed: Invalid input parameters";
                        C11313d.m25147a(str2, e);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        str2 = "Attestation failed: unexpected error";
                        C11313d.m25147a(str2, e);
                        return;
                    }
                }
                str = "Attestation failed: invalid verifier URL format: " + str3;
            }
        }
        C11313d.m25148b(str);
    }

    @Override // com.iab.omid.library.vungle.attestation.InterfaceC11273b
    /* JADX INFO: renamed from: b */
    public EnumC11279h mo24949b() {
        return EnumC11279h.NATIVE;
    }

    @Override // com.iab.omid.library.vungle.attestation.InterfaceC11273b
    /* JADX INFO: renamed from: c */
    public List<String> mo24950c() {
        return Collections.singletonList(BuildConfig.VERSION_NAME);
    }
}
