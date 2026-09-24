package com.pgl.ssdk;

import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.pgl.ssdk.l */
/* JADX INFO: loaded from: classes7.dex */
public class C14282l {
    @DungeonFlag
    /* JADX INFO: renamed from: a */
    private static C14275e m43085a(ByteBuffer byteBuffer) throws NoSuchAlgorithmException, C14236a, CertificateException {
        ByteBuffer byteBufferM43074a = C14277g.m43074a(byteBuffer);
        byteBufferM43074a.get(new byte[byteBufferM43074a.remaining()]);
        byteBufferM43074a.flip();
        byteBufferM43074a.position(0);
        C14277g.m43074a(byteBufferM43074a);
        byte[] bArrM43075b = C14277g.m43075b(C14277g.m43074a(byteBufferM43074a));
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(bArrM43075b));
            if (certificateGenerateCertificate instanceof X509Certificate) {
                return new C14275e(String.valueOf(((X509Certificate) certificateGenerateCertificate).getSubjectDN()), bArrM43075b);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<C14275e> m43086a(InterfaceC14287q interfaceC14287q, AbstractC14270c.a aVar) throws IOException, C14277g.a {
        return m43087b(C14277g.m43073a(interfaceC14287q, aVar, 1896449818).f41327a);
    }

    /* JADX INFO: renamed from: b */
    public static List<C14275e> m43087b(ByteBuffer byteBuffer) {
        try {
            ByteBuffer byteBufferM43074a = C14277g.m43074a(byteBuffer);
            if (!byteBufferM43074a.hasRemaining()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (byteBufferM43074a.hasRemaining()) {
                try {
                    arrayList.add(m43085a(C14277g.m43074a(byteBufferM43074a)));
                } catch (C14236a | BufferUnderflowException unused) {
                    return null;
                } catch (NoSuchAlgorithmException | CertificateException unused2) {
                }
            }
            return arrayList;
        } catch (C14236a unused3) {
            return null;
        }
    }
}
