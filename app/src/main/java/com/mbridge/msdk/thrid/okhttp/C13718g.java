package com.mbridge.msdk.thrid.okhttp;

import androidx.media3.extractor.p007ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.g */
/* JADX INFO: compiled from: CipherSuite.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13718g {

    /* JADX INFO: renamed from: a */
    final String f38759a;

    /* JADX INFO: renamed from: b */
    static final Comparator<String> f38692b = new a();

    /* JADX INFO: renamed from: c */
    private static final Map<String, C13718g> f38695c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static final C13718g f38698d = m40239a("SSL_RSA_WITH_NULL_MD5", 1);

    /* JADX INFO: renamed from: e */
    public static final C13718g f38701e = m40239a("SSL_RSA_WITH_NULL_SHA", 2);

    /* JADX INFO: renamed from: f */
    public static final C13718g f38704f = m40239a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* JADX INFO: renamed from: g */
    public static final C13718g f38707g = m40239a("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* JADX INFO: renamed from: h */
    public static final C13718g f38710h = m40239a("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* JADX INFO: renamed from: i */
    public static final C13718g f38713i = m40239a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* JADX INFO: renamed from: j */
    public static final C13718g f38716j = m40239a("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* JADX INFO: renamed from: k */
    public static final C13718g f38719k = m40239a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* JADX INFO: renamed from: l */
    public static final C13718g f38722l = m40239a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* JADX INFO: renamed from: m */
    public static final C13718g f38725m = m40239a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* JADX INFO: renamed from: n */
    public static final C13718g f38728n = m40239a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* JADX INFO: renamed from: o */
    public static final C13718g f38731o = m40239a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* JADX INFO: renamed from: p */
    public static final C13718g f38734p = m40239a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* JADX INFO: renamed from: q */
    public static final C13718g f38737q = m40239a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* JADX INFO: renamed from: r */
    public static final C13718g f38740r = m40239a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* JADX INFO: renamed from: s */
    public static final C13718g f38743s = m40239a("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* JADX INFO: renamed from: t */
    public static final C13718g f38745t = m40239a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* JADX INFO: renamed from: u */
    public static final C13718g f38747u = m40239a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* JADX INFO: renamed from: v */
    public static final C13718g f38749v = m40239a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* JADX INFO: renamed from: w */
    public static final C13718g f38751w = m40239a("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* JADX INFO: renamed from: x */
    public static final C13718g f38753x = m40239a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* JADX INFO: renamed from: y */
    public static final C13718g f38755y = m40239a("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* JADX INFO: renamed from: z */
    public static final C13718g f38757z = m40239a("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* JADX INFO: renamed from: A */
    public static final C13718g f38638A = m40239a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* JADX INFO: renamed from: B */
    public static final C13718g f38640B = m40239a("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* JADX INFO: renamed from: C */
    public static final C13718g f38642C = m40239a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* JADX INFO: renamed from: D */
    public static final C13718g f38644D = m40239a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* JADX INFO: renamed from: E */
    public static final C13718g f38646E = m40239a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* JADX INFO: renamed from: F */
    public static final C13718g f38648F = m40239a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* JADX INFO: renamed from: G */
    public static final C13718g f38650G = m40239a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* JADX INFO: renamed from: H */
    public static final C13718g f38652H = m40239a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* JADX INFO: renamed from: I */
    public static final C13718g f38654I = m40239a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* JADX INFO: renamed from: J */
    public static final C13718g f38656J = m40239a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* JADX INFO: renamed from: K */
    public static final C13718g f38658K = m40239a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* JADX INFO: renamed from: L */
    public static final C13718g f38660L = m40239a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* JADX INFO: renamed from: M */
    public static final C13718g f38662M = m40239a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* JADX INFO: renamed from: N */
    public static final C13718g f38664N = m40239a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* JADX INFO: renamed from: O */
    public static final C13718g f38666O = m40239a("TLS_RSA_WITH_NULL_SHA256", 59);

    /* JADX INFO: renamed from: P */
    public static final C13718g f38668P = m40239a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* JADX INFO: renamed from: Q */
    public static final C13718g f38670Q = m40239a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* JADX INFO: renamed from: R */
    public static final C13718g f38672R = m40239a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* JADX INFO: renamed from: S */
    public static final C13718g f38674S = m40239a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* JADX INFO: renamed from: T */
    public static final C13718g f38676T = m40239a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* JADX INFO: renamed from: U */
    public static final C13718g f38678U = m40239a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* JADX INFO: renamed from: V */
    public static final C13718g f38680V = m40239a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* JADX INFO: renamed from: W */
    public static final C13718g f38682W = m40239a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);

    /* JADX INFO: renamed from: X */
    public static final C13718g f38684X = m40239a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);

    /* JADX INFO: renamed from: Y */
    public static final C13718g f38686Y = m40239a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* JADX INFO: renamed from: Z */
    public static final C13718g f38688Z = m40239a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* JADX INFO: renamed from: a0 */
    public static final C13718g f38690a0 = m40239a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);

    /* JADX INFO: renamed from: b0 */
    public static final C13718g f38693b0 = m40239a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* JADX INFO: renamed from: c0 */
    public static final C13718g f38696c0 = m40239a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* JADX INFO: renamed from: d0 */
    public static final C13718g f38699d0 = m40239a("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* JADX INFO: renamed from: e0 */
    public static final C13718g f38702e0 = m40239a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", TsExtractor.TS_STREAM_TYPE_DTS_UHD);

    /* JADX INFO: renamed from: f0 */
    public static final C13718g f38705f0 = m40239a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* JADX INFO: renamed from: g0 */
    public static final C13718g f38708g0 = m40239a("TLS_PSK_WITH_AES_256_CBC_SHA", ModuleDescriptor.MODULE_VERSION);

    /* JADX INFO: renamed from: h0 */
    public static final C13718g f38711h0 = m40239a("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* JADX INFO: renamed from: i0 */
    public static final C13718g f38714i0 = m40239a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* JADX INFO: renamed from: j0 */
    public static final C13718g f38717j0 = m40239a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* JADX INFO: renamed from: k0 */
    public static final C13718g f38720k0 = m40239a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* JADX INFO: renamed from: l0 */
    public static final C13718g f38723l0 = m40239a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* JADX INFO: renamed from: m0 */
    public static final C13718g f38726m0 = m40239a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* JADX INFO: renamed from: n0 */
    public static final C13718g f38729n0 = m40239a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* JADX INFO: renamed from: o0 */
    public static final C13718g f38732o0 = m40239a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* JADX INFO: renamed from: p0 */
    public static final C13718g f38735p0 = m40239a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* JADX INFO: renamed from: q0 */
    public static final C13718g f38738q0 = m40239a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* JADX INFO: renamed from: r0 */
    public static final C13718g f38741r0 = m40239a("TLS_FALLBACK_SCSV", 22016);

    /* JADX INFO: renamed from: s0 */
    public static final C13718g f38744s0 = m40239a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* JADX INFO: renamed from: t0 */
    public static final C13718g f38746t0 = m40239a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* JADX INFO: renamed from: u0 */
    public static final C13718g f38748u0 = m40239a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* JADX INFO: renamed from: v0 */
    public static final C13718g f38750v0 = m40239a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* JADX INFO: renamed from: w0 */
    public static final C13718g f38752w0 = m40239a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* JADX INFO: renamed from: x0 */
    public static final C13718g f38754x0 = m40239a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* JADX INFO: renamed from: y0 */
    public static final C13718g f38756y0 = m40239a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* JADX INFO: renamed from: z0 */
    public static final C13718g f38758z0 = m40239a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* JADX INFO: renamed from: A0 */
    public static final C13718g f38639A0 = m40239a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);

    /* JADX INFO: renamed from: B0 */
    public static final C13718g f38641B0 = m40239a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);

    /* JADX INFO: renamed from: C0 */
    public static final C13718g f38643C0 = m40239a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);

    /* JADX INFO: renamed from: D0 */
    public static final C13718g f38645D0 = m40239a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);

    /* JADX INFO: renamed from: E0 */
    public static final C13718g f38647E0 = m40239a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);

    /* JADX INFO: renamed from: F0 */
    public static final C13718g f38649F0 = m40239a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);

    /* JADX INFO: renamed from: G0 */
    public static final C13718g f38651G0 = m40239a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);

    /* JADX INFO: renamed from: H0 */
    public static final C13718g f38653H0 = m40239a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);

    /* JADX INFO: renamed from: I0 */
    public static final C13718g f38655I0 = m40239a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);

    /* JADX INFO: renamed from: J0 */
    public static final C13718g f38657J0 = m40239a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);

    /* JADX INFO: renamed from: K0 */
    public static final C13718g f38659K0 = m40239a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* JADX INFO: renamed from: L0 */
    public static final C13718g f38661L0 = m40239a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* JADX INFO: renamed from: M0 */
    public static final C13718g f38663M0 = m40239a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);

    /* JADX INFO: renamed from: N0 */
    public static final C13718g f38665N0 = m40239a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);

    /* JADX INFO: renamed from: O0 */
    public static final C13718g f38667O0 = m40239a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);

    /* JADX INFO: renamed from: P0 */
    public static final C13718g f38669P0 = m40239a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);

    /* JADX INFO: renamed from: Q0 */
    public static final C13718g f38671Q0 = m40239a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);

    /* JADX INFO: renamed from: R0 */
    public static final C13718g f38673R0 = m40239a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);

    /* JADX INFO: renamed from: S0 */
    public static final C13718g f38675S0 = m40239a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);

    /* JADX INFO: renamed from: T0 */
    public static final C13718g f38677T0 = m40239a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);

    /* JADX INFO: renamed from: U0 */
    public static final C13718g f38679U0 = m40239a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);

    /* JADX INFO: renamed from: V0 */
    public static final C13718g f38681V0 = m40239a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);

    /* JADX INFO: renamed from: W0 */
    public static final C13718g f38683W0 = m40239a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);

    /* JADX INFO: renamed from: X0 */
    public static final C13718g f38685X0 = m40239a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);

    /* JADX INFO: renamed from: Y0 */
    public static final C13718g f38687Y0 = m40239a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);

    /* JADX INFO: renamed from: Z0 */
    public static final C13718g f38689Z0 = m40239a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* JADX INFO: renamed from: a1 */
    public static final C13718g f38691a1 = m40239a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* JADX INFO: renamed from: b1 */
    public static final C13718g f38694b1 = m40239a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* JADX INFO: renamed from: c1 */
    public static final C13718g f38697c1 = m40239a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* JADX INFO: renamed from: d1 */
    public static final C13718g f38700d1 = m40239a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* JADX INFO: renamed from: e1 */
    public static final C13718g f38703e1 = m40239a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* JADX INFO: renamed from: f1 */
    public static final C13718g f38706f1 = m40239a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* JADX INFO: renamed from: g1 */
    public static final C13718g f38709g1 = m40239a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* JADX INFO: renamed from: h1 */
    public static final C13718g f38712h1 = m40239a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* JADX INFO: renamed from: i1 */
    public static final C13718g f38715i1 = m40239a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* JADX INFO: renamed from: j1 */
    public static final C13718g f38718j1 = m40239a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* JADX INFO: renamed from: k1 */
    public static final C13718g f38721k1 = m40239a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* JADX INFO: renamed from: l1 */
    public static final C13718g f38724l1 = m40239a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* JADX INFO: renamed from: m1 */
    public static final C13718g f38727m1 = m40239a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* JADX INFO: renamed from: n1 */
    public static final C13718g f38730n1 = m40239a("TLS_AES_128_GCM_SHA256", 4865);

    /* JADX INFO: renamed from: o1 */
    public static final C13718g f38733o1 = m40239a("TLS_AES_256_GCM_SHA384", 4866);

    /* JADX INFO: renamed from: p1 */
    public static final C13718g f38736p1 = m40239a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* JADX INFO: renamed from: q1 */
    public static final C13718g f38739q1 = m40239a("TLS_AES_128_CCM_SHA256", 4868);

    /* JADX INFO: renamed from: r1 */
    public static final C13718g f38742r1 = m40239a("TLS_AES_256_CCM_8_SHA256", 4869);

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.g$a */
    /* JADX INFO: compiled from: CipherSuite.java */
    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iMin = Math.min(str.length(), str2.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    private C13718g(String str) {
        str.getClass();
        this.f38759a = str;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C13718g m40238a(String str) {
        C13718g c13718g;
        Map<String, C13718g> map = f38695c;
        c13718g = map.get(str);
        if (c13718g == null) {
            c13718g = map.get(m40241b(str));
            if (c13718g == null) {
                c13718g = new C13718g(str);
            }
            map.put(str, c13718g);
        }
        return c13718g;
    }

    /* JADX INFO: renamed from: a */
    private static C13718g m40239a(String str, int i) {
        C13718g c13718g = new C13718g(str);
        f38695c.put(str, c13718g);
        return c13718g;
    }

    /* JADX INFO: renamed from: a */
    static List<C13718g> m40240a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m40238a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: b */
    private static String m40241b(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String toString() {
        return this.f38759a;
    }
}
